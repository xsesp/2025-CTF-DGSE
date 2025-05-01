package com.nullvastation.cryssage.api;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/* compiled from: RetrofitClient.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/nullvastation/cryssage/api/RetrofitClient;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "BASE_URL", HttpUrl.FRAGMENT_ENCODE_SET, "apiService", "Lcom/nullvastation/cryssage/api/ApiService;", "getApiService", "()Lcom/nullvastation/cryssage/api/ApiService;", "client", "Lokhttp3/OkHttpClient;", "loggingInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "retrofit", "Lretrofit2/Retrofit;", "kotlin.jvm.PlatformType", "app_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class RetrofitClient {
    private static final String BASE_URL = "http://163.172.67.201:8000/";
    public static final RetrofitClient INSTANCE = new RetrofitClient();
    private static final ApiService apiService;
    private static final OkHttpClient client;
    private static final HttpLoggingInterceptor loggingInterceptor;
    private static final Retrofit retrofit;

    private RetrofitClient() {
    }

    static {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(null, 1, null);
        httpLoggingInterceptor.level(HttpLoggingInterceptor.Level.BODY);
        loggingInterceptor = httpLoggingInterceptor;
        OkHttpClient build = new OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor).build();
        client = build;
        Retrofit build2 = new Retrofit.Builder().baseUrl(BASE_URL).client(build).addConverterFactory(GsonConverterFactory.create()).build();
        retrofit = build2;
        Object create = build2.create(ApiService.class);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        apiService = (ApiService) create;
    }

    public final ApiService getApiService() {
        return apiService;
    }
}
