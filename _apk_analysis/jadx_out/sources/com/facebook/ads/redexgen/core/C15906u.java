package com.facebook.ads.redexgen.core;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@MetaExoPlayerCustomization(type = {"NEW_CLASS"}, value = "D63737392: Class for performance negative testing")
public final class C15906u {
    public static byte[] A01;
    public static String[] A02 = {"uumaDejXtY9QuA71Txc6KqwcrEMmZNPm", "", "Dsya3x18X7BukkIokO15GhTYLGiL2hRr", "RNehmKATQ4InJCkQYMjQTj", "eAq9FO9dhgnzxwHSxHo7MGMv1ckJfF3W", "", "rfJrIe", ""};
    public Map<Integer, C15896t> A00 = new HashMap();

    static {
        A01();
    }

    public C15906u(String str) {
        if (str != null) {
            try {
                if (str.isEmpty()) {
                    return;
                }
                JSONArray jSONArray = new JSONArray(str);
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i10);
                    int i11 = jSONObject.getInt(A00(17, 8, 14));
                    this.A00.put(Integer.valueOf(i11), new C15896t(this, jSONObject.getInt(A00(0, 11, 105)), jSONObject.getInt(A00(11, 6, 87)), jSONObject.getInt(A00(25, 12, 94))));
                }
            } catch (Exception unused) {
            }
        }
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            int i14 = bArrCopyOfRange[i13] ^ i12;
            String[] strArr = A02;
            if (strArr[2].charAt(3) != strArr[0].charAt(3)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[1] = "";
            strArr2[7] = "";
            bArrCopyOfRange[i13] = (byte) (i14 ^ 1);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{ExifInterface.START_CODE, 9, 27, 13, 36, 9, 28, 13, 6, 11, 17, 28, 63, 34, 34, 51, 36, 95, 96, 124, 102, 123, 102, 96, 97, 12, 62, 50, 47, 51, 54, 49, 56, 13, 62, 43, 58};
    }

    public final C15896t A02() {
        if (this.A00.containsKey(0)) {
            return this.A00.get(0);
        }
        return null;
    }
}
