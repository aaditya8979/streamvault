package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.idsync.internal.model.IdSyncConfig;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes12.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ServiceContext f64891a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IHandlerExecutor f64893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f64894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile IdSyncConfig f64895e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f64896f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f64892b = TimeUnit.MINUTES.toMillis(1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f64897g = new f(this);

    public h(ServiceContext serviceContext) {
        this.f64891a = serviceContext;
        this.f64893c = serviceContext.getExecutorProvider().getModuleExecutor();
        this.f64894d = new p(serviceContext, new B(serviceContext.getServiceStorageProvider().modulePreferences("id-sync")));
    }

    public static boolean a(IdSyncConfig idSyncConfig) {
        idSyncConfig.getEnabled();
        return idSyncConfig.getEnabled() && (idSyncConfig.getRequests().isEmpty() ^ true);
    }

    public final synchronized void b(IdSyncConfig idSyncConfig) {
        if (!tn.p.f(this.f64895e, idSyncConfig)) {
            this.f64895e = idSyncConfig;
            if (a(idSyncConfig) && !this.f64896f) {
                this.f64891a.getActivationBarrier().subscribe(idSyncConfig.getLaunchDelay(), this.f64893c, new g(this));
                this.f64896f = true;
            } else if (!a(idSyncConfig) && this.f64896f) {
                this.f64896f = false;
                IHandlerExecutor iHandlerExecutor = this.f64893c;
                f fVar = this.f64897g;
                if (fVar == null) {
                    tn.p.C("syncRunnable");
                    fVar = null;
                }
                iHandlerExecutor.remove(fVar);
            }
        }
    }
}
