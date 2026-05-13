package com.applovin.mediation.nativeAds;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.applovin.impl.d3;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.nativeAd.AppLovinStarRatingView;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdViewBinder;
import com.applovin.sdk.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.events.base.StatsEvent;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
@SuppressLint({"ViewConstructor"})
public class MaxNativeAdView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f11159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TextView f11160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TextView f11161c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TextView f11162d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Button f11163e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ImageView f11164f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final FrameLayout f11165g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ViewGroup f11166h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final FrameLayout f11167i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ViewGroup f11168j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ViewGroup f11169k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final FrameLayout f11170l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private com.applovin.impl.mediation.ads.b f11171m;

    public class a implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ WeakReference f11172a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f11173b;

        public a(WeakReference weakReference, ViewGroup viewGroup) {
            this.f11172a = weakReference;
            this.f11173b = viewGroup;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f11172a.get();
            if (viewTreeObserver == null || !viewTreeObserver.isAlive()) {
                k.C0.O();
                if (o.a()) {
                    k.C0.O().k("MaxNativeAdView", "Failed to remove onPreDrawListener since the view tree observer is not alive.");
                }
            } else {
                viewTreeObserver.removeOnPreDrawListener(this);
            }
            this.f11172a.clear();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f11173b.getLayoutParams();
            layoutParams.height = ((View) this.f11173b.getParent()).getWidth();
            this.f11173b.setLayoutParams(layoutParams);
            return true;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaxNativeAdView(MaxNativeAd maxNativeAd, Activity activity) {
        this(maxNativeAd, activity, (StatsEvent) null);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/nativeAds/MaxNativeAdView;-><init>(Lcom/applovin/mediation/nativeAds/MaxNativeAd;Landroid/app/Activity;)V");
        CreativeInfoManager.onMaxNativeAdCreated(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private MaxNativeAdView(MaxNativeAd maxNativeAd, Activity activity, StatsEvent statsEvent) {
        this(maxNativeAd, (String) null, activity);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/nativeAds/MaxNativeAdView;-><init>(Lcom/applovin/mediation/nativeAds/MaxNativeAd;Landroid/app/Activity;)V");
        if ("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/nativeAds/MaxNativeAdView;-><init>(Lcom/applovin/mediation/nativeAds/MaxNativeAd;Landroid/app/Activity;)V" == 0) {
        } else {
            this(maxNativeAd, (String) null, activity);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaxNativeAdView(@Nullable MaxNativeAd maxNativeAd, MaxNativeAdViewBinder maxNativeAdViewBinder, Context context) {
        this(maxNativeAd, maxNativeAdViewBinder, context, (StatsEvent) null);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/nativeAds/MaxNativeAdView;-><init>(Lcom/applovin/mediation/nativeAds/MaxNativeAd;Lcom/applovin/mediation/nativeAds/MaxNativeAdViewBinder;Landroid/content/Context;)V");
        CreativeInfoManager.onMaxNativeAdCreated(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private MaxNativeAdView(MaxNativeAd maxNativeAd, MaxNativeAdViewBinder maxNativeAdViewBinder, Context context, StatsEvent statsEvent) {
        super(context);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/nativeAds/MaxNativeAdView;-><init>(Lcom/applovin/mediation/nativeAds/MaxNativeAd;Lcom/applovin/mediation/nativeAds/MaxNativeAdViewBinder;Landroid/content/Context;)V");
        if ("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/nativeAds/MaxNativeAdView;-><init>(Lcom/applovin/mediation/nativeAds/MaxNativeAd;Lcom/applovin/mediation/nativeAds/MaxNativeAdViewBinder;Landroid/content/Context;)V" == 0) {
            return;
        }
        super(context);
        boolean z10 = maxNativeAdViewBinder.templateType != null;
        MaxAdFormat format = maxNativeAd != null ? maxNativeAd.getFormat() : MaxAdFormat.NATIVE;
        View view = maxNativeAdViewBinder.mainView;
        if (view != null) {
            this.f11159a = view;
        } else {
            this.f11159a = LayoutInflater.from(context).inflate(z10 ? a(maxNativeAdViewBinder.templateType, format) : maxNativeAdViewBinder.layoutResourceId, (ViewGroup) this, false);
        }
        addView(this.f11159a);
        this.f11160b = (TextView) findViewById(maxNativeAdViewBinder.titleTextViewId);
        this.f11161c = (TextView) findViewById(maxNativeAdViewBinder.advertiserTextViewId);
        this.f11162d = (TextView) findViewById(maxNativeAdViewBinder.bodyTextViewId);
        this.f11163e = (Button) findViewById(maxNativeAdViewBinder.callToActionButtonId);
        this.f11164f = (ImageView) findViewById(maxNativeAdViewBinder.iconImageViewId);
        this.f11165g = (FrameLayout) findViewById(maxNativeAdViewBinder.iconContentViewId);
        this.f11166h = (ViewGroup) findViewById(maxNativeAdViewBinder.optionsContentViewGroupId);
        this.f11167i = (FrameLayout) findViewById(maxNativeAdViewBinder.optionsContentFrameLayoutId);
        this.f11168j = (ViewGroup) findViewById(maxNativeAdViewBinder.starRatingContentViewGroupId);
        this.f11169k = (ViewGroup) findViewById(maxNativeAdViewBinder.mediaContentViewGroupId);
        this.f11170l = (FrameLayout) findViewById(maxNativeAdViewBinder.mediaContentFrameLayoutId);
        if (maxNativeAd != null) {
            b(maxNativeAd);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public MaxNativeAdView(@Nullable MaxNativeAd maxNativeAd, @Nullable String str, Activity activity) {
        this(maxNativeAd, str, activity, (StatsEvent) null);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/nativeAds/MaxNativeAdView;-><init>(Lcom/applovin/mediation/nativeAds/MaxNativeAd;Ljava/lang/String;Landroid/app/Activity;)V");
        CreativeInfoManager.onMaxNativeAdCreated(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private MaxNativeAdView(MaxNativeAd maxNativeAd, String str, Activity activity, StatsEvent statsEvent) {
        this(maxNativeAd, str, activity.getApplicationContext());
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/nativeAds/MaxNativeAdView;-><init>(Lcom/applovin/mediation/nativeAds/MaxNativeAd;Ljava/lang/String;Landroid/app/Activity;)V");
        if ("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/nativeAds/MaxNativeAdView;-><init>(Lcom/applovin/mediation/nativeAds/MaxNativeAd;Ljava/lang/String;Landroid/app/Activity;)V" == 0) {
        } else {
            this(maxNativeAd, str, activity.getApplicationContext());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaxNativeAdView(@Nullable MaxNativeAd maxNativeAd, @Nullable String str, Context context) {
        this(maxNativeAd, str, context, (StatsEvent) null);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/nativeAds/MaxNativeAdView;-><init>(Lcom/applovin/mediation/nativeAds/MaxNativeAd;Ljava/lang/String;Landroid/content/Context;)V");
        CreativeInfoManager.onMaxNativeAdCreated(this);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private MaxNativeAdView(MaxNativeAd maxNativeAd, String str, Context context, StatsEvent statsEvent) {
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/nativeAds/MaxNativeAdView;-><init>(Lcom/applovin/mediation/nativeAds/MaxNativeAd;Ljava/lang/String;Landroid/content/Context;)V");
        if ("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/nativeAds/MaxNativeAdView;-><init>(Lcom/applovin/mediation/nativeAds/MaxNativeAd;Ljava/lang/String;Landroid/content/Context;)V" == 0) {
            MaxNativeAdViewBinder.Builder iconContentViewId = new MaxNativeAdViewBinder.Builder(-1).setTemplateType(str).setTitleTextViewId(R.id.applovin_native_title_text_view).setAdvertiserTextViewId(R.id.applovin_native_advertiser_text_view).setBodyTextViewId(R.id.applovin_native_body_text_view).setCallToActionButtonId(R.id.applovin_native_cta_button).setIconImageViewId(R.id.applovin_native_icon_image_view).setIconContentViewId(R.id.applovin_native_icon_view);
            int i10 = R.id.applovin_native_options_view;
            MaxNativeAdViewBinder.Builder starRatingContentViewGroupId = iconContentViewId.setOptionsContentViewGroupId(i10).setOptionsContentFrameLayoutId(i10).setStarRatingContentViewGroupId(R.id.applovin_native_star_rating_view);
            int i11 = R.id.applovin_native_media_content_view;
            this(maxNativeAd, starRatingContentViewGroupId.setMediaContentViewGroupId(i11).setMediaContentFrameLayoutId(i11).build(), context);
            return;
        }
        MaxNativeAdViewBinder.Builder iconContentViewId2 = new MaxNativeAdViewBinder.Builder(-1).setTemplateType(str).setTitleTextViewId(R.id.applovin_native_title_text_view).setAdvertiserTextViewId(R.id.applovin_native_advertiser_text_view).setBodyTextViewId(R.id.applovin_native_body_text_view).setCallToActionButtonId(R.id.applovin_native_cta_button).setIconImageViewId(R.id.applovin_native_icon_image_view).setIconContentViewId(R.id.applovin_native_icon_view);
        int i12 = R.id.applovin_native_options_view;
        MaxNativeAdViewBinder.Builder starRatingContentViewGroupId2 = iconContentViewId2.setOptionsContentViewGroupId(i12).setOptionsContentFrameLayoutId(i12).setStarRatingContentViewGroupId(R.id.applovin_native_star_rating_view);
        int i13 = R.id.applovin_native_media_content_view;
        this(maxNativeAd, starRatingContentViewGroupId2.setMediaContentViewGroupId(i13).setMediaContentFrameLayoutId(i13).build(), context);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaxNativeAdView(MaxNativeAdViewBinder maxNativeAdViewBinder, Context context) {
        this(maxNativeAdViewBinder, context, (StatsEvent) null);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/nativeAds/MaxNativeAdView;-><init>(Lcom/applovin/mediation/nativeAds/MaxNativeAdViewBinder;Landroid/content/Context;)V");
        CreativeInfoManager.onMaxNativeAdCreated(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private MaxNativeAdView(MaxNativeAdViewBinder maxNativeAdViewBinder, Context context, StatsEvent statsEvent) {
        this((MaxNativeAd) null, maxNativeAdViewBinder, context);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/nativeAds/MaxNativeAdView;-><init>(Lcom/applovin/mediation/nativeAds/MaxNativeAdViewBinder;Landroid/content/Context;)V");
        if ("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/nativeAds/MaxNativeAdView;-><init>(Lcom/applovin/mediation/nativeAds/MaxNativeAdViewBinder;Landroid/content/Context;)V" == 0) {
        } else {
            this((MaxNativeAd) null, maxNativeAdViewBinder, context);
        }
    }

    private int a(String str, MaxAdFormat maxAdFormat) {
        if (maxAdFormat == MaxAdFormat.BANNER) {
            return "vertical_banner_template".equals(str) ? R.layout.max_native_ad_vertical_banner_view : ("media_banner_template".equals(str) || "no_body_banner_template".equals(str)) ? R.layout.max_native_ad_media_banner_view : "vertical_media_banner_template".equals(str) ? R.layout.max_native_ad_vertical_media_banner_view : R.layout.max_native_ad_banner_view;
        }
        if (maxAdFormat == MaxAdFormat.LEADER) {
            return "vertical_leader_template".equals(str) ? R.layout.max_native_ad_vertical_leader_view : R.layout.max_native_ad_leader_view;
        }
        if (maxAdFormat == MaxAdFormat.MREC) {
            return R.layout.max_native_ad_mrec_view;
        }
        if (maxAdFormat == MaxAdFormat.NATIVE) {
            throw new IllegalArgumentException("Attempting to render MAX native ad with invalid template: " + str);
        }
        throw new IllegalArgumentException("Unsupported ad format: " + maxAdFormat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() {
        setSelected(true);
    }

    private void a(MaxNativeAd maxNativeAd) {
        TextView textView = this.f11160b;
        if (textView != null) {
            textView.setText(maxNativeAd.getTitle());
        }
        TextView textView2 = this.f11162d;
        if (textView2 != null) {
            textView2.setText(maxNativeAd.getBody());
        }
        TextView textView3 = this.f11161c;
        if (textView3 != null) {
            textView3.setText(maxNativeAd.getAdvertiser());
        }
        Button button = this.f11163e;
        if (button != null) {
            button.setText(maxNativeAd.getCallToAction());
        }
        MaxNativeAd.MaxNativeAdImage icon = maxNativeAd.getIcon();
        ImageView imageView = this.f11164f;
        if (imageView != null) {
            if (icon == null) {
                imageView.setImageDrawable(null);
            } else if (icon.getDrawable() != null) {
                this.f11164f.setImageDrawable(icon.getDrawable());
            } else if (icon.getUri() != null) {
                ImageViewUtils.setAndDownscaleImageUri(this.f11164f, icon.getUri());
            } else {
                this.f11164f.setImageDrawable(null);
            }
        }
        View mediaView = maxNativeAd.getMediaView();
        ViewGroup viewGroup = this.f11169k;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            if (mediaView != null) {
                ViewParent parent = mediaView.getParent();
                if (parent != null) {
                    ((ViewGroup) parent).removeAllViews();
                }
                mediaView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f11169k.addView(mediaView);
            }
        }
        View optionsView = maxNativeAd.getOptionsView();
        ViewGroup viewGroup2 = this.f11166h;
        if (viewGroup2 != null) {
            viewGroup2.removeAllViews();
            if (optionsView != null) {
                ViewParent parent2 = optionsView.getParent();
                if (parent2 != null) {
                    ((ViewGroup) parent2).removeAllViews();
                }
                optionsView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f11166h.addView(optionsView);
                this.f11166h.bringToFront();
            }
        }
        ViewGroup viewGroup3 = this.f11168j;
        if (viewGroup3 != null) {
            viewGroup3.removeAllViews();
            Double starRating = maxNativeAd.getStarRating();
            if (starRating != null) {
                AppLovinStarRatingView appLovinStarRatingView = new AppLovinStarRatingView(starRating, getContext());
                appLovinStarRatingView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f11168j.addView(appLovinStarRatingView);
            }
        }
    }

    private void b() {
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.applovin_native_inner_parent_layout);
        if (viewGroup == null) {
            return;
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnPreDrawListener(new a(new WeakReference(viewTreeObserver), viewGroup));
        }
    }

    private void b(MaxNativeAd maxNativeAd) {
        if (StringUtils.isValidString(maxNativeAd.getTitle())) {
            this.f11160b.setText(maxNativeAd.getTitle());
        } else {
            this.f11160b.setVisibility(8);
        }
        if (this.f11161c != null) {
            if (StringUtils.isValidString(maxNativeAd.getAdvertiser())) {
                this.f11161c.setText(maxNativeAd.getAdvertiser());
            } else {
                this.f11161c.setVisibility(8);
            }
        }
        if (this.f11162d != null) {
            if (StringUtils.isValidString(maxNativeAd.getBody())) {
                this.f11162d.setText(maxNativeAd.getBody());
            } else if (maxNativeAd.getFormat() == MaxAdFormat.NATIVE || maxNativeAd.getFormat() == MaxAdFormat.MREC) {
                this.f11162d.setVisibility(8);
            } else {
                this.f11162d.setVisibility(4);
            }
        }
        if (this.f11163e != null) {
            if (StringUtils.isValidString(maxNativeAd.getCallToAction())) {
                this.f11163e.setText(maxNativeAd.getCallToAction());
            } else if (maxNativeAd.getFormat() == MaxAdFormat.NATIVE || maxNativeAd.getFormat() == MaxAdFormat.MREC) {
                this.f11163e.setVisibility(8);
            } else {
                this.f11163e.setVisibility(4);
            }
        }
        MaxNativeAd.MaxNativeAdImage icon = maxNativeAd.getIcon();
        View iconView = maxNativeAd.getIconView();
        FrameLayout frameLayout = this.f11165g;
        if (frameLayout != null) {
            if (icon == null || this.f11164f == null) {
                if (iconView != null) {
                    iconView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    this.f11165g.removeAllViews();
                    this.f11165g.addView(iconView);
                } else {
                    frameLayout.setVisibility(8);
                }
            } else if (icon.getDrawable() != null) {
                this.f11164f.setImageDrawable(icon.getDrawable());
            } else if (icon.getUri() == null || !StringUtils.isValidString(icon.getUri().toString())) {
                this.f11165g.setVisibility(8);
            } else {
                ImageViewUtils.setAndDownscaleImageUri(this.f11164f, icon.getUri());
            }
        }
        View optionsView = maxNativeAd.getOptionsView();
        FrameLayout frameLayout2 = this.f11167i;
        if (frameLayout2 != null && optionsView != null) {
            optionsView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.f11167i.addView(optionsView);
            this.f11167i.bringToFront();
        } else if (frameLayout2 != null) {
            frameLayout2.setVisibility(8);
        }
        View mediaView = maxNativeAd.getMediaView();
        if (this.f11170l != null) {
            if (mediaView != null) {
                mediaView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f11170l.addView(mediaView);
            } else if (maxNativeAd.getFormat() == MaxAdFormat.LEADER) {
                this.f11170l.setVisibility(8);
            }
        }
        if (this.f11168j != null) {
            Double starRating = maxNativeAd.getStarRating();
            if (starRating != null) {
                this.f11168j.removeAllViews();
                AppLovinStarRatingView appLovinStarRatingView = new AppLovinStarRatingView(starRating, getContext());
                appLovinStarRatingView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f11168j.addView(appLovinStarRatingView);
            } else {
                this.f11168j.setVisibility(8);
            }
        }
        b();
        postDelayed(new Runnable() { // from class: com.applovin.mediation.nativeAds.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f11219b.a();
            }
        }, 2000L);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(g.f53127a, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Nullable
    public com.applovin.impl.mediation.ads.b getAdViewTracker() {
        return this.f11171m;
    }

    public TextView getAdvertiserTextView() {
        return this.f11161c;
    }

    public TextView getBodyTextView() {
        return this.f11162d;
    }

    public Button getCallToActionButton() {
        return this.f11163e;
    }

    public List<View> getClickableViews() {
        ArrayList arrayList = new ArrayList(5);
        TextView textView = this.f11160b;
        if (textView != null) {
            arrayList.add(textView);
        }
        TextView textView2 = this.f11161c;
        if (textView2 != null) {
            arrayList.add(textView2);
        }
        TextView textView3 = this.f11162d;
        if (textView3 != null) {
            arrayList.add(textView3);
        }
        Button button = this.f11163e;
        if (button != null) {
            arrayList.add(button);
        }
        ImageView imageView = this.f11164f;
        if (imageView != null) {
            arrayList.add(imageView);
        }
        return arrayList;
    }

    @Deprecated
    public FrameLayout getIconContentView() {
        return this.f11165g;
    }

    public ImageView getIconImageView() {
        return this.f11164f;
    }

    public View getMainView() {
        return this.f11159a;
    }

    @Deprecated
    public FrameLayout getMediaContentView() {
        return this.f11170l;
    }

    public ViewGroup getMediaContentViewGroup() {
        ViewGroup viewGroup = this.f11169k;
        return viewGroup != null ? viewGroup : this.f11170l;
    }

    @Deprecated
    public FrameLayout getOptionsContentView() {
        return this.f11167i;
    }

    public ViewGroup getOptionsContentViewGroup() {
        ViewGroup viewGroup = this.f11166h;
        return viewGroup != null ? viewGroup : this.f11167i;
    }

    public ViewGroup getStarRatingContentViewGroup() {
        return this.f11168j;
    }

    public TextView getTitleTextView() {
        return this.f11160b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.applovin.impl.mediation.ads.b bVar = this.f11171m;
        if (bVar != null) {
            bVar.c();
        }
        if (isHardwareAccelerated()) {
            return;
        }
        o.j("MaxNativeAdView", "Attached to non-hardware accelerated window: some native ad views require hardware accelerated Activities to render properly.");
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    public void recycle() {
        setOnClickListener(null);
        com.applovin.impl.mediation.ads.b bVar = this.f11171m;
        if (bVar != null) {
            bVar.a();
            this.f11171m = null;
        }
        View view = this.f11159a;
        if (view == null || view.getParent() == this) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) this.f11159a.getParent();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            removeView(viewGroup);
        }
        addView(this.f11159a);
    }

    public void render(d3 d3Var, a.InterfaceC0148a interfaceC0148a, k kVar) {
        recycle();
        if (!d3Var.v0().get() || !d3Var.u0().get()) {
            this.f11171m = new com.applovin.impl.mediation.ads.b(d3Var, this, interfaceC0148a, kVar);
        }
        final MaxNativeAd nativeAd = d3Var.getNativeAd();
        if (d3Var.w0() && nativeAd.isContainerClickable()) {
            kVar.O();
            if (o.a()) {
                kVar.O().a("MaxNativeAdView", "Enabling container click");
            }
            setOnClickListener(new View.OnClickListener() { // from class: com.applovin.mediation.nativeAds.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    nativeAd.performClick();
                }
            });
        }
        kVar.O();
        if (o.a()) {
            kVar.O().a("MaxNativeAdView", "Rendering custom ad view");
        }
        a(nativeAd);
    }
}
