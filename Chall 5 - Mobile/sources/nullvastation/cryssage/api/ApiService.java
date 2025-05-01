package com.nullvastation.cryssage.api;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.nullvastation.cryssage.ui.home.ApiResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.HttpUrl;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

/* compiled from: ApiService.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Lcom/nullvastation/cryssage/api/ApiService;", HttpUrl.FRAGMENT_ENCODE_SET, "getMessages", "Lretrofit2/Response;", "Lcom/nullvastation/cryssage/ui/home/ApiResponse;", "deviceId", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public interface ApiService {
    @Headers({"Accept: application/json"})
    @GET("messages")
    Object getMessages(@Query("id") String str, Continuation<? super Response<ApiResponse>> continuation);
}
