package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.profileinstaller.ProfileVerifier;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class h {

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.LinearKt$Linear$1$1", f = "Linear.kt", l = {43}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f50188a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.m f50189b;

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h$a$a, reason: collision with other inner class name */
        @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.LinearKt$Linear$1$1$1", f = "Linear.kt", l = {}, m = "invokeSuspend")
        public static final class C0672a extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super bn.r>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f50190a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.m f50191b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0672a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.m mVar, hn.c<? super C0672a> cVar) {
                super(2, cVar);
                this.f50191b = mVar;
            }

            @Override // sn.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super bn.r> cVar) {
                return ((C0672a) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
                return new C0672a(this.f50191b, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                in.a.g();
                if (this.f50190a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
                this.f50191b.b();
                return bn.r.f5635a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.m mVar, hn.c<? super a> cVar) {
            super(2, cVar);
            this.f50189b = mVar;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((a) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return new a(this.f50189b, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f50188a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                kotlin.coroutines.d main = com.moloco.sdk.internal.scheduling.c.a().getMain();
                C0672a c0672a = new C0672a(this.f50189b, null);
                this.f50188a = 1;
                if (p000do.g.g(main, c0672a, this) == objG) {
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

    public /* synthetic */ class b extends FunctionReferenceImpl implements sn.l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l, bn.r> {
        public b(Object obj) {
            super(1, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.m.class, "onError", "onError(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/VastAdShowError;)V", 0);
        }

        public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l lVar) {
            tn.p.k(lVar, "p0");
            ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.m) this.receiver).h(lVar);
        }

        @Override // sn.l
        public /* bridge */ /* synthetic */ bn.r invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l lVar) {
            a(lVar);
            return bn.r.f5635a;
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.LinearKt$Linear$2$5$1", f = "Linear.kt", l = {93}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements sn.p<PointerInputScope, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f50192a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f50193b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ sn.a<bn.r> f50194c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.m f50195d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(sn.a<bn.r> aVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.m mVar, hn.c<? super c> cVar) {
            super(2, cVar);
            this.f50194c = aVar;
            this.f50195d = mVar;
        }

        public static final bn.r a(sn.a aVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.m mVar, Offset offset, Offset offset2) {
            if (aVar != null) {
                aVar.invoke();
            } else {
                mVar.j(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.c.f49253a.c(offset.getPackedValue()));
            }
            return bn.r.f5635a;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(PointerInputScope pointerInputScope, hn.c<? super bn.r> cVar) {
            return ((c) create(pointerInputScope, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            c cVar2 = new c(this.f50194c, this.f50195d, cVar);
            cVar2.f50193b = obj;
            return cVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f50192a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                PointerInputScope pointerInputScope = (PointerInputScope) this.f50193b;
                final sn.a<bn.r> aVar = this.f50194c;
                final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.m mVar = this.f50195d;
                sn.p pVar = new sn.p() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x
                    @Override // sn.p
                    /* JADX INFO: renamed from: invoke */
                    public final Object mo2invoke(Object obj2, Object obj3) {
                        return h.c.a(aVar, mVar, (Offset) obj2, (Offset) obj3);
                    }
                };
                this.f50192a = 1;
                if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b.b(pointerInputScope, pVar, this) == objG) {
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

    public /* synthetic */ class d extends FunctionReferenceImpl implements sn.l<Boolean, bn.r> {
        public d(Object obj) {
            super(1, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.m.class, "onMuteChange", "onMuteChange(Z)V", 0);
        }

        public final void a(boolean z10) {
            ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.m) this.receiver).c(z10);
        }

        @Override // sn.l
        public /* bridge */ /* synthetic */ bn.r invoke(Boolean bool) {
            a(bool.booleanValue());
            return bn.r.f5635a;
        }
    }

    public /* synthetic */ class e extends FunctionReferenceImpl implements sn.a<bn.r> {
        public e(Object obj) {
            super(0, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.m.class, "onVastPrivacyIconDisplayed", "onVastPrivacyIconDisplayed()V", 0);
        }

        public final void a() {
            ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.m) this.receiver).i();
        }

        @Override // sn.a
        public /* bridge */ /* synthetic */ bn.r invoke() {
            a();
            return bn.r.f5635a;
        }
    }

    public /* synthetic */ class f extends FunctionReferenceImpl implements sn.a<bn.r> {
        public f(Object obj) {
            super(0, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.m.class, "onVastPrivacyIconClick", "onVastPrivacyIconClick()V", 0);
        }

        public final void a() {
            ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.m) this.receiver).u();
        }

        @Override // sn.a
        public /* bridge */ /* synthetic */ bn.r invoke() {
            a();
            return bn.r.f5635a;
        }
    }

    public static final class g implements sn.t<BoxScope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, sn.a<? extends bn.r>, sn.a<? extends bn.r>, Composer, Integer, bn.r> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Alignment f50196b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ PaddingValues f50197c;

        public static final class a implements sn.q<AnimatedVisibilityScope, Composer, Integer, bn.r> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j f50198b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ sn.a<bn.r> f50199c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ sn.a<bn.r> f50200d;

            public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j jVar, sn.a<bn.r> aVar, sn.a<bn.r> aVar2) {
                this.f50198b = jVar;
                this.f50199c = aVar;
                this.f50200d = aVar2;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void a(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, int i10) {
                tn.p.k(animatedVisibilityScope, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(989733896, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultVastIcon.<anonymous>.<anonymous> (Linear.kt:155)");
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j jVar = this.f50198b;
                if (jVar != null) {
                    l.b(jVar, this.f50199c, this.f50200d, null, composer, 0, 8);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // sn.q
            public /* bridge */ /* synthetic */ bn.r invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
                a(animatedVisibilityScope, composer, num.intValue());
                return bn.r.f5635a;
            }
        }

        public g(Alignment alignment, PaddingValues paddingValues) {
            this.f50196b = alignment;
            this.f50197c = paddingValues;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void a(BoxScope boxScope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j jVar, sn.a<bn.r> aVar, sn.a<bn.r> aVar2, Composer composer, int i10) {
            int i11;
            tn.p.k(boxScope, "<this>");
            tn.p.k(aVar, "onDisplayed");
            tn.p.k(aVar2, "onClick");
            if ((i10 & 6) == 0) {
                i11 = (composer.changed(boxScope) ? 4 : 2) | i10;
            } else {
                i11 = i10;
            }
            if ((i10 & 48) == 0) {
                i11 |= composer.changed(jVar) ? 32 : 16;
            }
            if ((i10 & 384) == 0) {
                i11 |= composer.changed(aVar) ? 256 : 128;
            }
            if ((i10 & 3072) == 0) {
                i11 |= composer.changed(aVar2) ? 2048 : 1024;
            }
            if ((i11 & 9363) == 9362 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-903645392, i11, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultVastIcon.<anonymous> (Linear.kt:149)");
            }
            AnimatedVisibilityKt.AnimatedVisibility(jVar != null, PaddingKt.padding(boxScope.align(Modifier.INSTANCE, this.f50196b), this.f50197c), (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(composer, 989733896, true, new a(jVar, aVar, aVar2)), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 28);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // sn.t
        public /* bridge */ /* synthetic */ bn.r invoke(BoxScope boxScope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j jVar, sn.a<? extends bn.r> aVar, sn.a<? extends bn.r> aVar2, Composer composer, Integer num) {
            a(boxScope, jVar, aVar, aVar2, composer, num.intValue());
            return bn.r.f5635a;
        }
    }

    public static final bn.r a(MutableState mutableState, boolean z10) {
        k(mutableState, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p(Boolean.valueOf(z10)));
        return bn.r.f5635a;
    }

    public static final bn.r b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.m mVar, MutableState mutableState, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar) {
        tn.p.k(iVar, "it");
        mVar.m(iVar);
        j(mutableState, iVar);
        return bn.r.f5635a;
    }

    public static final bn.r c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.m mVar, MutableState mutableState, boolean z10) {
        mVar.p(z10);
        m(mutableState, z10);
        return bn.r.f5635a;
    }

    public static final bn.r d(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.m mVar, a.AbstractC0696a.c cVar, a.AbstractC0696a.c.EnumC0698a enumC0698a) {
        tn.p.k(cVar, "button");
        tn.p.k(enumC0698a, "buttonType");
        mVar.l(cVar);
        mVar.o(enumC0698a);
        return bn.r.f5635a;
    }

    public static final bn.r e(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.m mVar, sn.a aVar, Modifier modifier, sn.u uVar, sn.s sVar, sn.t tVar, sn.u uVar2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c0 c0Var, sn.a aVar2, int i10, int i11, Composer composer, int i12) {
        l(mVar, aVar, modifier, uVar, sVar, tVar, uVar2, c0Var, aVar2, composer, i10 | 1, i11);
        return bn.r.f5635a;
    }

    public static final bn.r f(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.m mVar, boolean z10) {
        if (z10) {
            mVar.D();
        } else {
            mVar.F();
        }
        return bn.r.f5635a;
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p<Boolean> g(MutableState<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p<Boolean>> mutableState) {
        return mutableState.getValue();
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p<Long> h(State<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p<Long>> state) {
        return state.getValue();
    }

    @Composable
    @NotNull
    public static final sn.t<BoxScope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, sn.a<bn.r>, sn.a<bn.r>, Composer, Integer, bn.r> i(@Nullable Alignment alignment, @Nullable PaddingValues paddingValues, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(-1318345093);
        if ((i11 & 1) != 0) {
            alignment = Alignment.INSTANCE.getBottomStart();
        }
        if ((i11 & 2) != 0) {
            paddingValues = PaddingKt.m404PaddingValues0680j_4(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.a());
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1318345093, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultVastIcon (Linear.kt:148)");
        }
        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, -903645392, true, new g(alignment, paddingValues));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return composableLambda;
    }

    public static final void j(MutableState<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i> mutableState, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar) {
        mutableState.setValue(iVar);
    }

    public static final void k(MutableState<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p<Boolean>> mutableState, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p<Boolean> pVar) {
        mutableState.setValue(pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:209:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fb  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void l(@org.jetbrains.annotations.NotNull final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.m r33, @org.jetbrains.annotations.Nullable final sn.a<bn.r> r34, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r35, @org.jetbrains.annotations.Nullable final sn.u<? super androidx.compose.foundation.layout.BoxScope, ? super java.lang.Boolean, ? super java.lang.Boolean, ? super sn.p<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0696a.c, ? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0696a.c.EnumC0698a, bn.r>, ? super sn.l<? super java.lang.Boolean, bn.r>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, bn.r> r36, @org.jetbrains.annotations.Nullable final sn.s<? super androidx.compose.foundation.layout.BoxScope, ? super java.lang.Boolean, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, bn.r> r37, @org.jetbrains.annotations.Nullable final sn.t<? super androidx.compose.foundation.layout.BoxScope, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, ? super sn.a<bn.r>, ? super sn.a<bn.r>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, bn.r> r38, @org.jetbrains.annotations.Nullable final sn.u<? super androidx.compose.foundation.layout.BoxScope, ? super java.lang.Boolean, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, ? super sn.l<? super java.lang.Boolean, bn.r>, ? super sn.a<bn.r>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, bn.r> r39, @org.jetbrains.annotations.NotNull final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c0 r40, @org.jetbrains.annotations.NotNull final sn.a<bn.r> r41, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r42, final int r43, final int r44) {
        /*
            Method dump skipped, instruction units count: 1332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h.l(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.m, sn.a, androidx.compose.ui.Modifier, sn.u, sn.s, sn.t, sn.u, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c0, sn.a, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void m(MutableState<Boolean> mutableState, boolean z10) {
        mutableState.setValue(Boolean.valueOf(z10));
    }

    public static final boolean n(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final boolean o(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i p(MutableState<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i> mutableState) {
        return mutableState.getValue();
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j q(State<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j> state) {
        return state.getValue();
    }
}
