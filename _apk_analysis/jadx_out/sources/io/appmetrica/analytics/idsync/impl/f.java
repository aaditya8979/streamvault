package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import io.appmetrica.analytics.idsync.internal.model.IdSyncConfig;
import io.appmetrica.analytics.idsync.internal.model.RequestConfig;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class f extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f64889a;

    public f(h hVar) {
        this.f64889a = hVar;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        IdSyncConfig idSyncConfig;
        if (this.f64889a.f64896f && (idSyncConfig = this.f64889a.f64895e) != null) {
            this.f64889a.getClass();
            if (h.a(idSyncConfig)) {
                List<RequestConfig> requests = idSyncConfig.getRequests();
                h hVar = this.f64889a;
                Iterator<T> it = requests.iterator();
                while (it.hasNext()) {
                    hVar.f64894d.a((RequestConfig) it.next());
                }
                h hVar2 = this.f64889a;
                IHandlerExecutor iHandlerExecutor = hVar2.f64893c;
                f fVar = hVar2.f64897g;
                if (fVar == null) {
                    tn.p.C("syncRunnable");
                    fVar = null;
                }
                iHandlerExecutor.executeDelayed(fVar, this.f64889a.f64892b);
            }
        }
    }
}
