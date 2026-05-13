package s6;

import androidx.annotation.Nullable;
import s6.i0;

/* JADX INFO: compiled from: DtsReader.java */
/* JADX INFO: loaded from: classes11.dex */
public final class k implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f79227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f79228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i6.b0 f79229d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f79231f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f79232g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f79233h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.google.android.exoplayer2.m f79234i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f79235j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s7.a0 f79226a = new s7.a0(new byte[18]);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f79230e = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f79236k = -9223372036854775807L;

    public k(@Nullable String str) {
        this.f79227b = str;
    }

    @Override // s6.m
    public void a(s7.a0 a0Var) {
        s7.a.i(this.f79229d);
        while (a0Var.a() > 0) {
            int i10 = this.f79230e;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException();
                    }
                    int iMin = Math.min(a0Var.a(), this.f79235j - this.f79231f);
                    this.f79229d.e(a0Var, iMin);
                    int i11 = this.f79231f + iMin;
                    this.f79231f = i11;
                    int i12 = this.f79235j;
                    if (i11 == i12) {
                        long j10 = this.f79236k;
                        if (j10 != -9223372036854775807L) {
                            this.f79229d.c(j10, 1, i12, 0, null);
                            this.f79236k += this.f79233h;
                        }
                        this.f79230e = 0;
                    }
                } else if (c(a0Var, this.f79226a.d(), 18)) {
                    d();
                    this.f79226a.P(0);
                    this.f79229d.e(this.f79226a, 18);
                    this.f79230e = 2;
                }
            } else if (e(a0Var)) {
                this.f79230e = 1;
            }
        }
    }

    @Override // s6.m
    public void b(i6.m mVar, i0.d dVar) {
        dVar.a();
        this.f79228c = dVar.b();
        this.f79229d = mVar.track(dVar.c(), 1);
    }

    public final boolean c(s7.a0 a0Var, byte[] bArr, int i10) {
        int iMin = Math.min(a0Var.a(), i10 - this.f79231f);
        a0Var.j(bArr, this.f79231f, iMin);
        int i11 = this.f79231f + iMin;
        this.f79231f = i11;
        return i11 == i10;
    }

    public final void d() {
        byte[] bArrD = this.f79226a.d();
        if (this.f79234i == null) {
            com.google.android.exoplayer2.m mVarG = f6.t.g(bArrD, this.f79228c, this.f79227b, null);
            this.f79234i = mVarG;
            this.f79229d.b(mVarG);
        }
        this.f79235j = f6.t.a(bArrD);
        this.f79233h = (int) ((((long) f6.t.f(bArrD)) * 1000000) / ((long) this.f79234i.A));
    }

    public final boolean e(s7.a0 a0Var) {
        while (a0Var.a() > 0) {
            int i10 = this.f79232g << 8;
            this.f79232g = i10;
            int iD = i10 | a0Var.D();
            this.f79232g = iD;
            if (f6.t.d(iD)) {
                byte[] bArrD = this.f79226a.d();
                int i11 = this.f79232g;
                bArrD[0] = (byte) ((i11 >> 24) & 255);
                bArrD[1] = (byte) ((i11 >> 16) & 255);
                bArrD[2] = (byte) ((i11 >> 8) & 255);
                bArrD[3] = (byte) (i11 & 255);
                this.f79231f = 4;
                this.f79232g = 0;
                return true;
            }
        }
        return false;
    }

    @Override // s6.m
    public void packetFinished() {
    }

    @Override // s6.m
    public void packetStarted(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f79236k = j10;
        }
    }

    @Override // s6.m
    public void seek() {
        this.f79230e = 0;
        this.f79231f = 0;
        this.f79232g = 0;
        this.f79236k = -9223372036854775807L;
    }
}
