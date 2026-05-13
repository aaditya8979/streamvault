package s6;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.m;
import f6.a;
import java.util.Collections;
import s6.i0;

/* JADX INFO: compiled from: LatmReader.java */
/* JADX INFO: loaded from: classes10.dex */
public final class s implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f79375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s7.a0 f79376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s7.z f79377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i6.b0 f79378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f79379e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.google.android.exoplayer2.m f79380f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f79381g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f79382h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f79383i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f79384j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f79385k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f79386l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f79387m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f79388n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f79389o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f79390p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f79391q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f79392r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f79393s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f79394t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public String f79395u;

    public s(@Nullable String str) {
        this.f79375a = str;
        s7.a0 a0Var = new s7.a0(1024);
        this.f79376b = a0Var;
        this.f79377c = new s7.z(a0Var.d());
        this.f79385k = -9223372036854775807L;
    }

    public static long c(s7.z zVar) {
        return zVar.h((zVar.h(2) + 1) * 8);
    }

    @Override // s6.m
    public void a(s7.a0 a0Var) throws ParserException {
        s7.a.i(this.f79378d);
        while (a0Var.a() > 0) {
            int i10 = this.f79381g;
            if (i10 != 0) {
                if (i10 == 1) {
                    int iD = a0Var.D();
                    if ((iD & 224) == 224) {
                        this.f79384j = iD;
                        this.f79381g = 2;
                    } else if (iD != 86) {
                        this.f79381g = 0;
                    }
                } else if (i10 == 2) {
                    int iD2 = ((this.f79384j & (-225)) << 8) | a0Var.D();
                    this.f79383i = iD2;
                    if (iD2 > this.f79376b.d().length) {
                        j(this.f79383i);
                    }
                    this.f79382h = 0;
                    this.f79381g = 3;
                } else {
                    if (i10 != 3) {
                        throw new IllegalStateException();
                    }
                    int iMin = Math.min(a0Var.a(), this.f79383i - this.f79382h);
                    a0Var.j(this.f79377c.f79571a, this.f79382h, iMin);
                    int i11 = this.f79382h + iMin;
                    this.f79382h = i11;
                    if (i11 == this.f79383i) {
                        this.f79377c.p(0);
                        d(this.f79377c);
                        this.f79381g = 0;
                    }
                }
            } else if (a0Var.D() == 86) {
                this.f79381g = 1;
            }
        }
    }

    @Override // s6.m
    public void b(i6.m mVar, i0.d dVar) {
        dVar.a();
        this.f79378d = mVar.track(dVar.c(), 1);
        this.f79379e = dVar.b();
    }

    public final void d(s7.z zVar) throws ParserException {
        if (!zVar.g()) {
            this.f79386l = true;
            i(zVar);
        } else if (!this.f79386l) {
            return;
        }
        if (this.f79387m != 0) {
            throw ParserException.createForMalformedContainer(null, null);
        }
        if (this.f79388n != 0) {
            throw ParserException.createForMalformedContainer(null, null);
        }
        h(zVar, g(zVar));
        if (this.f79390p) {
            zVar.r((int) this.f79391q);
        }
    }

    public final int e(s7.z zVar) throws ParserException {
        int iB = zVar.b();
        a.b bVarD = f6.a.d(zVar, true);
        this.f79395u = bVarD.f61474c;
        this.f79392r = bVarD.f61472a;
        this.f79394t = bVarD.f61473b;
        return iB - zVar.b();
    }

    public final void f(s7.z zVar) {
        int iH = zVar.h(3);
        this.f79389o = iH;
        if (iH == 0) {
            zVar.r(8);
            return;
        }
        if (iH == 1) {
            zVar.r(9);
            return;
        }
        if (iH == 3 || iH == 4 || iH == 5) {
            zVar.r(6);
        } else {
            if (iH != 6 && iH != 7) {
                throw new IllegalStateException();
            }
            zVar.r(1);
        }
    }

    public final int g(s7.z zVar) throws ParserException {
        int iH;
        if (this.f79389o != 0) {
            throw ParserException.createForMalformedContainer(null, null);
        }
        int i10 = 0;
        do {
            iH = zVar.h(8);
            i10 += iH;
        } while (iH == 255);
        return i10;
    }

    public final void h(s7.z zVar, int i10) {
        int iE = zVar.e();
        if ((iE & 7) == 0) {
            this.f79376b.P(iE >> 3);
        } else {
            zVar.i(this.f79376b.d(), 0, i10 * 8);
            this.f79376b.P(0);
        }
        this.f79378d.e(this.f79376b, i10);
        long j10 = this.f79385k;
        if (j10 != -9223372036854775807L) {
            this.f79378d.c(j10, 1, i10, 0, null);
            this.f79385k += this.f79393s;
        }
    }

    public final void i(s7.z zVar) throws ParserException {
        boolean zG;
        int iH = zVar.h(1);
        int iH2 = iH == 1 ? zVar.h(1) : 0;
        this.f79387m = iH2;
        if (iH2 != 0) {
            throw ParserException.createForMalformedContainer(null, null);
        }
        if (iH == 1) {
            c(zVar);
        }
        if (!zVar.g()) {
            throw ParserException.createForMalformedContainer(null, null);
        }
        this.f79388n = zVar.h(6);
        int iH3 = zVar.h(4);
        int iH4 = zVar.h(3);
        if (iH3 != 0 || iH4 != 0) {
            throw ParserException.createForMalformedContainer(null, null);
        }
        if (iH == 0) {
            int iE = zVar.e();
            int iE2 = e(zVar);
            zVar.p(iE);
            byte[] bArr = new byte[(iE2 + 7) / 8];
            zVar.i(bArr, 0, iE2);
            com.google.android.exoplayer2.m mVarE = new m.b().S(this.f79379e).e0("audio/mp4a-latm").I(this.f79395u).H(this.f79394t).f0(this.f79392r).T(Collections.singletonList(bArr)).V(this.f79375a).E();
            if (!mVarE.equals(this.f79380f)) {
                this.f79380f = mVarE;
                this.f79393s = 1024000000 / ((long) mVarE.A);
                this.f79378d.b(mVarE);
            }
        } else {
            zVar.r(((int) c(zVar)) - e(zVar));
        }
        f(zVar);
        boolean zG2 = zVar.g();
        this.f79390p = zG2;
        this.f79391q = 0L;
        if (zG2) {
            if (iH == 1) {
                this.f79391q = c(zVar);
            } else {
                do {
                    zG = zVar.g();
                    this.f79391q = (this.f79391q << 8) + ((long) zVar.h(8));
                } while (zG);
            }
        }
        if (zVar.g()) {
            zVar.r(8);
        }
    }

    public final void j(int i10) {
        this.f79376b.L(i10);
        this.f79377c.n(this.f79376b.d());
    }

    @Override // s6.m
    public void packetFinished() {
    }

    @Override // s6.m
    public void packetStarted(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f79385k = j10;
        }
    }

    @Override // s6.m
    public void seek() {
        this.f79381g = 0;
        this.f79385k = -9223372036854775807L;
        this.f79386l = false;
    }
}
