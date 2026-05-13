package com.unity3d.services.store.gpbl.listeners;

import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.v8.QueryProductDetailsResultsBridge;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ProductDetailsResponseListener.kt */
/* JADX INFO: loaded from: classes12.dex */
public interface ProductDetailsResponseListener {
    void onProductDetailsResponse(@NotNull BillingResultBridge billingResultBridge, @NotNull QueryProductDetailsResultsBridge queryProductDetailsResultsBridge);
}
