package io.appmetrica.analytics.impl;

import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class L4 extends DatabaseScript {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K4 f65520a = new K4();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J4 f65521b = new J4();

    @Override // io.appmetrica.analytics.coreapi.internal.db.DatabaseScript
    public final void runScript(@NotNull SQLiteDatabase sQLiteDatabase) {
        this.f65520a.runScript(sQLiteDatabase);
        this.f65521b.runScript(sQLiteDatabase);
    }
}
