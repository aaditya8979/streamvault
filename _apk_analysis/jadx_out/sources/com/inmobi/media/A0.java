package com.inmobi.media;

import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.inmobi.adquality.models.AdQualityResult;
import com.inmobi.media.A0;
import com.inmobi.media.core.config.models.AdConfig;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public final class A0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f25125a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f25126b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f25127c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C3895z0 f25128d = new C3895z0(this);

    public A0() {
        Runnable runnable = new Runnable() { // from class: n9.a
            @Override // java.lang.Runnable
            public final void run() {
                A0.a(this.f75278b);
            }
        };
        Context context = Ji.f25747a;
        tn.p.k(runnable, "runnable");
        Ji.f25753g.submit(runnable);
    }

    public static void a(AdQualityResult adQualityResult) {
        tn.p.k(adQualityResult, "result");
        try {
            p000do.h.b(null, new C3845x0(adQualityResult, null), 1, null);
            if (adQualityResult.getImageLocation().length() == 0) {
                return;
            }
            new File(adQualityResult.getImageLocation()).delete();
        } catch (Exception unused) {
        }
    }

    public static final void a(A0 a02) {
        H0 h02 = (H0) E0.f25352a.getValue();
        C3895z0 c3895z0 = a02.f25128d;
        h02.getClass();
        tn.p.k(c3895z0, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        h02.f25563b = new WeakReference(c3895z0);
    }

    public static final bn.r b(A0 a02) {
        a02.f25125a.set(true);
        C3476i4 c3476i4 = Y3.f26611a;
        tn.p.k(AdConfig.class, "clazz");
        p000do.i.d(A9.f25147c, null, null, new C3870y0(a02, (AdConfig) Y3.f26611a.a(AdConfig.class), null), 3, null);
        return bn.r.f5635a;
    }

    public final void a() {
        AbstractC3344d.a(new sn.a() { // from class: n9.b
            @Override // sn.a
            public final Object invoke() {
                return A0.b(this.f75292b);
            }
        });
    }
}
