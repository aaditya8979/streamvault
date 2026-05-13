package io.appmetrica.analytics.modulesapi.internal.common;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenue;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¨\u0006\t"}, d2 = {"Lio/appmetrica/analytics/modulesapi/internal/common/InternalClientModuleFacade;", "", "Lio/appmetrica/analytics/modulesapi/internal/common/InternalModuleEvent;", "internalModuleEvent", "Lbn/r;", "reportEvent", "Lio/appmetrica/analytics/modulesapi/internal/client/adrevenue/ModuleAdRevenue;", "moduleAdRevenue", "reportAdRevenue", "modules-api_release"}, k = 1, mv = {1, 6, 0})
public interface InternalClientModuleFacade {
    void reportAdRevenue(@NotNull ModuleAdRevenue moduleAdRevenue);

    void reportEvent(@NotNull InternalModuleEvent internalModuleEvent);
}
