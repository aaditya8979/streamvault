package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.text.TextUtils;
import com.ironsource.G5;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.o;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.q0;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import java.net.URLEncoder;

/* JADX INFO: compiled from: VideoReportDataDao.java */
/* JADX INFO: loaded from: classes12.dex */
public class n extends a<com.mbridge.msdk.foundation.entity.n> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f37476a = "com.mbridge.msdk.foundation.db.n";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static n f37477b;

    private n(f fVar) {
        super(fVar);
    }

    public static n a(f fVar) {
        if (f37477b == null) {
            synchronized (n.class) {
                if (f37477b == null) {
                    f37477b = new n(fVar);
                }
            }
        }
        return f37477b;
    }

    public synchronized long a(com.mbridge.msdk.foundation.entity.n nVar) {
        if (nVar != null) {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("key", nVar.n());
                contentValues.put("networkType", Integer.valueOf(nVar.q()));
                contentValues.put("network_str", nVar.r());
                contentValues.put("isCompleteView", Integer.valueOf(nVar.m()));
                contentValues.put("watchedMillis", Integer.valueOf(nVar.F()));
                contentValues.put("videoLength", Integer.valueOf(nVar.C()));
                if (!TextUtils.isEmpty(nVar.s())) {
                    contentValues.put("offerUrl", nVar.s());
                }
                if (!TextUtils.isEmpty(nVar.t())) {
                    contentValues.put("reason", URLEncoder.encode(nVar.t(), G5.N));
                }
                contentValues.put("result", Integer.valueOf(nVar.x()));
                contentValues.put("duration", nVar.g());
                contentValues.put("videoSize", Long.valueOf(nVar.D()));
                contentValues.put("type", nVar.h());
                String strI = nVar.i();
                if (!TextUtils.isEmpty(strI)) {
                    contentValues.put(CampaignEx.ENDCARD_URL, strI);
                }
                String strE = nVar.E();
                if (!TextUtils.isEmpty(strE)) {
                    contentValues.put("video_url", strE);
                }
                String strU = nVar.u();
                if (!TextUtils.isEmpty(strU)) {
                    contentValues.put(ImpressionLog.f51754x, strU);
                }
                String strV = nVar.v();
                if (!TextUtils.isEmpty(strV)) {
                    contentValues.put("rid_n", strV);
                }
                String strZ = nVar.z();
                if (!TextUtils.isEmpty(strZ)) {
                    contentValues.put("template_url", strZ);
                }
                String strL = nVar.l();
                if (!TextUtils.isEmpty(strL)) {
                    contentValues.put("image_url", strL);
                }
                String strA = nVar.a();
                if (!TextUtils.isEmpty(strA)) {
                    contentValues.put("ad_type", URLEncoder.encode(strA, G5.N));
                }
                contentValues.put("unitId", nVar.B());
                contentValues.put("campaignId", nVar.d());
                if ("2000039".equals(nVar.n())) {
                    String strB = o.b(nVar);
                    if (a1.b(strB)) {
                        contentValues.put("h5_click_data", strB);
                    }
                }
                String strW = nVar.w();
                if (!TextUtils.isEmpty(strW)) {
                    contentValues.put("resource_type", URLEncoder.encode(strW, G5.N));
                }
                String strF = nVar.f();
                if (!TextUtils.isEmpty(strF)) {
                    contentValues.put("device_id", URLEncoder.encode(strF, G5.N));
                }
                String strE2 = nVar.e();
                if (!TextUtils.isEmpty(strE2)) {
                    contentValues.put("creative", URLEncoder.encode(strE2, G5.N));
                }
                contentValues.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_AD_SPACE_T, Integer.valueOf(nVar.b()));
                return getWritableDatabase().insert("reward_report", null, contentValues);
            } catch (Exception e10) {
                q0.b(f37476a, e10.getMessage());
                return -1L;
            }
        }
        return -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0342 A[EXC_TOP_SPLITTER, PHI: r13
      0x0342: PHI (r13v3 android.database.Cursor) = (r13v2 android.database.Cursor), (r13v15 android.database.Cursor) binds: [B:98:0x0340, B:92:0x032d] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x034a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02d5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized java.util.List<com.mbridge.msdk.foundation.entity.n> a(java.lang.String r26) {
        /*
            Method dump skipped, instruction units count: 852
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.n.a(java.lang.String):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0024 A[EXC_TOP_SPLITTER, PHI: r0 r1
      0x0024: PHI (r0v4 android.database.Cursor) = (r0v3 android.database.Cursor), (r0v5 android.database.Cursor) binds: [B:15:0x0022, B:9:0x0019] A[DONT_GENERATE, DONT_INLINE]
      0x0024: PHI (r1v3 int) = (r1v0 int), (r1v5 int) binds: [B:15:0x0022, B:9:0x0019] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized int d() {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = 0
            r1 = 0
            java.lang.String r2 = "select count(*) from reward_report"
            android.database.sqlite.SQLiteDatabase r3 = r4.getReadableDatabase()     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L1e
            android.database.Cursor r0 = r3.rawQuery(r2, r0)     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L1e
            if (r0 == 0) goto L19
            boolean r2 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L1e
            if (r2 == 0) goto L19
            int r1 = r0.getInt(r1)     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L1e
        L19:
            if (r0 == 0) goto L27
            goto L24
        L1c:
            r1 = move-exception
            goto L29
        L1e:
            r2 = move-exception
            r2.printStackTrace()     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L27
        L24:
            r0.close()     // Catch: java.lang.Exception -> L27 java.lang.Throwable -> L2f
        L27:
            monitor-exit(r4)
            return r1
        L29:
            if (r0 == 0) goto L2e
            r0.close()     // Catch: java.lang.Exception -> L2e java.lang.Throwable -> L2f
        L2e:
            throw r1     // Catch: java.lang.Throwable -> L2f
        L2f:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.n.d():int");
    }
}
