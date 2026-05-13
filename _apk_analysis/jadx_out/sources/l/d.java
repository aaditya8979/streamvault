package l;

import bp.r0;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends AdListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f73586c;

    public d(k kVar) {
        this.f73586c = kVar;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
        super.onAdClicked();
        this.f73586c.B.onAdClick();
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        super.onAdClosed();
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f73586c.v(loadAdError.getCode() + ", " + loadAdError.getMessage());
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        super.onAdImpression();
        k kVar = this.f73586c;
        kVar.B.onAdShow(r0.b(kVar.E, kVar.f71957f));
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        super.onAdLoaded();
        d.b bVar = this.f73586c.D;
        if (bVar != null) {
            bp.h.a(bVar.f59482a);
            k kVar = this.f73586c;
            kVar.B.onAdLoaded(kVar.D.f59482a);
        }
    }
}
