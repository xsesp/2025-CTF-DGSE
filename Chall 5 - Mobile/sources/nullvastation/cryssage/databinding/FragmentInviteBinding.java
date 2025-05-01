package com.nullvastation.cryssage.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.nullvastation.cryssage.R;

/* loaded from: classes.dex */
public final class FragmentInviteBinding implements ViewBinding {
    public final Button btnInvite;
    public final EditText inputInvite;
    private final ConstraintLayout rootView;
    public final TextView textInvite;

    private FragmentInviteBinding(ConstraintLayout constraintLayout, Button button, EditText editText, TextView textView) {
        this.rootView = constraintLayout;
        this.btnInvite = button;
        this.inputInvite = editText;
        this.textInvite = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentInviteBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentInviteBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_invite, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentInviteBinding bind(View view) {
        int i = R.id.btn_invite;
        Button button = (Button) ViewBindings.findChildViewById(view, i);
        if (button != null) {
            i = R.id.input_invite;
            EditText editText = (EditText) ViewBindings.findChildViewById(view, i);
            if (editText != null) {
                i = R.id.text_invite;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    return new FragmentInviteBinding((ConstraintLayout) view, button, editText, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
