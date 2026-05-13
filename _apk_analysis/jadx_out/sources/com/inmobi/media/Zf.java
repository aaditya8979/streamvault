package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes10.dex */
public abstract class Zf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3637og f26710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Vf f26711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Cif f26712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile Wf f26713d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ConcurrentHashMap f26714e;

    public Zf(C3637og c3637og, Vf vf2, Cif cif) {
        tn.p.k(c3637og, "dao");
        tn.p.k(cif, "networkHandler");
        this.f26710a = c3637og;
        this.f26711b = vf2;
        this.f26712c = cif;
        this.f26713d = Wf.f26541a;
        this.f26714e = new ConcurrentHashMap();
    }

    public static Xf a(Rf rf2, Ne ne2) {
        String str = rf2.f26248a;
        ne2.c();
        ne2.e();
        return new Xf(rf2, ne2.c(), ne2.e());
    }

    public static AdConfig.PingsV2Config a() {
        C3476i4 c3476i4 = Y3.f26611a;
        tn.p.k(AdConfig.class, "clazz");
        return ((AdConfig) Y3.f26611a.a(AdConfig.class)).getPingsV2Config();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b1, code lost:
    
        if (r5.mo2invoke(r2, r3) == r4) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.inmobi.media.Rf r18, sn.p r19, kotlin.coroutines.jvm.internal.ContinuationImpl r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r20
            boolean r3 = r2 instanceof com.inmobi.media.Yf
            if (r3 == 0) goto L19
            r3 = r2
            com.inmobi.media.Yf r3 = (com.inmobi.media.Yf) r3
            int r4 = r3.f26649e
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f26649e = r4
            goto L1e
        L19:
            com.inmobi.media.Yf r3 = new com.inmobi.media.Yf
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.f26647c
            java.lang.Object r4 = in.a.g()
            int r5 = r3.f26649e
            r6 = 2
            r7 = 1
            if (r5 == 0) goto L4a
            if (r5 == r7) goto L3d
            if (r5 != r6) goto L35
            com.inmobi.media.Rf r1 = r3.f26645a
            kotlin.c.b(r2)
            goto Lb4
        L35:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3d:
            sn.p r1 = r3.f26646b
            com.inmobi.media.Rf r5 = r3.f26645a
            kotlin.c.b(r2)
            r16 = r5
            r5 = r1
            r1 = r16
            goto La0
        L4a:
            kotlin.c.b(r2)
            com.inmobi.media.Wf r2 = r0.f26713d
            com.inmobi.media.Wf r5 = com.inmobi.media.Wf.f26542b
            if (r2 != r5) goto Lbe
            java.util.concurrent.ConcurrentHashMap r2 = r0.f26714e
            java.lang.String r5 = r1.f26249b
            boolean r2 = r2.containsKey(r5)
            if (r2 == 0) goto L60
            bn.r r1 = bn.r.f5635a
            return r1
        L60:
            java.util.concurrent.ConcurrentHashMap r2 = r0.f26714e
            java.lang.String r5 = r1.f26249b
            java.lang.String r8 = r1.f26248a
            r2.put(r5, r8)
            com.inmobi.media.if r2 = r0.f26712c
            r3.f26645a = r1
            r5 = r19
            r3.f26646b = r5
            r3.f26649e = r7
            r2.getClass()
            java.util.HashMap r10 = new java.util.HashMap
            java.util.Map r7 = r1.f26250c
            r10.<init>(r7)
            java.lang.String r7 = com.inmobi.media.Ji.c()
            java.lang.String r8 = "user-agent"
            r10.put(r8, r7)
            com.inmobi.media.Je r7 = new com.inmobi.media.Je
            java.lang.String r9 = r1.f26248a
            r11 = 0
            r12 = 0
            r13 = 0
            boolean r14 = r1.f26251d
            r15 = 28
            r8 = r7
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            com.inmobi.media.u9 r2 = r2.f27353a
            com.inmobi.media.x4 r2 = r2.f28245a
            java.lang.Object r2 = r2.a(r7, r3)
            if (r2 != r4) goto La0
            goto Lb3
        La0:
            com.inmobi.media.Ne r2 = (com.inmobi.media.Ne) r2
            com.inmobi.media.Xf r2 = a(r1, r2)
            r3.f26645a = r1
            r7 = 0
            r3.f26646b = r7
            r3.f26649e = r6
            java.lang.Object r2 = r5.mo2invoke(r2, r3)
            if (r2 != r4) goto Lb4
        Lb3:
            return r4
        Lb4:
            java.util.concurrent.ConcurrentHashMap r2 = r0.f26714e
            java.lang.String r1 = r1.f26249b
            r2.remove(r1)
            bn.r r1 = bn.r.f5635a
            return r1
        Lbe:
            bn.r r1 = bn.r.f5635a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Zf.a(com.inmobi.media.Rf, sn.p, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final Object a(ContinuationImpl continuationImpl) {
        Wf wf2 = this.f26713d;
        Wf wf3 = Wf.f26542b;
        Wf wf4 = Wf.f26541a;
        Objects.toString(wf2);
        if (this.f26713d != wf4) {
            return bn.r.f5635a;
        }
        this.f26713d = wf3;
        bn.r rVarB = b();
        return rVarB == in.a.g() ? rVarB : bn.r.f5635a;
    }

    public abstract bn.r b();
}
