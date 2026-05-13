package com.facebook.ads.redexgen.core;

import android.net.Uri;
import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.28, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AnonymousClass28 {
    public static byte[] A00;
    public static String[] A01 = {"sOrNj5Mdy4xi0kLPibyeSfiWQxOima4U", "xj48Y1LQ4ko", "eUY0SVXtYBJtN83XOuXTnKZfqvTHosXd", "paDpwp97WdTEiWCS91q7LcvTv3rNjzy2", "ATE3aiPBn3N", "z3W8kbtrqKRemiiFleAuTjlgcuTfL08m", "RcLeq9wITz99Drk9X88RRLyniy3v1DlZ", "ZhckCEJ2n6PA9tAuxk3fuT"};

    static {
        A04();
    }

    public static int A00(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(A03(4, 4, 104)) || lastPathSegment.endsWith(A03(29, 4, 31))) {
            String[] strArr = A01;
            if (strArr[2].charAt(16) == strArr[3].charAt(16)) {
                throw new RuntimeException();
            }
            A01[7] = "O7R9Zztw2xxmA6l6DOopzc";
            return 0;
        }
        if (lastPathSegment.endsWith(A03(8, 4, 10))) {
            return 1;
        }
        if (lastPathSegment.endsWith(A03(12, 5, 114)) || lastPathSegment.endsWith(A03(0, 4, 63))) {
            return 2;
        }
        if (lastPathSegment.endsWith(A03(17, 4, 55))) {
            return 3;
        }
        if (lastPathSegment.endsWith(A03(33, 5, 3))) {
            return 4;
        }
        if (lastPathSegment.endsWith(A03(38, 4, 112))) {
            return 5;
        }
        if (lastPathSegment.endsWith(A03(58, 4, 47)) || lastPathSegment.endsWith(A03(62, 5, 11)) || lastPathSegment.endsWith(A03(98, 4, 94))) {
            return 15;
        }
        int length = lastPathSegment.length();
        String strA03 = A03(67, 3, 84);
        if (lastPathSegment.startsWith(strA03, length - (strA03.length() + 1)) || lastPathSegment.endsWith(A03(118, 5, 33))) {
            return 6;
        }
        if (lastPathSegment.endsWith(A03(70, 4, 111))) {
            return 7;
        }
        String strA032 = A03(74, 4, 52);
        if (lastPathSegment.endsWith(strA032)) {
            return 8;
        }
        int length2 = lastPathSegment.length();
        String strA033 = A03(55, 3, 14);
        if (lastPathSegment.startsWith(strA033, length2 - (strA033.length() + 1)) || lastPathSegment.startsWith(strA032, lastPathSegment.length() - (strA032.length() + 1))) {
            return 8;
        }
        int length3 = lastPathSegment.length();
        String strA034 = A03(25, 4, 94);
        if (lastPathSegment.startsWith(strA034, length3 - (strA034.length() + 1))) {
            return 8;
        }
        int length4 = lastPathSegment.length();
        String strA035 = A03(87, 3, 52);
        if (lastPathSegment.startsWith(strA035, length4 - (strA035.length() + 1)) || lastPathSegment.endsWith(A03(90, 5, 86))) {
            return 9;
        }
        if (lastPathSegment.endsWith(A03(95, 3, 104)) || lastPathSegment.endsWith(A03(78, 5, 11)) || lastPathSegment.endsWith(A03(83, 4, 44)) || lastPathSegment.endsWith(A03(51, 4, 120))) {
            String[] strArr2 = A01;
            if (strArr2[0].charAt(20) != strArr2[5].charAt(20)) {
                String[] strArr3 = A01;
                strArr3[0] = "1wRaS2qHbg36RBVDXd8PcZR43XT5miNJ";
                strArr3[5] = "Vak8xJBIlxZA7GdMxsEEJaTmiAiwlk64";
                return 10;
            }
            String[] strArr4 = A01;
            strArr4[2] = "I1Nt4MatJPh6S3ZRGQ5jEYQUJm5selco";
            strArr4[3] = "WdisFFcNpT7R4JXqf39409YvWJDYYP5x";
            return 10;
        }
        String strA036 = A03(102, 3, 34);
        if (lastPathSegment.endsWith(strA036) || lastPathSegment.startsWith(strA036, lastPathSegment.length() - (strA036.length() + 1))) {
            return 11;
        }
        if (lastPathSegment.endsWith(A03(109, 4, 92)) || lastPathSegment.endsWith(A03(113, 5, 95))) {
            return 12;
        }
        if (lastPathSegment.endsWith(A03(105, 4, 64))) {
            return 13;
        }
        String[] strArr5 = A01;
        if (strArr5[0].charAt(20) == strArr5[5].charAt(20)) {
            throw new RuntimeException();
        }
        String[] strArr6 = A01;
        strArr6[2] = "SyPKArUiofAKtDYOeehIfh1mrOq04kE4";
        strArr6[3] = "xM2ROt7CFYmp4WclnHzUErJdjCgsEFHY";
        if (lastPathSegment.endsWith(A03(123, 7, 55))) {
            return 13;
        }
        if (lastPathSegment.endsWith(A03(47, 4, 127)) || lastPathSegment.endsWith(A03(42, 5, 112))) {
            return 14;
        }
        return lastPathSegment.endsWith(A03(21, 4, 25)) ? 16 : -1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0271 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0272 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0273 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0274 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0275 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0276 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0277 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0278 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0279 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x027a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x027b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x026c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x026d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x026e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x026f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0270 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d A[RETURN] */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A01(java.lang.String r24) {
        /*
            Method dump skipped, instruction units count: 804
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.AnonymousClass28.A01(java.lang.String):int");
    }

    public static int A02(Map<String, List<String>> map) {
        List<String> list = map.get(A03(130, 12, 34));
        return A01((list == null || list.isEmpty()) ? null : list.get(0));
    }

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 32);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{49, 126, 126, 124, 102, 41, 43, 123, 4, 75, 73, 30, 124, 51, 54, 38, 33, 57, 118, 122, 101, 23, 88, 79, 80, 80, 29, 19, 24, 17, 90, 92, 12, 13, 69, 79, 66, 64, 126, 54, 60, 38, 126, 58, 32, 53, 55, 113, 53, 47, 56, 118, 53, 106, 40, 0, 67, 26, 33, 98, 102, 107, 5, 70, 66, 79, 66, 90, 25, 31, 97, 34, 63, 124, 58, 121, 100, 32, 5, 70, 91, 78, 76, 34, 97, 124, 107, 58, 123, 115, 88, 25, 6, 3, 5, 102, 56, 59, 80, 13, 19, 24, 44, 118, 113, 78, 22, 20, 20, 82, 11, 29, 10, 81, 8, 30, 9, 26, 47, 118, 100, 99, 108, 57, 96, 114, 117, 97, 99, 99, 65, 109, 108, 118, 103, 108, 118, 47, 86, 123, 114, 103, 74, 91, 91, 71, 66, 72, 74, 95, 66, 68, 69, 4, 70, 91, 31, 18, 3, 3, 31, 26, 16, 18, 7, 26, 28, 29, 92, 4, 22, 17, 30, 54, 34, 51, 62, 56, 120, 100, 48, 39, 39, 86, 66, 83, 94, 88, 24, 86, 84, 4, 73, 93, 76, 65, 71, 7, 73, 75, 28, 2, 22, 7, 10, 12, 76, 2, 14, 17, 96, 116, 101, 104, 110, 46, 96, 108, 115, 44, 118, 99, 98, 118, 103, 106, 108, 44, 102, 98, 96, 48, 57, 45, 60, 49, 55, 119, 61, 57, 59, 107, 117, 50, 55, 59, 32, 52, 37, 40, 46, 110, 39, 45, 32, 34, 28, 8, 25, 20, 18, 82, 16, 20, 25, 20, 48, 36, 53, 56, 62, 126, 60, 33, 101, 85, 65, 80, 93, 91, 27, 89, 68, 81, 83, 34, 54, 39, ExifInterface.START_CODE, 44, 108, 44, 36, 36, 40, 60, 45, 32, 38, 102, 62, 40, 63, 117, 97, 112, 125, 123, 59, 99, 113, 118, 121, 56, 44, 61, 48, 54, 118, 33, 116, 52, 56, 45, 43, 54, ExifInterface.START_CODE, 50, 56, 84, 80, 92, 90, 88, 18, 87, 77, 88, 90, 69, 84, 73, 69, 30, 71, 69, 69, 36, 59, 54, 55, 61, 125, 63, 34, 96, 34, 32, 63, 50, 51, 57, 121, 59, 38, 100, 34, 55, 40, 37, 36, 46, 110, 44, 49, 117, 113, 110, 99, 98, 104, 40, 112, 98, 101, 106, 101, 122, 119, 118, 124, 60, 107, 62, 117, 127, 101, 104, 119, 122, 123, 113, 49, 102, 51, 115, 127, 106, 108, 113, 109, 117, 127, 50, 45, 32, 33, 43, 107, 60, 105, 41, 55, 50, 45, 32, 33, 43};
    }
}
