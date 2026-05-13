package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.io.Closeable;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public final class Z6 extends SQLiteOpenHelper implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f66286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PublicLogger f66287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4895jn f66288c;

    public Z6(Context context, String str, C4895jn c4895jn, PublicLogger publicLogger) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, AbstractC5228x5.f67929b);
        this.f66288c = c4895jn;
        this.f66286a = str;
        this.f66287b = publicLogger;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getReadableDatabase() {
        try {
            return super.getReadableDatabase();
        } catch (Throwable th2) {
            this.f66287b.error(th2, "Could not get readable database %s due to an exception. AppMetrica SDK may behave unexpectedly.", this.f66286a);
            Rj rj2 = AbstractC5043pj.f67535a;
            rj2.getClass();
            rj2.a(new C5068qj("db_read_error", th2));
            return null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (Throwable th2) {
            this.f66287b.error(th2, "Could not get writable database %s due to an exception. AppMetrica SDK may behave unexpectedly.", this.f66286a);
            Rj rj2 = AbstractC5043pj.f67535a;
            rj2.getClass();
            rj2.a(new C5068qj("db_write_error", th2));
            return null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f66288c.f67071a.runScript(sQLiteDatabase);
        } catch (Throwable unused) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        C4895jn c4895jn = this.f66288c;
        if (i10 <= i11) {
            c4895jn.getClass();
            return;
        }
        try {
            c4895jn.f67072b.runScript(sQLiteDatabase);
        } catch (Throwable unused) {
        }
        try {
            c4895jn.f67071a.runScript(sQLiteDatabase);
        } catch (Throwable unused2) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        C4895jn c4895jn = this.f66288c;
        c4895jn.getClass();
        try {
            InterfaceC4921kn interfaceC4921kn = c4895jn.f67074d;
            if (interfaceC4921kn == null || interfaceC4921kn.a(sQLiteDatabase)) {
                return;
            }
            try {
                c4895jn.f67072b.runScript(sQLiteDatabase);
            } catch (Throwable unused) {
            }
            c4895jn.f67071a.runScript(sQLiteDatabase);
        } catch (Throwable unused2) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        boolean z10;
        C4895jn c4895jn = this.f66288c;
        c4895jn.getClass();
        if (i11 > i10) {
            z10 = false;
            for (int i12 = i10 + 1; i12 <= i11; i12++) {
                try {
                    Collection collection = (Collection) c4895jn.f67073c.f67572a.get(Integer.valueOf(i12));
                    if (collection != null) {
                        Iterator it = collection.iterator();
                        while (it.hasNext()) {
                            ((DatabaseScript) it.next()).runScript(sQLiteDatabase);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        } else {
            z10 = true;
        }
        if ((!c4895jn.f67074d.a(sQLiteDatabase)) || z10) {
            try {
                c4895jn.f67072b.runScript(sQLiteDatabase);
            } catch (Throwable unused2) {
            }
            try {
                c4895jn.f67071a.runScript(sQLiteDatabase);
            } catch (Throwable unused3) {
            }
        }
    }
}
