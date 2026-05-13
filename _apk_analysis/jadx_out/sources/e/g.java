package e;

import android.widget.RelativeLayout;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.nativead.NativeAd;
import com.yk.e.adview.AdmobNativeMediaView;
import com.yk.e.object.AdInfo;
import com.yk.e.util.IDUtil;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements NativeAd.OnNativeAdLoadedListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f60002b;

    public g(c cVar) {
        this.f60002b = cVar;
    }

    public final void a(AdValue adValue) {
        this.f60002b.f59995b.f(adValue.getValueMicros() / 1000000);
        this.f60002b.f59995b.f71977z = "admob_" + this.f60002b.f59995b.M.getResponseInfo().getLoadedAdapterResponseInfo().getAdSourceName();
        this.f60002b.f59995b.r(adValue);
        this.f60002b.f59995b.P = new AdInfo();
        this.f60002b.f59995b.P.setRevenue(adValue.getValueMicros() / 1000000);
        int precisionType = adValue.getPrecisionType();
        this.f60002b.f59995b.P.setRevenuePrecision(precisionType != 0 ? precisionType != 1 ? precisionType != 3 ? "PUBLISHER_PROVIDED" : "PRECISE" : "ESTIMATED" : "UNKNOWN");
        b0 b0Var = this.f60002b.f59995b;
        b0Var.P.setNetworkName(b0Var.M.getResponseInfo().getLoadedAdapterResponseInfo().getAdSourceName());
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
    public final void onNativeAdLoaded(NativeAd nativeAd) {
        RelativeLayout relativeLayout;
        this.f60002b.f59995b.M = nativeAd;
        nativeAd.setOnPaidEventListener(new OnPaidEventListener() { // from class: e.f
            @Override // com.google.android.gms.ads.OnPaidEventListener
            public final void onPaidEvent(AdValue adValue) {
                this.f60000a.a(adValue);
            }
        });
        int dimensionPixelOffset = this.f60002b.f59994a.getResources().getDimensionPixelOffset(IDUtil.getDimen(this.f60002b.f59994a, "dp_135"));
        c cVar = this.f60002b;
        cVar.f59995b.N = new d.b(cVar.f59994a, nativeAd);
        AdmobNativeMediaView admobNativeMediaView = this.f60002b.f59995b.N.f59484c;
        if (admobNativeMediaView != null && (relativeLayout = admobNativeMediaView.f3349lIiI) != null) {
            relativeLayout.setVisibility(8);
        }
        c cVar2 = this.f60002b;
        cVar2.f59995b.N.a(cVar2.f59994a, -1, dimensionPixelOffset, -1, dimensionPixelOffset);
    }
}
