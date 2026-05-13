package io.appmetrica.analytics.identifiers.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Intent f64847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IBinder f64848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f64849c = new Object();

    public e(Intent intent, String str) {
        this.f64847a = intent;
        String.format("[AdvServiceConnection-%s]", str);
    }

    public final void a(Context context) {
        synchronized (this.f64849c) {
            this.f64848b = null;
            this.f64849c.notifyAll();
        }
        context.unbindService(this);
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        synchronized (this.f64849c) {
            this.f64848b = null;
            this.f64849c.notifyAll();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        synchronized (this.f64849c) {
            this.f64849c.notifyAll();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f64849c) {
            this.f64848b = iBinder;
            this.f64849c.notifyAll();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f64849c) {
            this.f64848b = null;
            this.f64849c.notifyAll();
        }
    }
}
