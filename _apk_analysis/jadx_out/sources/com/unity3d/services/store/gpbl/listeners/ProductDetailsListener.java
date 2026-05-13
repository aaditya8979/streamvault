package com.unity3d.services.store.gpbl.listeners;

import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ProductDetailsListener.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface ProductDetailsListener {
    void onProductDetailsResponse(@NotNull BillingResultBridge billingResultBridge, @Nullable String str);
}
