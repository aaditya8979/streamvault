package ct;

import android.widget.ImageView;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdLoadListener;
import sg.bigo.ads.api.NativeAd;

/* JADX INFO: loaded from: classes11.dex */
public final class d0 implements AdLoadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f59440a;

    public d0(i iVar) {
        this.f59440a = iVar;
    }

    @Override // sg.bigo.ads.api.AdLoadListener
    public final void onAdLoaded(Ad ad2) {
        int i10;
        int i11;
        NativeAd nativeAd = (NativeAd) ad2;
        i0 i0Var = this.f59440a.f59449b;
        i0Var.G = nativeAd;
        nativeAd.setAdInteractionListener(i0Var.K);
        i iVar = this.f59440a;
        i0 i0Var2 = iVar.f59449b;
        i.e eVar = i0Var2.f71962k;
        if (eVar == null || (i10 = eVar.f63662d) == 0) {
            i10 = 1000;
        }
        int i12 = i10;
        if (eVar == null || (i11 = eVar.f63663e) == 0) {
            i11 = 570;
        }
        i0Var2.H = new d.a(iVar.f59448a, i0Var2.G);
        i iVar2 = this.f59440a;
        i0 i0Var3 = iVar2.f59449b;
        i0Var3.H.a(iVar2.f59448a, i12, i11, i0Var3.B, i0Var3.C);
        ImageView imageView = this.f59440a.f59449b.H.f59480e;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        i0 i0Var4 = this.f59440a.f59449b;
        d.a aVar = i0Var4.H;
        r rVar = i0Var4.J;
        ImageView imageView2 = aVar.f59480e;
        if (imageView2 != null) {
            imageView2.setOnClickListener(rVar);
        }
        bp.h.a(this.f59440a.f59449b.H.f59479d);
        i0 i0Var5 = this.f59440a.f59449b;
        i0Var5.F.onAdLoaded(i0Var5.H.f59479d);
    }

    @Override // sg.bigo.ads.api.AdLoadListener
    public final void onError(AdError adError) {
        this.f59440a.f59449b.v(adError.getCode() + ", " + adError.getMessage());
    }
}
