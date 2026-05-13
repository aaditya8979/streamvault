package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.p6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C3220p6 {
    public static byte[] A00;
    public static String[] A01 = {"wGfW8ZiAX", "98TYLpDb5H7FHIAHZpq8", "wurshRpA61WdSnRC2QEiiDdyeizCic8s", "6EmvqyT0A8GUtNQWPCztICrBXhcLnLDE", "uA", "uieozUeELQJ7BnvT2m7zVxZQuFK6e7wq", "WTc20BWixPig5ctZiuBGmbv8oTuxO5Xh", "dqopJSQqvI22NiiNvBghv0z0kBPWpT4p"};

    static {
        A04();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            int i14 = (bArrCopyOfRange[i13] ^ i12) ^ 28;
            if (A01[6].charAt(9) == 'Q') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[2] = "97APORAguQeQpweI2T85fGR4lID0xZM2";
            strArr[5] = "RVlAHF7VxslCalKX2MZme1MZcTv0vxDz";
            bArrCopyOfRange[i13] = (byte) i14;
        }
        return new String(bArrCopyOfRange);
    }

    public static String A01(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = C3220p6.class.getName();
        int i10 = 0;
        while (!stackTrace[i10].getClassName().equals(name)) {
            i10++;
        }
        while (stackTrace[i10].getClassName().equals(name)) {
            i10++;
        }
        StackTraceElement stackTraceElement = stackTrace[i10];
        return A00(30, 48, 106) + stackTraceElement.getClassName() + A00(29, 1, 3) + stackTraceElement.getMethodName() + A00(17, 12, 47) + str;
    }

    public static <T extends Throwable> T A02(T t10) {
        return (T) A03(t10, C3220p6.class.getName());
    }

    public static <T extends Throwable> T A03(T t10, String str) {
        StackTraceElement[] stackTrace = t10.getStackTrace();
        int length = stackTrace.length;
        int i10 = -1;
        for (int i11 = 0; i11 < length; i11++) {
            if (str.equals(stackTrace[i11].getClassName())) {
                i10 = i11;
            }
        }
        t10.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i10 + 1, length));
        if (A01[6].charAt(9) == 'Q') {
            throw new RuntimeException();
        }
        A01[7] = "7EM55IZD6WJUcGDkvpLhGBZC82NS7r4s";
        return t10;
    }

    public static void A04() {
        A00 = new byte[]{20, 89, 65, 71, 64, 20, 90, 91, 64, 20, 86, 81, 20, 90, 65, 88, 88, 31, 19, 67, 82, 65, 82, 94, 86, 71, 86, 65, 19, 49, 38, 23, 4, 23, 27, 19, 2, 19, 4, 86, 5, 6, 19, 21, 31, 16, 31, 19, 18, 86, 23, 5, 86, 24, 25, 24, 91, 24, 3, 26, 26, 86, 31, 5, 86, 24, 3, 26, 26, 76, 86, 27, 19, 2, 30, 25, 18, 86};
    }

    public static void A05() {
        throw ((NullPointerException) A02(new NullPointerException()));
    }

    public static void A06(Object obj) {
        if (obj == null) {
            A05();
            throw null;
        }
    }

    public static void A07(Object obj, String str) {
        if (obj == null) {
            A0A(str);
            throw null;
        }
    }

    public static void A08(Object obj, String str) {
        if (obj == null) {
            throw ((NullPointerException) A02(new NullPointerException(str + A00(0, 17, 40))));
        }
    }

    public static void A09(Object obj, String str) {
        if (obj == null) {
            A0B(str);
            throw null;
        }
    }

    public static void A0A(String str) {
        throw ((NullPointerException) A02(new NullPointerException(str)));
    }

    public static void A0B(String str) {
        throw ((NullPointerException) A02(new NullPointerException(A01(str))));
    }

    public static boolean A0C(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }
}
