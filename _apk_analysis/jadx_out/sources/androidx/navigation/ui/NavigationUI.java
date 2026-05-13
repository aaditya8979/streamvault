package androidx.navigation.ui;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.IdRes;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.widget.Openable;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigation.NavigationView;
import com.mbridge.msdk.MBridgeConstans;
import com.safedk.android.utils.i;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: NavigationUI.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b*\u0010+J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006H\u0007J\u001a\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0007J\"\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007J\"\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\fH\u0007J\"\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007J\"\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\fH\u0007J*\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007J*\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\fH\u0007J\u0018\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J \u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006H\u0007J\u0016\u0010\u001c\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0007J\u0018\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J \u0010\u0014\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006H\u0007J\u001d\u0010$\u001a\u00020\u0006*\u00020\u001f2\b\b\u0001\u0010!\u001a\u00020 H\u0001¢\u0006\u0004\b\"\u0010#J#\u0010)\u001a\u00020\u0006*\u00020\u001f2\u000e\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0%H\u0001¢\u0006\u0004\b'\u0010(¨\u0006,"}, d2 = {"Landroidx/navigation/ui/NavigationUI;", "", "Landroid/view/MenuItem;", "item", "Landroidx/navigation/NavController;", "navController", "", "onNavDestinationSelected", "saveState", "Landroidx/customview/widget/Openable;", "openableLayout", "navigateUp", "Landroidx/navigation/ui/AppBarConfiguration;", i.f53156c, "Landroidx/appcompat/app/AppCompatActivity;", ActivityChooserModel.ATTRIBUTE_ACTIVITY, "Lbn/r;", "setupActionBarWithNavController", "Landroidx/appcompat/widget/Toolbar;", "toolbar", "setupWithNavController", "Lcom/google/android/material/appbar/CollapsingToolbarLayout;", "collapsingToolbarLayout", "Lcom/google/android/material/navigation/NavigationView;", "navigationView", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "findBottomSheetBehavior", "Lcom/google/android/material/navigation/NavigationBarView;", "navigationBarView", "Landroidx/navigation/NavDestination;", "", "destId", "matchDestination$navigation_ui_release", "(Landroidx/navigation/NavDestination;I)Z", "matchDestination", "", "destinationIds", "matchDestinations$navigation_ui_release", "(Landroidx/navigation/NavDestination;Ljava/util/Set;)Z", "matchDestinations", "<init>", "()V", "navigation-ui_release"}, k = 1, mv = {1, 6, 0})
public final class NavigationUI {

    @NotNull
    public static final NavigationUI INSTANCE = new NavigationUI();

    private NavigationUI() {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Nullable
    public static final BottomSheetBehavior<?> findBottomSheetBehavior(@NotNull View view) {
        p.k(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
            if (behavior instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) behavior;
            }
            return null;
        }
        Object parent = view.getParent();
        if (parent instanceof View) {
            return findBottomSheetBehavior((View) parent);
        }
        return null;
    }

    public static final boolean matchDestination$navigation_ui_release(@NotNull NavDestination navDestination, @IdRes int i10) {
        boolean z10;
        p.k(navDestination, "<this>");
        Iterator<NavDestination> it = NavDestination.INSTANCE.getHierarchy(navDestination).iterator();
        do {
            z10 = false;
            if (!it.hasNext()) {
                return false;
            }
            if (it.next().getId() == i10) {
                z10 = true;
            }
        } while (!z10);
        return true;
    }

    public static final boolean matchDestinations$navigation_ui_release(@NotNull NavDestination navDestination, @NotNull Set<Integer> set) {
        p.k(navDestination, "<this>");
        p.k(set, "destinationIds");
        Iterator<NavDestination> it = NavDestination.INSTANCE.getHierarchy(navDestination).iterator();
        while (it.hasNext()) {
            if (set.contains(Integer.valueOf(it.next().getId()))) {
                return true;
            }
        }
        return false;
    }

