package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import androidx.appcompat.widget.ActivityChooserModel;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.C3269a2;
import com.inmobi.media.EnumC3273a6;
import com.inmobi.media.ads.network.common.model.AdSet;
import com.inmobi.media.core.config.models.AdConfig;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;

/* JADX INFO: renamed from: com.inmobi.media.a2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C3269a2 extends AbstractC3547l1 implements Application.ActivityLifecycleCallbacks {
    public final String F;
    public final String G;
    public boolean H;
    public int I;
    public final C3295b2 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3269a2(Context context, C3795v0 c3795v0, Dk dk2) {
        super(context, c3795v0, dk2);
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(c3795v0, "placement");
        String simpleName = C3269a2.class.getSimpleName();
        this.F = simpleName;
        this.G = "InMobi";
        this.J = new C3295b2();
        tn.p.j(simpleName, "TAG");
        long j10 = c3795v0.f28301a;
        a(context, c3795v0, dk2);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final bn.r a(com.inmobi.media.C3269a2 r4, com.inmobi.media.EnumC3273a6 r5) {
        /*
            java.lang.String r0 = "it"
            tn.p.k(r5, r0)
            com.inmobi.media.n9 r0 = r4.f27513i
            if (r0 == 0) goto L24
            java.lang.String r1 = r4.F
            java.lang.String r2 = "TAG"
            tn.p.j(r1, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "loadWithRetry error - "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r0.b(r1, r2)
        L24:
            com.inmobi.ads.InMobiAdRequestStatus r0 = new com.inmobi.ads.InMobiAdRequestStatus
            com.inmobi.ads.InMobiAdRequestStatus$StatusCode r1 = com.inmobi.ads.InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE
            r0.<init>(r1)
            r1 = 1
            java.lang.String r2 = "errorCode"
            tn.p.k(r5, r2)
            int r5 = r5.ordinal()
            if (r5 == 0) goto L51
            r2 = 21
            if (r5 == r2) goto L4e
            switch(r5) {
                case 12: goto L4b;
                case 13: goto L48;
                case 14: goto L45;
                case 15: goto L42;
                case 16: goto L3f;
                default: goto L3e;
            }
        L3e:
            goto L51
        L3f:
            r5 = 2127(0x84f, float:2.98E-42)
            goto L53
        L42:
            r5 = 2126(0x84e, float:2.979E-42)
            goto L53
        L45:
            r5 = 2125(0x84d, float:2.978E-42)
            goto L53
        L48:
            r5 = 2124(0x84c, float:2.976E-42)
            goto L53
        L4b:
            r5 = 2123(0x84b, float:2.975E-42)
            goto L53
        L4e:
            r5 = 2229(0x8b5, float:3.123E-42)
            goto L53
        L51:
            r5 = 2122(0x84a, float:2.974E-42)
        L53:
            r4.a(r0, r1, r5)
            bn.r r4 = bn.r.f5635a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3269a2.a(com.inmobi.media.a2, com.inmobi.media.a6):bn.r");
    }

    public static final void a(C3269a2 c3269a2) {
        C3605n9 c3605n9 = c3269a2.f27513i;
        if (c3605n9 != null) {
            String str = c3269a2.F;
            tn.p.j(str, "TAG");
            c3605n9.a(str, "start loading html ad");
        }
        c3269a2.N();
    }

    public static final void a(C3269a2 c3269a2, GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci, int i10) {
        int iIndexOf = c3269a2.f27512h.indexOf(gestureDetectorOnGestureListenerC3337ci);
        try {
            AbstractC3423g1 abstractC3423g1M = c3269a2.m();
            C3605n9 c3605n9 = c3269a2.f27513i;
            if (c3605n9 != null) {
                String str = c3269a2.F;
                tn.p.j(str, "TAG");
                c3605n9.c(str, "callback onShowNextPodAd");
            }
            if (abstractC3423g1M != null) {
                abstractC3423g1M.a(i10, iIndexOf, gestureDetectorOnGestureListenerC3337ci);
            }
        } catch (Exception unused) {
            c3269a2.b(iIndexOf, false);
            c3269a2.e(iIndexOf);
        }
    }

    public static final void b(C3269a2 c3269a2) {
        try {
            if (c3269a2.f27506b == 7) {
                int i10 = c3269a2.I - 1;
                c3269a2.I = i10;
                if (i10 == 0) {
                    c3269a2.c((byte) 6);
                    AbstractC3423g1 abstractC3423g1M = c3269a2.m();
                    if (abstractC3423g1M != null) {
                        abstractC3423g1M.a();
                    }
                }
            }
        } catch (Exception e10) {
            C3605n9 c3605n9 = c3269a2.f27513i;
            if (c3605n9 != null) {
                String str = c3269a2.F;
                tn.p.j(str, "TAG");
                c3605n9.b(str, "BannerAdUnit.onAdScreenDismissed threw unexpected error: " + e10.getMessage());
            }
        }
    }

    public static final void c(C3269a2 c3269a2) {
        try {
            byte b10 = c3269a2.f27506b;
            if (b10 != 6) {
                if (b10 == 7) {
                    c3269a2.I++;
                    return;
                }
                return;
            }
            c3269a2.I++;
            c3269a2.c((byte) 7);
            C3605n9 c3605n9 = c3269a2.f27513i;
            if (c3605n9 != null) {
                String str = c3269a2.F;
                tn.p.j(str, "TAG");
                c3605n9.d(str, "AdUnit " + c3269a2 + " state - ACTIVE");
            }
            C3605n9 c3605n92 = c3269a2.f27513i;
            if (c3605n92 != null) {
                c3605n92.c(c3269a2.G, "Successfully displayed banner ad for placement Id : " + c3269a2.f27516l);
            }
            AbstractC3423g1 abstractC3423g1M = c3269a2.m();
            if (abstractC3423g1M != null) {
                c3269a2.a(abstractC3423g1M);
            }
        } catch (Exception e10) {
            C3605n9 c3605n93 = c3269a2.f27513i;
            if (c3605n93 != null) {
                String str2 = c3269a2.F;
                tn.p.j(str2, "TAG");
                c3605n93.b(str2, "BannerAdUnit.onAdScreenDisplayed threw unexpected error: " + e10.getMessage());
            }
        }
    }

    public static final void d(C3269a2 c3269a2) {
        try {
            if (c3269a2.f27506b == 4) {
                c3269a2.c((byte) 6);
                C3605n9 c3605n9 = c3269a2.f27513i;
                if (c3605n9 != null) {
                    String str = c3269a2.F;
                    tn.p.j(str, "TAG");
                    c3605n9.d(str, "AdUnit " + c3269a2 + " state - RENDERED");
                }
            }
        } catch (Exception e10) {
            C3605n9 c3605n92 = c3269a2.f27513i;
            if (c3605n92 != null) {
                String str2 = c3269a2.F;
                tn.p.j(str2, "TAG");
                c3605n92.b(str2, "BannerAdUnit.onRenderViewVisible threw unexpected error: " + e10.getMessage());
            }
        }
    }

    public static final bn.r e(C3269a2 c3269a2) {
        C3605n9 c3605n9 = c3269a2.f27513i;
        if (c3605n9 != null) {
            String str = c3269a2.F;
            tn.p.j(str, "TAG");
            c3605n9.a(str, "loadWithRetry success");
        }
        c3269a2.a0();
        return bn.r.f5635a;
    }

    public static final void f(C3269a2 c3269a2) {
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        if (c3269a2.f27523s) {
            c3269a2.f27521q = System.currentTimeMillis();
            AdSet adSetR = c3269a2.r();
            if (adSetR != null && (ads = adSetR.getAds()) != null) {
                int i10 = 0;
                for (Object obj : ads) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        cn.w.w();
                    }
                    c3269a2.f27522r.add(Integer.valueOf(i10));
                    i10 = i11;
                }
            }
        }
        c3269a2.N();
    }

    @Override // com.inmobi.media.AbstractC3547l1
    public final void C() {
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            String str = this.F;
            tn.p.j(str, "TAG");
            c3605n9.a(str, "load " + this);
        }
        if (V()) {
            super.C();
        }
    }

    @Override // com.inmobi.media.AbstractC3547l1
    public final boolean E() {
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 == null) {
            return false;
        }
        String str = this.F;
        tn.p.j(str, "TAG");
        c3605n9.c(str, "missingPrerequisitesForAd " + this);
        return false;
    }

    @Override // com.inmobi.media.AbstractC3547l1
    public final void F() {
        AbstractC3423g1 abstractC3423g1M;
        super.F();
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            c3605n9.c(this.G, "Banner ad fetch successful for placement id: " + this.f27516l);
        }
        if (!tn.p.f(s(), CreativeInfo.f52467al) && !tn.p.f(s(), "htmlUrl")) {
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 57);
        }
        if (this.f27506b != 2 || (abstractC3423g1M = m()) == null) {
            return;
        }
        c(abstractC3423g1M);
    }

    public boolean V() {
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            String str = this.F;
            tn.p.j(str, "TAG");
            c3605n9.c(str, "canProceedToLoad " + this);
        }
        E();
        byte b10 = this.f27506b;
        if (1 == b10 || 2 == b10) {
            Kb.a((byte) 1, this.G, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad");
            C3605n9 c3605n92 = this.f27513i;
            if (c3605n92 != null) {
                String str2 = this.F;
                tn.p.j(str2, "TAG");
                c3605n92.b(str2, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad");
            }
            if (1 == this.f27506b) {
                b((short) 2008);
            } else {
                b((short) 2011);
            }
            return false;
        }
        if (7 != b10) {
            C3605n9 c3605n93 = this.f27513i;
            if (c3605n93 != null) {
                c3605n93.c(this.G, "Fetching a Banner ad for placement id: " + this.f27516l);
            }
            D();
            return true;
        }
        b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE), false, (short) 2010);
        C3605n9 c3605n94 = this.f27513i;
        if (c3605n94 != null) {
            String str3 = this.F;
            tn.p.j(str3, "TAG");
            c3605n94.b(str3, "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: " + this.f27516l.f28301a);
        }
        return false;
    }

    public final void W() {
        Fn viewableAd;
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            String str = this.F;
            tn.p.j(str, "TAG");
            c3605n9.a(str, "onPause " + this);
        }
        byte b10 = this.f27506b;
        if (b10 == 4 || b10 == 6 || b10 == 7) {
            GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ciI = i();
            Context contextN = n();
            if (gestureDetectorOnGestureListenerC3337ciI == null || contextN == null || (viewableAd = gestureDetectorOnGestureListenerC3337ciI.getViewableAd()) == null) {
                return;
            }
            viewableAd.a(contextN, (byte) 1);
        }
    }

    public final void X() {
        Fn viewableAd;
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            String str = this.F;
            tn.p.j(str, "TAG");
            c3605n9.a(str, "onResume " + this);
        }
        byte b10 = this.f27506b;
        if (b10 == 4 || b10 == 6 || b10 == 7) {
            GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ciI = i();
            Context contextN = n();
            if (gestureDetectorOnGestureListenerC3337ciI == null || contextN == null || (viewableAd = gestureDetectorOnGestureListenerC3337ciI.getViewableAd()) == null) {
                return;
            }
            viewableAd.a(contextN, (byte) 0);
        }
    }

    public final void Y() {
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            String str = this.F;
            tn.p.j(str, "TAG");
            c3605n9.c(str, "registerLifeCycleCallbacks " + this);
        }
        Context contextN = n();
        if (contextN != null) {
            Ji.a(contextN, this);
        }
    }

    public final void Z() {
        AdConfig adConfig;
        if (tn.p.f(this.f27516l.f28306f, "AB") && (adConfig = this.f27507c) != null && adConfig.getSkipNetCheckHB()) {
            C3605n9 c3605n9 = this.f27513i;
            if (c3605n9 != null) {
                String str = this.F;
                tn.p.j(str, "TAG");
                c3605n9.a(str, "renderAd without internet check");
            }
            a0();
            return;
        }
        C3605n9 c3605n92 = this.f27513i;
        if (c3605n92 != null) {
            String str2 = this.F;
            tn.p.j(str2, "TAG");
            c3605n92.a(str2, "renderAd");
        }
        a(new sn.a() { // from class: n9.i5
            @Override // sn.a
            public final Object invoke() {
                return C3269a2.e(this.f75425b);
            }
        }, new sn.l() { // from class: n9.j5
            @Override // sn.l
            public final Object invoke(Object obj) {
                return C3269a2.a(this.f75443b, (EnumC3273a6) obj);
            }
        });
    }

    @Override // com.inmobi.media.InterfaceC3820w0
    public final void a(int i10, GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci) {
        tn.p.k(gestureDetectorOnGestureListenerC3337ci, "renderView");
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            String str = this.F;
            tn.p.j(str, "TAG");
            c3605n9.a(str, "loadPodAd " + this);
        }
        if (this.f27522r.contains(Integer.valueOf(i10)) && i10 > this.f27512h.indexOf(gestureDetectorOnGestureListenerC3337ci)) {
            this.f27519o = i10;
            Handler handler = this.f27514j;
            if (handler != null) {
                handler.post(new Runnable() { // from class: n9.k5
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3269a2.a(this.f75459b);
                    }
                });
                return;
            }
            return;
        }
        C3605n9 c3605n92 = this.f27513i;
        if (c3605n92 != null) {
            String str2 = this.F;
            tn.p.j(str2, "TAG");
            c3605n92.a(str2, "No more ads present in pod adSet or current adSet is not pod adSet");
        }
        ArrayList arrayList = this.f27512h;
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci2 = (GestureDetectorOnGestureListenerC3337ci) arrayList.get(arrayList.indexOf(gestureDetectorOnGestureListenerC3337ci));
        if (gestureDetectorOnGestureListenerC3337ci2 != null) {
            gestureDetectorOnGestureListenerC3337ci2.a(false);
        }
    }

    @Override // com.inmobi.media.AbstractC3547l1, com.inmobi.media.InterfaceC3820w0
    public final void a(final int i10, final GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci, Context context) {
        tn.p.k(gestureDetectorOnGestureListenerC3337ci, "renderView");
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            String str = this.F;
            tn.p.j(str, "TAG");
            c3605n9.a(str, "showPodAdAtIndex " + this + " index - " + i10);
        }
        if (!this.f27523s) {
            C3605n9 c3605n92 = this.f27513i;
            if (c3605n92 != null) {
                String str2 = this.F;
                tn.p.j(str2, "TAG");
                c3605n92.b(str2, "Cannot show an pod ad as isPod is not set.");
            }
            ArrayList arrayList = this.f27512h;
            GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci2 = (GestureDetectorOnGestureListenerC3337ci) arrayList.get(arrayList.indexOf(gestureDetectorOnGestureListenerC3337ci));
            if (gestureDetectorOnGestureListenerC3337ci2 != null) {
                gestureDetectorOnGestureListenerC3337ci2.b(false);
                return;
            }
            return;
        }
        if (!b(i10, gestureDetectorOnGestureListenerC3337ci)) {
            super.a(i10, gestureDetectorOnGestureListenerC3337ci, context);
            Handler handler = this.f27514j;
            if (handler != null) {
                handler.post(new Runnable() { // from class: n9.n5
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3269a2.a(this.f75521b, gestureDetectorOnGestureListenerC3337ci, i10);
                    }
                });
                return;
            }
            return;
        }
        C3605n9 c3605n93 = this.f27513i;
        if (c3605n93 != null) {
            String str3 = this.F;
            tn.p.j(str3, "TAG");
            c3605n93.b(str3, "Cannot show an pod ad with invalid index passed");
        }
        ArrayList arrayList2 = this.f27512h;
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci3 = (GestureDetectorOnGestureListenerC3337ci) arrayList2.get(arrayList2.indexOf(gestureDetectorOnGestureListenerC3337ci));
        if (gestureDetectorOnGestureListenerC3337ci3 != null) {
            gestureDetectorOnGestureListenerC3337ci3.b(false);
        }
    }

    @Override // com.inmobi.media.AbstractC3388ei
    public void a(V1 v12) {
        tn.p.k(v12, "audioStatusInternal");
        AbstractC3423g1 abstractC3423g1M = m();
        if (abstractC3423g1M != null) {
            abstractC3423g1M.a(v12);
        }
        C3295b2 c3295b2 = this.J;
        c3295b2.getClass();
        tn.p.k(v12, "audioStatusInternal");
        if (!c3295b2.f26827a && v12 == V1.f26462e) {
            c3295b2.f26827a = true;
            W8 w82 = W8.f26526c;
            w82.f27127a = System.currentTimeMillis();
            w82.f27128b++;
        }
    }

    @Override // com.inmobi.media.AbstractC3547l1
    public final void a(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci, short s10) throws JSONException {
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            String str = this.F;
            tn.p.j(str, "TAG");
            c3605n9.a(str, "handleRenderViewSignaledAdFailed " + this);
        }
        super.a(gestureDetectorOnGestureListenerC3337ci, s10);
        if (this.f27523s) {
            int iIndexOf = this.f27512h.indexOf(gestureDetectorOnGestureListenerC3337ci);
            a(iIndexOf, true);
            if (iIndexOf > 0 && this.f27506b == 6) {
                b((byte) 1);
                GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci2 = (GestureDetectorOnGestureListenerC3337ci) this.f27512h.get(this.f27520p);
                if (gestureDetectorOnGestureListenerC3337ci2 != null) {
                    gestureDetectorOnGestureListenerC3337ci2.a(false);
                }
            }
        }
        if (this.f27506b == 2) {
            C3605n9 c3605n92 = this.f27513i;
            if (c3605n92 != null) {
                c3605n92.c(this.G, "Failed to load the Banner markup in the WebView for placement id: " + this.f27516l);
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, s10);
        }
    }

    @Override // com.inmobi.media.AbstractC3547l1, com.inmobi.media.AbstractC3388ei
    public final void a(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci, boolean z10) {
        tn.p.k(gestureDetectorOnGestureListenerC3337ci, "renderView");
        super.a(gestureDetectorOnGestureListenerC3337ci, z10);
        byte b10 = this.f27506b;
        if (b10 != 4 && b10 != 6) {
            if (b10 == 7) {
                gestureDetectorOnGestureListenerC3337ci.a(z10, b10 == 7 ? z10 ? (short) 2224 : (short) 2223 : (short) 2227);
            }
        } else {
            if (b10 == 4) {
                s = z10 ? (short) 2220 : (short) 2219;
            } else if (b10 == 6) {
                s = z10 ? (short) 2222 : (short) 2221;
            }
            J();
            gestureDetectorOnGestureListenerC3337ci.a(z10, s);
        }
    }

    @Override // com.inmobi.media.AbstractC3388ei
    public void a(boolean z10) {
        W8 w82 = W8.f26526c;
        Context context = Ji.f25747a;
        if (context == null) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = Ea.f25372b;
        Ea eaA = Da.a(context, "banner_audio_pref_file");
        tn.p.k("user_mute_count", "key");
        int i10 = eaA.f25373a.getInt("user_mute_count", 0);
        eaA.a("user_mute_count", z10 ? Math.max(0, i10 - 1) : i10 + 1, false);
    }

    public final void a0() {
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            String str = this.F;
            tn.p.j(str, "TAG");
            c3605n9.a(str, "renderAdPostInternetCheck");
        }
        try {
            if (M()) {
                return;
            }
            C3696r1 c3696r1 = this.f27530z;
            c3696r1.getClass();
            c3696r1.f28019g = SystemClock.elapsedRealtime();
            Handler handler = this.f27514j;
            if (handler != null) {
                handler.post(new Runnable() { // from class: n9.o5
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3269a2.f(this.f75544b);
                    }
                });
            }
        } catch (IllegalStateException e10) {
            C3605n9 c3605n92 = this.f27513i;
            if (c3605n92 != null) {
                String str2 = this.F;
                tn.p.j(str2, "TAG");
                c3605n92.a(str2, "Exception while loading ad.", e10);
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2134);
        }
    }

    @Override // com.inmobi.media.InterfaceC3820w0
    public final void b() {
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            String str = this.F;
            tn.p.j(str, "TAG");
            c3605n9.a(str, "closeAll " + this);
        }
    }

    public final void b(boolean z10) {
        C3605n9 c3605n9;
        C3605n9 c3605n92 = this.f27513i;
        if (c3605n92 != null) {
            String str = this.F;
            tn.p.j(str, "TAG");
            c3605n92.a(str, "load " + this);
        }
        if (z10 && (c3605n9 = this.f27513i) != null) {
            c3605n9.c(this.G, "Initiating Banner refresh for placement id: " + this.f27516l);
        }
        this.H = z10;
        C();
    }

    public final boolean b(int i10, GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci) {
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            String str = this.F;
            tn.p.j(str, "TAG");
            c3605n9.c(str, "isInValidShowPodIndex " + i10 + com.ironsource.Z7.f30794r + this.f27522r + com.ironsource.Z7.f30794r + this.f27512h.indexOf(gestureDetectorOnGestureListenerC3337ci) + com.ironsource.Z7.f30794r + this + com.ironsource.Z7.f30794r);
        }
        if (!this.f27522r.contains(Integer.valueOf(i10)) || i10 <= this.f27512h.indexOf(gestureDetectorOnGestureListenerC3337ci) || this.f27512h.get(i10) == null) {
            return true;
        }
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci2 = (GestureDetectorOnGestureListenerC3337ci) this.f27512h.get(i10);
        return (gestureDetectorOnGestureListenerC3337ci2 == null || gestureDetectorOnGestureListenerC3337ci2.B0) ? false : true;
    }

    public final void b0() {
        Application application;
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            String str = this.F;
            tn.p.j(str, "TAG");
            c3605n9.c(str, "unregisterLifeCycleCallbacks " + this);
        }
        Context contextN = n();
        Activity activity = contextN instanceof Activity ? (Activity) contextN : null;
        if (activity == null || (application = activity.getApplication()) == null) {
            return;
        }
        application.unregisterActivityLifecycleCallbacks(this);
    }

    public final void c(String str) {
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            String str2 = this.F;
            tn.p.j(str2, "TAG");
            c3605n9.c(str2, "setAdSize " + this);
        }
        C3795v0 c3795v0 = this.f27516l;
        tn.p.h(str);
        c3795v0.getClass();
        tn.p.k(str, "<set-?>");
        c3795v0.f28308h = str;
    }

    @Override // com.inmobi.media.AbstractC3547l1
    public final void d() {
        this.J.f26827a = false;
        super.d();
    }

    @Override // com.inmobi.media.AbstractC3388ei
    public final synchronized void e(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci) {
        tn.p.k(gestureDetectorOnGestureListenerC3337ci, "renderView");
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            String str = this.F;
            tn.p.j(str, "TAG");
            c3605n9.a(str, "onAdScreenDismissed " + this);
        }
        super.e(gestureDetectorOnGestureListenerC3337ci);
        Handler handler = this.f27514j;
        if (handler != null) {
            handler.post(new Runnable() { // from class: n9.m5
                @Override // java.lang.Runnable
                public final void run() {
                    C3269a2.b(this.f75499b);
                }
            });
        }
    }

    @Override // com.inmobi.media.AbstractC3388ei
    public final synchronized void f(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci) {
        tn.p.k(gestureDetectorOnGestureListenerC3337ci, "renderView");
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            String str = this.F;
            tn.p.j(str, "TAG");
            c3605n9.a(str, "onAdScreenDisplayed " + this);
        }
        super.f(gestureDetectorOnGestureListenerC3337ci);
        Handler handler = this.f27514j;
        if (handler != null) {
            handler.post(new Runnable() { // from class: n9.p5
                @Override // java.lang.Runnable
                public final void run() {
                    C3269a2.c(this.f75569b);
                }
            });
        }
    }

    @Override // com.inmobi.media.AbstractC3547l1, com.inmobi.media.AbstractC3388ei
    public void j(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci) {
        tn.p.k(gestureDetectorOnGestureListenerC3337ci, "renderView");
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            String str = this.F;
            tn.p.j(str, "TAG");
            c3605n9.c(str, "onRenderViewVisible " + this);
        }
        super.j(gestureDetectorOnGestureListenerC3337ci);
        Handler handler = this.f27514j;
        if (handler != null) {
            handler.post(new Runnable() { // from class: n9.l5
                @Override // java.lang.Runnable
                public final void run() {
                    C3269a2.d(this.f75480b);
                }
            });
        }
    }

    @Override // com.inmobi.media.AbstractC3547l1
    public final HashMap k() {
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            String str = this.F;
            tn.p.j(str, "TAG");
            c3605n9.c(str, "adSpecificRequestParams getter " + this);
        }
        HashMap map = new HashMap();
        map.put("u-rt", this.H ? "1" : "0");
        map.put("mk-ad-slot", this.f27516l.f28308h);
        return map;
    }

    @Override // com.inmobi.media.AbstractC3547l1
    public String l() {
        return "banner";
    }

    @Override // com.inmobi.media.AbstractC3547l1
    public final void o(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci) {
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            String str = this.F;
            tn.p.j(str, "TAG");
            c3605n9.a(str, "handleRenderViewSignaledAdReady " + this);
        }
        super.o(gestureDetectorOnGestureListenerC3337ci);
        if (this.f27523s && this.f27512h.indexOf(gestureDetectorOnGestureListenerC3337ci) > 0 && this.f27506b == 6) {
            b((byte) 1);
            GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci2 = (GestureDetectorOnGestureListenerC3337ci) this.f27512h.get(this.f27520p);
            if (gestureDetectorOnGestureListenerC3337ci2 != null) {
                gestureDetectorOnGestureListenerC3337ci2.a(true);
                return;
            }
            return;
        }
        if (this.f27506b != 2) {
            C3605n9 c3605n92 = this.f27513i;
            if (c3605n92 != null) {
                String str2 = this.F;
                tn.p.j(str2, "TAG");
                c3605n92.a(str2, "AdUnit is not in available state, ignoring the ad ready signal - " + ((int) this.f27506b));
                return;
            }
            return;
        }
        b((byte) 1);
        c((byte) 4);
        C3605n9 c3605n93 = this.f27513i;
        if (c3605n93 != null) {
            String str3 = this.F;
            tn.p.j(str3, "TAG");
            c3605n93.d(str3, "AdUnit " + this + " state - READY");
        }
        C3696r1 c3696r1 = this.f27530z;
        c3696r1.getClass();
        c3696r1.f28021i = SystemClock.elapsedRealtime();
        P();
        S();
        C3605n9 c3605n94 = this.f27513i;
        if (c3605n94 != null) {
            c3605n94.c(this.G, "Successfully loaded Banner ad markup in the WebView for placement id: " + this.f27516l);
        }
        AbstractC3423g1 abstractC3423g1M = m();
        if (abstractC3423g1M != null) {
            d(abstractC3423g1M);
        } else {
            C3605n9 c3605n95 = this.f27513i;
            if (c3605n95 != null) {
                String str4 = this.F;
                tn.p.j(str4, "TAG");
                c3605n95.b(str4, "AdUnit listener is null");
            }
        }
        h();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            String str = this.F;
            tn.p.j(str, "TAG");
            c3605n9.c(str, "onActivityCreated " + this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            String str = this.F;
            tn.p.j(str, "TAG");
            c3605n9.c(str, "onActivityDestroyed " + this);
        }
        Context contextN = n();
        if (tn.p.f(contextN, activity)) {
            tn.p.i(contextN, "null cannot be cast to non-null type android.app.Activity");
            ((Activity) contextN).getApplication().unregisterActivityLifecycleCallbacks(this);
            d();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            String str = this.F;
            tn.p.j(str, "TAG");
            c3605n9.c(str, "onActivityPaused " + this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            String str = this.F;
            tn.p.j(str, "TAG");
            c3605n9.c(str, "onActivityResumed " + this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        tn.p.k(bundle, "outState");
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            String str = this.F;
            tn.p.j(str, "TAG");
            c3605n9.c(str, "onActivitySaveInstanceState " + this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            String str = this.F;
            tn.p.j(str, "TAG");
            c3605n9.c(str, "onActivityStarted " + this);
        }
        if (tn.p.f(n(), activity)) {
            X();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            String str = this.F;
            tn.p.j(str, "TAG");
            c3605n9.c(str, "onActivityStopped " + this);
        }
        if (tn.p.f(n(), activity)) {
            W();
        }
    }

    @Override // com.inmobi.media.AbstractC3547l1
    public final GestureDetectorOnGestureListenerC3337ci q() {
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            String str = this.F;
            tn.p.j(str, "TAG");
            c3605n9.c(str, "htmlAdContainer getter " + this);
        }
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci = (this.f27512h.size() <= 0 || this.f27520p >= this.f27512h.size()) ? null : (GestureDetectorOnGestureListenerC3337ci) this.f27512h.get(this.f27520p);
        if (this.f27516l.f28310j && gestureDetectorOnGestureListenerC3337ci != null) {
            gestureDetectorOnGestureListenerC3337ci.k();
        }
        return gestureDetectorOnGestureListenerC3337ci;
    }

    @Override // com.inmobi.media.AbstractC3547l1
    public final void q(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci) {
        int iIndexOf;
        tn.p.k(gestureDetectorOnGestureListenerC3337ci, "renderView");
        if (this.f27523s && (iIndexOf = this.f27512h.indexOf(gestureDetectorOnGestureListenerC3337ci)) > this.f27520p && gestureDetectorOnGestureListenerC3337ci.I != Hn.f25626c) {
            this.f27522r.remove(Integer.valueOf(iIndexOf));
        } else {
            U();
            super.q(gestureDetectorOnGestureListenerC3337ci);
        }
    }

    @Override // com.inmobi.media.AbstractC3547l1
    public final byte t() {
        return (byte) 0;
    }
}
