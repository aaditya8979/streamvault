package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class Il {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5059qa f65376a = new C5059qa();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f65377b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C4817gm f65378c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Gl f65379d = new Gl(this);

    public static final Il a() {
        return Hl.f65338a;
    }

    public final Bm a(Context context, R4 r42, C4662am c4662am) {
        Bm bm2 = (Bm) this.f65377b.get(r42.f65831a);
        boolean z10 = true;
        if (bm2 == null) {
            synchronized (this.f65377b) {
                bm2 = (Bm) this.f65377b.get(r42.f65831a);
                if (bm2 == null) {
                    Bm bm3 = new Bm(new Cm(context, r42.f65831a, c4662am, this.f65379d));
                    bm3.f();
                    this.f65377b.put(r42.f65831a, bm3);
                    z10 = false;
                    bm2 = bm3;
                }
            }
        }
        if (z10) {
            bm2.a(c4662am);
        }
        return bm2;
    }

    public final void a(R4 r42, Rl rl2) {
        synchronized (this.f65377b) {
            this.f65376a.a(r42.f65831a, rl2);
            C4817gm c4817gm = this.f65378c;
            if (c4817gm != null) {
                rl2.a(c4817gm);
            }
        }
    }
}
