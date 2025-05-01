package com.nullvastation.cryssage.ui.home;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* compiled from: HomeViewModel.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/nullvastation/cryssage/ui/home/ApiResponse;", HttpUrl.FRAGMENT_ENCODE_SET, "messages", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/nullvastation/cryssage/ui/home/Message;", "error", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/util/List;Ljava/lang/String;)V", "getError", "()Ljava/lang/String;", "getMessages", "()Ljava/util/List;", "component1", "component2", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final /* data */ class ApiResponse {

    @SerializedName("error")
    private final String error;

    @SerializedName("messages")
    private final List<Message> messages;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ApiResponse copy$default(ApiResponse apiResponse, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = apiResponse.messages;
        }
        if ((i & 2) != 0) {
            str = apiResponse.error;
        }
        return apiResponse.copy(list, str);
    }

    public final List<Message> component1() {
        return this.messages;
    }

    /* renamed from: component2, reason: from getter */
    public final String getError() {
        return this.error;
    }

    public final ApiResponse copy(List<Message> messages, String error) {
        Intrinsics.checkNotNullParameter(messages, "messages");
        return new ApiResponse(messages, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiResponse)) {
            return false;
        }
        ApiResponse apiResponse = (ApiResponse) other;
        return Intrinsics.areEqual(this.messages, apiResponse.messages) && Intrinsics.areEqual(this.error, apiResponse.error);
    }

    public int hashCode() {
        int hashCode = this.messages.hashCode() * 31;
        String str = this.error;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ApiResponse(messages=" + this.messages + ", error=" + this.error + ')';
    }

    public ApiResponse(List<Message> messages, String str) {
        Intrinsics.checkNotNullParameter(messages, "messages");
        this.messages = messages;
        this.error = str;
    }

    public /* synthetic */ ApiResponse(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : str);
    }

    public final List<Message> getMessages() {
        return this.messages;
    }

    public final String getError() {
        return this.error;
    }
}
