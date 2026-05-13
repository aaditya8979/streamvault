package io.appmetrica.analytics.screenshot.impl;

import android.annotation.SuppressLint;
import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5299c implements ActivityLifecycleListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5300d f68430a;

    public C5299c(C5300d c5300d) {
        this.f68430a = c5300d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    @SuppressLint({"MissingPermission", "NewApi"})
    public final void onEvent(@NotNull Activity activity, @NotNull ActivityEvent activityEvent) {
        int i10 = AbstractC5298b.f68429a[activityEvent.ordinal()];
        try {
            if (i10 == 1) {
                C5306j c5306j = this.f68430a.f68433c;
                if (c5306j == null || !c5306j.f68449a) {
                } else {
                    activity.registerScreenCaptureCallback(this.f68430a.f68431a.getContext().getMainExecutor(), C5300d.d(this.f68430a));
                }
            } else if (i10 != 2) {
            } else {
                activity.unregisterScreenCaptureCallback(C5300d.d(this.f68430a));
            }
        } catch (Throwable unused) {
        }
    }
}
