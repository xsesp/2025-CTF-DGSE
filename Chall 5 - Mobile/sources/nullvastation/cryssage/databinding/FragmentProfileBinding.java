package com.nullvastation.cryssage.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.nullvastation.cryssage.R;

/* loaded from: classes.dex */
public final class FragmentProfileBinding implements ViewBinding {
    public final LinearLayout infoContainer;
    public final TextView profileFirstname;
    public final ImageView profileImage;
    public final TextView profileName;
    public final TextView profilePhone;
    public final TextView profileStatus;
    public final TextView profileStory;
    private final ConstraintLayout rootView;
    public final LinearLayout storyContainer;
    public final TextView textProfile;

    private FragmentProfileBinding(ConstraintLayout constraintLayout, LinearLayout linearLayout, TextView textView, ImageView imageView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, LinearLayout linearLayout2, TextView textView6) {
        this.rootView = constraintLayout;
        this.infoContainer = linearLayout;
        this.profileFirstname = textView;
        this.profileImage = imageView;
        this.profileName = textView2;
        this.profilePhone = textView3;
        this.profileStatus = textView4;
        this.profileStory = textView5;
        this.storyContainer = linearLayout2;
        this.textProfile = textView6;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentProfileBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentProfileBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_profile, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentProfileBinding bind(View view) {
        int i = R.id.info_container;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.profile_firstname;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.profile_image;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R.id.profile_name;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        i = R.id.profile_phone;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView3 != null) {
                            i = R.id.profile_status;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView4 != null) {
                                i = R.id.profile_story;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView5 != null) {
                                    i = R.id.story_container;
                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                    if (linearLayout2 != null) {
                                        i = R.id.text_profile;
                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView6 != null) {
                                            return new FragmentProfileBinding((ConstraintLayout) view, linearLayout, textView, imageView, textView2, textView3, textView4, textView5, linearLayout2, textView6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
