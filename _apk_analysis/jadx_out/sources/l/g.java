package l;

import android.app.Activity;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.yk.e.inf.IComCallback;
import com.yk.e.object.AdInfo;

/* JADX INFO: loaded from: classes11.dex */
public final class g implements IComCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f73594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f73595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f73596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f73597d;

    public g(k kVar, Activity activity, int i10, int i11) {
        this.f73597d = kVar;
        this.f73594a = activity;
        this.f73595b = i10;
        this.f73596c = i11;
    }

    public final /* synthetic */ void a(Activity activity, int i10, int i11, NativeAd nativeAd) {
        int i12;
        int i13;
        k kVar = this.f73597d;
        kVar.C = nativeAd;
        kVar.F = System.currentTimeMillis();
        nativeAd.setOnPaidEventListener(new OnPaidEventListener() { // from class: l.f
            @Override // com.google.android.gms.ads.OnPaidEventListener
            public final void onPaidEvent(AdValue adValue) {
                this.f73592a.b(adValue);
            }
        });
        k kVar2 = this.f73597d;
        i.e eVar = kVar2.f71962k;
        if (eVar == null || (i12 = eVar.f63662d) == 0) {
            i12 = IronSourceError.ERROR_DO_RV_LOAD_DURING_SHOW;
        }
        int i14 = i12;
        if (eVar == null || (i13 = eVar.f63663e) == 0) {
            i13 = 465;
        }
        kVar2.D = new d.b(activity, nativeAd);
        this.f73597d.D.a(activity, i14, i13, i10, i11);
    }

    public final void b(AdValue adValue) {
        this.f73597d.f(adValue.getValueMicros() / 1000000);
        this.f73597d.f71977z = "admob_" + this.f73597d.C.getResponseInfo().getLoadedAdapterResponseInfo().getAdSourceName();
        this.f73597d.r(adValue);
        this.f73597d.E = new AdInfo();
        this.f73597d.E.setRevenue(adValue.getValueMicros() / 1000000);
        int precisionType = adValue.getPrecisionType();
        this.f73597d.E.setRevenuePrecision(precisionType != 0 ? precisionType != 1 ? precisionType != 3 ? "PUBLISHER_PROVIDED" : "PRECISE" : "ESTIMATED" : "UNKNOWN");
        k kVar = this.f73597d;
        kVar.E.setNetworkName(kVar.C.getResponseInfo().getLoadedAdapterResponseInfo().getAdSourceName());
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onFailed(int i10, String str) {
        this.f73597d.x(str);
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onSuccess() {
        AdLoader.Builder builderWithNativeAdOptions = new AdLoader.Builder(this.f73594a, this.f73597d.G).withNativeAdOptions(new NativeAdOptions.Builder().setVideoOptions(new VideoOptions.Builder().setStartMuted(false).build()).build());
        final Activity activity = this.f73594a;
        final int i10 = this.f73595b;
        final int i11 = this.f73596c;
        builderWithNativeAdOptions.forNativeAd(new NativeAd.OnNativeAdLoadedListener() { // from class: l.e
            @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
            public final void onNativeAdLoaded(NativeAd nativeAd) {
                this.f73588b.a(activity, i10, i11, nativeAd);
            }
        }).withAdListener(this.f73597d.H).withNativeAdOptions(new NativeAdOptions.Builder().setAdChoicesPlacement(2).build()).build().loadAd(new AdRequest.Builder().build());
    }
}