    public static final boolean navigateUp(@NotNull NavController navController, @Nullable Openable openableLayout) {
        p.k(navController, "navController");
        return navigateUp(navController, new AppBarConfiguration.Builder(navController.getGraph()).setOpenableLayout(openableLayout).build());
    }

    public static final boolean navigateUp(@NotNull NavController navController, @NotNull AppBarConfiguration configuration) {
        p.k(navController, "navController");
        p.k(configuration, i.f53156c);
        Openable openableLayout = configuration.getOpenableLayout();
        NavDestination currentDestination = navController.getCurrentDestination();
        Set<Integer> topLevelDestinations = configuration.getTopLevelDestinations();
        if (openableLayout != null && currentDestination != null && matchDestinations$navigation_ui_release(currentDestination, topLevelDestinations)) {
            openableLayout.open();
            return true;
        }
        if (navController.navigateUp()) {
            return true;
        }
        AppBarConfiguration.OnNavigateUpListener fallbackOnNavigateUpListener = configuration.getFallbackOnNavigateUpListener();
        if (fallbackOnNavigateUpListener != null) {
            return fallbackOnNavigateUpListener.onNavigateUp();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean onNavDestinationSelected(@org.jetbrains.annotations.NotNull android.view.MenuItem r5, @org.jetbrains.annotations.NotNull androidx.navigation.NavController r6) {
        /*
            java.lang.String r0 = "item"
            tn.p.k(r5, r0)
            java.lang.String r0 = "navController"
            tn.p.k(r6, r0)
            androidx.navigation.NavOptions$Builder r0 = new androidx.navigation.NavOptions$Builder
            r0.<init>()
            r1 = 1
            androidx.navigation.NavOptions$Builder r0 = r0.setLaunchSingleTop(r1)
            androidx.navigation.NavOptions$Builder r0 = r0.setRestoreState(r1)
            androidx.navigation.NavDestination r2 = r6.getCurrentDestination()
            tn.p.h(r2)
            androidx.navigation.NavGraph r2 = r2.getParent()
            tn.p.h(r2)
            int r3 = r5.getItemId()
            androidx.navigation.NavDestination r2 = r2.findNode(r3)
            boolean r2 = r2 instanceof androidx.navigation.ActivityNavigator.Destination
            if (r2 == 0) goto L4a
            int r2 = androidx.navigation.ui.R.anim.nav_default_enter_anim
            androidx.navigation.NavOptions$Builder r2 = r0.setEnterAnim(r2)
            int r3 = androidx.navigation.ui.R.anim.nav_default_exit_anim
            androidx.navigation.NavOptions$Builder r2 = r2.setExitAnim(r3)
            int r3 = androidx.navigation.ui.R.anim.nav_default_pop_enter_anim
            androidx.navigation.NavOptions$Builder r2 = r2.setPopEnterAnim(r3)
            int r3 = androidx.navigation.ui.R.anim.nav_default_pop_exit_anim
            r2.setPopExitAnim(r3)
            goto L61
        L4a:
            int r2 = androidx.navigation.ui.R.animator.nav_default_enter_anim
            androidx.navigation.NavOptions$Builder r2 = r0.setEnterAnim(r2)
            int r3 = androidx.navigation.ui.R.animator.nav_default_exit_anim
            androidx.navigation.NavOptions$Builder r2 = r2.setExitAnim(r3)
            int r3 = androidx.navigation.ui.R.animator.nav_default_pop_enter_anim
            androidx.navigation.NavOptions$Builder r2 = r2.setPopEnterAnim(r3)
            int r3 = androidx.navigation.ui.R.animator.nav_default_pop_exit_anim
            r2.setPopExitAnim(r3)
        L61:
            int r2 = r5.getOrder()
            r3 = 196608(0x30000, float:2.75506E-40)
            r2 = r2 & r3
            r3 = 0
            if (r2 != 0) goto L7c
            androidx.navigation.NavGraph$Companion r2 = androidx.navigation.NavGraph.INSTANCE
            androidx.navigation.NavGraph r4 = r6.getGraph()
            androidx.navigation.NavDestination r2 = r2.findStartDestination(r4)
            int r2 = r2.getId()
            r0.setPopUpTo(r2, r3, r1)
        L7c:
            androidx.navigation.NavOptions r0 = r0.build()
            int r2 = r5.getItemId()     // Catch: java.lang.IllegalArgumentException -> L9b
            r4 = 0
            r6.navigate(r2, r4, r0)     // Catch: java.lang.IllegalArgumentException -> L9b
            androidx.navigation.NavDestination r6 = r6.getCurrentDestination()     // Catch: java.lang.IllegalArgumentException -> L9b
            if (r6 == 0) goto L99
            int r5 = r5.getItemId()     // Catch: java.lang.IllegalArgumentException -> L9b
            boolean r5 = matchDestination$navigation_ui_release(r6, r5)     // Catch: java.lang.IllegalArgumentException -> L9b
            if (r5 != r1) goto L99
            goto L9a
        L99:
            r1 = r3
        L9a:
            r3 = r1
        L9b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.ui.NavigationUI.onNavDestinationSelected(android.view.MenuItem, androidx.navigation.NavController):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x009d  */
    @androidx.navigation.ui.NavigationUiSaveStateControl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean onNavDestinationSelected(@org.jetbrains.annotations.NotNull android.view.MenuItem r7, @org.jetbrains.annotations.NotNull androidx.navigation.NavController r8, boolean r9) {
        /*
            java.lang.String r0 = "item"
            tn.p.k(r7, r0)
            java.lang.String r0 = "navController"
            tn.p.k(r8, r0)
            r0 = 1
            r9 = r9 ^ r0
            if (r9 == 0) goto La0
            androidx.navigation.NavOptions$Builder r9 = new androidx.navigation.NavOptions$Builder
            r9.<init>()
            androidx.navigation.NavOptions$Builder r9 = r9.setLaunchSingleTop(r0)
            androidx.navigation.NavDestination r1 = r8.getCurrentDestination()
            tn.p.h(r1)
            androidx.navigation.NavGraph r1 = r1.getParent()
            tn.p.h(r1)
            int r2 = r7.getItemId()
            androidx.navigation.NavDestination r1 = r1.findNode(r2)
            boolean r1 = r1 instanceof androidx.navigation.ActivityNavigator.Destination
            if (r1 == 0) goto L49
            int r1 = androidx.navigation.ui.R.anim.nav_default_enter_anim
            androidx.navigation.NavOptions$Builder r1 = r9.setEnterAnim(r1)
            int r2 = androidx.navigation.ui.R.anim.nav_default_exit_anim
            androidx.navigation.NavOptions$Builder r1 = r1.setExitAnim(r2)
            int r2 = androidx.navigation.ui.R.anim.nav_default_pop_enter_anim
            androidx.navigation.NavOptions$Builder r1 = r1.setPopEnterAnim(r2)
            int r2 = androidx.navigation.ui.R.anim.nav_default_pop_exit_anim
            r1.setPopExitAnim(r2)
            goto L60
        L49:
            int r1 = androidx.navigation.ui.R.animator.nav_default_enter_anim
            androidx.navigation.NavOptions$Builder r1 = r9.setEnterAnim(r1)
            int r2 = androidx.navigation.ui.R.animator.nav_default_exit_anim
            androidx.navigation.NavOptions$Builder r1 = r1.setExitAnim(r2)
            int r2 = androidx.navigation.ui.R.animator.nav_default_pop_enter_anim
            androidx.navigation.NavOptions$Builder r1 = r1.setPopEnterAnim(r2)
            int r2 = androidx.navigation.ui.R.animator.nav_default_pop_exit_anim
            r1.setPopExitAnim(r2)
        L60:
            int r1 = r7.getOrder()
            r2 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 & r2
            if (r1 != 0) goto L7f
            androidx.navigation.NavGraph$Companion r1 = androidx.navigation.NavGraph.INSTANCE
            androidx.navigation.NavGraph r2 = r8.getGraph()
            androidx.navigation.NavDestination r1 = r1.findStartDestination(r2)
            int r2 = r1.getId()
            r3 = 0
            r4 = 0
            r5 = 4
            r6 = 0
            r1 = r9
            androidx.navigation.NavOptions.Builder.setPopUpTo$default(r1, r2, r3, r4, r5, r6)
        L7f:
            androidx.navigation.NavOptions r9 = r9.build()
            r1 = 0
            int r2 = r7.getItemId()     // Catch: java.lang.IllegalArgumentException -> L9f
            r3 = 0
            r8.navigate(r2, r3, r9)     // Catch: java.lang.IllegalArgumentException -> L9f
            androidx.navigation.NavDestination r8 = r8.getCurrentDestination()     // Catch: java.lang.IllegalArgumentException -> L9f
            if (r8 == 0) goto L9d
            int r7 = r7.getItemId()     // Catch: java.lang.IllegalArgumentException -> L9f
            boolean r7 = matchDestination$navigation_ui_release(r8, r7)     // Catch: java.lang.IllegalArgumentException -> L9f
            if (r7 != r0) goto L9d
            goto L9e
        L9d:
            r0 = r1
        L9e:
            r1 = r0
        L9f:
            return r1
        La0:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Leave the saveState parameter out entirely to use the non-experimental version of this API, which saves the state by default"
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.ui.NavigationUI.onNavDestinationSelected(android.view.MenuItem, androidx.navigation.NavController, boolean):boolean");
    }

    public static final void setupActionBarWithNavController(@NotNull AppCompatActivity appCompatActivity, @NotNull NavController navController) {
        p.k(appCompatActivity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        p.k(navController, "navController");
        setupActionBarWithNavController$default(appCompatActivity, navController, null, 4, null);
    }

    public static final void setupActionBarWithNavController(@NotNull AppCompatActivity appCompatActivity, @NotNull NavController navController, @Nullable Openable openable) {
        p.k(appCompatActivity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        p.k(navController, "navController");
        setupActionBarWithNavController(appCompatActivity, navController, new AppBarConfiguration.Builder(navController.getGraph()).setOpenableLayout(openable).build());
    }

    public static final void setupActionBarWithNavController(@NotNull AppCompatActivity appCompatActivity, @NotNull NavController navController, @NotNull AppBarConfiguration appBarConfiguration) {
        p.k(appCompatActivity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        p.k(navController, "navController");
        p.k(appBarConfiguration, i.f53156c);
        navController.addOnDestinationChangedListener(new ActionBarOnDestinationChangedListener(appCompatActivity, appBarConfiguration));
    }

    public static /* synthetic */ void setupActionBarWithNavController$default(AppCompatActivity appCompatActivity, NavController navController, AppBarConfiguration appBarConfiguration, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        }
        setupActionBarWithNavController(appCompatActivity, navController, appBarConfiguration);
    }

    public static final void setupWithNavController(@NotNull Toolbar toolbar, @NotNull NavController navController) {
        p.k(toolbar, "toolbar");
        p.k(navController, "navController");
        setupWithNavController$default(toolbar, navController, null, 4, null);
    }

    public static final void setupWithNavController(@NotNull Toolbar toolbar, @NotNull NavController navController, @Nullable Openable openable) {
        p.k(toolbar, "toolbar");
        p.k(navController, "navController");
        setupWithNavController(toolbar, navController, new AppBarConfiguration.Builder(navController.getGraph()).setOpenableLayout(openable).build());
    }

    public static final void setupWithNavController(@NotNull Toolbar toolbar, @NotNull final NavController navController, @NotNull final AppBarConfiguration appBarConfiguration) {
        p.k(toolbar, "toolbar");
        p.k(navController, "navController");
        p.k(appBarConfiguration, i.f53156c);
        navController.addOnDestinationChangedListener(new ToolbarOnDestinationChangedListener(toolbar, appBarConfiguration));
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: p.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NavigationUI.m4105setupWithNavController$lambda1(navController, appBarConfiguration, view);
            }
        });
    }

