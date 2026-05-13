package com.yandex.div.storage.util;

import com.yandex.div.storage.database.DatabaseOpenHelper;
import java.io.Closeable;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SqlExtensions.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class SqlExtensionsKt {
    public static final void closeSilently(@NotNull Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    public static final void endTransactionSilently(@NotNull DatabaseOpenHelper.Database database) {
        try {
            database.endTransaction();
        } catch (IllegalStateException unused) {
        }
    }
}
