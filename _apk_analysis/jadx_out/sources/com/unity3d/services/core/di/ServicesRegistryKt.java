package com.unity3d.services.core.di;

import bn.r;
import org.jetbrains.annotations.NotNull;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: ServicesRegistry.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class ServicesRegistryKt {
    @NotNull
    public static final ServicesRegistry registry(@NotNull l<? super ServicesRegistry, r> lVar) {
        p.k(lVar, "registry");
        ServicesRegistry servicesRegistry = new ServicesRegistry();
        lVar.invoke(servicesRegistry);
        return servicesRegistry;
    }
}
