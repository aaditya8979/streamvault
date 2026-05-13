package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.impl.C4679bd;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleController;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleObserver;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.bd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4679bd implements ModuleServiceLifecycleController {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K1 f66436a;

    public C4679bd(@NotNull K1 k12) {
        this.f66436a = k12;
    }

    public static final void a(ModuleServiceLifecycleObserver moduleServiceLifecycleObserver, Intent intent) {
        moduleServiceLifecycleObserver.onFirstClientConnected();
    }

    public static final void b(ModuleServiceLifecycleObserver moduleServiceLifecycleObserver, Intent intent) {
        moduleServiceLifecycleObserver.onAllClientsDisconnected();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleController
    public final void registerObserver(@NotNull final ModuleServiceLifecycleObserver moduleServiceLifecycleObserver) {
        this.f66436a.b(new J1() { // from class: mh.a0
            @Override // io.appmetrica.analytics.impl.J1
            public final void a(Intent intent) {
                C4679bd.a(moduleServiceLifecycleObserver, intent);
            }
        });
        this.f66436a.a(new J1() { // from class: mh.b0
            @Override // io.appmetrica.analytics.impl.J1
            public final void a(Intent intent) {
                C4679bd.b(moduleServiceLifecycleObserver, intent);
            }
        });
    }
}
