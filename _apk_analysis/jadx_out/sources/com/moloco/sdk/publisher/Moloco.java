package com.moloco.sdk.publisher;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import bn.r;
import cn.f0;
import cn.x;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.Q6;
import com.moloco.sdk.BuildConfig;
import com.moloco.sdk.Init$SDKInitResponse;
import com.moloco.sdk.acm.AndroidClientMetrics;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.g0;
import com.moloco.sdk.internal.publisher.b0;
import com.moloco.sdk.internal.publisher.v;
import com.moloco.sdk.internal.publisher.v0;
import com.moloco.sdk.internal.services.bidtoken.q;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.init.MolocoInitParams;
import com.moloco.sdk.service_locator.b;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import sn.p;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
public final class Moloco {

    @Nullable
    private static kotlinx.coroutines.g initJob;

    @Nullable
    private static MolocoInitParams initParams;

    @NotNull
    public static final Moloco INSTANCE = new Moloco();

    @NotNull
    private static final Map<String, List<MolocoInitializationListener>> pendingInitByMediator = new LinkedHashMap();

    @NotNull
    private static final Set<String> _failedMediations = new LinkedHashSet();

    @NotNull
    private static final bn.g initializationHandler$delegate = kotlin.b.b(new sn.a() { // from class: com.moloco.sdk.publisher.c
        @Override // sn.a
        public final Object invoke() {
            return Moloco.initializationHandler_delegate$lambda$7();
        }
    });

    @NotNull
    private static final bn.g bidTokenHandler$delegate = kotlin.b.b(new sn.a() { // from class: com.moloco.sdk.publisher.d
        @Override // sn.a
        public final Object invoke() {
            return Moloco.bidTokenHandler_delegate$lambda$8();
        }
    });

    @NotNull
    private static final bn.g adCreator$delegate = kotlin.b.b(new sn.a() { // from class: com.moloco.sdk.publisher.e
        @Override // sn.a
        public final Object invoke() {
            return Moloco.adCreator_delegate$lambda$9();
        }
    });

