package com.inmobi.media;

import android.database.sqlite.SQLiteDatabase;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.f9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3405f9 extends SuspendLambda implements sn.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SQLiteDatabase f27154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3431g9 f27156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SuspendLambda f27157d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C3405f9(C3431g9 c3431g9, sn.p pVar, hn.c cVar) {
        super(1, cVar);
        this.f27156c = c3431g9;
        this.f27157d = (SuspendLambda) pVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, sn.p] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(hn.c cVar) {
        return new C3405f9(this.f27156c, this.f27157d, cVar);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, sn.p] */
    @Override // sn.l
    public final Object invoke(Object obj) {
        return new C3405f9(this.f27156c, this.f27157d, (hn.c) obj).invokeSuspend(bn.r.f5635a);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0058  */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, sn.p] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            java.lang.Object r0 = in.a.g()
            int r1 = r6.f27155b
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            android.database.sqlite.SQLiteDatabase r0 = r6.f27154a
            kotlin.c.b(r7)     // Catch: java.lang.Throwable -> L11
            goto L40
        L11:
            r7 = move-exception
            goto L4f
        L13:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1b:
            kotlin.c.b(r7)
            com.inmobi.media.g9 r7 = r6.f27156c
            android.database.sqlite.SQLiteDatabase r1 = r7.f27214c
            if (r1 == 0) goto L5c
            kotlin.coroutines.jvm.internal.SuspendLambda r3 = r6.f27157d
            com.inmobi.media.k5 r4 = r7.f27213b
            int r4 = r4.f27448c
            r5 = 2
            if (r4 != r5) goto L31
            r1.beginTransactionNonExclusive()
            goto L34
        L31:
            r1.beginTransaction()
        L34:
            r6.f27154a = r1     // Catch: java.lang.Throwable -> L51
            r6.f27155b = r2     // Catch: java.lang.Throwable -> L51
            java.lang.Object r7 = r3.mo2invoke(r7, r6)     // Catch: java.lang.Throwable -> L51
            if (r7 != r0) goto L3f
            return r0
        L3f:
            r0 = r1
        L40:
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L11
            boolean r7 = r0.inTransaction()
            if (r7 == 0) goto L4c
            r0.endTransaction()
        L4c:
            bn.r r7 = bn.r.f5635a
            return r7
        L4f:
            r1 = r0
            goto L52
        L51:
            r7 = move-exception
        L52:
            boolean r0 = r1.inTransaction()
            if (r0 == 0) goto L5b
            r1.endTransaction()
        L5b:
            throw r7
        L5c:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3405f9.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
