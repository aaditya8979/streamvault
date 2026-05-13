package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.domain.scar.FetchSignalsAndSendUseCase;
import com.unity3d.ads.core.domain.scar.ScarEligibleEffectiveUseCase;
import hn.c;
import jn.d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: CommonGetHeaderBiddingToken.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class CommonGetHeaderBiddingToken implements GetHeaderBiddingToken {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String HB_TOKEN_VERSION = "2";

    @NotNull
    private final BuildHeaderBiddingToken buildHeaderBiddingToken;

    @NotNull
    private final FetchSignalsAndSendUseCase fetchSignalsAndSendUseCase;

    @NotNull
    private final ScarEligibleEffectiveUseCase scarEligibleEffectiveUseCase;

    /* JADX INFO: compiled from: CommonGetHeaderBiddingToken.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: CommonGetHeaderBiddingToken.kt */
    @d(c = "com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken", f = "CommonGetHeaderBiddingToken.kt", l = {15, 18}, m = "invoke")
    public static final class AnonymousClass1 extends ContinuationImpl {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
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
            return CommonGetHeaderBiddingToken.this.invoke(0, null, this);
        }
    }

    public CommonGetHeaderBiddingToken(@NotNull BuildHeaderBiddingToken buildHeaderBiddingToken, @NotNull FetchSignalsAndSendUseCase fetchSignalsAndSendUseCase, @NotNull ScarEligibleEffectiveUseCase scarEligibleEffectiveUseCase) {
        p.k(buildHeaderBiddingToken, "buildHeaderBiddingToken");
        p.k(fetchSignalsAndSendUseCase, "fetchSignalsAndSendUseCase");
        p.k(scarEligibleEffectiveUseCase, "scarEligibleEffectiveUseCase");
        this.buildHeaderBiddingToken = buildHeaderBiddingToken;
        this.fetchSignalsAndSendUseCase = fetchSignalsAndSendUseCase;
        this.scarEligibleEffectiveUseCase = scarEligibleEffectiveUseCase;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.GetHeaderBiddingToken
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(int r10, @org.jetbrains.annotations.Nullable com.unity3d.ads.TokenConfiguration r11, @org.jetbrains.annotations.NotNull hn.c<? super java.lang.String> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r12
            com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken$invoke$1 r0 = (com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken$invoke$1 r0 = new com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken$invoke$1
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = in.a.g()
            int r2 = r0.label
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L4b
            if (r2 == r5) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r10 = r0.L$0
            gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken r10 = (gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) r10
            kotlin.c.b(r12)
            goto L95
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L39:
            int r10 = r0.I$0
            java.lang.Object r11 = r0.L$2
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r2 = r0.L$1
            com.unity3d.ads.TokenConfiguration r2 = (com.unity3d.ads.TokenConfiguration) r2
            java.lang.Object r6 = r0.L$0
            com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken r6 = (com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken) r6
            kotlin.c.b(r12)
            goto L71
        L4b:
            kotlin.c.b(r12)
            com.unity3d.ads.core.domain.scar.ScarEligibleEffectiveUseCase r12 = r9.scarEligibleEffectiveUseCase
            java.util.List r12 = r12.invoke(r11)
            com.unity3d.ads.core.domain.BuildHeaderBiddingToken r2 = r9.buildHeaderBiddingToken
            boolean r6 = r12.isEmpty()
            r6 = r6 ^ r5
            r0.L$0 = r9
            r0.L$1 = r11
            r0.L$2 = r12
            r0.I$0 = r10
            r0.label = r5
            java.lang.Object r2 = r2.invoke(r10, r11, r6, r0)
            if (r2 != r1) goto L6c
            return r1
        L6c:
            r6 = r9
            r8 = r2
            r2 = r11
            r11 = r12
            r12 = r8
        L71:
            gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken r12 = (gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) r12
            boolean r11 = r11.isEmpty()
            r11 = r11 ^ r5
            if (r11 == 0) goto L96
            com.unity3d.ads.core.domain.scar.FetchSignalsAndSendUseCase r11 = r6.fetchSignalsAndSendUseCase
            com.google.protobuf.ByteString r6 = r12.getTokenId()
            java.lang.String r7 = "rawToken.tokenId"
            tn.p.j(r6, r7)
            r0.L$0 = r12
            r0.L$1 = r4
            r0.L$2 = r4
            r0.label = r3
            java.lang.Object r10 = r11.invoke(r10, r6, r2, r0)
            if (r10 != r1) goto L94
            return r1
        L94:
            r10 = r12
        L95:
            r12 = r10
        L96:
            com.google.protobuf.ByteString r10 = r12.toByteString()
            java.lang.String r11 = "rawToken.toByteString()"
            tn.p.j(r10, r11)
            r11 = 0
            java.lang.String r10 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default(r10, r11, r5, r4)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "2:"
            r11.append(r12)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken.invoke(int, com.unity3d.ads.TokenConfiguration, hn.c):java.lang.Object");
    }
}
