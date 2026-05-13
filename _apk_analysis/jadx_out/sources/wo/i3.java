package wo;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class i3 extends m2<bn.k, bn.l, h3> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final i3 f86545c = new i3();

    public i3() {
        super(to.a.v(bn.k.f5619c));
    }

    @Override // wo.a
    public /* bridge */ /* synthetic */ int f(Object obj) {
        return u(((bn.l) obj).v());
    }

    @Override // wo.a
    public /* bridge */ /* synthetic */ Object l(Object obj) {
        return x(((bn.l) obj).v());
    }

    @Override // wo.m2
    public /* bridge */ /* synthetic */ bn.l r() {
        return bn.l.a(v());
    }

    @Override // wo.m2
    public /* bridge */ /* synthetic */ void t(vo.d dVar, bn.l lVar, int i10) {
        y(dVar, lVar.v(), i10);
    }

    public int u(@NotNull int[] iArr) {
        tn.p.k(iArr, "$this$collectionSize");
        return bn.l.p(iArr);
    }

    @NotNull
    public int[] v() {
        return bn.l.f(0);
    }

    @Override // wo.v, wo.a
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void i(@NotNull vo.c cVar, int i10, @NotNull h3 h3Var, boolean z10) {
        tn.p.k(cVar, "decoder");
        tn.p.k(h3Var, "builder");
        h3Var.e(bn.k.b(cVar.m(getDescriptor(), i10).u()));
    }

    @NotNull
    public h3 x(@NotNull int[] iArr) {
        tn.p.k(iArr, "$this$toBuilder");
        return new h3(iArr, null);
    }

    public void y(@NotNull vo.d dVar, @NotNull int[] iArr, int i10) {
        tn.p.k(dVar, "encoder");
        tn.p.k(iArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            dVar.x(getDescriptor(), i11).t(bn.l.n(iArr, i11));
        }
    }
}
