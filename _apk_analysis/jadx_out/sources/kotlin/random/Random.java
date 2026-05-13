package kotlin.random;

import java.io.Serializable;
import ln.b;
import org.jetbrains.annotations.NotNull;
import tn.i;
import tn.p;
import xn.c;
import xn.d;

/* JADX INFO: compiled from: Random.kt */
/* JADX INFO: loaded from: classes12.dex */
public abstract class Random {

    @NotNull
    public static final Default Default = new Default(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Random f73237b = b.f73875a.b();

    /* JADX INFO: compiled from: Random.kt */
    public static final class Default extends Random implements Serializable {

        /* JADX INFO: compiled from: Random.kt */
        public static final class Serialized implements Serializable {

            @NotNull
            public static final Serialized INSTANCE = new Serialized();
            private static final long serialVersionUID = 0;

            private Serialized() {
            }

            private final Object readResolve() {
                return Random.Default;
            }
        }

        private Default() {
        }

        public /* synthetic */ Default(i iVar) {
            this();
        }

        private final Object writeReplace() {
            return Serialized.INSTANCE;
        }

        @Override // kotlin.random.Random
        public int nextBits(int i10) {
            return Random.f73237b.nextBits(i10);
        }

        @Override // kotlin.random.Random
        public boolean nextBoolean() {
            return Random.f73237b.nextBoolean();
        }

        @Override // kotlin.random.Random
        @NotNull
        public byte[] nextBytes(int i10) {
            return Random.f73237b.nextBytes(i10);
        }

        @Override // kotlin.random.Random
        @NotNull
        public byte[] nextBytes(@NotNull byte[] bArr) {
            p.k(bArr, "array");
            return Random.f73237b.nextBytes(bArr);
        }

        @Override // kotlin.random.Random
        @NotNull
        public byte[] nextBytes(@NotNull byte[] bArr, int i10, int i11) {
            p.k(bArr, "array");
            return Random.f73237b.nextBytes(bArr, i10, i11);
        }

        @Override // kotlin.random.Random
        public double nextDouble() {
            return Random.f73237b.nextDouble();
        }

        @Override // kotlin.random.Random
        public double nextDouble(double d10) {
            return Random.f73237b.nextDouble(d10);
        }

        @Override // kotlin.random.Random
        public double nextDouble(double d10, double d11) {
            return Random.f73237b.nextDouble(d10, d11);
        }

        @Override // kotlin.random.Random
        public float nextFloat() {
            return Random.f73237b.nextFloat();
        }

        @Override // kotlin.random.Random
        public int nextInt() {
            return Random.f73237b.nextInt();
        }

        @Override // kotlin.random.Random
        public int nextInt(int i10) {
            return Random.f73237b.nextInt(i10);
        }

        @Override // kotlin.random.Random
        public int nextInt(int i10, int i11) {
            return Random.f73237b.nextInt(i10, i11);
        }

        @Override // kotlin.random.Random
        public long nextLong() {
            return Random.f73237b.nextLong();
        }

        @Override // kotlin.random.Random
        public long nextLong(long j10) {
            return Random.f73237b.nextLong(j10);
        }

        @Override // kotlin.random.Random
        public long nextLong(long j10, long j11) {
            return Random.f73237b.nextLong(j10, j11);
        }
    }

    public static /* synthetic */ byte[] nextBytes$default(Random random, byte[] bArr, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: nextBytes");
        }
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length;
        }
        return random.nextBytes(bArr, i10, i11);
    }

    public abstract int nextBits(int i10);

    public boolean nextBoolean() {
        return nextBits(1) != 0;
    }

    @NotNull
    public byte[] nextBytes(int i10) {
        return nextBytes(new byte[i10]);
    }

    @NotNull
    public byte[] nextBytes(@NotNull byte[] bArr) {
        p.k(bArr, "array");
        return nextBytes(bArr, 0, bArr.length);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001d  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] nextBytes(@org.jetbrains.annotations.NotNull byte[] r7, int r8, int r9) {
        /*
            r6 = this;
            java.lang.String r0 = "array"
            tn.p.k(r7, r0)
            r0 = 1
            r1 = 0
            if (r8 < 0) goto Le
            int r2 = r7.length
            if (r8 > r2) goto Le
            r2 = r0
            goto Lf
        Le:
            r2 = r1
        Lf:
            if (r2 == 0) goto L1d
            if (r9 < 0) goto L18
            int r2 = r7.length
            if (r9 > r2) goto L18
            r2 = r0
            goto L19
        L18:
            r2 = r1
        L19:
            if (r2 == 0) goto L1d
            r2 = r0
            goto L1e
        L1d:
            r2 = r1
        L1e:
            java.lang.String r3 = "fromIndex ("
            if (r2 == 0) goto L8c
            if (r8 > r9) goto L25
            goto L26
        L25:
            r0 = r1
        L26:
            if (r0 == 0) goto L66
            int r0 = r9 - r8
            int r0 = r0 / 4
            r2 = r1
        L2d:
            if (r2 >= r0) goto L50
            int r3 = r6.nextInt()
            byte r4 = (byte) r3
            r7[r8] = r4
            int r4 = r8 + 1
            int r5 = r3 >>> 8
            byte r5 = (byte) r5
            r7[r4] = r5
            int r4 = r8 + 2
            int r5 = r3 >>> 16
            byte r5 = (byte) r5
            r7[r4] = r5
            int r4 = r8 + 3
            int r3 = r3 >>> 24
            byte r3 = (byte) r3
            r7[r4] = r3
            int r8 = r8 + 4
            int r2 = r2 + 1
            goto L2d
        L50:
            int r9 = r9 - r8
            int r0 = r9 * 8
            int r0 = r6.nextBits(r0)
        L57:
            if (r1 >= r9) goto L65
            int r2 = r8 + r1
            int r3 = r1 * 8
            int r3 = r0 >>> r3
            byte r3 = (byte) r3
            r7[r2] = r3
            int r1 = r1 + 1
            goto L57
        L65:
            return r7
        L66:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r3)
            r7.append(r8)
            java.lang.String r8 = ") must be not greater than toIndex ("
            r7.append(r8)
            r7.append(r9)
            java.lang.String r8 = ")."
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        L8c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r0.append(r8)
            java.lang.String r8 = ") or toIndex ("
            r0.append(r8)
            r0.append(r9)
            java.lang.String r8 = ") are out of range: 0.."
            r0.append(r8)
            int r7 = r7.length
            r0.append(r7)
            r7 = 46
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.random.Random.nextBytes(byte[], int, int):byte[]");
    }

    public double nextDouble() {
        return c.a(nextBits(26), nextBits(27));
    }

    public double nextDouble(double d10) {
        return nextDouble(0.0d, d10);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public double nextDouble(double r10, double r12) {
        /*
            r9 = this;
            xn.d.b(r10, r12)
            double r0 = r12 - r10
            boolean r2 = java.lang.Double.isInfinite(r0)
            if (r2 == 0) goto L3a
            double r2 = java.lang.Math.abs(r10)
            r4 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 1
            r6 = 0
            if (r2 > 0) goto L1c
            r2 = r3
            goto L1d
        L1c:
            r2 = r6
        L1d:
            if (r2 == 0) goto L3a
            double r7 = java.lang.Math.abs(r12)
            int r2 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r2 > 0) goto L28
            goto L29
        L28:
            r3 = r6
        L29:
            if (r3 == 0) goto L3a
            double r0 = r9.nextDouble()
            r2 = 2
            double r2 = (double) r2
            double r4 = r12 / r2
            double r2 = r10 / r2
            double r4 = r4 - r2
            double r0 = r0 * r4
            double r10 = r10 + r0
            double r10 = r10 + r0
            goto L40
        L3a:
            double r2 = r9.nextDouble()
            double r2 = r2 * r0
            double r10 = r10 + r2
        L40:
            int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r0 < 0) goto L4a
            r10 = -4503599627370496(0xfff0000000000000, double:-Infinity)
            double r10 = java.lang.Math.nextAfter(r12, r10)
        L4a:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.random.Random.nextDouble(double, double):double");
    }

    public float nextFloat() {
        return nextBits(24) / 1.6777216E7f;
    }

    public int nextInt() {
        return nextBits(32);
    }

    public int nextInt(int i10) {
        return nextInt(0, i10);
    }

    public int nextInt(int i10, int i11) {
        int iNextInt;
        int i12;
        int iNextBits;
        int iNextInt2;
        boolean z10;
        d.c(i10, i11);
        int i13 = i11 - i10;
        if (i13 > 0 || i13 == Integer.MIN_VALUE) {
            if (((-i13) & i13) == i13) {
                iNextBits = nextBits(d.e(i13));
            } else {
                do {
                    iNextInt = nextInt() >>> 1;
                    i12 = iNextInt % i13;
                } while ((iNextInt - i12) + (i13 - 1) < 0);
                iNextBits = i12;
            }
            return i10 + iNextBits;
        }
        do {
            iNextInt2 = nextInt();
            z10 = false;
            if (i10 <= iNextInt2 && iNextInt2 < i11) {
                z10 = true;
            }
        } while (!z10);
        return iNextInt2;
    }

    public long nextLong() {
        return (((long) nextInt()) << 32) + ((long) nextInt());
    }

    public long nextLong(long j10) {
        return nextLong(0L, j10);
    }

    public long nextLong(long j10, long j11) {
        long jNextLong;
        boolean z10;
        long jNextLong2;
        long j12;
        long jNextBits;
        int iNextInt;
        d.d(j10, j11);
        long j13 = j11 - j10;
        if (j13 <= 0) {
            do {
                jNextLong = nextLong();
                z10 = false;
                if (j10 <= jNextLong && jNextLong < j11) {
                    z10 = true;
                }
            } while (!z10);
            return jNextLong;
        }
        if (((-j13) & j13) == j13) {
            int i10 = (int) j13;
            int i11 = (int) (j13 >>> 32);
            if (i10 != 0) {
                iNextInt = nextBits(d.e(i10));
            } else if (i11 == 1) {
                iNextInt = nextInt();
            } else {
                jNextBits = (((long) nextBits(d.e(i11))) << 32) + (((long) nextInt()) & 4294967295L);
            }
            jNextBits = ((long) iNextInt) & 4294967295L;
        } else {
            do {
                jNextLong2 = nextLong() >>> 1;
                j12 = jNextLong2 % j13;
            } while ((jNextLong2 - j12) + (j13 - 1) < 0);
            jNextBits = j12;
        }
        return j10 + jNextBits;
    }
}
