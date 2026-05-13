package com.applovin.mediation.nativeAds;

import android.view.View;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;

/* JADX INFO: loaded from: classes5.dex */
public class MaxNativeAdViewBinder {

    @IdRes
    public final int advertiserTextViewId;

    @IdRes
    public final int bodyTextViewId;

    @IdRes
    public final int callToActionButtonId;

    @IdRes
    public final int iconContentViewId;

    @IdRes
    public final int iconImageViewId;

    @LayoutRes
    public final int layoutResourceId;
    public final View mainView;

    @IdRes
    public final int mediaContentFrameLayoutId;

    @IdRes
    public final int mediaContentViewGroupId;

    @IdRes
    public final int optionsContentFrameLayoutId;

    @IdRes
    public final int optionsContentViewGroupId;

    @IdRes
    public final int starRatingContentViewGroupId;
    public final String templateType;

    @IdRes
    public final int titleTextViewId;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f11175a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f11176b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f11177c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f11178d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f11179e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f11180f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f11181g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f11182h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f11183i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f11184j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f11185k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f11186l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f11187m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f11188n;

        public Builder(@LayoutRes int i10) {
            this(i10, null);
        }

        private Builder(int i10, View view) {
            this.f11177c = -1;
            this.f11178d = -1;
            this.f11179e = -1;
            this.f11180f = -1;
            this.f11181g = -1;
            this.f11182h = -1;
            this.f11183i = -1;
            this.f11184j = -1;
            this.f11185k = -1;
            this.f11186l = -1;
            this.f11187m = -1;
            this.f11176b = i10;
            this.f11175a = view;
        }

        public Builder(View view) {
            this(-1, view);
        }

        public MaxNativeAdViewBinder build() {
            return new MaxNativeAdViewBinder(this.f11175a, this.f11176b, this.f11177c, this.f11178d, this.f11179e, this.f11180f, this.f11181g, this.f11184j, this.f11182h, this.f11183i, this.f11185k, this.f11186l, this.f11187m, this.f11188n);
        }

        public Builder setAdvertiserTextViewId(@IdRes int i10) {
            this.f11178d = i10;
            return this;
        }

        public Builder setBodyTextViewId(@IdRes int i10) {
            this.f11179e = i10;
            return this;
        }

        public Builder setCallToActionButtonId(@IdRes int i10) {
            this.f11187m = i10;
            return this;
        }

        @Deprecated
        public Builder setIconContentViewId(@IdRes int i10) {
            this.f11181g = i10;
            return this;
        }

        public Builder setIconImageViewId(@IdRes int i10) {
            this.f11180f = i10;
            return this;
        }

        @Deprecated
        public Builder setMediaContentFrameLayoutId(@IdRes int i10) {
            this.f11186l = i10;
            return this;
        }

        public Builder setMediaContentViewGroupId(@IdRes int i10) {
            this.f11185k = i10;
            return this;
        }

        @Deprecated
        public Builder setOptionsContentFrameLayoutId(@IdRes int i10) {
            this.f11183i = i10;
            return this;
        }

        public Builder setOptionsContentViewGroupId(@IdRes int i10) {
            this.f11182h = i10;
            return this;
        }

        public Builder setStarRatingContentViewGroupId(@IdRes int i10) {
            this.f11184j = i10;
            return this;
        }

        public Builder setTemplateType(String str) {
            this.f11188n = str;
            return this;
        }

        public Builder setTitleTextViewId(@IdRes int i10) {
            this.f11177c = i10;
            return this;
        }
    }

    private MaxNativeAdViewBinder(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, String str) {
        this.mainView = view;
        this.layoutResourceId = i10;
        this.titleTextViewId = i11;
        this.advertiserTextViewId = i12;
        this.bodyTextViewId = i13;
        this.iconImageViewId = i14;
        this.iconContentViewId = i15;
        this.starRatingContentViewGroupId = i16;
        this.optionsContentViewGroupId = i17;
        this.optionsContentFrameLayoutId = i18;
        this.mediaContentViewGroupId = i19;
        this.mediaContentFrameLayoutId = i20;
        this.callToActionButtonId = i21;
        this.templateType = str;
    }
}
