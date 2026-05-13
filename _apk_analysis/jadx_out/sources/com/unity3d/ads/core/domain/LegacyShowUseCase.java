package com.unity3d.ads.core.domain;

import bn.h;
import bn.r;
import cn.p0;
import com.google.protobuf.ByteString;
import com.ironsource.C4157n2;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.adplayer.model.ShowStatus;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.model.ShowEvent;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.core.extensions.ShowStatusExtensionsKt;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gatewayprotocol.v1.OperativeEventErrorDataKt;
import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import go.e;
import go.l;
import go.v;
import hn.c;
import java.util.Map;
import java.util.UUID;
import jn.d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import sn.p;
import sn.q;
import sn.t;
import tn.i;

/* JADX INFO: compiled from: LegacyShowUseCase.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class LegacyShowUseCase {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String KEY_OBJECT_ID = "objectId";

    @NotNull
    public static final String MESSAGE_AD_OBJECT_EXPIRED = "The ad has expired";

    @NotNull
    public static final String MESSAGE_AD_PLAYER_UNAVAILABLE = "Ad player is unavailable.";

    @NotNull
    public static final String MESSAGE_ALREADY_SHOWING = "Can't show a new ad unit when ad unit is already open";

    @NotNull
    public static final String MESSAGE_NO_AD_OBJECT = "No ad object found for opportunity id: ";

    @NotNull
    public static final String MESSAGE_OPPORTUNITY_ID = "No valid opportunity id provided";

    @NotNull
    public static final String MESSAGE_OPT_TIMEOUT = "timeout";

    @NotNull
    public static final String MESSAGE_PLACEMENT_NOT_LOADED = "Placement %s must be Loaded before calling Show";

    @NotNull
    public static final String MESSAGE_TIMEOUT = "[UnityAds] Timeout while trying to show ";

    @NotNull
    public static final String MSG_OPPORTUNITY_AND_PLACEMENT_NOT_MATCHING = "[UnityAds] Object ID and Placement ID provided does not match previously loaded ad";
    private static volatile boolean isFullscreenAdShowing;

    @Nullable
    private AdObject adObject;

    @NotNull
    private final AdRepository adRepository;

    @NotNull
    private final GetInitializationState getInitializationState;

    @NotNull
    private final GetOperativeEventApi getOperativeEventApi;

    @NotNull
    private final l<Boolean> hasStarted;

    @NotNull
    private final Logger logger;

    @Nullable
    private String placement;

    @NotNull
    private final SafeCallbackInvoke safeCallbackInvoke;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    @NotNull
    private final SessionRepository sessionRepository;

    @NotNull
    private final Show show;

    @NotNull
    private final l<Boolean> timeoutCancellationRequested;

    @Nullable
    private UnityAdsShowOptions unityAdsShowOptions;

    /* JADX INFO: compiled from: LegacyShowUseCase.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LegacyShowUseCase.kt */
    @d(c = "com.unity3d.ads.core.domain.LegacyShowUseCase", f = "LegacyShowUseCase.kt", l = {116, 121, 127, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, 140, 145, 151, 158, 163, 195}, m = "invoke")
    public static final class C44771 extends ContinuationImpl {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C44771(c<? super C44771> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LegacyShowUseCase.this.invoke(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$2, reason: invalid class name */
    /* JADX INFO: compiled from: LegacyShowUseCase.kt */
    @d(c = "com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$2", f = "LegacyShowUseCase.kt", l = {177, 183, 184}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements p<sn.a<? extends r>, c<? super r>, Object> {
        public final /* synthetic */ AdObject $adObject;
        public final /* synthetic */ boolean $isBanner;
        public final /* synthetic */ String $placement;
        public final /* synthetic */ t<String, UnityAds.UnityAdsShowError, String, Integer, String, c<? super r>, Object> $reportShowError;
        public final /* synthetic */ boolean $useTimeout;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(boolean z10, AdObject adObject, boolean z11, t<? super String, ? super UnityAds.UnityAdsShowError, ? super String, ? super Integer, ? super String, ? super c<? super r>, ? extends Object> tVar, String str, c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$isBanner = z10;
            this.$adObject = adObject;
            this.$useTimeout = z11;
            this.$reportShowError = tVar;
            this.$placement = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            AnonymousClass2 anonymousClass2 = LegacyShowUseCase.this.new AnonymousClass2(this.$isBanner, this.$adObject, this.$useTimeout, this.$reportShowError, this.$placement, cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo2invoke(sn.a<? extends r> aVar, c<? super r> cVar) {
            return invoke2((sn.a<r>) aVar, cVar);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull sn.a<r> aVar, @Nullable c<? super r> cVar) {
            return ((AnonymousClass2) create(aVar, cVar)).invokeSuspend(r.f5635a);
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x00b3 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00b4  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = in.a.g()
                int r1 = r10.label
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L32
                if (r1 == r4) goto L2a
                if (r1 == r3) goto L22
                if (r1 != r2) goto L1a
                java.lang.Object r0 = r10.L$0
                sn.a r0 = (sn.a) r0
                kotlin.c.b(r11)
                goto Lb5
            L1a:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L22:
                java.lang.Object r1 = r10.L$0
                sn.a r1 = (sn.a) r1
                kotlin.c.b(r11)
                goto L8d
            L2a:
                java.lang.Object r1 = r10.L$0
                sn.a r1 = (sn.a) r1
                kotlin.c.b(r11)
                goto L76
            L32:
                kotlin.c.b(r11)
                java.lang.Object r11 = r10.L$0
                r1 = r11
                sn.a r1 = (sn.a) r1
                com.unity3d.ads.core.domain.LegacyShowUseCase r11 = com.unity3d.ads.core.domain.LegacyShowUseCase.this
                go.l r11 = com.unity3d.ads.core.domain.LegacyShowUseCase.access$getHasStarted$p(r11)
                java.lang.Object r11 = r11.getValue()
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                if (r11 != 0) goto Lbb
                com.unity3d.ads.core.domain.LegacyShowUseCase r11 = com.unity3d.ads.core.domain.LegacyShowUseCase.this
                go.l r11 = com.unity3d.ads.core.domain.LegacyShowUseCase.access$getTimeoutCancellationRequested$p(r11)
                java.lang.Object r11 = r11.getValue()
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                if (r11 != 0) goto Lbb
                boolean r11 = r10.$isBanner
                if (r11 == 0) goto L63
                goto Lbb
            L63:
                com.unity3d.ads.core.domain.LegacyShowUseCase r11 = com.unity3d.ads.core.domain.LegacyShowUseCase.this
                gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorType r5 = gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType.OPERATIVE_EVENT_ERROR_TYPE_TIMEOUT
                com.unity3d.ads.core.data.model.AdObject r6 = r10.$adObject
                r10.L$0 = r1
                r10.label = r4
                java.lang.String r4 = "timeout"
                java.lang.Object r11 = com.unity3d.ads.core.domain.LegacyShowUseCase.access$sendOperativeError(r11, r5, r4, r6, r10)
                if (r11 != r0) goto L76
                return r0
            L76:
                boolean r11 = r10.$useTimeout
                if (r11 == 0) goto Lb8
                com.unity3d.ads.core.domain.LegacyShowUseCase r11 = com.unity3d.ads.core.domain.LegacyShowUseCase.this
                com.unity3d.ads.core.domain.Show r11 = com.unity3d.ads.core.domain.LegacyShowUseCase.access$getShow$p(r11)
                com.unity3d.ads.core.data.model.AdObject r4 = r10.$adObject
                r10.L$0 = r1
                r10.label = r3
                java.lang.Object r11 = r11.terminate(r4, r10)
                if (r11 != r0) goto L8d
                return r0
            L8d:
                sn.t<java.lang.String, com.unity3d.ads.UnityAds$UnityAdsShowError, java.lang.String, java.lang.Integer, java.lang.String, hn.c<? super bn.r>, java.lang.Object> r3 = r10.$reportShowError
                com.unity3d.ads.UnityAds$UnityAdsShowError r5 = com.unity3d.ads.UnityAds.UnityAdsShowError.TIMEOUT
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r4 = "[UnityAds] Timeout while trying to show "
                r11.append(r4)
                java.lang.String r4 = r10.$placement
                r11.append(r4)
                java.lang.String r6 = r11.toString()
                r7 = 0
                r8 = 0
                r10.L$0 = r1
                r10.label = r2
                java.lang.String r4 = "timeout"
                r9 = r10
                java.lang.Object r11 = r3.invoke(r4, r5, r6, r7, r8, r9)
                if (r11 != r0) goto Lb4
                return r0
            Lb4:
                r0 = r1
            Lb5:
                r0.invoke()
            Lb8:
                bn.r r11 = bn.r.f5635a
                return r11
            Lbb:
                bn.r r11 = bn.r.f5635a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.LegacyShowUseCase.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$3, reason: invalid class name */
    /* JADX INFO: compiled from: LegacyShowUseCase.kt */
    @d(c = "com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$3", f = "LegacyShowUseCase.kt", l = {190}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends SuspendLambda implements q<e<? super ShowEvent>, Throwable, c<? super r>, Object> {
        public final /* synthetic */ boolean $isBanner;
        public final /* synthetic */ t<String, UnityAds.UnityAdsShowError, String, Integer, String, c<? super r>, Object> $reportShowError;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(t<? super String, ? super UnityAds.UnityAdsShowError, ? super String, ? super Integer, ? super String, ? super c<? super r>, ? extends Object> tVar, boolean z10, c<? super AnonymousClass3> cVar) {
            super(3, cVar);
            this.$reportShowError = tVar;
            this.$isBanner = z10;
        }

        @Override // sn.q
        @Nullable
        public final Object invoke(@NotNull e<? super ShowEvent> eVar, @NotNull Throwable th2, @Nullable c<? super r> cVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$reportShowError, this.$isBanner, cVar);
            anonymousClass3.L$0 = th2;
            return anonymousClass3.invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = in.a.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                Throwable th2 = (Throwable) this.L$0;
                t<String, UnityAds.UnityAdsShowError, String, Integer, String, c<? super r>, Object> tVar = this.$reportShowError;
                UnityAds.UnityAdsShowError unityAdsShowError = UnityAds.UnityAdsShowError.INTERNAL_ERROR;
                String shortenedStackTrace$default = ExceptionExtensionsKt.getShortenedStackTrace$default(th2, 0, 1, null);
                this.label = 1;
                if (tVar.invoke("uncaught_exception", unityAdsShowError, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, shortenedStackTrace$default, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            if (!this.$isBanner) {
                LegacyShowUseCase.isFullscreenAdShowing = false;
            }
            return r.f5635a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$4, reason: invalid class name */
    /* JADX INFO: compiled from: LegacyShowUseCase.kt */
    public static final class AnonymousClass4<T> implements e {
        public final /* synthetic */ AdObject $adObject;
        public final /* synthetic */ Listeners $listeners;
        public final /* synthetic */ String $placement;
        public final /* synthetic */ t<String, UnityAds.UnityAdsShowError, String, Integer, String, c<? super r>, Object> $reportShowError;
        public final /* synthetic */ long $startTime;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(long j10, String str, Listeners listeners, AdObject adObject, t<? super String, ? super UnityAds.UnityAdsShowError, ? super String, ? super Integer, ? super String, ? super c<? super r>, ? extends Object> tVar) {
            this.$startTime = j10;
            this.$placement = str;
            this.$listeners = listeners;
            this.$adObject = adObject;
            this.$reportShowError = tVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:45:0x013e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0183 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
        /* JADX WARN: Type inference failed for: r4v0, types: [int] */
        /* JADX WARN: Type inference failed for: r4v7 */
        /* JADX WARN: Type inference failed for: r4v9 */
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(@org.jetbrains.annotations.NotNull com.unity3d.ads.core.data.model.ShowEvent r23, @org.jetbrains.annotations.NotNull hn.c<? super bn.r> r24) {
            /*
                Method dump skipped, instruction units count: 391
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.LegacyShowUseCase.AnonymousClass4.emit(com.unity3d.ads.core.data.model.ShowEvent, hn.c):java.lang.Object");
        }

        @Override // go.e
        public /* bridge */ /* synthetic */ Object emit(Object obj, c cVar) {
            return emit((ShowEvent) obj, (c<? super r>) cVar);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$showError$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LegacyShowUseCase.kt */
    @d(c = "com.unity3d.ads.core.domain.LegacyShowUseCase$showError$1", f = "LegacyShowUseCase.kt", l = {}, m = "invokeSuspend")
    public static final class C44801 extends SuspendLambda implements t<String, UnityAds.UnityAdsShowError, String, Integer, String, c<? super r>, Object> {
        public final /* synthetic */ Listeners $listeners;
        public final /* synthetic */ String $opportunityId;
        public final /* synthetic */ String $placement;
        public final /* synthetic */ co.i $startTime;
        public /* synthetic */ Object L$0;
        public /* synthetic */ Object L$1;
        public /* synthetic */ Object L$2;
        public /* synthetic */ Object L$3;
        public /* synthetic */ Object L$4;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44801(String str, co.i iVar, Listeners listeners, String str2, c<? super C44801> cVar) {
            super(6, cVar);
            this.$opportunityId = str;
            this.$startTime = iVar;
            this.$listeners = listeners;
            this.$placement = str2;
        }

        @Override // sn.t
        @Nullable
        public final Object invoke(@NotNull String str, @NotNull UnityAds.UnityAdsShowError unityAdsShowError, @NotNull String str2, @Nullable Integer num, @Nullable String str3, @Nullable c<? super r> cVar) {
            C44801 c44801 = LegacyShowUseCase.this.new C44801(this.$opportunityId, this.$startTime, this.$listeners, this.$placement, cVar);
            c44801.L$0 = str;
            c44801.L$1 = unityAdsShowError;
            c44801.L$2 = str2;
            c44801.L$3 = num;
            c44801.L$4 = str3;
            return c44801.invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            in.a.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            String str = (String) this.L$0;
            final UnityAds.UnityAdsShowError unityAdsShowError = (UnityAds.UnityAdsShowError) this.L$1;
            final String str2 = (String) this.L$2;
            Integer num = (Integer) this.L$3;
            String str3 = (String) this.L$4;
            Logger.DefaultImpls.error$default(LegacyShowUseCase.this.logger, "Failed to show ad " + LegacyShowUseCase.this.getAdInfoString() + ", error: " + str2, null, 2, null);
            AdObject tmpAdObject = LegacyShowUseCase.this.adObject;
            if (tmpAdObject == null) {
                tmpAdObject = LegacyShowUseCase.this.getTmpAdObject(this.$opportunityId);
            }
            SendDiagnosticEvent.DefaultImpls.invoke$default(LegacyShowUseCase.this.sendDiagnosticEvent, "native_show_failure_time", jn.a.b(TimeExtensionsKt.elapsedMillis(this.$startTime)), LegacyShowUseCase.this.getTags(str, num, str3), null, tmpAdObject, null, 40, null);
            SafeCallbackInvoke safeCallbackInvoke = LegacyShowUseCase.this.safeCallbackInvoke;
            final Listeners listeners = this.$listeners;
            final String str4 = this.$placement;
            safeCallbackInvoke.invoke(new sn.a<r>() { // from class: com.unity3d.ads.core.domain.LegacyShowUseCase.showError.1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // sn.a
                public /* bridge */ /* synthetic */ r invoke() {
                    invoke2();
                    return r.f5635a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    listeners.onError(str4, unityAdsShowError, str2);
                }
            });
            return r.f5635a;
        }
    }

    public LegacyShowUseCase(@NotNull Show show, @NotNull AdRepository adRepository, @NotNull SendDiagnosticEvent sendDiagnosticEvent, @NotNull GetOperativeEventApi getOperativeEventApi, @NotNull GetInitializationState getInitializationState, @NotNull SessionRepository sessionRepository, @NotNull SafeCallbackInvoke safeCallbackInvoke, @NotNull Logger logger) {
        tn.p.k(show, C4157n2.f33013v);
        tn.p.k(adRepository, "adRepository");
        tn.p.k(sendDiagnosticEvent, "sendDiagnosticEvent");
        tn.p.k(getOperativeEventApi, "getOperativeEventApi");
        tn.p.k(getInitializationState, "getInitializationState");
        tn.p.k(sessionRepository, "sessionRepository");
        tn.p.k(safeCallbackInvoke, "safeCallbackInvoke");
        tn.p.k(logger, "logger");
        this.show = show;
        this.adRepository = adRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.getOperativeEventApi = getOperativeEventApi;
        this.getInitializationState = getInitializationState;
        this.sessionRepository = sessionRepository;
        this.safeCallbackInvoke = safeCallbackInvoke;
        this.logger = logger;
        Boolean bool = Boolean.FALSE;
        this.hasStarted = v.a(bool);
        this.timeoutCancellationRequested = v.a(bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bannerLeftApplication(co.i iVar, final String str, final Listeners listeners) {
        this.logger.info("Left app while showing ad " + getAdInfoString());
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_left_app", Double.valueOf(TimeExtensionsKt.elapsedMillis(iVar)), null, null, this.adObject, null, 44, null);
        this.safeCallbackInvoke.invoke(new sn.a<r>() { // from class: com.unity3d.ads.core.domain.LegacyShowUseCase.bannerLeftApplication.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // sn.a
            public /* bridge */ /* synthetic */ r invoke() {
                invoke2();
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                listeners.onLeftApplication(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelTimeout(co.i iVar) {
        this.timeoutCancellationRequested.setValue(Boolean.TRUE);
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_cancel_timeout", Double.valueOf(TimeExtensionsKt.elapsedMillis(iVar)), null, null, this.adObject, null, 44, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getAdInfoString() {
        ByteString opportunityId;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("for placement ");
        AdObject adObject = this.adObject;
        UUID uuid = null;
        sb2.append(adObject != null ? adObject.getPlacementId() : null);
        sb2.append(" with instance id ");
        AdObject adObject2 = this.adObject;
        if (adObject2 != null && (opportunityId = adObject2.getOpportunityId()) != null) {
            uuid = ProtobufExtensionsKt.toUUID(opportunityId);
        }
        sb2.append(uuid);
        return sb2.toString();
    }

    private final String getOpportunityId(UnityAdsShowOptions unityAdsShowOptions) throws IllegalArgumentException {
        Object objOpt;
        String string;
        JSONObject data = unityAdsShowOptions.getData();
        if (data == null || (objOpt = data.opt("objectId")) == null || (string = objOpt.toString()) == null) {
            return null;
        }
        return UUID.fromString(string).toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, String> getTags(String str, Integer num, String str2) {
        Map<String, String> mapO = kotlin.collections.a.o(h.a("operation", OperationType.SHOW.toString()), h.a("reason", str));
        if (num != null) {
            mapO.put("reason_code", String.valueOf(num.intValue()));
        }
        if (str2 != null) {
            mapO.put("reason_debug", str2);
        }
        return mapO;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdObject getTmpAdObject(String str) {
        UUID uuidFromString = UUID.fromString(str);
        tn.p.j(uuidFromString, "fromString(opportunityId)");
        ByteString byteString = ProtobufExtensionsKt.toByteString(uuidFromString);
        AdObject ad2 = this.adRepository.getAd(byteString);
        if (ad2 != null) {
            return ad2;
        }
        String str2 = this.placement;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str2;
        ByteString byteString2 = ByteString.EMPTY;
        tn.p.j(byteString2, "EMPTY");
        return new AdObject(byteString, str3, byteString2, false, null, null, null, false, null, null, null, new UnityAdsLoadOptions(), false, DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_UNSPECIFIED, null, null, 50680, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object sendOperativeError(OperativeEventRequestOuterClass.OperativeEventErrorType operativeEventErrorType, String str, AdObject adObject, c<? super r> cVar) {
        OperativeEventErrorDataKt.Dsl.Companion companion = OperativeEventErrorDataKt.Dsl.Companion;
        OperativeEventRequestOuterClass.OperativeEventErrorData.Builder builderNewBuilder = OperativeEventRequestOuterClass.OperativeEventErrorData.newBuilder();
        tn.p.j(builderNewBuilder, "newBuilder()");
        OperativeEventErrorDataKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setErrorType(operativeEventErrorType);
        dsl_create.setMessage(str);
        OperativeEventRequestOuterClass.OperativeEventErrorData operativeEventErrorData_build = dsl_create._build();
        GetOperativeEventApi getOperativeEventApi = this.getOperativeEventApi;
        OperativeEventRequestOuterClass.OperativeEventType operativeEventType = OperativeEventRequestOuterClass.OperativeEventType.OPERATIVE_EVENT_TYPE_SHOW_ERROR;
        ByteString byteString = operativeEventErrorData_build.toByteString();
        tn.p.j(byteString, "errorData.toByteString()");
        Object objInvoke = getOperativeEventApi.invoke(operativeEventType, adObject, byteString, cVar);
        return objInvoke == in.a.g() ? objInvoke : r.f5635a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showClicked(co.i iVar, final String str, final Listeners listeners) {
        this.logger.info("Clicked on ad " + getAdInfoString());
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_clicked", Double.valueOf(TimeExtensionsKt.elapsedMillis(iVar)), null, null, this.adObject, null, 44, null);
        this.safeCallbackInvoke.invoke(new sn.a<r>() { // from class: com.unity3d.ads.core.domain.LegacyShowUseCase.showClicked.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // sn.a
            public /* bridge */ /* synthetic */ r invoke() {
                invoke2();
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                listeners.onClick(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showCompleted(co.i iVar, final String str, final ShowStatus showStatus, final Listeners listeners, String str2, String str3) {
        this.logger.info("Finished showing ad " + getAdInfoString());
        Map mapD = p0.d();
        if (str2 != null) {
        }
        if (str3 != null) {
            mapD.put("reason_debug", str3);
        }
        Map mapC = p0.c(mapD);
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_success_time", Double.valueOf(TimeExtensionsKt.elapsedMillis(iVar)), mapC, null, this.adObject, null, 40, null);
        this.safeCallbackInvoke.invoke(new sn.a<r>() { // from class: com.unity3d.ads.core.domain.LegacyShowUseCase.showCompleted.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // sn.a
            public /* bridge */ /* synthetic */ r invoke() {
                invoke2();
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Listeners listeners2 = listeners;
                String str4 = str;
                ShowStatus showStatus2 = showStatus;
                NativeConfigurationOuterClass.ShowCompletionState defaultShowCompletionState = this.sessionRepository.getNativeConfiguration().getDefaultShowCompletionState();
                tn.p.j(defaultShowCompletionState, "sessionRepository.native…efaultShowCompletionState");
                listeners2.onComplete(str4, ShowStatusExtensionsKt.toUnityAdsShowCompletionState(showStatus2, defaultShowCompletionState));
            }
        });
    }

    private final t<String, UnityAds.UnityAdsShowError, String, Integer, String, c<? super r>, Object> showError(co.i iVar, String str, String str2, Listeners listeners) {
        return new C44801(str2, iVar, listeners, str, null);
    }

    private final void showStart(String str) {
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_started", null, null, null, getTmpAdObject(str), null, 46, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showStarted(co.i iVar, final String str, final Listeners listeners) {
        this.logger.info("Started showing ad " + getAdInfoString());
        this.hasStarted.setValue(Boolean.TRUE);
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_wv_started", Double.valueOf(TimeExtensionsKt.elapsedMillis(iVar)), null, null, this.adObject, null, 44, null);
        this.safeCallbackInvoke.invoke(new sn.a<r>() { // from class: com.unity3d.ads.core.domain.LegacyShowUseCase.showStarted.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // sn.a
            public /* bridge */ /* synthetic */ r invoke() {
                invoke2();
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                listeners.onStart(str);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(@org.jetbrains.annotations.Nullable java.lang.String r24, @org.jetbrains.annotations.Nullable com.unity3d.ads.UnityAdsShowOptions r25, @org.jetbrains.annotations.NotNull com.unity3d.ads.core.data.model.Listeners r26, @org.jetbrains.annotations.NotNull hn.c<? super bn.r> r27) {
        /*
            Method dump skipped, instruction units count: 818
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.LegacyShowUseCase.invoke(java.lang.String, com.unity3d.ads.UnityAdsShowOptions, com.unity3d.ads.core.data.model.Listeners, hn.c):java.lang.Object");
    }
}
