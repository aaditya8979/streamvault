package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleConfig;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleReporter;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentContext;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.wk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5218wk implements ServiceModuleReporterComponentContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4686bk f67910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4660ak f67911b;

    /* JADX WARN: Multi-variable type inference failed */
    public C5218wk(@NotNull Y4 y42, @NotNull C5028p4 c5028p4) {
        this.f67910a = new C4686bk(y42, null, 2, 0 == true ? 1 : 0);
        this.f67911b = new C4660ak(c5028p4);
    }

    @NotNull
    public final C4660ak a() {
        return this.f67911b;
    }

    @NotNull
    public final C4686bk b() {
        return this.f67910a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentContext
    public final ServiceComponentModuleConfig getConfig() {
        return this.f67911b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentContext
    public final ServiceComponentModuleReporter getReporter() {
        return this.f67910a;
    }
}
