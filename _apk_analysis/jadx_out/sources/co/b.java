package co;

import androidx.exifinterface.media.ExifInterface;
import bo.d0;
import com.ironsource.Ne;
import kotlin.time.DurationUnit;
import org.jetbrains.annotations.NotNull;
import tn.p;
import zn.n;

/* JADX INFO: compiled from: Duration.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class b implements Comparable<b> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f6773c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f6774d = j(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f6775e = d.j(4611686018427387903L);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f6776f = d.j(-4611686018427387903L);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f6777b;

    /* JADX INFO: compiled from: Duration.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        public final long a() {
            return b.f6775e;
        }

        public final long b() {
            return b.f6776f;
        }

        public final long c() {
            return b.f6774d;
        }

        public final long d(@NotNull String str) {
            p.k(str, "value");
            try {
                return d.p(str, true);
            } catch (IllegalArgumentException e10) {
                throw new IllegalArgumentException("Invalid ISO duration string format: '" + str + "'.", e10);
            }
        }
    }

    public /* synthetic */ b(long j10) {
        this.f6777b = j10;
    }

    public static final boolean A(long j10) {
        return !D(j10);
    }

    public static final boolean B(long j10) {
        return (((int) j10) & 1) == 1;
    }

    public static final boolean C(long j10) {
        return (((int) j10) & 1) == 0;
    }

    public static final boolean D(long j10) {
        return j10 == f6775e || j10 == f6776f;
    }

    public static final boolean E(long j10) {
        return j10 < 0;
    }

    public static final boolean F(long j10) {
        return j10 > 0;
    }

    public static final long G(long j10, long j11) {
        return H(j10, N(j11));
    }

    public static final long H(long j10, long j11) {
        if (D(j10)) {
            if (A(j11) || (j11 ^ j10) >= 0) {
                return j10;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (D(j11)) {
            return j11;
        }
        if ((((int) j10) & 1) != (((int) j11) & 1)) {
            return B(j10) ? d(j10, y(j10), y(j11)) : d(j10, y(j11), y(j10));
        }
        long jY = y(j10) + y(j11);
        return C(j10) ? d.m(jY) : d.k(jY);
    }

    public static final double I(long j10, @NotNull DurationUnit durationUnit) {
        p.k(durationUnit, Ne.f29954n1);
        if (j10 == f6775e) {
            return Double.POSITIVE_INFINITY;
        }
        if (j10 == f6776f) {
            return Double.NEGATIVE_INFINITY;
        }
        return e.a(y(j10), x(j10), durationUnit);
    }

    public static final int J(long j10, @NotNull DurationUnit durationUnit) {
        p.k(durationUnit, Ne.f29954n1);
        return (int) n.p(L(j10, durationUnit), -2147483648L, 2147483647L);
    }

    @NotNull
    public static final String K(long j10) {
        StringBuilder sb2 = new StringBuilder();
        if (E(j10)) {
            sb2.append('-');
        }
        sb2.append("PT");
        long jM = m(j10);
        long jP = p(jM);
        int iU = u(jM);
        int iW = w(jM);
        int iV = v(jM);
        if (D(j10)) {
            jP = 9999999999999L;
        }
        boolean z10 = true;
        boolean z11 = jP != 0;
        boolean z12 = (iW == 0 && iV == 0) ? false : true;
        if (iU == 0 && (!z12 || !z11)) {
            z10 = false;
        }
        if (z11) {
            sb2.append(jP);
            sb2.append('H');
        }
        if (z10) {
            sb2.append(iU);
            sb2.append('M');
        }
        if (z12 || (!z11 && !z10)) {
            e(j10, sb2, iW, iV, 9, ExifInterface.LATITUDE_SOUTH, true);
        }
        return sb2.toString();
    }

    public static final long L(long j10, @NotNull DurationUnit durationUnit) {
        p.k(durationUnit, Ne.f29954n1);
        if (j10 == f6775e) {
            return Long.MAX_VALUE;
        }
        if (j10 == f6776f) {
            return Long.MIN_VALUE;
        }
        return e.b(y(j10), x(j10), durationUnit);
    }

    @NotNull
    public static String M(long j10) {
        if (j10 == 0) {
            return "0s";
        }
        if (j10 == f6775e) {
            return "Infinity";
        }
        if (j10 == f6776f) {
            return "-Infinity";
        }
        boolean zE = E(j10);
        StringBuilder sb2 = new StringBuilder();
        if (zE) {
            sb2.append('-');
        }
        long jM = m(j10);
        long jO = o(jM);
        int iN = n(jM);
        int iU = u(jM);
        int iW = w(jM);
        int iV = v(jM);
        int i10 = 0;
        boolean z10 = jO != 0;
        boolean z11 = iN != 0;
        boolean z12 = iU != 0;
        boolean z13 = (iW == 0 && iV == 0) ? false : true;
        if (z10) {
            sb2.append(jO);
            sb2.append('d');
            i10 = 1;
        }
        if (z11 || (z10 && (z12 || z13))) {
            int i11 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            sb2.append(iN);
            sb2.append('h');
            i10 = i11;
        }
        if (z12 || (z13 && (z11 || z10))) {
            int i12 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            sb2.append(iU);
            sb2.append('m');
            i10 = i12;
        }
        if (z13) {
            int i13 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            if (iW != 0 || z10 || z11 || z12) {
                e(j10, sb2, iW, iV, 9, "s", false);
            } else if (iV >= 1000000) {
                e(j10, sb2, iV / 1000000, iV % 1000000, 6, "ms", false);
            } else if (iV >= 1000) {
                e(j10, sb2, iV / 1000, iV % 1000, 3, "us", false);
            } else {
                sb2.append(iV);
                sb2.append("ns");
            }
            i10 = i13;
        }
        if (zE && i10 > 1) {
            sb2.insert(1, '(').append(')');
        }
        return sb2.toString();
    }

    public static final long N(long j10) {
        return d.i(-y(j10), ((int) j10) & 1);
    }

    public static final long d(long j10, long j11, long j12) {
        long jO = d.o(j12);
        long j13 = j11 + jO;
        boolean z10 = false;
        if (-4611686018426L <= j13 && j13 < 4611686018427L) {
            z10 = true;
        }
        if (!z10) {
            return d.j(n.p(j13, -4611686018427387903L, 4611686018427387903L));
        }
        return d.l(d.n(j13) + (j12 - d.n(jO)));
    }

    public static final void e(long j10, StringBuilder sb2, int i10, int i11, int i12, String str, boolean z10) {
        sb2.append(i10);
        if (i11 != 0) {
            sb2.append('.');
            String strD0 = d0.D0(String.valueOf(i11), i12, '0');
            int i13 = -1;
            int length = strD0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i14 = length - 1;
                    if (strD0.charAt(length) != '0') {
                        i13 = length;
                        break;
                    } else if (i14 < 0) {
                        break;
                    } else {
                        length = i14;
                    }
                }
            }
            int i15 = i13 + 1;
            if (z10 || i15 >= 3) {
                sb2.append((CharSequence) strD0, 0, ((i15 + 2) / 3) * 3);
                p.j(sb2, "append(...)");
            } else {
                sb2.append((CharSequence) strD0, 0, i15);
                p.j(sb2, "append(...)");
            }
        }
        sb2.append(str);
    }

    public static final /* synthetic */ b f(long j10) {
        return new b(j10);
    }

    public static int i(long j10, long j11) {
        long j12 = j10 ^ j11;
        if (j12 < 0 || (((int) j12) & 1) == 0) {
            return p.n(j10, j11);
        }
        int i10 = (((int) j10) & 1) - (((int) j11) & 1);
        return E(j10) ? -i10 : i10;
    }

    public static long j(long j10) {
        if (c.a()) {
            if (C(j10)) {
                long jY = y(j10);
                if (!(-4611686018426999999L <= jY && jY < 4611686018427000000L)) {
                    throw new AssertionError(y(j10) + " ns is out of nanoseconds range");
                }
            } else {
                long jY2 = y(j10);
                if (!(-4611686018427387903L <= jY2 && jY2 < 4611686018427387904L)) {
                    throw new AssertionError(y(j10) + " ms is out of milliseconds range");
                }
                long jY3 = y(j10);
                if (-4611686018426L <= jY3 && jY3 < 4611686018427L) {
                    throw new AssertionError(y(j10) + " ms is denormalized");
                }
            }
        }
        return j10;
    }

    public static boolean k(long j10, Object obj) {
        return (obj instanceof b) && j10 == ((b) obj).O();
    }

    public static final boolean l(long j10, long j11) {
        return j10 == j11;
    }

    public static final long m(long j10) {
        return E(j10) ? N(j10) : j10;
    }

    public static final int n(long j10) {
        if (D(j10)) {
            return 0;
        }
        return (int) (p(j10) % ((long) 24));
    }

    public static final long o(long j10) {
        return L(j10, DurationUnit.DAYS);
    }

    public static final long p(long j10) {
        return L(j10, DurationUnit.HOURS);
    }

    public static final long q(long j10) {
        return (B(j10) && A(j10)) ? y(j10) : L(j10, DurationUnit.MILLISECONDS);
    }

    public static final long r(long j10) {
        return L(j10, DurationUnit.MINUTES);
    }

    public static final long s(long j10) {
        long jY = y(j10);
        if (C(j10)) {
            return jY;
        }
        if (jY > 9223372036854L) {
            return Long.MAX_VALUE;
        }
        if (jY < -9223372036854L) {
            return Long.MIN_VALUE;
        }
        return d.n(jY);
    }

    public static final long t(long j10) {
        return L(j10, DurationUnit.SECONDS);
    }

    public static final int u(long j10) {
        if (D(j10)) {
            return 0;
        }
        return (int) (r(j10) % ((long) 60));
    }

    public static final int v(long j10) {
        if (D(j10)) {
            return 0;
        }
        return (int) (B(j10) ? d.n(y(j10) % ((long) 1000)) : y(j10) % ((long) 1000000000));
    }

    public static final int w(long j10) {
        if (D(j10)) {
            return 0;
        }
        return (int) (t(j10) % ((long) 60));
    }

    public static final DurationUnit x(long j10) {
        return C(j10) ? DurationUnit.NANOSECONDS : DurationUnit.MILLISECONDS;
    }

    public static final long y(long j10) {
        return j10 >> 1;
    }

    public static int z(long j10) {
        return Long.hashCode(j10);
    }

    public final /* synthetic */ long O() {
        return this.f6777b;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(b bVar) {
        return g(bVar.O());
    }

    public boolean equals(Object obj) {
        return k(this.f6777b, obj);
    }

    public int g(long j10) {
        return i(this.f6777b, j10);
    }

    public int hashCode() {
        return z(this.f6777b);
    }

    @NotNull
    public String toString() {
        return M(this.f6777b);
    }
}
