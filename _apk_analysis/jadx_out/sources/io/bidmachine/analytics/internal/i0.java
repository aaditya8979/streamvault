package io.bidmachine.analytics.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010&\u001a\u00020$¢\u0006\u0004\b'\u0010(JN\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\n\u0010\u000bJ6\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\u0006\u0010\r\u001a\u00020\f2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\n\u0010\u0010J\u000f\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u0011J\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\tH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\u0006\u0010\u0015\u001a\u00020\tH\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\n\u0010\u0016J&\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\u0006\u0010\u0015\u001a\u00020\tH\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0017\u0010\u0016J.\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00072\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\n\u0010\u001aJ,\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0018\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\n\u0010\u001bJ,\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ,\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001e\u0010\u001dJ\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0007H\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0013\u0010\u001fJ,\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\n\u0010\u001dJ4\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\u0006\u0010\u0018\u001a\u00020\u00022\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\n\u0010!J,\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0013\u0010\u001dJ,\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0017\u0010\u001dR\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010%\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006)"}, d2 = {"Lio/bidmachine/analytics/internal/i0;", "", "", "selection", "", "selectionArgs", "limit", "Lkotlin/Result;", "", "Lio/bidmachine/analytics/internal/j0;", "a", "(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", "", "isReserved", "entityList", "Lbn/r;", "(ZLjava/util/List;)Ljava/lang/Object;", "()Ljava/lang/String;", "Landroid/content/ContentValues;", "b", "(Lio/bidmachine/analytics/internal/j0;)Landroid/content/ContentValues;", "entity", "(Lio/bidmachine/analytics/internal/j0;)Ljava/lang/Object;", "c", "readerName", "rule", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", "(Ljava/lang/String;)Ljava/lang/Object;", "e", "(Ljava/util/List;)Ljava/lang/Object;", "d", "()Ljava/lang/Object;", "readerRuleList", "(Ljava/lang/String;Ljava/util/List;)Ljava/lang/Object;", "excludeReaderNameList", "excludeReaderRuleList", "Landroid/database/sqlite/SQLiteOpenHelper;", "Landroid/database/sqlite/SQLiteOpenHelper;", "sqLiteOpenHelper", "<init>", "(Landroid/database/sqlite/SQLiteOpenHelper;)V", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final SQLiteOpenHelper sqLiteOpenHelper;

    @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lio/bidmachine/analytics/internal/j0;", "entitiesChunk", "Lbn/r;", "a", "(Ljava/util/List;)V"}, k = 3, mv = {1, 7, 1})
    public static final class b extends Lambda implements sn.l<List<? extends j0>, bn.r> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SQLiteDatabase f68893a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ContentValues f68894b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(SQLiteDatabase sQLiteDatabase, ContentValues contentValues) {
            super(1);
            this.f68893a = sQLiteDatabase;
            this.f68894b = contentValues;
        }

        public final void a(List<j0> list) {
            SQLiteDatabase sQLiteDatabase = this.f68893a;
            ContentValues contentValues = this.f68894b;
            String[] strArrA = null;
            String strA = list != null ? C5338q.a(list, "id IN") : null;
            if (list != null) {
                ArrayList arrayList = new ArrayList(cn.x.x(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((j0) it.next()).getId());
                }
                strArrA = C5338q.a(arrayList);
            }
            sQLiteDatabase.update("reader_record", contentValues, strA, strArrA);
        }

        @Override // sn.l
        public /* bridge */ /* synthetic */ bn.r invoke(List<? extends j0> list) {
            a(list);
            return bn.r.f5635a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lio/bidmachine/analytics/internal/j0;", "entitiesChunk", "Lbn/r;", "a", "(Ljava/util/List;)V"}, k = 3, mv = {1, 7, 1})
    public static final class c extends Lambda implements sn.l<List<? extends j0>, bn.r> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SQLiteDatabase f68895a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(SQLiteDatabase sQLiteDatabase) {
            super(1);
            this.f68895a = sQLiteDatabase;
        }

        public final void a(List<j0> list) {
            SQLiteDatabase sQLiteDatabase = this.f68895a;
            String[] strArrA = null;
            String strA = list != null ? C5338q.a(list, "id IN") : null;
            if (list != null) {
                ArrayList arrayList = new ArrayList(cn.x.x(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((j0) it.next()).getId());
                }
                strArrA = C5338q.a(arrayList);
            }
            sQLiteDatabase.delete("reader_record", strA, strArrA);
        }

        @Override // sn.l
        public /* bridge */ /* synthetic */ bn.r invoke(List<? extends j0> list) {
            a(list);
            return bn.r.f5635a;
        }
    }

    public i0(SQLiteOpenHelper sQLiteOpenHelper) {
        this.sqLiteOpenHelper = sQLiteOpenHelper;
    }

    public static /* synthetic */ Object a(i0 i0Var, String str, String[] strArr, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            strArr = null;
        }
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        return i0Var.a(str, strArr, str2);
    }

    private final Object a(String selection, String[] selectionArgs, String limit) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.sqLiteOpenHelper) {
            try {
                Result.a aVar = Result.Companion;
                SQLiteDatabase readableDatabase = this.sqLiteOpenHelper.getReadableDatabase();
                try {
                    Cursor cursorQuery = readableDatabase.query("reader_record", new String[]{"id", "name", "timestamp", "data_hash", "rule", "error", "is_dirty"}, selection, selectionArgs, null, null, "timestamp DESC", limit);
                    while (cursorQuery.moveToNext()) {
                        try {
                            try {
                                Result.a aVar2 = Result.Companion;
                                String string = cursorQuery.getString(0);
                                Result.m7534constructorimpl(Boolean.valueOf(arrayList.add(new j0(string, cursorQuery.getString(1), cursorQuery.getLong(2), cursorQuery.getString(3), s0.a(cursorQuery.getString(4)), s0.a(cursorQuery.getBlob(5), string), cursorQuery.getInt(6) == 1))));
                            } catch (Throwable th2) {
                                Result.a aVar3 = Result.Companion;
                                Result.m7534constructorimpl(kotlin.c.a(th2));
                            }
                        } finally {
                        }
                    }
                    bn.r rVar = bn.r.f5635a;
                    on.b.a(cursorQuery, null);
                    on.b.a(readableDatabase, null);
                    Result.m7534constructorimpl(rVar);
                } finally {
                }
            } catch (Throwable th3) {
                Result.a aVar4 = Result.Companion;
                Result.m7534constructorimpl(kotlin.c.a(th3));
            }
        }
        return Result.m7534constructorimpl(arrayList);
    }

    private final Object a(boolean isReserved, List<j0> entityList) {
        Object objM7534constructorimpl;
        synchronized (this.sqLiteOpenHelper) {
            try {
                Result.a aVar = Result.Companion;
                SQLiteDatabase writableDatabase = this.sqLiteOpenHelper.getWritableDatabase();
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("is_reserved", Boolean.valueOf(isReserved));
                    C5338q.a(entityList, writableDatabase, 0, new b(writableDatabase, contentValues), 2, null);
                    bn.r rVar = bn.r.f5635a;
                    on.b.a(writableDatabase, null);
                    objM7534constructorimpl = Result.m7534constructorimpl(rVar);
                } finally {
                }
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
            }
        }
        return objM7534constructorimpl;
    }

    private final String a() {
        return "(LENGTH(error) = 0 OR error IS NULL)";
    }

    private final ContentValues b(j0 j0Var) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", j0Var.getId());
        contentValues.put("name", j0Var.getName());
        contentValues.put("timestamp", Long.valueOf(j0Var.getTimestamp()));
        contentValues.put("data_hash", j0Var.getDataHash());
        contentValues.put("rule", s0.c(j0Var.getRule()));
        contentValues.put("error", s0.b(j0Var.getError(), j0Var.getId()));
        contentValues.put("is_dirty", Boolean.valueOf(j0Var.getIsDirty()));
        return contentValues;
    }

    public final Object a(j0 entity) {
        Object objM7534constructorimpl;
        synchronized (this.sqLiteOpenHelper) {
            try {
                Result.a aVar = Result.Companion;
                SQLiteDatabase writableDatabase = this.sqLiteOpenHelper.getWritableDatabase();
                try {
                    writableDatabase.insert("reader_record", null, b(entity));
                    bn.r rVar = bn.r.f5635a;
                    on.b.a(writableDatabase, null);
                    objM7534constructorimpl = Result.m7534constructorimpl(rVar);
                } finally {
                }
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
            }
        }
        return objM7534constructorimpl;
    }

    public final Object a(String readerName) {
        return a(this, "name = ? AND is_reserved = 0 AND is_dirty = 1", new String[]{readerName}, null, 4, null);
    }

    public final Object a(String readerName, String rule) {
        Object objA = a(this, "name = ? AND rule = ? AND " + a(), new String[]{readerName, s0.c(rule)}, null, 4, null);
        if (Result.m7539isFailureimpl(objA)) {
            Throwable thM7537exceptionOrNullimpl = Result.m7537exceptionOrNullimpl(objA);
            if (thM7537exceptionOrNullimpl == null) {
                thM7537exceptionOrNullimpl = new Exception();
            }
            return Result.m7534constructorimpl(kotlin.c.a(thM7537exceptionOrNullimpl));
        }
        if (Result.m7539isFailureimpl(objA)) {
            objA = null;
        }
        List list = (List) objA;
        return Result.m7534constructorimpl(list != null ? (j0) cn.f0.v0(list) : null);
    }

    public final Object a(String readerName, List<String> readerRuleList) {
        Object objM7534constructorimpl;
        synchronized (this.sqLiteOpenHelper) {
            try {
                Result.a aVar = Result.Companion;
                ArrayList arrayList = new ArrayList(cn.x.x(readerRuleList, 10));
                Iterator<T> it = readerRuleList.iterator();
                while (it.hasNext()) {
                    arrayList.add(s0.c((String) it.next()));
                }
                SQLiteDatabase writableDatabase = this.sqLiteOpenHelper.getWritableDatabase();
                try {
                    writableDatabase.delete("reader_record", "name = ? AND " + a() + " AND " + C5338q.a(arrayList, "rule IN"), C5338q.a(cn.f0.O0(cn.v.e(readerName), arrayList)));
                    bn.r rVar = bn.r.f5635a;
                    on.b.a(writableDatabase, null);
                    objM7534constructorimpl = Result.m7534constructorimpl(rVar);
                } finally {
                }
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
            }
        }
        return objM7534constructorimpl;
    }

    public final Object a(List<j0> entityList) {
        Object objM7534constructorimpl;
        synchronized (this.sqLiteOpenHelper) {
            try {
                Result.a aVar = Result.Companion;
                SQLiteDatabase writableDatabase = this.sqLiteOpenHelper.getWritableDatabase();
                try {
                    C5338q.a(entityList, writableDatabase, 0, new c(writableDatabase), 2, null);
                    bn.r rVar = bn.r.f5635a;
                    on.b.a(writableDatabase, null);
                    objM7534constructorimpl = Result.m7534constructorimpl(rVar);
                } finally {
                }
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
            }
        }
        return objM7534constructorimpl;
    }

    public final Object b() {
        return a(false, (List<j0>) null);
    }

    public final Object b(List<String> excludeReaderNameList) {
        Object objM7534constructorimpl;
        synchronized (this.sqLiteOpenHelper) {
            try {
                Result.a aVar = Result.Companion;
                SQLiteDatabase writableDatabase = this.sqLiteOpenHelper.getWritableDatabase();
                try {
                    writableDatabase.delete("reader_record", C5338q.a(excludeReaderNameList, "name NOT IN"), C5338q.a(excludeReaderNameList));
                    bn.r rVar = bn.r.f5635a;
                    on.b.a(writableDatabase, null);
                    objM7534constructorimpl = Result.m7534constructorimpl(rVar);
                } finally {
                }
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
            }
        }
        return objM7534constructorimpl;
    }

    public final Object c(j0 entity) {
        Object objM7534constructorimpl;
        synchronized (this.sqLiteOpenHelper) {
            try {
                Result.a aVar = Result.Companion;
                SQLiteDatabase writableDatabase = this.sqLiteOpenHelper.getWritableDatabase();
                try {
                    writableDatabase.update("reader_record", b(entity), "id = ?", new String[]{entity.getId()});
                    bn.r rVar = bn.r.f5635a;
                    on.b.a(writableDatabase, null);
                    objM7534constructorimpl = Result.m7534constructorimpl(rVar);
                } finally {
                }
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
            }
        }
        return objM7534constructorimpl;
    }

    public final Object c(List<String> excludeReaderRuleList) {
        Object objM7534constructorimpl;
        synchronized (this.sqLiteOpenHelper) {
            try {
                Result.a aVar = Result.Companion;
                ArrayList arrayList = new ArrayList(cn.x.x(excludeReaderRuleList, 10));
                Iterator<T> it = excludeReaderRuleList.iterator();
                while (it.hasNext()) {
                    arrayList.add(s0.c((String) it.next()));
                }
                SQLiteDatabase writableDatabase = this.sqLiteOpenHelper.getWritableDatabase();
                try {
                    writableDatabase.delete("reader_record", C5338q.a(arrayList, "rule NOT IN"), C5338q.a(arrayList));
                    bn.r rVar = bn.r.f5635a;
                    on.b.a(writableDatabase, null);
                    objM7534constructorimpl = Result.m7534constructorimpl(rVar);
                } finally {
                }
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
            }
        }
        return objM7534constructorimpl;
    }

    public final Object d(List<j0> entityList) {
        return a(false, entityList);
    }

    public final Object e(List<j0> entityList) {
        return a(true, entityList);
    }
}
