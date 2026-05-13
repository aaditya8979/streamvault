package com.unity3d.services.store.gpbl.bridges.billingclient;

import com.unity3d.services.store.gpbl.BillingResultResponseCode;
import com.unity3d.services.store.gpbl.listeners.BillingClientStateListener;
import com.unity3d.services.store.gpbl.listeners.BillingInitializationListener;
import com.unity3d.services.store.gpbl.listeners.ProductDetailsListener;
import com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener;
import go.l;
import go.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BillingClientAdapter.kt */
/* JADX INFO: loaded from: classes7.dex */
public abstract class BillingClientAdapter {

    @NotNull
    private final l<Boolean> _isInitialized = v.a(Boolean.FALSE);

    @NotNull
    public abstract String getAdapterVersion();

    @NotNull
    public final l<Boolean> get_isInitialized$unity_ads_defaultRelease() {
        return this._isInitialized;
    }

    public abstract void initialize(@NotNull BillingInitializationListener billingInitializationListener);

    @Nullable
    public abstract BillingResultResponseCode isFeatureSupported(@Nullable String str);

    public final boolean isInitialized() {
        return this._isInitialized.getValue().booleanValue();
    }

    public abstract boolean isReady();

    public abstract void queryProductDetailsAsync(@NotNull String str, @NotNull String str2, @NotNull ProductDetailsListener productDetailsListener);

    public abstract void queryPurchasesAsync(@Nullable String str, @Nullable PurchasesResponseListener purchasesResponseListener);

    public abstract void startConnection(@Nullable BillingClientStateListener billingClientStateListener);
}
