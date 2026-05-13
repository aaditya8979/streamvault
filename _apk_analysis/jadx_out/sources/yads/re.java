package yads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import yads.mq0;
import yads.re;

/* JADX INFO: loaded from: classes2.dex */
public final class re implements mq0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int[] f94382p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int[] f94383q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final byte[] f94384r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final byte[] f94385s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f94386t;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f94389c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f94390d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f94391e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f94392f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f94393g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f94394h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f94396j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f94397k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public pq0 f94398l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public m73 f94399m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public vw2 f94400n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f94401o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f94388b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f94387a = new byte[1];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f94395i = -1;

    static {
        new rq0() { // from class: bt.h9
            @Override // yads.rq0
            public final mq0[] createExtractors() {
                return re.a();
            }
        };
        f94382p = new int[]{13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f94383q = iArr;
        f94384r = ib3.c("#!AMR\n");
        f94385s = ib3.c("#!AMR-WB\n");
        f94386t = iArr[8];
    }

    public static mq0[] a() {
        return new mq0[]{new re()};
    }

    public final int a(ld0 ld0Var) throws ob2 {
        boolean z10;
        ld0Var.f91940f = 0;
        ld0Var.b(this.f94387a, 0, 1, false);
        byte b10 = this.f94387a[0];
        if ((b10 & 131) > 0) {
            throw new ob2(mg2.a("Invalid padding bits for frame header ", b10), null, true, 1);
        }
        int i10 = (b10 >> 3) & 15;
        if (i10 >= 0 && i10 <= 15 && (((z10 = this.f94389c) && (i10 < 10 || i10 > 13)) || (!z10 && (i10 < 12 || i10 > 14)))) {
            return z10 ? f94383q[i10] : f94382p[i10];
        }
        StringBuilder sb2 = new StringBuilder("Illegal AMR ");
        sb2.append(this.f94389c ? "WB" : "NB");
        sb2.append(" frame type ");
        sb2.append(i10);
        throw new ob2(sb2.toString(), null, true, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b0  */
    @Override // yads.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(yads.nq0 r20, yads.gg2 r21) throws yads.ob2, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.re.a(yads.nq0, yads.gg2):int");
    }

    @Override // yads.mq0
    public final void a(pq0 pq0Var) {
        this.f94398l = pq0Var;
        this.f94399m = pq0Var.a(0, 1);
        pq0Var.a();
    }

    @Override // yads.mq0
    public final boolean a(nq0 nq0Var) throws EOFException, InterruptedIOException {
        ld0 ld0Var = (ld0) nq0Var;
        byte[] bArr = f94384r;
        ld0Var.f91940f = 0;
        byte[] bArr2 = new byte[bArr.length];
        ld0Var.b(bArr2, 0, bArr.length, false);
        if (Arrays.equals(bArr2, bArr)) {
            this.f94389c = false;
            ld0Var.a(bArr.length);
        } else {
            byte[] bArr3 = f94385s;
            ld0Var.f91940f = 0;
            byte[] bArr4 = new byte[bArr3.length];
            ld0Var.b(bArr4, 0, bArr3.length, false);
            if (!Arrays.equals(bArr4, bArr3)) {
                return false;
            }
            this.f94389c = true;
            ld0Var.a(bArr3.length);
        }
        return true;
    }

    @Override // yads.mq0
    public final void release() {
    }

    @Override // yads.mq0
    public final void seek(long j10, long j11) {
        this.f94390d = 0L;
        this.f94391e = 0;
        this.f94392f = 0;
        if (j10 != 0) {
            vw2 vw2Var = this.f94400n;
            if (vw2Var instanceof gz) {
                gz gzVar = (gz) vw2Var;
                this.f94397k = gz.a(gzVar.f90160e, j10, gzVar.f90157b);
                return;
            }
        }
        this.f94397k = 0L;
    }
}
