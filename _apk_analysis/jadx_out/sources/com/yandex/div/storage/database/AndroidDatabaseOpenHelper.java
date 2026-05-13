package com.yandex.div.storage.database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import androidx.annotation.VisibleForTesting;
import com.yandex.div.internal.Assert;
import com.yandex.div.storage.database.DatabaseOpenHelper;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: AndroidDatabaseOpenHelper.kt */
/* JADX INFO: loaded from: classes11.dex */
public class AndroidDatabaseOpenHelper implements DatabaseOpenHelper {

    @NotNull
    private final DatabaseManager databaseManager;

    @NotNull
    private final SQLiteOpenHelper mSQLiteOpenHelper;

    @NotNull
    private final Object mOpenCloseLock = new Object();

    @NotNull
    private final Map<SQLiteDatabase, OpenCloseInfo> mOpenCloseInfoMap = new HashMap();

    /* JADX INFO: compiled from: AndroidDatabaseOpenHelper.kt */
    public final class AndroidSQLiteDatabase implements DatabaseOpenHelper.Database {

        @NotNull
        private final SQLiteDatabase mDb;

        @NotNull
        private final OpenCloseInfo mOpenCloseInfo;

        public AndroidSQLiteDatabase(@NotNull SQLiteDatabase sQLiteDatabase, @NotNull OpenCloseInfo openCloseInfo) {
            this.mDb = sQLiteDatabase;
            this.mOpenCloseInfo = openCloseInfo;
        }

        @Override // com.yandex.div.storage.database.DatabaseOpenHelper.Database
        public void beginTransaction() {
            this.mDb.beginTransaction();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            AndroidDatabaseOpenHelper.this.databaseManager.closeDatabase(this.mDb);
        }

        @Override // com.yandex.div.storage.database.DatabaseOpenHelper.Database
        @NotNull
        public SQLiteStatement compileStatement(@NotNull String str) {
            return this.mDb.compileStatement(str);
        }

        @Override // com.yandex.div.storage.database.DatabaseOpenHelper.Database
        public void endTransaction() {
            this.mDb.endTransaction();
        }

        @Override // com.yandex.div.storage.database.DatabaseOpenHelper.Database
        public void execSQL(@NotNull String str) {
            this.mDb.execSQL(str);
        }

        @Override // com.yandex.div.storage.database.DatabaseOpenHelper.Database
        @NotNull
        public Cursor query(@NotNull String str, @Nullable String[] strArr, @Nullable String str2, @Nullable String[] strArr2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
            return this.mDb.query(str, strArr, str2, strArr2, str3, str4, str5, str6);
        }

        @Override // com.yandex.div.storage.database.DatabaseOpenHelper.Database
        @NotNull
        public Cursor rawQuery(@NotNull String str, @Nullable String[] strArr) {
            return this.mDb.rawQuery(str, strArr);
        }

        @Override // com.yandex.div.storage.database.DatabaseOpenHelper.Database
        public void setTransactionSuccessful() {
            this.mDb.setTransactionSuccessful();
        }
    }

    /* JADX INFO: compiled from: AndroidDatabaseOpenHelper.kt */
    public static final class DatabaseManager {

        @NotNull
        private final SQLiteOpenHelper databaseHelper;

        @Nullable
        private SQLiteDatabase readableDatabase;
        private int readableUsersCount;

        @Nullable
        private SQLiteDatabase writableDatabase;
        private int writableUsersCount;

        @NotNull
        private final Set<Thread> readableUsers = new LinkedHashSet();

        @NotNull
        private final Set<Thread> writableUsers = new LinkedHashSet();

        public DatabaseManager(@NotNull SQLiteOpenHelper sQLiteOpenHelper) {
            this.databaseHelper = sQLiteOpenHelper;
        }

        public final synchronized void closeDatabase(@NotNull SQLiteDatabase sQLiteDatabase) {
            if (p.f(sQLiteDatabase, this.writableDatabase)) {
                this.writableUsers.remove(Thread.currentThread());
                if (this.writableUsers.isEmpty()) {
                    while (true) {
                        int i10 = this.writableUsersCount;
                        this.writableUsersCount = i10 - 1;
                        if (i10 <= 0) {
                            break;
                        }
                        SQLiteDatabase sQLiteDatabase2 = this.writableDatabase;
                        p.h(sQLiteDatabase2);
                        sQLiteDatabase2.close();
                    }
                }
            } else if (p.f(sQLiteDatabase, this.readableDatabase)) {
                this.readableUsers.remove(Thread.currentThread());
                if (this.readableUsers.isEmpty()) {
                    while (true) {
                        int i11 = this.readableUsersCount;
                        this.readableUsersCount = i11 - 1;
                        if (i11 <= 0) {
                            break;
                        }
                        SQLiteDatabase sQLiteDatabase3 = this.readableDatabase;
                        p.h(sQLiteDatabase3);
                        sQLiteDatabase3.close();
                    }
                }
            } else {
                Assert.fail("Trying to close unknown database from DatabaseManager");
                sQLiteDatabase.close();
            }
        }

