package com.inmobi.media;

import android.os.SystemClock;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3319c0 f26568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3571m0 f26569b;

    public X(C3319c0 c3319c0, C3571m0 c3571m0) {
        tn.p.k(c3319c0, "adLifecycleData");
        tn.p.k(c3571m0, "adManagerTelemetryHelper");
        this.f26568a = c3319c0;
        this.f26569b = c3571m0;
    }

    public final void a(W w10) {
        tn.p.k(w10, "adFetchEvent");
        if (w10 instanceof C3433gb) {
            C3319c0 c3319c0 = this.f26568a;
            c3319c0.getClass();
            c3319c0.f26899b = SystemClock.elapsedRealtime();
        } else if (w10 instanceof If) {
            C3319c0 c3319c02 = this.f26568a;
            c3319c02.getClass();
            c3319c02.f26903f = SystemClock.elapsedRealtime();
        } else {
            if (!(w10 instanceof Oi)) {
                throw new NoWhenBranchMatchedException();
            }
            C3571m0 c3571m0 = this.f26569b;
            Map map = ((Oi) w10).f26094a;
            c3571m0.getClass();
            tn.p.k(map, "payload");
            p000do.i.d(c3571m0.f27589a, null, null, new C3521k0(c3571m0, map, null), 3, null);
        }
    }
}
