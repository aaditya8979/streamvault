package io.appmetrica.analytics.screenshot.impl;

import android.app.ActivityManager;
import android.content.Context;
import androidx.appcompat.widget.ActivityChooserModel;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import io.appmetrica.analytics.screenshot.impl.d0;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class d0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0 f68435a;

    public d0(g0 g0Var) {
        this.f68435a = g0Var;
    }

    public static final Boolean a(g0 g0Var, d0 d0Var, C5310n c5310n, ActivityManager activityManager) {
        Object next;
        List<ActivityManager.RunningServiceInfo> runningServices = activityManager.getRunningServices(200);
        if (runningServices == null) {
            runningServices = cn.w.m();
        }
        for (ActivityManager.RunningServiceInfo runningServiceInfo : runningServices) {
        }
        Iterator<T> it = runningServices.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (tn.p.f(((ActivityManager.RunningServiceInfo) next).process, "com.android.systemui:screenshot")) {
                break;
            }
        }
        if (((ActivityManager.RunningServiceInfo) next) != null) {
            ((C5319x) g0Var.f68440b).a("ServiceScreenshotCaptor");
        }
        return Boolean.valueOf(g0Var.f68441c.postDelayed(d0Var, TimeUnit.SECONDS.toMillis(c5310n.f68466b)));
    }

    @Override // java.lang.Runnable
    public final void run() {
        final C5310n c5310n = this.f68435a.f68443e;
        if (this.f68435a.f68442d || c5310n == null || !c5310n.f68465a) {
            return;
        }
        Context context = this.f68435a.f68439a.getContext();
        final g0 g0Var = this.f68435a;
        SystemServiceUtils.accessSystemServiceByNameSafely(context, ActivityChooserModel.ATTRIBUTE_ACTIVITY, "running service screenshot captor", "ActivityManager", new FunctionWithThrowable() { // from class: oh.b
            @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
            public final Object apply(Object obj) {
                return d0.a(g0Var, this, c5310n, (ActivityManager) obj);
            }
        });
    }
}
