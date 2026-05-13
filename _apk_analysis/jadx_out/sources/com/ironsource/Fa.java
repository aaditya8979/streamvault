package com.ironsource;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.ironsource.E0;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.controller.f;
import com.ironsource.sdk.mediation.R;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.LevelPlayAdSize;
import com.unity3d.mediation.banner.LevelPlayBannerAdView;
import com.unity3d.mediation.banner.LevelPlayBannerAdViewListener;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.UUID;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class Fa implements InterfaceC4311w2 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final a f29315n = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final UUID f29316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f29317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final W2 f29318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final LevelPlayBannerAdView.Config f29319d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final C4173o0 f29320e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final U8 f29321f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final LevelPlayAdSize f29322g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private LevelPlayBannerAdViewListener f29323h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final String f29324i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private Ca f29325j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private Boolean f29326k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private C4041gd f29327l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f29328m;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final Pair<String, LevelPlayBannerAdView.Config> a(@NotNull Context context, @Nullable AttributeSet attributeSet) {
            tn.p.k(context, GAMConfig.KEY_CONTEXT);
            String str = "";
            if (attributeSet == null) {
                return bn.h.a("", LevelPlayBannerAdView.Config.Companion.empty());
            }
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.LevelPlayBannerAdView);
            tn.p.j(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…le.LevelPlayBannerAdView)");
            try {
                LevelPlayBannerAdView.Config.Builder builder = new LevelPlayBannerAdView.Config.Builder();
                if (typedArrayObtainStyledAttributes.hasValue(R.styleable.LevelPlayBannerAdView_bidFloor)) {
                    builder.setBidFloor(typedArrayObtainStyledAttributes.getFloat(r1, -1.0f));
                }
                String string = typedArrayObtainStyledAttributes.getString(R.styleable.LevelPlayBannerAdView_adSize);
                if (string != null) {
                    builder.setAdSize(LevelPlayAdSize.Companion.createAdSize$mediationsdk_release(string));
                }
                String string2 = typedArrayObtainStyledAttributes.getString(R.styleable.LevelPlayBannerAdView_adUnitId);
                if (string2 != null) {
                    str = string2;
                }
                return bn.h.a(str, builder.build());
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
    }

    public Fa(@NotNull UUID uuid, @NotNull String str, @NotNull W2 w22, @NotNull LevelPlayBannerAdView.Config config, @NotNull C4173o0 c4173o0) {
        tn.p.k(uuid, f.b.f33716c);
        tn.p.k(str, "adUnitId");
        tn.p.k(w22, "bannerContainer");
        tn.p.k(config, "config");
        tn.p.k(c4173o0, "adTools");
        this.f29316a = uuid;
        this.f29317b = str;
        this.f29318c = w22;
        this.f29319d = config;
        this.f29320e = c4173o0;
        this.f29321f = Lb.f29764s.d().A();
        LevelPlayAdSize adSize = config.getAdSize();
        this.f29322g = adSize == null ? LevelPlayAdSize.BANNER : adSize;
        String placementName = config.getPlacementName();
        this.f29324i = placementName == null ? "" : placementName;
        c4173o0.e().a(new C4154n(IronSource.a.BANNER, uuid, str));
        Double bidFloor = config.getBidFloor();
        if (bidFloor != null) {
            c4173o0.e().f().a(bidFloor.doubleValue());
        }
    }

    public /* synthetic */ Fa(UUID uuid, String str, W2 w22, LevelPlayBannerAdView.Config config, C4173o0 c4173o0, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? C4367z7.f34502a.a() : uuid, str, w22, config, (i10 & 16) != 0 ? new C4173o0(IronSource.a.BANNER, E0.b.MEDIATION) : c4173o0);
    }

    private final Ca a() {
        C4041gd c4041gd;
        this.f29327l = this.f29320e.a(this.f29324i);
        Context context = this.f29318c.getContext();
        if (context instanceof Activity) {
            ContextProvider.getInstance().updateActivity((Activity) context);
        }
        UUID uuid = this.f29316a;
        String str = this.f29317b;
        C4041gd c4041gd2 = this.f29327l;
        C4041gd c4041gd3 = null;
        if (c4041gd2 == null) {
            tn.p.C("bannerPlacement");
            c4041gd = null;
        } else {
            c4041gd = c4041gd2;
        }
        J2 j22 = new J2(uuid, str, c4041gd, this.f29322g, null, null, this.f29321f.a(), this.f29319d.getBidFloor(), 48, null);
        this.f29320e.e().a(new C0(this.f29320e, j22, null, 4, null));
        ISBannerSize iSBannerSizeA = this.f29320e.a(j22.h());
        E5 e5E = this.f29320e.e();
        C4173o0 c4173o0 = this.f29320e;
        C4041gd c4041gd4 = this.f29327l;
        if (c4041gd4 == null) {
            tn.p.C("bannerPlacement");
        } else {
            c4041gd3 = c4041gd4;
        }
        e5E.a(new Y2(c4173o0, iSBannerSizeA, c4041gd3.c()));
        return new Ca(this, this.f29320e, j22, this.f29318c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final Fa fa2) {
        tn.p.k(fa2, "this$0");
        if (!fa2.f29328m) {
            IronLog.INTERNAL.warning(C4173o0.a(fa2.f29320e, "Banner not loaded", (String) null, 2, (Object) null));
            return;
        }
        if (fa2.f29325j == null) {
            IronLog.INTERNAL.warning(C4173o0.a(fa2.f29320e, "Banner already destroyed", (String) null, 2, (Object) null));
            return;
        }
        C4320wb.a(fa2.f29320e, new Runnable() { // from class: com.ironsource.uh
            @Override // java.lang.Runnable
            public final void run() {
                Fa.b(this.f34226b);
            }
        }, 0L, 2, (Object) null);
        Ca ca2 = fa2.f29325j;
        if (ca2 != null) {
            ca2.c();
        }
        fa2.f29325j = null;
        fa2.f29326k = null;
        fa2.f29323h = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Fa fa2, Ca ca2) {
        tn.p.k(fa2, "this$0");
        tn.p.k(ca2, "$it");
        fa2.f29320e.e().f().b();
        ca2.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Fa fa2, LevelPlayBannerAdViewListener levelPlayBannerAdViewListener) {
        tn.p.k(fa2, "this$0");
        fa2.f29323h = levelPlayBannerAdViewListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayAdError levelPlayAdError, Fa fa2) {
        tn.p.k(levelPlayAdError, "$it");
        tn.p.k(fa2, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdLoadFailed() error: " + levelPlayAdError);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = fa2.f29323h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdLoadFailed(levelPlayAdError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayAdInfo levelPlayAdInfo, Fa fa2) {
        tn.p.k(levelPlayAdInfo, "$adInfo");
        tn.p.k(fa2, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdClicked() adInfo: " + levelPlayAdInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = fa2.f29323h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdClicked(levelPlayAdInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayAdInfo levelPlayAdInfo, LevelPlayAdError levelPlayAdError, Fa fa2) {
        tn.p.k(levelPlayAdInfo, "$adInfo");
        tn.p.k(levelPlayAdError, "$it");
        tn.p.k(fa2, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdDisplayFailed() adInfo " + levelPlayAdInfo + " error: " + levelPlayAdError);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = fa2.f29323h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdDisplayFailed(levelPlayAdInfo, levelPlayAdError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(boolean z10, LevelPlayAdInfo levelPlayAdInfo, Fa fa2) {
        tn.p.k(levelPlayAdInfo, "$adInfo");
        tn.p.k(fa2, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdLoaded() isReload: " + z10 + " adInfo: " + levelPlayAdInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = fa2.f29323h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdLoaded(levelPlayAdInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Fa fa2) {
        tn.p.k(fa2, "this$0");
        fa2.f29318c.removeAllViews();
        ViewParent parent = fa2.f29318c.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(fa2.f29318c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Fa fa2, Ca ca2) {
        tn.p.k(fa2, "this$0");
        tn.p.k(ca2, "$it");
        fa2.f29320e.e().f().c();
        ca2.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(LevelPlayAdInfo levelPlayAdInfo, Fa fa2) {
        tn.p.k(levelPlayAdInfo, "$adInfo");
        tn.p.k(fa2, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdDisplayed() adInfo: " + levelPlayAdInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = fa2.f29323h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdDisplayed(levelPlayAdInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Fa fa2) {
        tn.p.k(fa2, "this$0");
        if (fa2.f29328m) {
            IronLog.INTERNAL.warning(C4173o0.a(fa2.f29320e, "Banner load already called", (String) null, 2, (Object) null));
            return;
        }
        fa2.f29328m = true;
        if (fa2.h()) {
            Ca caA = fa2.a();
            fa2.f29325j = caA;
            Boolean bool = fa2.f29326k;
            if (bool != null) {
                if (bool.booleanValue()) {
                    caA.f();
                } else {
                    caA.d();
                }
            }
            caA.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(LevelPlayAdInfo levelPlayAdInfo, Fa fa2) {
        tn.p.k(levelPlayAdInfo, "$adInfo");
        tn.p.k(fa2, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdLeftApplication() adInfo: " + levelPlayAdInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = fa2.f29323h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdLeftApplication(levelPlayAdInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(LevelPlayAdInfo levelPlayAdInfo, Fa fa2) {
        tn.p.k(levelPlayAdInfo, "$adInfo");
        tn.p.k(fa2, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdScreenDismissed() adInfo: " + levelPlayAdInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = fa2.f29323h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdCollapsed(levelPlayAdInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(LevelPlayAdInfo levelPlayAdInfo, Fa fa2) {
        tn.p.k(levelPlayAdInfo, "$adInfo");
        tn.p.k(fa2, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdScreenPresented() adInfo: " + levelPlayAdInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = fa2.f29323h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdExpanded(levelPlayAdInfo);
        }
    }

    private final boolean h() {
        if (this.f29317b.length() == 0) {
            String string = this.f29316a.toString();
            tn.p.j(string, "adId.toString()");
            a(new LevelPlayAdError(string, this.f29317b, LevelPlayAdError.ERROR_CODE_NO_AD_UNIT_ID_SPECIFIED, "Ad unit ID should be specified"));
            return false;
        }
        if (!this.f29320e.g()) {
            String string2 = this.f29316a.toString();
            tn.p.j(string2, "adId.toString()");
            a(new LevelPlayAdError(string2, this.f29317b, LevelPlayAdError.ERROR_CODE_LOAD_BEFORE_INIT_SUCCESS_CALLBACK, "load must be called after init success callback"));
            return false;
        }
        C3931ab c3931abA = Lb.f29764s.d().e().a();
        if (c3931abA != null && c3931abA.a(this.f29317b, LevelPlay.AdFormat.BANNER)) {
            return true;
        }
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this.f29323h;
        if (levelPlayBannerAdViewListener != null) {
            String string3 = this.f29316a.toString();
            tn.p.j(string3, "adId.toString()");
            levelPlayBannerAdViewListener.onAdLoadFailed(new LevelPlayAdError(string3, this.f29317b, LevelPlayAdError.ERROR_CODE_INVALID_AD_UNIT_ID, "Invalid ad unit id"));
        }
        return false;
    }

    @Override // com.ironsource.InterfaceC4311w2
    public void a(@Nullable final LevelPlayAdError levelPlayAdError) {
        if (levelPlayAdError != null) {
            this.f29320e.e(new Runnable() { // from class: com.ironsource.bi
                @Override // java.lang.Runnable
                public final void run() {
                    Fa.a(levelPlayAdError, this);
                }
            });
        }
    }

    @Override // com.ironsource.InterfaceC4311w2
    public void a(@NotNull final LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(levelPlayAdInfo, "adInfo");
        this.f29320e.e(new Runnable() { // from class: com.ironsource.th
            @Override // java.lang.Runnable
            public final void run() {
                Fa.e(levelPlayAdInfo, this);
            }
        });
    }

    @Override // com.ironsource.InterfaceC4311w2
    public void a(@NotNull final LevelPlayAdInfo levelPlayAdInfo, @Nullable final LevelPlayAdError levelPlayAdError) {
        tn.p.k(levelPlayAdInfo, "adInfo");
        if (levelPlayAdError != null) {
            this.f29320e.e(new Runnable() { // from class: com.ironsource.zh
                @Override // java.lang.Runnable
                public final void run() {
                    Fa.a(levelPlayAdInfo, levelPlayAdError, this);
                }
            });
        }
    }

    @Override // com.ironsource.InterfaceC4311w2
    public void a(@NotNull final LevelPlayAdInfo levelPlayAdInfo, final boolean z10) {
        tn.p.k(levelPlayAdInfo, "adInfo");
        this.f29320e.e(new Runnable() { // from class: com.ironsource.vh
            @Override // java.lang.Runnable
            public final void run() {
                Fa.a(z10, levelPlayAdInfo, this);
            }
        });
    }

    public final void a(@Nullable final LevelPlayBannerAdViewListener levelPlayBannerAdViewListener) {
        IronLog.API.info("LevelPlayBannerAdView.setBannerListener()");
        this.f29320e.d(new Runnable() { // from class: com.ironsource.ai
            @Override // java.lang.Runnable
            public final void run() {
                Fa.a(this.f30999b, levelPlayBannerAdViewListener);
            }
        });
    }

    public final void b() {
        IronLog.API.info("LevelPlayBannerAdView.destroyBanner()");
        this.f29320e.d(new Runnable() { // from class: com.ironsource.gi
            @Override // java.lang.Runnable
            public final void run() {
                Fa.a(this.f31822b);
            }
        });
    }

    @Override // com.ironsource.InterfaceC4311w2
    public void b(@NotNull final LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(levelPlayAdInfo, "adInfo");
        this.f29320e.e(new Runnable() { // from class: com.ironsource.yh
            @Override // java.lang.Runnable
            public final void run() {
                Fa.b(levelPlayAdInfo, this);
            }
        });
    }

    @NotNull
    public final UUID c() {
        return this.f29316a;
    }

    @Override // com.ironsource.InterfaceC4311w2
    public void c(@NotNull final LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(levelPlayAdInfo, "adInfo");
        this.f29320e.e(new Runnable() { // from class: com.ironsource.xh
            @Override // java.lang.Runnable
            public final void run() {
                Fa.d(levelPlayAdInfo, this);
            }
        });
    }

    @NotNull
    public final LevelPlayAdSize d() {
        return this.f29322g;
    }

    @Override // com.ironsource.InterfaceC4311w2
    public void d(@NotNull final LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(levelPlayAdInfo, "adInfo");
        this.f29320e.e(new Runnable() { // from class: com.ironsource.ci
            @Override // java.lang.Runnable
            public final void run() {
                Fa.a(levelPlayAdInfo, this);
            }
        });
    }

    @NotNull
    public final String e() {
        return this.f29317b;
    }

    @Override // com.ironsource.InterfaceC4311w2
    public void e(@NotNull final LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(levelPlayAdInfo, "adInfo");
        this.f29320e.e(new Runnable() { // from class: com.ironsource.di
            @Override // java.lang.Runnable
            public final void run() {
                Fa.c(levelPlayAdInfo, this);
            }
        });
    }

    @Nullable
    public final LevelPlayBannerAdViewListener f() {
        return this.f29323h;
    }

    @NotNull
    public final String g() {
        return this.f29324i;
    }

    public final void i() {
        IronLog.API.info("LevelPlayBannerAdView.loadAd()");
        this.f29320e.d(new Runnable() { // from class: com.ironsource.wh
            @Override // java.lang.Runnable
            public final void run() {
                Fa.c(this.f34356b);
            }
        });
    }

    public final void j() {
        bn.r rVar;
        IronLog.API.info("LevelPlayBannerAdView.pauseAutoRefresh()");
        final Ca ca2 = this.f29325j;
        if (ca2 != null) {
            this.f29320e.d(new Runnable() { // from class: com.ironsource.fi
                @Override // java.lang.Runnable
                public final void run() {
                    Fa.a(this.f31742b, ca2);
                }
            });
            rVar = bn.r.f5635a;
        } else {
            rVar = null;
        }
        if (rVar == null) {
            this.f29326k = Boolean.FALSE;
        }
    }

    public final void k() {
        bn.r rVar;
        IronLog.API.info("LevelPlayBannerAdView.resumeAutoRefresh()");
        final Ca ca2 = this.f29325j;
        if (ca2 != null) {
            this.f29320e.d(new Runnable() { // from class: com.ironsource.ei
                @Override // java.lang.Runnable
                public final void run() {
                    Fa.b(this.f31597b, ca2);
                }
            });
            rVar = bn.r.f5635a;
        } else {
            rVar = null;
        }
        if (rVar == null) {
            this.f29326k = Boolean.TRUE;
        }
    }
}
