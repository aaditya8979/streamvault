package com.facebook.ads.redexgen.core;

import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ex, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AsyncTaskC2628ex extends AsyncTask<String, Void, C2629ey> {
    public static byte[] A05;
    public static String[] A06 = {"naFNcZuGe", "C9JAYYW4", "8H9N3VrVfLlJ9IUdYMoO", "YylQBw7bkupjVtNcwFivzoGwGcTau", "utPcy8I9vNMcCezdgtn", "ehhspVm5", "7sb5kaLRz1R8p", InneractiveMediationDefs.GENDER_MALE};
    public static final String A07;
    public static final Set<String> A08;
    public SQ A00;
    public InterfaceC2607ec A01;
    public InterfaceC2627ew A02;
    public Map<String, String> A03;
    public Map<String, String> A04;

    static {
        A04();
        A07 = AsyncTaskC2628ex.class.getSimpleName();
        A08 = new HashSet();
        A08.add(A01(0, 1, 15));
        A08.add(A01(29, 4, 63));
    }

    public AsyncTaskC2628ex(SQ sq2) {
        this(sq2, null, null);
    }

    public AsyncTaskC2628ex(SQ sq2, Map<String, String> map) {
        this(sq2, map, null);
    }

    public AsyncTaskC2628ex(SQ sq2, Map<String, String> map, Map<String, String> map2) {
        this.A00 = sq2;
        this.A03 = map != null ? new HashMap(map) : null;
        this.A04 = map2 != null ? new HashMap(map2) : null;
    }

    private final C2629ey A00(String... strArr) throws Throwable {
        if (AbstractC2208Vl.A02(this)) {
            return null;
        }
        String[] strArr2 = A06;
        if (strArr2[4].length() == strArr2[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr3 = A06;
        strArr3[3] = "OBWBCzNqNMhSgl0vUrcBODbII9DBW";
        strArr3[2] = "nuEeWi2rsMih0JuNdplL";
        try {
            String str = strArr[0];
            if (!TextUtils.isEmpty(str) && !A08.contains(str)) {
                String strA02 = A02(str);
                if (this.A03 != null && !this.A03.isEmpty()) {
                    for (Map.Entry<String, String> entry : this.A03.entrySet()) {
                        strA02 = A03(strA02, entry.getKey(), entry.getValue());
                    }
                }
                int i10 = 1;
                while (true) {
                    int i11 = i10 + 1;
                    if (i10 > 2) {
                        return null;
                    }
                    if (A06(strA02)) {
                        return new C2629ey(this.A01);
                    }
                    i10 = i11;
                }
            }
            return null;
        } catch (Throwable th2) {
            AbstractC2208Vl.A00(th2, this);
            return null;
        }
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 103);
        }
        return new String(bArrCopyOfRange);
    }

    private String A02(String str) {
        try {
            return A03(str, A01(23, 6, 9), AbstractC2238Wr.A01(this.A00.A04().A6o()));
        } catch (Exception unused) {
            return str;
        }
    }

    private String A03(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return str;
        }
        String strA01 = A01(3, 1, 49);
        if (str.contains(strA01)) {
            strA01 = A01(1, 1, 127);
        }
        return str + strA01 + str2 + A01(2, 1, 113) + URLEncoder.encode(str3);
    }

    public static void A04() {
        A05 = new byte[]{75, 62, 43, 105, 56, 15, 15, 18, 15, 93, 18, 13, 24, 19, 20, 19, 26, 93, 8, 15, 17, 71, 93, 15, 0, 15, 2, 1, 9, 54, 45, 52, 52};
    }

    private final void A05(C2629ey c2629ey) throws Throwable {
        if (AbstractC2208Vl.A02(this)) {
            return;
        }
        try {
            if (this.A02 != null) {
                this.A02.AGS(c2629ey);
            }
        } catch (Throwable th2) {
            AbstractC2208Vl.A00(th2, this);
        }
    }

    private boolean A06(String str) {
        InterfaceC2607ec interfaceC2607ecAGC;
        InterfaceC2608ed interfaceC2608edA00 = C2626ev.A00(this.A00);
        try {
            if (this.A04 == null || this.A04.size() == 0) {
                interfaceC2607ecAGC = interfaceC2608edA00.AGC(str, new C2622er());
            } else {
                C2622er c2622er = new C2622er();
                c2622er.A05(this.A04);
                interfaceC2607ecAGC = interfaceC2608edA00.AGD(str, c2622er.A08());
            }
            this.A01 = interfaceC2607ecAGC;
        } catch (Exception e10) {
            Log.e(A07, A01(4, 19, 26) + str, e10);
        }
        return this.A01 != null && this.A01.A94() == 200;
    }

    public final void A07(InterfaceC2627ew interfaceC2627ew) {
        this.A02 = interfaceC2627ew;
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ C2629ey doInBackground(String[] strArr) throws Throwable {
        if (AbstractC2208Vl.A02(this)) {
            return null;
        }
        try {
            return A00(strArr);
        } catch (Throwable th2) {
            AbstractC2208Vl.A00(th2, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onCancelled() {
        if (this.A02 != null) {
            this.A02.AGQ();
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(C2629ey c2629ey) throws Throwable {
        if (AbstractC2208Vl.A02(this)) {
            return;
        }
        try {
            A05(c2629ey);
        } catch (Throwable th2) {
            AbstractC2208Vl.A00(th2, this);
        }
    }
}
