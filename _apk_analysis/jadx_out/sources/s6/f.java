package s6;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.m;
import f6.c;
import s6.i0;

/* JADX INFO: compiled from: Ac4Reader.java */
/* JADX INFO: loaded from: classes11.dex */
public final class f implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s7.z f79128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s7.a0 f79129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f79130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f79131d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public i6.b0 f79132e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f79133f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f79134g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f79135h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f79136i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f79137j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public com.google.android.exoplayer2.m f79138k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f79139l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f79140m;

    public f() {
        this(null);
    }

    public f(@Nullable String str) {
        s7.z zVar = new s7.z(new byte[16]);
        this.f79128a = zVar;
        this.f79129b = new s7.a0(zVar.f79571a);
        this.f79133f = 0;
        this.f79134g = 0;
        this.f79135h = false;
        this.f79136i = false;
        this.f79140m = -9223372036854775807L;
        this.f79130c = str;
    }

    @Override // s6.m
    public void a(s7.a0 a0Var) {
        s7.a.i(this.f79132e);
        while (a0Var.a() > 0) {
            int i10 = this.f79133f;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int iMin = Math.min(a0Var.a(), this.f79139l - this.f79134g);
                        this.f79132e.e(a0Var, iMin);
                        int i11 = this.f79134g + iMin;
                        this.f79134g = i11;
                        int i12 = this.f79139l;
                        if (i11 == i12) {
                            long j10 = this.f79140m;
                            if (j10 != -9223372036854775807L) {
                                this.f79132e.c(j10, 1, i12, 0, null);
                                this.f79140m += this.f79137j;
                            }
                            this.f79133f = 0;
                        }
                    }
                } else if (c(a0Var, this.f79129b.d(), 16)) {
                    d();
                    this.f79129b.P(0);
                    this.f79132e.e(this.f79129b, 16);
                    this.f79133f = 2;
                }
            } else if (e(a0Var)) {
                this.f79133f = 1;
                this.f79129b.d()[0] = -84;
                this.f79129b.d()[1] = (byte) (this.f79136i ? 65 : 64);
                this.f79134g = 2;
            }
        }
    }

    @Override // s6.m
    public void b(i6.m mVar, i0.d dVar) {
        dVar.a();
        this.f79131d = dVar.b();
        this.f79132e = mVar.track(dVar.c(), 1);
    }

    public final boolean c(s7.a0 a0Var, byte[] bArr, int i10) {
        int iMin = Math.min(a0Var.a(), i10 - this.f79134g);
        a0Var.j(bArr, this.f79134g, iMin);
        int i11 = this.f79134g + iMin;
        this.f79134g = i11;
        return i11 == i10;
    }

    public final void d() {
        this.f79128a.p(0);
        c.b bVarD = f6.c.d(this.f79128a);
        com.google.android.exoplayer2.m mVar = this.f79138k;
        if (mVar == null || bVarD.f61490c != mVar.f21764z || bVarD.f61489b != mVar.A || !"audio/ac4".equals(mVar.f21751m)) {
            com.google.android.exoplayer2.m mVarE = new m.b().S(this.f79131d).e0("audio/ac4").H(bVarD.f61490c).f0(bVarD.f61489b).V(this.f79130c).E();
            this.f79138k = mVarE;
            this.f79132e.b(mVarE);
        }
        this.f79139l = bVarD.f61491d;
        this.f79137j = (((long) bVarD.f61492e) * 1000000) / ((long) this.f79138k.A);
    }

    public final boolean e(s7.a0 a0Var) {
        int iD;
        while (true) {
            if (a0Var.a() <= 0) {
                return false;
            }
            if (this.f79135h) {
                iD = a0Var.D();
                this.f79135h = iD == 172;
                if (iD == 64 || iD == 65) {
                    break;
                }
            } else {
                this.f79135h = a0Var.D() == 172;
            }
        }
        this.f79136i = iD == 65;
        return true;
    }

    @Override // s6.m
    public void packetFinished() {
    }

    @Override // s6.m
    public void packetStarted(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f79140m = j10;
        }
    }

    @Override // s6.m
    public void seek() {
        this.f79133f = 0;
        this.f79134g = 0;
        this.f79135h = false;
        this.f79136i = false;
        this.f79140m = -9223372036854775807L;
    }
}
