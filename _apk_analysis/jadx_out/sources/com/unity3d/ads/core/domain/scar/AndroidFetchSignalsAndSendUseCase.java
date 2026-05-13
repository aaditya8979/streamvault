package com.unity3d.ads.core.domain.scar;

import bn.r;
import com.google.protobuf.ByteString;
import com.unity3d.ads.TokenConfiguration;
import com.unity3d.ads.core.data.manager.ScarManager;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import gatewayprotocol.v1.AdFormatOuterClass;
import hn.c;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jn.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.i;
import p000do.l0;
import sn.p;

/* JADX INFO: compiled from: AndroidFetchSignalsAndSendUseCase.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class AndroidFetchSignalsAndSendUseCase implements FetchSignalsAndSendUseCase {

    @NotNull
    private final HandleGetTokenRequest handleGetTokenRequest;

    @NotNull
    private final ScarEligibleEffectiveUseCase scarEligibleEffectiveUseCase;

    @NotNull
    private final ScarManager scarManager;

    @NotNull
    private final l0 scope;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.scar.AndroidFetchSignalsAndSendUseCase$invoke$2, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidFetchSignalsAndSendUseCase.kt */
    @d(c = "com.unity3d.ads.core.domain.scar.AndroidFetchSignalsAndSendUseCase$invoke$2", f = "AndroidFetchSignalsAndSendUseCase.kt", l = {34, 54}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements p<l0, c<? super r>, Object> {
        public final /* synthetic */ TokenConfiguration $tokenConfiguration;
        public final /* synthetic */ ByteString $tokenId;
        public final /* synthetic */ int $tokenNumber;
        public long J$0;
        private /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(TokenConfiguration tokenConfiguration, int i10, ByteString byteString, c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$tokenConfiguration = tokenConfiguration;
            this.$tokenNumber = i10;
            this.$tokenId = byteString;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            AnonymousClass2 anonymousClass2 = AndroidFetchSignalsAndSendUseCase.this.new AnonymousClass2(this.$tokenConfiguration, this.$tokenNumber, this.$tokenId, cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull l0 l0Var, @Nullable c<? super r> cVar) {
            return ((AnonymousClass2) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        /* JADX WARN: Removed duplicated region for block: B:45:0x0115  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0118  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r18) {
            /*
                Method dump skipped, instruction units count: 324
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.scar.AndroidFetchSignalsAndSendUseCase.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public AndroidFetchSignalsAndSendUseCase(@NotNull l0 l0Var, @NotNull ScarManager scarManager, @NotNull HandleGetTokenRequest handleGetTokenRequest, @NotNull SendDiagnosticEvent sendDiagnosticEvent, @NotNull ScarEligibleEffectiveUseCase scarEligibleEffectiveUseCase) {
        tn.p.k(l0Var, "scope");
        tn.p.k(scarManager, "scarManager");
        tn.p.k(handleGetTokenRequest, "handleGetTokenRequest");
        tn.p.k(sendDiagnosticEvent, "sendDiagnosticEvent");
        tn.p.k(scarEligibleEffectiveUseCase, "scarEligibleEffectiveUseCase");
        this.scope = l0Var;
        this.scarManager = scarManager;
        this.handleGetTokenRequest = handleGetTokenRequest;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.scarEligibleEffectiveUseCase = scarEligibleEffectiveUseCase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, String> getTags(List<? extends AdFormatOuterClass.AdFormat> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list.contains(AdFormatOuterClass.AdFormat.AD_FORMAT_BANNER)) {
            linkedHashMap.put("banner", "true");
        }
        if (list.contains(AdFormatOuterClass.AdFormat.AD_FORMAT_REWARDED)) {
            linkedHashMap.put("rewarded", "true");
        }
        if (list.contains(AdFormatOuterClass.AdFormat.AD_FORMAT_INTERSTITIAL)) {
            linkedHashMap.put("interstitial", "true");
        }
        return linkedHashMap;
    }

    @Override // com.unity3d.ads.core.domain.scar.FetchSignalsAndSendUseCase
    @Nullable
    public Object invoke(int i10, @NotNull ByteString byteString, @Nullable TokenConfiguration tokenConfiguration, @NotNull c<? super r> cVar) {
        i.d(this.scope, null, null, new AnonymousClass2(tokenConfiguration, i10, byteString, null), 3, null);
        return r.f5635a;
    }
}
