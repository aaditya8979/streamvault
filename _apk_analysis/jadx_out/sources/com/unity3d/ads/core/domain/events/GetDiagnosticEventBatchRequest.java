package com.unity3d.ads.core.domain.events;

import gatewayprotocol.v1.DiagnosticEventRequestKt;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: GetDiagnosticEventBatchRequest.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class GetDiagnosticEventBatchRequest {
    @NotNull
    public final DiagnosticEventRequestOuterClass.DiagnosticEventRequest invoke(@NotNull List<DiagnosticEventRequestOuterClass.DiagnosticEvent> list) {
        p.k(list, "diagnosticEvents");
        DiagnosticEventRequestKt.Dsl.Companion companion = DiagnosticEventRequestKt.Dsl.Companion;
        DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder builderNewBuilder = DiagnosticEventRequestOuterClass.DiagnosticEventRequest.newBuilder();
        p.j(builderNewBuilder, "newBuilder()");
        DiagnosticEventRequestKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.addAllBatch(dsl_create.getBatch(), list);
        return dsl_create._build();
    }
}
