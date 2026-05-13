package bn;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: UnsignedJVM.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class s {
    public static final int a(double d10) {
        if (Double.isNaN(d10) || d10 <= c(0)) {
            return 0;
        }
        if (d10 >= c(-1)) {
            return -1;
        }
        return d10 <= 2.147483647E9d ? k.b((int) d10) : k.b(k.b((int) (d10 - ((double) Integer.MAX_VALUE))) + k.b(Integer.MAX_VALUE));
    }

    public static final int b(int i10, int i11) {
        return tn.p.m(i10 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE);
    }

    public static final double c(int i10) {
        return ((double) (Integer.MAX_VALUE & i10)) + (((double) ((i10 >>> 31) << 30)) * ((double) 2));
    }

    public static final int d(long j10, long j11) {
        return tn.p.n(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE);
    }

    public static final double e(long j10) {
        return ((j10 >>> 11) * ((double) 2048)) + (j10 & 2047);
    }

    @NotNull
    public static final String f(long j10, int i10) {
        if (j10 >= 0) {
            String string = Long.toString(j10, bo.a.a(i10));
            tn.p.j(string, "toString(...)");
            return string;
        }
        long j11 = i10;
        long j12 = ((j10 >>> 1) / j11) << 1;
        long j13 = j10 - (j12 * j11);
        if (j13 >= j11) {
            j13 -= j11;
            j12++;
        }
        StringBuilder sb2 = new StringBuilder();
        String string2 = Long.toString(j12, bo.a.a(i10));
        tn.p.j(string2, "toString(...)");
        sb2.append(string2);
        String string3 = Long.toString(j13, bo.a.a(i10));
        tn.p.j(string3, "toString(...)");
        sb2.append(string3);
        return sb2.toString();
    }
}
