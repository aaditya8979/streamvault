package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.g;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final kotlin.coroutines.d f50362a = com.moloco.sdk.internal.scheduling.c.a().getMain();

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastVideoPlayerKt$VastVideoPlayer$1$1$jobs$1", f = "VastVideoPlayer.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements sn.p<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f50363a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f50364b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f50365c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f50366d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.h f50367e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ State<sn.l<Boolean, bn.r>> f50368f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ State<sn.l<Boolean, bn.r>> f50369g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.h hVar, State<? extends sn.l<? super Boolean, bn.r>> state, State<? extends sn.l<? super Boolean, bn.r>> state2, hn.c<? super a> cVar) {
            super(2, cVar);
            this.f50365c = mutableState;
            this.f50366d = mutableState2;
            this.f50367e = hVar;
            this.f50368f = state;
            this.f50369g = state2;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a aVar, hn.c<? super bn.r> cVar) {
            return ((a) create(aVar, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            a aVar = new a(this.f50365c, this.f50366d, this.f50367e, this.f50368f, this.f50369g, cVar);
            aVar.f50364b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f50363a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a aVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a) this.f50364b;
            q.e(this.f50368f).invoke(jn.a.a(aVar.d()));
            this.f50365c.setValue(jn.a.a(aVar.d()));
            this.f50366d.setValue(jn.a.a(aVar.c()));
            q.i(this.f50369g).invoke(jn.a.a(aVar.e()));
            View viewN = this.f50367e.N();
            if (viewN != null) {
                viewN.setKeepScreenOn(aVar.c());
            }
            return bn.r.f5635a;
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastVideoPlayerKt$VastVideoPlayer$1$1$jobs$2", f = "VastVideoPlayer.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements sn.p<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f50370a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f50371b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ State<sn.l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, bn.r>> f50372c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(State<? extends sn.l<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, bn.r>> state, hn.c<? super b> cVar) {
            super(2, cVar);
            this.f50372c = state;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar, hn.c<? super bn.r> cVar) {
            return ((b) create(iVar, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            b bVar = new b(this.f50372c, cVar);
            bVar.f50371b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f50370a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            q.l(this.f50372c).invoke((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i) this.f50371b);
            return bn.r.f5635a;
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastVideoPlayerKt$VastVideoPlayer$1$1$jobs$3", f = "VastVideoPlayer.kt", l = {}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements sn.p<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f50373a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f50374b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ State<sn.l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l, bn.r>> f50375c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(State<? extends sn.l<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l, bn.r>> state, hn.c<? super c> cVar) {
            super(2, cVar);
            this.f50375c = state;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l lVar, hn.c<? super bn.r> cVar) {
            return ((c) create(lVar, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            c cVar2 = new c(this.f50375c, cVar);
            cVar2.f50374b = obj;
            return cVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f50373a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            q.n(this.f50375c).invoke((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l) this.f50374b);
            return bn.r.f5635a;
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastVideoPlayerKt$VastVideoPlayer$2$1", f = "VastVideoPlayer.kt", l = {112, 114}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f50376a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f50377b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.h f50378c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.h hVar, hn.c<? super d> cVar) {
            super(2, cVar);
            this.f50378c = hVar;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((d) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return new d(this.f50378c, cVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x005e  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = in.a.g()
                int r1 = r7.f50377b
                r2 = 0
                r3 = 2
                r4 = 4
                r5 = 1
                if (r1 == 0) goto L29
                if (r1 == r5) goto L20
                if (r1 != r3) goto L18
                java.lang.Object r0 = r7.f50376a
                android.view.View r0 = (android.view.View) r0
                kotlin.c.b(r8)
                goto L57
            L18:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L20:
                java.lang.Object r1 = r7.f50376a
                android.view.View r1 = (android.view.View) r1
                kotlin.c.b(r8)
                r8 = r1
                goto L44
            L29:
                kotlin.c.b(r8)
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.h r8 = r7.f50378c
                android.view.View r8 = r8.N()
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.h r1 = r7.f50378c
                if (r8 == 0) goto L39
                r8.setVisibility(r4)
            L39:
                r7.f50376a = r8
                r7.f50377b = r5
                java.lang.Object r1 = r1.a(r7)
                if (r1 != r0) goto L44
                return r0
            L44:
                if (r8 == 0) goto L49
                r8.setVisibility(r2)
            L49:
                r7.f50376a = r8
                r7.f50377b = r3
                r5 = 50
                java.lang.Object r1 = p000do.s0.a(r5, r7)
                if (r1 != r0) goto L56
                return r0
            L56:
                r0 = r8
            L57:
                if (r0 == 0) goto L5c
                r0.setVisibility(r4)
            L5c:
                if (r0 == 0) goto L61
                r0.setVisibility(r2)
            L61:
                bn.r r8 = bn.r.f5635a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastVideoPlayerKt$VastVideoPlayer$3$1", f = "VastVideoPlayer.kt", l = {121}, m = "invokeSuspend")
    public static final class e extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f50379a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.h f50380b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f50381c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p<Long> f50382d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p<Boolean> f50383e;

        @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastVideoPlayerKt$VastVideoPlayer$3$1$1", f = "VastVideoPlayer.kt", l = {}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super bn.r>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f50384a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.h f50385b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f50386c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p<Long> f50387d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p<Boolean> f50388e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.h hVar, String str, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p<Long> pVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p<Boolean> pVar2, hn.c<? super a> cVar) {
                super(2, cVar);
                this.f50385b = hVar;
                this.f50386c = str;
                this.f50387d = pVar;
                this.f50388e = pVar2;
            }

            @Override // sn.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super bn.r> cVar) {
                return ((a) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
                return new a(this.f50385b, this.f50386c, this.f50387d, this.f50388e, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                in.a.g();
                if (this.f50384a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.h hVar = this.f50385b;
                String str = this.f50386c;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p<Long> pVar = this.f50387d;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p<Boolean> pVar2 = this.f50388e;
                hVar.a(str);
                hVar.seekTo(pVar.a().longValue());
                q.j(hVar, pVar2);
                return bn.r.f5635a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.h hVar, String str, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p<Long> pVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p<Boolean> pVar2, hn.c<? super e> cVar) {
            super(2, cVar);
            this.f50380b = hVar;
            this.f50381c = str;
            this.f50382d = pVar;
            this.f50383e = pVar2;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((e) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return new e(this.f50380b, this.f50381c, this.f50382d, this.f50383e, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f50379a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                kotlin.coroutines.d dVar = q.f50362a;
                a aVar = new a(this.f50380b, this.f50381c, this.f50382d, this.f50383e, null);
                this.f50379a = 1;
                if (p000do.g.g(dVar, aVar, this) == objG) {
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

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastVideoPlayerKt$VastVideoPlayer$4$1", f = "VastVideoPlayer.kt", l = {135}, m = "invokeSuspend")
    public static final class f extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f50389a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.h f50390b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p<Boolean> f50391c;

        @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastVideoPlayerKt$VastVideoPlayer$4$1$1", f = "VastVideoPlayer.kt", l = {}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super bn.r>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f50392a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.h f50393b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p<Boolean> f50394c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.h hVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p<Boolean> pVar, hn.c<? super a> cVar) {
                super(2, cVar);
                this.f50393b = hVar;
                this.f50394c = pVar;
            }

            @Override // sn.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super bn.r> cVar) {
                return ((a) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
                return new a(this.f50393b, this.f50394c, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                in.a.g();
                if (this.f50392a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
                q.j(this.f50393b, this.f50394c);
                return bn.r.f5635a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.h hVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p<Boolean> pVar, hn.c<? super f> cVar) {
            super(2, cVar);
            this.f50390b = hVar;
            this.f50391c = pVar;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((f) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return new f(this.f50390b, this.f50391c, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f50389a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                kotlin.coroutines.d dVar = q.f50362a;
                a aVar = new a(this.f50390b, this.f50391c, null);
                this.f50389a = 1;
                if (p000do.g.g(dVar, aVar, this) == objG) {
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

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastVideoPlayerKt$VastVideoPlayer$5$1", f = "VastVideoPlayer.kt", l = {143}, m = "invokeSuspend")
    public static final class g extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f50395a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.h f50396b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f50397c;

        @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastVideoPlayerKt$VastVideoPlayer$5$1$1", f = "VastVideoPlayer.kt", l = {}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super bn.r>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f50398a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.h f50399b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ boolean f50400c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.h hVar, boolean z10, hn.c<? super a> cVar) {
                super(2, cVar);
                this.f50399b = hVar;
                this.f50400c = z10;
            }

            @Override // sn.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super bn.r> cVar) {
                return ((a) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
                return new a(this.f50399b, this.f50400c, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                in.a.g();
                if (this.f50398a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
                this.f50399b.b(this.f50400c);
                return bn.r.f5635a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.h hVar, boolean z10, hn.c<? super g> cVar) {
            super(2, cVar);
            this.f50396b = hVar;
            this.f50397c = z10;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((g) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return new g(this.f50396b, this.f50397c, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f50395a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                kotlin.coroutines.d dVar = q.f50362a;
                a aVar = new a(this.f50396b, this.f50397c, null);
                this.f50395a = 1;
                if (p000do.g.g(dVar, aVar, this) == objG) {
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

    public static final class h implements DisposableEffectResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f50401a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.h f50402b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ State f50403c;

        public h(List list, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.h hVar, State state) {
            this.f50401a = list;
            this.f50402b = hVar;
            this.f50403c = state;
        }

        @Override // androidx.compose.runtime.DisposableEffectResult
        public void dispose() {
            Iterator it = this.f50401a.iterator();
            while (it.hasNext()) {
                g.a.a((kotlinx.coroutines.g) it.next(), null, 1, null);
            }
            this.f50402b.destroy();
            q.e(this.f50403c).invoke(Boolean.FALSE);
        }
    }

    public static final FrameLayout a(View view, Context context) {
        tn.p.k(context, "it");
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
        return frameLayout;
    }

    public static final DisposableEffectResult b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.h hVar, p000do.l0 l0Var, MutableState mutableState, MutableState mutableState2, State state, State state2, State state3, State state4, DisposableEffectScope disposableEffectScope) {
        tn.p.k(disposableEffectScope, "$this$DisposableEffect");
        return new h(cn.w.p(go.f.D(go.f.G(hVar.isPlaying(), new a(mutableState, mutableState2, hVar, state, state2, null)), l0Var), go.f.D(go.f.G(hVar.o(), new b(state3, null)), l0Var), go.f.D(go.f.G(go.f.u(hVar.f()), new c(state4, null)), l0Var)), hVar, state);
    }

    public static final bn.r c(String str, boolean z10, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p pVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p pVar2, boolean z11, sn.l lVar, sn.l lVar2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c0 c0Var, sn.l lVar3, sn.l lVar4, Modifier modifier, int i10, int i11, int i12, Composer composer, int i13) {
        g(str, z10, pVar, pVar2, z11, lVar, lVar2, c0Var, lVar3, lVar4, modifier, composer, i10 | 1, i11, i12);
        return bn.r.f5635a;
    }

    public static final kotlin.coroutines.d d() {
        return f50362a;
    }

    public static final sn.l<Boolean, bn.r> e(State<? extends sn.l<? super Boolean, bn.r>> state) {
        return (sn.l) state.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:186:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(@org.jetbrains.annotations.NotNull final java.lang.String r35, final boolean r36, @org.jetbrains.annotations.NotNull final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p<java.lang.Boolean> r37, @org.jetbrains.annotations.NotNull final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p<java.lang.Long> r38, final boolean r39, @org.jetbrains.annotations.NotNull final sn.l<? super java.lang.Boolean, bn.r> r40, @org.jetbrains.annotations.NotNull final sn.l<? super java.lang.Boolean, bn.r> r41, @org.jetbrains.annotations.NotNull final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c0 r42, @org.jetbrains.annotations.NotNull final sn.l<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, bn.r> r43, @org.jetbrains.annotations.NotNull final sn.l<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l, bn.r> r44, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r45, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r46, final int r47, final int r48, final int r49) {
        /*
            Method dump skipped, instruction units count: 1140
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.g(java.lang.String, boolean, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p, boolean, sn.l, sn.l, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c0, sn.l, sn.l, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final MutableState h() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
    }

    public static final sn.l<Boolean, bn.r> i(State<? extends sn.l<? super Boolean, bn.r>> state) {
        return (sn.l) state.getValue();
    }

    public static final void j(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.h hVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p<Boolean> pVar) {
        if (pVar.a().booleanValue()) {
            hVar.play();
        } else {
            hVar.pause();
        }
    }

    public static final MutableState k() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
    }

    public static final sn.l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, bn.r> l(State<? extends sn.l<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, bn.r>> state) {
        return (sn.l) state.getValue();
    }

    public static final sn.l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l, bn.r> n(State<? extends sn.l<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l, bn.r>> state) {
        return (sn.l) state.getValue();
    }
}
