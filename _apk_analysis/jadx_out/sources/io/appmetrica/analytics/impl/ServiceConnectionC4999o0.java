package io.appmetrica.analytics.impl;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import io.appmetrica.analytics.internal.IAppMetricaService;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class ServiceConnectionC4999o0 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5024p0 f67388a;

    public ServiceConnectionC4999o0(C5024p0 c5024p0) {
        this.f67388a = c5024p0;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f67388a) {
            this.f67388a.f67480d = IAppMetricaService.Stub.asInterface(iBinder);
            this.f67388a.f67481e.countDown();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f67388a) {
            this.f67388a.f67480d = null;
        }
    }
}
