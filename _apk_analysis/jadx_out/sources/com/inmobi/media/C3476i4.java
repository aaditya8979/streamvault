package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;

/* JADX INFO: renamed from: com.inmobi.media.i4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3476i4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3525k4 f27329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3500j4 f27330b;

    public C3476i4(C3525k4 c3525k4, C3500j4 c3500j4) {
        tn.p.k(c3525k4, "configManagerState");
        tn.p.k(c3500j4, "configManagerDI");
        this.f27329a = c3525k4;
        this.f27330b = c3500j4;
    }

    public final Config a(Class cls) {
        tn.p.k(cls, "clazz");
        String strA = AbstractC3749t4.a(cls);
        Config config = (Config) this.f27329a.f27444b.get(strA);
        if (config == null) {
            String[] strArr = C3699r4.f28028a;
            for (int i10 = 0; i10 < 5; i10++) {
                String str = strArr[i10];
                if (this.f27329a.f27444b.get(str) == null) {
                    this.f27329a.f27444b.put(str, AbstractC3576m5.a(str));
                }
            }
            config = (Config) this.f27329a.f27444b.get(strA);
            p000do.i.d(this.f27330b.f27380a, null, null, new C3400f4(this, null), 3, null);
        }
        tn.p.i(config, "null cannot be cast to non-null type T of com.inmobi.media.core.config.manager.ConfigManager.getConfig");
        return config;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.inmobi.media.C3349d4
            if (r0 == 0) goto L13
            r0 = r5
            com.inmobi.media.d4 r0 = (com.inmobi.media.C3349d4) r0
            int r1 = r0.f27014c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27014c = r1
            goto L18
        L13:
            com.inmobi.media.d4 r0 = new com.inmobi.media.d4
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f27012a
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f27014c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.c.b(r5)
            goto L47
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.c.b(r5)
            com.inmobi.media.j4 r5 = r4.f27330b
            bn.g r5 = r5.f27381b
            java.lang.Object r5 = r5.getValue()
            com.inmobi.media.a4 r5 = (com.inmobi.media.C3271a4) r5
            r0.f27014c = r3
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L47
            return r1
        L47:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L4d:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L68
            java.lang.Object r0 = r5.next()
            com.inmobi.media.core.config.models.Config r0 = (com.inmobi.media.core.config.models.Config) r0
            r0.getType()
            com.inmobi.media.k4 r1 = r4.f27329a
            java.util.concurrent.ConcurrentHashMap r1 = r1.f27444b
            java.lang.String r2 = r0.getType()
            r1.put(r2, r0)
            goto L4d
        L68:
            bn.r r5 = bn.r.f5635a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3476i4.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.inmobi.media.C3426g4
            if (r0 == 0) goto L13
            r0 = r7
            com.inmobi.media.g4 r0 = (com.inmobi.media.C3426g4) r0
            int r1 = r0.f27201c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27201c = r1
            goto L18
        L13:
            com.inmobi.media.g4 r0 = new com.inmobi.media.g4
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f27199a
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f27201c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.c.b(r7)
            goto L4a
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L31:
            kotlin.c.b(r7)
            com.inmobi.media.k4 r7 = r6.f27329a
            java.util.concurrent.atomic.AtomicBoolean r7 = r7.f27443a
            boolean r7 = r7.getAndSet(r3)
            if (r7 == 0) goto L41
            bn.r r7 = bn.r.f5635a
            return r7
        L41:
            r0.f27201c = r3
            java.lang.Object r7 = r6.a(r0)
            if (r7 != r1) goto L4a
            return r1
        L4a:
            java.lang.String[] r7 = com.inmobi.media.C3699r4.f28028a
            r0 = 0
            r1 = 5
        L4e:
            if (r0 >= r1) goto L6a
            r2 = r7[r0]
            com.inmobi.media.k4 r3 = r6.f27329a
            java.util.concurrent.ConcurrentHashMap r3 = r3.f27444b
            java.lang.Object r3 = r3.get(r2)
            if (r3 != 0) goto L67
            com.inmobi.media.k4 r3 = r6.f27329a
            java.util.concurrent.ConcurrentHashMap r3 = r3.f27444b
            com.inmobi.media.core.config.models.Config r4 = com.inmobi.media.AbstractC3576m5.a(r2)
            r3.put(r2, r4)
        L67:
            int r0 = r0 + 1
            goto L4e
        L6a:
            com.inmobi.media.j4 r7 = r6.f27330b
            do.l0 r0 = r7.f27380a
            com.inmobi.media.h4 r3 = new com.inmobi.media.h4
            r7 = 0
            r3.<init>(r6, r7)
            r1 = 0
            r2 = 0
            r4 = 3
            r5 = 0
            p000do.g.d(r0, r1, r2, r3, r4, r5)
            bn.r r7 = bn.r.f5635a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3476i4.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
