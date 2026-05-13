package com.unity3d.ads.core.data.manager;

import android.content.Context;
import bn.r;
import cn.w;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.scar.CommonScarEventReceiver;
import com.unity3d.ads.core.domain.scar.GmaEventData;
import com.unity3d.ads.core.domain.scar.ScarTimeHackFixer;
import com.unity3d.ads.core.extensions.AdFormatExtensions;
import com.unity3d.scar.adapter.common.GMAEvent;
import com.unity3d.scar.adapter.common.scarads.UnityAdFormat;
import com.unity3d.services.ads.gmascar.GMAScarAdapterBridge;
import com.unity3d.services.ads.gmascar.handlers.BiddingSignalsHandler;
import com.unity3d.services.ads.gmascar.listeners.IBiddingSignalsListener;
import com.unity3d.services.ads.gmascar.models.BiddingSignals;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.core.di.ServiceProvider;
import com.vungle.ads.internal.protos.Sdk;
import gatewayprotocol.v1.AdFormatOuterClass;
import go.e;
import hn.c;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jn.d;
import jn.f;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.k;
import p000do.l0;
import sn.p;
import sn.q;

/* JADX INFO: compiled from: AndroidScarManager.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AndroidScarManager implements ScarManager {

    @NotNull
    private final GMAScarAdapterBridge gmaBridge;

    @NotNull
    private final CommonScarEventReceiver scarEventReceiver;

    @NotNull
    private final ScarTimeHackFixer scarTimeHackFixer;

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$getSignals$2, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidScarManager.kt */
    @d(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$getSignals$2", f = "AndroidScarManager.kt", l = {134}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements p<l0, c<? super BiddingSignals>, Object> {
        public final /* synthetic */ List<AdFormatOuterClass.AdFormat> $adFormat;
        public Object L$0;
        public Object L$1;
        public int label;
        public final /* synthetic */ AndroidScarManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(List<? extends AdFormatOuterClass.AdFormat> list, AndroidScarManager androidScarManager, c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$adFormat = list;
            this.this$0 = androidScarManager;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            return new AnonymousClass2(this.$adFormat, this.this$0, cVar);
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull l0 l0Var, @Nullable c<? super BiddingSignals> cVar) {
            return ((AnonymousClass2) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ArrayList arrayList;
            Object objG = in.a.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                List<AdFormatOuterClass.AdFormat> list = this.$adFormat;
                AndroidScarManager androidScarManager = this.this$0;
                this.L$0 = list;
                this.L$1 = androidScarManager;
                this.label = 1;
                final kotlinx.coroutines.c cVar = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.d(this), 1);
                cVar.K();
                if (list != null) {
                    arrayList = new ArrayList();
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        UnityAdFormat unityAdFormat = AdFormatExtensions.toUnityAdFormat((AdFormatOuterClass.AdFormat) it.next());
                        if (!(unityAdFormat != UnityAdFormat.UNSPECIFIED)) {
                            unityAdFormat = null;
                        }
                        if (unityAdFormat != null) {
                            arrayList.add(unityAdFormat);
                        }
                    }
                } else {
                    arrayList = null;
                }
                if (arrayList == null || arrayList.isEmpty()) {
                    cVar.resumeWith(Result.m7534constructorimpl(null));
                } else {
                    androidScarManager.gmaBridge.getSCARBiddingSignals(arrayList, new BiddingSignalsHandler(true, new IBiddingSignalsListener() { // from class: com.unity3d.ads.core.data.manager.AndroidScarManager$getSignals$2$1$1
                        @Override // com.unity3d.services.ads.gmascar.listeners.IBiddingSignalsListener
                        public void onSignalsFailure(@Nullable String str) {
                            k<BiddingSignals> kVar = cVar;
                            Result.a aVar = Result.Companion;
                            kVar.resumeWith(Result.m7534constructorimpl(kotlin.c.a(new Exception(str))));
                        }

                        @Override // com.unity3d.services.ads.gmascar.listeners.IBiddingSignalsListener
                        public void onSignalsReady(@Nullable BiddingSignals biddingSignals) {
                            cVar.resumeWith(Result.m7534constructorimpl(biddingSignals));
                        }
                    }));
                }
                obj = cVar.B();
                if (obj == in.a.g()) {
                    f.c(this);
                }
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

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$getVersion$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AndroidScarManager.kt */
    @d(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$getVersion$2", f = "AndroidScarManager.kt", l = {42}, m = "invokeSuspend")
    public static final class C44542 extends SuspendLambda implements p<l0, c<? super String>, Object> {
        public int label;

        /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$getVersion$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: AndroidScarManager.kt */
        @d(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$getVersion$2$1", f = "AndroidScarManager.kt", l = {}, m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements p<e<? super String>, c<? super r>, Object> {
            public int label;
            public final /* synthetic */ AndroidScarManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AndroidScarManager androidScarManager, c<? super AnonymousClass1> cVar) {
                super(2, cVar);
                this.this$0 = androidScarManager;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
                return new AnonymousClass1(this.this$0, cVar);
            }

            @Override // sn.p
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final Object mo2invoke(@NotNull e<? super String> eVar, @Nullable c<? super r> cVar) {
                return ((AnonymousClass1) create(eVar, cVar)).invokeSuspend(r.f5635a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                in.a.g();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
                this.this$0.gmaBridge.getVersion();
                return r.f5635a;
            }
        }

        public C44542(c<? super C44542> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            return AndroidScarManager.this.new C44542(cVar);
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull l0 l0Var, @Nullable c<? super String> cVar) {
            return ((C44542) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = in.a.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                go.p pVarI = go.f.I(AndroidScarManager.this.scarEventReceiver.getVersionFlow(), new AnonymousClass1(AndroidScarManager.this, null));
                this.label = 1;
                obj = go.f.v(pVarI, this);
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

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidScarManager.kt */
    @d(c = "com.unity3d.ads.core.data.manager.AndroidScarManager", f = "AndroidScarManager.kt", l = {93}, m = com.safedk.android.analytics.brandsafety.creatives.discoveries.f.H)
    public static final class AnonymousClass1 extends ContinuationImpl {
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
            return AndroidScarManager.this.loadAd(null, null, null, null, null, 0, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AndroidScarManager.kt */
    @d(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$2", f = "AndroidScarManager.kt", l = {}, m = "invokeSuspend")
    public static final class C44552 extends SuspendLambda implements p<e<? super GmaEventData>, c<? super r>, Object> {
        public final /* synthetic */ String $adString;
        public final /* synthetic */ String $adUnitId;
        public final /* synthetic */ boolean $canSkip;
        public final /* synthetic */ String $placementId;
        public final /* synthetic */ String $queryId;
        public final /* synthetic */ int $videoLength;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44552(boolean z10, String str, String str2, String str3, String str4, int i10, c<? super C44552> cVar) {
            super(2, cVar);
            this.$canSkip = z10;
            this.$placementId = str;
            this.$queryId = str2;
            this.$adString = str3;
            this.$adUnitId = str4;
            this.$videoLength = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            return AndroidScarManager.this.new C44552(this.$canSkip, this.$placementId, this.$queryId, this.$adString, this.$adUnitId, this.$videoLength, cVar);
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull e<? super GmaEventData> eVar, @Nullable c<? super r> cVar) {
            return ((C44552) create(eVar, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            in.a.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            AndroidScarManager.this.gmaBridge.load(this.$canSkip, this.$placementId, this.$queryId, this.$adString, this.$adUnitId, AndroidScarManager.this.scarTimeHackFixer.invoke(this.$videoLength));
            return r.f5635a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$3, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidScarManager.kt */
    @d(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$3", f = "AndroidScarManager.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends SuspendLambda implements p<GmaEventData, c<? super Boolean>, Object> {
        public final /* synthetic */ String $placementId;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str, c<? super AnonymousClass3> cVar) {
            super(2, cVar);
            this.$placementId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$placementId, cVar);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull GmaEventData gmaEventData, @Nullable c<? super Boolean> cVar) {
            return ((AnonymousClass3) create(gmaEventData, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            in.a.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            GmaEventData gmaEventData = (GmaEventData) this.L$0;
            return jn.a.a((w.p(GMAEvent.AD_LOADED, GMAEvent.LOAD_ERROR).contains(gmaEventData.getGmaEvent()) && tn.p.f(gmaEventData.getPlacementId(), this.$placementId)) || w.p(GMAEvent.METHOD_ERROR, GMAEvent.SCAR_NOT_PRESENT, GMAEvent.INTERNAL_LOAD_ERROR).contains(gmaEventData.getGmaEvent()));
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AndroidScarManager.kt */
    @d(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$1", f = "AndroidScarManager.kt", l = {}, m = "invokeSuspend")
    public static final class C44561 extends SuspendLambda implements p<e<? super GmaEventData>, c<? super r>, Object> {
        public final /* synthetic */ UnityBannerSize $bannerSize;
        public final /* synthetic */ BannerView $bannerView;
        public final /* synthetic */ Context $context;
        public final /* synthetic */ String $opportunityId;
        public final /* synthetic */ cf.c $scarAdMetadata;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44561(Context context, BannerView bannerView, String str, cf.c cVar, UnityBannerSize unityBannerSize, c<? super C44561> cVar2) {
            super(2, cVar2);
            this.$context = context;
            this.$bannerView = bannerView;
            this.$opportunityId = str;
            this.$scarAdMetadata = cVar;
            this.$bannerSize = unityBannerSize;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            return AndroidScarManager.this.new C44561(this.$context, this.$bannerView, this.$opportunityId, this.$scarAdMetadata, this.$bannerSize, cVar);
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull e<? super GmaEventData> eVar, @Nullable c<? super r> cVar) {
            return ((C44561) create(eVar, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            in.a.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            AndroidScarManager.this.gmaBridge.loadBanner(this.$context, this.$bannerView, this.$opportunityId, this.$scarAdMetadata, this.$bannerSize);
            return r.f5635a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$show$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AndroidScarManager.kt */
    @d(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$show$1", f = "AndroidScarManager.kt", l = {}, m = "invokeSuspend")
    public static final class C44571 extends SuspendLambda implements p<e<? super GmaEventData>, c<? super r>, Object> {
        public final /* synthetic */ String $placementId;
        public final /* synthetic */ String $queryId;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44571(String str, String str2, c<? super C44571> cVar) {
            super(2, cVar);
            this.$placementId = str;
            this.$queryId = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            return AndroidScarManager.this.new C44571(this.$placementId, this.$queryId, cVar);
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull e<? super GmaEventData> eVar, @Nullable c<? super r> cVar) {
            return ((C44571) create(eVar, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            in.a.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            AndroidScarManager.this.gmaBridge.show(this.$placementId, this.$queryId);
            return r.f5635a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$show$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AndroidScarManager.kt */
    @d(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$show$2", f = "AndroidScarManager.kt", l = {127}, m = "invokeSuspend")
    public static final class C44582 extends SuspendLambda implements q<e<? super GmaEventData>, GmaEventData, c<? super Boolean>, Object> {
        private /* synthetic */ Object L$0;
        public /* synthetic */ Object L$1;
        public int label;

        public C44582(c<? super C44582> cVar) {
            super(3, cVar);
        }

        @Override // sn.q
        @Nullable
        public final Object invoke(@NotNull e<? super GmaEventData> eVar, @NotNull GmaEventData gmaEventData, @Nullable c<? super Boolean> cVar) {
            C44582 c44582 = new C44582(cVar);
            c44582.L$0 = eVar;
            c44582.L$1 = gmaEventData;
            return c44582.invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            GmaEventData gmaEventData;
            Object objG = in.a.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                e eVar = (e) this.L$0;
                GmaEventData gmaEventData2 = (GmaEventData) this.L$1;
                this.L$0 = gmaEventData2;
                this.label = 1;
                if (eVar.emit(gmaEventData2, this) == objG) {
                    return objG;
                }
                gmaEventData = gmaEventData2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gmaEventData = (GmaEventData) this.L$0;
                kotlin.c.b(obj);
            }
            return jn.a.a(!cn.r.P(new GMAEvent[]{GMAEvent.AD_CLOSED, GMAEvent.NO_AD_ERROR, GMAEvent.INTERSTITIAL_SHOW_ERROR, GMAEvent.REWARDED_SHOW_ERROR}, gmaEventData.getGmaEvent()));
        }
    }

    public AndroidScarManager(@NotNull CommonScarEventReceiver commonScarEventReceiver, @NotNull GMAScarAdapterBridge gMAScarAdapterBridge, @NotNull ScarTimeHackFixer scarTimeHackFixer) {
        tn.p.k(commonScarEventReceiver, "scarEventReceiver");
        tn.p.k(gMAScarAdapterBridge, "gmaBridge");
        tn.p.k(scarTimeHackFixer, "scarTimeHackFixer");
        this.scarEventReceiver = commonScarEventReceiver;
        this.gmaBridge = gMAScarAdapterBridge;
        this.scarTimeHackFixer = scarTimeHackFixer;
    }

    @Override // com.unity3d.ads.core.data.manager.ScarManager
    @Nullable
    public Object getSignals(@Nullable List<? extends AdFormatOuterClass.AdFormat> list, @NotNull c<? super BiddingSignals> cVar) {
        return TimeoutKt.e(ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT, new AnonymousClass2(list, this, null), cVar);
    }

    @Override // com.unity3d.ads.core.data.manager.ScarManager
    @Nullable
    public Object getVersion(@NotNull c<? super String> cVar) {
        return TimeoutKt.e(5000L, new C44542(null), cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // com.unity3d.ads.core.data.manager.ScarManager
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object loadAd(@org.jetbrains.annotations.NotNull java.lang.String r17, @org.jetbrains.annotations.NotNull java.lang.String r18, @org.jetbrains.annotations.NotNull java.lang.String r19, @org.jetbrains.annotations.NotNull java.lang.String r20, @org.jetbrains.annotations.NotNull java.lang.String r21, int r22, @org.jetbrains.annotations.NotNull hn.c<? super bn.r> r23) throws com.unity3d.ads.core.data.model.exception.LoadException {
        /*
            r16 = this;
            r9 = r16
            r0 = r23
            boolean r1 = r0 instanceof com.unity3d.ads.core.data.manager.AndroidScarManager.AnonymousClass1
            if (r1 == 0) goto L17
            r1 = r0
            com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$1 r1 = (com.unity3d.ads.core.data.manager.AndroidScarManager.AnonymousClass1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.label = r2
            goto L1c
        L17:
            com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$1 r1 = new com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$1
            r1.<init>(r0)
        L1c:
            r10 = r1
            java.lang.Object r0 = r10.result
            java.lang.Object r11 = in.a.g()
            int r1 = r10.label
            r12 = 0
            r13 = 1
            if (r1 == 0) goto L37
            if (r1 != r13) goto L2f
            kotlin.c.b(r0)
            goto L73
        L2f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L37:
            kotlin.c.b(r0)
            com.unity3d.scar.adapter.common.scarads.UnityAdFormat r0 = com.unity3d.scar.adapter.common.scarads.UnityAdFormat.INTERSTITIAL
            java.lang.String r0 = r0.toString()
            r1 = r17
            boolean r2 = bo.a0.J(r1, r0, r13)
            com.unity3d.ads.core.domain.scar.CommonScarEventReceiver r0 = r9.scarEventReceiver
            go.p r14 = r0.getGmaEventFlow()
            com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$2 r15 = new com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$2
            r8 = 0
            r0 = r15
            r1 = r16
            r3 = r18
            r4 = r21
            r5 = r19
            r6 = r20
            r7 = r22
            r0.<init>(r2, r3, r4, r5, r6, r7, r8)
            go.p r0 = go.f.I(r14, r15)
            com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$3 r1 = new com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$3
            r2 = r18
            r1.<init>(r2, r12)
            r10.label = r13
            java.lang.Object r0 = go.f.w(r0, r1, r10)
            if (r0 != r11) goto L73
            return r11
        L73:
            r1 = r0
            com.unity3d.ads.core.domain.scar.GmaEventData r1 = (com.unity3d.ads.core.domain.scar.GmaEventData) r1
            com.unity3d.scar.adapter.common.GMAEvent r1 = r1.getGmaEvent()
            com.unity3d.scar.adapter.common.GMAEvent r2 = com.unity3d.scar.adapter.common.GMAEvent.AD_LOADED
            r3 = 0
            if (r1 == r2) goto L80
            goto L81
        L80:
            r13 = r3
        L81:
            if (r13 == 0) goto L84
            r12 = r0
        L84:
            com.unity3d.ads.core.domain.scar.GmaEventData r12 = (com.unity3d.ads.core.domain.scar.GmaEventData) r12
            if (r12 == 0) goto La9
            com.unity3d.ads.core.data.model.exception.LoadException r0 = new com.unity3d.ads.core.data.model.exception.LoadException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Error loading SCAR ad: "
            r1.append(r2)
            java.lang.String r2 = r12.getErrorMessage()
            if (r2 != 0) goto L9e
            com.unity3d.scar.adapter.common.GMAEvent r2 = r12.getGmaEvent()
        L9e:
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r3, r1)
            throw r0
        La9:
            bn.r r0 = bn.r.f5635a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.manager.AndroidScarManager.loadAd(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, hn.c):java.lang.Object");
    }

    @Override // com.unity3d.ads.core.data.manager.ScarManager
    @NotNull
    public go.d<GmaEventData> loadBannerAd(@NotNull Context context, @NotNull BannerView bannerView, @NotNull cf.c cVar, @NotNull UnityBannerSize unityBannerSize, @NotNull final String str) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(bannerView, "bannerView");
        tn.p.k(cVar, "scarAdMetadata");
        tn.p.k(unityBannerSize, "bannerSize");
        tn.p.k(str, "opportunityId");
        final go.d dVarH = go.f.H(this.scarEventReceiver.getGmaEventFlow(), new C44561(context, bannerView, str, cVar, unityBannerSize, null));
        return new go.d<GmaEventData>() { // from class: com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1

            /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            public static final class AnonymousClass2<T> implements e {
                public final /* synthetic */ String $opportunityId$inlined;
                public final /* synthetic */ e $this_unsafeFlow;

                /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @d(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1$2", f = "AndroidScarManager.kt", l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {
                    public Object L$0;
                    public Object L$1;
                    public int label;
                    public /* synthetic */ Object result;

                    public AnonymousClass1(c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(e eVar, String str) {
                    this.$this_unsafeFlow = eVar;
                    this.$opportunityId$inlined = str;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // go.e
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r7, @org.jetbrains.annotations.NotNull hn.c r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1$2$1 r0 = (com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1$2$1 r0 = new com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.result
                        java.lang.Object r1 = in.a.g()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.c.b(r8)
                        goto L5b
                    L29:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L31:
                        kotlin.c.b(r8)
                        go.e r8 = r6.$this_unsafeFlow
                        r2 = r7
                        com.unity3d.ads.core.domain.scar.GmaEventData r2 = (com.unity3d.ads.core.domain.scar.GmaEventData) r2
                        com.unity3d.scar.adapter.common.GMAEvent r4 = r2.getGmaEvent()
                        com.unity3d.scar.adapter.common.GMAEvent r5 = com.unity3d.scar.adapter.common.GMAEvent.BANNER
                        if (r4 != r5) goto L4f
                        java.lang.String r2 = r2.getOpportunityId()
                        java.lang.String r4 = r6.$opportunityId$inlined
                        boolean r2 = tn.p.f(r2, r4)
                        if (r2 == 0) goto L4f
                        r2 = r3
                        goto L50
                    L4f:
                        r2 = 0
                    L50:
                        if (r2 == 0) goto L5b
                        r0.label = r3
                        java.lang.Object r7 = r8.emit(r7, r0)
                        if (r7 != r1) goto L5b
                        return r1
                    L5b:
                        bn.r r7 = bn.r.f5635a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, hn.c):java.lang.Object");
                }
            }

            @Override // go.d
            @Nullable
            public Object collect(@NotNull e<? super GmaEventData> eVar, @NotNull c cVar2) {
                Object objCollect = dVarH.collect(new AnonymousClass2(eVar, str), cVar2);
                return objCollect == in.a.g() ? objCollect : r.f5635a;
            }
        };
    }

    @Override // com.unity3d.ads.core.data.manager.ScarManager
    @NotNull
    public go.d<GmaEventData> show(@NotNull String str, @NotNull String str2) {
        tn.p.k(str, "placementId");
        tn.p.k(str2, HandleInvocationsFromAdViewer.KEY_QUERY_ID);
        return go.f.Q(go.f.I(this.scarEventReceiver.getGmaEventFlow(), new C44571(str, str2, null)), new C44582(null));
    }
}
