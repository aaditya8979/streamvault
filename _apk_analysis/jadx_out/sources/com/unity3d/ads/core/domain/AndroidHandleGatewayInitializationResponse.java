package com.unity3d.ads.core.domain;

import bn.r;
import com.unity3d.ads.core.data.manager.TransactionEventManager;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import com.unity3d.ads.core.data.repository.SessionRepository;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import gatewayprotocol.v1.NativeConfigurationKt;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import hn.c;
import java.util.List;
import jn.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.i;
import p000do.l0;
import sn.p;

/* JADX INFO: compiled from: AndroidHandleGatewayInitializationResponse.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class AndroidHandleGatewayInitializationResponse implements HandleGatewayInitializationResponse {

    @NotNull
    private final GetSafeguardedInitializationPolicy getSafeguardedInitializationPolicy;

    @NotNull
    private final HandleDebugSettings handleDebugSettings;

    @NotNull
    private final l0 sdkScope;

    @NotNull
    private final SessionRepository sessionRepository;

    @NotNull
    private final TransactionEventManager transactionEventManager;

    @NotNull
    private final TriggerInitializationCompletedRequest triggerInitializationCompletedRequest;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidHandleGatewayInitializationResponse$invoke$3, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidHandleGatewayInitializationResponse.kt */
    @d(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayInitializationResponse$invoke$3", f = "AndroidHandleGatewayInitializationResponse.kt", l = {44}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends SuspendLambda implements p<l0, c<? super r>, Object> {
        public int label;

        public AnonymousClass3(c<? super AnonymousClass3> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            return AndroidHandleGatewayInitializationResponse.this.new AnonymousClass3(cVar);
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull l0 l0Var, @Nullable c<? super r> cVar) {
            return ((AnonymousClass3) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = in.a.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                TriggerInitializationCompletedRequest triggerInitializationCompletedRequest = AndroidHandleGatewayInitializationResponse.this.triggerInitializationCompletedRequest;
                this.label = 1;
                if (triggerInitializationCompletedRequest.invoke(this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            return r.f5635a;
        }
    }

    public AndroidHandleGatewayInitializationResponse(@NotNull TransactionEventManager transactionEventManager, @NotNull TriggerInitializationCompletedRequest triggerInitializationCompletedRequest, @NotNull SessionRepository sessionRepository, @NotNull l0 l0Var, @NotNull HandleDebugSettings handleDebugSettings, @NotNull GetSafeguardedInitializationPolicy getSafeguardedInitializationPolicy) {
        tn.p.k(transactionEventManager, "transactionEventManager");
        tn.p.k(triggerInitializationCompletedRequest, "triggerInitializationCompletedRequest");
        tn.p.k(sessionRepository, "sessionRepository");
        tn.p.k(l0Var, "sdkScope");
        tn.p.k(handleDebugSettings, "handleDebugSettings");
        tn.p.k(getSafeguardedInitializationPolicy, "getSafeguardedInitializationPolicy");
        this.transactionEventManager = transactionEventManager;
        this.triggerInitializationCompletedRequest = triggerInitializationCompletedRequest;
        this.sessionRepository = sessionRepository;
        this.sdkScope = l0Var;
        this.handleDebugSettings = handleDebugSettings;
        this.getSafeguardedInitializationPolicy = getSafeguardedInitializationPolicy;
    }

    @Override // com.unity3d.ads.core.domain.HandleGatewayInitializationResponse
    @Nullable
    public Object invoke(@NotNull InitializationResponseOuterClass.InitializationResponse initializationResponse, @NotNull c<? super r> cVar) throws GatewayException {
        if (initializationResponse.hasError()) {
            String errorText = initializationResponse.getError().getErrorText();
            tn.p.j(errorText, "response.error.errorText");
            throw new GatewayException(errorText, new IllegalStateException(initializationResponse.getError().getErrorText()), "gateway_initialization", initializationResponse.getError().getErrorText());
        }
        SessionRepository sessionRepository = this.sessionRepository;
        NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration = initializationResponse.getNativeConfiguration();
        tn.p.j(nativeConfiguration, "response.nativeConfiguration");
        NativeConfigurationKt.Dsl.Companion companion = NativeConfigurationKt.Dsl.Companion;
        NativeConfigurationOuterClass.NativeConfiguration.Builder builder = nativeConfiguration.toBuilder();
        tn.p.j(builder, "this.toBuilder()");
        NativeConfigurationKt.Dsl dsl_create = companion._create(builder);
        dsl_create.setInitPolicy(this.getSafeguardedInitializationPolicy.invoke(dsl_create.getInitPolicy()));
        sessionRepository.setNativeConfiguration(dsl_create._build());
        if (initializationResponse.hasUniversalRequestUrl()) {
            String universalRequestUrl = initializationResponse.getUniversalRequestUrl();
            if (!(universalRequestUrl == null || universalRequestUrl.length() == 0)) {
                SessionRepository sessionRepository2 = this.sessionRepository;
                String universalRequestUrl2 = initializationResponse.getUniversalRequestUrl();
                tn.p.j(universalRequestUrl2, "response.universalRequestUrl");
                sessionRepository2.setGatewayUrl(universalRequestUrl2);
            }
        }
        List<AdFormatOuterClass.AdFormat> scarEligibleFormats = this.sessionRepository.getScarEligibleFormats();
        List<AdFormatOuterClass.AdFormat> scarEligibleFormatsList = initializationResponse.getScarEligibleFormatsList();
        tn.p.j(scarEligibleFormatsList, "response.scarEligibleFormatsList");
        scarEligibleFormats.addAll(scarEligibleFormatsList);
        if (initializationResponse.getTriggerInitializationCompletedRequest()) {
            i.d(this.sdkScope, null, null, new AnonymousClass3(null), 3, null);
        }
        if (initializationResponse.getNativeConfiguration().getEnableIapEvent()) {
            this.transactionEventManager.invoke();
        }
        if (initializationResponse.getNativeConfiguration().hasDebugSettings()) {
            HandleDebugSettings handleDebugSettings = this.handleDebugSettings;
            NativeConfigurationOuterClass.DebugSettings debugSettings = initializationResponse.getNativeConfiguration().getDebugSettings();
            tn.p.j(debugSettings, "response.nativeConfiguration.debugSettings");
            handleDebugSettings.invoke(debugSettings);
        }
        return r.f5635a;
    }
}
