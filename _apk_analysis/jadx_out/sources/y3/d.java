package y3;

import androidx.annotation.NonNull;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.services.banners.BannerView;

/* JADX INFO: compiled from: UnityBannerViewWrapper.java */
/* JADX INFO: loaded from: classes4.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BannerView f87219a;

    public d(@NonNull BannerView bannerView) {
        this.f87219a = bannerView;
    }

    public BannerView a() {
        return this.f87219a;
    }

    public void b(UnityAdsLoadOptions unityAdsLoadOptions) {
        this.f87219a.load(unityAdsLoadOptions);
    }

    public void c(BannerView.IListener iListener) {
        this.f87219a.setListener(iListener);
    }
}
