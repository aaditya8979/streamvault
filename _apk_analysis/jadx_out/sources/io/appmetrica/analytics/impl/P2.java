package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class P2 implements InterfaceC4969mk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f65735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Intent f65736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f65737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final H5 f65738d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final IHandlerExecutor f65739e;

    public P2(@NonNull Context context, @NonNull IHandlerExecutor iHandlerExecutor) {
        this(context, iHandlerExecutor, 0);
    }

    public P2(Context context, IHandlerExecutor iHandlerExecutor, int i10) {
        this.f65735a = new ArrayList();
        this.f65736b = null;
        this.f65737c = context;
        this.f65739e = iHandlerExecutor;
        this.f65738d = G5.a(new C5150u2(new O2(this), iHandlerExecutor));
    }

    public final Intent a() {
        Intent intentRegisterReceiver;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        H5 h52 = this.f65738d;
        Context context = this.f65737c;
        IHandlerExecutor iHandlerExecutor = this.f65739e;
        synchronized (h52) {
            intentRegisterReceiver = null;
            try {
                intentRegisterReceiver = context.registerReceiver(h52.f65307a, intentFilter, null, iHandlerExecutor.getHandler());
                h52.f65308b = true;
            } catch (Throwable unused) {
            }
        }
        return intentRegisterReceiver;
    }

    @Nullable
    public final synchronized Intent a(@NonNull Consumer<Intent> consumer) {
        this.f65735a.add(consumer);
        return this.f65736b;
    }

    public final void b() {
        this.f65736b = null;
        H5 h52 = this.f65738d;
        Context context = this.f65737c;
        synchronized (h52) {
            if (h52.f65308b) {
                try {
                    context.unregisterReceiver(h52.f65307a);
                    h52.f65308b = false;
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4969mk
    public final synchronized void onCreate() {
        Intent intentA = a();
        this.f65736b = intentA;
        Iterator it = this.f65735a.iterator();
        while (it.hasNext()) {
            ((Consumer) it.next()).consume(intentA);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4969mk
    public final synchronized void onDestroy() {
        this.f65736b = null;
        b();
        Iterator it = this.f65735a.iterator();
        while (it.hasNext()) {
            ((Consumer) it.next()).consume(null);
        }
    }
}
