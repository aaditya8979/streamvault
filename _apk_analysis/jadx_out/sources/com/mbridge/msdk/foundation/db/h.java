package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.database.Cursor;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.Campaign;

/* JADX INFO: compiled from: DailyPlayCapDao.java */
/* JADX INFO: loaded from: classes12.dex */
public class h extends a<Campaign> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f37458a = "com.mbridge.msdk.foundation.db.h";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static h f37459b;

    private h(f fVar) {
        super(fVar);
    }

    public static h a(f fVar) {
        if (f37459b == null) {
            synchronized (h.class) {
                if (f37459b == null) {
                    f37459b = new h(fVar);
                }
            }
        }
        return f37459b;
    }

    private synchronized void c(String str) {
        try {
            if (getWritableDatabase() == null) {
                return;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("first_insert_timestamp", (Integer) 0);
            contentValues.put("play_time", (Integer) 0);
            getWritableDatabase().update("dailyplaycap", contentValues, "unit_id = ?", new String[]{str});
        } catch (Throwable unused) {
            q0.c(f37458a, "resetTimeAndTimestamp error");
        }
    }

    public synchronized boolean a(String str) {
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT play_time FROM dailyplaycap WHERE unit_id= ?", new String[]{str});
            if (cursorRawQuery != null && cursorRawQuery.getCount() > 0) {
                cursorRawQuery.close();
                return true;
            }
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x006e A[EXC_TOP_SPLITTER, PHI: r0 r1
      0x006e: PHI (r0v1 boolean) = (r0v0 boolean), (r0v3 boolean) binds: [B:23:0x006c, B:19:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x006e: PHI (r1v2 android.database.Cursor) = (r1v1 android.database.Cursor), (r1v3 android.database.Cursor) binds: [B:23:0x006c, B:19:0x0052] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(java.lang.String r12, int r13) {
        /*
            r11 = this;
            r0 = 0
            r1 = 0
            java.lang.String r2 = "SELECT * FROM dailyplaycap where unit_id = ?"
            android.database.sqlite.SQLiteDatabase r3 = r11.getReadableDatabase()     // Catch: java.lang.Throwable -> L55
            r4 = 1
            java.lang.String[] r5 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> L55
            r5[r0] = r12     // Catch: java.lang.Throwable -> L55
            android.database.Cursor r1 = r3.rawQuery(r2, r5)     // Catch: java.lang.Throwable -> L55
            if (r1 == 0) goto L52
            int r2 = r1.getCount()     // Catch: java.lang.Throwable -> L55
            if (r2 <= 0) goto L52
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L55
            if (r2 == 0) goto L52
            java.lang.String r2 = "first_insert_timestamp"
            int r2 = r1.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L55
            long r2 = r1.getLong(r2)     // Catch: java.lang.Throwable -> L55
            java.lang.String r5 = "play_time"
            int r5 = r1.getColumnIndex(r5)     // Catch: java.lang.Throwable -> L55
            int r5 = r1.getInt(r5)     // Catch: java.lang.Throwable -> L55
            long r5 = (long) r5     // Catch: java.lang.Throwable -> L55
            r7 = 0
            int r7 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r7 == 0) goto L52
            long r7 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L55
            r9 = 86400000(0x5265c00, double:4.2687272E-316)
            long r7 = r7 - r9
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 <= 0) goto L4a
            r11.c(r12)     // Catch: java.lang.Throwable -> L55
            goto L52
        L4a:
            if (r13 <= 0) goto L52
            long r12 = (long) r13
            int r12 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r12 < 0) goto L52
            r0 = r4
        L52:
            if (r1 == 0) goto L71
            goto L6e
        L55:
            r12 = move-exception
            java.lang.String r13 = com.mbridge.msdk.foundation.db.h.f37458a     // Catch: java.lang.Throwable -> L72
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L72
            r2.<init>()     // Catch: java.lang.Throwable -> L72
            java.lang.String r3 = "isOverCap is error"
            r2.append(r3)     // Catch: java.lang.Throwable -> L72
            r2.append(r12)     // Catch: java.lang.Throwable -> L72
            java.lang.String r12 = r2.toString()     // Catch: java.lang.Throwable -> L72
            com.mbridge.msdk.foundation.tools.q0.c(r13, r12)     // Catch: java.lang.Throwable -> L72
            if (r1 == 0) goto L71
        L6e:
            r1.close()     // Catch: java.lang.Throwable -> L71
        L71:
            return r0
        L72:
            r12 = move-exception
            if (r1 == 0) goto L78
            r1.close()     // Catch: java.lang.Throwable -> L78
        L78:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.h.a(java.lang.String, int):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00b2 A[EXC_TOP_SPLITTER, PHI: r1
      0x00b2: PHI (r1v2 android.database.Cursor) = (r1v0 android.database.Cursor), (r1v3 android.database.Cursor) binds: [B:30:0x00b0, B:24:0x00a7] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void b(java.lang.String r19) {
        /*
            r18 = this;
            r0 = r19
            monitor-enter(r18)
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r18.getWritableDatabase()     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lac
            if (r2 != 0) goto Lc
            monitor-exit(r18)
            return
        Lc:
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lac
            r2.<init>()     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lac
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lac
            boolean r5 = r18.a(r19)     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lac
            r6 = 1
            if (r5 == 0) goto L87
            java.lang.String r5 = "SELECT * FROM dailyplaycap where unit_id = ?"
            android.database.sqlite.SQLiteDatabase r8 = r18.getReadableDatabase()     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lac
            r9 = 1
            java.lang.String[] r10 = new java.lang.String[r9]     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lac
            r11 = 0
            r10[r11] = r0     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lac
            android.database.Cursor r1 = r8.rawQuery(r5, r10)     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lac
            r12 = 0
            if (r1 == 0) goto L5d
            int r5 = r1.getCount()     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lac
            if (r5 <= 0) goto L5d
            r1.moveToFirst()     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lac
            java.lang.String r5 = "first_insert_timestamp"
            int r5 = r1.getColumnIndex(r5)     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lac
            long r14 = r1.getLong(r5)     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lac
            java.lang.String r5 = "play_time"
            int r5 = r1.getColumnIndex(r5)     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lac
            int r5 = r1.getInt(r5)     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lac
            long r9 = (long) r5     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lac
            r16 = 86400000(0x5265c00, double:4.2687272E-316)
            long r16 = r3 - r16
            int r5 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r5 <= 0) goto L5f
            r18.c(r19)     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lac
            r9 = r12
            goto L5f
        L5d:
            r9 = r12
            r14 = r9
        L5f:
            int r5 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r5 != 0) goto L6c
            java.lang.String r5 = "first_insert_timestamp"
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lac
            r2.put(r5, r3)     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lac
        L6c:
            java.lang.String r3 = "play_time"
            long r9 = r9 + r6
            java.lang.Long r4 = java.lang.Long.valueOf(r9)     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lac
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lac
            java.lang.String r3 = "unit_id = ?"
            android.database.sqlite.SQLiteDatabase r4 = r18.getWritableDatabase()     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lac
            java.lang.String r5 = "dailyplaycap"
            r6 = 1
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lac
            r6[r11] = r0     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lac
            r4.update(r5, r2, r3, r6)     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lac
            goto La7
        L87:
            java.lang.String r5 = "first_insert_timestamp"
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lac
            r2.put(r5, r3)     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lac
            java.lang.String r3 = "play_time"
            java.lang.Long r4 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lac
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lac
            java.lang.String r3 = "unit_id"
            r2.put(r3, r0)     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lac
            android.database.sqlite.SQLiteDatabase r0 = r18.getWritableDatabase()     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lac
            java.lang.String r3 = "dailyplaycap"
            r0.insert(r3, r1, r2)     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lac
        La7:
            if (r1 == 0) goto Lb5
            goto Lb2
        Laa:
            r0 = move-exception
            goto Lb7
        Lac:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.lang.Throwable -> Laa
            if (r1 == 0) goto Lb5
        Lb2:
            r1.close()     // Catch: java.lang.Throwable -> Lb5
        Lb5:
            monitor-exit(r18)
            return
        Lb7:
            if (r1 == 0) goto Lbc
            r1.close()     // Catch: java.lang.Throwable -> Lbc
        Lbc:
            throw r0     // Catch: java.lang.Throwable -> Lbd
        Lbd:
            r0 = move-exception
            r1 = r0
            monitor-exit(r18)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.h.b(java.lang.String):void");
    }
}
