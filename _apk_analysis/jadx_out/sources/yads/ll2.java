package yads;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ll2 implements qf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yj3 f92025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f92026b = cn.w.s(new kl2(xj3.f96792b, 0.25f), new kl2(xj3.f96793c, 0.5f), new kl2(xj3.f96794d, 0.75f));

    public ll2(zj3 zj3Var) {
        this.f92025a = zj3Var;
    }

    @Override // yads.qf3
    public final void a(long j10, long j11) {
        if (j10 != 0) {
            Iterator it = this.f92026b.iterator();
            while (it.hasNext()) {
                kl2 kl2Var = (kl2) it.next();
                if (kl2Var.f91650b * j10 <= j11) {
                    this.f92025a.a(kl2Var.f91649a);
                    it.remove();
                }
            }
        }
    }
}
