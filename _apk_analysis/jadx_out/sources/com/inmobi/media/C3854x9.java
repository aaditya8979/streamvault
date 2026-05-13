package com.inmobi.media;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Iterator;

/* JADX INFO: renamed from: com.inmobi.media.x9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3854x9 extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3526k5 f28507a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3854x9(C3526k5 c3526k5) {
        super(c3526k5.f27446a, "com.im_11.1.0.db", (SQLiteDatabase.CursorFactory) null, 1);
        tn.p.k(c3526k5, "databaseConfig");
        this.f28507a = c3526k5;
    }

    public static void a(SQLiteDatabase sQLiteDatabase, Nj nj2) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS " + nj2.f26048a + com.ironsource.Z7.f30794r + nj2.f26049b);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final String getDatabaseName() {
        this.f28507a.getClass();
        return "com.im_11.1.0.db";
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        super.onConfigure(sQLiteDatabase);
        if (this.f28507a.f27448c != 2 || sQLiteDatabase == null) {
            return;
        }
        sQLiteDatabase.disableWriteAheadLogging();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            Iterator it = this.f28507a.f27447b.iterator();
            while (it.hasNext()) {
                a(sQLiteDatabase, (Nj) it.next());
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }
}
