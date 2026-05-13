package io.appmetrica.analytics.impl;

import android.app.Activity;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.n1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class RunnableC4975n1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f67317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5149u1 f67318b;

    public RunnableC4975n1(C5149u1 c5149u1, Activity activity) {
        this.f67318b = c5149u1;
        this.f67317a = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5149u1 c5149u1 = this.f67318b;
        Xk xk2 = c5149u1.f67765h;
        Activity activity = this.f67317a;
        Ja ja2 = c5149u1.d().f67119a;
        if (activity != null) {
            xk2.f66187f.a(activity);
        }
        if (xk2.f66186e.a(activity, EnumC5023p.PAUSED)) {
            ja2.b(activity);
        }
    }
}
