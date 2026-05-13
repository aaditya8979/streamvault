package io.appmetrica.analytics.impl;

import android.content.Intent;

/* JADX INFO: loaded from: classes5.dex */
public final class O0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f65676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5149u1 f65677b;

    public O0(C5149u1 c5149u1, Intent intent) {
        this.f65677b = c5149u1;
        this.f65676a = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5280z7 c5280z7 = this.f65677b.d().f67120b;
        Intent intent = this.f65676a;
        c5280z7.getClass();
        if (intent != null) {
            c5280z7.a(intent.getDataString(), false);
        }
    }
}
