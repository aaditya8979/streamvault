package com.unity3d.ads.core.data.manager;

import bn.r;
import cn.w;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.f;
import com.unity3d.ads.core.domain.offerwall.OfferwallEventData;
import com.unity3d.services.ads.offerwall.OfferwallAdapterBridge;
import com.unity3d.services.ads.offerwall.OfferwallEvent;
import com.unity3d.services.core.log.DeviceLog;
import go.e;
import hn.c;
import java.lang.reflect.InvocationTargetException;
import jn.d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.p;
import sn.q;

/* JADX INFO: compiled from: AndroidOfferwallManager.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class AndroidOfferwallManager implements OfferwallManager {

    @NotNull
    private final OfferwallAdapterBridge offerwallBridge;

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidOfferwallManager.kt */
    @d(c = "com.unity3d.ads.core.data.manager.AndroidOfferwallManager", f = "AndroidOfferwallManager.kt", l = {28}, m = f.H)
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
            return AndroidOfferwallManager.this.loadAd(null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$2, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidOfferwallManager.kt */
    @d(c = "com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$2", f = "AndroidOfferwallManager.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements p<e<? super OfferwallEventData>, c<? super r>, Object> {
        public final /* synthetic */ String $placementName;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$placementName = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            return AndroidOfferwallManager.this.new AnonymousClass2(this.$placementName, cVar);
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull e<? super OfferwallEventData> eVar, @Nullable c<? super r> cVar) {
            return ((AnonymousClass2) create(eVar, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws IllegalAccessException, InvocationTargetException {
            in.a.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            AndroidOfferwallManager.this.offerwallBridge.loadAd(this.$placementName);
            return r.f5635a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$3, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidOfferwallManager.kt */
    @d(c = "com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$3", f = "AndroidOfferwallManager.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends SuspendLambda implements p<OfferwallEventData, c<? super Boolean>, Object> {
        public final /* synthetic */ String $placementName;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str, c<? super AnonymousClass3> cVar) {
            super(2, cVar);
            this.$placementName = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$placementName, cVar);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull OfferwallEventData offerwallEventData, @Nullable c<? super Boolean> cVar) {
            return ((AnonymousClass3) create(offerwallEventData, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            in.a.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            OfferwallEventData offerwallEventData = (OfferwallEventData) this.L$0;
            boolean z10 = false;
            if (w.p(OfferwallEvent.REQUEST_SUCCESS, OfferwallEvent.REQUEST_FAILED).contains(offerwallEventData.getOfferwallEvent()) && tn.p.f(offerwallEventData.getPlacementName(), this.$placementName)) {
                z10 = true;
            }
            return jn.a.a(z10);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidOfferwallManager$showAd$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AndroidOfferwallManager.kt */
    @d(c = "com.unity3d.ads.core.data.manager.AndroidOfferwallManager$showAd$1", f = "AndroidOfferwallManager.kt", l = {}, m = "invokeSuspend")
    public static final class C44521 extends SuspendLambda implements p<e<? super OfferwallEventData>, c<? super r>, Object> {
        public final /* synthetic */ String $placementName;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44521(String str, c<? super C44521> cVar) {
            super(2, cVar);
            this.$placementName = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            return AndroidOfferwallManager.this.new C44521(this.$placementName, cVar);
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull e<? super OfferwallEventData> eVar, @Nullable c<? super r> cVar) {
            return ((C44521) create(eVar, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws IllegalAccessException, InvocationTargetException {
            in.a.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            AndroidOfferwallManager.this.offerwallBridge.showAd(this.$placementName);
            return r.f5635a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidOfferwallManager$showAd$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AndroidOfferwallManager.kt */
    @d(c = "com.unity3d.ads.core.data.manager.AndroidOfferwallManager$showAd$2", f = "AndroidOfferwallManager.kt", l = {44}, m = "invokeSuspend")
    public static final class C44532 extends SuspendLambda implements q<e<? super OfferwallEventData>, OfferwallEventData, c<? super Boolean>, Object> {
        private /* synthetic */ Object L$0;
        public /* synthetic */ Object L$1;
        public int label;

        public C44532(c<? super C44532> cVar) {
            super(3, cVar);
        }

        @Override // sn.q
        @Nullable
        public final Object invoke(@NotNull e<? super OfferwallEventData> eVar, @NotNull OfferwallEventData offerwallEventData, @Nullable c<? super Boolean> cVar) {
            C44532 c44532 = new C44532(cVar);
            c44532.L$0 = eVar;
            c44532.L$1 = offerwallEventData;
            return c44532.invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            OfferwallEventData offerwallEventData;
            Object objG = in.a.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                e eVar = (e) this.L$0;
                OfferwallEventData offerwallEventData2 = (OfferwallEventData) this.L$1;
                this.L$0 = offerwallEventData2;
                this.label = 1;
                if (eVar.emit(offerwallEventData2, this) == objG) {
                    return objG;
                }
                offerwallEventData = offerwallEventData2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                offerwallEventData = (OfferwallEventData) this.L$0;
                kotlin.c.b(obj);
            }
            return jn.a.a(!cn.r.P(new OfferwallEvent[]{OfferwallEvent.ON_CONTENT_DISMISS, OfferwallEvent.SHOW_FAILED}, offerwallEventData.getOfferwallEvent()));
        }
    }

    public AndroidOfferwallManager(@NotNull OfferwallAdapterBridge offerwallAdapterBridge) {
        tn.p.k(offerwallAdapterBridge, "offerwallBridge");
        this.offerwallBridge = offerwallAdapterBridge;
    }

    @Override // com.unity3d.ads.core.data.manager.OfferwallManager
    @Nullable
    public Object getVersion(@NotNull c<? super String> cVar) {
        return this.offerwallBridge.getVersion();
    }

    @Override // com.unity3d.ads.core.data.manager.OfferwallManager
    @Nullable
    public Object isAdReady(@NotNull String str, @NotNull c<? super Boolean> cVar) {
        return jn.a.a(this.offerwallBridge.isAdReady(str));
    }

    @Override // com.unity3d.ads.core.data.manager.OfferwallManager
    @Nullable
    public Object isConnected(@NotNull c<? super Boolean> cVar) {
        return jn.a.a(this.offerwallBridge.isConnected());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.data.manager.OfferwallManager
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object loadAd(@org.jetbrains.annotations.NotNull java.lang.String r6, @org.jetbrains.annotations.NotNull hn.c<? super bn.r> r7) throws com.unity3d.ads.core.data.model.exception.LoadException {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.unity3d.ads.core.data.manager.AndroidOfferwallManager.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$1 r0 = (com.unity3d.ads.core.data.manager.AndroidOfferwallManager.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$1 r0 = new com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = in.a.g()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            kotlin.c.b(r7)
            goto L66
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            kotlin.c.b(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r2 = "Offerwall Manager - loadAd: "
            r7.append(r2)
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            com.unity3d.services.core.log.DeviceLog.debug(r7)
            com.unity3d.services.ads.offerwall.OfferwallAdapterBridge r7 = r5.offerwallBridge
            go.p r7 = r7.getOfferwallEventFlow()
            com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$2 r2 = new com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$2
            r2.<init>(r6, r3)
            go.p r7 = go.f.I(r7, r2)
            com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$3 r2 = new com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$3
            r2.<init>(r6, r3)
            r0.label = r4
            java.lang.Object r7 = go.f.w(r7, r2, r0)
            if (r7 != r1) goto L66
            return r1
        L66:
            r6 = r7
            com.unity3d.ads.core.domain.offerwall.OfferwallEventData r6 = (com.unity3d.ads.core.domain.offerwall.OfferwallEventData) r6
            com.unity3d.services.ads.offerwall.OfferwallEvent r6 = r6.getOfferwallEvent()
            com.unity3d.services.ads.offerwall.OfferwallEvent r0 = com.unity3d.services.ads.offerwall.OfferwallEvent.REQUEST_SUCCESS
            r1 = 0
            if (r6 == r0) goto L73
            goto L74
        L73:
            r4 = r1
        L74:
            if (r4 == 0) goto L77
            r3 = r7
        L77:
            com.unity3d.ads.core.domain.offerwall.OfferwallEventData r3 = (com.unity3d.ads.core.domain.offerwall.OfferwallEventData) r3
            if (r3 == 0) goto L9c
            com.unity3d.ads.core.data.model.exception.LoadException r6 = new com.unity3d.ads.core.data.model.exception.LoadException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Error loading offerwall ad: "
            r7.append(r0)
            java.lang.String r0 = r3.getErrorMessage()
            if (r0 != 0) goto L91
            com.unity3d.services.ads.offerwall.OfferwallEvent r0 = r3.getOfferwallEvent()
        L91:
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r6.<init>(r1, r7)
            throw r6
        L9c:
            bn.r r6 = bn.r.f5635a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.manager.AndroidOfferwallManager.loadAd(java.lang.String, hn.c):java.lang.Object");
    }

    @Override // com.unity3d.ads.core.data.manager.OfferwallManager
    @NotNull
    public go.d<OfferwallEventData> showAd(@NotNull String str) {
        tn.p.k(str, "placementName");
        DeviceLog.debug("Offerwall Manager - showAd: " + str);
        return go.f.Q(go.f.I(this.offerwallBridge.getOfferwallEventFlow(), new C44521(str, null)), new C44532(null));
    }
}
