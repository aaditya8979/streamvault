package yads;

import java.util.Map;
import yads.zn3;

/* JADX INFO: loaded from: classes3.dex */
public final class zn3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hb2 f97729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wz2 f97730b = new wz2();

    public zn3(hb2 hb2Var) {
        this.f97729a = hb2Var;
    }

    public static final void a(zn3 zn3Var, Map map) {
        zn3Var.f97729a.setVisibility(0);
        boolean z10 = ad1.f87661a;
        hb2 hb2Var = zn3Var.f97729a;
        o11 o11Var = hb2Var.f90348g;
        if (o11Var != null) {
            o11Var.a(hb2Var, map);
        }
    }

    public final void a(final Map map) {
        wz2 wz2Var = this.f97730b;
        Runnable runnable = new Runnable() { // from class: bt.zd
            @Override // java.lang.Runnable
            public final void run() {
                zn3.a(this.f6453b, map);
            }
        };
        synchronized (wz2Var.f96568a) {
            if (wz2Var.f96569b) {
                return;
            }
            wz2Var.f96569b = true;
            bn.r rVar = bn.r.f5635a;
            runnable.run();
        }
    }
}
