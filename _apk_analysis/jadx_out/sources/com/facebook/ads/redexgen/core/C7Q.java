package com.facebook.ads.redexgen.core;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import com.explorestack.protobuf.openrtb.LossReason;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7Q, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C7Q extends AbstractC2848im {
    public static byte[] A04;
    public static String[] A05 = {"b4EbQiKGBOPn48tIsiPL5n4N5SxNZ1EN", "C4qAvqPXqcx1", "av0PnThHX1ufh2ncI3f6iPLWfGZcgSDj", "l1hdtvJdt41N", "aFghpyqA523JYmrsO", "P4eeegJbz09MXnMZrJhy5IVHeFKKR7Ef", "fwPno9KqPJ0g1dx57vycq8IipA21WGGJ", "Ava7qu9S1KN"};
    public static final String A06;
    public C2228Wh A00;
    public final Uri A01;
    public final N3 A02;
    public final Map<String, String> A03;

    static {
        A07();
        A06 = C7Q.class.getSimpleName();
    }

    public C7Q(C2529dL c2529dL, US us2, String str, Uri uri, Map<String, String> map, MO mo2, boolean z10, N3 n32) {
        super(c2529dL, us2, str, mo2, z10);
        this.A01 = uri;
        this.A03 = map;
        this.A02 = n32;
    }

    private Intent A00(MM mm2) {
        if (TextUtils.isEmpty(mm2.A05())) {
            return null;
        }
        String strA03 = mm2.A03();
        if (!AbstractC2243Ww.A04(((MH) this).A01, mm2.A05())) {
            C2529dL c2529dL = ((MH) this).A01;
            if (A05[6].charAt(8) != 'P') {
                throw new RuntimeException();
            }
            A05[5] = "ldjYBpnAKJ5YKanQesg35Gt0OkPWSzAG";
            if (!A09(c2529dL, strA03)) {
                return null;
            }
        }
        if (!TextUtils.isEmpty(strA03) && (strA03.startsWith(A04(250, 4, 102)) || strA03.startsWith(A04(254, 10, 74)))) {
            return new Intent(A04(62, 26, 119), WQ.A00(strA03));
        }
        PackageManager packageManager = ((MH) this).A01.getPackageManager();
        if (packageManager == null) {
            return null;
        }
        if (TextUtils.isEmpty(mm2.A04())) {
            boolean zIsEmpty = TextUtils.isEmpty(strA03);
            String[] strArr = A05;
            if (strArr[7].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            A05[2] = "P0UyeT8Oj9P4H3GWuZ6UwWdLOtPXQiGU";
            if (zIsEmpty) {
                return packageManager.getLaunchIntentForPackage(mm2.A05());
            }
        }
        Intent intentA01 = A01(mm2);
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intentA01, 65536);
        if (intentA01.getComponent() == null) {
            Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ResolveInfo next = it.next();
                String str = next.activityInfo.packageName;
                String strA05 = mm2.A05();
                if (A05[0].charAt(20) != '5') {
                    throw new RuntimeException();
                }
                A05[5] = "zQ3PtZjh8GquAUsdZUz15LBCi8uwCZq5";
                if (str.equals(strA05)) {
                    intentA01.setComponent(new ComponentName(next.activityInfo.packageName, next.activityInfo.name));
                    break;
                }
            }
        }
        if (listQueryIntentActivities.isEmpty() || intentA01.getComponent() == null) {
            if (!A09(((MH) this).A01, strA03)) {
                return null;
            }
            intentA01.setPackage(mm2.A05());
        }
        return intentA01;
    }

    private Intent A01(MM mm2) {
        Intent intent = new Intent(A04(88, 26, 77));
        intent.addFlags(268435456);
        if (!TextUtils.isEmpty(mm2.A05()) && !TextUtils.isEmpty(mm2.A04())) {
            intent.setComponent(new ComponentName(mm2.A05(), mm2.A04()));
        }
        if (!TextUtils.isEmpty(mm2.A03())) {
            intent.setData(WQ.A00(mm2.A03()));
        }
        return intent;
    }

    private final Uri A02() {
        String queryParameter = this.A01.getQueryParameter(A04(Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, 9, 98));
        if (!TextUtils.isEmpty(queryParameter)) {
            return WQ.A00(queryParameter);
        }
        return WQ.A00(String.format(Locale.US, A04(126, 22, 5), this.A01.getQueryParameter(A04(LossReason.LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE, 8, 11))));
    }

    private ME A03() throws W9 {
        WN wn2 = new WN();
        try {
            return WN.A06(wn2, ((MH) this).A01, A02(), ((MH) this).A03, this.A03);
        } catch (W9 unused) {
            String str = A04(26, 27, 92) + this.A01.toString();
            String queryParameter = this.A01.getQueryParameter(A04(228, 22, 11));
            if (queryParameter != null && queryParameter.length() > 0) {
                WN.A0E(wn2, ((MH) this).A01, WQ.A00(queryParameter), ((MH) this).A03);
            }
            return ME.A09;
        }
    }

    public static String A04(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 41);
        }
        return new String(bArrCopyOfRange);
    }

    private List<MM> A05() {
        String queryParameter = this.A01.getQueryParameter(A04(114, 12, 106));
        if (TextUtils.isEmpty(queryParameter) || A04(53, 2, 65).equals(queryParameter)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArrayOptJSONArray = new JSONObject(queryParameter).optJSONArray(A04(55, 7, 64));
            if (jSONArrayOptJSONArray != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    MM mmA00 = MM.A00(jSONArrayOptJSONArray.optJSONObject(i10));
                    if (mmA00 != null) {
                        arrayList.add(mmA00);
                    }
                }
            }
        } catch (JSONException e10) {
            ((MH) this).A01.A08().AAy(A04(204, 7, 61), AbstractC2142Sv.A24, new C2143Sw(e10));
            Log.w(A06, A04(0, 26, 52), e10);
        }
        return arrayList;
    }

    private final List<Intent> A06() {
        List<MM> listA05 = A05();
        ArrayList arrayList = new ArrayList();
        if (listA05 != null) {
            Iterator<MM> it = listA05.iterator();
            while (it.hasNext()) {
                Intent intentA00 = A00(it.next());
                if (intentA00 != null) {
                    arrayList.add(intentA00);
                }
            }
        }
        return arrayList;
    }

    public static void A07() {
        A04 = new byte[]{88, 111, 111, 114, 111, 61, 109, 124, 111, 110, 116, 115, 122, 61, 124, 109, 109, 110, 116, 105, 120, 66, 121, 124, 105, 124, 51, 20, 28, 25, 16, 17, 85, 1, 26, 85, 26, 5, 16, 27, 85, 24, 20, 7, 30, 16, 1, 85, 0, 7, 25, 79, 85, 51, 53, 8, 7, 13, 27, 6, 0, 13, 63, 48, 58, 44, 49, 55, 58, 112, 55, 48, ExifInterface.START_CODE, 59, 48, ExifInterface.START_CODE, 112, 63, 61, ExifInterface.START_CODE, 55, 49, 48, 112, 26, 23, 31, 18, 5, 10, 0, 22, 11, 13, 0, 74, 13, 10, 16, 1, 10, 16, 74, 5, 7, 16, 13, 11, 10, 74, 50, 45, 33, 51, 34, 51, 51, 48, ExifInterface.START_CODE, 55, 38, 28, 39, 34, 55, 34, 65, 77, 94, 71, 73, 88, 22, 3, 3, 72, 73, 88, 77, 69, 64, 95, 19, 69, 72, 17, 9, 95, 27, 4, 17, 26, 17, 16, 43, 16, 17, 17, 4, 24, 29, 26, 31, 125, 98, 119, 124, 119, 118, 77, 97, 102, 125, 96, 119, 77, 116, 115, 126, 126, 112, 115, 113, 121, 77, 103, 96, 126, 123, 100, 113, 122, 113, 112, 75, 103, 96, 123, 102, 113, 75, 97, 102, 120, 100, 117, 102, 103, 125, 122, 115, 81, 86, 77, 80, 71, 125, 75, 70, 56, 63, 36, 57, 46, 20, 62, 57, 39, 81, 86, 77, 80, 71, 125, 87, 80, 78, 125, 85, 71, 64, 125, 68, 67, 78, 78, 64, 67, 65, 73, 59, ExifInterface.START_CODE, 35, 117, 23, 6, 15, 19, 17, 12, 14, 19, 23, 89};
    }

    private boolean A08() {
        List<Intent> listA06 = A06();
        if (listA06 == null) {
            return false;
        }
        Iterator<Intent> it = listA06.iterator();
        while (it.hasNext()) {
            if (WB.A0D(((MH) this).A01, it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean A09(C2529dL c2529dL, String str) {
        return Build.VERSION.SDK_INT >= 30 && str != null && U7.A23(c2529dL);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2848im
    public final ME A0H() {
        ME meA0M = ME.A09;
        if (((AbstractC2848im) this).A03) {
            meA0M = A0M();
        } else {
            this.A03.put(A04(188, 16, 61), String.valueOf(true));
        }
        Map<String, String> map = this.A03;
        if (A05[2].charAt(5) != 'T') {
            throw new RuntimeException();
        }
        A05[4] = "kOq5WVrOOgnK8qBpA";
        A0J(map, meA0M);
        N3.A06(this.A02, ((MH) this).A01);
        return meA0M;
    }

    public final ME A0M() {
        ME meA03 = ME.A09;
        String strA04 = A04(148, 15, 93);
        boolean zA0K = A0K(this.A01);
        if (!zA0K) {
            zA0K = A08();
        }
        if (!zA0K) {
            try {
                meA03 = A03();
                strA04 = meA03 != ME.A09 ? A04(188, 16, 61) : A04(163, 25, 59);
            } catch (Exception unused) {
                meA03 = ME.A04;
            }
        }
        this.A03.put(strA04, String.valueOf(true));
        return meA03;
    }

    public final void A0N(C2228Wh c2228Wh) {
        this.A00 = c2228Wh;
    }
}
