package com.inmobi.media;

import android.database.sqlite.SQLiteDatabase;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes10.dex */
public final class Z8 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f26692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f26693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f26694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String[] f26695d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z8(String str, String str2, String[] strArr, hn.c cVar) {
        super(2, cVar);
        this.f26693b = str;
        this.f26694c = str2;
        this.f26695d = strArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        Z8 z82 = new Z8(this.f26693b, this.f26694c, this.f26695d, cVar);
        z82.f26692a = obj;
        return z82;
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((Z8) create((C3431g9) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        SQLiteDatabase sQLiteDatabase = ((C3431g9) this.f26692a).f27214c;
        if (sQLiteDatabase != null) {
            jn.a.d(sQLiteDatabase.delete(this.f26693b, this.f26694c, this.f26695d));
        }
        return bn.r.f5635a;
    }
}
