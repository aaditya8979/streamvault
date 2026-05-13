package s6;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.m;
import f6.a;
import java.util.Arrays;
import java.util.Collections;
import s6.i0;
import s7.m0;

/* JADX INFO: compiled from: AdtsReader.java */
/* JADX INFO: loaded from: classes11.dex */
public final class i implements m {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final byte[] f79190v = {73, 68, 51};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f79191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s7.z f79192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s7.a0 f79193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f79194d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f79195e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public i6.b0 f79196f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public i6.b0 f79197g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f79198h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f79199i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f79200j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f79201k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f79202l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f79203m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f79204n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f79205o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f79206p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f79207q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f79208r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f79209s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public i6.b0 f79210t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f79211u;

    public i(boolean z10) {
        this(z10, null);
    }

    public i(boolean z10, @Nullable String str) {
        this.f79192b = new s7.z(new byte[7]);
        this.f79193c = new s7.a0(Arrays.copyOf(f79190v, 10));
        p();
        this.f79203m = -1;
        this.f79204n = -1;
        this.f79207q = -9223372036854775807L;
        this.f79209s = -9223372036854775807L;
        this.f79191a = z10;
        this.f79194d = str;
    }

    public static boolean j(int i10) {
        return (i10 & 65526) == 65520;
    }

    @Override // s6.m
    public void a(s7.a0 a0Var) throws ParserException {
        c();
        while (a0Var.a() > 0) {
            int i10 = this.f79198h;
            if (i10 == 0) {
                g(a0Var);
            } else if (i10 == 1) {
                d(a0Var);
            } else if (i10 != 2) {
                if (i10 == 3) {
                    if (f(a0Var, this.f79192b.f79571a, this.f79201k ? 7 : 5)) {
                        k();
                    }
                } else {
                    if (i10 != 4) {
                        throw new IllegalStateException();
                    }
                    m(a0Var);
                }
            } else if (f(a0Var, this.f79193c.d(), 10)) {
                l();
            }
        }
    }

    @Override // s6.m
    public void b(i6.m mVar, i0.d dVar) {
        dVar.a();
        this.f79195e = dVar.b();
        i6.b0 b0VarTrack = mVar.track(dVar.c(), 1);
        this.f79196f = b0VarTrack;
        this.f79210t = b0VarTrack;
        if (!this.f79191a) {
            this.f79197g = new i6.j();
            return;
        }
        dVar.a();
        i6.b0 b0VarTrack2 = mVar.track(dVar.c(), 5);
        this.f79197g = b0VarTrack2;
        b0VarTrack2.b(new m.b().S(dVar.b()).e0("application/id3").E());
    }

    public final void c() {
        s7.a.e(this.f79196f);
        m0.j(this.f79210t);
        m0.j(this.f79197g);
    }

    public final void d(s7.a0 a0Var) {
        if (a0Var.a() == 0) {
            return;
        }
        this.f79192b.f79571a[0] = a0Var.d()[a0Var.e()];
        this.f79192b.p(2);
        int iH = this.f79192b.h(4);
        int i10 = this.f79204n;
        if (i10 != -1 && iH != i10) {
            n();
            return;
        }
        if (!this.f79202l) {
            this.f79202l = true;
            this.f79203m = this.f79205o;
            this.f79204n = iH;
        }
        q();
    }

    public final boolean e(s7.a0 a0Var, int i10) {
        a0Var.P(i10 + 1);
        if (!t(a0Var, this.f79192b.f79571a, 1)) {
            return false;
        }
        this.f79192b.p(4);
        int iH = this.f79192b.h(1);
        int i11 = this.f79203m;
        if (i11 != -1 && iH != i11) {
            return false;
        }
        if (this.f79204n != -1) {
            if (!t(a0Var, this.f79192b.f79571a, 1)) {
                return true;
            }
            this.f79192b.p(2);
            if (this.f79192b.h(4) != this.f79204n) {
                return false;
            }
            a0Var.P(i10 + 2);
        }
        if (!t(a0Var, this.f79192b.f79571a, 4)) {
            return true;
        }
        this.f79192b.p(14);
        int iH2 = this.f79192b.h(13);
        if (iH2 < 7) {
            return false;
        }
        byte[] bArrD = a0Var.d();
        int iF = a0Var.f();
        int i12 = i10 + iH2;
        if (i12 >= iF) {
            return true;
        }
        byte b10 = bArrD[i12];
        if (b10 == -1) {
            int i13 = i12 + 1;
            if (i13 == iF) {
                return true;
            }
            return i((byte) -1, bArrD[i13]) && ((bArrD[i13] & 8) >> 3) == iH;
        }
        if (b10 != 73) {
            return false;
        }
        int i14 = i12 + 1;
        if (i14 == iF) {
            return true;
        }
        if (bArrD[i14] != 68) {
            return false;
        }
        int i15 = i12 + 2;
        return i15 == iF || bArrD[i15] == 51;
    }

