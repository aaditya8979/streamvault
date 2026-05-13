package l;

import com.ironsource.mediationsdk.logger.IronSourceError;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdLoadListener;
import sg.bigo.ads.api.NativeAd;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 implements AdLoadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f73587a;

    public d0(h hVar) {
        this.f73587a = hVar;
    }

    @Override // sg.bigo.ads.api.AdLoadListener
    public final void onAdLoaded(Ad ad2) {
        int i10;
        int i11;
        NativeAd nativeAd = (NativeAd) ad2;
        w wVar = this.f73587a.f73603e;
        wVar.C = nativeAd;
        nativeAd.setAdInteractionListener(wVar.E);
        h hVar = this.f73587a;
        w wVar2 = hVar.f73603e;
        i.e eVar = wVar2.f71962k;
        if (eVar == null || (i10 = eVar.f63662d) == 0) {
            i10 = IronSourceError.ERROR_DO_RV_LOAD_DURING_SHOW;
        }
        int i12 = i10;
        if (eVar == null || (i11 = eVar.f63663e) == 0) {
            i11 = 465;
        }
        int i13 = i11;
        d.a aVar = new d.a(hVar.f73599a, wVar2.C);
        h hVar2 = this.f73587a;
        aVar.a(hVar2.f73599a, i12, i13, hVar2.f73600b, hVar2.f73601c);
        bp.h.a(aVar.f59479d);
        this.f73587a.f73602d.onAdLoaded(aVar.f59479d);
    }

    @Override // sg.bigo.ads.api.AdLoadListener
    public final void onError(AdError adError) {
        this.f73587a.f73603e.v(adError.getCode() + ", " + adError.getMessage());
    }
}
