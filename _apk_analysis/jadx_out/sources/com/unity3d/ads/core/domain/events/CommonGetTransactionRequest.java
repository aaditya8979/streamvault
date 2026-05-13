package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import hn.c;
import jn.d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: CommonGetTransactionRequest.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class CommonGetTransactionRequest implements GetTransactionRequest {

    @NotNull
    private final DeviceInfoRepository deviceInfoRepository;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.events.CommonGetTransactionRequest$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: CommonGetTransactionRequest.kt */
    @d(c = "com.unity3d.ads.core.domain.events.CommonGetTransactionRequest", f = "CommonGetTransactionRequest.kt", l = {21}, m = "invoke")
    public static final class AnonymousClass1 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
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
            return CommonGetTransactionRequest.this.invoke(null, null, null, this);
        }
    }

    public CommonGetTransactionRequest(@NotNull DeviceInfoRepository deviceInfoRepository) {
        p.k(deviceInfoRepository, "deviceInfoRepository");
        this.deviceInfoRepository = deviceInfoRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.events.GetTransactionRequest
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(@org.jetbrains.annotations.NotNull java.util.List<gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData> r7, @org.jetbrains.annotations.NotNull java.lang.String r8, @org.jetbrains.annotations.NotNull gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionOrigin r9, @org.jetbrains.annotations.NotNull hn.c<? super gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof com.unity3d.ads.core.domain.events.CommonGetTransactionRequest.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r10
            com.unity3d.ads.core.domain.events.CommonGetTransactionRequest$invoke$1 r0 = (com.unity3d.ads.core.domain.events.CommonGetTransactionRequest.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.events.CommonGetTransactionRequest$invoke$1 r0 = new com.unity3d.ads.core.domain.events.CommonGetTransactionRequest$invoke$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = in.a.g()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L52
            if (r2 != r3) goto L4a
            java.lang.Object r7 = r0.L$6
            gatewayprotocol.v1.TransactionEventRequestKt$Dsl r7 = (gatewayprotocol.v1.TransactionEventRequestKt.Dsl) r7
            java.lang.Object r8 = r0.L$5
            gatewayprotocol.v1.TransactionEventRequestKt$Dsl r8 = (gatewayprotocol.v1.TransactionEventRequestKt.Dsl) r8
            java.lang.Object r9 = r0.L$4
            gatewayprotocol.v1.TransactionEventRequestKt$Dsl r9 = (gatewayprotocol.v1.TransactionEventRequestKt.Dsl) r9
            java.lang.Object r1 = r0.L$3
            gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionOrigin r1 = (gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionOrigin) r1
            java.lang.Object r2 = r0.L$2
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r0.L$1
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r0 = r0.L$0
            com.unity3d.ads.core.domain.events.CommonGetTransactionRequest r0 = (com.unity3d.ads.core.domain.events.CommonGetTransactionRequest) r0
            kotlin.c.b(r10)
            r5 = r10
            r10 = r9
            r9 = r1
            r1 = r0
            r0 = r5
            goto L82
        L4a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L52:
            kotlin.c.b(r10)
            gatewayprotocol.v1.TransactionEventRequestKt$Dsl$Companion r10 = gatewayprotocol.v1.TransactionEventRequestKt.Dsl.Companion
            gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionEventRequest$Builder r2 = gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.newBuilder()
            java.lang.String r4 = "newBuilder()"
            tn.p.j(r2, r4)
            gatewayprotocol.v1.TransactionEventRequestKt$Dsl r10 = r10._create(r2)
            com.unity3d.ads.core.data.repository.DeviceInfoRepository r2 = r6.deviceInfoRepository
            r0.L$0 = r6
            r0.L$1 = r7
            r0.L$2 = r8
            r0.L$3 = r9
            r0.L$4 = r10
            r0.L$5 = r10
            r0.L$6 = r10
            r0.label = r3
            java.lang.Object r0 = r2.staticDeviceInfo(r0)
            if (r0 != r1) goto L7d
            return r1
        L7d:
            r1 = r6
            r3 = r7
            r2 = r8
            r7 = r10
            r8 = r7
        L82:
            gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo r0 = (gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) r0
            r7.setStaticDeviceInfo(r0)
            com.unity3d.ads.core.data.repository.DeviceInfoRepository r7 = r1.deviceInfoRepository
            gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo r7 = r7.getDynamicDeviceInfo()
            r8.setDynamicDeviceInfo(r7)
            gatewayprotocol.v1.TransactionEventRequestOuterClass$StoreType r7 = gatewayprotocol.v1.TransactionEventRequestOuterClass.StoreType.STORE_TYPE_GOOGLE_PLAY
            r8.setAppStore(r7)
            r8.setGooglePlayBillingLibraryVersion(r2)
            r8.setOrigin(r9)
            com.google.protobuf.kotlin.DslList r7 = r8.getTransactionData()
            r8.addAllTransactionData(r7, r3)
            gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionEventRequest r7 = r10._build()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.CommonGetTransactionRequest.invoke(java.util.List, java.lang.String, gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionOrigin, hn.c):java.lang.Object");
    }
}
