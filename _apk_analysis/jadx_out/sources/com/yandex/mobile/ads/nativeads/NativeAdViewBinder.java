package com.yandex.mobile.ads.nativeads;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ironsource.C3978d4;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: loaded from: classes5.dex */
public final class NativeAdViewBinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f59214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f59215b;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f59216a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final LinkedHashMap f59217b;

        public Builder(@NotNull View view) {
            this.f59216a = view;
            this.f59217b = new LinkedHashMap();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull NativeAdView nativeAdView) {
            this((View) nativeAdView);
            p.i(nativeAdView, "null cannot be cast to non-null type android.view.View");
        }

        @NotNull
        public final NativeAdViewBinder build() {
            return new NativeAdViewBinder(this.f59216a, this.f59217b, null);
        }

        @NotNull
        public final Builder setBodyView(@Nullable TextView textView) {
            this.f59217b.put("body", textView);
            return this;
        }

        @NotNull
        public final Builder setCallToActionView(@Nullable TextView textView) {
            this.f59217b.put("call_to_action", textView);
            return this;
        }

        @NotNull
        public final Builder setDomainView(@Nullable TextView textView) {
            this.f59217b.put(C3978d4.j.D, textView);
            return this;
        }

        @NotNull
        public final Builder setFeedbackView(@Nullable ImageView imageView) {
            this.f59217b.put("feedback", imageView);
            return this;
        }

        @NotNull
        public final Builder setIconView(@Nullable ImageView imageView) {
            this.f59217b.put("icon", imageView);
            return this;
        }

        @NotNull
        public final Builder setMediaView(@Nullable MediaView mediaView) {
            this.f59217b.put(C3978d4.i.I0, mediaView);
            return this;
        }

        @NotNull
        public final Builder setTitleView(@Nullable TextView textView) {
            this.f59217b.put("title", textView);
            return this;
        }
    }

    private NativeAdViewBinder(View view, Map map) {
        this.f59214a = view;
        this.f59215b = map;
    }

    public /* synthetic */ NativeAdViewBinder(View view, Map map, i iVar) {
        this(view, map);
    }

    @Nullable
    public TextView getAgeView() {
        View view = getAssetViews().get("age");
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    @NotNull
    public Map<String, View> getAssetViews() {
        return this.f59215b;
    }

    @Nullable
    public TextView getBodyView() {
        View view = getAssetViews().get("body");
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    @Nullable
    public TextView getCallToActionView() {
        View view = getAssetViews().get("call_to_action");
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    @Nullable
    public TextView getDomainView() {
        View view = getAssetViews().get(C3978d4.j.D);
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    @Nullable
    public ImageView getFaviconView() {
        View view = getAssetViews().get("favicon");
        if (view instanceof ImageView) {
            return (ImageView) view;
        }
        return null;
    }

    @Nullable
    public ImageView getFeedbackView() {
        View view = getAssetViews().get("feedback");
        if (view instanceof ImageView) {
            return (ImageView) view;
        }
        return null;
    }

    @Nullable
    public ImageView getIconView() {
        View view = getAssetViews().get("icon");
        if (view instanceof ImageView) {
            return (ImageView) view;
        }
        return null;
    }

    @Nullable
    public MediaView getMediaView() {
        View view = getAssetViews().get(C3978d4.i.I0);
        if (view instanceof MediaView) {
            return (MediaView) view;
        }
        return null;
    }

    @NotNull
    public final View getNativeAdView() {
        return this.f59214a;
    }

    @Nullable
    public TextView getPriceView() {
        View view = getAssetViews().get("price");
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    @Nullable
    public View getRatingView() {
        return getAssetViews().get("rating");
    }

    @Nullable
    public TextView getReviewCountView() {
        View view = getAssetViews().get("review_count");
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    @Nullable
    public TextView getSponsoredView() {
        View view = getAssetViews().get("sponsored");
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    @Nullable
    public TextView getTitleView() {
        View view = getAssetViews().get("title");
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    @Nullable
    public TextView getWarningView() {
        View view = getAssetViews().get("warning");
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }
}
