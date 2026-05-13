package com.mbridge.msdk.config.component.load.downloader.database;

import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import com.ironsource.Y5;
import com.mbridge.msdk.config.component.load.downloader.database.c;
import com.mbridge.msdk.foundation.download.database.IDatabaseHelper;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: compiled from: DatabaseHelper.java */
/* JADX INFO: loaded from: classes10.dex */
public class a implements com.mbridge.msdk.config.component.load.downloader.database.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.load.downloader.database.d f36149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f36150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f36151c = com.mbridge.msdk.config.component.database.c.TABLE_FILE_DB;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile SQLiteDatabase f36152d;

    /* JADX INFO: renamed from: com.mbridge.msdk.config.component.load.downloader.database.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DatabaseHelper.java */
    public class RunnableC0427a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c.a f36153a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f36154b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f36155c;

        public RunnableC0427a(c.a aVar, String str, String str2) {
            this.f36153a = aVar;
            this.f36154b = str;
            this.f36155c = str2;
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x00b0  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00b7  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 201
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.config.component.load.downloader.database.a.RunnableC0427a.run():void");
        }
    }

    /* JADX INFO: compiled from: DatabaseHelper.java */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.database.b f36157a;

        public b(com.mbridge.msdk.config.component.load.downloader.database.b bVar) {
            this.f36157a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.f36152d)) {
                a aVar = a.this;
                aVar.f36152d = aVar.f36149a.getWritableDatabase();
            }
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.f36152d) || !a.this.f36152d.isOpen()) {
                return;
            }
            try {
                try {
                    a.this.f36152d.beginTransaction();
                    a.this.f36152d.insert(a.this.f36151c, null, com.mbridge.msdk.config.component.load.downloader.database.b.a(this.f36157a));
                    a.this.f36152d.setTransactionSuccessful();
                    try {
                        if (a.this.f36152d.inTransaction()) {
                            a.this.f36152d.endTransaction();
                        }
                    } catch (Throwable th2) {
                        q0.b(IDatabaseHelper.TAG, th2.getMessage());
                    }
                } catch (Exception e10) {
                    q0.b(IDatabaseHelper.TAG, e10.getMessage());
                    try {
                        if (a.this.f36152d.inTransaction()) {
                            a.this.f36152d.endTransaction();
                        }
                    } catch (Throwable th3) {
                        q0.b(IDatabaseHelper.TAG, th3.getMessage());
                    }
                }
            } catch (Throwable th4) {
                try {
                    if (a.this.f36152d.inTransaction()) {
                        a.this.f36152d.endTransaction();
                    }
                } catch (Throwable th5) {
                    q0.b(IDatabaseHelper.TAG, th5.getMessage());
                }
                throw th4;
            }
        }
    }

    /* JADX INFO: compiled from: DatabaseHelper.java */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.database.b f36159a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f36160b;

        public c(com.mbridge.msdk.config.component.load.downloader.database.b bVar, String str) {
            this.f36159a = bVar;
            this.f36160b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.f36152d)) {
                a aVar = a.this;
                aVar.f36152d = aVar.f36149a.getWritableDatabase();
            }
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.f36152d) || !a.this.f36152d.isOpen()) {
                return;
            }
            try {
                a.this.f36152d.update(a.this.f36151c, com.mbridge.msdk.config.component.load.downloader.database.b.a(this.f36159a), "URL = ? AND filePath = ?", new String[]{this.f36159a.c(), this.f36160b});
            } catch (Exception e10) {
                q0.b(IDatabaseHelper.TAG, e10.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: DatabaseHelper.java */
    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.database.b f36162a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f36163b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f36164c;

        public d(com.mbridge.msdk.config.component.load.downloader.database.b bVar, String str, String str2) {
            this.f36162a = bVar;
            this.f36163b = str;
            this.f36164c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.f36152d)) {
                a aVar = a.this;
                aVar.f36152d = aVar.f36149a.getWritableDatabase();
            }
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.f36152d) || !a.this.f36152d.isOpen()) {
                return;
            }
            try {
                a.this.f36152d.update(a.this.f36151c, com.mbridge.msdk.config.component.load.downloader.database.b.a(this.f36162a), "URL = ? AND filePath = ?", new String[]{this.f36163b, this.f36164c});
            } catch (Exception e10) {
                q0.b(IDatabaseHelper.TAG, e10.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: DatabaseHelper.java */
    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f36166a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f36167b;

        public e(String str, String str2) {
            this.f36166a = str;
            this.f36167b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.f36152d)) {
                a aVar = a.this;
                aVar.f36152d = aVar.f36149a.getWritableDatabase();
            }
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.f36152d) || !a.this.f36152d.isOpen()) {
                return;
            }
            try {
                a.this.f36152d.execSQL("DELETE FROM " + a.this.f36151c + " WHERE URL = ? AND " + Y5.c.f30725c + " = ?", new Object[]{this.f36166a, this.f36167b});
            } catch (Exception e10) {
                q0.b(IDatabaseHelper.TAG, e10.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: DatabaseHelper.java */
    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f36169a;

        public f(String str) {
            this.f36169a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.f36152d)) {
                a aVar = a.this;
                aVar.f36152d = aVar.f36149a.getWritableDatabase();
            }
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.f36152d) || !a.this.f36152d.isOpen()) {
                return;
            }
            try {
                a.this.f36152d.execSQL("DELETE FROM " + a.this.f36151c + " WHERE URL = ?", new Object[]{this.f36169a});
            } catch (Exception e10) {
                q0.b(IDatabaseHelper.TAG, e10.getMessage());
            }
        }
    }

    public a(Handler handler, com.mbridge.msdk.config.component.load.downloader.database.d dVar) {
        this.f36150b = handler;
        this.f36149a = dVar;
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.database.c
    public void a(com.mbridge.msdk.config.component.load.downloader.database.b bVar) {
        this.f36150b.postAtFrontOfQueue(new b(bVar));
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.database.c
    public void a(com.mbridge.msdk.config.component.load.downloader.database.b bVar, String str) {
        this.f36150b.post(new c(bVar, str));
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.database.c
    public void a(String str, String str2, com.mbridge.msdk.config.component.load.downloader.database.b bVar) {
        this.f36150b.post(new d(bVar, str, str2));
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.database.c
    public void a(String str, String str2, c.a aVar) {
        this.f36150b.post(new RunnableC0427a(aVar, str, str2));
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.database.c
    public void remove(String str) {
        this.f36150b.post(new f(str));
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.database.c
    public void remove(String str, String str2) {
        this.f36150b.post(new e(str, str2));
    }
}
