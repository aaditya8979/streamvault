package f;

import bp.r0;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends AdListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f61363c;

    public a(z zVar) {
        this.f61363c = zVar;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
        super.onAdClicked();
        this.f61363c.D.onAdClick();
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        super.onAdClosed();
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f61363c.v(loadAdError.getCode() + ", " + loadAdError.getMessage());
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        super.onAdImpression();
        z zVar = this.f61363c;
        zVar.D.onAdShow(r0.b(zVar.G, zVar.f71957f));
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        super.onAdLoaded();
        d.b bVar = this.f61363c.F;
        if (bVar != null) {
            bp.h.a(bVar.f59482a);
            z zVar = this.f61363c;
            zVar.D.onAdLoaded(zVar.F.f59482a);
        }
    }
}
