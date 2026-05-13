package com.ironsource;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.SystemClock;
import android.provider.BaseColumns;
import android.util.Log;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class G4 extends SQLiteOpenHelper implements H7 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static G4 f29371f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f29372g = " TEXT";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f29373h = " INTEGER";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f29374i = ",";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final H4 f29375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f29376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f29377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f29378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f29379e;

    public static abstract class a implements BaseColumns {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f29380a = "events";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f29381b = 4;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f29382c = "eventid";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f29383d = "timestamp";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f29384e = "type";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f29385f = "data";
    }

    public G4(Context context, String str, int i10) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i10);
        this.f29375a = new H4();
        this.f29376b = 4;
        this.f29377c = 400;
        this.f29378d = "DROP TABLE IF EXISTS events";
        this.f29379e = "CREATE TABLE events (_id INTEGER PRIMARY KEY,eventid INTEGER,timestamp INTEGER,type TEXT,data TEXT )";
    }

    private ContentValues a(C5 c52, String str) {
        if (c52 == null) {
            return null;
        }
        ContentValues contentValues = new ContentValues(4);
        contentValues.put("eventid", Integer.valueOf(c52.c()));
        contentValues.put("timestamp", Long.valueOf(c52.d()));
        contentValues.put("type", str);
        contentValues.put("data", c52.a());
        return contentValues;
    }

    private synchronized SQLiteDatabase a(boolean z10) throws Throwable {
        int i10 = 0;
        while (true) {
            try {
                if (z10) {
                    return this.f29375a.a(true, this);
                }
                return this.f29375a.a(false, this);
            } catch (Throwable th2) {
                C4228r4.d().a(th2);
                i10++;
                if (i10 >= 4) {
                    throw th2;
                }
                SystemClock.sleep(i10 * 400);
            }
        }
    }

    public static synchronized G4 a(Context context, String str, int i10) {
        if (f29371f == null) {
            f29371f = new G4(context, str, i10);
        }
        return f29371f;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0099 A[Catch: all -> 0x00b6, DONT_GENERATE, PHI: r11
      0x0099: PHI (r11v2 android.database.sqlite.SQLiteDatabase) = (r11v1 android.database.sqlite.SQLiteDatabase), (r11v3 android.database.sqlite.SQLiteDatabase) binds: [B:39:0x0097, B:26:0x0071] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #2 {, blocks: (B:3:0x0001, B:22:0x0064, B:24:0x006a, B:25:0x006d, B:40:0x0099, B:34:0x0088, B:36:0x008e, B:38:0x0093, B:45:0x00a1, B:47:0x00a7, B:49:0x00ac, B:51:0x00b2, B:52:0x00b5, B:32:0x0078), top: B:60:0x0001, inners: #3 }] */
    @Override // com.ironsource.H7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized java.util.ArrayList<com.ironsource.C5> a(java.lang.String r13) {
        /*
            r12 = this;
            monitor-enter(r12)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lb6
            r0.<init>()     // Catch: java.lang.Throwable -> Lb6
            r1 = 0
            r2 = 0
            android.database.sqlite.SQLiteDatabase r11 = r12.a(r1)     // Catch: java.lang.Throwable -> L76
            java.lang.String r6 = "type = ?"
            r3 = 1
            java.lang.String[] r7 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L74
            r7[r1] = r13     // Catch: java.lang.Throwable -> L74
            java.lang.String r10 = "timestamp ASC"
            java.lang.String r4 = "events"
            r5 = 0
            r8 = 0
            r9 = 0
            r3 = r11
            android.database.Cursor r2 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L74
            int r13 = r2.getCount()     // Catch: java.lang.Throwable -> L74
            if (r13 <= 0) goto L64
            r2.moveToFirst()     // Catch: java.lang.Throwable -> L74
        L28:
            boolean r13 = r2.isAfterLast()     // Catch: java.lang.Throwable -> L74
            if (r13 != 0) goto L61
            java.lang.String r13 = "eventid"
            int r13 = r2.getColumnIndex(r13)     // Catch: java.lang.Throwable -> L74
            if (r13 >= 0) goto L37
            goto L28
        L37:
            int r13 = r2.getInt(r13)     // Catch: java.lang.Throwable -> L74
            java.lang.String r1 = "timestamp"
            int r1 = r2.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L74
            if (r1 >= 0) goto L44
            goto L28
        L44:
            long r3 = r2.getLong(r1)     // Catch: java.lang.Throwable -> L74
            java.lang.String r1 = "data"
            int r1 = r2.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L74
            if (r1 >= 0) goto L51
            goto L28
        L51:
            java.lang.String r1 = r2.getString(r1)     // Catch: java.lang.Throwable -> L74
            com.ironsource.C5 r5 = new com.ironsource.C5     // Catch: java.lang.Throwable -> L74
            r5.<init>(r13, r3, r1)     // Catch: java.lang.Throwable -> L74
            r0.add(r5)     // Catch: java.lang.Throwable -> L74
            r2.moveToNext()     // Catch: java.lang.Throwable -> L74
            goto L28
        L61:
            r2.close()     // Catch: java.lang.Throwable -> L74
        L64:
            boolean r13 = r2.isClosed()     // Catch: java.lang.Throwable -> Lb6
            if (r13 != 0) goto L6d
            r2.close()     // Catch: java.lang.Throwable -> Lb6
        L6d:
            boolean r13 = r11.isOpen()     // Catch: java.lang.Throwable -> Lb6
            if (r13 == 0) goto L9c
            goto L99
        L74:
            r13 = move-exception
            goto L78
        L76:
            r13 = move-exception
            r11 = r2
        L78:
            com.ironsource.r4 r1 = com.ironsource.C4228r4.d()     // Catch: java.lang.Throwable -> L9e
            r1.a(r13)     // Catch: java.lang.Throwable -> L9e
            java.lang.String r1 = "IronSource"
            java.lang.String r3 = "Exception while loading events: "
            android.util.Log.e(r1, r3, r13)     // Catch: java.lang.Throwable -> L9e
            if (r2 == 0) goto L91
            boolean r13 = r2.isClosed()     // Catch: java.lang.Throwable -> Lb6
            if (r13 != 0) goto L91
            r2.close()     // Catch: java.lang.Throwable -> Lb6
        L91:
            if (r11 == 0) goto L9c
            boolean r13 = r11.isOpen()     // Catch: java.lang.Throwable -> Lb6
            if (r13 == 0) goto L9c
        L99:
            r11.close()     // Catch: java.lang.Throwable -> Lb6
        L9c:
            monitor-exit(r12)
            return r0
        L9e:
            r13 = move-exception
            if (r2 == 0) goto Laa
            boolean r0 = r2.isClosed()     // Catch: java.lang.Throwable -> Lb6
            if (r0 != 0) goto Laa
            r2.close()     // Catch: java.lang.Throwable -> Lb6
        Laa:
            if (r11 == 0) goto Lb5
            boolean r0 = r11.isOpen()     // Catch: java.lang.Throwable -> Lb6
            if (r0 == 0) goto Lb5
            r11.close()     // Catch: java.lang.Throwable -> Lb6
        Lb5:
            throw r13     // Catch: java.lang.Throwable -> Lb6
        Lb6:
            r13 = move-exception
            monitor-exit(r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.G4.a(java.lang.String):java.util.ArrayList");
    }

    @Override // com.ironsource.H7
    public synchronized void a(List<C5> list, String str) {
        SQLiteDatabase sQLiteDatabaseA;
        if (list != null) {
            if (!list.isEmpty()) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    sQLiteDatabaseA = a(true);
                    try {
                        Iterator<C5> it = list.iterator();
                        while (it.hasNext()) {
                            ContentValues contentValuesA = a(it.next(), str);
                            if (sQLiteDatabaseA != null && contentValuesA != null) {
                                sQLiteDatabaseA.insert("events", null, contentValuesA);
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        sQLiteDatabase = sQLiteDatabaseA;
                        try {
                            C4228r4.d().a(th);
                            Log.e("IronSource", "Exception while saving events: ", th);
                            if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                                sQLiteDatabaseA = sQLiteDatabase;
                            }
                        } catch (Throwable th3) {
                            if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                                sQLiteDatabase.close();
                            }
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
                if (sQLiteDatabaseA != null && sQLiteDatabaseA.isOpen()) {
                    sQLiteDatabaseA.close();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031 A[Catch: all -> 0x0043, DONT_GENERATE, PHI: r0
      0x0031: PHI (r0v2 android.database.sqlite.SQLiteDatabase) = (r0v1 android.database.sqlite.SQLiteDatabase), (r0v3 android.database.sqlite.SQLiteDatabase) binds: [B:13:0x002f, B:7:0x0017] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0002, B:6:0x0013, B:14:0x0031, B:12:0x002b, B:19:0x0039, B:21:0x003f, B:22:0x0042, B:10:0x001b, B:5:0x000a), top: B:26:0x0002, inners: #1, #2 }] */
    @Override // com.ironsource.H7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void b(java.lang.String r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            java.lang.String r1 = "type = ?"
            r2 = 1
            java.lang.String[] r3 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> L43
            r4 = 0
            r3[r4] = r6     // Catch: java.lang.Throwable -> L43
            android.database.sqlite.SQLiteDatabase r0 = r5.a(r2)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r6 = "events"
            r0.delete(r6, r1, r3)     // Catch: java.lang.Throwable -> L1a
            boolean r6 = r0.isOpen()     // Catch: java.lang.Throwable -> L43
            if (r6 == 0) goto L34
            goto L31
        L1a:
            r6 = move-exception
            com.ironsource.r4 r1 = com.ironsource.C4228r4.d()     // Catch: java.lang.Throwable -> L36
            r1.a(r6)     // Catch: java.lang.Throwable -> L36
            java.lang.String r1 = "IronSource"
            java.lang.String r2 = "Exception while clearing events: "
            android.util.Log.e(r1, r2, r6)     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L34
            boolean r6 = r0.isOpen()     // Catch: java.lang.Throwable -> L43
            if (r6 == 0) goto L34
        L31:
            r0.close()     // Catch: java.lang.Throwable -> L43
        L34:
            monitor-exit(r5)
            return
        L36:
            r6 = move-exception
            if (r0 == 0) goto L42
            boolean r1 = r0.isOpen()     // Catch: java.lang.Throwable -> L43
            if (r1 == 0) goto L42
            r0.close()     // Catch: java.lang.Throwable -> L43
        L42:
            throw r6     // Catch: java.lang.Throwable -> L43
        L43:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.G4.b(java.lang.String):void");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY,eventid INTEGER,timestamp INTEGER,type TEXT,data TEXT )");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS events");
        onCreate(sQLiteDatabase);
    }
}
