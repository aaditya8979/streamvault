package com.inmobi.media;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.e9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3379e9 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f27099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f27100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ContentValues f27101c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f27102d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String[] f27103e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3379e9(String str, ContentValues contentValues, String str2, String[] strArr, hn.c cVar) {
        super(2, cVar);
        this.f27100b = str;
        this.f27101c = contentValues;
        this.f27102d = str2;
        this.f27103e = strArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        C3379e9 c3379e9 = new C3379e9(this.f27100b, this.f27101c, this.f27102d, this.f27103e, cVar);
        c3379e9.f27099a = obj;
        return c3379e9;
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((C3379e9) create((C3431g9) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        SQLiteDatabase sQLiteDatabase = ((C3431g9) this.f27099a).f27214c;
        if (sQLiteDatabase != null) {
            jn.a.d(sQLiteDatabase.updateWithOnConflict(this.f27100b, this.f27101c, this.f27102d, this.f27103e, 4));
        }
        return bn.r.f5635a;
    }
}
