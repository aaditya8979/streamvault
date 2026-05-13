package wo;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class u0 extends m2<Integer, int[], t0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final u0 f86622c = new u0();

    public u0() {
        super(to.a.G(tn.o.f85360a));
    }

    @Override // wo.a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public int f(@NotNull int[] iArr) {
        tn.p.k(iArr, "<this>");
        return iArr.length;
    }

    @Override // wo.m2
    @NotNull
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public int[] r() {
        return new int[0];
    }

    @Override // wo.v, wo.a
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void i(@NotNull vo.c cVar, int i10, @NotNull t0 t0Var, boolean z10) {
        tn.p.k(cVar, "decoder");
        tn.p.k(t0Var, "builder");
        t0Var.e(cVar.g(getDescriptor(), i10));
    }

    @Override // wo.a
    @NotNull
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public t0 l(@NotNull int[] iArr) {
        tn.p.k(iArr, "<this>");
        return new t0(iArr);
    }

    @Override // wo.m2
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void t(@NotNull vo.d dVar, @NotNull int[] iArr, int i10) {
        tn.p.k(dVar, "encoder");
        tn.p.k(iArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            dVar.o(getDescriptor(), i11, iArr[i11]);
        }
    }
}
