package com.facebook.ads.redexgen.core;

import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class W4 {
    public static byte[] A05;
    public static final Object A06;
    public static final Map<String, String> A07;
    public static final AtomicBoolean A08;
    public final SharedPreferences A00;
    public final SQ A01;
    public final T6 A02;
    public final String A03;
    public final String A04;

    static {
        A04();
        A07 = new HashMap();
        A06 = new Object();
        A08 = new AtomicBoolean();
    }

    public W4(SQ sq2, String str) {
        this.A01 = sq2;
        this.A03 = str;
        this.A02 = new T6(this.A01, str);
        this.A00 = AbstractC2201Ve.A00(this.A01);
        this.A04 = A01(1, 4, 93) + str + A01(0, 1, 18) + this.A02.A06();
    }

    private final String A00() {
        return this.A00.getString(this.A04, null);
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 79);
        }
        return new String(bArrCopyOfRange);
    }

    public static String A02(SQ sq2, String str) {
        try {
            PackageManager packageManager = sq2.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            return C2235Wo.A03(packageManager.getApplicationInfo(str, 0).sourceDir);
        } catch (Exception e10) {
            if (A08.compareAndSet(false, true)) {
                sq2.A08().AAy(A01(40, 7, 56), AbstractC2142Sv.A1P, new C2143Sw(e10));
            }
            return null;
        }
    }

    public static String A03(String str) {
        String str2;
        synchronized (A06) {
            str2 = A07.get(str);
        }
        return str2;
    }

    public static void A04() {
        A05 = new byte[]{-100, -19, -14, -4, -25, -89, -45, -35, -32, -45, -29, 35, 47, 45, -18, 33, 46, 36, 50, 47, 41, 36, -18, 54, 37, 46, 36, 41, 46, 39, -21, -5, -23, -8, -15, 10, 26, 19, 14, 10, -18, -20, -11, -20, -7, -16, -22};
    }

    public final void A05() throws JSONException {
        String strA01 = null;
        if ((Build.VERSION.SDK_INT >= 31 || A01(5, 1, 5).equals(Build.VERSION.CODENAME)) && U7.A2g(this.A01) && A01(11, 19, 113).equals(this.A02.A0B())) {
            strA01 = C2235Wo.A01(this.A01, this.A03);
        }
        if (strA01 == null) {
            strA01 = A02(this.A01, this.A03);
        } else if (U7.A1f(this.A01)) {
            String strA02 = A02(this.A01, this.A03);
            C2143Sw c2143Sw = new C2143Sw(A01(6, 5, 33));
            c2143Sw.A05(1);
            c2143Sw.A06(1);
            c2143Sw.A0A(false);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A01(30, 5, 57), strA01);
            jSONObject.put(A01(35, 5, 88), strA02);
            c2143Sw.A07(jSONObject);
            this.A01.A08().AAz(A01(40, 7, 56), AbstractC2142Sv.A1I, c2143Sw);
        }
        synchronized (A06) {
            A07.put(this.A03, strA01);
        }
        this.A00.edit().putString(this.A04, strA01).apply();
    }

    public final void A06() {
        String strA00 = A00();
        synchronized (A06) {
            A07.put(this.A03, strA00);
        }
    }
}
