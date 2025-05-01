package com.nullvastation.cryssage.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.nullvastation.cryssage.R;

/* loaded from: classes.dex */
public final class FragmentHomeBinding implements ViewBinding {
    public final RecyclerView recyclerViewNewMessages;
    public final RecyclerView recyclerViewOldMessages;
    private final NestedScrollView rootView;
    public final TextView textError;
    public final TextView textNewMessages;
    public final TextView textOldMessages;

    private FragmentHomeBinding(NestedScrollView nestedScrollView, RecyclerView recyclerView, RecyclerView recyclerView2, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = nestedScrollView;
        this.recyclerViewNewMessages = recyclerView;
        this.recyclerViewOldMessages = recyclerView2;
        this.textError = textView;
        this.textNewMessages = textView2;
        this.textOldMessages = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public NestedScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentHomeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentHomeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_home, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentHomeBinding bind(View view) {
        int i = R.id.recyclerViewNewMessages;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = R.id.recyclerViewOldMessages;
            RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView2 != null) {
                i = R.id.text_error;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = R.id.text_new_messages;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        i = R.id.text_old_messages;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView3 != null) {
                            return new FragmentHomeBinding((NestedScrollView) view, recyclerView, recyclerView2, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
