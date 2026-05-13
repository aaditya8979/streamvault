package com.unity3d.ads.core.domain.billing;

import hn.c;
import jn.d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: ProductDetailsFetcherWithFallback.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class ProductDetailsFetcherWithFallback implements ProductDetailsFetcher {

    @NotNull
    private final ProductDetailsFetcher primaryFetcher;

    @NotNull
    private final ProductDetailsFetcher secondaryFetcher;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback$fetchProductDetails$1, reason: invalid class name */
    /* JADX INFO: compiled from: ProductDetailsFetcherWithFallback.kt */
    @d(c = "com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback", f = "ProductDetailsFetcherWithFallback.kt", l = {16, 20, 24}, m = "fetchProductDetails")
    public static final class AnonymousClass1 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ProductDetailsFetcherWithFallback.this.fetchProductDetails(null, this);
        }
    }

    public ProductDetailsFetcherWithFallback(@NotNull ProductDetailsFetcher productDetailsFetcher, @NotNull ProductDetailsFetcher productDetailsFetcher2) {
        p.k(productDetailsFetcher, "primaryFetcher");
        p.k(productDetailsFetcher2, "secondaryFetcher");
        this.primaryFetcher = productDetailsFetcher;
        this.secondaryFetcher = productDetailsFetcher2;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.billing.ProductDetailsFetcher
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object fetchProductDetails(@org.jetbrains.annotations.NotNull java.lang.String r9, @org.jetbrains.annotations.NotNull hn.c<? super com.unity3d.ads.core.domain.billing.ProductDetailsResult> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r10
            com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback$fetchProductDetails$1 r0 = (com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback$fetchProductDetails$1 r0 = new com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback$fetchProductDetails$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = in.a.g()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4b
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r9 = r0.L$0
            com.unity3d.ads.core.domain.billing.ProductDetailsResult r9 = (com.unity3d.ads.core.domain.billing.ProductDetailsResult) r9
            kotlin.c.b(r10)
            goto L90
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3b:
            kotlin.c.b(r10)
            goto L79
        L3f:
            java.lang.Object r9 = r0.L$1
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback r2 = (com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback) r2
            kotlin.c.b(r10)
            goto L5e
        L4b:
            kotlin.c.b(r10)
            com.unity3d.ads.core.domain.billing.ProductDetailsFetcher r10 = r8.primaryFetcher
            r0.L$0 = r8
            r0.L$1 = r9
            r0.label = r5
            java.lang.Object r10 = r10.fetchProductDetails(r9, r0)
            if (r10 != r1) goto L5d
            return r1
        L5d:
            r2 = r8
        L5e:
            com.unity3d.ads.core.domain.billing.ProductDetailsResult r10 = (com.unity3d.ads.core.domain.billing.ProductDetailsResult) r10
            boolean r5 = r10 instanceof com.unity3d.ads.core.domain.billing.ProductDetailsResult.Success
            if (r5 == 0) goto L65
            goto L98
        L65:
            boolean r5 = r10 instanceof com.unity3d.ads.core.domain.billing.ProductDetailsResult.NotFound
            r6 = 0
            if (r5 == 0) goto L7a
            com.unity3d.ads.core.domain.billing.ProductDetailsFetcher r10 = r2.secondaryFetcher
            r0.L$0 = r6
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r10 = r10.fetchProductDetails(r9, r0)
            if (r10 != r1) goto L79
            return r1
        L79:
            return r10
        L7a:
            boolean r4 = r10 instanceof com.unity3d.ads.core.domain.billing.ProductDetailsResult.Failure
            if (r4 == 0) goto L99
            com.unity3d.ads.core.domain.billing.ProductDetailsFetcher r2 = r2.secondaryFetcher
            r0.L$0 = r10
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r9 = r2.fetchProductDetails(r9, r0)
            if (r9 != r1) goto L8d
            return r1
        L8d:
            r7 = r10
            r10 = r9
            r9 = r7
        L90:
            com.unity3d.ads.core.domain.billing.ProductDetailsResult r10 = (com.unity3d.ads.core.domain.billing.ProductDetailsResult) r10
            boolean r0 = r10 instanceof com.unity3d.ads.core.domain.billing.ProductDetailsResult.Success
            if (r0 == 0) goto L97
            goto L98
        L97:
            r10 = r9
        L98:
            return r10
        L99:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback.fetchProductDetails(java.lang.String, hn.c):java.lang.Object");
    }
}
