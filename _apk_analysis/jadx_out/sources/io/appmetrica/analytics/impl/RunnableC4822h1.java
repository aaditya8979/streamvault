package io.appmetrica.analytics.impl;

import android.app.Activity;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.h1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class RunnableC4822h1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f66884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5149u1 f66885b;

    public RunnableC4822h1(C5149u1 c5149u1, Activity activity) {
        this.f66885b = c5149u1;
        this.f66884a = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5149u1 c5149u1 = this.f66885b;
        Xk xk2 = c5149u1.f67765h;
        Activity activity = this.f66884a;
        Ja ja2 = c5149u1.d().f67119a;
        if (activity != null) {
            xk2.f66187f.a(activity);
        }
        if (xk2.f66186e.a(activity, EnumC5023p.RESUMED)) {
            ja2.a(activity);
        }
    }
}
