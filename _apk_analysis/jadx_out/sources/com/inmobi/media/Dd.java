package com.inmobi.media;

import android.view.View;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.ads.nativeAd.MediaView;
import com.inmobi.media.ads.network.inmobiJson.model.Image;
import com.inmobi.media.ads.network.inmobiJson.model.JsonAssetObject;
import com.inmobi.media.ads.network.inmobiJson.model.NativeMedia;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes6.dex */
public final class Dd extends AbstractC3869y implements InterfaceC3338cj, InterfaceC3395f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ec f25315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Jc f25316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC3371e1 f25317d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p000do.l0 f25318e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C3819w f25319f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Dd(Ec ec2, Jc jc2) {
        NativeMedia media;
        super(ec2.f25379a);
        tn.p.k(ec2, "nativeAdUnitComponent");
        tn.p.k(jc2, "stateMachine");
        this.f25315b = ec2;
        this.f25316c = jc2;
        tn.p.k(ec2, "<this>");
        JsonAssetObject assetsObject = ec2.f25380b.getAssetsObject();
        p000do.l0 l0Var = ec2.f25379a.f28472a.f27737e;
        this.f25317d = tn.p.f((assetsObject == null || (media = assetsObject.getMedia()) == null) ? null : media.getType(), "video") ? new Ae(l0Var, ec2.f25379a.f28472a.f27735c) : new Cc(l0Var, ec2.f25379a.f28472a.f27735c);
        this.f25318e = P4.a(k());
        C3844x c3844x = ec2.f25379a;
        JsonAssetObject assetsObject2 = ec2.f25380b.getAssetsObject();
        Image adChoice = assetsObject2 != null ? assetsObject2.getAdChoice() : null;
        tn.p.k(c3844x, "adComponent");
        this.f25319f = new C3819w(c3844x.f28472a.f27734b, adChoice, c3844x.f28473b.f25488a.f27824b.getNative().getAdChoiceConfig(), c3844x.f28472a.f27735c);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(p000do.p0 r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.inmobi.media.Bd
            if (r0 == 0) goto L13
            r0 = r7
            com.inmobi.media.Bd r0 = (com.inmobi.media.Bd) r0
            int r1 = r0.f25213c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25213c = r1
            goto L18
        L13:
            com.inmobi.media.Bd r0 = new com.inmobi.media.Bd
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f25211a
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f25213c
            java.lang.String r3 = "NativeLoadingState"
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            kotlin.c.b(r7)     // Catch: java.lang.Exception -> L4f
            goto L3f
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            kotlin.c.b(r7)
            r0.f25213c = r4     // Catch: java.lang.Exception -> L4f
            java.lang.Object r7 = r6.N(r0)     // Catch: java.lang.Exception -> L4f
            if (r7 != r1) goto L3f
            return r1
        L3f:
            android.view.View r7 = (android.view.View) r7     // Catch: java.lang.Exception -> L4f
            com.inmobi.media.m9 r6 = r5.l()     // Catch: java.lang.Exception -> L4f
            if (r6 == 0) goto L4e
            java.lang.String r0 = "waitForAdChoiceView - ad choice view inflated successfully"
            com.inmobi.media.n9 r6 = (com.inmobi.media.C3605n9) r6     // Catch: java.lang.Exception -> L4f
            r6.a(r3, r0)     // Catch: java.lang.Exception -> L4f
        L4e:
            return r7
        L4f:
            r6 = move-exception
            com.inmobi.media.Ec r7 = r5.f25315b
            com.inmobi.media.x r7 = r7.f25379a
            com.inmobi.media.o1 r7 = r7.f28472a
            com.inmobi.media.n9 r7 = r7.f27735c
            if (r7 == 0) goto L6e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "AdChoiceView inflation failed: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.b(r3, r6)
        L6e:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Dd.a(do.p0, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.inmobi.media.InterfaceC3395f
    public final Object a(hn.c cVar) {
        InterfaceC3580m9 interfaceC3580m9L = l();
        if (interfaceC3580m9L != null) {
            ((C3605n9) interfaceC3580m9L).a("NativeLoadingState", "onDestroy");
        }
        Object objA = this.f25316c.a(new Vc(), this, (ContinuationImpl) cVar);
        return objA == in.a.g() ? objA : bn.r.f5635a;
    }

    @Override // com.inmobi.media.InterfaceC3338cj
    public final void a() {
        InterfaceC3580m9 interfaceC3580m9L = l();
        if (interfaceC3580m9L != null) {
            ((C3605n9) interfaceC3580m9L).a("NativeLoadingState", "Initialize Called - starting inflation process");
        }
        p000do.i.d(this.f25318e, null, null, new C3708rd(this, null), 3, null);
    }

    public final void a(MediaView mediaView, View view, Nc nc2) {
        InterfaceC3580m9 interfaceC3580m9L = l();
        if (interfaceC3580m9L != null) {
            ((C3605n9) interfaceC3580m9L).a("NativeLoadingState", "onInflateSuccess - transitioning to loaded state (mediaView: " + (mediaView != null) + ", adChoice: " + (view != null) + ")");
        }
        this.f25316c.a(new C3684qd(mediaView, view, this.f25317d, nc2, this.f25315b, this.f25316c), this);
    }

    public final void a(short s10) {
        InterfaceC3580m9 interfaceC3580m9L = l();
        if (interfaceC3580m9L != null) {
            ((C3605n9) interfaceC3580m9L).a("NativeLoadingState", "transitionToFailedState - errorCode: " + ((int) s10));
        }
        this.f25316c.a(new Xc(s10, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), this.f25315b, this.f25316c), this);
    }

    @Override // com.inmobi.media.InterfaceC3338cj
    public final void c() {
        F3.a(this.f25318e);
    }
}
