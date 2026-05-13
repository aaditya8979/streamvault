package com.yandex.div.storage.database;

import android.database.sqlite.SQLiteStatement;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SqlCompiler.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface SqlCompiler {
    @NotNull
    ReadState compileQuery(@NotNull String str, @NotNull String... strArr);

    @NotNull
    SQLiteStatement compileStatement(@NotNull String str);
}
