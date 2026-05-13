package t4;

import android.util.Pair;
import com.google.android.exoplayer.Format;
import com.google.android.exoplayer.ParserException;
import java.util.Arrays;
import java.util.Collections;
import t4.h0;

/* JADX INFO: compiled from: AdtsReader.java */
/* JADX INFO: loaded from: classes4.dex */
public final class i implements m {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final byte[] f84753v = {73, 68, 51};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f84754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a6.s f84755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a6.t f84756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f84757d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f84758e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public k4.u f84759f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public k4.u f84760g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f84761h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f84762i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f84763j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f84764k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f84765l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f84766m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f84767n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f84768o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f84769p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f84770q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f84771r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f84772s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public k4.u f84773t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f84774u;

    public i(boolean z10) {
        this(z10, null);
    }

    public i(boolean z10, String str) {
        this.f84755b = new a6.s(new byte[7]);
        this.f84756c = new a6.t(Arrays.copyOf(f84753v, 10));
        o();
        this.f84766m = -1;
        this.f84767n = -1;
        this.f84770q = -9223372036854775807L;
        this.f84754a = z10;
        this.f84757d = str;
    }

    public static boolean i(int i10) {
        return (i10 & 65526) == 65520;
    }

    @Override // t4.m
    public void a(a6.t tVar) throws ParserException {
        while (tVar.a() > 0) {
            int i10 = this.f84761h;
            if (i10 == 0) {
                f(tVar);
            } else if (i10 == 1) {
                c(tVar);
            } else if (i10 != 2) {
                if (i10 == 3) {
                    if (e(tVar, this.f84755b.f3616a, this.f84764k ? 7 : 5)) {
                        j();
                    }
                } else {
                    if (i10 != 4) {
                        throw new IllegalStateException();
                    }
                    l(tVar);
                }
            } else if (e(tVar, this.f84756c.f3620a, 10)) {
                k();
            }
        }
    }

    @Override // t4.m
    public void b(k4.i iVar, h0.d dVar) {
        dVar.a();
        this.f84758e = dVar.b();
        this.f84759f = iVar.track(dVar.c(), 1);
        if (!this.f84754a) {
            this.f84760g = new k4.f();
            return;
        }
        dVar.a();
        k4.u uVarTrack = iVar.track(dVar.c(), 4);
        this.f84760g = uVarTrack;
        uVarTrack.d(Format.u(dVar.b(), "application/id3", null, -1, null));
    }

    public final void c(a6.t tVar) {
        if (tVar.a() == 0) {
            return;
        }
        this.f84755b.f3616a[0] = tVar.f3620a[tVar.c()];
        this.f84755b.o(2);
        int iH = this.f84755b.h(4);
        int i10 = this.f84767n;
        if (i10 != -1 && iH != i10) {
            m();
            return;
        }
        if (!this.f84765l) {
            this.f84765l = true;
            this.f84766m = this.f84768o;
            this.f84767n = iH;
        }
        p();
    }

    public final boolean d(a6.t tVar, int i10) {
        tVar.L(i10 + 1);
        if (!s(tVar, this.f84755b.f3616a, 1)) {
            return false;
        }
        this.f84755b.o(4);
        int iH = this.f84755b.h(1);
        int i11 = this.f84766m;
        if (i11 != -1 && iH != i11) {
            return false;
        }
        if (this.f84767n != -1) {
            if (!s(tVar, this.f84755b.f3616a, 1)) {
                return true;
            }
            this.f84755b.o(2);
            if (this.f84755b.h(4) != this.f84767n) {
                return false;
            }
            tVar.L(i10 + 2);
        }
        if (!s(tVar, this.f84755b.f3616a, 4)) {
            return true;
        }
        this.f84755b.o(14);
        int iH2 = this.f84755b.h(13);
        if (iH2 < 7) {
            return false;
        }
        byte[] bArr = tVar.f3620a;
        int iD = tVar.d();
        int i12 = i10 + iH2;
        if (i12 >= iD) {
            return true;
        }
        byte b10 = bArr[i12];
        if (b10 == -1) {
            int i13 = i12 + 1;
            if (i13 == iD) {
                return true;
            }
            return h((byte) -1, bArr[i13]) && ((bArr[i13] & 8) >> 3) == iH;
        }
        if (b10 != 73) {
            return false;
        }
        int i14 = i12 + 1;
        if (i14 == iD) {
            return true;
        }
        if (bArr[i14] != 68) {
            return false;
        }
        int i15 = i12 + 2;
        return i15 == iD || bArr[i15] == 51;
    }

