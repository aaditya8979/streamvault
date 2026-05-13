package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.JsonAssetObject;
import com.inmobi.media.ads.network.inmobiJson.model.NativeMedia;
import com.inmobi.media.ads.network.inmobiJson.model.NativeVideo;

/* JADX INFO: loaded from: classes9.dex */
public final class Wl extends AbstractC3826w6 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ec f26560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f26561d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final NativeVideo f26562e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Wl(Ec ec2, AbstractC3371e1 abstractC3371e1) {
        super(ec2, abstractC3371e1);
        tn.p.k(ec2, "nativeAdUnitComponent");
        tn.p.k(abstractC3371e1, "adSessionManager");
        this.f26560c = ec2;
        JsonAssetObject assetsObject = ec2.f25380b.getAssetsObject();
        NativeMedia media = assetsObject != null ? assetsObject.getMedia() : null;
        this.f26561d = media != null ? media.getType() : null;
        this.f26562e = media != null ? media.getVideo() : null;
    }

    public final C6 a(Exception exc, C3542kl c3542kl) {
        NativeVideo nativeVideo = this.f26562e;
        if (!(nativeVideo != null ? nativeVideo.getRequired() : false)) {
            return new B6(c3542kl);
        }
        InterfaceC3580m9 interfaceC3580m9A = a();
        if (interfaceC3580m9A != null) {
            ((C3605n9) interfaceC3580m9A).b("VideoExperienceLoader", "Media Load Failure: " + exc);
        }
        return new C3901z6((short) 2362);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.inmobi.media.C3542kl r7, com.inmobi.media.C3668pm r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.inmobi.media.Ul
            if (r0 == 0) goto L13
            r0 = r9
            com.inmobi.media.Ul r0 = (com.inmobi.media.Ul) r0
            int r1 = r0.f26457d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26457d = r1
            goto L18
        L13:
            com.inmobi.media.Ul r0 = new com.inmobi.media.Ul
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f26455b
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f26457d
            java.lang.String r3 = "VideoExperienceLoader"
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            com.inmobi.media.kl r7 = r0.f26454a
            kotlin.c.b(r9)     // Catch: java.lang.Exception -> L62
            goto L5a
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            kotlin.c.b(r9)
            com.inmobi.media.Ec r9 = r6.f26560c
            bn.g r9 = r9.f25385g
            java.lang.Object r9 = r9.getValue()
            com.inmobi.media.lc r9 = (com.inmobi.media.C3558lc) r9
            com.inmobi.media.m9 r2 = r6.a()     // Catch: java.lang.Exception -> L62
            if (r2 == 0) goto L4f
            java.lang.String r5 = "onPrepareExperienceModelSuccess - loading video experience"
            com.inmobi.media.n9 r2 = (com.inmobi.media.C3605n9) r2     // Catch: java.lang.Exception -> L62
            r2.a(r3, r5)     // Catch: java.lang.Exception -> L62
        L4f:
            r0.f26454a = r7     // Catch: java.lang.Exception -> L62
            r0.f26457d = r4     // Catch: java.lang.Exception -> L62
            java.lang.Object r9 = r9.a(r8, r0)     // Catch: java.lang.Exception -> L62
            if (r9 != r1) goto L5a
            return r1
        L5a:
            com.inmobi.media.ads.nativeAd.MediaView r9 = (com.inmobi.media.ads.nativeAd.MediaView) r9     // Catch: java.lang.Exception -> L62
            com.inmobi.media.A6 r8 = new com.inmobi.media.A6     // Catch: java.lang.Exception -> L62
            r8.<init>(r9, r7)     // Catch: java.lang.Exception -> L62
            return r8
        L62:
            r8 = move-exception
            com.inmobi.media.m9 r9 = r6.a()
            if (r9 == 0) goto L83
            java.lang.String r0 = r8.getMessage()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "onPrepareExperienceModelSuccess - exception during media load: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.inmobi.media.n9 r9 = (com.inmobi.media.C3605n9) r9
            r9.b(r3, r0)
        L83:
            com.inmobi.media.C6 r7 = r6.a(r8, r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Wl.a(com.inmobi.media.kl, com.inmobi.media.pm, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0220 A[RETURN] */
    @Override // com.inmobi.media.AbstractC3826w6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(hn.c r20) {
        /*
            Method dump skipped, instruction units count: 545
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Wl.a(hn.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r8, java.util.ArrayList r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.inmobi.media.Vl
            if (r0 == 0) goto L13
            r0 = r10
            com.inmobi.media.Vl r0 = (com.inmobi.media.Vl) r0
            int r1 = r0.f26511c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26511c = r1
            goto L18
        L13:
            com.inmobi.media.Vl r0 = new com.inmobi.media.Vl
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f26509a
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f26511c
            java.lang.String r3 = "VideoExperienceLoader"
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            kotlin.c.b(r10)     // Catch: com.inmobi.media.C3766tl -> L6d
            goto L6a
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            kotlin.c.b(r10)
            com.inmobi.media.m9 r10 = r7.a()     // Catch: com.inmobi.media.C3766tl -> L6d
            if (r10 == 0) goto L5b
            int r2 = r9.size()     // Catch: com.inmobi.media.C3766tl -> L6d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: com.inmobi.media.C3766tl -> L6d
            r5.<init>()     // Catch: com.inmobi.media.C3766tl -> L6d
            java.lang.String r6 = "parseVastTag - processing VAST tag with "
            r5.append(r6)     // Catch: com.inmobi.media.C3766tl -> L6d
            r5.append(r2)     // Catch: com.inmobi.media.C3766tl -> L6d
            java.lang.String r2 = " error URLs"
            r5.append(r2)     // Catch: com.inmobi.media.C3766tl -> L6d
            java.lang.String r2 = r5.toString()     // Catch: com.inmobi.media.C3766tl -> L6d
            com.inmobi.media.n9 r10 = (com.inmobi.media.C3605n9) r10     // Catch: com.inmobi.media.C3766tl -> L6d
            r10.a(r3, r2)     // Catch: com.inmobi.media.C3766tl -> L6d
        L5b:
            com.inmobi.media.Il r10 = com.inmobi.media.Il.f25667a     // Catch: com.inmobi.media.C3766tl -> L6d
            com.inmobi.media.Ec r2 = r7.f26560c     // Catch: com.inmobi.media.C3766tl -> L6d
            com.inmobi.media.x r2 = r2.f25379a     // Catch: com.inmobi.media.C3766tl -> L6d
            r0.f26511c = r4     // Catch: com.inmobi.media.C3766tl -> L6d
            java.lang.Object r10 = r10.a(r8, r2, r9, r0)     // Catch: com.inmobi.media.C3766tl -> L6d
            if (r10 != r1) goto L6a
            return r1
        L6a:
            com.inmobi.media.ql r10 = (com.inmobi.media.C3692ql) r10     // Catch: com.inmobi.media.C3766tl -> L6d
            return r10
        L6d:
            r8 = move-exception
            com.inmobi.media.m9 r9 = r7.a()
            if (r9 == 0) goto L8e
            java.lang.String r8 = r8.getMessage()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "parseVastTag - VAST parse exception: "
            r10.append(r0)
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            com.inmobi.media.n9 r9 = (com.inmobi.media.C3605n9) r9
            r9.b(r3, r8)
        L8e:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Wl.a(java.lang.String, java.util.ArrayList, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
