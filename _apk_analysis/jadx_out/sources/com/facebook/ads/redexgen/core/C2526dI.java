package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.ads.AdSettings;
import com.facebook.ads.RewardData;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2526dI {
    public static byte[] A05;
    public Executor A00 = XU.A06;
    public final C2529dL A01;
    public final InterfaceC2260Xn A02;
    public final YY A03;
    public final String A04;

    static {
        A04();
    }

    public C2526dI(C2529dL c2529dL, YY yy, String str, InterfaceC2260Xn interfaceC2260Xn) {
        this.A01 = c2529dL;
        this.A03 = yy;
        this.A04 = str;
        this.A02 = interfaceC2260Xn;
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 76);
        }
        return new String(bArrCopyOfRange);
    }

    public static String A03(RewardData rewardData, String str, String str2) {
        if (rewardData == null) {
            return null;
        }
        String urlPrefix = AdSettings.getUrlPrefix();
        Uri uriA00 = WQ.A00((urlPrefix == null || urlPrefix.isEmpty()) ? A02(68, 60, 45) : String.format(Locale.US, A02(5, 63, 95), urlPrefix));
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(uriA00.getScheme());
        builder.authority(uriA00.getAuthority());
        builder.path(uriA00.getPath());
        builder.query(uriA00.getQuery());
        builder.fragment(uriA00.getFragment());
        builder.appendQueryParameter(A02(134, 4, 110), rewardData.getUserID());
        builder.appendQueryParameter(A02(128, 2, 88), rewardData.getCurrency());
        builder.appendQueryParameter(A02(130, 4, 99), str);
        builder.appendQueryParameter(A02(0, 5, 88), str2);
        return builder.build().toString();
    }

    public static void A04() {
        A05 = new byte[]{5, 20, 20, 13, 8, 19, 31, 31, 27, 30, -27, -38, -38, 34, 34, 34, ExifInterface.MARKER_EOI, -48, 30, ExifInterface.MARKER_EOI, 17, 12, 14, 16, 13, 26, 26, 22, ExifInterface.MARKER_EOI, 14, 26, 24, -38, 12, 32, 15, 20, 16, 25, 14, 16, 10, 25, 16, 31, 34, 26, 29, 22, -38, 30, 16, 29, 33, 16, 29, 10, 30, 20, 15, 16, 10, 29, 16, 34, 12, 29, 15, ExifInterface.MARKER_APP1, -19, -19, -23, -20, -77, -88, -88, -16, -16, -16, -89, -33, -38, -36, -34, -37, -24, -24, -28, -89, -36, -24, -26, -88, -38, -18, -35, -30, -34, -25, -36, -34, -40, -25, -34, -19, -16, -24, -21, -28, -88, -20, -34, -21, -17, -34, -21, -40, -20, -30, -35, -34, -40, -21, -34, -16, -38, -21, -35, 20, 7, 31, 35, 24, 19, ExifInterface.START_CODE, 47, 35, 30};
    }

    public final void A05() {
        if (TextUtils.isEmpty(this.A04)) {
            return;
        }
        AsyncTaskC2628ex asyncTaskC2628ex = new AsyncTaskC2628ex(this.A01, new HashMap());
        asyncTaskC2628ex.A07(new EV(this));
        asyncTaskC2628ex.executeOnExecutor(this.A00, this.A04);
    }
}
