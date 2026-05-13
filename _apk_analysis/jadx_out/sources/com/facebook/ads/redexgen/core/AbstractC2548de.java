package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import androidx.exifinterface.media.ExifInterface;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.de, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC2548de {
    public static byte[] A00;
    public static String[] A01 = {"m5Jty9nXe8L2gKLWEWc3vH5rHCR7lq15", "nXqLn2RrfIlx0c2v1RTl0CneHVNjUcek", "yIjJHM1120PmYi1BMLCe9caFimcQ2nFl", "mlpcJRY57Lt3u3e0DOF4Ze17XEKszIMh", "yNEzWcoMu1kvA6ly91E0yJELmkdnUTW9", "LQJ0sSZIBnjE3wRe9pGlPD4TX9Tbmis1", "3e9PCxJTK3pug342JyVCHaGplQMI3S8I", "kyVsWmEjdCkwx1v5lgIpAQohzDFxobhM"};

    static {
        A04();
    }

    public static WebResourceResponse A00(C2529dL c2529dL, WebResourceRequest webResourceRequest, Uri uri, String str, HashMap<String, String> map) throws IOException {
        String strA02 = A02(85, 5, 1);
        InterfaceC15404w interfaceC15404wA0H = C2588eJ.A06(c2529dL.A02()).A0H(c2529dL);
        SF.A0H(c2529dL, uri.toString());
        try {
            C2549df c2549df = new C2549df(c2529dL.A02(), uri, interfaceC15404wA0H);
            int iAvailable = c2549df.available();
            if (iAvailable <= 0) {
                A05(c2529dL, 1, new Pair[]{new Pair(A02(61, 9, 46), String.valueOf(iAvailable))});
                return null;
            }
            String strA03 = A03(webResourceRequest.getRequestHeaders());
            if (strA03 == null) {
                c2529dL.A0F().A65();
                A06(map, iAvailable);
                return new WebResourceResponse(str, null, 200, A02(44, 2, 122), map, c2549df);
            }
            try {
                C2547dd c2547ddA01 = A01(strA03);
                if (!c2547ddA01.A03) {
                    A05(c2529dL, 0, new Pair[]{new Pair(A02(94, 5, 77), c2547ddA01.A02 != null ? c2547ddA01.A02 : A02(90, 4, 30))});
                    return null;
                }
                int i10 = c2547ddA01.A01;
                int i11 = c2547ddA01.A00 == -1 ? iAvailable - 1 : c2547ddA01.A00;
                A06(map, iAvailable);
                map.put(A02(31, 13, 93), A02(75, 6, 3) + i10 + A02(1, 1, 92) + i11 + A02(2, 1, 88) + iAvailable);
                c2529dL.A0F().A65();
                return new WebResourceResponse(str, null, 206, A02(46, 15, 10), map, c2549df);
            } catch (NumberFormatException e10) {
                A05(c2529dL, 3, new Pair[]{new Pair(strA02, e10.toString())});
                return null;
            }
        } catch (IOException e11) {
            A05(c2529dL, 2, new Pair[]{new Pair(strA02, e11.toString())});
            return null;
        }
    }

    public static C2547dd A01(String str) {
        if (str == null) {
            C2547dd c2547dd = new C2547dd();
            c2547dd.A03 = false;
            c2547dd.A02 = null;
            return c2547dd;
        }
        String[] strArr = A01;
        if (strArr[0].charAt(24) != strArr[1].charAt(24)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[3] = "Dtu90aCnfjxtl3iZcl85ZURNtT9G66qF";
        strArr2[6] = "JBE4H6DVGxkCv3KpLfIzSFjkaXJMKyPO";
        String[] strArrSplit = str.split(A02(3, 1, 13));
        if (strArrSplit.length >= 2) {
            if (A02(70, 5, 5).equals(strArrSplit[0].toLowerCase(Locale.US).trim())) {
                if (strArrSplit[1].trim().split(A02(0, 1, 72)).length != 1) {
                    C2547dd c2547dd2 = new C2547dd();
                    c2547dd2.A03 = false;
                    c2547dd2.A02 = str;
                    return c2547dd2;
                }
                String[] strArrSplit2 = strArrSplit[1].trim().split(A02(1, 1, 92));
                C2547dd c2547dd3 = new C2547dd();
                c2547dd3.A03 = true;
                c2547dd3.A02 = str;
                c2547dd3.A01 = TextUtils.isEmpty(strArrSplit2[0]) ? 0 : Integer.parseInt(strArrSplit2[0]);
                if (strArrSplit2.length > 1) {
                    c2547dd3.A00 = TextUtils.isEmpty(strArrSplit2[1]) ? -1 : Integer.parseInt(strArrSplit2[1]);
                } else {
                    c2547dd3.A00 = -1;
                }
                return c2547dd3;
            }
        }
        C2547dd c2547dd4 = new C2547dd();
        c2547dd4.A03 = false;
        c2547dd4.A02 = str;
        return c2547dd4;
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 26);
        }
        return new String(bArrCopyOfRange);
    }

    public static String A03(Map<String, String> map) {
        for (String str : map.keySet()) {
            Locale locale = Locale.US;
            String[] strArr = A01;
            if (strArr[0].charAt(24) != strArr[1].charAt(24)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[3] = "WwPgvkKaNJbx73tjItPTyID0XOg3nGIt";
            strArr2[6] = "4YitGEy8BigPs3HGnT2LP2sfmluRsQ6B";
            if (A02(94, 5, 77).equals(str.toLowerCase(locale))) {
                return map.get(str);
            }
        }
        return null;
    }

    public static void A04() {
        A00 = new byte[]{-114, -93, -95, 100, -104, -70, -70, -68, -57, -53, -124, -87, -72, -59, -66, -68, -54, -70, -26, -27, -21, -36, -27, -21, -92, -61, -36, -27, -34, -21, -33, -70, -26, -27, -21, -36, -27, -21, -92, -55, -40, -27, -34, -36, -29, -33, 116, -123, -106, -104, -115, -123, -112, 68, 103, -109, -110, -104, -119, -110, -104, -87, -66, -87, -79, -76, -87, -86, -76, -83, -127, -104, -109, -124, -110, 127, -106, -111, -126, -112, 61, -74, -62, -73, -72, -128, -115, -115, -118, -115, -90, -83, -92, -92, ExifInterface.MARKER_EOI, -56, -43, -50, -52};
    }

    public static void A05(C2529dL c2529dL, int i10, Pair<String, String>[] pairArr) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A02(81, 4, 57), i10);
            for (Pair<String, String> pair : pairArr) {
                jSONObject.put((String) pair.first, pair.second);
            }
        } catch (JSONException unused) {
        }
        c2529dL.A0F().A64(jSONObject.toString());
    }

    public static void A06(HashMap<String, String> map, int i10) {
        map.put(A02(4, 13, 61), A02(70, 5, 5));
        map.put(A02(17, 14, 93), String.valueOf(i10));
    }
}
