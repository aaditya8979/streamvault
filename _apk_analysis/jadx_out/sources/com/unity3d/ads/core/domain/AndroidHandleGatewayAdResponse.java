package com.unity3d.ads.core.domain;

import bn.r;
import co.b;
import co.j;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.protobuf.ByteString;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.AdPlayerScope;
import com.unity3d.ads.adplayer.AndroidWebViewContainer;
import com.unity3d.ads.adplayer.model.LoadEvent;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import com.vungle.ads.internal.protos.Sdk;
import gatewayprotocol.v1.AdResponseOuterClass;
import gatewayprotocol.v1.AllowedPiiOuterClass;
import hn.c;
import java.util.concurrent.CancellationException;
import jn.d;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.time.DurationUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import sn.l;
import sn.p;

/* JADX INFO: compiled from: AndroidHandleGatewayAdResponse.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class AndroidHandleGatewayAdResponse implements HandleGatewayAdResponse {

    @NotNull
    private final AdPlayerScope adPlayerScope;

    @NotNull
    private final AdRepository adRepository;

    @NotNull
    private final CacheWebViewAssets cacheWebViewAssets;

    @NotNull
    private final CampaignRepository campaignRepository;

    @NotNull
    private final DeviceInfoRepository deviceInfoRepository;

    @NotNull
    private final GetAdPlayer getAdPlayer;

    @NotNull
    private final HandleInvocationsFromAdViewer getHandleInvocationsFromAdViewer;

    @NotNull
    private final GetLatestWebViewConfiguration getLatestWebViewConfiguration;

    @NotNull
    private final GetOperativeEventApi getOperativeEventApi;

    @NotNull
    private final GetWebViewBridgeUseCase getWebViewBridge;

    @NotNull
    private final AndroidGetWebViewContainerUseCase getWebViewContainerUseCase;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$cleanup$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidHandleGatewayAdResponse.kt */
    @d(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse", f = "AndroidHandleGatewayAdResponse.kt", l = {235, 241}, m = "cleanup")
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
            return AndroidHandleGatewayAdResponse.this.cleanup(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AndroidHandleGatewayAdResponse.kt */
    @d(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse", f = "AndroidHandleGatewayAdResponse.kt", l = {96, 113, 144, 187, 191, Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE}, m = "invoke")
    public static final class C44701 extends ContinuationImpl {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C44701(c<? super C44701> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidHandleGatewayAdResponse.this.invoke(null, null, null, null, null, null, false, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$2, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidHandleGatewayAdResponse.kt */
    @d(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$2", f = "AndroidHandleGatewayAdResponse.kt", l = {161}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements p<AllowedPiiOuterClass.AllowedPii, c<? super r>, Object> {
        public final /* synthetic */ Ref$ObjectRef<AdPlayer> $adPlayer;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Ref$ObjectRef<AdPlayer> ref$ObjectRef, c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$adPlayer = ref$ObjectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$adPlayer, cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull AllowedPiiOuterClass.AllowedPii allowedPii, @Nullable c<? super r> cVar) {
            return ((AnonymousClass2) create(allowedPii, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = in.a.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                AllowedPiiOuterClass.AllowedPii allowedPii = (AllowedPiiOuterClass.AllowedPii) this.L$0;
                AdPlayer adPlayer = this.$adPlayer.element;
                byte[] byteArray = allowedPii.toByteArray();
                tn.p.j(byteArray, "it.toByteArray()");
                this.label = 1;
                if (adPlayer.onAllowedPiiChange(byteArray, this) == objG) {
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

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$3, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidHandleGatewayAdResponse.kt */
    @d(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$3", f = "AndroidHandleGatewayAdResponse.kt", l = {HideBottomViewOnScrollBehavior.EXIT_ANIMATION_DURATION}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends SuspendLambda implements l<c<? super r>, Object> {
        public final /* synthetic */ AdObject $tmpAdObject;
        public final /* synthetic */ String $webViewUrl;
        public final /* synthetic */ AndroidWebViewContainer $webviewContainer;
        public long J$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(AndroidWebViewContainer androidWebViewContainer, String str, AdObject adObject, c<? super AnonymousClass3> cVar) {
            super(1, cVar);
            this.$webviewContainer = androidWebViewContainer;
            this.$webViewUrl = str;
            this.$tmpAdObject = adObject;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@NotNull c<?> cVar) {
            return AndroidHandleGatewayAdResponse.this.new AnonymousClass3(this.$webviewContainer, this.$webViewUrl, this.$tmpAdObject, cVar);
        }

        @Override // sn.l
        @Nullable
        public final Object invoke(@Nullable c<? super r> cVar) {
            return ((AnonymousClass3) create(cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            long j10;
            Object objM7534constructorimpl;
            Object objG = in.a.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                AndroidWebViewContainer androidWebViewContainer = this.$webviewContainer;
                String str = this.$webViewUrl;
                long jB = j.f6782a.b();
                try {
                    Result.a aVar = Result.Companion;
                    this.J$0 = jB;
                    this.label = 1;
                    if (androidWebViewContainer.loadUrl(str, this) == objG) {
                        return objG;
                    }
                    j10 = jB;
                } catch (Throwable th2) {
                    th = th2;
                    j10 = jB;
                    Result.a aVar2 = Result.Companion;
                    objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th));
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j10 = this.J$0;
                try {
                    kotlin.c.b(obj);
                } catch (Throwable th3) {
                    th = th3;
                    Result.a aVar22 = Result.Companion;
                    objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th));
                }
            }
            objM7534constructorimpl = Result.m7534constructorimpl(r.f5635a);
            co.l lVar = new co.l(Result.m7533boximpl(objM7534constructorimpl), j.a.e(j10), null);
            AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse = AndroidHandleGatewayAdResponse.this;
            AdObject adObject = this.$tmpAdObject;
            Object objM7542unboximpl = ((Result) lVar.a()).m7542unboximpl();
            SendDiagnosticEvent.DefaultImpls.invoke$default(androidHandleGatewayAdResponse.sendDiagnosticEvent, Result.m7540isSuccessimpl(objM7542unboximpl) ? "native_load_file_task_success_time" : "native_load_file_task_failure_time", jn.a.b(b.I(lVar.b(), DurationUnit.MILLISECONDS)), null, null, adObject, null, 44, null);
            kotlin.c.b(objM7542unboximpl);
            return r.f5635a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$4, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidHandleGatewayAdResponse.kt */
    @d(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$4", f = "AndroidHandleGatewayAdResponse.kt", l = {192}, m = "invokeSuspend")
    public static final class AnonymousClass4 extends SuspendLambda implements p<l0, c<? super r>, Object> {
        public final /* synthetic */ Ref$ObjectRef<AdPlayer> $adPlayer;
        public final /* synthetic */ LoadEvent $loadEvent;
        public final /* synthetic */ ByteString $opportunityId;
        public final /* synthetic */ AdResponseOuterClass.AdResponse $response;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(LoadEvent loadEvent, ByteString byteString, AdResponseOuterClass.AdResponse adResponse, Ref$ObjectRef<AdPlayer> ref$ObjectRef, c<? super AnonymousClass4> cVar) {
            super(2, cVar);
            this.$loadEvent = loadEvent;
            this.$opportunityId = byteString;
            this.$response = adResponse;
            this.$adPlayer = ref$ObjectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            return AndroidHandleGatewayAdResponse.this.new AnonymousClass4(this.$loadEvent, this.$opportunityId, this.$response, this.$adPlayer, cVar);
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull l0 l0Var, @Nullable c<? super r> cVar) {
            return ((AnonymousClass4) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = in.a.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse = AndroidHandleGatewayAdResponse.this;
                Error error = new Error(((LoadEvent.Error) this.$loadEvent).getMessage());
                ByteString byteString = this.$opportunityId;
                AdResponseOuterClass.AdResponse adResponse = this.$response;
                AdPlayer adPlayer = this.$adPlayer.element;
                this.label = 1;
                if (androidHandleGatewayAdResponse.cleanup(error, byteString, adResponse, adPlayer, this) == objG) {
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

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$5, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidHandleGatewayAdResponse.kt */
    @d(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$5", f = "AndroidHandleGatewayAdResponse.kt", l = {Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE}, m = "invokeSuspend")
    public static final class AnonymousClass5 extends SuspendLambda implements p<l0, c<? super r>, Object> {
        public final /* synthetic */ Ref$ObjectRef<AdPlayer> $adPlayer;
        public final /* synthetic */ ByteString $opportunityId;
        public final /* synthetic */ AdResponseOuterClass.AdResponse $response;
        public final /* synthetic */ CancellationException $t;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(CancellationException cancellationException, ByteString byteString, AdResponseOuterClass.AdResponse adResponse, Ref$ObjectRef<AdPlayer> ref$ObjectRef, c<? super AnonymousClass5> cVar) {
            super(2, cVar);
            this.$t = cancellationException;
            this.$opportunityId = byteString;
            this.$response = adResponse;
            this.$adPlayer = ref$ObjectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            return AndroidHandleGatewayAdResponse.this.new AnonymousClass5(this.$t, this.$opportunityId, this.$response, this.$adPlayer, cVar);
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull l0 l0Var, @Nullable c<? super r> cVar) {
            return ((AnonymousClass5) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = in.a.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse = AndroidHandleGatewayAdResponse.this;
                CancellationException cancellationException = this.$t;
                ByteString byteString = this.$opportunityId;
                AdResponseOuterClass.AdResponse adResponse = this.$response;
                AdPlayer adPlayer = this.$adPlayer.element;
                this.label = 1;
                if (androidHandleGatewayAdResponse.cleanup(cancellationException, byteString, adResponse, adPlayer, this) == objG) {
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

    public AndroidHandleGatewayAdResponse(@NotNull AdRepository adRepository, @NotNull AndroidGetWebViewContainerUseCase androidGetWebViewContainerUseCase, @NotNull GetWebViewBridgeUseCase getWebViewBridgeUseCase, @NotNull DeviceInfoRepository deviceInfoRepository, @NotNull HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, @NotNull CampaignRepository campaignRepository, @NotNull SendDiagnosticEvent sendDiagnosticEvent, @NotNull GetOperativeEventApi getOperativeEventApi, @NotNull GetLatestWebViewConfiguration getLatestWebViewConfiguration, @NotNull AdPlayerScope adPlayerScope, @NotNull GetAdPlayer getAdPlayer, @NotNull CacheWebViewAssets cacheWebViewAssets) {
        tn.p.k(adRepository, "adRepository");
        tn.p.k(androidGetWebViewContainerUseCase, "getWebViewContainerUseCase");
        tn.p.k(getWebViewBridgeUseCase, "getWebViewBridge");
        tn.p.k(deviceInfoRepository, "deviceInfoRepository");
        tn.p.k(handleInvocationsFromAdViewer, "getHandleInvocationsFromAdViewer");
        tn.p.k(campaignRepository, "campaignRepository");
        tn.p.k(sendDiagnosticEvent, "sendDiagnosticEvent");
        tn.p.k(getOperativeEventApi, "getOperativeEventApi");
        tn.p.k(getLatestWebViewConfiguration, "getLatestWebViewConfiguration");
        tn.p.k(adPlayerScope, "adPlayerScope");
        tn.p.k(getAdPlayer, "getAdPlayer");
        tn.p.k(cacheWebViewAssets, "cacheWebViewAssets");
        this.adRepository = adRepository;
        this.getWebViewContainerUseCase = androidGetWebViewContainerUseCase;
        this.getWebViewBridge = getWebViewBridgeUseCase;
        this.deviceInfoRepository = deviceInfoRepository;
        this.getHandleInvocationsFromAdViewer = handleInvocationsFromAdViewer;
        this.campaignRepository = campaignRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.getOperativeEventApi = getOperativeEventApi;
        this.getLatestWebViewConfiguration = getLatestWebViewConfiguration;
        this.adPlayerScope = adPlayerScope;
        this.getAdPlayer = getAdPlayer;
        this.cacheWebViewAssets = cacheWebViewAssets;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object cleanup(java.lang.Throwable r16, com.google.protobuf.ByteString r17, gatewayprotocol.v1.AdResponseOuterClass.AdResponse r18, com.unity3d.ads.adplayer.AdPlayer r19, hn.c<? super bn.r> r20) {
        /*
            r15 = this;
            r0 = r15
            r1 = r20
            boolean r2 = r1 instanceof com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.AnonymousClass1
            if (r2 == 0) goto L16
            r2 = r1
            com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$cleanup$1 r2 = (com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.AnonymousClass1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.label = r3
            goto L1b
        L16:
            com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$cleanup$1 r2 = new com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$cleanup$1
            r2.<init>(r1)
        L1b:
            java.lang.Object r1 = r2.result
            java.lang.Object r13 = in.a.g()
            int r3 = r2.label
            r14 = 2
            r4 = 1
            if (r3 == 0) goto L41
            if (r3 == r4) goto L38
            if (r3 != r14) goto L30
            kotlin.c.b(r1)
            goto Lad
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L38:
            java.lang.Object r3 = r2.L$0
            com.unity3d.ads.adplayer.AdPlayer r3 = (com.unity3d.ads.adplayer.AdPlayer) r3
            kotlin.c.b(r1)
            r1 = r3
            goto L9f
        L41:
            kotlin.c.b(r1)
            gatewayprotocol.v1.OperativeEventErrorDataKt$Dsl$Companion r1 = gatewayprotocol.v1.OperativeEventErrorDataKt.Dsl.Companion
            gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData$Builder r3 = gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.newBuilder()
            java.lang.String r5 = "newBuilder()"
            tn.p.j(r3, r5)
            gatewayprotocol.v1.OperativeEventErrorDataKt$Dsl r1 = r1._create(r3)
            gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorType r3 = gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType.OPERATIVE_EVENT_ERROR_TYPE_UNSPECIFIED
            r1.setErrorType(r3)
            java.lang.Throwable r3 = r16.getCause()
            if (r3 == 0) goto L64
            java.lang.String r3 = r3.getMessage()
            if (r3 != 0) goto L6c
        L64:
            java.lang.String r3 = r16.getMessage()
            if (r3 != 0) goto L6c
            java.lang.String r3 = ""
        L6c:
            r1.setMessage(r3)
            gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData r1 = r1._build()
            com.unity3d.ads.core.domain.events.GetOperativeEventApi r3 = r0.getOperativeEventApi
            gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventType r5 = gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType.OPERATIVE_EVENT_TYPE_LOAD_ERROR
            com.google.protobuf.ByteString r6 = r18.getTrackingToken()
            java.lang.String r7 = "response.trackingToken"
            tn.p.j(r6, r7)
            com.google.protobuf.ByteString r7 = r1.toByteString()
            java.lang.String r1 = "operativeEventErrorData.toByteString()"
            tn.p.j(r7, r1)
            r8 = 0
            r9 = 0
            r11 = 48
            r12 = 0
            r1 = r19
            r2.L$0 = r1
            r2.label = r4
            r4 = r5
            r5 = r17
            r10 = r2
            java.lang.Object r3 = com.unity3d.ads.core.domain.events.GetOperativeEventApi.invoke$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            if (r3 != r13) goto L9f
            return r13
        L9f:
            if (r1 == 0) goto Lb0
            r3 = 0
            r2.L$0 = r3
            r2.label = r14
            java.lang.Object r1 = r1.destroy(r2)
            if (r1 != r13) goto Lad
            return r13
        Lad:
            bn.r r1 = bn.r.f5635a
            return r1
        Lb0:
            bn.r r1 = bn.r.f5635a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.cleanup(java.lang.Throwable, com.google.protobuf.ByteString, gatewayprotocol.v1.AdResponseOuterClass$AdResponse, com.unity3d.ads.adplayer.AdPlayer, hn.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x047e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0489 A[Catch: CancellationException -> 0x055a, TRY_LEAVE, TryCatch #6 {CancellationException -> 0x055a, blocks: (B:114:0x0483, B:116:0x0489, B:124:0x04fd, B:126:0x052e, B:132:0x053b, B:134:0x0541, B:139:0x054f, B:140:0x0554), top: B:183:0x0483 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x04fd A[Catch: CancellationException -> 0x055a, TRY_ENTER, TryCatch #6 {CancellationException -> 0x055a, blocks: (B:114:0x0483, B:116:0x0489, B:124:0x04fd, B:126:0x052e, B:132:0x053b, B:134:0x0541, B:139:0x054f, B:140:0x0554), top: B:183:0x0483 }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x05ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:205:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0236 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0249 A[Catch: CancellationException -> 0x012a, TryCatch #15 {CancellationException -> 0x012a, blocks: (B:99:0x0319, B:68:0x023a, B:73:0x0249, B:75:0x0261, B:80:0x0279, B:82:0x0282, B:85:0x02a0, B:36:0x0123, B:60:0x01dc, B:64:0x0201), top: B:200:0x0123 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0261 A[Catch: CancellationException -> 0x012a, TryCatch #15 {CancellationException -> 0x012a, blocks: (B:99:0x0319, B:68:0x023a, B:73:0x0249, B:75:0x0261, B:80:0x0279, B:82:0x0282, B:85:0x02a0, B:36:0x0123, B:60:0x01dc, B:64:0x0201), top: B:200:0x0123 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r3v22, types: [T, com.unity3d.ads.adplayer.AdPlayer] */
    @Override // com.unity3d.ads.core.domain.HandleGatewayAdResponse
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(@org.jetbrains.annotations.NotNull com.unity3d.ads.UnityAdsLoadOptions r49, @org.jetbrains.annotations.NotNull com.google.protobuf.ByteString r50, @org.jetbrains.annotations.NotNull gatewayprotocol.v1.AdResponseOuterClass.AdResponse r51, @org.jetbrains.annotations.NotNull android.content.Context r52, @org.jetbrains.annotations.NotNull java.lang.String r53, @org.jetbrains.annotations.NotNull gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType r54, boolean r55, @org.jetbrains.annotations.NotNull hn.c<? super com.unity3d.ads.core.data.model.LoadResult> r56) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.invoke(com.unity3d.ads.UnityAdsLoadOptions, com.google.protobuf.ByteString, gatewayprotocol.v1.AdResponseOuterClass$AdResponse, android.content.Context, java.lang.String, gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticAdType, boolean, hn.c):java.lang.Object");
    }
}
