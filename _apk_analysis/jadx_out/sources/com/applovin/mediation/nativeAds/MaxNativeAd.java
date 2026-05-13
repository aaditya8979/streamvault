package com.applovin.mediation.nativeAds;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.applovin.impl.mediation.nativeAds.MaxNativeAdImpl;
import com.applovin.mediation.MaxAdFormat;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class MaxNativeAd extends MaxNativeAdImpl {
    private static final float MINIMUM_STARS_TO_RENDER = 3.0f;
    private final String advertiser;
    private final String body;
    private final String callToAction;
    private final MaxAdFormat format;
    private final MaxNativeAdImage icon;
    private final View iconView;
    private boolean isExpired;
    private final MaxNativeAdImage mainImage;
    private final float mediaContentAspectRatio;
    private final View mediaView;
    private MaxNativeAdView nativeAdView;
    private final View optionsView;
    private final Double starRating;
    private final String title;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private MaxAdFormat f11144a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f11145b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f11146c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f11147d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f11148e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private MaxNativeAdImage f11149f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private View f11150g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private View f11151h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private View f11152i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private MaxNativeAdImage f11153j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private float f11154k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private Double f11155l;

        public MaxNativeAd build() {
            return new MaxNativeAd(this);
        }

        public Builder setAdFormat(MaxAdFormat maxAdFormat) {
            this.f11144a = maxAdFormat;
            return this;
        }

        public Builder setAdvertiser(String str) {
            this.f11146c = str;
            return this;
        }

        public Builder setBody(String str) {
            this.f11147d = str;
            return this;
        }

        public Builder setCallToAction(String str) {
            this.f11148e = str;
            return this;
        }

        public Builder setIcon(MaxNativeAdImage maxNativeAdImage) {
            this.f11149f = maxNativeAdImage;
            return this;
        }

        public Builder setIconView(View view) {
            this.f11150g = view;
            return this;
        }

        public Builder setMainImage(MaxNativeAdImage maxNativeAdImage) {
            this.f11153j = maxNativeAdImage;
            return this;
        }

        public Builder setMediaContentAspectRatio(float f10) {
            this.f11154k = f10;
            return this;
        }

        public Builder setMediaView(View view) {
            this.f11152i = view;
            return this;
        }

        public Builder setOptionsView(View view) {
            this.f11151h = view;
            return this;
        }

        public Builder setStarRating(Double d10) {
            this.f11155l = d10;
            return this;
        }

        public Builder setTitle(String str) {
            this.f11145b = str;
            return this;
        }
    }

    public static class MaxNativeAdImage {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Drawable f11156a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Uri f11157b;

        public MaxNativeAdImage(Drawable drawable) {
            this.f11156a = drawable;
        }

        public MaxNativeAdImage(Uri uri) {
            this.f11157b = uri;
        }

        @Nullable
        public Drawable getDrawable() {
            return this.f11156a;
        }

        @Nullable
        public Uri getUri() {
            return this.f11157b;
        }
    }

    public MaxNativeAd(Builder builder) {
        this.format = builder.f11144a;
        this.title = builder.f11145b;
        this.advertiser = builder.f11146c;
        this.body = builder.f11147d;
        this.callToAction = builder.f11148e;
        this.icon = builder.f11149f;
        this.iconView = builder.f11150g;
        this.optionsView = builder.f11151h;
        this.mediaView = builder.f11152i;
        this.mainImage = builder.f11153j;
        this.mediaContentAspectRatio = builder.f11154k;
        Double d10 = builder.f11155l;
        this.starRating = (d10 == null || d10.doubleValue() < 3.0d) ? null : d10;
    }

    @Nullable
    public final String getAdvertiser() {
        return this.advertiser;
    }

    @Nullable
    public final String getBody() {
        return this.body;
    }

    @Nullable
    public final String getCallToAction() {
        return this.callToAction;
    }

    @NonNull
    public final MaxAdFormat getFormat() {
        return this.format;
    }

    @Nullable
    public final MaxNativeAdImage getIcon() {
        return this.icon;
    }

    @Nullable
    public final View getIconView() {
        return this.iconView;
    }

    @Nullable
    public final MaxNativeAdImage getMainImage() {
        return this.mainImage;
    }

    public final float getMediaContentAspectRatio() {
        return this.mediaContentAspectRatio;
    }

    @Nullable
    public final View getMediaView() {
        return this.mediaView;
    }

    @Nullable
    public final View getOptionsView() {
        return this.optionsView;
    }

    @Nullable
    public final Double getStarRating() {
        return this.starRating;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public boolean isContainerClickable() {
        return false;
    }

    public final boolean isExpired() {
        return this.isExpired;
    }

    @UiThread
    public void performClick() {
        Button callToActionButton;
        MaxNativeAdView maxNativeAdView = this.nativeAdView;
        if (maxNativeAdView == null || (callToActionButton = maxNativeAdView.getCallToActionButton()) == null) {
            return;
        }
        callToActionButton.performClick();
    }

    public boolean prepareForInteraction(List<View> list, ViewGroup viewGroup) {
        return false;
    }

    @Deprecated
    public void prepareViewForInteraction(MaxNativeAdView maxNativeAdView) {
    }

    public void setExpired() {
        this.isExpired = true;
    }

    public void setNativeAdView(MaxNativeAdView maxNativeAdView) {
        this.nativeAdView = maxNativeAdView;
    }

    public boolean shouldPrepareViewForInteractionOnMainThread() {
        return true;
    }
}
