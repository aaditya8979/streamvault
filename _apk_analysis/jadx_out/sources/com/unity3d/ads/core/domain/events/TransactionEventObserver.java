package com.unity3d.ads.core.domain.events;

import bn.r;
import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.repository.TransactionEventRepository;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.gatewayclient.GatewayClient;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import go.f;
import go.l;
import go.v;
import hn.c;
import jn.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import sn.p;

/* JADX INFO: compiled from: TransactionEventObserver.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class TransactionEventObserver {

    @NotNull
    private final GatewayClient gatewayClient;

    @NotNull
    private final GetRequestPolicy getRequestPolicy;

    @NotNull
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;

    @NotNull
    private final ByteStringDataSource iapTransactionStore;

    @NotNull
    private final l<Boolean> isRunning;

    @NotNull
    private final l0 scope;

    @NotNull
    private final TransactionEventRepository transactionEventRepository;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.events.TransactionEventObserver$invoke$2, reason: invalid class name */
    /* JADX INFO: compiled from: TransactionEventObserver.kt */
    @d(c = "com.unity3d.ads.core.domain.events.TransactionEventObserver$invoke$2", f = "TransactionEventObserver.kt", l = {35, 36, 44}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements p<TransactionEventRequestOuterClass.TransactionEventRequest, c<? super r>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        public AnonymousClass2(c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            AnonymousClass2 anonymousClass2 = TransactionEventObserver.this.new AnonymousClass2(cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest, @Nullable c<? super r> cVar) {
            return ((AnonymousClass2) create(transactionEventRequest, cVar)).invokeSuspend(r.f5635a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0085 A[Catch: UnityAdsNetworkException -> 0x00ac, TRY_LEAVE, TryCatch #0 {UnityAdsNetworkException -> 0x00ac, blocks: (B:7:0x0011, B:12:0x0022, B:22:0x007d, B:24:0x0085, B:13:0x0026, B:19:0x0058, B:16:0x0031), top: B:30:0x0009 }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = in.a.g()
                int r1 = r12.label
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2a
                if (r1 == r4) goto L26
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                kotlin.c.b(r13)     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lac
                goto Lac
            L16:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L1e:
                java.lang.Object r1 = r12.L$0
                gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest r1 = (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) r1
                kotlin.c.b(r13)     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lac
                goto L7d
            L26:
                kotlin.c.b(r13)     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lac
                goto L58
            L2a:
                kotlin.c.b(r13)
                java.lang.Object r13 = r12.L$0
                gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionEventRequest r13 = (gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest) r13
                gatewayprotocol.v1.UniversalRequestKt r1 = gatewayprotocol.v1.UniversalRequestKt.INSTANCE     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lac
                gatewayprotocol.v1.UniversalRequestKt$PayloadKt$Dsl$Companion r1 = gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.Companion     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lac
                gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$Payload$Builder r5 = gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder()     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lac
                java.lang.String r6 = "newBuilder()"
                tn.p.j(r5, r6)     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lac
                gatewayprotocol.v1.UniversalRequestKt$PayloadKt$Dsl r1 = r1._create(r5)     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lac
                r1.setTransactionEventRequest(r13)     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lac
                gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$Payload r13 = r1._build()     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lac
                com.unity3d.ads.core.domain.events.TransactionEventObserver r1 = com.unity3d.ads.core.domain.events.TransactionEventObserver.this     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lac
                com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad r1 = com.unity3d.ads.core.domain.events.TransactionEventObserver.access$getGetUniversalRequestForPayLoad$p(r1)     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lac
                r12.label = r4     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lac
                java.lang.Object r13 = r1.invoke(r13, r12)     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lac
                if (r13 != r0) goto L58
                return r0
            L58:
                r1 = r13
                gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest r1 = (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) r1     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lac
                com.unity3d.ads.core.domain.events.TransactionEventObserver r13 = com.unity3d.ads.core.domain.events.TransactionEventObserver.this     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lac
                com.unity3d.ads.gatewayclient.GatewayClient r4 = com.unity3d.ads.core.domain.events.TransactionEventObserver.access$getGatewayClient$p(r13)     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lac
                r5 = 0
                com.unity3d.ads.core.domain.events.TransactionEventObserver r13 = com.unity3d.ads.core.domain.events.TransactionEventObserver.this     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lac
                com.unity3d.ads.core.domain.GetRequestPolicy r13 = com.unity3d.ads.core.domain.events.TransactionEventObserver.access$getGetRequestPolicy$p(r13)     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lac
                com.unity3d.ads.gatewayclient.RequestPolicy r7 = r13.invoke()     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lac
                com.unity3d.ads.core.data.model.OperationType r8 = com.unity3d.ads.core.data.model.OperationType.TRANSACTION_EVENT     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lac
                r10 = 1
                r11 = 0
                r12.L$0 = r1     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lac
                r12.label = r3     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lac
                r6 = r1
                r9 = r12
                java.lang.Object r13 = com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lac
                if (r13 != r0) goto L7d
                return r0
            L7d:
                gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponse r13 = (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) r13     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lac
                gatewayprotocol.v1.ErrorOuterClass$Error r13 = r13.getError()     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lac
                if (r13 == 0) goto Lac
                com.unity3d.ads.core.domain.events.TransactionEventObserver r13 = com.unity3d.ads.core.domain.events.TransactionEventObserver.this     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lac
                com.unity3d.ads.core.data.datasource.ByteStringDataSource r13 = com.unity3d.ads.core.domain.events.TransactionEventObserver.access$getIapTransactionStore$p(r13)     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lac
                gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$SharedData r1 = r1.getSharedData()     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lac
                gatewayprotocol.v1.TimestampsOuterClass$Timestamps r1 = r1.getTimestamps()     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lac
                com.google.protobuf.Timestamp r1 = r1.getTimestamp()     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lac
                com.google.protobuf.ByteString r1 = r1.toByteString()     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lac
                java.lang.String r3 = "fullRequest.sharedData.t….timestamp.toByteString()"
                tn.p.j(r1, r3)     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lac
                r3 = 0
                r12.L$0 = r3     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lac
                r12.label = r2     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lac
                java.lang.Object r13 = r13.set(r1, r12)     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lac
                if (r13 != r0) goto Lac
                return r0
            Lac:
                bn.r r13 = bn.r.f5635a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.TransactionEventObserver.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public TransactionEventObserver(@NotNull GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, @NotNull l0 l0Var, @NotNull TransactionEventRepository transactionEventRepository, @NotNull GatewayClient gatewayClient, @NotNull GetRequestPolicy getRequestPolicy, @NotNull ByteStringDataSource byteStringDataSource) {
        tn.p.k(getUniversalRequestForPayLoad, "getUniversalRequestForPayLoad");
        tn.p.k(l0Var, "scope");
        tn.p.k(transactionEventRepository, "transactionEventRepository");
        tn.p.k(gatewayClient, "gatewayClient");
        tn.p.k(getRequestPolicy, "getRequestPolicy");
        tn.p.k(byteStringDataSource, "iapTransactionStore");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.scope = l0Var;
        this.transactionEventRepository = transactionEventRepository;
        this.gatewayClient = gatewayClient;
        this.getRequestPolicy = getRequestPolicy;
        this.iapTransactionStore = byteStringDataSource;
        this.isRunning = v.a(Boolean.FALSE);
    }

    public final void invoke() {
        Boolean value;
        Boolean bool;
        l<Boolean> lVar = this.isRunning;
        do {
            value = lVar.getValue();
            bool = value;
            bool.booleanValue();
        } while (!lVar.b(value, Boolean.TRUE));
        if (bool.booleanValue()) {
            return;
        }
        f.D(f.G(this.transactionEventRepository.getTransactionEvents(), new AnonymousClass2(null)), this.scope);
    }
}
