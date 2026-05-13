package com.facebook.ads.redexgen.core;

import android.content.SharedPreferences;
import android.os.Build;
import java.util.Arrays;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class TS implements Callable<Boolean> {
    public static byte[] A04;
    public static String[] A05 = {"dMyKB8n8mY8sFmfmCsf5VwvZBLoVpPiR", "TBvdqjLuIRaxglwGY5TjNnUOxCNoUnNv", "FK0GmuaP9q8EyodOlfs4PJ6Rrg0VVoxV", "1UM", "Fv6ZlsmxNYwaZ6XY1w8nvtw6Sd1Ai0k0", "lERcqI9wEyu6Ta8yIDBCfbsl7aq4DQ3Q", "fq", "Qdyh6wSbko6o8Mj4qT2RTqVvwzMlz"};
    public final /* synthetic */ SharedPreferences A00;
    public final /* synthetic */ SQ A01;
    public final /* synthetic */ T6 A02;
    public final /* synthetic */ String A03;

    static {
        A02();
    }

    public TS(SQ sq2, T6 t62, SharedPreferences sharedPreferences, String str) {
        this.A01 = sq2;
        this.A02 = t62;
        this.A00 = sharedPreferences;
        this.A03 = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final Boolean call() throws Exception {
        String strA01 = null;
        if ((Build.VERSION.SDK_INT >= 31 || A01(0, 1, 88).equals(Build.VERSION.CODENAME)) && U7.A2g(this.A01)) {
            if (A01(6, 19, 112).equals(this.A02.A0B())) {
                strA01 = C2235Wo.A01(this.A01, this.A01.getPackageName());
            }
        }
        if (strA01 == null) {
            TT.A00 = W4.A02(this.A01, this.A01.getPackageName());
        } else {
            boolean zA1f = U7.A1f(this.A01);
            String[] strArr = A05;
            if (strArr[7].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[1] = "kDvoq9mMnaUwO0DWwqxaQOFrfqCdc2U4";
            strArr2[5] = "nyTkqSQWVKKnLYnFLp1tRd7YKhoP35dr";
            if (zA1f) {
                String strA02 = W4.A02(this.A01, this.A01.getPackageName());
                C2143Sw c2143Sw = new C2143Sw(A01(1, 5, 36));
                c2143Sw.A05(1);
                c2143Sw.A06(1);
                c2143Sw.A0A(false);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(A01(25, 5, 125), strA01);
                jSONObject.put(A01(30, 5, 115), strA02);
                c2143Sw.A07(jSONObject);
                this.A01.A08().AAz(A01(35, 7, 42), AbstractC2142Sv.A1I, c2143Sw);
            }
            TT.A00 = strA01;
        }
        this.A00.edit().putString(this.A03, TT.A00).apply();
        TT.A05.set(2);
        return true;
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 46);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{37, 105, 103, 122, 105, 121, 61, 49, 51, 112, 63, 48, 58, 44, 49, 55, 58, 112, 40, 59, 48, 58, 55, 48, 57, 48, 32, 50, 35, 58, 62, 46, 49, 58, 62, 99, 97, 106, 97, 118, 109, 103};
    }
}
