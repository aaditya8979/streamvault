package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleReporter;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleCounterReport;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.bk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4686bk implements ServiceComponentModuleReporter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y4 f66441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5168uk f66442b;

    public C4686bk(@NotNull Y4 y42, @NotNull C5168uk c5168uk) {
        this.f66441a = y42;
        this.f66442b = c5168uk;
    }

    public /* synthetic */ C4686bk(Y4 y42, C5168uk c5168uk, int i10, tn.i iVar) {
        this(y42, (i10 & 2) != 0 ? new C5168uk() : c5168uk);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleReporter
    public final void handleReport(@NotNull ServiceModuleCounterReport serviceModuleCounterReport) {
        this.f66442b.getClass();
        this.f66441a.a(C5168uk.a(serviceModuleCounterReport));
    }
}
