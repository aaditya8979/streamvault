package com.inmobi.media;

import java.lang.ref.WeakReference;
import mo.a;

/* JADX INFO: renamed from: com.inmobi.media.qh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3688qh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mo.a f27982a = mo.g.b(false, 1, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f27983b = new WeakReference(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f27984c;

    public final bn.r a(C3663ph c3663ph) {
        kotlin.coroutines.d context = c3663ph.getContext();
        System.out.println(c3663ph.getContext());
        if (!tn.p.f(this.f27983b.get(), context)) {
            throw new IllegalStateException("ReentrantMutex is not locked by this coroutine.");
        }
        int i10 = this.f27984c - 1;
        this.f27984c = i10;
        if (i10 == 0) {
            this.f27983b = new WeakReference(null);
            a.C0887a.c(this.f27982a, null, 1, null);
        }
        return bn.r.f5635a;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.inmobi.media.E3 r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.inmobi.media.C3663ph
            if (r0 == 0) goto L13
            r0 = r9
            com.inmobi.media.ph r0 = (com.inmobi.media.C3663ph) r0
            int r1 = r0.f27880d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27880d = r1
            goto L18
        L13:
            com.inmobi.media.ph r0 = new com.inmobi.media.ph
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f27878b
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f27880d
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L52
            if (r2 == r6) goto L4a
            if (r2 == r5) goto L44
            if (r2 == r4) goto L3e
            if (r2 == r3) goto L36
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            java.lang.Object r8 = r0.f27877a
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            kotlin.c.b(r9)
            goto L83
        L3e:
            java.lang.Object r8 = r0.f27877a
            kotlin.c.b(r9)
            return r8
        L44:
            kotlin.c.b(r9)     // Catch: java.lang.Throwable -> L48
            goto L6c
        L48:
            r8 = move-exception
            goto L78
        L4a:
            java.lang.Object r8 = r0.f27877a
            sn.l r8 = (sn.l) r8
            kotlin.c.b(r9)
            goto L60
        L52:
            kotlin.c.b(r9)
            r0.f27877a = r8
            r0.f27880d = r6
            java.lang.Object r9 = r7.a(r0)
            if (r9 != r1) goto L60
            goto L82
        L60:
            r9 = 0
            r0.f27877a = r9     // Catch: java.lang.Throwable -> L48
            r0.f27880d = r5     // Catch: java.lang.Throwable -> L48
            java.lang.Object r9 = r8.invoke(r0)     // Catch: java.lang.Throwable -> L48
            if (r9 != r1) goto L6c
            goto L82
        L6c:
            r0.f27877a = r9
            r0.f27880d = r4
            bn.r r8 = r7.a(r0)
            if (r8 != r1) goto L77
            goto L82
        L77:
            return r9
        L78:
            r0.f27877a = r8
            r0.f27880d = r3
            bn.r r9 = r7.a(r0)
            if (r9 != r1) goto L83
        L82:
            return r1
        L83:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3688qh.a(com.inmobi.media.E3, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.inmobi.media.C3638oh
            if (r0 == 0) goto L13
            r0 = r6
            com.inmobi.media.oh r0 = (com.inmobi.media.C3638oh) r0
            int r1 = r0.f27797d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27797d = r1
            goto L18
        L13:
            com.inmobi.media.oh r0 = new com.inmobi.media.oh
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f27795b
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f27797d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.coroutines.d r0 = r0.f27794a
            kotlin.c.b(r6)
            goto L66
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L33:
            kotlin.c.b(r6)
            kotlin.coroutines.d r6 = r0.getContext()
            kotlin.coroutines.d r2 = r0.getContext()
            java.io.PrintStream r4 = java.lang.System.out
            r4.println(r2)
            java.lang.ref.WeakReference r2 = r5.f27983b
            java.lang.Object r2 = r2.get()
            boolean r2 = tn.p.f(r2, r6)
            if (r2 == 0) goto L57
            int r6 = r5.f27984c
            int r6 = r6 + r3
            r5.f27984c = r6
            bn.r r6 = bn.r.f5635a
            return r6
        L57:
            mo.a r2 = r5.f27982a
            r0.f27794a = r6
            r0.f27797d = r3
            r4 = 0
            java.lang.Object r0 = mo.a.C0887a.a(r2, r4, r0, r3, r4)
            if (r0 != r1) goto L65
            return r1
        L65:
            r0 = r6
        L66:
            java.lang.ref.WeakReference r6 = new java.lang.ref.WeakReference
            r6.<init>(r0)
            r5.f27983b = r6
            r5.f27984c = r3
            bn.r r6 = bn.r.f5635a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3688qh.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
