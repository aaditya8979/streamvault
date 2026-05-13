package com.inmobi.media;

import android.content.Context;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: renamed from: com.inmobi.media.l6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3552l6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC3351d6 f27536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Jf f27537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Wj f27538d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f27539e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f27540f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f27541g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinkedList f27542h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p000do.l0 f27543i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C3325c6 f27544j;

    public C3552l6(String str, AbstractC3351d6 abstractC3351d6, Jf jf2, C3325c6 c3325c6, Wj wj2) {
        tn.p.k(str, "tableName");
        tn.p.k(abstractC3351d6, "mEventDao");
        tn.p.k(jf2, "mPayloadProvider");
        tn.p.k(c3325c6, "eventConfig");
        this.f27535a = str;
        this.f27536b = abstractC3351d6;
        this.f27537c = jf2;
        this.f27538d = wj2;
        this.f27539e = C3552l6.class.getSimpleName();
        this.f27540f = new AtomicBoolean(false);
        this.f27541g = new AtomicBoolean(false);
        this.f27543i = A9.f25147c;
        this.f27542h = new LinkedList();
        this.f27544j = c3325c6;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(com.inmobi.media.C3552l6 r20, boolean r21, kotlin.coroutines.jvm.internal.ContinuationImpl r22) throws java.lang.InterruptedException {
        /*
            Method dump skipped, instruction units count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3552l6.a(com.inmobi.media.l6, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final long a() {
        Context context = Ji.f25747a;
        if (context == null) {
            return -1L;
        }
        ConcurrentHashMap concurrentHashMap = Ea.f25372b;
        Ea eaA = Da.a(context, "batch_processing_info");
        String str = this.f27535a + "_last_batch_process";
        tn.p.k(str, "key");
        return eaA.f25373a.getLong(str, -1L);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r7, long r9, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            r6 = this;
            boolean r0 = r11 instanceof com.inmobi.media.C3527k6
            if (r0 == 0) goto L13
            r0 = r11
            com.inmobi.media.k6 r0 = (com.inmobi.media.C3527k6) r0
            int r1 = r0.f27453e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27453e = r1
            goto L18
        L13:
            com.inmobi.media.k6 r0 = new com.inmobi.media.k6
            r0.<init>(r6, r11)
        L18:
            java.lang.Object r11 = r0.f27451c
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f27453e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            long r7 = r0.f27450b
            long r9 = r0.f27449a
            kotlin.c.b(r11)
            goto L52
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            kotlin.c.b(r11)
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r4 = java.lang.System.currentTimeMillis()
            long r4 = r11.toSeconds(r4)
            long r7 = r7 + r4
            com.inmobi.media.d6 r11 = r6.f27536b
            r0.f27449a = r9
            r0.f27450b = r7
            r0.f27453e = r3
            java.lang.Object r11 = r11.b(r3, r0)
            if (r11 != r1) goto L52
            return r1
        L52:
            java.util.List r11 = (java.util.List) r11
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L6f
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.lang.Object r11 = r11.get(r1)
            com.inmobi.media.i2 r11 = (com.inmobi.media.AbstractC3474i2) r11
            long r4 = r11.f27326c
            long r4 = r0.toSeconds(r4)
            long r7 = r7 - r4
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 < 0) goto L6f
            goto L70
        L6f:
            r3 = r1
        L70:
            java.lang.Boolean r7 = jn.a.a(r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3552l6.a(long, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r9, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.inmobi.media.C3428g6
            if (r0 == 0) goto L13
            r0 = r11
            com.inmobi.media.g6 r0 = (com.inmobi.media.C3428g6) r0
            int r1 = r0.f27206d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27206d = r1
            goto L18
        L13:
            com.inmobi.media.g6 r0 = new com.inmobi.media.g6
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.f27204b
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f27206d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            long r9 = r0.f27203a
            kotlin.c.b(r11)
            goto L43
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            kotlin.c.b(r11)
            com.inmobi.media.d6 r11 = r8.f27536b
            r0.f27203a = r9
            r0.f27206d = r3
            java.lang.Object r11 = r11.b(r3, r0)
            if (r11 != r1) goto L43
            return r1
        L43:
            java.util.List r11 = (java.util.List) r11
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L64
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.Object r11 = r11.get(r1)
            com.inmobi.media.i2 r11 = (com.inmobi.media.AbstractC3474i2) r11
            long r6 = r11.f27326c
            long r4 = r4 - r6
            long r4 = r0.toSeconds(r4)
            int r9 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r9 <= 0) goto L64
            goto L65
        L64:
            r3 = r1
        L65:
            java.lang.Boolean r9 = jn.a.a(r3)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3552l6.a(long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void a(long j10) {
        Context context = Ji.f25747a;
        if (context != null) {
            ConcurrentHashMap concurrentHashMap = Ea.f25372b;
            Da.a(context, "batch_processing_info").a(this.f27535a + "_last_batch_process", j10, false);
        }
    }

    /* JADX WARN: Type inference failed for: r13v1, types: [T, kotlinx.coroutines.g] */
    public final void a(boolean z10) {
        C3325c6 c3325c6 = this.f27544j;
        if (this.f27541g.get() || c3325c6 == null) {
            return;
        }
        long j10 = c3325c6.f26912c;
        if (this.f27542h.contains("default")) {
            return;
        }
        this.f27542h.add("default");
        tn.p.j(this.f27539e, "TAG");
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        p000do.l0 l0Var = this.f27543i;
        C3325c6 c3325c62 = this.f27544j;
        long jA = a();
        if (jA == -1) {
            a(System.currentTimeMillis());
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        ref$ObjectRef.element = F3.a(l0Var, Math.max(0L, (timeUnit.toSeconds(jA) + (c3325c62 != null ? c3325c62.f26912c : 0L)) - timeUnit.toSeconds(System.currentTimeMillis())) * 1000, 1000 * j10, new C3502j6(this, z10, ref$ObjectRef, null));
    }
}
