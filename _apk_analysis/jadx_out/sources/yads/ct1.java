package yads;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ct1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dw2 f88600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile at1 f88601b;

    static {
        Object obj = dw2.f89000j;
        f88600a = cw2.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0069 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static yads.at1 a(android.content.Context r6, yads.nt2 r7, yads.cq3 r8) {
        /*
            yads.pu3 r0 = yads.pu3.f93787a
            yads.bh r0 = new yads.bh
            r0.<init>()
            yads.fh r1 = yads.pg.a(r6)
            boolean r2 = yads.ub.a(r6)
            if (r2 == 0) goto L14
            java.lang.String r2 = "322a737a-a0ca-44e0-bc85-649b1c7c1db6"
            goto L16
        L14:
            java.lang.String r2 = "478cb909-6ad1-4e12-84cc-b3629a789f93"
        L16:
            yads.zg r3 = r1.f89580a
            boolean r3 = r3.a()
            r4 = 0
            r5 = 0
            if (r3 == 0) goto L34
            yads.eh r3 = new yads.eh     // Catch: java.lang.Throwable -> L31
            r3.<init>(r8, r6, r1, r2)     // Catch: java.lang.Throwable -> L31
            bn.g r8 = kotlin.b.b(r3)     // Catch: java.lang.Throwable -> L31
            yads.gh r2 = new yads.gh     // Catch: java.lang.Throwable -> L31
            yads.zg r1 = r1.f89580a     // Catch: java.lang.Throwable -> L31
            r2.<init>(r8, r1)     // Catch: java.lang.Throwable -> L31
            goto L3b
        L31:
            boolean r8 = yads.ad1.f87661a
            goto L3a
        L34:
            io.appmetrica.analytics.AppMetrica.setDataSendingEnabled(r4)     // Catch: java.lang.Throwable -> L38
            goto L3a
        L38:
            boolean r8 = yads.ad1.f87661a
        L3a:
            r2 = r5
        L3b:
            yads.bt1 r8 = new yads.bt1
            r8.<init>(r6)
            bn.g r8 = kotlin.b.b(r8)
            r1 = 1
            if (r7 == 0) goto L4c
            boolean r7 = r7.f92945e0
            if (r7 != r1) goto L4c
            r4 = r1
        L4c:
            yads.at1 r7 = new yads.at1
            java.lang.Object r1 = yads.og1.f93212d
            yads.og1 r1 = yads.ng1.a()
            java.util.concurrent.Executor r1 = r1.a()
            r7.<init>(r2, r8, r4, r1)
            yads.ot2 r8 = new yads.ot2
            r8.<init>(r6, r0)
            java.lang.Object r6 = yads.xt2.f96867b
            yads.xt2 r6 = yads.wt2.a()
            java.lang.Object r0 = yads.xt2.f96867b
            monitor-enter(r0)
            java.util.HashMap r1 = r6.f96869a     // Catch: java.lang.Throwable -> L7a
            boolean r1 = r1.containsKey(r8)     // Catch: java.lang.Throwable -> L7a
            if (r1 != 0) goto L76
            java.util.HashMap r6 = r6.f96869a     // Catch: java.lang.Throwable -> L7a
            r6.put(r8, r5)     // Catch: java.lang.Throwable -> L7a
        L76:
            bn.r r6 = bn.r.f5635a     // Catch: java.lang.Throwable -> L7a
            monitor-exit(r0)
            return r7
        L7a:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.ct1.a(android.content.Context, yads.nt2, yads.cq3):yads.at1");
    }
}
