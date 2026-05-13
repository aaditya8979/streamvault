package com.applovin.mediation.ads;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.e8;
import com.applovin.impl.mediation.ads.MaxAdViewImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.s;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxAdViewConfiguration;
import com.applovin.sdk.AppLovinSdk;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.events.base.StatsEvent;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: loaded from: classes8.dex */
public class MaxAdView extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private MaxAdViewImpl f11134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f11135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f11136c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaxAdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (StatsEvent) null);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/ads/MaxAdView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V");
        CreativeInfoManager.onMaxAdViewCreated(this, getAdFormat(), getAdUnitId());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaxAdView(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, (StatsEvent) null);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/ads/MaxAdView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V");
        CreativeInfoManager.onMaxAdViewCreated(this, getAdFormat(), getAdUnitId());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private MaxAdView(Context context, AttributeSet attributeSet, int i10, StatsEvent statsEvent) {
        super(context, attributeSet, i10);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/ads/MaxAdView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V");
        if ("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/ads/MaxAdView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V" == 0) {
            return;
        }
        super(context, attributeSet, i10);
        String strA = s.a(context, attributeSet, AppLovinAdView.NAMESPACE, "adUnitId");
        String strA2 = s.a(context, attributeSet, AppLovinAdView.NAMESPACE, "adFormat");
        MaxAdFormat fromString = StringUtils.isValidString(strA2) ? MaxAdFormat.formatFromString(strA2) : s.a(context);
        int attributeIntValue = attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 49);
        if (strA == null) {
            throw new IllegalArgumentException("No ad unit ID specified");
        }
        if (TextUtils.isEmpty(strA)) {
            throw new IllegalArgumentException("Empty ad unit ID specified");
        }
        if (isInEditMode()) {
            a(context);
        } else {
            a(strA, fromString, null, attributeIntValue, context);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private MaxAdView(Context context, AttributeSet attributeSet, StatsEvent statsEvent) {
        this(context, attributeSet, 0);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/ads/MaxAdView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V");
        if ("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/ads/MaxAdView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V" == 0) {
        } else {
            this(context, attributeSet, 0);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaxAdView(String str) {
        this(str, (StatsEvent) null);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/ads/MaxAdView;-><init>(Ljava/lang/String;)V");
        CreativeInfoManager.onMaxAdViewCreated(this, getAdFormat(), getAdUnitId());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public MaxAdView(String str, Context context) {
        this(str, context, (StatsEvent) null);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/ads/MaxAdView;-><init>(Ljava/lang/String;Landroid/content/Context;)V");
        CreativeInfoManager.onMaxAdViewCreated(this, getAdFormat(), getAdUnitId());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private MaxAdView(String str, Context context, StatsEvent statsEvent) {
        this(str, AppLovinSdk.getInstance(context), context);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/ads/MaxAdView;-><init>(Ljava/lang/String;Landroid/content/Context;)V");
        if ("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/ads/MaxAdView;-><init>(Ljava/lang/String;Landroid/content/Context;)V" == 0) {
        } else {
            this(str, AppLovinSdk.getInstance(context), context);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaxAdView(String str, MaxAdFormat maxAdFormat) {
        this(str, maxAdFormat, (StatsEvent) null);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/ads/MaxAdView;-><init>(Ljava/lang/String;Lcom/applovin/mediation/MaxAdFormat;)V");
        CreativeInfoManager.onMaxAdViewCreated(this, getAdFormat(), getAdUnitId());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public MaxAdView(String str, MaxAdFormat maxAdFormat, Context context) {
        this(str, maxAdFormat, context, (StatsEvent) null);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/ads/MaxAdView;-><init>(Ljava/lang/String;Lcom/applovin/mediation/MaxAdFormat;Landroid/content/Context;)V");
        CreativeInfoManager.onMaxAdViewCreated(this, getAdFormat(), getAdUnitId());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private MaxAdView(String str, MaxAdFormat maxAdFormat, Context context, StatsEvent statsEvent) {
        this(str, maxAdFormat, AppLovinSdk.getInstance(context), context);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/ads/MaxAdView;-><init>(Ljava/lang/String;Lcom/applovin/mediation/MaxAdFormat;Landroid/content/Context;)V");
        if ("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/ads/MaxAdView;-><init>(Ljava/lang/String;Lcom/applovin/mediation/MaxAdFormat;Landroid/content/Context;)V" == 0) {
        } else {
            this(str, maxAdFormat, AppLovinSdk.getInstance(context), context);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaxAdView(String str, MaxAdFormat maxAdFormat, @Nullable MaxAdViewConfiguration maxAdViewConfiguration) {
        this(str, maxAdFormat, maxAdViewConfiguration, (StatsEvent) null);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/ads/MaxAdView;-><init>(Ljava/lang/String;Lcom/applovin/mediation/MaxAdFormat;Lcom/applovin/mediation/MaxAdViewConfiguration;)V");
        CreativeInfoManager.onMaxAdViewCreated(this, getAdFormat(), getAdUnitId());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private MaxAdView(String str, MaxAdFormat maxAdFormat, MaxAdViewConfiguration maxAdViewConfiguration, StatsEvent statsEvent) {
        super(k.o());
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/ads/MaxAdView;-><init>(Ljava/lang/String;Lcom/applovin/mediation/MaxAdFormat;Lcom/applovin/mediation/MaxAdViewConfiguration;)V");
        if ("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/ads/MaxAdView;-><init>(Ljava/lang/String;Lcom/applovin/mediation/MaxAdFormat;Lcom/applovin/mediation/MaxAdViewConfiguration;)V" == 0) {
            return;
        }
        super(k.o());
        a.logApiCall("MaxAdView", "MaxAdView(adUnitId=" + str + ", adFormat=" + maxAdFormat + ", configuration=" + maxAdViewConfiguration + ")");
        a(str, maxAdFormat, maxAdViewConfiguration, 49, k.o());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public MaxAdView(String str, MaxAdFormat maxAdFormat, AppLovinSdk appLovinSdk, Context context) {
        this(str, maxAdFormat, appLovinSdk, context, null);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/ads/MaxAdView;-><init>(Ljava/lang/String;Lcom/applovin/mediation/MaxAdFormat;Lcom/applovin/sdk/AppLovinSdk;Landroid/content/Context;)V");
        CreativeInfoManager.onMaxAdViewCreated(this, getAdFormat(), getAdUnitId());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private MaxAdView(String str, MaxAdFormat maxAdFormat, AppLovinSdk appLovinSdk, Context context, StatsEvent statsEvent) {
        super(context);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/ads/MaxAdView;-><init>(Ljava/lang/String;Lcom/applovin/mediation/MaxAdFormat;Lcom/applovin/sdk/AppLovinSdk;Landroid/content/Context;)V");
        if ("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/ads/MaxAdView;-><init>(Ljava/lang/String;Lcom/applovin/mediation/MaxAdFormat;Lcom/applovin/sdk/AppLovinSdk;Landroid/content/Context;)V" == 0) {
            return;
        }
        super(context);
        a.logApiCall("MaxAdView", "MaxAdView(adUnitId=" + str + ", adFormat=" + maxAdFormat + ")");
        a(str, maxAdFormat, null, 49, context);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private MaxAdView(String str, MaxAdFormat maxAdFormat, StatsEvent statsEvent) {
        this(str, maxAdFormat, (MaxAdViewConfiguration) null);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/ads/MaxAdView;-><init>(Ljava/lang/String;Lcom/applovin/mediation/MaxAdFormat;)V");
        if ("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/ads/MaxAdView;-><init>(Ljava/lang/String;Lcom/applovin/mediation/MaxAdFormat;)V" == 0) {
        } else {
            this(str, maxAdFormat, (MaxAdViewConfiguration) null);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaxAdView(String str, @Nullable MaxAdViewConfiguration maxAdViewConfiguration) {
        this(str, maxAdViewConfiguration, (StatsEvent) null);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/ads/MaxAdView;-><init>(Ljava/lang/String;Lcom/applovin/mediation/MaxAdViewConfiguration;)V");
        CreativeInfoManager.onMaxAdViewCreated(this, getAdFormat(), getAdUnitId());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private MaxAdView(String str, MaxAdViewConfiguration maxAdViewConfiguration, StatsEvent statsEvent) {
        this(str, s.a(k.o()), maxAdViewConfiguration);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/ads/MaxAdView;-><init>(Ljava/lang/String;Lcom/applovin/mediation/MaxAdViewConfiguration;)V");
        if ("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/ads/MaxAdView;-><init>(Ljava/lang/String;Lcom/applovin/mediation/MaxAdViewConfiguration;)V" == 0) {
        } else {
            this(str, s.a(k.o()), maxAdViewConfiguration);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public MaxAdView(String str, AppLovinSdk appLovinSdk, Context context) {
        this(str, appLovinSdk, context, (StatsEvent) null);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/ads/MaxAdView;-><init>(Ljava/lang/String;Lcom/applovin/sdk/AppLovinSdk;Landroid/content/Context;)V");
        CreativeInfoManager.onMaxAdViewCreated(this, getAdFormat(), getAdUnitId());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private MaxAdView(String str, AppLovinSdk appLovinSdk, Context context, StatsEvent statsEvent) {
        this(str, s.a(context), context);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/ads/MaxAdView;-><init>(Ljava/lang/String;Lcom/applovin/sdk/AppLovinSdk;Landroid/content/Context;)V");
        if ("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/ads/MaxAdView;-><init>(Ljava/lang/String;Lcom/applovin/sdk/AppLovinSdk;Landroid/content/Context;)V" == 0) {
        } else {
            this(str, s.a(context), context);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private MaxAdView(String str, StatsEvent statsEvent) {
        this(str, (MaxAdViewConfiguration) null);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/ads/MaxAdView;-><init>(Ljava/lang/String;)V");
        if ("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/ads/MaxAdView;-><init>(Ljava/lang/String;)V" == 0) {
        } else {
            this(str, (MaxAdViewConfiguration) null);
        }
    }

    private void a(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i10 = displayMetrics.widthPixels;
        int i11 = displayMetrics.heightPixels;
        TextView textView = new TextView(context);
        textView.setBackgroundColor(Color.rgb(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE));
        textView.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        textView.setText("AppLovin MAX Ad");
        textView.setGravity(17);
        addView(textView, i10, i11);
    }

    private void a(String str, MaxAdFormat maxAdFormat, MaxAdViewConfiguration maxAdViewConfiguration, int i10, Context context) {
        View view = new View(context.getApplicationContext());
        this.f11135b = view;
        view.setBackgroundColor(0);
        addView(this.f11135b);
        this.f11135b.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f11136c = getVisibility();
        this.f11134a = new MaxAdViewImpl(str.trim(), maxAdFormat, maxAdViewConfiguration, this, this.f11135b, context);
        setGravity(i10);
        if (getBackground() instanceof ColorDrawable) {
            setBackgroundColor(((ColorDrawable) getBackground()).getColor());
        }
        super.setBackgroundColor(0);
    }

    public void destroy() {
        this.f11134a.logApiCall("destroy()");
        this.f11134a.destroy();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(g.f53127a, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public MaxAdFormat getAdFormat() {
        return this.f11134a.getAdFormat();
    }

    public String getAdUnitId() {
        return this.f11134a.getAdUnitId();
    }

    public String getPlacement() {
        this.f11134a.logApiCall("getPlacement()");
        return this.f11134a.getPlacement();
    }

    public void loadAd() {
        this.f11134a.logApiCall("loadAd()");
        this.f11134a.loadAd();
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        if (isInEditMode()) {
            return;
        }
        this.f11134a.logApiCall("onWindowVisibilityChanged(visibility=" + i10 + ")");
        if (this.f11134a != null && e8.a(this.f11136c, i10)) {
            this.f11134a.onWindowVisibilityChanged(i10);
        }
        this.f11136c = i10;
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.f11134a.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f11134a.setAdReviewListener(maxAdReviewListener);
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        this.f11134a.logApiCall("setAlpha(alpha=" + f10 + ")");
        View view = this.f11135b;
        if (view != null) {
            view.setAlpha(f10);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.f11134a.logApiCall("setBackgroundColor(color=" + i10 + ")");
        MaxAdViewImpl maxAdViewImpl = this.f11134a;
        if (maxAdViewImpl != null) {
            maxAdViewImpl.setPublisherBackgroundColor(i10);
        }
        View view = this.f11135b;
        if (view != null) {
            view.setBackgroundColor(i10);
        }
    }

    public void setCustomData(String str) {
        this.f11134a.logApiCall("setCustomData(value=" + str + ")");
        this.f11134a.setCustomData(str);
    }

    public void setExtraParameter(String str, String str2) {
        this.f11134a.logApiCall("setExtraParameter(key=" + str + ", value=" + str2 + ")");
        this.f11134a.setExtraParameter(str, str2);
    }

    public void setListener(MaxAdViewAdListener maxAdViewAdListener) {
        this.f11134a.logApiCall("setListener(listener=" + maxAdViewAdListener + ")");
        this.f11134a.setListener(maxAdViewAdListener);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        this.f11134a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f11134a.setLocalExtraParameter(str, obj);
    }

    public void setPlacement(String str) {
        this.f11134a.logApiCall("setPlacement(placement=" + str + ")");
        this.f11134a.setPlacement(str);
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        this.f11134a.logApiCall("setRequestListener(listener=" + maxAdRequestListener + ")");
        this.f11134a.setRequestListener(maxAdRequestListener);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        this.f11134a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f11134a.setRevenueListener(maxAdRevenueListener);
    }

    public void startAutoRefresh() {
        this.f11134a.logApiCall("startAutoRefresh()");
        this.f11134a.startAutoRefresh();
    }

    public void stopAutoRefresh() {
        this.f11134a.logApiCall("stopAutoRefresh()");
        this.f11134a.stopAutoRefresh();
    }

    @Override // android.view.View
    @NonNull
    public String toString() {
        MaxAdViewImpl maxAdViewImpl = this.f11134a;
        return maxAdViewImpl != null ? maxAdViewImpl.toString() : "MaxAdView";
    }
}
