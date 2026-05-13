package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import androidx.appcompat.widget.ActivityChooserModel;
import com.inmobi.media.D1;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes7.dex */
public final class D1 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1 f25285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f25286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f25287c;

    public D1(Context context) {
        this.f25287c = context;
        Looper mainLooper = Looper.getMainLooper();
        tn.p.j(mainLooper, "getMainLooper(...)");
        this.f25285a = new C1(mainLooper);
    }

    public static final void a(Context context, D1 d12) {
        if (E1.a(context) || d12.f25286b != null) {
            return;
        }
        d12.f25285a.sendEmptyMessageDelayed(1001, 3000L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        WeakReference weakReference = this.f25286b;
        if (!tn.p.f(weakReference != null ? (Activity) weakReference.get() : null, activity)) {
            this.f25286b = new WeakReference(activity);
        }
        this.f25285a.removeMessages(1001);
        this.f25285a.sendEmptyMessage(1002);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        tn.p.k(bundle, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        WeakReference weakReference = this.f25286b;
        if (!tn.p.f(weakReference != null ? (Activity) weakReference.get() : null, activity)) {
            this.f25286b = new WeakReference(activity);
        }
        this.f25285a.removeMessages(1001);
        this.f25285a.sendEmptyMessage(1002);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        WeakReference weakReference = this.f25286b;
        if (tn.p.f(weakReference != null ? (Activity) weakReference.get() : null, activity)) {
            this.f25285a.sendEmptyMessageDelayed(1001, 3000L);
            return;
        }
        if (this.f25286b == null) {
            final Context context = this.f25287c;
            Runnable runnable = new Runnable() { // from class: n9.i
                @Override // java.lang.Runnable
                public final void run() {
                    D1.a(context, this);
                }
            };
            Context context2 = Ji.f25747a;
            tn.p.k(runnable, "runnable");
            Ji.f25753g.submit(runnable);
        }
    }
}
