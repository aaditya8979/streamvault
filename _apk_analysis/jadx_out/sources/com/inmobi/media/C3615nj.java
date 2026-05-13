package com.inmobi.media;

import android.content.Context;
import android.webkit.URLUtil;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.UUID;

/* JADX INFO: renamed from: com.inmobi.media.nj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3615nj extends T3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f27702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3605n9 f27703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f27704c;

    public C3615nj(Context context, C3605n9 c3605n9) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        this.f27702a = context;
        this.f27703b = c3605n9;
        String string = UUID.randomUUID().toString();
        tn.p.j(string, "toString(...)");
        this.f27704c = "Static-Companion-" + string;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0074, code lost:
    
        if (p000do.g.g(r13, r14, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(com.inmobi.media.C3615nj r12, java.lang.String r13, com.inmobi.media.Cj r14, kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            r12.getClass()
            boolean r0 = r15 instanceof com.inmobi.media.C3540kj
            if (r0 == 0) goto L16
            r0 = r15
            com.inmobi.media.kj r0 = (com.inmobi.media.C3540kj) r0
            int r1 = r0.f27489e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f27489e = r1
            goto L1b
        L16:
            com.inmobi.media.kj r0 = new com.inmobi.media.kj
            r0.<init>(r12, r15)
        L1b:
            java.lang.Object r15 = r0.f27487c
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f27489e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            kotlin.c.b(r15)
            goto L77
        L30:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L38:
            com.inmobi.media.Cj r14 = r0.f27486b
            java.lang.String r13 = r0.f27485a
            kotlin.c.b(r15)
            goto L59
        L40:
            kotlin.c.b(r15)
            do.y1 r15 = p000do.w0.c()
            com.inmobi.media.mj r2 = new com.inmobi.media.mj
            r2.<init>(r12, r5)
            r0.f27485a = r13
            r0.f27486b = r14
            r0.f27489e = r4
            java.lang.Object r15 = p000do.g.g(r15, r2, r0)
            if (r15 != r1) goto L59
            goto L76
        L59:
            r9 = r13
            r7 = r14
            r10 = r15
            android.graphics.Bitmap$Config r10 = (android.graphics.Bitmap.Config) r10
            do.h0 r13 = p000do.w0.b()
            com.inmobi.media.lj r14 = new com.inmobi.media.lj
            r11 = 0
            r6 = r14
            r8 = r12
            r6.<init>(r7, r8, r9, r10, r11)
            r0.f27485a = r5
            r0.f27486b = r5
            r0.f27489e = r3
            java.lang.Object r12 = p000do.g.g(r13, r14, r0)
            if (r12 != r1) goto L77
        L76:
            return r1
        L77:
            bn.r r12 = bn.r.f5635a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3615nj.a(com.inmobi.media.nj, java.lang.String, com.inmobi.media.Cj, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final Object a(C3813vi c3813vi, J3 j32) throws C3331cc {
        if (URLUtil.isNetworkUrl(c3813vi.f28373a)) {
            return p000do.g.g(p000do.w0.c(), new C3515jj(this, c3813vi, null), j32);
        }
        throw new C3331cc("Companion Invalid Resource Error");
    }
}
