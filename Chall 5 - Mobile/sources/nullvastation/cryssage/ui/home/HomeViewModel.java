package com.nullvastation.cryssage.ui.home;

import android.app.Application;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import okhttp3.HttpUrl;

/* compiled from: HomeViewModel.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \"2\u00020\u0001:\u0001\"B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0007H\u0002J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0007H\u0002J\u0018\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0007H\u0002J\b\u0010 \u001a\u00020!H\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010¨\u0006#"}, d2 = {"Lcom/nullvastation/cryssage/ui/home/HomeViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "_error", "Landroidx/lifecycle/MutableLiveData;", HttpUrl.FRAGMENT_ENCODE_SET, "_newMessages", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/nullvastation/cryssage/ui/home/Message;", "_oldMessages", "_text", "error", "Landroidx/lifecycle/LiveData;", "getError", "()Landroidx/lifecycle/LiveData;", "newMessages", "getNewMessages", "oldMessages", "getOldMessages", "text", "getText", "decryptMessage", "encryptedMessage", "deriveKey", HttpUrl.FRAGMENT_ENCODE_SET, "deviceId", "salt", "hashDeviceId", "model", "brand", "loadMessages", HttpUrl.FRAGMENT_ENCODE_SET, "Companion", "app_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class HomeViewModel extends AndroidViewModel {
    private static final String STATIC_IV = "LJo+0sanl6E3cvCHCRwyIg==";
    private static final String STATIC_SALT = "s3cr3t_s@lt";
    private final MutableLiveData<String> _error;
    private final MutableLiveData<List<Message>> _newMessages;
    private final MutableLiveData<List<Message>> _oldMessages;
    private final MutableLiveData<String> _text;
    private final LiveData<String> error;
    private final LiveData<List<Message>> newMessages;
    private final LiveData<List<Message>> oldMessages;
    private final LiveData<String> text;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel(Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        MutableLiveData<String> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue("Messages");
        this._text = mutableLiveData;
        this.text = mutableLiveData;
        MutableLiveData<List<Message>> mutableLiveData2 = new MutableLiveData<>();
        this._oldMessages = mutableLiveData2;
        this.oldMessages = mutableLiveData2;
        MutableLiveData<List<Message>> mutableLiveData3 = new MutableLiveData<>();
        this._newMessages = mutableLiveData3;
        this.newMessages = mutableLiveData3;
        MutableLiveData<String> mutableLiveData4 = new MutableLiveData<>();
        this._error = mutableLiveData4;
        this.error = mutableLiveData4;
        loadMessages();
    }

    public final LiveData<String> getText() {
        return this.text;
    }

    public final LiveData<List<Message>> getOldMessages() {
        return this.oldMessages;
    }

    public final LiveData<List<Message>> getNewMessages() {
        return this.newMessages;
    }

    public final LiveData<String> getError() {
        return this.error;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String hashDeviceId(String model, String brand) {
        String str = model + ':' + brand;
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        Charset UTF_8 = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
        byte[] bytes = str.getBytes(UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        String encodeToString = Base64.encodeToString(messageDigest.digest(bytes), 2);
        Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(...)");
        return encodeToString;
    }

    private final byte[] deriveKey(String deviceId, String salt) {
        String str = deviceId + ':' + salt;
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        Charset UTF_8 = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
        byte[] bytes = str.getBytes(UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        byte[] digest = messageDigest.digest(bytes);
        Intrinsics.checkNotNullExpressionValue(digest, "digest(...)");
        return digest;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String decryptMessage(String encryptedMessage) {
        try {
            String MODEL = Build.MODEL;
            Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
            String BRAND = Build.BRAND;
            Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
            byte[] deriveKey = deriveKey(hashDeviceId(MODEL, BRAND), STATIC_SALT);
            byte[] decode = Base64.decode(STATIC_IV, 0);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, new SecretKeySpec(deriveKey, "AES"), new IvParameterSpec(decode));
            byte[] doFinal = cipher.doFinal(Base64.decode(encryptedMessage, 0));
            Intrinsics.checkNotNull(doFinal);
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            return new String(doFinal, UTF_8);
        } catch (Exception e) {
            Log.e("DECRYPT_ERROR", "Error decrypting message", e);
            return "[Encrypted] This message was encrypted with old device credentials";
        }
    }

    private final void loadMessages() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new HomeViewModel$loadMessages$1(this, null), 3, null);
    }
}
