package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.core.graphics.drawable.IconCompat;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.media.C3506ja;
import com.inmobi.media.EnumC3273a6;
import com.inmobi.media.ads.network.common.model.AdSet;
import com.inmobi.media.ads.network.common.model.MetaInfo;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.utils.Logger;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.UUID;
import org.json.JSONException;

/* JADX INFO: renamed from: com.inmobi.media.ja, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3506ja extends AbstractC3547l1 {
    public int F;
    public boolean G;
    public final Pj H;
    public sn.a I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3506ja(Context context, C3795v0 c3795v0, C3556la c3556la) {
        super(context, c3795v0, c3556la);
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(c3795v0, "adPlacement");
        this.H = new Pj();
        tn.p.j("ja", "TAG");
        long j10 = c3795v0.f28301a;
        a(context, c3795v0, c3556la);
        tn.p.k(ActivityChooserModel.ATTRIBUTE_ACTIVITY, "monetizationContext");
        super.K();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final bn.r a(com.inmobi.media.C3506ja r2, com.inmobi.media.EnumC3273a6 r3) {
        /*
            java.lang.String r0 = "it"
            tn.p.k(r3, r0)
            com.inmobi.ads.InMobiAdRequestStatus r0 = new com.inmobi.ads.InMobiAdRequestStatus
            com.inmobi.ads.InMobiAdRequestStatus$StatusCode r1 = com.inmobi.ads.InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE
            r0.<init>(r1)
            java.lang.String r1 = "errorCode"
            tn.p.k(r3, r1)
            int r3 = r3.ordinal()
            if (r3 == 0) goto L31
            r1 = 21
            if (r3 == r1) goto L2e
            switch(r3) {
                case 12: goto L2b;
                case 13: goto L28;
                case 14: goto L25;
                case 15: goto L22;
                case 16: goto L1f;
                default: goto L1e;
            }
        L1e:
            goto L31
        L1f:
            r3 = 2127(0x84f, float:2.98E-42)
            goto L33
        L22:
            r3 = 2126(0x84e, float:2.979E-42)
            goto L33
        L25:
            r3 = 2125(0x84d, float:2.978E-42)
            goto L33
        L28:
            r3 = 2124(0x84c, float:2.976E-42)
            goto L33
        L2b:
            r3 = 2123(0x84b, float:2.975E-42)
            goto L33
        L2e:
            r3 = 2229(0x8b5, float:3.123E-42)
            goto L33
        L31:
            r3 = 2122(0x84a, float:2.974E-42)
        L33:
            r1 = 1
            r2.a(r0, r1, r3)
            bn.r r2 = bn.r.f5635a
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3506ja.a(com.inmobi.media.ja, com.inmobi.media.a6):bn.r");
    }

    public static final bn.r a(C3506ja c3506ja, short s10) {
        Kb.a((byte) 2, "InMobiInterstitial", "RenderProcess of the WebView has crashed. Please create another adUnit");
        C3605n9 c3605n9 = c3506ja.f27513i;
        if (c3605n9 != null) {
            tn.p.j("ja", "TAG");
            c3605n9.b("ja", "RenderProcess of the WebView has crashed. Please create another adUnit");
        }
        c3506ja.a(s10);
        c3506ja.I = null;
        return bn.r.f5635a;
    }

    public static final void a(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci, C3506ja c3506ja, int i10) throws JSONException {
        gestureDetectorOnGestureListenerC3337ci.l();
        c3506ja.a(i10, false);
    }

    public static final void a(C3506ja c3506ja) throws JSONException {
        c3506ja.e();
        C3605n9 c3605n9 = c3506ja.f27513i;
        if (c3605n9 != null) {
            c3605n9.c("InMobiInterstitial", "Interstitial ad dismissed for placement id: " + c3506ja.f27516l);
        }
        if (c3506ja.m() != null) {
            AbstractC3423g1 abstractC3423g1M = c3506ja.m();
            if (abstractC3423g1M != null) {
                abstractC3423g1M.a();
                return;
            }
            return;
        }
        C3605n9 c3605n92 = c3506ja.f27513i;
        if (c3605n92 != null) {
            c3605n92.c("InMobiInterstitial", "Listener was garbage collected. Unable to give callback");
        }
    }

    public static final void a(final C3506ja c3506ja, final GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci, Context context) {
        final int iIndexOf = c3506ja.f27512h.indexOf(gestureDetectorOnGestureListenerC3337ci);
        ArrayList arrayList = c3506ja.f27512h;
        tn.p.k(arrayList, "list");
        if (iIndexOf < 0 || iIndexOf >= arrayList.size()) {
            return;
        }
        short sB = c3506ja.b(context);
        if (sB != 0) {
            c3506ja.e(iIndexOf);
        }
        c3506ja.b(iIndexOf, sB == 0);
        Handler handler = c3506ja.f27514j;
        if (handler != null) {
            handler.post(new Runnable() { // from class: n9.k8
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    C3506ja.a(gestureDetectorOnGestureListenerC3337ci, c3506ja, iIndexOf);
                }
            });
        }
    }

    public static final void a(C3506ja c3506ja, AbstractC3423g1 abstractC3423g1, Context context) {
        c3506ja.a(abstractC3423g1, context);
    }

    public static final void b(C3506ja c3506ja) {
        c3506ja.f(c3506ja.m());
    }

    public static final void c(C3506ja c3506ja) {
        c3506ja.g(c3506ja.m());
    }

    public static final bn.r d(C3506ja c3506ja) throws JSONException {
        c3506ja.Y();
        return bn.r.f5635a;
    }

    public static final void e(C3506ja c3506ja) {
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        c3506ja.N();
        if (c3506ja.f27523s) {
            AdSet adSetR = c3506ja.r();
            int size = (adSetR == null || (ads = adSetR.getAds()) == null) ? 0 : ads.size();
            for (int i10 = 1; i10 < size; i10++) {
                c3506ja.f27519o++;
                c3506ja.N();
            }
        }
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context context, Intent intent) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (intent == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(intent, com.safedk.android.utils.g.f53135i);
        context.startActivity(intent);
    }

    @Override // com.inmobi.media.AbstractC3547l1
    public final void C() {
        if (V()) {
            super.C();
        }
    }

    @Override // com.inmobi.media.AbstractC3547l1
    public final void F() {
        super.F();
        if (!tn.p.f(s(), CreativeInfo.f52467al) && !tn.p.f(s(), "htmlUrl")) {
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 57);
            return;
        }
        if (this.f27506b == 2) {
            C3605n9 c3605n9 = this.f27513i;
            if (c3605n9 != null) {
                c3605n9.a("InMobiInterstitial", "Interstitial ad successfully fetched for placement id: " + this.f27516l);
            }
            AbstractC3423g1 abstractC3423g1M = m();
            if (abstractC3423g1M != null) {
                C3605n9 c3605n92 = this.f27513i;
                if (c3605n92 != null) {
                    tn.p.j("ja", "TAG");
                    c3605n92.a("ja", "callback - onFetchSuccess");
                }
                c(abstractC3423g1M);
                return;
            }
            c((short) 2188);
            C3605n9 c3605n93 = this.f27513i;
            if (c3605n93 != null) {
                tn.p.j("ja", "TAG");
                c3605n93.b("ja", "listener is null");
            }
        }
    }

    @Override // com.inmobi.media.AbstractC3547l1
    public final void I() throws JSONException {
        super.I();
        this.F = 0;
    }

    @Override // com.inmobi.media.AbstractC3547l1
    public final void K() {
        tn.p.k(ActivityChooserModel.ATTRIBUTE_ACTIVITY, "monetizationContext");
        super.K();
    }

    public final boolean V() throws JSONException {
        if (E()) {
            C3605n9 c3605n9 = this.f27513i;
            if (c3605n9 != null) {
                tn.p.j("ja", "TAG");
                c3605n9.a("ja", "Some of the dependency libraries for Interstitial not found");
            }
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES), true, (short) 2007);
            return false;
        }
        AbstractC3423g1 abstractC3423g1M = m();
        if (abstractC3423g1M == null || h(abstractC3423g1M)) {
            return false;
        }
        if (4 == this.f27506b) {
            if (!z()) {
                C3605n9 c3605n92 = this.f27513i;
                if (c3605n92 != null) {
                    tn.p.j("ja", "TAG");
                    c3605n92.a("ja", "An ad is ready with the ad unit. Signaling ad load success ...");
                }
                AbstractC3423g1 abstractC3423g1M2 = m();
                if (abstractC3423g1M2 == null) {
                    C3605n9 c3605n93 = this.f27513i;
                    if (c3605n93 != null) {
                        c3605n93.b("InMobiInterstitial", "Listener was garbage collected. Unable to give callback");
                    }
                } else {
                    c(abstractC3423g1M2);
                    d(abstractC3423g1M2);
                }
                return false;
            }
            super.d();
            this.I = null;
        }
        D();
        return true;
    }

    public final int W() {
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        AdSet adSetR = r();
        if (adSetR != null) {
            Integer numValueOf = Integer.valueOf(adSetR.getPodSuccessCount());
            if (numValueOf.intValue() < 1) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                return numValueOf.intValue();
            }
        }
        AdSet adSetR2 = r();
        if (adSetR2 != null && (ads = adSetR2.getAds()) != null) {
            Integer numValueOf2 = Integer.valueOf(ads.size());
            Integer num = numValueOf2.intValue() > 0 ? numValueOf2 : null;
            if (num != null) {
                return num.intValue();
            }
        }
        return 1;
    }

    public final void X() throws JSONException {
        AdConfig adConfig;
        if (tn.p.f(this.f27516l.f28306f, "AB") && (adConfig = this.f27507c) != null && adConfig.getSkipNetCheckHB()) {
            C3605n9 c3605n9 = this.f27513i;
            if (c3605n9 != null) {
                tn.p.j("ja", "TAG");
                c3605n9.a("ja", "renderAd without internet check");
            }
            Y();
            return;
        }
        C3605n9 c3605n92 = this.f27513i;
        if (c3605n92 != null) {
            tn.p.j("ja", "TAG");
            c3605n92.a("ja", "renderAd");
        }
        a(new sn.a() { // from class: n9.l8
            @Override // sn.a
            public final Object invoke() {
                return C3506ja.d(this.f75482b);
            }
        }, new sn.l() { // from class: n9.m8
            @Override // sn.l
            public final Object invoke(Object obj) {
                return C3506ja.a(this.f75502b, (EnumC3273a6) obj);
            }
        });
    }

    public final void Y() throws JSONException {
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("ja", "TAG");
            c3605n9.a("ja", "renderAdPostInternetCheck");
        }
        super.I();
        this.F = 0;
        try {
            if (M()) {
                return;
            }
            C3696r1 c3696r1 = this.f27530z;
            c3696r1.getClass();
            c3696r1.f28019g = SystemClock.elapsedRealtime();
            String strS = s();
            if (!tn.p.f(strS, CreativeInfo.f52467al) && !tn.p.f(strS, "htmlUrl")) {
                C3605n9 c3605n92 = this.f27513i;
                if (c3605n92 != null) {
                    tn.p.j("ja", "TAG");
                    c3605n92.a("ja", "Cannot handle markupType: " + s());
                }
                b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2121);
                return;
            }
            Handler handler = this.f27514j;
            if (handler != null) {
                handler.post(new Runnable() { // from class: n9.n8
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3506ja.e(this.f75526b);
                    }
                });
            }
        } catch (IllegalStateException e10) {
            C3605n9 c3605n93 = this.f27513i;
            if (c3605n93 != null) {
                tn.p.j("ja", "TAG");
                c3605n93.a("ja", "Exception while loading ad.", e10);
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2134);
        }
    }

    public final void Z() {
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("ja", "TAG");
            c3605n9.d("ja", "AdUnit " + this + " state - READY");
        }
        c((byte) 4);
        C3696r1 c3696r1 = this.f27530z;
        c3696r1.getClass();
        c3696r1.f28021i = SystemClock.elapsedRealtime();
        P();
        S();
        this.H.f26139a = true;
        AbstractC3423g1 abstractC3423g1M = m();
        if (abstractC3423g1M != null) {
            C3605n9 c3605n92 = this.f27513i;
            if (c3605n92 != null) {
                tn.p.j("ja", "TAG");
                c3605n92.a("ja", "signaling Success");
            }
            d(abstractC3423g1M);
        }
    }

    @Override // com.inmobi.media.AbstractC3547l1, com.inmobi.media.InterfaceC3591mk
    public final void a(byte b10) throws JSONException {
        if (b10 != 1) {
            super.a(b10);
            return;
        }
        if (!this.f27523s) {
            super.a(b10);
            return;
        }
        if (this.f27506b != 2) {
            f();
            return;
        }
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("ja", "TAG");
            c3605n9.b("ja", "RenderView time out");
        }
        int iW = W();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= iW) {
                break;
            }
            if (!this.f27522r.contains(Integer.valueOf(i11))) {
                i10 = i11;
                break;
            }
            i11++;
        }
        a((GestureDetectorOnGestureListenerC3337ci) null, Integer.valueOf(i10), 2);
        f();
        b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2139);
    }

    @Override // com.inmobi.media.InterfaceC3820w0
    public final void a(int i10, GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci) {
        tn.p.k(gestureDetectorOnGestureListenerC3337ci, "renderView");
    }

    @Override // com.inmobi.media.AbstractC3547l1, com.inmobi.media.InterfaceC3820w0
    public final void a(int i10, final GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci, final Context context) {
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci2;
        tn.p.k(gestureDetectorOnGestureListenerC3337ci, "renderView");
        if (!this.f27523s) {
            C3605n9 c3605n9 = this.f27513i;
            if (c3605n9 != null) {
                tn.p.j("ja", "TAG");
                c3605n9.a("ja", "Cannot show an pod ad as isPod is not set.");
                return;
            }
            return;
        }
        if (!this.f27522r.contains(Integer.valueOf(i10)) || i10 <= this.f27512h.indexOf(gestureDetectorOnGestureListenerC3337ci) || i10 >= this.f27512h.size() || this.f27512h.get(i10) == null || !((gestureDetectorOnGestureListenerC3337ci2 = (GestureDetectorOnGestureListenerC3337ci) this.f27512h.get(i10)) == null || gestureDetectorOnGestureListenerC3337ci2.B0)) {
            C3605n9 c3605n92 = this.f27513i;
            if (c3605n92 != null) {
                tn.p.j("ja", "TAG");
                c3605n92.a("ja", "Cannot show an pod ad with invalid index passed");
            }
            b(this.f27512h.indexOf(gestureDetectorOnGestureListenerC3337ci), false);
            return;
        }
        if (context == null) {
            context = n();
        }
        super.a(i10, gestureDetectorOnGestureListenerC3337ci, context);
        Handler handler = this.f27514j;
        if (handler != null) {
            handler.post(new Runnable() { // from class: n9.i8
                @Override // java.lang.Runnable
                public final void run() {
                    C3506ja.a(this.f75427b, gestureDetectorOnGestureListenerC3337ci, context);
                }
            });
        }
    }

    @Override // com.inmobi.media.AbstractC3547l1, com.inmobi.media.InterfaceC3820w0
    public final void a(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci, Activity activity) {
        tn.p.k(gestureDetectorOnGestureListenerC3337ci, "renderView");
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "<get-TAG>(...)");
            c3605n9.c("l1", "closeCurrentPodAd " + this);
        }
        if (this.f27523s) {
            Integer num = (Integer) this.f27522r.higher(Integer.valueOf(this.f27512h.indexOf(gestureDetectorOnGestureListenerC3337ci)));
            if (num != null) {
                a(num.intValue(), gestureDetectorOnGestureListenerC3337ci, activity);
            } else {
                b();
            }
        }
    }

    @Override // com.inmobi.media.AbstractC3547l1
    public final void a(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci, short s10) throws JSONException {
        super.a(gestureDetectorOnGestureListenerC3337ci, s10);
        if (!this.f27523s) {
            e(s10);
            return;
        }
        int iIndexOf = this.f27512h.indexOf(gestureDetectorOnGestureListenerC3337ci);
        if (iIndexOf < W()) {
            a(gestureDetectorOnGestureListenerC3337ci, (Integer) null, s10 == 2137 ? 1 : 3);
            e(s10);
        }
        a(iIndexOf, true);
    }

    @Override // com.inmobi.media.AbstractC3547l1, com.inmobi.media.AbstractC3388ei
    public final void a(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci, boolean z10) {
        tn.p.k(gestureDetectorOnGestureListenerC3337ci, "renderView");
        super.a(gestureDetectorOnGestureListenerC3337ci, z10);
        byte b10 = this.f27506b;
        if (b10 == 4) {
            final short s10 = z10 ? (short) 2220 : (short) 2219;
            this.I = new sn.a() { // from class: n9.e8
                @Override // sn.a
                public final Object invoke() {
                    return C3506ja.a(this.f75350b, s10);
                }
            };
            return;
        }
        if (b10 != 6) {
            if (b10 == 7) {
                short s11 = z10 ? (short) 2224 : (short) 2223;
                Kb.a((byte) 2, "InMobiInterstitial", "RenderProcess of the WebView has crashed. Please create another adUnit");
                C3605n9 c3605n9 = this.f27513i;
                if (c3605n9 != null) {
                    tn.p.j("ja", "TAG");
                    c3605n9.b("ja", "RenderProcess of the WebView has crashed. Please create another adUnit");
                }
                gestureDetectorOnGestureListenerC3337ci.a(z10, s11);
                gestureDetectorOnGestureListenerC3337ci.x();
                f(m());
                return;
            }
            return;
        }
        short s12 = z10 ? (short) 2222 : (short) 2221;
        Kb.a((byte) 2, "InMobiInterstitial", "RenderProcess of the WebView has crashed. Please create another adUnit");
        C3605n9 c3605n92 = this.f27513i;
        if (c3605n92 != null) {
            tn.p.j("ja", "TAG");
            c3605n92.b("ja", "RenderProcess of the WebView has crashed. Please create another adUnit");
        }
        gestureDetectorOnGestureListenerC3337ci.x();
        if (this.F == 0) {
            a(s12);
        } else {
            gestureDetectorOnGestureListenerC3337ci.a(z10, s12);
            f(m());
        }
    }

    public final void a(AbstractC3423g1 abstractC3423g1, Context context) {
        if (abstractC3423g1 == null) {
            C3605n9 c3605n9 = this.f27513i;
            if (c3605n9 != null) {
                c3605n9.b("InMobiInterstitial", "Listener was garbage collected. Unable to give callback");
            }
            a((short) 2151);
            return;
        }
        sn.a aVar = this.I;
        if (aVar != null) {
            aVar.invoke();
            return;
        }
        byte b10 = this.f27506b;
        if (b10 == 8) {
            C3605n9 c3605n92 = this.f27513i;
            if (c3605n92 != null) {
                tn.p.j("ja", "TAG");
                c3605n92.b("ja", "unload has been called on this ad. Dont show. ");
            }
            tn.p.j("ja", "TAG");
            Kb.a((byte) 2, "ja", "Failed to show Ad as creative has called unload() on the Ad");
            a((short) 2239);
            return;
        }
        if (b10 != 4) {
            Kb.a((byte) 2, "InMobiInterstitial", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
            C3605n9 c3605n93 = this.f27513i;
            if (c3605n93 != null) {
                tn.p.j("ja", "TAG");
                c3605n93.b("ja", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
            }
            tn.p.j("ja", "TAG");
            Kb.a((byte) 1, "ja", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
            a((short) 2152);
            return;
        }
        e(abstractC3423g1);
        c((byte) 6);
        if (z()) {
            a((short) 2153);
            c((byte) 0);
            GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ciI = i();
            if (gestureDetectorOnGestureListenerC3337ciI != null) {
                gestureDetectorOnGestureListenerC3337ciI.b();
                return;
            }
            return;
        }
        if (context == null) {
            context = n();
        }
        short sB = b(context);
        if (sB != 0) {
            a(sB);
        } else {
            abstractC3423g1.c();
        }
    }

    public final void a(final C3556la c3556la, final Activity activity) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            a((AbstractC3423g1) c3556la, (Context) activity);
        } else {
            ((Wb) AbstractC3627o6.f27756e.getValue()).f26536a.post(new Runnable() { // from class: n9.f8
                @Override // java.lang.Runnable
                public final void run() {
                    C3506ja.a(this.f75367b, c3556la, activity);
                }
            });
        }
    }

    @Override // com.inmobi.media.AbstractC3547l1
    public final void a(byte[] bArr) {
        if (V()) {
            super.a(bArr);
        }
    }

    @Override // com.inmobi.media.AbstractC3547l1, com.inmobi.media.InterfaceC3820w0
    public final boolean a(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci) {
        tn.p.k(gestureDetectorOnGestureListenerC3337ci, "renderView");
        if (this.f27523s) {
            if (((Integer) this.f27522r.higher(Integer.valueOf(this.f27512h.indexOf(gestureDetectorOnGestureListenerC3337ci)))) != null) {
                return true;
            }
        }
        return false;
    }

    public final void a0() {
        MetaInfo metaInfo;
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "<get-TAG>(...)");
            c3605n9.c("l1", "submitAdNotReady " + this);
        }
        Pj pj2 = this.H;
        C3696r1 c3696r1 = this.f27530z;
        com.inmobi.media.ads.network.common.model.Ad adP = p();
        String creativeType = (adP == null || (metaInfo = adP.getMetaInfo()) == null) ? null : metaInfo.getCreativeType();
        AdSet adSetR = r();
        Boolean boolValueOf = adSetR != null ? Boolean.valueOf(adSetR.isRewarded()) : null;
        String strS = s();
        byte b10 = this.f27506b;
        com.inmobi.media.ads.network.common.model.Ad adP2 = p();
        String impressionId = adP2 != null ? adP2.getImpressionId() : null;
        C3745t0 c3745t0 = new C3745t0(c3696r1, creativeType, boolValueOf, strS, b10, impressionId);
        pj2.getClass();
        tn.p.k(c3745t0, "adNotReadyMetadata");
        HashMap map = new HashMap();
        long j10 = c3696r1.f28015c;
        p000do.l0 l0Var = AbstractC3492il.f27361a;
        map.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(b10 == 0 ? (short) 2204 : b10 == 1 ? (short) 2282 : b10 == 2 ? (short) 2283 : b10 == 3 ? (short) 2284 : b10 == 6 ? (short) 2285 : b10 == 7 ? (short) 2209 : b10 == 8 ? (short) 2242 : (short) 2210));
        map.put("markupType", strS);
        if (creativeType != null) {
            map.put("creativeType", creativeType);
        }
        if (impressionId != null) {
            map.put("impressionId", impressionId);
        }
        if (boolValueOf != null) {
            map.put("isRewarded", boolValueOf);
        }
        String strA = c3696r1.a();
        if (strA.length() > 0) {
            map.put("metadataBlob", strA);
        }
        map.put("adType", c3696r1.f28013a.l());
        map.put("networkType", C3850x5.m());
        map.put("plId", Long.valueOf(c3696r1.f28013a.f27516l.f28301a));
        map.put("isAdLoaded", Boolean.valueOf(pj2.f26139a));
        String str = c3696r1.f28013a.f27516l.f28306f;
        if (str != null) {
            map.put("plType", str);
        }
        Wj wj2 = Wj.f26549a;
        Wj.b("AdNotReady", map, EnumC3287ak.f26805a);
    }

    public final short b(Context context) {
        try {
            C3605n9 c3605n9 = this.f27513i;
            if (c3605n9 != null) {
                tn.p.j("ja", "TAG");
                c3605n9.a("ja", ">>> Starting InMobiAdActivity to display interstitial ad ...");
            }
            GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ciI = i();
            if (gestureDetectorOnGestureListenerC3337ciI == null) {
                return (short) 2155;
            }
            if (tn.p.f("unknown", gestureDetectorOnGestureListenerC3337ciI.getMarkupType())) {
                return (short) 2156;
            }
            SparseArray sparseArray = InMobiAdActivity.f25113k;
            tn.p.k(gestureDetectorOnGestureListenerC3337ciI, "container");
            int iHashCode = gestureDetectorOnGestureListenerC3337ciI.hashCode();
            InMobiAdActivity.f25113k.put(iHashCode, gestureDetectorOnGestureListenerC3337ciI);
            Intent intent = new Intent(context, (Class<?>) InMobiAdActivity.class);
            C3605n9 c3605n92 = this.f27513i;
            if (c3605n92 != null) {
                String string = UUID.randomUUID().toString();
                tn.p.j(string, "toString(...)");
                HashMap map = P8.f26116a;
                String string2 = string.toString();
                tn.p.k(string2, "key");
                tn.p.k(c3605n92, IconCompat.EXTRA_OBJ);
                P8.f26116a.put(string2, new WeakReference(c3605n92));
                intent.putExtra("loggerCacheKey", string);
            }
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_INDEX", iHashCode);
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_TYPE", 102);
            String strS = s();
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_TYPE", tn.p.f(strS, CreativeInfo.f52467al) ? 200 : tn.p.f(strS, "htmlUrl") ? 202 : 201);
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_IS_FULL_SCREEN", true);
            if (context == null) {
                return (short) 2157;
            }
            if (this.f27523s) {
                if (this.f27521q == -1) {
                    this.f27521q = System.currentTimeMillis();
                }
                if (this.f27519o > 0) {
                    intent.setFlags(603979776);
                }
            }
            Context context2 = Ji.f25747a;
            tn.p.k(context, GAMConfig.KEY_CONTEXT);
            tn.p.k(intent, "intent");
            if (!(context instanceof Activity)) {
                intent.setFlags(268435456);
            }
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
            return (short) 0;
        } catch (Exception e10) {
            C3605n9 c3605n93 = this.f27513i;
            if (c3605n93 != null) {
                c3605n93.b("InMobiInterstitial", "Cannot show ad; SDK encountered an unexpected error");
            }
            bn.g gVar = P9.f26117a;
            AbstractC3481i9.a(e10);
            return (short) 2154;
        }
    }

    @Override // com.inmobi.media.InterfaceC3820w0
    public final void b() {
        if (this.f27523s) {
            C3605n9 c3605n9 = this.f27513i;
            if (c3605n9 != null) {
                tn.p.j("ja", "TAG");
                c3605n9.a("ja", "Closing the ad as closeAll is called");
            }
            Handler handler = this.f27514j;
            if (handler != null) {
                handler.post(new Runnable() { // from class: n9.j8
                    @Override // java.lang.Runnable
                    public final void run() throws JSONException {
                        C3506ja.a(this.f75445b);
                    }
                });
            }
        }
    }

    public final void b0() {
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            c3605n9.a("InMobiInterstitial", "Successfully loaded Interstitial ad markup in the WebView for placement id: " + this.f27516l);
        }
        h();
        Z();
    }

    @Override // com.inmobi.media.AbstractC3547l1
    public final void d() throws JSONException {
        super.d();
        this.I = null;
    }

    @Override // com.inmobi.media.AbstractC3388ei
    public final synchronized void e(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci) {
        tn.p.k(gestureDetectorOnGestureListenerC3337ci, "renderView");
        super.e(gestureDetectorOnGestureListenerC3337ci);
        Handler handler = this.f27514j;
        if (handler != null) {
            handler.post(new Runnable() { // from class: n9.h8
                @Override // java.lang.Runnable
                public final void run() {
                    C3506ja.b(this.f75402b);
                }
            });
        }
    }

    public final void e(short s10) {
        if (this.f27506b == 2) {
            C3605n9 c3605n9 = this.f27513i;
            if (c3605n9 != null) {
                c3605n9.a("InMobiInterstitial", "Failed to load the Interstitial markup in the WebView for placement id: " + this.f27516l);
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, s10);
        }
    }

    @Override // com.inmobi.media.AbstractC3388ei
    public final synchronized void f(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci) {
        tn.p.k(gestureDetectorOnGestureListenerC3337ci, "renderView");
        super.f(gestureDetectorOnGestureListenerC3337ci);
        Handler handler = this.f27514j;
        if (handler != null) {
            handler.post(new Runnable() { // from class: n9.g8
                @Override // java.lang.Runnable
                public final void run() {
                    C3506ja.c(this.f75388b);
                }
            });
        }
    }

    public final void f(AbstractC3423g1 abstractC3423g1) {
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("ja", "TAG");
            c3605n9.c("ja", "handleAdScreenDismissed " + ((int) this.f27506b));
        }
        byte b10 = this.f27506b;
        if (b10 == 7) {
            int i10 = this.F - 1;
            this.F = i10;
            if (i10 == 1) {
                c((byte) 6);
                C3605n9 c3605n92 = this.f27513i;
                if (c3605n92 != null) {
                    tn.p.j("ja", "TAG");
                    c3605n92.d("ja", "AdUnit " + this + " state - RENDERED");
                    return;
                }
                return;
            }
            return;
        }
        if (b10 == 6 || b10 == 8) {
            this.F--;
            C3605n9 c3605n93 = this.f27513i;
            if (c3605n93 != null) {
                c3605n93.a("InMobiInterstitial", "Interstitial ad dismissed for placement id: " + this.f27516l);
            }
            if (abstractC3423g1 != null) {
                abstractC3423g1.a();
                return;
            }
            C3605n9 c3605n94 = this.f27513i;
            if (c3605n94 != null) {
                c3605n94.c("InMobiInterstitial", "Listener was garbage collected. Unable to give callback");
            }
        }
    }

    public final void g(AbstractC3423g1 abstractC3423g1) {
        byte b10 = this.f27506b;
        if (b10 != 6) {
            if (b10 == 7) {
                this.F++;
                return;
            }
            return;
        }
        int i10 = this.F + 1;
        this.F = i10;
        if (i10 != 1) {
            c((byte) 7);
            return;
        }
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            c3605n9.a("InMobiInterstitial", "Successfully displayed Interstitial for placement id: " + this.f27516l);
        }
        if (abstractC3423g1 != null) {
            b((byte) 4);
            a(abstractC3423g1);
        }
    }

    public final boolean h(AbstractC3423g1 abstractC3423g1) {
        byte b10 = this.f27506b;
        if (b10 == 1) {
            C3605n9 c3605n9 = this.f27513i;
            if (c3605n9 != null) {
                c3605n9.b("InMobiInterstitial", "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: " + this.f27516l);
            }
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD), false, (short) 2008);
            return true;
        }
        if (b10 == 7 || b10 == 6) {
            C3605n9 c3605n92 = this.f27513i;
            if (c3605n92 != null) {
                c3605n92.b("InMobiInterstitial", "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: " + this.f27516l);
            }
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE), false, (short) 2010);
            return true;
        }
        if (b10 != 2) {
            return false;
        }
        if (tn.p.f(CreativeInfo.f52467al, s()) || tn.p.f("htmlUrl", s())) {
            C3605n9 c3605n93 = this.f27513i;
            if (c3605n93 != null) {
                c3605n93.b("InMobiInterstitial", "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: " + this.f27516l);
            }
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD), false, (short) 2011);
        } else {
            c(abstractC3423g1);
        }
        return true;
    }

    @Override // com.inmobi.media.AbstractC3547l1
    public final String l() {
        return ImpressionLog.f51753w;
    }

    @Override // com.inmobi.media.AbstractC3547l1
    public final void o(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci) {
        super.o(gestureDetectorOnGestureListenerC3337ci);
        if (!this.f27523s) {
            if (this.f27506b == 2) {
                b((byte) 1);
                b0();
                return;
            }
            return;
        }
        int iIndexOf = this.f27512h.indexOf(gestureDetectorOnGestureListenerC3337ci);
        if (iIndexOf < this.f27520p) {
            C3605n9 c3605n9 = this.f27513i;
            if (c3605n9 != null) {
                tn.p.j("ja", "TAG");
                c3605n9.a("ja", "Ignoring loaded ad with index " + iIndexOf + " as current rendering index is " + this.f27520p);
                return;
            }
            return;
        }
        this.f27522r.add(Integer.valueOf(iIndexOf));
        if (this.f27506b == 2) {
            int iW = W();
            for (int i10 = 0; i10 < iW && i10 < this.f27512h.size(); i10++) {
                if (this.f27512h.get(i10) == null || !this.f27522r.contains(Integer.valueOf(i10))) {
                    return;
                }
            }
            C3605n9 c3605n92 = this.f27513i;
            if (c3605n92 != null) {
                tn.p.j("ja", "TAG");
                c3605n92.a("ja", "Providing success based on index " + iIndexOf);
            }
            b((byte) 1);
            this.f27520p = 0;
            b0();
        }
    }

    @Override // com.inmobi.media.AbstractC3547l1
    public final void p(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci) {
        tn.p.k(gestureDetectorOnGestureListenerC3337ci, "renderView");
        if (!this.f27523s || !a(gestureDetectorOnGestureListenerC3337ci)) {
            U();
        }
        super.p(gestureDetectorOnGestureListenerC3337ci);
    }

    @Override // com.inmobi.media.AbstractC3547l1
    public final GestureDetectorOnGestureListenerC3337ci q() {
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci = (this.f27512h.size() <= 0 || this.f27520p >= this.f27512h.size()) ? null : (GestureDetectorOnGestureListenerC3337ci) this.f27512h.get(this.f27520p);
        if (this.G && gestureDetectorOnGestureListenerC3337ci != null) {
            gestureDetectorOnGestureListenerC3337ci.k();
        }
        return gestureDetectorOnGestureListenerC3337ci;
    }

    @Override // com.inmobi.media.AbstractC3547l1
    public final byte t() {
        return (byte) 1;
    }
}
