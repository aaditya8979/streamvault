package wo;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class k extends m2<Byte, byte[], j> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final k f86557c = new k();

    public k() {
        super(to.a.C(tn.d.f85348a));
    }

    @Override // wo.a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public int f(@NotNull byte[] bArr) {
        tn.p.k(bArr, "<this>");
        return bArr.length;
    }

    @Override // wo.m2
    @NotNull
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public byte[] r() {
        return new byte[0];
    }

    @Override // wo.v, wo.a
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void i(@NotNull vo.c cVar, int i10, @NotNull j jVar, boolean z10) {
        tn.p.k(cVar, "decoder");
        tn.p.k(jVar, "builder");
        jVar.e(cVar.D(getDescriptor(), i10));
    }

    @Override // wo.a
    @NotNull
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public j l(@NotNull byte[] bArr) {
        tn.p.k(bArr, "<this>");
        return new j(bArr);
    }

    @Override // wo.m2
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void t(@NotNull vo.d dVar, @NotNull byte[] bArr, int i10) {
        tn.p.k(dVar, "encoder");
        tn.p.k(bArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            dVar.k(getDescriptor(), i11, bArr[i11]);
        }
    }
}
