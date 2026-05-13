package com.inmobi.media;

import android.view.View;
import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;
import com.inmobi.media.ads.nativeAd.MediaView;

/* JADX INFO: renamed from: com.inmobi.media.ye, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3884ye implements InterfaceC3338cj, InterfaceC3712rh, InterfaceC3395f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f28582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediaView f28583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3738si f28584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC3371e1 f28585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final D4 f28586e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Nc f28587f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Ec f28588g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Jc f28589h;

    public C3884ye(View view, MediaView mediaView, C3738si c3738si, AbstractC3371e1 abstractC3371e1, D4 d42, Nc nc2, Ec ec2, Jc jc2) {
        tn.p.k(c3738si, "renderedStateCache");
        tn.p.k(abstractC3371e1, "adSessionManager");
        tn.p.k(d42, "contextualDataHandler");
        tn.p.k(nc2, "nativeBeaconProcessor");
        tn.p.k(ec2, "nativeAdUnitComponent");
        tn.p.k(jc2, "stateMachine");
        this.f28582a = view;
        this.f28583b = mediaView;
        this.f28584c = c3738si;
        this.f28585d = abstractC3371e1;
        this.f28586e = d42;
        this.f28587f = nc2;
        this.f28588g = ec2;
        this.f28589h = jc2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a4, code lost:
    
        if (r9.a(r2, r8, r0) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.inmobi.media.InterfaceC3395f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(hn.c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.inmobi.media.C3834we
            if (r0 == 0) goto L13
            r0 = r9
            com.inmobi.media.we r0 = (com.inmobi.media.C3834we) r0
            int r1 = r0.f28438c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28438c = r1
            goto L1a
        L13:
            com.inmobi.media.we r0 = new com.inmobi.media.we
            kotlin.coroutines.jvm.internal.ContinuationImpl r9 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r9
            r0.<init>(r8, r9)
        L1a:
            java.lang.Object r9 = r0.f28436a
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f28438c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            kotlin.c.b(r9)
            goto La7
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L37:
            kotlin.c.b(r9)
            goto L92
        L3b:
            kotlin.c.b(r9)
            com.inmobi.media.e1 r9 = r8.f28585d
            com.iab.omid.library.inmobi.adsession.AdSession r2 = r9.f27075c
            r5 = 0
            if (r2 != 0) goto L53
            com.inmobi.media.m9 r9 = r9.f27074b
            if (r9 == 0) goto L6a
            java.lang.String r2 = com.inmobi.media.AbstractC3371e1.f27072f
            com.inmobi.media.n9 r9 = (com.inmobi.media.C3605n9) r9
            java.lang.String r6 = "Failed to stopAdSession. adSession is null"
            r9.a(r2, r6)
            goto L6a
        L53:
            com.inmobi.media.m9 r2 = r9.f27074b
            if (r2 == 0) goto L60
            java.lang.String r6 = com.inmobi.media.AbstractC3371e1.f27072f
            com.inmobi.media.n9 r2 = (com.inmobi.media.C3605n9) r2
            java.lang.String r7 = "stopAdSession"
            r2.a(r6, r7)
        L60:
            do.l0 r2 = r9.f27073a
            com.inmobi.media.c1 r6 = new com.inmobi.media.c1
            r6.<init>(r9, r5)
            com.inmobi.media.P4.a(r2, r6)
        L6a:
            com.inmobi.media.Ec r9 = r8.f28588g
            bn.g r9 = r9.f25385g
            java.lang.Object r9 = r9.getValue()
            com.inmobi.media.lc r9 = (com.inmobi.media.C3558lc) r9
            r0.f28438c = r4
            r9.getClass()
            do.y1 r2 = p000do.w0.c()
            com.inmobi.media.jc r4 = new com.inmobi.media.jc
            r4.<init>(r9, r5)
            java.lang.Object r9 = p000do.g.g(r2, r4, r0)
            java.lang.Object r2 = in.a.g()
            if (r9 != r2) goto L8d
            goto L8f
        L8d:
            bn.r r9 = bn.r.f5635a
        L8f:
            if (r9 != r1) goto L92
            goto La6
        L92:
            com.inmobi.media.D4 r9 = r8.f28586e
            r9.b()
            com.inmobi.media.Jc r9 = r8.f28589h
            com.inmobi.media.Vc r2 = new com.inmobi.media.Vc
            r2.<init>()
            r0.f28438c = r3
            java.lang.Object r9 = r9.a(r2, r8, r0)
            if (r9 != r1) goto La7
        La6:
            return r1
        La7:
            bn.r r9 = bn.r.f5635a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3884ye.a(hn.c):java.lang.Object");
    }

    @Override // com.inmobi.media.InterfaceC3338cj
    public final void a() {
        Gh gh2;
        C3605n9 c3605n9 = this.f28588g.f25379a.f28472a.f27735c;
        if (c3605n9 == null || (gh2 = c3605n9.f27675a) == null) {
            return;
        }
        gh2.a();
    }

    @Override // com.inmobi.media.InterfaceC3712rh
    public final void a(InMobiNativeViewData inMobiNativeViewData) {
        tn.p.k(inMobiNativeViewData, "nativeViewData");
        this.f28589h.a(new C3759te(new C3784ue(this.f28584c, new Sg(inMobiNativeViewData, this.f28583b, this.f28582a), this.f28586e, this.f28585d, this.f28587f, this.f28588g), this.f28589h), this);
    }

    @Override // com.inmobi.media.InterfaceC3338cj
    public final void c() {
    }
}
