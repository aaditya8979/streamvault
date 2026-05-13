package sg.bigo.ads.ad.banner;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdBid;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdInteractionListener;
import sg.bigo.ads.api.AdLoadListener;
import sg.bigo.ads.api.BannerAd;
import sg.bigo.ads.api.BannerAdLoader;
import sg.bigo.ads.api.BannerAdRequest;
import sg.bigo.ads.api.InnerBannerAd;

/* JADX INFO: loaded from: classes9.dex */
public class BigoAdView extends sg.bigo.ads.api.a<sg.bigo.ads.core.adview.d> implements Ad {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BannerAd f79934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AdLoadListener<BigoAdView> f79935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ViewGroup.LayoutParams f79936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AdLoadListener<BannerAd> f79937d;

    public BigoAdView(@NonNull Context context) {
        super(context);
        this.f79937d = new AdLoadListener<BannerAd>() { // from class: sg.bigo.ads.ad.banner.BigoAdView.1
            @Override // sg.bigo.ads.api.AdLoadListener
            public final /* synthetic */ void onAdLoaded(@NonNull Ad ad2) {
                BigoAdView.this.f79934a = (BannerAd) ad2;
                BigoAdView.this.a(true);
                if (BigoAdView.this.f79935b != null) {
                    BigoAdView.this.f79935b.onAdLoaded(BigoAdView.this);
                }
            }

            @Override // sg.bigo.ads.api.AdLoadListener
            public final void onError(@NonNull AdError adError) {
                if (BigoAdView.this.f79935b != null) {
                    BigoAdView.this.f79935b.onError(adError);
                }
            }
        };
    }

