package com.facebook.ads.redexgen.core;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import androidx.exifinterface.media.ExifInterface;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.c1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2448c1 {
    public static byte[] A08;
    public static String[] A09 = {"wHWy6mJnObE4TdegwzR1XIqaiMp2qzo2", "2kKTv183xGQoCJ4bH8MOQBKEcrYPubr8", "yAnU2m0QEWVpmJNiipOenY", "2CWVvRtjqdC7", "Y1Dj6sRIbzGHXk3FXnyOisKccxY5ExT7", "AAUb4pYdx4XqEM8CotKihUFr9wNvuug2", "KLTFv3N2v474XPM9CBPbC4npqkPjZQN", "uonDorlDhYGoL6YzDZYQroxkAXvFfbHU"};
    public WeakReference<C2440bt> A00;
    public WeakReference<I3> A01 = new WeakReference<>(null);
    public boolean A02 = false;
    public final C2529dL A03;
    public final C2427bg A04;
    public final String A05;
    public final String A06;
    public final WeakReference<US> A07;

    static {
        A09();
    }

    public C2448c1(C2529dL c2529dL, C2440bt c2440bt, US us2, C2427bg c2427bg, String str, String str2) {
        this.A03 = c2529dL;
        this.A00 = new WeakReference<>(c2440bt);
        this.A07 = new WeakReference<>(us2);
        this.A04 = c2427bg;
        this.A05 = str;
        this.A06 = str2;
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 12);
        }
        return new String(bArrCopyOfRange);
    }

    public static Map<String, String> A03(JSONObject jSONObject) {
        Iterator<String> itKeys = jSONObject.keys();
        HashMap map = new HashMap();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, jSONObject.optString(next));
        }
        return map;
    }

    private void A04() {
        I3 i32 = this.A01.get();
        if (i32 == null) {
            return;
        }
        i32.close();
        if (A09[3].length() == 20) {
            throw new RuntimeException();
        }
        String[] strArr = A09;
        strArr[2] = "rLuDNCDiUJCt8jrcDw8nHa";
        strArr[6] = "w5dFeIXZRXYPRcNf7kYaeIakMq27def";
    }

    private void A05() {
        I3 i32 = this.A01.get();
        if (i32 == null) {
            return;
        }
        i32.A9c();
    }

    private void A06() {
        I3 i32 = this.A01.get();
        if (i32 == null) {
            return;
        }
        i32.AAd();
    }

    private void A07() {
        this.A03.A0F().A5w();
        this.A02 = true;
        I3 i32 = this.A01.get();
        if (i32 == null) {
            return;
        }
        i32.AJS();
        if (U7.A1u(this.A03)) {
            this.A03.A0B().ACx();
        }
    }

    private void A08() {
        I3 i32 = this.A01.get();
        if (i32 == null) {
            return;
        }
        i32.ADM();
    }

    public static void A09() {
        byte[] bArr = {-121, -109, -111, -111, -123, -110, -120, -110, -109, -108, -113, -93, -102, -94, 112, 127, 120, 107, -93, -78, -85, -85, -94, -87, -100, -96, -84, -95, -94, -86, -71, -78, -78, -87, -80, -93, -79, -87, -73, -73, -91, -85, -87, -15, 0, -7, -7, -16, -9, -22, -1, 4, -5, -16, -18, -24, -4, -56, -55, -72, -62, -67, -127, 114, -122, -124, 118, 117, 83, -118, 102, -124, 118, -125, ExifInterface.MARKER_APP1, -30, -49, -32, -30, -45, -46, -80, -25, -61, ExifInterface.MARKER_APP1, -45, -32, -14, -13, -32, -13, -28, ExifInterface.MARKER_EOI, -42, -48, -81, -55, -35, -84, -105, -94, -85, -101};
        if (A09[5].charAt(6) == '8') {
            throw new RuntimeException();
        }
        A09[3] = "q8I1zS5uUBp9u7UYsB3eM38aYjAC";
        A08 = bArr;
    }

    private void A0A(C2440bt c2440bt, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        SharedPreferences sharedPreferencesA00 = AbstractC2201Ve.A00(this.A03);
        String strA01 = A01(57, 5, 77);
        String strA012 = A01(0, 0, 53);
        String strOptString = jSONObject.optString(strA01, strA012);
        String string = sharedPreferencesA00.getString(A01(14, 4, 0) + jSONObject.optString(A01(54, 3, 119), A01(7, 7, 34)), strA012);
        if (string != null) {
            strA012 = string;
        }
        c2440bt.A0g(strOptString, strA012);
    }

    private void A0B(C2440bt c2440bt, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String strA01 = A01(98, 5, 42);
        String strA012 = A01(0, 0, 53);
        String strOptString = jSONObject.optString(strA01, strA012);
        String strOptString2 = jSONObject.optString(A01(57, 5, 77), strA012);
        AbstractC2201Ve.A00(this.A03).edit().putString(A01(14, 4, 0) + jSONObject.optString(A01(54, 3, 119), A01(7, 7, 34)), strOptString).apply();
        c2440bt.A0f(strOptString2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0015 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A0C(com.facebook.ads.redexgen.core.EnumC2446bz r5, java.lang.String r6) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2448c1.A0C(com.facebook.ads.redexgen.X.bz, java.lang.String):void");
    }

    private void A0D(EnumC2446bz enumC2446bz, String str) throws JSONException {
        I3 i32 = this.A01.get();
        if (i32 == null) {
        }
        switch (C2445by.A00[enumC2446bz.ordinal()]) {
            case 10:
                i32.ADQ();
                break;
            case 11:
                i32.AFG();
                break;
            case 12:
                A0G(i32, str);
                break;
            case 13:
                A0F(i32, str);
                break;
            case 14:
                A0E(i32, str);
                break;
        }
    }

    private void A0E(I3 i32, String str) throws JSONException {
        i32.AEF(new JSONObject(str).optBoolean(A01(87, 5, 115), false));
    }

    private void A0F(I3 i32, String str) throws JSONException {
        i32.AFn(new JSONObject(str).optBoolean(A01(62, 12, 5), false));
    }

    private void A0G(I3 i32, String str) throws JSONException {
        i32.AFp(new JSONObject(str).optBoolean(A01(74, 13, 98), false));
    }

    private void A0I(JSONObject jSONObject) {
        I3 i32 = this.A01.get();
        if (i32 == null) {
            return;
        }
        String strOptString = jSONObject.optString(A01(0, 7, 24));
        if (TextUtils.isEmpty(strOptString)) {
            i32.A9X();
        } else {
            i32.A9Y(strOptString);
        }
    }

    private void A0J(JSONObject jSONObject) {
        if (this.A01.get() == null) {
            return;
        }
        jSONObject.optString(A01(0, 7, 24));
    }

    private void A0K(JSONObject jSONObject) {
        US us2 = this.A07.get();
        if (us2 == null) {
            return;
        }
        if (A09[3].length() == 20) {
            throw new RuntimeException();
        }
        A09[3] = "hDImTkFK3KoL7AYoPxXIP";
        String strOptString = jSONObject.optString(A01(43, 11, 127));
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        new C2172Ua(this.A06, us2).A05(strOptString, A03(jSONObject));
    }

    private void A0L(JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt(A01(18, 11, 49), -1);
        if (iOptInt == -1) {
            return;
        }
        String strOptString = jSONObject.optString(A01(29, 14, 56));
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        this.A03.A0F().AAw(iOptInt, strOptString);
        String[] strArr = A09;
        if (strArr[2].length() == strArr[6].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A09;
        strArr2[7] = "NCNoRnun1G3dlwmqoYaN2uZPLfccAkgr";
        strArr2[0] = "12RLbgldZ9TmNXvaOMkOvzOeimlYTJg9";
    }

    private void A0M(JSONObject jSONObject) {
        I3 i32 = this.A01.get();
        if (i32 == null) {
            return;
        }
        String strA01 = A01(92, 6, 88);
        String[] strArr = A09;
        if (strArr[2].length() == strArr[6].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A09;
        strArr2[7] = "rydiERFHLfFXOcJD9tadKbqyFej0NUPk";
        strArr2[0] = "tiiagSBkZ4Sc0Tn3kexlzzs5G1JfuHdZ";
        String strOptString = jSONObject.optString(strA01);
        if (strOptString == null) {
            return;
        }
        i32.AG4(strOptString);
    }

    public final void A0N(I3 i32) {
        this.A01 = new WeakReference<>(i32);
    }

    public final boolean A0O() {
        return this.A02;
    }

    @JavascriptInterface
    public void postMessage(String str) {
        XJ.A00(new RunnableC2444bx(this, str));
    }
}
