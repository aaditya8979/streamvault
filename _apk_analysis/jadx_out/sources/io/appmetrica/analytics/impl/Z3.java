package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint;
import io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigExtensionConfiguration;
import io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigUpdateListener;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueCollector;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public final class Z3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public I5 f66281c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y3 f66279a = new Y3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f66280b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArrayList f66282d = new CopyOnWriteArrayList();

    public static void a(String str, String str2, Throwable th2) {
        Rj rj2 = AbstractC5043pj.f67535a;
        Map mapG = cn.p0.g(bn.h.a(str, cn.p0.g(bn.h.a(str2, bn.d.b(th2)))));
        rj2.getClass();
        rj2.a(new Qj("client_module_errors", mapG));
    }

    @NotNull
    public final List<String> a() {
        return this.f66282d;
    }

    public final void a(@Nullable Bundle bundle, @NotNull SdkIdentifiers sdkIdentifiers) {
        if (bundle == null) {
            return;
        }
        for (ModuleClientEntryPoint moduleClientEntryPoint : this.f66280b) {
            try {
                ServiceConfigExtensionConfiguration serviceConfigExtensionConfiguration = moduleClientEntryPoint.getServiceConfigExtensionConfiguration();
                if (serviceConfigExtensionConfiguration != null) {
                    ServiceConfigUpdateListener serviceConfigUpdateListener = serviceConfigExtensionConfiguration.getServiceConfigUpdateListener();
                    Y3 y32 = this.f66279a;
                    String identifier = moduleClientEntryPoint.getIdentifier();
                    y32.getClass();
                    Bundle bundle2 = bundle.getBundle(identifier);
                    X3 x32 = bundle2 != null ? new X3(sdkIdentifiers, serviceConfigExtensionConfiguration.getBundleConverter().fromBundle(bundle2)) : null;
                    if (x32 != null) {
                        serviceConfigUpdateListener.onServiceConfigUpdated(x32);
                    }
                }
            } catch (Throwable th2) {
                a(moduleClientEntryPoint.getIdentifier(), "notifyModulesWithConfig", th2);
            }
        }
    }

    public final void a(@NotNull I5 i52) {
        this.f66281c = i52;
        HashSet hashSet = new HashSet();
        for (ModuleClientEntryPoint moduleClientEntryPoint : this.f66280b) {
            try {
                moduleClientEntryPoint.initClientSide(i52);
            } catch (Throwable th2) {
                a(moduleClientEntryPoint.getIdentifier(), "initClientSide", th2);
                hashSet.add(moduleClientEntryPoint);
            }
        }
        if (!hashSet.isEmpty()) {
            this.f66280b.removeAll(hashSet);
        }
    }

    public final void a(@NotNull ModuleClientEntryPoint<Object> moduleClientEntryPoint) {
        this.f66280b.add(moduleClientEntryPoint);
    }

    @Nullable
    public final ModuleAdRevenueProcessor b() {
        L5 l52;
        I5 i52 = this.f66281c;
        if (i52 == null || (l52 = ((L3) i52).f65513b) == null) {
            return null;
        }
        return l52.f65522a;
    }

    public final void c() {
        for (ModuleClientEntryPoint moduleClientEntryPoint : this.f66280b) {
            try {
                moduleClientEntryPoint.onActivated();
            } catch (Throwable th2) {
                a(moduleClientEntryPoint.getIdentifier(), "onActivated", th2);
            }
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f66282d;
        CopyOnWriteArrayList copyOnWriteArrayList2 = this.f66280b;
        ArrayList arrayList = new ArrayList();
        Iterator it = copyOnWriteArrayList2.iterator();
        while (it.hasNext()) {
            AdRevenueCollector adRevenueCollector = ((ModuleClientEntryPoint) it.next()).getAdRevenueCollector();
            if (adRevenueCollector != null) {
                arrayList.add(adRevenueCollector);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((AdRevenueCollector) obj).getEnabled()) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(cn.x.x(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((AdRevenueCollector) it2.next()).getSourceIdentifier());
        }
        copyOnWriteArrayList.addAll(cn.f0.k0(arrayList3));
    }
}
