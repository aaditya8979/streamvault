package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

import bn.h;
import cn.x;
import com.unity3d.services.core.reflection.GenericBridge;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;
import org.jetbrains.annotations.NotNull;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: QueryProductDetailsParamsBuilderBridge.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class QueryProductDetailsParamsBuilderBridge extends GenericBridge {

    @NotNull
    private static final String BUILD_METHOD = "build";

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final String SET_PRODUCT_LIST_METHOD = "setProductList";

    @NotNull
    private Object builderInstance;

    /* JADX INFO: compiled from: QueryProductDetailsParamsBuilderBridge.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueryProductDetailsParamsBuilderBridge(@NotNull Object obj) {
        super(a.m(h.a(SET_PRODUCT_LIST_METHOD, new Class[]{List.class}), h.a("build", new Class[0])));
        p.k(obj, "builderInstance");
        this.builderInstance = obj;
    }

    @NotNull
    public final QueryProductDetailsParamsBridge build() {
        return new QueryProductDetailsParamsBridge(callNonVoidMethod("build", this.builderInstance, new Object[0]));
    }

    @NotNull
    public final Object getBuilderInstance() {
        return this.builderInstance;
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    @NotNull
    public String getClassName() {
        return "com.android.billingclient.api.QueryProductDetailsParams$Builder";
    }

    public final void setBuilderInstance(@NotNull Object obj) {
        p.k(obj, "<set-?>");
        this.builderInstance = obj;
    }

    @NotNull
    public final QueryProductDetailsParamsBuilderBridge setProductList(@NotNull List<ProductBridge> list) {
        p.k(list, "productList");
        ArrayList arrayList = new ArrayList(x.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ProductBridge) it.next()).getInternalClass());
        }
        Object objCallNonVoidMethod = callNonVoidMethod(SET_PRODUCT_LIST_METHOD, this.builderInstance, arrayList);
        p.j(objCallNonVoidMethod, "callNonVoidMethod(SET_PR…nce, productListInternal)");
        this.builderInstance = objCallNonVoidMethod;
        return this;
    }
}
