package com.yandex.mobile.ads.nativeads;

import com.ironsource.C3978d4;
import yads.q12;
import yads.q22;
import yads.r12;

/* JADX INFO: loaded from: classes12.dex */
public final class f {
    public static r12 a(NativeAdViewBinder nativeAdViewBinder) {
        q12 q12Var = new q12(nativeAdViewBinder.getNativeAdView(), q22.f93868c, kotlin.collections.a.j());
        q12Var.f93862e.put("age", nativeAdViewBinder.getAgeView());
        q12Var.f93862e.put("body", nativeAdViewBinder.getBodyView());
        q12Var.f93862e.put("call_to_action", nativeAdViewBinder.getCallToActionView());
        q12Var.f93862e.put(C3978d4.j.D, nativeAdViewBinder.getDomainView());
        q12Var.f93862e.put("favicon", nativeAdViewBinder.getFaviconView());
        q12Var.f93862e.put("feedback", nativeAdViewBinder.getFeedbackView());
        q12Var.f93862e.put("icon", nativeAdViewBinder.getIconView());
        q12Var.f93862e.put(C3978d4.i.I0, nativeAdViewBinder.getMediaView());
        q12Var.f93862e.put("price", nativeAdViewBinder.getPriceView());
        q12Var.f93862e.put("rating", nativeAdViewBinder.getRatingView());
        q12Var.f93862e.put("review_count", nativeAdViewBinder.getReviewCountView());
        q12Var.f93862e.put("sponsored", nativeAdViewBinder.getSponsoredView());
        q12Var.f93862e.put("title", nativeAdViewBinder.getTitleView());
        q12Var.f93862e.put("warning", nativeAdViewBinder.getWarningView());
        return new r12(q12Var);
    }
}
