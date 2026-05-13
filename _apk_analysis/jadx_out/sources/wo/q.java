package wo;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class q extends m2<Character, char[], p> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final q f86590c = new q();

    public q() {
        super(to.a.D(tn.e.f85349a));
    }

    @Override // wo.a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public int f(@NotNull char[] cArr) {
        tn.p.k(cArr, "<this>");
        return cArr.length;
    }

    @Override // wo.m2
    @NotNull
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public char[] r() {
        return new char[0];
    }

    @Override // wo.v, wo.a
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void i(@NotNull vo.c cVar, int i10, @NotNull p pVar, boolean z10) {
        tn.p.k(cVar, "decoder");
        tn.p.k(pVar, "builder");
        pVar.e(cVar.r(getDescriptor(), i10));
    }

    @Override // wo.a
    @NotNull
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public p l(@NotNull char[] cArr) {
        tn.p.k(cArr, "<this>");
        return new p(cArr);
    }

    @Override // wo.m2
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void t(@NotNull vo.d dVar, @NotNull char[] cArr, int i10) {
        tn.p.k(dVar, "encoder");
        tn.p.k(cArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            dVar.j(getDescriptor(), i11, cArr[i11]);
        }
    }
}
