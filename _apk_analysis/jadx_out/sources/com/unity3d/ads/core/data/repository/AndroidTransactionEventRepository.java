package com.unity3d.ads.core.data.repository;

import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import go.f;
import go.k;
import go.p;
import go.q;
import kotlinx.coroutines.channels.BufferOverflow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AndroidTransactionEventRepository.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class AndroidTransactionEventRepository implements TransactionEventRepository {

    @NotNull
    private final k<TransactionEventRequestOuterClass.TransactionEventRequest> _transactionEvents;

    @NotNull
    private final p<TransactionEventRequestOuterClass.TransactionEventRequest> transactionEvents;

    public AndroidTransactionEventRepository() {
        k<TransactionEventRequestOuterClass.TransactionEventRequest> kVarA = q.a(10, 10, BufferOverflow.DROP_OLDEST);
        this._transactionEvents = kVarA;
        this.transactionEvents = f.b(kVarA);
    }

    @Override // com.unity3d.ads.core.data.repository.TransactionEventRepository
    public void addTransactionEvent(@NotNull TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest) {
        tn.p.k(transactionEventRequest, "transactionEventRequest");
        this._transactionEvents.h(transactionEventRequest);
    }

    @Override // com.unity3d.ads.core.data.repository.TransactionEventRepository
    @NotNull
    public p<TransactionEventRequestOuterClass.TransactionEventRequest> getTransactionEvents() {
        return this.transactionEvents;
    }
}
