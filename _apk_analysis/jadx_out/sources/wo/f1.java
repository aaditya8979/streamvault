package wo;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class f1 extends m2<Long, long[], e1> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final f1 f86508c = new f1();

    public f1() {
        super(to.a.H(tn.r.f85361a));
    }

    @Override // wo.a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public int f(@NotNull long[] jArr) {
        tn.p.k(jArr, "<this>");
        return jArr.length;
    }

    @Override // wo.m2
    @NotNull
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public long[] r() {
        return new long[0];
    }

    @Override // wo.v, wo.a
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void i(@NotNull vo.c cVar, int i10, @NotNull e1 e1Var, boolean z10) {
        tn.p.k(cVar, "decoder");
        tn.p.k(e1Var, "builder");
        e1Var.e(cVar.f(getDescriptor(), i10));
    }

    @Override // wo.a
    @NotNull
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public e1 l(@NotNull long[] jArr) {
        tn.p.k(jArr, "<this>");
        return new e1(jArr);
    }

    @Override // wo.m2
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void t(@NotNull vo.d dVar, @NotNull long[] jArr, int i10) {
        tn.p.k(dVar, "encoder");
        tn.p.k(jArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            dVar.v(getDescriptor(), i11, jArr[i11]);
        }
    }
}
