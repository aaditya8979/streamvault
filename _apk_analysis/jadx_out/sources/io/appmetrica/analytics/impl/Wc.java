package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.event.CounterReportApi;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class Wc implements ModuleEventServiceHandlerReporter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f66098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4933l9 f66099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Q5 f66100c;

    public Wc(boolean z10, @NotNull C4933l9 c4933l9, @NotNull Q5 q52) {
        this.f66098a = z10;
        this.f66099b = c4933l9;
        this.f66100c = q52;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter
    public final boolean isMain() {
        return this.f66098a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter
    public final void report(@NotNull CounterReportApi counterReportApi) {
        Q5 q5D = Q5.d(this.f66100c);
        q5D.f65791d = counterReportApi.getType();
        q5D.f65792e = counterReportApi.getCustomType();
        q5D.setName(counterReportApi.getName());
        String value = counterReportApi.getValue();
        if (value != null) {
            q5D.setValue(value);
        }
        byte[] valueBytes = counterReportApi.getValueBytes();
        if (valueBytes != null) {
            q5D.setValueBytes(valueBytes);
        }
        q5D.f65794g = counterReportApi.getBytesTruncated();
        C4933l9 c4933l9 = this.f66099b;
        c4933l9.a(q5D, Sk.a(c4933l9.f67197c.b(q5D), q5D.f65796i));
    }
}
