package com.inmobi.media;

import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes9.dex */
public final class Y8 extends SuspendLambda implements sn.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3431g9 f26624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f26625b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y8(C3431g9 c3431g9, String str, hn.c cVar) {
        super(1, cVar);
        this.f26624a = c3431g9;
        this.f26625b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(hn.c cVar) {
        return new Y8(this.f26624a, this.f26625b, cVar);
    }

    @Override // sn.l
    public final Object invoke(Object obj) {
        return new Y8(this.f26624a, this.f26625b, (hn.c) obj).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        SQLiteDatabase sQLiteDatabase = this.f26624a.f27215d;
        return sQLiteDatabase == null ? jn.a.d(0) : jn.a.d((int) DatabaseUtils.longForQuery(sQLiteDatabase, this.f26625b, null));
    }
}