        @NotNull
        public final synchronized SQLiteDatabase openReadableDatabase() {
            SQLiteDatabase sQLiteDatabase;
            this.readableDatabase = this.databaseHelper.getReadableDatabase();
            this.readableUsersCount++;
            this.readableUsers.add(Thread.currentThread());
            sQLiteDatabase = this.readableDatabase;
            p.h(sQLiteDatabase);
            return sQLiteDatabase;
        }

        @NotNull
        public final synchronized SQLiteDatabase openWritableDatabase() {
            SQLiteDatabase sQLiteDatabase;
            this.writableDatabase = this.databaseHelper.getWritableDatabase();
            this.writableUsersCount++;
            this.writableUsers.add(Thread.currentThread());
            sQLiteDatabase = this.writableDatabase;
            p.h(sQLiteDatabase);
            return sQLiteDatabase;
        }
    }

    /* JADX INFO: compiled from: AndroidDatabaseOpenHelper.kt */
    public static final class OpenCloseInfo {
        private int currentlyOpenedCount;

        public final int getCurrentlyOpenedCount() {
            return this.currentlyOpenedCount;
        }

        public final void setCurrentlyOpenedCount(int i10) {
            this.currentlyOpenedCount = i10;
        }
    }

    public AndroidDatabaseOpenHelper(@NotNull Context context, @NotNull String str, int i10, @NotNull final DatabaseOpenHelper.CreateCallback createCallback, @NotNull final DatabaseOpenHelper.UpgradeCallback upgradeCallback) {
        SQLiteOpenHelper sQLiteOpenHelper = new SQLiteOpenHelper(context, str, i10) { // from class: com.yandex.div.storage.database.AndroidDatabaseOpenHelper.1
            @Override // android.database.sqlite.SQLiteOpenHelper
            public void onConfigure(@NotNull SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
            }

            @Override // android.database.sqlite.SQLiteOpenHelper
            public void onCreate(@NotNull SQLiteDatabase sQLiteDatabase) {
                createCallback.onCreate(this.wrapDataBase(sQLiteDatabase));
            }

            @Override // android.database.sqlite.SQLiteOpenHelper
            public void onUpgrade(@NotNull SQLiteDatabase sQLiteDatabase, int i11, int i12) {
                upgradeCallback.onUpgrade(this.wrapDataBase(sQLiteDatabase), i11, i12);
            }
        };
        this.mSQLiteOpenHelper = sQLiteOpenHelper;
        this.databaseManager = new DatabaseManager(sQLiteOpenHelper);
    }

    private OpenCloseInfo getOpenCloseInfo(SQLiteDatabase sQLiteDatabase) {
        OpenCloseInfo openCloseInfo;
        synchronized (this.mOpenCloseLock) {
            openCloseInfo = this.mOpenCloseInfoMap.get(sQLiteDatabase);
            if (openCloseInfo == null) {
                openCloseInfo = new OpenCloseInfo();
                this.mOpenCloseInfoMap.put(sQLiteDatabase, openCloseInfo);
            }
            openCloseInfo.setCurrentlyOpenedCount(openCloseInfo.getCurrentlyOpenedCount() + 1);
            openCloseInfo.getCurrentlyOpenedCount();
        }
        return openCloseInfo;
    }

    @Override // com.yandex.div.storage.database.DatabaseOpenHelper
    @NotNull
    public DatabaseOpenHelper.Database getReadableDatabase() {
        return wrapDataBase(this.databaseManager.openReadableDatabase());
    }

    @Override // com.yandex.div.storage.database.DatabaseOpenHelper
    @NotNull
    public DatabaseOpenHelper.Database getWritableDatabase() {
        return wrapDataBase(this.databaseManager.openWritableDatabase());
    }

    @VisibleForTesting
    @NotNull
    public DatabaseOpenHelper.Database wrapDataBase(@NotNull SQLiteDatabase sQLiteDatabase) {
        return new AndroidSQLiteDatabase(sQLiteDatabase, getOpenCloseInfo(sQLiteDatabase));
    }
}
