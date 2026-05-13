package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import java.io.Closeable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.tb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5134tb implements Ia, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f67725a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f67726b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f67727c = "preferences";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C5109sb f67728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f67729e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC5279z6 f67730f;

    public C5134tb(InterfaceC5279z6 interfaceC5279z6) {
        this.f67730f = interfaceC5279z6;
        C5109sb c5109sb = new C5109sb(this, String.format(Locale.US, "IAA-DW-%s", Integer.valueOf(Ad.a())));
        this.f67728d = c5109sb;
        c5109sb.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0022 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(io.appmetrica.analytics.impl.C5134tb r13) {
        /*
            java.lang.String r0 = "type"
            java.lang.String r1 = "value"
            java.lang.String r2 = "key"
            r13.getClass()
            r3 = 0
            io.appmetrica.analytics.impl.z6 r4 = r13.f67730f     // Catch: java.lang.Throwable -> L85
            android.database.sqlite.SQLiteDatabase r4 = r4.a()     // Catch: java.lang.Throwable -> L85
            if (r4 == 0) goto L86
            java.lang.String r6 = r13.f67727c     // Catch: java.lang.Throwable -> L86
            java.lang.String[] r7 = new java.lang.String[]{r2, r1, r0}     // Catch: java.lang.Throwable -> L86
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r5 = r4
            android.database.Cursor r5 = r5.query(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L86
        L22:
            boolean r6 = r5.moveToNext()     // Catch: java.lang.Throwable -> L83
            if (r6 == 0) goto L83
            int r6 = r5.getColumnIndexOrThrow(r2)     // Catch: java.lang.Throwable -> L83
            java.lang.String r6 = r5.getString(r6)     // Catch: java.lang.Throwable -> L83
            int r7 = r5.getColumnIndexOrThrow(r1)     // Catch: java.lang.Throwable -> L83
            java.lang.String r7 = r5.getString(r7)     // Catch: java.lang.Throwable -> L83
            int r8 = r5.getColumnIndexOrThrow(r0)     // Catch: java.lang.Throwable -> L83
            int r8 = r5.getInt(r8)     // Catch: java.lang.Throwable -> L83
            boolean r9 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L83
            if (r9 != 0) goto L22
            r9 = 1
            if (r8 == r9) goto L66
            r9 = 2
            if (r8 == r9) goto L61
            r9 = 3
            if (r8 == r9) goto L5c
            r9 = 4
            if (r8 == r9) goto L7b
            r9 = 5
            if (r8 == r9) goto L57
        L55:
            r7 = r3
            goto L7b
        L57:
            java.lang.Float r7 = io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils.parseFloat(r7)     // Catch: java.lang.Throwable -> L83
            goto L7b
        L5c:
            java.lang.Long r7 = io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils.parseLong(r7)     // Catch: java.lang.Throwable -> L83
            goto L7b
        L61:
            java.lang.Integer r7 = io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils.parseInt(r7)     // Catch: java.lang.Throwable -> L83
            goto L7b
        L66:
            java.lang.String r8 = "true"
            boolean r8 = r8.equals(r7)     // Catch: java.lang.Throwable -> L83
            if (r8 == 0) goto L71
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L83
            goto L7b
        L71:
            java.lang.String r8 = "false"
            boolean r7 = r8.equals(r7)     // Catch: java.lang.Throwable -> L83
            if (r7 == 0) goto L55
            java.lang.Boolean r7 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L83
        L7b:
            if (r7 == 0) goto L22
            java.util.HashMap r8 = r13.f67725a     // Catch: java.lang.Throwable -> L83
            r8.put(r6, r7)     // Catch: java.lang.Throwable -> L83
            goto L22
        L83:
            r3 = r5
            goto L86
        L85:
            r4 = r3
        L86:
            io.appmetrica.analytics.impl.mo.a(r3)
            io.appmetrica.analytics.impl.z6 r13 = r13.f67730f
            r13.a(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C5134tb.a(io.appmetrica.analytics.impl.tb):void");
    }

    public static void a(C5134tb c5134tb, HashMap map) {
        SQLiteDatabase sQLiteDatabaseA;
        c5134tb.getClass();
        int size = map.size();
        ContentValues[] contentValuesArr = new ContentValues[size];
        int i10 = 0;
        for (Map.Entry entry : map.entrySet()) {
            ContentValues contentValues = new ContentValues();
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            contentValues.put("key", str);
            if (value == c5134tb) {
                contentValues.putNull("value");
            } else if (value instanceof String) {
                contentValues.put("value", (String) value);
                contentValues.put("type", (Integer) 4);
            } else if (value instanceof Long) {
                contentValues.put("value", (Long) value);
                contentValues.put("type", (Integer) 3);
            } else if (value instanceof Integer) {
                contentValues.put("value", (Integer) value);
                contentValues.put("type", (Integer) 2);
            } else if (value instanceof Boolean) {
                contentValues.put("value", String.valueOf(((Boolean) value).booleanValue()));
                contentValues.put("type", (Integer) 1);
            } else if (value instanceof Float) {
                contentValues.put("value", (Float) value);
                contentValues.put("type", (Integer) 5);
            }
            contentValuesArr[i10] = contentValues;
            i10++;
        }
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabaseA = c5134tb.f67730f.a();
            if (sQLiteDatabaseA != null) {
                try {
                    sQLiteDatabaseA.beginTransaction();
                    for (int i11 = 0; i11 < size; i11++) {
                        ContentValues contentValues2 = contentValuesArr[i11];
                        if (contentValues2.getAsString("value") == null) {
                            sQLiteDatabaseA.delete(c5134tb.f67727c, "key = ?", new String[]{contentValues2.getAsString("key")});
                        } else {
                            sQLiteDatabaseA.insertWithOnConflict(c5134tb.f67727c, null, contentValues2, 5);
                        }
                    }
                    sQLiteDatabaseA.setTransactionSuccessful();
                } catch (Throwable unused) {
                    sQLiteDatabase = sQLiteDatabaseA;
                    if (sQLiteDatabase != null) {
                        try {
                            sQLiteDatabase.endTransaction();
                        } catch (Throwable unused2) {
                        }
                    }
                    sQLiteDatabaseA = sQLiteDatabase;
                }
            }
            if (sQLiteDatabaseA != null) {
                try {
                    sQLiteDatabaseA.endTransaction();
                } catch (Throwable unused3) {
                }
            }
        } catch (Throwable unused4) {
        }
        c5134tb.f67730f.a(sQLiteDatabaseA);
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final synchronized Ia a(int i10, String str) {
        a(str, Integer.valueOf(i10));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final Ia a(String str, float f10) {
        a(str, Float.valueOf(f10));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final Ia a(String str, long j10) {
        a(str, Long.valueOf(j10));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final synchronized Ia a(String str, String str2) {
        a(str, (Object) str2);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final Ia a(String str, boolean z10) {
        a(str, Boolean.valueOf(z10));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final Set a() {
        HashSet hashSet;
        synchronized (this.f67725a) {
            hashSet = new HashSet(this.f67725a.keySet());
        }
        return hashSet;
    }

    public final void a(String str, Object obj) {
        synchronized (this.f67725a) {
            c();
            this.f67725a.put(str, obj);
        }
        synchronized (this.f67728d) {
            this.f67726b.put(str, obj);
            this.f67728d.notifyAll();
        }
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final boolean a(String str) {
        boolean zContainsKey;
        synchronized (this.f67725a) {
            c();
            zContainsKey = this.f67725a.containsKey(str);
        }
        return zContainsKey;
    }

    public final Object b(String str) {
        Object obj;
        synchronized (this.f67725a) {
            c();
            obj = this.f67725a.get(str);
        }
        return obj;
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final void b() {
        synchronized (this.f67728d) {
            this.f67728d.notifyAll();
        }
    }

    public final void c() {
        if (this.f67729e) {
            return;
        }
        try {
            this.f67725a.wait();
        } catch (InterruptedException unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f67728d.isRunning()) {
            this.f67728d.stopRunning();
        }
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final boolean getBoolean(String str, boolean z10) {
        Object objB = b(str);
        return objB instanceof Boolean ? ((Boolean) objB).booleanValue() : z10;
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final int getInt(String str, int i10) {
        Object objB = b(str);
        return objB instanceof Integer ? ((Integer) objB).intValue() : i10;
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final long getLong(String str, long j10) {
        Object objB = b(str);
        return objB instanceof Long ? ((Long) objB).longValue() : j10;
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final String getString(String str, String str2) {
        Object objB = b(str);
        return objB instanceof String ? (String) objB : str2;
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final Ia remove(String str) {
        synchronized (this.f67725a) {
            c();
            this.f67725a.remove(str);
        }
        synchronized (this.f67728d) {
            this.f67726b.put(str, this);
            this.f67728d.notifyAll();
        }
        return this;
    }
}
