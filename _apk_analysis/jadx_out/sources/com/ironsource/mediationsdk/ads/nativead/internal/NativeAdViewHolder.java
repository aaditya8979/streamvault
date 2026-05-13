package com.ironsource.mediationsdk.ads.nativead.internal;

import android.view.View;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayMediaView;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class NativeAdViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private View f32356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private View f32357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private View f32358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private View f32359d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private LevelPlayMediaView f32360e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private View f32361f;

    @Nullable
    public final View getAdvertiserView() {
        return this.f32357b;
    }

    @Nullable
    public final View getBodyView() {
        return this.f32359d;
    }

    @Nullable
    public final View getCallToActionView() {
        return this.f32361f;
    }

    @Nullable
    public final View getIconView() {
        return this.f32358c;
    }

    @Nullable
    public final LevelPlayMediaView getMediaView() {
        return this.f32360e;
    }

    @Nullable
    public final View getTitleView() {
        return this.f32356a;
    }

    public final void setAdvertiserView(@Nullable View view) {
        this.f32357b = view;
    }

    public final void setBodyView(@Nullable View view) {
        this.f32359d = view;
    }

    public final void setCallToActionView(@Nullable View view) {
        this.f32361f = view;
    }

    public final void setIconView(@Nullable View view) {
        this.f32358c = view;
    }

    public final void setMediaView(@Nullable LevelPlayMediaView levelPlayMediaView) {
        this.f32360e = levelPlayMediaView;
    }

    public final void setTitleView(@Nullable View view) {
        this.f32356a = view;
    }
}
