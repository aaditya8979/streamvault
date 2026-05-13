package com.unity3d.ads.core.domain.billing;

import com.ironsource.C3978d4;
import com.unity3d.ads.core.domain.billing.ProductDetailsResult;
import com.unity3d.services.store.gpbl.BillingResultResponseCode;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter;
import com.unity3d.services.store.gpbl.listeners.ProductDetailsListener;
import hn.c;
import in.a;
import jn.f;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.k;
import tn.p;

/* JADX INFO: compiled from: CommonProductDetailsFetcher.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class CommonProductDetailsFetcher implements ProductDetailsFetcher {

    @Nullable
    private final BillingClientAdapter billingClientAdapter;

    @NotNull
    private final String productType;

    public CommonProductDetailsFetcher(@Nullable BillingClientAdapter billingClientAdapter, @NotNull String str) {
        p.k(str, C3978d4.i.f31349m);
        this.billingClientAdapter = billingClientAdapter;
        this.productType = str;
    }

    @Override // com.unity3d.ads.core.domain.billing.ProductDetailsFetcher
    @Nullable
    public Object fetchProductDetails(@NotNull String str, @NotNull c<? super ProductDetailsResult> cVar) {
        final kotlinx.coroutines.c cVar2 = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.d(cVar), 1);
        cVar2.K();
        ProductDetailsListener productDetailsListener = new ProductDetailsListener() { // from class: com.unity3d.ads.core.domain.billing.CommonProductDetailsFetcher$fetchProductDetails$2$listener$1
            @Override // com.unity3d.services.store.gpbl.listeners.ProductDetailsListener
            public final void onProductDetailsResponse(@NotNull BillingResultBridge billingResultBridge, @Nullable String str2) {
                p.k(billingResultBridge, "billingResult");
                if (str2 != null && billingResultBridge.getResponseCode() == BillingResultResponseCode.OK) {
                    k<ProductDetailsResult> kVar = cVar2;
                    Result.a aVar = Result.Companion;
                    kVar.resumeWith(Result.m7534constructorimpl(new ProductDetailsResult.Success(str2)));
                } else if (billingResultBridge.getResponseCode() == BillingResultResponseCode.OK) {
                    k<ProductDetailsResult> kVar2 = cVar2;
                    Result.a aVar2 = Result.Companion;
                    kVar2.resumeWith(Result.m7534constructorimpl(ProductDetailsResult.NotFound.INSTANCE));
                } else {
                    k<ProductDetailsResult> kVar3 = cVar2;
                    Result.a aVar3 = Result.Companion;
                    kVar3.resumeWith(Result.m7534constructorimpl(new ProductDetailsResult.Failure(billingResultBridge)));
                }
            }
        };
        BillingClientAdapter billingClientAdapter = this.billingClientAdapter;
        if (billingClientAdapter != null) {
            billingClientAdapter.queryProductDetailsAsync(str, this.productType, productDetailsListener);
        }
        Object objB = cVar2.B();
        if (objB == a.g()) {
            f.c(cVar);
        }
        return objB;
    }
}
