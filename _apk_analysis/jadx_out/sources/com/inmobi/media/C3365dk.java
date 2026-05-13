package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.dk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3365dk extends AbstractC3351d6 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3431g9 f27054c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3365dk(C3431g9 c3431g9) {
        super("telemetry", c3431g9);
        tn.p.k(c3431g9, "databaseHelper");
        this.f27054c = c3431g9;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.inmobi.media.AbstractC3351d6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(int r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.inmobi.media.C3339ck
            if (r0 == 0) goto L13
            r0 = r9
            com.inmobi.media.ck r0 = (com.inmobi.media.C3339ck) r0
            int r1 = r0.f26996c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26996c = r1
            goto L18
        L13:
            com.inmobi.media.ck r0 = new com.inmobi.media.ck
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f26994a
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f26996c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.c.b(r9)
            goto L59
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            kotlin.c.b(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r2 = "SELECT * FROM telemetry ORDER BY ts ASC LIMIT "
            r9.append(r2)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            com.inmobi.media.g9 r9 = r7.f27054c
            r0.f26996c = r3
            r9.getClass()
            com.inmobi.media.c9 r2 = new com.inmobi.media.c9
            r3 = 0
            r2.<init>(r9, r8, r3)
            java.lang.Object r9 = r9.a(r2, r0)
            if (r9 != r1) goto L59
            return r1
        L59:
            java.util.List r9 = (java.util.List) r9
            java.util.ArrayList r8 = new java.util.ArrayList
            r0 = 10
            int r0 = cn.x.x(r9, r0)
            r8.<init>(r0)
            java.util.Iterator r9 = r9.iterator()
        L6a:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto Lbe
            java.lang.Object r0 = r9.next()
            android.content.ContentValues r0 = (android.content.ContentValues) r0
            java.lang.String r1 = "contentValues"
            tn.p.k(r0, r1)
            java.lang.String r1 = "eventType"
            java.lang.String r1 = r0.getAsString(r1)
            java.lang.String r2 = "payload"
            java.lang.String r2 = r0.getAsString(r2)
            java.lang.String r3 = "eventSource"
            java.lang.String r3 = r0.getAsString(r3)
            java.lang.String r4 = "ts"
            java.lang.String r4 = r0.getAsString(r4)
            java.lang.String r5 = "getAsString(...)"
            tn.p.j(r4, r5)
            long r4 = java.lang.Long.parseLong(r4)
            com.inmobi.media.ek r6 = new com.inmobi.media.ek
            tn.p.h(r1)
            tn.p.h(r3)
            r6.<init>(r1, r2, r3)
            r6.f27326c = r4
            java.lang.String r1 = "id"
            java.lang.Integer r0 = r0.getAsInteger(r1)
            java.lang.String r1 = "getAsInteger(...)"
            tn.p.j(r0, r1)
            int r0 = r0.intValue()
            r6.f27327d = r0
            r8.add(r6)
            goto L6a
        Lbe:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3365dk.b(int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
