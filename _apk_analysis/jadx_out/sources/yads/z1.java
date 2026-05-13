package yads;

import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class z1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f97354b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile z1 f97355c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f97356a = new HashMap();

    public final x1 a(long j10) {
        x1 x1Var;
        synchronized (f97354b) {
            x1Var = (x1) this.f97356a.remove(Long.valueOf(j10));
        }
        return x1Var;
    }

    public final void a(long j10, x1 x1Var) {
        synchronized (f97354b) {
            this.f97356a.put(Long.valueOf(j10), x1Var);
            bn.r rVar = bn.r.f5635a;
        }
    }
}
