package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import bn.r;
import hn.c;
import java.util.concurrent.CancellationException;
import jn.d;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.i;
import tn.p;
import zn.n;

/* JADX INFO: compiled from: Animatable.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B/\u0012\u0006\u0010U\u001a\u00028\u0000\u0012\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010'\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\bV\u0010WJ\u001b\u0010\u0007\u001a\u00028\u0001*\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ]\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t2\u0006\u0010\u000b\u001a\u00028\u00002 \u0010\u000e\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0014\u001a\u00020\rH\u0002J%\u0010\u0017\u001a\u00020\r2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00018\u00002\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0017\u0010\u0018Je\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f2\u0006\u0010\u0019\u001a\u00028\u00002\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a2\b\b\u0002\u0010\u000b\u001a\u00028\u00002\"\b\u0002\u0010\u000e\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJY\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f2\u0006\u0010\u000b\u001a\u00028\u00002\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\"\b\u0002\u0010\u000e\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010!\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00028\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u0013\u0010#\u001a\u00020\rH\u0086@ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%R#\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0016\u0010,\u001a\u0004\u0018\u00018\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R&\u0010/\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010.8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R+\u00107\u001a\u0002032\u0006\u00104\u001a\u0002038F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R+\u0010\u0019\u001a\u00028\u00002\u0006\u00104\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b;\u00106\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R(\u0010\u0015\u001a\u0004\u0018\u00018\u00002\b\u00104\u001a\u0004\u0018\u00018\u00008\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0015\u0010-\u001a\u0004\b@\u0010=R(\u0010\u0016\u001a\u0004\u0018\u00018\u00002\b\u00104\u001a\u0004\u0018\u00018\u00008\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0016\u0010-\u001a\u0004\bA\u0010=R\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR \u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000E8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0014\u0010J\u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010L\u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010KR\u0016\u0010M\u001a\u00028\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010KR\u0016\u0010N\u001a\u00028\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010KR\u0011\u0010\u0006\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\bO\u0010=R\u0011\u0010R\u001a\u00028\u00018F¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0011\u0010T\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\bS\u0010=\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006X"}, d2 = {"Landroidx/compose/animation/core/Animatable;", "T", "Landroidx/compose/animation/core/AnimationVector;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "", "value", "createVector", "(Ljava/lang/Object;F)Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/animation/core/Animation;", "animation", "initialVelocity", "Lkotlin/Function1;", "Lbn/r;", "block", "Landroidx/compose/animation/core/AnimationResult;", "runAnimation", "(Landroidx/compose/animation/core/Animation;Ljava/lang/Object;Lsn/l;Lhn/c;)Ljava/lang/Object;", "clampToBounds", "(Ljava/lang/Object;)Ljava/lang/Object;", "endAnimation", "lowerBound", "upperBound", "updateBounds", "(Ljava/lang/Object;Ljava/lang/Object;)V", "targetValue", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "animateTo", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Ljava/lang/Object;Lsn/l;Lhn/c;)Ljava/lang/Object;", "Landroidx/compose/animation/core/DecayAnimationSpec;", "animateDecay", "(Ljava/lang/Object;Landroidx/compose/animation/core/DecayAnimationSpec;Lsn/l;Lhn/c;)Ljava/lang/Object;", "snapTo", "(Ljava/lang/Object;Lhn/c;)Ljava/lang/Object;", "stop", "(Lhn/c;)Ljava/lang/Object;", "Landroidx/compose/runtime/State;", "asState", "Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "getTypeConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", "visibilityThreshold", "Ljava/lang/Object;", "Landroidx/compose/animation/core/AnimationState;", "internalState", "Landroidx/compose/animation/core/AnimationState;", "getInternalState$animation_core_release", "()Landroidx/compose/animation/core/AnimationState;", "", "<set-?>", "isRunning$delegate", "Landroidx/compose/runtime/MutableState;", "isRunning", "()Z", "setRunning", "(Z)V", "targetValue$delegate", "getTargetValue", "()Ljava/lang/Object;", "setTargetValue", "(Ljava/lang/Object;)V", "getLowerBound", "getUpperBound", "Landroidx/compose/animation/core/MutatorMutex;", "mutatorMutex", "Landroidx/compose/animation/core/MutatorMutex;", "Landroidx/compose/animation/core/SpringSpec;", "defaultSpringSpec", "Landroidx/compose/animation/core/SpringSpec;", "getDefaultSpringSpec$animation_core_release", "()Landroidx/compose/animation/core/SpringSpec;", "negativeInfinityBounds", "Landroidx/compose/animation/core/AnimationVector;", "positiveInfinityBounds", "lowerBoundVector", "upperBoundVector", "getValue", "getVelocityVector", "()Landroidx/compose/animation/core/AnimationVector;", "velocityVector", "getVelocity", "velocity", "initialValue", "<init>", "(Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;)V", "animation-core_release"}, k = 1, mv = {1, 6, 0})
public final class Animatable<T, V extends AnimationVector> {
    public static final int $stable = 8;

    @NotNull
    private final SpringSpec<T> defaultSpringSpec;

    @NotNull
    private final AnimationState<T, V> internalState;

    /* JADX INFO: renamed from: isRunning$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState isRunning;

    @Nullable
    private T lowerBound;

    @NotNull
    private V lowerBoundVector;

    @NotNull
    private final MutatorMutex mutatorMutex;

    @NotNull
    private final V negativeInfinityBounds;

    @NotNull
    private final V positiveInfinityBounds;

    /* JADX INFO: renamed from: targetValue$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState targetValue;

    @NotNull
    private final TwoWayConverter<T, V> typeConverter;

    @Nullable
    private T upperBound;

    @NotNull
    private V upperBoundVector;

    @Nullable
    private final T visibilityThreshold;

    /* JADX INFO: renamed from: androidx.compose.animation.core.Animatable$runAnimation$2, reason: invalid class name */
    /* JADX INFO: compiled from: Animatable.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H\u008a@"}, d2 = {"T", "Landroidx/compose/animation/core/AnimationVector;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/animation/core/AnimationResult;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @d(c = "androidx.compose.animation.core.Animatable$runAnimation$2", f = "Animatable.kt", l = {291}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements l<c<? super AnimationResult<T, V>>, Object> {
        public final /* synthetic */ Animation<T, V> $animation;
        public final /* synthetic */ l<Animatable<T, V>, r> $block;
        public final /* synthetic */ T $initialVelocity;
        public final /* synthetic */ long $startTime;
        public Object L$0;
        public Object L$1;
        public int label;
        public final /* synthetic */ Animatable<T, V> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Animatable<T, V> animatable, T t10, Animation<T, V> animation, long j10, l<? super Animatable<T, V>, r> lVar, c<? super AnonymousClass2> cVar) {
            super(1, cVar);
            this.this$0 = animatable;
            this.$initialVelocity = t10;
            this.$animation = animation;
            this.$startTime = j10;
            this.$block = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@NotNull c<?> cVar) {
            return new AnonymousClass2(this.this$0, this.$initialVelocity, this.$animation, this.$startTime, this.$block, cVar);
        }

        @Override // sn.l
        @Nullable
        public final Object invoke(@Nullable c<? super AnimationResult<T, V>> cVar) {
            return ((AnonymousClass2) create(cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            AnimationState animationState;
            Ref$BooleanRef ref$BooleanRef;
            Object objG = in.a.g();
            int i10 = this.label;
            try {
                if (i10 == 0) {
                    kotlin.c.b(obj);
                    this.this$0.getInternalState$animation_core_release().setVelocityVector$animation_core_release(this.this$0.getTypeConverter().getConvertToVector().invoke(this.$initialVelocity));
                    this.this$0.setTargetValue(this.$animation.getTargetValue());
                    this.this$0.setRunning(true);
                    final AnimationState animationStateCopy$default = AnimationStateKt.copy$default((AnimationState) this.this$0.getInternalState$animation_core_release(), (Object) null, (AnimationVector) null, 0L, Long.MIN_VALUE, false, 23, (Object) null);
                    final Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
                    Animation<T, V> animation = this.$animation;
                    long j10 = this.$startTime;
                    final Animatable<T, V> animatable = this.this$0;
                    final l<Animatable<T, V>, r> lVar = this.$block;
                    l<AnimationScope<T, V>, r> lVar2 = new l<AnimationScope<T, V>, r>() { // from class: androidx.compose.animation.core.Animatable.runAnimation.2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // sn.l
                        public /* bridge */ /* synthetic */ r invoke(Object obj2) {
                            invoke((AnimationScope) obj2);
                            return r.f5635a;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        public final void invoke(@NotNull AnimationScope<T, V> animationScope) {
                            p.k(animationScope, "$this$animate");
                            SuspendAnimationKt.updateState(animationScope, animatable.getInternalState$animation_core_release());
                            Object objClampToBounds = animatable.clampToBounds(animationScope.getValue());
                            if (p.f(objClampToBounds, animationScope.getValue())) {
                                l<Animatable<T, V>, r> lVar3 = lVar;
                                if (lVar3 != null) {
                                    lVar3.invoke(animatable);
                                    return;
                                }
                                return;
                            }
                            animatable.getInternalState$animation_core_release().setValue$animation_core_release(objClampToBounds);
                            animationStateCopy$default.setValue$animation_core_release((T) objClampToBounds);
                            l<Animatable<T, V>, r> lVar4 = lVar;
                            if (lVar4 != null) {
                                lVar4.invoke(animatable);
                            }
                            animationScope.cancelAnimation();
                            ref$BooleanRef2.element = true;
                        }
                    };
                    this.L$0 = animationStateCopy$default;
                    this.L$1 = ref$BooleanRef2;
                    this.label = 1;
                    if (SuspendAnimationKt.animate(animationStateCopy$default, animation, j10, lVar2, this) == objG) {
                        return objG;
                    }
                    animationState = animationStateCopy$default;
                    ref$BooleanRef = ref$BooleanRef2;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ref$BooleanRef = (Ref$BooleanRef) this.L$1;
                    animationState = (AnimationState) this.L$0;
                    kotlin.c.b(obj);
                }
                AnimationEndReason animationEndReason = ref$BooleanRef.element ? AnimationEndReason.BoundReached : AnimationEndReason.Finished;
                this.this$0.endAnimation();
                return new AnimationResult(animationState, animationEndReason);
            } catch (CancellationException e10) {
                this.this$0.endAnimation();
                throw e10;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.animation.core.Animatable$snapTo$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Animatable.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H\u008a@"}, d2 = {"T", "Landroidx/compose/animation/core/AnimationVector;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lbn/r;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @d(c = "androidx.compose.animation.core.Animatable$snapTo$2", f = "Animatable.kt", l = {}, m = "invokeSuspend")
    public static final class C11552 extends SuspendLambda implements l<c<? super r>, Object> {
        public final /* synthetic */ T $targetValue;
        public int label;
        public final /* synthetic */ Animatable<T, V> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11552(Animatable<T, V> animatable, T t10, c<? super C11552> cVar) {
            super(1, cVar);
            this.this$0 = animatable;
            this.$targetValue = t10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@NotNull c<?> cVar) {
            return new C11552(this.this$0, this.$targetValue, cVar);
        }

        @Override // sn.l
        @Nullable
        public final Object invoke(@Nullable c<? super r> cVar) {
            return ((C11552) create(cVar)).invokeSuspend(r.f5635a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            in.a.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            this.this$0.endAnimation();
            Object objClampToBounds = this.this$0.clampToBounds(this.$targetValue);
            this.this$0.getInternalState$animation_core_release().setValue$animation_core_release(objClampToBounds);
            this.this$0.setTargetValue(objClampToBounds);
            return r.f5635a;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.animation.core.Animatable$stop$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Animatable.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H\u008a@"}, d2 = {"T", "Landroidx/compose/animation/core/AnimationVector;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lbn/r;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @d(c = "androidx.compose.animation.core.Animatable$stop$2", f = "Animatable.kt", l = {}, m = "invokeSuspend")
    public static final class C11562 extends SuspendLambda implements l<c<? super r>, Object> {
        public int label;
        public final /* synthetic */ Animatable<T, V> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11562(Animatable<T, V> animatable, c<? super C11562> cVar) {
            super(1, cVar);
            this.this$0 = animatable;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@NotNull c<?> cVar) {
            return new C11562(this.this$0, cVar);
        }

        @Override // sn.l
        @Nullable
        public final Object invoke(@Nullable c<? super r> cVar) {
            return ((C11562) create(cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            in.a.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            this.this$0.endAnimation();
            return r.f5635a;
        }
    }

    public Animatable(T t10, @NotNull TwoWayConverter<T, V> twoWayConverter, @Nullable T t11) {
        p.k(twoWayConverter, "typeConverter");
        this.typeConverter = twoWayConverter;
        this.visibilityThreshold = t11;
        this.internalState = new AnimationState<>(twoWayConverter, t10, null, 0L, 0L, false, 60, null);
        this.isRunning = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.targetValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t10, null, 2, null);
        this.mutatorMutex = new MutatorMutex();
        this.defaultSpringSpec = new SpringSpec<>(0.0f, 0.0f, t11, 3, null);
        V v10 = (V) createVector(t10, Float.NEGATIVE_INFINITY);
        this.negativeInfinityBounds = v10;
        V v11 = (V) createVector(t10, Float.POSITIVE_INFINITY);
        this.positiveInfinityBounds = v11;
        this.lowerBoundVector = v10;
        this.upperBoundVector = v11;
    }

    public /* synthetic */ Animatable(Object obj, TwoWayConverter twoWayConverter, Object obj2, int i10, i iVar) {
        this(obj, twoWayConverter, (i10 & 4) != 0 ? null : obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateDecay$default(Animatable animatable, Object obj, DecayAnimationSpec decayAnimationSpec, l lVar, c cVar, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            lVar = null;
        }
        return animatable.animateDecay(obj, decayAnimationSpec, lVar, cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateTo$default(Animatable animatable, Object obj, AnimationSpec animationSpec, Object obj2, l lVar, c cVar, int i10, Object obj3) {
        if ((i10 & 2) != 0) {
            animationSpec = animatable.defaultSpringSpec;
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i10 & 4) != 0) {
            obj2 = animatable.getVelocity();
        }
        Object obj4 = obj2;
        if ((i10 & 8) != 0) {
            lVar = null;
        }
        return animatable.animateTo(obj, animationSpec2, obj4, lVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T clampToBounds(T value) {
        if (p.f(this.lowerBoundVector, this.negativeInfinityBounds) && p.f(this.upperBoundVector, this.positiveInfinityBounds)) {
            return value;
        }
        V vInvoke = this.typeConverter.getConvertToVector().invoke(value);
        int size = vInvoke.getSize();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            if (vInvoke.get$animation_core_release(i10) < this.lowerBoundVector.get$animation_core_release(i10) || vInvoke.get$animation_core_release(i10) > this.upperBoundVector.get$animation_core_release(i10)) {
                vInvoke.set$animation_core_release(i10, n.m(vInvoke.get$animation_core_release(i10), this.lowerBoundVector.get$animation_core_release(i10), this.upperBoundVector.get$animation_core_release(i10)));
                z10 = true;
            }
        }
        return z10 ? this.typeConverter.getConvertFromVector().invoke(vInvoke) : value;
    }

    private final V createVector(T t10, float f10) {
        V vInvoke = this.typeConverter.getConvertToVector().invoke(t10);
        int size = vInvoke.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            vInvoke.set$animation_core_release(i10, f10);
        }
        return vInvoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void endAnimation() {
        AnimationState<T, V> animationState = this.internalState;
        animationState.getVelocityVector().reset$animation_core_release();
        animationState.setLastFrameTimeNanos$animation_core_release(Long.MIN_VALUE);
        setRunning(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object runAnimation(Animation<T, V> animation, T t10, l<? super Animatable<T, V>, r> lVar, c<? super AnimationResult<T, V>> cVar) {
        return MutatorMutex.mutate$default(this.mutatorMutex, null, new AnonymousClass2(this, t10, animation, this.internalState.getLastFrameTimeNanos(), lVar, null), cVar, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRunning(boolean z10) {
        this.isRunning.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTargetValue(T t10) {
        this.targetValue.setValue(t10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateBounds$default(Animatable animatable, Object obj, Object obj2, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            obj = animatable.lowerBound;
        }
        if ((i10 & 2) != 0) {
            obj2 = animatable.upperBound;
        }
        animatable.updateBounds(obj, obj2);
    }

    @Nullable
    public final Object animateDecay(T t10, @NotNull DecayAnimationSpec<T> decayAnimationSpec, @Nullable l<? super Animatable<T, V>, r> lVar, @NotNull c<? super AnimationResult<T, V>> cVar) {
        return runAnimation(new DecayAnimation((DecayAnimationSpec) decayAnimationSpec, (TwoWayConverter) this.typeConverter, (Object) getValue(), (AnimationVector) this.typeConverter.getConvertToVector().invoke(t10)), t10, lVar, cVar);
    }

    @Nullable
    public final Object animateTo(T t10, @NotNull AnimationSpec<T> animationSpec, T t11, @Nullable l<? super Animatable<T, V>, r> lVar, @NotNull c<? super AnimationResult<T, V>> cVar) {
        return runAnimation(AnimationKt.TargetBasedAnimation(animationSpec, this.typeConverter, getValue(), t10, t11), t11, lVar, cVar);
    }

    @NotNull
    public final State<T> asState() {
        return this.internalState;
    }

    @NotNull
    public final SpringSpec<T> getDefaultSpringSpec$animation_core_release() {
        return this.defaultSpringSpec;
    }

    @NotNull
    public final AnimationState<T, V> getInternalState$animation_core_release() {
        return this.internalState;
    }

    @Nullable
    public final T getLowerBound() {
        return this.lowerBound;
    }

    public final T getTargetValue() {
        return this.targetValue.getValue();
    }

    @NotNull
    public final TwoWayConverter<T, V> getTypeConverter() {
        return this.typeConverter;
    }

    @Nullable
    public final T getUpperBound() {
        return this.upperBound;
    }

    public final T getValue() {
        return this.internalState.getValue();
    }

    public final T getVelocity() {
        return (T) this.typeConverter.getConvertFromVector().invoke(getVelocityVector());
    }

    @NotNull
    public final V getVelocityVector() {
        return (V) this.internalState.getVelocityVector();
    }

    public final boolean isRunning() {
        return ((Boolean) this.isRunning.getValue()).booleanValue();
    }

    @Nullable
    public final Object snapTo(T t10, @NotNull c<? super r> cVar) {
        Object objMutate$default = MutatorMutex.mutate$default(this.mutatorMutex, null, new C11552(this, t10, null), cVar, 1, null);
        return objMutate$default == in.a.g() ? objMutate$default : r.f5635a;
    }

    @Nullable
    public final Object stop(@NotNull c<? super r> cVar) {
        Object objMutate$default = MutatorMutex.mutate$default(this.mutatorMutex, null, new C11562(this, null), cVar, 1, null);
        return objMutate$default == in.a.g() ? objMutate$default : r.f5635a;
    }

    public final void updateBounds(@Nullable T lowerBound, @Nullable T upperBound) {
        V vInvoke;
        V vInvoke2;
        if (lowerBound == null || (vInvoke = this.typeConverter.getConvertToVector().invoke(lowerBound)) == null) {
            vInvoke = this.negativeInfinityBounds;
        }
        if (upperBound == null || (vInvoke2 = this.typeConverter.getConvertToVector().invoke(upperBound)) == null) {
            vInvoke2 = this.positiveInfinityBounds;
        }
        int size = vInvoke.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            if (!(vInvoke.get$animation_core_release(i10) <= vInvoke2.get$animation_core_release(i10))) {
                throw new IllegalStateException(("Lower bound must be no greater than upper bound on *all* dimensions. The provided lower bound: " + vInvoke + " is greater than upper bound " + vInvoke2 + " on index " + i10).toString());
            }
        }
        this.lowerBoundVector = vInvoke;
        this.upperBoundVector = vInvoke2;
        this.upperBound = upperBound;
        this.lowerBound = lowerBound;
        if (isRunning()) {
            return;
        }
        T tClampToBounds = clampToBounds(getValue());
        if (p.f(tClampToBounds, getValue())) {
            return;
        }
        this.internalState.setValue$animation_core_release(tClampToBounds);
    }
}
