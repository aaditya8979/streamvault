package com.yandex.div.storage.database;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.yandex.div.storage.database.DatabaseOpenHelper;
import com.yandex.div.storage.util.SqlExtensionsKt;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: StorageStatementExecutor.kt */
/* JADX INFO: loaded from: classes4.dex */
final class ClosableSqlCompiler implements SqlCompiler, Closeable {

    /* JADX INFO: renamed from: db, reason: collision with root package name */
    @NotNull
    private final DatabaseOpenHelper.Database f54012db;

    @NotNull
    private final List<SQLiteStatement> createdStatements = new ArrayList();

    @NotNull
    private final List<Cursor> createdCursors = new ArrayList();

    public ClosableSqlCompiler(@NotNull DatabaseOpenHelper.Database database) {
        this.f54012db = database;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Cursor compileQuery$lambda$2(ClosableSqlCompiler closableSqlCompiler, String str, String[] strArr) {
        Cursor cursorRawQuery = closableSqlCompiler.f54012db.rawQuery(str, strArr);
        closableSqlCompiler.createdCursors.add(cursorRawQuery);
        return cursorRawQuery;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Iterator<T> it = this.createdStatements.iterator();
        while (it.hasNext()) {
            SqlExtensionsKt.closeSilently((SQLiteStatement) it.next());
        }
        this.createdStatements.clear();
        for (Cursor cursor : this.createdCursors) {
            if (!cursor.isClosed()) {
                SqlExtensionsKt.closeSilently(cursor);
            }
        }
        this.createdCursors.clear();
    }

    @Override // com.yandex.div.storage.database.SqlCompiler
    @NotNull
    public ReadState compileQuery(@NotNull final String str, @NotNull final String... strArr) {
        return new ReadState(null, new ym.a() { // from class: com.yandex.div.storage.database.a
            @Override // ym.a
            public final Object get() {
                return ClosableSqlCompiler.compileQuery$lambda$2(this.f54013a, str, strArr);
            }
        }, 1, null);
    }

    @Override // com.yandex.div.storage.database.SqlCompiler
    @NotNull
    public SQLiteStatement compileStatement(@NotNull String str) {
        SQLiteStatement sQLiteStatementCompileStatement = this.f54012db.compileStatement(str);
        this.createdStatements.add(sQLiteStatementCompileStatement);
        return sQLiteStatementCompileStatement;
    }
}
