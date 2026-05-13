package androidx.navigation;

import android.os.Bundle;
import androidx.annotation.CallSuper;
import androidx.annotation.RestrictTo;
import bn.r;
import cn.f0;
import cn.w;
import cn.w0;
import cn.x0;
import go.f;
import go.l;
import go.u;
import go.v;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: NavigatorState.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b)\u0010*J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH&J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u001b0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\"\u0010\u001d\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001f\"\u0004\b \u0010!R#\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00180\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R#\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u001b0\"8\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b(\u0010&¨\u0006+"}, d2 = {"Landroidx/navigation/NavigatorState;", "", "Landroidx/navigation/NavBackStackEntry;", "backStackEntry", "Lbn/r;", "push", "pushWithTransition", "Landroidx/navigation/NavDestination;", "destination", "Landroid/os/Bundle;", "arguments", "createBackStackEntry", "popUpTo", "", "saveState", "pop", "popWithTransition", "onLaunchSingleTop", "entry", "markTransitionComplete", "Ljava/util/concurrent/locks/ReentrantLock;", "backStackLock", "Ljava/util/concurrent/locks/ReentrantLock;", "Lgo/l;", "", "_backStack", "Lgo/l;", "", "_transitionsInProgress", "isNavigating", "Z", "()Z", "setNavigating", "(Z)V", "Lgo/u;", "backStack", "Lgo/u;", "getBackStack", "()Lgo/u;", "transitionsInProgress", "getTransitionsInProgress", "<init>", "()V", "navigation-common_release"}, k = 1, mv = {1, 6, 0})
public abstract class NavigatorState {

    @NotNull
    private final l<List<NavBackStackEntry>> _backStack;

    @NotNull
    private final l<Set<NavBackStackEntry>> _transitionsInProgress;

    @NotNull
    private final u<List<NavBackStackEntry>> backStack;

    @NotNull
    private final ReentrantLock backStackLock = new ReentrantLock(true);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    private boolean isNavigating;

    @NotNull
    private final u<Set<NavBackStackEntry>> transitionsInProgress;

    public NavigatorState() {
        l<List<NavBackStackEntry>> lVarA = v.a(w.m());
        this._backStack = lVarA;
        l<Set<NavBackStackEntry>> lVarA2 = v.a(w0.f());
        this._transitionsInProgress = lVarA2;
        this.backStack = f.c(lVarA);
        this.transitionsInProgress = f.c(lVarA2);
    }

    @NotNull
    public abstract NavBackStackEntry createBackStackEntry(@NotNull NavDestination destination, @Nullable Bundle arguments);

    @NotNull
    public final u<List<NavBackStackEntry>> getBackStack() {
        return this.backStack;
    }

    @NotNull
    public final u<Set<NavBackStackEntry>> getTransitionsInProgress() {
        return this.transitionsInProgress;
    }

    /* JADX INFO: renamed from: isNavigating, reason: from getter */
    public final boolean getIsNavigating() {
        return this.isNavigating;
    }

    public void markTransitionComplete(@NotNull NavBackStackEntry navBackStackEntry) {
        p.k(navBackStackEntry, "entry");
        l<Set<NavBackStackEntry>> lVar = this._transitionsInProgress;
        lVar.setValue(x0.l(lVar.getValue(), navBackStackEntry));
    }

    @CallSuper
    public void onLaunchSingleTop(@NotNull NavBackStackEntry navBackStackEntry) {
        p.k(navBackStackEntry, "backStackEntry");
        l<List<NavBackStackEntry>> lVar = this._backStack;
        lVar.setValue(f0.P0(f0.M0(lVar.getValue(), f0.F0(this._backStack.getValue())), navBackStackEntry));
    }

    public void pop(@NotNull NavBackStackEntry navBackStackEntry, boolean z10) {
        p.k(navBackStackEntry, "popUpTo");
        ReentrantLock reentrantLock = this.backStackLock;
        reentrantLock.lock();
        try {
            l<List<NavBackStackEntry>> lVar = this._backStack;
            List<NavBackStackEntry> value = lVar.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : value) {
                if (!(!p.f((NavBackStackEntry) obj, navBackStackEntry))) {
                    break;
                } else {
                    arrayList.add(obj);
                }
            }
            lVar.setValue(arrayList);
            r rVar = r.f5635a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void popWithTransition(@NotNull NavBackStackEntry navBackStackEntry, boolean z10) {
        NavBackStackEntry navBackStackEntryPrevious;
        p.k(navBackStackEntry, "popUpTo");
        l<Set<NavBackStackEntry>> lVar = this._transitionsInProgress;
        lVar.setValue(x0.n(lVar.getValue(), navBackStackEntry));
        List<NavBackStackEntry> value = this.backStack.getValue();
        ListIterator<NavBackStackEntry> listIterator = value.listIterator(value.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                navBackStackEntryPrevious = null;
                break;
            }
            navBackStackEntryPrevious = listIterator.previous();
            NavBackStackEntry navBackStackEntry2 = navBackStackEntryPrevious;
            if (!p.f(navBackStackEntry2, navBackStackEntry) && this.backStack.getValue().lastIndexOf(navBackStackEntry2) < this.backStack.getValue().lastIndexOf(navBackStackEntry)) {
                break;
            }
        }
        NavBackStackEntry navBackStackEntry3 = navBackStackEntryPrevious;
        if (navBackStackEntry3 != null) {
            l<Set<NavBackStackEntry>> lVar2 = this._transitionsInProgress;
            lVar2.setValue(x0.n(lVar2.getValue(), navBackStackEntry3));
        }
        pop(navBackStackEntry, z10);
    }

    public void push(@NotNull NavBackStackEntry navBackStackEntry) {
        p.k(navBackStackEntry, "backStackEntry");
        ReentrantLock reentrantLock = this.backStackLock;
        reentrantLock.lock();
        try {
            l<List<NavBackStackEntry>> lVar = this._backStack;
            lVar.setValue(f0.P0(lVar.getValue(), navBackStackEntry));
            r rVar = r.f5635a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void pushWithTransition(@NotNull NavBackStackEntry navBackStackEntry) {
        p.k(navBackStackEntry, "backStackEntry");
        NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) f0.G0(this.backStack.getValue());
        if (navBackStackEntry2 != null) {
            l<Set<NavBackStackEntry>> lVar = this._transitionsInProgress;
            lVar.setValue(x0.n(lVar.getValue(), navBackStackEntry2));
        }
        l<Set<NavBackStackEntry>> lVar2 = this._transitionsInProgress;
        lVar2.setValue(x0.n(lVar2.getValue(), navBackStackEntry));
        push(navBackStackEntry);
    }

    public final void setNavigating(boolean z10) {
        this.isNavigating = z10;
    }
}
