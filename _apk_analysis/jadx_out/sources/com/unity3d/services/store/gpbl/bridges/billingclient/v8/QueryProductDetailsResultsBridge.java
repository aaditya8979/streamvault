package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

import bn.h;
import cn.p0;
import cn.w;
import cn.x;
import com.unity3d.services.core.reflection.GenericBridge;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: QueryProductDetailsResultsBridge.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class QueryProductDetailsResultsBridge extends GenericBridge {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final String GET_PRODUCT_DETAILS_LIST_METHOD = "getProductDetailsList";

    @NotNull
    private final Object productDetailsResult;

    /* JADX INFO: compiled from: QueryProductDetailsResultsBridge.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueryProductDetailsResultsBridge(@NotNull Object obj) {
        super(p0.g(h.a(GET_PRODUCT_DETAILS_LIST_METHOD, new Class[0])));
        p.k(obj, "productDetailsResult");
        this.productDetailsResult = obj;
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    @NotNull
    public String getClassName() {
        return "com.android.billingclient.api.QueryProductDetailsResult";
    }

    @NotNull
    public final List<ProductDetailsBridge> getProductDetailsList() {
        List list = (List) callNonVoidMethod(GET_PRODUCT_DETAILS_LIST_METHOD, this.productDetailsResult, new Object[0]);
        if (list == null) {
            return w.m();
        }
        ArrayList arrayList = new ArrayList(x.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new ProductDetailsBridge(it.next()));
        }
        return arrayList;
    }
}
