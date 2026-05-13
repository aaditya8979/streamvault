package io.appmetrica.analytics.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class E5 implements ActivityLifecycleListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ F5 f65174a;

    public E5(F5 f52) {
        this.f65174a = f52;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(@NotNull Activity activity, @NotNull ActivityEvent activityEvent) {
        int i10 = D5.f65146a[activityEvent.ordinal()];
        if (i10 == 1) {
            this.f65174a.f65235b.resumeSession();
        } else {
            if (i10 != 2) {
                return;
            }
            this.f65174a.f65235b.pauseSession();
        }
    }
}
