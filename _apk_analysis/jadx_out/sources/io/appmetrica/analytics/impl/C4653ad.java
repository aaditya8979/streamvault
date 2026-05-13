package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ad, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4653ad implements ModuleSelfReporter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rj f66368a = AbstractC5249y1.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f66369b = 4;

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportError(@NotNull String str, @Nullable String str2) {
        this.f66368a.reportError(str, str2);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportError(@NotNull String str, @Nullable Throwable th2) {
        Rj rj2 = this.f66368a;
        rj2.getClass();
        rj2.a(new C5068qj(str, th2));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportEvent(int i10, @NotNull String str, @Nullable String str2) {
        Rj rj2 = this.f66368a;
        ModuleEvent moduleEventBuild = ModuleEvent.newBuilder(i10).withName(str).withValue(str2).build();
        rj2.getClass();
        rj2.a(new Gj(moduleEventBuild));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportEvent(@NotNull String str) {
        Rj rj2 = this.f66368a;
        ModuleEvent moduleEventBuild = ModuleEvent.newBuilder(this.f66369b).withName(str).build();
        rj2.getClass();
        rj2.a(new Gj(moduleEventBuild));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportEvent(@NotNull String str, @Nullable String str2) {
        Rj rj2 = this.f66368a;
        ModuleEvent moduleEventBuild = ModuleEvent.newBuilder(this.f66369b).withName(str).withValue(str2).build();
        rj2.getClass();
        rj2.a(new Gj(moduleEventBuild));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportEvent(@NotNull String str, @Nullable Map<String, ? extends Object> map) {
        Rj rj2 = this.f66368a;
        ModuleEvent moduleEventBuild = ModuleEvent.newBuilder(this.f66369b).withName(str).withAttributes(map).build();
        rj2.getClass();
        rj2.a(new Gj(moduleEventBuild));
    }
}
