package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

import bn.h;
import com.unity3d.services.core.reflection.GenericBridge;
import java.lang.reflect.InvocationTargetException;
import kotlin.collections.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: QueryProductDetailsParamsBridge.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class QueryProductDetailsParamsBridge extends GenericBridge {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final String NEW_BUILDER_METHOD = "newBuilder";

    @Nullable
    private final Object queryProductDetailsParamsInternalInstance;

    /* JADX INFO: compiled from: QueryProductDetailsParamsBridge.kt */
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
            Class<?> cls = Class.forName("com.android.billingclient.api.QueryProductDetailsParams");
            p.j(cls, "forName(\"com.android.bil…eryProductDetailsParams\")");
            return cls;
        }

        @NotNull
        public final QueryProductDetailsParamsBuilderBridge newBuilder() {
            return new QueryProductDetailsParamsBuilderBridge(callNonVoidStaticMethod("newBuilder"));
        }
    }

    public QueryProductDetailsParamsBridge(@Nullable Object obj) {
        super(a.l(h.a("newBuilder", new Class[0])));
        this.queryProductDetailsParamsInternalInstance = obj;
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    @NotNull
    public String getClassName() {
        return "com.android.billingclient.api.QueryProductDetailsParams";
    }

    @Nullable
    public final Object getQueryProductDetailsParamsInternalInstance() {
        return this.queryProductDetailsParamsInternalInstance;
    }
}
