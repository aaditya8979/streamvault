package yads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import yads.mq0;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 implements mq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f89417a = new g0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jb2 f89418b = new jb2(2786);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f89419c;

    static {
        new rq0() { // from class: bt.s1
            @Override // yads.rq0
            public final mq0[] createExtractors() {
                return yads.f0.a();
            }
        };
    }

    public static /* synthetic */ mq0[] a() {
        return new mq0[]{new f0()};
    }

    @Override // yads.mq0
    public final int a(nq0 nq0Var, gg2 gg2Var) throws EOFException, InterruptedIOException {
        int i10 = ((ld0) nq0Var).read(this.f89418b.f91147a, 0, 2786);
        if (i10 == -1) {
            return -1;
        }
        this.f89418b.e(0);
        this.f89418b.d(i10);
        if (!this.f89419c) {
            this.f89417a.a(4, 0L);
            this.f89419c = true;
        }
        this.f89417a.a(this.f89418b);
        return 0;
    }

    @Override // yads.mq0
    public final void a(pq0 pq0Var) {
        g0 g0Var = this.f89417a;
        g0Var.getClass();
        g0Var.f89746d = "0";
        g0Var.f89747e = pq0Var.a(0, 1);
        pq0Var.a();
        pq0Var.a(new uw2(-9223372036854775807L, 0L));
    }

    @Override // yads.mq0
    public final boolean a(nq0 nq0Var) throws EOFException, InterruptedIOException {
        ld0 ld0Var;
        int iA;
        jb2 jb2Var = new jb2(10);
        int i10 = 0;
        while (true) {
            ld0Var = (ld0) nq0Var;
            ld0Var.b(jb2Var.f91147a, 0, 10, false);
            jb2Var.e(0);
            if (jb2Var.o() != 4801587) {
                break;
            }
            jb2Var.e(jb2Var.f91148b + 3);
            int iL = jb2Var.l();
            i10 += iL + 10;
            ld0Var.a(false, iL);
        }
        ld0Var.f91940f = 0;
        ld0Var.a(false, i10);
        int i11 = 0;
        int i12 = i10;
        while (true) {
            ld0Var.b(jb2Var.f91147a, 0, 6, false);
            jb2Var.e(0);
            if (jb2Var.r() != 2935) {
                ld0Var.f91940f = 0;
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                ld0Var.a(false, i12);
                i11 = 0;
            } else {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                byte[] bArr = jb2Var.f91147a;
                if (bArr.length < 6) {
                    iA = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    iA = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                } else {
                    byte b10 = bArr[4];
                    iA = h0.a((b10 & 192) >> 6, b10 & 63);
                }
                if (iA == -1) {
                    return false;
                }
                ld0Var.a(false, iA - 6);
            }
        }
    }

    @Override // yads.mq0
    public final void release() {
    }

    @Override // yads.mq0
    public final void seek(long j10, long j11) {
        this.f89419c = false;
        this.f89417a.a();
    }
}
