package com.yandex.div.storage.database;

import android.database.SQLException;
import com.yandex.div.storage.database.DatabaseOpenHelper;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Migration.kt */
/* JADX INFO: loaded from: classes12.dex */
public interface Migration {
    void migrate(@NotNull DatabaseOpenHelper.Database database) throws SQLException;
}
