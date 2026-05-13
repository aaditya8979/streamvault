package io.appmetrica.analytics.screenshot.impl;

import cn.p0;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.common.InternalModuleEvent;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5319x implements U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClientContext f68481a;

    public C5319x(@NotNull ClientContext clientContext) {
        this.f68481a = clientContext;
    }

    public final void a(@NotNull String str) {
        this.f68481a.getInternalClientModuleFacade().reportEvent(InternalModuleEvent.INSTANCE.newBuilder(4).withName("appmetrica_system_event_screenshot").withAttributes(p0.g(bn.h.a("type", str))).withCategory(InternalModuleEvent.Category.SYSTEM).build());
    }
}
