package com.unity3d.ads.core.domain;

import bn.h;
import bn.r;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.adplayer.ExposedFunctionLocation;
import com.unity3d.ads.adplayer.Invocation;
import com.unity3d.ads.core.data.model.AdData;
import com.unity3d.ads.core.data.model.AdDataRefreshToken;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.ImpressionConfig;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.attribution.AndroidAttribution;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt;
import com.unity3d.ads.core.domain.offerwall.GetIsOfferwallAdReady;
import com.unity3d.ads.core.domain.offerwall.LoadOfferwallAd;
import com.unity3d.ads.core.domain.om.AndroidOmInteraction;
import com.unity3d.ads.core.domain.om.GetOmData;
import com.unity3d.ads.core.domain.om.IsOMActivated;
import com.unity3d.ads.core.domain.om.OmFinishSession;
import com.unity3d.ads.core.domain.om.OmImpressionOccurred;
import com.unity3d.ads.core.domain.scar.LoadScarAd;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.network.model.RequestType;
import go.e;
import go.f;
import hn.c;
import java.util.Map;
import jn.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import sn.p;
import tn.i;
import tn.t;

/* JADX INFO: compiled from: HandleInvocationsFromAdViewer.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class HandleInvocationsFromAdViewer implements IServiceComponent {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String KEY_ACTION = "action";

    @NotNull
    public static final String KEY_AD_DATA = "adData";

    @NotNull
    public static final String KEY_AD_DATA_REFRESH_TOKEN = "adDataRefreshToken";

    @NotNull
    public static final String KEY_AD_STRING = "adString";

    @NotNull
    public static final String KEY_AD_TYPE = "type";

    @NotNull
    public static final String KEY_AD_UNIT_ID = "adUnitId";

    @NotNull
    public static final String KEY_DOWNLOAD_PRIORITY = "priority";

    @NotNull
    public static final String KEY_DOWNLOAD_URL = "url";

    @NotNull
    public static final String KEY_EXTRAS = "extras";

    @NotNull
    public static final String KEY_IMPRESSION_CONFIG = "impressionConfig";

    @NotNull
    public static final String KEY_IS_HEADER_BIDDING = "isHeaderBidding";

    @NotNull
    public static final String KEY_LOAD_OPTIONS = "loadOptions";

    @NotNull
    public static final String KEY_NATIVE_CONTEXT = "nativeContext";

    @NotNull
    public static final String KEY_OMID = "openMeasurement";

    @NotNull
    public static final String KEY_OMJS_SERVICE = "serviceFilePath";

    @NotNull
    public static final String KEY_OMJS_SESSION = "sessionFilePath";

    @NotNull
    public static final String KEY_OM_PARTNER = "partnerName";

    @NotNull
    public static final String KEY_OM_PARTNER_VERSION = "partnerVersion";

    @NotNull
    public static final String KEY_OM_VERSION = "version";

    @NotNull
    public static final String KEY_PACKAGE_NAME = "packageName";

    @NotNull
    public static final String KEY_PLACEMENT_ID = "placementId";

    @NotNull
    public static final String KEY_PLACEMENT_NAME = "placementName";

    @NotNull
    public static final String KEY_PRIVACY_UPDATE_CONTENT = "content";

    @NotNull
    public static final String KEY_PRIVACY_UPDATE_VERSION = "version";

    @NotNull
    public static final String KEY_QUERY_ID = "queryId";

    @NotNull
    public static final String KEY_TRACKING_TOKEN = "trackingToken";

    @NotNull
    public static final String KEY_USE_ACTIVITY_FOR_RESULT = "useActivityForResult";

    @NotNull
    public static final String KEY_VIDEO_LENGTH = "videoLength";

    /* JADX INFO: compiled from: HandleInvocationsFromAdViewer.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: HandleInvocationsFromAdViewer.kt */
    @d(c = "com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$1", f = "HandleInvocationsFromAdViewer.kt", l = {184}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<e<? super Invocation>, c<? super r>, Object> {
        public final /* synthetic */ l<c<? super r>, Object> $onSubscription;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(l<? super c<? super r>, ? extends Object> lVar, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$onSubscription = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            return new AnonymousClass1(this.$onSubscription, cVar);
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull e<? super Invocation> eVar, @Nullable c<? super r> cVar) {
            return ((AnonymousClass1) create(eVar, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = in.a.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                l<c<? super r>, Object> lVar = this.$onSubscription;
                this.label = 1;
                if (lVar.invoke(this) == objG) {
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

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$2, reason: invalid class name */
    /* JADX INFO: compiled from: HandleInvocationsFromAdViewer.kt */
    @d(c = "com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$2", f = "HandleInvocationsFromAdViewer.kt", l = {188}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements p<Invocation, c<? super r>, Object> {
        public final /* synthetic */ Map<String, sn.a<ExposedFunction>> $definition;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX INFO: renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: HandleInvocationsFromAdViewer.kt */
        @d(c = "com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$2$1", f = "HandleInvocationsFromAdViewer.kt", l = {188}, m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements l<c<? super Object>, Object> {
            public final /* synthetic */ ExposedFunction $exposedFunction;
            public final /* synthetic */ Invocation $it;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ExposedFunction exposedFunction, Invocation invocation, c<? super AnonymousClass1> cVar) {
                super(1, cVar);
                this.$exposedFunction = exposedFunction;
                this.$it = invocation;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final c<r> create(@NotNull c<?> cVar) {
                return new AnonymousClass1(this.$exposedFunction, this.$it, cVar);
            }

            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(@Nullable c<Object> cVar) {
                return ((AnonymousClass1) create(cVar)).invokeSuspend(r.f5635a);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ Object invoke(c<? super Object> cVar) {
                return invoke2((c<Object>) cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objG = in.a.g();
                int i10 = this.label;
                if (i10 == 0) {
                    kotlin.c.b(obj);
                    ExposedFunction exposedFunction = this.$exposedFunction;
                    Object[] parameters = this.$it.getParameters();
                    this.label = 1;
                    obj = exposedFunction.mo2invoke(parameters, this);
                    if (obj == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.c.b(obj);
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Map<String, ? extends sn.a<? extends ExposedFunction>> map, c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$definition = map;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$definition, cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull Invocation invocation, @Nullable c<? super r> cVar) {
            return ((AnonymousClass2) create(invocation, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ExposedFunction exposedFunctionInvoke;
            Object objG = in.a.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                Invocation invocation = (Invocation) this.L$0;
                sn.a<ExposedFunction> aVar = this.$definition.get(invocation.getLocation());
                if (aVar == null || (exposedFunctionInvoke = aVar.invoke()) == null) {
                    return r.f5635a;
                }
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(exposedFunctionInvoke, invocation, null);
                this.label = 1;
                if (invocation.handle(anonymousClass1, this) == objG) {
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

    @Override // com.unity3d.services.core.di.IServiceComponent
    @NotNull
    public IServiceProvider getServiceProvider() {
        return IServiceComponent.DefaultImpls.getServiceProvider(this);
    }

    @NotNull
    public final go.d<Invocation> invoke(@NotNull go.p<Invocation> pVar, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull final AdObject adObject, @NotNull l<? super c<? super r>, ? extends Object> lVar) {
        tn.p.k(pVar, "onInvocations");
        tn.p.k(str, "adData");
        tn.p.k(str2, KEY_AD_DATA_REFRESH_TOKEN);
        tn.p.k(str3, KEY_IMPRESSION_CONFIG);
        tn.p.k(adObject, "adObject");
        tn.p.k(lVar, "onSubscription");
        final String strM7228constructorimpl = AdData.m7228constructorimpl(str);
        final String strM7242constructorimpl = ImpressionConfig.m7242constructorimpl(str3);
        final String strM7235constructorimpl = AdDataRefreshToken.m7235constructorimpl(str2);
        return f.G(f.I(pVar, new AnonymousClass1(lVar, null)), new AnonymousClass2(kotlin.collections.a.m(h.a(ExposedFunctionLocation.GET_AD_CONTEXT, new sn.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.m7249getAdContextyLuu4LI((AndroidGetAdPlayerContext) this.this$0.getServiceProvider().getRegistry().getService("", t.b(AndroidGetAdPlayerContext.class)), strM7228constructorimpl, strM7242constructorimpl, strM7235constructorimpl, (IsOMActivated) this.this$0.getServiceProvider().getRegistry().getService("", t.b(IsOMActivated.class)), adObject);
            }
        }), h.a(ExposedFunctionLocation.GET_CONNECTION_TYPE, new sn.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.getConnectionType((DeviceInfoRepository) this.this$0.getServiceProvider().getRegistry().getService("", t.b(DeviceInfoRepository.class)));
            }
        }), h.a(ExposedFunctionLocation.GET_DEVICE_VOLUME, new sn.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.getDeviceVolume((DeviceInfoRepository) this.this$0.getServiceProvider().getRegistry().getService("", t.b(DeviceInfoRepository.class)));
            }
        }), h.a(ExposedFunctionLocation.GET_DEVICE_MAX_VOLUME, new sn.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$4
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.getDeviceMaxVolume((DeviceInfoRepository) this.this$0.getServiceProvider().getRegistry().getService("", t.b(DeviceInfoRepository.class)));
            }
        }), h.a(ExposedFunctionLocation.GET_SCREEN_HEIGHT, new sn.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$5
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.getScreenHeight((DeviceInfoRepository) this.this$0.getServiceProvider().getRegistry().getService("", t.b(DeviceInfoRepository.class)));
            }
        }), h.a(ExposedFunctionLocation.GET_SCREEN_WIDTH, new sn.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$6
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.getScreenWidth((DeviceInfoRepository) this.this$0.getServiceProvider().getRegistry().getService("", t.b(DeviceInfoRepository.class)));
            }
        }), h.a(ExposedFunctionLocation.OPEN_URL, new sn.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.openUrl(adObject, (HandleOpenUrl) this.getServiceProvider().getRegistry().getService("", t.b(HandleOpenUrl.class)));
            }
        }), h.a(ExposedFunctionLocation.SET_ORIENTATION, new sn.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$8
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.setOrientation(adObject);
            }
        }), h.a(ExposedFunctionLocation.SEND_OPERATIVE_EVENT, new sn.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$9
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.sendOperativeEvent((GetOperativeEventApi) this.this$0.getServiceProvider().getRegistry().getService("", t.b(GetOperativeEventApi.class)), adObject);
            }
        }), h.a(ExposedFunctionLocation.STORAGE_WRITE, new sn.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$10
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.writeStorage();
            }
        }), h.a(ExposedFunctionLocation.STORAGE_READ, new sn.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$11
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.readStorage();
            }
        }), h.a(ExposedFunctionLocation.STORAGE_DELETE, new sn.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$12
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.deleteStorage();
            }
        }), h.a(ExposedFunctionLocation.STORAGE_CLEAR, new sn.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$13
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.clearStorage();
            }
        }), h.a(ExposedFunctionLocation.STORAGE_GET_KEYS, new sn.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$14
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.getKeysStorage();
            }
        }), h.a(ExposedFunctionLocation.STORAGE_GET, new sn.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$15
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.getStorage();
            }
        }), h.a(ExposedFunctionLocation.STORAGE_SET, new sn.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$16
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.setStorage();
            }
        }), h.a(ExposedFunctionLocation.GET_PRIVACY_FSM, new sn.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$17
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.getPrivacyFsm((SessionRepository) this.this$0.getServiceProvider().getRegistry().getService("", t.b(SessionRepository.class)));
            }
        }), h.a(ExposedFunctionLocation.SET_PRIVACY_FSM, new sn.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$18
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.setPrivacyFsm((SessionRepository) this.this$0.getServiceProvider().getRegistry().getService("", t.b(SessionRepository.class)));
            }
        }), h.a(ExposedFunctionLocation.GET_PRIVACY, new sn.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$19
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.getPrivacy((SessionRepository) this.this$0.getServiceProvider().getRegistry().getService("", t.b(SessionRepository.class)));
            }
        }), h.a(ExposedFunctionLocation.SET_PRIVACY, new sn.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$20
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.setPrivacy((SessionRepository) this.this$0.getServiceProvider().getRegistry().getService("", t.b(SessionRepository.class)));
            }
        }), h.a(ExposedFunctionLocation.GET_ALLOWED_PII, new sn.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$21
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.getAllowedPii((DeviceInfoRepository) this.this$0.getServiceProvider().getRegistry().getService("", t.b(DeviceInfoRepository.class)));
            }
        }), h.a(ExposedFunctionLocation.SET_ALLOWED_PII, new sn.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$22
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.setAllowedPii((DeviceInfoRepository) this.this$0.getServiceProvider().getRegistry().getService("", t.b(DeviceInfoRepository.class)));
            }
        }), h.a(ExposedFunctionLocation.GET_SESSION_TOKEN, new sn.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$23
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.getSessionToken((SessionRepository) this.this$0.getServiceProvider().getRegistry().getService("", t.b(SessionRepository.class)));
            }
        }), h.a(ExposedFunctionLocation.MARK_CAMPAIGN_STATE_SHOWN, new sn.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$24
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.markCampaignStateShown((CampaignRepository) this.this$0.getServiceProvider().getRegistry().getService("", t.b(CampaignRepository.class)), adObject);
            }
        }), h.a(ExposedFunctionLocation.REFRESH_AD_DATA, new sn.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$25
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.refreshAdData((Refresh) this.this$0.getServiceProvider().getRegistry().getService("", t.b(Refresh.class)), adObject);
            }
        }), h.a(ExposedFunctionLocation.UPDATE_CAMPAIGN_STATE, new sn.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$26
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.updateCampaignState((CampaignRepository) this.this$0.getServiceProvider().getRegistry().getService("", t.b(CampaignRepository.class)), adObject);
            }
        }), h.a(ExposedFunctionLocation.UPDATE_TRACKING_TOKEN, new sn.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$27
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.updateTrackingToken(adObject);
            }
        }), h.a(ExposedFunctionLocation.SEND_PRIVACY_UPDATE_REQUEST, new sn.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$28
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.sendPrivacyUpdateRequest((SendPrivacyUpdateRequest) this.this$0.getServiceProvider().getRegistry().getService("", t.b(SendPrivacyUpdateRequest.class)));
            }
        }), h.a(ExposedFunctionLocation.SEND_DIAGNOSTIC_EVENT, new sn.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$29
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.sendDiagnosticEvent((SendDiagnosticEvent) this.this$0.getServiceProvider().getRegistry().getService("", t.b(SendDiagnosticEvent.class)), adObject);
            }
        }), h.a(ExposedFunctionLocation.INCREMENT_BANNER_IMPRESSION_COUNT, new sn.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$30
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.incrementBannerImpressionCount((SessionRepository) this.this$0.getServiceProvider().getRegistry().getService("", t.b(SessionRepository.class)));
            }
        }), h.a(ExposedFunctionLocation.DOWNLOAD, new sn.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$31
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.download((CacheFile) this.this$0.getServiceProvider().getRegistry().getService("", t.b(CacheFile.class)), adObject);
            }
        }), h.a(ExposedFunctionLocation.IS_FILE_CACHED, new sn.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$32
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.isFileCached((GetIsFileCache) this.this$0.getServiceProvider().getRegistry().getService("", t.b(GetIsFileCache.class)));
            }
        }), h.a(ExposedFunctionLocation.OM_START_SESSION, new sn.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$33
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.omStartSession((AndroidOmInteraction) this.this$0.getServiceProvider().getRegistry().getService("", t.b(AndroidOmInteraction.class)), adObject);
            }
        }), h.a(ExposedFunctionLocation.OM_FINISH_SESSION, new sn.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$34
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.omFinishSession((OmFinishSession) this.this$0.getServiceProvider().getRegistry().getService("", t.b(OmFinishSession.class)), adObject);
            }
        }), h.a(ExposedFunctionLocation.OM_IMPRESSION, new sn.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$35
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.omImpression((OmImpressionOccurred) this.this$0.getServiceProvider().getRegistry().getService("", t.b(OmImpressionOccurred.class)), adObject);
            }
        }), h.a(ExposedFunctionLocation.OM_GET_DATA, new sn.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$36
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.omGetData((GetOmData) this.this$0.getServiceProvider().getRegistry().getService("", t.b(GetOmData.class)));
            }
        }), h.a(ExposedFunctionLocation.IS_ATTRIBUTION_AVAILABLE, new sn.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$37
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.isAttributionAvailable((AndroidAttribution) this.this$0.getServiceProvider().getRegistry().getService("", t.b(AndroidAttribution.class)));
            }
        }), h.a(ExposedFunctionLocation.ATTRIBUTION_REGISTER_VIEW, new sn.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$38
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.attributionRegisterView((AndroidAttribution) this.this$0.getServiceProvider().getRegistry().getService("", t.b(AndroidAttribution.class)), adObject);
            }
        }), h.a(ExposedFunctionLocation.ATTRIBUTION_REGISTER_CLICK, new sn.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$39
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.attributionRegisterClick((AndroidAttribution) this.this$0.getServiceProvider().getRegistry().getService("", t.b(AndroidAttribution.class)), adObject);
            }
        }), h.a(ExposedFunctionLocation.LOAD_SCAR_AD, new sn.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$40
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.loadScarAd((LoadScarAd) this.this$0.getServiceProvider().getRegistry().getService("", t.b(LoadScarAd.class)), adObject);
            }
        }), h.a(ExposedFunctionLocation.SHOW_SCAR_AD, new sn.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$41
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.showScarAd();
            }
        }), h.a(ExposedFunctionLocation.HEADER_BIDDING_TOKEN_INCREMENT_WINS, new sn.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$42
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.hbTokenIncrementWins((SessionRepository) this.this$0.getServiceProvider().getRegistry().getService("", t.b(SessionRepository.class)));
            }
        }), h.a(ExposedFunctionLocation.HEADER_BIDDING_TOKEN_INCREMENT_STARTS, new sn.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$43
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.hbTokenIncrementStarts((SessionRepository) this.this$0.getServiceProvider().getRegistry().getService("", t.b(SessionRepository.class)));
            }
        }), h.a(ExposedFunctionLocation.HEADER_BIDDING_TOKEN_RESET, new sn.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$44
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.hbTokenReset((SessionRepository) this.this$0.getServiceProvider().getRegistry().getService("", t.b(SessionRepository.class)));
            }
        }), h.a(ExposedFunctionLocation.LOAD_OFFERWALL_AD, new sn.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$45
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.loadOfferwallAd((LoadOfferwallAd) this.this$0.getServiceProvider().getRegistry().getService("", t.b(LoadOfferwallAd.class)), adObject);
            }
        }), h.a(ExposedFunctionLocation.SHOW_OFFERWALL_AD, new sn.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$46
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.showOfferwallAd();
            }
        }), h.a(ExposedFunctionLocation.IS_OFFERWALL_AD_READY, new sn.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$47
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.isOfferwallAdReady((GetIsOfferwallAdReady) this.this$0.getServiceProvider().getRegistry().getService("", t.b(GetIsOfferwallAdReady.class)));
            }
        }), h.a(ExposedFunctionLocation.REQUEST_GET, new sn.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$48
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.request(RequestType.GET, (ExecuteAdViewerRequest) this.this$0.getServiceProvider().getRegistry().getService("", t.b(ExecuteAdViewerRequest.class)));
            }
        }), h.a(ExposedFunctionLocation.REQUEST_POST, new sn.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$49
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.request(RequestType.POST, (ExecuteAdViewerRequest) this.this$0.getServiceProvider().getRegistry().getService("", t.b(ExecuteAdViewerRequest.class)));
            }
        }), h.a(ExposedFunctionLocation.REQUEST_HEAD, new sn.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$50
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.request(RequestType.HEAD, (ExecuteAdViewerRequest) this.this$0.getServiceProvider().getRegistry().getService("", t.b(ExecuteAdViewerRequest.class)));
            }
        }), h.a(ExposedFunctionLocation.SET_OPPORTUNITY_TTL, new sn.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$51
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.setOpportunityTTL(adObject);
            }
        })), null));
    }
}
