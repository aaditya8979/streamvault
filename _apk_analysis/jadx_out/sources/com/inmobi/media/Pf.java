package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.appcompat.widget.ActivityChooserModel;
import com.squareup.picasso.Picasso;
import java.util.Objects;

/* JADX INFO: loaded from: classes9.dex */
public final class Pf implements Application.ActivityLifecycleCallbacks {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(com.inmobi.media.Pf r5, android.app.Activity r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            boolean r0 = r7 instanceof com.inmobi.media.Nf
            if (r0 == 0) goto L13
            r0 = r7
            com.inmobi.media.Nf r0 = (com.inmobi.media.Nf) r0
            int r1 = r0.f26040e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26040e = r1
            goto L18
        L13:
            com.inmobi.media.Nf r0 = new com.inmobi.media.Nf
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f26038c
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f26040e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            mo.a r6 = r0.f26037b
            android.app.Activity r0 = r0.f26036a
            kotlin.c.b(r7)
            goto L4a
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            kotlin.c.b(r7)
            mo.a r7 = com.inmobi.media.Qf.f26184b
            r0.f26036a = r6
            r0.f26037b = r7
            r0.f26040e = r3
            java.lang.Object r0 = r7.c(r4, r0)
            if (r0 != r1) goto L48
            return r1
        L48:
            r0 = r6
            r6 = r7
        L4a:
            com.squareup.picasso.Picasso r7 = com.inmobi.media.Qf.f26183a     // Catch: java.lang.Throwable -> L8e
            if (r7 == 0) goto L88
            r7 = 0
            java.util.ArrayList r1 = com.inmobi.media.Qf.f26185c     // Catch: java.lang.Throwable -> L8e
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L8e
        L55:
            if (r7 >= r1) goto L75
            java.util.ArrayList r2 = com.inmobi.media.Qf.f26185c     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r3 = r2.get(r7)     // Catch: java.lang.Throwable -> L8e
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r3 = r3.get()     // Catch: java.lang.Throwable -> L8e
            android.content.Context r3 = (android.content.Context) r3     // Catch: java.lang.Throwable -> L8e
            boolean r3 = tn.p.f(r3, r0)     // Catch: java.lang.Throwable -> L8e
            if (r3 == 0) goto L72
            java.lang.Object r7 = r2.get(r7)     // Catch: java.lang.Throwable -> L8e
            java.lang.ref.WeakReference r7 = (java.lang.ref.WeakReference) r7     // Catch: java.lang.Throwable -> L8e
            goto L76
        L72:
            int r7 = r7 + 1
            goto L55
        L75:
            r7 = r4
        L76:
            if (r7 == 0) goto L88
            java.util.ArrayList r1 = com.inmobi.media.Qf.f26185c     // Catch: java.lang.Throwable -> L8e
            r1.remove(r7)     // Catch: java.lang.Throwable -> L8e
            boolean r7 = r1.isEmpty()     // Catch: java.lang.Throwable -> L8e
            if (r7 == 0) goto L86
            r5.a(r0)     // Catch: java.lang.Throwable -> L8e
        L86:
            bn.r r5 = bn.r.f5635a     // Catch: java.lang.Throwable -> L8e
        L88:
            r6.d(r4)
            bn.r r5 = bn.r.f5635a
            return r5
        L8e:
            r5 = move-exception
            r6.d(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Pf.a(com.inmobi.media.Pf, android.app.Activity, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void a(Activity activity) {
        Picasso picasso = Qf.f26183a;
        tn.p.j("Qf", "access$getTAG$p(...)");
        Objects.toString(Qf.f26183a);
        activity.getApplication().unregisterActivityLifecycleCallbacks(this);
        Picasso picasso2 = Qf.f26183a;
        if (picasso2 != null) {
            picasso2.shutdown();
        }
        Qf.f26183a = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) throws InterruptedException {
        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        p000do.h.b(null, new Of(this, activity, null), 1, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        tn.p.k(bundle, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
    }
}
