package com.inmobi.media;

import java.lang.ref.WeakReference;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.xb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3856xb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3431g9 f28511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f28512b;

    public C3856xb(C3431g9 c3431g9) {
        tn.p.k(c3431g9, "databaseHelper");
        this.f28511a = c3431g9;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r5, int r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof com.inmobi.media.C3706rb
            if (r0 == 0) goto L13
            r0 = r8
            com.inmobi.media.rb r0 = (com.inmobi.media.C3706rb) r0
            int r1 = r0.f28054c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28054c = r1
            goto L18
        L13:
            com.inmobi.media.rb r0 = new com.inmobi.media.rb
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f28052a
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f28054c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.c.b(r8)
            goto L66
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.c.b(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r2 = "SELECT * FROM logs_v2 WHERE id NOT IN (SELECT id FROM ( SELECT id FROM logs_v2 WHERE saveTimestamp > "
            r8.append(r2)
            r8.append(r5)
            java.lang.String r5 = " ORDER BY saveTimestamp DESC LIMIT "
            r8.append(r5)
            r8.append(r7)
            java.lang.String r5 = ") AS recent_logs);"
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            com.inmobi.media.g9 r6 = r4.f28511a
            r0.f28054c = r3
            r6.getClass()
            com.inmobi.media.c9 r7 = new com.inmobi.media.c9
            r8 = 0
            r7.<init>(r6, r5, r8)
            java.lang.Object r8 = r6.a(r7, r0)
            if (r8 != r1) goto L66
            return r1
        L66:
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r6 = cn.x.x(r8, r6)
            r5.<init>(r6)
            java.util.Iterator r6 = r8.iterator()
        L77:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L8b
            java.lang.Object r7 = r6.next()
            android.content.ContentValues r7 = (android.content.ContentValues) r7
            com.inmobi.media.qb r7 = com.inmobi.media.AbstractC3906zb.a(r7)
            r5.add(r7)
            goto L77
        L8b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3856xb.a(long, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.inmobi.media.C3682qb r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.inmobi.media.C3806vb
            if (r0 == 0) goto L13
            r0 = r6
            com.inmobi.media.vb r0 = (com.inmobi.media.C3806vb) r0
            int r1 = r0.f28359c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28359c = r1
            goto L18
        L13:
            com.inmobi.media.vb r0 = new com.inmobi.media.vb
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f28357a
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f28359c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.c.b(r6)
            goto L46
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.c.b(r6)
            com.inmobi.media.g9 r6 = r4.f28511a
            android.content.ContentValues r5 = com.inmobi.media.AbstractC3906zb.a(r5)
            r0.f28359c = r3
            r2 = 4
            java.lang.String r3 = "logs_v2"
            java.lang.Object r5 = r6.a(r3, r5, r2, r0)
            if (r5 != r1) goto L46
            return r1
        L46:
            java.lang.ref.WeakReference r5 = r4.f28512b
            if (r5 == 0) goto L55
            java.lang.Object r5 = r5.get()
            com.inmobi.media.o9 r5 = (com.inmobi.media.C3630o9) r5
            if (r5 == 0) goto L55
            com.inmobi.media.C3630o9.a()
        L55:
            bn.r r5 = bn.r.f5635a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3856xb.a(com.inmobi.media.qb, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final Object a(String str, ContinuationImpl continuationImpl) {
        Object objA = C3431g9.a(this.f28511a, "logs_v2", "filename='" + str + "'", continuationImpl, 4);
        return objA == in.a.g() ? objA : bn.r.f5635a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.inmobi.media.C3731sb
            if (r0 == 0) goto L13
            r0 = r6
            com.inmobi.media.sb r0 = (com.inmobi.media.C3731sb) r0
            int r1 = r0.f28113c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28113c = r1
            goto L18
        L13:
            com.inmobi.media.sb r0 = new com.inmobi.media.sb
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f28111a
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f28113c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.c.b(r6)
            goto L4a
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            kotlin.c.b(r6)
            com.inmobi.media.g9 r6 = r5.f28511a
            r0.f28113c = r3
            r6.getClass()
            com.inmobi.media.c9 r2 = new com.inmobi.media.c9
            r3 = 0
            java.lang.String r4 = "SELECT * FROM logs_v2 WHERE hasLoggerFinished=1"
            r2.<init>(r6, r4, r3)
            java.lang.Object r6 = r6.a(r2, r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = cn.x.x(r6, r1)
            r0.<init>(r1)
            java.util.Iterator r6 = r6.iterator()
        L5b:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L6f
            java.lang.Object r1 = r6.next()
            android.content.ContentValues r1 = (android.content.ContentValues) r1
            com.inmobi.media.qb r1 = com.inmobi.media.AbstractC3906zb.a(r1)
            r0.add(r1)
            goto L5b
        L6f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3856xb.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.inmobi.media.C3682qb r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.inmobi.media.C3831wb
            if (r0 == 0) goto L13
            r0 = r10
            com.inmobi.media.wb r0 = (com.inmobi.media.C3831wb) r0
            int r1 = r0.f28428c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28428c = r1
            goto L18
        L13:
            com.inmobi.media.wb r0 = new com.inmobi.media.wb
            r0.<init>(r8, r10)
        L18:
            r6 = r0
            java.lang.Object r10 = r6.f28426a
            java.lang.Object r0 = in.a.g()
            int r1 = r6.f28428c
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            kotlin.c.b(r10)
            goto L51
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L32:
            kotlin.c.b(r10)
            com.inmobi.media.g9 r1 = r8.f28511a
            android.content.ContentValues r3 = com.inmobi.media.AbstractC3906zb.a(r9)
            java.lang.String r9 = r9.f27957a
            java.lang.String[] r5 = new java.lang.String[r2]
            r10 = 0
            r5[r10] = r9
            r6.f28428c = r2
            r7 = 16
            java.lang.String r2 = "logs_v2"
            java.lang.String r4 = "filename=?"
            java.lang.Object r9 = com.inmobi.media.C3431g9.a(r1, r2, r3, r4, r5, r6, r7)
            if (r9 != r0) goto L51
            return r0
        L51:
            java.lang.ref.WeakReference r9 = r8.f28512b
            if (r9 == 0) goto L60
            java.lang.Object r9 = r9.get()
            com.inmobi.media.o9 r9 = (com.inmobi.media.C3630o9) r9
            if (r9 == 0) goto L60
            com.inmobi.media.C3630o9.a()
        L60:
            bn.r r9 = bn.r.f5635a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3856xb.b(com.inmobi.media.qb, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.inmobi.media.C3781ub
            if (r0 == 0) goto L13
            r0 = r7
            com.inmobi.media.ub r0 = (com.inmobi.media.C3781ub) r0
            int r1 = r0.f28251c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28251c = r1
            goto L18
        L13:
            com.inmobi.media.ub r0 = new com.inmobi.media.ub
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f28249a
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f28251c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.c.b(r7)
            goto L5e
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            kotlin.c.b(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r2 = "SELECT COUNT(*) FROM logs_v2 WHERE filename='"
            r7.append(r2)
            r7.append(r6)
            java.lang.String r6 = "'"
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            com.inmobi.media.g9 r7 = r5.f28511a
            r0.f28251c = r3
            r7.getClass()
            com.inmobi.media.Y8 r2 = new com.inmobi.media.Y8
            r4 = 0
            r2.<init>(r7, r6, r4)
            java.lang.Object r7 = r7.a(r2, r0)
            if (r7 != r1) goto L5e
            return r1
        L5e:
            java.lang.Number r7 = (java.lang.Number) r7
            int r6 = r7.intValue()
            if (r6 == 0) goto L67
            goto L68
        L67:
            r3 = 0
        L68:
            java.lang.Boolean r6 = jn.a.a(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3856xb.b(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.inmobi.media.C3756tb
            if (r0 == 0) goto L13
            r0 = r6
            com.inmobi.media.tb r0 = (com.inmobi.media.C3756tb) r0
            int r1 = r0.f28179c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28179c = r1
            goto L18
        L13:
            com.inmobi.media.tb r0 = new com.inmobi.media.tb
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f28177a
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f28179c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.c.b(r6)
            goto L4a
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            kotlin.c.b(r6)
            com.inmobi.media.g9 r6 = r5.f28511a
            r0.f28179c = r3
            r6.getClass()
            com.inmobi.media.c9 r2 = new com.inmobi.media.c9
            r3 = 0
            java.lang.String r4 = "SELECT * FROM logs_v2 WHERE hasLoggerFinished=0"
            r2.<init>(r6, r4, r3)
            java.lang.Object r6 = r6.a(r2, r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = cn.x.x(r6, r1)
            r0.<init>(r1)
            java.util.Iterator r6 = r6.iterator()
        L5b:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L6f
            java.lang.Object r1 = r6.next()
            android.content.ContentValues r1 = (android.content.ContentValues) r1
            com.inmobi.media.qb r1 = com.inmobi.media.AbstractC3906zb.a(r1)
            r0.add(r1)
            goto L5b
        L6f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3856xb.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
