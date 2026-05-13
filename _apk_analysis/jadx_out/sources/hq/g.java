package hq;

import hq.e;
import sq.o;

/* JADX INFO: compiled from: BufferUtil.java */
/* JADX INFO: loaded from: classes3.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f63597a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f63598b = {1000000000, 100000000, 10000000, 1000000, 100000, 10000, 1000, 100, 10, 1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f63599c = {268435456, 16777216, 1048576, 65536, 4096, 256, 16, 1};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long[] f63600d = {1000000000000000000L, 100000000000000000L, 10000000000000000L, 1000000000000000L, 100000000000000L, 10000000000000L, 1000000000000L, 100000000000L, 10000000000L, 1000000000, 100000000, 10000000, 1000000, 100000, 10000, 1000, 100, 10, 1};

    public static boolean a(d dVar, d dVar2) {
        if (dVar.length() > dVar2.length()) {
            return false;
        }
        int index = dVar2.getIndex();
        int index2 = dVar.getIndex();
        while (index2 < dVar.T()) {
            int i10 = index + 1;
            if (dVar.Q(index2) != dVar2.Q(index)) {
                return false;
            }
            index2++;
            index = i10;
        }
        return true;
    }

    public static void b(d dVar, int i10) {
        if (i10 == 0) {
            int index = dVar.getIndex() - 1;
            dVar.I(index, (byte) 48);
            dVar.l0(index);
            return;
        }
        boolean z10 = false;
        if (i10 < 0) {
            z10 = true;
            i10 = -i10;
        }
        int index2 = dVar.getIndex();
        while (i10 > 0) {
            int i11 = i10 & 15;
            i10 >>= 4;
            index2--;
            dVar.I(index2, f63597a[i11]);
        }
        if (z10) {
            index2--;
            dVar.I(index2, (byte) 45);
        }
        dVar.l0(index2);
    }

    public static void c(d dVar) {
        dVar.put((byte) 13);
        dVar.put((byte) 10);
    }

    public static void d(d dVar, long j10) {
        if (j10 < 0) {
            dVar.put((byte) 45);
            if (j10 == Long.MIN_VALUE) {
                dVar.put((byte) 57);
                j10 = 223372036854775808L;
            } else {
                j10 = -j10;
            }
        }
        if (j10 < 10) {
            dVar.put(f63597a[(int) j10]);
            return;
        }
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            long[] jArr = f63600d;
            if (i10 >= jArr.length) {
                return;
            }
            long j11 = jArr[i10];
            if (j10 >= j11) {
                long j12 = j10 / j11;
                dVar.put(f63597a[(int) j12]);
                j10 -= j12 * jArr[i10];
                z10 = true;
            } else if (z10) {
                dVar.put((byte) 48);
            }
            i10++;
        }
    }

    public static void e(d dVar, int i10) {
        if (i10 < 0) {
            dVar.put((byte) 45);
            if (i10 == Integer.MIN_VALUE) {
                dVar.put((byte) 56);
                dVar.put((byte) 48);
                dVar.put((byte) 48);
                dVar.put((byte) 48);
                dVar.put((byte) 48);
                dVar.put((byte) 48);
                dVar.put((byte) 48);
                dVar.put((byte) 48);
                return;
            }
            i10 = -i10;
        }
        if (i10 < 16) {
            dVar.put(f63597a[i10]);
            return;
        }
        int i11 = 0;
        boolean z10 = false;
        while (true) {
            int[] iArr = f63599c;
            if (i11 >= iArr.length) {
                return;
            }
            int i12 = iArr[i11];
            if (i10 >= i12) {
                int i13 = i10 / i12;
                dVar.put(f63597a[i13]);
                i10 -= i13 * iArr[i11];
                z10 = true;
            } else if (z10) {
                dVar.put((byte) 48);
            }
            i11++;
        }
    }

    public static String f(d dVar) {
        return dVar instanceof e.a ? dVar.toString() : dVar.P(o.f84552d);
    }

    public static d g(long j10) {
        h hVar = new h(32);
        d(hVar, j10);
        return hVar;
    }

    public static int h(d dVar) {
        boolean z10 = false;
        int i10 = 0;
        boolean z11 = false;
        for (int index = dVar.getIndex(); index < dVar.T(); index++) {
            byte bQ = dVar.Q(index);
            if (bQ > 32) {
                if (bQ >= 48 && bQ <= 57) {
                    i10 = (i10 * 10) + (bQ - 48);
                    z10 = true;
                } else {
                    if (bQ != 45 || z10) {
                        break;
                    }
                    z11 = true;
                }
            } else {
                if (z10) {
                    break;
                }
            }
        }
        if (z10) {
            return z11 ? -i10 : i10;
        }
        throw new NumberFormatException(dVar.toString());
    }

    public static long i(d dVar) {
        boolean z10 = false;
        long j10 = 0;
        boolean z11 = false;
        for (int index = dVar.getIndex(); index < dVar.T(); index++) {
            byte bQ = dVar.Q(index);
            if (bQ > 32) {
                if (bQ >= 48 && bQ <= 57) {
                    j10 = (j10 * 10) + ((long) (bQ - 48));
                    z10 = true;
                } else {
                    if (bQ != 45 || z10) {
                        break;
                    }
                    z11 = true;
                }
            } else {
                if (z10) {
                    break;
                }
            }
        }
        if (z10) {
            return z11 ? -j10 : j10;
        }
        throw new NumberFormatException(dVar.toString());
    }
}
