package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class yy1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dw2 f97328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x72 f97329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s72 f97330c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yy1(Context context, d4 d4Var, lu2 lu2Var) {
        this(cw2.a(), new x72(context, d4Var, lu2Var), new s72());
        Object obj = dw2.f89000j;
    }

    public yy1(dw2 dw2Var, x72 x72Var, s72 s72Var) {
        this.f97328a = dw2Var;
        this.f97329b = x72Var;
        this.f97330c = s72Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(yads.yy1 r9, yads.oi r10, hn.c r11) {
        /*
            r9.getClass()
            boolean r0 = r11 instanceof yads.uy1
            if (r0 == 0) goto L16
            r0 = r11
            yads.uy1 r0 = (yads.uy1) r0
            int r1 = r0.f95877e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f95877e = r1
            goto L1b
        L16:
            yads.uy1 r0 = new yads.uy1
            r0.<init>(r9, r11)
        L1b:
            java.lang.Object r11 = r0.f95875c
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f95877e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            yads.oi r9 = r0.f95874b
            kotlin.c.b(r11)
            goto L6e
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L37:
            kotlin.c.b(r11)
            java.lang.Object r11 = r10.f93231c
            boolean r11 = r11 instanceof yads.on1
            if (r11 == 0) goto L47
            java.lang.String r11 = "null cannot be cast to non-null type com.monetization.ads.network.model.Asset<R of com.monetization.ads.network.model.AssetKt.castGeneric>"
            tn.p.i(r10, r11)
            r11 = r10
            goto L48
        L47:
            r11 = r4
        L48:
            if (r11 != 0) goto L4b
            goto L9d
        L4b:
            yads.x72 r9 = r9.f97329b
            java.lang.Object r10 = r11.f93231c
            yads.on1 r10 = (yads.on1) r10
            yads.sd3 r10 = r10.f93292b
            r0.f95874b = r11
            r0.f95877e = r3
            r9.getClass()
            do.h0 r2 = p000do.w0.b()
            yads.t72 r3 = new yads.t72
            r3.<init>(r10, r9, r4)
            java.lang.Object r9 = p000do.g.g(r2, r3, r0)
            if (r9 != r1) goto L6b
            r10 = r1
            goto L9d
        L6b:
            r8 = r11
            r11 = r9
            r9 = r8
        L6e:
            yads.sd3 r11 = (yads.sd3) r11
            if (r11 != 0) goto L80
            java.lang.Object r10 = r9.f93231c
            yads.on1 r10 = (yads.on1) r10
            java.util.List r0 = r10.f93293c
            if (r0 != 0) goto L80
            yads.oj1 r10 = r10.f93291a
            if (r10 != 0) goto L80
            r10 = r4
            goto L9d
        L80:
            java.lang.Object r10 = r9.f93231c
            yads.on1 r10 = (yads.on1) r10
            yads.oj1 r0 = r10.f93291a
            java.util.List r10 = r10.f93293c
            yads.on1 r4 = new yads.on1
            r4.<init>(r0, r11, r10)
            java.lang.String r2 = r9.f93229a
            java.lang.String r3 = r9.f93230b
            yads.if1 r5 = r9.f93232d
            boolean r6 = r9.f93233e
            boolean r7 = r9.f93234f
            yads.oi r10 = new yads.oi
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7)
        L9d:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.yy1.a(yads.yy1, yads.oi, hn.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.content.Context r19, yads.ry1 r20, hn.c r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            r2 = r21
            boolean r3 = r2 instanceof yads.vy1
            if (r3 == 0) goto L19
            r3 = r2
            yads.vy1 r3 = (yads.vy1) r3
            int r4 = r3.f96226e
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f96226e = r4
            goto L1e
        L19:
            yads.vy1 r3 = new yads.vy1
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.f96224c
            java.lang.Object r4 = in.a.g()
            int r5 = r3.f96226e
            r6 = 0
            r7 = 1
            if (r5 == 0) goto L3a
            if (r5 != r7) goto L32
            yads.ry1 r1 = r3.f96223b
            kotlin.c.b(r2)
            goto L63
        L32:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3a:
            kotlin.c.b(r2)
            yads.dw2 r2 = r0.f97328a
            r5 = r19
            yads.nt2 r2 = r2.a(r5)
            if (r2 == 0) goto L91
            boolean r2 = r2.A0
            if (r2 != r7) goto L91
            yads.d12 r2 = r1.f94647a
            java.util.List r2 = r2.f88690a
            r3.f96223b = r1
            r3.f96226e = r7
            do.h0 r5 = p000do.w0.b()
            yads.xy1 r7 = new yads.xy1
            r7.<init>(r2, r0, r6)
            java.lang.Object r2 = p000do.g.g(r5, r7, r3)
            if (r2 != r4) goto L63
            return r4
        L63:
            r8 = r2
            java.util.List r8 = (java.util.List) r8
            if (r8 != 0) goto L69
            return r6
        L69:
            yads.d12 r2 = r1.f94647a
            java.util.List r9 = r2.f88691b
            java.util.List r10 = r2.f88692c
            yads.j5 r11 = r2.f88693d
            java.util.Map r12 = r2.f88694e
            java.util.List r13 = r2.f88695f
            java.util.List r14 = r2.f88696g
            java.lang.String r15 = r2.f88697h
            yads.my2 r3 = r2.f88698i
            yads.c7 r2 = r2.f88699j
            yads.d12 r4 = new yads.d12
            r7 = r4
            r16 = r3
            r17 = r2
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            yads.v9 r2 = r1.f94648b
            yads.d4 r1 = r1.f94649c
            yads.ry1 r3 = new yads.ry1
            r3.<init>(r2, r1, r4)
            r1 = r3
        L91:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.yy1.a(android.content.Context, yads.ry1, hn.c):java.lang.Object");
    }
}
