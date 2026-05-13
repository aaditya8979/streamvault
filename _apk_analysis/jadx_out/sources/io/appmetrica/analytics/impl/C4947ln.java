package io.appmetrica.analytics.impl;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ln, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4947ln implements InterfaceC4921kn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f67248a;

    public C4947ln(@NonNull String str, @NonNull HashMap<String, List<String>> map) {
        this.f67248a = map;
    }

    @VisibleForTesting(otherwise = 5)
    public final HashMap<String, List<String>> a() {
        return this.f67248a;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4921kn
    public final boolean a(SQLiteDatabase sQLiteDatabase) {
        try {
            boolean zEquals = true;
            for (Map.Entry entry : this.f67248a.entrySet()) {
                try {
                    Cursor cursorQuery = sQLiteDatabase.query((String) entry.getKey(), null, null, null, null, null, null);
                    if (cursorQuery == null) {
                        mo.a(cursorQuery);
                        return false;
                    }
                    List list = (List) entry.getValue();
                    List listAsList = Arrays.asList(cursorQuery.getColumnNames());
                    Collections.sort(listAsList);
                    zEquals &= list.equals(listAsList);
                    mo.a(cursorQuery);
                } catch (Throwable th2) {
                    mo.a((Cursor) null);
                    throw th2;
                }
            }
            return zEquals;
        } catch (Throwable unused) {
            return false;
        }
    }
}
