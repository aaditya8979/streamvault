package com.facebook.ads.redexgen.core;

import android.content.SharedPreferences;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ud, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2175Ud {
    public static byte[] A00;
    public static final String A01;
    public static final Map<String, Integer> A02;
    public static final AtomicInteger A03;

    static {
        A04();
        A01 = C2175Ud.class.getSimpleName();
        A03 = new AtomicInteger(0);
        A02 = new HashMap();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 57);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{-82, -96, -50, -27, -9, -96, -10, ExifInterface.MARKER_APP1, -20, -11, -27, -70, -96, -111, -88, -124, -87, -77, -80, -95, -76, -93, -88, -87, -82, -89, 96, -84, -81, -93, -95, -84, 96, -93, -81, -75, -82, -76, -91, -78, -77, 122, 96, -4, 33, 22, 37, 24, 32, 24, 33, 39, 28, 33, 26, -45, 22, 34, 40, 33, 39, 24, 37, -19, -45, -7, 28, 16, 14, 25, -16, 28, 34, 27, 33, 18, 31, 32, -99, -96, -96, -91, -80, -91, -85, -86, -99, -88, -101, -91, -86, -94, -85, -35, -16, -16, ExifInterface.MARKER_APP1, -23, -20, -16, -84, -86, -66, -80, -79, -67, -88, -82, -63, -84, -82, -71, -67, -78, -72, -73, -17, -5, -7, -70, -14, -19, -17, -15, -18, -5, -5, -9, -70, -19, -16, -1, -70, -40, -37, -49, -51, -40, -21, -49, -37, ExifInterface.MARKER_APP1, -38, -32, -47, -34, -33, -87, -90, -71, -90, -95, -78, -95, -86, -80, -81, 24, 27, 15, 13, 24, 11, 15, 27, 33, 26, 32, 17, 30, 31, -47, -62, -38, -51, -48, -62, -59, -10, -9, -28, -26, -18, -9, -11, -28, -26, -24, -48, -46, -65, -47, -42, -51, -62, -47, -45, -64, -46, -41, -50, -61, -67, -63, -51, -62, -61};
    }

    public static void A05(SQ sq2) {
        if (A0C(sq2)) {
            return;
        }
        synchronized (C2175Ud.class) {
            if (A03.get() != 0) {
                return;
            }
            A03.set(1);
            XU.A06.execute(new VD(sq2));
        }
    }

    public static void A06(SQ sq2, InterfaceC2608ed interfaceC2608ed, Map<String, ?> map) throws JSONException {
        HashMap map2 = new HashMap();
        map2.put(A01(93, 7, 67), A01(13, 1, 40));
        A0A(sq2, map2);
        HashMap map3 = new HashMap();
        map3.put(A01(188, 7, 36), A01(157, 14, 115));
        map3.put(A01(195, 12, 37), String.valueOf(3501));
        map3.put(A01(100, 16, 16), A01(14, 1, 62));
        map3.put(A01(178, 10, 74), A01(65, 13, 116));
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            jSONObject.put(entry.getKey(), String.valueOf(entry.getValue()));
        }
        if (sq2.A05().AAF()) {
            String str = A01(15, 28, 7) + jSONObject.toString(2);
        }
        map3.put(A01(78, 15, 3), jSONObject.toString());
        A0A(sq2, map3);
        TP tpA09 = sq2.A09();
        JSONObject jSONObjectA05 = C2144Sx.A05(new C2146Sz(tpA09.A01(), tpA09.A02(), map3));
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(jSONObjectA05);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(A01(147, 4, 12), new JSONObject(map2));
        jSONObject2.put(A01(151, 6, 3), jSONArray);
        C2622er c2622er = new C2622er();
        c2622er.put(A01(171, 7, 40), jSONObject2.toString());
        interfaceC2608ed.AGE(sq2.A05().A7y(), c2622er.A08(), new V7(sq2));
    }

    public static void A08(SQ sq2, String str) {
        int iIntValue;
        if (A0C(sq2)) {
            return;
        }
        synchronized (C2175Ud.class) {
            if (A03.get() != 2) {
                iIntValue = (A02.containsKey(str) ? A02.get(str).intValue() : 0) + 1;
                A02.put(str, Integer.valueOf(iIntValue));
            } else {
                SharedPreferences sharedPreferences = sq2.getApplicationContext().getSharedPreferences(ProcessUtils.getProcessSpecificName(A01(116, 31, 83), sq2), 0);
                iIntValue = sharedPreferences.getInt(str, 0) + 1;
                sharedPreferences.edit().putInt(str, iIntValue).apply();
            }
            if (sq2.A05().AAF()) {
                String str2 = A01(43, 22, 122) + str + A01(0, 13, 71) + iIntValue;
            }
        }
    }

    public static void A09(SQ sq2, String str) {
        if (A0C(sq2)) {
            return;
        }
        XU.A06.execute(new VC(sq2, str));
    }

    public static void A0A(SQ sq2, Map<String, String> map) {
        map.putAll(sq2.A04().A5S());
    }

    public static boolean A0B(double d10, int i10) {
        return i10 <= 0 || d10 >= 1.0d / ((double) i10);
    }

    public static boolean A0C(SQ sq2) {
        if (sq2.A05().AAF()) {
            return false;
        }
        if (U9.A0U(sq2)) {
            return A0B(sq2.A09().A00(), U9.A0C(sq2));
        }
        return true;
    }
}
