package com.facebook.ads.redexgen.core;

import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class TO {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 65);
        }
        return new String(bArrCopyOfRange);
    }

    public static String A01(C2503cu c2503cu) {
        return AbstractC2201Ve.A00(c2503cu).getString(A00(0, 14, 37), null);
    }

    public static Map<String, String> A02(C2503cu c2503cu) {
        String string = AbstractC2201Ve.A00(c2503cu).getString(A00(14, 22, 76), null);
        if (string == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            HashSet hashSet = new HashSet();
            HashMap map = new HashMap();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                if (jSONObject2.getLong(A00(41, 8, 63)) + ((long) (jSONObject2.getInt(A00(49, 10, 123)) * 1000)) < System.currentTimeMillis()) {
                    hashSet.add(next);
                } else {
                    map.put(next, jSONObject2.getString(A00(59, 5, 33)));
                }
            }
            if (!hashSet.isEmpty()) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    jSONObject.remove((String) it.next());
                }
                A06(c2503cu, jSONObject);
            }
            return map;
        } catch (JSONException e10) {
            c2503cu.A08().AAy(A00(36, 5, 38), AbstractC2142Sv.A2U, new C2143Sw(e10));
            return null;
        }
    }

    public static void A03() {
        A00 = new byte[]{-74, -72, -85, -84, -59, -71, -86, -79, -59, -87, -89, -87, -82, -85, -35, -33, -46, -45, -20, -32, -47, -40, -20, -38, -50, -37, -50, -44, -46, -47, -20, -48, -50, -48, -43, -46, -54, -56, -54, -49, -52, -28, ExifInterface.MARKER_APP1, -12, -27, -33, -13, -27, -12, 33, 52, 44, 37, 46, 33, 47, 27, 37, ExifInterface.START_CODE, -40, -61, -50, -41, -57};
    }

    public static void A04(C2503cu c2503cu, String str) {
        AbstractC2201Ve.A00(c2503cu).edit().putString(A00(0, 14, 37), str).apply();
    }

    public static void A05(C2503cu c2503cu, String str) {
        if (str == null) {
            return;
        }
        String string = AbstractC2201Ve.A00(c2503cu).getString(A00(14, 22, 76), null);
        try {
            JSONObject jSONObject = string == null ? new JSONObject() : new JSONObject(string);
            JSONObject jSONObject2 = new JSONObject(str);
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONObject jSONObject3 = jSONObject2.getJSONObject(next);
                jSONObject3.put(A00(41, 8, 63), System.currentTimeMillis());
                jSONObject.put(next, jSONObject3);
            }
            A06(c2503cu, jSONObject);
        } catch (JSONException e10) {
            c2503cu.A08().AAy(A00(36, 5, 38), AbstractC2142Sv.A2V, new C2143Sw(e10));
        }
    }

    public static void A06(C2503cu c2503cu, JSONObject jSONObject) {
        AbstractC2201Ve.A00(c2503cu).edit().putString(A00(14, 22, 76), jSONObject.toString()).apply();
    }
}