    public final boolean f(s7.a0 a0Var, byte[] bArr, int i10) {
        int iMin = Math.min(a0Var.a(), i10 - this.f79199i);
        a0Var.j(bArr, this.f79199i, iMin);
        int i11 = this.f79199i + iMin;
        this.f79199i = i11;
        return i11 == i10;
    }

    public final void g(s7.a0 a0Var) {
        byte[] bArrD = a0Var.d();
        int iE = a0Var.e();
        int iF = a0Var.f();
        while (iE < iF) {
            int i10 = iE + 1;
            int i11 = bArrD[iE] & 255;
            if (this.f79200j == 512 && i((byte) -1, (byte) i11) && (this.f79202l || e(a0Var, i10 - 2))) {
                this.f79205o = (i11 & 8) >> 3;
                this.f79201k = (i11 & 1) == 0;
                if (this.f79202l) {
                    q();
                } else {
                    o();
                }
                a0Var.P(i10);
                return;
            }
            int i12 = this.f79200j;
            int i13 = i11 | i12;
            if (i13 == 329) {
                this.f79200j = 768;
            } else if (i13 == 511) {
                this.f79200j = 512;
            } else if (i13 == 836) {
                this.f79200j = 1024;
            } else if (i13 == 1075) {
                r();
                a0Var.P(i10);
                return;
            } else if (i12 != 256) {
                this.f79200j = 256;
                i10--;
            }
            iE = i10;
        }
        a0Var.P(iE);
    }

    public long h() {
        return this.f79207q;
    }

    public final boolean i(byte b10, byte b11) {
        return j(((b10 & 255) << 8) | (b11 & 255));
    }

    public final void k() throws ParserException {
        this.f79192b.p(0);
        if (this.f79206p) {
            this.f79192b.r(10);
        } else {
            int iH = this.f79192b.h(2) + 1;
            if (iH != 2) {
                s7.q.i("AdtsReader", "Detected audio object type: " + iH + ", but assuming AAC LC.");
                iH = 2;
            }
            this.f79192b.r(5);
            byte[] bArrA = f6.a.a(iH, this.f79204n, this.f79192b.h(3));
            a.b bVarE = f6.a.e(bArrA);
            com.google.android.exoplayer2.m mVarE = new m.b().S(this.f79195e).e0("audio/mp4a-latm").I(bVarE.f61474c).H(bVarE.f61473b).f0(bVarE.f61472a).T(Collections.singletonList(bArrA)).V(this.f79194d).E();
            this.f79207q = 1024000000 / ((long) mVarE.A);
            this.f79196f.b(mVarE);
            this.f79206p = true;
        }
        this.f79192b.r(4);
        int iH2 = (this.f79192b.h(13) - 2) - 5;
        if (this.f79201k) {
            iH2 -= 2;
        }
        s(this.f79196f, this.f79207q, 0, iH2);
    }

    public final void l() {
        this.f79197g.e(this.f79193c, 10);
        this.f79193c.P(6);
        s(this.f79197g, 0L, 10, this.f79193c.C() + 10);
    }

    public final void m(s7.a0 a0Var) {
        int iMin = Math.min(a0Var.a(), this.f79208r - this.f79199i);
        this.f79210t.e(a0Var, iMin);
        int i10 = this.f79199i + iMin;
        this.f79199i = i10;
        int i11 = this.f79208r;
        if (i10 == i11) {
            long j10 = this.f79209s;
            if (j10 != -9223372036854775807L) {
                this.f79210t.c(j10, 1, i11, 0, null);
                this.f79209s += this.f79211u;
            }
            p();
        }
    }

    public final void n() {
        this.f79202l = false;
        p();
    }

    public final void o() {
        this.f79198h = 1;
        this.f79199i = 0;
    }

    public final void p() {
        this.f79198h = 0;
        this.f79199i = 0;
        this.f79200j = 256;
    }

    @Override // s6.m
    public void packetFinished() {
    }

    @Override // s6.m
    public void packetStarted(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f79209s = j10;
        }
    }

    public final void q() {
        this.f79198h = 3;
        this.f79199i = 0;
    }

    public final void r() {
        this.f79198h = 2;
        this.f79199i = f79190v.length;
        this.f79208r = 0;
        this.f79193c.P(0);
    }

    public final void s(i6.b0 b0Var, long j10, int i10, int i11) {
        this.f79198h = 4;
        this.f79199i = i10;
        this.f79210t = b0Var;
        this.f79211u = j10;
        this.f79208r = i11;
    }

    @Override // s6.m
    public void seek() {
        this.f79209s = -9223372036854775807L;
        n();
    }

    public final boolean t(s7.a0 a0Var, byte[] bArr, int i10) {
        if (a0Var.a() < i10) {
            return false;
        }
        a0Var.j(bArr, 0, i10);
        return true;
    }
}
