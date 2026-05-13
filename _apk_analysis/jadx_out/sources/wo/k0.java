package wo;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class k0 extends m2<Float, float[], j0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final k0 f86558c = new k0();

    public k0() {
        super(to.a.F(tn.k.f85359a));
    }

    @Override // wo.a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public int f(@NotNull float[] fArr) {
        tn.p.k(fArr, "<this>");
        return fArr.length;
    }

    @Override // wo.m2
    @NotNull
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public float[] r() {
        return new float[0];
    }

    @Override // wo.v, wo.a
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void i(@NotNull vo.c cVar, int i10, @NotNull j0 j0Var, boolean z10) {
        tn.p.k(cVar, "decoder");
        tn.p.k(j0Var, "builder");
        j0Var.e(cVar.z(getDescriptor(), i10));
    }

    @Override // wo.a
    @NotNull
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public j0 l(@NotNull float[] fArr) {
        tn.p.k(fArr, "<this>");
        return new j0(fArr);
    }

    @Override // wo.m2
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void t(@NotNull vo.d dVar, @NotNull float[] fArr, int i10) {
        tn.p.k(dVar, "encoder");
        tn.p.k(fArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            dVar.D(getDescriptor(), i11, fArr[i11]);
        }
    }
}
