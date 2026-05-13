package yads;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class is implements ks {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String[] f90963e = {"id", "key", "metadata"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w30 f90964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f90965b = new SparseArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f90966c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f90967d;

    public is(jn0 jn0Var) {
        this.f90964a = jn0Var;
    }

    @Override // yads.ks
    public final void a(long j10) {
        String hexString = Long.toHexString(j10);
        this.f90966c = hexString;
        this.f90967d = "ExoPlayerCacheIndex" + hexString;
    }

    @Override // yads.ks
    public final void a(HashMap map) throws v30 {
        if (this.f90965b.size() == 0) {
            return;
        }
        try {
            SQLiteDatabase writableDatabase = this.f90964a.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            for (int i10 = 0; i10 < this.f90965b.size(); i10++) {
                try {
                    hs hsVar = (hs) this.f90965b.valueAt(i10);
                    if (hsVar == null) {
                        int iKeyAt = this.f90965b.keyAt(i10);
                        String str = this.f90967d;
                        str.getClass();
                        writableDatabase.delete(str, "id = ?", new String[]{Integer.toString(iKeyAt)});
                    } else {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        jc0 jc0Var = hsVar.f90524e;
                        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                        Set<Map.Entry> setEntrySet = jc0Var.f91153b.entrySet();
                        dataOutputStream.writeInt(setEntrySet.size());
                        for (Map.Entry entry : setEntrySet) {
                            dataOutputStream.writeUTF((String) entry.getKey());
                            byte[] bArr = (byte[]) entry.getValue();
                            dataOutputStream.writeInt(bArr.length);
                            dataOutputStream.write(bArr);
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("id", Integer.valueOf(hsVar.f90520a));
                        contentValues.put("key", hsVar.f90521b);
                        contentValues.put("metadata", byteArray);
                        String str2 = this.f90967d;
                        str2.getClass();
                        writableDatabase.replaceOrThrow(str2, null, contentValues);
                    }
                } finally {
                    writableDatabase.endTransaction();
                }
            }
            writableDatabase.setTransactionSuccessful();
            this.f90965b.clear();
        } catch (SQLException e10) {
            throw new v30(e10);
        }
    }

    @Override // yads.ks
    public final void a(HashMap map, SparseArray sparseArray) throws v30 {
        if (this.f90965b.size() != 0) {
            throw new IllegalStateException();
        }
        try {
            SQLiteDatabase readableDatabase = this.f90964a.getReadableDatabase();
            String str = this.f90966c;
            str.getClass();
            if (qd3.a(readableDatabase, 1, str) != 1) {
                SQLiteDatabase writableDatabase = this.f90964a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    String str2 = this.f90966c;
                    str2.getClass();
                    qd3.a(writableDatabase, 1, str2, 1);
                    String str3 = this.f90967d;
                    str3.getClass();
                    writableDatabase.execSQL("DROP TABLE IF EXISTS ".concat(str3));
                    writableDatabase.execSQL("CREATE TABLE " + this.f90967d + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (Throwable th2) {
                    writableDatabase.endTransaction();
                    throw th2;
                }
            }
            SQLiteDatabase readableDatabase2 = this.f90964a.getReadableDatabase();
            String str4 = this.f90967d;
            str4.getClass();
            Cursor cursorQuery = readableDatabase2.query(str4, f90963e, null, null, null, null, null);
            while (cursorQuery.moveToNext()) {
                try {
                    int i10 = cursorQuery.getInt(0);
                    String string = cursorQuery.getString(1);
                    string.getClass();
                    map.put(string, new hs(i10, string, ls.a(new DataInputStream(new ByteArrayInputStream(cursorQuery.getBlob(2))))));
                    sparseArray.put(i10, string);
                } finally {
                }
            }
            cursorQuery.close();
        } catch (SQLiteException e10) {
            map.clear();
            sparseArray.clear();
            throw new v30(e10);
        }
    }

    @Override // yads.ks
    public final void a(hs hsVar) {
        this.f90965b.put(hsVar.f90520a, hsVar);
    }

    @Override // yads.ks
    public final void a(hs hsVar, boolean z10) {
        if (z10) {
            this.f90965b.delete(hsVar.f90520a);
        } else {
            this.f90965b.put(hsVar.f90520a, null);
        }
    }

    @Override // yads.ks
    public final boolean a() {
        SQLiteDatabase readableDatabase = this.f90964a.getReadableDatabase();
        String str = this.f90966c;
        str.getClass();
        return qd3.a(readableDatabase, 1, str) != -1;
    }

    @Override // yads.ks
    public final void b() throws v30 {
        w30 w30Var = this.f90964a;
        String str = this.f90966c;
        str.getClass();
        try {
            String strConcat = "ExoPlayerCacheIndex".concat(str);
            SQLiteDatabase writableDatabase = w30Var.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                int i10 = qd3.f94016a;
                try {
                    if (ib3.a(writableDatabase, "ExoPlayerVersions")) {
                        writableDatabase.delete("ExoPlayerVersions", "feature = ? AND instance_uid = ?", new String[]{Integer.toString(1), str});
                    }
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + strConcat);
                    writableDatabase.setTransactionSuccessful();
                } catch (SQLException e10) {
                    throw new v30(e10);
                }
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e11) {
            throw new v30(e11);
        }
    }

    @Override // yads.ks
    public final void b(HashMap map) throws v30 {
        try {
            SQLiteDatabase writableDatabase = this.f90964a.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                String str = this.f90966c;
                str.getClass();
                qd3.a(writableDatabase, 1, str, 1);
                String str2 = this.f90967d;
                str2.getClass();
                writableDatabase.execSQL("DROP TABLE IF EXISTS ".concat(str2));
                writableDatabase.execSQL("CREATE TABLE " + this.f90967d + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
                for (hs hsVar : map.values()) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    jc0 jc0Var = hsVar.f90524e;
                    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                    Set<Map.Entry> setEntrySet = jc0Var.f91153b.entrySet();
                    dataOutputStream.writeInt(setEntrySet.size());
                    for (Map.Entry entry : setEntrySet) {
                        dataOutputStream.writeUTF((String) entry.getKey());
                        byte[] bArr = (byte[]) entry.getValue();
                        dataOutputStream.writeInt(bArr.length);
                        dataOutputStream.write(bArr);
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("id", Integer.valueOf(hsVar.f90520a));
                    contentValues.put("key", hsVar.f90521b);
                    contentValues.put("metadata", byteArray);
                    String str3 = this.f90967d;
                    str3.getClass();
                    writableDatabase.replaceOrThrow(str3, null, contentValues);
                }
                writableDatabase.setTransactionSuccessful();
                this.f90965b.clear();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e10) {
            throw new v30(e10);
        }
    }
}
