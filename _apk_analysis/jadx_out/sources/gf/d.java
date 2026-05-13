package gf;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;

/* JADX INFO: compiled from: ScarBannerAdListener.java */
/* JADX INFO: loaded from: classes8.dex */
public class d extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final af.f f62385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f62386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AdListener f62387d = new a();

    /* JADX INFO: compiled from: ScarBannerAdListener.java */
    public class a extends AdListener {
        public a() {
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClicked() {
            super.onAdClicked();
            d.this.f62385b.onAdClicked();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClosed() {
            super.onAdClosed();
            d.this.f62385b.onAdClosed();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
            super.onAdFailedToLoad(loadAdError);
            d.this.f62386c.d();
            d.this.f62385b.onAdFailedToLoad(loadAdError.getCode(), loadAdError.getMessage());
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdImpression() {
            super.onAdImpression();
            d.this.f62385b.onAdImpression();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdLoaded() {
            super.onAdLoaded();
            d.this.f62385b.onAdLoaded();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdOpened() {
            super.onAdOpened();
            d.this.f62385b.onAdOpened();
        }
    }

    public d(af.f fVar, c cVar) {
        this.f62385b = fVar;
        this.f62386c = cVar;
    }

    public AdListener d() {
        return this.f62387d;
    }
}
