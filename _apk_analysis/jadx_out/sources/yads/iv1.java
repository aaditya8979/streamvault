package yads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import yads.iv1;
import yads.mq0;

/* JADX INFO: loaded from: classes7.dex */
public final class iv1 implements mq0 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final s21 f91000t;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final al0 f91006f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public pq0 f91007g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public m73 f91008h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public m73 f91009i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f91010j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ts1 f91011k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f91013m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f91014n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f91015o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public zw2 f91016p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f91017q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f91018r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f91019s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f91001a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jb2 f91002b = new jb2(10);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ov1 f91003c = new ov1();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zy0 f91004d = new zy0();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f91012l = -9223372036854775807L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w21 f91005e = new w21();

    static {
        new rq0() { // from class: bt.h3
            @Override // yads.rq0
            public final mq0[] createExtractors() {
                return iv1.a();
            }
        };
        f91000t = new s21() { // from class: bt.i3
            @Override // yads.s21
            public final boolean a(int i10, int i11, int i12, int i13, int i14) {
                return iv1.a(i10, i11, i12, i13, i14);
            }
        };
    }

    public iv1(int i10) {
        al0 al0Var = new al0();
        this.f91006f = al0Var;
        this.f91009i = al0Var;
    }

    public static long a(ts1 ts1Var) {
        if (ts1Var == null) {
            return -9223372036854775807L;
        }
        int length = ts1Var.f95344b.length;
        for (int i10 = 0; i10 < length; i10++) {
            ss1 ss1Var = ts1Var.f95344b[i10];
            if (ss1Var instanceof y53) {
                y53 y53Var = (y53) ss1Var;
                if (y53Var.f95910b.equals("TLEN")) {
                    return ib3.a(Long.parseLong(y53Var.f97010d));
                }
            }
        }
        return -9223372036854775807L;
    }

    public static /* synthetic */ boolean a(int i10, int i11, int i12, int i13, int i14) {
        return (i11 == 67 && i12 == 79 && i13 == 77 && (i14 == 77 || i10 == 2)) || (i11 == 77 && i12 == 76 && i13 == 76 && (i14 == 84 || i10 == 2));
    }

    public static mq0[] a() {
        return new mq0[]{new iv1(0)};
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    @Override // yads.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(yads.nq0 r39, yads.gg2 r40) throws yads.ob2, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instruction units count: 1208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.iv1.a(yads.nq0, yads.gg2):int");
    }

    @Override // yads.mq0
    public final void a(pq0 pq0Var) {
        this.f91007g = pq0Var;
        m73 m73VarA = pq0Var.a(0, 1);
        this.f91008h = m73VarA;
        this.f91009i = m73VarA;
        this.f91007g.a();
    }

    public final boolean a(ld0 ld0Var) {
        zw2 zw2Var = this.f91016p;
        if (zw2Var != null) {
            long jA = zw2Var.a();
            if (jA != -1 && ld0Var.f91938d + ((long) ld0Var.f91940f) > jA - 4) {
                return true;
            }
        }
        try {
            return !ld0Var.b(this.f91002b.f91147a, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    public final boolean a(ld0 ld0Var, boolean z10) throws ob2, EOFException, InterruptedIOException {
        int i10;
        int i11;
        int iA;
        int i12 = z10 ? 32768 : 131072;
        ld0Var.f91940f = 0;
        if (ld0Var.f91938d == 0) {
            ts1 ts1VarA = this.f91005e.a(ld0Var, (this.f91001a & 8) == 0 ? null : f91000t);
            this.f91011k = ts1VarA;
            if (ts1VarA != null) {
                this.f91004d.a(ts1VarA);
            }
            i10 = (int) (ld0Var.f91938d + ((long) ld0Var.f91940f));
            if (!z10) {
                ld0Var.a(i10);
            }
            i11 = 0;
        } else {
            i10 = 0;
            i11 = 0;
        }
        int i13 = i11;
        int i14 = i13;
        while (true) {
            if (!a(ld0Var)) {
                this.f91002b.e(0);
                int iB = this.f91002b.b();
                if ((i11 == 0 || ((-128000) & iB) == (((long) i11) & (-128000))) && (iA = pv1.a(iB)) != -1) {
                    i13++;
                    if (i13 != 1) {
                        if (i13 == 4) {
                            break;
                        }
                    } else {
                        this.f91003c.a(iB);
                        i11 = iB;
                    }
                    ld0Var.a(false, iA - 4);
                } else {
                    int i15 = i14 + 1;
                    if (i14 == i12) {
                        if (z10) {
                            return false;
                        }
                        throw new ob2("Searched too many bytes.", null, true, 1);
                    }
                    if (z10) {
                        ld0Var.f91940f = 0;
                        ld0Var.a(false, i10 + i15);
                    } else {
                        ld0Var.a(1);
                    }
                    i13 = 0;
                    i14 = i15;
                    i11 = 0;
                }
            } else if (i13 <= 0) {
                throw new EOFException();
            }
        }
        if (z10) {
            ld0Var.a(i10 + i14);
        } else {
            ld0Var.f91940f = 0;
        }
        this.f91010j = i11;
        return true;
    }

    @Override // yads.mq0
    public final boolean a(nq0 nq0Var) {
        return a((ld0) nq0Var, true);
    }

    @Override // yads.mq0
    public final void release() {
    }

    @Override // yads.mq0
    public final void seek(long j10, long j11) {
        this.f91010j = 0;
        this.f91012l = -9223372036854775807L;
        this.f91013m = 0L;
        this.f91015o = 0;
        this.f91019s = j11;
        zw2 zw2Var = this.f91016p;
        if (!(zw2Var instanceof j61) || ((j61) zw2Var).c(j11)) {
            return;
        }
        this.f91018r = true;
        this.f91009i = this.f91006f;
    }
}
