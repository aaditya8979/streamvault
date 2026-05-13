package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.AdSettings;
import com.facebook.ads.RewardData;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.facebook.ads.internal.settings.MultithreadedBundleWrapper;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Nt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC2013Nt {
    public static byte[] A00;
    public static String[] A01 = {"alBbxktHBjENZciLxR6rw2zD", "0bEVAsoxw6W3iWGX6BxBwig2lvfARzA8", "5kBw8VexBy79GKA0j07dIkKJ", "062DxPuwmCK6gWRcItF5YTW3Hm4KDyy6", "ouexH0ba", "qAJVUQLE", "GBKgEyO20ouPxSasMb", "BGZyEH20hLZ9tDha5NwFDNnmUBWPcH0M"};

    static {
        A07();
    }

    public static Bundle A00(SQ sq2) {
        Bundle bundle = new Bundle();
        A08(bundle, sq2);
        bundle.putBundle(A06(123, 19, 81), A01(sq2));
        return bundle;
    }

    public static Bundle A01(SQ sq2) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(A06(67, 23, 65), AdSettings.isMixedAudience());
        bundle.putBoolean(A06(6, 27, 119), AdInternalSettings.isExplicitTestMode());
        String adTypeString = AdSettings.getTestAdType().getAdTypeString();
        if (adTypeString != null) {
            bundle.putString(A06(272, 20, 120), adTypeString);
        }
        MultithreadedBundleWrapper multithreadedBundleWrapper = AdInternalSettings.sSettingsBundle;
        String strA06 = A06(177, 27, 55);
        String[] stringArray = multithreadedBundleWrapper.getStringArray(strA06);
        if (stringArray != null) {
            bundle.putStringArray(strA06, stringArray);
        }
        MultithreadedBundleWrapper multithreadedBundleWrapper2 = AdInternalSettings.sSettingsBundle;
        String strA062 = A06(142, 35, 79);
        Integer integer = multithreadedBundleWrapper2.getInteger(strA062);
        if (integer != null) {
            bundle.putInt(strA062, integer.intValue());
        }
        MultithreadedBundleWrapper multithreadedBundleWrapper3 = AdInternalSettings.sSettingsBundle;
        String strA063 = A06(204, 33, 112);
        Integer integer2 = multithreadedBundleWrapper3.getInteger(strA063);
        if (integer2 != null) {
            bundle.putInt(strA063, integer2.intValue());
        }
        MultithreadedBundleWrapper multithreadedBundleWrapper4 = AdInternalSettings.sSettingsBundle;
        String strA064 = A06(426, 25, 65);
        String string = multithreadedBundleWrapper4.getString(strA064, null);
        if (string != null) {
            bundle.putString(strA064, string);
        }
        bundle.putBoolean(A06(54, 13, 2), C2233Wm.A05(sq2));
        return bundle;
    }

    public static Bundle A02(String str, C2746gv c2746gv) {
        Bundle bundle = new Bundle();
        A08(bundle, c2746gv.A05());
        bundle.putString(A06(451, 17, 16), c2746gv.A0A());
        bundle.putString(A06(259, 13, 76), str);
        bundle.putString(A06(292, 19, 18), c2746gv.A07());
        bundle.putString(A06(366, 19, 0), c2746gv.A08());
        bundle.putString(A06(404, 22, 98), c2746gv.A09());
        bundle.putString(A06(385, 19, 96), AbstractC2009Np.A01(c2746gv.A0B()));
        RewardData rewardDataA03 = c2746gv.A03();
        if (rewardDataA03 != null) {
            AbstractC2014Nu.A00(bundle, rewardDataA03);
        }
        C2529dL c2529dLA05 = c2746gv.A05();
        if (A01[7].charAt(1) != 'G') {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[3] = "0oVBtG1RnxV7P3aL2rsTsgmpFLriyJEV";
        strArr[1] = "0Gc5rqVWsYOknMrZ8UJ0maJdrGSSYWXy";
        bundle.putBundle(A06(123, 19, 81), A01(c2529dLA05));
        return bundle;
    }

    public static Bundle A03(String str, C2737gm c2737gm) {
        Bundle bundle = new Bundle();
        A08(bundle, c2737gm.A0B);
        bundle.putString(A06(451, 17, 16), c2737gm.A0D);
        bundle.putString(A06(259, 13, 76), str);
        bundle.putString(A06(292, 19, 18), c2737gm.A05);
        bundle.putString(A06(366, 19, 0), c2737gm.A06);
        bundle.putString(A06(404, 22, 98), c2737gm.A07);
        AdExperienceType adExperienceType = c2737gm.A02;
        if (adExperienceType != null) {
            bundle.putString(A06(237, 22, 24), AbstractC2008No.A02(adExperienceType));
        }
        bundle.putBoolean(A06(90, 33, 27), c2737gm.A08);
        RewardData rewardData = c2737gm.A03;
        if (rewardData != null) {
            AbstractC2014Nu.A00(bundle, rewardData);
        }
        bundle.putBundle(A06(123, 19, 81), A01(c2737gm.A0B));
        return bundle;
    }

    public static C2746gv A04(C2529dL c2529dL, Bundle bundle, String str) {
        String string = bundle.getString(A06(451, 17, 16));
        String string2 = bundle.getString(A06(292, 19, 18));
        String string3 = bundle.getString(A06(366, 19, 0));
        String string4 = bundle.getString(A06(404, 22, 98));
        String string5 = bundle.getString(A06(344, 22, 96));
        Bundle bundle2 = bundle.getBundle(A06(123, 19, 81));
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        if (string == null) {
            string = A06(0, 0, 60);
        }
        C2746gv c2746gv = new C2746gv(c2529dL, null, string, new C2741gq(str, string5, bundle2));
        c2746gv.A0I(string3);
        c2746gv.A0H(string2);
        c2746gv.A0J(string4);
        c2746gv.A0K(AbstractC2009Np.A02(bundle.getString(A06(385, 19, 96))));
        RewardData rewardDataA01 = AbstractC2014Nu.A01(bundle);
        if (rewardDataA01 != null) {
            c2746gv.A0F(rewardDataA01);
        }
        return c2746gv;
    }

    public static C2737gm A05(C2529dL c2529dL, Bundle bundle, String str) {
        String string = bundle.getString(A06(451, 17, 16));
        String string2 = bundle.getString(A06(292, 19, 18));
        boolean z10 = bundle.getBoolean(A06(90, 33, 27));
        String string3 = bundle.getString(A06(366, 19, 0));
        String string4 = bundle.getString(A06(404, 22, 98));
        String string5 = bundle.getString(A06(237, 22, 24));
        String string6 = bundle.getString(A06(344, 22, 96));
        Bundle bundle2 = bundle.getBundle(A06(123, 19, 81));
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        if (string == null) {
            string = A06(0, 0, 60);
        }
        C2737gm c2737gm = new C2737gm(c2529dL, string, null, new C2741gq(str, string6, bundle2));
        c2737gm.A06 = string3;
        c2737gm.A05 = string2;
        c2737gm.A08 = z10;
        c2737gm.A02 = AbstractC2008No.A00(string5);
        c2737gm.A07 = string4;
        RewardData rewardDataA01 = AbstractC2014Nu.A01(bundle);
        if (rewardDataA01 != null) {
            c2737gm.A03 = rewardDataA01;
        }
        return c2737gm;
    }

    public static String A06(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A01;
            if (strArr[3].charAt(0) != strArr[1].charAt(0)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[5] = "tBRy7z9w";
            strArr2[4] = "5uJXeywj";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 69);
            i13++;
        }
    }

    public static void A07() {
        A00 = new byte[]{-32, -40, -36, -38, -40, -38, -2, 11, 11, 8, 27, 1, 20, 12, 8, 5, -1, 5, 16, 27, 16, 1, 15, 16, 27, 9, 11, 0, 1, 27, 7, 1, 21, -66, -53, -53, -56, -37, -59, -49, -37, -62, -47, -54, -54, -63, -56, -37, -56, -53, -61, -61, -63, -64, -119, -106, -106, -109, -90, -112, -102, -90, -100, -107, -112, -101, -96, -56, -43, -43, -46, -27, -45, -49, -34, -53, -54, -27, -57, -37, -54, -49, -53, -44, -55, -53, -27, -47, -53, -33, -94, -81, -81, -84, -65, -78, -74, -65, -90, -95, -87, -84, -65, -81, -82, -65, -93, -95, -93, -88, -91, -65, -90, -95, -87, -84, -75, -78, -91, -65, -85, -91, -71, -40, -21, -28, -38, -30, -37, -11, -23, -37, -22, -22, -33, -28, -35, -23, -11, ExifInterface.MARKER_APP1, -37, -17, -40, -43, -24, -43, -13, -28, -26, -29, -41, ExifInterface.MARKER_EOI, -25, -25, -35, -30, -37, -13, -29, -28, -24, -35, -29, -30, -25, -13, -41, -29, -23, -30, -24, -26, -19, -13, -33, ExifInterface.MARKER_EOI, -19, -64, -67, -48, -67, -37, -52, -50, -53, -65, -63, -49, -49, -59, -54, -61, -37, -53, -52, -48, -59, -53, -54, -49, -37, -57, -63, -43, -7, -10, 9, -10, 20, 5, 7, 4, -8, -6, 8, 8, -2, 3, -4, 20, 4, 5, 9, -2, 4, 3, 8, 20, 8, 9, -10, 9, -6, 20, 0, -6, 14, -80, -79, -81, -68, -98, -95, -68, -94, -75, -83, -94, -81, -90, -94, -85, -96, -94, -68, -79, -74, -83, -94, -28, -27, -29, -16, -46, -43, -16, -38, -43, -16, -36, -42, -22, 16, 17, 15, 28, -2, 1, 28, 17, 2, 16, 17, 28, 17, 22, 13, 2, 28, 8, 2, 22, -86, -85, -87, -74, -103, -96, -101, -74, -89, -104, -80, -93, -90, -104, -101, -74, -94, -100, -80, -53, -52, -54, -41, -70, -52, -41, -52, -57, -61, -67, -58, -41, -67, -48, -52, -54, -71, -53, -74, -73, -75, -62, -91, -72, -79, -89, -81, -88, -62, -82, -88, -68, -8, -7, -9, 4, -24, -15, -18, -22, -13, -7, 4, -8, -23, -16, 4, -5, -22, -9, -8, -18, -12, -13, -104, -103, -105, -92, -118, -99, -103, -105, -122, -92, -115, -114, -109, -103, -104, -92, -112, -118, -98, -8, -7, -9, 4, -18, -13, -7, 4, -24, -26, -24, -19, -22, 4, -21, -15, -26, -20, -8, -6, -5, -7, 6, -12, -20, -21, -16, -24, -5, -16, -10, -11, 6, -21, -24, -5, -24, 6, -14, -20, 0, ExifInterface.MARKER_EOI, -38, -40, -27, -45, -53, -54, -49, -57, -38, -49, -43, -44, -27, ExifInterface.MARKER_EOI, -53, -40, -36, -49, -55, -53, -27, -47, -53, -33, -88, -87, -89, -76, -91, -95, -106, -104, -102, -94, -102, -93, -87, -76, -96, -102, -82};
    }

    public static void A08(Bundle bundle, SQ sq2) {
        bundle.putString(A06(344, 22, 96), A06(0, 6, 101));
        bundle.putBoolean(A06(33, 21, 55), C2136Sp.A0I(sq2) || (sq2 instanceof C2529dL ? ((C2529dL) sq2).A0F().AAK() : false));
        bundle.putString(A06(330, 14, 30), sq2.getPackageName());
        if (UA.A0G(sq2)) {
            bundle.putString(A06(311, 19, 51), new S5().A03(sq2));
        }
    }
}
