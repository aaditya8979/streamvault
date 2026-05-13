package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.reflect.KFunction;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    public static final class a implements sn.p<Composer, Integer, bn.r> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ BoxScope f48895b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i f48896c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ sn.c<BoxScope, Boolean, Boolean, sn.a<bn.r>, sn.l<? super a.AbstractC0696a.c, bn.r>, Boolean, bn.k, bn.k, sn.a<bn.r>, Composer, Integer, bn.r> f48897d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f48898e;

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0637a extends FunctionReferenceImpl implements sn.a<bn.r> {
            public C0637a(Object obj) {
                super(0, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.class, "goNextAdPartOrDismissAd", "goNextAdPartOrDismissAd()V", 0);
            }

            public final void a() {
                ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i) this.receiver).x();
            }

            @Override // sn.a
            public /* bridge */ /* synthetic */ bn.r invoke() {
                a();
                return bn.r.f5635a;
            }
        }

        public /* synthetic */ class b extends FunctionReferenceImpl implements sn.l<a.AbstractC0696a.c, bn.r> {
            public b(Object obj) {
                super(1, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.class, "onButtonRendered", "onButtonRendered(Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/CustomUserEventBuilderService$UserInteraction$Button;)V", 0);
            }

            public final void a(a.AbstractC0696a.c cVar) {
                tn.p.k(cVar, "p0");
                ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i) this.receiver).l(cVar);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ bn.r invoke(a.AbstractC0696a.c cVar) {
                a(cVar);
                return bn.r.f5635a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(BoxScope boxScope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i iVar, sn.c<? super BoxScope, ? super Boolean, ? super Boolean, ? super sn.a<bn.r>, ? super sn.l<? super a.AbstractC0696a.c, bn.r>, ? super Boolean, ? super bn.k, ? super bn.k, ? super sn.a<bn.r>, ? super Composer, ? super Integer, bn.r> cVar, boolean z10) {
            this.f48895b = boxScope;
            this.f48896c = iVar;
            this.f48897d = cVar;
            this.f48898e = z10;
        }

        @Composable
        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-880292845, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.AdGoNextButton.<anonymous>.<anonymous> (AdGoNextButton.kt:54)");
            }
            BoxScope boxScope = this.f48895b;
            go.u<d.a> uVarL = this.f48896c.l();
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i iVar = this.f48896c;
            composer.startReplaceableGroup(328190741);
            boolean zChanged = composer.changed(iVar);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new C0637a(iVar);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            sn.a aVar = (sn.a) ((KFunction) objRememberedValue);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i iVar2 = this.f48896c;
            composer.startReplaceableGroup(328192462);
            boolean zChanged2 = composer.changed(iVar2);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new b(iVar2);
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceableGroup();
            e.g(boxScope, uVarL, aVar, (sn.l) ((KFunction) objRememberedValue2), this.f48897d, this.f48898e, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // sn.p
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ bn.r mo2invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return bn.r.f5635a;
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.AdGoNextButtonKt$GoNextButton$1$1", f = "AdGoNextButton.kt", l = {94}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f48899a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ State<d.a> f48900b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MutableState<Integer> f48901c;

        public static final class a<T> implements go.e {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MutableState<Integer> f48902b;

            public a(MutableState<Integer> mutableState) {
                this.f48902b = mutableState;
            }

            public final Object a(int i10, hn.c<? super bn.r> cVar) {
                e.h(this.f48902b, i10);
                return bn.r.f5635a;
            }

            @Override // go.e
            public /* bridge */ /* synthetic */ Object emit(Object obj, hn.c cVar) {
                return a(((Number) obj).intValue(), cVar);
            }
        }

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e$b$b, reason: collision with other inner class name */
        public static final class C0638b implements go.d<Integer> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ go.d f48903b;

            /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e$b$b$a */
            public static final class a<T> implements go.e {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ go.e f48904b;

                /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e$b$b$a$a, reason: collision with other inner class name */
                @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.AdGoNextButtonKt$GoNextButton$1$1$invokeSuspend$$inlined$filter$1$2", f = "AdGoNextButton.kt", l = {50}, m = "emit")
                public static final class C0639a extends ContinuationImpl {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public /* synthetic */ Object f48905a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public int f48906b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public Object f48907c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public Object f48908d;

                    public C0639a(hn.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f48905a = obj;
                        this.f48906b |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(go.e eVar) {
                    this.f48904b = eVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // go.e
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, hn.c r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e.b.C0638b.a.C0639a
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e$b$b$a$a r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e.b.C0638b.a.C0639a) r0
                        int r1 = r0.f48906b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f48906b = r1
                        goto L18
                    L13:
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e$b$b$a$a r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e$b$b$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f48905a
                        java.lang.Object r1 = in.a.g()
                        int r2 = r0.f48906b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.c.b(r6)
                        goto L48
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.c.b(r6)
                        go.e r6 = r4.f48904b
                        r2 = r5
                        java.lang.Number r2 = (java.lang.Number) r2
                        int r2 = r2.intValue()
                        if (r2 <= 0) goto L48
                        r0.f48906b = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L48
                        return r1
                    L48:
                        bn.r r5 = bn.r.f5635a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e.b.C0638b.a.emit(java.lang.Object, hn.c):java.lang.Object");
                }
            }

            public C0638b(go.d dVar) {
                this.f48903b = dVar;
            }

            @Override // go.d
            public Object collect(go.e<? super Integer> eVar, hn.c cVar) {
                Object objCollect = this.f48903b.collect(new a(eVar), cVar);
                return objCollect == in.a.g() ? objCollect : bn.r.f5635a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(State<? extends d.a> state, MutableState<Integer> mutableState, hn.c<? super b> cVar) {
            super(2, cVar);
            this.f48900b = state;
            this.f48901c = mutableState;
        }

        public static final int a(State state) {
            d.a aVarE = e.e(state);
            d.a.b bVar = aVarE instanceof d.a.b ? (d.a.b) aVarE : null;
            if (bVar != null) {
                return bVar.a();
            }
            return 0;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((b) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return new b(this.f48900b, this.f48901c, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f48899a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                final State<d.a> state = this.f48900b;
                go.d dVarN = go.f.N(new C0638b(SnapshotStateKt.snapshotFlow(new sn.a() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q
                    @Override // sn.a
                    public final Object invoke() {
                        return Integer.valueOf(e.b.a(state));
                    }
                })), 1);
                a aVar = new a(this.f48901c);
                this.f48899a = 1;
                if (dVarN.collect(aVar, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            return bn.r.f5635a;
        }
    }

    public static final int a(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    public static final bn.r b() {
        return bn.r.f5635a;
    }

    public static final bn.r c(BoxScope boxScope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i iVar, i.a aVar, sn.c cVar, sn.c cVar2, sn.c cVar3, int i10, int i11, Composer composer, int i12) {
        f(boxScope, iVar, aVar, cVar, cVar2, cVar3, composer, i10 | 1, i11);
        return bn.r.f5635a;
    }

    public static final bn.r d(BoxScope boxScope, go.u uVar, sn.a aVar, sn.l lVar, sn.c cVar, boolean z10, int i10, Composer composer, int i11) {
        g(boxScope, uVar, aVar, lVar, cVar, z10, composer, i10 | 1);
        return bn.r.f5635a;
    }

    public static final d.a e(State<? extends d.a> state) {
        return state.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010e  */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(@org.jetbrains.annotations.NotNull final androidx.compose.foundation.layout.BoxScope r13, @org.jetbrains.annotations.NotNull final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i r14, @org.jetbrains.annotations.Nullable final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a r15, @org.jetbrains.annotations.Nullable final sn.c<? super androidx.compose.foundation.layout.BoxScope, ? super java.lang.Boolean, ? super java.lang.Boolean, ? super sn.a<bn.r>, ? super sn.l<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0696a.c, bn.r>, ? super java.lang.Boolean, ? super bn.k, ? super bn.k, ? super sn.a<bn.r>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, bn.r> r16, @org.jetbrains.annotations.Nullable final sn.c<? super androidx.compose.foundation.layout.BoxScope, ? super java.lang.Boolean, ? super java.lang.Boolean, ? super sn.a<bn.r>, ? super sn.l<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0696a.c, bn.r>, ? super java.lang.Boolean, ? super bn.k, ? super bn.k, ? super sn.a<bn.r>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, bn.r> r17, @org.jetbrains.annotations.Nullable sn.c<? super androidx.compose.foundation.layout.BoxScope, ? super java.lang.Boolean, ? super java.lang.Boolean, ? super sn.a<bn.r>, ? super sn.l<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0696a.c, bn.r>, ? super java.lang.Boolean, ? super bn.k, ? super bn.k, ? super sn.a<bn.r>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, bn.r> r18, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r19, final int r20, final int r21) {
        /*
            Method dump skipped, instruction units count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e.f(androidx.compose.foundation.layout.BoxScope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i$a, sn.c, sn.c, sn.c, androidx.compose.runtime.Composer, int, int):void");
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void g(final BoxScope boxScope, final go.u<? extends d.a> uVar, final sn.a<bn.r> aVar, final sn.l<? super a.AbstractC0696a.c, bn.r> lVar, final sn.c<? super BoxScope, ? super Boolean, ? super Boolean, ? super sn.a<bn.r>, ? super sn.l<? super a.AbstractC0696a.c, bn.r>, ? super Boolean, ? super bn.k, ? super bn.k, ? super sn.a<bn.r>, ? super Composer, ? super Integer, bn.r> cVar, final boolean z10, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(706979519);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changed(uVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.changed(aVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.changed(lVar) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= composerStartRestartGroup.changed(cVar) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(z10) ? 131072 : 65536;
        }
        if ((74899 & i11) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(706979519, i11, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.GoNextButton (AdGoNextButton.kt:83)");
            }
            State stateCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(uVar, (LifecycleOwner) null, (Lifecycle.State) null, (kotlin.coroutines.d) null, composerStartRestartGroup, (i11 >> 3) & 14, 7);
            composerStartRestartGroup.startReplaceableGroup(-2101080690);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            bn.r rVar = bn.r.f5635a;
            composerStartRestartGroup.startReplaceableGroup(-2101078598);
            boolean zChanged = composerStartRestartGroup.changed(stateCollectAsStateWithLifecycle) | composerStartRestartGroup.changed(mutableState);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new b(stateCollectAsStateWithLifecycle, mutableState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(rVar, (sn.p<? super p000do.l0, ? super hn.c<? super bn.r>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 6);
            int iB = bn.k.b(a(mutableState));
            d.a aVarE = e(stateCollectAsStateWithLifecycle);
            d.a.b bVar = aVarE instanceof d.a.b ? (d.a.b) aVarE : null;
            int iB2 = bn.k.b(bVar != null ? bVar.a() : 0);
            Boolean boolValueOf = Boolean.valueOf(e(stateCollectAsStateWithLifecycle) instanceof d.a.C0683a);
            Boolean boolValueOf2 = Boolean.valueOf(!(e(stateCollectAsStateWithLifecycle) instanceof d.a.c));
            Boolean boolValueOf3 = Boolean.valueOf(z10);
            bn.k kVarA = bn.k.a(iB);
            bn.k kVarA2 = bn.k.a(iB2);
            composerStartRestartGroup.startReplaceableGroup(-2101047518);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new sn.a() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.o
                    @Override // sn.a
                    public final Object invoke() {
                        return e.b();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            int i12 = i11 << 3;
            cVar.invoke(boxScope, boolValueOf, boolValueOf2, aVar, lVar, boolValueOf3, kVarA, kVarA2, (sn.a) objRememberedValue3, composerStartRestartGroup, Integer.valueOf((i11 & 14) | 100663296 | (i12 & 7168) | (i12 & 57344) | (458752 & i11) | ((i11 << 15) & 1879048192)));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new sn.p() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.p
                @Override // sn.p
                /* JADX INFO: renamed from: invoke */
                public final Object mo2invoke(Object obj, Object obj2) {
                    return e.d(boxScope, uVar, aVar, lVar, cVar, z10, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void h(MutableState<Integer> mutableState, int i10) {
        mutableState.setValue(Integer.valueOf(i10));
    }
}
