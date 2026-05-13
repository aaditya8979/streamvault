package f;

import android.app.Activity;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdLoadListener;
import sg.bigo.ads.api.NativeAd;

/* JADX INFO: loaded from: classes5.dex */
public final class k implements AdLoadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f61381a;

    public k(h hVar) {
        this.f61381a = hVar;
    }

    @Override // sg.bigo.ads.api.AdLoadListener
    public final void onAdLoaded(Ad ad2) {
        int i10;
        int i11;
        NativeAd nativeAd = (NativeAd) ad2;
        f0 f0Var = this.f61381a.f61377b;
        f0Var.E = nativeAd;
        nativeAd.setAdInteractionListener(f0Var.G);
        h hVar = this.f61381a;
        f0 f0Var2 = hVar.f61377b;
        i.e eVar = f0Var2.f71962k;
        if (eVar == null || (i10 = eVar.f63662d) == 0) {
            i10 = 1000;
        }
        int i12 = i10;
        if (eVar == null || (i11 = eVar.f63663e) == 0) {
            i11 = 570;
        }
        int i13 = i11;
        d.a aVar = new d.a(hVar.f61376a, f0Var2.E);
        h hVar2 = this.f61381a;
        Activity activity = hVar2.f61376a;
        f0 f0Var3 = hVar2.f61377b;
        aVar.a(activity, i12, i13, f0Var3.B, f0Var3.C);
        bp.h.a(aVar.f59479d);
        this.f61381a.f61377b.D.onAdLoaded(aVar.f59479d);
    }

    @Override // sg.bigo.ads.api.AdLoadListener
    public final void onError(AdError adError) {
        this.f61381a.f61377b.v(adError.getCode() + ", " + adError.getMessage());
    }
}
