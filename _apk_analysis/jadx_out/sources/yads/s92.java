package yads;

import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class s92 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f94733a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakHashMap f94734b = new WeakHashMap();

    public final void a(ld3 ld3Var) {
        synchronized (this.f94733a) {
            this.f94734b.put(ld3Var, null);
            bn.r rVar = bn.r.f5635a;
        }
    }

    public final boolean a() {
        boolean z10;
        synchronized (this.f94733a) {
            z10 = !this.f94734b.isEmpty();
        }
        return z10;
    }

    public final void b() {
        ArrayList<ld3> arrayList;
        synchronized (this.f94733a) {
            arrayList = new ArrayList(this.f94734b.keySet());
            this.f94734b.clear();
            bn.r rVar = bn.r.f5635a;
        }
        for (ld3 ld3Var : arrayList) {
            if (ld3Var != null) {
                ld3Var.a();
            }
        }
    }

    public final void b(ld3 ld3Var) {
        synchronized (this.f94733a) {
            this.f94734b.remove(ld3Var);
        }
    }
}
