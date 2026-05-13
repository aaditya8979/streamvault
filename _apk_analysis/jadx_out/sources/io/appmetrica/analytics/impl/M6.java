package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.ironsource.C3978d4;
import io.appmetrica.analytics.coreutils.internal.db.DBUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class M6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock.ReadLock f65564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReentrantReadWriteLock.WriteLock f65565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Z6 f65566c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final L6 f65567d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f65568e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f65569f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Context f65570g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Y4 f65571h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicLong f65572i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f65573j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final I6 f65574k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C4802g7 f65575l;

    static {
        HashSet hashSet = new HashSet();
        EnumC4703cb enumC4703cb = EnumC4703cb.EVENT_TYPE_UNDEFINED;
        hashSet.add(0);
        hashSet.add(6400);
    }

    public M6(Y4 y42, Z6 z62, I6 i62, C4802g7 c4802g7) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f65564a = reentrantReadWriteLock.readLock();
        this.f65565b = reentrantReadWriteLock.writeLock();
        this.f65568e = new Object();
        this.f65569f = new ArrayList(3);
        AtomicLong atomicLong = new AtomicLong();
        this.f65572i = atomicLong;
        this.f65573j = new ArrayList();
        this.f65566c = z62;
        this.f65570g = y42.getContext();
        this.f65571h = y42;
        this.f65574k = i62;
        this.f65575l = c4802g7;
        atomicLong.set(c());
        L6 l62 = new L6(this, y42);
        this.f65567d = l62;
        l62.setName(a(y42));
    }

    public static String a(Fa fa2) {
        return "DatabaseWorker [" + fa2.b().e() + C3978d4.j.f31385e;
    }

    public static String a(LinkedHashMap linkedHashMap) {
        StringBuilder sb2 = new StringBuilder("id >= ?");
        for (String str : linkedHashMap.keySet()) {
            sb2.append(sb2.length() > 0 ? " AND " : "");
            sb2.append(str + " = ? ");
        }
        if (TextUtils.isEmpty(sb2.toString())) {
            return null;
        }
        return sb2.toString();
    }

    public static boolean a(M6 m62) {
        boolean zIsEmpty;
        synchronized (m62.f65568e) {
            zIsEmpty = m62.f65569f.isEmpty();
        }
        return zIsEmpty;
    }

    public static String[] a(String[] strArr, LinkedHashMap linkedHashMap) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(strArr));
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Map.Entry) it.next()).getValue());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public final int a(SQLiteDatabase sQLiteDatabase) {
        try {
            return this.f65574k.a(sQLiteDatabase, String.format("id IN (SELECT id FROM events ORDER BY CASE WHEN type IN (%1$s) THEN 2 WHEN type IN (%2$s) THEN 1 ELSE 0 END, id LIMIT (SELECT count() FROM events) / %3$s)", TextUtils.join(", ", AbstractC5232x9.f67941i), TextUtils.join(", ", AbstractC5232x9.f67942j), 10), 2, this.f65571h.f66215b.f65832b, true).f65276b;
        } catch (Throwable th2) {
            Rj rj2 = AbstractC5043pj.f67535a;
            rj2.getClass();
            rj2.a(new C5068qj("deleteExcessiveReports exception", th2));
            return 0;
        }
    }

    public final long a(Set set) {
        this.f65564a.lock();
        Cursor cursorRawQuery = null;
        long j10 = 0;
        try {
            SQLiteDatabase readableDatabase = this.f65566c.getReadableDatabase();
            if (readableDatabase != null) {
                StringBuilder sb2 = new StringBuilder("SELECT count() FROM events");
                if (!set.isEmpty()) {
                    sb2.append(" WHERE ");
                }
                Iterator it = set.iterator();
                int i10 = 0;
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    if (i10 > 0) {
                        sb2.append(" OR ");
                    }
                    sb2.append("type == " + num);
                    i10++;
                }
                cursorRawQuery = readableDatabase.rawQuery(sb2.toString(), null);
                if (cursorRawQuery.moveToFirst()) {
                    j10 = cursorRawQuery.getLong(0);
                }
            }
        } catch (Throwable unused) {
        }
        mo.a(cursorRawQuery);
        this.f65564a.unlock();
        return j10;
    }

    public final ContentValues a(long j10, Wk wk2) {
        ContentValues contentValues = new ContentValues();
        this.f65564a.lock();
        Cursor cursorRawQuery = null;
        try {
            SQLiteDatabase readableDatabase = this.f65566c.getReadableDatabase();
            if (readableDatabase != null) {
                cursorRawQuery = readableDatabase.rawQuery(String.format(Locale.US, "SELECT report_request_parameters FROM sessions WHERE id = %s AND type = %s ORDER BY id DESC LIMIT 1", Long.valueOf(j10), Integer.valueOf(wk2.f66139a)), null);
                if (cursorRawQuery.moveToNext()) {
                    ContentValues contentValues2 = new ContentValues();
                    DatabaseUtils.cursorRowToContentValues(cursorRawQuery, contentValues2);
                    contentValues = contentValues2;
                }
            }
        } catch (Throwable unused) {
        }
        mo.a(cursorRawQuery);
        this.f65564a.unlock();
        return contentValues;
    }

    public final void a() {
        SQLiteDatabase writableDatabase;
        try {
            this.f65565b.lock();
            if (this.f65572i.get() > ((C4941lh) this.f65571h.f66224k.a()).f67233v && (writableDatabase = this.f65566c.getWritableDatabase()) != null) {
                int iA = a(writableDatabase);
                this.f65572i.addAndGet(-iA);
                if (iA != 0) {
                    Iterator it = this.f65573j.iterator();
                    while (it.hasNext()) {
                        ((T8) it.next()).a();
                    }
                }
            }
        } catch (Throwable unused) {
        }
        this.f65565b.unlock();
    }

    public final void a(long j10, int i10, int i11, boolean z10) {
        if (i11 <= 0) {
            return;
        }
        this.f65565b.lock();
        try {
            String str = String.format(Locale.US, "%1$s = %2$s AND %3$s = %4$s AND %5$s <= (SELECT %5$s FROM %6$s WHERE %1$s = %2$s AND %3$s = %4$s ORDER BY %5$s ASC LIMIT %7$s, 1)", "session_id", Long.toString(j10), "session_type", Integer.toString(i10), "id", "events", Integer.toString(i11 - 1));
            SQLiteDatabase writableDatabase = this.f65566c.getWritableDatabase();
            if (writableDatabase != null) {
                G6 g6A = this.f65574k.a(writableDatabase, str, 1, this.f65571h.f66215b.f65832b, z10);
                if (g6A.f65275a != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = g6A.f65275a.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Integer.valueOf(((ContentValues) it.next()).getAsInteger("type").intValue()));
                    }
                    Iterator it2 = this.f65573j.iterator();
                    while (it2.hasNext()) {
                        ((T8) it2.next()).b(arrayList);
                    }
                }
                List list = g6A.f65275a;
                if (list != null) {
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        a((ContentValues) list.get(i12), "Event removed from db");
                    }
                }
                this.f65572i.addAndGet(-g6A.f65276b);
            }
        } catch (Throwable unused) {
        }
        this.f65565b.unlock();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(long j10, Wk wk2, long j11) {
        JSONObject jSONObject;
        boolean zB;
        C5155u7 c5155u7 = new C5155u7(null, 1, 0 == true ? 1 : 0);
        C4941lh c4941lh = (C4941lh) this.f65571h.f66224k.a();
        Long lValueOf = Long.valueOf(j10);
        Long lValueOf2 = Long.valueOf(j11);
        try {
            jSONObject = new JSONObject().put("dId", c4941lh.getDeviceId()).put("uId", c4941lh.getUuid()).put("appVer", c4941lh.getAppVersion()).put("appBuild", c4941lh.getAppBuildNumber()).put("kitBuildType", c4941lh.getAnalyticsSdkBuildType()).put("osVer", c4941lh.getOsVersion()).put("osApiLev", c4941lh.getOsApiLevel()).put(com.ironsource.Q6.f30256q, c4941lh.getLocale()).put("root", c4941lh.getDeviceRootStatus()).put("app_debuggable", ((O5) c4941lh).f65684a).put(CommonUrlParts.APP_FRAMEWORK, c4941lh.getAppFramework()).put("attribution_id", c4941lh.f67229r).put("analyticsSdkVersionName", c4941lh.getAnalyticsSdkVersionName()).put("kitBuildNumber", c4941lh.getAnalyticsSdkBuildNumber());
        } catch (Throwable unused) {
            jSONObject = new JSONObject();
        }
        String string = jSONObject.toString();
        Long lValueOf3 = Long.valueOf(Jn.a());
        Yj yj2 = Xj.f66181a;
        synchronized (yj2) {
            zB = yj2.f66270b.b(true);
        }
        ContentValues contentValuesA = c5155u7.fromModel(new C5130t7(lValueOf, wk2, string, new C5105s7(lValueOf2, lValueOf3, Boolean.valueOf(zB))));
        if (contentValuesA == null) {
            return;
        }
        this.f65565b.lock();
        try {
            SQLiteDatabase writableDatabase = this.f65566c.getWritableDatabase();
            if (writableDatabase != null) {
                writableDatabase.insertOrThrow("sessions", null, contentValuesA);
            }
        } catch (Throwable unused2) {
        }
        this.f65565b.unlock();
    }

    public final void a(ContentValues contentValues) {
        synchronized (this.f65568e) {
            this.f65569f.add(contentValues);
        }
        synchronized (this.f65567d) {
            this.f65567d.notifyAll();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(ContentValues contentValues, String str) {
        Integer asInteger = contentValues.getAsInteger("type");
        if (AbstractC5232x9.f67936d.contains(EnumC4703cb.a(asInteger != null ? asInteger.intValue() : -1))) {
            C4776f7 c4776f7A = new C4802g7(null, 1, 0 == true ? 1 : 0).toModel(contentValues);
            PublicLogger publicLogger = this.f65571h.f66226m;
            EnumC4703cb enumC4703cb = c4776f7A.f66733d;
            C4750e7 c4750e7 = c4776f7A.f66736g;
            publicLogger.info(Rf.a(str, enumC4703cb, c4750e7.f66655b, c4750e7.f66656c), new Object[0]);
        }
    }

    public final void a(T8 t82) {
        this.f65573j.add(t82);
    }

    public final long b() {
        this.f65564a.lock();
        try {
            return this.f65572i.get();
        } finally {
            this.f65564a.unlock();
        }
    }

    public final long c() {
        SQLiteDatabase readableDatabase;
        this.f65564a.lock();
        try {
            readableDatabase = this.f65566c.getReadableDatabase();
        } catch (Throwable unused) {
        }
        long jQueryRowsCount = readableDatabase != null ? DBUtils.queryRowsCount(readableDatabase, "events") : 0L;
        this.f65564a.unlock();
        return jQueryRowsCount;
    }

    public final void d() {
        Cursor cursor;
        Cursor cursorRawQuery;
        this.f65564a.lock();
        Cursor cursorRawQuery2 = null;
        try {
            SQLiteDatabase readableDatabase = this.f65566c.getReadableDatabase();
            if (readableDatabase != null) {
                cursorRawQuery = readableDatabase.rawQuery(" SELECT DISTINCT id From sessions order by id asc ", new String[0]);
                try {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("All sessions in db: ");
                    while (cursorRawQuery.moveToNext()) {
                        stringBuffer.append(cursorRawQuery.getString(0));
                        stringBuffer.append(", ");
                    }
                    cursorRawQuery2 = readableDatabase.rawQuery(" SELECT DISTINCT session_id From events order by session_id asc ", new String[0]);
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("All sessions in reports db: ");
                    while (cursorRawQuery2.moveToNext()) {
                        stringBuffer2.append(cursorRawQuery2.getString(0));
                        stringBuffer2.append(", ");
                    }
                } catch (Throwable unused) {
                    cursor = cursorRawQuery2;
                    cursorRawQuery2 = cursorRawQuery;
                    cursorRawQuery = cursorRawQuery2;
                    cursorRawQuery2 = cursor;
                }
            } else {
                cursorRawQuery = null;
            }
        } catch (Throwable unused2) {
            cursor = null;
        }
        this.f65564a.unlock();
        mo.a(cursorRawQuery);
        mo.a(cursorRawQuery2);
    }

    public final void e() {
        this.f65567d.start();
    }
}
