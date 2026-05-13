package com.yandex.android.beacon;

import android.app.Application;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import androidx.annotation.WorkerThread;
import bn.e;
import com.yandex.android.beacon.a;
import com.yandex.div.internal.Assert;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import tn.i;
import tn.l;
import tn.p;

/* JADX INFO: compiled from: SendBeaconDb.kt */
/* JADX INFO: loaded from: classes7.dex */
public class b extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final C0720b f53937b = new C0720b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final String[] f53938c = {"_id", "url", "headers", "add_timestamp", "payload"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static c f53939d = a.f53940b;

    /* JADX INFO: compiled from: SendBeaconDb.kt */
    public /* synthetic */ class a implements c, l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f53940b = new a();

        @Override // com.yandex.android.beacon.b.c
        @NotNull
        public final b a(@NotNull Context context, @NotNull String str) {
            return new b(context, str);
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof c) && (obj instanceof l)) {
                return p.f(getFunctionDelegate(), ((l) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // tn.l
        @NotNull
        public final e<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(2, b.class, "<init>", "<init>(Landroid/content/Context;Ljava/lang/String;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: com.yandex.android.beacon.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SendBeaconDb.kt */
    public static final class C0720b {
        public C0720b() {
        }

        public /* synthetic */ C0720b(i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: SendBeaconDb.kt */
    public interface c {
        @NotNull
        b a(@NotNull Context context, @NotNull String str);
    }

    public b(@NotNull Context context, @NotNull String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 2);
        Assert.assertTrue(context instanceof Application);
    }

    @WorkerThread
    @NotNull
    public a.C0719a a(@NotNull Uri uri, @NotNull Map<String, String> map, long j10, @Nullable JSONObject jSONObject) throws IOException {
        ContentValues contentValues = new ContentValues(3);
        contentValues.put("url", uri.toString());
        contentValues.put("headers", zf.a.b(map));
        contentValues.put("add_timestamp", Long.valueOf(j10));
        SQLiteDatabase writableDatabase = getWritableDatabase();
        try {
            long jInsert = writableDatabase.insert("items", null, contentValues);
            on.b.a(writableDatabase, null);
            return new a.C0719a(uri, map, jSONObject, j10, jInsert);
        } finally {
        }
    }

    @WorkerThread
    @NotNull
    public List<a.C0719a> d() {
        ArrayList arrayList = new ArrayList();
        SQLiteDatabase readableDatabase = getReadableDatabase();
        Cursor cursorQuery = null;
        try {
            cursorQuery = readableDatabase.query("items", f53938c, null, null, null, null, null, null);
            if (cursorQuery != null) {
                while (cursorQuery.moveToNext()) {
                    arrayList.add(e(cursorQuery));
                }
            }
            return arrayList;
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            readableDatabase.close();
        }
    }

    public final a.C0719a e(Cursor cursor) {
        return new a.C0719a(Uri.parse(cursor.getString(1)), zf.a.a(cursor.getString(2)), f(cursor, 4), cursor.getLong(3), cursor.getLong(0));
    }

    public final JSONObject f(Cursor cursor, int i10) {
        String strH = h(cursor, i10);
        if (strH == null) {
            return null;
        }
        if (!(strH.length() > 0)) {
            return null;
        }
        try {
            return new JSONObject(strH);
        } catch (JSONException e10) {
            Assert.fail("Payload parsing exception: " + e10);
            return null;
        }
    }

    public final String h(Cursor cursor, int i10) {
        if (cursor.isNull(i10)) {
            return null;
        }
        return cursor.getString(i10);
    }

    @WorkerThread
    public boolean k(@Nullable a.C0719a c0719a) throws IOException {
        if (c0719a == null) {
            return false;
        }
        SQLiteDatabase writableDatabase = getWritableDatabase();
        try {
            int iDelete = writableDatabase.delete("items", "_id = ?", new String[]{String.valueOf(c0719a.f())});
            on.b.a(writableDatabase, null);
            return iDelete != 0;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                on.b.a(writableDatabase, th2);
                throw th3;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(@NotNull SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("\n            CREATE TABLE items(\n            _id INTEGER PRIMARY KEY AUTOINCREMENT,\n            url TEXT NOT NULL,\n            headers TEXT,\n            add_timestamp INTEGER, \n            payload TEXT)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(@NotNull SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        if (i10 == 1) {
            sQLiteDatabase.execSQL("\n            ALTER TABLE items ADD COLUMN payload TEXT;\n        ");
        }
    }
}
