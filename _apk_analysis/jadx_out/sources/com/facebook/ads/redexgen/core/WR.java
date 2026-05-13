package com.facebook.ads.redexgen.core;

import com.facebook.ads.ExtraHints;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.RewardedVideoAd;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class WR {
    public static byte[] A00;

    static {
        A04();
    }

    public static int A00(C2529dL c2529dL, int i10) {
        return AbstractC2201Ve.A00(c2529dL).getInt(A01(0, 21, 52), i10);
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 32);
        }
        return new String(bArrCopyOfRange);
    }

    public static String A02(C2529dL c2529dL, String str) {
        int iA00 = A00(c2529dL, -1);
        if (iA00 == -1) {
            return null;
        }
        try {
            return new ExtraHints.Builder().extraData(A03(str, A01(47, 14, 54), Integer.valueOf(iA00))).build().getHints();
        } catch (JSONException unused) {
            return null;
        }
    }

    public static String A03(String str, String str2, Object obj) throws JSONException {
        String strA01 = A01(61, 2, 93);
        if (str != null) {
            strA01 = new JSONObject(str).getJSONObject(A01(42, 5, 105)).optString(A01(32, 10, 55), strA01);
        }
        JSONObject jSONObject = new JSONObject(strA01);
        jSONObject.put(str2, obj);
        return jSONObject.toString();
    }

    public static void A04() {
        A00 = new byte[]{-92, -90, -103, -102, -77, -94, -87, -95, -77, -107, -104, -89, -77, -94, -93, -77, -105, -100, -107, -99, -94, -115, -117, -99, -115, -117, -114, -113, -114, -119, -117, -114, -68, -49, -53, -55, -72, -74, -69, -72, -53, -72, -15, -14, -9, -3, -4, -60, -59, -60, -71, -66, -73, -65, -60, -69, -70, -75, -73, -70, -55, -8, -6};
    }

    public static boolean A05(String str) throws JSONException {
        return str != null && new JSONObject(new JSONObject(str).getJSONObject(A01(42, 5, 105)).optString(A01(32, 10, 55), A01(61, 2, 93))).optBoolean(A01(21, 11, 10), false);
    }

    public final InterstitialAd A06(C2529dL c2529dL, String str, String str2) {
        if (c2529dL == null) {
            return null;
        }
        try {
            InterstitialAd interstitialAd = new InterstitialAd(c2529dL, str);
            interstitialAd.setExtraHints(new ExtraHints.Builder().extraData(A03(str2, A01(21, 11, 10), true)).build());
            return interstitialAd;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final RewardedVideoAd A07(C2529dL c2529dL, String str, String str2) {
        if (c2529dL == null) {
            return null;
        }
        try {
            RewardedVideoAd rewardedVideoAd = new RewardedVideoAd(c2529dL, str);
            rewardedVideoAd.setExtraHints(new ExtraHints.Builder().extraData(A03(str2, A01(21, 11, 10), true)).build());
            return rewardedVideoAd;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final void A08(C2529dL c2529dL, boolean z10) {
        String strA01 = A01(0, 21, 52);
        AbstractC2201Ve.A00(c2529dL).edit().putInt(strA01, z10 ? 0 : AbstractC2201Ve.A00(c2529dL).getInt(strA01, 0) + 1).apply();
    }

    public final boolean A09(C2529dL c2529dL, String str, int i10) {
        if (i10 <= 0) {
            return false;
        }
        try {
            if (!A05(str)) {
                return A00(c2529dL, i10 + (-1)) >= i10 + (-1);
            }
        } catch (JSONException unused) {
        }
        return false;
    }
}
