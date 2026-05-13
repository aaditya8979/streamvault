package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class JW {
    public static byte[] A0B;
    public static String[] A0C = {"ytMqT9NHYtHO", "ayDrBXmYpST", "PlkLAMptHTEQbTP2JBx8IVhZrr1OLjmr", "bsyNsbAKTDWthILnLFbT9XBAfe1JwY0A", "7ooEejyrqYW6", "qPz9rN", "uQjyiEFGwynd0EfS97vi0PnYLnL7ypAQ", "fkOqnZo8h0umFuLkeHHFLjLqaxMuEadl"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;

    static {
        A02();
    }

    public JW(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20) {
        this.A06 = i10;
        this.A00 = i11;
        this.A08 = i12;
        this.A07 = i13;
        this.A03 = i14;
        this.A01 = i15;
        this.A04 = i16;
        this.A0A = i17;
        this.A09 = i18;
        this.A02 = i19;
        this.A05 = i20;
    }

    public static JW A00(String str) {
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        int i15 = -1;
        int i16 = -1;
        int i17 = -1;
        int i18 = -1;
        int i19 = -1;
        String[] strArrSplit = TextUtils.split(str.substring(A01(1, 7, 3).length()), A01(0, 1, 71));
        int i20 = 0;
        while (true) {
            byte b10 = -1;
            if (i20 >= strArrSplit.length) {
                if (i10 != -1) {
                    return new JW(i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, strArrSplit.length);
                }
                return null;
            }
            String strA01 = AbstractC2836iY.A01(strArrSplit[i20].trim());
            switch (strA01.hashCode()) {
                case -1178781136:
                    if (strA01.equals(A01(40, 6, 33))) {
                        b10 = 6;
                    }
                    break;
                case -1026963764:
                    if (strA01.equals(A01(85, 9, 18))) {
                        b10 = 7;
                    }
                    break;
                case -192095652:
                    if (strA01.equals(A01(76, 9, 49))) {
                        b10 = 8;
                    }
                    break;
                case -70925746:
                    if (strA01.equals(A01(63, 13, 49))) {
                        b10 = 2;
                    }
                    break;
                case 3029637:
                    if (strA01.equals(A01(17, 4, 40))) {
                        b10 = 5;
                    }
                    break;
                case 3373707:
                    if (strA01.equals(A01(46, 4, 52))) {
                        b10 = 0;
                    }
                    break;
                case 366554320:
                    String[] strArr = A0C;
                    if (strArr[2].charAt(26) != strArr[3].charAt(26)) {
                        throw new RuntimeException();
                    }
                    A0C[7] = "KkotiNXx90oMvgOaVjUCxZkwY6iD9aVw";
                    if (strA01.equals(A01(32, 8, 81))) {
                        b10 = 4;
                    }
                    break;
                case 767321349:
                    if (strA01.equals(A01(21, 11, 89))) {
                        b10 = 9;
                    }
                    break;
                case 1767875043:
                    if (strA01.equals(A01(8, 9, 11))) {
                        b10 = 1;
                    }
                    break;
                case 1988365454:
                    if (strA01.equals(A01(50, 13, 1))) {
                        b10 = 3;
                    }
                    break;
            }
            switch (b10) {
                case 0:
                    i10 = i20;
                    break;
                case 1:
                    i11 = i20;
                    break;
                case 2:
                    i12 = i20;
                    break;
                case 3:
                    i13 = i20;
                    break;
                case 4:
                    i14 = i20;
                    break;
                case 5:
                    i15 = i20;
                    break;
                case 6:
                    i16 = i20;
                    break;
                case 7:
                    i17 = i20;
                    break;
                case 8:
                    i18 = i20;
                    break;
                case 9:
                    i19 = i20;
                    break;
            }
            i20++;
        }
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 69);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A0B = new byte[]{-72, -114, -73, -70, -75, -87, -68, -126, -79, -68, -71, -73, -66, -67, -75, -66, -60, -49, -36, ExifInterface.MARKER_EOI, -47, 0, 13, 16, 2, 3, 16, 17, 18, 23, 10, 3, -4, 5, 4, 10, 9, -1, 16, -5, -49, -38, -57, -46, -49, -55, -25, -38, -26, -34, -75, -69, -70, -78, -81, -76, -85, -87, -75, -78, -75, -69, -72, -26, -24, -33, -29, -41, -24, -17, ExifInterface.MARKER_EOI, -27, -30, -27, -21, -24, -23, -22, -24, -33, ExifInterface.MARKER_APP1, -37, -27, -21, -22, -52, -59, -69, -68, -55, -61, -64, -59, -68};
    }
}