    public static final void setupWithNavController(@NotNull CollapsingToolbarLayout collapsingToolbarLayout, @NotNull Toolbar toolbar, @NotNull NavController navController) {
        p.k(collapsingToolbarLayout, "collapsingToolbarLayout");
        p.k(toolbar, "toolbar");
        p.k(navController, "navController");
        setupWithNavController$default(collapsingToolbarLayout, toolbar, navController, null, 8, null);
    }

    public static final void setupWithNavController(@NotNull CollapsingToolbarLayout collapsingToolbarLayout, @NotNull Toolbar toolbar, @NotNull NavController navController, @Nullable Openable openable) {
        p.k(collapsingToolbarLayout, "collapsingToolbarLayout");
        p.k(toolbar, "toolbar");
        p.k(navController, "navController");
        setupWithNavController(collapsingToolbarLayout, toolbar, navController, new AppBarConfiguration.Builder(navController.getGraph()).setOpenableLayout(openable).build());
    }

    public static final void setupWithNavController(@NotNull CollapsingToolbarLayout collapsingToolbarLayout, @NotNull Toolbar toolbar, @NotNull final NavController navController, @NotNull final AppBarConfiguration appBarConfiguration) {
        p.k(collapsingToolbarLayout, "collapsingToolbarLayout");
        p.k(toolbar, "toolbar");
        p.k(navController, "navController");
        p.k(appBarConfiguration, i.f53156c);
        navController.addOnDestinationChangedListener(new CollapsingToolbarOnDestinationChangedListener(collapsingToolbarLayout, toolbar, appBarConfiguration));
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: p.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NavigationUI.m4106setupWithNavController$lambda2(navController, appBarConfiguration, view);
            }
        });
    }

    public static final void setupWithNavController(@NotNull NavigationBarView navigationBarView, @NotNull final NavController navController) {
        p.k(navigationBarView, "navigationBarView");
        p.k(navController, "navController");
        navigationBarView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() { // from class: p.c
            @Override // com.google.android.material.navigation.NavigationBarView.OnItemSelectedListener
            public final boolean onNavigationItemSelected(MenuItem menuItem) {
                return NavigationUI.m4109setupWithNavController$lambda6(navController, menuItem);
            }
        });
        final WeakReference weakReference = new WeakReference(navigationBarView);
        navController.addOnDestinationChangedListener(new NavController.OnDestinationChangedListener() { // from class: androidx.navigation.ui.NavigationUI.setupWithNavController.9
            @Override // androidx.navigation.NavController.OnDestinationChangedListener
            public void onDestinationChanged(@NotNull NavController navController2, @NotNull NavDestination navDestination, @Nullable Bundle bundle) {
                p.k(navController2, "controller");
                p.k(navDestination, "destination");
                NavigationBarView navigationBarView2 = weakReference.get();
                if (navigationBarView2 == null) {
                    navController.removeOnDestinationChangedListener(this);
                    return;
                }
                Menu menu = navigationBarView2.getMenu();
                p.j(menu, "view.menu");
                int size = menu.size();
                for (int i10 = 0; i10 < size; i10++) {
                    MenuItem item = menu.getItem(i10);
                    p.g(item, "getItem(index)");
                    if (NavigationUI.matchDestination$navigation_ui_release(navDestination, item.getItemId())) {
                        item.setChecked(true);
                    }
                }
            }
        });
    }

    @NavigationUiSaveStateControl
    public static final void setupWithNavController(@NotNull NavigationBarView navigationBarView, @NotNull final NavController navController, final boolean z10) {
        p.k(navigationBarView, "navigationBarView");
        p.k(navController, "navController");
        if (!(!z10)) {
            throw new IllegalStateException("Leave the saveState parameter out entirely to use the non-experimental version of this API, which saves the state by default".toString());
        }
        navigationBarView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() { // from class: p.f
            @Override // com.google.android.material.navigation.NavigationBarView.OnItemSelectedListener
            public final boolean onNavigationItemSelected(MenuItem menuItem) {
                return NavigationUI.m4110setupWithNavController$lambda8(navController, z10, menuItem);
            }
        });
        final WeakReference weakReference = new WeakReference(navigationBarView);
        navController.addOnDestinationChangedListener(new NavController.OnDestinationChangedListener() { // from class: androidx.navigation.ui.NavigationUI.setupWithNavController.12
            @Override // androidx.navigation.NavController.OnDestinationChangedListener
            public void onDestinationChanged(@NotNull NavController navController2, @NotNull NavDestination navDestination, @Nullable Bundle bundle) {
                p.k(navController2, "controller");
                p.k(navDestination, "destination");
                NavigationBarView navigationBarView2 = weakReference.get();
                if (navigationBarView2 == null) {
                    navController.removeOnDestinationChangedListener(this);
                    return;
                }
                Menu menu = navigationBarView2.getMenu();
                p.j(menu, "view.menu");
                int size = menu.size();
                for (int i10 = 0; i10 < size; i10++) {
                    MenuItem item = menu.getItem(i10);
                    p.g(item, "getItem(index)");
                    if (NavigationUI.matchDestination$navigation_ui_release(navDestination, item.getItemId())) {
                        item.setChecked(true);
                    }
                }
            }
        });
    }

    public static final void setupWithNavController(@NotNull final NavigationView navigationView, @NotNull final NavController navController) {
        p.k(navigationView, "navigationView");
        p.k(navController, "navController");
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() { // from class: p.d
            @Override // com.google.android.material.navigation.NavigationView.OnNavigationItemSelectedListener
            public final boolean onNavigationItemSelected(MenuItem menuItem) {
                return NavigationUI.m4107setupWithNavController$lambda3(navController, navigationView, menuItem);
            }
        });
        final WeakReference weakReference = new WeakReference(navigationView);
        navController.addOnDestinationChangedListener(new NavController.OnDestinationChangedListener() { // from class: androidx.navigation.ui.NavigationUI.setupWithNavController.4
            @Override // androidx.navigation.NavController.OnDestinationChangedListener
            public void onDestinationChanged(@NotNull NavController navController2, @NotNull NavDestination navDestination, @Nullable Bundle bundle) {
                p.k(navController2, "controller");
                p.k(navDestination, "destination");
                NavigationView navigationView2 = weakReference.get();
                if (navigationView2 == null) {
                    navController.removeOnDestinationChangedListener(this);
                    return;
                }
                Menu menu = navigationView2.getMenu();
                p.j(menu, "view.menu");
                int size = menu.size();
                for (int i10 = 0; i10 < size; i10++) {
                    MenuItem item = menu.getItem(i10);
                    p.g(item, "getItem(index)");
                    item.setChecked(NavigationUI.matchDestination$navigation_ui_release(navDestination, item.getItemId()));
                }
            }
        });
    }

    @NavigationUiSaveStateControl
    public static final void setupWithNavController(@NotNull final NavigationView navigationView, @NotNull final NavController navController, final boolean z10) {
        p.k(navigationView, "navigationView");
        p.k(navController, "navController");
        if (!(!z10)) {
            throw new IllegalStateException("Leave the saveState parameter out entirely to use the non-experimental version of this API, which saves the state by default".toString());
        }
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() { // from class: p.a
            @Override // com.google.android.material.navigation.NavigationView.OnNavigationItemSelectedListener
            public final boolean onNavigationItemSelected(MenuItem menuItem) {
                return NavigationUI.m4108setupWithNavController$lambda5(navController, z10, navigationView, menuItem);
            }
        });
        final WeakReference weakReference = new WeakReference(navigationView);
        navController.addOnDestinationChangedListener(new NavController.OnDestinationChangedListener() { // from class: androidx.navigation.ui.NavigationUI.setupWithNavController.7
            @Override // androidx.navigation.NavController.OnDestinationChangedListener
            public void onDestinationChanged(@NotNull NavController navController2, @NotNull NavDestination navDestination, @Nullable Bundle bundle) {
                p.k(navController2, "controller");
                p.k(navDestination, "destination");
                NavigationView navigationView2 = weakReference.get();
                if (navigationView2 == null) {
                    navController.removeOnDestinationChangedListener(this);
                    return;
                }
                Menu menu = navigationView2.getMenu();
                p.j(menu, "view.menu");
                int size = menu.size();
                for (int i10 = 0; i10 < size; i10++) {
                    MenuItem item = menu.getItem(i10);
                    p.g(item, "getItem(index)");
                    item.setChecked(NavigationUI.matchDestination$navigation_ui_release(navDestination, item.getItemId()));
                }
            }
        });
    }

    public static /* synthetic */ void setupWithNavController$default(Toolbar toolbar, NavController navController, AppBarConfiguration appBarConfiguration, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        }
        setupWithNavController(toolbar, navController, appBarConfiguration);
    }

    public static /* synthetic */ void setupWithNavController$default(CollapsingToolbarLayout collapsingToolbarLayout, Toolbar toolbar, NavController navController, AppBarConfiguration appBarConfiguration, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        }
        setupWithNavController(collapsingToolbarLayout, toolbar, navController, appBarConfiguration);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setupWithNavController$lambda-1, reason: not valid java name */
    public static final void m4105setupWithNavController$lambda1(NavController navController, AppBarConfiguration appBarConfiguration, View view) {
        p.k(navController, "$navController");
        p.k(appBarConfiguration, "$configuration");
        navigateUp(navController, appBarConfiguration);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setupWithNavController$lambda-2, reason: not valid java name */
    public static final void m4106setupWithNavController$lambda2(NavController navController, AppBarConfiguration appBarConfiguration, View view) {
        p.k(navController, "$navController");
        p.k(appBarConfiguration, "$configuration");
        navigateUp(navController, appBarConfiguration);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setupWithNavController$lambda-3, reason: not valid java name */
    public static final boolean m4107setupWithNavController$lambda3(NavController navController, NavigationView navigationView, MenuItem menuItem) {
        p.k(navController, "$navController");
        p.k(navigationView, "$navigationView");
        p.k(menuItem, "item");
        boolean zOnNavDestinationSelected = onNavDestinationSelected(menuItem, navController);
        if (zOnNavDestinationSelected) {
            ViewParent parent = navigationView.getParent();
            if (parent instanceof Openable) {
                ((Openable) parent).close();
            } else {
                BottomSheetBehavior<?> bottomSheetBehaviorFindBottomSheetBehavior = findBottomSheetBehavior(navigationView);
                if (bottomSheetBehaviorFindBottomSheetBehavior != null) {
                    bottomSheetBehaviorFindBottomSheetBehavior.setState(5);
                }
            }
        }
        return zOnNavDestinationSelected;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setupWithNavController$lambda-5, reason: not valid java name */
    public static final boolean m4108setupWithNavController$lambda5(NavController navController, boolean z10, NavigationView navigationView, MenuItem menuItem) {
        p.k(navController, "$navController");
        p.k(navigationView, "$navigationView");
        p.k(menuItem, "item");
        boolean zOnNavDestinationSelected = onNavDestinationSelected(menuItem, navController, z10);
        if (zOnNavDestinationSelected) {
            ViewParent parent = navigationView.getParent();
            if (parent instanceof Openable) {
                ((Openable) parent).close();
            } else {
                BottomSheetBehavior<?> bottomSheetBehaviorFindBottomSheetBehavior = findBottomSheetBehavior(navigationView);
                if (bottomSheetBehaviorFindBottomSheetBehavior != null) {
                    bottomSheetBehaviorFindBottomSheetBehavior.setState(5);
                }
            }
        }
        return zOnNavDestinationSelected;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setupWithNavController$lambda-6, reason: not valid java name */
    public static final boolean m4109setupWithNavController$lambda6(NavController navController, MenuItem menuItem) {
        p.k(navController, "$navController");
        p.k(menuItem, "item");
        return onNavDestinationSelected(menuItem, navController);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setupWithNavController$lambda-8, reason: not valid java name */
    public static final boolean m4110setupWithNavController$lambda8(NavController navController, boolean z10, MenuItem menuItem) {
        p.k(navController, "$navController");
        p.k(menuItem, "item");
        return onNavDestinationSelected(menuItem, navController, z10);
    }
}
