package com.unity3d.ads.core.data.repository;

import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import go.p;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TransactionEventRepository.kt */
/* JADX INFO: loaded from: classes8.dex */
public interface TransactionEventRepository {
    void addTransactionEvent(@NotNull TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest);

    @NotNull
    p<TransactionEventRequestOuterClass.TransactionEventRequest> getTransactionEvents();
}
