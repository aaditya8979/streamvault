package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

import bn.h;
import com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClientBuilderBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBridgeCommon;
import com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBuilderBridgeCommon;
import kotlin.collections.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;

/* JADX INFO: compiled from: BillingClientBuilderBridge.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class BillingClientBuilderBridge extends BillingClientBuilderBridgeCommon {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String ENABLE_PENDING_PURCHASES_METHOD = "enablePendingPurchases";

    /* JADX INFO: compiled from: BillingClientBuilderBridge.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    public BillingClientBuilderBridge(@Nullable Object obj) {
        super(obj, a.l(h.a("enablePendingPurchases", new Class[]{PendingPurchasesParamsBridge.Companion.getClassForParams()})));
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClientBuilderBridge
    @NotNull
    public BillingClientBridgeCommon build() throws ClassNotFoundException {
        return new BillingClientBridge(callNonVoidMethod(BillingClientBuilderBridgeCommon.buildMethodName, this._billingClientBuilderInternalInstance, new Object[0]));
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClientBuilderBridge
    @NotNull
    public IBillingClientBuilderBridge enablePendingPurchases() {
        this._billingClientBuilderInternalInstance = callNonVoidMethod("enablePendingPurchases", this._billingClientBuilderInternalInstance, PendingPurchasesParamsBridge.Companion.newBuilder().enableOneTimeProducts().build().getInternalClass());
        return this;
    }
}
