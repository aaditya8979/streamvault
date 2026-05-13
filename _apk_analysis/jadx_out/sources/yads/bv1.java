package yads;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class bv1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static bv1 f88154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f88155c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cn.m f88156a = new cn.m();

    public final void a() {
        synchronized (f88155c) {
            this.f88156a.clear();
            bn.r rVar = bn.r.f5635a;
        }
    }

    public final void a(du1 du1Var, String str, String str2) {
        if (eu1.f89373a.a()) {
            zu1 zu1Var = new zu1(System.currentTimeMillis(), du1Var.name(), str, str2);
            synchronized (f88155c) {
                if (this.f88156a.size() > 5000) {
                    this.f88156a.removeFirst();
                }
                this.f88156a.add(zu1Var);
            }
        }
    }

    public final List b() {
        List listG1;
        synchronized (f88155c) {
            listG1 = cn.f0.g1(this.f88156a);
        }
        return listG1;
    }
}
