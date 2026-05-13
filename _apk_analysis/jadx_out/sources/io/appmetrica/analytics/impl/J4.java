package io.appmetrica.analytics.impl;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class J4 extends DatabaseScript {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f65405a = 2000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f65406b = "number";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f65407c = "global_number";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f65408d = "number_of_type";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f65409e = "name";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f65410f = "value";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f65411g = "type";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f65412h = "time";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f65413i = "session_id";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f65414j = "error_environment";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f65415k = "session_type";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f65416l = "app_environment";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f65417m = "app_environment_revision";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f65418n = "truncated";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f65419o = "custom_type";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f65420p = "encrypting_mode";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f65421q = "profile_id";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f65422r = "first_occurrence_status";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f65423s = "source";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f65424t = "attribution_id_changed";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f65425u = "open_id";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f65426v = "extras";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f65427w = com.ironsource.Z7.f30778b;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C4802g7 f65428x = new C4802g7(null, 1, 0 == true ? 1 : 0);

    public static boolean a(C4776f7 c4776f7) {
        Long l10;
        EnumC4703cb enumC4703cb;
        Long l11;
        Long l12;
        Long l13;
        Integer num;
        Long l14 = c4776f7.f66730a;
        return (l14 == null || l14.longValue() < 10000000000L || c4776f7.f66731b == null || (l10 = c4776f7.f66732c) == null || l10.longValue() < 0 || (enumC4703cb = c4776f7.f66733d) == null || enumC4703cb == EnumC4703cb.EVENT_TYPE_UNDEFINED || (l11 = c4776f7.f66734e) == null || l11.longValue() < 0 || (l12 = c4776f7.f66735f) == null || l12.longValue() < 0 || ((l13 = c4776f7.f66736g.f66657d) != null && l13.longValue() < 0) || ((num = c4776f7.f66736g.f66662i) != null && num.intValue() < 0)) ? false : true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(25:92|3|(1:8)(3:9|(2:14|8)|15)|16|(1:21)(4:22|(2:27|21)|28|(1:33)(1:34))|35|(2:90|36)|(17:42|(1:47)|48|51|84|52|(1:57)(3:58|(1:60)(2:61|(0))|64)|88|67|(1:70)|71|86|72|75|(1:77)(1:78)|79|94)|41|84|52|(1:54)(12:55|57|88|67|(0)|71|86|72|75|(0)(0)|79|94)|58|(0)(0)|64|88|67|(0)|71|86|72|75|(0)(0)|79|94) */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0178, code lost:
    
        r27 = io.appmetrica.analytics.impl.EnumC4983n9.NATIVE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0197, code lost:
    
        r2 = -1;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0164 A[PHI: r3
      0x0164: PHI (r3v44 io.appmetrica.analytics.impl.n9) = (r3v43 io.appmetrica.analytics.impl.n9), (r3v45 io.appmetrica.analytics.impl.n9) binds: [B:56:0x0162, B:62:0x0170] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x016c A[Catch: all -> 0x0176, TRY_LEAVE, TryCatch #0 {all -> 0x0176, blocks: (B:52:0x014b, B:58:0x0167, B:61:0x016c, B:55:0x015e), top: B:84:0x014b, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a7 A[Catch: all -> 0x01bb, TryCatch #4 {all -> 0x01bb, blocks: (B:3:0x0004, B:9:0x002e, B:16:0x003b, B:22:0x00f6, B:28:0x0102, B:35:0x0112, B:71:0x0188, B:75:0x0198, B:79:0x01ad, B:78:0x01a7, B:65:0x0176, B:50:0x0147, B:31:0x0107, B:25:0x00fb, B:19:0x00ed, B:12:0x0033, B:6:0x0026, B:52:0x014b, B:58:0x0167, B:61:0x016c, B:55:0x015e, B:36:0x011c, B:42:0x0138, B:48:0x0144, B:45:0x013d, B:39:0x012f), top: B:92:0x0004, inners: #0, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final io.appmetrica.analytics.impl.C4776f7 a(android.database.Cursor r32) {
        /*
            Method dump skipped, instruction units count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.J4.a(android.database.Cursor):io.appmetrica.analytics.impl.f7");
    }

    @Override // io.appmetrica.analytics.coreapi.internal.db.DatabaseScript
    public final void runScript(@NotNull SQLiteDatabase sQLiteDatabase) {
        Cursor cursorQuery;
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS events (id INTEGER PRIMARY KEY,session_id INTEGER,session_type INTEGER,number_in_session INTEGER,type INTEGER,global_number INTEGER,time INTEGER,event_description BLOB )");
        Cursor cursor = null;
        try {
            cursorQuery = sQLiteDatabase.query(this.f65427w, null, null, null, null, null, null, String.valueOf(this.f65405a));
            while (cursorQuery.moveToNext()) {
                try {
                    C4776f7 c4776f7A = a(cursorQuery);
                    if (c4776f7A != null && a(c4776f7A)) {
                        try {
                            sQLiteDatabase.insertOrThrow("events", null, this.f65428x.fromModel(c4776f7A));
                        } catch (Throwable unused) {
                        }
                    }
                } catch (Throwable unused2) {
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursorQuery = cursor;
                    }
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + this.f65427w);
                }
            }
        } catch (Throwable unused3) {
        }
        cursorQuery.close();
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + this.f65427w);
    }
}
