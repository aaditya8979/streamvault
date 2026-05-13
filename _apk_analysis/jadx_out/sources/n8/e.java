package n8;

/* JADX INFO: compiled from: SimpleToken.java */
/* JADX INFO: loaded from: classes6.dex */
public final class e extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final short f75269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final short f75270d;

    public e(g gVar, int i10, int i11) {
        super(gVar);
        this.f75269c = (short) i10;
        this.f75270d = (short) i11;
    }

    @Override // n8.g
    public void c(o8.a aVar, byte[] bArr) {
        aVar.c(this.f75269c, this.f75270d);
    }

    public String toString() {
        short s10 = this.f75269c;
        short s11 = this.f75270d;
        return "<" + Integer.toBinaryString((s10 & ((1 << s11) - 1)) | (1 << s11) | (1 << this.f75270d)).substring(1) + '>';
    }
}