    public final boolean e(a6.t tVar, byte[] bArr, int i10) {
        int iMin = Math.min(tVar.a(), i10 - this.f84762i);
        tVar.h(bArr, this.f84762i, iMin);
        int i11 = this.f84762i + iMin;
        this.f84762i = i11;
        return i11 == i10;
    }

    public final void f(a6.t tVar) {
        byte[] bArr = tVar.f3620a;
        int iC = tVar.c();
        int iD = tVar.d();
        while (iC < iD) {
            int i10 = iC + 1;
            int i11 = bArr[iC] & 255;
            if (this.f84763j == 512 && h((byte) -1, (byte) i11) && (this.f84765l || d(tVar, i10 - 2))) {
                this.f84768o = (i11 & 8) >> 3;
                this.f84764k = (i11 & 1) == 0;
                if (this.f84765l) {
                    p();
                } else {
                    n();
                }
                tVar.L(i10);
                return;
            }
            int i12 = this.f84763j;
            int i13 = i11 | i12;
            if (i13 == 329) {
                this.f84763j = 768;
            } else if (i13 == 511) {
                this.f84763j = 512;
            } else if (i13 == 836) {
                this.f84763j = 1024;
            } else if (i13 == 1075) {
                q();
                tVar.L(i10);
                return;
            } else if (i12 != 256) {
                this.f84763j = 256;
                i10--;
            }
            iC = i10;
        }
        tVar.L(iC);
    }

    public long g() {
        return this.f84770q;
    }

    public final boolean h(byte b10, byte b11) {
        return i(((b10 & 255) << 8) | (b11 & 255));
    }

    public final void j() throws ParserException {
        this.f84755b.o(0);
        if (this.f84769p) {
            this.f84755b.q(10);
        } else {
            int iH = this.f84755b.h(2) + 1;
            if (iH != 2) {
                a6.m.h("AdtsReader", "Detected audio object type: " + iH + ", but assuming AAC LC.");
                iH = 2;
            }
            this.f84755b.q(5);
            byte[] bArrA = a6.d.a(iH, this.f84767n, this.f84755b.h(3));
            Pair<Integer, Integer> pairJ = a6.d.j(bArrA);
            Format formatQ = Format.q(this.f84758e, "audio/mp4a-latm", null, -1, -1, ((Integer) pairJ.second).intValue(), ((Integer) pairJ.first).intValue(), Collections.singletonList(bArrA), null, 0, this.f84757d);
            this.f84770q = 1024000000 / ((long) formatQ.f19941x);
            this.f84759f.d(formatQ);
            this.f84769p = true;
        }
        this.f84755b.q(4);
        int iH2 = (this.f84755b.h(13) - 2) - 5;
        if (this.f84764k) {
            iH2 -= 2;
        }
        r(this.f84759f, this.f84770q, 0, iH2);
    }

    public final void k() {
        this.f84760g.a(this.f84756c, 10);
        this.f84756c.L(6);
        r(this.f84760g, 0L, 10, this.f84756c.x() + 10);
    }

    public final void l(a6.t tVar) {
        int iMin = Math.min(tVar.a(), this.f84771r - this.f84762i);
        this.f84773t.a(tVar, iMin);
        int i10 = this.f84762i + iMin;
        this.f84762i = i10;
        int i11 = this.f84771r;
        if (i10 == i11) {
            this.f84773t.c(this.f84772s, 1, i11, 0, null);
            this.f84772s += this.f84774u;
            o();
        }
    }

    public final void m() {
        this.f84765l = false;
        o();
    }

    public final void n() {
        this.f84761h = 1;
        this.f84762i = 0;
    }

    public final void o() {
        this.f84761h = 0;
        this.f84762i = 0;
        this.f84763j = 256;
    }

    public final void p() {
        this.f84761h = 3;
        this.f84762i = 0;
    }

    @Override // t4.m
    public void packetFinished() {
    }

    @Override // t4.m
    public void packetStarted(long j10, int i10) {
        this.f84772s = j10;
    }

    public final void q() {
        this.f84761h = 2;
        this.f84762i = f84753v.length;
        this.f84771r = 0;
        this.f84756c.L(0);
    }

    public final void r(k4.u uVar, long j10, int i10, int i11) {
        this.f84761h = 4;
        this.f84762i = i10;
        this.f84773t = uVar;
        this.f84774u = j10;
        this.f84771r = i11;
    }

    public final boolean s(a6.t tVar, byte[] bArr, int i10) {
        if (tVar.a() < i10) {
            return false;
        }
        tVar.h(bArr, 0, i10);
        return true;
    }

    @Override // t4.m
    public void seek() {
        m();
    }
}
