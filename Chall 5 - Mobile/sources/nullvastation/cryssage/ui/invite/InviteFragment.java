package com.nullvastation.cryssage.ui.invite;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.google.android.material.snackbar.Snackbar;
import com.nullvastation.cryssage.databinding.FragmentInviteBinding;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.HttpUrl;

/* compiled from: InviteFragment.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J$\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/nullvastation/cryssage/ui/invite/InviteFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/nullvastation/cryssage/databinding/FragmentInviteBinding;", "binding", "getBinding", "()Lcom/nullvastation/cryssage/databinding/FragmentInviteBinding;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", HttpUrl.FRAGMENT_ENCODE_SET, "app_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class InviteFragment extends Fragment {
    private FragmentInviteBinding _binding;

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentInviteBinding getBinding() {
        FragmentInviteBinding fragmentInviteBinding = this._binding;
        Intrinsics.checkNotNull(fragmentInviteBinding);
        return fragmentInviteBinding;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        InviteViewModel inviteViewModel = (InviteViewModel) new ViewModelProvider(this).get(InviteViewModel.class);
        this._binding = FragmentInviteBinding.inflate(inflater, container, false);
        ConstraintLayout root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        ConstraintLayout constraintLayout = root;
        inviteViewModel.getText().observe(getViewLifecycleOwner(), new InviteFragment$sam$androidx_lifecycle_Observer$0(new Function1<String, Unit>() { // from class: com.nullvastation.cryssage.ui.invite.InviteFragment$onCreateView$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String str) {
                FragmentInviteBinding binding;
                binding = InviteFragment.this.getBinding();
                binding.textInvite.setText(str);
            }
        }));
        getBinding().btnInvite.setOnClickListener(new View.OnClickListener() { // from class: com.nullvastation.cryssage.ui.invite.InviteFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InviteFragment.onCreateView$lambda$0(InviteFragment.this, view);
            }
        });
        return constraintLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateView$lambda$0(InviteFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String obj = StringsKt.trim((CharSequence) this$0.getBinding().inputInvite.getText().toString()).toString();
        if (obj.length() == 0) {
            Snackbar.make(this$0.getBinding().getRoot(), "Please indicate a recipient.", 0).show();
        } else {
            Snackbar.make(this$0.getBinding().getRoot(), "Invitation sent to " + obj, 0).show();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this._binding = null;
    }
}
