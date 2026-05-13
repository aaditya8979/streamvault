package yads;

import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes9.dex */
public final class ig3 extends wn.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jg3 f90835a;

    /* JADX WARN: Illegal instructions before constructor call */
    public ig3(jg3 jg3Var) {
        hg3 hg3Var = hg3.f90401b;
        this.f90835a = jg3Var;
        super(hg3Var);
    }

    @Override // wn.b
    public final void afterChange(KProperty kProperty, Object obj, Object obj2) {
        tn.p.k(kProperty, "property");
        this.f90835a.f91224a.add((hg3) obj2);
    }
}
