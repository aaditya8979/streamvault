package com.facebook.ads.redexgen.core;

import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import androidx.exifinterface.media.ExifInterface;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.c4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2451c4 {
    public static byte[] A00;
    public static String[] A01 = {"qx9J4yAnPXaVyRX1wkhfMyD35E0bVkcp", "bG7a76MJuQYCTQVI4bECP0jat3LYDm8S", "3sji", "WOIjjsVKw0oGTZJ8bV1Eiv07MXmRBJ4e", "zigTdk", "jLtidcNh89Szai5k4uiuh5UaOWCNfF4m", "9OqLRA6IbqecmBl4IJChXH2akamtN0Bd", "1PwXl0SmV68MCkNjB88Y7o3DlBd3CbFY"};
    public static final String A02;

    static {
        A04();
        A02 = C2451c4.class.getSimpleName();
    }

    public static WebResourceResponse A00(C2529dL c2529dL, SF sf2, WebResourceRequest webResourceRequest, C2449c2 c2449c2, boolean z10) {
        String string = webResourceRequest.getUrl().toString();
        if (c2449c2.A05) {
            return null;
        }
        try {
            HashMap map = new HashMap();
            String strGuessContentTypeFromName = URLConnection.guessContentTypeFromName(string);
            if (c2449c2.A01.contains(string)) {
                String str = A03(108, 21, 31) + string;
                File fileA0P = sf2.A0P(string);
                if (fileA0P != null) {
                    return (z10 && string.equals(c2449c2.A00)) ? A02(map, strGuessContentTypeFromName, new C2443bw(c2529dL.A02(), new FileInputStream(fileA0P), new I1(c2529dL, string))) : A01(map, strGuessContentTypeFromName, fileA0P);
                }
                String str2 = A03(0, 25, 19) + string;
            }
            if (c2449c2.A02.contains(string)) {
                String str3 = A03(129, 22, 61) + string;
                File fileA0Q = sf2.A0Q(string);
                if (fileA0Q != null) {
                    return A01(map, strGuessContentTypeFromName, fileA0Q);
                }
                String str4 = A03(25, 26, 108) + string;
            }
            if (c2449c2.A03.contains(string)) {
                String str5 = A03(151, 22, 111) + string;
                return AbstractC2548de.A00(c2529dL, webResourceRequest, webResourceRequest.getUrl(), strGuessContentTypeFromName, map);
            }
        } catch (IOException e10) {
            Log.e(A03(89, 17, 51), A03(54, 35, 64) + string, e10);
        }
        return null;
    }

    public static WebResourceResponse A01(HashMap<String, String> map, String str, File file) throws FileNotFoundException {
        return A02(map, str, new FileInputStream(file));
    }

    public static WebResourceResponse A02(HashMap<String, String> map, String str, InputStream inputStream) {
        return new WebResourceResponse(str, null, 200, A03(106, 2, 61), map, inputStream);
    }

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 99);
            String[] strArr = A01;
            if (strArr[4].length() == strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[3] = "3GrjuQcpYdFWBcs25Ezt7MBLI0wjxHRp";
            strArr2[7] = "nD922LhxjrSAIQnDmHWR8rAyvz5NrvSF";
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{-71, -41, ExifInterface.MARKER_EOI, -34, -37, -106, -29, -33, -23, -23, -106, -36, -27, -24, -106, -36, -33, -30, -37, -106, -21, -24, -30, -80, -106, 18, 48, 50, 55, 52, -17, 60, 56, 66, 66, -17, 53, 62, 65, -17, 56, 60, 48, 54, 52, -17, 68, 65, 59, 9, -17, -47, -43, -32, -24, 21, 21, 18, 21, -61, 18, 19, 8, 17, 12, 17, 10, -61, 6, 4, 6, 11, 8, 7, -61, 9, 12, 15, 8, -61, 9, 18, 21, -61, 24, 21, 15, -35, -61, -36, -40, -41, 11, -6, -1, -5, 4, -7, -5, -28, -5, 10, 13, 5, 8, 1, -17, -21, -46, -12, -15, -27, -25, -11, -11, -21, -16, -23, -94, -24, -21, -18, -25, -94, -9, -12, -18, -68, -94, -16, 18, 15, 3, 5, 19, 19, 9, 14, 7, -64, 9, 13, 1, 7, 5, -64, 21, 18, 12, -38, -64, 34, 68, 65, 53, 55, 69, 69, 59, 64, 57, -14, 72, 59, 54, 55, 65, -14, 71, 68, 62, 12, -14, 15, 30, 23, -19, -8, -9, -12, -18};
    }

    public static void A05(SQ sq2, String str, String str2) {
        C2143Sw c2143Sw = new C2143Sw(A03(51, 3, 42));
        c2143Sw.A05(1);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A03(176, 2, 34), str);
            jSONObject.put(A03(178, 3, 31), str2);
            c2143Sw.A07(jSONObject);
        } catch (JSONException unused) {
        }
        sq2.A08().AAz(A03(TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, 3, 72), AbstractC2142Sv.A12, c2143Sw);
    }
}
