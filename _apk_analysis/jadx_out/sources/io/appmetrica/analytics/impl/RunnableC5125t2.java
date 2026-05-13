package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.t2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class RunnableC5125t2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f67712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f67713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C5150u2 f67714c;

    public RunnableC5125t2(C5150u2 c5150u2, Context context, Intent intent) {
        this.f67714c = c5150u2;
        this.f67712a = context;
        this.f67713b = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f67714c.f67766a.consume(this.f67712a, this.f67713b);
    }
}
