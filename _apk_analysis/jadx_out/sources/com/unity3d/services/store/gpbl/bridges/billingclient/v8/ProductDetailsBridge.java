package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

import bn.h;
import bo.a0;
import bo.d0;
import com.unity3d.services.core.reflection.GenericBridge;
import com.unity3d.services.store.gpbl.BillingOriginalJsonResponse;
import kotlin.collections.a;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: ProductDetailsBridge.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class ProductDetailsBridge extends GenericBridge implements BillingOriginalJsonResponse {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final String TO_STRING_METHOD = "toString";

    @NotNull
    private final Object internalRef;

    /* JADX INFO: compiled from: ProductDetailsBridge.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductDetailsBridge(@NotNull Object obj) {
        super(a.l(h.a(TO_STRING_METHOD, new Class[0])));
        p.k(obj, "internalRef");
        this.internalRef = obj;
    }

    private final String parseOriginalJson(String str) {
        try {
            int iR0 = d0.r0(str, "jsonString='", 0, false, 6, null) + 12;
            int iR02 = d0.r0(str, "', parsedJson=", 0, false, 6, null);
            boolean z10 = false;
            if (1 <= iR0 && iR0 < iR02) {
                z10 = true;
            }
            if (!z10) {
                return null;
            }
            String strSubstring = str.substring(iR0, iR02);
            p.j(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return a0.S(strSubstring, "\\/", "/", false, 4, null);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    @NotNull
    public String getClassName() {
        return "com.android.billingclient.api.ProductDetails";
    }

    @Override // com.unity3d.services.store.gpbl.BillingOriginalJsonResponse
    @NotNull
    public JSONObject getOriginalJson() {
        try {
            String originalJson = parseOriginalJson(toString());
            return originalJson != null ? new JSONObject(originalJson) : new JSONObject();
        } catch (JSONException unused) {
            return new JSONObject();
        }
    }

    @NotNull
    public String toString() {
        Object objCallNonVoidMethod = callNonVoidMethod(TO_STRING_METHOD, this.internalRef, new Object[0]);
        p.i(objCallNonVoidMethod, "null cannot be cast to non-null type kotlin.String");
        return (String) objCallNonVoidMethod;
    }
}
