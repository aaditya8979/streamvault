package k;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends FullScreenContentCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f72636b;

    public c(m mVar) {
        this.f72636b = mVar;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdClicked() {
        super.onAdClicked();
        this.f72636b.D.onAdClick();
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdDismissedFullScreenContent() {
        super.onAdDismissedFullScreenContent();
        this.f72636b.D.onAdClose();
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdFailedToShowFullScreenContent(AdError adError) {
        super.onAdFailedToShowFullScreenContent(adError);
        this.f72636b.x(adError.getCode() + ", " + adError.getMessage());
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdImpression() {
        super.onAdImpression();
        m mVar = this.f72636b;
        mVar.D.onAdShow(bp.r0.b(mVar.G, mVar.f71957f));
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdShowedFullScreenContent() {
        super.onAdShowedFullScreenContent();
    }
}
