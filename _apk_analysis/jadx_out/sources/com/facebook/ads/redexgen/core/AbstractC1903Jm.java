package com.facebook.ads.redexgen.core;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Jm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1903Jm {
    public static byte[] A00;
    public static String[] A01 = {"KgPme38LEDVaM0D12Uwlfvq6nYMDVVkT", "a5g98XiYqimDBheiX8ybcf7PetcT8W7U", "dRcctykKkiCtpnpKZqpaePhb1Qg1PkeN", "6JMbAfNKE0NkFS9oLsx1Zln6Fen7GSJu", "0ohFdoD3UqF2FgjtvUgt7lzB", "HqtC3No697vYpZ7G6OCOOOlSljo", "Ih90XUpH", "6OUjWPhHhDm3iVNi78UT7lOYQX351vXz"};

    static {
        A05();
    }

    public static C1901Jk A00(C1901Jk c1901Jk, Map<String, C1908Jr> map) {
        while (c1901Jk != null) {
            C1908Jr c1908JrA02 = A02(c1901Jk.A04, c1901Jk.A0H(), map);
            if (c1908JrA02 != null && c1908JrA02.A09() == 1) {
                return c1901Jk;
            }
            c1901Jk = c1901Jk.A03;
        }
        return null;
    }

    public static C1901Jk A01(C1901Jk c1901Jk, Map<String, C1908Jr> map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(c1901Jk);
        while (!arrayDeque.isEmpty()) {
            C1901Jk c1901Jk2 = (C1901Jk) arrayDeque.pop();
            C1908Jr c1908Jr = c1901Jk2.A04;
            String[] strArrA0H = c1901Jk2.A0H();
            if (A01[6].length() != 8) {
                throw new RuntimeException();
            }
            A01[6] = "prCmMBcG";
            C1908Jr c1908JrA02 = A02(c1908Jr, strArrA0H, map);
            if (c1908JrA02 != null && c1908JrA02.A09() == 3) {
                return c1901Jk2;
            }
            for (int iA0C = c1901Jk2.A0C() - 1; iA0C >= 0; iA0C--) {
                arrayDeque.push(c1901Jk2.A0D(iA0C));
            }
        }
        return null;
    }

    public static C1908Jr A02(C1908Jr c1908Jr, String[] strArr, Map<String, C1908Jr> map) {
        int i10 = 0;
        if (c1908Jr == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                C1908Jr c1908Jr2 = new C1908Jr();
                int length = strArr.length;
                while (i10 < length) {
                    c1908Jr2.A0O(map.get(strArr[i10]));
                    i10++;
                }
                return c1908Jr2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                String str = strArr[0];
                String[] strArr2 = A01;
                if (strArr2[1].charAt(10) != strArr2[7].charAt(10)) {
                    throw new RuntimeException();
                }
                A01[5] = "FXnyxRIFGSjHG1Q4pZ8iBycDDGv";
                return c1908Jr.A0O(map.get(str));
            }
            if (strArr != null) {
                int length2 = strArr.length;
                if (A01[2].charAt(10) == 'x') {
                    throw new RuntimeException();
                }
                A01[5] = "6UN5UNrVzg6BSs5KXnnHYvLLh5S";
                if (length2 > 1) {
                    int length3 = strArr.length;
                    while (i10 < length3) {
                        C1908Jr c1908Jr3 = map.get(strArr[i10]);
                        if (A01[5].length() != 27) {
                            throw new RuntimeException();
                        }
                        A01[2] = "LBM9N0gh5w8sQTAl6eCIViVepwnbqV6U";
                        c1908Jr.A0O(c1908Jr3);
                        i10++;
                    }
                    return c1908Jr;
                }
            }
        }
        return c1908Jr;
    }

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A01;
            if (strArr[3].charAt(23) != strArr[0].charAt(23)) {
                throw new RuntimeException();
            }
            A01[6] = "lLmUOaES";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 115);
            i13++;
        }
    }

    public static String A04(String str) {
        String strA03 = A03(1, 2, 53);
        String strA032 = A03(0, 1, 14);
        String strReplaceAll = str.replaceAll(strA03, strA032).replaceAll(A03(4, 5, 69), strA032);
        String strA033 = A03(3, 1, 6);
        return strReplaceAll.replaceAll(strA032, strA033).replaceAll(A03(77, 11, 123), strA033);
    }

    public static void A05() {
        if (A01[2].charAt(10) == 'x') {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[1] = "BbbzftLMD2m3WHwPv0bAANWrbX2mWIyE";
        strArr[7] = "7lYjBODxVBmaGubq4OQdXtxLEf46a0ab";
        A00 = new byte[]{-117, -75, -78, -103, -40, -30, -62, -40, -30, 64, 88, 86, 93, 93, 86, 91, 84, 13, 95, 98, 79, 102, 65, 82, 101, 97, 13, 91, 92, 81, 82, 13, 100, 86, 97, 85, 92, 98, 97, 13, 82, 101, 78, 80, 97, 89, 102, 13, 92, 91, 82, 13, 97, 82, 101, 97, 13, 80, 85, 86, 89, 81, 27, -10, 22, 15, 14, -12, 7, 16, 6, 7, 20, -9, 22, 11, 14, 73, 14, -9, 74, 102, 30, 48, -6, -5, 75, 25};
    }

    public static void A06(Spannable spannable, int i10, int i11, C1908Jr c1908Jr, C1901Jk c1901Jk, Map<String, C1908Jr> map, int i12) {
        C1901Jk c1901JkA01;
        C1908Jr c1908JrA02;
        int i13;
        int i14;
        if (c1908Jr.A0A() != -1) {
            spannable.setSpan(new StyleSpan(c1908Jr.A0A()), i10, i11, 33);
        }
        if (c1908Jr.A0b()) {
            spannable.setSpan(new StrikethroughSpan(), i10, i11, 33);
        }
        if (c1908Jr.A0c()) {
            spannable.setSpan(new UnderlineSpan(), i10, i11, 33);
        }
        if (c1908Jr.A0a()) {
            C3H.A00(spannable, new ForegroundColorSpan(c1908Jr.A06()), i10, i11, 33);
        }
        boolean zA0Z = c1908Jr.A0Z();
        if (A01[5].length() == 27) {
            A01[2] = "DOLHbyxdL1TIGmJ49PhqpcsDL7xIVQFO";
            if (zA0Z) {
                C3H.A00(spannable, new BackgroundColorSpan(c1908Jr.A05()), i10, i11, 33);
            }
            if (c1908Jr.A0W() != null) {
                C3H.A00(spannable, new TypefaceSpan(c1908Jr.A0W()), i10, i11, 33);
            }
            if (c1908Jr.A0D() != null) {
                C1897Jg c1897Jg = (C1897Jg) C3M.A01(c1908Jr.A0D());
                if (c1897Jg.A01 == -1) {
                    String[] strArr = A01;
                    if (strArr[1].charAt(10) == strArr[7].charAt(10)) {
                        A01[5] = "2MSbzH5cEcM3iPzp1Bk7CXgbIPr";
                        i13 = (i12 == 2 || i12 == 1) ? 3 : 1;
                        i14 = 1;
                    }
                } else {
                    i13 = c1897Jg.A01;
                    i14 = c1897Jg.A00;
                }
                C3H.A00(spannable, new C3149nu(i13, i14, c1897Jg.A02 == -2 ? 1 : c1897Jg.A02), i10, i11, 33);
            }
            switch (c1908Jr.A09()) {
                case 2:
                    C1901Jk c1901JkA00 = A00(c1901Jk, map);
                    if (c1901JkA00 != null && (c1901JkA01 = A01(c1901JkA00, map)) != null) {
                        if (c1901JkA01.A0C() == 1 && c1901JkA01.A0D(0).A08 != null) {
                            String str = (String) AbstractC15184a.A0f(c1901JkA01.A0D(0).A08);
                            C1908Jr c1908JrA022 = A02(c1901JkA01.A04, c1901JkA01.A0H(), map);
                            int iA08 = c1908JrA022 != null ? c1908JrA022.A08() : -1;
                            if (iA08 == -1 && (c1908JrA02 = A02(c1901JkA00.A04, c1901JkA00.A0H(), map)) != null) {
                                iA08 = c1908JrA02.A08();
                            }
                            spannable.setSpan(new C3150nv(str, iA08), i10, i11, 33);
                        } else {
                            AnonymousClass44.A06(A03(63, 14, 47), A03(9, 54, 122));
                        }
                    }
                    break;
                case 3:
                case 4:
                    spannable.setSpan(new C1894Jd(), i10, i11, 33);
                    break;
            }
            if (c1908Jr.A0Y()) {
                C3H.A00(spannable, new C3151nw(), i10, i11, 33);
            }
            switch (c1908Jr.A07()) {
                case 1:
                    C3H.A00(spannable, new AbsoluteSizeSpan((int) c1908Jr.A03(), true), i10, i11, 33);
                    return;
                case 2:
                    C3H.A00(spannable, new RelativeSizeSpan(c1908Jr.A03()), i10, i11, 33);
                    return;
                case 3:
                    C3H.A00(spannable, new RelativeSizeSpan(c1908Jr.A03() / 100.0f), i10, i11, 33);
                    return;
                default:
                    return;
            }
        }
        throw new RuntimeException();
    }

    public static void A07(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length < 0 || spannableStringBuilder.charAt(length) == '\n') {
            return;
        }
        spannableStringBuilder.append('\n');
    }
}
