package com.apm.insight.e;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.apm.insight.e;

/* JADX INFO: compiled from: NpthDataManager.java */
/* JADX INFO: loaded from: classes9.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile a f7190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.apm.insight.e.a.b f7191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SQLiteDatabase f7192c;

    private a() {
    }

    public static a a() {
        if (f7190a == null) {
            synchronized (a.class) {
                if (f7190a == null) {
                    f7190a = new a();
                }
            }
        }
        return f7190a;
    }

    private void b() {
        if (this.f7191b == null) {
            a(e.g());
        }
    }

    public final synchronized void a(Context context) {
        try {
            this.f7192c = new b(context).getWritableDatabase();
        } catch (Throwable th2) {
            com.apm.insight.a.b(th2);
        }
        this.f7191b = new com.apm.insight.e.a.b();
    }

    public final synchronized void a(com.apm.insight.d.a aVar) {
        b();
        com.apm.insight.e.a.b bVar = this.f7191b;
        if (bVar != null) {
            bVar.a(this.f7192c, aVar);
        }
    }

    public final synchronized boolean a(String str) {
        b();
        com.apm.insight.e.a.b bVar = this.f7191b;
        if (bVar == null) {
            return false;
        }
        return bVar.a(this.f7192c, str);
    }
}
