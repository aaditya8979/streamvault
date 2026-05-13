package com.unity3d.ads.core.domain.billing;

import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: ProductDetailsResult.kt */
/* JADX INFO: loaded from: classes8.dex */
public abstract class ProductDetailsResult {

    /* JADX INFO: compiled from: ProductDetailsResult.kt */
    public static final class Failure extends ProductDetailsResult {

        @NotNull
        private final BillingResultBridge billingResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(@NotNull BillingResultBridge billingResultBridge) {
            super(null);
            p.k(billingResultBridge, "billingResult");
            this.billingResult = billingResultBridge;
        }

        public static /* synthetic */ Failure copy$default(Failure failure, BillingResultBridge billingResultBridge, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                billingResultBridge = failure.billingResult;
            }
            return failure.copy(billingResultBridge);
        }

        @NotNull
        public final BillingResultBridge component1() {
            return this.billingResult;
        }

        @NotNull
        public final Failure copy(@NotNull BillingResultBridge billingResultBridge) {
            p.k(billingResultBridge, "billingResult");
            return new Failure(billingResultBridge);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failure) && p.f(this.billingResult, ((Failure) obj).billingResult);
        }

        @NotNull
        public final BillingResultBridge getBillingResult() {
            return this.billingResult;
        }

        public int hashCode() {
            return this.billingResult.hashCode();
        }

        @NotNull
        public String toString() {
            return "Failure(billingResult=" + this.billingResult + ')';
        }
    }

    /* JADX INFO: compiled from: ProductDetailsResult.kt */
    public static final class NotFound extends ProductDetailsResult {

        @NotNull
        public static final NotFound INSTANCE = new NotFound();

        private NotFound() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: ProductDetailsResult.kt */
    public static final class Success extends ProductDetailsResult {

        @NotNull
        private final String productDetailsJson;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(@NotNull String str) {
            super(null);
            p.k(str, "productDetailsJson");
            this.productDetailsJson = str;
        }

        public static /* synthetic */ Success copy$default(Success success, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = success.productDetailsJson;
            }
            return success.copy(str);
        }

        @NotNull
        public final String component1() {
            return this.productDetailsJson;
        }

        @NotNull
        public final Success copy(@NotNull String str) {
            p.k(str, "productDetailsJson");
            return new Success(str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && p.f(this.productDetailsJson, ((Success) obj).productDetailsJson);
        }

        @NotNull
        public final String getProductDetailsJson() {
            return this.productDetailsJson;
        }

        public int hashCode() {
            return this.productDetailsJson.hashCode();
        }

        @NotNull
        public String toString() {
            return "Success(productDetailsJson=" + this.productDetailsJson + ')';
        }
    }

    private ProductDetailsResult() {
    }

    public /* synthetic */ ProductDetailsResult(i iVar) {
        this();
    }
}
