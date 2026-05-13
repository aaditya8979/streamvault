package com.unity3d.ads.core.domain;

import android.content.Context;
import bn.r;
import com.google.protobuf.ByteString;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.LoadResult;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import com.unity3d.ads.core.data.model.exception.NetworkTimeoutException;
import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.gatewayclient.GatewayClient;
import gatewayprotocol.v1.AdRequestOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass;
import hn.c;
import jn.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.g;
import p000do.h0;
import p000do.l0;
import sn.p;

/* JADX INFO: compiled from: AndroidLoad.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class AndroidLoad implements Load {

    @NotNull
    private final AdRepository adRepository;

    @NotNull
    private final h0 defaultDispatcher;

    @NotNull
    private final GatewayClient gatewayClient;

    @NotNull
    private final GetAdPlayerConfigRequest getAdPlayerConfigRequest;

    @NotNull
    private final GetAdRequest getAdRequest;

    @NotNull
    private final GetRequestPolicy getRequestPolicy;

    @NotNull
    private final HandleGatewayAdResponse handleGatewayAdResponse;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    @NotNull
    private final SessionRepository sessionRepository;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidLoad$invoke$2, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidLoad.kt */
    @d(c = "com.unity3d.ads.core.domain.AndroidLoad$invoke$2", f = "AndroidLoad.kt", l = {72, 76, 93, 97, 136}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements p<l0, c<? super LoadResult>, Object> {
        public final /* synthetic */ AdRequestOuterClass.BannerSize $bannerSize;
        public final /* synthetic */ Context $context;
        public final /* synthetic */ HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup $headerBiddingAdMarkup;
        public final /* synthetic */ UnityAdsLoadOptions $loadOptions;
        public final /* synthetic */ ByteString $opportunityId;
        public final /* synthetic */ String $placement;
        public int I$0;
        public long J$0;
        private /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AdRequestOuterClass.BannerSize bannerSize, HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup, ByteString byteString, String str, UnityAdsLoadOptions unityAdsLoadOptions, Context context, c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$bannerSize = bannerSize;
            this.$headerBiddingAdMarkup = headerBiddingAdMarkup;
            this.$opportunityId = byteString;
            this.$placement = str;
            this.$loadOptions = unityAdsLoadOptions;
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            AnonymousClass2 anonymousClass2 = AndroidLoad.this.new AnonymousClass2(this.$bannerSize, this.$headerBiddingAdMarkup, this.$opportunityId, this.$placement, this.$loadOptions, this.$context, cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull l0 l0Var, @Nullable c<? super LoadResult> cVar) {
            return ((AnonymousClass2) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        /* JADX WARN: Removed duplicated region for block: B:106:0x0292 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:107:0x0293  */
        /* JADX WARN: Removed duplicated region for block: B:120:0x02e0  */
        /* JADX WARN: Removed duplicated region for block: B:121:0x02e3  */
        /* JADX WARN: Removed duplicated region for block: B:124:0x0311 A[Catch: UnityAdsNetworkException -> 0x0027, TryCatch #7 {UnityAdsNetworkException -> 0x0027, blocks: (B:9:0x0020, B:140:0x03f5, B:142:0x03fb, B:144:0x0409, B:145:0x041c, B:146:0x0423, B:149:0x0428, B:150:0x042d, B:118:0x02b6, B:122:0x02e5, B:124:0x0311, B:126:0x032f, B:128:0x0398, B:129:0x03a4, B:131:0x03b1, B:132:0x03c2, B:133:0x03c8, B:137:0x03e1, B:117:0x02ac, B:21:0x0060, B:101:0x0256, B:83:0x01af, B:87:0x01dd, B:82:0x01a5, B:29:0x009f, B:61:0x013b, B:32:0x00b0, B:34:0x00bc, B:36:0x00d4, B:41:0x00dd, B:43:0x00e2, B:47:0x00f2, B:51:0x00ff, B:53:0x0111, B:57:0x0118, B:89:0x020f, B:93:0x021c, B:95:0x0238, B:97:0x023c, B:42:0x00e0), top: B:167:0x0014 }] */
        /* JADX WARN: Removed duplicated region for block: B:126:0x032f A[Catch: UnityAdsNetworkException -> 0x0027, TryCatch #7 {UnityAdsNetworkException -> 0x0027, blocks: (B:9:0x0020, B:140:0x03f5, B:142:0x03fb, B:144:0x0409, B:145:0x041c, B:146:0x0423, B:149:0x0428, B:150:0x042d, B:118:0x02b6, B:122:0x02e5, B:124:0x0311, B:126:0x032f, B:128:0x0398, B:129:0x03a4, B:131:0x03b1, B:132:0x03c2, B:133:0x03c8, B:137:0x03e1, B:117:0x02ac, B:21:0x0060, B:101:0x0256, B:83:0x01af, B:87:0x01dd, B:82:0x01a5, B:29:0x009f, B:61:0x013b, B:32:0x00b0, B:34:0x00bc, B:36:0x00d4, B:41:0x00dd, B:43:0x00e2, B:47:0x00f2, B:51:0x00ff, B:53:0x0111, B:57:0x0118, B:89:0x020f, B:93:0x021c, B:95:0x0238, B:97:0x023c, B:42:0x00e0), top: B:167:0x0014 }] */
        /* JADX WARN: Removed duplicated region for block: B:135:0x03dd  */
        /* JADX WARN: Removed duplicated region for block: B:136:0x03e0  */
        /* JADX WARN: Removed duplicated region for block: B:139:0x03f4 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:142:0x03fb A[Catch: UnityAdsNetworkException -> 0x0027, TryCatch #7 {UnityAdsNetworkException -> 0x0027, blocks: (B:9:0x0020, B:140:0x03f5, B:142:0x03fb, B:144:0x0409, B:145:0x041c, B:146:0x0423, B:149:0x0428, B:150:0x042d, B:118:0x02b6, B:122:0x02e5, B:124:0x0311, B:126:0x032f, B:128:0x0398, B:129:0x03a4, B:131:0x03b1, B:132:0x03c2, B:133:0x03c8, B:137:0x03e1, B:117:0x02ac, B:21:0x0060, B:101:0x0256, B:83:0x01af, B:87:0x01dd, B:82:0x01a5, B:29:0x009f, B:61:0x013b, B:32:0x00b0, B:34:0x00bc, B:36:0x00d4, B:41:0x00dd, B:43:0x00e2, B:47:0x00f2, B:51:0x00ff, B:53:0x0111, B:57:0x0118, B:89:0x020f, B:93:0x021c, B:95:0x0238, B:97:0x023c, B:42:0x00e0), top: B:167:0x0014 }] */
        /* JADX WARN: Removed duplicated region for block: B:146:0x0423 A[Catch: UnityAdsNetworkException -> 0x0027, TryCatch #7 {UnityAdsNetworkException -> 0x0027, blocks: (B:9:0x0020, B:140:0x03f5, B:142:0x03fb, B:144:0x0409, B:145:0x041c, B:146:0x0423, B:149:0x0428, B:150:0x042d, B:118:0x02b6, B:122:0x02e5, B:124:0x0311, B:126:0x032f, B:128:0x0398, B:129:0x03a4, B:131:0x03b1, B:132:0x03c2, B:133:0x03c8, B:137:0x03e1, B:117:0x02ac, B:21:0x0060, B:101:0x0256, B:83:0x01af, B:87:0x01dd, B:82:0x01a5, B:29:0x009f, B:61:0x013b, B:32:0x00b0, B:34:0x00bc, B:36:0x00d4, B:41:0x00dd, B:43:0x00e2, B:47:0x00f2, B:51:0x00ff, B:53:0x0111, B:57:0x0118, B:89:0x020f, B:93:0x021c, B:95:0x0238, B:97:0x023c, B:42:0x00e0), top: B:167:0x0014 }] */
        /* JADX WARN: Removed duplicated region for block: B:68:0x017f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:69:0x0180  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x01d8  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x01db  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r34) {
            /*
                Method dump skipped, instruction units count: 1077
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidLoad.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public AndroidLoad(@NotNull h0 h0Var, @NotNull GetAdRequest getAdRequest, @NotNull GetAdPlayerConfigRequest getAdPlayerConfigRequest, @NotNull GetRequestPolicy getRequestPolicy, @NotNull HandleGatewayAdResponse handleGatewayAdResponse, @NotNull SessionRepository sessionRepository, @NotNull GatewayClient gatewayClient, @NotNull AdRepository adRepository, @NotNull SendDiagnosticEvent sendDiagnosticEvent) {
        tn.p.k(h0Var, "defaultDispatcher");
        tn.p.k(getAdRequest, "getAdRequest");
        tn.p.k(getAdPlayerConfigRequest, "getAdPlayerConfigRequest");
        tn.p.k(getRequestPolicy, "getRequestPolicy");
        tn.p.k(handleGatewayAdResponse, "handleGatewayAdResponse");
        tn.p.k(sessionRepository, "sessionRepository");
        tn.p.k(gatewayClient, "gatewayClient");
        tn.p.k(adRepository, "adRepository");
        tn.p.k(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.defaultDispatcher = h0Var;
        this.getAdRequest = getAdRequest;
        this.getAdPlayerConfigRequest = getAdPlayerConfigRequest;
        this.getRequestPolicy = getRequestPolicy;
        this.handleGatewayAdResponse = handleGatewayAdResponse;
        this.sessionRepository = sessionRepository;
        this.gatewayClient = gatewayClient;
        this.adRepository = adRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdObject getTmpAdObject(ByteString byteString, String str, boolean z10, DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType, UnityAdsLoadOptions unityAdsLoadOptions) {
        ByteString byteString2 = ByteString.EMPTY;
        tn.p.j(byteString2, "EMPTY");
        return new AdObject(byteString, str, byteString2, false, null, null, null, false, null, null, null, unityAdsLoadOptions, z10, diagnosticAdType, null, null, 50680, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LoadResult.Failure handleGatewayException(UnityAdsNetworkException unityAdsNetworkException) {
        boolean z10 = unityAdsNetworkException instanceof NetworkTimeoutException;
        return new LoadResult.Failure(z10 ? UnityAds.UnityAdsLoadError.TIMEOUT : UnityAds.UnityAdsLoadError.INTERNAL_ERROR, z10 ? LoadResult.MSG_TIMEOUT : unityAdsNetworkException instanceof GatewayException ? unityAdsNetworkException.getMessage() : "[UnityAds] Internal communication failure", unityAdsNetworkException, z10 ? "timeout" : "gateway", unityAdsNetworkException.getMessage(), false, 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void incrementLoadRequestAdmCount(boolean z10) {
        if (z10) {
            this.sessionRepository.incrementBannerLoadRequestAdmCount();
        } else {
            this.sessionRepository.incrementLoadRequestAdmCount();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void incrementLoadRequestCount(boolean z10) {
        if (z10) {
            this.sessionRepository.incrementBannerLoadRequestCount();
        } else {
            this.sessionRepository.incrementLoadRequestCount();
        }
    }

    @Override // com.unity3d.ads.core.domain.Load
    @Nullable
    public Object invoke(@NotNull Context context, @NotNull String str, @NotNull ByteString byteString, @NotNull HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup, @Nullable AdRequestOuterClass.BannerSize bannerSize, @NotNull UnityAdsLoadOptions unityAdsLoadOptions, @NotNull c<? super LoadResult> cVar) {
        return g.g(this.defaultDispatcher, new AnonymousClass2(bannerSize, headerBiddingAdMarkup, byteString, str, unityAdsLoadOptions, context, null), cVar);
    }
}
