package e;

import com.yk.e.util.IDUtil;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdLoadListener;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.NativeAd;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements AdLoadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f59998a;

    public e(o oVar) {
        this.f59998a = oVar;
    }

    @Override // sg.bigo.ads.api.AdLoadListener
    public final void onAdLoaded(Ad ad2) {
        NativeAd nativeAd = (NativeAd) ad2;
        h hVar = this.f59998a.f60014b;
        hVar.M = nativeAd;
        nativeAd.setAdInteractionListener(hVar.O);
        int dimensionPixelOffset = this.f59998a.f60013a.getResources().getDimensionPixelOffset(IDUtil.getDimen(this.f59998a.f60013a, "dp_135"));
        o oVar = this.f59998a;
        d.a aVar = new d.a(oVar.f60013a, oVar.f60014b.M);
        aVar.a(this.f59998a.f60013a, -1, dimensionPixelOffset, -1, dimensionPixelOffset);
        MediaView mediaView = aVar.f59481f;
        if (mediaView != null) {
            mediaView.setVisibility(8);
        }
        bp.h.a(aVar.f59479d);
        this.f59998a.f60014b.L.onAdLoaded(aVar.f59479d);
    }

    @Override // sg.bigo.ads.api.AdLoadListener
    public final void onError(AdError adError) {
        this.f59998a.f60014b.v(adError.getCode() + ", " + adError.getMessage());
    }
}
