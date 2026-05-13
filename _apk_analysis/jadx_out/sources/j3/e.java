package j3;

import androidx.annotation.VisibleForTesting;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.formats.zzd;
import com.google.android.gms.ads.formats.zze;
import com.google.android.gms.ads.formats.zzg;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.internal.ads.zzbln;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* JADX INFO: loaded from: classes3.dex */
@VisibleForTesting
public final class e extends AdListener implements zzg, zze, zzd {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @VisibleForTesting
    public final AbstractAdViewAdapter f72181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @VisibleForTesting
    public final MediationNativeListener f72182d;

    public e(AbstractAdViewAdapter abstractAdViewAdapter, MediationNativeListener mediationNativeListener) {
        this.f72181c = abstractAdViewAdapter;
        this.f72182d = mediationNativeListener;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
        this.f72182d.onAdClicked(this.f72181c);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        this.f72182d.onAdClosed(this.f72181c);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f72182d.onAdFailedToLoad(this.f72181c, loadAdError);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        this.f72182d.onAdImpression(this.f72181c);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        this.f72182d.onAdOpened(this.f72181c);
    }

    @Override // com.google.android.gms.ads.formats.zzg
    public final void zza(UnifiedNativeAd unifiedNativeAd) {
        this.f72182d.onAdLoaded(this.f72181c, new a(unifiedNativeAd));
    }

    @Override // com.google.android.gms.ads.formats.zze
    public final void zzb(zzbln zzblnVar) {
        this.f72182d.zzc(this.f72181c, zzblnVar);
    }

    @Override // com.google.android.gms.ads.formats.zzd
    public final void zzc(zzbln zzblnVar, String str) {
        this.f72182d.zzd(this.f72181c, zzblnVar, str);
    }
}
