package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.NativeAdView;
import com.facebook.ads.NativeAdViewAttributes;
import com.facebook.ads.internal.api.NativeAdViewApi;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class RM implements NativeAdViewApi {
    public static View A00(C2529dL c2529dL, NativeAd nativeAd, NativeAdView.Type type, NativeAdViewAttributes nativeAdViewAttributes) {
        if (nativeAdViewAttributes == null) {
            nativeAdViewAttributes = new NativeAdViewAttributes();
        }
        C2189Ur c2189Ur = (C2189Ur) nativeAdViewAttributes.getInternalAttributes();
        C2072Qc c2072QcA0L = C2072Qc.A0L(nativeAd.getInternalNativeAd());
        c2072QcA0L.A1a(EnumC2190Us.A00(type.getEnumCode()));
        c2072QcA0L.A1Z(c2189Ur);
        C6Q c6q = new C6Q();
        NativeAdLayout nativeAdLayout = new NativeAdLayout(c2529dL, c6q);
        c6q.A06(nativeAdLayout, c2529dL, nativeAd, c2189Ur);
        nativeAdLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, (int) (AbstractC2232Wl.A02 * type.getHeight())));
        return nativeAdLayout;
    }

    public static View A01(C2529dL c2529dL, NativeAd nativeAd, NativeAdViewAttributes nativeAdViewAttributes) {
        if (nativeAdViewAttributes == null) {
            nativeAdViewAttributes = new NativeAdViewAttributes();
        }
        C2072Qc c2072QcA0L = C2072Qc.A0L(nativeAd.getInternalNativeAd());
        C2189Ur c2189Ur = (C2189Ur) nativeAdViewAttributes.getInternalAttributes();
        c2072QcA0L.A1a(EnumC2190Us.A0B);
        c2072QcA0L.A1Z(c2189Ur);
        C6Q c6q = new C6Q();
        NativeAdLayout nativeAdLayout = new NativeAdLayout(c2529dL, c6q);
        c6q.A06(nativeAdLayout, c2529dL, nativeAd, c2189Ur);
        return nativeAdLayout;
    }

    @Override // com.facebook.ads.internal.api.NativeAdViewApi
    public final View render(Context context, NativeAd nativeAd) {
        return render(context, nativeAd, (NativeAdViewAttributes) null);
    }

    @Override // com.facebook.ads.internal.api.NativeAdViewApi
    public final View render(Context context, NativeAd nativeAd, NativeAdView.Type type) {
        return render(context, nativeAd, type, null);
    }

    @Override // com.facebook.ads.internal.api.NativeAdViewApi
    public final View render(Context context, NativeAd nativeAd, NativeAdView.Type type, NativeAdViewAttributes nativeAdViewAttributes) {
        try {
            return A00(RB.A03(context), nativeAd, type, nativeAdViewAttributes);
        } catch (Throwable th2) {
            return YB.A00(RB.A03(context), th2);
        }
    }

    @Override // com.facebook.ads.internal.api.NativeAdViewApi
    public final View render(Context context, NativeAd nativeAd, NativeAdViewAttributes nativeAdViewAttributes) {
        try {
            return A01(context instanceof C2529dL ? (C2529dL) context : RB.A03(context), nativeAd, nativeAdViewAttributes);
        } catch (Throwable th2) {
            return YB.A00(RB.A03(context), th2);
        }
    }
}
