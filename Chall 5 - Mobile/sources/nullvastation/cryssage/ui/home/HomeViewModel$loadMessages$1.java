package com.nullvastation.cryssage.ui.home;

import android.os.Build;
import android.util.Log;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.MutableLiveData;
import com.nullvastation.cryssage.api.RetrofitClient;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.HttpUrl;
import okhttp3.ResponseBody;
import retrofit2.Response;

/* compiled from: HomeViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(c = "com.nullvastation.cryssage.ui.home.HomeViewModel$loadMessages$1", f = "HomeViewModel.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class HomeViewModel$loadMessages$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ HomeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HomeViewModel$loadMessages$1(HomeViewModel homeViewModel, Continuation<? super HomeViewModel$loadMessages$1> continuation) {
        super(2, continuation);
        this.this$0 = homeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HomeViewModel$loadMessages$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HomeViewModel$loadMessages$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableLiveData mutableLiveData;
        String hashDeviceId;
        Object messages;
        MutableLiveData mutableLiveData2;
        List<Message> emptyList;
        MutableLiveData mutableLiveData3;
        MutableLiveData mutableLiveData4;
        String decryptMessage;
        MutableLiveData mutableLiveData5;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HomeViewModel homeViewModel = this.this$0;
                String MODEL = Build.MODEL;
                Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                String BRAND = Build.BRAND;
                Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
                hashDeviceId = homeViewModel.hashDeviceId(MODEL, BRAND);
                this.label = 1;
                messages = RetrofitClient.INSTANCE.getApiService().getMessages(hashDeviceId, this);
                if (messages == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                messages = obj;
            }
            Response response = (Response) messages;
            if (response.isSuccessful()) {
                ApiResponse apiResponse = (ApiResponse) response.body();
                if ((apiResponse != null ? apiResponse.getError() : null) != null) {
                    mutableLiveData5 = this.this$0._error;
                    mutableLiveData5.setValue("Erreur API: " + apiResponse.getError());
                    Log.e("API_DEBUG", "API error: " + apiResponse.getError());
                } else {
                    if (apiResponse == null || (emptyList = apiResponse.getMessages()) == null) {
                        emptyList = CollectionsKt.emptyList();
                    }
                    List<Message> list = emptyList;
                    HomeViewModel homeViewModel2 = this.this$0;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    for (Message message : list) {
                        if (message.isEncrypted()) {
                            decryptMessage = homeViewModel2.decryptMessage(message.getContent());
                            message = Message.copy$default(message, null, null, decryptMessage, false, 3, null);
                        }
                        arrayList.add(message);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj2 : arrayList) {
                        if (StringsKt.contains$default((CharSequence) ((Message) obj2).getContent(), (CharSequence) "[Encrypted] This message was encrypted with old device credentials", false, 2, (Object) null)) {
                            arrayList2.add(obj2);
                        } else {
                            arrayList3.add(obj2);
                        }
                    }
                    Pair pair = new Pair(arrayList2, arrayList3);
                    List list2 = (List) pair.component1();
                    List list3 = (List) pair.component2();
                    mutableLiveData3 = this.this$0._oldMessages;
                    mutableLiveData3.setValue(CollectionsKt.sortedWith(list2, new Comparator() { // from class: com.nullvastation.cryssage.ui.home.HomeViewModel$loadMessages$1$invokeSuspend$$inlined$sortedBy$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t, T t2) {
                            return ComparisonsKt.compareValues(Long.valueOf(((Message) t).getDate()), Long.valueOf(((Message) t2).getDate()));
                        }
                    }));
                    mutableLiveData4 = this.this$0._newMessages;
                    mutableLiveData4.setValue(CollectionsKt.sortedWith(list3, new Comparator() { // from class: com.nullvastation.cryssage.ui.home.HomeViewModel$loadMessages$1$invokeSuspend$$inlined$sortedBy$2
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t, T t2) {
                            return ComparisonsKt.compareValues(Long.valueOf(((Message) t).getDate()), Long.valueOf(((Message) t2).getDate()));
                        }
                    }));
                }
            } else {
                ResponseBody errorBody = response.errorBody();
                String string = errorBody != null ? errorBody.string() : null;
                Log.e("API_ERROR", "Code: " + response.code() + ", Body: " + string);
                mutableLiveData2 = this.this$0._error;
                mutableLiveData2.setValue("Error retrieving messages: " + response.code() + " - " + string);
            }
        } catch (Exception e) {
            Log.e("API_ERROR", "Exception: " + e.getMessage(), e);
            mutableLiveData = this.this$0._error;
            mutableLiveData.setValue("Error retrieving messages: " + e.getMessage());
        }
        return Unit.INSTANCE;
    }
}
