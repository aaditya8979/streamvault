package com.unity3d.services.store.gpbl.proxies;

import com.unity3d.services.core.reflection.GenericListenerProxy;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.v8.QueryProductDetailsResultsBridge;
import com.unity3d.services.store.gpbl.listeners.ProductDetailsResponseListener;
import java.lang.reflect.Method;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: ProductDetailsResponseListenerProxy.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class ProductDetailsResponseListenerProxy extends GenericListenerProxy {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String onProductDetailsResponseMethodName = "onProductDetailsResponse";

    @Nullable
    private final ProductDetailsResponseListener productDetailsResponseListener;

    /* JADX INFO: compiled from: ProductDetailsResponseListenerProxy.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        @NotNull
        public final Class<?> getProxyListenerClass() throws ClassNotFoundException {
            Class<?> cls = Class.forName("com.android.billingclient.api.ProductDetailsResponseListener");
            p.j(cls, "forName(\"com.android.bil…DetailsResponseListener\")");
            return cls;
        }
    }

    public ProductDetailsResponseListenerProxy(@Nullable ProductDetailsResponseListener productDetailsResponseListener) {
        this.productDetailsResponseListener = productDetailsResponseListener;
    }

    private final void onPurchasesUpdated(Object obj, Object obj2) {
        QueryProductDetailsResultsBridge queryProductDetailsResultsBridge = new QueryProductDetailsResultsBridge(obj2);
        ProductDetailsResponseListener productDetailsResponseListener = this.productDetailsResponseListener;
        if (productDetailsResponseListener != null) {
            productDetailsResponseListener.onProductDetailsResponse(new BillingResultBridge(obj), queryProductDetailsResultsBridge);
        }
    }

    @Nullable
    public final ProductDetailsResponseListener getProductDetailsResponseListener() {
        return this.productDetailsResponseListener;
    }

    @Override // com.unity3d.services.core.reflection.GenericListenerProxy
    @NotNull
    public Class<?> getProxyClass() {
        return Companion.getProxyListenerClass();
    }

    @Override // com.unity3d.services.core.reflection.GenericListenerProxy, java.lang.reflect.InvocationHandler
    @Nullable
    public Object invoke(@NotNull Object obj, @NotNull Method method, @Nullable Object[] objArr) {
        Object obj2;
        p.k(obj, "proxy");
        p.k(method, "method");
        if (!p.f(method.getName(), onProductDetailsResponseMethodName)) {
            return super.invoke(obj, method, objArr);
        }
        if (objArr != null && (obj2 = objArr[1]) != null) {
            onPurchasesUpdated(objArr[0], obj2);
        }
        return null;
    }
}
