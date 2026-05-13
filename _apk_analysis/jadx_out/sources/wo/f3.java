package wo;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class f3 extends m2<bn.i, bn.j, e3> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final f3 f86510c = new f3();

    public f3() {
        super(to.a.u(bn.i.f5614c));
    }

    @Override // wo.a
    public /* bridge */ /* synthetic */ int f(Object obj) {
        return u(((bn.j) obj).v());
    }

    @Override // wo.a
    public /* bridge */ /* synthetic */ Object l(Object obj) {
        return x(((bn.j) obj).v());
    }

    @Override // wo.m2
    public /* bridge */ /* synthetic */ bn.j r() {
        return bn.j.a(v());
    }

    @Override // wo.m2
    public /* bridge */ /* synthetic */ void t(vo.d dVar, bn.j jVar, int i10) {
        y(dVar, jVar.v(), i10);
    }

    public int u(@NotNull byte[] bArr) {
        tn.p.k(bArr, "$this$collectionSize");
        return bn.j.p(bArr);
    }

    @NotNull
    public byte[] v() {
        return bn.j.f(0);
    }

    @Override // wo.v, wo.a
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void i(@NotNull vo.c cVar, int i10, @NotNull e3 e3Var, boolean z10) {
        tn.p.k(cVar, "decoder");
        tn.p.k(e3Var, "builder");
        e3Var.e(bn.i.b(cVar.m(getDescriptor(), i10).I()));
    }

    @NotNull
    public e3 x(@NotNull byte[] bArr) {
        tn.p.k(bArr, "$this$toBuilder");
        return new e3(bArr, null);
    }

    public void y(@NotNull vo.d dVar, @NotNull byte[] bArr, int i10) {
        tn.p.k(dVar, "encoder");
        tn.p.k(bArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            dVar.x(getDescriptor(), i11).e(bn.j.n(bArr, i11));
        }
    }
}
