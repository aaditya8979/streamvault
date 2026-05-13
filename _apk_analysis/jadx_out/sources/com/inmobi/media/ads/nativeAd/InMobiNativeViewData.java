package com.inmobi.media.ads.nativeAd;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: loaded from: classes3.dex */
public final class InMobiNativeViewData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f26771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f26772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f26773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f26774d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f26775e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f26776f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f26777g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f26778h;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ViewGroup f26779a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public View f26780b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public View f26781c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ImageView f26782d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public View f26783e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public View f26784f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public View f26785g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ArrayList f26786h;

        public Builder(@NotNull ViewGroup viewGroup) {
            p.k(viewGroup, "parentView");
            this.f26779a = viewGroup;
            this.f26786h = new ArrayList();
        }

        @NotNull
        public final InMobiNativeViewData build() {
            return new InMobiNativeViewData(this.f26779a, this.f26780b, this.f26781c, this.f26782d, this.f26783e, this.f26784f, this.f26785g, this.f26786h, null);
        }

        @NotNull
        public final Builder setAdvertiserView(@Nullable View view) {
            this.f26785g = view;
            return this;
        }

        @NotNull
        public final Builder setCTAView(@Nullable View view) {
            this.f26783e = view;
            return this;
        }

        @NotNull
        public final Builder setDescriptionView(@Nullable View view) {
            this.f26781c = view;
            return this;
        }

        @NotNull
        public final Builder setExtraViews(@NotNull List<? extends View> list) {
            p.k(list, "extraViews");
            this.f26786h.addAll(list);
            return this;
        }

        @NotNull
        public final Builder setIconView(@Nullable ImageView imageView) {
            this.f26782d = imageView;
            return this;
        }

        @NotNull
        public final Builder setRatingView(@Nullable View view) {
            this.f26784f = view;
            return this;
        }

        @NotNull
        public final Builder setTitleView(@Nullable View view) {
            this.f26780b = view;
            return this;
        }
    }

    public InMobiNativeViewData(ViewGroup viewGroup, View view, View view2, ImageView imageView, View view3, View view4, View view5, List list, i iVar) {
        this.f26771a = viewGroup;
        this.f26772b = view;
        this.f26773c = view2;
        this.f26774d = imageView;
        this.f26775e = view3;
        this.f26776f = view4;
        this.f26777g = view5;
        this.f26778h = list;
    }

    @Nullable
    public final View getAdvertiserView$media_release() {
        return this.f26777g;
    }

    @Nullable
    public final View getCtaView$media_release() {
        return this.f26775e;
    }

    @Nullable
    public final View getDescriptionView$media_release() {
        return this.f26773c;
    }

    @NotNull
    public final List<View> getExtraViews$media_release() {
        return this.f26778h;
    }

    @Nullable
    public final ImageView getIconView$media_release() {
        return this.f26774d;
    }

    @NotNull
    public final ViewGroup getParentView$media_release() {
        return this.f26771a;
    }

    @Nullable
    public final View getRatingView$media_release() {
        return this.f26776f;
    }

    @Nullable
    public final View getTitleView$media_release() {
        return this.f26772b;
    }
}
