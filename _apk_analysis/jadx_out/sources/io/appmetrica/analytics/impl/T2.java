package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;

/* JADX INFO: loaded from: classes6.dex */
public final class T2 implements IBinaryDataHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC5279z6 f65904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f65905b;

    public T2(@NonNull InterfaceC5279z6 interfaceC5279z6, @NonNull String str) {
        this.f65904a = interfaceC5279z6;
        this.f65905b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f A[Catch: all -> 0x0047, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0047, blocks: (B:7:0x001e, B:9:0x0024, B:11:0x002a, B:15:0x003f), top: B:27:0x001e }] */
    @Override // io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] get(@androidx.annotation.NonNull java.lang.String r12) {
        /*
            r11 = this;
            r0 = 0
            io.appmetrica.analytics.impl.z6 r1 = r11.f65904a     // Catch: java.lang.Throwable -> L45
            android.database.sqlite.SQLiteDatabase r1 = r1.a()     // Catch: java.lang.Throwable -> L45
            if (r1 == 0) goto L43
            java.lang.String r3 = r11.f65905b     // Catch: java.lang.Throwable -> L43
            r4 = 0
            java.lang.String r5 = "data_key = ?"
            r10 = 1
            java.lang.String[] r6 = new java.lang.String[r10]     // Catch: java.lang.Throwable -> L43
            r2 = 0
            r6[r2] = r12     // Catch: java.lang.Throwable -> L43
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = r1
            android.database.Cursor r12 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L43
            if (r12 == 0) goto L3d
            int r2 = r12.getCount()     // Catch: java.lang.Throwable -> L47
            if (r2 != r10) goto L3d
            boolean r2 = r12.moveToFirst()     // Catch: java.lang.Throwable -> L47
            if (r2 == 0) goto L3d
            java.lang.String r2 = "value"
            int r2 = r12.getColumnIndexOrThrow(r2)     // Catch: java.lang.Throwable -> L47
            byte[] r0 = r12.getBlob(r2)     // Catch: java.lang.Throwable -> L47
            io.appmetrica.analytics.impl.mo.a(r12)
            io.appmetrica.analytics.impl.z6 r12 = r11.f65904a
            r12.a(r1)
            return r0
        L3d:
            if (r12 == 0) goto L47
            r12.getCount()     // Catch: java.lang.Throwable -> L47
            goto L47
        L43:
            r12 = r0
            goto L47
        L45:
            r12 = r0
            r1 = r12
        L47:
            io.appmetrica.analytics.impl.mo.a(r12)
            io.appmetrica.analytics.impl.z6 r12 = r11.f65904a
            r12.a(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.T2.get(java.lang.String):byte[]");
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper
    public final void insert(@NonNull String str, @NonNull byte[] bArr) {
        SQLiteDatabase sQLiteDatabaseA;
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabaseA = this.f65904a.a();
            if (sQLiteDatabaseA != null) {
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("data_key", str);
                    contentValues.put("value", bArr);
                    sQLiteDatabaseA.insertWithOnConflict(this.f65905b, null, contentValues, 5);
                } catch (Throwable unused) {
                    sQLiteDatabase = sQLiteDatabaseA;
                    sQLiteDatabaseA = sQLiteDatabase;
                }
            }
        } catch (Throwable unused2) {
        }
        this.f65904a.a(sQLiteDatabaseA);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper
    public final void remove(@NonNull String str) {
        SQLiteDatabase sQLiteDatabaseA;
        try {
            sQLiteDatabaseA = this.f65904a.a();
            if (sQLiteDatabaseA != null) {
                try {
                    new ContentValues().put("data_key", str);
                    sQLiteDatabaseA.delete(this.f65905b, "data_key = ?", new String[]{str});
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
            sQLiteDatabaseA = null;
        }
        this.f65904a.a(sQLiteDatabaseA);
    }
}
