package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

import bn.h;
import com.ironsource.C3978d4;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.unity3d.services.core.reflection.GenericBridge;
import kotlin.collections.a;
import org.jetbrains.annotations.NotNull;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: ProductBuilderBridge.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class ProductBuilderBridge extends GenericBridge {

    @NotNull
    private static final String BUILD_METHOD = "build";

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final String SET_PRODUCT_ID_METHOD = "setProductId";

    @NotNull
    private static final String SET_PRODUCT_TYPE_METHOD = "setProductType";

    @NotNull
    private Object builderInstance;

    /* JADX INFO: compiled from: ProductBuilderBridge.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductBuilderBridge(@NotNull Object obj) {
        super(a.m(h.a(SET_PRODUCT_ID_METHOD, new Class[]{String.class}), h.a(SET_PRODUCT_TYPE_METHOD, new Class[]{String.class}), h.a("build", new Class[0])));
        p.k(obj, "builderInstance");
        this.builderInstance = obj;
    }

    @NotNull
    public final ProductBridge build() {
        return new ProductBridge(callNonVoidMethod("build", this.builderInstance, new Object[0]));
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    @NotNull
    public String getClassName() {
        return "com.android.billingclient.api.QueryProductDetailsParams$Product$Builder";
    }

    @NotNull
    public final ProductBuilderBridge setProductId(@NotNull String str) {
        p.k(str, InAppPurchaseMetaData.KEY_PRODUCT_ID);
        Object objCallNonVoidMethod = callNonVoidMethod(SET_PRODUCT_ID_METHOD, this.builderInstance, str);
        p.j(objCallNonVoidMethod, "callNonVoidMethod(SET_PR…ilderInstance, productId)");
        this.builderInstance = objCallNonVoidMethod;
        return this;
    }

    @NotNull
    public final ProductBuilderBridge setProductType(@NotNull String str) {
        p.k(str, C3978d4.i.f31349m);
        Object objCallNonVoidMethod = callNonVoidMethod(SET_PRODUCT_TYPE_METHOD, this.builderInstance, str);
        p.j(objCallNonVoidMethod, "callNonVoidMethod(SET_PR…derInstance, productType)");
        this.builderInstance = objCallNonVoidMethod;
        return this;
    }
}
