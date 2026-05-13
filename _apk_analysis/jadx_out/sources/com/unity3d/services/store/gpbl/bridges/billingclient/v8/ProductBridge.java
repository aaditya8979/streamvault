package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

import com.unity3d.services.core.reflection.GenericBridge;
import java.lang.reflect.InvocationTargetException;
import kotlin.collections.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: ProductBridge.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class ProductBridge extends GenericBridge {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String NEW_BUILDER_METHOD = "newBuilder";

    @Nullable
    private final Object productInternalInstance;

    /* JADX INFO: compiled from: ProductBridge.kt */
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
            Class<?> cls = Class.forName("com.android.billingclient.api.QueryProductDetailsParams$Product");
            p.j(cls, "forName(\"com.android.bil…tDetailsParams\\$Product\")");
            return cls;
        }

        @NotNull
        public final ProductBuilderBridge newBuilder() {
            return new ProductBuilderBridge(callNonVoidStaticMethod("newBuilder"));
        }
    }

    public ProductBridge(@Nullable Object obj) {
        super(a.j());
        this.productInternalInstance = obj;
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    @NotNull
    public String getClassName() {
        return "com.android.billingclient.api.QueryProductDetailsParams$Product";
    }

    @Nullable
    public final Object getInternalClass() {
        return this.productInternalInstance;
    }
}