    public BigoAdView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f79937d = new AdLoadListener<BannerAd>() { // from class: sg.bigo.ads.ad.banner.BigoAdView.1
            @Override // sg.bigo.ads.api.AdLoadListener
            public final /* synthetic */ void onAdLoaded(@NonNull Ad ad2) {
                BigoAdView.this.f79934a = (BannerAd) ad2;
                BigoAdView.this.a(true);
                if (BigoAdView.this.f79935b != null) {
                    BigoAdView.this.f79935b.onAdLoaded(BigoAdView.this);
                }
            }

            @Override // sg.bigo.ads.api.AdLoadListener
            public final void onError(@NonNull AdError adError) {
                if (BigoAdView.this.f79935b != null) {
                    BigoAdView.this.f79935b.onError(adError);
                }
            }
        };
    }

    public BigoAdView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f79937d = new AdLoadListener<BannerAd>() { // from class: sg.bigo.ads.ad.banner.BigoAdView.1
            @Override // sg.bigo.ads.api.AdLoadListener
            public final /* synthetic */ void onAdLoaded(@NonNull Ad ad2) {
                BigoAdView.this.f79934a = (BannerAd) ad2;
                BigoAdView.this.a(true);
                if (BigoAdView.this.f79935b != null) {
                    BigoAdView.this.f79935b.onAdLoaded(BigoAdView.this);
                }
            }

            @Override // sg.bigo.ads.api.AdLoadListener
            public final void onError(@NonNull AdError adError) {
                if (BigoAdView.this.f79935b != null) {
                    BigoAdView.this.f79935b.onError(adError);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z10) {
        ViewGroup.LayoutParams layoutParams;
        BannerAd bannerAd = this.f79934a;
        if (!(bannerAd instanceof InnerBannerAd) || bannerAd.adView() == null) {
            return;
        }
        View viewAdView = this.f79934a.adView();
        int iA = sg.bigo.ads.common.utils.e.a(getContext(), this.f79934a.getWidth());
        int iA2 = sg.bigo.ads.common.utils.e.a(getContext(), this.f79934a.getHeight());
        BannerAd bannerAd2 = this.f79934a;
        if ((bannerAd2 instanceof i) && (((i) bannerAd2).f80005y instanceof e) && (layoutParams = this.f79936c) != null) {
            int i10 = -2 == layoutParams.width ? iA : 1;
            int i11 = -2 == layoutParams.height ? iA2 : 1;
            if (i10 != 1 || 1 == bannerAd2.getWidth()) {
                iA = i10;
            } else {
                int i12 = this.f79936c.width;
                if (-1 == i12 || i12 > 1) {
                    iA = i12;
                }
            }
            if (i11 != 1 || 1 == this.f79934a.getHeight()) {
                iA2 = i11;
            } else {
                int i13 = this.f79936c.height;
                if (-1 == i13 || i13 > 1) {
                    iA2 = i13;
                }
            }
        }
        ViewGroup.LayoutParams layoutParams2 = viewAdView.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new FrameLayout.LayoutParams(iA, iA2);
        } else {
            layoutParams2.width = iA;
            layoutParams2.height = iA2;
        }
        if (((InnerBannerAd) this.f79934a).getWebView() != null) {
            ViewGroup.LayoutParams layoutParams3 = ((InnerBannerAd) this.f79934a).getWebView().getLayoutParams();
            if (layoutParams3 == null) {
                layoutParams3 = new FrameLayout.LayoutParams(iA, iA2);
            } else {
                layoutParams3.width = iA;
                layoutParams3.height = iA2;
            }
            ((InnerBannerAd) this.f79934a).getWebView().setLayoutParams(layoutParams3);
        }
        if (layoutParams2 instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams2).gravity = 17;
        }
        viewAdView.setLayoutParams(layoutParams2);
        if (z10) {
            removeAllViews();
            addView(viewAdView);
        }
    }

    @Override // sg.bigo.ads.api.a
    @NonNull
    public final /* synthetic */ sg.bigo.ads.core.adview.c a() {
        return new sg.bigo.ads.core.adview.d(this);
    }

    @Override // java.lang.Comparable
    public int compareTo(Ad ad2) {
        BannerAd bannerAd = this.f79934a;
        if (bannerAd != null) {
            return bannerAd.compareTo(ad2);
        }
        return 0;
    }

    @Override // sg.bigo.ads.api.Ad
    public void destroy() {
        BannerAd bannerAd = this.f79934a;
        if (bannerAd != null) {
            bannerAd.destroy();
        }
    }

    @Override // sg.bigo.ads.api.Ad
    @Nullable
    public AdBid getBid() {
        BannerAd bannerAd = this.f79934a;
        if (bannerAd != null) {
            return bannerAd.getBid();
        }
        return null;
    }

    @Override // sg.bigo.ads.api.Ad
    @Nullable
    public String getCreativeId() {
        BannerAd bannerAd = this.f79934a;
        if (bannerAd != null) {
            return bannerAd.getCreativeId();
        }
        return null;
    }

    @Override // sg.bigo.ads.api.Ad
    @Nullable
    public String getExtraInfo(String str) {
        BannerAd bannerAd = this.f79934a;
        if (bannerAd != null) {
            return bannerAd.getExtraInfo(str);
        }
        return null;
    }

    public int getHeightInDP() {
        BannerAd bannerAd = this.f79934a;
        if (bannerAd != null) {
            return bannerAd.getHeight();
        }
        return 0;
    }

    public int getWidthInDP() {
        BannerAd bannerAd = this.f79934a;
        if (bannerAd != null) {
            return bannerAd.getWidth();
        }
        return 0;
    }

    @Override // sg.bigo.ads.api.Ad
    public boolean isExpired() {
        BannerAd bannerAd = this.f79934a;
        if (bannerAd != null) {
            return bannerAd.isExpired();
        }
        return false;
    }

    public void loadAd(BannerAdRequest bannerAdRequest) {
        new BannerAdLoader.Builder().withAdLoadListener(this.f79937d).build().loadAd(bannerAdRequest);
    }

    public void loadAd(BannerAdRequest bannerAdRequest, String str) {
        new BannerAdLoader.Builder().withAdLoadListener(this.f79937d).withExt(str).build().loadAd(bannerAdRequest);
    }

    @Override // sg.bigo.ads.api.Ad, sg.bigo.ads.api.IconAds
    public void setAdInteractionListener(AdInteractionListener adInteractionListener) {
        BannerAd bannerAd = this.f79934a;
        if (bannerAd != null) {
            bannerAd.setAdInteractionListener(adInteractionListener);
        }
    }

    public void setAdLoadListener(AdLoadListener<BigoAdView> adLoadListener) {
        this.f79935b = adLoadListener;
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        this.f79936c = layoutParams;
        a(false);
        super.setLayoutParams(layoutParams);
    }
}
