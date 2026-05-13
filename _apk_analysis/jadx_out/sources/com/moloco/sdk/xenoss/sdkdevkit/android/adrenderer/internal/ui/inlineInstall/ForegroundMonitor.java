package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import go.u;
import go.v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class ForegroundMonitor implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f48962d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final ForegroundMonitor f48960b = new ForegroundMonitor();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final go.l<Boolean> f48961c = v.a(Boolean.TRUE);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f48963e = 8;

    private ForegroundMonitor() {
    }

    public final void a() {
        if (f48962d) {
            return;
        }
        ProcessLifecycleOwner.Companion.get().getLifecycle().addObserver(this);
        f48962d = true;
    }

    @NotNull
    public final u<Boolean> b() {
        return f48961c;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(@NotNull LifecycleOwner lifecycleOwner) {
        tn.p.k(lifecycleOwner, "owner");
        f48961c.setValue(Boolean.TRUE);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@NotNull LifecycleOwner lifecycleOwner) {
        tn.p.k(lifecycleOwner, "owner");
        f48961c.setValue(Boolean.FALSE);
    }
}
