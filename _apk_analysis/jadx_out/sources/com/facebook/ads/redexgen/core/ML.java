package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class ML {
    public static byte[] A00;
    public static String[] A01 = {"jSoy8XspXCFqO9NWG0uega5zyBcMMpnv", "8I941vkvBihlhZSR3", "E0n4xhy7f55RdYtJKKgnHTy6BEjDvFXE", "Oow628hlFtykEPzM3xMW0Wh", "gjSfO6YGNNbsKn6TLZq3stDSfq2Vbbu6", "XJoMwGgC8l1BSQaiX90ZQnicuTGj509z", "JK4GcCSwzapE3gOVlVNykyUw2lU6lT6d", "8BqJ2MeWpSgEuyxwl"};

    static {
        A05();
    }

    public static MJ A00(JSONObject jSONObject) {
        return MJ.A00(jSONObject.optString(A02(52, 21, 9)));
    }

    public static C2850io A01(C2529dL c2529dL, JSONObject jSONObject, String str) {
        return new C2850io(jSONObject, c2529dL, str);
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 71);
        }
        return new String(bArrCopyOfRange);
    }

    public static Collection<String> A03(C2529dL c2529dL, JSONObject jSONObject) {
        JSONArray jSONArray = null;
        try {
            String strOptString = jSONObject.optString(A02(35, 17, 86));
            if (!TextUtils.isEmpty(strOptString)) {
                jSONArray = new JSONArray(strOptString);
            }
        } catch (JSONException e10) {
            c2529dL.A08().AAy(A02(73, 7, 26), AbstractC2142Sv.A2C, new C2143Sw(e10));
        }
        return A04(jSONArray);
    }

    public static Collection<String> A04(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            hashSet.add(jSONArray.optString(i10));
        }
        return hashSet;
    }

    public static void A05() {
        byte[] bArr = {86, 115, 55, 126, 100, 55, 126, 121, 97, 118, 123, 126, 115, 118, 99, 114, 115, 55, 96, 126, 99, 127, 120, 98, 99, 55, 99, 120, 124, 114, 121, 57, 27, 10, 19, 117, 116, 101, 116, 114, 101, 120, 126, 127, 78, 98, 101, 99, 120, 127, 118, 98, 39, 32, 56, 47, 34, 39, ExifInterface.START_CODE, 47, 58, 39, 33, 32, 17, 44, 43, 38, 47, 56, 39, 33, 60, 45, 60, 47, 46, 52, 51, 58};
        if (A01[6].length() == 14) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[7] = "4DtSv1ItoT1AnjNkW";
        strArr[1] = "xsdhzuZMhKe1kPAxh";
        A00 = bArr;
    }

    public static boolean A06(C2529dL c2529dL, MK mk2, US us2) {
        MJ mjA8C = mk2.A8C();
        if (mjA8C == null || mjA8C == MJ.A03) {
            return false;
        }
        boolean z10 = false;
        Collection<String> collectionA7h = mk2.A7h();
        if (collectionA7h == null || collectionA7h.isEmpty()) {
            return false;
        }
        Iterator<String> it = collectionA7h.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (AbstractC2243Ww.A04(c2529dL, it.next())) {
                z10 = true;
                break;
            }
        }
        if (z10 != (mjA8C == MJ.A02)) {
            return false;
        }
        String strA7G = mk2.A7G();
        if (TextUtils.isEmpty(strA7G)) {
            c2529dL.A08().AAy(A02(32, 3, 61), AbstractC2142Sv.A0Z, new C2143Sw(A02(0, 32, 80)));
            return true;
        }
        us2.AB6(strA7G, null);
        return true;
    }
}
