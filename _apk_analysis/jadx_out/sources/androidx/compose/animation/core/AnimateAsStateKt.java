package androidx.compose.animation.core;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.exifinterface.media.ExifInterface;
import bn.r;
import hn.c;
import jn.d;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import sn.l;
import sn.p;
import tn.k;
import tn.o;

/* JADX INFO: compiled from: AnimateAsState.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u0000n\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u001aO\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\b2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00002\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\t\u0010\n\u001aK\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\u0006\u0010\u0001\u001a\u00020\u000b2\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u001aK\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\u0006\u0010\u0001\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001aK\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\b2\u0006\u0010\u0001\u001a\u00020\u00132\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00130\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0011\u001aE\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\b2\u0006\u0010\u0001\u001a\u00020\u00162\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00160\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001aE\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\b2\u0006\u0010\u0001\u001a\u00020\u00192\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00190\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001aK\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\b2\u0006\u0010\u0001\u001a\u00020\u001c2\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u0011\u001aK\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\b2\u0006\u0010\u0001\u001a\u00020\u001f2\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010\u0011\u001au\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\"\"\b\b\u0001\u0010$*\u00020#2\u0006\u0010\u0001\u001a\u00028\u00002\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010%2\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00018\u00002\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0007¢\u0006\u0004\b'\u0010(\"\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00000)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+\"\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000b0)8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b,\u0010+\"\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000f0)8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b-\u0010+\"\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00130)8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b.\u0010+\"\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00160)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010+\"\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u00190)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010+\"\u001d\u00101\u001a\b\u0012\u0004\u0012\u00020\u001c0)8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b1\u0010+\"\u001d\u00102\u001a\b\u0012\u0004\u0012\u00020\u001f0)8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b2\u0010+\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00063"}, d2 = {"", "targetValue", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "visibilityThreshold", "Lkotlin/Function1;", "Lbn/r;", "finishedListener", "Landroidx/compose/runtime/State;", "animateFloatAsState", "(FLandroidx/compose/animation/core/AnimationSpec;FLsn/l;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "Landroidx/compose/ui/unit/Dp;", "animateDpAsState-Kz89ssw", "(FLandroidx/compose/animation/core/AnimationSpec;Lsn/l;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateDpAsState", "Landroidx/compose/ui/geometry/Size;", "animateSizeAsState-LjSzlW0", "(JLandroidx/compose/animation/core/AnimationSpec;Lsn/l;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateSizeAsState", "Landroidx/compose/ui/geometry/Offset;", "animateOffsetAsState-N6fFfp4", "animateOffsetAsState", "Landroidx/compose/ui/geometry/Rect;", "animateRectAsState", "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/animation/core/AnimationSpec;Lsn/l;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "", "animateIntAsState", "(ILandroidx/compose/animation/core/AnimationSpec;Lsn/l;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "Landroidx/compose/ui/unit/IntOffset;", "animateIntOffsetAsState-8f6pmRE", "animateIntOffsetAsState", "Landroidx/compose/ui/unit/IntSize;", "animateIntSizeAsState-zTRF_AQ", "animateIntSizeAsState", "T", "Landroidx/compose/animation/core/AnimationVector;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "animateValueAsState", "(Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Landroidx/compose/animation/core/AnimationSpec;Ljava/lang/Object;Lsn/l;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "Landroidx/compose/animation/core/SpringSpec;", "defaultAnimation", "Landroidx/compose/animation/core/SpringSpec;", "dpDefaultSpring", "sizeDefaultSpring", "offsetDefaultSpring", "rectDefaultSpring", "intDefaultSpring", "intOffsetDefaultSpring", "intSizeDefaultSpring", "animation-core_release"}, k = 2, mv = {1, 6, 0})
public final class AnimateAsStateKt {

    @NotNull
    private static final SpringSpec<Float> defaultAnimation = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);

    @NotNull
    private static final SpringSpec<Dp> dpDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, Dp.m3824boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Dp.INSTANCE)), 3, null);

    @NotNull
    private static final SpringSpec<Size> sizeDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, Size.m1440boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Size.INSTANCE)), 3, null);

    @NotNull
    private static final SpringSpec<Offset> offsetDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, Offset.m1372boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Offset.INSTANCE)), 3, null);

    @NotNull
    private static final SpringSpec<Rect> rectDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, VisibilityThresholdsKt.getVisibilityThreshold(Rect.INSTANCE), 3, null);

    @NotNull
    private static final SpringSpec<Integer> intDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, Integer.valueOf(VisibilityThresholdsKt.getVisibilityThreshold(o.f85360a)), 3, null);

    @NotNull
    private static final SpringSpec<IntOffset> intOffsetDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, IntOffset.m3935boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.INSTANCE)), 3, null);

    @NotNull
    private static final SpringSpec<IntSize> intSizeDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, IntSize.m3978boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.INSTANCE)), 3, null);

    /* JADX INFO: renamed from: androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3, reason: invalid class name */
    /* JADX INFO: compiled from: AnimateAsState.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @d(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3", f = "AnimateAsState.kt", l = {368}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends SuspendLambda implements p<l0, c<? super r>, Object> {
        public final /* synthetic */ State<AnimationSpec<T>> $animSpec$delegate;
        public final /* synthetic */ Animatable<T, V> $animatable;
        public final /* synthetic */ fo.d<T> $channel;
        public final /* synthetic */ State<l<T, r>> $listener$delegate;
        private /* synthetic */ Object L$0;
        public Object L$1;
        public int label;

        /* JADX INFO: renamed from: androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1, reason: invalid class name */
        /* JADX INFO: compiled from: AnimateAsState.kt */
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        @d(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1", f = "AnimateAsState.kt", l = {377}, m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements p<l0, c<? super r>, Object> {
            public final /* synthetic */ State<AnimationSpec<T>> $animSpec$delegate;
            public final /* synthetic */ Animatable<T, V> $animatable;
            public final /* synthetic */ State<l<T, r>> $listener$delegate;
            public final /* synthetic */ T $newTarget;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(T t10, Animatable<T, V> animatable, State<? extends AnimationSpec<T>> state, State<? extends l<? super T, r>> state2, c<? super AnonymousClass1> cVar) {
                super(2, cVar);
                this.$newTarget = t10;
                this.$animatable = animatable;
                this.$animSpec$delegate = state;
                this.$listener$delegate = state2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
                return new AnonymousClass1(this.$newTarget, this.$animatable, this.$animSpec$delegate, this.$listener$delegate, cVar);
            }

            @Override // sn.p
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final Object mo2invoke(@NotNull l0 l0Var, @Nullable c<? super r> cVar) {
                return ((AnonymousClass1) create(l0Var, cVar)).invokeSuspend(r.f5635a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objG = in.a.g();
                int i10 = this.label;
                if (i10 == 0) {
                    kotlin.c.b(obj);
                    if (!tn.p.f(this.$newTarget, this.$animatable.getTargetValue())) {
                        Animatable<T, V> animatable = this.$animatable;
                        T t10 = this.$newTarget;
                        AnimationSpec animationSpecM99animateValueAsState$lambda4 = AnimateAsStateKt.m99animateValueAsState$lambda4(this.$animSpec$delegate);
                        this.label = 1;
                        if (Animatable.animateTo$default(animatable, t10, animationSpecM99animateValueAsState$lambda4, null, null, this, 12, null) == objG) {
                            return objG;
                        }
                    }
                    return r.f5635a;
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
                l lVarM98animateValueAsState$lambda3 = AnimateAsStateKt.m98animateValueAsState$lambda3(this.$listener$delegate);
                if (lVarM98animateValueAsState$lambda3 != null) {
                    lVarM98animateValueAsState$lambda3.invoke(this.$animatable.getValue());
                }
                return r.f5635a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(fo.d<T> dVar, Animatable<T, V> animatable, State<? extends AnimationSpec<T>> state, State<? extends l<? super T, r>> state2, c<? super AnonymousClass3> cVar) {
            super(2, cVar);
            this.$channel = dVar;
            this.$animatable = animatable;
            this.$animSpec$delegate = state;
            this.$listener$delegate = state2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$channel, this.$animatable, this.$animSpec$delegate, this.$listener$delegate, cVar);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull l0 l0Var, @Nullable c<? super r> cVar) {
            return ((AnonymousClass3) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0043 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0078  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0041 -> B:12:0x0044). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r18) {
            /*
                r17 = this;
                r0 = r17
                java.lang.Object r1 = in.a.g()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L24
                if (r2 != r3) goto L1c
                java.lang.Object r2 = r0.L$1
                fo.f r2 = (fo.f) r2
                java.lang.Object r4 = r0.L$0
                do.l0 r4 = (p000do.l0) r4
                kotlin.c.b(r18)
                r6 = r18
                r5 = r0
                goto L44
            L1c:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L24:
                kotlin.c.b(r18)
                java.lang.Object r2 = r0.L$0
                do.l0 r2 = (p000do.l0) r2
                fo.d<T> r4 = r0.$channel
                fo.f r4 = r4.iterator()
                r5 = r0
                r16 = r4
                r4 = r2
                r2 = r16
            L37:
                r5.L$0 = r4
                r5.L$1 = r2
                r5.label = r3
                java.lang.Object r6 = r2.a(r5)
                if (r6 != r1) goto L44
                return r1
            L44:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L78
                java.lang.Object r6 = r2.next()
                fo.d<T> r7 = r5.$channel
                java.lang.Object r7 = r7.r()
                java.lang.Object r7 = kotlinx.coroutines.channels.a.f(r7)
                if (r7 != 0) goto L5e
                r9 = r6
                goto L5f
            L5e:
                r9 = r7
            L5f:
                r6 = 0
                r14 = 0
                androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1 r15 = new androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1
                androidx.compose.animation.core.Animatable<T, V> r10 = r5.$animatable
                androidx.compose.runtime.State<androidx.compose.animation.core.AnimationSpec<T>> r11 = r5.$animSpec$delegate
                androidx.compose.runtime.State<sn.l<T, bn.r>> r12 = r5.$listener$delegate
                r13 = 0
                r8 = r15
                r8.<init>(r9, r10, r11, r12, r13)
                r11 = 3
                r12 = 0
                r7 = r4
                r8 = r6
                r9 = r14
                r10 = r15
                p000do.g.d(r7, r8, r9, r10, r11, r12)
                goto L37
            L78:
                bn.r r1 = bn.r.f5635a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.AnimateAsStateKt.AnonymousClass3.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: animateDpAsState-Kz89ssw, reason: not valid java name */
    public static final State<Dp> m93animateDpAsStateKz89ssw(float f10, @Nullable AnimationSpec<Dp> animationSpec, @Nullable l<? super Dp, r> lVar, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(704104481);
        if ((i11 & 2) != 0) {
            animationSpec = dpDefaultSpring;
        }
        AnimationSpec<Dp> animationSpec2 = animationSpec;
        if ((i11 & 4) != 0) {
            lVar = null;
        }
        State<Dp> stateAnimateValueAsState = animateValueAsState(Dp.m3824boximpl(f10), VectorConvertersKt.getVectorConverter(Dp.INSTANCE), animationSpec2, null, lVar, composer, (i10 & 14) | ((i10 << 3) & 896) | (57344 & (i10 << 6)), 8);
        composer.endReplaceableGroup();
        return stateAnimateValueAsState;
    }

    @Composable
    @NotNull
    public static final State<Float> animateFloatAsState(float f10, @Nullable AnimationSpec<Float> animationSpec, float f11, @Nullable l<? super Float, r> lVar, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(1091643291);
        if ((i11 & 2) != 0) {
            animationSpec = defaultAnimation;
        }
        if ((i11 & 4) != 0) {
            f11 = 0.01f;
        }
        l<? super Float, r> lVar2 = (i11 & 8) != 0 ? null : lVar;
        composer.startReplaceableGroup(841393485);
        if (animationSpec == defaultAnimation) {
            Float fValueOf = Float.valueOf(f11);
            composer.startReplaceableGroup(1157296644);
            boolean zChanged = composer.changed(fValueOf);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = AnimationSpecKt.spring$default(0.0f, 0.0f, Float.valueOf(f11), 3, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            animationSpec = (AnimationSpec) objRememberedValue;
        }
        composer.endReplaceableGroup();
        int i12 = i10 << 3;
        State<Float> stateAnimateValueAsState = animateValueAsState(Float.valueOf(f10), VectorConvertersKt.getVectorConverter(k.f85359a), animationSpec, Float.valueOf(f11), lVar2, composer, (i10 & 14) | (i12 & 7168) | (i12 & 57344), 0);
        composer.endReplaceableGroup();
        return stateAnimateValueAsState;
    }

    @Composable
    @NotNull
    public static final State<Integer> animateIntAsState(int i10, @Nullable AnimationSpec<Integer> animationSpec, @Nullable l<? super Integer, r> lVar, @Nullable Composer composer, int i11, int i12) {
        composer.startReplaceableGroup(-842612981);
        if ((i12 & 2) != 0) {
            animationSpec = intDefaultSpring;
        }
        AnimationSpec<Integer> animationSpec2 = animationSpec;
        if ((i12 & 4) != 0) {
            lVar = null;
        }
        State<Integer> stateAnimateValueAsState = animateValueAsState(Integer.valueOf(i10), VectorConvertersKt.getVectorConverter(o.f85360a), animationSpec2, null, lVar, composer, (i11 & 14) | ((i11 << 3) & 896) | (57344 & (i11 << 6)), 8);
        composer.endReplaceableGroup();
        return stateAnimateValueAsState;
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: animateIntOffsetAsState-8f6pmRE, reason: not valid java name */
    public static final State<IntOffset> m94animateIntOffsetAsState8f6pmRE(long j10, @Nullable AnimationSpec<IntOffset> animationSpec, @Nullable l<? super IntOffset, r> lVar, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(1010307371);
        if ((i11 & 2) != 0) {
            animationSpec = intOffsetDefaultSpring;
        }
        AnimationSpec<IntOffset> animationSpec2 = animationSpec;
        if ((i11 & 4) != 0) {
            lVar = null;
        }
        State<IntOffset> stateAnimateValueAsState = animateValueAsState(IntOffset.m3935boximpl(j10), VectorConvertersKt.getVectorConverter(IntOffset.INSTANCE), animationSpec2, null, lVar, composer, (i10 & 14) | ((i10 << 3) & 896) | (57344 & (i10 << 6)), 8);
        composer.endReplaceableGroup();
        return stateAnimateValueAsState;
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: animateIntSizeAsState-zTRF_AQ, reason: not valid java name */
    public static final State<IntSize> m95animateIntSizeAsStatezTRF_AQ(long j10, @Nullable AnimationSpec<IntSize> animationSpec, @Nullable l<? super IntSize, r> lVar, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(-1749239765);
        if ((i11 & 2) != 0) {
            animationSpec = intSizeDefaultSpring;
        }
        AnimationSpec<IntSize> animationSpec2 = animationSpec;
        if ((i11 & 4) != 0) {
            lVar = null;
        }
        State<IntSize> stateAnimateValueAsState = animateValueAsState(IntSize.m3978boximpl(j10), VectorConvertersKt.getVectorConverter(IntSize.INSTANCE), animationSpec2, null, lVar, composer, (i10 & 14) | ((i10 << 3) & 896) | (57344 & (i10 << 6)), 8);
        composer.endReplaceableGroup();
        return stateAnimateValueAsState;
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: animateOffsetAsState-N6fFfp4, reason: not valid java name */
    public static final State<Offset> m96animateOffsetAsStateN6fFfp4(long j10, @Nullable AnimationSpec<Offset> animationSpec, @Nullable l<? super Offset, r> lVar, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(-456513133);
        if ((i11 & 2) != 0) {
            animationSpec = offsetDefaultSpring;
        }
        AnimationSpec<Offset> animationSpec2 = animationSpec;
        if ((i11 & 4) != 0) {
            lVar = null;
        }
        State<Offset> stateAnimateValueAsState = animateValueAsState(Offset.m1372boximpl(j10), VectorConvertersKt.getVectorConverter(Offset.INSTANCE), animationSpec2, null, lVar, composer, (i10 & 14) | ((i10 << 3) & 896) | (57344 & (i10 << 6)), 8);
        composer.endReplaceableGroup();
        return stateAnimateValueAsState;
    }

    @Composable
    @NotNull
    public static final State<Rect> animateRectAsState(@NotNull Rect rect, @Nullable AnimationSpec<Rect> animationSpec, @Nullable l<? super Rect, r> lVar, @Nullable Composer composer, int i10, int i11) {
        tn.p.k(rect, "targetValue");
        composer.startReplaceableGroup(-782613967);
        if ((i11 & 2) != 0) {
            animationSpec = rectDefaultSpring;
        }
        AnimationSpec<Rect> animationSpec2 = animationSpec;
        if ((i11 & 4) != 0) {
            lVar = null;
        }
        State<Rect> stateAnimateValueAsState = animateValueAsState(rect, VectorConvertersKt.getVectorConverter(Rect.INSTANCE), animationSpec2, null, lVar, composer, (i10 & 14) | ((i10 << 3) & 896) | (57344 & (i10 << 6)), 8);
        composer.endReplaceableGroup();
        return stateAnimateValueAsState;
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: animateSizeAsState-LjSzlW0, reason: not valid java name */
    public static final State<Size> m97animateSizeAsStateLjSzlW0(long j10, @Nullable AnimationSpec<Size> animationSpec, @Nullable l<? super Size, r> lVar, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(875212471);
        if ((i11 & 2) != 0) {
            animationSpec = sizeDefaultSpring;
        }
        AnimationSpec<Size> animationSpec2 = animationSpec;
        if ((i11 & 4) != 0) {
            lVar = null;
        }
        State<Size> stateAnimateValueAsState = animateValueAsState(Size.m1440boximpl(j10), VectorConvertersKt.getVectorConverter(Size.INSTANCE), animationSpec2, null, lVar, composer, (i10 & 14) | ((i10 << 3) & 896) | (57344 & (i10 << 6)), 8);
        composer.endReplaceableGroup();
        return stateAnimateValueAsState;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r12v1 ??, still in use, count: 1, list:
          (r12v1 ?? I:java.lang.Object) from 0x005e: INVOKE (r23v0 ?? I:androidx.compose.runtime.Composer), (r12v1 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    @androidx.compose.runtime.Composable
    @org.jetbrains.annotations.NotNull
    public static final <T, V extends androidx.compose.animation.core.AnimationVector> androidx.compose.runtime.State<T> animateValueAsState(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r12v1 ??, still in use, count: 1, list:
          (r12v1 ?? I:java.lang.Object) from 0x005e: INVOKE (r23v0 ?? I:androidx.compose.runtime.Composer), (r12v1 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r18v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:407)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:303)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:88)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        */

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: animateValueAsState$lambda-3, reason: not valid java name */
    public static final <T> l<T, r> m98animateValueAsState$lambda3(State<? extends l<? super T, r>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: animateValueAsState$lambda-4, reason: not valid java name */
    public static final <T> AnimationSpec<T> m99animateValueAsState$lambda4(State<? extends AnimationSpec<T>> state) {
        return state.getValue();
    }
}
