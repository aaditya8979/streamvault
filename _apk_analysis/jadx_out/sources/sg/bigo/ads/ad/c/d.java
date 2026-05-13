package sg.bigo.ads.ad.c;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.view.View;
import android.webkit.URLUtil;
import android.webkit.WebView;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.ad.b.b;
import sg.bigo.ads.ad.c.a.a.AnonymousClass2;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdBid;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdInteractionListener;
import sg.bigo.ads.api.InnerBannerAd;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.api.a.i;
import sg.bigo.ads.api.b.d;
import sg.bigo.ads.api.core.f;
import sg.bigo.ads.api.core.h;
import sg.bigo.ads.api.core.n;
import sg.bigo.ads.common.p.e;
import sg.bigo.ads.common.p.g;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.common.utils.t;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements b.InterfaceC0962b, InnerBannerAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private sg.bigo.ads.ad.b.b f80094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private sg.bigo.ads.ad.c.b f80095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Boolean f80096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f80097d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private sg.bigo.ads.ad.c.a.a f80098e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private c f80099f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f80100g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f80101h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f80102i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final f f80103j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f80104k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private d.a<InnerBannerAd> f80105l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final a f80106m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private b.a f80107n;

    public class a implements AdInteractionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public AdInteractionListener f80110a;

        public a() {
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdClicked() {
            AdInteractionListener adInteractionListener = this.f80110a;
            if (adInteractionListener != null) {
                adInteractionListener.onAdClicked();
            }
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdClosed() {
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdError(@NonNull AdError adError) {
            if (this.f80110a != null) {
                if (adError.getCode() == 2002 && d.g(d.this)) {
                    sg.bigo.ads.common.t.a.a(0, 3, "BannerNativeAd", "don't call onAdError when video has impressed");
                } else {
                    this.f80110a.onAdError(adError);
                }
            }
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdImpression() {
            d.this.f80104k = SystemClock.elapsedRealtime();
            if (d.this.f80098e != null && d.this.f80099f != null) {
                d.this.f80098e.a(d.this.f80099f.f80092b);
            }
            if (d.this.f80094a != null) {
                d.this.f80094a.a(d.this.f80107n);
            }
            AdInteractionListener adInteractionListener = this.f80110a;
            if (adInteractionListener != null) {
                adInteractionListener.onAdImpression();
            }
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdOpened() {
        }
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public d.a<NativeAd> f80112a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public d.a<NativeAd> f80113b;

        public b(final d.a<InnerBannerAd> aVar) {
            this.f80112a = new d.a<NativeAd>() { // from class: sg.bigo.ads.ad.c.d.b.1
                @Override // sg.bigo.ads.api.b.d.a
                public final /* synthetic */ void a(Ad ad2) {
                    boolean z10 = false;
                    if (d.this.f80098e == null) {
                        d.c(d.this);
                        d.this.a((d.a<InnerBannerAd>) aVar, 1, false);
                        return;
                    }
                    sg.bigo.ads.common.t.a.a(0, 3, "BannerNativeAd", "native-banner icon load success");
                    d.d(d.this);
                    if (d.this.f80095b != null) {
                        sg.bigo.ads.ad.c.a.a aVar2 = d.this.f80098e;
                        ImageView imageView = d.this.f80095b.f80087a;
                        if (d.this.f80094a != null && d.this.f80094a.p()) {
                            z10 = true;
                        }
                        aVar2.a(imageView, z10);
                    }
                    d.this.a(1, 3);
                    d.this.a((d.a<InnerBannerAd>) aVar, 1, true);
                }

                @Override // sg.bigo.ads.api.b.d.a
                public final /* synthetic */ void a(Ad ad2, int i10, int i11, String str) {
                    sg.bigo.ads.common.t.a.a(0, 3, "BannerNativeAd", "native-banner icon load failed");
                    d.c(d.this);
                    if (i11 == 10103) {
                        d.this.a(1, 1);
                    } else {
                        d.this.a(1, 4);
                    }
                    d.this.a((d.a<InnerBannerAd>) aVar, 1, false);
                }

                @Override // sg.bigo.ads.api.b.d.a
                public final /* bridge */ /* synthetic */ void a(Ad ad2, boolean z10, int i10, int i11, String str, boolean z11) {
                }
            };
            this.f80113b = new d.a<NativeAd>() { // from class: sg.bigo.ads.ad.c.d.b.2
                @Override // sg.bigo.ads.api.b.d.a
                public final /* synthetic */ void a(Ad ad2) {
                    NativeAd nativeAd = (NativeAd) ad2;
                    boolean z10 = false;
                    if (d.this.f80098e == null) {
                        d.c(d.this);
                        d.this.a((d.a<InnerBannerAd>) aVar, 1, false);
                        return;
                    }
                    d.d(d.this);
                    b.a(b.this, nativeAd, 3);
                    sg.bigo.ads.ad.c.a.a aVar2 = d.this.f80098e;
                    aVar2.a(aVar2.new AnonymousClass2(), nativeAd instanceof sg.bigo.ads.ad.b.a.a);
                    sg.bigo.ads.ad.c.a.a aVar3 = d.this.f80098e;
                    if (d.this.f80094a != null && d.this.f80094a.p()) {
                        z10 = true;
                    }
                    aVar3.a(z10);
                    d.this.a((d.a<InnerBannerAd>) aVar, 1, true);
                }

                @Override // sg.bigo.ads.api.b.d.a
                public final /* synthetic */ void a(Ad ad2, int i10, int i11, String str) {
                    b bVar;
                    int i12;
                    NativeAd nativeAd = (NativeAd) ad2;
                    sg.bigo.ads.common.t.a.a(0, 3, "BannerNativeAd", "native-banner main media load failed");
                    d.c(d.this);
                    if (i11 == 1401 || i11 == 10074 || i11 == 10103 || i11 == 1300) {
                        bVar = b.this;
                        i12 = 1;
                    } else {
                        bVar = b.this;
                        i12 = 4;
                    }
                    b.a(bVar, nativeAd, i12);
                    d.this.a((d.a<InnerBannerAd>) aVar, 1, false);
                }

                @Override // sg.bigo.ads.api.b.d.a
                public final /* bridge */ /* synthetic */ void a(Ad ad2, boolean z10, int i10, int i11, String str, boolean z11) {
                }
            };
        }

        public static /* synthetic */ void a(b bVar, NativeAd nativeAd, int i10) {
            if (nativeAd instanceof sg.bigo.ads.ad.b.a.b) {
                d.this.a(3, i10);
            } else if (nativeAd instanceof sg.bigo.ads.ad.b.a.a) {
                d.this.a(2, i10);
            }
        }

        public final void a() {
            this.f80112a = null;
            this.f80113b = null;
        }
    }

    public d(@NonNull f fVar) {
        this.f80100g = 0;
        this.f80101h = 0;
        this.f80102i = false;
        a aVar = new a();
        this.f80106m = aVar;
        this.f80107n = new b.a() { // from class: sg.bigo.ads.ad.c.d.1
            @Override // sg.bigo.ads.ad.b.b.a
            public final void a() {
                if (d.this.f80098e != null) {
                    d.this.f80098e.f();
                }
            }
        };
        this.f80103j = fVar;
        sg.bigo.ads.ad.b.b bVarA = sg.bigo.ads.ad.b.a.a(fVar);
        this.f80094a = bVarA;
        if (bVarA != null) {
            bVarA.setAdInteractionListener(aVar);
            this.f80099f = new c(fVar);
            this.f80095b = new sg.bigo.ads.ad.c.b(this.f80094a);
            h.b bVarAw = ((sg.bigo.ads.core.a.a) this.f80094a.f()).aw();
            sg.bigo.ads.ad.b.b bVar = this.f80094a;
            this.f80098e = bVar != null ? sg.bigo.ads.ad.c.a.a.a(bVar, bVar.f80021b.f81865f, bVarAw) : null;
            this.f80096c = Boolean.FALSE;
            this.f80097d = null;
            this.f80100g = 0;
            this.f80101h = 0;
            this.f80102i = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(d.a<InnerBannerAd> aVar, int i10, boolean z10) {
        int i11;
        String str;
        if (aVar == null) {
            return;
        }
        if (this.f80096c.booleanValue()) {
            return;
        }
        c cVar = this.f80099f;
        int i12 = 2;
        if (cVar != null && cVar.f80091a == 2 && i10 == 2) {
            d();
            aVar.a(this);
            this.f80096c = Boolean.TRUE;
            return;
        }
        sg.bigo.ads.ad.b.b bVar = this.f80094a;
        if (bVar != null && ((sg.bigo.ads.core.a.a) bVar.f()).aR()) {
            i12 = 3;
        }
        if (!z10) {
            if (this.f80101h == i12 || this.f80102i) {
                if (this.f80102i) {
                    i11 = 1006;
                    str = "native banner VAST parse failed";
                } else {
                    i11 = 1253;
                    str = "native banner download icon & main resources all failed";
                }
                aVar.a(this, 1005, i11, str);
            }
        }
        d();
        aVar.a(this);
        this.f80096c = Boolean.TRUE;
    }

    public static /* synthetic */ int c(d dVar) {
        int i10 = dVar.f80101h;
        dVar.f80101h = i10 + 1;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        b bVar = this.f80097d;
        if (bVar != null) {
            bVar.a();
            this.f80097d = null;
        }
        sg.bigo.ads.ad.c.a.a aVar = this.f80098e;
        if (aVar != null) {
            aVar.h();
        }
        sg.bigo.ads.ad.c.b bVar2 = this.f80095b;
        if (bVar2 != null) {
            bVar2.a();
        }
    }

    public static /* synthetic */ int d(d dVar) {
        int i10 = dVar.f80100g;
        dVar.f80100g = i10 + 1;
        return i10;
    }

    private void d() {
        sg.bigo.ads.ad.c.b bVar;
        sg.bigo.ads.ad.c.a.a aVar = this.f80098e;
        if (aVar == null || (bVar = this.f80095b) == null) {
            return;
        }
        aVar.a(bVar.f80087a, e());
    }

    private int e() {
        c cVar = this.f80099f;
        return (cVar == null || cVar.f80093c != 2) ? 3 : 1;
    }

    public static /* synthetic */ boolean g(d dVar) {
        sg.bigo.ads.ad.b.b bVar = dVar.f80094a;
        return bVar != null && bVar.p();
    }

    @Override // sg.bigo.ads.ad.b.b.InterfaceC0962b
    public final void a() {
        a(this.f80105l, 2, false);
        final sg.bigo.ads.ad.c.b bVar = this.f80095b;
        final d.a<NativeAd> aVar = this.f80097d.f80112a;
        sg.bigo.ads.ad.b.b bVar2 = bVar.f80088b;
        if (bVar2 != null) {
            sg.bigo.ads.core.a.a aVar2 = (sg.bigo.ads.core.a.a) bVar2.f();
            if (aVar2.av() == null) {
                aVar.a(bVar.f80088b, 3001, 10103, "banner icon is empty");
                return;
            }
            String strC = aVar2.av().c();
            if (q.a((CharSequence) strC)) {
                aVar.a(bVar.f80088b, 3001, 10103, "banner icon url is empty");
            } else if (i.f81802a.n().a(9) && URLUtil.isHttpUrl(strC)) {
                aVar.a(bVar.f80088b, 3001, 10118, "Invalid http banner icon url");
            } else {
                e.b(bVar.f80088b.f80021b.f81864e, sg.bigo.ads.common.u.a.e.j(), strC, aVar2.al(), new g() { // from class: sg.bigo.ads.ad.c.b.1

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ d.a f80089a;

                    public AnonymousClass1(final d.a aVar3) {
                        aVar = aVar3;
                    }

                    @Override // sg.bigo.ads.common.p.g
                    public final void a(int i10, @NonNull String str, String str2) {
                        d.a aVar3;
                        b bVar3 = b.this;
                        sg.bigo.ads.ad.b.b bVar4 = bVar3.f80088b;
                        if (bVar4 == null || bVar3.f80087a == null || (aVar3 = aVar) == null) {
                            return;
                        }
                        aVar3.a(bVar4, i10, 3001, str);
                    }

                    @Override // sg.bigo.ads.common.p.g
                    public final void a(@NonNull Bitmap bitmap, @NonNull sg.bigo.ads.common.p.f fVar) {
                        b bVar3 = b.this;
                        sg.bigo.ads.ad.b.b bVar4 = bVar3.f80088b;
                        if (bVar4 == null || bVar3.f80087a == null || aVar == null) {
                            return;
                        }
                        bVar4.a(bitmap, 1);
                        b.this.f80087a.setImageBitmap(bitmap);
                        aVar.a(b.this.f80088b);
                    }
                });
            }
        }
    }

    public final void a(int i10, int i11) {
        Integer numValueOf;
        String str;
        sg.bigo.ads.ad.b.b bVar = this.f80094a;
        if (bVar == null) {
            return;
        }
        if (i10 == 1) {
            numValueOf = Integer.valueOf(i11);
            str = "icon_sta";
        } else {
            if (i10 != 2) {
                if (i10 == 3 && (bVar instanceof sg.bigo.ads.ad.b.a.b)) {
                    bVar.a("vid_sta", Integer.valueOf(i11));
                    return;
                }
                return;
            }
            numValueOf = Integer.valueOf(i11);
            str = "img_sta";
        }
        bVar.a(str, numValueOf);
    }

    @Override // sg.bigo.ads.api.BannerAd
    public final View adView() {
        if (!sg.bigo.ads.common.n.d.b()) {
            t.a("adView() must run on UI thread");
        }
        if (this.f80094a == null) {
            return null;
        }
        if (isExpired()) {
            this.f80094a.b(2000, 1, "The ad is expired.");
            return null;
        }
        sg.bigo.ads.ad.b.b bVar = this.f80094a;
        if (bVar.f80028i) {
            bVar.b(2000, 1, "The ad is destroyed.");
            return null;
        }
        sg.bigo.ads.ad.c.a.a aVar = this.f80098e;
        if (aVar != null) {
            return aVar.e();
        }
        bVar.a(2000, "mNativeBannerRender is null.");
        return null;
    }

    @Override // sg.bigo.ads.ad.b.b.InterfaceC0962b
    public final void b() {
        this.f80102i = true;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Ad ad2) {
        Ad ad3 = ad2;
        sg.bigo.ads.ad.b.b bVar = this.f80094a;
        if (bVar != null) {
            return bVar.compareTo(ad3);
        }
        return 0;
    }

    @Override // sg.bigo.ads.api.Ad
    public final void destroy() {
        destroyInMainThread();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [sg.bigo.ads.api.core.b] */
    @Override // sg.bigo.ads.api.InnerBannerAd
    public final void destroyInMainThread() {
        if (sg.bigo.ads.common.n.d.b()) {
            c();
        } else {
            sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.ad.c.d.2
                @Override // java.lang.Runnable
                public final void run() {
                    d.this.c();
                }
            });
        }
        sg.bigo.ads.ad.b.b bVar = this.f80094a;
        if (bVar != null) {
            sg.bigo.ads.core.d.b.a((sg.bigo.ads.api.core.b) bVar.f(), SystemClock.elapsedRealtime() - this.f80104k);
        }
    }

    @Override // sg.bigo.ads.api.Ad
    @Nullable
    public final AdBid getBid() {
        sg.bigo.ads.ad.b.b bVar = this.f80094a;
        if (bVar != null) {
            return bVar.getBid();
        }
        return null;
    }

    @Override // sg.bigo.ads.api.Ad
    @Nullable
    public final String getCreativeId() {
        sg.bigo.ads.ad.b.b bVar = this.f80094a;
        return bVar != null ? bVar.getCreativeId() : "";
    }

    @Override // sg.bigo.ads.api.Ad
    @Nullable
    public final String getExtraInfo(String str) {
        sg.bigo.ads.ad.b.b bVar = this.f80094a;
        if (bVar != null) {
            return bVar.getExtraInfo(str);
        }
        return null;
    }

    @Override // sg.bigo.ads.api.BannerAd
    public final int getHeight() {
        sg.bigo.ads.ad.c.a.a aVar = this.f80098e;
        if (aVar != null) {
            return aVar.j();
        }
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [sg.bigo.ads.api.core.b] */
    @Override // sg.bigo.ads.api.InnerBannerAd
    public final sg.bigo.ads.api.core.b getInnerBannerAdData() {
        sg.bigo.ads.ad.b.b bVar = this.f80094a;
        if (bVar != null) {
            return bVar.f();
        }
        return null;
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final sg.bigo.ads.common.view.c getWatermarkView() {
        sg.bigo.ads.ad.b.b bVar = this.f80094a;
        if (bVar != null) {
            return bVar.C();
        }
        return null;
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final WebView getWebView() {
        return null;
    }

    @Override // sg.bigo.ads.api.BannerAd
    public final int getWidth() {
        sg.bigo.ads.ad.c.a.a aVar = this.f80098e;
        if (aVar != null) {
            return aVar.i();
        }
        return 0;
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final void handleInnerBannerAdResponse(@NonNull d.a<InnerBannerAd> aVar) {
        sg.bigo.ads.ad.b.b bVar = this.f80094a;
        if (bVar == null) {
            aVar.a(this, 1005, 1253, "native banner mNativeAd is null");
            return;
        }
        bVar.b(true);
        this.f80105l = aVar;
        if (this.f80097d == null) {
            this.f80097d = new b(aVar);
        }
        a(1, 2);
        a(2, 2);
        a(3, 2);
        sg.bigo.ads.ad.b.b bVar2 = this.f80094a;
        if (bVar2 != null) {
            bVar2.a((b.InterfaceC0962b) this);
            this.f80094a.a(this.f80097d.f80113b, 0);
        }
    }

    @Override // sg.bigo.ads.api.Ad
    public final boolean isExpired() {
        sg.bigo.ads.ad.b.b bVar = this.f80094a;
        if (bVar != null) {
            return bVar.isExpired();
        }
        return false;
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final boolean isInnerBannerAdFromAutoRefresh() {
        sg.bigo.ads.ad.b.b bVar = this.f80094a;
        if (bVar != null) {
            return ((sg.bigo.ads.core.a.a) bVar.f()).bl();
        }
        return false;
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final void markFromAutoFresh(sg.bigo.ads.api.core.b bVar) {
        if (bVar instanceof n) {
            ((n) bVar).bk();
        }
        sg.bigo.ads.ad.b.b bVar2 = this.f80094a;
        if (bVar2 != null) {
            bVar2.a();
        }
    }

    @Override // sg.bigo.ads.api.Ad, sg.bigo.ads.api.IconAds
    public final void setAdInteractionListener(AdInteractionListener adInteractionListener) {
        this.f80106m.f80110a = adInteractionListener;
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final int updateFormOpenTimes() {
        sg.bigo.ads.ad.b.b bVar = this.f80094a;
        if (bVar != null) {
            return bVar.z();
        }
        return 0;
    }
}
