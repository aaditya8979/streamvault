package com.moloco.sdk.acm.db;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomDatabaseKt;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import bn.r;
import com.moloco.sdk.acm.db.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import sn.l;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements com.moloco.sdk.acm.db.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f45763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityInsertionAdapter<com.moloco.sdk.acm.db.b> f45764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.acm.db.a f45765c = new com.moloco.sdk.acm.db.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final EntityInsertionAdapter<com.moloco.sdk.acm.db.b> f45766d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SharedSQLiteStatement f45767e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SharedSQLiteStatement f45768f;

    public class a extends EntityInsertionAdapter<com.moloco.sdk.acm.db.b> {
        public a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, com.moloco.sdk.acm.db.b bVar) {
            supportSQLiteStatement.bindLong(1, bVar.c());
            if (bVar.d() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, bVar.d());
            }
            supportSQLiteStatement.bindLong(3, bVar.f());
            String strB = e.this.f45765c.b(bVar.b());
            if (strB == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, strB);
            }
            if (bVar.a() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindLong(5, bVar.a().longValue());
            }
            String strC = e.this.f45765c.c(bVar.e());
            if (strC == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindString(6, strC);
            }
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR REPLACE INTO `events` (`id`,`name`,`timestamp`,`eventType`,`data`,`tags`) VALUES (nullif(?, 0),?,?,?,?,?)";
        }
    }

    public class b extends EntityInsertionAdapter<com.moloco.sdk.acm.db.b> {
        public b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, com.moloco.sdk.acm.db.b bVar) {
            supportSQLiteStatement.bindLong(1, bVar.c());
            if (bVar.d() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, bVar.d());
            }
            supportSQLiteStatement.bindLong(3, bVar.f());
            String strB = e.this.f45765c.b(bVar.b());
            if (strB == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, strB);
            }
            if (bVar.a() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindLong(5, bVar.a().longValue());
            }
            String strC = e.this.f45765c.c(bVar.e());
            if (strC == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindString(6, strC);
            }
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR ABORT INTO `events` (`id`,`name`,`timestamp`,`eventType`,`data`,`tags`) VALUES (nullif(?, 0),?,?,?,?,?)";
        }
    }

    public class c extends SharedSQLiteStatement {
        public c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM events";
        }
    }

    public class d extends SharedSQLiteStatement {
        public d(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM sqlite_sequence WHERE name='events'";
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.acm.db.e$e, reason: collision with other inner class name */
    public class CallableC0552e implements Callable<r> {
        public CallableC0552e() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public r call() throws Exception {
            SupportSQLiteStatement supportSQLiteStatementAcquire = e.this.f45768f.acquire();
            e.this.f45763a.beginTransaction();
            try {
                supportSQLiteStatementAcquire.executeUpdateDelete();
                e.this.f45763a.setTransactionSuccessful();
                return r.f5635a;
            } finally {
                e.this.f45763a.endTransaction();
                e.this.f45768f.release(supportSQLiteStatementAcquire);
            }
        }
    }

    public class f implements Callable<r> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f45774b;

        public f(List list) {
            this.f45774b = list;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public r call() throws Exception {
            StringBuilder sbNewStringBuilder = StringUtil.newStringBuilder();
            sbNewStringBuilder.append("DELETE FROM events WHERE id IN (");
            StringUtil.appendPlaceholders(sbNewStringBuilder, this.f45774b.size());
            sbNewStringBuilder.append(")");
            SupportSQLiteStatement supportSQLiteStatementCompileStatement = e.this.f45763a.compileStatement(sbNewStringBuilder.toString());
            Iterator it = this.f45774b.iterator();
            int i10 = 1;
            while (it.hasNext()) {
                supportSQLiteStatementCompileStatement.bindLong(i10, ((Long) it.next()).longValue());
                i10++;
            }
            e.this.f45763a.beginTransaction();
            try {
                supportSQLiteStatementCompileStatement.executeUpdateDelete();
                e.this.f45763a.setTransactionSuccessful();
                return r.f5635a;
            } finally {
                e.this.f45763a.endTransaction();
            }
        }
    }

    public e(RoomDatabase roomDatabase) {
        this.f45763a = roomDatabase;
        this.f45764b = new a(roomDatabase);
        this.f45766d = new b(roomDatabase);
        this.f45767e = new c(roomDatabase);
        this.f45768f = new d(roomDatabase);
    }

    public static List<Class<?>> f() {
        return Collections.emptyList();
    }

    @Override // com.moloco.sdk.acm.db.d
    public long a(com.moloco.sdk.acm.db.b bVar) {
        this.f45763a.assertNotSuspendingTransaction();
        this.f45763a.beginTransaction();
        try {
            long jInsertAndReturnId = this.f45764b.insertAndReturnId(bVar);
            this.f45763a.setTransactionSuccessful();
            return jInsertAndReturnId;
        } finally {
            this.f45763a.endTransaction();
        }
    }

    @Override // com.moloco.sdk.acm.db.d
    public Object a(hn.c<? super List<com.moloco.sdk.acm.db.b>> cVar) {
        return RoomDatabaseKt.withTransaction(this.f45763a, new l() { // from class: com.moloco.sdk.acm.db.f
            @Override // sn.l
            public final Object invoke(Object obj) {
                return this.f45776b.h((hn.c) obj);
            }
        }, cVar);
    }

    @Override // com.moloco.sdk.acm.db.d
    public Object b(List<Long> list, hn.c<? super r> cVar) {
        return CoroutinesRoom.execute(this.f45763a, true, new f(list), cVar);
    }

    @Override // com.moloco.sdk.acm.db.d
    public List<com.moloco.sdk.acm.db.b> b() {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM events LIMIT 900", 0);
        this.f45763a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.f45763a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "name");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "eventType");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "data");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "tags");
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(new com.moloco.sdk.acm.db.b(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2), cursorQuery.getLong(columnIndexOrThrow3), this.f45765c.a(cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4)), cursorQuery.isNull(columnIndexOrThrow5) ? null : Long.valueOf(cursorQuery.getLong(columnIndexOrThrow5)), this.f45765c.d(cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6))));
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // com.moloco.sdk.acm.db.d
    public Object c(hn.c<? super r> cVar) {
        return CoroutinesRoom.execute(this.f45763a, true, new CallableC0552e(), cVar);
    }

    public final /* synthetic */ Object h(hn.c cVar) {
        return d.a.a(this, cVar);
    }
}
