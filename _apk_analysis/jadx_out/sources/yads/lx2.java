package yads;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class lx2 extends as2 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final rr f92164i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final jx2 f92165j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final byte[] f92166k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final bs f92167l;

    public lx2(kx2 kx2Var, rr rrVar, jx2 jx2Var, byte[] bArr) {
        this.f92164i = rrVar;
        this.f92165j = jx2Var;
        this.f92166k = bArr;
        this.f92167l = new bs(rrVar, kx2Var.f91800c, bArr, jx2Var);
    }

    @Override // yads.as2
    public final void a() {
        this.f92167l.f88130j = true;
    }

    @Override // yads.as2
    public final Object b() throws IOException {
        float f10;
        float f11;
        this.f92167l.a();
        jx2 jx2Var = this.f92165j;
        if (jx2Var == null) {
            return null;
        }
        int i10 = jx2Var.f91411e + 1;
        jx2Var.f91411e = i10;
        qj0 qj0Var = jx2Var.f91407a;
        long j10 = jx2Var.f91408b;
        long j11 = jx2Var.f91410d;
        if (j10 == -1 || j10 == 0) {
            int i11 = jx2Var.f91409c;
            if (i11 != 0) {
                f11 = (i10 * 100.0f) / i11;
                ((lj0) qj0Var).a(j10, j11, f11);
                return null;
            }
            f10 = -1.0f;
        } else {
            f10 = (j11 * 100.0f) / j10;
        }
        f11 = f10;
        ((lj0) qj0Var).a(j10, j11, f11);
        return null;
    }
}
