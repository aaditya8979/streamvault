package com.applovin.impl.mediation.debugger.ui.testmode;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Switch;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.AdRegistration;
import com.amazon.device.ads.DTBAdResponse;
import com.applovin.impl.e3;
import com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton;
import com.applovin.impl.n3;
import com.applovin.impl.n7;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.w;
import com.applovin.impl.x;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
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
import com.safedk.android.utils.g;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a extends n3 implements MaxRewardedAdListener, MaxAdViewAdListener, AdControlButton.a, MaxAdRevenueListener, w.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e3 f9052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private k f9053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MaxAdView f9054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private MaxAdView f9055d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private MaxInterstitialAd f9056e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private MaxAppOpenAd f9057f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private MaxRewardedAd f9058g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private MaxAd f9059h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private MaxNativeAdLoader f9060i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private List f9061j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f9062k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private AdControlButton f9063l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private AdControlButton f9064m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private AdControlButton f9065n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private AdControlButton f9066o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private AdControlButton f9067p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private AdControlButton f9068q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Button f9069r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Button f9070s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private FrameLayout f9071t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private FrameLayout f9072u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Switch f9073v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Switch f9074w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Map f9075x;

    /* JADX INFO: renamed from: com.applovin.impl.mediation.debugger.ui.testmode.a$a, reason: collision with other inner class name */
    public class C0149a extends MaxNativeAdListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MaxNativeAdView f9076a;

        public C0149a(MaxNativeAdView maxNativeAdView) {
            this.f9076a = maxNativeAdView;
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdClicked(MaxAd maxAd) {
            a.this.onAdClicked(maxAd);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdLoadFailed(String str, MaxError maxError) {
            a.this.onAdLoadFailed(str, maxError);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
            if (a.this.f9059h != null) {
                a.this.f9060i.destroy(a.this.f9059h);
            }
            a.this.f9059h = maxAd;
            a.this.f9060i.render(this.f9076a, maxAd);
            a.this.f9072u.removeAllViews();
            a.this.f9072u.addView(this.f9076a);
            a.this.onAdLoaded(maxAd);
        }
    }

    private AdControlButton a(String str) {
        if (str.equals("test_mode_banner") || str.equals("test_mode_leader")) {
            return this.f9063l;
        }
        if (str.equals("test_mode_mrec")) {
            return this.f9064m;
        }
        if (str.equals("test_mode_interstitial")) {
            return this.f9065n;
        }
        if (str.equals("test_mode_app_open")) {
            return this.f9066o;
        }
        if (str.equals(this.f9062k)) {
            return this.f9067p;
        }
        if (str.equals("test_mode_native")) {
            return this.f9068q;
        }
        throw new IllegalArgumentException("Invalid test mode ad unit identifier provided " + str);
    }

    private void a() {
        MaxAdFormat maxAdFormat;
        String str;
        boolean zIsTablet = AppLovinSdkUtils.isTablet(this);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.banner_ad_view_container);
        if (zIsTablet) {
            maxAdFormat = MaxAdFormat.LEADER;
            ((TextView) findViewById(R.id.banner_label)).setText("Leader");
            str = "test_mode_leader";
        } else {
            maxAdFormat = MaxAdFormat.BANNER;
            str = "test_mode_banner";
        }
        if (!this.f9052a.r().contains(maxAdFormat)) {
            findViewById(R.id.banner_control_view).setVisibility(8);
            frameLayout.setVisibility(8);
            return;
        }
        MaxAdView maxAdView = new MaxAdView(str, maxAdFormat, this.f9053b.y0(), this);
        this.f9054c = maxAdView;
        maxAdView.setExtraParameter("adaptive_banner", com.ironsource.mediationsdk.metadata.a.f32683h);
        this.f9054c.setExtraParameter("disable_auto_retries", "true");
        this.f9054c.setExtraParameter("disable_precache", "true");
        this.f9054c.setExtraParameter("allow_pause_auto_refresh_immediately", "true");
        this.f9054c.stopAutoRefresh();
        this.f9054c.setListener(this);
        frameLayout.addView(this.f9054c, new FrameLayout.LayoutParams(AppLovinSdkUtils.dpToPx(this, maxAdFormat.getSize().getWidth()), AppLovinSdkUtils.dpToPx(this, maxAdFormat.getSize().getHeight())));
        AdControlButton adControlButton = (AdControlButton) findViewById(R.id.banner_control_button);
        this.f9063l = adControlButton;
        adControlButton.setOnClickListener(this);
        this.f9063l.setFormat(maxAdFormat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.f9071t.setVisibility(0);
        this.f9072u.setVisibility(8);
        this.f9069r.setBackgroundColor(-1);
        this.f9070s.setBackgroundColor(-3355444);
    }

    private void a(MaxAdFormat maxAdFormat) {
        o.g("MaxDebuggerMultiAdActivity", "Loading test " + maxAdFormat.getDisplayName() + " Ad from " + this.f9052a.g());
        MaxAdFormat maxAdFormat2 = MaxAdFormat.BANNER;
        boolean z10 = (maxAdFormat2 == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) && this.f9073v.isChecked();
        MaxAdFormat maxAdFormat3 = MaxAdFormat.MREC;
        boolean z11 = maxAdFormat3 == maxAdFormat && this.f9074w.isChecked();
        if (z10 || z11) {
            this.f9053b.s0().a(this.f9052a.w());
        } else {
            this.f9053b.s0().a(getTestModeNetwork(maxAdFormat));
        }
        if (maxAdFormat2 == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) {
            this.f9054c.loadAd();
            return;
        }
        if (maxAdFormat3 == maxAdFormat) {
            this.f9055d.loadAd();
            this.f9069r.callOnClick();
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f9056e.loadAd();
            return;
        }
        if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f9057f.loadAd();
            return;
        }
        if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f9058g.loadAd();
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f9060i.loadAd();
            this.f9070s.callOnClick();
        }
    }

    private void b() {
        List listR = this.f9052a.r();
        MaxAdFormat maxAdFormat = MaxAdFormat.INTERSTITIAL;
        if (!listR.contains(maxAdFormat)) {
            findViewById(R.id.interstitial_control_view).setVisibility(8);
            return;
        }
        MaxInterstitialAd maxInterstitialAd = new MaxInterstitialAd("test_mode_interstitial", this.f9053b.y0(), this);
        this.f9056e = maxInterstitialAd;
        maxInterstitialAd.setExtraParameter("disable_auto_retries", "true");
        this.f9056e.setListener(this);
        AdControlButton adControlButton = (AdControlButton) findViewById(R.id.interstitial_control_button);
        this.f9065n = adControlButton;
        adControlButton.setOnClickListener(this);
        this.f9065n.setFormat(maxAdFormat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.f9072u.setVisibility(0);
        this.f9071t.setVisibility(8);
        this.f9070s.setBackgroundColor(-1);
        this.f9069r.setBackgroundColor(-3355444);
    }

    private void b(MaxAdFormat maxAdFormat) {
        o.g("MaxDebuggerMultiAdActivity", "Showing test " + maxAdFormat.getDisplayName() + " Ad from " + this.f9052a.g());
        if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f9056e.showAd();
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f9057f.showAd();
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f9058g.showAd();
        }
    }

    private void c() {
        this.f9071t = (FrameLayout) findViewById(R.id.mrec_ad_view_container);
        List listR = this.f9052a.r();
        MaxAdFormat maxAdFormat = MaxAdFormat.MREC;
        if (!listR.contains(maxAdFormat)) {
            findViewById(R.id.mrec_control_view).setVisibility(8);
            this.f9071t.setVisibility(8);
            return;
        }
        MaxAdView maxAdView = new MaxAdView("test_mode_mrec", maxAdFormat, this.f9053b.y0(), this);
        this.f9055d = maxAdView;
        maxAdView.setExtraParameter("disable_auto_retries", "true");
        this.f9055d.setExtraParameter("disable_precache", "true");
        this.f9055d.setExtraParameter("allow_pause_auto_refresh_immediately", "true");
        this.f9055d.stopAutoRefresh();
        this.f9055d.setListener(this);
        this.f9071t.addView(this.f9055d, new FrameLayout.LayoutParams(-1, -1));
        AdControlButton adControlButton = (AdControlButton) findViewById(R.id.mrec_control_button);
        this.f9064m = adControlButton;
        adControlButton.setOnClickListener(this);
        this.f9064m.setFormat(maxAdFormat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        this.f9054c.removeAllViews();
        this.f9063l.setControlState(AdControlButton.b.LOAD);
    }

    private void d() {
        this.f9072u = (FrameLayout) findViewById(R.id.native_ad_view_container);
        if (!this.f9052a.I()) {
            findViewById(R.id.native_control_view).setVisibility(8);
            this.f9072u.setVisibility(8);
            return;
        }
        MaxNativeAdView maxNativeAdView = new MaxNativeAdView(new MaxNativeAdViewBinder.Builder(R.layout.max_native_ad_template_1).setTitleTextViewId(R.id.applovin_native_title_text_view).setAdvertiserTextViewId(R.id.applovin_native_advertiser_text_view).setBodyTextViewId(R.id.applovin_native_body_text_view).setCallToActionButtonId(R.id.applovin_native_cta_button).setIconImageViewId(R.id.applovin_native_icon_image_view).setOptionsContentViewGroupId(R.id.applovin_native_options_view).setStarRatingContentViewGroupId(R.id.applovin_native_star_rating_view).setMediaContentViewGroupId(R.id.applovin_native_media_content_view).build(), this);
        MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader("test_mode_native");
        this.f9060i = maxNativeAdLoader;
        maxNativeAdLoader.setExtraParameter("disable_auto_retries", "true");
        this.f9060i.setNativeAdListener(new C0149a(maxNativeAdView));
        this.f9060i.setRevenueListener(this);
        AdControlButton adControlButton = (AdControlButton) findViewById(R.id.native_control_button);
        this.f9068q = adControlButton;
        adControlButton.setOnClickListener(this);
        this.f9068q.setFormat(MaxAdFormat.NATIVE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        this.f9055d.removeAllViews();
        this.f9064m.setControlState(AdControlButton.b.LOAD);
    }

    private void e() {
        List listR = this.f9052a.r();
        MaxAdFormat maxAdFormat = MaxAdFormat.REWARDED;
        if (!listR.contains(maxAdFormat)) {
            findViewById(R.id.rewarded_control_view).setVisibility(8);
            return;
        }
        String str = "test_mode_rewarded_" + this.f9052a.m();
        this.f9062k = str;
        MaxRewardedAd maxRewardedAd = MaxRewardedAd.getInstance(str, this.f9053b.y0(), this);
        this.f9058g = maxRewardedAd;
        maxRewardedAd.setExtraParameter("disable_auto_retries", "true");
        this.f9058g.setListener(this);
        AdControlButton adControlButton = (AdControlButton) findViewById(R.id.rewarded_control_button);
        this.f9067p = adControlButton;
        adControlButton.setOnClickListener(this);
        this.f9067p.setFormat(maxAdFormat);
    }

    @Override // com.applovin.impl.n3, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.activityOnTouch(g.f53127a, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.applovin.impl.n3
    public k getSdk() {
        return this.f9053b;
    }

    public String getTestModeNetwork(MaxAdFormat maxAdFormat) {
        return (this.f9052a.x() == null || !this.f9052a.x().containsKey(maxAdFormat)) ? this.f9052a.m() : (String) this.f9052a.x().get(maxAdFormat);
    }

    public void initialize(e3 e3Var) {
        this.f9052a = e3Var;
        this.f9053b = e3Var.o();
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
    public void onAdDisplayFailed(@NonNull MaxAd maxAd, @NonNull MaxError maxError) {
        a(maxAd.getAdUnitId()).setControlState(AdControlButton.b.LOAD);
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
        if (MaxAdFormat.BANNER == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) {
            this.f9054c.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.MREC == maxAdFormat) {
            this.f9055d.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f9056e.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f9057f.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f9058g.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f9060i.setLocalExtraParameter("amazon_ad_error", adError);
        }
        a(maxAdFormat);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoadFailed(@NonNull String str, @NonNull MaxError maxError) {
        AdControlButton adControlButtonA = a(str);
        adControlButtonA.setControlState(AdControlButton.b.LOAD);
        n7.a(maxError, adControlButtonA.getFormat().getLabel(), this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(@NonNull MaxAd maxAd) {
        AdControlButton adControlButtonA = a(maxAd.getAdUnitId());
        if (maxAd.getFormat().isAdViewAd() || maxAd.getFormat().equals(MaxAdFormat.NATIVE)) {
            adControlButtonA.setControlState(AdControlButton.b.LOAD);
        } else {
            adControlButtonA.setControlState(AdControlButton.b.SHOW);
        }
    }

    @Override // com.applovin.impl.w.a
    public void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat) {
        if (MaxAdFormat.BANNER == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) {
            this.f9054c.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.MREC == maxAdFormat) {
            this.f9055d.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f9056e.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f9057f.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f9058g.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f9060i.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        }
        a(maxAdFormat);
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(@NonNull MaxAd maxAd) {
        n7.a("onAdRevenuePaid", maxAd, this);
    }

    @Override // com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.a
    public void onClick(AdControlButton adControlButton) {
        MaxAdFormat format = adControlButton.getFormat();
        AdControlButton.b bVar = AdControlButton.b.LOAD;
        if (bVar != adControlButton.getControlState()) {
            if (AdControlButton.b.SHOW == adControlButton.getControlState()) {
                adControlButton.setControlState(bVar);
                b(format);
                return;
            }
            return;
        }
        adControlButton.setControlState(AdControlButton.b.LOADING);
        Map map = this.f9075x;
        if (map == null || map.get(format) == null) {
            a(format);
        } else {
            ((w) this.f9075x.get(format)).a();
        }
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f9052a == null) {
            o.h("MaxDebuggerMultiAdActivity", "Failed to initialize activity with a network model.");
            return;
        }
        setContentView(R.layout.mediation_debugger_multi_ad_activity);
        setTitle(this.f9052a.g() + " Test Ads");
        this.f9061j = this.f9053b.s0().b();
        a();
        c();
        b();
        e();
        d();
        findViewById(R.id.app_open_ad_control_view).setVisibility(8);
        this.f9069r = (Button) findViewById(R.id.show_mrec_button);
        this.f9070s = (Button) findViewById(R.id.show_native_button);
        if (this.f9052a.I() && this.f9052a.r().contains(MaxAdFormat.MREC)) {
            this.f9072u.setVisibility(8);
            this.f9069r.setBackgroundColor(-1);
            this.f9070s.setBackgroundColor(-3355444);
            this.f9069r.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.mediation.debugger.ui.testmode.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f9078b.a(view);
                }
            });
            this.f9070s.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.mediation.debugger.ui.testmode.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f9079b.b(view);
                }
            });
        } else {
            this.f9069r.setVisibility(8);
            this.f9070s.setVisibility(8);
        }
        this.f9073v = (Switch) findViewById(R.id.native_banner_switch);
        this.f9074w = (Switch) findViewById(R.id.native_mrec_switch);
        if (this.f9052a.J()) {
            this.f9073v.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.mediation.debugger.ui.testmode.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f9080b.c(view);
                }
            });
            this.f9074w.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.mediation.debugger.ui.testmode.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f9081b.d(view);
                }
            });
        } else {
            this.f9073v.setVisibility(8);
            this.f9074w.setVisibility(8);
        }
        if (!StringUtils.isValidString(this.f9052a.e()) || this.f9052a.d() == null || this.f9052a.d().size() <= 0) {
            return;
        }
        AdRegistration.getInstance(this.f9052a.e(), this);
        AdRegistration.enableTesting(true);
        AdRegistration.enableLogging(true);
        HashMap map = new HashMap(this.f9052a.d().size());
        for (MaxAdFormat maxAdFormat : this.f9052a.d().keySet()) {
            map.put(maxAdFormat, new w((x) this.f9052a.d().get(maxAdFormat), maxAdFormat, getApplicationContext(), this));
        }
        this.f9075x = map;
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f9053b.s0().a(this.f9061j);
        MaxAdView maxAdView = this.f9054c;
        if (maxAdView != null) {
            SpecialsBridge.maxAdViewDestroy(maxAdView);
        }
        MaxAdView maxAdView2 = this.f9055d;
        if (maxAdView2 != null) {
            SpecialsBridge.maxAdViewDestroy(maxAdView2);
        }
        MaxInterstitialAd maxInterstitialAd = this.f9056e;
        if (maxInterstitialAd != null) {
            maxInterstitialAd.destroy();
        }
        MaxRewardedAd maxRewardedAd = this.f9058g;
        if (maxRewardedAd != null) {
            maxRewardedAd.destroy();
        }
        MaxNativeAdLoader maxNativeAdLoader = this.f9060i;
        if (maxNativeAdLoader != null) {
            MaxAd maxAd = this.f9059h;
            if (maxAd != null) {
                maxNativeAdLoader.destroy(maxAd);
            }
            this.f9060i.destroy();
        }
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onUserRewarded(@NonNull MaxAd maxAd, @NonNull MaxReward maxReward) {
        n7.a("onUserRewarded", maxAd, this);
    }
}
