package com.facebook.ads.redexgen.core;

import android.content.Context;
import com.facebook.ads.NativeAdScrollView;
import com.facebook.ads.NativeAdView;
import com.facebook.ads.NativeAdViewAttributes;
import com.facebook.ads.NativeAdsManager;
import com.facebook.ads.internal.api.NativeAdScrollViewApi;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class RL implements NativeAdScrollViewApi {
    public static byte[] A07;
    public static String[] A08 = {"nVlKDJKKuSIwTlTd16ukFrbX3MHjOHdA", "", "ICm0nIVybe3UlAuBnNKxRWg2mc3pSWnS", "", "SSXPkfr4Ttu5KI5IplEjDPNbu7CwAkh6", "a5Au6kTC9kTmWkoQnewo7jq8", "NRpBzWywFD0YlyTuhproyOYpEldGp2Hb", InneractiveMediationDefs.GENDER_MALE};
    public final int A00;
    public final NativeAdScrollView.AdViewProvider A01;
    public final NativeAdView.Type A02;
    public final NativeAdViewAttributes A03;
    public final NativeAdsManager A04;
    public final C2670fe A05;
    public final C2529dL A06;

    static {
        A07();
    }

    public RL(NativeAdScrollView nativeAdScrollView, Context context, NativeAdsManager nativeAdsManager, NativeAdScrollView.AdViewProvider adViewProvider, int i10, NativeAdView.Type type, NativeAdViewAttributes nativeAdViewAttributes, int i11) {
        if (!nativeAdsManager.isLoaded()) {
            throw new IllegalStateException(A06(74, 27, 8));
        }
        if (type == null && adViewProvider == null && i10 <= 0) {
            throw new IllegalArgumentException(A06(0, 74, 3));
        }
        this.A06 = RB.A03(context);
        this.A04 = nativeAdsManager;
        this.A03 = nativeAdViewAttributes;
        this.A01 = adViewProvider;
        this.A02 = type;
        this.A00 = i11;
        C2671ff c2671ff = new C2671ff(this);
        this.A05 = new C2670fe(context);
        if (this.A02 != null) {
            this.A05.A00((int) (AbstractC2232Wl.A02 * this.A02.getHeight()));
        } else if (i10 > 0) {
            this.A05.A00(((int) AbstractC2232Wl.A02) * i10);
        }
        this.A05.setAdapter(c2671ff);
        setInset(20);
        c2671ff.A09();
        nativeAdScrollView.addView(this.A05);
    }

    public static String A06(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 114);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        byte[] bArr = {60, 4, 2, 5, 81, 1, 3, 30, 7, 24, 21, 20, 81, 16, 81, 63, 16, 5, 24, 7, 20, 48, 21, 39, 24, 20, 6, 95, 37, 8, 1, 20, 93, 81, 48, 21, 39, 24, 20, 6, 33, 3, 30, 7, 24, 21, 20, 3, 81, 30, 3, 81, 16, 81, 31, 16, 5, 24, 7, 20, 48, 21, 39, 24, 20, 6, 57, 20, 24, 22, 25, 5, 53, 1, 52, 27, 14, 19, 12, 31, 59, 30, 9, 55, 27, 20, 27, 29, 31, 8, 90, 20, 21, 14, 90, 22, 21, 27, 30, 31, 30};
        String[] strArr = A08;
        if (strArr[6].charAt(14) != strArr[0].charAt(14)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A08;
        strArr2[2] = "Ml52sYoz4FZavAZNhfJ3fi3jnwDnZY4L";
        strArr2[4] = "tWqTcrLKFqppCUd7uCsjOJfAn0Jrdt0w";
        A07 = bArr;
    }

    @Override // com.facebook.ads.internal.api.NativeAdScrollViewApi
    public final void setInset(int i10) {
        if (i10 > 0) {
            float f10 = AbstractC2232Wl.A02;
            int iRound = Math.round(i10 * f10);
            this.A05.setPadding(iRound, 0, iRound, 0);
            this.A05.setPageMargin(Math.round((i10 / 2) * f10));
            this.A05.setClipToPadding(false);
        }
    }
}
