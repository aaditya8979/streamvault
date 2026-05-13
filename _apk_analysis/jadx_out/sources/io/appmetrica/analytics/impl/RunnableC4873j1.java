package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.StartupParamsCallback;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.j1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class RunnableC4873j1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f67004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StartupParamsCallback f67005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f67006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C5149u1 f67007d;

    public RunnableC4873j1(C5149u1 c5149u1, Context context, StartupParamsCallback startupParamsCallback, List list) {
        this.f67007d = c5149u1;
        this.f67004a = context;
        this.f67005b = startupParamsCallback;
        this.f67006c = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5273z0 c5273z0 = this.f67007d.f67758a;
        Context applicationContext = this.f67004a.getApplicationContext();
        c5273z0.getClass();
        C5248y0 c5248y0A = C5248y0.a(applicationContext);
        c5248y0A.f().a(this.f67005b, this.f67006c);
    }
}
