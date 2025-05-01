package com.nullvastation.cryssage.ui.profile;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import kotlin.Metadata;
import okhttp3.HttpUrl;

/* compiled from: ProfileViewModel.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/nullvastation/cryssage/ui/profile/ProfileViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_text", "Landroidx/lifecycle/MutableLiveData;", HttpUrl.FRAGMENT_ENCODE_SET, "text", "Landroidx/lifecycle/LiveData;", "getText", "()Landroidx/lifecycle/LiveData;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class ProfileViewModel extends ViewModel {
    private final MutableLiveData<String> _text;
    private final LiveData<String> text;

    public ProfileViewModel() {
        MutableLiveData<String> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue("This is profile page");
        this._text = mutableLiveData;
        this.text = mutableLiveData;
    }

    public final LiveData<String> getText() {
        return this.text;
    }
}
