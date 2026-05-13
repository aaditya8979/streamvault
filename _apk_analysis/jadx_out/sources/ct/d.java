package ct;

import android.widget.ImageView;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.nativead.NativeAd;
import com.yk.e.adview.AdmobNativeMediaView;
import com.yk.e.object.AdInfo;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements NativeAd.OnNativeAdLoadedListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f59439b;

    public d(k kVar) {
        this.f59439b = kVar;
    }

    public final void a(AdValue adValue) {
        this.f59439b.f59453b.f(adValue.getValueMicros() / 1000000);
        this.f59439b.f59453b.f71977z = "admob_" + this.f59439b.f59453b.G.getResponseInfo().getLoadedAdapterResponseInfo().getAdSourceName();
        this.f59439b.f59453b.r(adValue);
        this.f59439b.f59453b.H = new AdInfo();
        this.f59439b.f59453b.H.setRevenue(adValue.getValueMicros() / 1000000);
        int precisionType = adValue.getPrecisionType();
        this.f59439b.f59453b.H.setRevenuePrecision(precisionType != 0 ? precisionType != 1 ? precisionType != 3 ? "PUBLISHER_PROVIDED" : "PRECISE" : "ESTIMATED" : "UNKNOWN");
        a0 a0Var = this.f59439b.f59453b;
        a0Var.H.setNetworkName(a0Var.G.getResponseInfo().getLoadedAdapterResponseInfo().getAdSourceName());
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
    public final void onNativeAdLoaded(NativeAd nativeAd) {
        int i10;
        int i11;
        ImageView imageView;
        this.f59439b.f59453b.G = nativeAd;
        nativeAd.setOnPaidEventListener(new OnPaidEventListener() { // from class: ct.c
            @Override // com.google.android.gms.ads.OnPaidEventListener
            public final void onPaidEvent(AdValue adValue) {
                this.f59437a.a(adValue);
            }
        });
        k kVar = this.f59439b;
        a0 a0Var = kVar.f59453b;
        i.e eVar = a0Var.f71962k;
        if (eVar == null || (i10 = eVar.f63662d) == 0) {
            i10 = 1000;
        }
        int i12 = i10;
        if (eVar == null || (i11 = eVar.f63663e) == 0) {
            i11 = 570;
        }
        int i13 = i11;
        a0Var.I = new d.b(kVar.f59452a, nativeAd);
        AdmobNativeMediaView admobNativeMediaView = this.f59439b.f59453b.I.f59484c;
        if (admobNativeMediaView != null && (imageView = admobNativeMediaView.f3346Ll1) != null) {
            imageView.setVisibility(0);
        }
        a0 a0Var2 = this.f59439b.f59453b;
        d.b bVar = a0Var2.I;
        h hVar = a0Var2.L;
        AdmobNativeMediaView admobNativeMediaView2 = bVar.f59484c;
        if (admobNativeMediaView2 != null) {
            admobNativeMediaView2.setCloseImageViewClickListener(hVar);
        }
        k kVar2 = this.f59439b;
        a0 a0Var3 = kVar2.f59453b;
        a0Var3.I.a(kVar2.f59452a, i12, i13, a0Var3.B, a0Var3.C);
    }
}
