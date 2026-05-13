package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class z83 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f97425a = new byte[10];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f97426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f97427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f97428d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f97429e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f97430f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f97431g;

    public final void a(m73 m73Var, long j10, int i10, int i11, int i12, l73 l73Var) {
        if (!(this.f97431g <= i11 + i12)) {
            throw new IllegalStateException("TrueHD chunk samples must be contiguous in the sample queue.");
        }
        if (this.f97426b) {
            int i13 = this.f97427c;
            int i14 = i13 + 1;
            this.f97427c = i14;
            if (i13 == 0) {
                this.f97428d = j10;
                this.f97429e = i10;
                this.f97430f = 0;
            }
            int i15 = this.f97430f + i11;
            this.f97430f = i15;
            this.f97431g = i12;
            if (i14 < 16 || i14 <= 0) {
                return;
            }
            m73Var.a(this.f97428d, this.f97429e, i15, i12, l73Var);
            this.f97427c = 0;
        }
    }

    public final void a(nq0 nq0Var) {
        if (this.f97426b) {
            return;
        }
        nq0Var.a(this.f97425a, 0, 10);
        nq0Var.b();
        byte[] bArr = this.f97425a;
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b10 = bArr[7];
            if ((b10 & 254) != 186) {
                return;
            }
            if ((40 << ((bArr[(b10 & 255) == 187 ? '\t' : '\b'] >> 4) & 7)) == 0) {
                return;
            }
            this.f97426b = true;
        }
    }
}
