package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000do.l0;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.RewardedCountDownTimerKt$RewardedCountDownTimer$1$1", f = "RewardedCountDownTimer.kt", l = {90, 98}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements sn.p<l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f49150a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f49151b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f49152c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f49153d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Animatable<Float, AnimationVector1D> f49154e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ sn.a<bn.r> f49155f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ MutableState<Integer> f49156g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, int i11, Animatable<Float, AnimationVector1D> animatable, sn.a<bn.r> aVar, MutableState<Integer> mutableState, hn.c<? super a> cVar) {
            super(2, cVar);
            this.f49152c = i10;
            this.f49153d = i11;
            this.f49154e = animatable;
            this.f49155f = aVar;
            this.f49156g = mutableState;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((a) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return new a(this.f49152c, this.f49153d, this.f49154e, this.f49155f, this.f49156g, cVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00a0  */
        /* JADX WARN: Type inference failed for: r0v11 */
        /* JADX WARN: Type inference failed for: r0v12 */
        /* JADX WARN: Type inference failed for: r0v13 */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r0v6, types: [int] */
        /* JADX WARN: Type inference failed for: r0v7 */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v4, types: [int] */
        /* JADX WARN: Type inference failed for: r1v5, types: [int] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
            /*
                r14 = this;
                java.lang.Object r0 = in.a.g()
                int r1 = r14.f49151b
                r2 = 1
                r3 = 2
                if (r1 == 0) goto L24
                if (r1 == r2) goto L1c
                if (r1 != r3) goto L14
                int r0 = r14.f49150a
                kotlin.c.b(r15)     // Catch: java.lang.Throwable -> L22 java.util.concurrent.CancellationException -> L85
                goto L77
            L14:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L1c:
                int r0 = r14.f49150a
                kotlin.c.b(r15)     // Catch: java.lang.Throwable -> L22 java.util.concurrent.CancellationException -> L85
                goto L79
            L22:
                r15 = move-exception
                goto L83
            L24:
                kotlin.c.b(r15)
                androidx.compose.runtime.MutableState<java.lang.Integer> r15 = r14.f49156g
                int r15 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c.o(r15)
                int r1 = r14.f49152c
                int r4 = r14.f49153d
                float r4 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.f.a(r1, r4)
                if (r1 >= r15) goto L65
                int r15 = r15 - r1
                r5 = 0
                int r15 = zn.n.e(r15, r5)     // Catch: java.lang.Throwable -> L87 java.util.concurrent.CancellationException -> L97
                int r15 = r15 * 1000
                int r15 = zn.n.e(r15, r5)     // Catch: java.lang.Throwable -> L87 java.util.concurrent.CancellationException -> L97
                androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r6 = r14.f49154e     // Catch: java.lang.Throwable -> L87 java.util.concurrent.CancellationException -> L97
                java.lang.Float r7 = jn.a.c(r4)     // Catch: java.lang.Throwable -> L87 java.util.concurrent.CancellationException -> L97
                androidx.compose.animation.core.Easing r4 = androidx.compose.animation.core.EasingKt.getLinearEasing()     // Catch: java.lang.Throwable -> L87 java.util.concurrent.CancellationException -> L97
                r8 = 0
                androidx.compose.animation.core.TweenSpec r8 = androidx.compose.animation.core.AnimationSpecKt.tween$default(r15, r5, r4, r3, r8)     // Catch: java.lang.Throwable -> L87 java.util.concurrent.CancellationException -> L97
                r9 = 0
                r10 = 0
                r12 = 12
                r13 = 0
                r14.f49150a = r1     // Catch: java.lang.Throwable -> L87 java.util.concurrent.CancellationException -> L97
                r14.f49151b = r2     // Catch: java.lang.Throwable -> L87 java.util.concurrent.CancellationException -> L97
                r11 = r14
                java.lang.Object r15 = androidx.compose.animation.core.Animatable.animateTo$default(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L87 java.util.concurrent.CancellationException -> L97
                if (r15 != r0) goto L63
                return r0
            L63:
                r0 = r1
                goto L79
            L65:
                androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r15 = r14.f49154e     // Catch: java.lang.Throwable -> L87 java.util.concurrent.CancellationException -> L97
                java.lang.Float r2 = jn.a.c(r4)     // Catch: java.lang.Throwable -> L87 java.util.concurrent.CancellationException -> L97
                r14.f49150a = r1     // Catch: java.lang.Throwable -> L87 java.util.concurrent.CancellationException -> L97
                r14.f49151b = r3     // Catch: java.lang.Throwable -> L87 java.util.concurrent.CancellationException -> L97
                java.lang.Object r15 = r15.snapTo(r2, r14)     // Catch: java.lang.Throwable -> L87 java.util.concurrent.CancellationException -> L97
                if (r15 != r0) goto L76
                return r0
            L76:
                r0 = r1
            L77:
                bn.r r15 = bn.r.f5635a     // Catch: java.lang.Throwable -> L22 java.util.concurrent.CancellationException -> L85
            L79:
                androidx.compose.runtime.MutableState<java.lang.Integer> r15 = r14.f49156g
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c.m(r15, r0)
                int r15 = r14.f49152c
                if (r15 != 0) goto La5
                goto La0
            L83:
                r1 = r0
                goto L88
            L85:
                r1 = r0
                goto L97
            L87:
                r15 = move-exception
            L88:
                androidx.compose.runtime.MutableState<java.lang.Integer> r0 = r14.f49156g
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c.m(r0, r1)
                int r0 = r14.f49152c
                if (r0 != 0) goto L96
                sn.a<bn.r> r0 = r14.f49155f
                r0.invoke()
            L96:
                throw r15
            L97:
                androidx.compose.runtime.MutableState<java.lang.Integer> r15 = r14.f49156g
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c.m(r15, r1)
                int r15 = r14.f49152c
                if (r15 != 0) goto La5
            La0:
                sn.a<bn.r> r15 = r14.f49155f
                r15.invoke()
            La5:
                bn.r r15 = bn.r.f5635a
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.RewardedCountDownTimerKt$RewardedCountDownTimer$2$1", f = "RewardedCountDownTimer.kt", l = {112}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements sn.p<l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f49157a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Animatable<Float, AnimationVector1D> f49158b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f49159c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Animatable<Float, AnimationVector1D> animatable, MutableState<Boolean> mutableState, hn.c<? super b> cVar) {
            super(2, cVar);
            this.f49158b = animatable;
            this.f49159c = mutableState;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((b) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return new b(this.f49158b, this.f49159c, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f49157a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                if (!c.j(this.f49159c)) {
                    Animatable<Float, AnimationVector1D> animatable = this.f49158b;
                    this.f49157a = 1;
                    if (animatable.stop(this) == objG) {
                        return objG;
                    }
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

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c$c, reason: collision with other inner class name */
    public static final class C0645c implements DisposableEffectResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f49160a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ LifecycleEventObserver f49161b;

        public C0645c(LifecycleOwner lifecycleOwner, LifecycleEventObserver lifecycleEventObserver) {
            this.f49160a = lifecycleOwner;
            this.f49161b = lifecycleEventObserver;
        }

        @Override // androidx.compose.runtime.DisposableEffectResult
        public void dispose() {
            this.f49160a.getLifecycle().removeObserver(this.f49161b);
        }
    }

    public /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f49162a;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f49162a = iArr;
        }
    }

    public static final DisposableEffectResult a(LifecycleOwner lifecycleOwner, final Animatable animatable, final MutableState mutableState, DisposableEffectScope disposableEffectScope) {
        tn.p.k(disposableEffectScope, "$this$DisposableEffect");
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.v
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                c.g(animatable, mutableState, lifecycleOwner2, event);
            }
        };
        lifecycleOwner.getLifecycle().addObserver(lifecycleEventObserver);
        return new C0645c(lifecycleOwner, lifecycleEventObserver);
    }

    public static final MutableState b(int i10) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(i10), null, 2, null);
    }

    public static final bn.r c(long j10, float f10, Animatable animatable, long j11, DrawScope drawScope) {
        tn.p.k(drawScope, "$this$Canvas");
        long jSize = SizeKt.Size(Size.m1452getWidthimpl(drawScope.mo2113getSizeNHjbRc()), Size.m1449getHeightimpl(drawScope.mo2113getSizeNHjbRc()));
        float fMo306toPx0680j_4 = drawScope.mo306toPx0680j_4(f10);
        StrokeCap.Companion companion = StrokeCap.INSTANCE;
        DrawScope.m2093drawArcyD3GUKo$default(drawScope, j10, 360.0f, 360.0f, false, 0L, jSize, 0.0f, new Stroke(fMo306toPx0680j_4, 0.0f, companion.m1924getRoundKaPHkGw(), 0, null, 26, null), null, 0, 848, null);
        if (((Number) animatable.getValue()).floatValue() > 0.0f) {
            DrawScope.m2093drawArcyD3GUKo$default(drawScope, j11, 270.0f, zn.n.d(((Number) animatable.getValue()).floatValue(), 0.0f) * (-360.0f), false, 0L, SizeKt.Size(Size.m1452getWidthimpl(drawScope.mo2113getSizeNHjbRc()), Size.m1449getHeightimpl(drawScope.mo2113getSizeNHjbRc())), 0.0f, new Stroke(drawScope.mo306toPx0680j_4(f10), 0.0f, companion.m1924getRoundKaPHkGw(), 0, null, 26, null), null, 0, 848, null);
        }
        return bn.r.f5635a;
    }

    public static final bn.r d(long j10, long j11, Modifier modifier, float f10, float f11, sn.a aVar, LifecycleOwner lifecycleOwner, int i10, int i11, int i12, int i13, Composer composer, int i14) {
        f(j10, j11, modifier, f10, f11, aVar, lifecycleOwner, i10, i11, composer, i12 | 1, i13);
        return bn.r.f5635a;
    }

    public static final bn.r e(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        tn.p.k(semanticsPropertyReceiver, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        SemanticsPropertiesKt.setTestTag(semanticsPropertyReceiver, str);
        return bn.r.f5635a;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:193:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0111  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(final long r35, final long r37, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r39, float r40, float r41, @org.jetbrains.annotations.NotNull final sn.a<bn.r> r42, @org.jetbrains.annotations.Nullable androidx.lifecycle.LifecycleOwner r43, final int r44, final int r45, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r46, final int r47, final int r48) {
        /*
            Method dump skipped, instruction units count: 1294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c.f(long, long, androidx.compose.ui.Modifier, float, float, sn.a, androidx.lifecycle.LifecycleOwner, int, int, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void g(Animatable animatable, MutableState mutableState, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        tn.p.k(lifecycleOwner, "<unused var>");
        tn.p.k(event, "event");
        int i10 = d.f49162a[event.ordinal()];
        if (i10 == 1) {
            i(mutableState, false);
        } else if (i10 == 2 && ((Number) animatable.getValue()).floatValue() > 0.0f) {
            i(mutableState, true);
        }
    }

    public static final void h(MutableState<Integer> mutableState, int i10) {
        mutableState.setValue(Integer.valueOf(i10));
    }

    public static final void i(MutableState<Boolean> mutableState, boolean z10) {
        mutableState.setValue(Boolean.valueOf(z10));
    }

    public static final boolean j(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final int k(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    public static final bn.r l(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        tn.p.k(semanticsPropertyReceiver, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        SemanticsPropertiesKt.setTestTag(semanticsPropertyReceiver, str);
        return bn.r.f5635a;
    }
}
