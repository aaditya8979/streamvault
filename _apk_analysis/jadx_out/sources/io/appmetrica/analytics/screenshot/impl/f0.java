package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class f0 implements ActivityLifecycleListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0 f68438a;

    public f0(g0 g0Var) {
        this.f68438a = g0Var;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(@NotNull Activity activity, @NotNull ActivityEvent activityEvent) {
        int i10 = e0.f68437a[activityEvent.ordinal()];
        try {
            if (i10 == 1) {
                C5310n c5310n = this.f68438a.f68443e;
                if (c5310n == null || !c5310n.f68465a) {
                    return;
                }
                this.f68438a.f68442d = false;
                g0 g0Var = this.f68438a;
                g0Var.f68441c.postDelayed(g0Var.f68444f, 0L);
            } else if (i10 != 2) {
            } else {
                this.f68438a.f68442d = true;
            }
        } catch (Throwable unused) {
        }
    }
}
