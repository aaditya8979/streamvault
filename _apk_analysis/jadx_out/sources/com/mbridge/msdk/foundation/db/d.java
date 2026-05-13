package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.database.Cursor;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.w0;

/* JADX INFO: compiled from: CampaignClickDao.java */
/* JADX INFO: loaded from: classes12.dex */
public class d extends a<JumpLoaderResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f37432a = "d";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static d f37433b;

    private d(f fVar) {
        super(fVar);
    }

    public static synchronized d a(f fVar) {
        if (f37433b == null) {
            f37433b = new d(fVar);
        }
        return f37433b;
    }

    public synchronized long a(CampaignEx campaignEx, String str) {
        if (campaignEx == null) {
            return 0L;
        }
        try {
            String strA = w0.a(campaignEx.getJumpResult());
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", campaignEx.getId());
            contentValues.put("unitid", str);
            contentValues.put("result", strA);
            contentValues.put("cti", Integer.valueOf(campaignEx.getClickInterval() * 1000));
            contentValues.put("package_name", campaignEx.getPackageName());
            com.mbridge.msdk.setting.g gVarD = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
            contentValues.put("ts", Long.valueOf(System.currentTimeMillis()));
            if (gVarD != null && gVarD.X() > 0) {
                contentValues.put("cpei", Integer.valueOf(gVarD.X() * 1000));
            }
            if (gVarD != null && gVarD.Y() > 0) {
                contentValues.put("cpoci", Integer.valueOf(gVarD.Y() * 1000));
            }
            if (!a(campaignEx.getId(), str)) {
                return getWritableDatabase().insert("campaignclick", null, contentValues);
            }
            if (getWritableDatabase() == null) {
                return -1L;
            }
            return getWritableDatabase().update("campaignclick", contentValues, "id = ? AND unitid = ? ", new String[]{campaignEx.getId(), str});
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b(f37432a, e10.getMessage());
            }
            return -1L;
        }
    }

    public synchronized boolean a(String str, String str2) {
        Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT id FROM campaignclick WHERE id= ? AND unitid= ?", new String[]{str, str2});
        if (cursorRawQuery != null && cursorRawQuery.getCount() > 0) {
            cursorRawQuery.close();
            return true;
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005d A[Catch: all -> 0x006a, PHI: r11
      0x005d: PHI (r11v4 android.database.Cursor) = (r11v3 android.database.Cursor), (r11v6 android.database.Cursor) binds: [B:27:0x005b, B:18:0x0047] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #2 {, blocks: (B:13:0x0040, B:28:0x005d, B:34:0x0066, B:35:0x0069), top: B:40:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0066 A[Catch: all -> 0x006a, TRY_ENTER, TryCatch #2 {, blocks: (B:13:0x0040, B:28:0x005d, B:34:0x0066, B:35:0x0069), top: B:40:0x0002 }] */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized com.mbridge.msdk.click.entity.JumpLoaderResult b(java.lang.String r11, java.lang.String r12) {
        /*
            r10 = this;
            monitor-enter(r10)
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r10.getReadableDatabase()     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            java.lang.String r2 = "campaignclick"
            r3 = 0
            java.lang.String r4 = "id=? AND unitid=?"
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            r6 = 0
            r5[r6] = r11     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            r11 = 1
            r5[r11] = r12     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r11 = r1.query(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            if (r11 == 0) goto L47
            int r12 = r11.getCount()     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L62
            if (r12 <= 0) goto L47
            boolean r12 = r11.moveToFirst()     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L62
            if (r12 == 0) goto L47
            java.lang.String r12 = "result"
            int r12 = r11.getColumnIndex(r12)     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L62
            java.lang.String r12 = r11.getString(r12)     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L62
            boolean r1 = android.text.TextUtils.isEmpty(r12)     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L62
            if (r1 != 0) goto L47
            java.lang.Object r12 = com.mbridge.msdk.foundation.tools.w0.a(r12)     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L62
            com.mbridge.msdk.click.entity.JumpLoaderResult r12 = (com.mbridge.msdk.click.entity.JumpLoaderResult) r12     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L62
            r11.close()     // Catch: java.lang.Throwable -> L6a
            monitor-exit(r10)
            return r12
        L45:
            r12 = move-exception
            goto L4e
        L47:
            if (r11 == 0) goto L60
            goto L5d
        L4a:
            r12 = move-exception
            goto L64
        L4c:
            r12 = move-exception
            r11 = r0
        L4e:
            boolean r1 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch: java.lang.Throwable -> L62
            if (r1 == 0) goto L5b
            java.lang.String r1 = com.mbridge.msdk.foundation.db.d.f37432a     // Catch: java.lang.Throwable -> L62
            java.lang.String r12 = r12.getMessage()     // Catch: java.lang.Throwable -> L62
            com.mbridge.msdk.foundation.tools.q0.b(r1, r12)     // Catch: java.lang.Throwable -> L62
        L5b:
            if (r11 == 0) goto L60
        L5d:
            r11.close()     // Catch: java.lang.Throwable -> L6a
        L60:
            monitor-exit(r10)
            return r0
        L62:
            r12 = move-exception
            r0 = r11
        L64:
            if (r0 == 0) goto L69
            r0.close()     // Catch: java.lang.Throwable -> L6a
        L69:
            throw r12     // Catch: java.lang.Throwable -> L6a
        L6a:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.d.b(java.lang.String, java.lang.String):com.mbridge.msdk.click.entity.JumpLoaderResult");
    }

    public synchronized boolean c(String str, String str2) {
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT id FROM campaignclick WHERE id= ? AND unitid= ? AND cti + ts > " + System.currentTimeMillis(), new String[]{str, str2});
            if (cursorRawQuery != null && cursorRawQuery.getCount() > 0) {
                cursorRawQuery.close();
                return true;
            }
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            return false;
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b(f37432a, e10.getMessage());
            }
            return false;
        }
    }

    public synchronized void d() {
        try {
            getWritableDatabase().delete("campaignclick", " ( " + System.currentTimeMillis() + " - ts) > cti", null);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b(f37432a, e10.getMessage());
            }
        }
    }
}
