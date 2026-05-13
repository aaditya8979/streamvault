package io.appmetrica.analytics.impl;

import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.rl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5094rl implements InterfaceC5279z6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Z6 f67628a;

    public C5094rl(Z6 z62) {
        this.f67628a = z62;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5279z6
    @Nullable
    public final SQLiteDatabase a() {
        try {
            return this.f67628a.getWritableDatabase();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5279z6
    public final void a(@Nullable SQLiteDatabase sQLiteDatabase) {
    }
}
