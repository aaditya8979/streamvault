package com.yandex.div.storage.database;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import java.io.Closeable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DatabaseOpenHelper.kt */
/* JADX INFO: loaded from: classes9.dex */
public interface DatabaseOpenHelper {

    /* JADX INFO: compiled from: DatabaseOpenHelper.kt */
    public interface CreateCallback {
        void onCreate(@NotNull Database database);
    }

    /* JADX INFO: compiled from: DatabaseOpenHelper.kt */
    public interface Database extends Closeable {
        void beginTransaction();

        @NotNull
        SQLiteStatement compileStatement(@NotNull String str);

        void endTransaction();

        void execSQL(@NotNull String str);

        @NotNull
        Cursor query(@NotNull String str, @Nullable String[] strArr, @Nullable String str2, @Nullable String[] strArr2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6);

        @NotNull
        Cursor rawQuery(@NotNull String str, @Nullable String[] strArr);

        void setTransactionSuccessful();
    }

    /* JADX INFO: compiled from: DatabaseOpenHelper.kt */
    public interface UpgradeCallback {
        void onUpgrade(@NotNull Database database, int i10, int i11);
    }

    @NotNull
    Database getReadableDatabase();

    @NotNull
    Database getWritableDatabase();
}