    @NotNull
    private static final bn.g scope$delegate = kotlin.b.b(new sn.a() { // from class: com.moloco.sdk.publisher.f
        @Override // sn.a
        public final Object invoke() {
            return Moloco.scope_delegate$lambda$10();
        }
    });
    public static final int $stable = 8;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Init$SDKInitResponse.SupportedNetworks.values().length];
            try {
                iArr[Init$SDKInitResponse.SupportedNetworks.LEVEL_PLAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.publisher.Moloco$createBanner$1, reason: invalid class name */
    @jn.d(c = "com.moloco.sdk.publisher.Moloco$createBanner$1", f = "Moloco.kt", l = {249}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<l0, hn.c<? super r>, Object> {
        public final /* synthetic */ String $adUnitId;
        public final /* synthetic */ p<Banner, MolocoAdError.AdCreateError, r> $callback;
        public final /* synthetic */ MediationInfo $mediationInfo;
        public final /* synthetic */ String $watermarkString;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(MediationInfo mediationInfo, String str, String str2, p<? super Banner, ? super MolocoAdError.AdCreateError, r> pVar, hn.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$mediationInfo = mediationInfo;
            this.$adUnitId = str;
            this.$watermarkString = str2;
            this.$callback = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            return new AnonymousClass1(this.$mediationInfo, this.$adUnitId, this.$watermarkString, this.$callback, cVar);
        }

        @Override // sn.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super r> cVar) {
            return ((AnonymousClass1) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Pair pairA;
            Object objG = in.a.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                com.moloco.sdk.acm.recorder.a aVarA = com.moloco.sdk.acm.recorder.a.Companion.a(this.$mediationInfo.getName());
                com.moloco.sdk.internal.publisher.b adCreator = Moloco.INSTANCE.getAdCreator();
                String name = this.$mediationInfo.getName();
                String str = this.$adUnitId;
                String str2 = this.$watermarkString;
                this.label = 1;
                obj = adCreator.d(name, str, aVarA, str2, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            g0 g0Var = (g0) obj;
            if (g0Var instanceof g0.b) {
                pairA = bn.h.a(((g0.b) g0Var).a(), null);
            } else {
                if (!(g0Var instanceof g0.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                pairA = bn.h.a(null, ((g0.a) g0Var).a());
            }
            Banner banner = (Banner) pairA.component1();
            MolocoAdError.AdCreateError adCreateError = (MolocoAdError.AdCreateError) pairA.component2();
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Banner for adUnitId: ");
            sb2.append(this.$adUnitId);
            sb2.append(" has error: ");
            sb2.append(banner == null);
            MolocoLogger.info$default(molocoLogger, "Moloco", sb2.toString(), null, false, 12, null);
            this.$callback.mo2invoke(banner, adCreateError);
            return r.f5635a;
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.publisher.Moloco$createBannerTablet$1, reason: invalid class name and case insensitive filesystem */
    @jn.d(c = "com.moloco.sdk.publisher.Moloco$createBannerTablet$1", f = "Moloco.kt", l = {280}, m = "invokeSuspend")
    public static final class C43831 extends SuspendLambda implements p<l0, hn.c<? super r>, Object> {
        public final /* synthetic */ String $adUnitId;
        public final /* synthetic */ p<Banner, MolocoAdError.AdCreateError, r> $callback;
        public final /* synthetic */ MediationInfo $mediationInfo;
        public final /* synthetic */ String $watermarkString;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C43831(MediationInfo mediationInfo, String str, String str2, p<? super Banner, ? super MolocoAdError.AdCreateError, r> pVar, hn.c<? super C43831> cVar) {
            super(2, cVar);
            this.$mediationInfo = mediationInfo;
            this.$adUnitId = str;
            this.$watermarkString = str2;
            this.$callback = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            return new C43831(this.$mediationInfo, this.$adUnitId, this.$watermarkString, this.$callback, cVar);
        }

        @Override // sn.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super r> cVar) {
            return ((C43831) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Pair pairA;
            Object objG = in.a.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                com.moloco.sdk.acm.recorder.a aVarA = com.moloco.sdk.acm.recorder.a.Companion.a(this.$mediationInfo.getName());
                com.moloco.sdk.internal.publisher.b adCreator = Moloco.INSTANCE.getAdCreator();
                String name = this.$mediationInfo.getName();
                String str = this.$adUnitId;
                String str2 = this.$watermarkString;
                this.label = 1;
                obj = adCreator.i(name, str, aVarA, str2, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            g0 g0Var = (g0) obj;
            if (g0Var instanceof g0.b) {
                pairA = bn.h.a(((g0.b) g0Var).a(), null);
            } else {
                if (!(g0Var instanceof g0.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                pairA = bn.h.a(null, ((g0.a) g0Var).a());
            }
            Banner banner = (Banner) pairA.component1();
            MolocoAdError.AdCreateError adCreateError = (MolocoAdError.AdCreateError) pairA.component2();
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Banner for adUnitId: ");
            sb2.append(this.$adUnitId);
            sb2.append(" has error: ");
            sb2.append(banner == null);
            MolocoLogger.info$default(molocoLogger, "Moloco", sb2.toString(), null, false, 12, null);
            this.$callback.mo2invoke(banner, adCreateError);
            return r.f5635a;
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.publisher.Moloco$createInterstitial$1, reason: invalid class name and case insensitive filesystem */
    @jn.d(c = "com.moloco.sdk.publisher.Moloco$createInterstitial$1", f = "Moloco.kt", l = {372}, m = "invokeSuspend")
    public static final class C43841 extends SuspendLambda implements p<l0, hn.c<? super r>, Object> {
        public final /* synthetic */ String $adUnitId;
        public final /* synthetic */ p<InterstitialAd, MolocoAdError.AdCreateError, r> $callback;
        public final /* synthetic */ MediationInfo $mediationInfo;
        public final /* synthetic */ String $watermarkString;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C43841(MediationInfo mediationInfo, String str, String str2, p<? super InterstitialAd, ? super MolocoAdError.AdCreateError, r> pVar, hn.c<? super C43841> cVar) {
            super(2, cVar);
            this.$mediationInfo = mediationInfo;
            this.$adUnitId = str;
            this.$watermarkString = str2;
            this.$callback = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            return new C43841(this.$mediationInfo, this.$adUnitId, this.$watermarkString, this.$callback, cVar);
        }

        @Override // sn.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super r> cVar) {
            return ((C43841) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Pair pairA;
            Object objG = in.a.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                com.moloco.sdk.acm.recorder.a aVarA = com.moloco.sdk.acm.recorder.a.Companion.a(this.$mediationInfo.getName());
                com.moloco.sdk.internal.publisher.b adCreator = Moloco.INSTANCE.getAdCreator();
                String name = this.$mediationInfo.getName();
                String str = this.$adUnitId;
                String str2 = this.$watermarkString;
                this.label = 1;
                obj = adCreator.j(name, str, aVarA, str2, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            g0 g0Var = (g0) obj;
            if (g0Var instanceof g0.b) {
                pairA = bn.h.a(((g0.b) g0Var).a(), null);
            } else {
                if (!(g0Var instanceof g0.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                pairA = bn.h.a(null, ((g0.a) g0Var).a());
            }
            InterstitialAd interstitialAd = (InterstitialAd) pairA.component1();
            MolocoAdError.AdCreateError adCreateError = (MolocoAdError.AdCreateError) pairA.component2();
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Interstitial for adUnitId: ");
            sb2.append(this.$adUnitId);
            sb2.append(" has error: ");
            sb2.append(interstitialAd == null);
            MolocoLogger.info$default(molocoLogger, "Moloco", sb2.toString(), null, false, 12, null);
            this.$callback.mo2invoke(interstitialAd, adCreateError);
            return r.f5635a;
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.publisher.Moloco$createMREC$1, reason: invalid class name and case insensitive filesystem */
    @jn.d(c = "com.moloco.sdk.publisher.Moloco$createMREC$1", f = "Moloco.kt", l = {311}, m = "invokeSuspend")
    public static final class C43851 extends SuspendLambda implements p<l0, hn.c<? super r>, Object> {
        public final /* synthetic */ String $adUnitId;
        public final /* synthetic */ p<Banner, MolocoAdError.AdCreateError, r> $callback;
        public final /* synthetic */ MediationInfo $mediationInfo;
        public final /* synthetic */ String $watermarkString;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C43851(MediationInfo mediationInfo, String str, String str2, p<? super Banner, ? super MolocoAdError.AdCreateError, r> pVar, hn.c<? super C43851> cVar) {
            super(2, cVar);
            this.$mediationInfo = mediationInfo;
            this.$adUnitId = str;
            this.$watermarkString = str2;
            this.$callback = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            return new C43851(this.$mediationInfo, this.$adUnitId, this.$watermarkString, this.$callback, cVar);
        }

        @Override // sn.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super r> cVar) {
            return ((C43851) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Pair pairA;
            Object objG = in.a.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                com.moloco.sdk.acm.recorder.a aVarA = com.moloco.sdk.acm.recorder.a.Companion.a(this.$mediationInfo.getName());
                com.moloco.sdk.internal.publisher.b adCreator = Moloco.INSTANCE.getAdCreator();
                String name = this.$mediationInfo.getName();
                String str = this.$adUnitId;
                String str2 = this.$watermarkString;
                this.label = 1;
                obj = adCreator.l(name, str, aVarA, str2, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            g0 g0Var = (g0) obj;
            if (g0Var instanceof g0.b) {
                pairA = bn.h.a(((g0.b) g0Var).a(), null);
            } else {
                if (!(g0Var instanceof g0.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                pairA = bn.h.a(null, ((g0.a) g0Var).a());
            }
            Banner banner = (Banner) pairA.component1();
            MolocoAdError.AdCreateError adCreateError = (MolocoAdError.AdCreateError) pairA.component2();
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("MREC for adUnitId: ");
            sb2.append(this.$adUnitId);
            sb2.append(" has error: ");
            sb2.append(banner == null);
            MolocoLogger.info$default(molocoLogger, "Moloco", sb2.toString(), null, false, 12, null);
            this.$callback.mo2invoke(banner, adCreateError);
            return r.f5635a;
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.publisher.Moloco$createNativeAd$1, reason: invalid class name and case insensitive filesystem */
    @jn.d(c = "com.moloco.sdk.publisher.Moloco$createNativeAd$1", f = "Moloco.kt", l = {343}, m = "invokeSuspend")
    public static final class C43861 extends SuspendLambda implements p<l0, hn.c<? super r>, Object> {
        public final /* synthetic */ String $adUnitId;
        public final /* synthetic */ p<NativeAd, MolocoAdError.AdCreateError, r> $callback;
        public final /* synthetic */ MediationInfo $mediationInfo;
        public final /* synthetic */ String $watermarkString;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C43861(MediationInfo mediationInfo, String str, String str2, p<? super NativeAd, ? super MolocoAdError.AdCreateError, r> pVar, hn.c<? super C43861> cVar) {
            super(2, cVar);
            this.$mediationInfo = mediationInfo;
            this.$adUnitId = str;
            this.$watermarkString = str2;
            this.$callback = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            return new C43861(this.$mediationInfo, this.$adUnitId, this.$watermarkString, this.$callback, cVar);
        }

        @Override // sn.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super r> cVar) {
            return ((C43861) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Pair pairA;
            Object objG = in.a.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                com.moloco.sdk.acm.recorder.a aVarA = com.moloco.sdk.acm.recorder.a.Companion.a(this.$mediationInfo.getName());
                com.moloco.sdk.internal.publisher.b adCreator = Moloco.INSTANCE.getAdCreator();
                String name = this.$mediationInfo.getName();
                String str = this.$adUnitId;
                String str2 = this.$watermarkString;
                this.label = 1;
                obj = adCreator.m(name, str, aVarA, str2, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            g0 g0Var = (g0) obj;
            if (g0Var instanceof g0.b) {
                pairA = bn.h.a(((g0.b) g0Var).a(), null);
            } else {
                if (!(g0Var instanceof g0.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                pairA = bn.h.a(null, ((g0.a) g0Var).a());
            }
            NativeAd nativeAd = (NativeAd) pairA.component1();
            MolocoAdError.AdCreateError adCreateError = (MolocoAdError.AdCreateError) pairA.component2();
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Native Ad for adUnitId: ");
            sb2.append(this.$adUnitId);
            sb2.append(" has error: ");
            sb2.append(nativeAd == null);
            MolocoLogger.info$default(molocoLogger, "Moloco", sb2.toString(), null, false, 12, null);
            this.$callback.mo2invoke(nativeAd, adCreateError);
            return r.f5635a;
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.publisher.Moloco$createRewardedInterstitial$1, reason: invalid class name and case insensitive filesystem */
    @jn.d(c = "com.moloco.sdk.publisher.Moloco$createRewardedInterstitial$1", f = "Moloco.kt", l = {402}, m = "invokeSuspend")
    public static final class C43871 extends SuspendLambda implements p<l0, hn.c<? super r>, Object> {
        public final /* synthetic */ String $adUnitId;
        public final /* synthetic */ p<RewardedInterstitialAd, MolocoAdError.AdCreateError, r> $callback;
        public final /* synthetic */ MediationInfo $mediationInfo;
        public final /* synthetic */ String $watermarkString;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C43871(MediationInfo mediationInfo, String str, String str2, p<? super RewardedInterstitialAd, ? super MolocoAdError.AdCreateError, r> pVar, hn.c<? super C43871> cVar) {
            super(2, cVar);
            this.$mediationInfo = mediationInfo;
            this.$adUnitId = str;
            this.$watermarkString = str2;
            this.$callback = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            return new C43871(this.$mediationInfo, this.$adUnitId, this.$watermarkString, this.$callback, cVar);
        }

        @Override // sn.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super r> cVar) {
            return ((C43871) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Pair pairA;
            Object objG = in.a.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                com.moloco.sdk.acm.recorder.a aVarA = com.moloco.sdk.acm.recorder.a.Companion.a(this.$mediationInfo.getName());
                com.moloco.sdk.internal.publisher.b adCreator = Moloco.INSTANCE.getAdCreator();
                String name = this.$mediationInfo.getName();
                String str = this.$adUnitId;
                String str2 = this.$watermarkString;
                this.label = 1;
                obj = adCreator.n(name, str, aVarA, str2, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            g0 g0Var = (g0) obj;
            if (g0Var instanceof g0.b) {
                pairA = bn.h.a(((g0.b) g0Var).a(), null);
            } else {
                if (!(g0Var instanceof g0.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                pairA = bn.h.a(null, ((g0.a) g0Var).a());
            }
            RewardedInterstitialAd rewardedInterstitialAd = (RewardedInterstitialAd) pairA.component1();
            MolocoAdError.AdCreateError adCreateError = (MolocoAdError.AdCreateError) pairA.component2();
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Rewarded for adUnitId: ");
            sb2.append(this.$adUnitId);
            sb2.append(" has error: ");
            sb2.append(rewardedInterstitialAd == null);
            MolocoLogger.info$default(molocoLogger, "Moloco", sb2.toString(), null, false, 12, null);
            this.$callback.mo2invoke(rewardedInterstitialAd, adCreateError);
            return r.f5635a;
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.publisher.Moloco$getBidToken$1, reason: invalid class name and case insensitive filesystem */
    @jn.d(c = "com.moloco.sdk.publisher.Moloco$getBidToken$1", f = "Moloco.kt", l = {224}, m = "invokeSuspend")
    public static final class C43881 extends SuspendLambda implements p<l0, hn.c<? super r>, Object> {
        public final /* synthetic */ MolocoBidTokenListener $listener;
        public final /* synthetic */ MediationInfo $mediationInfo;
        public final /* synthetic */ com.moloco.sdk.acm.recorder.a $metricsRecorder;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43881(com.moloco.sdk.acm.recorder.a aVar, MediationInfo mediationInfo, MolocoBidTokenListener molocoBidTokenListener, hn.c<? super C43881> cVar) {
            super(2, cVar);
            this.$metricsRecorder = aVar;
            this.$mediationInfo = mediationInfo;
            this.$listener = molocoBidTokenListener;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            return new C43881(this.$metricsRecorder, this.$mediationInfo, this.$listener, cVar);
        }

        @Override // sn.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super r> cVar) {
            return ((C43881) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "Handling bid token request", null, false, 12, null);
                com.moloco.sdk.internal.services.bidtoken.k bidTokenHandler = Moloco.INSTANCE.getBidTokenHandler();
                com.moloco.sdk.acm.recorder.a aVar = this.$metricsRecorder;
                MediationInfo mediationInfo = this.$mediationInfo;
                MolocoBidTokenListener molocoBidTokenListener = this.$listener;
                this.label = 1;
                if (bidTokenHandler.a(aVar, mediationInfo, molocoBidTokenListener, this) == objG) {
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

    /* JADX INFO: renamed from: com.moloco.sdk.publisher.Moloco$initialize$2, reason: invalid class name */
    @jn.d(c = "com.moloco.sdk.publisher.Moloco$initialize$2", f = "Moloco.kt", l = {149, 151, 174}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements p<l0, hn.c<? super r>, Object> {
        public final /* synthetic */ MolocoInitParams $initParam;
        public final /* synthetic */ MolocoInitializationListener $listener;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(MolocoInitParams molocoInitParams, MolocoInitializationListener molocoInitializationListener, hn.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$initParam = molocoInitParams;
            this.$listener = molocoInitializationListener;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            return new AnonymousClass2(this.$initParam, this.$listener, cVar);
        }

        @Override // sn.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super r> cVar) {
            return ((AnonymousClass2) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x00a0  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0106  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x0136 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instruction units count: 463
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.publisher.Moloco.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private Moloco() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.moloco.sdk.internal.publisher.b adCreator_delegate$lambda$9() {
        return new com.moloco.sdk.internal.publisher.b(INSTANCE.getInitializationHandler().j(), b.h.f47664a.h(), new b0(null, 0L, 3, null), new Moloco$adCreator$2$1(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.moloco.sdk.internal.services.bidtoken.i bidTokenHandler_delegate$lambda$8() {
        return new com.moloco.sdk.internal.services.bidtoken.i(q.a(), INSTANCE.getInitializationHandler(), b.h.f47664a.h());
    }

    public static final void createBanner(@NotNull MediationInfo mediationInfo, @NotNull String str, @Nullable String str2, @NotNull p<? super Banner, ? super MolocoAdError.AdCreateError, r> pVar) {
        tn.p.k(mediationInfo, "mediationInfo");
        tn.p.k(str, "adUnitId");
        tn.p.k(pVar, "callback");
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "[Thread id: " + Thread.currentThread().getId() + ", name: " + Thread.currentThread().getName() + "] Creating banner async for adUnitId: " + str, null, false, 12, null);
        p000do.i.d(INSTANCE.getScope(), null, null, new AnonymousClass1(mediationInfo, str, str2, pVar, null), 3, null);
    }

    public static /* synthetic */ void createBanner$default(MediationInfo mediationInfo, String str, String str2, p pVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        createBanner(mediationInfo, str, str2, pVar);
    }

    public static final void createBannerTablet(@NotNull MediationInfo mediationInfo, @NotNull String str, @Nullable String str2, @NotNull p<? super Banner, ? super MolocoAdError.AdCreateError, r> pVar) {
        tn.p.k(mediationInfo, "mediationInfo");
        tn.p.k(str, "adUnitId");
        tn.p.k(pVar, "callback");
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "[Thread id: " + Thread.currentThread().getId() + ", name: " + Thread.currentThread().getName() + "] Creating banner tablet async for adUnitId: " + str, null, false, 12, null);
        p000do.i.d(INSTANCE.getScope(), null, null, new C43831(mediationInfo, str, str2, pVar, null), 3, null);
    }

    public static /* synthetic */ void createBannerTablet$default(MediationInfo mediationInfo, String str, String str2, p pVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        createBannerTablet(mediationInfo, str, str2, pVar);
    }

    public static final void createInterstitial(@NotNull MediationInfo mediationInfo, @NotNull String str, @Nullable String str2, @NotNull p<? super InterstitialAd, ? super MolocoAdError.AdCreateError, r> pVar) {
        tn.p.k(mediationInfo, "mediationInfo");
        tn.p.k(str, "adUnitId");
        tn.p.k(pVar, "callback");
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "[Thread id: " + Thread.currentThread().getId() + ", name: " + Thread.currentThread().getName() + "] Creating interstitial ad for mediation async for adUnitId: " + str, null, false, 12, null);
        p000do.i.d(INSTANCE.getScope(), null, null, new C43841(mediationInfo, str, str2, pVar, null), 3, null);
    }

    public static /* synthetic */ void createInterstitial$default(MediationInfo mediationInfo, String str, String str2, p pVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        createInterstitial(mediationInfo, str, str2, pVar);
    }

    public static final void createMREC(@NotNull MediationInfo mediationInfo, @NotNull String str, @Nullable String str2, @NotNull p<? super Banner, ? super MolocoAdError.AdCreateError, r> pVar) {
        tn.p.k(mediationInfo, "mediationInfo");
        tn.p.k(str, "adUnitId");
        tn.p.k(pVar, "callback");
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "[Thread id: " + Thread.currentThread().getId() + ", name: " + Thread.currentThread().getName() + "] Creating banner MREC async for adUnitId: " + str, null, false, 12, null);
        p000do.i.d(INSTANCE.getScope(), null, null, new C43851(mediationInfo, str, str2, pVar, null), 3, null);
    }

    public static /* synthetic */ void createMREC$default(MediationInfo mediationInfo, String str, String str2, p pVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        createMREC(mediationInfo, str, str2, pVar);
    }

    public static final void createNativeAd(@NotNull MediationInfo mediationInfo, @NotNull String str, @Nullable String str2, @NotNull p<? super NativeAd, ? super MolocoAdError.AdCreateError, r> pVar) {
        tn.p.k(mediationInfo, "mediationInfo");
        tn.p.k(str, "adUnitId");
        tn.p.k(pVar, "callback");
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "[Thread id: " + Thread.currentThread().getId() + ", name: " + Thread.currentThread().getName() + "] Creating native ad for mediation async for adUnitId: " + str, null, false, 12, null);
        p000do.i.d(INSTANCE.getScope(), null, null, new C43861(mediationInfo, str, str2, pVar, null), 3, null);
    }

    public static /* synthetic */ void createNativeAd$default(MediationInfo mediationInfo, String str, String str2, p pVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        createNativeAd(mediationInfo, str, str2, pVar);
    }

    public static final void createRewardedInterstitial(@NotNull MediationInfo mediationInfo, @NotNull String str, @Nullable String str2, @NotNull p<? super RewardedInterstitialAd, ? super MolocoAdError.AdCreateError, r> pVar) {
        tn.p.k(mediationInfo, "mediationInfo");
        tn.p.k(str, "adUnitId");
        tn.p.k(pVar, "callback");
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "[Thread id: " + Thread.currentThread().getId() + ", name: " + Thread.currentThread().getName() + "] Creating rewarded ad for mediation async for adUnitId: " + str, null, false, 12, null);
        p000do.i.d(INSTANCE.getScope(), null, null, new C43871(mediationInfo, str, str2, pVar, null), 3, null);
    }

    public static /* synthetic */ void createRewardedInterstitial$default(MediationInfo mediationInfo, String str, String str2, p pVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        createRewardedInterstitial(mediationInfo, str, str2, pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.moloco.sdk.internal.publisher.b getAdCreator() {
        return (com.moloco.sdk.internal.publisher.b) adCreator$delegate.getValue();
    }

    public static final void getBidToken(@NotNull MediationInfo mediationInfo, @NotNull Context context, @NotNull MolocoBidTokenListener molocoBidTokenListener) {
        tn.p.k(mediationInfo, "mediationInfo");
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(molocoBidTokenListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        com.moloco.sdk.internal.android_context.b.a(context);
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "[Thread id: " + Thread.currentThread().getId() + ", name: " + Thread.currentThread().getName() + "] Fetching bid token", null, false, 12, null);
        p000do.i.d(com.moloco.sdk.internal.scheduling.e.f47086a.a(), null, null, new C43881(com.moloco.sdk.acm.recorder.a.Companion.a(mediationInfo.getName()), mediationInfo, molocoBidTokenListener, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.moloco.sdk.internal.services.bidtoken.k getBidTokenHandler() {
        return (com.moloco.sdk.internal.services.bidtoken.k) bidTokenHandler$delegate.getValue();
    }

    @VisibleForTesting(otherwise = 2)
    public static /* synthetic */ void getInitJob$annotations() {
    }

    @VisibleForTesting(otherwise = 2)
    public static /* synthetic */ void getInitParams$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final v getInitializationHandler() {
        return (v) initializationHandler$delegate.getValue();
    }

    @VisibleForTesting(otherwise = 2)
    public static /* synthetic */ void getPendingInitByMediator$moloco_sdk_release$annotations() {
    }

    private final l0 getScope() {
        return (l0) scope$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v initializationHandler_delegate$lambda$7() {
        return new v(b.h.f47664a.h());
    }

    public static final void initialize(@NotNull MolocoInitParams molocoInitParams) {
        tn.p.k(molocoInitParams, "initParam");
        initialize$default(molocoInitParams, null, 2, null);
    }

    public static final synchronized void initialize(@NotNull MolocoInitParams molocoInitParams, @Nullable MolocoInitializationListener molocoInitializationListener) {
        tn.p.k(molocoInitParams, "initParam");
        Moloco moloco = INSTANCE;
        moloco.logMolocoInfo(molocoInitParams);
        if (molocoInitParams.getAppKey().length() == 0) {
            throw new IllegalArgumentException("Moloco SDK initialized with empty appKey");
        }
        if (isInitialized()) {
            if (tn.p.f(molocoInitParams.getAppKey(), moloco.getAppKey$moloco_sdk_release())) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "Already initialized. Returning and notifying listener", null, false, 12, null);
                if (moloco.shouldInitializeILRD(molocoInitParams.getMediationInfo().getName())) {
                    moloco.initializeILRD();
                }
                if (molocoInitializationListener != null) {
                    v0.a(molocoInitializationListener, v.f47014f.a());
                }
            } else {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "Already initialized but with different appKey. Returning error and notifying listener", null, false, 12, null);
                _failedMediations.add(molocoInitParams.getMediationInfo().getName());
                com.moloco.sdk.acm.recorder.a.Companion.a(molocoInitParams.getMediationInfo().getName()).b(new com.moloco.sdk.acm.b(com.moloco.sdk.internal.client_metrics_data.b.f45950i.c()));
                if (molocoInitializationListener != null) {
                    v0.a(molocoInitializationListener, v.f47014f.b("Moloco SDK failed to initialize due to unexpected app key"));
                }
            }
            return;
        }
        synchronized (moloco) {
            kotlinx.coroutines.g gVar = initJob;
            if (gVar == null || !gVar.isActive()) {
                r rVar = r.f5635a;
                initParams = molocoInitParams;
                com.moloco.sdk.internal.android_context.b.a(molocoInitParams.getAppContext());
                initJob = p000do.i.d(kotlinx.coroutines.d.a(com.moloco.sdk.internal.scheduling.c.a().getIo()), null, null, new AnonymousClass2(molocoInitParams, molocoInitializationListener, null), 3, null);
                return;
            }
            String appKey = molocoInitParams.getAppKey();
            MolocoInitParams molocoInitParams2 = initParams;
            if (!tn.p.f(appKey, molocoInitParams2 != null ? molocoInitParams2.getAppKey() : null)) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "Init Job active with different appKey. Notifying listener and avoiding init", null, false, 12, null);
                _failedMediations.add(molocoInitParams.getMediationInfo().getName());
                com.moloco.sdk.acm.recorder.a.Companion.a(molocoInitParams.getMediationInfo().getName()).b(new com.moloco.sdk.acm.b(com.moloco.sdk.internal.client_metrics_data.b.f45950i.c()));
                if (molocoInitializationListener != null) {
                    v0.a(molocoInitializationListener, v.f47014f.b("Moloco SDK failed to initialize due to unexpected app key during existing initialization"));
                }
                return;
            }
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "Init Job active with same appKey. Queuing listener and returning for mediator: " + molocoInitParams.getMediationInfo().getName(), null, false, 12, null);
            String name = molocoInitParams.getMediationInfo().getName();
            Map<String, List<MolocoInitializationListener>> map = pendingInitByMediator;
            List<MolocoInitializationListener> arrayList = map.get(name);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                map.put(name, arrayList);
            }
            List<MolocoInitializationListener> list = arrayList;
            if (molocoInitializationListener != null) {
                list.add(molocoInitializationListener);
            }
        }
    }

    public static /* synthetic */ void initialize$default(MolocoInitParams molocoInitParams, MolocoInitializationListener molocoInitializationListener, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            molocoInitializationListener = null;
        }
        initialize(molocoInitParams, molocoInitializationListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initializeAndroidClientMetrics(MolocoInitParams molocoInitParams) {
        if (!getInitializationHandler().i()) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "Moloco", "ACM cannot be initialized as Moloco SDK cannot be initialized", null, false, 12, null);
            return;
        }
        com.moloco.sdk.internal.configs.a aVarA = com.moloco.sdk.internal.configs.b.a();
        AndroidClientMetrics androidClientMetrics = AndroidClientMetrics.f45708a;
        String appKey = molocoInitParams.getAppKey();
        String strB = aVarA.b();
        Context appContext = molocoInitParams.getAppContext();
        long jA = aVarA.a();
        Pair pairA = bn.h.a("AppKey", molocoInitParams.getAppKey());
        b.e eVar = b.e.f47645a;
        AndroidClientMetrics.r(androidClientMetrics, new com.moloco.sdk.acm.d(appKey, strB, appContext, jA, kotlin.collections.a.m(pairA, bn.h.a("AppBundle", eVar.h().invoke().a()), bn.h.a("AppVersion", eVar.h().invoke().b()), bn.h.a("SdkVersion", BuildConfig.SDK_VERSION_NAME), bn.h.a("OS", eVar.l().invoke().i()), bn.h.a(Q6.G, eVar.l().invoke().j()))), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initializeILRD() {
        Init$SDKInitResponse init$SDKInitResponseK = getInitializationHandler().k();
        if (init$SDKInitResponseK == null) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "Moloco", "ILRD cannot be initialized as Moloco SDK is not initialized", null, false, 12, null);
            return;
        }
        Throwable thM7537exceptionOrNullimpl = Result.m7537exceptionOrNullimpl(b.C0586b.f47632a.g().e(init$SDKInitResponseK));
        if (thM7537exceptionOrNullimpl != null) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "ILRD initialization failed. " + thM7537exceptionOrNullimpl.getMessage(), null, false, 12, null);
        }
    }

    public static final boolean isInitialized() {
        return INSTANCE.getInitializationHandler().j().getValue() == Initialization.SUCCESS;
    }

    public static /* synthetic */ void isInitialized$annotations() {
    }

    private final void logMolocoInfo(MolocoInitParams molocoInitParams) {
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.info$default(molocoLogger, "Moloco", "=====================================", null, false, 12, null);
        MolocoLogger.info$default(molocoLogger, "Moloco", "Moloco SDK initializing", null, false, 12, null);
        MolocoLogger.info$default(molocoLogger, "Moloco", "SDK Version: 4.4.0", null, false, 12, null);
        MolocoLogger.info$default(molocoLogger, "Moloco", "Mediation: " + molocoInitParams.getMediationInfo().getName(), null, false, 12, null);
        MolocoLogger.info$default(molocoLogger, "Moloco", "isInitialized: " + isInitialized(), null, false, 12, null);
        MolocoLogger.info$default(molocoLogger, "Moloco", "=====================================", null, false, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processInitConfigs(Init$SDKInitResponse init$SDKInitResponse) {
        if (init$SDKInitResponse.l()) {
            Init$SDKInitResponse.f fVarE = init$SDKInitResponse.e();
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            MolocoLogger.debug$default(molocoLogger, "Moloco", "Init response has eventCollectionConfig", false, 4, null);
            MolocoLogger.debug$default(molocoLogger, "Moloco", "eventCollectionConfig:", false, 4, null);
            MolocoLogger.debug$default(molocoLogger, "Moloco", "eventCollectionEnabled: " + fVarE.e(), false, 4, null);
            MolocoLogger.debug$default(molocoLogger, "Moloco", "mrefCollectionEnabled: " + fVarE.f(), false, 4, null);
            MolocoLogger.debug$default(molocoLogger, "Moloco", "appFgUrl: " + fVarE.c(), false, 4, null);
            MolocoLogger.debug$default(molocoLogger, "Moloco", "appBgUrl: " + fVarE.b(), false, 4, null);
            com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b bVarC = b.k.f47680a.c();
            boolean zE = fVarE.e();
            boolean zF = fVarE.f();
            String strC = fVarE.c();
            tn.p.j(strC, "getAppForegroundTrackingUrl(...)");
            String strB = fVarE.b();
            tn.p.j(strB, "getAppBackgroundTrackingUrl(...)");
            bVarC.a(zE, zF, strC, strB);
            if (fVarE.e()) {
                b.C0586b.f47632a.e().a();
            }
        } else {
            MolocoLogger.debug$default(MolocoLogger.INSTANCE, "Moloco", "Init response does not have eventCollectionConfig", false, 4, null);
        }
        b.c.f47639a.b().a(init$SDKInitResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l0 scope_delegate$lambda$10() {
        return kotlinx.coroutines.d.a(com.moloco.sdk.internal.scheduling.c.a().getMain());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldInitializeILRD(String str) {
        Init$SDKInitResponse.i iVarG;
        List<Init$SDKInitResponse.SupportedNetworks> listF;
        Init$SDKInitResponse init$SDKInitResponseK = getInitializationHandler().k();
        if (init$SDKInitResponseK == null || (iVarG = init$SDKInitResponseK.g()) == null || (listF = iVarG.f()) == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList(x.x(listF, 10));
        for (Init$SDKInitResponse.SupportedNetworks supportedNetworks : listF) {
            String lowerCase = ((supportedNetworks == null ? -1 : WhenMappings.$EnumSwitchMapping$0[supportedNetworks.ordinal()]) == 1 ? "LevelPlay" : supportedNetworks.name()).toLowerCase(Locale.ROOT);
            tn.p.j(lowerCase, "toLowerCase(...)");
            arrayList.add(lowerCase);
        }
        String lowerCase2 = str.toLowerCase(Locale.ROOT);
        tn.p.j(lowerCase2, "toLowerCase(...)");
        return arrayList.contains(lowerCase2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object updateAndroidClientMetricsOnInitSuccess(hn.c<? super r> cVar) {
        Object objX = AndroidClientMetrics.f45708a.x(new com.moloco.sdk.acm.g(((com.moloco.sdk.internal.configs.a) b.c.f47639a.b().b(com.moloco.sdk.internal.configs.a.class, com.moloco.sdk.internal.configs.b.a())).b(), jn.a.e(r0.a())), cVar);
        return objX == in.a.g() ? objX : r.f5635a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @androidx.annotation.VisibleForTesting(otherwise = 5)
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object clearState$moloco_sdk_release(@org.jetbrains.annotations.NotNull hn.c<? super bn.r> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof com.moloco.sdk.publisher.Moloco$clearState$1
            if (r0 == 0) goto L13
            r0 = r13
            com.moloco.sdk.publisher.Moloco$clearState$1 r0 = (com.moloco.sdk.publisher.Moloco$clearState$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.moloco.sdk.publisher.Moloco$clearState$1 r0 = new com.moloco.sdk.publisher.Moloco$clearState$1
            r0.<init>(r12, r13)
        L18:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = in.a.g()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.c.b(r13)
            goto L74
        L2d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L35:
            java.lang.Object r2 = r0.L$0
            com.moloco.sdk.publisher.Moloco r2 = (com.moloco.sdk.publisher.Moloco) r2
            kotlin.c.b(r13)
            goto L5e
        L3d:
            kotlin.c.b(r13)
            com.moloco.sdk.internal.MolocoLogger r6 = com.moloco.sdk.internal.MolocoLogger.INSTANCE
            r9 = 0
            r10 = 4
            r11 = 0
            java.lang.String r7 = "Moloco"
            java.lang.String r8 = "clearState() unit testing function called"
            com.moloco.sdk.internal.MolocoLogger.debug$default(r6, r7, r8, r9, r10, r11)
            com.moloco.sdk.publisher.Moloco.initParams = r5
            kotlinx.coroutines.g r13 = com.moloco.sdk.publisher.Moloco.initJob
            if (r13 == 0) goto L5d
            r0.L$0 = r12
            r0.label = r4
            java.lang.Object r13 = p000do.t1.g(r13, r0)
            if (r13 != r1) goto L5d
            return r1
        L5d:
            r2 = r12
        L5e:
            com.moloco.sdk.publisher.Moloco.initJob = r5
            java.util.Map<java.lang.String, java.util.List<com.moloco.sdk.publisher.MolocoInitializationListener>> r13 = com.moloco.sdk.publisher.Moloco.pendingInitByMediator
            r13.clear()
            com.moloco.sdk.internal.publisher.v r13 = r2.getInitializationHandler()
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r13 = r13.g(r0)
            if (r13 != r1) goto L74
            return r1
        L74:
            bn.r r13 = bn.r.f5635a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.publisher.Moloco.clearState$moloco_sdk_release(hn.c):java.lang.Object");
    }

    @Nullable
    public final String getAppKey$moloco_sdk_release() {
        MolocoInitParams molocoInitParams = initParams;
        if (molocoInitParams != null) {
            return molocoInitParams.getAppKey();
        }
        return null;
    }

    @NotNull
    public final Set<String> getFailedMediations$moloco_sdk_release() {
        return f0.l1(_failedMediations);
    }

    @Nullable
    public final kotlinx.coroutines.g getInitJob() {
        return initJob;
    }

    @Nullable
    public final MolocoInitParams getInitParams() {
        return initParams;
    }

    @NotNull
    public final Map<String, List<MolocoInitializationListener>> getPendingInitByMediator$moloco_sdk_release() {
        return pendingInitByMediator;
    }

    public final void setInitJob(@Nullable kotlinx.coroutines.g gVar) {
        initJob = gVar;
    }

    public final void setInitParams(@Nullable MolocoInitParams molocoInitParams) {
        initParams = molocoInitParams;
    }
}
