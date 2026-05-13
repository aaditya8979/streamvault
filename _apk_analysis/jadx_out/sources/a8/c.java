package a8;

import y7.l;

/* JADX INFO: compiled from: DoubleUtils.java */
/* JADX INFO: loaded from: classes4.dex */
public final class c {
    public static long a(double d10) {
        l.e(b(d10), "not a normal value");
        int exponent = Math.getExponent(d10);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d10) & 4503599627370495L;
        return exponent == -1023 ? jDoubleToRawLongBits << 1 : jDoubleToRawLongBits | 4503599627370496L;
    }

    public static boolean b(double d10) {
        return Math.getExponent(d10) <= 1023;
    }
}
