package androidx.compose.animation.core;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.exifinterface.media.ExifInterface;
import bn.r;
import hn.c;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import sn.l;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: Transition.kt */
/* JADX INFO: loaded from: classes7.dex */
@Stable
@Metadata(bv = {}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010 \n\u0002\b\r\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0004rstuB#\b\u0001\u0012\f\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000/\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000102¢\u0006\u0004\bo\u0010pB\u001b\b\u0010\u0012\u0006\u0010\u0012\u001a\u00028\u0000\u0012\b\u00103\u001a\u0004\u0018\u000102¢\u0006\u0004\bo\u0010qJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u001f\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0011\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u001c\u001a\u00020\u00192\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001e\u001a\u00020\u00192\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0000¢\u0006\u0004\b\u001d\u0010\u001bJ)\u0010#\u001a\u00020\u00192\u0018\u0010 \u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001fR\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0000¢\u0006\u0004\b!\u0010\"J)\u0010&\u001a\u00020\u00032\u0018\u0010 \u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001fR\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0000¢\u0006\u0004\b$\u0010%J\u0017\u0010)\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00028\u0000H\u0001¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00028\u0000H\u0001¢\u0006\u0004\b*\u0010(J)\u0010&\u001a\u00020\u00032\u0018\u0010-\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030,R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0000¢\u0006\u0004\b$\u0010.R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0019\u00103\u001a\u0004\u0018\u0001028\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R+\u0010\u0013\u001a\u00028\u00002\u0006\u00107\u001a\u00028\u00008F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R7\u0010D\u001a\b\u0012\u0004\u0012\u00028\u00000>2\f\u00107\u001a\b\u0012\u0004\u0012\u00028\u00000>8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b?\u00109\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR1\u0010\u0014\u001a\u00020\u00052\u0006\u00107\u001a\u00020\u00058F@FX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\bE\u00109\u0012\u0004\bI\u0010\u0010\u001a\u0004\bF\u0010G\"\u0004\bH\u0010\rR+\u0010M\u001a\u00020\u00052\u0006\u00107\u001a\u00020\u00058B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bJ\u00109\u001a\u0004\bK\u0010G\"\u0004\bL\u0010\rR+\u0010S\u001a\u00020\u00192\u0006\u00107\u001a\u00020\u00198@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bN\u00109\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR,\u0010U\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001fR\b\u0012\u0004\u0012\u00028\u00000\u00000T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u001e\u0010W\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00000T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010VR1\u0010Y\u001a\u00020\u00192\u0006\u00107\u001a\u00020\u00198F@@X\u0087\u008e\u0002¢\u0006\u0018\n\u0004\bX\u00109\u0012\u0004\b[\u0010\u0010\u001a\u0004\bY\u0010P\"\u0004\bZ\u0010RR\"\u0010\\\u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010G\"\u0004\b_\u0010\rR\u001b\u0010c\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010GR$\u0010g\u001a\u00028\u00002\u0006\u0010d\u001a\u00028\u00008F@@X\u0086\u000e¢\u0006\f\u001a\u0004\be\u0010;\"\u0004\bf\u0010=R\u0011\u0010h\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bh\u0010PR\u001b\u0010l\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00000i8F¢\u0006\u0006\u001a\u0004\bj\u0010kR)\u0010n\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001fR\b\u0012\u0004\u0012\u00028\u00000\u00000i8F¢\u0006\u0006\u001a\u0004\bm\u0010k¨\u0006v"}, d2 = {"Landroidx/compose/animation/core/Transition;", ExifInterface.LATITUDE_SOUTH, "", "Lbn/r;", "onChildAnimationUpdated", "", "frameTimeNanos", "", "durationScale", "onFrame$animation_core_release", "(JF)V", "onFrame", "onTransitionStart$animation_core_release", "(J)V", "onTransitionStart", "onTransitionEnd$animation_core_release", "()V", "onTransitionEnd", "initialState", "targetState", "playTimeNanos", "seek", "(Ljava/lang/Object;Ljava/lang/Object;J)V", "setPlaytimeAfterInitialAndTargetStateEstablished", "transition", "", "addTransition$animation_core_release", "(Landroidx/compose/animation/core/Transition;)Z", "addTransition", "removeTransition$animation_core_release", "removeTransition", "Landroidx/compose/animation/core/Transition$TransitionAnimationState;", "animation", "addAnimation$animation_core_release", "(Landroidx/compose/animation/core/Transition$TransitionAnimationState;)Z", "addAnimation", "removeAnimation$animation_core_release", "(Landroidx/compose/animation/core/Transition$TransitionAnimationState;)V", "removeAnimation", "updateTarget$animation_core_release", "(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)V", "updateTarget", "animateTo$animation_core_release", "animateTo", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "deferredAnimation", "(Landroidx/compose/animation/core/Transition$DeferredAnimation;)V", "Landroidx/compose/animation/core/MutableTransitionState;", "transitionState", "Landroidx/compose/animation/core/MutableTransitionState;", "", "label", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "<set-?>", "targetState$delegate", "Landroidx/compose/runtime/MutableState;", "getTargetState", "()Ljava/lang/Object;", "setTargetState$animation_core_release", "(Ljava/lang/Object;)V", "Landroidx/compose/animation/core/Transition$Segment;", "segment$delegate", "getSegment", "()Landroidx/compose/animation/core/Transition$Segment;", "setSegment", "(Landroidx/compose/animation/core/Transition$Segment;)V", "segment", "playTimeNanos$delegate", "getPlayTimeNanos", "()J", "setPlayTimeNanos", "getPlayTimeNanos$annotations", "startTimeNanos$delegate", "getStartTimeNanos", "setStartTimeNanos", "startTimeNanos", "updateChildrenNeeded$delegate", "getUpdateChildrenNeeded$animation_core_release", "()Z", "setUpdateChildrenNeeded$animation_core_release", "(Z)V", "updateChildrenNeeded", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "_animations", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "_transitions", "isSeeking$delegate", "isSeeking", "setSeeking$animation_core_release", "isSeeking$annotations", "lastSeekedTimeNanos", "J", "getLastSeekedTimeNanos$animation_core_release", "setLastSeekedTimeNanos$animation_core_release", "totalDurationNanos$delegate", "Landroidx/compose/runtime/State;", "getTotalDurationNanos", "totalDurationNanos", "value", "getCurrentState", "setCurrentState$animation_core_release", "currentState", "isRunning", "", "getTransitions", "()Ljava/util/List;", "transitions", "getAnimations", "animations", "<init>", "(Landroidx/compose/animation/core/MutableTransitionState;Ljava/lang/String;)V", "(Ljava/lang/Object;Ljava/lang/String;)V", "DeferredAnimation", "Segment", "SegmentImpl", "TransitionAnimationState", "animation-core_release"}, k = 1, mv = {1, 6, 0})
public final class Transition<S> {

    @NotNull
    private final SnapshotStateList<Transition<S>.TransitionAnimationState<?, ?>> _animations;

    @NotNull
    private final SnapshotStateList<Transition<?>> _transitions;

    /* JADX INFO: renamed from: isSeeking$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState isSeeking;

    @Nullable
    private final String label;
    private long lastSeekedTimeNanos;

    /* JADX INFO: renamed from: playTimeNanos$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState playTimeNanos;

    /* JADX INFO: renamed from: segment$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState segment;

    /* JADX INFO: renamed from: startTimeNanos$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState startTimeNanos;

    /* JADX INFO: renamed from: targetState$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState targetState;

    /* JADX INFO: renamed from: totalDurationNanos$delegate, reason: from kotlin metadata */
    @NotNull
    private final State totalDurationNanos;

    @NotNull
    private final MutableTransitionState<S> transitionState;

    /* JADX INFO: renamed from: updateChildrenNeeded$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState updateChildrenNeeded;

    /* JADX INFO: compiled from: Transition.kt */
    @Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\u0004\u0018\u0000*\u0004\b\u0001\u0010\u0001*\b\b\u0002\u0010\u0003*\u00020\u00022\u00020\u0004:\u0001$B%\b\u0000\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\"\u0010#J@\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\n2\u001e\u0010\b\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005J\u000f\u0010\u000f\u001a\u00020\fH\u0000¢\u0006\u0004\b\r\u0010\u000eR#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019RJ\u0010\u001c\u001a*\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u001aR\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0000R\b\u0012\u0004\u0012\u00028\u00000\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006%"}, d2 = {"Landroidx/compose/animation/core/Transition$DeferredAnimation;", "T", "Landroidx/compose/animation/core/AnimationVector;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "Lkotlin/Function1;", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "transitionSpec", "targetValueByState", "Landroidx/compose/runtime/State;", "animate", "Lbn/r;", "setupSeeking$animation_core_release", "()V", "setupSeeking", "Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "getTypeConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", "", "label", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "Landroidx/compose/animation/core/Transition$DeferredAnimation$DeferredAnimationData;", "Landroidx/compose/animation/core/Transition;", "data", "Landroidx/compose/animation/core/Transition$DeferredAnimation$DeferredAnimationData;", "getData$animation_core_release", "()Landroidx/compose/animation/core/Transition$DeferredAnimation$DeferredAnimationData;", "setData$animation_core_release", "(Landroidx/compose/animation/core/Transition$DeferredAnimation$DeferredAnimationData;)V", "<init>", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;)V", "DeferredAnimationData", "animation-core_release"}, k = 1, mv = {1, 6, 0})
    @InternalAnimationApi
    public final class DeferredAnimation<T, V extends AnimationVector> {

        @Nullable
        private Transition<S>.DeferredAnimationData<T, V>.DeferredAnimationData<T, V> data;

        @NotNull
        private final String label;
        public final /* synthetic */ Transition<S> this$0;

        @NotNull
        private final TwoWayConverter<T, V> typeConverter;

        /* JADX INFO: compiled from: Transition.kt */
        @Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0080\u0004\u0018\u0000*\u0004\b\u0003\u0010\u0001*\b\b\u0004\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00030\u0004BY\u0012\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\tR\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u001e\u0010\u0011\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u00100\u000f\u0012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00030\u000f¢\u0006\u0004\b\u001d\u0010\u001eJ\u0014\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005R-\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\tR\b\u0012\u0004\u0012\u00028\u00000\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR:\u0010\u0011\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u00100\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R.\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00030\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\u0014\u0010\u001c\u001a\u00028\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Landroidx/compose/animation/core/Transition$DeferredAnimation$DeferredAnimationData;", "T", "Landroidx/compose/animation/core/AnimationVector;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/runtime/State;", "Landroidx/compose/animation/core/Transition$Segment;", "segment", "Lbn/r;", "updateAnimationStates", "Landroidx/compose/animation/core/Transition$TransitionAnimationState;", "Landroidx/compose/animation/core/Transition;", "animation", "Landroidx/compose/animation/core/Transition$TransitionAnimationState;", "getAnimation", "()Landroidx/compose/animation/core/Transition$TransitionAnimationState;", "Lkotlin/Function1;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "transitionSpec", "Lsn/l;", "getTransitionSpec", "()Lsn/l;", "setTransitionSpec", "(Lsn/l;)V", "targetValueByState", "getTargetValueByState", "setTargetValueByState", "getValue", "()Ljava/lang/Object;", "value", "<init>", "(Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/animation/core/Transition$TransitionAnimationState;Lsn/l;Lsn/l;)V", "animation-core_release"}, k = 1, mv = {1, 6, 0})
        public final class DeferredAnimationData<T, V extends AnimationVector> implements State<T> {

            @NotNull
            private final Transition<S>.TransitionAnimationState<T, V> animation;

            @NotNull
            private l<? super S, ? extends T> targetValueByState;
            public final /* synthetic */ Transition<S>.DeferredAnimation<T, V> this$0;

            @NotNull
            private l<? super Segment<S>, ? extends FiniteAnimationSpec<T>> transitionSpec;

            public DeferredAnimationData(@NotNull DeferredAnimation deferredAnimation, @NotNull Transition<S>.TransitionAnimationState<T, V> transitionAnimationState, @NotNull l<? super Segment<S>, ? extends FiniteAnimationSpec<T>> lVar, l<? super S, ? extends T> lVar2) {
                p.k(transitionAnimationState, "animation");
                p.k(lVar, "transitionSpec");
                p.k(lVar2, "targetValueByState");
                this.this$0 = deferredAnimation;
                this.animation = transitionAnimationState;
                this.transitionSpec = lVar;
                this.targetValueByState = lVar2;
            }

            @NotNull
            public final Transition<S>.TransitionAnimationState<T, V> getAnimation() {
                return this.animation;
            }

            @NotNull
            public final l<S, T> getTargetValueByState() {
                return this.targetValueByState;
            }

            @NotNull
            public final l<Segment<S>, FiniteAnimationSpec<T>> getTransitionSpec() {
                return this.transitionSpec;
            }

            @Override // androidx.compose.runtime.State
            public T getValue() {
                updateAnimationStates(this.this$0.this$0.getSegment());
                return this.animation.getValue();
            }

            public final void setTargetValueByState(@NotNull l<? super S, ? extends T> lVar) {
                p.k(lVar, "<set-?>");
                this.targetValueByState = lVar;
            }

            public final void setTransitionSpec(@NotNull l<? super Segment<S>, ? extends FiniteAnimationSpec<T>> lVar) {
                p.k(lVar, "<set-?>");
                this.transitionSpec = lVar;
            }

            public final void updateAnimationStates(@NotNull Segment<S> segment) {
                p.k(segment, "segment");
                T tInvoke = this.targetValueByState.invoke(segment.getTargetState());
                if (!this.this$0.this$0.isSeeking()) {
                    this.animation.updateTargetValue$animation_core_release(tInvoke, this.transitionSpec.invoke(segment));
                } else {
                    this.animation.updateInitialAndTargetValue$animation_core_release(this.targetValueByState.invoke(segment.getInitialState()), tInvoke, this.transitionSpec.invoke(segment));
                }
            }
        }

        public DeferredAnimation(@NotNull Transition transition, @NotNull TwoWayConverter<T, V> twoWayConverter, String str) {
            p.k(twoWayConverter, "typeConverter");
            p.k(str, "label");
            this.this$0 = transition;
            this.typeConverter = twoWayConverter;
            this.label = str;
        }

        @NotNull
        public final State<T> animate(@NotNull l<? super Segment<S>, ? extends FiniteAnimationSpec<T>> lVar, @NotNull l<? super S, ? extends T> lVar2) {
            p.k(lVar, "transitionSpec");
            p.k(lVar2, "targetValueByState");
            DeferredAnimationData deferredAnimationData = this.data;
            if (deferredAnimationData == null) {
                Transition<S> transition = this.this$0;
                deferredAnimationData = new DeferredAnimationData(this, new TransitionAnimationState(transition, lVar2.invoke(transition.getCurrentState()), AnimationStateKt.createZeroVectorFrom(this.typeConverter, lVar2.invoke(this.this$0.getCurrentState())), this.typeConverter, this.label), lVar, lVar2);
                Transition<S> transition2 = this.this$0;
                this.data = deferredAnimationData;
                transition2.addAnimation$animation_core_release(deferredAnimationData.getAnimation());
            }
            Transition<S> transition3 = this.this$0;
            deferredAnimationData.setTargetValueByState(lVar2);
            deferredAnimationData.setTransitionSpec(lVar);
            deferredAnimationData.updateAnimationStates(transition3.getSegment());
            return deferredAnimationData;
        }

        @Nullable
        public final Transition<S>.DeferredAnimationData<T, V>.DeferredAnimationData<T, V> getData$animation_core_release() {
            return this.data;
        }

        @NotNull
        public final String getLabel() {
            return this.label;
        }

        @NotNull
        public final TwoWayConverter<T, V> getTypeConverter() {
            return this.typeConverter;
        }

        public final void setData$animation_core_release(@Nullable Transition<S>.DeferredAnimationData<T, V>.DeferredAnimationData<T, V> deferredAnimationData) {
            this.data = deferredAnimationData;
        }

        public final void setupSeeking$animation_core_release() {
            Transition<S>.DeferredAnimationData<T, V>.DeferredAnimationData<T, V> deferredAnimationData = this.data;
            if (deferredAnimationData != null) {
                Transition<S> transition = this.this$0;
                deferredAnimationData.getAnimation().updateInitialAndTargetValue$animation_core_release(deferredAnimationData.getTargetValueByState().invoke(transition.getSegment().getInitialState()), deferredAnimationData.getTargetValueByState().invoke(transition.getSegment().getTargetState()), deferredAnimationData.getTransitionSpec().invoke(transition.getSegment()));
            }
        }
    }

    /* JADX INFO: compiled from: Transition.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002J\u001a\u0010\b\u001a\u00020\t*\u00028\u00012\u0006\u0010\u0006\u001a\u00028\u0001H\u0096\u0004¢\u0006\u0002\u0010\nR\u0012\u0010\u0003\u001a\u00028\u0001X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00028\u0001X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Landroidx/compose/animation/core/Transition$Segment;", ExifInterface.LATITUDE_SOUTH, "", "initialState", "getInitialState", "()Ljava/lang/Object;", "targetState", "getTargetState", "isTransitioningTo", "", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "animation-core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface Segment<S> {

        /* JADX INFO: compiled from: Transition.kt */
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        public static final class DefaultImpls {
            @Deprecated
            public static <S> boolean isTransitioningTo(@NotNull Segment<S> segment, S s10, S s11) {
                return Segment.super.isTransitioningTo(s10, s11);
            }
        }

        S getInitialState();

        S getTargetState();

        default boolean isTransitioningTo(S s10, S s11) {
            return p.f(s10, getInitialState()) && p.f(s11, getTargetState());
        }
    }

    /* JADX INFO: compiled from: Transition.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u0012\u0006\u0010\u0004\u001a\u00028\u0001¢\u0006\u0002\u0010\u0005J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0016\u0010\u0003\u001a\u00028\u0001X\u0096\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00028\u0001X\u0096\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\t\u0010\u0007¨\u0006\u0010"}, d2 = {"Landroidx/compose/animation/core/Transition$SegmentImpl;", ExifInterface.LATITUDE_SOUTH, "Landroidx/compose/animation/core/Transition$Segment;", "initialState", "targetState", "(Ljava/lang/Object;Ljava/lang/Object;)V", "getInitialState", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getTargetState", "equals", "", "other", "", "hashCode", "", "animation-core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class SegmentImpl<S> implements Segment<S> {
        private final S initialState;
        private final S targetState;

        public SegmentImpl(S s10, S s11) {
            this.initialState = s10;
            this.targetState = s11;
        }

        public boolean equals(@Nullable Object other) {
            if (other instanceof Segment) {
                Segment segment = (Segment) other;
                if (p.f(getInitialState(), segment.getInitialState()) && p.f(getTargetState(), segment.getTargetState())) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.compose.animation.core.Transition.Segment
        public S getInitialState() {
            return this.initialState;
        }

        @Override // androidx.compose.animation.core.Transition.Segment
        public S getTargetState() {
            return this.targetState;
        }

        public int hashCode() {
            S initialState = getInitialState();
            int iHashCode = (initialState != null ? initialState.hashCode() : 0) * 31;
            S targetState = getTargetState();
            return iHashCode + (targetState != null ? targetState.hashCode() : 0);
        }
    }

    /* JADX INFO: compiled from: Transition.kt */
    @Metadata(bv = {}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b#\b\u0087\u0004\u0018\u0000*\u0004\b\u0001\u0010\u0001*\b\b\u0002\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00010\u0004B5\b\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0001\u0012\u0006\u0010W\u001a\u00028\u0002\u0012\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020!\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\bX\u0010YJ#\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0005\u001a\u00028\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0011\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0017\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00028\u00012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u0019H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ-\u0010 \u001a\u00020\b2\u0006\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0018\u001a\u00028\u00012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u0019H\u0000¢\u0006\u0004\b\u001e\u0010\u001fR#\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010'\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R+\u0010\u0018\u001a\u00028\u00012\u0006\u0010+\u001a\u00028\u00018B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R7\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u00192\f\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00010\u00198F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b2\u0010-\u001a\u0004\b3\u00104\"\u0004\b5\u00106RC\u0010=\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002072\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002078F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b8\u0010-\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R+\u0010C\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u00068@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b>\u0010-\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR+\u0010H\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u000b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bD\u0010-\u001a\u0004\bE\u0010F\"\u0004\bG\u0010\u0013R+\u0010L\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u00068B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bI\u0010-\u001a\u0004\bJ\u0010@\"\u0004\bK\u0010BR+\u0010P\u001a\u00028\u00012\u0006\u0010+\u001a\u00028\u00018V@PX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bM\u0010-\u001a\u0004\bN\u0010/\"\u0004\bO\u00101R\u0016\u0010Q\u001a\u00028\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00028\u00010\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010V\u001a\u00020\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bU\u0010F¨\u0006Z"}, d2 = {"Landroidx/compose/animation/core/Transition$TransitionAnimationState;", "T", "Landroidx/compose/animation/core/AnimationVector;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/runtime/State;", "initialValue", "", "isInterrupted", "Lbn/r;", "updateAnimation", "(Ljava/lang/Object;Z)V", "", "playTimeNanos", "", "durationScale", "onPlayTimeChanged$animation_core_release", "(JF)V", "onPlayTimeChanged", "seekTo$animation_core_release", "(J)V", "seekTo", "resetAnimation$animation_core_release", "()V", "resetAnimation", "targetValue", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "animationSpec", "updateTargetValue$animation_core_release", "(Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;)V", "updateTargetValue", "updateInitialAndTargetValue$animation_core_release", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;)V", "updateInitialAndTargetValue", "Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "getTypeConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", "", "label", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "<set-?>", "targetValue$delegate", "Landroidx/compose/runtime/MutableState;", "getTargetValue", "()Ljava/lang/Object;", "setTargetValue", "(Ljava/lang/Object;)V", "animationSpec$delegate", "getAnimationSpec", "()Landroidx/compose/animation/core/FiniteAnimationSpec;", "setAnimationSpec", "(Landroidx/compose/animation/core/FiniteAnimationSpec;)V", "Landroidx/compose/animation/core/TargetBasedAnimation;", "animation$delegate", "getAnimation", "()Landroidx/compose/animation/core/TargetBasedAnimation;", "setAnimation", "(Landroidx/compose/animation/core/TargetBasedAnimation;)V", "animation", "isFinished$delegate", "isFinished$animation_core_release", "()Z", "setFinished$animation_core_release", "(Z)V", "isFinished", "offsetTimeNanos$delegate", "getOffsetTimeNanos", "()J", "setOffsetTimeNanos", "offsetTimeNanos", "needsReset$delegate", "getNeedsReset", "setNeedsReset", "needsReset", "value$delegate", "getValue", "setValue$animation_core_release", "value", "velocityVector", "Landroidx/compose/animation/core/AnimationVector;", "interruptionSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "getDurationNanos$animation_core_release", "durationNanos", "initialVelocityVector", "<init>", "(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;)V", "animation-core_release"}, k = 1, mv = {1, 6, 0})
    @Stable
    public final class TransitionAnimationState<T, V extends AnimationVector> implements State<T> {

        /* JADX INFO: renamed from: animation$delegate, reason: from kotlin metadata */
        @NotNull
        private final MutableState animation;

        /* JADX INFO: renamed from: animationSpec$delegate, reason: from kotlin metadata */
        @NotNull
        private final MutableState animationSpec;

        @NotNull
        private final FiniteAnimationSpec<T> interruptionSpec;

        /* JADX INFO: renamed from: isFinished$delegate, reason: from kotlin metadata */
        @NotNull
        private final MutableState isFinished;

        @NotNull
        private final String label;

        /* JADX INFO: renamed from: needsReset$delegate, reason: from kotlin metadata */
        @NotNull
        private final MutableState needsReset;

        /* JADX INFO: renamed from: offsetTimeNanos$delegate, reason: from kotlin metadata */
        @NotNull
        private final MutableState offsetTimeNanos;

        /* JADX INFO: renamed from: targetValue$delegate, reason: from kotlin metadata */
        @NotNull
        private final MutableState targetValue;
        public final /* synthetic */ Transition<S> this$0;

        @NotNull
        private final TwoWayConverter<T, V> typeConverter;

        /* JADX INFO: renamed from: value$delegate, reason: from kotlin metadata */
        @NotNull
        private final MutableState value;

        @NotNull
        private V velocityVector;

        public TransitionAnimationState(Transition transition, @NotNull T t10, @NotNull V v10, @NotNull TwoWayConverter<T, V> twoWayConverter, String str) {
            T tInvoke;
            p.k(v10, "initialVelocityVector");
            p.k(twoWayConverter, "typeConverter");
            p.k(str, "label");
            this.this$0 = transition;
            this.typeConverter = twoWayConverter;
            this.label = str;
            this.targetValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t10, null, 2, null);
            this.animationSpec = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null), null, 2, null);
            this.animation = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TargetBasedAnimation(getAnimationSpec(), twoWayConverter, t10, getTargetValue(), v10), null, 2, null);
            this.isFinished = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
            this.offsetTimeNanos = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);
            this.needsReset = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            this.value = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t10, null, 2, null);
            this.velocityVector = v10;
            Float f10 = VisibilityThresholdsKt.getVisibilityThresholdMap().get(twoWayConverter);
            if (f10 != null) {
                float fFloatValue = f10.floatValue();
                V vInvoke = twoWayConverter.getConvertToVector().invoke(t10);
                int size = vInvoke.getSize();
                for (int i10 = 0; i10 < size; i10++) {
                    vInvoke.set$animation_core_release(i10, fFloatValue);
                }
                tInvoke = this.typeConverter.getConvertFromVector().invoke(vInvoke);
            } else {
                tInvoke = null;
            }
            this.interruptionSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, tInvoke, 3, null);
        }

        private final boolean getNeedsReset() {
            return ((Boolean) this.needsReset.getValue()).booleanValue();
        }

        private final long getOffsetTimeNanos() {
            return ((Number) this.offsetTimeNanos.getValue()).longValue();
        }

        private final T getTargetValue() {
            return this.targetValue.getValue();
        }

        private final void setAnimation(TargetBasedAnimation<T, V> targetBasedAnimation) {
            this.animation.setValue(targetBasedAnimation);
        }

        private final void setAnimationSpec(FiniteAnimationSpec<T> finiteAnimationSpec) {
            this.animationSpec.setValue(finiteAnimationSpec);
        }

        private final void setNeedsReset(boolean z10) {
            this.needsReset.setValue(Boolean.valueOf(z10));
        }

        private final void setOffsetTimeNanos(long j10) {
            this.offsetTimeNanos.setValue(Long.valueOf(j10));
        }

        private final void setTargetValue(T t10) {
            this.targetValue.setValue(t10);
        }

        private final void updateAnimation(T initialValue, boolean isInterrupted) {
            FiniteAnimationSpec<T> animationSpec = (!isInterrupted || (getAnimationSpec() instanceof SpringSpec)) ? getAnimationSpec() : this.interruptionSpec;
            setAnimation(new TargetBasedAnimation<>(animationSpec, this.typeConverter, initialValue, getTargetValue(), this.velocityVector));
            this.this$0.onChildAnimationUpdated();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void updateAnimation$default(TransitionAnimationState transitionAnimationState, Object obj, boolean z10, int i10, Object obj2) {
            if ((i10 & 1) != 0) {
                obj = transitionAnimationState.getValue();
            }
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            transitionAnimationState.updateAnimation(obj, z10);
        }

        @NotNull
        public final TargetBasedAnimation<T, V> getAnimation() {
            return (TargetBasedAnimation) this.animation.getValue();
        }

        @NotNull
        public final FiniteAnimationSpec<T> getAnimationSpec() {
            return (FiniteAnimationSpec) this.animationSpec.getValue();
        }

        public final long getDurationNanos$animation_core_release() {
            return getAnimation().getDurationNanos();
        }

        @NotNull
        public final String getLabel() {
            return this.label;
        }

        @NotNull
        public final TwoWayConverter<T, V> getTypeConverter() {
            return this.typeConverter;
        }

        @Override // androidx.compose.runtime.State
        public T getValue() {
            return this.value.getValue();
        }

        public final boolean isFinished$animation_core_release() {
            return ((Boolean) this.isFinished.getValue()).booleanValue();
        }

        public final void onPlayTimeChanged$animation_core_release(long playTimeNanos, float durationScale) {
            long durationNanos = (durationScale > 0.0f ? 1 : (durationScale == 0.0f ? 0 : -1)) == 0 ? getAnimation().getDurationNanos() : (long) ((playTimeNanos - getOffsetTimeNanos()) / durationScale);
            setValue$animation_core_release(getAnimation().getValueFromNanos(durationNanos));
            this.velocityVector = (V) getAnimation().getVelocityVectorFromNanos(durationNanos);
            if (getAnimation().isFinishedFromNanos(durationNanos)) {
                setFinished$animation_core_release(true);
                setOffsetTimeNanos(0L);
            }
        }

        public final void resetAnimation$animation_core_release() {
            setNeedsReset(true);
        }

        public final void seekTo$animation_core_release(long playTimeNanos) {
            setValue$animation_core_release(getAnimation().getValueFromNanos(playTimeNanos));
            this.velocityVector = (V) getAnimation().getVelocityVectorFromNanos(playTimeNanos);
        }

        public final void setFinished$animation_core_release(boolean z10) {
            this.isFinished.setValue(Boolean.valueOf(z10));
        }

        public void setValue$animation_core_release(T t10) {
            this.value.setValue(t10);
        }

        public final void updateInitialAndTargetValue$animation_core_release(T initialValue, T targetValue, @NotNull FiniteAnimationSpec<T> animationSpec) {
            p.k(animationSpec, "animationSpec");
            setTargetValue(targetValue);
            setAnimationSpec(animationSpec);
            if (p.f(getAnimation().getInitialValue(), initialValue) && p.f(getAnimation().getTargetValue(), targetValue)) {
                return;
            }
            updateAnimation$default(this, initialValue, false, 2, null);
        }

        public final void updateTargetValue$animation_core_release(T targetValue, @NotNull FiniteAnimationSpec<T> animationSpec) {
            p.k(animationSpec, "animationSpec");
            if (!p.f(getTargetValue(), targetValue) || getNeedsReset()) {
                setTargetValue(targetValue);
                setAnimationSpec(animationSpec);
                updateAnimation$default(this, null, !isFinished$animation_core_release(), 1, null);
                setFinished$animation_core_release(false);
                setOffsetTimeNanos(this.this$0.getPlayTimeNanos());
                setNeedsReset(false);
            }
        }
    }

    public Transition(@NotNull MutableTransitionState<S> mutableTransitionState, @Nullable String str) {
        p.k(mutableTransitionState, "transitionState");
        this.transitionState = mutableTransitionState;
        this.label = str;
        this.targetState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(getCurrentState(), null, 2, null);
        this.segment = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new SegmentImpl(getCurrentState(), getCurrentState()), null, 2, null);
        this.playTimeNanos = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);
        this.startTimeNanos = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Long.MIN_VALUE, null, 2, null);
        this.updateChildrenNeeded = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        this._animations = SnapshotStateKt.mutableStateListOf();
        this._transitions = SnapshotStateKt.mutableStateListOf();
        this.isSeeking = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.totalDurationNanos = SnapshotStateKt.derivedStateOf(new sn.a<Long>(this) { // from class: androidx.compose.animation.core.Transition$totalDurationNanos$2
            public final /* synthetic */ Transition<S> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final Long invoke() {
                Iterator<T> it = ((Transition) this.this$0)._animations.iterator();
                long jMax = 0;
                while (it.hasNext()) {
                    jMax = Math.max(jMax, ((Transition.TransitionAnimationState) it.next()).getDurationNanos$animation_core_release());
                }
                Iterator<T> it2 = ((Transition) this.this$0)._transitions.iterator();
                while (it2.hasNext()) {
                    jMax = Math.max(jMax, ((Transition) it2.next()).getTotalDurationNanos());
                }
                return Long.valueOf(jMax);
            }
        });
    }

    public /* synthetic */ Transition(MutableTransitionState mutableTransitionState, String str, int i10, i iVar) {
        this(mutableTransitionState, (i10 & 2) != 0 ? null : str);
    }

    public Transition(S s10, @Nullable String str) {
        this(new MutableTransitionState(s10), str);
    }

    @InternalAnimationApi
    public static /* synthetic */ void getPlayTimeNanos$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long getStartTimeNanos() {
        return ((Number) this.startTimeNanos.getValue()).longValue();
    }

    @InternalAnimationApi
    public static /* synthetic */ void isSeeking$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onChildAnimationUpdated() {
        setUpdateChildrenNeeded$animation_core_release(true);
        if (isSeeking()) {
            long jMax = 0;
            for (Transition<S>.TransitionAnimationState<?, ?> transitionAnimationState : this._animations) {
                jMax = Math.max(jMax, transitionAnimationState.getDurationNanos$animation_core_release());
                transitionAnimationState.seekTo$animation_core_release(this.lastSeekedTimeNanos);
            }
            setUpdateChildrenNeeded$animation_core_release(false);
        }
    }

    private final void setSegment(Segment<S> segment) {
        this.segment.setValue(segment);
    }

    private final void setStartTimeNanos(long j10) {
        this.startTimeNanos.setValue(Long.valueOf(j10));
    }

    public final boolean addAnimation$animation_core_release(@NotNull Transition<S>.TransitionAnimationState<?, ?> animation) {
        p.k(animation, "animation");
        return this._animations.add(animation);
    }

    public final boolean addTransition$animation_core_release(@NotNull Transition<?> transition) {
        p.k(transition, "transition");
        return this._transitions.add(transition);
    }

    @Composable
    public final void animateTo$animation_core_release(final S s10, @Nullable Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1493585151);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(s10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changed(this) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else if (!isSeeking()) {
            updateTarget$animation_core_release(s10, composerStartRestartGroup, (i11 & 14) | (i11 & 112));
            if (!p.f(s10, getCurrentState()) || isRunning() || getUpdateChildrenNeeded$animation_core_release()) {
                int i12 = (i11 >> 3) & 14;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                boolean zChanged = composerStartRestartGroup.changed(this);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Transition$animateTo$1$1(this, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(this, (sn.p<? super l0, ? super c<? super r>, ? extends Object>) objRememberedValue, composerStartRestartGroup, i12);
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new sn.p<Composer, Integer, r>(this) { // from class: androidx.compose.animation.core.Transition$animateTo$2
            public final /* synthetic */ Transition<S> $tmp0_rcvr;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
                this.$tmp0_rcvr = this;
            }

            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ r mo2invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return r.f5635a;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            public final void invoke(@Nullable Composer composer2, int i13) {
                this.$tmp0_rcvr.animateTo$animation_core_release(s10, composer2, i10 | 1);
            }
        });
    }

    @NotNull
    public final List<Transition<S>.TransitionAnimationState<?, ?>> getAnimations() {
        return this._animations;
    }

    public final S getCurrentState() {
        return this.transitionState.getCurrentState();
    }

    @Nullable
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: getLastSeekedTimeNanos$animation_core_release, reason: from getter */
    public final long getLastSeekedTimeNanos() {
        return this.lastSeekedTimeNanos;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long getPlayTimeNanos() {
        return ((Number) this.playTimeNanos.getValue()).longValue();
    }

    @NotNull
    public final Segment<S> getSegment() {
        return (Segment) this.segment.getValue();
    }

    public final S getTargetState() {
        return (S) this.targetState.getValue();
    }

    public final long getTotalDurationNanos() {
        return ((Number) this.totalDurationNanos.getValue()).longValue();
    }

    @NotNull
    public final List<Transition<?>> getTransitions() {
        return this._transitions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getUpdateChildrenNeeded$animation_core_release() {
        return ((Boolean) this.updateChildrenNeeded.getValue()).booleanValue();
    }

    public final boolean isRunning() {
        return getStartTimeNanos() != Long.MIN_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isSeeking() {
        return ((Boolean) this.isSeeking.getValue()).booleanValue();
    }

    public final void onFrame$animation_core_release(long frameTimeNanos, float durationScale) {
        if (getStartTimeNanos() == Long.MIN_VALUE) {
            onTransitionStart$animation_core_release(frameTimeNanos);
        }
        setUpdateChildrenNeeded$animation_core_release(false);
        setPlayTimeNanos(frameTimeNanos - getStartTimeNanos());
        boolean z10 = true;
        for (Transition<S>.TransitionAnimationState<?, ?> transitionAnimationState : this._animations) {
            if (!transitionAnimationState.isFinished$animation_core_release()) {
                transitionAnimationState.onPlayTimeChanged$animation_core_release(getPlayTimeNanos(), durationScale);
            }
            if (!transitionAnimationState.isFinished$animation_core_release()) {
                z10 = false;
            }
        }
        for (Transition<?> transition : this._transitions) {
            if (!p.f(transition.getTargetState(), transition.getCurrentState())) {
                transition.onFrame$animation_core_release(getPlayTimeNanos(), durationScale);
            }
            if (!p.f(transition.getTargetState(), transition.getCurrentState())) {
                z10 = false;
            }
        }
        if (z10) {
            onTransitionEnd$animation_core_release();
        }
    }

    public final void onTransitionEnd$animation_core_release() {
        setStartTimeNanos(Long.MIN_VALUE);
        setCurrentState$animation_core_release(getTargetState());
        setPlayTimeNanos(0L);
        this.transitionState.setRunning$animation_core_release(false);
    }

    public final void onTransitionStart$animation_core_release(long frameTimeNanos) {
        setStartTimeNanos(frameTimeNanos);
        this.transitionState.setRunning$animation_core_release(true);
    }

    public final void removeAnimation$animation_core_release(@NotNull Transition<S>.DeferredAnimation<?, ?> deferredAnimation) {
        Transition<S>.TransitionAnimationState<?, ?> animation;
        p.k(deferredAnimation, "deferredAnimation");
        Transition<S>.DeferredAnimationData<?, ?>.DeferredAnimationData<?, V> data$animation_core_release = deferredAnimation.getData$animation_core_release();
        if (data$animation_core_release == 0 || (animation = data$animation_core_release.getAnimation()) == null) {
            return;
        }
        removeAnimation$animation_core_release(animation);
    }

    public final void removeAnimation$animation_core_release(@NotNull Transition<S>.TransitionAnimationState<?, ?> animation) {
        p.k(animation, "animation");
        this._animations.remove(animation);
    }

    public final boolean removeTransition$animation_core_release(@NotNull Transition<?> transition) {
        p.k(transition, "transition");
        return this._transitions.remove(transition);
    }

    public final void seek(S initialState, S targetState, long playTimeNanos) {
        setStartTimeNanos(Long.MIN_VALUE);
        this.transitionState.setRunning$animation_core_release(false);
        if (!isSeeking() || !p.f(getCurrentState(), initialState) || !p.f(getTargetState(), targetState)) {
            setCurrentState$animation_core_release(initialState);
            setTargetState$animation_core_release(targetState);
            setSeeking$animation_core_release(true);
            setSegment(new SegmentImpl(initialState, targetState));
        }
        for (Transition<?> transition : this._transitions) {
            if (transition.isSeeking()) {
                transition.seek(transition.getCurrentState(), transition.getTargetState(), playTimeNanos);
            }
        }
        Iterator<Transition<S>.TransitionAnimationState<?, ?>> it = this._animations.iterator();
        while (it.hasNext()) {
            it.next().seekTo$animation_core_release(playTimeNanos);
        }
        this.lastSeekedTimeNanos = playTimeNanos;
    }

    public final void setCurrentState$animation_core_release(S s10) {
        this.transitionState.setCurrentState$animation_core_release(s10);
    }

    public final void setLastSeekedTimeNanos$animation_core_release(long j10) {
        this.lastSeekedTimeNanos = j10;
    }

    public final void setPlayTimeNanos(long j10) {
        this.playTimeNanos.setValue(Long.valueOf(j10));
    }

    public final void setSeeking$animation_core_release(boolean z10) {
        this.isSeeking.setValue(Boolean.valueOf(z10));
    }

    public final void setTargetState$animation_core_release(S s10) {
        this.targetState.setValue(s10);
    }

    public final void setUpdateChildrenNeeded$animation_core_release(boolean z10) {
        this.updateChildrenNeeded.setValue(Boolean.valueOf(z10));
    }

    @Composable
    public final void updateTarget$animation_core_release(final S s10, @Nullable Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-583974681);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(s10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changed(this) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else if (!isSeeking() && !p.f(getTargetState(), s10)) {
            setSegment(new SegmentImpl(getTargetState(), s10));
            setCurrentState$animation_core_release(getTargetState());
            setTargetState$animation_core_release(s10);
            if (!isRunning()) {
                setUpdateChildrenNeeded$animation_core_release(true);
            }
            Iterator<Transition<S>.TransitionAnimationState<?, ?>> it = this._animations.iterator();
            while (it.hasNext()) {
                it.next().resetAnimation$animation_core_release();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new sn.p<Composer, Integer, r>(this) { // from class: androidx.compose.animation.core.Transition$updateTarget$2
            public final /* synthetic */ Transition<S> $tmp0_rcvr;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
                this.$tmp0_rcvr = this;
            }

            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ r mo2invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return r.f5635a;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            public final void invoke(@Nullable Composer composer2, int i12) {
                this.$tmp0_rcvr.updateTarget$animation_core_release(s10, composer2, i10 | 1);
            }
        });
    }
}
