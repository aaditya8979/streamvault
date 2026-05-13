package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.domain.GetByteStringId;
import com.unity3d.ads.core.extensions.TimestampExtensionsKt;
import com.unity3d.ads.core.extensions.TransactionStateExtensionsKt;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.unity3d.services.store.gpbl.bridges.PurchaseBridge;
import gatewayprotocol.v1.TransactionDataKt;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import tn.p;

/* JADX INFO: compiled from: AndroidGetTransactionData.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class AndroidGetTransactionData implements GetTransactionData {

    @NotNull
    private final GetByteStringId getByteStringId;

    public AndroidGetTransactionData(@NotNull GetByteStringId getByteStringId) {
        p.k(getByteStringId, "getByteStringId");
        this.getByteStringId = getByteStringId;
    }

    @Override // com.unity3d.ads.core.domain.events.GetTransactionData
    @NotNull
    public TransactionEventRequestOuterClass.TransactionData invoke(@NotNull PurchaseBridge purchaseBridge, @NotNull String str) throws JSONException {
        p.k(purchaseBridge, "purchaseDetail");
        p.k(str, "productDetailJson");
        TransactionDataKt.Dsl.Companion companion = TransactionDataKt.Dsl.Companion;
        TransactionEventRequestOuterClass.TransactionData.Builder builderNewBuilder = TransactionEventRequestOuterClass.TransactionData.newBuilder();
        p.j(builderNewBuilder, "newBuilder()");
        TransactionDataKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setProductId(purchaseBridge.getOriginalJson().get(InAppPurchaseMetaData.KEY_PRODUCT_ID).toString());
        dsl_create.setEventId(this.getByteStringId.invoke());
        Object obj = purchaseBridge.getOriginalJson().get("purchaseTime");
        p.i(obj, "null cannot be cast to non-null type kotlin.Long");
        dsl_create.setTimestamp(TimestampExtensionsKt.fromMillis(((Long) obj).longValue()));
        dsl_create.setTransactionId(purchaseBridge.getOriginalJson().get("orderId").toString());
        dsl_create.setProduct(str);
        String string = purchaseBridge.getOriginalJson().toString();
        p.j(string, "purchaseDetail.originalJson.toString()");
        dsl_create.setTransaction(string);
        String signature = purchaseBridge.getSignature();
        p.j(signature, "purchaseDetail.signature");
        dsl_create.setSignature(signature);
        Object obj2 = purchaseBridge.getOriginalJson().get("purchaseState");
        p.i(obj2, "null cannot be cast to non-null type kotlin.Int");
        dsl_create.setTransactionState(TransactionStateExtensionsKt.fromPurchaseState(((Integer) obj2).intValue()));
        return dsl_create._build();
    }
}
