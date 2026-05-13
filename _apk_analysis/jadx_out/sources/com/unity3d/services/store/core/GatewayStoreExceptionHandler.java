package com.unity3d.services.store.core;

import com.unity3d.services.store.StoreEvent;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: GatewayStoreExceptionHandler.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class GatewayStoreExceptionHandler implements StoreExceptionHandler {
    @Override // com.unity3d.services.store.core.StoreExceptionHandler
    public void handleStoreException(@NotNull StoreEvent storeEvent, int i10, @NotNull Exception exc) throws Exception {
        p.k(storeEvent, "storeEvent");
        p.k(exc, "exception");
        throw exc;
    }
}
