package com.unity3d.services;

import android.content.Context;
import bn.h;
import bn.r;
import cn.p0;
import co.j;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.ads.TokenConfiguration;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.ads.core.domain.GetAdObject;
import com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken;
import com.unity3d.ads.core.domain.GetGameId;
import com.unity3d.ads.core.domain.GetHeaderBiddingToken;
import com.unity3d.ads.core.domain.GetInitializationState;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.InitializeBoldSDK;
import com.unity3d.ads.core.domain.LegacyLoadUseCase;
import com.unity3d.ads.core.domain.LegacyShowUseCase;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.ShouldAllowInitialization;
import com.unity3d.ads.core.domain.TokenNumberProvider;
import com.unity3d.ads.core.domain.om.OmFinishSession;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.domain.task.InitializeSDK;
import com.vungle.ads.internal.protos.Sdk;
import hn.c;
import in.a;
import java.util.Map;
import jn.d;
import kotlin.LazyThreadSafetyMode;
import kotlin.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import p000do.w;
import sn.p;
import tn.i;
import tn.t;

/* JADX INFO: compiled from: UnityAdsSDK.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class UnityAdsSDK implements IServiceComponent {

    @Nullable
    private g initializationJob;

    @NotNull
    private final IServiceProvider serviceProvider;

    /* JADX INFO: renamed from: com.unity3d.services.UnityAdsSDK$finishOMIDSession$2, reason: invalid class name */
    /* JADX INFO: compiled from: UnityAdsSDK.kt */
    @d(c = "com.unity3d.services.UnityAdsSDK$finishOMIDSession$2", f = "UnityAdsSDK.kt", l = {231}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements p<l0, c<? super r>, Object> {
        public final /* synthetic */ bn.g<GetAdObject> $getAdObject$delegate;
        public final /* synthetic */ bn.g<OmFinishSession> $omFinishSession$delegate;
        public final /* synthetic */ l0 $omidScope;
        public final /* synthetic */ String $opportunityId;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(String str, l0 l0Var, bn.g<? extends GetAdObject> gVar, bn.g<? extends OmFinishSession> gVar2, c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$opportunityId = str;
            this.$omidScope = l0Var;
            this.$getAdObject$delegate = gVar;
            this.$omFinishSession$delegate = gVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            return new AnonymousClass2(this.$opportunityId, this.$omidScope, this.$getAdObject$delegate, this.$omFinishSession$delegate, cVar);
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull l0 l0Var, @Nullable c<? super r> cVar) {
            return ((AnonymousClass2) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = a.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                AdObject adObjectInvoke = UnityAdsSDK.finishOMIDSession$lambda$20(this.$getAdObject$delegate).invoke(this.$opportunityId);
                if (adObjectInvoke != null) {
                    OmFinishSession omFinishSessionFinishOMIDSession$lambda$21 = UnityAdsSDK.finishOMIDSession$lambda$21(this.$omFinishSession$delegate);
                    this.label = 1;
                    if (omFinishSessionFinishOMIDSession$lambda$21.invoke(adObjectInvoke, this) == objG) {
                        return objG;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            kotlinx.coroutines.d.e(this.$omidScope, null, 1, null);
            return r.f5635a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.services.UnityAdsSDK$getToken$1, reason: invalid class name */
    /* JADX INFO: compiled from: UnityAdsSDK.kt */
    @d(c = "com.unity3d.services.UnityAdsSDK$getToken$1", f = "UnityAdsSDK.kt", l = {152}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<l0, c<? super String>, Object> {
        public int label;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            return UnityAdsSDK.this.new AnonymousClass1(cVar);
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull l0 l0Var, @Nullable c<? super String> cVar) {
            return ((AnonymousClass1) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = a.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                UnityAdsSDK unityAdsSDK = UnityAdsSDK.this;
                this.label = 1;
                obj = unityAdsSDK.fetchToken("true", this);
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

    /* JADX INFO: renamed from: com.unity3d.services.UnityAdsSDK$getToken$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: UnityAdsSDK.kt */
    @d(c = "com.unity3d.services.UnityAdsSDK$getToken$2", f = "UnityAdsSDK.kt", l = {168}, m = "invokeSuspend")
    public static final class C45322 extends SuspendLambda implements p<l0, c<? super r>, Object> {
        public final /* synthetic */ bn.g<GetAsyncHeaderBiddingToken> $getAsyncHeaderBiddingToken$delegate;
        public final /* synthetic */ l0 $getTokenScope;
        public final /* synthetic */ IUnityAdsTokenListener $listener;
        public final /* synthetic */ TokenConfiguration $tokenConfiguration;
        public final /* synthetic */ bn.g<TokenNumberProvider> $tokenNumberProvider$delegate;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C45322(TokenConfiguration tokenConfiguration, IUnityAdsTokenListener iUnityAdsTokenListener, l0 l0Var, bn.g<? extends GetAsyncHeaderBiddingToken> gVar, bn.g<? extends TokenNumberProvider> gVar2, c<? super C45322> cVar) {
            super(2, cVar);
            this.$tokenConfiguration = tokenConfiguration;
            this.$listener = iUnityAdsTokenListener;
            this.$getTokenScope = l0Var;
            this.$getAsyncHeaderBiddingToken$delegate = gVar;
            this.$tokenNumberProvider$delegate = gVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            return new C45322(this.$tokenConfiguration, this.$listener, this.$getTokenScope, this.$getAsyncHeaderBiddingToken$delegate, this.$tokenNumberProvider$delegate, cVar);
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull l0 l0Var, @Nullable c<? super r> cVar) {
            return ((C45322) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = a.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                GetAsyncHeaderBiddingToken token$lambda$9 = UnityAdsSDK.getToken$lambda$9(this.$getAsyncHeaderBiddingToken$delegate);
                int iInvoke = UnityAdsSDK.getToken$lambda$8(this.$tokenNumberProvider$delegate).invoke();
                TokenConfiguration tokenConfiguration = this.$tokenConfiguration;
                IUnityAdsTokenListener iUnityAdsTokenListener = this.$listener;
                this.label = 1;
                if (token$lambda$9.invoke(iInvoke, tokenConfiguration, iUnityAdsTokenListener, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            kotlinx.coroutines.d.e(this.$getTokenScope, null, 1, null);
            return r.f5635a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.services.UnityAdsSDK$load$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: UnityAdsSDK.kt */
    @d(c = "com.unity3d.services.UnityAdsSDK$load$1", f = "UnityAdsSDK.kt", l = {Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE}, m = "invokeSuspend")
    public static final class C45331 extends SuspendLambda implements p<l0, c<? super r>, Object> {
        public final /* synthetic */ UnityBannerSize $bannerSize;
        public final /* synthetic */ bn.g<Context> $context$delegate;
        public final /* synthetic */ IUnityAdsLoadListener $listener;
        public final /* synthetic */ UnityAdsLoadOptions $loadOptions;
        public final /* synthetic */ l0 $loadScope;
        public final /* synthetic */ String $placementId;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C45331(String str, UnityAdsLoadOptions unityAdsLoadOptions, IUnityAdsLoadListener iUnityAdsLoadListener, UnityBannerSize unityBannerSize, l0 l0Var, bn.g<? extends Context> gVar, c<? super C45331> cVar) {
            super(2, cVar);
            this.$placementId = str;
            this.$loadOptions = unityAdsLoadOptions;
            this.$listener = iUnityAdsLoadListener;
            this.$bannerSize = unityBannerSize;
            this.$loadScope = l0Var;
            this.$context$delegate = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            return UnityAdsSDK.this.new C45331(this.$placementId, this.$loadOptions, this.$listener, this.$bannerSize, this.$loadScope, this.$context$delegate, cVar);
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull l0 l0Var, @Nullable c<? super r> cVar) {
            return ((C45331) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = a.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                LegacyLoadUseCase legacyLoadUseCase = (LegacyLoadUseCase) UnityAdsSDK.this.getServiceProvider().getRegistry().getService("", t.b(LegacyLoadUseCase.class));
                Context contextLoad$lambda$6 = UnityAdsSDK.load$lambda$6(this.$context$delegate);
                String str = this.$placementId;
                UnityAdsLoadOptions unityAdsLoadOptions = this.$loadOptions;
                IUnityAdsLoadListener iUnityAdsLoadListener = this.$listener;
                UnityBannerSize unityBannerSize = this.$bannerSize;
                this.label = 1;
                if (legacyLoadUseCase.invoke(contextLoad$lambda$6, str, unityAdsLoadOptions, iUnityAdsLoadListener, unityBannerSize, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            kotlinx.coroutines.d.e(this.$loadScope, null, 1, null);
            return r.f5635a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.services.UnityAdsSDK$show$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: UnityAdsSDK.kt */
    @d(c = "com.unity3d.services.UnityAdsSDK$show$1", f = "UnityAdsSDK.kt", l = {142}, m = "invokeSuspend")
    public static final class C45341 extends SuspendLambda implements p<l0, c<? super r>, Object> {
        public final /* synthetic */ Listeners $listener;
        public final /* synthetic */ String $placementId;
        public final /* synthetic */ LegacyShowUseCase $showBoldSDK;
        public final /* synthetic */ UnityAdsShowOptions $showOptions;
        public final /* synthetic */ l0 $showScope;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C45341(LegacyShowUseCase legacyShowUseCase, String str, UnityAdsShowOptions unityAdsShowOptions, Listeners listeners, l0 l0Var, c<? super C45341> cVar) {
            super(2, cVar);
            this.$showBoldSDK = legacyShowUseCase;
            this.$placementId = str;
            this.$showOptions = unityAdsShowOptions;
            this.$listener = listeners;
            this.$showScope = l0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            return new C45341(this.$showBoldSDK, this.$placementId, this.$showOptions, this.$listener, this.$showScope, cVar);
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull l0 l0Var, @Nullable c<? super r> cVar) {
            return ((C45341) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = a.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                LegacyShowUseCase legacyShowUseCase = this.$showBoldSDK;
                String str = this.$placementId;
                UnityAdsShowOptions unityAdsShowOptions = this.$showOptions;
                Listeners listeners = this.$listener;
                this.label = 1;
                if (legacyShowUseCase.invoke(str, unityAdsShowOptions, listeners, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            kotlinx.coroutines.d.e(this.$showScope, null, 1, null);
            return r.f5635a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UnityAdsSDK() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public UnityAdsSDK(@NotNull IServiceProvider iServiceProvider) {
        tn.p.k(iServiceProvider, "serviceProvider");
        this.serviceProvider = iServiceProvider;
    }

    public /* synthetic */ UnityAdsSDK(IServiceProvider iServiceProvider, int i10, i iVar) {
        this((i10 & 1) != 0 ? ServiceProvider.INSTANCE : iServiceProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fetchToken(String str, c<? super String> cVar) {
        String str2;
        String str3;
        String str4;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final String str5 = "";
        bn.g gVarA = b.a(lazyThreadSafetyMode, new sn.a<TokenNumberProvider>() { // from class: com.unity3d.services.UnityAdsSDK$fetchToken$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.TokenNumberProvider, java.lang.Object] */
            @Override // sn.a
            @NotNull
            public final TokenNumberProvider invoke() {
                IServiceComponent iServiceComponent = this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str5, t.b(TokenNumberProvider.class));
            }
        });
        bn.g gVarA2 = b.a(lazyThreadSafetyMode, new sn.a<GetHeaderBiddingToken>() { // from class: com.unity3d.services.UnityAdsSDK$fetchToken$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.GetHeaderBiddingToken, java.lang.Object] */
            @Override // sn.a
            @NotNull
            public final GetHeaderBiddingToken invoke() {
                IServiceComponent iServiceComponent = this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str5, t.b(GetHeaderBiddingToken.class));
            }
        });
        bn.g gVarA3 = b.a(lazyThreadSafetyMode, new sn.a<GetInitializationState>() { // from class: com.unity3d.services.UnityAdsSDK$fetchToken$$inlined$inject$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.GetInitializationState, java.lang.Object] */
            @Override // sn.a
            @NotNull
            public final GetInitializationState invoke() {
                IServiceComponent iServiceComponent = this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str5, t.b(GetInitializationState.class));
            }
        });
        bn.g gVarA4 = b.a(lazyThreadSafetyMode, new sn.a<SendDiagnosticEvent>() { // from class: com.unity3d.services.UnityAdsSDK$fetchToken$$inlined$inject$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.SendDiagnosticEvent, java.lang.Object] */
            @Override // sn.a
            @NotNull
            public final SendDiagnosticEvent invoke() {
                IServiceComponent iServiceComponent = this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str5, t.b(SendDiagnosticEvent.class));
            }
        });
        bn.g gVarA5 = b.a(lazyThreadSafetyMode, new sn.a<Logger>() { // from class: com.unity3d.services.UnityAdsSDK$fetchToken$$inlined$inject$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.log.Logger, java.lang.Object] */
            @Override // sn.a
            @NotNull
            public final Logger invoke() {
                IServiceComponent iServiceComponent = this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str5, t.b(Logger.class));
            }
        });
        long jB = j.f6782a.b();
        SendDiagnosticEvent.DefaultImpls.invoke$default(fetchToken$lambda$13(gVarA4), "native_gateway_token_started", null, kotlin.collections.a.m(h.a("sync", str), h.a("state", GetInitializationState.DefaultImpls.invoke$default(fetchToken$lambda$12(gVarA3), false, 1, null).toString())), null, null, null, 58, null);
        if (GetInitializationState.DefaultImpls.invoke$default(fetchToken$lambda$12(gVarA3), false, 1, null) != InitializationState.INITIALIZED) {
            str2 = "not_initialized";
            str3 = null;
            str4 = null;
        } else {
            try {
                str4 = (String) p000do.h.b(null, new UnityAdsSDK$fetchToken$token$1(gVarA2, gVarA, null), 1, null);
                str2 = null;
                str3 = null;
            } catch (Exception e10) {
                String shortenedStackTrace$default = ExceptionExtensionsKt.getShortenedStackTrace$default(e10, 0, 1, null);
                str2 = "uncaught_exception";
                str3 = shortenedStackTrace$default;
                str4 = null;
            }
        }
        SendDiagnosticEvent sendDiagnosticEventFetchToken$lambda$13 = fetchToken$lambda$13(gVarA4);
        String str6 = str4 == null ? "native_gateway_token_failure_time" : "native_gateway_token_success_time";
        Double dB = jn.a.b(TimeExtensionsKt.elapsedMillis(j.a.b(jB)));
        Map mapD = p0.d();
        mapD.put("sync", str);
        mapD.put("state", GetInitializationState.DefaultImpls.invoke$default(fetchToken$lambda$12(gVarA3), false, 1, null).toString());
        if (str2 != null) {
        }
        if (str3 != null) {
            mapD.put("reason_debug", str3);
        }
        r rVar = r.f5635a;
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEventFetchToken$lambda$13, str6, dB, p0.c(mapD), null, null, jn.a.d(fetchToken$lambda$10(gVarA).invoke()), 24, null);
        if (str4 == null) {
            Logger.DefaultImpls.error$default(fetchToken$lambda$14(gVarA5), "Returned nil token due to: " + str2, null, 2, null);
        } else {
            fetchToken$lambda$14(gVarA5).info("Generated a valid token.");
        }
        return str4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TokenNumberProvider fetchToken$lambda$10(bn.g<? extends TokenNumberProvider> gVar) {
        return gVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetHeaderBiddingToken fetchToken$lambda$11(bn.g<? extends GetHeaderBiddingToken> gVar) {
        return gVar.getValue();
    }

    private static final GetInitializationState fetchToken$lambda$12(bn.g<? extends GetInitializationState> gVar) {
        return gVar.getValue();
    }

    private static final SendDiagnosticEvent fetchToken$lambda$13(bn.g<? extends SendDiagnosticEvent> gVar) {
        return gVar.getValue();
    }

    private static final Logger fetchToken$lambda$14(bn.g<? extends Logger> gVar) {
        return gVar.getValue();
    }

    private static final AlternativeFlowReader finishOMIDSession$lambda$18(bn.g<? extends AlternativeFlowReader> gVar) {
        return gVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetAdObject finishOMIDSession$lambda$20(bn.g<? extends GetAdObject> gVar) {
        return gVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OmFinishSession finishOMIDSession$lambda$21(bn.g<? extends OmFinishSession> gVar) {
        return gVar.getValue();
    }

    private static final GetGameId getToken$lambda$7(bn.g<? extends GetGameId> gVar) {
        return gVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TokenNumberProvider getToken$lambda$8(bn.g<? extends TokenNumberProvider> gVar) {
        return gVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetAsyncHeaderBiddingToken getToken$lambda$9(bn.g<? extends GetAsyncHeaderBiddingToken> gVar) {
        return gVar.getValue();
    }

    public static /* synthetic */ g initialize$default(UnityAdsSDK unityAdsSDK, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = "api";
        }
        return unityAdsSDK.initialize(str, str2);
    }

    private static final ShouldAllowInitialization initialize$lambda$4$lambda$0(bn.g<? extends ShouldAllowInitialization> gVar) {
        return gVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AlternativeFlowReader initialize$lambda$4$lambda$1(bn.g<? extends AlternativeFlowReader> gVar) {
        return gVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InitializeSDK initialize$lambda$4$lambda$2(bn.g<InitializeSDK> gVar) {
        return gVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InitializeBoldSDK initialize$lambda$4$lambda$3(bn.g<? extends InitializeBoldSDK> gVar) {
        return gVar.getValue();
    }

    public static /* synthetic */ g load$default(UnityAdsSDK unityAdsSDK, String str, UnityAdsLoadOptions unityAdsLoadOptions, IUnityAdsLoadListener iUnityAdsLoadListener, UnityBannerSize unityBannerSize, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            unityBannerSize = null;
        }
        return unityAdsSDK.load(str, unityAdsLoadOptions, iUnityAdsLoadListener, unityBannerSize);
    }

    private static final GetGameId load$lambda$5(bn.g<? extends GetGameId> gVar) {
        return gVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Context load$lambda$6(bn.g<? extends Context> gVar) {
        return gVar.getValue();
    }

    private static final AlternativeFlowReader sendBannerDestroyed$lambda$22(bn.g<? extends AlternativeFlowReader> gVar) {
        return gVar.getValue();
    }

    private static final SendDiagnosticEvent sendBannerDestroyed$lambda$23(bn.g<? extends SendDiagnosticEvent> gVar) {
        return gVar.getValue();
    }

    @NotNull
    public final g finishOMIDSession(@NotNull String str) {
        tn.p.k(str, "opportunityId");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final String str2 = "";
        if (!finishOMIDSession$lambda$18(b.a(lazyThreadSafetyMode, new sn.a<AlternativeFlowReader>() { // from class: com.unity3d.services.UnityAdsSDK$finishOMIDSession$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.configuration.AlternativeFlowReader, java.lang.Object] */
            @Override // sn.a
            @NotNull
            public final AlternativeFlowReader invoke() {
                IServiceComponent iServiceComponent = this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str2, t.b(AlternativeFlowReader.class));
            }
        })).invoke()) {
            w wVarB = JobKt__JobKt.b(null, 1, null);
            wVarB.complete();
            return wVarB;
        }
        bn.g gVarA = b.a(lazyThreadSafetyMode, new sn.a<GetAdObject>() { // from class: com.unity3d.services.UnityAdsSDK$finishOMIDSession$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.GetAdObject, java.lang.Object] */
            @Override // sn.a
            @NotNull
            public final GetAdObject invoke() {
                IServiceComponent iServiceComponent = this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str2, t.b(GetAdObject.class));
            }
        });
        bn.g gVarA2 = b.a(lazyThreadSafetyMode, new sn.a<OmFinishSession>() { // from class: com.unity3d.services.UnityAdsSDK$finishOMIDSession$$inlined$inject$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.om.OmFinishSession, java.lang.Object] */
            @Override // sn.a
            @NotNull
            public final OmFinishSession invoke() {
                IServiceComponent iServiceComponent = this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str2, t.b(OmFinishSession.class));
            }
        });
        l0 l0Var = (l0) getServiceProvider().getRegistry().getService(ServiceProvider.NAMED_OMID_SCOPE, t.b(l0.class));
        return p000do.i.d(l0Var, null, null, new AnonymousClass2(str, l0Var, gVarA, gVarA2, null), 3, null);
    }

    @Override // com.unity3d.services.core.di.IServiceComponent
    @NotNull
    public IServiceProvider getServiceProvider() {
        return this.serviceProvider;
    }

    @Nullable
    public final String getToken() {
        return (String) p000do.h.b(null, new AnonymousClass1(null), 1, null);
    }

    @NotNull
    public final g getToken(@Nullable IUnityAdsTokenListener iUnityAdsTokenListener) {
        return getToken(null, iUnityAdsTokenListener);
    }

    @NotNull
    public final g getToken(@Nullable TokenConfiguration tokenConfiguration, @Nullable IUnityAdsTokenListener iUnityAdsTokenListener) {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final String str = "";
        initialize(getToken$lambda$7(b.a(lazyThreadSafetyMode, new sn.a<GetGameId>() { // from class: com.unity3d.services.UnityAdsSDK$getToken$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.GetGameId, java.lang.Object] */
            @Override // sn.a
            @NotNull
            public final GetGameId invoke() {
                IServiceComponent iServiceComponent = this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, t.b(GetGameId.class));
            }
        })).invoke(), "get_token");
        bn.g gVarA = b.a(lazyThreadSafetyMode, new sn.a<TokenNumberProvider>() { // from class: com.unity3d.services.UnityAdsSDK$getToken$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.TokenNumberProvider, java.lang.Object] */
            @Override // sn.a
            @NotNull
            public final TokenNumberProvider invoke() {
                IServiceComponent iServiceComponent = this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, t.b(TokenNumberProvider.class));
            }
        });
        bn.g gVarA2 = b.a(lazyThreadSafetyMode, new sn.a<GetAsyncHeaderBiddingToken>() { // from class: com.unity3d.services.UnityAdsSDK$getToken$$inlined$inject$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken, java.lang.Object] */
            @Override // sn.a
            @NotNull
            public final GetAsyncHeaderBiddingToken invoke() {
                IServiceComponent iServiceComponent = this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, t.b(GetAsyncHeaderBiddingToken.class));
            }
        });
        l0 l0Var = (l0) getServiceProvider().getRegistry().getService(ServiceProvider.NAMED_GET_TOKEN_SCOPE, t.b(l0.class));
        return p000do.i.d(l0Var, null, null, new C45322(tokenConfiguration, iUnityAdsTokenListener, l0Var, gVarA2, gVarA, null), 3, null);
    }

    @NotNull
    public final g initialize(@Nullable String str, @NotNull String str2) {
        tn.p.k(str2, "source");
        synchronized (this) {
            g gVar = this.initializationJob;
            if (gVar != null && gVar.isActive()) {
                return gVar;
            }
            final String str3 = "";
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
            if (!initialize$lambda$4$lambda$0(b.a(lazyThreadSafetyMode, new sn.a<ShouldAllowInitialization>() { // from class: com.unity3d.services.UnityAdsSDK$initialize$lambda$4$$inlined$inject$default$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.ShouldAllowInitialization, java.lang.Object] */
                @Override // sn.a
                @NotNull
                public final ShouldAllowInitialization invoke() {
                    IServiceComponent iServiceComponent = this;
                    return iServiceComponent.getServiceProvider().getRegistry().getService(str3, t.b(ShouldAllowInitialization.class));
                }
            })).invoke(str)) {
                return JobKt__JobKt.b(null, 1, null);
            }
            final String str4 = "";
            bn.g gVarA = b.a(lazyThreadSafetyMode, new sn.a<AlternativeFlowReader>() { // from class: com.unity3d.services.UnityAdsSDK$initialize$lambda$4$$inlined$inject$default$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.configuration.AlternativeFlowReader, java.lang.Object] */
                @Override // sn.a
                @NotNull
                public final AlternativeFlowReader invoke() {
                    IServiceComponent iServiceComponent = this;
                    return iServiceComponent.getServiceProvider().getRegistry().getService(str4, t.b(AlternativeFlowReader.class));
                }
            });
            final String str5 = "";
            bn.g gVarA2 = b.a(lazyThreadSafetyMode, new sn.a<InitializeSDK>() { // from class: com.unity3d.services.UnityAdsSDK$initialize$lambda$4$$inlined$inject$default$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.services.core.domain.task.InitializeSDK, java.lang.Object] */
                @Override // sn.a
                @NotNull
                public final InitializeSDK invoke() {
                    IServiceComponent iServiceComponent = this;
                    return iServiceComponent.getServiceProvider().getRegistry().getService(str5, t.b(InitializeSDK.class));
                }
            });
            final String str6 = "";
            bn.g gVarA3 = b.a(lazyThreadSafetyMode, new sn.a<InitializeBoldSDK>() { // from class: com.unity3d.services.UnityAdsSDK$initialize$lambda$4$$inlined$inject$default$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.InitializeBoldSDK, java.lang.Object] */
                @Override // sn.a
                @NotNull
                public final InitializeBoldSDK invoke() {
                    IServiceComponent iServiceComponent = this;
                    return iServiceComponent.getServiceProvider().getRegistry().getService(str6, t.b(InitializeBoldSDK.class));
                }
            });
            l0 l0Var = (l0) getServiceProvider().getRegistry().getService(ServiceProvider.NAMED_INIT_SCOPE, t.b(l0.class));
            g gVarD = p000do.i.d(l0Var, null, null, new UnityAdsSDK$initialize$1$newInitializationJob$1(str2, str, l0Var, gVarA, gVarA3, gVarA2, null), 3, null);
            this.initializationJob = gVarD;
            return gVarD;
        }
    }

    @NotNull
    public final g load(@Nullable String str, @NotNull UnityAdsLoadOptions unityAdsLoadOptions, @Nullable IUnityAdsLoadListener iUnityAdsLoadListener, @Nullable UnityBannerSize unityBannerSize) {
        tn.p.k(unityAdsLoadOptions, HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final String str2 = "";
        initialize(load$lambda$5(b.a(lazyThreadSafetyMode, new sn.a<GetGameId>() { // from class: com.unity3d.services.UnityAdsSDK$load$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.GetGameId, java.lang.Object] */
            @Override // sn.a
            @NotNull
            public final GetGameId invoke() {
                IServiceComponent iServiceComponent = this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str2, t.b(GetGameId.class));
            }
        })).invoke(), "load");
        l0 l0Var = (l0) getServiceProvider().getRegistry().getService(ServiceProvider.NAMED_LOAD_SCOPE, t.b(l0.class));
        return p000do.i.d(l0Var, null, null, new C45331(str, unityAdsLoadOptions, iUnityAdsLoadListener, unityBannerSize, l0Var, b.a(lazyThreadSafetyMode, new sn.a<Context>() { // from class: com.unity3d.services.UnityAdsSDK$load$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [android.content.Context, java.lang.Object] */
            @Override // sn.a
            @NotNull
            public final Context invoke() {
                IServiceComponent iServiceComponent = this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str2, t.b(Context.class));
            }
        }), null), 3, null);
    }

    public final void sendBannerDestroyed() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final String str = "";
        if (sendBannerDestroyed$lambda$22(b.a(lazyThreadSafetyMode, new sn.a<AlternativeFlowReader>() { // from class: com.unity3d.services.UnityAdsSDK$sendBannerDestroyed$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.configuration.AlternativeFlowReader, java.lang.Object] */
            @Override // sn.a
            @NotNull
            public final AlternativeFlowReader invoke() {
                IServiceComponent iServiceComponent = this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, t.b(AlternativeFlowReader.class));
            }
        })).invoke()) {
            SendDiagnosticEvent.DefaultImpls.invoke$default(sendBannerDestroyed$lambda$23(b.a(lazyThreadSafetyMode, new sn.a<SendDiagnosticEvent>() { // from class: com.unity3d.services.UnityAdsSDK$sendBannerDestroyed$$inlined$inject$default$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.SendDiagnosticEvent, java.lang.Object] */
                @Override // sn.a
                @NotNull
                public final SendDiagnosticEvent invoke() {
                    IServiceComponent iServiceComponent = this;
                    return iServiceComponent.getServiceProvider().getRegistry().getService(str, t.b(SendDiagnosticEvent.class));
                }
            })), "native_banner_destroyed", null, null, null, null, null, 62, null);
        }
    }

    @NotNull
    public final g show(@Nullable String str, @Nullable UnityAdsShowOptions unityAdsShowOptions, @NotNull Listeners listeners) {
        tn.p.k(listeners, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        l0 l0Var = (l0) getServiceProvider().getRegistry().getService(ServiceProvider.NAMED_SHOW_SCOPE, t.b(l0.class));
        return p000do.i.d(l0Var, null, null, new C45341((LegacyShowUseCase) getServiceProvider().getRegistry().getService("", t.b(LegacyShowUseCase.class)), str, unityAdsShowOptions, listeners, l0Var, null), 3, null);
    }
}
