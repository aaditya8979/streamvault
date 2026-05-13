package com.unity3d.ads.core.data.repository;

import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import go.f;
import go.k;
import go.p;
import go.q;
import kotlinx.coroutines.channels.BufferOverflow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: OperativeEventRepository.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class OperativeEventRepository {

    @NotNull
    private final k<OperativeEventRequestOuterClass.OperativeEventRequest> _operativeEvents;

    @NotNull
    private final p<OperativeEventRequestOuterClass.OperativeEventRequest> operativeEvents;

    public OperativeEventRepository() {
        k<OperativeEventRequestOuterClass.OperativeEventRequest> kVarA = q.a(10, 10, BufferOverflow.DROP_OLDEST);
        this._operativeEvents = kVarA;
        this.operativeEvents = f.b(kVarA);
    }

    public final void addOperativeEvent(@NotNull OperativeEventRequestOuterClass.OperativeEventRequest operativeEventRequest) {
        tn.p.k(operativeEventRequest, "operativeEventRequest");
        this._operativeEvents.h(operativeEventRequest);
    }

    @NotNull
    public final p<OperativeEventRequestOuterClass.OperativeEventRequest> getOperativeEvents() {
        return this.operativeEvents;
    }
}
