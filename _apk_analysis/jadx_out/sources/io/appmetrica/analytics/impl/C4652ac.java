package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.io.Closeable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ac, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4652ac implements InterfaceC5279z6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f66363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f66364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4895jn f66365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Z9 f66366d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Z6 f66367e;

    @VisibleForTesting
    public C4652ac(@NonNull Context context, @NonNull String str, @NonNull Z9 z92, @NonNull C4895jn c4895jn) {
        this.f66363a = context;
        this.f66364b = str;
        this.f66366d = z92;
        this.f66365c = c4895jn;
    }

    public C4652ac(Context context, String str, @NonNull C4895jn c4895jn) {
        this(context, str, new Z9(str), c4895jn);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5279z6
    @Nullable
    @WorkerThread
    public final synchronized SQLiteDatabase a() {
        Z6 z62;
        try {
            this.f66366d.a();
            z62 = new Z6(this.f66363a, this.f66364b, this.f66365c, PublicLogger.getAnonymousInstance());
            this.f66367e = z62;
        } catch (Throwable unused) {
            return null;
        }
        return z62.getWritableDatabase();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5279z6
    @WorkerThread
    public final synchronized void a(@Nullable SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            try {
                sQLiteDatabase.close();
            } catch (Throwable unused) {
            }
        }
        mo.a((Closeable) this.f66367e);
        this.f66366d.b();
        this.f66367e = null;
    }
}
