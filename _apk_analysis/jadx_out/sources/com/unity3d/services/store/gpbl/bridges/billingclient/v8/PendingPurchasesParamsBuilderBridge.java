package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

import bn.h;
import com.unity3d.services.core.reflection.GenericBridge;
import kotlin.collections.a;
import org.jetbrains.annotations.NotNull;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: PendingPurchasesParamsBuilderBridge.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class PendingPurchasesParamsBuilderBridge extends GenericBridge {

    @NotNull
    private static final String BUILD_METHOD = "build";

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final String ENABLE_ONE_TIME_PRODUCT_METHOD = "enableOneTimeProducts";

    @NotNull
    private final Object builderInstance;

    /* JADX INFO: compiled from: PendingPurchasesParamsBuilderBridge.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PendingPurchasesParamsBuilderBridge(@NotNull Object obj) {
        super(a.l(h.a(ENABLE_ONE_TIME_PRODUCT_METHOD, new Class[0]), h.a("build", new Class[0])));
        p.k(obj, "builderInstance");
        this.builderInstance = obj;
    }

    @NotNull
    public final PendingPurchasesParamsBridge build() {
        return new PendingPurchasesParamsBridge(callNonVoidMethod("build", this.builderInstance, new Object[0]));
    }

    @NotNull
    public final PendingPurchasesParamsBuilderBridge enableOneTimeProducts() {
        callVoidMethod(ENABLE_ONE_TIME_PRODUCT_METHOD, this.builderInstance, new Object[0]);
        return this;
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    @NotNull
    public String getClassName() {
        return "com.android.billingclient.api.PendingPurchasesParams$Builder";
    }
}
