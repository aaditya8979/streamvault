package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import bn.h;
import bn.r;
import com.vungle.ads.internal.protos.Sdk;
import go.d;
import go.e;
import go.f;
import hn.c;
import in.a;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.i;
import tn.p;
import zn.n;

/* JADX INFO: compiled from: Swipeable.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\b\u0017\u0018\u0000 w*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001wB5\u0012\u0006\u0010t\u001a\u00028\u0000\u0012\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0014\b\u0002\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020$0#¢\u0006\u0004\bu\u0010vJ\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\n\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0010\u001a\u00020\u00052\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ;\u0010\u0014\u001a\u00020\u00052\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\fH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00028\u0000H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00028\u00002\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0007J\u000e\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0003R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R&\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020$0#8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R+\u00100\u001a\u00028\u00002\u0006\u0010)\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R+\u00102\u001a\u00020$2\u0006\u0010)\u001a\u00020$8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b1\u0010+\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020\u0003068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010+R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\u0003068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010+R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u0003068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010+R\u001c\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0003068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010+RC\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\f2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\f8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b;\u0010+\u001a\u0004\b<\u0010=\"\u0004\b>\u0010\u000fR&\u0010A\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\f0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\"\u0010C\u001a\u00020\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010I\u001a\u00020\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bI\u0010D\u001a\u0004\bJ\u0010F\"\u0004\bK\u0010HRO\u0010R\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030L2\u0018\u0010)\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030L8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bM\u0010+\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR+\u0010V\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\u00038@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bS\u0010+\u001a\u0004\bT\u0010F\"\u0004\bU\u0010HR/\u0010]\u001a\u0004\u0018\u00010W2\b\u0010)\u001a\u0004\u0018\u00010W8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bX\u0010+\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u001a\u0010_\u001a\u00020^8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR\u0017\u0010f\u001a\b\u0012\u0004\u0012\u00020\u00030c8F¢\u0006\u0006\u001a\u0004\bd\u0010eR\u0017\u0010h\u001a\b\u0012\u0004\u0012\u00020\u00030c8F¢\u0006\u0006\u001a\u0004\bg\u0010eR\u001a\u0010\u0015\u001a\u00028\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\bj\u0010k\u001a\u0004\bi\u0010-R \u0010p\u001a\b\u0012\u0004\u0012\u00028\u00000l8FX\u0087\u0004¢\u0006\f\u0012\u0004\bo\u0010k\u001a\u0004\bm\u0010nR\u001a\u0010s\u001a\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\br\u0010k\u001a\u0004\bq\u0010F\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006x"}, d2 = {"Landroidx/compose/material/SwipeableState;", "T", "", "", TypedValues.AttributesType.S_TARGET, "Lbn/r;", "snapInternalToOffset", "(FLhn/c;)Ljava/lang/Object;", "Landroidx/compose/animation/core/AnimationSpec;", "spec", "animateInternalToOffset", "(FLandroidx/compose/animation/core/AnimationSpec;Lhn/c;)Ljava/lang/Object;", "", "newAnchors", "ensureInit$material_release", "(Ljava/util/Map;)V", "ensureInit", "oldAnchors", "processNewAnchors$material_release", "(Ljava/util/Map;Ljava/util/Map;Lhn/c;)Ljava/lang/Object;", "processNewAnchors", "targetValue", "snapTo", "(Ljava/lang/Object;Lhn/c;)Ljava/lang/Object;", "anim", "animateTo", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lhn/c;)Ljava/lang/Object;", "velocity", "performFling", "delta", "performDrag", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "getAnimationSpec$material_release", "()Landroidx/compose/animation/core/AnimationSpec;", "Lkotlin/Function1;", "", "confirmStateChange", "Lsn/l;", "getConfirmStateChange$material_release", "()Lsn/l;", "<set-?>", "currentValue$delegate", "Landroidx/compose/runtime/MutableState;", "getCurrentValue", "()Ljava/lang/Object;", "setCurrentValue", "(Ljava/lang/Object;)V", "currentValue", "isAnimationRunning$delegate", "isAnimationRunning", "()Z", "setAnimationRunning", "(Z)V", "Landroidx/compose/runtime/MutableState;", "offsetState", "overflowState", "absoluteOffset", "animationTarget", "anchors$delegate", "getAnchors$material_release", "()Ljava/util/Map;", "setAnchors$material_release", "anchors", "Lgo/d;", "latestNonEmptyAnchorsFlow", "Lgo/d;", "minBound", "F", "getMinBound$material_release", "()F", "setMinBound$material_release", "(F)V", "maxBound", "getMaxBound$material_release", "setMaxBound$material_release", "Lkotlin/Function2;", "thresholds$delegate", "getThresholds$material_release", "()Lsn/p;", "setThresholds$material_release", "(Lsn/p;)V", "thresholds", "velocityThreshold$delegate", "getVelocityThreshold$material_release", "setVelocityThreshold$material_release", "velocityThreshold", "Landroidx/compose/material/ResistanceConfig;", "resistance$delegate", "getResistance$material_release", "()Landroidx/compose/material/ResistanceConfig;", "setResistance$material_release", "(Landroidx/compose/material/ResistanceConfig;)V", "resistance", "Landroidx/compose/foundation/gestures/DraggableState;", "draggableState", "Landroidx/compose/foundation/gestures/DraggableState;", "getDraggableState$material_release", "()Landroidx/compose/foundation/gestures/DraggableState;", "Landroidx/compose/runtime/State;", "getOffset", "()Landroidx/compose/runtime/State;", TypedValues.CycleType.S_WAVE_OFFSET, "getOverflow", "overflow", "getTargetValue", "getTargetValue$annotations", "()V", "Landroidx/compose/material/SwipeProgress;", "getProgress", "()Landroidx/compose/material/SwipeProgress;", "getProgress$annotations", "progress", "getDirection", "getDirection$annotations", "direction", "initialValue", "<init>", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lsn/l;)V", VastTagName.COMPANION, "material_release"}, k = 1, mv = {1, 6, 0})
@Stable
@ExperimentalMaterialApi
public class SwipeableState<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final MutableState<Float> absoluteOffset;

    /* JADX INFO: renamed from: anchors$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState anchors;

    @NotNull
    private final AnimationSpec<Float> animationSpec;

    @NotNull
    private final MutableState<Float> animationTarget;

    @NotNull
    private final l<T, Boolean> confirmStateChange;

    /* JADX INFO: renamed from: currentValue$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState currentValue;

    @NotNull
    private final DraggableState draggableState;

    /* JADX INFO: renamed from: isAnimationRunning$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState isAnimationRunning;

    @NotNull
    private final d<Map<Float, T>> latestNonEmptyAnchorsFlow;
    private float maxBound;
    private float minBound;

    @NotNull
    private final MutableState<Float> offsetState;

    @NotNull
    private final MutableState<Float> overflowState;

    /* JADX INFO: renamed from: resistance$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState resistance;

    /* JADX INFO: renamed from: thresholds$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState thresholds;

    /* JADX INFO: renamed from: velocityThreshold$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState velocityThreshold;

    /* JADX INFO: compiled from: Swipeable.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JD\u0010\u0003\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u0005\u0012\u0004\u0012\u0002H\u00060\u0004\"\b\b\u0001\u0010\u0006*\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u00020\f0\u000b¨\u0006\r"}, d2 = {"Landroidx/compose/material/SwipeableState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material/SwipeableState;", "T", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "confirmStateChange", "Lkotlin/Function1;", "", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        @NotNull
        public final <T> Saver<SwipeableState<T>, T> Saver(@NotNull final AnimationSpec<Float> animationSpec, @NotNull final l<? super T, Boolean> lVar) {
            p.k(animationSpec, "animationSpec");
            p.k(lVar, "confirmStateChange");
            return SaverKt.Saver(new sn.p<SaverScope, SwipeableState<T>, T>() { // from class: androidx.compose.material.SwipeableState$Companion$Saver$1
                @Override // sn.p
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final T mo2invoke(@NotNull SaverScope saverScope, @NotNull SwipeableState<T> swipeableState) {
                    p.k(saverScope, "$this$Saver");
                    p.k(swipeableState, "it");
                    return swipeableState.getCurrentValue();
                }
            }, new l<T, SwipeableState<T>>() { // from class: androidx.compose.material.SwipeableState$Companion$Saver$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // sn.l
                @Nullable
                public final SwipeableState<T> invoke(@NotNull T t10) {
                    p.k(t10, "it");
                    return new SwipeableState<>(t10, animationSpec, lVar);
                }
            });
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material.SwipeableState$animateInternalToOffset$2, reason: invalid class name */
    /* JADX INFO: compiled from: Swipeable.kt */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Landroidx/compose/foundation/gestures/DragScope;", "Lbn/r;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @jn.d(c = "androidx.compose.material.SwipeableState$animateInternalToOffset$2", f = "Swipeable.kt", l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements sn.p<DragScope, c<? super r>, Object> {
        public final /* synthetic */ AnimationSpec<Float> $spec;
        public final /* synthetic */ float $target;
        private /* synthetic */ Object L$0;
        public int label;
        public final /* synthetic */ SwipeableState<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(SwipeableState<T> swipeableState, float f10, AnimationSpec<Float> animationSpec, c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.this$0 = swipeableState;
            this.$target = f10;
            this.$spec = animationSpec;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$target, this.$spec, cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull DragScope dragScope, @Nullable c<? super r> cVar) {
            return ((AnonymousClass2) create(dragScope, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = a.g();
            int i10 = this.label;
            try {
                if (i10 == 0) {
                    kotlin.c.b(obj);
                    final DragScope dragScope = (DragScope) this.L$0;
                    final Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
                    ref$FloatRef.element = ((Number) ((SwipeableState) this.this$0).absoluteOffset.getValue()).floatValue();
                    ((SwipeableState) this.this$0).animationTarget.setValue(jn.a.c(this.$target));
                    this.this$0.setAnimationRunning(true);
                    Animatable animatableAnimatable$default = AnimatableKt.Animatable$default(ref$FloatRef.element, 0.0f, 2, null);
                    Float fC = jn.a.c(this.$target);
                    AnimationSpec<Float> animationSpec = this.$spec;
                    l<Animatable<Float, AnimationVector1D>, r> lVar = new l<Animatable<Float, AnimationVector1D>, r>() { // from class: androidx.compose.material.SwipeableState.animateInternalToOffset.2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // sn.l
                        public /* bridge */ /* synthetic */ r invoke(Animatable<Float, AnimationVector1D> animatable) {
                            invoke2(animatable);
                            return r.f5635a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull Animatable<Float, AnimationVector1D> animatable) {
                            p.k(animatable, "$this$animateTo");
                            dragScope.dragBy(animatable.getValue().floatValue() - ref$FloatRef.element);
                            ref$FloatRef.element = animatable.getValue().floatValue();
                        }
                    };
                    this.label = 1;
                    if (Animatable.animateTo$default(animatableAnimatable$default, fC, animationSpec, null, lVar, this, 4, null) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.c.b(obj);
                }
                ((SwipeableState) this.this$0).animationTarget.setValue(null);
                this.this$0.setAnimationRunning(false);
                return r.f5635a;
            } catch (Throwable th2) {
                ((SwipeableState) this.this$0).animationTarget.setValue(null);
                this.this$0.setAnimationRunning(false);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material.SwipeableState$animateTo$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Swipeable.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {"T", "", "", "anchors", "Lbn/r;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class C13012 implements e<Map<Float, ? extends T>> {
        public final /* synthetic */ AnimationSpec<Float> $anim;
        public final /* synthetic */ T $targetValue;
        public final /* synthetic */ SwipeableState<T> this$0;

        public C13012(T t10, SwipeableState<T> swipeableState, AnimationSpec<Float> animationSpec) {
            this.$targetValue = t10;
            this.this$0 = swipeableState;
            this.$anim = animationSpec;
        }

        @Override // go.e
        public /* bridge */ /* synthetic */ Object emit(Object obj, c cVar) {
            return emit((Map) obj, (c<? super r>) cVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00b7  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00f6  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x012a  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.Float, ? extends T> r9, @org.jetbrains.annotations.NotNull hn.c<? super bn.r> r10) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 310
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeableState.C13012.emit(java.util.Map, hn.c):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material.SwipeableState$snapInternalToOffset$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Swipeable.kt */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Landroidx/compose/foundation/gestures/DragScope;", "Lbn/r;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @jn.d(c = "androidx.compose.material.SwipeableState$snapInternalToOffset$2", f = "Swipeable.kt", l = {}, m = "invokeSuspend")
    public static final class C13032 extends SuspendLambda implements sn.p<DragScope, c<? super r>, Object> {
        public final /* synthetic */ float $target;
        private /* synthetic */ Object L$0;
        public int label;
        public final /* synthetic */ SwipeableState<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13032(float f10, SwipeableState<T> swipeableState, c<? super C13032> cVar) {
            super(2, cVar);
            this.$target = f10;
            this.this$0 = swipeableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            C13032 c13032 = new C13032(this.$target, this.this$0, cVar);
            c13032.L$0 = obj;
            return c13032;
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull DragScope dragScope, @Nullable c<? super r> cVar) {
            return ((C13032) create(dragScope, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            a.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            ((DragScope) this.L$0).dragBy(this.$target - ((Number) ((SwipeableState) this.this$0).absoluteOffset.getValue()).floatValue());
            return r.f5635a;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material.SwipeableState$snapTo$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Swipeable.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {"T", "", "", "anchors", "Lbn/r;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class C13042 implements e<Map<Float, ? extends T>> {
        public final /* synthetic */ T $targetValue;
        public final /* synthetic */ SwipeableState<T> this$0;

        public C13042(T t10, SwipeableState<T> swipeableState) {
            this.$targetValue = t10;
            this.this$0 = swipeableState;
        }

        @Override // go.e
        public /* bridge */ /* synthetic */ Object emit(Object obj, c cVar) {
            return emit((Map) obj, (c<? super r>) cVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.Float, ? extends T> r5, @org.jetbrains.annotations.NotNull hn.c<? super bn.r> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof androidx.compose.material.SwipeableState$snapTo$2$emit$1
                if (r0 == 0) goto L13
                r0 = r6
                androidx.compose.material.SwipeableState$snapTo$2$emit$1 r0 = (androidx.compose.material.SwipeableState$snapTo$2$emit$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.compose.material.SwipeableState$snapTo$2$emit$1 r0 = new androidx.compose.material.SwipeableState$snapTo$2$emit$1
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.result
                java.lang.Object r1 = in.a.g()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r5 = r0.L$0
                androidx.compose.material.SwipeableState$snapTo$2 r5 = (androidx.compose.material.SwipeableState.C13042) r5
                kotlin.c.b(r6)
                goto L52
            L2d:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L35:
                kotlin.c.b(r6)
                T r6 = r4.$targetValue
                java.lang.Float r5 = androidx.compose.material.SwipeableKt.access$getOffset(r5, r6)
                if (r5 == 0) goto L5c
                androidx.compose.material.SwipeableState<T> r6 = r4.this$0
                float r5 = r5.floatValue()
                r0.L$0 = r4
                r0.label = r3
                java.lang.Object r5 = androidx.compose.material.SwipeableState.access$snapInternalToOffset(r6, r5, r0)
                if (r5 != r1) goto L51
                return r1
            L51:
                r5 = r4
            L52:
                androidx.compose.material.SwipeableState<T> r6 = r5.this$0
                T r5 = r5.$targetValue
                androidx.compose.material.SwipeableState.access$setCurrentValue(r6, r5)
                bn.r r5 = bn.r.f5635a
                return r5
            L5c:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.String r6 = "The target value must have an associated anchor."
                java.lang.String r6 = r6.toString()
                r5.<init>(r6)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeableState.C13042.emit(java.util.Map, hn.c):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SwipeableState(T t10, @NotNull AnimationSpec<Float> animationSpec, @NotNull l<? super T, Boolean> lVar) {
        p.k(animationSpec, "animationSpec");
        p.k(lVar, "confirmStateChange");
        this.animationSpec = animationSpec;
        this.confirmStateChange = lVar;
        this.currentValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t10, null, 2, null);
        this.isAnimationRunning = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        Float fValueOf = Float.valueOf(0.0f);
        this.offsetState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(fValueOf, null, 2, null);
        this.overflowState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(fValueOf, null, 2, null);
        this.absoluteOffset = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(fValueOf, null, 2, null);
        this.animationTarget = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.anchors = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(kotlin.collections.a.j(), null, 2, null);
        final d dVarSnapshotFlow = SnapshotStateKt.snapshotFlow(new sn.a<Map<Float, ? extends T>>(this) { // from class: androidx.compose.material.SwipeableState$latestNonEmptyAnchorsFlow$1
            public final /* synthetic */ SwipeableState<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // sn.a
            @NotNull
            public final Map<Float, T> invoke() {
                return this.this$0.getAnchors$material_release();
            }
        });
        this.latestNonEmptyAnchorsFlow = f.N(new d<Map<Float, ? extends T>>() { // from class: androidx.compose.material.SwipeableState$special$$inlined$filter$1

            /* JADX INFO: renamed from: androidx.compose.material.SwipeableState$special$$inlined$filter$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Lbn/r;", "emit", "(Ljava/lang/Object;Lhn/c;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
            public static final class AnonymousClass2<T> implements e {
                public final /* synthetic */ e $this_unsafeFlow;

                /* JADX INFO: renamed from: androidx.compose.material.SwipeableState$special$$inlined$filter$1$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @jn.d(c = "androidx.compose.material.SwipeableState$special$$inlined$filter$1$2", f = "Swipeable.kt", l = {224}, m = "emit")
                @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
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

                public AnonymousClass2(e eVar) {
                    this.$this_unsafeFlow = eVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // go.e
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, @org.jetbrains.annotations.NotNull hn.c r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof androidx.compose.material.SwipeableState$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        androidx.compose.material.SwipeableState$special$$inlined$filter$1$2$1 r0 = (androidx.compose.material.SwipeableState$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        androidx.compose.material.SwipeableState$special$$inlined$filter$1$2$1 r0 = new androidx.compose.material.SwipeableState$special$$inlined$filter$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = in.a.g()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.c.b(r6)
                        goto L49
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.c.b(r6)
                        go.e r6 = r4.$this_unsafeFlow
                        r2 = r5
                        java.util.Map r2 = (java.util.Map) r2
                        boolean r2 = r2.isEmpty()
                        r2 = r2 ^ r3
                        if (r2 == 0) goto L49
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L49
                        return r1
                    L49:
                        bn.r r5 = bn.r.f5635a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeableState$special$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, hn.c):java.lang.Object");
                }
            }

            @Override // go.d
            @Nullable
            public Object collect(@NotNull e eVar, @NotNull c cVar) {
                Object objCollect = dVarSnapshotFlow.collect(new AnonymousClass2(eVar), cVar);
                return objCollect == a.g() ? objCollect : r.f5635a;
            }
        }, 1);
        this.minBound = Float.NEGATIVE_INFINITY;
        this.maxBound = Float.POSITIVE_INFINITY;
        this.thresholds = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new sn.p<Float, Float, Float>() { // from class: androidx.compose.material.SwipeableState$thresholds$2
            @NotNull
            public final Float invoke(float f10, float f11) {
                return Float.valueOf(0.0f);
            }

            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Float mo2invoke(Float f10, Float f11) {
                return invoke(f10.floatValue(), f11.floatValue());
            }
        }, null, 2, null);
        this.velocityThreshold = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(fValueOf, null, 2, null);
        this.resistance = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.draggableState = DraggableKt.DraggableState(new l<Float, r>(this) { // from class: androidx.compose.material.SwipeableState$draggableState$1
            public final /* synthetic */ SwipeableState<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(Float f10) {
                invoke(f10.floatValue());
                return r.f5635a;
            }

            public final void invoke(float f10) {
                float fFloatValue = ((Number) ((SwipeableState) this.this$0).absoluteOffset.getValue()).floatValue() + f10;
                float fM = n.m(fFloatValue, this.this$0.getMinBound(), this.this$0.getMaxBound());
                float f11 = fFloatValue - fM;
                ResistanceConfig resistance$material_release = this.this$0.getResistance$material_release();
                ((SwipeableState) this.this$0).offsetState.setValue(Float.valueOf(fM + (resistance$material_release != null ? resistance$material_release.computeResistance(f11) : 0.0f)));
                ((SwipeableState) this.this$0).overflowState.setValue(Float.valueOf(f11));
                ((SwipeableState) this.this$0).absoluteOffset.setValue(Float.valueOf(fFloatValue));
            }
        });
    }

    public /* synthetic */ SwipeableState(Object obj, AnimationSpec animationSpec, l lVar, int i10, i iVar) {
        this(obj, (i10 & 2) != 0 ? SwipeableDefaults.INSTANCE.getAnimationSpec() : animationSpec, (i10 & 4) != 0 ? new l<T, Boolean>() { // from class: androidx.compose.material.SwipeableState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(T t10) {
                return Boolean.TRUE;
            }
        } : lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object animateInternalToOffset(float f10, AnimationSpec<Float> animationSpec, c<? super r> cVar) {
        Object objDrag$default = DraggableState.drag$default(this.draggableState, null, new AnonymousClass2(this, f10, animationSpec, null), cVar, 1, null);
        return objDrag$default == a.g() ? objDrag$default : r.f5635a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateTo$default(SwipeableState swipeableState, Object obj, AnimationSpec animationSpec, c cVar, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateTo");
        }
        if ((i10 & 2) != 0) {
            animationSpec = swipeableState.animationSpec;
        }
        return swipeableState.animateTo(obj, animationSpec, cVar);
    }

    @ExperimentalMaterialApi
    public static /* synthetic */ void getDirection$annotations() {
    }

    @ExperimentalMaterialApi
    public static /* synthetic */ void getProgress$annotations() {
    }

    @ExperimentalMaterialApi
    public static /* synthetic */ void getTargetValue$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAnimationRunning(boolean z10) {
        this.isAnimationRunning.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCurrentValue(T t10) {
        this.currentValue.setValue(t10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object snapInternalToOffset(float f10, c<? super r> cVar) {
        Object objDrag$default = DraggableState.drag$default(this.draggableState, null, new C13032(f10, this, null), cVar, 1, null);
        return objDrag$default == a.g() ? objDrag$default : r.f5635a;
    }

    @ExperimentalMaterialApi
    @Nullable
    public final Object animateTo(T t10, @NotNull AnimationSpec<Float> animationSpec, @NotNull c<? super r> cVar) {
        Object objCollect = this.latestNonEmptyAnchorsFlow.collect(new C13012(t10, this, animationSpec), cVar);
        return objCollect == a.g() ? objCollect : r.f5635a;
    }

    public final void ensureInit$material_release(@NotNull Map<Float, ? extends T> newAnchors) {
        p.k(newAnchors, "newAnchors");
        if (getAnchors$material_release().isEmpty()) {
            Float offset = SwipeableKt.getOffset(newAnchors, getCurrentValue());
            if (offset == null) {
                throw new IllegalArgumentException("The initial value must have an associated anchor.".toString());
            }
            this.offsetState.setValue(offset);
            this.absoluteOffset.setValue(offset);
        }
    }

    @NotNull
    public final Map<Float, T> getAnchors$material_release() {
        return (Map) this.anchors.getValue();
    }

    @NotNull
    public final AnimationSpec<Float> getAnimationSpec$material_release() {
        return this.animationSpec;
    }

    @NotNull
    public final l<T, Boolean> getConfirmStateChange$material_release() {
        return this.confirmStateChange;
    }

    public final T getCurrentValue() {
        return this.currentValue.getValue();
    }

    public final float getDirection() {
        Float offset = SwipeableKt.getOffset(getAnchors$material_release(), getCurrentValue());
        if (offset == null) {
            return 0.0f;
        }
        return Math.signum(getOffset().getValue().floatValue() - offset.floatValue());
    }

    @NotNull
    /* JADX INFO: renamed from: getDraggableState$material_release, reason: from getter */
    public final DraggableState getDraggableState() {
        return this.draggableState;
    }

    /* JADX INFO: renamed from: getMaxBound$material_release, reason: from getter */
    public final float getMaxBound() {
        return this.maxBound;
    }

    /* JADX INFO: renamed from: getMinBound$material_release, reason: from getter */
    public final float getMinBound() {
        return this.minBound;
    }

    @NotNull
    public final State<Float> getOffset() {
        return this.offsetState;
    }

    @NotNull
    public final State<Float> getOverflow() {
        return this.overflowState;
    }

    @NotNull
    public final SwipeProgress<T> getProgress() {
        Object currentValue;
        Object objK;
        float fFloatValue;
        List listFindBounds = SwipeableKt.findBounds(getOffset().getValue().floatValue(), getAnchors$material_release().keySet());
        int size = listFindBounds.size();
        if (size == 0) {
            T currentValue2 = getCurrentValue();
            currentValue = getCurrentValue();
            objK = currentValue2;
            fFloatValue = 1.0f;
        } else if (size != 1) {
            Pair pairA = getDirection() > 0.0f ? h.a(listFindBounds.get(0), listFindBounds.get(1)) : h.a(listFindBounds.get(1), listFindBounds.get(0));
            float fFloatValue2 = ((Number) pairA.component1()).floatValue();
            float fFloatValue3 = ((Number) pairA.component2()).floatValue();
            objK = kotlin.collections.a.k(getAnchors$material_release(), Float.valueOf(fFloatValue2));
            currentValue = kotlin.collections.a.k(getAnchors$material_release(), Float.valueOf(fFloatValue3));
            fFloatValue = (getOffset().getValue().floatValue() - fFloatValue2) / (fFloatValue3 - fFloatValue2);
        } else {
            Object objK2 = kotlin.collections.a.k(getAnchors$material_release(), listFindBounds.get(0));
            currentValue = kotlin.collections.a.k(getAnchors$material_release(), listFindBounds.get(0));
            fFloatValue = 1.0f;
            objK = objK2;
        }
        return new SwipeProgress<>(objK, currentValue, fFloatValue);
    }

    @Nullable
    public final ResistanceConfig getResistance$material_release() {
        return (ResistanceConfig) this.resistance.getValue();
    }

    public final T getTargetValue() {
        float fComputeTarget;
        Float value = this.animationTarget.getValue();
        if (value != null) {
            fComputeTarget = value.floatValue();
        } else {
            float fFloatValue = getOffset().getValue().floatValue();
            Float offset = SwipeableKt.getOffset(getAnchors$material_release(), getCurrentValue());
            fComputeTarget = SwipeableKt.computeTarget(fFloatValue, offset != null ? offset.floatValue() : getOffset().getValue().floatValue(), getAnchors$material_release().keySet(), getThresholds$material_release(), 0.0f, Float.POSITIVE_INFINITY);
        }
        T t10 = getAnchors$material_release().get(Float.valueOf(fComputeTarget));
        return t10 == null ? getCurrentValue() : t10;
    }

    @NotNull
    public final sn.p<Float, Float, Float> getThresholds$material_release() {
        return (sn.p) this.thresholds.getValue();
    }

    public final float getVelocityThreshold$material_release() {
        return ((Number) this.velocityThreshold.getValue()).floatValue();
    }

    public final boolean isAnimationRunning() {
        return ((Boolean) this.isAnimationRunning.getValue()).booleanValue();
    }

    public final float performDrag(float delta) {
        float fM = n.m(this.absoluteOffset.getValue().floatValue() + delta, this.minBound, this.maxBound) - this.absoluteOffset.getValue().floatValue();
        if (Math.abs(fM) > 0.0f) {
            this.draggableState.dispatchRawDelta(fM);
        }
        return fM;
    }

    @Nullable
    public final Object performFling(final float f10, @NotNull c<? super r> cVar) {
        Object objCollect = this.latestNonEmptyAnchorsFlow.collect(new e<Map<Float, ? extends T>>(this) { // from class: androidx.compose.material.SwipeableState.performFling.2
            public final /* synthetic */ SwipeableState<T> this$0;

            {
                this.this$0 = this;
            }

            @Override // go.e
            public /* bridge */ /* synthetic */ Object emit(Object obj, c cVar2) {
                return emit((Map) obj, (c<? super r>) cVar2);
            }

            @Nullable
            public final Object emit(@NotNull Map<Float, ? extends T> map, @NotNull c<? super r> cVar2) {
                Float offset = SwipeableKt.getOffset(map, this.this$0.getCurrentValue());
                p.h(offset);
                float fFloatValue = offset.floatValue();
                T t10 = map.get(jn.a.c(SwipeableKt.computeTarget(this.this$0.getOffset().getValue().floatValue(), fFloatValue, map.keySet(), this.this$0.getThresholds$material_release(), f10, this.this$0.getVelocityThreshold$material_release())));
                if (t10 != null && this.this$0.getConfirmStateChange$material_release().invoke(t10).booleanValue()) {
                    Object objAnimateTo$default = SwipeableState.animateTo$default(this.this$0, t10, null, cVar2, 2, null);
                    return objAnimateTo$default == a.g() ? objAnimateTo$default : r.f5635a;
                }
                SwipeableState<T> swipeableState = this.this$0;
                Object objAnimateInternalToOffset = swipeableState.animateInternalToOffset(fFloatValue, swipeableState.getAnimationSpec$material_release(), cVar2);
                return objAnimateInternalToOffset == a.g() ? objAnimateInternalToOffset : r.f5635a;
            }
        }, cVar);
        return objCollect == a.g() ? objCollect : r.f5635a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x020d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x020e  */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.compose.material.SwipeableState] */
    /* JADX WARN: Type inference failed for: r0v7, types: [androidx.compose.material.SwipeableState] */
    /* JADX WARN: Type inference failed for: r0v9, types: [androidx.compose.material.SwipeableState] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17, types: [androidx.compose.material.SwipeableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v18, types: [androidx.compose.material.SwipeableState] */
    /* JADX WARN: Type inference failed for: r2v20, types: [androidx.compose.material.SwipeableState] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [androidx.compose.material.SwipeableState, androidx.compose.material.SwipeableState<T>, java.lang.Object] */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processNewAnchors$material_release(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.Float, ? extends T> r10, @org.jetbrains.annotations.NotNull java.util.Map<java.lang.Float, ? extends T> r11, @org.jetbrains.annotations.NotNull hn.c<? super bn.r> r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeableState.processNewAnchors$material_release(java.util.Map, java.util.Map, hn.c):java.lang.Object");
    }

    public final void setAnchors$material_release(@NotNull Map<Float, ? extends T> map) {
        p.k(map, "<set-?>");
        this.anchors.setValue(map);
    }

    public final void setMaxBound$material_release(float f10) {
        this.maxBound = f10;
    }

    public final void setMinBound$material_release(float f10) {
        this.minBound = f10;
    }

    public final void setResistance$material_release(@Nullable ResistanceConfig resistanceConfig) {
        this.resistance.setValue(resistanceConfig);
    }

    public final void setThresholds$material_release(@NotNull sn.p<? super Float, ? super Float, Float> pVar) {
        p.k(pVar, "<set-?>");
        this.thresholds.setValue(pVar);
    }

    public final void setVelocityThreshold$material_release(float f10) {
        this.velocityThreshold.setValue(Float.valueOf(f10));
    }

    @ExperimentalMaterialApi
    @Nullable
    public final Object snapTo(T t10, @NotNull c<? super r> cVar) {
        Object objCollect = this.latestNonEmptyAnchorsFlow.collect(new C13042(t10, this), cVar);
        return objCollect == a.g() ? objCollect : r.f5635a;
    }
}
