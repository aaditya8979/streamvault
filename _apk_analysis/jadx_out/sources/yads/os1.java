package yads;

import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public final class os1 extends px0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f93318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f93319e;

    public os1(s63 s63Var, HashMap map) {
        super(s63Var);
        int iB = s63Var.b();
        this.f93319e = new long[s63Var.b()];
        r63 r63Var = new r63();
        for (int i10 = 0; i10 < iB; i10++) {
            this.f93319e[i10] = s63Var.a(i10, r63Var).f94312o;
        }
        int iA = s63Var.a();
        this.f93318d = new long[iA];
        p63 p63Var = new p63();
        for (int i11 = 0; i11 < iA; i11++) {
            s63Var.a(i11, p63Var, true);
            long jLongValue = ((Long) ni.a((Long) map.get(p63Var.f93448c))).longValue();
            long[] jArr = this.f93318d;
            jLongValue = jLongValue == Long.MIN_VALUE ? p63Var.f93450e : jLongValue;
            jArr[i11] = jLongValue;
            long j10 = p63Var.f93450e;
            if (j10 != -9223372036854775807L) {
                long[] jArr2 = this.f93319e;
                int i12 = p63Var.f93449d;
                jArr2[i12] = jArr2[i12] - (j10 - jLongValue);
            }
        }
    }

    @Override // yads.s63
    public final p63 a(int i10, p63 p63Var, boolean z10) {
        this.f93823c.a(i10, p63Var, z10);
        p63Var.f93450e = this.f93318d[i10];
        return p63Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    @Override // yads.px0, yads.s63
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final yads.r63 a(int r5, yads.r63 r6, long r7) {
        /*
            r4 = this;
            super.a(r5, r6, r7)
            long[] r7 = r4.f93319e
            r0 = r7[r5]
            r6.f94312o = r0
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r5 == 0) goto L1e
            long r2 = r6.f94311n
            int r5 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r5 != 0) goto L19
            goto L1e
        L19:
            long r7 = java.lang.Math.min(r2, r0)
            goto L20
        L1e:
            long r7 = r6.f94311n
        L20:
            r6.f94311n = r7
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.os1.a(int, yads.r63, long):yads.r63");
    }
}
