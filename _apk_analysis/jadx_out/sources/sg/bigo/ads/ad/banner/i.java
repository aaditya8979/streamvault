package sg.bigo.ads.ad.banner;

import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.InterfaceC3934ae;
import sg.bigo.ads.BigoAdSdk;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdBid;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdInteractionListener;
import sg.bigo.ads.api.InnerBannerAd;
import sg.bigo.ads.api.a.l;
import sg.bigo.ads.api.b.d;
import sg.bigo.ads.api.core.p;
import sg.bigo.ads.common.utils.k;
import sg.bigo.ads.common.utils.t;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.controller.e.a;
import sg.bigo.ads.controller.loader.AbstractAdLoader;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends sg.bigo.ads.ad.c<InnerBannerAd, sg.bigo.ads.api.core.b> implements InnerBannerAd {
    private sg.bigo.ads.api.core.f A;
    private b B;
    private AbstractAdLoader C;
    private d.a<InnerBannerAd> D;
    private a E;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public InnerBannerAd f80005y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private FrameLayout f80006z;

    public class a implements AdInteractionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public AdInteractionListener f80014a;

        public a() {
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdClicked() {
            AdInteractionListener adInteractionListener = this.f80014a;
            if (adInteractionListener != null) {
                adInteractionListener.onAdClicked();
            }
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdClosed() {
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdError(@NonNull AdError adError) {
            AdInteractionListener adInteractionListener = this.f80014a;
            if (adInteractionListener != null) {
                adInteractionListener.onAdError(adError);
            }
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdImpression() {
            AdInteractionListener adInteractionListener = this.f80014a;
            if (adInteractionListener != null) {
                adInteractionListener.onAdImpression();
            }
            if (i.this.B != null) {
                final b bVar = i.this.B;
                sg.bigo.ads.common.t.a.a(0, 3, "BannerAd", "Start auto refreshing after " + (bVar.f80016a / 1000) + " s");
                bVar.f80017b.removeCallbacksAndMessages(null);
                bVar.f80017b.postDelayed(new Runnable() { // from class: sg.bigo.ads.ad.banner.i.b.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        i.e(i.this);
                    }
                }, (long) bVar.f80016a);
            }
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdOpened() {
        }
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f80016a = 20000;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Handler f80017b = new Handler(Looper.getMainLooper());

        public b() {
            sg.bigo.ads.common.t.a.a(0, 3, "BannerAd", "Enable bigo adx banner auto refreshing");
        }
    }

    public i(@NonNull sg.bigo.ads.api.core.f fVar) {
        super(fVar);
        this.E = new a();
        if (!fVar.f81861b.w() && fVar.f81861b.j()) {
            b bVar = new b();
            this.B = bVar;
            int iK = fVar.f81861b.k();
            if (iK >= 10) {
                bVar.f80016a = iK * 1000;
            }
        }
        InnerBannerAd innerBannerAdB = d.b(fVar);
        this.f80005y = innerBannerAdB;
        if (innerBannerAdB == null) {
            throw new IllegalArgumentException("UnifiedBannerWrapper Illegal adx type.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View A() {
        if (this.f80006z == null) {
            this.f80006z = new FrameLayout(this.f80021b.f81864e);
        }
        if (this.f80005y == null) {
            return null;
        }
        this.f80006z.removeAllViews();
        u.a(this.f80005y.adView(), this.f80006z, null, -1);
        sg.bigo.ads.common.view.c.a(this.f80021b.f81864e, this.f80006z, getWatermarkView());
        return this.f80006z;
    }

    public static /* synthetic */ void a(i iVar, final InnerBannerAd innerBannerAd) {
        sg.bigo.ads.common.n.d.b(new Runnable() { // from class: sg.bigo.ads.ad.banner.i.2
            @Override // java.lang.Runnable
            public final void run() {
                InnerBannerAd innerBannerAd2 = innerBannerAd;
                if (innerBannerAd2 != null) {
                    innerBannerAd2.destroy();
                }
            }
        });
    }

    public static /* synthetic */ void a(i iVar, sg.bigo.ads.api.core.b bVar, sg.bigo.ads.api.core.f fVar) {
        InnerBannerAd innerBannerAdB = d.b(fVar);
        if (innerBannerAdB != null) {
            iVar.A = fVar;
            innerBannerAdB.markFromAutoFresh(bVar);
            innerBannerAdB.handleInnerBannerAdResponse(iVar.D);
        }
    }

    public static /* synthetic */ void b(i iVar) {
        if (iVar.f80005y != null) {
            iVar.a();
            iVar.f80021b = iVar.A;
            iVar.f80005y.setAdInteractionListener(iVar.E);
            sg.bigo.ads.common.n.d.b(new Runnable() { // from class: sg.bigo.ads.ad.banner.i.3
                @Override // java.lang.Runnable
                public final void run() {
                    i.this.A();
                }
            });
        }
    }

    public static /* synthetic */ void e(i iVar) {
        sg.bigo.ads.api.b bVarA = iVar.f80021b.f81862c.a();
        if (bVarA != null) {
            bVarA.f81805c = 1;
            final a.C1035a[] c1035aArr = new a.C1035a[1];
            c1035aArr[0] = BigoAdSdk.a(bVarA, new sg.bigo.ads.controller.c() { // from class: sg.bigo.ads.ad.banner.i.4
                @Override // sg.bigo.ads.controller.e
                public final /* synthetic */ void a(int i10, int i11, int i12, @NonNull String str, @Nullable Pair<sg.bigo.ads.api.b, l> pair) {
                    AnonymousClass4 anonymousClass4;
                    sg.bigo.ads.api.b bVar;
                    p pVar;
                    p pVar2;
                    p pVar3;
                    p pVar4;
                    Pair<sg.bigo.ads.api.b, l> pair2 = pair;
                    sg.bigo.ads.common.t.a.a(2, "Banner", "Banner auto-refresh failed: ".concat(String.valueOf(str)));
                    String str2 = null;
                    if (pair2 != null) {
                        sg.bigo.ads.api.b bVar2 = (sg.bigo.ads.api.b) pair2.first;
                        if (bVar2 != null) {
                            bVar2.f81810h.a();
                        }
                        bVar = bVar2;
                        anonymousClass4 = this;
                    } else {
                        anonymousClass4 = this;
                        bVar = null;
                    }
                    a.C1035a c1035a = c1035aArr[0];
                    l lVar = pair2 != null ? (l) pair2.second : null;
                    int i13 = (c1035a == null || (pVar4 = c1035a.f83282g) == null) ? 3 : pVar4.f81899a ? 1 : 0;
                    boolean z10 = (c1035a == null || (pVar3 = c1035a.f83282g) == null || !pVar3.f81900b) ? false : true;
                    int i14 = (c1035a == null || (pVar2 = c1035a.f83282g) == null) ? 4 : pVar2.f81901c;
                    if (c1035a != null && (pVar = c1035a.f83282g) != null) {
                        str2 = pVar.f81902d;
                    }
                    sg.bigo.ads.core.d.b.a(lVar, bVar, i11, i12, str, 1, 0, i13, z10, i14, str2);
                }

                @Override // sg.bigo.ads.controller.e
                public final /* synthetic */ void a(int i10, @NonNull sg.bigo.ads.api.b bVar, @NonNull sg.bigo.ads.api.core.f[] fVarArr) {
                    p pVar;
                    p pVar2;
                    p pVar3;
                    p pVar4;
                    sg.bigo.ads.api.core.f fVar = (sg.bigo.ads.api.core.f) k.b(fVarArr);
                    fVar.f81862c.f81810h.a();
                    a.C1035a c1035a = c1035aArr[0];
                    sg.bigo.ads.core.d.b.a(new sg.bigo.ads.api.core.b[]{fVar.f81860a}, fVar.f81862c, fVar.f81861b.s() && fVar.f81860a.ac(), 1, 0, (c1035a == null || (pVar4 = c1035a.f83282g) == null) ? 3 : pVar4.f81899a ? 1 : 0, (c1035a == null || (pVar3 = c1035a.f83282g) == null || !pVar3.f81900b) ? false : true, (c1035a == null || (pVar2 = c1035a.f83282g) == null) ? 4 : pVar2.f81901c, (c1035a == null || (pVar = c1035a.f83282g) == null) ? null : pVar.f81902d);
                    i.a(i.this, fVar.f81860a, fVar);
                }
            });
        }
        sg.bigo.ads.common.t.a.a(0, 3, "Banner", "Start auto refreshing for bigo adx banner");
    }

    @Override // sg.bigo.ads.api.b.a, java.lang.Comparable
    /* JADX INFO: renamed from: a */
    public final int compareTo(Ad ad2) {
        InnerBannerAd innerBannerAd = this.f80005y;
        if (innerBannerAd != null) {
            return innerBannerAd.compareTo(ad2);
        }
        return 0;
    }

    @Override // sg.bigo.ads.ad.c, sg.bigo.ads.api.b.d
    public final void a(@NonNull final d.a<InnerBannerAd> aVar) {
        super.a(aVar);
        if (this.C == null && (aVar instanceof AbstractAdLoader.b)) {
            this.C = ((AbstractAdLoader.b) aVar).a();
        }
        d.a<InnerBannerAd> aVar2 = new d.a<InnerBannerAd>() { // from class: sg.bigo.ads.ad.banner.i.1
            @Override // sg.bigo.ads.api.b.d.a
            public final /* synthetic */ void a(@NonNull Ad ad2) {
                InnerBannerAd innerBannerAd = (InnerBannerAd) ad2;
                if (i.this.f80005y != null && i.this.f80005y != innerBannerAd) {
                    i.a(i.this, i.this.f80005y);
                }
                i.this.f80005y = innerBannerAd;
                if (!innerBannerAd.isInnerBannerAdFromAutoRefresh()) {
                    aVar.a(i.this);
                    return;
                }
                i.b(i.this);
                if (i.this.C != null) {
                    i.this.C.a(i.this);
                }
            }

            @Override // sg.bigo.ads.api.b.d.a
            public final /* synthetic */ void a(Ad ad2, int i10, int i11, String str) {
                InnerBannerAd innerBannerAd = (InnerBannerAd) ad2;
                if (innerBannerAd == null || !innerBannerAd.isInnerBannerAdFromAutoRefresh()) {
                    aVar.a(i.this, i10, i11, str);
                } else {
                    i.this.a(i10, i11, str);
                }
            }

            @Override // sg.bigo.ads.api.b.d.a
            public final /* bridge */ /* synthetic */ void a(Ad ad2, boolean z10, int i10, int i11, String str, boolean z11) {
                aVar.a(i.this, z10, i10, i11, str, z11);
            }
        };
        this.D = aVar2;
        InnerBannerAd innerBannerAd = this.f80005y;
        if (innerBannerAd != null) {
            innerBannerAd.handleInnerBannerAdResponse(aVar2);
        } else {
            aVar.a(this, 1005, InterfaceC3934ae.c.f30979d, "banner adx_type error");
        }
    }

    @Override // sg.bigo.ads.api.BannerAd
    public final View adView() {
        String str;
        if (!sg.bigo.ads.common.n.d.b()) {
            t.a("adView() must run on UI thread");
        }
        if (isExpired()) {
            str = "The ad is expired.";
        } else {
            if (!this.f80028i) {
                FrameLayout frameLayout = this.f80006z;
                return frameLayout != null ? frameLayout : A();
            }
            str = "The ad is destroyed.";
        }
        b(2000, 1, str);
        return null;
    }

    @Override // sg.bigo.ads.ad.c
    public final void destroyInMainThread() {
        super.destroyInMainThread();
        InnerBannerAd innerBannerAd = this.f80005y;
        if (innerBannerAd != null) {
            innerBannerAd.destroy();
        }
        b bVar = this.B;
        if (bVar != null) {
            sg.bigo.ads.common.t.a.a(0, 3, "BannerAd", "bigo adx banner auto refreshing stop");
            bVar.f80017b.removeCallbacksAndMessages(null);
        }
    }

    @Override // sg.bigo.ads.ad.c, sg.bigo.ads.api.b.a
    @NonNull
    public final sg.bigo.ads.api.core.b f() {
        return getInnerBannerAdData();
    }

    @Override // sg.bigo.ads.ad.c, sg.bigo.ads.api.Ad
    @Nullable
    public final AdBid getBid() {
        InnerBannerAd innerBannerAd = this.f80005y;
        if (innerBannerAd != null) {
            return innerBannerAd.getBid();
        }
        return null;
    }

    @Override // sg.bigo.ads.api.Ad
    @Nullable
    public final String getCreativeId() {
        InnerBannerAd innerBannerAd = this.f80005y;
        if (innerBannerAd != null) {
            return innerBannerAd.getCreativeId();
        }
        return null;
    }

    @Override // sg.bigo.ads.ad.c, sg.bigo.ads.api.Ad
    @Nullable
    public final String getExtraInfo(String str) {
        InnerBannerAd innerBannerAd = this.f80005y;
        if (innerBannerAd != null) {
            return innerBannerAd.getExtraInfo(str);
        }
        return null;
    }

    @Override // sg.bigo.ads.api.BannerAd
    public final int getHeight() {
        InnerBannerAd innerBannerAd = this.f80005y;
        if (innerBannerAd != null) {
            return innerBannerAd.getHeight();
        }
        return 0;
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final sg.bigo.ads.api.core.b getInnerBannerAdData() {
        InnerBannerAd innerBannerAd = this.f80005y;
        if (innerBannerAd != null) {
            return innerBannerAd.getInnerBannerAdData();
        }
        return null;
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final sg.bigo.ads.common.view.c getWatermarkView() {
        InnerBannerAd innerBannerAd = this.f80005y;
        if (innerBannerAd == null) {
            return null;
        }
        return innerBannerAd.getWatermarkView();
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final WebView getWebView() {
        InnerBannerAd innerBannerAd = this.f80005y;
        if (innerBannerAd == null) {
            return null;
        }
        return innerBannerAd.getWebView();
    }

    @Override // sg.bigo.ads.api.BannerAd
    public final int getWidth() {
        InnerBannerAd innerBannerAd = this.f80005y;
        if (innerBannerAd != null) {
            return innerBannerAd.getWidth();
        }
        return 0;
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final void handleInnerBannerAdResponse(@NonNull d.a<InnerBannerAd> aVar) {
    }

    @Override // sg.bigo.ads.ad.c, sg.bigo.ads.api.Ad
    public final boolean isExpired() {
        InnerBannerAd innerBannerAd = this.f80005y;
        if (innerBannerAd != null) {
            return innerBannerAd.isExpired();
        }
        return false;
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final boolean isInnerBannerAdFromAutoRefresh() {
        InnerBannerAd innerBannerAd = this.f80005y;
        if (innerBannerAd != null) {
            return innerBannerAd.isInnerBannerAdFromAutoRefresh();
        }
        return false;
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final void markFromAutoFresh(sg.bigo.ads.api.core.b bVar) {
    }

    @Override // sg.bigo.ads.ad.c, sg.bigo.ads.api.Ad, sg.bigo.ads.api.IconAds
    public final void setAdInteractionListener(AdInteractionListener adInteractionListener) {
        super.setAdInteractionListener(adInteractionListener);
        a aVar = this.E;
        aVar.f80014a = adInteractionListener;
        InnerBannerAd innerBannerAd = this.f80005y;
        if (innerBannerAd != null) {
            innerBannerAd.setAdInteractionListener(aVar);
        }
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final int updateFormOpenTimes() {
        return 0;
    }

    @Override // sg.bigo.ads.api.b.a
    public final int z() {
        InnerBannerAd innerBannerAd = this.f80005y;
        if (innerBannerAd != null) {
            return innerBannerAd.updateFormOpenTimes();
        }
        return 0;
    }
}
