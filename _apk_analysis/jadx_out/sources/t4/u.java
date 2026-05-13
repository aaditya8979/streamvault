package t4;

import com.google.android.exoplayer.ParserException;
import t4.h0;

/* JADX INFO: compiled from: PesReader.java */
/* JADX INFO: loaded from: classes4.dex */
public final class u implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f84937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a6.s f84938b = new a6.s(new byte[10]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f84939c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f84940d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a6.g0 f84941e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f84942f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f84943g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f84944h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f84945i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f84946j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f84947k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f84948l;

    public u(m mVar) {
        this.f84937a = mVar;
    }

    @Override // t4.h0
    public final void a(a6.t tVar, int i10) throws ParserException {
        if ((i10 & 1) != 0) {
            int i11 = this.f84939c;
            if (i11 != 0 && i11 != 1) {
                if (i11 == 2) {
                    a6.m.h("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.f84946j != -1) {
                        a6.m.h("PesReader", "Unexpected start indicator: expected " + this.f84946j + " more bytes");
                    }
                    this.f84937a.packetFinished();
                }
            }
            f(1);
        }
        while (tVar.a() > 0) {
            int i12 = this.f84939c;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 == 2) {
                        if (c(tVar, this.f84938b.f3616a, Math.min(10, this.f84945i)) && c(tVar, null, this.f84945i)) {
                            e();
                            i10 |= this.f84947k ? 4 : 0;
                            this.f84937a.packetStarted(this.f84948l, i10);
                            f(3);
                        }
                    } else {
                        if (i12 != 3) {
                            throw new IllegalStateException();
                        }
                        int iA = tVar.a();
                        int i13 = this.f84946j;
                        int i14 = i13 != -1 ? iA - i13 : 0;
                        if (i14 > 0) {
                            iA -= i14;
                            tVar.K(tVar.c() + iA);
                        }
                        this.f84937a.a(tVar);
                        int i15 = this.f84946j;
                        if (i15 != -1) {
                            int i16 = i15 - iA;
                            this.f84946j = i16;
                            if (i16 == 0) {
                                this.f84937a.packetFinished();
                                f(1);
                            }
                        }
                    }
                } else if (c(tVar, this.f84938b.f3616a, 9)) {
                    f(d() ? 2 : 0);
                }
            } else {
                tVar.M(tVar.a());
            }
        }
    }

    @Override // t4.h0
    public void b(a6.g0 g0Var, k4.i iVar, h0.d dVar) {
        this.f84941e = g0Var;
        this.f84937a.b(iVar, dVar);
    }

    public final boolean c(a6.t tVar, byte[] bArr, int i10) {
        int iMin = Math.min(tVar.a(), i10 - this.f84940d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            tVar.M(iMin);
        } else {
            tVar.h(bArr, this.f84940d, iMin);
        }
        int i11 = this.f84940d + iMin;
        this.f84940d = i11;
        return i11 == i10;
    }

    public final boolean d() {
        this.f84938b.o(0);
        int iH = this.f84938b.h(24);
        if (iH != 1) {
            a6.m.h("PesReader", "Unexpected start code prefix: " + iH);
            this.f84946j = -1;
            return false;
        }
        this.f84938b.q(8);
        int iH2 = this.f84938b.h(16);
        this.f84938b.q(5);
        this.f84947k = this.f84938b.g();
        this.f84938b.q(2);
        this.f84942f = this.f84938b.g();
        this.f84943g = this.f84938b.g();
        this.f84938b.q(6);
        int iH3 = this.f84938b.h(8);
        this.f84945i = iH3;
        if (iH2 == 0) {
            this.f84946j = -1;
        } else {
            this.f84946j = ((iH2 + 6) - 9) - iH3;
        }
        return true;
    }

    public final void e() {
        this.f84938b.o(0);
        this.f84948l = -9223372036854775807L;
        if (this.f84942f) {
            this.f84938b.q(4);
            long jH = ((long) this.f84938b.h(3)) << 30;
            this.f84938b.q(1);
            long jH2 = jH | ((long) (this.f84938b.h(15) << 15));
            this.f84938b.q(1);
            long jH3 = jH2 | ((long) this.f84938b.h(15));
            this.f84938b.q(1);
            if (!this.f84944h && this.f84943g) {
                this.f84938b.q(4);
                long jH4 = ((long) this.f84938b.h(3)) << 30;
                this.f84938b.q(1);
                long jH5 = jH4 | ((long) (this.f84938b.h(15) << 15));
                this.f84938b.q(1);
                long jH6 = jH5 | ((long) this.f84938b.h(15));
                this.f84938b.q(1);
                this.f84941e.b(jH6);
                this.f84944h = true;
            }
            this.f84948l = this.f84941e.b(jH3);
        }
    }

    public final void f(int i10) {
        this.f84939c = i10;
        this.f84940d = 0;
    }

    @Override // t4.h0
    public final void seek() {
        this.f84939c = 0;
        this.f84940d = 0;
        this.f84944h = false;
        this.f84937a.seek();
    }
}
