package com.ironsource.mediationsdk.ads.nativead;

import android.app.Activity;
import bn.r;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C3950bc;
import com.ironsource.C4041gd;
import com.ironsource.C4228r4;
import com.ironsource.Zb;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdInterface;
import com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: loaded from: classes12.dex */
public final class LevelPlayNativeAd implements NativeAdInterface, NativeAdDataInterface, InternalNativeAdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private String f32344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private C4041gd f32345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private LevelPlayNativeAdListener f32346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private Zb f32347d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private AdapterNativeAdData f32348e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private AdapterNativeAdViewBinder f32349f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f32350g;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private String f32351a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private LevelPlayNativeAdListener f32352b;

        @NotNull
        public final LevelPlayNativeAd build() {
            return new LevelPlayNativeAd(this, null);
        }

        @Nullable
        public final LevelPlayNativeAdListener getMListener$mediationsdk_release() {
            return this.f32352b;
        }

        @Nullable
        public final String getMPlacementName$mediationsdk_release() {
            return this.f32351a;
        }

        public final void setMListener$mediationsdk_release(@Nullable LevelPlayNativeAdListener levelPlayNativeAdListener) {
            this.f32352b = levelPlayNativeAdListener;
        }

        public final void setMPlacementName$mediationsdk_release(@Nullable String str) {
            this.f32351a = str;
        }

        @NotNull
        public final Builder withActivity(@Nullable Activity activity) {
            ContextProvider.getInstance().updateActivity(activity);
            IronLog.INTERNAL.verbose("activity is updated to: " + (activity != null ? activity.hashCode() : 0));
            return this;
        }

        @NotNull
        public final Builder withListener(@NotNull LevelPlayNativeAdListener levelPlayNativeAdListener) {
            p.k(levelPlayNativeAdListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            this.f32352b = levelPlayNativeAdListener;
            return this;
        }

        @NotNull
        public final Builder withPlacementName(@Nullable String str) {
            this.f32351a = str;
            return this;
        }
    }

    private LevelPlayNativeAd(Builder builder) {
        this.f32350g = new AtomicBoolean(false);
        this.f32344a = builder.getMPlacementName$mediationsdk_release();
        this.f32346c = builder.getMListener$mediationsdk_release();
    }

    public /* synthetic */ LevelPlayNativeAd(Builder builder, i iVar) {
        this(builder);
    }

    private final void a() {
        LevelPlayNativeAdListener levelPlayNativeAdListener = this.f32346c;
        if (levelPlayNativeAdListener != null) {
            levelPlayNativeAdListener.onAdLoadFailed(this, ErrorBuilder.buildInitFailedError("init() has failed", IronSourceConstants.NATIVE_AD_UNIT));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayNativeAd levelPlayNativeAd) {
        r rVar;
        p.k(levelPlayNativeAd, "this$0");
        levelPlayNativeAd.b();
        Zb zb2 = levelPlayNativeAd.f32347d;
        if (zb2 != null) {
            zb2.a(levelPlayNativeAd.f32345b);
            rVar = r.f5635a;
        } else {
            rVar = null;
        }
        if (rVar == null) {
            levelPlayNativeAd.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayNativeAd levelPlayNativeAd, AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder adapterNativeAdViewBinder, AdInfo adInfo) {
        p.k(levelPlayNativeAd, "this$0");
        p.k(adapterNativeAdData, "$adapterNativeAdData");
        p.k(adapterNativeAdViewBinder, "$nativeAdViewBinder");
        levelPlayNativeAd.f32348e = adapterNativeAdData;
        levelPlayNativeAd.f32349f = adapterNativeAdViewBinder;
        LevelPlayNativeAdListener levelPlayNativeAdListener = levelPlayNativeAd.f32346c;
        if (levelPlayNativeAdListener != null) {
            levelPlayNativeAdListener.onAdLoaded(levelPlayNativeAd, adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayNativeAd levelPlayNativeAd, AdInfo adInfo) {
        p.k(levelPlayNativeAd, "this$0");
        LevelPlayNativeAdListener levelPlayNativeAdListener = levelPlayNativeAd.f32346c;
        if (levelPlayNativeAdListener != null) {
            levelPlayNativeAdListener.onAdClicked(levelPlayNativeAd, adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayNativeAd levelPlayNativeAd, IronSourceError ironSourceError) {
        p.k(levelPlayNativeAd, "this$0");
        LevelPlayNativeAdListener levelPlayNativeAdListener = levelPlayNativeAd.f32346c;
        if (levelPlayNativeAdListener != null) {
            levelPlayNativeAdListener.onAdLoadFailed(levelPlayNativeAd, ironSourceError);
        }
    }

    private final void b() {
        if (this.f32350g.compareAndSet(false, true)) {
            Zb zbF = com.ironsource.mediationsdk.r.m().f();
            this.f32347d = zbF;
            if (zbF != null) {
                zbF.a(this);
                C3950bc c3950bcM = com.ironsource.mediationsdk.r.m().m(this.f32344a);
                p.j(c3950bcM, "getInstance().getNativeAdPlacement(mPlacementName)");
                this.f32345b = new C4041gd(c3950bcM);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(LevelPlayNativeAd levelPlayNativeAd, AdInfo adInfo) {
        p.k(levelPlayNativeAd, "this$0");
        LevelPlayNativeAdListener levelPlayNativeAdListener = levelPlayNativeAd.f32346c;
        if (levelPlayNativeAdListener != null) {
            levelPlayNativeAdListener.onAdImpression(levelPlayNativeAd, adInfo);
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdInterface
    public void destroyAd() {
        IronLog.API.info(String.valueOf(this));
        try {
            Zb zb2 = this.f32347d;
            if (zb2 != null) {
                zb2.M();
            }
        } catch (Throwable th2) {
            C4228r4.d().a(th2);
            IronLog.API.error("destroyNativeAd()");
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    @Nullable
    public String getAdvertiser() {
        AdapterNativeAdData adapterNativeAdData = this.f32348e;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getAdvertiser();
        }
        return null;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    @Nullable
    public String getBody() {
        AdapterNativeAdData adapterNativeAdData = this.f32348e;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getBody();
        }
        return null;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    @Nullable
    public String getCallToAction() {
        AdapterNativeAdData adapterNativeAdData = this.f32348e;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getCallToAction();
        }
        return null;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    @Nullable
    public NativeAdDataInterface.Image getIcon() {
        AdapterNativeAdData adapterNativeAdData = this.f32348e;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getIcon();
        }
        return null;
    }

    @Nullable
    public final AdapterNativeAdViewBinder getNativeAdViewBinder() {
        return this.f32349f;
    }

    @Nullable
    public final UUID getObjectId() {
        Zb zb2 = this.f32347d;
        if (zb2 != null) {
            return zb2.k();
        }
        return null;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    @Nullable
    public String getTitle() {
        AdapterNativeAdData adapterNativeAdData = this.f32348e;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getTitle();
        }
        return null;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdInterface
    public void loadAd() {
        IronLog.API.info(String.valueOf(this));
        String strE = com.ironsource.mediationsdk.r.m().e();
        p.j(strE, "initError");
        if (strE.length() <= 0) {
            IronSourceThreadManager.INSTANCE.getInitHandler().post(new Runnable() { // from class: s9.a
                @Override // java.lang.Runnable
                public final void run() {
                    LevelPlayNativeAd.a(this.f79593b);
                }
            });
            return;
        }
        LevelPlayNativeAdListener levelPlayNativeAdListener = this.f32346c;
        if (levelPlayNativeAdListener != null) {
            levelPlayNativeAdListener.onAdLoadFailed(this, ErrorBuilder.buildInitFailedError("loadAd(): " + strE, IronSourceConstants.NATIVE_AD_UNIT));
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener
    public void onNativeAdClicked(@Nullable final AdInfo adInfo) {
        IronLog.CALLBACK.info(String.valueOf(this));
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new Runnable() { // from class: s9.e
            @Override // java.lang.Runnable
            public final void run() {
                LevelPlayNativeAd.a(this.f79602b, adInfo);
            }
        }, 0L, 2, null);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener
    public void onNativeAdImpression(@Nullable final AdInfo adInfo) {
        IronLog.CALLBACK.info(String.valueOf(this));
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new Runnable() { // from class: s9.b
            @Override // java.lang.Runnable
            public final void run() {
                LevelPlayNativeAd.b(this.f79594b, adInfo);
            }
        }, 0L, 2, null);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener
    public void onNativeAdLoadFailed(@Nullable final IronSourceError ironSourceError) {
        IronLog.CALLBACK.info(String.valueOf(this));
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new Runnable() { // from class: s9.d
            @Override // java.lang.Runnable
            public final void run() {
                LevelPlayNativeAd.a(this.f79600b, ironSourceError);
            }
        }, 0L, 2, null);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener
    public void onNativeAdLoaded(@Nullable final AdInfo adInfo, @NotNull final AdapterNativeAdData adapterNativeAdData, @NotNull final AdapterNativeAdViewBinder adapterNativeAdViewBinder) {
        p.k(adapterNativeAdData, "adapterNativeAdData");
        p.k(adapterNativeAdViewBinder, "nativeAdViewBinder");
        IronLog.CALLBACK.info(String.valueOf(this));
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new Runnable() { // from class: s9.c
            @Override // java.lang.Runnable
            public final void run() {
                LevelPlayNativeAd.a(this.f79596b, adapterNativeAdData, adapterNativeAdViewBinder, adInfo);
            }
        }, 0L, 2, null);
    }

    public final void setListener(@Nullable LevelPlayNativeAdListener levelPlayNativeAdListener) {
        this.f32346c = levelPlayNativeAdListener;
    }
}
