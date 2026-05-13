package wo;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class h extends m2<Boolean, boolean[], g> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final h f86531c = new h();

    public h() {
        super(to.a.B(tn.c.f85347a));
    }

    @Override // wo.a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public int f(@NotNull boolean[] zArr) {
        tn.p.k(zArr, "<this>");
        return zArr.length;
    }

    @Override // wo.m2
    @NotNull
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public boolean[] r() {
        return new boolean[0];
    }

    @Override // wo.v, wo.a
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void i(@NotNull vo.c cVar, int i10, @NotNull g gVar, boolean z10) {
        tn.p.k(cVar, "decoder");
        tn.p.k(gVar, "builder");
        gVar.e(cVar.E(getDescriptor(), i10));
    }

    @Override // wo.a
    @NotNull
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public g l(@NotNull boolean[] zArr) {
        tn.p.k(zArr, "<this>");
        return new g(zArr);
    }

    @Override // wo.m2
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void t(@NotNull vo.d dVar, @NotNull boolean[] zArr, int i10) {
        tn.p.k(dVar, "encoder");
        tn.p.k(zArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            dVar.p(getDescriptor(), i11, zArr[i11]);
        }
    }
}
