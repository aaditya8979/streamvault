package wo;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class o3 extends m2<bn.p, bn.q, n3> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final o3 f86581c = new o3();

    public o3() {
        super(to.a.x(bn.p.f5630c));
    }

    @Override // wo.a
    public /* bridge */ /* synthetic */ int f(Object obj) {
        return u(((bn.q) obj).v());
    }

    @Override // wo.a
    public /* bridge */ /* synthetic */ Object l(Object obj) {
        return x(((bn.q) obj).v());
    }

    @Override // wo.m2
    public /* bridge */ /* synthetic */ bn.q r() {
        return bn.q.a(v());
    }

    @Override // wo.m2
    public /* bridge */ /* synthetic */ void t(vo.d dVar, bn.q qVar, int i10) {
        y(dVar, qVar.v(), i10);
    }

    public int u(@NotNull short[] sArr) {
        tn.p.k(sArr, "$this$collectionSize");
        return bn.q.p(sArr);
    }

    @NotNull
    public short[] v() {
        return bn.q.f(0);
    }

    @Override // wo.v, wo.a
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void i(@NotNull vo.c cVar, int i10, @NotNull n3 n3Var, boolean z10) {
        tn.p.k(cVar, "decoder");
        tn.p.k(n3Var, "builder");
        n3Var.e(bn.p.b(cVar.m(getDescriptor(), i10).n()));
    }

    @NotNull
    public n3 x(@NotNull short[] sArr) {
        tn.p.k(sArr, "$this$toBuilder");
        return new n3(sArr, null);
    }

    public void y(@NotNull vo.d dVar, @NotNull short[] sArr, int i10) {
        tn.p.k(dVar, "encoder");
        tn.p.k(sArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            dVar.x(getDescriptor(), i11).l(bn.q.n(sArr, i11));
        }
    }
}
