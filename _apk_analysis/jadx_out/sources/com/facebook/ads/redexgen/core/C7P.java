package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7P, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C7P extends AbstractC2848im {
    public static byte[] A03;
    public Map<String, String> A00;
    public boolean A01;
    public final Uri A02;

    static {
        A01();
    }

    public C7P(C2529dL c2529dL, US us2, String str, Uri uri, Map<String, String> map) {
        super(c2529dL, us2, str, null, true, true);
        this.A02 = uri;
        this.A00 = map;
    }

    public C7P(C2529dL c2529dL, US us2, String str, Uri uri, Map<String, String> map, boolean z10) {
        this(c2529dL, us2, str, uri, map);
        this.A01 = z10;
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 77);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{88, 93, 90, 95, 59, 60, 39, 58, 45, 23, 61, 58, 36, 23, 63, 45, ExifInterface.START_CODE, 23, 46, 41, 36, 36, ExifInterface.START_CODE, 41, 43, 35};
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2848im
    public final ME A0H() {
        A0J(this.A00, null);
        return ME.A09;
    }

    public final Uri A0M() {
        String queryParameter = this.A02.getQueryParameter(A00(4, 22, 5));
        return (!this.A01 || TextUtils.isEmpty(queryParameter)) ? WQ.A00(this.A02.getQueryParameter(A00(0, 4, 121))) : WQ.A00(queryParameter);
    }
}
