package com.inmobi.media;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.d9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3354d9 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f27022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f27023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ContentValues f27024c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f27025d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3354d9(String str, ContentValues contentValues, int i10, hn.c cVar) {
        super(2, cVar);
        this.f27023b = str;
        this.f27024c = contentValues;
        this.f27025d = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        C3354d9 c3354d9 = new C3354d9(this.f27023b, this.f27024c, this.f27025d, cVar);
        c3354d9.f27022a = obj;
        return c3354d9;
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((C3354d9) create((C3431g9) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        SQLiteDatabase sQLiteDatabase = ((C3431g9) this.f27022a).f27214c;
        if (sQLiteDatabase != null) {
            jn.a.e(sQLiteDatabase.insertWithOnConflict(this.f27023b, null, this.f27024c, this.f27025d));
        }
        return bn.r.f5635a;
    }
}
