package com.yandex.div.storage.database;

import android.content.Context;
import com.yandex.div.storage.database.DatabaseOpenHelper;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DatabaseOpenHelperProvider.kt */
/* JADX INFO: loaded from: classes10.dex */
public interface DatabaseOpenHelperProvider {
    @NotNull
    DatabaseOpenHelper provide(@NotNull Context context, @NotNull String str, int i10, @NotNull DatabaseOpenHelper.CreateCallback createCallback, @NotNull DatabaseOpenHelper.UpgradeCallback upgradeCallback);
}
