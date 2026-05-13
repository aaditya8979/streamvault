package yads;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class wr {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f96481c = {"name", "length", "last_touch_timestamp"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w30 f96482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f96483b;

    public wr(jn0 jn0Var) {
        this.f96482a = jn0Var;
    }

    public final HashMap a() throws v30 {
        try {
            this.f96483b.getClass();
            Cursor cursorQuery = this.f96482a.getReadableDatabase().query(this.f96483b, f96481c, null, null, null, null, null);
            try {
                HashMap map = new HashMap(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(0);
                    string.getClass();
                    map.put(string, new vr(cursorQuery.getLong(1), cursorQuery.getLong(2)));
                }
                cursorQuery.close();
                return map;
            } finally {
            }
        } catch (Throwable th2) {
            throw new v30(th2);
        }
    }

    public final void a(long j10) throws v30 {
        try {
            String hexString = Long.toHexString(j10);
            this.f96483b = "ExoPlayerCacheFileMetadata" + hexString;
            if (qd3.a(this.f96482a.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = this.f96482a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    qd3.a(writableDatabase, 2, hexString, 1);
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + this.f96483b);
                    writableDatabase.execSQL("CREATE TABLE " + this.f96483b + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (Throwable th2) {
                    writableDatabase.endTransaction();
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            throw new v30(th3);
        }
    }

    public final void a(String str, long j10, long j11) throws v30 {
        this.f96483b.getClass();
        try {
            SQLiteDatabase writableDatabase = this.f96482a.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put("length", Long.valueOf(j10));
            contentValues.put("last_touch_timestamp", Long.valueOf(j11));
            writableDatabase.replaceOrThrow(this.f96483b, null, contentValues);
        } catch (Throwable th2) {
            throw new v30(th2);
        }
    }

    public final void a(Set set) throws v30 {
        this.f96483b.getClass();
        try {
            SQLiteDatabase writableDatabase = this.f96482a.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    writableDatabase.delete(this.f96483b, "name = ?", new String[]{(String) it.next()});
                }
                writableDatabase.setTransactionSuccessful();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (Throwable th2) {
            throw new v30(th2);
        }
    }
}
