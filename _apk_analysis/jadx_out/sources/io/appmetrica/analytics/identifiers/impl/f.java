package io.appmetrica.analytics.identifiers.impl;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f64850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sn.l f64851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f64852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SafePackageManager f64853d;

    public f(Intent intent, sn.l lVar, String str) {
        this(new e(intent, str), lVar, str, new SafePackageManager());
    }

    public f(e eVar, sn.l lVar, String str, SafePackageManager safePackageManager) {
        this.f64850a = eVar;
        this.f64851b = lVar;
        this.f64852c = str;
        this.f64853d = safePackageManager;
    }

    public final Object a(Context context) throws g {
        if (this.f64853d.resolveService(context, this.f64850a.f64847a, 0) == null) {
            throw new l("could not resolve " + this.f64852c + " services");
        }
        IBinder iBinder = null;
        try {
            e eVar = this.f64850a;
            if (context.bindService(eVar.f64847a, eVar, 1)) {
                e eVar2 = this.f64850a;
                if (eVar2.f64848b == null) {
                    synchronized (eVar2.f64849c) {
                        if (eVar2.f64848b == null) {
                            try {
                                eVar2.f64849c.wait(3000L);
                            } catch (InterruptedException unused) {
                            }
                        }
                    }
                }
                iBinder = eVar2.f64848b;
            }
        } catch (Throwable unused2) {
        }
        if (iBinder != null) {
            return this.f64851b.invoke(iBinder);
        }
        throw new g("could not bind to " + this.f64852c + " services");
    }

    public final void b(Context context) {
        try {
            this.f64850a.a(context);
        } catch (Throwable unused) {
        }
    }
}
