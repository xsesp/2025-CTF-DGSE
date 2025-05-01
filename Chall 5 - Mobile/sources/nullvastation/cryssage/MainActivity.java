package com.nullvastation.cryssage;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.ActivityKt;
import androidx.navigation.NavController;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavControllerKt;
import androidx.navigation.ui.NavigationViewKt;
import com.google.android.material.navigation.NavigationView;
import com.nullvastation.cryssage.databinding.ActivityMainBinding;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* compiled from: MainActivity.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/nullvastation/cryssage/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "appBarConfiguration", "Landroidx/navigation/ui/AppBarConfiguration;", "binding", "Lcom/nullvastation/cryssage/databinding/ActivityMainBinding;", "onCreate", HttpUrl.FRAGMENT_ENCODE_SET, "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", HttpUrl.FRAGMENT_ENCODE_SET, "menu", "Landroid/view/Menu;", "onSupportNavigateUp", "app_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class MainActivity extends AppCompatActivity {
    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding inflate = ActivityMainBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        ActivityMainBinding activityMainBinding = null;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            inflate = null;
        }
        setContentView(inflate.getRoot());
        ActivityMainBinding activityMainBinding2 = this.binding;
        if (activityMainBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityMainBinding2 = null;
        }
        setSupportActionBar(activityMainBinding2.appBarMain.toolbar);
        ActivityMainBinding activityMainBinding3 = this.binding;
        if (activityMainBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityMainBinding3 = null;
        }
        final DrawerLayout drawerLayout = activityMainBinding3.drawerLayout;
        Intrinsics.checkNotNullExpressionValue(drawerLayout, "drawerLayout");
        ActivityMainBinding activityMainBinding4 = this.binding;
        if (activityMainBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityMainBinding4 = null;
        }
        NavigationView navView = activityMainBinding4.navView;
        Intrinsics.checkNotNullExpressionValue(navView, "navView");
        final NavController findNavController = ActivityKt.findNavController(this, R.id.nav_host_fragment_content_main);
        AppBarConfiguration build = new AppBarConfiguration.Builder((Set<Integer>) SetsKt.setOf((Object[]) new Integer[]{Integer.valueOf(R.id.nav_home), Integer.valueOf(R.id.nav_profile), Integer.valueOf(R.id.nav_message), Integer.valueOf(R.id.nav_invite)})).setOpenableLayout(drawerLayout).setFallbackOnNavigateUpListener(new MainActivity$inlined$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0(new Function0<Boolean>() { // from class: com.nullvastation.cryssage.MainActivity$onCreate$$inlined$AppBarConfiguration$default$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return false;
            }
        })).build();
        this.appBarConfiguration = build;
        MainActivity mainActivity = this;
        if (build == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appBarConfiguration");
            build = null;
        }
        androidx.navigation.ui.ActivityKt.setupActionBarWithNavController(mainActivity, findNavController, build);
        NavigationViewKt.setupWithNavController(navView, findNavController);
        ActivityMainBinding activityMainBinding5 = this.binding;
        if (activityMainBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityMainBinding = activityMainBinding5;
        }
        activityMainBinding.appBarMain.fab.setOnClickListener(new View.OnClickListener() { // from class: com.nullvastation.cryssage.MainActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.onCreate$lambda$0(NavController.this, view);
            }
        });
        navView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() { // from class: com.nullvastation.cryssage.MainActivity$$ExternalSyntheticLambda1
            @Override // com.google.android.material.navigation.NavigationView.OnNavigationItemSelectedListener
            public final boolean onNavigationItemSelected(MenuItem menuItem) {
                boolean onCreate$lambda$1;
                onCreate$lambda$1 = MainActivity.onCreate$lambda$1(NavController.this, drawerLayout, menuItem);
                return onCreate$lambda$1;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(NavController navController, View view) {
        Intrinsics.checkNotNullParameter(navController, "$navController");
        navController.navigate(R.id.nav_message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onCreate$lambda$1(NavController navController, DrawerLayout drawerLayout, MenuItem item) {
        Intrinsics.checkNotNullParameter(navController, "$navController");
        Intrinsics.checkNotNullParameter(drawerLayout, "$drawerLayout");
        Intrinsics.checkNotNullParameter(item, "item");
        int itemId = item.getItemId();
        if (itemId == R.id.nav_home) {
            navController.navigate(R.id.nav_home);
        } else if (itemId == R.id.nav_profile) {
            navController.navigate(R.id.nav_profile);
        } else if (itemId == R.id.nav_message) {
            navController.navigate(R.id.nav_message);
        } else if (itemId == R.id.nav_invite) {
            navController.navigate(R.id.nav_invite);
        }
        drawerLayout.closeDrawers();
        return true;
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override // androidx.appcompat.app.AppCompatActivity
    public boolean onSupportNavigateUp() {
        NavController findNavController = ActivityKt.findNavController(this, R.id.nav_host_fragment_content_main);
        AppBarConfiguration appBarConfiguration = this.appBarConfiguration;
        if (appBarConfiguration == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appBarConfiguration");
            appBarConfiguration = null;
        }
        return NavControllerKt.navigateUp(findNavController, appBarConfiguration) || super.onSupportNavigateUp();
    }
}
