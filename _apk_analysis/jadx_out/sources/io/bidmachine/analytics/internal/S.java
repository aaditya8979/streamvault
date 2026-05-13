package io.bidmachine.analytics.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010!\u001a\u00020\u001f¢\u0006\u0004\b\"\u0010#JH\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\n\u0010\u000bJ6\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\u0006\u0010\r\u001a\u00020\f2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\n\u0010\u0010J&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\u0006\u0010\u0011\u001a\u00020\tH\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\n\u0010\u0012J4\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\n\u0010\u0015J>\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0016H\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\n\u0010\u0017J,\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0018\u0010\u0019J,\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0007H\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\n\u0010\u001bJ,\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\n\u0010\u0019J4\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\u0006\u0010\u001c\u001a\u00020\u00022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\n\u0010\u001eR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010 \u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006$"}, d2 = {"Lio/bidmachine/analytics/internal/S;", "", "", "selection", "", "selectionArgs", "limit", "Lkotlin/Result;", "", "Lio/bidmachine/analytics/internal/T;", "a", "(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", "", "isReserved", "entityList", "Lbn/r;", "(ZLjava/util/List;)Ljava/lang/Object;", "entity", "(Lio/bidmachine/analytics/internal/T;)Ljava/lang/Object;", "monitorName", JsonStorageKeyNames.SESSION_ID_KEY, "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/Object;", "c", "(Ljava/util/List;)Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "excludeSessionId", "excludeMonitorNameList", "(Ljava/lang/String;Ljava/util/List;)Ljava/lang/Object;", "Landroid/database/sqlite/SQLiteOpenHelper;", "Landroid/database/sqlite/SQLiteOpenHelper;", "sqLiteOpenHelper", "<init>", "(Landroid/database/sqlite/SQLiteOpenHelper;)V", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
public final class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final SQLiteOpenHelper sqLiteOpenHelper;

    @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lio/bidmachine/analytics/internal/T;", "entitiesChunk", "Lbn/r;", "a", "(Ljava/util/List;)V"}, k = 3, mv = {1, 7, 1})
    public static final class b extends Lambda implements sn.l<List<? extends T>, bn.r> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SQLiteDatabase f68766a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ContentValues f68767b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(SQLiteDatabase sQLiteDatabase, ContentValues contentValues) {
            super(1);
            this.f68766a = sQLiteDatabase;
            this.f68767b = contentValues;
        }

        public final void a(List<T> list) {
            SQLiteDatabase sQLiteDatabase = this.f68766a;
            ContentValues contentValues = this.f68767b;
            String[] strArrA = null;
            String strA = list != null ? C5338q.a(list, "id IN") : null;
            if (list != null) {
                ArrayList arrayList = new ArrayList(cn.x.x(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((T) it.next()).getId());
                }
                strArrA = C5338q.a(arrayList);
            }
            sQLiteDatabase.update("monitor_record", contentValues, strA, strArrA);
        }

        @Override // sn.l
        public /* bridge */ /* synthetic */ bn.r invoke(List<? extends T> list) {
            a(list);
            return bn.r.f5635a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lio/bidmachine/analytics/internal/T;", "entitiesChunk", "Lbn/r;", "a", "(Ljava/util/List;)V"}, k = 3, mv = {1, 7, 1})
    public static final class c extends Lambda implements sn.l<List<? extends T>, bn.r> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SQLiteDatabase f68768a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(SQLiteDatabase sQLiteDatabase) {
            super(1);
            this.f68768a = sQLiteDatabase;
        }

        public final void a(List<T> list) {
            SQLiteDatabase sQLiteDatabase = this.f68768a;
            String[] strArrA = null;
            String strA = list != null ? C5338q.a(list, "id IN") : null;
            if (list != null) {
                ArrayList arrayList = new ArrayList(cn.x.x(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((T) it.next()).getId());
                }
                strArrA = C5338q.a(arrayList);
            }
            sQLiteDatabase.delete("monitor_record", strA, strArrA);
        }

        @Override // sn.l
        public /* bridge */ /* synthetic */ bn.r invoke(List<? extends T> list) {
            a(list);
            return bn.r.f5635a;
        }
    }

    public S(SQLiteOpenHelper sQLiteOpenHelper) {
        this.sqLiteOpenHelper = sQLiteOpenHelper;
    }

    private final Object a(String selection, String[] selectionArgs, String limit) {
        SQLiteDatabase readableDatabase;
        ArrayList arrayList = new ArrayList();
        synchronized (this.sqLiteOpenHelper) {
            try {
                Result.a aVar = Result.Companion;
                readableDatabase = this.sqLiteOpenHelper.getReadableDatabase();
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                Result.m7534constructorimpl(kotlin.c.a(th2));
            }
            try {
                Cursor cursorQuery = readableDatabase.query("monitor_record", new String[]{"id", "name", "timestamp", "session_id", "data", "error"}, selection, selectionArgs, null, null, "timestamp DESC", limit);
                while (cursorQuery.moveToNext()) {
                    try {
                        try {
                            Result.a aVar3 = Result.Companion;
                            String string = cursorQuery.getString(0);
                            String string2 = cursorQuery.getString(1);
                            long j10 = cursorQuery.getLong(2);
                            Result.m7534constructorimpl(Boolean.valueOf(arrayList.add(new T(string, string2, cursorQuery.getString(3), j10, s0.a(cursorQuery.getBlob(4), string), s0.a(cursorQuery.getBlob(5), string)))));
                        } catch (Throwable th3) {
                            Result.a aVar4 = Result.Companion;
                            Result.m7534constructorimpl(kotlin.c.a(th3));
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
        }
        return Result.m7534constructorimpl(arrayList);
    }

    private final Object a(boolean isReserved, List<T> entityList) {
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

    public final Object a() {
        return a(false, (List<T>) null);
    }

    public final Object a(T entity) {
        Object objM7534constructorimpl;
        synchronized (this.sqLiteOpenHelper) {
            try {
                Result.a aVar = Result.Companion;
                SQLiteDatabase writableDatabase = this.sqLiteOpenHelper.getWritableDatabase();
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("id", entity.getId());
                    contentValues.put("name", entity.getName());
                    contentValues.put("timestamp", Long.valueOf(entity.getTimestamp()));
                    contentValues.put("session_id", entity.getCom.unity3d.services.core.device.reader.JsonStorageKeyNames.SESSION_ID_KEY java.lang.String());
                    contentValues.put("data", s0.b(entity.getData(), entity.getId()));
                    contentValues.put("error", s0.b(entity.getError(), entity.getId()));
                    writableDatabase.insert("monitor_record", null, contentValues);
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

    public final Object a(String monitorName, String sessionId) {
        return a(monitorName, sessionId, (Integer) null);
    }

    public final Object a(String monitorName, String sessionId, Integer limit) {
        return a("name = ? AND session_id = ? AND is_reserved = 0", new String[]{monitorName, sessionId}, limit != null ? limit.toString() : null);
    }

    public final Object a(String excludeSessionId, List<String> excludeMonitorNameList) {
        Object objM7534constructorimpl;
        synchronized (this.sqLiteOpenHelper) {
            try {
                Result.a aVar = Result.Companion;
                SQLiteDatabase writableDatabase = this.sqLiteOpenHelper.getWritableDatabase();
                try {
                    writableDatabase.delete("monitor_record", "session_id != ? OR " + C5338q.a(excludeMonitorNameList, "name NOT IN"), C5338q.a(cn.f0.O0(cn.v.e(excludeSessionId), excludeMonitorNameList)));
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

    public final Object a(List<T> entityList) {
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

    public final Object b(List<T> entityList) {
        return a(false, entityList);
    }

    public final Object c(List<T> entityList) {
        return a(true, entityList);
    }
}
