package com.facebook.ads.redexgen.core;

import android.content.Context;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class X7 {
    public static byte[] A00;
    public static String[] A01 = {"LplfTEYRnODnDpz21EneRZRsMargZTNK", "2NrlLG7hqMfWnzI4aYc74QPIxJ4DJ1XR", "L7pmDhfbtl8pdMobHzydLQ1D6YOazgIb", "V9Kuj32Ww6lLhCXMI4XEd9rHt60G9lJq", "k0plFnx6zt0D5xnpu3Hlko5", "WGZsYEfxfTD4T7Cqe3yCHw86dz09xOKF", "rh2k8IOHNldhKVbVonTuZ6bN28ke0n", "kkjOWDxiYS6HSpJcTpvH6ub4oru0qlUQ"};
    public static final Pattern A02;

    static {
        A07();
        A02 = Pattern.compile(A02(0, 24, 9));
    }

    public static String A00() {
        return A06(new Exception(A02(24, 19, 18)), -1, -1, false);
    }

    public static String A01(int i10) {
        if (i10 > 0 && new Random().nextFloat() < 1.0f / i10) {
            return A00();
        }
        return null;
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 44);
        }
        return new String(bArrCopyOfRange);
    }

    public static String A03(Context context, Throwable th2) {
        return A06(th2, U7.A0M(context), U7.A03(context), U7.A1c(context));
    }

    public static String A04(String str) {
        Matcher matcher = A02.matcher(str);
        return matcher.matches() ? matcher.group(1) : str;
    }

    public static String A06(Throwable th2, int i10, int i11, boolean z10) {
        String strA02 = A02(0, 0, 105);
        if (th2 == null) {
            return strA02;
        }
        try {
            C2041Ox c2041Ox = new C2041Ox();
            X5 c2040Ow = c2041Ox;
            String[] strArr = A01;
            if (strArr[4].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "oxxlcYcFfaMihpA7yH6yiqF";
            strArr2[6] = "gkLsRpbpRAovdKGTxU7IYJzRyz6pLt";
            if (i11 >= 0) {
                c2040Ow = new C2039Ov(c2040Ow, i11);
            }
            if (i10 >= 0) {
                c2040Ow = new C2038Ou(c2040Ow, i10, i10);
            }
            if (z10) {
                c2040Ow = new C2040Ow(c2040Ow);
            }
            C2042Oy c2042Oy = new C2042Oy(c2041Ox, 1, c2040Ow);
            th2.printStackTrace(new PrintWriter(new X6(c2042Oy)));
            c2042Oy.flush();
            return c2041Ox.toString();
        } catch (Exception unused) {
            return strA02;
        }
    }

    public static void A07() {
        A00 = new byte[]{13, 121, 86, 14, 68, 81, 121, 86, 14, 126, 68, 8, 95, 11, 120, 14, 12, 126, 100, 8, 127, 120, 11, 15, 125, 75, 76, 76, 91, 80, 74, 30, 77, 74, 95, 93, 85, 30, 74, 76, 95, 93, 91, 77, 65, 67, 0, 72, 79, 77, 75, 76, 65, 65, 69, 0, 79, 74, 93};
    }

    public static boolean A08(X4 x42) {
        String strA02 = x42.A02();
        if (strA02 == null) {
            return false;
        }
        boolean zA0A = A0A(strA02);
        if (A01[7].charAt(20) == 'o') {
            throw new RuntimeException();
        }
        A01[2] = "GqDFUg33w18rdOydcZHrPduzmWx6ZxUu";
        if (zA0A) {
            return true;
        }
        for (String str : x42.A01()) {
            if (A01[2].charAt(10) == '8') {
                String[] strArr = A01;
                strArr[5] = "ZCUrIEQiGOY9U2nVCEFSNgqRdbKvDffQ";
                strArr[0] = "2Hs1eEyuwWDgIwWONAgBlK6IqUqjA257";
                if (A0A(str)) {
                    return true;
                }
            } else if (A0A(str)) {
                return true;
            }
        }
        Iterator<String> it = x42.A00().iterator();
        while (it.hasNext()) {
            if (A0A(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean A0A(String str) {
        return str.contains(A02(43, 16, 2));
    }
}
