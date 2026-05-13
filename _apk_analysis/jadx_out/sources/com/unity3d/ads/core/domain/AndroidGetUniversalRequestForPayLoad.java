package com.unity3d.ads.core.domain;

import hn.c;
import jn.d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: AndroidGetUniversalRequestForPayLoad.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class AndroidGetUniversalRequestForPayLoad implements GetUniversalRequestForPayLoad {

    @NotNull
    private final GetUniversalRequestSharedData getUniversalRequestSharedData;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidGetUniversalRequestForPayLoad$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidGetUniversalRequestForPayLoad.kt */
    @d(c = "com.unity3d.ads.core.domain.AndroidGetUniversalRequestForPayLoad", f = "AndroidGetUniversalRequestForPayLoad.kt", l = {14}, m = "invoke")
    public static final class AnonymousClass1 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
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
            return AndroidGetUniversalRequestForPayLoad.this.invoke(null, this);
        }
    }

    public AndroidGetUniversalRequestForPayLoad(@NotNull GetUniversalRequestSharedData getUniversalRequestSharedData) {
        p.k(getUniversalRequestSharedData, "getUniversalRequestSharedData");
        this.getUniversalRequestSharedData = getUniversalRequestSharedData;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(@org.jetbrains.annotations.NotNull gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload r6, @org.jetbrains.annotations.NotNull hn.c<? super gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.unity3d.ads.core.domain.AndroidGetUniversalRequestForPayLoad.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            com.unity3d.ads.core.domain.AndroidGetUniversalRequestForPayLoad$invoke$1 r0 = (com.unity3d.ads.core.domain.AndroidGetUniversalRequestForPayLoad.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.AndroidGetUniversalRequestForPayLoad$invoke$1 r0 = new com.unity3d.ads.core.domain.AndroidGetUniversalRequestForPayLoad$invoke$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = in.a.g()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L41
            if (r2 != r3) goto L39
            java.lang.Object r6 = r0.L$3
            gatewayprotocol.v1.UniversalRequestKt$Dsl r6 = (gatewayprotocol.v1.UniversalRequestKt.Dsl) r6
            java.lang.Object r1 = r0.L$2
            gatewayprotocol.v1.UniversalRequestKt$Dsl r1 = (gatewayprotocol.v1.UniversalRequestKt.Dsl) r1
            java.lang.Object r2 = r0.L$1
            gatewayprotocol.v1.UniversalRequestKt$Dsl r2 = (gatewayprotocol.v1.UniversalRequestKt.Dsl) r2
            java.lang.Object r0 = r0.L$0
            gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$Payload r0 = (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload) r0
            kotlin.c.b(r7)
            goto L6b
        L39:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L41:
            kotlin.c.b(r7)
            gatewayprotocol.v1.UniversalRequestKt$Dsl$Companion r7 = gatewayprotocol.v1.UniversalRequestKt.Dsl.Companion
            gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$Builder r2 = gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.newBuilder()
            java.lang.String r4 = "newBuilder()"
            tn.p.j(r2, r4)
            gatewayprotocol.v1.UniversalRequestKt$Dsl r7 = r7._create(r2)
            com.unity3d.ads.core.domain.GetUniversalRequestSharedData r2 = r5.getUniversalRequestSharedData
            r0.L$0 = r6
            r0.L$1 = r7
            r0.L$2 = r7
            r0.L$3 = r7
            r0.label = r3
            java.lang.Object r0 = r2.invoke(r0)
            if (r0 != r1) goto L66
            return r1
        L66:
            r1 = r7
            r2 = r1
            r7 = r0
            r0 = r6
            r6 = r2
        L6b:
            gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$SharedData r7 = (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData) r7
            r6.setSharedData(r7)
            r1.setPayload(r0)
            gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest r6 = r2._build()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidGetUniversalRequestForPayLoad.invoke(gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$Payload, hn.c):java.lang.Object");
    }
}
