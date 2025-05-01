package com.nullvastation.cryssage.ui.home;

import android.app.Application;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.nullvastation.cryssage.databinding.FragmentHomeBinding;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* compiled from: HomeFragment.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J$\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/nullvastation/cryssage/ui/home/HomeFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/nullvastation/cryssage/databinding/FragmentHomeBinding;", "binding", "getBinding", "()Lcom/nullvastation/cryssage/databinding/FragmentHomeBinding;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", HttpUrl.FRAGMENT_ENCODE_SET, "setupRecyclerViews", "app_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class HomeFragment extends Fragment {
    private FragmentHomeBinding _binding;

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentHomeBinding getBinding() {
        FragmentHomeBinding fragmentHomeBinding = this._binding;
        Intrinsics.checkNotNull(fragmentHomeBinding);
        return fragmentHomeBinding;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        ViewModelProvider.AndroidViewModelFactory.Companion companion = ViewModelProvider.AndroidViewModelFactory.INSTANCE;
        Application application = requireActivity().getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
        HomeViewModel homeViewModel = (HomeViewModel) new ViewModelProvider(this, companion.getInstance(application)).get(HomeViewModel.class);
        this._binding = FragmentHomeBinding.inflate(inflater, container, false);
        NestedScrollView root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        NestedScrollView nestedScrollView = root;
        setupRecyclerViews();
        homeViewModel.getOldMessages().observe(getViewLifecycleOwner(), new HomeFragment$sam$androidx_lifecycle_Observer$0(new Function1<List<? extends Message>, Unit>() { // from class: com.nullvastation.cryssage.ui.home.HomeFragment$onCreateView$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends Message> list) {
                invoke2((List<Message>) list);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(List<Message> list) {
                FragmentHomeBinding binding;
                FragmentHomeBinding binding2;
                FragmentHomeBinding binding3;
                binding = HomeFragment.this.getBinding();
                RecyclerView.Adapter adapter = binding.recyclerViewOldMessages.getAdapter();
                Unit unit = null;
                MessageAdapter messageAdapter = adapter instanceof MessageAdapter ? (MessageAdapter) adapter : null;
                if (messageAdapter != null) {
                    Intrinsics.checkNotNull(list);
                    messageAdapter.updateMessages(list);
                    unit = Unit.INSTANCE;
                }
                if (unit == null) {
                    binding3 = HomeFragment.this.getBinding();
                    RecyclerView recyclerView = binding3.recyclerViewOldMessages;
                    Intrinsics.checkNotNull(list);
                    recyclerView.setAdapter(new MessageAdapter(list));
                }
                binding2 = HomeFragment.this.getBinding();
                binding2.textError.setVisibility(8);
            }
        }));
        homeViewModel.getNewMessages().observe(getViewLifecycleOwner(), new HomeFragment$sam$androidx_lifecycle_Observer$0(new Function1<List<? extends Message>, Unit>() { // from class: com.nullvastation.cryssage.ui.home.HomeFragment$onCreateView$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends Message> list) {
                invoke2((List<Message>) list);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(List<Message> list) {
                FragmentHomeBinding binding;
                FragmentHomeBinding binding2;
                FragmentHomeBinding binding3;
                binding = HomeFragment.this.getBinding();
                RecyclerView.Adapter adapter = binding.recyclerViewNewMessages.getAdapter();
                Unit unit = null;
                MessageAdapter messageAdapter = adapter instanceof MessageAdapter ? (MessageAdapter) adapter : null;
                if (messageAdapter != null) {
                    Intrinsics.checkNotNull(list);
                    messageAdapter.updateMessages(list);
                    unit = Unit.INSTANCE;
                }
                if (unit == null) {
                    binding3 = HomeFragment.this.getBinding();
                    RecyclerView recyclerView = binding3.recyclerViewNewMessages;
                    Intrinsics.checkNotNull(list);
                    recyclerView.setAdapter(new MessageAdapter(list));
                }
                binding2 = HomeFragment.this.getBinding();
                binding2.textError.setVisibility(8);
            }
        }));
        homeViewModel.getError().observe(getViewLifecycleOwner(), new HomeFragment$sam$androidx_lifecycle_Observer$0(new Function1<String, Unit>() { // from class: com.nullvastation.cryssage.ui.home.HomeFragment$onCreateView$3
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
                FragmentHomeBinding binding;
                if (str != null) {
                    binding = HomeFragment.this.getBinding();
                    TextView textView = binding.textError;
                    textView.setText(str);
                    textView.setVisibility(0);
                }
            }
        }));
        return nestedScrollView;
    }

    private final void setupRecyclerViews() {
        RecyclerView recyclerView = getBinding().recyclerViewOldMessages;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setHasFixedSize(true);
        RecyclerView recyclerView2 = getBinding().recyclerViewNewMessages;
        recyclerView2.setLayoutManager(new LinearLayoutManager(recyclerView2.getContext()));
        recyclerView2.setHasFixedSize(true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this._binding = null;
    }
}
