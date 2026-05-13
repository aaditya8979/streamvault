package wo;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class a0 extends m2<Double, double[], z> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a0 f86473c = new a0();

    public a0() {
        super(to.a.E(tn.j.f85358a));
    }

    @Override // wo.a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public int f(@NotNull double[] dArr) {
        tn.p.k(dArr, "<this>");
        return dArr.length;
    }

    @Override // wo.m2
    @NotNull
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public double[] r() {
        return new double[0];
    }

    @Override // wo.v, wo.a
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void i(@NotNull vo.c cVar, int i10, @NotNull z zVar, boolean z10) {
        tn.p.k(cVar, "decoder");
        tn.p.k(zVar, "builder");
        zVar.e(cVar.H(getDescriptor(), i10));
    }

    @Override // wo.a
    @NotNull
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public z l(@NotNull double[] dArr) {
        tn.p.k(dArr, "<this>");
        return new z(dArr);
    }

    @Override // wo.m2
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void t(@NotNull vo.d dVar, @NotNull double[] dArr, int i10) {
        tn.p.k(dVar, "encoder");
        tn.p.k(dArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            dVar.H(getDescriptor(), i11, dArr[i11]);
        }
    }
}
