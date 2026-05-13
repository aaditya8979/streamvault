package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import io.appmetrica.analytics.internal.AppMetricaService;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class Dk implements ServiceWakeLock {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f65163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ck f65164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f65165c = new HashMap();

    public Dk(@NotNull Context context, @NotNull Ck ck2) {
        this.f65163a = context;
        this.f65164b = ck2;
    }

    @NotNull
    public final String a(@NotNull String str) {
        return "io.appmetrica.analytics.ACTION_SERVICE_WAKELOCK." + str;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock
    public final synchronized boolean acquireWakeLock(@NotNull String str) {
        if (this.f65165c.get(str) == null) {
            HashMap map = this.f65165c;
            Ck ck2 = this.f65164b;
            Context context = this.f65163a;
            String strA = a(str);
            ck2.f65127a.getClass();
            Intent intent = new Intent(context, (Class<?>) AppMetricaService.class);
            intent.setAction(strA);
            Bk bk2 = new Bk();
            try {
                context.bindService(intent, bk2, 1);
            } catch (Throwable unused) {
                bk2 = null;
            }
            map.put(str, bk2);
        }
        return this.f65165c.get(str) != null;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock
    public final synchronized void releaseWakeLock(@NotNull String str) {
        ServiceConnection serviceConnection = (ServiceConnection) this.f65165c.get(str);
        if (serviceConnection != null) {
            Ck ck2 = this.f65164b;
            a(str);
            Context context = this.f65163a;
            ck2.getClass();
            try {
                context.unbindService(serviceConnection);
            } catch (Throwable unused) {
            }
        }
    }
}
