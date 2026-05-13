package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.database.Cursor;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import org.json.JSONObject;

/* JADX INFO: compiled from: ReplaceTempDao.java */
/* JADX INFO: loaded from: classes12.dex */
public class k extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f37462a = "ReplaceTempDao";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static k f37463b;

    private k(f fVar) {
        super(fVar);
    }

    public static k a(f fVar) {
        if (f37463b == null) {
            synchronized (e.class) {
                if (f37463b == null) {
                    f37463b = new k(fVar);
                }
            }
        }
        return f37463b;
    }

    public void a(int i10) {
        long jCurrentTimeMillis = System.currentTimeMillis() - ((long) (i10 * BrandSafetyUtils.f51650g));
        try {
            if (getWritableDatabase() == null) {
                return;
            }
            getWritableDatabase().delete("c_replace_temp", "time<?", new String[]{String.valueOf(jCurrentTimeMillis)});
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void a(String str, JSONObject jSONObject) {
        try {
            if (getWritableDatabase() == null) {
                return;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("d_key", str);
            contentValues.put("d_value", jSONObject.toString());
            contentValues.put("time", Long.valueOf(System.currentTimeMillis()));
            if (a(str)) {
                getWritableDatabase().update("c_replace_temp", contentValues, "d_key = ? ", new String[]{str});
            } else {
                getWritableDatabase().insert("c_replace_temp", null, contentValues);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public boolean a(String str) {
        Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT d_value FROM c_replace_temp WHERE d_key= ? ", new String[]{str});
        if (cursorRawQuery != null && cursorRawQuery.getCount() > 0) {
            try {
                cursorRawQuery.close();
            } catch (Exception unused) {
            }
            return true;
        }
        if (cursorRawQuery != null) {
            try {
                cursorRawQuery.close();
            } catch (Exception unused2) {
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a A[EXC_TOP_SPLITTER, PHI: r1
      0x005a: PHI (r1v4 org.json.JSONObject) = (r1v0 org.json.JSONObject), (r1v6 org.json.JSONObject) binds: [B:20:0x004e, B:26:0x0058] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.json.JSONObject b(java.lang.String r4) {
        /*
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]
            r2 = 0
            r0[r2] = r4
            android.database.sqlite.SQLiteDatabase r4 = r3.getReadableDatabase()
            java.lang.String r2 = "SELECT * FROM c_replace_temp WHERE d_key = ? "
            android.database.Cursor r4 = r4.rawQuery(r2, r0)
            if (r4 == 0) goto L3f
            int r0 = r4.getCount()     // Catch: java.lang.Throwable -> L3d
            if (r0 <= 0) goto L3f
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L3d
            r0.<init>()     // Catch: java.lang.Throwable -> L3d
            r1 = r0
        L26:
            boolean r0 = r4.moveToNext()     // Catch: java.lang.Throwable -> L3d
            if (r0 == 0) goto L58
            java.lang.String r0 = "d_value"
            int r0 = r4.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r0 = r4.getString(r0)     // Catch: java.lang.Throwable -> L3d
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L3d
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L3d
            r1 = r2
            goto L26
        L3d:
            r0 = move-exception
            goto L45
        L3f:
            if (r4 == 0) goto L58
            r4.close()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L58
            goto L58
        L45:
            java.lang.String r2 = com.mbridge.msdk.foundation.db.k.f37462a     // Catch: java.lang.Throwable -> L51
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L51
            com.mbridge.msdk.foundation.tools.q0.b(r2, r0)     // Catch: java.lang.Throwable -> L51
            if (r4 == 0) goto L5d
            goto L5a
        L51:
            r0 = move-exception
            if (r4 == 0) goto L57
            r4.close()     // Catch: java.lang.Exception -> L57
        L57:
            throw r0
        L58:
            if (r4 == 0) goto L5d
        L5a:
            r4.close()     // Catch: java.lang.Exception -> L5d
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.k.b(java.lang.String):org.json.JSONObject");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0064 A[EXC_TOP_SPLITTER, PHI: r1
      0x0064: PHI (r1v7 org.json.JSONObject) = (r1v3 org.json.JSONObject), (r1v9 org.json.JSONObject) binds: [B:21:0x0057, B:28:0x0062] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.json.JSONObject d() {
        /*
            r6 = this;
            r0 = 7
            r6.a(r0)
            android.database.sqlite.SQLiteDatabase r0 = r6.getReadableDatabase()
            java.lang.String r1 = "SELECT * FROM c_replace_temp"
            r2 = 0
            android.database.Cursor r0 = r0.rawQuery(r1, r2)
            if (r0 == 0) goto L45
            int r1 = r0.getCount()     // Catch: java.lang.Throwable -> L43
            if (r1 <= 0) goto L45
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L43
            r1.<init>()     // Catch: java.lang.Throwable -> L43
        L1c:
            boolean r2 = r0.moveToNext()     // Catch: java.lang.Throwable -> L41
            if (r2 == 0) goto L3f
            java.lang.String r2 = "d_key"
            int r2 = r0.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L41
            java.lang.String r2 = r0.getString(r2)     // Catch: java.lang.Throwable -> L41
            java.lang.String r3 = "d_value"
            int r3 = r0.getColumnIndex(r3)     // Catch: java.lang.Throwable -> L41
            java.lang.String r3 = r0.getString(r3)     // Catch: java.lang.Throwable -> L41
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L41
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L41
            r1.put(r2, r4)     // Catch: java.lang.Throwable -> L41
            goto L1c
        L3f:
            r2 = r1
            goto L61
        L41:
            r2 = move-exception
            goto L4e
        L43:
            r1 = move-exception
            goto L4b
        L45:
            if (r0 == 0) goto L61
            r0.close()     // Catch: java.lang.Throwable -> L43
            goto L61
        L4b:
            r5 = r2
            r2 = r1
            r1 = r5
        L4e:
            java.lang.String r3 = com.mbridge.msdk.foundation.db.k.f37462a     // Catch: java.lang.Throwable -> L5a
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Throwable -> L5a
            com.mbridge.msdk.foundation.tools.q0.b(r3, r2)     // Catch: java.lang.Throwable -> L5a
            if (r0 == 0) goto L67
            goto L64
        L5a:
            r1 = move-exception
            if (r0 == 0) goto L60
            r0.close()     // Catch: java.lang.Exception -> L60
        L60:
            throw r1
        L61:
            r1 = r2
            if (r0 == 0) goto L67
        L64:
            r0.close()     // Catch: java.lang.Exception -> L67
        L67:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.k.d():org.json.JSONObject");
    }
}
