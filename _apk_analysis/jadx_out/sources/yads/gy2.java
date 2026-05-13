package yads;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class gy2 extends g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Iterator f90154d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hy2 f90155e;

    public gy2(hy2 hy2Var) {
        this.f90155e = hy2Var;
        this.f90154d = hy2Var.f90596b.iterator();
    }

    @Override // yads.g
    public final Object a() {
        while (this.f90154d.hasNext()) {
            Object next = this.f90154d.next();
            if (this.f90155e.f90597c.contains(next)) {
                return next;
            }
        }
        this.f89741b = 3;
        return null;
    }
}
