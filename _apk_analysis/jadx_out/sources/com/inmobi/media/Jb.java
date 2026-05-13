package com.inmobi.media;

import android.content.Context;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes8.dex */
public final class Jb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f25714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f25715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f25716d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f25717e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final WeakReference f25718f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f25719g;

    public Jb(Context context, String str, long j10, long j11, int i10, int i11) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(str, "url");
        this.f25713a = str;
        this.f25714b = j10;
        this.f25715c = j11;
        this.f25716d = i10;
        this.f25717e = i11;
        WeakReference weakReference = new WeakReference(context);
        this.f25718f = weakReference;
        this.f25719g = new AtomicBoolean(false);
        Context context2 = (Context) weakReference.get();
        if (context2 != null) {
            p000do.l0 l0Var = Sb.f26292a;
            Rb.a(new Ib(this, context2, null));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        if (r7 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.content.Context r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.inmobi.media.Fb
            if (r0 == 0) goto L13
            r0 = r7
            com.inmobi.media.Fb r0 = (com.inmobi.media.Fb) r0
            int r1 = r0.f25433e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25433e = r1
            goto L18
        L13:
            com.inmobi.media.Fb r0 = new com.inmobi.media.Fb
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f25431c
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f25433e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.util.Iterator r6 = r0.f25430b
            android.content.Context r2 = r0.f25429a
            kotlin.c.b(r7)
            goto L67
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            android.content.Context r6 = r0.f25429a
            kotlin.c.b(r7)
            goto L5f
        L3e:
            kotlin.c.b(r7)
            java.util.concurrent.atomic.AtomicBoolean r7 = r5.f25719g
            boolean r7 = r7.get()
            if (r7 == 0) goto L4c
            bn.r r6 = bn.r.f5635a
            return r6
        L4c:
            bn.g r7 = com.inmobi.media.AbstractC3881yb.f28577a
            java.lang.Object r7 = r7.getValue()
            com.inmobi.media.xb r7 = (com.inmobi.media.C3856xb) r7
            r0.f25429a = r6
            r0.f25433e = r4
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L5f
            goto L81
        L5f:
            java.util.List r7 = (java.util.List) r7
            java.util.Iterator r7 = r7.iterator()
            r2 = r6
            r6 = r7
        L67:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L82
            java.lang.Object r7 = r6.next()
            com.inmobi.media.qb r7 = (com.inmobi.media.C3682qb) r7
            java.lang.String r4 = r5.f25713a
            r0.f25429a = r2
            r0.f25430b = r6
            r0.f25433e = r3
            java.lang.Object r7 = r5.b(r4, r7, r0)
            if (r7 != r1) goto L67
        L81:
            return r1
        L82:
            bn.r r6 = bn.r.f5635a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Jb.a(android.content.Context, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        if (r7.a(r6, r0) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b7, code lost:
    
        if (r7 == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b9, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00b7 -> B:38:0x00ba). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.inmobi.media.C3682qb r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Jb.a(com.inmobi.media.qb, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r12, com.inmobi.media.C3682qb r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.inmobi.media.Gb
            if (r0 == 0) goto L13
            r0 = r14
            com.inmobi.media.Gb r0 = (com.inmobi.media.Gb) r0
            int r1 = r0.f25526c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25526c = r1
            goto L18
        L13:
            com.inmobi.media.Gb r0 = new com.inmobi.media.Gb
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.f25524a
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f25526c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.c.b(r14)     // Catch: java.lang.IllegalStateException -> L6a
            return r14
        L29:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L31:
            kotlin.c.b(r14)
            bn.g r14 = com.inmobi.media.He.f25613h     // Catch: java.lang.IllegalStateException -> L6a
            java.lang.Object r14 = r14.getValue()     // Catch: java.lang.IllegalStateException -> L6a
            com.inmobi.media.u9 r14 = (com.inmobi.media.C3779u9) r14     // Catch: java.lang.IllegalStateException -> L6a
            java.lang.String r2 = "loggingUrl"
            tn.p.k(r12, r2)     // Catch: java.lang.IllegalStateException -> L6a
            java.lang.String r2 = "data"
            tn.p.k(r13, r2)     // Catch: java.lang.IllegalStateException -> L6a
            java.lang.String r2 = "url"
            tn.p.k(r12, r2)     // Catch: java.lang.IllegalStateException -> L6a
            com.inmobi.media.Le r2 = new com.inmobi.media.Le     // Catch: java.lang.IllegalStateException -> L6a
            r6 = 0
            r7 = 0
            com.inmobi.media.S6 r8 = new com.inmobi.media.S6     // Catch: java.lang.IllegalStateException -> L6a
            java.lang.String r13 = r13.f27957a     // Catch: java.lang.IllegalStateException -> L6a
            r8.<init>(r13)     // Catch: java.lang.IllegalStateException -> L6a
            r9 = 0
            r10 = 54
            r4 = r2
            r5 = r12
            r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.IllegalStateException -> L6a
            r0.f25526c = r3     // Catch: java.lang.IllegalStateException -> L6a
            com.inmobi.media.x4 r12 = r14.f28245a     // Catch: java.lang.IllegalStateException -> L6a
            java.lang.Object r12 = r12.a(r2, r0)     // Catch: java.lang.IllegalStateException -> L6a
            if (r12 != r1) goto L69
            return r1
        L69:
            return r12
        L6a:
            r12 = 0
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Jb.a(java.lang.String, com.inmobi.media.qb, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0120 -> B:55:0x0128). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r25, com.inmobi.media.C3682qb r26, kotlin.coroutines.jvm.internal.ContinuationImpl r27) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Jb.b(java.lang.String, com.inmobi.media.qb, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
