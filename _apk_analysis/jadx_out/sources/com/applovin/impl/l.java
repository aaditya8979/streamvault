package com.applovin.impl;

import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.DTBAdResponse;
import com.applovin.impl.d;
import com.applovin.impl.m;
import com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton;
import com.applovin.impl.s2;
import com.applovin.impl.w;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.mediation.ads.MaxAppOpenAd;
import com.applovin.mediation.ads.MaxInterstitialAd;
import com.applovin.mediation.ads.MaxRewardedAd;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.mediation.nativeAds.MaxNativeAdViewBinder;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import com.ironsource.Mf;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.internal.special.SpecialsBridge;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public abstract class l extends n3 implements AdControlButton.a, MaxRewardedAdListener, MaxAdViewAdListener, MaxAdRevenueListener, w.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.k f8636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private n f8637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private i8 f8638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private m f8639d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private MaxAdView f8640e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private MaxInterstitialAd f8641f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private MaxAppOpenAd f8642g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private MaxRewardedAd f8643h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private MaxNativeAdView f8644i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private MaxNativeAdLoader f8645j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private MaxAd f8646k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private r f8647l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private List f8648m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ListView f8649n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private View f8650o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private AdControlButton f8651p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private TextView f8652q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private w f8653r;

    public class a extends MaxNativeAdListener {
        public a() {
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdClicked(MaxAd maxAd) {
            l.this.onAdClicked(maxAd);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdLoadFailed(String str, MaxError maxError) {
            l.this.onAdLoadFailed(str, maxError);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
            if (l.this.f8646k != null) {
                l.this.f8645j.destroy(l.this.f8646k);
            }
            l.this.f8646k = maxAd;
            l.this.f8645j.render(l.this.f8644i, maxAd);
            l.this.onAdLoaded(maxAd);
        }
    }

    private String a() {
        return this.f8636a.s0().c() ? "Not supported while Test Mode is enabled" : this.f8639d.j() != this.f8637b.f() ? "This waterfall is not targeted for the current device" : "Tap to load an ad";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface) {
        this.f8647l = null;
    }

    private void a(ViewGroup viewGroup, AppLovinSdkUtils.Size size) {
        if (this.f8647l != null) {
            return;
        }
        r rVar = new r(viewGroup, size, this);
        this.f8647l = rVar;
        rVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.applovin.impl.jb
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f8572b.a(dialogInterface);
            }
        });
        this.f8647l.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(r2 r2Var, n nVar, o oVar, com.applovin.impl.sdk.k kVar, MaxDebuggerAdUnitDetailActivity maxDebuggerAdUnitDetailActivity) {
        maxDebuggerAdUnitDetailActivity.initialize(nVar, oVar, ((m.b) r2Var).v(), kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(final com.applovin.impl.sdk.k kVar, final n nVar, final o oVar, j2 j2Var, final r2 r2Var) {
        if (r2Var instanceof m.b) {
            d.a(this, MaxDebuggerAdUnitDetailActivity.class, kVar.e(), new d.b() { // from class: com.applovin.impl.lb
                @Override // com.applovin.impl.d.b
                public final void a(Activity activity) {
                    l.a(r2Var, nVar, oVar, kVar, (MaxDebuggerAdUnitDetailActivity) activity);
                }
            });
        }
    }

    private void a(MaxAdFormat maxAdFormat) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Loading live ");
        sb2.append(maxAdFormat.getDisplayName());
        sb2.append(" Ad from ");
        i8 i8Var = this.f8638c;
        sb2.append(i8Var != null ? i8Var.b().a() : this.f8639d.j().c());
        com.applovin.impl.sdk.o.g("MaxDebuggerAdUnitDetailActivity", sb2.toString());
        if (this.f8638c != null) {
            this.f8636a.s0().a(this.f8638c.b().b());
        }
        if (maxAdFormat.isAdViewAd()) {
            this.f8640e.setPlacement("[Mediation Debugger Live Ad]");
            this.f8640e.loadAd();
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == this.f8637b.a()) {
            this.f8641f.loadAd();
            return;
        }
        if (MaxAdFormat.APP_OPEN == this.f8637b.a()) {
            this.f8642g.loadAd();
            return;
        }
        if (MaxAdFormat.REWARDED == this.f8637b.a()) {
            this.f8643h.loadAd();
        } else if (MaxAdFormat.NATIVE != this.f8637b.a()) {
            n7.a("Live ads currently unavailable for ad format", this);
        } else {
            this.f8645j.setPlacement("[Mediation Debugger Live Ad]");
            this.f8645j.loadAd();
        }
    }

    private void b() {
        String strC = this.f8637b.c();
        if (this.f8637b.a().isAdViewAd()) {
            MaxAdView maxAdView = new MaxAdView(strC, this.f8637b.a());
            this.f8640e = maxAdView;
            maxAdView.setExtraParameter("adaptive_banner", com.ironsource.mediationsdk.metadata.a.f32683h);
            this.f8640e.setExtraParameter("disable_auto_retries", "true");
            this.f8640e.setExtraParameter("disable_precache", "true");
            this.f8640e.setExtraParameter("allow_pause_auto_refresh_immediately", "true");
            this.f8640e.stopAutoRefresh();
            this.f8640e.setListener(this);
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == this.f8637b.a()) {
            MaxInterstitialAd maxInterstitialAd = new MaxInterstitialAd(strC);
            this.f8641f = maxInterstitialAd;
            maxInterstitialAd.setExtraParameter("disable_auto_retries", "true");
            this.f8641f.setListener(this);
            return;
        }
        if (MaxAdFormat.APP_OPEN == this.f8637b.a()) {
            MaxAppOpenAd maxAppOpenAd = new MaxAppOpenAd(strC);
            this.f8642g = maxAppOpenAd;
            maxAppOpenAd.setExtraParameter("disable_auto_retries", "true");
            this.f8642g.setListener(this);
            return;
        }
        if (MaxAdFormat.REWARDED == this.f8637b.a()) {
            MaxRewardedAd maxRewardedAd = MaxRewardedAd.getInstance(strC);
            this.f8643h = maxRewardedAd;
            maxRewardedAd.setExtraParameter("disable_auto_retries", "true");
            this.f8643h.setListener(this);
            return;
        }
        if (MaxAdFormat.NATIVE == this.f8637b.a()) {
            this.f8644i = new MaxNativeAdView(new MaxNativeAdViewBinder.Builder(R.layout.max_native_ad_template_1).setTitleTextViewId(R.id.applovin_native_title_text_view).setAdvertiserTextViewId(R.id.applovin_native_advertiser_text_view).setBodyTextViewId(R.id.applovin_native_body_text_view).setCallToActionButtonId(R.id.applovin_native_cta_button).setIconImageViewId(R.id.applovin_native_icon_image_view).setOptionsContentViewGroupId(R.id.applovin_native_options_view).setStarRatingContentViewGroupId(R.id.applovin_native_star_rating_view).setMediaContentViewGroupId(R.id.applovin_native_media_content_view).build(), com.applovin.impl.sdk.k.o());
            MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader(strC);
            this.f8645j = maxNativeAdLoader;
            maxNativeAdLoader.setExtraParameter("disable_auto_retries", "true");
            this.f8645j.setNativeAdListener(new a());
            this.f8645j.setRevenueListener(this);
        }
    }

    private void b(MaxAdFormat maxAdFormat) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Showing live ");
        sb2.append(maxAdFormat.getDisplayName());
        sb2.append(" Ad from ");
        i8 i8Var = this.f8638c;
        sb2.append(i8Var != null ? i8Var.b().a() : this.f8639d.j().c());
        com.applovin.impl.sdk.o.g("MaxDebuggerAdUnitDetailActivity", sb2.toString());
        if (maxAdFormat.isAdViewAd()) {
            a(this.f8640e, maxAdFormat.getSize());
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == this.f8637b.a()) {
            this.f8641f.showAd("[Mediation Debugger Live Ad]");
            return;
        }
        if (MaxAdFormat.APP_OPEN == this.f8637b.a()) {
            this.f8642g.showAd("[Mediation Debugger Live Ad]");
        } else if (MaxAdFormat.REWARDED == this.f8637b.a()) {
            this.f8643h.showAd("[Mediation Debugger Live Ad]");
        } else if (MaxAdFormat.NATIVE == this.f8637b.a()) {
            a(this.f8644i, MaxAdFormat.MREC.getSize());
        }
    }

    @Override // com.applovin.impl.n3, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.activityOnTouch(com.safedk.android.utils.g.f53127a, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.applovin.impl.n3
    public com.applovin.impl.sdk.k getSdk() {
        return this.f8636a;
    }

    public void initialize(final n nVar, @Nullable final o oVar, @Nullable i8 i8Var, final com.applovin.impl.sdk.k kVar) {
        List listA;
        this.f8636a = kVar;
        this.f8637b = nVar;
        this.f8638c = i8Var;
        this.f8648m = kVar.s0().b();
        m mVar = new m(nVar, oVar, i8Var, this);
        this.f8639d = mVar;
        mVar.a(new s2.a() { // from class: com.applovin.impl.kb
            @Override // com.applovin.impl.s2.a
            public final void a(j2 j2Var, r2 r2Var) {
                this.f8622a.a(kVar, nVar, oVar, j2Var, r2Var);
            }
        });
        b();
        if (nVar.f().f()) {
            if ((i8Var != null && !i8Var.b().d().C()) || (listA = kVar.U().a(nVar.c())) == null || listA.isEmpty()) {
                return;
            }
            this.f8653r = new w(listA, nVar.a(), getApplicationContext(), this);
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdClicked(@NonNull MaxAd maxAd) {
        n7.a(Mf.f29852f, maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdCollapsed(@NonNull MaxAd maxAd) {
        n7.a("onAdCollapsed", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        this.f8651p.setControlState(AdControlButton.b.LOAD);
        this.f8652q.setText("");
        n7.a("Failed to display " + maxAd.getFormat().getDisplayName(), "MAX Error\nCode: " + maxError.getCode() + "\nMessage: " + maxError.getMessage() + "\n\n" + maxAd.getNetworkName() + " Display Error\nCode: " + maxError.getMediatedNetworkErrorCode() + "\nMessage: " + maxError.getMediatedNetworkErrorMessage(), this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayed(@NonNull MaxAd maxAd) {
        n7.a("onAdDisplayed", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdExpanded(@NonNull MaxAd maxAd) {
        n7.a("onAdExpanded", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdHidden(@NonNull MaxAd maxAd) {
        n7.a("onAdHidden", maxAd, this);
    }

    @Override // com.applovin.impl.w.a
    public void onAdLoadFailed(AdError adError, MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isAdViewAd()) {
            this.f8640e.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f8641f.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f8642g.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f8643h.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f8645j.setLocalExtraParameter("amazon_ad_error", adError);
        }
        a(maxAdFormat);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoadFailed(@NonNull String str, @NonNull MaxError maxError) {
        this.f8651p.setControlState(AdControlButton.b.LOAD);
        this.f8652q.setText("");
        if (204 == maxError.getCode()) {
            n7.a("No Fill", "No fills often happen in live environments. Please make sure to use the Mediation Debugger test mode before you go live.", this);
            return;
        }
        n7.a("", "Failed to load with error code: " + maxError.getCode(), this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(@NonNull MaxAd maxAd) {
        this.f8652q.setText(maxAd.getNetworkName() + " ad loaded");
        this.f8651p.setControlState(AdControlButton.b.SHOW);
        if (maxAd.getFormat().isAdViewAd()) {
            a(this.f8640e, maxAd.getFormat().getSize());
        } else if (MaxAdFormat.NATIVE == this.f8637b.a()) {
            a(this.f8644i, MaxAdFormat.MREC.getSize());
        }
    }

    @Override // com.applovin.impl.w.a
    public void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isAdViewAd()) {
            this.f8640e.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f8641f.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f8642g.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f8643h.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f8645j.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        }
        a(maxAdFormat);
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(@NonNull MaxAd maxAd) {
        n7.a("onAdRevenuePaid", maxAd, this);
    }

    @Override // com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.a
    public void onClick(AdControlButton adControlButton) {
        if (this.f8636a.s0().c()) {
            n7.a("Not Supported", "Ad loads are not supported while Test Mode is enabled. Please restart the app.", this);
            return;
        }
        if (this.f8639d.j() != this.f8637b.f()) {
            n7.a("Not Supported", "You cannot load an ad from this waterfall because it does not target the current device. To load an ad, please select the targeted waterfall.", this);
            return;
        }
        MaxAdFormat maxAdFormatA = this.f8637b.a();
        AdControlButton.b bVar = AdControlButton.b.LOAD;
        if (bVar == adControlButton.getControlState()) {
            adControlButton.setControlState(AdControlButton.b.LOADING);
            w wVar = this.f8653r;
            if (wVar != null) {
                wVar.a();
                return;
            } else {
                a(maxAdFormatA);
                return;
            }
        }
        if (AdControlButton.b.SHOW == adControlButton.getControlState()) {
            if (!maxAdFormatA.isAdViewAd() && maxAdFormatA != MaxAdFormat.NATIVE) {
                adControlButton.setControlState(bVar);
            }
            b(maxAdFormatA);
        }
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_ad_unit_detail_activity);
        setTitle(this.f8639d.k());
        this.f8649n = (ListView) findViewById(R.id.listView);
        this.f8650o = findViewById(R.id.ad_presenter_view);
        this.f8651p = (AdControlButton) findViewById(R.id.ad_control_button);
        this.f8652q = (TextView) findViewById(R.id.status_textview);
        this.f8649n.setAdapter((ListAdapter) this.f8639d);
        this.f8652q.setText(a());
        this.f8652q.setTypeface(Typeface.DEFAULT_BOLD);
        this.f8651p.setOnClickListener(this);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setPadding(0, 10, 0, 0);
        shapeDrawable.getPaint().setColor(-1);
        shapeDrawable.getPaint().setShadowLayer(10, 0.0f, -10, 855638016);
        shapeDrawable.setShape(new RectShape());
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable});
        layerDrawable.setLayerInset(0, 0, 10, 0, 0);
        this.f8650o.setBackground(layerDrawable);
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.f8638c != null) {
            this.f8636a.s0().a(this.f8648m);
        }
        MaxAdView maxAdView = this.f8640e;
        if (maxAdView != null) {
            SpecialsBridge.maxAdViewDestroy(maxAdView);
        }
        MaxInterstitialAd maxInterstitialAd = this.f8641f;
        if (maxInterstitialAd != null) {
            maxInterstitialAd.destroy();
        }
        MaxAppOpenAd maxAppOpenAd = this.f8642g;
        if (maxAppOpenAd != null) {
            maxAppOpenAd.destroy();
        }
        MaxRewardedAd maxRewardedAd = this.f8643h;
        if (maxRewardedAd != null) {
            maxRewardedAd.destroy();
        }
        MaxNativeAdLoader maxNativeAdLoader = this.f8645j;
        if (maxNativeAdLoader != null) {
            MaxAd maxAd = this.f8646k;
            if (maxAd != null) {
                maxNativeAdLoader.destroy(maxAd);
            }
            this.f8645j.destroy();
        }
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onUserRewarded(@NonNull MaxAd maxAd, @NonNull MaxReward maxReward) {
        n7.a("onUserRewarded", maxAd, this);
    }
}
