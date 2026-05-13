package io.appmetrica.analytics.impl;

import android.location.Location;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleLocationSourcesServiceController;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServicesDatabase;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface Qc extends InterfaceC5037pd {
    @NotNull
    List<ModuleServicesDatabase> b();

    @NotNull
    /* synthetic */ Map c();

    @NotNull
    /* synthetic */ Map d();

    @NotNull
    List<Consumer<Location>> e();

    @Nullable
    ModuleLocationSourcesServiceController f();

    @Nullable
    Toggle g();

    @NotNull
    /* synthetic */ List h();
}
