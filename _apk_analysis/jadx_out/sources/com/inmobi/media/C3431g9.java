package com.inmobi.media;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.g9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3431g9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3854x9 f27212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3526k5 f27213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SQLiteDatabase f27214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SQLiteDatabase f27215d;

    public C3431g9(C3854x9 c3854x9, C3526k5 c3526k5) {
        tn.p.k(c3854x9, "sqLiteOpenHelper");
        tn.p.k(c3526k5, "databaseConfig");
        this.f27212a = c3854x9;
        this.f27213b = c3526k5;
    }

    public static Object a(C3431g9 c3431g9, String str, ContentValues contentValues, String str2, String[] strArr, ContinuationImpl continuationImpl, int i10) {
        String str3 = (i10 & 4) != 0 ? null : str2;
        String[] strArr2 = (i10 & 8) != 0 ? null : strArr;
        c3431g9.getClass();
        Object objA = c3431g9.a(new C3405f9(c3431g9, new C3379e9(str, contentValues, str3, strArr2, null), null), continuationImpl);
        return objA == in.a.g() ? objA : bn.r.f5635a;
    }

    public static /* synthetic */ Object a(C3431g9 c3431g9, String str, String str2, ContinuationImpl continuationImpl, int i10) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return c3431g9.a(str, str2, (String[]) null, continuationImpl);
    }

    public final Object a(String str, ContentValues contentValues, int i10, ContinuationImpl continuationImpl) {
        Object objA = a(new C3405f9(this, new C3354d9(str, contentValues, i10, null), null), continuationImpl);
        return objA == in.a.g() ? objA : bn.r.f5635a;
    }

    public final Object a(String str, String str2, String[] strArr, hn.c cVar) {
        Object objA = a(new C3405f9(this, new Z8(str, str2, strArr, null), null), cVar);
        return objA == in.a.g() ? objA : bn.r.f5635a;
    }

    public final Object a(String str, ContinuationImpl continuationImpl) {
        Object objA = a(new C3405f9(this, new C3276a9(str, null), null), continuationImpl);
        return objA == in.a.g() ? objA : bn.r.f5635a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(sn.l r5, hn.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.inmobi.media.C3302b9
            if (r0 == 0) goto L13
            r0 = r6
            com.inmobi.media.b9 r0 = (com.inmobi.media.C3302b9) r0
            int r1 = r0.f26847d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26847d = r1
            goto L18
        L13:
            com.inmobi.media.b9 r0 = new com.inmobi.media.b9
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f26845b
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f26847d
            r3 = 2
            if (r2 == 0) goto L3d
            r5 = 1
            if (r2 == r5) goto L34
            if (r2 != r3) goto L2c
            kotlin.c.b(r6)
            return r6
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            sn.l r5 = r0.f26844a
            kotlin.c.b(r6)
            if (r6 != 0) goto L3c
            goto L40
        L3c:
            return r6
        L3d:
            kotlin.c.b(r6)
        L40:
            r6 = 0
            r0.f26844a = r6
            r0.f26847d = r3
            java.lang.Object r5 = r5.invoke(r0)
            if (r5 != r1) goto L4c
            return r1
        L4c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3431g9.a(sn.l, hn.c):java.lang.Object");
    }
}
