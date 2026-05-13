package com.unity3d.ads.core.domain.events;

import bn.r;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.OperativeEventRepository;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import hn.c;
import in.a;
import jn.d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: GetOperativeEventApi.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class GetOperativeEventApi {

    @NotNull
    private final OperativeEventRepository operativeEventRepository;

    @NotNull
    private final GetOperativeEventRequest operativeEventRequest;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.events.GetOperativeEventApi$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: GetOperativeEventApi.kt */
    @d(c = "com.unity3d.ads.core.domain.events.GetOperativeEventApi", f = "GetOperativeEventApi.kt", l = {21}, m = "invoke")
    public static final class AnonymousClass1 extends ContinuationImpl {
        public Object L$0;
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
            return GetOperativeEventApi.this.invoke(null, null, null, null, null, null, this);
        }
    }

    public GetOperativeEventApi(@NotNull OperativeEventRepository operativeEventRepository, @NotNull GetOperativeEventRequest getOperativeEventRequest) {
        p.k(operativeEventRepository, "operativeEventRepository");
        p.k(getOperativeEventRequest, "operativeEventRequest");
        this.operativeEventRepository = operativeEventRepository;
        this.operativeEventRequest = getOperativeEventRequest;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType r12, @org.jetbrains.annotations.NotNull com.google.protobuf.ByteString r13, @org.jetbrains.annotations.NotNull com.google.protobuf.ByteString r14, @org.jetbrains.annotations.NotNull com.google.protobuf.ByteString r15, @org.jetbrains.annotations.Nullable java.lang.String r16, @org.jetbrains.annotations.Nullable gatewayprotocol.v1.AdFormatOuterClass.AdFormat r17, @org.jetbrains.annotations.NotNull hn.c<? super bn.r> r18) {
        /*
            r11 = this;
            r0 = r11
            r1 = r18
            boolean r2 = r1 instanceof com.unity3d.ads.core.domain.events.GetOperativeEventApi.AnonymousClass1
            if (r2 == 0) goto L16
            r2 = r1
            com.unity3d.ads.core.domain.events.GetOperativeEventApi$invoke$1 r2 = (com.unity3d.ads.core.domain.events.GetOperativeEventApi.AnonymousClass1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.label = r3
            goto L1b
        L16:
            com.unity3d.ads.core.domain.events.GetOperativeEventApi$invoke$1 r2 = new com.unity3d.ads.core.domain.events.GetOperativeEventApi$invoke$1
            r2.<init>(r1)
        L1b:
            r10 = r2
            java.lang.Object r1 = r10.result
            java.lang.Object r2 = in.a.g()
            int r3 = r10.label
            r4 = 1
            if (r3 == 0) goto L39
            if (r3 != r4) goto L31
            java.lang.Object r2 = r10.L$0
            com.unity3d.ads.core.domain.events.GetOperativeEventApi r2 = (com.unity3d.ads.core.domain.events.GetOperativeEventApi) r2
            kotlin.c.b(r1)
            goto L52
        L31:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L39:
            kotlin.c.b(r1)
            com.unity3d.ads.core.domain.events.GetOperativeEventRequest r3 = r0.operativeEventRequest
            r10.L$0 = r0
            r10.label = r4
            r4 = r12
            r5 = r14
            r6 = r13
            r7 = r15
            r8 = r16
            r9 = r17
            java.lang.Object r1 = r3.invoke(r4, r5, r6, r7, r8, r9, r10)
            if (r1 != r2) goto L51
            return r2
        L51:
            r2 = r0
        L52:
            gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest r1 = (gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest) r1
            com.unity3d.ads.core.data.repository.OperativeEventRepository r2 = r2.operativeEventRepository
            r2.addOperativeEvent(r1)
            bn.r r1 = bn.r.f5635a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.GetOperativeEventApi.invoke(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventType, com.google.protobuf.ByteString, com.google.protobuf.ByteString, com.google.protobuf.ByteString, java.lang.String, gatewayprotocol.v1.AdFormatOuterClass$AdFormat, hn.c):java.lang.Object");
    }

    @Nullable
    public final Object invoke(@NotNull OperativeEventRequestOuterClass.OperativeEventType operativeEventType, @NotNull AdObject adObject, @NotNull ByteString byteString, @NotNull c<? super r> cVar) {
        Object objInvoke = invoke(operativeEventType, adObject.getOpportunityId(), adObject.getTrackingToken(), byteString, adObject.getPlayerServerId(), (adObject.getAdType() == DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_BANNER ? this : null) != null ? AdFormatOuterClass.AdFormat.AD_FORMAT_BANNER : null, cVar);
        return objInvoke == a.g() ? objInvoke : r.f5635a;
    }
}
