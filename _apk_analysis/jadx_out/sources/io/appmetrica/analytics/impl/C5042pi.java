package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.HashMap;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.pi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5042pi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f67533a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5273z0 f67534b;

    public C5042pi(C5273z0 c5273z0) {
        this.f67534b = c5273z0;
    }

    public static C5042pi a() {
        return AbstractC5017oi.f67464a;
    }

    public final C4839hi a(Context context, String str) {
        C4839hi c4839hi = (C4839hi) this.f67533a.get(str);
        if (c4839hi == null) {
            synchronized (this.f67533a) {
                c4839hi = (C4839hi) this.f67533a.get(str);
                if (c4839hi == null) {
                    IHandlerExecutor iHandlerExecutorA = C4696c4.l().f66453c.a();
                    this.f67534b.getClass();
                    if (C5248y0.f67995e == null) {
                        ((A9) iHandlerExecutorA).f64970b.post(new RunnableC4992ni(this, context));
                    }
                    c4839hi = new C4839hi(context.getApplicationContext(), str, new C5273z0());
                    this.f67533a.put(str, c4839hi);
                    c4839hi.d(str);
                }
            }
        }
        return c4839hi;
    }
}
