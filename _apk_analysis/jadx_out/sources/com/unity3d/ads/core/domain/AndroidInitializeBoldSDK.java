package com.unity3d.ads.core.domain;

import bn.h;
import bn.r;
import cn.p0;
import co.j;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.core.data.manager.SDKPropertiesManager;
import com.unity3d.ads.core.data.manager.StorageManager;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import com.unity3d.ads.core.data.model.exception.InitializationException;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.events.EventObservers;
import com.unity3d.ads.core.domain.om.InitializeOMSDK;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.configuration.ConfigurationReader;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import hn.c;
import java.util.Map;
import jn.d;
import kotlin.KotlinVersion;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.g;
import p000do.h0;
import p000do.l0;
import sn.p;
import tn.i;

/* JADX INFO: compiled from: AndroidInitializeBoldSDK.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AndroidInitializeBoldSDK implements InitializeBoldSDK {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String MSG_GATEWAY_DENIED = "Gateway communication failure";

    @NotNull
    public static final String MSG_NETWORK = "Network";

    @NotNull
    public static final String MSG_TIMEOUT = "Timeout";

    @NotNull
    public static final String MSG_UNKNOWN = "Initialization failure";

    @NotNull
    private final CleanAssets cleanAssets;

    @NotNull
    private final h0 defaultDispatcher;

    @NotNull
    private final DiagnosticEventRepository diagnosticEventRepository;

    @NotNull
    private final EventObservers eventObservers;

    @NotNull
    private final GatewayClient gatewayClient;

    @NotNull
    private final GetGameId getGameId;

    @NotNull
    private final GetInitializationRequest getInitializeRequest;

    @NotNull
    private final GetRequestPolicy getRequestPolicy;

    @NotNull
    private final AndroidHandleFocusCounters handleFocusCounters;

    @NotNull
    private final HandleGatewayInitializationResponse handleGatewayInitializationResponse;

    @NotNull
    private final InitializeOMSDK initializeOM;

    @NotNull
    private final ConfigurationReader legacyConfigurationReader;

    @NotNull
    private final Logger logger;

    @NotNull
    private final SDKPropertiesManager sdkPropertiesManager;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    @NotNull
    private final SessionRepository sessionRepository;

    @NotNull
    private final StorageManager storageManager;

    @NotNull
    private final TriggerInitializeListener triggerInitializeListener;

    /* JADX INFO: compiled from: AndroidInitializeBoldSDK.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$initializationSuccess$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidInitializeBoldSDK.kt */
    @d(c = "com.unity3d.ads.core.domain.AndroidInitializeBoldSDK", f = "AndroidInitializeBoldSDK.kt", l = {135, 136, 139}, m = "initializationSuccess")
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
            return AndroidInitializeBoldSDK.this.initializationSuccess(null, null, false, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidInitializeBoldSDK.kt */
    @d(c = "com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2", f = "AndroidInitializeBoldSDK.kt", l = {68, 85}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements p<l0, c<? super r>, Object> {
        public final /* synthetic */ String $source;
        public int I$0;
        public long J$0;
        public int label;

        /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: AndroidInitializeBoldSDK.kt */
        @d(c = "com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2$1", f = "AndroidInitializeBoldSDK.kt", l = {69, 71, 73, 74}, m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements p<l0, c<? super r>, Object> {
            public final /* synthetic */ boolean $isRetry;
            public final /* synthetic */ String $source;
            public int label;
            public final /* synthetic */ AndroidInitializeBoldSDK this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AndroidInitializeBoldSDK androidInitializeBoldSDK, String str, boolean z10, c<? super AnonymousClass1> cVar) {
                super(2, cVar);
                this.this$0 = androidInitializeBoldSDK;
                this.$source = str;
                this.$isRetry = z10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
                return new AnonymousClass1(this.this$0, this.$source, this.$isRetry, cVar);
            }

            @Override // sn.p
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final Object mo2invoke(@NotNull l0 l0Var, @Nullable c<? super r> cVar) {
                return ((AnonymousClass1) create(l0Var, cVar)).invokeSuspend(r.f5635a);
            }

            /* JADX WARN: Removed duplicated region for block: B:22:0x0073 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:25:0x0080 A[RETURN] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r13) throws com.unity3d.ads.core.data.model.exception.InitializationException {
                /*
                    r12 = this;
                    java.lang.Object r0 = in.a.g()
                    int r1 = r12.label
                    r2 = 4
                    r3 = 3
                    r4 = 2
                    r5 = 1
                    if (r1 == 0) goto L2c
                    if (r1 == r5) goto L28
                    if (r1 == r4) goto L24
                    if (r1 == r3) goto L20
                    if (r1 != r2) goto L18
                    kotlin.c.b(r13)
                    goto L81
                L18:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r0)
                    throw r13
                L20:
                    kotlin.c.b(r13)
                    goto L74
                L24:
                    kotlin.c.b(r13)
                    goto L52
                L28:
                    kotlin.c.b(r13)
                    goto L3e
                L2c:
                    kotlin.c.b(r13)
                    com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r13 = r12.this$0
                    java.lang.String r1 = r12.$source
                    boolean r6 = r12.$isRetry
                    r12.label = r5
                    java.lang.Object r13 = com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$initializationStart(r13, r1, r6, r12)
                    if (r13 != r0) goto L3e
                    return r0
                L3e:
                    com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r13 = r12.this$0
                    com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$checkCanInitialize(r13)
                    com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r13 = r12.this$0
                    com.unity3d.ads.core.domain.GetInitializationRequest r13 = com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$getGetInitializeRequest$p(r13)
                    r12.label = r4
                    java.lang.Object r13 = r13.invoke(r12)
                    if (r13 != r0) goto L52
                    return r0
                L52:
                    r6 = r13
                    gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest r6 = (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) r6
                    com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r13 = r12.this$0
                    com.unity3d.ads.core.domain.GetRequestPolicy r13 = com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$getGetRequestPolicy$p(r13)
                    com.unity3d.ads.gatewayclient.RequestPolicy r7 = r13.invoke()
                    com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r13 = r12.this$0
                    com.unity3d.ads.gatewayclient.GatewayClient r4 = com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$getGatewayClient$p(r13)
                    r5 = 0
                    com.unity3d.ads.core.data.model.OperationType r8 = com.unity3d.ads.core.data.model.OperationType.INITIALIZATION
                    r10 = 1
                    r11 = 0
                    r12.label = r3
                    r9 = r12
                    java.lang.Object r13 = com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(r4, r5, r6, r7, r8, r9, r10, r11)
                    if (r13 != r0) goto L74
                    return r0
                L74:
                    gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponse r13 = (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) r13
                    com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r1 = r12.this$0
                    r12.label = r2
                    java.lang.Object r13 = com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$handleResponse(r1, r13, r12)
                    if (r13 != r0) goto L81
                    return r0
                L81:
                    bn.r r13 = bn.r.f5635a
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.AnonymousClass2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$source = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            return AndroidInitializeBoldSDK.this.new AnonymousClass2(this.$source, cVar);
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull l0 l0Var, @Nullable c<? super r> cVar) {
            return ((AnonymousClass2) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        /* JADX WARN: Type inference failed for: r5v4, types: [co.i, co.j$a, long] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            long jB;
            ?? B;
            Object objG = in.a.g();
            int i10 = this.label;
            try {
                if (i10 == 0) {
                    kotlin.c.b(obj);
                    jB = j.f6782a.b();
                    i10 = !AndroidInitializeBoldSDK.this.sessionRepository.isFirstInitAttempt() ? 1 : 0;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(AndroidInitializeBoldSDK.this, this.$source, i10 != 0, null);
                    this.J$0 = jB;
                    this.I$0 = i10;
                    this.label = 1;
                    if (TimeoutKt.c(UnityAdsConstants.Timeout.INIT_TIMEOUT_MS, anonymousClass1, this) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.c.b(obj);
                        return r.f5635a;
                    }
                    i10 = this.I$0;
                    jB = this.J$0;
                    kotlin.c.b(obj);
                }
                AndroidInitializeBoldSDK androidInitializeBoldSDK = AndroidInitializeBoldSDK.this;
                B = j.a.b(jB);
                String str = this.$source;
                boolean z10 = i10 != 0;
                this.label = 2;
                if (androidInitializeBoldSDK.initializationSuccess(B, str, z10, this) == objG) {
                    return objG;
                }
                return r.f5635a;
            } catch (Exception e10) {
                InitializationException from = InitializationException.Companion.parseFrom(e10);
                if (e10 instanceof GatewayException) {
                    AndroidInitializeBoldSDK.this.sessionRepository.setShouldInitialize(false);
                }
                AndroidInitializeBoldSDK.this.initializationFailure(j.a.b(B), from, this.$source, i10 != 0);
                return r.f5635a;
            }
        }
    }

    public AndroidInitializeBoldSDK(@NotNull h0 h0Var, @NotNull InitializeOMSDK initializeOMSDK, @NotNull GetInitializationRequest getInitializationRequest, @NotNull GetRequestPolicy getRequestPolicy, @NotNull CleanAssets cleanAssets, @NotNull HandleGatewayInitializationResponse handleGatewayInitializationResponse, @NotNull GatewayClient gatewayClient, @NotNull SessionRepository sessionRepository, @NotNull EventObservers eventObservers, @NotNull TriggerInitializeListener triggerInitializeListener, @NotNull SendDiagnosticEvent sendDiagnosticEvent, @NotNull DiagnosticEventRepository diagnosticEventRepository, @NotNull StorageManager storageManager, @NotNull ConfigurationReader configurationReader, @NotNull SDKPropertiesManager sDKPropertiesManager, @NotNull GetGameId getGameId, @NotNull Logger logger, @NotNull AndroidHandleFocusCounters androidHandleFocusCounters) {
        tn.p.k(h0Var, "defaultDispatcher");
        tn.p.k(initializeOMSDK, "initializeOM");
        tn.p.k(getInitializationRequest, "getInitializeRequest");
        tn.p.k(getRequestPolicy, "getRequestPolicy");
        tn.p.k(cleanAssets, "cleanAssets");
        tn.p.k(handleGatewayInitializationResponse, "handleGatewayInitializationResponse");
        tn.p.k(gatewayClient, "gatewayClient");
        tn.p.k(sessionRepository, "sessionRepository");
        tn.p.k(eventObservers, "eventObservers");
        tn.p.k(triggerInitializeListener, "triggerInitializeListener");
        tn.p.k(sendDiagnosticEvent, "sendDiagnosticEvent");
        tn.p.k(diagnosticEventRepository, "diagnosticEventRepository");
        tn.p.k(storageManager, "storageManager");
        tn.p.k(configurationReader, "legacyConfigurationReader");
        tn.p.k(sDKPropertiesManager, "sdkPropertiesManager");
        tn.p.k(getGameId, "getGameId");
        tn.p.k(logger, "logger");
        tn.p.k(androidHandleFocusCounters, "handleFocusCounters");
        this.defaultDispatcher = h0Var;
        this.initializeOM = initializeOMSDK;
        this.getInitializeRequest = getInitializationRequest;
        this.getRequestPolicy = getRequestPolicy;
        this.cleanAssets = cleanAssets;
        this.handleGatewayInitializationResponse = handleGatewayInitializationResponse;
        this.gatewayClient = gatewayClient;
        this.sessionRepository = sessionRepository;
        this.eventObservers = eventObservers;
        this.triggerInitializeListener = triggerInitializeListener;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.diagnosticEventRepository = diagnosticEventRepository;
        this.storageManager = storageManager;
        this.legacyConfigurationReader = configurationReader;
        this.sdkPropertiesManager = sDKPropertiesManager;
        this.getGameId = getGameId;
        this.logger = logger;
        this.handleFocusCounters = androidHandleFocusCounters;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkCanInitialize() throws InitializationException {
        if (!this.sessionRepository.getShouldInitialize()) {
            throw new InitializationException(MSG_GATEWAY_DENIED, null, "gateway", "!sessionRepository.shouldInitialize", 2, null);
        }
        if (this.getGameId.invoke() == null) {
            throw new InitializationException("gameId is null.", null, "invalid_game_id", "null", 2, null);
        }
    }

    private final String getInitLog() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Initializing SDK 4.16.5 41605 with game id ");
        sb2.append(this.getGameId.invoke());
        sb2.append(" in ");
        sb2.append(this.sessionRepository.isTestModeEnabled() ? "test" : "production");
        sb2.append(" mode, session ");
        sb2.append(ProtobufExtensionsKt.toUUID(this.sessionRepository.getSessionId()));
        return sb2.toString();
    }

    private final Map<String, String> getTags(InitializationException initializationException, String str, boolean z10) {
        Map mapD = p0.d();
        mapD.put("operation", OperationType.INITIALIZATION.toString());
        mapD.put("reason", initializationException.getReason());
        mapD.put("source", str);
        mapD.put("is_retry", String.valueOf(z10));
        if (initializationException.getReasonDebug() != null) {
            mapD.put("reason_debug", initializationException.getReasonDebug());
        }
        return p0.c(mapD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleResponse(UniversalResponseOuterClass.UniversalResponse universalResponse, c<? super r> cVar) throws InitializationException {
        if (universalResponse.hasError()) {
            this.sessionRepository.setShouldInitialize(false);
            throw new InitializationException(MSG_GATEWAY_DENIED, null, "gateway", universalResponse.getError().getErrorText(), 2, null);
        }
        if (!universalResponse.hasPayload()) {
            throw new InitializationException(MSG_GATEWAY_DENIED, null, "gateway", "No payload", 2, null);
        }
        if (!universalResponse.getPayload().hasInitializationResponse()) {
            throw new InitializationException(MSG_GATEWAY_DENIED, null, "gateway", "No initialization response", 2, null);
        }
        HandleGatewayInitializationResponse handleGatewayInitializationResponse = this.handleGatewayInitializationResponse;
        InitializationResponseOuterClass.InitializationResponse initializationResponse = universalResponse.getPayload().getInitializationResponse();
        tn.p.j(initializationResponse, "response.payload.initializationResponse");
        Object objInvoke = handleGatewayInitializationResponse.invoke(initializationResponse, cVar);
        return objInvoke == in.a.g() ? objInvoke : r.f5635a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initializationFailure(co.i iVar, InitializationException initializationException, String str, boolean z10) {
        this.logger.error("Initialization failed: " + initializationException.getMessage(), initializationException);
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_initialize_task_failure_time", Double.valueOf(TimeExtensionsKt.elapsedMillis(iVar)), getTags(initializationException, str, z10), null, null, null, 56, null);
        this.sessionRepository.setInitializationState(InitializationState.FAILED);
        this.sdkPropertiesManager.setInitialized(false);
        this.triggerInitializeListener.error(UnityAds.UnityAdsInitializationError.INTERNAL_ERROR, initializationException.getMessage());
        setupDiagnosticEvents();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object initializationStart(String str, boolean z10, c<? super r> cVar) {
        this.logger.info(getInitLog());
        this.sdkPropertiesManager.setInitializationTime();
        this.sdkPropertiesManager.setInitializationTimeSinceEpoch();
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_initialization_started", null, kotlin.collections.a.m(h.a("source", str), h.a("is_retry", String.valueOf(z10)), h.a("kotlin_version", KotlinVersion.CURRENT.toString())), null, null, null, 58, null);
        this.sessionRepository.setInitializationState(InitializationState.INITIALIZING);
        Object objInvoke = this.eventObservers.invoke(cVar);
        return objInvoke == in.a.g() ? objInvoke : r.f5635a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00be A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object initializationSuccess(co.i r18, java.lang.String r19, boolean r20, hn.c<? super bn.r> r21) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.initializationSuccess(co.i, java.lang.String, boolean, hn.c):java.lang.Object");
    }

    private final void setupDiagnosticEvents() {
        NativeConfigurationOuterClass.DiagnosticEventsConfiguration diagnosticEvents = this.sessionRepository.getNativeConfiguration().getDiagnosticEvents();
        DiagnosticEventRepository diagnosticEventRepository = this.diagnosticEventRepository;
        tn.p.j(diagnosticEvents, "config");
        diagnosticEventRepository.configure(diagnosticEvents);
    }

    @Override // com.unity3d.ads.core.domain.InitializeBoldSDK
    @Nullable
    public Object invoke(@NotNull String str, @NotNull c<? super r> cVar) {
        Object objG = g.g(this.defaultDispatcher, new AnonymousClass2(str, null), cVar);
        return objG == in.a.g() ? objG : r.f5635a;
    }
}
