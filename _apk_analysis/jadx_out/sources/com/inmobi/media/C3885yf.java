package com.inmobi.media;

import android.content.Context;
import android.view.View;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.yf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3885yf extends En {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Fn f28590d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Ae f28591e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C3703r8 f28592f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC3580m9 f28593g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3885yf(Context context, GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci, Fn fn2, p000do.l0 l0Var, Ae ae2, C3703r8 c3703r8, InterfaceC3580m9 interfaceC3580m9) {
        super(gestureDetectorOnGestureListenerC3337ci);
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(gestureDetectorOnGestureListenerC3337ci, "adContainer");
        tn.p.k(fn2, "mViewableAd");
        tn.p.k(l0Var, "hybridScope");
        this.f28590d = fn2;
        this.f28591e = ae2;
        this.f28592f = c3703r8;
        this.f28593g = interfaceC3580m9;
        p000do.l0 l0VarA = P4.a(l0Var);
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        if (interfaceC3580m9 != null) {
            tn.p.j("yf", "TAG");
            ((C3605n9) interfaceC3580m9).b("yf", "initializeOMSDK called");
        }
        int i10 = AbstractC3536kf.f27473a;
        Context applicationContext = context.getApplicationContext();
        tn.p.j(applicationContext, "getApplicationContext(...)");
        AbstractC3536kf.a(applicationContext);
        p000do.i.d(l0VarA, null, null, new C3860xf(this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(com.inmobi.media.C3885yf r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            r11.getClass()
            boolean r0 = r12 instanceof com.inmobi.media.C3835wf
            if (r0 == 0) goto L16
            r0 = r12
            com.inmobi.media.wf r0 = (com.inmobi.media.C3835wf) r0
            int r1 = r0.f28441c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f28441c = r1
            goto L1b
        L16:
            com.inmobi.media.wf r0 = new com.inmobi.media.wf
            r0.<init>(r11, r12)
        L1b:
            java.lang.Object r12 = r0.f28439a
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f28441c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            kotlin.c.b(r12)
            goto L53
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L35:
            kotlin.c.b(r12)
            com.inmobi.media.pf r12 = com.inmobi.media.C3661pf.f27874a
            r0.f28441c = r4
            android.content.Context r12 = com.inmobi.media.Ji.f25747a
            if (r12 != 0) goto L43
            java.lang.String r12 = ""
            goto L50
        L43:
            do.h0 r2 = p000do.w0.b()
            com.inmobi.media.nf r4 = new com.inmobi.media.nf
            r4.<init>(r12, r3)
            java.lang.Object r12 = p000do.g.g(r2, r4, r0)
        L50:
            if (r12 != r1) goto L53
            return r1
        L53:
            r5 = r12
            java.lang.String r5 = (java.lang.String) r5
            com.inmobi.media.r8 r12 = r11.f28592f
            if (r12 == 0) goto L6f
            com.inmobi.media.Ae r4 = r11.f28591e
            if (r4 == 0) goto L6d
            java.util.ArrayList r6 = r12.f28044a
            java.util.Map r7 = r12.f28045b
            java.lang.String r8 = r12.f28047d
            java.lang.String r9 = r12.f28046c
            boolean r10 = r12.f28048e
            r4.a(r5, r6, r7, r8, r9, r10)
            bn.r r3 = bn.r.f5635a
        L6d:
            if (r3 != 0) goto L83
        L6f:
            com.inmobi.media.m9 r11 = r11.f28593g
            if (r11 == 0) goto L83
            java.lang.String r12 = "yf"
            java.lang.String r0 = "TAG"
            tn.p.j(r12, r0)
            com.inmobi.media.n9 r11 = (com.inmobi.media.C3605n9) r11
            java.lang.String r0 = "OmidInfo is null, cannot track ad"
            r11.a(r12, r0)
            bn.r r11 = bn.r.f5635a
        L83:
            bn.r r11 = bn.r.f5635a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3885yf.a(com.inmobi.media.yf, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.inmobi.media.Fn
    public final void a() {
        InterfaceC3580m9 interfaceC3580m9 = this.f28593g;
        if (interfaceC3580m9 != null) {
            tn.p.j("yf", "TAG");
            ((C3605n9) interfaceC3580m9).c("yf", "destroy");
        }
        WeakReference weakReference = this.f25484b;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f28591e = null;
        this.f28590d.a();
    }

    @Override // com.inmobi.media.Fn
    public final void a(Context context, byte b10) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        this.f28590d.a(context, b10);
    }

    @Override // com.inmobi.media.Fn
    public final void a(View view) {
        tn.p.k(view, "childView");
        Ae ae2 = this.f28591e;
        if (ae2 != null) {
            tn.p.k(view, "childView");
            if (ae2.f27075c == null) {
                return;
            }
            P4.a(ae2.f27073a, new C3268a1(ae2, view, null));
        }
    }

    @Override // com.inmobi.media.Fn
    public final void a(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        tn.p.k(view, "childView");
        tn.p.k(friendlyObstructionPurpose, "obstructionCode");
        Ae ae2 = this.f28591e;
        if (ae2 != null) {
            tn.p.k(view, "childView");
            tn.p.k(friendlyObstructionPurpose, "friendlyObstruction");
            if (ae2.f27075c == null) {
                InterfaceC3580m9 interfaceC3580m9 = ae2.f27074b;
                if (interfaceC3580m9 != null) {
                    ((C3605n9) interfaceC3580m9).a(AbstractC3371e1.f27072f, "Failed to addObstruction: adSession is null");
                    return;
                }
                return;
            }
            InterfaceC3580m9 interfaceC3580m92 = ae2.f27074b;
            if (interfaceC3580m92 != null) {
                ((C3605n9) interfaceC3580m92).a(AbstractC3371e1.f27072f, "addObstruction");
            }
            P4.a(ae2.f27073a, new X0(ae2, view, friendlyObstructionPurpose, null));
        }
    }

    @Override // com.inmobi.media.Fn
    public final void a(Map map) {
        InterfaceC3580m9 interfaceC3580m9 = this.f28593g;
        if (interfaceC3580m9 != null) {
            tn.p.j("yf", "TAG");
            ((C3605n9) interfaceC3580m9).a("yf", "startTrackingForImpression");
        }
        this.f28590d.a(map);
    }

    @Override // com.inmobi.media.Fn
    public final View b() {
        return this.f28590d.b();
    }

    @Override // com.inmobi.media.Fn
    public final View c() {
        InterfaceC3580m9 interfaceC3580m9 = this.f28593g;
        if (interfaceC3580m9 != null) {
            tn.p.j("yf", "TAG");
            ((C3605n9) interfaceC3580m9).c("yf", "inflateView called");
        }
        return this.f28590d.c();
    }

    @Override // com.inmobi.media.Fn
    public final void d() {
        InterfaceC3580m9 interfaceC3580m9 = this.f28593g;
        if (interfaceC3580m9 != null) {
            tn.p.j("yf", "TAG");
            ((C3605n9) interfaceC3580m9).a("yf", "stopTrackingForImpression");
        }
        this.f28590d.d();
    }
}
