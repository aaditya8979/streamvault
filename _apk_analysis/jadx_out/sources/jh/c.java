package jh;

import bp.r0;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends FullScreenContentCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f72434b;

    public c(j jVar) {
        this.f72434b = jVar;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdClicked() {
        super.onAdClicked();
        this.f72434b.D.onAdClick();
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdDismissedFullScreenContent() {
        super.onAdDismissedFullScreenContent();
        this.f72434b.D.onAdClose();
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdFailedToShowFullScreenContent(AdError adError) {
        super.onAdFailedToShowFullScreenContent(adError);
        this.f72434b.v(adError.getCode() + ", " + adError.getMessage());
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdImpression() {
        super.onAdImpression();
        j jVar = this.f72434b;
        jVar.D.onAdShow(r0.b(jVar.F, jVar.f71957f));
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdShowedFullScreenContent() {
        super.onAdShowedFullScreenContent();
    }
}
