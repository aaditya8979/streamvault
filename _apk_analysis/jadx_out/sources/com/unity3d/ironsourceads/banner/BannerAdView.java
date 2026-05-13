package com.unity3d.ironsourceads.banner;

import android.content.Context;
import android.widget.FrameLayout;
import com.ironsource.P2;
import com.ironsource.Q2;
import com.ironsource.mediationsdk.logger.IronLog;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: loaded from: classes12.dex */
public final class BannerAdView extends FrameLayout implements Q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private P2 f53427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private BannerAdViewListener f53428b;

    private BannerAdView(Context context) {
        super(context);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BannerAdView(@NotNull P2 p22) {
        p.k(p22, "bannerAdViewInternal");
        Context context = p22.d().getContext();
        p.j(context, "bannerAdViewInternal.container.context");
        this(context);
        this.f53427a = p22;
        p22.a(new WeakReference<>(this));
        p22.b(new WeakReference<>(this));
    }

    @NotNull
    public final BannerAdInfo getAdInfo() {
        P2 p22 = this.f53427a;
        if (p22 == null) {
            p.C("bannerAdViewInternal");
            p22 = null;
        }
        return p22.c();
    }

    @Nullable
    public final BannerAdViewListener getListener() {
        return this.f53428b;
    }

    @Override // com.ironsource.Q2
    public void onBannerAdClicked() {
        IronLog.CALLBACK.info("BannerAdViewListener onBannerAdClicked adInfo: " + getAdInfo());
        BannerAdViewListener bannerAdViewListener = this.f53428b;
        if (bannerAdViewListener != null) {
            bannerAdViewListener.onBannerAdClicked(this);
        }
    }

    @Override // com.ironsource.Q2
    public void onBannerAdShown() {
        IronLog.CALLBACK.info("BannerAdViewListener onBannerAdShown adInfo: " + getAdInfo());
        BannerAdViewListener bannerAdViewListener = this.f53428b;
        if (bannerAdViewListener != null) {
            bannerAdViewListener.onBannerAdShown(this);
        }
    }

    public final void setListener(@Nullable BannerAdViewListener bannerAdViewListener) {
        this.f53428b = bannerAdViewListener;
    }
}
