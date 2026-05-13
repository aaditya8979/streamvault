package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

import bn.h;
import com.unity3d.services.core.reflection.GenericBridge;
import java.lang.reflect.InvocationTargetException;
import kotlin.collections.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: QueryPurchasesParamsBridge.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class QueryPurchasesParamsBridge extends GenericBridge {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final String NEW_BUILDER_METHOD = "newBuilder";

    @Nullable
    private final Object queryPurchasesParamsBridgeInternalInstance;

    /* JADX INFO: compiled from: QueryPurchasesParamsBridge.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        private final Object callNonVoidStaticMethod(String str) throws IllegalAccessException, InvocationTargetException {
            Object objInvoke = getClassForParams().getMethod(str, new Class[0]).invoke(null, new Object[0]);
            if (objInvoke != null) {
                return objInvoke;
            }
            throw new IllegalStateException("Static method " + str + " returned null");
        }

        @NotNull
        public final Class<?> getClassForParams() throws ClassNotFoundException {
            Class<?> cls = Class.forName("com.android.billingclient.api.QueryPurchasesParams");
            p.j(cls, "forName(\"com.android.bil…pi.QueryPurchasesParams\")");
            return cls;
        }

        @NotNull
        public final QueryPurchasesParamsBuilderBridge newBuilder() {
            return new QueryPurchasesParamsBuilderBridge(callNonVoidStaticMethod("newBuilder"));
        }
    }

    public QueryPurchasesParamsBridge(@Nullable Object obj) {
        super(a.l(h.a("newBuilder", new Class[0])));
        this.queryPurchasesParamsBridgeInternalInstance = obj;
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    @NotNull
    public String getClassName() {
        return "com.android.billingclient.api.QueryPurchasesParams";
    }

    @Nullable
    public final Object getQueryPurchasesParamsBridgeInternalInstance() {
        return this.queryPurchasesParamsBridgeInternalInstance;
    }
}
