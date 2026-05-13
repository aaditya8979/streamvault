package wo;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class u2 extends m2<Short, short[], t2> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final u2 f86624c = new u2();

    public u2() {
        super(to.a.I(tn.v.f85366a));
    }

    @Override // wo.a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public int f(@NotNull short[] sArr) {
        tn.p.k(sArr, "<this>");
        return sArr.length;
    }

    @Override // wo.m2
    @NotNull
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public short[] r() {
        return new short[0];
    }

    @Override // wo.v, wo.a
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void i(@NotNull vo.c cVar, int i10, @NotNull t2 t2Var, boolean z10) {
        tn.p.k(cVar, "decoder");
        tn.p.k(t2Var, "builder");
        t2Var.e(cVar.G(getDescriptor(), i10));
    }

    @Override // wo.a
    @NotNull
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public t2 l(@NotNull short[] sArr) {
        tn.p.k(sArr, "<this>");
        return new t2(sArr);
    }

    @Override // wo.m2
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void t(@NotNull vo.d dVar, @NotNull short[] sArr, int i10) {
        tn.p.k(dVar, "encoder");
        tn.p.k(sArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            dVar.u(getDescriptor(), i11, sArr[i11]);
        }
    }
}
