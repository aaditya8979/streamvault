package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.impl.C4745e2;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.e2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4745e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4833hc f66644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ICommonExecutor f66645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f66646c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f66647d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Runnable f66648e = new Runnable() { // from class: mh.e0
        @Override // java.lang.Runnable
        public final void run() {
            C4745e2.a(this.f74262b);
        }
    };

    public C4745e2(C4833hc c4833hc, IHandlerExecutor iHandlerExecutor, long j10) {
        this.f66644a = c4833hc;
        this.f66645b = iHandlerExecutor;
        this.f66646c = j10;
    }

    public static final void a(C4745e2 c4745e2) {
        C4859ic c4859ic = c4745e2.f66644a.f66915a;
        C5241xi c5241xi = c4859ic.f65399h;
        c5241xi.f67955c.a(c4859ic.f65393b.f65349a);
    }
}
