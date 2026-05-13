package com.monetization.ads.mediation.base.initialize;

import java.util.concurrent.atomic.AtomicBoolean;
import yads.fp;
import yads.lu2;
import yads.nh2;
import yads.sp1;
import yads.to1;
import yads.uo1;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AtomicBoolean f51084g = new AtomicBoolean(true);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AtomicBoolean f51085h = new AtomicBoolean(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lu2 f51086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fp f51087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nh2 f51088c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sp1 f51089d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final uo1 f51090e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final to1 f51091f;

    public /* synthetic */ a(lu2 lu2Var) {
        fp fpVar = new fp();
        nh2 nh2Var = new nh2();
        sp1 sp1Var = new sp1();
        this(lu2Var, fpVar, nh2Var, sp1Var, new uo1(sp1Var), new to1(sp1Var));
    }

    public a(lu2 lu2Var, fp fpVar, nh2 nh2Var, sp1 sp1Var, uo1 uo1Var, to1 to1Var) {
        this.f51086a = lu2Var;
        this.f51087b = fpVar;
        this.f51088c = nh2Var;
        this.f51089d = sp1Var;
        this.f51090e = uo1Var;
        this.f51091f = to1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.content.Context r6, yads.qq1 r7, hn.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof yads.vp1
            if (r0 == 0) goto L13
            r0 = r8
            yads.vp1 r0 = (yads.vp1) r0
            int r1 = r0.f96160e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f96160e = r1
            goto L18
        L13:
            yads.vp1 r0 = new yads.vp1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f96158c
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f96160e
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.c.b(r8)
            goto L53
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            kotlin.c.b(r8)
            yads.sp1 r8 = r5.f51089d
            java.lang.String r8 = r8.b(r7)
            yads.to1 r2 = r5.f51091f
            yads.lu2 r4 = r5.f51086a
            com.monetization.ads.mediation.base.initialize.MediatedAdapterInitializer r2 = r2.a(r6, r7, r4)
            if (r2 == 0) goto L56
            java.util.Map r7 = r7.d()
            r0.f96157b = r8
            r0.f96160e = r3
            java.lang.Object r8 = r2.initialize(r6, r7, r0)
            if (r8 != r1) goto L53
            return r1
        L53:
            com.monetization.ads.mediation.base.initialize.MediatedAdapterInitializationResult r8 = (com.monetization.ads.mediation.base.initialize.MediatedAdapterInitializationResult) r8
            goto L57
        L56:
            r8 = 0
        L57:
            boolean r6 = r8 instanceof com.monetization.ads.mediation.base.initialize.MediatedAdapterInitializationResult.Failure
            if (r6 == 0) goto L66
            com.monetization.ads.mediation.base.initialize.MediatedAdapterInitializationResult$Failure r8 = (com.monetization.ads.mediation.base.initialize.MediatedAdapterInitializationResult.Failure) r8
            r8.getErrorCode()
            r8.getErrorMessage()
            boolean r6 = yads.ad1.f87661a
            goto L6a
        L66:
            if (r8 != 0) goto L6a
            boolean r6 = yads.ad1.f87661a
        L6a:
            bn.r r6 = bn.r.f5635a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.monetization.ads.mediation.base.initialize.a.a(android.content.Context, yads.qq1, hn.c):java.lang.Object");
    }
}
