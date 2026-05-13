package yads;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class ex2 extends cx2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final va3 f89400j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final va3 f89401k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f89402l;

    public ex2(pl2 pl2Var, long j10, long j11, long j12, long j13, long j14, List list, long j15, va3 va3Var, va3 va3Var2, long j16, long j17) {
        super(pl2Var, j10, j11, j12, j14, list, j15, j16, j17);
        this.f89400j = va3Var;
        this.f89401k = va3Var2;
        this.f89402l = j13;
    }

    @Override // yads.cx2
    public final long a(long j10) {
        if (this.f88639f != null) {
            return r0.size();
        }
        long j11 = this.f89402l;
        if (j11 != -1) {
            return (j11 - this.f88637d) + 1;
        }
        if (j10 == -9223372036854775807L) {
            return -1L;
        }
        BigInteger bigIntegerMultiply = BigInteger.valueOf(j10).multiply(BigInteger.valueOf(this.f90589b));
        BigInteger bigIntegerMultiply2 = BigInteger.valueOf(this.f88638e).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i10 = kp.f91699a;
        return new BigDecimal(bigIntegerMultiply).divide(new BigDecimal(bigIntegerMultiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override // yads.cx2
    public final pl2 a(long j10, lo2 lo2Var) {
        List list = this.f88639f;
        long j11 = list != null ? ((fx2) list.get((int) (j10 - this.f88637d))).f89720a : (j10 - this.f88637d) * this.f88638e;
        va3 va3Var = this.f89401k;
        mx0 mx0Var = lo2Var.f92049a;
        return new pl2(va3Var.a(mx0Var.f92599b, j10, mx0Var.f92606i, j11), 0L, -1L);
    }

    @Override // yads.hx2
    public final pl2 a(lo2 lo2Var) {
        va3 va3Var = this.f89400j;
        if (va3Var == null) {
            return this.f90588a;
        }
        mx0 mx0Var = lo2Var.f92049a;
        return new pl2(va3Var.a(mx0Var.f92599b, 0L, mx0Var.f92606i, 0L), 0L, -1L);
    }
}
