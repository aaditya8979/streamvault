package s6;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.m;
import f6.b;
import s6.i0;
import s7.m0;

/* JADX INFO: compiled from: Ac3Reader.java */
/* JADX INFO: loaded from: classes11.dex */
public final class c implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s7.z f79100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s7.a0 f79101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f79102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f79103d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public i6.b0 f79104e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f79105f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f79106g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f79107h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f79108i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public com.google.android.exoplayer2.m f79109j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f79110k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f79111l;

    public c() {
        this(null);
    }

    public c(@Nullable String str) {
        s7.z zVar = new s7.z(new byte[128]);
        this.f79100a = zVar;
        this.f79101b = new s7.a0(zVar.f79571a);
        this.f79105f = 0;
        this.f79111l = -9223372036854775807L;
        this.f79102c = str;
    }

    @Override // s6.m
    public void a(s7.a0 a0Var) {
        s7.a.i(this.f79104e);
        while (a0Var.a() > 0) {
            int i10 = this.f79105f;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int iMin = Math.min(a0Var.a(), this.f79110k - this.f79106g);
                        this.f79104e.e(a0Var, iMin);
                        int i11 = this.f79106g + iMin;
                        this.f79106g = i11;
                        int i12 = this.f79110k;
                        if (i11 == i12) {
                            long j10 = this.f79111l;
                            if (j10 != -9223372036854775807L) {
                                this.f79104e.c(j10, 1, i12, 0, null);
                                this.f79111l += this.f79108i;
                            }
                            this.f79105f = 0;
                        }
                    }
                } else if (c(a0Var, this.f79101b.d(), 128)) {
                    d();
                    this.f79101b.P(0);
                    this.f79104e.e(this.f79101b, 128);
                    this.f79105f = 2;
                }
            } else if (e(a0Var)) {
                this.f79105f = 1;
                this.f79101b.d()[0] = 11;
                this.f79101b.d()[1] = 119;
                this.f79106g = 2;
            }
        }
    }

    @Override // s6.m
    public void b(i6.m mVar, i0.d dVar) {
        dVar.a();
        this.f79103d = dVar.b();
        this.f79104e = mVar.track(dVar.c(), 1);
    }

    public final boolean c(s7.a0 a0Var, byte[] bArr, int i10) {
        int iMin = Math.min(a0Var.a(), i10 - this.f79106g);
        a0Var.j(bArr, this.f79106g, iMin);
        int i11 = this.f79106g + iMin;
        this.f79106g = i11;
        return i11 == i10;
    }

    public final void d() {
        this.f79100a.p(0);
        b.C0762b c0762bE = f6.b.e(this.f79100a);
        com.google.android.exoplayer2.m mVar = this.f79109j;
        if (mVar == null || c0762bE.f61484d != mVar.f21764z || c0762bE.f61483c != mVar.A || !m0.c(c0762bE.f61481a, mVar.f21751m)) {
            com.google.android.exoplayer2.m mVarE = new m.b().S(this.f79103d).e0(c0762bE.f61481a).H(c0762bE.f61484d).f0(c0762bE.f61483c).V(this.f79102c).E();
            this.f79109j = mVarE;
            this.f79104e.b(mVarE);
        }
        this.f79110k = c0762bE.f61485e;
        this.f79108i = (((long) c0762bE.f61486f) * 1000000) / ((long) this.f79109j.A);
    }

    public final boolean e(s7.a0 a0Var) {
        while (true) {
            if (a0Var.a() <= 0) {
                return false;
            }
            if (this.f79107h) {
                int iD = a0Var.D();
                if (iD == 119) {
                    this.f79107h = false;
                    return true;
                }
                this.f79107h = iD == 11;
            } else {
                this.f79107h = a0Var.D() == 11;
            }
        }
    }

    @Override // s6.m
    public void packetFinished() {
    }

    @Override // s6.m
    public void packetStarted(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f79111l = j10;
        }
    }

    @Override // s6.m
    public void seek() {
        this.f79105f = 0;
        this.f79106g = 0;
        this.f79107h = false;
        this.f79111l = -9223372036854775807L;
    }
}
