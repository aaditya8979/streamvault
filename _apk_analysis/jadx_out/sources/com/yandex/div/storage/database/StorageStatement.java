package com.yandex.div.storage.database;

import android.database.SQLException;
import androidx.annotation.WorkerThread;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: StorageStatement.kt */
/* JADX INFO: loaded from: classes6.dex */
public interface StorageStatement {
    @WorkerThread
    void execute(@NotNull SqlCompiler sqlCompiler) throws SQLException;
}
