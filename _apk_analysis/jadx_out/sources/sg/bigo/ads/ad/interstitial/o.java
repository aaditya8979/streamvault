package sg.bigo.ads.ad.interstitial;

import android.app.Activity;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.api.InterstitialAd;
import sg.bigo.ads.api.b.a;
import sg.bigo.ads.api.b.d;

/* JADX INFO: loaded from: classes10.dex */
public class o extends k<sg.bigo.ads.api.core.h> {

    @NonNull
    public final sg.bigo.ads.ad.banner.c<o> B;
    public sg.bigo.ads.ad.banner.h C;
    public sg.bigo.ads.ad.interstitial.j.a D;
    private final boolean E;
    private boolean F;
    private final AtomicBoolean G;

    public o(@NonNull sg.bigo.ads.api.core.f fVar) {
        sg.bigo.ads.api.a.m mVarE;
        super(fVar);
        try {
            sg.bigo.ads.api.core.h hVar = (sg.bigo.ads.api.core.h) f();
            sg.bigo.ads.ad.interstitial.j.a aVar = null;
            if (hVar != null && (mVarE = hVar.e()) != null) {
                n nVar = new n();
                nVar.f81244a = mVarE.a("video_play_page.ad_component_layout");
                nVar.f81245b = mVarE.a("video_play_page.force_staying_time");
                nVar.f81246c = mVarE.a("video_play_page.close_button_style");
                nVar.f81247d = mVarE.a("video_play_page.x_area");
                nVar.f81248e = mVarE.a("video_play_page.duration");
                int i10 = nVar.f81244a;
                aVar = i10 != 1 ? i10 != 2 ? new sg.bigo.ads.ad.interstitial.j.a(this, this.f80021b.f81864e, nVar) : new sg.bigo.ads.ad.interstitial.j.c(this, this.f80021b.f81864e, nVar) : new sg.bigo.ads.ad.interstitial.j.b(this, this.f80021b.f81864e, nVar);
            }
            this.D = aVar;
            this.G = new AtomicBoolean(false);
            boolean zAv = hVar.av();
            this.E = zAv;
            sg.bigo.ads.ad.banner.c<o> cVar = new sg.bigo.ads.ad.banner.c<>(this.f80021b.f81864e, fVar, this, hVar, E(), new sg.bigo.ads.ad.banner.h() { // from class: sg.bigo.ads.ad.interstitial.o.1
                @Override // sg.bigo.ads.ad.banner.h
                public final void a() {
                    if (o.this.C != null) {
                        o.this.C.a();
                    }
                }

                @Override // sg.bigo.ads.ad.banner.h
                public final void a(String str) {
                    sg.bigo.ads.common.t.a.a(0, 3, "InterstitialBannerAd", "InterstitialBannerAd onCustomJsOmImpression, adSessionId=".concat(String.valueOf(str)));
                    o.this.G();
                    sg.bigo.ads.core.d.b.a(o.this.f80021b.f81860a, (String) o.this.b("show_proportion", ""), o.this.j(), ((Integer) o.this.b("render_style", 0)).intValue());
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
                /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
                @Override // sg.bigo.ads.ad.banner.h
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void a(sg.bigo.ads.common.i r6, sg.bigo.ads.api.core.d r7) {
                    /*
                        r5 = this;
                        r0 = 1
                        r1 = 0
                        if (r6 == 0) goto L30
                        sg.bigo.ads.ad.interstitial.o r2 = sg.bigo.ads.ad.interstitial.o.this
                        android.graphics.Rect r2 = r2.A
                        android.graphics.Point r3 = r6.f82223a
                        if (r3 == 0) goto L2b
                        android.graphics.Point r4 = r6.f82224b
                        if (r4 == 0) goto L2b
                        if (r2 != 0) goto L13
                        goto L2b
                    L13:
                        int r4 = r3.x
                        int r3 = r3.y
                        boolean r3 = r2.contains(r4, r3)
                        if (r3 == 0) goto L2b
                        android.graphics.Point r3 = r6.f82224b
                        int r4 = r3.x
                        int r3 = r3.y
                        boolean r2 = r2.contains(r4, r3)
                        if (r2 == 0) goto L2b
                        r2 = r0
                        goto L2c
                    L2b:
                        r2 = r1
                    L2c:
                        if (r2 == 0) goto L30
                        r1 = 33
                    L30:
                        sg.bigo.ads.ad.interstitial.o r2 = sg.bigo.ads.ad.interstitial.o.this
                        r2.a(r6, r1, r0, r7)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.ad.interstitial.o.AnonymousClass1.a(sg.bigo.ads.common.i, sg.bigo.ads.api.core.d):void");
                }

                @Override // sg.bigo.ads.ad.banner.h
                public final void b() {
                    o.d(o.this);
                    if (o.this.p()) {
                        o.this.G();
                    }
                }
            }, zAv);
            this.B = cVar;
            cVar.f79943c = 0;
            cVar.f79958r = this.D;
        } catch (Exception unused) {
            throw new IllegalArgumentException("Error data type for ad!");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G() {
        if (this.G.compareAndSet(false, true)) {
            sg.bigo.ads.common.t.a.a(0, 3, "InterstitialBannerAd", "InterstitialBannerAd report impression AdEvent");
            super.n();
        }
    }

    public static /* synthetic */ boolean d(o oVar) {
        oVar.F = true;
        return true;
    }

    @Override // sg.bigo.ads.ad.interstitial.k
    public final boolean B() {
        return false;
    }

    @Override // sg.bigo.ads.ad.interstitial.k
    public Class<? extends sg.bigo.ads.controller.e.b<?>> D() {
        return m.class;
    }

    public sg.bigo.ads.core.mraid.n E() {
        return sg.bigo.ads.core.mraid.n.INTERSTITIAL;
    }

    public final n F() {
        sg.bigo.ads.ad.interstitial.j.a aVar = this.D;
        if (aVar != null) {
            return aVar.f81089c;
        }
        return null;
    }

    public final void a(AdCountDownButton adCountDownButton, View view) {
        sg.bigo.ads.ad.interstitial.j.a aVar = this.D;
        if (aVar == null || adCountDownButton == null) {
            return;
        }
        int i10 = aVar.f81089c.f81246c;
        adCountDownButton.setCloseImageResource(i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? R.drawable.bigo_ad_ic_close : R.drawable.bigo_ad_ic_close5 : R.drawable.bigo_ad_ic_close4 : R.drawable.bigo_ad_ic_close3 : R.drawable.bigo_ad_ic_close2);
        adCountDownButton.setShowCloseButtonInCountdown(true);
        adCountDownButton.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.j.a.1

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ AdCountDownButton f81090a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ View f81091b;

            public AnonymousClass1(AdCountDownButton adCountDownButton2, View view2) {
                adCountDownButton = adCountDownButton2;
                view = view2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a aVar2 = a.this;
                int i11 = aVar2.f81089c.f81247d;
                int i12 = 1;
                if (i11 != 1) {
                    i12 = 2;
                    if (i11 != 2) {
                        if (i11 != 3) {
                            return;
                        }
                        AdCountDownButton adCountDownButton2 = adCountDownButton;
                        View view2 = view;
                        Rect rect = new Rect();
                        adCountDownButton2.getHitRect(rect);
                        rect.inset((-rect.width()) / 2, (-rect.height()) / 2);
                        View closeView = adCountDownButton2.getCloseView();
                        if (view2 == null || closeView == null) {
                            return;
                        }
                        view2.setOnTouchListener(new View.OnTouchListener() { // from class: sg.bigo.ads.ad.interstitial.j.a.2

                            /* JADX INFO: renamed from: a */
                            public final /* synthetic */ Rect f81093a;

                            /* JADX INFO: renamed from: b */
                            public final /* synthetic */ View f81094b;

                            public AnonymousClass2(Rect rect2, View closeView2) {
                                rect = rect2;
                                view = closeView2;
                            }

                            @Override // android.view.View.OnTouchListener
                            public final boolean onTouch(View view3, MotionEvent motionEvent) {
                                if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                                    return false;
                                }
                                if (motionEvent.getActionMasked() != 0) {
                                    return true;
                                }
                                view.onTouchEvent(motionEvent);
                                return true;
                            }
                        });
                        return;
                    }
                }
                adCountDownButton.setBtnClickArea(i12);
            }
        });
    }

    @Override // sg.bigo.ads.ad.interstitial.k
    public final void b(@NonNull Activity activity) {
        super.b(activity);
        sg.bigo.ads.ad.banner.c<o> cVar = this.B;
        if (cVar != null) {
            cVar.f79956p = new WeakReference<>(activity);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.k
    public void b(@NonNull d.a<InterstitialAd> aVar) {
        sg.bigo.ads.api.core.b bVar = this.f80021b.f81860a;
        if (!(bVar instanceof sg.bigo.ads.api.core.h)) {
            aVar.a(this, 1021, 1250, "InterstitialBannerAd with invalid AdData class type.");
            return;
        }
        sg.bigo.ads.api.core.h hVar = (sg.bigo.ads.api.core.h) bVar;
        if (hVar.aw() == null || TextUtils.isEmpty(hVar.aw().c())) {
            aVar.a(this, 1022, 1252, "Empty content.");
        } else {
            this.B.a(new a.InterfaceC1007a() { // from class: sg.bigo.ads.ad.interstitial.o.2
                @Override // sg.bigo.ads.api.b.a.InterfaceC1007a
                public final void a(sg.bigo.ads.api.core.c cVar) {
                }

                @Override // sg.bigo.ads.api.b.a.InterfaceC1007a
                public final void b() {
                }
            });
            aVar.a(this);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.k, sg.bigo.ads.ad.d, sg.bigo.ads.ad.c
    public void destroyInMainThread() {
        this.C = null;
        super.destroyInMainThread();
        this.B.a();
    }

    @Override // sg.bigo.ads.api.Ad
    @Nullable
    public String getCreativeId() {
        sg.bigo.ads.ad.banner.c<o> cVar = this.B;
        return cVar != null ? cVar.d() : "";
    }

    @Override // sg.bigo.ads.ad.c
    public final void h() {
        super.h();
        sg.bigo.ads.ad.banner.c<o> cVar = this.B;
        if (cVar != null) {
            cVar.f();
        }
    }

    @Override // sg.bigo.ads.ad.c
    public final void n() {
        if (!this.E || this.F) {
            G();
        } else {
            sg.bigo.ads.common.t.a.a(0, 3, "InterstitialBannerAd", "BannerAd report impression AdEvent depend on om callback.");
        }
    }

    @Override // sg.bigo.ads.ad.c
    public final void o() {
        super.o();
        G();
    }
}
