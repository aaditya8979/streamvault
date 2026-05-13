package com.inmobi.media;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.c9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3328c9 extends SuspendLambda implements sn.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3431g9 f26922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f26923b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3328c9(C3431g9 c3431g9, String str, hn.c cVar) {
        super(1, cVar);
        this.f26922a = c3431g9;
        this.f26923b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(hn.c cVar) {
        return new C3328c9(this.f26922a, this.f26923b, cVar);
    }

    @Override // sn.l
    public final Object invoke(Object obj) {
        return new C3328c9(this.f26922a, this.f26923b, (hn.c) obj).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        SQLiteDatabase sQLiteDatabase = this.f26922a.f27215d;
        if (sQLiteDatabase == null) {
            return cn.w.m();
        }
        ArrayList arrayList = new ArrayList();
        try {
            Cursor cursorRawQuery = sQLiteDatabase.rawQuery(this.f26923b, null);
            try {
                if (cursorRawQuery.moveToFirst()) {
                    do {
                        ContentValues contentValues = new ContentValues();
                        DatabaseUtils.cursorRowToContentValues(cursorRawQuery, contentValues);
                        arrayList.add(contentValues);
                    } while (cursorRawQuery.moveToNext());
                }
                bn.r rVar = bn.r.f5635a;
                on.b.a(cursorRawQuery, null);
                return arrayList;
            } finally {
            }
        } catch (Exception unused) {
            return arrayList;
        }
    }
}
