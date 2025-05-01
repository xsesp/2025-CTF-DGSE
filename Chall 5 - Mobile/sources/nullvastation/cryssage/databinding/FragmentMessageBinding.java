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
public final class FragmentMessageBinding implements ViewBinding {
    public final Button btnSend;
    public final EditText inputMessage;
    public final EditText inputRecipient;
    private final ConstraintLayout rootView;
    public final TextView textMessage;

    private FragmentMessageBinding(ConstraintLayout constraintLayout, Button button, EditText editText, EditText editText2, TextView textView) {
        this.rootView = constraintLayout;
        this.btnSend = button;
        this.inputMessage = editText;
        this.inputRecipient = editText2;
        this.textMessage = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentMessageBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentMessageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_message, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentMessageBinding bind(View view) {
        int i = R.id.btn_send;
        Button button = (Button) ViewBindings.findChildViewById(view, i);
        if (button != null) {
            i = R.id.input_message;
            EditText editText = (EditText) ViewBindings.findChildViewById(view, i);
            if (editText != null) {
                i = R.id.input_recipient;
                EditText editText2 = (EditText) ViewBindings.findChildViewById(view, i);
                if (editText2 != null) {
                    i = R.id.text_message;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        return new FragmentMessageBinding((ConstraintLayout) view, button, editText, editText2, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
