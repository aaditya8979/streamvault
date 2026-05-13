package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacerSettings;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: loaded from: classes6.dex */
public class x2 extends MaxNativeAdListener implements MaxAdRevenueListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f10667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MaxNativeAdLoader f10668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Queue f10669c = new LinkedList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f10670d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f10671e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f10672f;

    public interface a {
        void onAdRevenuePaid(MaxAd maxAd);

        void onNativeAdClicked(MaxAd maxAd);

        void onNativeAdLoadFailed(String str, MaxError maxError);

        void onNativeAdLoaded();
    }

    public x2(MaxAdPlacerSettings maxAdPlacerSettings, Context context, a aVar) {
        this.f10667a = maxAdPlacerSettings.getMaxPreloadedAdCount();
        this.f10672f = aVar;
        MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader(maxAdPlacerSettings.getAdUnitId(), context);
        this.f10668b = maxNativeAdLoader;
        maxNativeAdLoader.setNativeAdListener(this);
        maxNativeAdLoader.setRevenueListener(this);
        maxNativeAdLoader.setPlacement(maxAdPlacerSettings.getPlacement());
        maxNativeAdLoader.setLocalExtraParameter(MaxNativeAdLoaderImpl.KEY_EXTRA_PARAMETER_AD_REQUEST_TYPE, i.NATIVE_AD_PLACER);
    }

    public void a() {
        synchronized (this.f10671e) {
            Iterator it = this.f10669c.iterator();
            while (it.hasNext()) {
                a((MaxAd) it.next());
            }
            this.f10669c.clear();
        }
    }

    public void a(MaxAd maxAd) {
        this.f10668b.destroy(maxAd);
    }

    public boolean a(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        return this.f10668b.render(maxNativeAdView, maxAd);
    }

    public MaxAd b() {
        MaxAd maxAd;
        synchronized (this.f10671e) {
            maxAd = null;
            while (!this.f10669c.isEmpty() && (maxAd == null || maxAd.getNativeAd().isExpired())) {
                maxAd = (MaxAd) this.f10669c.remove();
            }
            e();
        }
        return maxAd;
    }

    public void c() {
        this.f10672f = null;
        a();
        this.f10668b.destroy();
    }

    public boolean d() {
        boolean z10;
        synchronized (this.f10671e) {
            z10 = !this.f10669c.isEmpty();
        }
        return z10;
    }

    public void e() {
        synchronized (this.f10671e) {
            if (!this.f10670d && this.f10669c.size() < this.f10667a) {
                this.f10670d = true;
                this.f10668b.loadAd();
            }
        }
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(MaxAd maxAd) {
        a aVar = this.f10672f;
        if (aVar != null) {
            aVar.onAdRevenuePaid(maxAd);
        }
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public void onNativeAdClicked(MaxAd maxAd) {
        a aVar = this.f10672f;
        if (aVar != null) {
            aVar.onNativeAdClicked(maxAd);
        }
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public void onNativeAdLoadFailed(String str, MaxError maxError) {
        a aVar = this.f10672f;
        if (aVar != null) {
            aVar.onNativeAdLoadFailed(str, maxError);
        }
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        synchronized (this.f10671e) {
            this.f10669c.add(maxAd);
            this.f10670d = false;
            e();
        }
        a aVar = this.f10672f;
        if (aVar != null) {
            aVar.onNativeAdLoaded();
        }
    }
}
