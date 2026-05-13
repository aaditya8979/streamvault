package yads;

import android.os.Handler;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import yads.y31;

/* JADX INFO: loaded from: classes12.dex */
public final class y31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k41 f96986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f96987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d51 f96988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f96989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicInteger f96990e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final js1 f96991f;

    public y31(k41 k41Var, Set set, d51 d51Var, Handler handler, AtomicInteger atomicInteger, js1 js1Var) {
        this.f96986a = k41Var;
        this.f96987b = set;
        this.f96988c = d51Var;
        this.f96989d = handler;
        this.f96990e = atomicInteger;
        this.f96991f = js1Var;
    }

    public static final void a(y31 y31Var, String str, int i10, int i11, Map map, u41 u41Var) {
        y31Var.f96986a.a(str, new x31(y31Var, map, u41Var), i10, i11);
    }

    public final void a() {
        final HashMap map = new HashMap();
        for (final u41 u41Var : this.f96987b) {
            final String str = u41Var.f95549c;
            final int i10 = u41Var.f95548b;
            final int i11 = u41Var.f95547a;
            boolean z10 = ad1.f87661a;
            if (a(u41Var)) {
                this.f96989d.post(new Runnable() { // from class: bt.rc
                    @Override // java.lang.Runnable
                    public final void run() {
                        y31.a(this.f6268b, str, i11, i10, map, u41Var);
                    }
                });
            } else {
                a(map);
            }
        }
    }

    public final void a(Map map) {
        if (this.f96990e.decrementAndGet() == 0) {
            this.f96988c.a(map);
        }
    }

    public final boolean a(u41 u41Var) {
        int iA = u41Var.a();
        int iB = u41Var.b();
        this.f96991f.getClass();
        if (js1.a() >= (iA * iB * 4) + 1048576.0f) {
            return true;
        }
        boolean z10 = ad1.f87661a;
        return false;
    }
}
