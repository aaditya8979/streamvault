package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.og, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3637og {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3431g9 f27793a;

    public C3637og(C3431g9 c3431g9) {
        tn.p.k(c3431g9, "databaseHelper");
        this.f27793a = c3431g9;
    }

    public final Object a(long j10, ContinuationImpl continuationImpl) {
        String strValueOf = String.valueOf(System.currentTimeMillis() - j10);
        Object objA = C3431g9.a(this.f27793a, "pings", "time_created<" + strValueOf, continuationImpl, 4);
        return objA == in.a.g() ? objA : bn.r.f5635a;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Integer r5, java.lang.String r6, long r7, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof com.inmobi.media.C3612ng
            if (r0 == 0) goto L13
            r0 = r9
            com.inmobi.media.ng r0 = (com.inmobi.media.C3612ng) r0
            int r1 = r0.f27698c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27698c = r1
            goto L18
        L13:
            com.inmobi.media.ng r0 = new com.inmobi.media.ng
            r0.<init>(r4, r9)
        L18:
            java.lang.Object r9 = r0.f27696a
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f27698c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.c.b(r9)
            goto L84
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.c.b(r9)
            if (r5 == 0) goto L4d
            int r5 = r5.intValue()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r2 = " LIMIT "
            r9.append(r2)
            r9.append(r5)
            java.lang.String r5 = r9.toString()
            if (r5 != 0) goto L4f
        L4d:
            java.lang.String r5 = ""
        L4f:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r2 = "SELECT * FROM pings WHERE priority='"
            r9.append(r2)
            r9.append(r6)
            java.lang.String r6 = "' AND retry_count=0 AND time_created<"
            r9.append(r6)
            r9.append(r7)
            java.lang.String r6 = " ORDER BY time_created ASC"
            r9.append(r6)
            r9.append(r5)
            java.lang.String r5 = r9.toString()
            com.inmobi.media.g9 r6 = r4.f27793a
            r0.f27698c = r3
            r6.getClass()
            com.inmobi.media.c9 r7 = new com.inmobi.media.c9
            r8 = 0
            r7.<init>(r6, r5, r8)
            java.lang.Object r9 = r6.a(r7, r0)
            if (r9 != r1) goto L84
            return r1
        L84:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r6 = cn.x.x(r9, r6)
            r5.<init>(r6)
            java.util.Iterator r6 = r9.iterator()
        L95:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto La9
            java.lang.Object r7 = r6.next()
            android.content.ContentValues r7 = (android.content.ContentValues) r7
            com.inmobi.media.Rf r7 = com.inmobi.media.AbstractC3662pg.a(r7)
            r5.add(r7)
            goto L95
        La9:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3637og.a(java.lang.Integer, java.lang.String, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r7, java.lang.Integer r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.inmobi.media.C3562lg
            if (r0 == 0) goto L13
            r0 = r9
            com.inmobi.media.lg r0 = (com.inmobi.media.C3562lg) r0
            int r1 = r0.f27573c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27573c = r1
            goto L18
        L13:
            com.inmobi.media.lg r0 = new com.inmobi.media.lg
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f27571a
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f27573c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.c.b(r9)
            goto L88
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            kotlin.c.b(r9)
            long r4 = java.lang.System.currentTimeMillis()
            if (r8 == 0) goto L51
            int r8 = r8.intValue()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r2 = " LIMIT "
            r9.append(r2)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            if (r8 != 0) goto L53
        L51:
            java.lang.String r8 = ""
        L53:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r2 = "SELECT * FROM pings WHERE priority='"
            r9.append(r2)
            r9.append(r7)
            java.lang.String r7 = "' AND retryAfter<="
            r9.append(r7)
            r9.append(r4)
            java.lang.String r7 = " ORDER BY time_created ASC"
            r9.append(r7)
            r9.append(r8)
            java.lang.String r7 = r9.toString()
            com.inmobi.media.g9 r8 = r6.f27793a
            r0.f27573c = r3
            r8.getClass()
            com.inmobi.media.c9 r9 = new com.inmobi.media.c9
            r2 = 0
            r9.<init>(r8, r7, r2)
            java.lang.Object r9 = r8.a(r9, r0)
            if (r9 != r1) goto L88
            return r1
        L88:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 10
            int r8 = cn.x.x(r9, r8)
            r7.<init>(r8)
            java.util.Iterator r8 = r9.iterator()
        L99:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto Lad
            java.lang.Object r9 = r8.next()
            android.content.ContentValues r9 = (android.content.ContentValues) r9
            com.inmobi.media.Rf r9 = com.inmobi.media.AbstractC3662pg.a(r9)
            r7.add(r9)
            goto L99
        Lad:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3637og.a(java.lang.String, java.lang.Integer, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.inmobi.media.C3537kg
            if (r0 == 0) goto L13
            r0 = r8
            com.inmobi.media.kg r0 = (com.inmobi.media.C3537kg) r0
            int r1 = r0.f27477d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27477d = r1
            goto L18
        L13:
            com.inmobi.media.kg r0 = new com.inmobi.media.kg
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f27475b
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f27477d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            com.inmobi.media.Rf r7 = r0.f27474a
            kotlin.c.b(r8)
            return r7
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            kotlin.c.b(r8)
            goto L67
        L3a:
            kotlin.c.b(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r2 = "SELECT * FROM pings WHERE priority='"
            r8.append(r2)
            r8.append(r7)
            java.lang.String r7 = "' ORDER BY time_created ASC LIMIT 1"
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            com.inmobi.media.g9 r8 = r6.f27793a
            r0.f27477d = r4
            r8.getClass()
            com.inmobi.media.c9 r2 = new com.inmobi.media.c9
            r5 = 0
            r2.<init>(r8, r7, r5)
            java.lang.Object r8 = r8.a(r2, r0)
            if (r8 != r1) goto L67
            goto Lab
        L67:
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r7 = new java.util.ArrayList
            r2 = 10
            int r2 = cn.x.x(r8, r2)
            r7.<init>(r2)
            java.util.Iterator r8 = r8.iterator()
        L78:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L8c
            java.lang.Object r2 = r8.next()
            android.content.ContentValues r2 = (android.content.ContentValues) r2
            com.inmobi.media.Rf r2 = com.inmobi.media.AbstractC3662pg.a(r2)
            r7.add(r2)
            goto L78
        L8c:
            java.lang.Object r7 = cn.f0.v0(r7)
            com.inmobi.media.Rf r7 = (com.inmobi.media.Rf) r7
            if (r7 == 0) goto Lac
            com.inmobi.media.g9 r8 = r6.f27793a
            java.lang.String r2 = r7.f26249b
            java.lang.String[] r4 = new java.lang.String[r4]
            r5 = 0
            r4[r5] = r2
            r0.f27474a = r7
            r0.f27477d = r3
            java.lang.String r2 = "pings"
            java.lang.String r3 = "id=?"
            java.lang.Object r8 = r8.a(r2, r3, r4, r0)
            if (r8 != r1) goto Lac
        Lab:
            return r1
        Lac:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3637og.a(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r7, java.lang.Integer r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.inmobi.media.C3587mg
            if (r0 == 0) goto L13
            r0 = r9
            com.inmobi.media.mg r0 = (com.inmobi.media.C3587mg) r0
            int r1 = r0.f27629c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27629c = r1
            goto L18
        L13:
            com.inmobi.media.mg r0 = new com.inmobi.media.mg
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f27627a
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f27629c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.c.b(r9)
            goto L88
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            kotlin.c.b(r9)
            long r4 = java.lang.System.currentTimeMillis()
            if (r8 == 0) goto L51
            int r8 = r8.intValue()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r2 = " LIMIT "
            r9.append(r2)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            if (r8 != 0) goto L53
        L51:
            java.lang.String r8 = ""
        L53:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r2 = "SELECT * FROM pings WHERE priority='"
            r9.append(r2)
            r9.append(r7)
            java.lang.String r7 = "' AND retry_count>=1 AND retryAfter<="
            r9.append(r7)
            r9.append(r4)
            java.lang.String r7 = " ORDER BY time_created ASC"
            r9.append(r7)
            r9.append(r8)
            java.lang.String r7 = r9.toString()
            com.inmobi.media.g9 r8 = r6.f27793a
            r0.f27629c = r3
            r8.getClass()
            com.inmobi.media.c9 r9 = new com.inmobi.media.c9
            r2 = 0
            r9.<init>(r8, r7, r2)
            java.lang.Object r9 = r8.a(r9, r0)
            if (r9 != r1) goto L88
            return r1
        L88:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 10
            int r8 = cn.x.x(r9, r8)
            r7.<init>(r8)
            java.util.Iterator r8 = r9.iterator()
        L99:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto Lad
            java.lang.Object r9 = r8.next()
            android.content.ContentValues r9 = (android.content.ContentValues) r9
            com.inmobi.media.Rf r9 = com.inmobi.media.AbstractC3662pg.a(r9)
            r7.add(r9)
            goto L99
        Lad:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3637og.b(java.lang.String, java.lang.Integer, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final Object b(String str, ContinuationImpl continuationImpl) {
        String str2 = "SELECT COUNT(*) FROM pings WHERE priority='" + str + "'";
        C3431g9 c3431g9 = this.f27793a;
        c3431g9.getClass();
        return c3431g9.a(new Y8(c3431g9, str2, null), continuationImpl);
    }
}
