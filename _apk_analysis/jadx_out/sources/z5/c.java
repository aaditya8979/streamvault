package z5;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.WorkerThread;
import com.google.android.exoplayer.database.DatabaseIOException;
import com.ironsource.Z7;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: CacheFileMetadataIndex.java */
/* JADX INFO: loaded from: classes12.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f98202c = {"name", "length", "last_touch_timestamp"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h4.a f98203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f98204b;

    public c(h4.a aVar) {
        this.f98203a = aVar;
    }

    public static void a(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
    }

    public static String d(String str) {
        return "ExoPlayerCacheFileMetadata" + str;
    }

    @WorkerThread
    public static void delete(h4.a aVar, long j10) throws DatabaseIOException {
        String hexString = Long.toHexString(j10);
        try {
            String strD = d(hexString);
            SQLiteDatabase writableDatabase = aVar.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                h4.c.c(writableDatabase, 2, hexString);
                a(writableDatabase, strD);
                writableDatabase.setTransactionSuccessful();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e10) {
            throw new DatabaseIOException(e10);
        }
    }

    @WorkerThread
    public Map<String, b> b() throws DatabaseIOException {
        try {
            Cursor cursorC = c();
            try {
                HashMap map = new HashMap(cursorC.getCount());
                while (cursorC.moveToNext()) {
                    map.put(cursorC.getString(0), new b(cursorC.getLong(1), cursorC.getLong(2)));
                }
                cursorC.close();
                return map;
            } finally {
            }
        } catch (SQLException e10) {
            throw new DatabaseIOException(e10);
        }
    }

    public final Cursor c() {
        a6.a.e(this.f98204b);
        return this.f98203a.getReadableDatabase().query(this.f98204b, f98202c, null, null, null, null, null);
    }

    @WorkerThread
    public void e(long j10) throws DatabaseIOException {
        try {
            String hexString = Long.toHexString(j10);
            this.f98204b = d(hexString);
            if (h4.c.b(this.f98203a.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = this.f98203a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    h4.c.d(writableDatabase, 2, hexString, 1);
                    a(writableDatabase, this.f98204b);
                    writableDatabase.execSQL("CREATE TABLE " + this.f98204b + Z7.f30794r + "(name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (Throwable th2) {
                    writableDatabase.endTransaction();
                    throw th2;
                }
            }
        } catch (SQLException e10) {
            throw new DatabaseIOException(e10);
        }
    }

    @WorkerThread
    public void f(String str) throws DatabaseIOException {
        a6.a.e(this.f98204b);
        try {
            this.f98203a.getWritableDatabase().delete(this.f98204b, "name = ?", new String[]{str});
        } catch (SQLException e10) {
            throw new DatabaseIOException(e10);
        }
    }

    @WorkerThread
    public void g(Set<String> set) throws DatabaseIOException {
        a6.a.e(this.f98204b);
        try {
            SQLiteDatabase writableDatabase = this.f98203a.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    writableDatabase.delete(this.f98204b, "name = ?", new String[]{it.next()});
                }
                writableDatabase.setTransactionSuccessful();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e10) {
            throw new DatabaseIOException(e10);
        }
    }

    @WorkerThread
    public void h(String str, long j10, long j11) throws DatabaseIOException {
        a6.a.e(this.f98204b);
        try {
            SQLiteDatabase writableDatabase = this.f98203a.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put("length", Long.valueOf(j10));
            contentValues.put("last_touch_timestamp", Long.valueOf(j11));
            writableDatabase.replaceOrThrow(this.f98204b, null, contentValues);
        } catch (SQLException e10) {
            throw new DatabaseIOException(e10);
        }
    }
}
