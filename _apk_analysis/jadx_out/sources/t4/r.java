package t4;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.Format;
import com.google.android.exoplayer.ParserException;
import java.util.Collections;
import t4.h0;

/* JADX INFO: compiled from: LatmReader.java */
/* JADX INFO: loaded from: classes4.dex */
public final class r implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a6.t f84901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a6.s f84902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k4.u f84903d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Format f84904e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f84905f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f84906g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f84907h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f84908i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f84909j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f84910k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f84911l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f84912m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f84913n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f84914o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f84915p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f84916q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f84917r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f84918s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f84919t;

    public r(@Nullable String str) {
        this.f84900a = str;
        a6.t tVar = new a6.t(1024);
        this.f84901b = tVar;
        this.f84902c = new a6.s(tVar.f3620a);
    }

    public static long c(a6.s sVar) {
        return sVar.h((sVar.h(2) + 1) * 8);
    }

    @Override // t4.m
    public void a(a6.t tVar) throws ParserException {
        while (tVar.a() > 0) {
            int i10 = this.f84906g;
            if (i10 != 0) {
                if (i10 == 1) {
                    int iY = tVar.y();
                    if ((iY & 224) == 224) {
                        this.f84909j = iY;
                        this.f84906g = 2;
                    } else if (iY != 86) {
                        this.f84906g = 0;
                    }
                } else if (i10 == 2) {
                    int iY2 = ((this.f84909j & (-225)) << 8) | tVar.y();
                    this.f84908i = iY2;
                    if (iY2 > this.f84901b.f3620a.length) {
                        j(iY2);
                    }
                    this.f84907h = 0;
                    this.f84906g = 3;
                } else {
                    if (i10 != 3) {
                        throw new IllegalStateException();
                    }
                    int iMin = Math.min(tVar.a(), this.f84908i - this.f84907h);
                    tVar.h(this.f84902c.f3616a, this.f84907h, iMin);
                    int i11 = this.f84907h + iMin;
                    this.f84907h = i11;
                    if (i11 == this.f84908i) {
                        this.f84902c.o(0);
                        d(this.f84902c);
                        this.f84906g = 0;
                    }
                }
            } else if (tVar.y() == 86) {
                this.f84906g = 1;
            }
        }
    }

    @Override // t4.m
    public void b(k4.i iVar, h0.d dVar) {
        dVar.a();
        this.f84903d = iVar.track(dVar.c(), 1);
        this.f84905f = dVar.b();
    }

    public final void d(a6.s sVar) throws ParserException {
        if (!sVar.g()) {
            this.f84911l = true;
            i(sVar);
        } else if (!this.f84911l) {
            return;
        }
        if (this.f84912m != 0) {
            throw new ParserException();
        }
        if (this.f84913n != 0) {
            throw new ParserException();
        }
        h(sVar, g(sVar));
        if (this.f84915p) {
            sVar.q((int) this.f84916q);
        }
    }

    public final int e(a6.s sVar) throws ParserException {
        int iB = sVar.b();
        Pair<Integer, Integer> pairI = a6.d.i(sVar, true);
        this.f84917r = ((Integer) pairI.first).intValue();
        this.f84919t = ((Integer) pairI.second).intValue();
        return iB - sVar.b();
    }

    public final void f(a6.s sVar) {
        int iH = sVar.h(3);
        this.f84914o = iH;
        if (iH == 0) {
            sVar.q(8);
            return;
        }
        if (iH == 1) {
            sVar.q(9);
            return;
        }
        if (iH == 3 || iH == 4 || iH == 5) {
            sVar.q(6);
        } else {
            if (iH != 6 && iH != 7) {
                throw new IllegalStateException();
            }
            sVar.q(1);
        }
    }

    public final int g(a6.s sVar) throws ParserException {
        int iH;
        if (this.f84914o != 0) {
            throw new ParserException();
        }
        int i10 = 0;
        do {
            iH = sVar.h(8);
            i10 += iH;
        } while (iH == 255);
        return i10;
    }

    public final void h(a6.s sVar, int i10) {
        int iE = sVar.e();
        if ((iE & 7) == 0) {
            this.f84901b.L(iE >> 3);
        } else {
            sVar.i(this.f84901b.f3620a, 0, i10 * 8);
            this.f84901b.L(0);
        }
        this.f84903d.a(this.f84901b, i10);
        this.f84903d.c(this.f84910k, 1, i10, 0, null);
        this.f84910k += this.f84918s;
    }

    public final void i(a6.s sVar) throws ParserException {
        boolean zG;
        int iH = sVar.h(1);
        int iH2 = iH == 1 ? sVar.h(1) : 0;
        this.f84912m = iH2;
        if (iH2 != 0) {
            throw new ParserException();
        }
        if (iH == 1) {
            c(sVar);
        }
        if (!sVar.g()) {
            throw new ParserException();
        }
        this.f84913n = sVar.h(6);
        int iH3 = sVar.h(4);
        int iH4 = sVar.h(3);
        if (iH3 != 0 || iH4 != 0) {
            throw new ParserException();
        }
        if (iH == 0) {
            int iE = sVar.e();
            int iE2 = e(sVar);
            sVar.o(iE);
            byte[] bArr = new byte[(iE2 + 7) / 8];
            sVar.i(bArr, 0, iE2);
            Format formatQ = Format.q(this.f84905f, "audio/mp4a-latm", null, -1, -1, this.f84919t, this.f84917r, Collections.singletonList(bArr), null, 0, this.f84900a);
            if (!formatQ.equals(this.f84904e)) {
                this.f84904e = formatQ;
                this.f84918s = 1024000000 / ((long) formatQ.f19941x);
                this.f84903d.d(formatQ);
            }
        } else {
            sVar.q(((int) c(sVar)) - e(sVar));
        }
        f(sVar);
        boolean zG2 = sVar.g();
        this.f84915p = zG2;
        this.f84916q = 0L;
        if (zG2) {
            if (iH == 1) {
                this.f84916q = c(sVar);
            } else {
                do {
                    zG = sVar.g();
                    this.f84916q = (this.f84916q << 8) + ((long) sVar.h(8));
                } while (zG);
            }
        }
        if (sVar.g()) {
            sVar.q(8);
        }
    }

    public final void j(int i10) {
        this.f84901b.H(i10);
        this.f84902c.m(this.f84901b.f3620a);
    }

    @Override // t4.m
    public void packetFinished() {
    }

    @Override // t4.m
    public void packetStarted(long j10, int i10) {
        this.f84910k = j10;
    }

    @Override // t4.m
    public void seek() {
        this.f84906g = 0;
        this.f84911l = false;
    }
}
