package com.nullvastation.cryssage.ui.home;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.gson.annotations.SerializedName;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* compiled from: HomeViewModel.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\n¨\u0006\u001c"}, d2 = {"Lcom/nullvastation/cryssage/ui/home/Message;", HttpUrl.FRAGMENT_ENCODE_SET, "sender", HttpUrl.FRAGMENT_ENCODE_SET, "timestamp", "content", "isEncrypted", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getContent", "()Ljava/lang/String;", "date", HttpUrl.FRAGMENT_ENCODE_SET, "getDate", "()J", "()Z", "getSender", "getTimestamp", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final /* data */ class Message {

    @SerializedName("content")
    private final String content;

    @SerializedName("isEncrypted")
    private final boolean isEncrypted;

    @SerializedName("sender")
    private final String sender;

    @SerializedName("timestamp")
    private final String timestamp;

    public static /* synthetic */ Message copy$default(Message message, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = message.sender;
        }
        if ((i & 2) != 0) {
            str2 = message.timestamp;
        }
        if ((i & 4) != 0) {
            str3 = message.content;
        }
        if ((i & 8) != 0) {
            z = message.isEncrypted;
        }
        return message.copy(str, str2, str3, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSender() {
        return this.sender;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTimestamp() {
        return this.timestamp;
    }

    /* renamed from: component3, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsEncrypted() {
        return this.isEncrypted;
    }

    public final Message copy(String sender, String timestamp, String content, boolean isEncrypted) {
        Intrinsics.checkNotNullParameter(sender, "sender");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(content, "content");
        return new Message(sender, timestamp, content, isEncrypted);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Message)) {
            return false;
        }
        Message message = (Message) other;
        return Intrinsics.areEqual(this.sender, message.sender) && Intrinsics.areEqual(this.timestamp, message.timestamp) && Intrinsics.areEqual(this.content, message.content) && this.isEncrypted == message.isEncrypted;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.sender.hashCode() * 31) + this.timestamp.hashCode()) * 31) + this.content.hashCode()) * 31;
        boolean z = this.isEncrypted;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        return "Message(sender=" + this.sender + ", timestamp=" + this.timestamp + ", content=" + this.content + ", isEncrypted=" + this.isEncrypted + ')';
    }

    public Message(String sender, String timestamp, String content, boolean z) {
        Intrinsics.checkNotNullParameter(sender, "sender");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(content, "content");
        this.sender = sender;
        this.timestamp = timestamp;
        this.content = content;
        this.isEncrypted = z;
    }

    public final String getSender() {
        return this.sender;
    }

    public final String getTimestamp() {
        return this.timestamp;
    }

    public final String getContent() {
        return this.content;
    }

    public final boolean isEncrypted() {
        return this.isEncrypted;
    }

    public final long getDate() {
        Date parse = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).parse(this.timestamp);
        if (parse != null) {
            return parse.getTime();
        }
        return 0L;
    }
}
