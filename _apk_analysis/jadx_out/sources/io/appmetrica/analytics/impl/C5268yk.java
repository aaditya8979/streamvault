package io.appmetrica.analytics.impl;

import android.location.Location;
import android.os.Bundle;
import com.ironsource.C3978d4;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import io.appmetrica.analytics.modulesapi.internal.common.AskForPermissionStrategyModuleProvider;
import io.appmetrica.analytics.modulesapi.internal.service.ClientConfigProvider;
import io.appmetrica.analytics.modulesapi.internal.service.LocationServiceExtension;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleLocationSourcesServiceController;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServicesDatabase;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerFactory;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.yk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5268yk implements Qc, InterfaceC4946lm, AskForPermissionStrategyModuleProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f68048a = "rp";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f68049b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile AskForPermissionStrategyModuleProvider f68050c = new B7();

    public static void a(String str, String str2, Throwable th2) {
        Rj rj2 = AbstractC5043pj.f67535a;
        Map mapG = cn.p0.g(bn.h.a(str, cn.p0.g(bn.h.a(str2, bn.d.b(th2)))));
        rj2.getClass();
        rj2.a(new Qj("service_module_errors", mapG));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4946lm
    public final void a(@NotNull C4817gm c4817gm) {
        HashSet hashSet = new HashSet();
        SdkIdentifiers sdkIdentifiers = new SdkIdentifiers(c4817gm.f66849d, c4817gm.f66846a, c4817gm.f66847b);
        Lg lg2 = new Lg(c4817gm.f66867v, c4817gm.f66866u);
        for (ModuleServiceEntryPoint moduleServiceEntryPoint : this.f68049b) {
            try {
                RemoteConfigExtensionConfiguration remoteConfigExtensionConfiguration = moduleServiceEntryPoint.getRemoteConfigExtensionConfiguration();
                if (remoteConfigExtensionConfiguration != null) {
                    remoteConfigExtensionConfiguration.getRemoteConfigUpdateListener().onRemoteConfigUpdated(new C5193vk(sdkIdentifiers, lg2, c4817gm.A.get(moduleServiceEntryPoint.getIdentifier())));
                }
            } catch (Throwable th2) {
                hashSet.add(moduleServiceEntryPoint);
                a(moduleServiceEntryPoint.getIdentifier(), "remote_config_updated", th2);
            }
        }
        a(hashSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(@NotNull ModuleServiceEntryPoint<Object> moduleServiceEntryPoint) {
        this.f68049b.add(moduleServiceEntryPoint);
        if (tn.p.f(this.f68048a, moduleServiceEntryPoint.getIdentifier()) && (moduleServiceEntryPoint instanceof AskForPermissionStrategyModuleProvider)) {
            this.f68050c = (AskForPermissionStrategyModuleProvider) moduleServiceEntryPoint;
        }
    }

    public final void a(@NotNull ServiceContext serviceContext, @NotNull C4817gm c4817gm) {
        HashSet hashSet = new HashSet();
        for (ModuleServiceEntryPoint moduleServiceEntryPoint : this.f68049b) {
            try {
                moduleServiceEntryPoint.initServiceSide(serviceContext, new C5193vk(new SdkIdentifiers(c4817gm.f66849d, c4817gm.f66846a, c4817gm.f66847b), new Lg(c4817gm.f66867v, c4817gm.f66866u), c4817gm.A.get(moduleServiceEntryPoint.getIdentifier())));
                ModuleEventServiceHandlerFactory moduleEventServiceHandlerFactory = moduleServiceEntryPoint.getModuleEventServiceHandlerFactory();
                if (moduleEventServiceHandlerFactory != null) {
                    Vc vc2 = C5009oa.I.f67437t;
                    String identifier = moduleServiceEntryPoint.getIdentifier();
                    synchronized (vc2) {
                        vc2.f66037a.put(identifier, moduleEventServiceHandlerFactory);
                    }
                } else {
                    continue;
                }
            } catch (Throwable th2) {
                a(moduleServiceEntryPoint.getIdentifier(), C3978d4.a.f31210f, th2);
                hashSet.add(moduleServiceEntryPoint);
            }
        }
        a(hashSet);
    }

    public final void a(HashSet hashSet) {
        if (!hashSet.isEmpty()) {
            this.f68049b.removeAll(hashSet);
        }
    }

    @Override // io.appmetrica.analytics.impl.Qc
    @NotNull
    public final List<ModuleServicesDatabase> b() {
        Object objValueOf;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        CopyOnWriteArrayList<ModuleServiceEntryPoint> copyOnWriteArrayList = this.f68049b;
        ArrayList arrayList2 = new ArrayList();
        for (ModuleServiceEntryPoint moduleServiceEntryPoint : copyOnWriteArrayList) {
            try {
                ModuleServicesDatabase moduleServicesDatabase = moduleServiceEntryPoint.getModuleServicesDatabase();
                objValueOf = moduleServicesDatabase != null ? Boolean.valueOf(arrayList.add(moduleServicesDatabase)) : null;
            } catch (Throwable th2) {
                hashSet.add(moduleServiceEntryPoint);
                a(moduleServiceEntryPoint.getIdentifier(), "db", th2);
                objValueOf = bn.r.f5635a;
            }
            if (objValueOf != null) {
                arrayList2.add(objValueOf);
            }
        }
        a(hashSet);
        return arrayList;
    }

    @Override // io.appmetrica.analytics.impl.Qc
    @NotNull
    public final Map<String, Zc> c() {
        HashSet hashSet = new HashSet();
        CopyOnWriteArrayList<ModuleServiceEntryPoint> copyOnWriteArrayList = this.f68049b;
        ArrayList arrayList = new ArrayList();
        for (ModuleServiceEntryPoint moduleServiceEntryPoint : copyOnWriteArrayList) {
            Pair pairA = null;
            try {
                RemoteConfigExtensionConfiguration remoteConfigExtensionConfiguration = moduleServiceEntryPoint.getRemoteConfigExtensionConfiguration();
                if (remoteConfigExtensionConfiguration != null) {
                    pairA = bn.h.a(moduleServiceEntryPoint.getIdentifier(), new Zc(remoteConfigExtensionConfiguration));
                }
            } catch (Throwable th2) {
                a(moduleServiceEntryPoint.getIdentifier(), "remote_config_controller", th2);
                hashSet.add(moduleServiceEntryPoint);
            }
            if (pairA != null) {
                arrayList.add(pairA);
            }
        }
        Map<String, Zc> mapX = kotlin.collections.a.x(arrayList);
        a(hashSet);
        return mapX;
    }

    @Override // io.appmetrica.analytics.impl.Qc
    @NotNull
    public final Map<String, Integer> d() {
        List listM;
        Map<String, Integer> blocks;
        HashSet hashSet = new HashSet();
        CopyOnWriteArrayList<ModuleServiceEntryPoint> copyOnWriteArrayList = this.f68049b;
        ArrayList arrayList = new ArrayList();
        for (ModuleServiceEntryPoint moduleServiceEntryPoint : copyOnWriteArrayList) {
            try {
                RemoteConfigExtensionConfiguration remoteConfigExtensionConfiguration = moduleServiceEntryPoint.getRemoteConfigExtensionConfiguration();
                if (remoteConfigExtensionConfiguration == null || (blocks = remoteConfigExtensionConfiguration.getBlocks()) == null || (listM = cn.r0.E(blocks)) == null) {
                    listM = cn.w.m();
                }
            } catch (Throwable th2) {
                a(moduleServiceEntryPoint.getIdentifier(), "blocks", th2);
                hashSet.add(moduleServiceEntryPoint);
                listM = cn.w.m();
            }
            cn.b0.F(arrayList, listM);
        }
        Map<String, Integer> mapX = kotlin.collections.a.x(arrayList);
        a(hashSet);
        return mapX;
    }

    @Override // io.appmetrica.analytics.impl.Qc
    @NotNull
    public final List<Consumer<Location>> e() {
        HashSet hashSet = new HashSet();
        CopyOnWriteArrayList<ModuleServiceEntryPoint> copyOnWriteArrayList = this.f68049b;
        ArrayList arrayList = new ArrayList();
        for (ModuleServiceEntryPoint moduleServiceEntryPoint : copyOnWriteArrayList) {
            Consumer<Location> locationConsumer = null;
            try {
                LocationServiceExtension locationServiceExtension = moduleServiceEntryPoint.getLocationServiceExtension();
                if (locationServiceExtension != null) {
                    locationConsumer = locationServiceExtension.getLocationConsumer();
                }
            } catch (Throwable th2) {
                a(moduleServiceEntryPoint.getIdentifier(), "location_consumer", th2);
                hashSet.add(moduleServiceEntryPoint);
            }
            if (locationConsumer != null) {
                arrayList.add(locationConsumer);
            }
        }
        a(hashSet);
        return arrayList;
    }

    @Override // io.appmetrica.analytics.impl.Qc
    @Nullable
    public final ModuleLocationSourcesServiceController f() {
        ModuleLocationSourcesServiceController locationSourcesController;
        HashSet hashSet = new HashSet();
        Iterator it = this.f68049b.iterator();
        do {
            locationSourcesController = null;
            if (!it.hasNext()) {
                break;
            }
            ModuleServiceEntryPoint moduleServiceEntryPoint = (ModuleServiceEntryPoint) it.next();
            try {
                LocationServiceExtension locationServiceExtension = moduleServiceEntryPoint.getLocationServiceExtension();
                if (locationServiceExtension != null) {
                    locationSourcesController = locationServiceExtension.getLocationSourcesController();
                }
            } catch (Throwable th2) {
                a(moduleServiceEntryPoint.getIdentifier(), "location_source_controller", th2);
                hashSet.add(moduleServiceEntryPoint);
            }
        } while (locationSourcesController == null);
        a(hashSet);
        return locationSourcesController;
    }

    @Override // io.appmetrica.analytics.impl.Qc
    @Nullable
    public final Toggle g() {
        Toggle locationControllerAppStateToggle;
        HashSet hashSet = new HashSet();
        Iterator it = this.f68049b.iterator();
        do {
            locationControllerAppStateToggle = null;
            if (!it.hasNext()) {
                break;
            }
            ModuleServiceEntryPoint moduleServiceEntryPoint = (ModuleServiceEntryPoint) it.next();
            try {
                LocationServiceExtension locationServiceExtension = moduleServiceEntryPoint.getLocationServiceExtension();
                if (locationServiceExtension != null) {
                    locationControllerAppStateToggle = locationServiceExtension.getLocationControllerAppStateToggle();
                }
            } catch (Throwable th2) {
                a(moduleServiceEntryPoint.getIdentifier(), "location_app_state_control_toggle", th2);
                hashSet.add(moduleServiceEntryPoint);
            }
        } while (locationControllerAppStateToggle == null);
        a(hashSet);
        return locationControllerAppStateToggle;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.AskForPermissionStrategyModuleProvider
    @NotNull
    public final PermissionStrategy getAskForPermissionStrategy() {
        return this.f68050c.getAskForPermissionStrategy();
    }

    @Override // io.appmetrica.analytics.impl.Qc
    @NotNull
    public final List<String> h() {
        List<String> listM;
        HashSet hashSet = new HashSet();
        CopyOnWriteArrayList<ModuleServiceEntryPoint> copyOnWriteArrayList = this.f68049b;
        ArrayList arrayList = new ArrayList();
        for (ModuleServiceEntryPoint moduleServiceEntryPoint : copyOnWriteArrayList) {
            try {
                RemoteConfigExtensionConfiguration remoteConfigExtensionConfiguration = moduleServiceEntryPoint.getRemoteConfigExtensionConfiguration();
                if (remoteConfigExtensionConfiguration == null || (listM = remoteConfigExtensionConfiguration.getFeatures()) == null) {
                    listM = cn.w.m();
                }
            } catch (Throwable th2) {
                a(moduleServiceEntryPoint.getIdentifier(), "features", th2);
                hashSet.add(moduleServiceEntryPoint);
                listM = cn.w.m();
            }
            cn.b0.F(arrayList, listM);
        }
        a(hashSet);
        return arrayList;
    }

    @NotNull
    public final Bundle i() {
        Bundle bundle = new Bundle();
        HashSet hashSet = new HashSet();
        for (ModuleServiceEntryPoint moduleServiceEntryPoint : this.f68049b) {
            Bundle configBundleForClient = null;
            try {
                ClientConfigProvider clientConfigProvider = moduleServiceEntryPoint.getClientConfigProvider();
                if (clientConfigProvider != null) {
                    configBundleForClient = clientConfigProvider.getConfigBundleForClient();
                }
            } catch (Throwable th2) {
                a(moduleServiceEntryPoint.getIdentifier(), "config_bundle", th2);
                hashSet.add(moduleServiceEntryPoint);
            }
            if (configBundleForClient != null) {
                bundle.putBundle(moduleServiceEntryPoint.getIdentifier(), configBundleForClient);
            }
        }
        a(hashSet);
        return bundle;
    }
}
