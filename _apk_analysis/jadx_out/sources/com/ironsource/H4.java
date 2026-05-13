package com.ironsource;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class H4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f29500a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Object f29501b = new Object();

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public static /* synthetic */ SQLiteDatabase a(H4 h42, boolean z10, SQLiteOpenHelper sQLiteOpenHelper, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return h42.a(z10, sQLiteOpenHelper);
    }

    @Nullable
    public final SQLiteDatabase a(@NotNull SQLiteOpenHelper sQLiteOpenHelper) {
        tn.p.k(sQLiteOpenHelper, "sqliteOpenHelper");
        return a(this, false, sQLiteOpenHelper, 1, null);
    }

    @Nullable
    public final SQLiteDatabase a(boolean z10, @NotNull SQLiteOpenHelper sQLiteOpenHelper) {
        SQLiteDatabase writableDatabase;
        tn.p.k(sQLiteOpenHelper, "sqliteOpenHelper");
        synchronized (f29501b) {
            writableDatabase = z10 ? sQLiteOpenHelper.getWritableDatabase() : sQLiteOpenHelper.getReadableDatabase();
        }
        return writableDatabase;
    }
}
