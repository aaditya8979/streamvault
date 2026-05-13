package yads;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class ju1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static ju1 f91373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f91374c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cn.m f91375a = new cn.m();

    public final void a() {
        synchronized (f91374c) {
            this.f91375a.clear();
            bn.r rVar = bn.r.f5635a;
        }
    }

    public final List b() {
        List listG1;
        synchronized (f91374c) {
            listG1 = cn.f0.g1(this.f91375a);
        }
        return listG1;
    }
}
