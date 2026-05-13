package com.inmobi.media;

import android.database.sqlite.SQLiteDatabase;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.a9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3276a9 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f26764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f26765b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3276a9(String str, hn.c cVar) {
        super(2, cVar);
        this.f26765b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        C3276a9 c3276a9 = new C3276a9(this.f26765b, cVar);
        c3276a9.f26764a = obj;
        return c3276a9;
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        C3276a9 c3276a9 = new C3276a9(this.f26765b, (hn.c) obj2);
        c3276a9.f26764a = (C3431g9) obj;
        return c3276a9.invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        SQLiteDatabase sQLiteDatabase = ((C3431g9) this.f26764a).f27214c;
        if (sQLiteDatabase != null) {
            sQLiteDatabase.execSQL(this.f26765b);
        }
        return bn.r.f5635a;
    }
}
