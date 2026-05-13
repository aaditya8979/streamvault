package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.IntSize;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000do.l0;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.RewardedCountDownTimerCustomKt$RewardedCountDownTimerCustom$1$1", f = "RewardedCountDownTimerCustom.kt", l = {96, 104}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements sn.p<l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f49137a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f49138b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f49139c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f49140d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Animatable<Float, AnimationVector1D> f49141e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ sn.a<bn.r> f49142f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ MutableState<Integer> f49143g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, int i11, Animatable<Float, AnimationVector1D> animatable, sn.a<bn.r> aVar, MutableState<Integer> mutableState, hn.c<? super a> cVar) {
            super(2, cVar);
            this.f49139c = i10;
            this.f49140d = i11;
            this.f49141e = animatable;
            this.f49142f = aVar;
            this.f49143g = mutableState;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((a) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return new a(this.f49139c, this.f49140d, this.f49141e, this.f49142f, this.f49143g, cVar);
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
                int r1 = r14.f49138b
                r2 = 1
                r3 = 2
                if (r1 == 0) goto L24
                if (r1 == r2) goto L1c
                if (r1 != r3) goto L14
                int r0 = r14.f49137a
                kotlin.c.b(r15)     // Catch: java.lang.Throwable -> L22 java.util.concurrent.CancellationException -> L85
                goto L77
            L14:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L1c:
                int r0 = r14.f49137a
                kotlin.c.b(r15)     // Catch: java.lang.Throwable -> L22 java.util.concurrent.CancellationException -> L85
                goto L79
            L22:
                r15 = move-exception
                goto L83
            L24:
                kotlin.c.b(r15)
                androidx.compose.runtime.MutableState<java.lang.Integer> r15 = r14.f49143g
                int r15 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b.r(r15)
                int r1 = r14.f49139c
                int r4 = r14.f49140d
                float r4 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.f.a(r1, r4)
                if (r1 >= r15) goto L65
                int r15 = r15 - r1
                r5 = 0
                int r15 = zn.n.e(r15, r5)     // Catch: java.lang.Throwable -> L87 java.util.concurrent.CancellationException -> L97
                int r15 = r15 * 1000
                int r15 = zn.n.e(r15, r5)     // Catch: java.lang.Throwable -> L87 java.util.concurrent.CancellationException -> L97
                androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r6 = r14.f49141e     // Catch: java.lang.Throwable -> L87 java.util.concurrent.CancellationException -> L97
                java.lang.Float r7 = jn.a.c(r4)     // Catch: java.lang.Throwable -> L87 java.util.concurrent.CancellationException -> L97
                androidx.compose.animation.core.Easing r4 = androidx.compose.animation.core.EasingKt.getLinearEasing()     // Catch: java.lang.Throwable -> L87 java.util.concurrent.CancellationException -> L97
                r8 = 0
                androidx.compose.animation.core.TweenSpec r8 = androidx.compose.animation.core.AnimationSpecKt.tween$default(r15, r5, r4, r3, r8)     // Catch: java.lang.Throwable -> L87 java.util.concurrent.CancellationException -> L97
                r9 = 0
                r10 = 0
                r12 = 12
                r13 = 0
                r14.f49137a = r1     // Catch: java.lang.Throwable -> L87 java.util.concurrent.CancellationException -> L97
                r14.f49138b = r2     // Catch: java.lang.Throwable -> L87 java.util.concurrent.CancellationException -> L97
                r11 = r14
                java.lang.Object r15 = androidx.compose.animation.core.Animatable.animateTo$default(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L87 java.util.concurrent.CancellationException -> L97
                if (r15 != r0) goto L63
                return r0
            L63:
                r0 = r1
                goto L79
            L65:
                androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r15 = r14.f49141e     // Catch: java.lang.Throwable -> L87 java.util.concurrent.CancellationException -> L97
                java.lang.Float r2 = jn.a.c(r4)     // Catch: java.lang.Throwable -> L87 java.util.concurrent.CancellationException -> L97
                r14.f49137a = r1     // Catch: java.lang.Throwable -> L87 java.util.concurrent.CancellationException -> L97
                r14.f49138b = r3     // Catch: java.lang.Throwable -> L87 java.util.concurrent.CancellationException -> L97
                java.lang.Object r15 = r15.snapTo(r2, r14)     // Catch: java.lang.Throwable -> L87 java.util.concurrent.CancellationException -> L97
                if (r15 != r0) goto L76
                return r0
            L76:
                r0 = r1
            L77:
                bn.r r15 = bn.r.f5635a     // Catch: java.lang.Throwable -> L22 java.util.concurrent.CancellationException -> L85
            L79:
                androidx.compose.runtime.MutableState<java.lang.Integer> r15 = r14.f49143g
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b.n(r15, r0)
                int r15 = r14.f49139c
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
                androidx.compose.runtime.MutableState<java.lang.Integer> r0 = r14.f49143g
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b.n(r0, r1)
                int r0 = r14.f49139c
                if (r0 != 0) goto L96
                sn.a<bn.r> r0 = r14.f49142f
                r0.invoke()
            L96:
                throw r15
            L97:
                androidx.compose.runtime.MutableState<java.lang.Integer> r15 = r14.f49143g
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b.n(r15, r1)
                int r15 = r14.f49139c
                if (r15 != 0) goto La5
            La0:
                sn.a<bn.r> r15 = r14.f49142f
                r15.invoke()
            La5:
                bn.r r15 = bn.r.f5635a
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$b, reason: collision with other inner class name */
    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.RewardedCountDownTimerCustomKt$RewardedCountDownTimerCustom$2$1", f = "RewardedCountDownTimerCustom.kt", l = {118}, m = "invokeSuspend")
    public static final class C0644b extends SuspendLambda implements sn.p<l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f49144a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Animatable<Float, AnimationVector1D> f49145b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f49146c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0644b(Animatable<Float, AnimationVector1D> animatable, MutableState<Boolean> mutableState, hn.c<? super C0644b> cVar) {
            super(2, cVar);
            this.f49145b = animatable;
            this.f49146c = mutableState;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((C0644b) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return new C0644b(this.f49145b, this.f49146c, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f49144a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                if (!b.o(this.f49146c)) {
                    Animatable<Float, AnimationVector1D> animatable = this.f49145b;
                    this.f49144a = 1;
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

    public static final class c implements DisposableEffectResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f49147a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ LifecycleEventObserver f49148b;

        public c(LifecycleOwner lifecycleOwner, LifecycleEventObserver lifecycleEventObserver) {
            this.f49147a = lifecycleOwner;
            this.f49148b = lifecycleEventObserver;
        }

        @Override // androidx.compose.runtime.DisposableEffectResult
        public void dispose() {
            this.f49147a.getLifecycle().removeObserver(this.f49148b);
        }
    }

    public /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f49149a;

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
            f49149a = iArr;
        }
    }

    public static final long a(MutableState<IntSize> mutableState) {
        return mutableState.getValue().getPackedValue();
    }

    public static final DisposableEffectResult b(LifecycleOwner lifecycleOwner, final Animatable animatable, final MutableState mutableState, DisposableEffectScope disposableEffectScope) {
        tn.p.k(disposableEffectScope, "$this$DisposableEffect");
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.n
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                b.i(animatable, mutableState, lifecycleOwner2, event);
            }
        };
        lifecycleOwner.getLifecycle().addObserver(lifecycleEventObserver);
        return new c(lifecycleOwner, lifecycleEventObserver);
    }

    public static final MutableState c(int i10) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(i10), null, 2, null);
    }

    public static final bn.r d(long j10, float f10, Animatable animatable, long j11, MutableState mutableState, DrawScope drawScope) {
        tn.p.k(drawScope, "$this$Canvas");
        long jSize = SizeKt.Size(IntSize.m3986getWidthimpl(a(mutableState)), IntSize.m3985getHeightimpl(a(mutableState)));
        float fMo306toPx0680j_4 = drawScope.mo306toPx0680j_4(f10);
        StrokeCap.Companion companion = StrokeCap.INSTANCE;
        DrawScope.m2093drawArcyD3GUKo$default(drawScope, j10, 360.0f, 360.0f, false, 0L, jSize, 0.0f, new Stroke(fMo306toPx0680j_4, 0.0f, companion.m1924getRoundKaPHkGw(), 0, null, 26, null), null, 0, 848, null);
        if (((Number) animatable.getValue()).floatValue() > 0.0f) {
            DrawScope.m2093drawArcyD3GUKo$default(drawScope, j11, 270.0f, zn.n.d(((Number) animatable.getValue()).floatValue(), 0.0f) * (-360.0f), false, 0L, SizeKt.Size(IntSize.m3986getWidthimpl(a(mutableState)), IntSize.m3985getHeightimpl(a(mutableState))), 0.0f, new Stroke(drawScope.mo306toPx0680j_4(f10), 0.0f, companion.m1924getRoundKaPHkGw(), 0, null, 26, null), null, 0, 848, null);
        }
        return bn.r.f5635a;
    }

    public static final bn.r e(long j10, long j11, Modifier modifier, float f10, float f11, sn.a aVar, String str, LifecycleOwner lifecycleOwner, int i10, int i11, int i12, int i13, Composer composer, int i14) {
        h(j10, j11, modifier, f10, f11, aVar, str, lifecycleOwner, i10, i11, composer, i12 | 1, i13);
        return bn.r.f5635a;
    }

    public static final bn.r f(MutableState mutableState, IntSize intSize) {
        k(mutableState, intSize.getPackedValue());
        return bn.r.f5635a;
    }

    public static final bn.r g(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        tn.p.k(semanticsPropertyReceiver, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        SemanticsPropertiesKt.setTestTag(semanticsPropertyReceiver, str);
        return bn.r.f5635a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:219:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0119  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(final long r39, final long r41, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r43, float r44, float r45, @org.jetbrains.annotations.NotNull final sn.a<bn.r> r46, @org.jetbrains.annotations.NotNull final java.lang.String r47, @org.jetbrains.annotations.Nullable androidx.lifecycle.LifecycleOwner r48, final int r49, final int r50, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r51, final int r52, final int r53) {
        /*
            Method dump skipped, instruction units count: 1597
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b.h(long, long, androidx.compose.ui.Modifier, float, float, sn.a, java.lang.String, androidx.lifecycle.LifecycleOwner, int, int, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void i(Animatable animatable, MutableState mutableState, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        tn.p.k(lifecycleOwner, "<unused var>");
        tn.p.k(event, "event");
        int i10 = d.f49149a[event.ordinal()];
        if (i10 == 1) {
            l(mutableState, false);
        } else if (i10 == 2 && ((Number) animatable.getValue()).floatValue() > 0.0f) {
            l(mutableState, true);
        }
    }

    public static final void j(MutableState<Integer> mutableState, int i10) {
        mutableState.setValue(Integer.valueOf(i10));
    }

    public static final void k(MutableState<IntSize> mutableState, long j10) {
        mutableState.setValue(IntSize.m3978boximpl(j10));
    }

    public static final void l(MutableState<Boolean> mutableState, boolean z10) {
        mutableState.setValue(Boolean.valueOf(z10));
    }

    public static final bn.r m(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        tn.p.k(semanticsPropertyReceiver, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        SemanticsPropertiesKt.setTestTag(semanticsPropertyReceiver, str);
        return bn.r.f5635a;
    }

    public static final boolean o(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final int p(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }
}
