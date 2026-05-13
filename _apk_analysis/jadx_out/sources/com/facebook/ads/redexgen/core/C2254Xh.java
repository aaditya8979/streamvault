package com.facebook.ads.redexgen.core;

import android.app.Activity;
import android.app.KeyguardManager;
import android.util.Log;
import android.view.Window;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2254Xh {
    public static byte[] A00;
    public static String[] A01 = {"cuUzkH3QdbH3cJp2RF", "kphHRdIOrc0r15jsPfyG2Jy", "YnKzEWoXtdzuP95TROGjIP", "O6qhnuon9ci7avdCdn", "JszjlqJauoZ2AkEe", "2iwMqZkAQKEhQz1BEXGjAw", "tv2fwm9vcfvUl0RC5d9GYW3eB7CSJdU", "VWHYkG5jfvcYH9oXKfgyVS7MLxk2p9iO"};
    public static final String A02;

    static {
        A02();
        A02 = C2254Xh.class.getSimpleName();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A01;
            if (strArr[3].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[3] = "jOZxNa7dXP1jVDPJoO";
            strArr2[0] = "z9aGKGtKVlVAFuhw7X";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 48);
            i13++;
        }
    }

    public static Map<String, String> A01(@Nullable C2529dL c2529dL) {
        Window window;
        HashMap map = new HashMap();
        if (c2529dL == null) {
            return map;
        }
        try {
            map.put(A00(40, 3, 0), String.valueOf(A04(c2529dL)));
            Activity activityA0E = c2529dL.A0E();
            if (activityA0E != null && (window = activityA0E.getWindow()) != null) {
                int i10 = window.getAttributes().flags;
                map.put(A00(58, 2, 39), Integer.toString(window.getAttributes().type));
                int i11 = 4194304 & i10;
                String strA00 = A00(1, 1, 118);
                String strA002 = A00(0, 1, 79);
                map.put(A00(48, 5, 39), i11 > 0 ? strA00 : strA002);
                int i12 = 524288 & i10;
                if (A01[6].length() == 6) {
                    throw new RuntimeException();
                }
                A01[7] = "5jjmsuOSeLdxH4ITovSaNkR7tPO8fpvx";
                if (i12 <= 0) {
                    strA00 = strA002;
                }
                map.put(A00(53, 5, 50), strA00);
            }
        } catch (Exception e10) {
            Log.e(A02, A00(2, 30, 15), e10);
            c2529dL.A08().AAy(A00(43, 5, 77), AbstractC2142Sv.A2T, new C2143Sw(e10));
        }
        return map;
    }

    public static void A02() {
        A00 = new byte[]{79, 119, 122, 71, 92, 90, 79, 75, 86, 80, 81, 31, 86, 81, 31, 72, 86, 81, 91, 80, 72, 31, 86, 81, 89, 80, 31, 92, 87, 90, 92, 84, 98, 108, 112, 110, 124, 104, 123, 109, 91, 87, 66, 15, 20, 14, 22, 4, 96, 113, 115, 124, 112, 117, 100, 113, 117, 110, 96, 99};
    }

    public static boolean A03(C2529dL c2529dL) {
        return !XQ.A04(A01(c2529dL));
    }

    public static boolean A04(C2529dL c2529dL) {
        KeyguardManager keyguardManager = (KeyguardManager) c2529dL.getSystemService(A00(32, 8, 57));
        return keyguardManager != null && keyguardManager.inKeyguardRestrictedInputMode();
    }
}
