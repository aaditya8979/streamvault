package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleRegistry;
import io.appmetrica.analytics.modulesapi.internal.client.ClientStorageProvider;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientActivator;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientExecutorProvider;
import io.appmetrica.analytics.modulesapi.internal.client.ProcessDetector;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueContext;
import io.appmetrica.analytics.modulesapi.internal.common.InternalClientModuleFacade;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class L3 implements I5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f65512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final L5 f65513b = new L5(new C4877j5());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4747e4 f65514c = new C4747e4(C4696c4.l().b(getContext()));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C4677bb f65515d = new C4677bb();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C4998o f65516e = C4696c4.l().a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final J3 f65517f = new J3();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Rc f65518g = new Rc();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final K3 f65519h = new K3();

    public L3(@NotNull Context context) {
        this.f65512a = context;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    @NotNull
    public final ActivityLifecycleRegistry getActivityLifecycleRegistry() {
        return this.f65516e;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    @NotNull
    public final ModuleClientActivator getClientActivator() {
        return this.f65517f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    @NotNull
    public final ModuleClientExecutorProvider getClientExecutorProvider() {
        return this.f65518g;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    @NotNull
    public final ClientStorageProvider getClientStorageProvider() {
        return this.f65514c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    @NotNull
    public final Context getContext() {
        return this.f65512a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    @NotNull
    public final InternalClientModuleFacade getInternalClientModuleFacade() {
        return this.f65515d;
    }

    @Override // io.appmetrica.analytics.impl.I5, io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    @NotNull
    public final K5 getModuleAdRevenueContext() {
        return this.f65513b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final ModuleAdRevenueContext getModuleAdRevenueContext() {
        return this.f65513b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    @NotNull
    public final ProcessDetector getProcessDetector() {
        return this.f65519h;
    }
}
