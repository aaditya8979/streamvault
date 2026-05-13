package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class m33 implements nq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nq0 f92238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f92239b;

    public m33(ld0 ld0Var, long j10) {
        this.f92238a = ld0Var;
        ni.a(ld0Var.a() >= j10);
        this.f92239b = j10;
    }

    @Override // yads.nq0
    public final long a() {
        return this.f92238a.a() - this.f92239b;
    }

    @Override // yads.nq0
    public final void a(int i10) {
        this.f92238a.a(i10);
    }

    @Override // yads.nq0
    public final void a(byte[] bArr, int i10, int i11) {
        this.f92238a.a(bArr, i10, i11);
    }

    @Override // yads.nq0
    public final boolean a(byte[] bArr, int i10, int i11, boolean z10) {
        return this.f92238a.a(bArr, i10, i11, z10);
    }

    @Override // yads.nq0
    public final void b() {
        this.f92238a.b();
    }

    @Override // yads.nq0
    public final void b(int i10) {
        this.f92238a.b(i10);
    }

    @Override // yads.nq0
    public final boolean b(byte[] bArr, int i10, int i11, boolean z10) {
        return this.f92238a.b(bArr, i10, i11, z10);
    }

    @Override // yads.nq0
    public final long c() {
        return this.f92238a.c() - this.f92239b;
    }

    @Override // yads.nq0
    public final long getLength() {
        return this.f92238a.getLength() - this.f92239b;
    }

    @Override // yads.l30
    public final int read(byte[] bArr, int i10, int i11) {
        return this.f92238a.read(bArr, i10, i11);
    }

    @Override // yads.nq0
    public final void readFully(byte[] bArr, int i10, int i11) {
        this.f92238a.readFully(bArr, i10, i11);
    }
}
