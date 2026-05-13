package com.unity3d.services.core.di;

import bn.g;
import com.ironsource.C4157n2;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.b;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.a;
import tn.p;
import tn.t;

/* JADX INFO: compiled from: ServicesRegistry.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class ServicesRegistry implements IServicesRegistry {

    @NotNull
    private final ConcurrentHashMap<ServiceKey, g<?>> _services = new ConcurrentHashMap<>();

    public static /* synthetic */ ServiceKey factory$default(ServicesRegistry servicesRegistry, String str, a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        p.k(str, "named");
        p.k(aVar, C4157n2.f33007p);
        p.q(4, "T");
        ServiceKey serviceKey = new ServiceKey(str, t.b(Object.class));
        servicesRegistry.updateService(serviceKey, ServiceFactoryKt.factoryOf(aVar));
        return serviceKey;
    }

    public static /* synthetic */ Object get$default(ServicesRegistry servicesRegistry, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        p.k(str, "named");
        p.q(4, "T");
        return servicesRegistry.resolveService(new ServiceKey(str, t.b(Object.class)));
    }

    public static /* synthetic */ Object getOrNull$default(ServicesRegistry servicesRegistry, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        p.k(str, "named");
        p.q(4, "T");
        return servicesRegistry.resolveServiceOrNull(new ServiceKey(str, t.b(Object.class)));
    }

    public static /* synthetic */ ServiceKey single$default(ServicesRegistry servicesRegistry, String str, a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        p.k(str, "named");
        p.k(aVar, C4157n2.f33007p);
        p.q(4, "T");
        ServiceKey serviceKey = new ServiceKey(str, t.b(Object.class));
        servicesRegistry.updateService(serviceKey, b.b(aVar));
        return serviceKey;
    }

    public final /* synthetic */ <T> ServiceKey factory(String str, a<? extends T> aVar) {
        p.k(str, "named");
        p.k(aVar, C4157n2.f33007p);
        p.q(4, "T");
        ServiceKey serviceKey = new ServiceKey(str, t.b(Object.class));
        updateService(serviceKey, ServiceFactoryKt.factoryOf(aVar));
        return serviceKey;
    }

    public final /* synthetic */ <T> T get(String str) {
        p.k(str, "named");
        p.q(4, "T");
        return (T) resolveService(new ServiceKey(str, t.b(Object.class)));
    }

    public final /* synthetic */ <T> T getOrNull(String str) {
        p.k(str, "named");
        p.q(4, "T");
        return (T) resolveServiceOrNull(new ServiceKey(str, t.b(Object.class)));
    }

    @Override // com.unity3d.services.core.di.IServicesRegistry
    public <T> T getService(@NotNull String str, @NotNull KClass<?> kClass) {
        p.k(str, "named");
        p.k(kClass, C4157n2.f33007p);
        return (T) resolveService(new ServiceKey(str, kClass));
    }

    @Override // com.unity3d.services.core.di.IServicesRegistry
    @NotNull
    public Map<ServiceKey, g<?>> getServices() {
        return this._services;
    }

    @Override // com.unity3d.services.core.di.IServicesRegistry
    public <T> T resolveService(@NotNull ServiceKey serviceKey) {
        p.k(serviceKey, "key");
        g<?> gVar = getServices().get(serviceKey);
        if (gVar != null) {
            return (T) gVar.getValue();
        }
        throw new IllegalStateException("No service instance found for " + serviceKey);
    }

    @Override // com.unity3d.services.core.di.IServicesRegistry
    @Nullable
    public <T> T resolveServiceOrNull(@NotNull ServiceKey serviceKey) {
        p.k(serviceKey, "key");
        g<?> gVar = getServices().get(serviceKey);
        if (gVar == null) {
            return null;
        }
        return (T) gVar.getValue();
    }

    public final /* synthetic */ <T> ServiceKey single(String str, a<? extends T> aVar) {
        p.k(str, "named");
        p.k(aVar, C4157n2.f33007p);
        p.q(4, "T");
        ServiceKey serviceKey = new ServiceKey(str, t.b(Object.class));
        updateService(serviceKey, b.b(aVar));
        return serviceKey;
    }

    @Override // com.unity3d.services.core.di.IServicesRegistry
    public <T> void updateService(@NotNull ServiceKey serviceKey, @NotNull g<? extends T> gVar) {
        p.k(serviceKey, "key");
        p.k(gVar, C4157n2.f33007p);
        if (!getServices().containsKey(serviceKey)) {
            this._services.put(serviceKey, gVar);
            return;
        }
        throw new IllegalStateException(("Cannot have multiple identical services: " + serviceKey).toString());
    }
}
