package com.nullvastation.cryssage.ui.message;

import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.fragment.FragmentKt;
import com.google.android.material.snackbar.Snackbar;
import com.nullvastation.cryssage.R;
import com.nullvastation.cryssage.databinding.FragmentMessageBinding;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.HttpUrl;

/* compiled from: MessageFragment.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J$\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/nullvastation/cryssage/ui/message/MessageFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/nullvastation/cryssage/databinding/FragmentMessageBinding;", "binding", "getBinding", "()Lcom/nullvastation/cryssage/databinding/FragmentMessageBinding;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", HttpUrl.FRAGMENT_ENCODE_SET, "app_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class MessageFragment extends Fragment {
    private FragmentMessageBinding _binding;

    private final FragmentMessageBinding getBinding() {
        FragmentMessageBinding fragmentMessageBinding = this._binding;
        Intrinsics.checkNotNull(fragmentMessageBinding);
        return fragmentMessageBinding;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Button button;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        MessageViewModel messageViewModel = (MessageViewModel) new ViewModelProvider(this).get(MessageViewModel.class);
        this._binding = FragmentMessageBinding.inflate(inflater, container, false);
        messageViewModel.getText().observe(getViewLifecycleOwner(), new MessageFragment$sam$androidx_lifecycle_Observer$0(new Function1<String, Unit>() { // from class: com.nullvastation.cryssage.ui.message.MessageFragment$onCreateView$1
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
                FragmentMessageBinding fragmentMessageBinding;
                fragmentMessageBinding = MessageFragment.this._binding;
                TextView textView = fragmentMessageBinding != null ? fragmentMessageBinding.textMessage : null;
                if (textView == null) {
                    return;
                }
                textView.setText(str);
            }
        }));
        FragmentMessageBinding fragmentMessageBinding = this._binding;
        if (fragmentMessageBinding != null && (button = fragmentMessageBinding.btnSend) != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: com.nullvastation.cryssage.ui.message.MessageFragment$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MessageFragment.onCreateView$lambda$1(MessageFragment.this, view);
                }
            });
        }
        FragmentMessageBinding fragmentMessageBinding2 = this._binding;
        Intrinsics.checkNotNull(fragmentMessageBinding2);
        ConstraintLayout root = fragmentMessageBinding2.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateView$lambda$1(final MessageFragment this$0, View view) {
        Button button;
        EditText editText;
        EditText editText2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FragmentMessageBinding fragmentMessageBinding = this$0._binding;
        Editable editable = null;
        String obj = StringsKt.trim((CharSequence) String.valueOf((fragmentMessageBinding == null || (editText2 = fragmentMessageBinding.inputRecipient) == null) ? null : editText2.getText())).toString();
        FragmentMessageBinding fragmentMessageBinding2 = this$0._binding;
        if (fragmentMessageBinding2 != null && (editText = fragmentMessageBinding2.inputMessage) != null) {
            editable = editText.getText();
        }
        String obj2 = StringsKt.trim((CharSequence) String.valueOf(editable)).toString();
        if (obj.length() == 0) {
            Snackbar.make(this$0.requireView(), "Please indicate a recipient.", 0).show();
            return;
        }
        if (obj2.length() == 0) {
            Snackbar.make(this$0.requireView(), "Please write a message.", 0).show();
            return;
        }
        Snackbar.make(this$0.requireView(), "Message sent successfully.", 0).show();
        FragmentMessageBinding fragmentMessageBinding3 = this$0._binding;
        if (fragmentMessageBinding3 == null || (button = fragmentMessageBinding3.btnSend) == null) {
            return;
        }
        button.postDelayed(new Runnable() { // from class: com.nullvastation.cryssage.ui.message.MessageFragment$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                MessageFragment.onCreateView$lambda$1$lambda$0(MessageFragment.this);
            }
        }, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateView$lambda$1$lambda$0(MessageFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FragmentKt.findNavController(this$0).navigate(R.id.nav_home);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this._binding = null;
    }
}
