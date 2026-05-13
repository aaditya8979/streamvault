package com.bytedance.adsdk.ugeno.ra;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import androidx.core.view.ViewCompat;
import com.ironsource.C3978d4;
import com.ironsource.Z7;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: loaded from: classes9.dex */
public final class ouw {

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.ra.ouw$ouw, reason: collision with other inner class name */
    public static class C0181ouw {

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public float[] f11797lh;
        public GradientDrawable.Orientation ouw;
        public int[] vt;
    }

    public static boolean lh(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("linear-gradient");
    }

    public static int ouw(String str) {
        return ouw(str, ViewCompat.MEASURED_STATE_MASK);
    }

    public static int ouw(String str, int i10) {
        if (TextUtils.isEmpty(str)) {
            return i10;
        }
        if (str.equals(C3978d4.i.T)) {
            return 0;
        }
        if (str.charAt(0) == '#' && str.length() == 4) {
            StringBuilder sb2 = new StringBuilder("#");
            char[] charArray = str.toCharArray();
            for (int i11 = 1; i11 < charArray.length; i11++) {
                sb2.append(charArray[i11]);
                sb2.append(charArray[i11]);
            }
            return Color.parseColor(sb2.toString());
        }
        if (str.charAt(0) == '#' && str.length() == 7) {
            return Color.parseColor(str);
        }
        if (str.charAt(0) == '#' && str.length() == 9) {
            return Color.parseColor(str);
        }
        if (!str.startsWith("rgba")) {
            return ViewCompat.MEASURED_STATE_MASK;
        }
        String[] strArrSplit = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split(StringUtils.COMMA);
        if (strArrSplit == null || strArrSplit.length != 4) {
            return i10;
        }
        return (((int) ((Float.parseFloat(strArrSplit[3]) * 255.0f) + 0.5f)) << 24) | (((int) Float.parseFloat(strArrSplit[0])) << 16) | (((int) Float.parseFloat(strArrSplit[1])) << 8) | ((int) Float.parseFloat(strArrSplit[2])) | 0;
    }

    public static C0181ouw vt(String str) {
        int i10;
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            String strSubstring = str.substring(str.indexOf("(") + 1, str.lastIndexOf(")"));
            if (TextUtils.isEmpty(strSubstring)) {
                return null;
            }
            if (TextUtils.isEmpty(strSubstring)) {
                i10 = 0;
            } else {
                i10 = 0;
                for (int i11 = 0; i11 < strSubstring.length(); i11++) {
                    if (strSubstring.charAt(i11) == '%') {
                        i10++;
                    }
                }
            }
            int iIndexOf = strSubstring.indexOf(StringUtils.COMMA);
            String strSubstring2 = strSubstring.substring(0, iIndexOf);
            C0181ouw c0181ouw = new C0181ouw();
            c0181ouw.ouw = yu(strSubstring2);
            String strSubstring3 = strSubstring.substring(iIndexOf + 1);
            int[] iArr = new int[i10];
            float[] fArr = new float[i10];
            for (int i12 = 0; i12 < i10; i12++) {
                int iIndexOf2 = strSubstring3.indexOf("%");
                String strTrim = strSubstring3.substring(0, iIndexOf2 + 1).trim();
                int iIndexOf3 = (strTrim.contains("rgba") ? strTrim.indexOf(")") : strTrim.indexOf(Z7.f30794r)) + 1;
                iArr[i12] = ouw(strTrim.substring(0, iIndexOf3).trim(), ViewCompat.MEASURED_STATE_MASK);
                fArr[i12] = lh.ouw(strTrim.substring(iIndexOf3, strTrim.indexOf("%")).trim(), 0.0f) / 100.0f;
                int i13 = iIndexOf2 + 2;
                if (strSubstring3.length() <= i13) {
                    break;
                }
                strSubstring3 = strSubstring3.substring(i13);
            }
            if (i10 < 2) {
                return null;
            }
            c0181ouw.vt = iArr;
            c0181ouw.f11797lh = fArr;
            return c0181ouw;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static GradientDrawable.Orientation yu(String str) {
        try {
            int i10 = str.contains("deg") ? Integer.parseInt(str.substring(0, str.length() - 3).trim()) : Integer.parseInt(str);
            return i10 == 90 ? GradientDrawable.Orientation.LEFT_RIGHT : i10 == 180 ? GradientDrawable.Orientation.TOP_BOTTOM : i10 == 270 ? GradientDrawable.Orientation.RIGHT_LEFT : i10 == 135 ? GradientDrawable.Orientation.TL_BR : i10 == 45 ? GradientDrawable.Orientation.BL_TR : GradientDrawable.Orientation.BOTTOM_TOP;
        } catch (Exception unused) {
            return GradientDrawable.Orientation.LEFT_RIGHT;
        }
    }
}
