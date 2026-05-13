package wo;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class l3 extends m2<bn.m, bn.n, k3> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final l3 f86569c = new l3();

    public l3() {
        super(to.a.w(bn.m.f5624c));
    }

    @Override // wo.a
    public /* bridge */ /* synthetic */ int f(Object obj) {
        return u(((bn.n) obj).v());
    }

    @Override // wo.a
    public /* bridge */ /* synthetic */ Object l(Object obj) {
        return x(((bn.n) obj).v());
    }

    @Override // wo.m2
    public /* bridge */ /* synthetic */ bn.n r() {
        return bn.n.a(v());
    }

    @Override // wo.m2
    public /* bridge */ /* synthetic */ void t(vo.d dVar, bn.n nVar, int i10) {
        y(dVar, nVar.v(), i10);
    }

    public int u(@NotNull long[] jArr) {
        tn.p.k(jArr, "$this$collectionSize");
        return bn.n.p(jArr);
    }

    @NotNull
    public long[] v() {
        return bn.n.f(0);
    }

    @Override // wo.v, wo.a
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void i(@NotNull vo.c cVar, int i10, @NotNull k3 k3Var, boolean z10) {
        tn.p.k(cVar, "decoder");
        tn.p.k(k3Var, "builder");
        k3Var.e(bn.m.b(cVar.m(getDescriptor(), i10).j()));
    }

    @NotNull
    public k3 x(@NotNull long[] jArr) {
        tn.p.k(jArr, "$this$toBuilder");
        return new k3(jArr, null);
    }

    public void y(@NotNull vo.d dVar, @NotNull long[] jArr, int i10) {
        tn.p.k(dVar, "encoder");
        tn.p.k(jArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            dVar.x(getDescriptor(), i11).B(bn.n.n(jArr, i11));
        }
    }
}
