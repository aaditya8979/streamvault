package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

import android.content.Context;
import bn.h;
import com.unity3d.services.store.gpbl.bridges.SkuDetailsParamsBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBridgeCommon;
import com.unity3d.services.store.gpbl.proxies.ProductDetailsResponseListenerProxy;
import com.unity3d.services.store.gpbl.proxies.PurchasesResponseListenerProxy;
import com.unity3d.services.store.gpbl.proxies.SkuDetailsResponseListenerProxy;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.lang.reflect.InvocationTargetException;
import kotlin.collections.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: BillingClientBridge.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class BillingClientBridge extends BillingClientBridgeCommon {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String QUERY_PRODUCT_DETAILS_ASYNC_METHOD = "queryProductDetailsAsync";

    @NotNull
    public static final String QUERY_PURCHASES_ASYNC_METHOD = "queryPurchasesAsync";

    /* JADX INFO: compiled from: BillingClientBridge.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        @NotNull
        public final BillingClientBuilderBridge newBuilder(@NotNull Context context) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
            p.k(context, GAMConfig.KEY_CONTEXT);
            return new BillingClientBuilderBridge(BillingClientBridgeCommon.callNonVoidStaticMethod("newBuilder", context));
        }
    }

    public BillingClientBridge(@Nullable Object obj) {
        super(obj, a.m(h.a(QUERY_PURCHASES_ASYNC_METHOD, new Class[]{QueryPurchasesParamsBridge.Companion.getClassForParams(), PurchasesResponseListenerProxy.getProxyListenerClass()}), h.a(QUERY_PRODUCT_DETAILS_ASYNC_METHOD, new Class[]{QueryProductDetailsParamsBridge.Companion.getClassForParams(), ProductDetailsResponseListenerProxy.Companion.getProxyListenerClass()})));
    }

    @NotNull
    public static final BillingClientBuilderBridge newBuilder(@NotNull Context context) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        return Companion.newBuilder(context);
    }

    public final void queryProductDetailsAsync(@NotNull QueryProductDetailsParamsBridge queryProductDetailsParamsBridge, @NotNull ProductDetailsResponseListenerProxy productDetailsResponseListenerProxy) {
        p.k(queryProductDetailsParamsBridge, "queryProductDetailsParamsBridge");
        p.k(productDetailsResponseListenerProxy, "productDetailsResponseListenerProxy");
        callVoidMethod(QUERY_PRODUCT_DETAILS_ASYNC_METHOD, this._billingClientInternalInstance, queryProductDetailsParamsBridge.getQueryProductDetailsParamsInternalInstance(), productDetailsResponseListenerProxy.getProxyInstance());
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClient
    public void queryPurchasesAsync(@Nullable String str, @Nullable PurchasesResponseListenerProxy purchasesResponseListenerProxy) throws ClassNotFoundException {
        if (str != null) {
            QueryProductDetailsParamsBridge queryProductDetailsParamsBridgeBuild = QueryPurchasesParamsBridge.Companion.newBuilder().setProductType(str).build();
            Object obj = this._billingClientInternalInstance;
            p.h(purchasesResponseListenerProxy);
            callVoidMethod(QUERY_PURCHASES_ASYNC_METHOD, obj, queryProductDetailsParamsBridgeBuild.getQueryProductDetailsParamsInternalInstance(), purchasesResponseListenerProxy.getProxyInstance());
        }
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClient
    public void querySkuDetailsAsync(@NotNull SkuDetailsParamsBridge skuDetailsParamsBridge, @NotNull SkuDetailsResponseListenerProxy skuDetailsResponseListenerProxy) throws NoSuchMethodException, ClassNotFoundException {
        p.k(skuDetailsParamsBridge, "params");
        p.k(skuDetailsResponseListenerProxy, "skuDetailsResponseListenerProxy");
        throw new NoSuchMethodException("querySkuDetailsAsync does not exist in Billing Library v8, use queryProductDetailsAsync instead");
    }
}
