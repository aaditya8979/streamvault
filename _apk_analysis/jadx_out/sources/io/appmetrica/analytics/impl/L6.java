package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class L6 extends InterruptionSafeThread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y4 f65523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ M6 f65524b;

    public L6(M6 m62, Y4 y42) {
        this.f65524b = m62;
        this.f65523a = y42;
    }

    public final synchronized void a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ContentValues contentValues = (ContentValues) it.next();
            this.f65524b.getClass();
            arrayList2.add(Integer.valueOf(contentValues.getAsInteger("type").intValue()));
        }
        Iterator it2 = this.f65524b.f65573j.iterator();
        while (it2.hasNext()) {
            ((T8) it2.next()).a(arrayList2);
        }
        ((C4929l5) this.f65523a.f66229p).e();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ArrayList<ContentValues> arrayList;
        while (isRunning()) {
            try {
                synchronized (this) {
                    if (M6.a(this.f65524b)) {
                        wait();
                    }
                }
            } catch (Throwable unused) {
                stopRunning();
            }
            synchronized (this.f65524b.f65568e) {
                arrayList = new ArrayList(this.f65524b.f65569f);
                this.f65524b.f65569f.clear();
            }
            M6 m62 = this.f65524b;
            m62.getClass();
            if (!arrayList.isEmpty()) {
                m62.f65565b.lock();
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    SQLiteDatabase writableDatabase = m62.f65566c.getWritableDatabase();
                    if (writableDatabase != null) {
                        try {
                            writableDatabase.beginTransaction();
                            for (ContentValues contentValues : arrayList) {
                                writableDatabase.insertOrThrow("events", null, contentValues);
                                m62.f65572i.incrementAndGet();
                                m62.a(contentValues, "Event saved to db");
                            }
                            writableDatabase.setTransactionSuccessful();
                            m62.f65572i.get();
                        } catch (Throwable unused2) {
                            sQLiteDatabase = writableDatabase;
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.endTransaction();
                            }
                        }
                    }
                    if (writableDatabase != null) {
                        try {
                            writableDatabase.endTransaction();
                        } catch (Throwable unused3) {
                        }
                    }
                } catch (Throwable unused4) {
                }
                m62.f65565b.unlock();
            }
            a(arrayList);
        }
    }
}
