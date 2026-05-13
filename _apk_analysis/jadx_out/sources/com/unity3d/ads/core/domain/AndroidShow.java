package com.unity3d.ads.core.domain;

import bn.r;
import com.google.protobuf.ByteString;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.core.configuration.GameServerIdReader;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.AdObjectState;
import com.unity3d.ads.core.data.model.ShowEvent;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import go.e;
import go.f;
import hn.c;
import jn.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.p;
import sn.q;

/* JADX INFO: compiled from: AndroidShow.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class AndroidShow implements Show {

    @NotNull
    private final AdRepository adRepository;

    @NotNull
    private final GameServerIdReader gameServerIdReader;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidShow$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidShow.kt */
    @d(c = "com.unity3d.ads.core.domain.AndroidShow$invoke$1", f = "AndroidShow.kt", l = {57}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<e<? super ShowEvent>, c<? super r>, Object> {
        public final /* synthetic */ AdObject $adObject;
        public final /* synthetic */ UnityAdsShowOptions $showOptions;
        private /* synthetic */ Object L$0;
        public int label;
        public final /* synthetic */ AndroidShow this$0;

        /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidShow$invoke$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: AndroidShow.kt */
        @d(c = "com.unity3d.ads.core.domain.AndroidShow$invoke$1$2", f = "AndroidShow.kt", l = {}, m = "invokeSuspend")
        public static final class AnonymousClass2 extends SuspendLambda implements p<e<? super ShowEvent>, c<? super r>, Object> {
            public final /* synthetic */ AdObject $ad;
            public final /* synthetic */ AdObject $adObject;
            public final /* synthetic */ UnityAdsShowOptions $showOptions;
            public int label;
            public final /* synthetic */ AndroidShow this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(AdObject adObject, AndroidShow androidShow, AdObject adObject2, UnityAdsShowOptions unityAdsShowOptions, c<? super AnonymousClass2> cVar) {
                super(2, cVar);
                this.$ad = adObject;
                this.this$0 = androidShow;
                this.$adObject = adObject2;
                this.$showOptions = unityAdsShowOptions;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
                return new AnonymousClass2(this.$ad, this.this$0, this.$adObject, this.$showOptions, cVar);
            }

            @Override // sn.p
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final Object mo2invoke(@NotNull e<? super ShowEvent> eVar, @Nullable c<? super r> cVar) {
                return ((AnonymousClass2) create(eVar, cVar)).invokeSuspend(r.f5635a);
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r14) throws org.json.JSONException {
                /*
                    r13 = this;
                    in.a.g()
                    int r0 = r13.label
                    if (r0 != 0) goto La6
                    kotlin.c.b(r14)
                    com.unity3d.ads.core.data.model.AdObject r14 = r13.$ad
                    com.unity3d.ads.core.domain.AndroidShow r0 = r13.this$0
                    com.unity3d.ads.core.configuration.GameServerIdReader r0 = com.unity3d.ads.core.domain.AndroidShow.access$getGameServerIdReader$p(r0)
                    com.unity3d.services.core.misc.JsonStorage r1 = r0.getJsonStorage()
                    java.lang.String r2 = r0.getKey()
                    java.lang.Object r1 = r1.get(r2)
                    java.lang.String r2 = "get(key)"
                    r3 = 0
                    if (r1 == 0) goto L2e
                    tn.p.j(r1, r2)
                    boolean r4 = r1 instanceof java.lang.String
                    if (r4 == 0) goto L2b
                    goto L2c
                L2b:
                    r1 = r3
                L2c:
                    if (r1 != 0) goto L2f
                L2e:
                    r1 = r3
                L2f:
                    com.unity3d.services.core.misc.JsonStorage r4 = r0.getJsonStorage()
                    java.lang.String r5 = r0.getKey()
                    java.lang.Object r4 = r4.get(r5)
                    if (r4 == 0) goto L4b
                    tn.p.j(r4, r2)
                    com.unity3d.services.core.misc.JsonStorage r2 = r0.getJsonStorage()
                    java.lang.String r0 = r0.getKey()
                    r2.delete(r0)
                L4b:
                    java.lang.String r1 = (java.lang.String) r1
                    r14.setPlayerServerId(r1)
                    com.unity3d.ads.core.data.model.AdObject r14 = r13.$adObject
                    go.l r14 = r14.getState()
                    com.unity3d.ads.core.data.model.AdObjectState r0 = com.unity3d.ads.core.data.model.AdObjectState.SHOWING
                    r14.setValue(r0)
                    com.unity3d.ads.core.data.model.AdObject r14 = r13.$ad
                    com.unity3d.ads.adplayer.AdPlayer r14 = r14.getAdPlayer()
                    com.unity3d.ads.UnityAdsShowOptions r0 = r13.$showOptions
                    if (r0 == 0) goto L6f
                    org.json.JSONObject r0 = r0.getData()
                    if (r0 == 0) goto L6f
                    java.util.Map r3 = com.unity3d.ads.core.extensions.JSONObjectExtensionsKt.toBuiltInMap(r0)
                L6f:
                    r5 = r3
                    com.unity3d.ads.core.data.model.AdObject r0 = r13.$ad
                    boolean r7 = r0.isScarAd()
                    com.unity3d.ads.core.data.model.AdObject r0 = r13.$ad
                    java.lang.String r9 = r0.getScarAdString()
                    com.unity3d.ads.core.data.model.AdObject r0 = r13.$ad
                    java.lang.String r8 = r0.getScarQueryId()
                    com.unity3d.ads.core.data.model.AdObject r0 = r13.$ad
                    java.lang.String r10 = r0.getScarAdUnitId()
                    com.unity3d.ads.core.data.model.AdObject r0 = r13.$ad
                    boolean r11 = r0.isOfferwallAd()
                    com.unity3d.ads.core.data.model.AdObject r0 = r13.$ad
                    java.lang.String r12 = r0.getOfferwallPlacementName()
                    com.unity3d.ads.core.data.model.AdObject r0 = r13.$ad
                    java.lang.String r6 = r0.getPlacementId()
                    com.unity3d.ads.adplayer.AndroidShowOptions r0 = new com.unity3d.ads.adplayer.AndroidShowOptions
                    r4 = r0
                    r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
                    r14.show(r0)
                    bn.r r14 = bn.r.f5635a
                    return r14
                La6:
                    java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r14.<init>(r0)
                    throw r14
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidShow.AnonymousClass1.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidShow$invoke$1$3, reason: invalid class name */
        /* JADX INFO: compiled from: AndroidShow.kt */
        @d(c = "com.unity3d.ads.core.domain.AndroidShow$invoke$1$3", f = "AndroidShow.kt", l = {}, m = "invokeSuspend")
        public static final class AnonymousClass3 extends SuspendLambda implements q<e<? super ShowEvent>, Throwable, c<? super r>, Object> {
            public final /* synthetic */ AdObject $adObject;
            public final /* synthetic */ ByteString $opportunityId;
            public int label;
            public final /* synthetic */ AndroidShow this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(AdObject adObject, AndroidShow androidShow, ByteString byteString, c<? super AnonymousClass3> cVar) {
                super(3, cVar);
                this.$adObject = adObject;
                this.this$0 = androidShow;
                this.$opportunityId = byteString;
            }

            @Override // sn.q
            @Nullable
            public final Object invoke(@NotNull e<? super ShowEvent> eVar, @Nullable Throwable th2, @Nullable c<? super r> cVar) {
                return new AnonymousClass3(this.$adObject, this.this$0, this.$opportunityId, cVar).invokeSuspend(r.f5635a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                in.a.g();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
                this.$adObject.getState().setValue(AdObjectState.COMPLETED);
                this.this$0.adRepository.removeAd(this.$opportunityId);
                return r.f5635a;
            }
        }

        /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidShow$invoke$1$4, reason: invalid class name */
        /* JADX INFO: compiled from: AndroidShow.kt */
        @d(c = "com.unity3d.ads.core.domain.AndroidShow$invoke$1$4", f = "AndroidShow.kt", l = {54}, m = "invokeSuspend")
        public static final class AnonymousClass4 extends SuspendLambda implements q<e<? super ShowEvent>, ShowEvent, c<? super Boolean>, Object> {
            private /* synthetic */ Object L$0;
            public /* synthetic */ Object L$1;
            public int label;

            public AnonymousClass4(c<? super AnonymousClass4> cVar) {
                super(3, cVar);
            }

            @Override // sn.q
            @Nullable
            public final Object invoke(@NotNull e<? super ShowEvent> eVar, @NotNull ShowEvent showEvent, @Nullable c<? super Boolean> cVar) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(cVar);
                anonymousClass4.L$0 = eVar;
                anonymousClass4.L$1 = showEvent;
                return anonymousClass4.invokeSuspend(r.f5635a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                ShowEvent showEvent;
                Object objG = in.a.g();
                int i10 = this.label;
                if (i10 == 0) {
                    kotlin.c.b(obj);
                    e eVar = (e) this.L$0;
                    ShowEvent showEvent2 = (ShowEvent) this.L$1;
                    this.L$0 = showEvent2;
                    this.label = 1;
                    if (eVar.emit(showEvent2, this) == objG) {
                        return objG;
                    }
                    showEvent = showEvent2;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    showEvent = (ShowEvent) this.L$0;
                    kotlin.c.b(obj);
                }
                return jn.a.a(((showEvent instanceof ShowEvent.Completed) || (showEvent instanceof ShowEvent.Error)) ? false : true);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AdObject adObject, AndroidShow androidShow, UnityAdsShowOptions unityAdsShowOptions, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$adObject = adObject;
            this.this$0 = androidShow;
            this.$showOptions = unityAdsShowOptions;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$adObject, this.this$0, this.$showOptions, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull e<? super ShowEvent> eVar, @Nullable c<? super r> cVar) {
            return ((AnonymousClass1) create(eVar, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = in.a.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                final e eVar = (e) this.L$0;
                if (!(!this.$adObject.getOpportunityId().isEmpty())) {
                    throw new IllegalArgumentException("No opportunityId".toString());
                }
                ByteString opportunityId = this.$adObject.getOpportunityId();
                AdObject ad2 = this.this$0.adRepository.getAd(opportunityId);
                if (ad2 == null) {
                    throw new IllegalStateException("No ad associated with opportunityId");
                }
                SendDiagnosticEvent.DefaultImpls.invoke$default(this.this$0.sendDiagnosticEvent, "native_show_started_ad_viewer", null, null, null, this.$adObject, null, 46, null);
                AdPlayer adPlayer = ad2.getAdPlayer();
                if (adPlayer == null) {
                    throw new IllegalStateException("No adPlayer associated with ad");
                }
                go.d dVarQ = f.Q(f.F(f.H(adPlayer.getOnShowEvent(), new AnonymousClass2(ad2, this.this$0, this.$adObject, this.$showOptions, null)), new AnonymousClass3(this.$adObject, this.this$0, opportunityId, null)), new AnonymousClass4(null));
                e eVar2 = new e() { // from class: com.unity3d.ads.core.domain.AndroidShow.invoke.1.5
                    @Nullable
                    public final Object emit(@NotNull ShowEvent showEvent, @NotNull c<? super r> cVar) {
                        Object objEmit = eVar.emit(showEvent, cVar);
                        return objEmit == in.a.g() ? objEmit : r.f5635a;
                    }

                    @Override // go.e
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, c cVar) {
                        return emit((ShowEvent) obj2, (c<? super r>) cVar);
                    }
                };
                this.label = 1;
                if (dVarQ.collect(eVar2, this) == objG) {
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

    public AndroidShow(@NotNull AdRepository adRepository, @NotNull GameServerIdReader gameServerIdReader, @NotNull SendDiagnosticEvent sendDiagnosticEvent) {
        tn.p.k(adRepository, "adRepository");
        tn.p.k(gameServerIdReader, "gameServerIdReader");
        tn.p.k(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.adRepository = adRepository;
        this.gameServerIdReader = gameServerIdReader;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    @Override // com.unity3d.ads.core.domain.Show
    @NotNull
    public go.d<ShowEvent> invoke(@NotNull AdObject adObject, @Nullable UnityAdsShowOptions unityAdsShowOptions) {
        tn.p.k(adObject, "adObject");
        return f.z(new AnonymousClass1(adObject, this, unityAdsShowOptions, null));
    }

    @Override // com.unity3d.ads.core.domain.Show
    @Nullable
    public Object terminate(@NotNull AdObject adObject, @NotNull c<? super r> cVar) {
        Object objDestroy;
        AdPlayer adPlayer = adObject.getAdPlayer();
        return (adPlayer == null || (objDestroy = adPlayer.destroy(cVar)) != in.a.g()) ? r.f5635a : objDestroy;
    }
}
