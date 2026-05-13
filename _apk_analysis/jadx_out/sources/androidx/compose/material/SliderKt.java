package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.HoverableKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.GestureCancellationException;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.SliderKt;
import androidx.compose.material.Strings;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.PointMode;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import bn.r;
import cn.w;
import cn.x;
import com.mgs.carparking.dbtable.VideoLookHistoryEntry;
import hn.c;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jn.d;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$FloatRef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.i;
import p000do.l0;
import sn.a;
import sn.l;
import sn.q;
import tn.p;
import zn.e;
import zn.m;
import zn.n;

/* JADX INFO: compiled from: Slider.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0094\u0001\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u007f\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0081\u0001\u0010\u0016\u001a\u00020\u00032\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\t\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001aM\u0010\u001c\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00002\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00000\u00192\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001am\u0010$\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u00002\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00000\u00192\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0005H\u0003¢\u0006\u0004\b$\u0010%\u001aI\u0010,\u001a\u00020\u0003*\u00020&2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010(\u001a\u00020'2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010)\u001a\u00020'H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010+\u001aU\u0010/\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u00002\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00000\u00192\u0006\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u0000H\u0003¢\u0006\u0004\b/\u00100\u001a.\u00104\u001a\u00020\u00002\u0006\u00101\u001a\u00020\u00002\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00000\u00192\u0006\u00102\u001a\u00020\u00002\u0006\u00103\u001a\u00020\u0000H\u0002\u001a;\u0010>\u001a\u0010\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\u0000\u0018\u00010:*\u0002052\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u000208H\u0082@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b<\u0010=\u001a\u0016\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00000\u00192\u0006\u0010\f\u001a\u00020\u000bH\u0002\u001a0\u0010E\u001a\u00020\u00002\u0006\u0010@\u001a\u00020\u00002\u0006\u0010A\u001a\u00020\u00002\u0006\u0010B\u001a\u00020\u00002\u0006\u0010C\u001a\u00020\u00002\u0006\u0010D\u001a\u00020\u0000H\u0002\u001a<\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0006\u0010@\u001a\u00020\u00002\u0006\u0010A\u001a\u00020\u00002\f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0006\u0010C\u001a\u00020\u00002\u0006\u0010D\u001a\u00020\u0000H\u0002\u001a \u0010J\u001a\u00020\u00002\u0006\u0010G\u001a\u00020\u00002\u0006\u0010H\u001a\u00020\u00002\u0006\u0010I\u001a\u00020\u0000H\u0002\u001aU\u0010O\u001a\u00020\u00032\u0012\u0010K\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\f\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00000M2\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\bO\u0010P\u001aX\u0010Q\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00000\u00192\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0002\u001aj\u0010Y\u001a\u00020\u0005*\u00020\u00052\u0006\u0010S\u001a\u00020R2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u00103\u001a\u00020\u00002\u0006\u0010T\u001a\u00020\u00072\f\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00000U2\u0018\u0010W\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00020U2\f\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00000M2\u0006\u0010\b\u001a\u00020\u0007H\u0002\u001a3\u0010\\\u001a\u00020\u00032\u0006\u0010S\u001a\u00020R2\u0006\u00101\u001a\u00020\u00002\u0006\u0010Z\u001a\u00020\u00002\u0006\u0010[\u001a\u00020\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b\\\u0010]\u001a\u0098\u0001\u0010b\u001a\u00020\u0005*\u00020\u00052\u0006\u0010 \u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u000f2\f\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00000U2\f\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00000U2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010T\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0018\u0010W\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u00020U2\u001e\u0010a\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030`0UH\u0002\"\u001d\u0010c\u001a\u00020'8\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0017\u0010g\u001a\u00020'8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\bg\u0010d\"\u0017\u0010h\u001a\u00020'8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\bh\u0010d\"\u0017\u0010i\u001a\u00020'8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\bi\u0010d\"\u001d\u0010j\u001a\u00020'8\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\bj\u0010d\u001a\u0004\bk\u0010f\"\u0017\u0010l\u001a\u00020'8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\bl\u0010d\"\u0017\u0010m\u001a\u00020'8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\bm\u0010d\"\u0014\u0010n\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010o\"\u001a\u0010q\u001a\b\u0012\u0004\u0012\u00020\u00000p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010r\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006s"}, d2 = {"", "value", "Lkotlin/Function1;", "Lbn/r;", "onValueChange", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "Lzn/e;", "valueRange", "", "steps", "Lkotlin/Function0;", "onValueChangeFinished", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/material/SliderColors;", "colors", "Slider", "(FLsn/l;Landroidx/compose/ui/Modifier;ZLzn/e;ILsn/a;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/SliderColors;Landroidx/compose/runtime/Composer;II)V", "values", "RangeSlider", "(Lzn/e;Lsn/l;Landroidx/compose/ui/Modifier;ZLzn/e;ILsn/a;Landroidx/compose/material/SliderColors;Landroidx/compose/runtime/Composer;II)V", "positionFraction", "", "tickFractions", "width", "SliderImpl", "(ZFLjava/util/List;Landroidx/compose/material/SliderColors;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "positionFractionStart", "positionFractionEnd", "startInteractionSource", "endInteractionSource", "startThumbSemantics", "endThumbSemantics", "RangeSliderImpl", "(ZFFLjava/util/List;Landroidx/compose/material/SliderColors;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/layout/BoxScope;", "Landroidx/compose/ui/unit/Dp;", TypedValues.CycleType.S_WAVE_OFFSET, "thumbSize", "SliderThumb-PcYyNuk", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/ui/Modifier;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/SliderColors;ZFLandroidx/compose/runtime/Composer;I)V", "SliderThumb", "thumbPx", "trackStrokeWidth", "Track", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material/SliderColors;ZFFLjava/util/List;FFLandroidx/compose/runtime/Composer;I)V", VideoLookHistoryEntry.CURRNET, "minPx", "maxPx", "snapValueToTick", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/ui/input/pointer/PointerId;", "id", "Landroidx/compose/ui/input/pointer/PointerType;", "type", "Lkotlin/Pair;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "awaitSlop-8vUncbI", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILhn/c;)Ljava/lang/Object;", "awaitSlop", "stepsToTickFractions", "a1", "b1", "x1", "a2", "b2", "scale", VastAttributes.HORIZONTAL_POSITION, "a", "b", "pos", "calcFraction", "scaleToOffset", "trackRange", "Landroidx/compose/runtime/MutableState;", "valueState", "CorrectValueSideEffect", "(Lsn/l;Lzn/e;Lzn/e;Landroidx/compose/runtime/MutableState;FLandroidx/compose/runtime/Composer;I)V", "sliderSemantics", "Landroidx/compose/foundation/gestures/DraggableState;", "draggableState", "isRtl", "Landroidx/compose/runtime/State;", "rawOffset", "gestureEndAction", "pressOffset", "sliderTapModifier", TypedValues.AttributesType.S_TARGET, "velocity", "animateToTarget", "(Landroidx/compose/foundation/gestures/DraggableState;FFFLhn/c;)Ljava/lang/Object;", "rawOffsetStart", "rawOffsetEnd", "Lkotlin/Function2;", "onDrag", "rangeSliderPressDragModifier", "ThumbRadius", "F", "getThumbRadius", "()F", "ThumbRippleRadius", "ThumbDefaultElevation", "ThumbPressedElevation", "TrackHeight", "getTrackHeight", "SliderHeight", "SliderMinWidth", "DefaultSliderConstraints", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/animation/core/TweenSpec;", "SliderToTickAnimation", "Landroidx/compose/animation/core/TweenSpec;", "material_release"}, k = 2, mv = {1, 6, 0})
public final class SliderKt {

    @NotNull
    private static final Modifier DefaultSliderConstraints;
    private static final float SliderHeight;
    private static final float SliderMinWidth;

    @NotNull
    private static final TweenSpec<Float> SliderToTickAnimation;
    private static final float ThumbRadius = Dp.m3826constructorimpl(10);
    private static final float ThumbRippleRadius = Dp.m3826constructorimpl(24);
    private static final float ThumbDefaultElevation = Dp.m3826constructorimpl(1);
    private static final float ThumbPressedElevation = Dp.m3826constructorimpl(6);
    private static final float TrackHeight = Dp.m3826constructorimpl(4);

    /* JADX INFO: renamed from: androidx.compose.material.SliderKt$RangeSlider$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Slider.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class C12822 extends Lambda implements q<BoxWithConstraintsScope, Composer, Integer, r> {
        public final /* synthetic */ int $$dirty;
        public final /* synthetic */ SliderColors $colors;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ MutableInteractionSource $endInteractionSource;
        public final /* synthetic */ a<r> $onValueChangeFinished;
        public final /* synthetic */ State<l<e<Float>, r>> $onValueChangeState;
        public final /* synthetic */ MutableInteractionSource $startInteractionSource;
        public final /* synthetic */ int $steps;
        public final /* synthetic */ List<Float> $tickFractions;
        public final /* synthetic */ e<Float> $valueRange;
        public final /* synthetic */ e<Float> $values;

        /* JADX INFO: renamed from: androidx.compose.material.SliderKt$RangeSlider$2$2, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: Slider.kt */
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        public /* synthetic */ class C00822 extends FunctionReferenceImpl implements l<Float, Float> {
            public final /* synthetic */ Ref$FloatRef $maxPx;
            public final /* synthetic */ Ref$FloatRef $minPx;
            public final /* synthetic */ e<Float> $valueRange;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00822(e<Float> eVar, Ref$FloatRef ref$FloatRef, Ref$FloatRef ref$FloatRef2) {
                super(1, p.a.class, "scaleToOffset", "invoke$scaleToOffset(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;F)F", 0);
                this.$valueRange = eVar;
                this.$minPx = ref$FloatRef;
                this.$maxPx = ref$FloatRef2;
            }

            @NotNull
            public final Float invoke(float f10) {
                return Float.valueOf(C12822.invoke$scaleToOffset(this.$valueRange, this.$minPx, this.$maxPx, f10));
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ Float invoke(Float f10) {
                return invoke(f10.floatValue());
            }
        }

        /* JADX INFO: renamed from: androidx.compose.material.SliderKt$RangeSlider$2$3, reason: invalid class name */
        /* JADX INFO: compiled from: Slider.kt */
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        public /* synthetic */ class AnonymousClass3 extends FunctionReferenceImpl implements l<Float, Float> {
            public final /* synthetic */ Ref$FloatRef $maxPx;
            public final /* synthetic */ Ref$FloatRef $minPx;
            public final /* synthetic */ e<Float> $valueRange;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(e<Float> eVar, Ref$FloatRef ref$FloatRef, Ref$FloatRef ref$FloatRef2) {
                super(1, p.a.class, "scaleToOffset", "invoke$scaleToOffset(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;F)F", 0);
                this.$valueRange = eVar;
                this.$minPx = ref$FloatRef;
                this.$maxPx = ref$FloatRef2;
            }

            @NotNull
            public final Float invoke(float f10) {
                return Float.valueOf(C12822.invoke$scaleToOffset(this.$valueRange, this.$minPx, this.$maxPx, f10));
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ Float invoke(Float f10) {
                return invoke(f10.floatValue());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C12822(e<Float> eVar, e<Float> eVar2, int i10, State<? extends l<? super e<Float>, r>> state, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, boolean z10, List<Float> list, int i11, SliderColors sliderColors, a<r> aVar) {
            super(3);
            this.$valueRange = eVar;
            this.$values = eVar2;
            this.$$dirty = i10;
            this.$onValueChangeState = state;
            this.$startInteractionSource = mutableInteractionSource;
            this.$endInteractionSource = mutableInteractionSource2;
            this.$enabled = z10;
            this.$tickFractions = list;
            this.$steps = i11;
            this.$colors = sliderColors;
            this.$onValueChangeFinished = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float invoke$scaleToOffset(e<Float> eVar, Ref$FloatRef ref$FloatRef, Ref$FloatRef ref$FloatRef2, float f10) {
            return SliderKt.scale(eVar.getStart().floatValue(), eVar.getEndInclusive().floatValue(), f10, ref$FloatRef.element, ref$FloatRef2.element);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final e<Float> invoke$scaleToUserValue(Ref$FloatRef ref$FloatRef, Ref$FloatRef ref$FloatRef2, e<Float> eVar, e<Float> eVar2) {
            return SliderKt.scale(ref$FloatRef.element, ref$FloatRef2.element, eVar2, eVar.getStart().floatValue(), eVar.getEndInclusive().floatValue());
        }

        @Override // sn.q
        public /* bridge */ /* synthetic */ r invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
            invoke(boxWithConstraintsScope, composer, num.intValue());
            return r.f5635a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@NotNull BoxWithConstraintsScope boxWithConstraintsScope, @Nullable Composer composer, int i10) {
            p.k(boxWithConstraintsScope, "$this$BoxWithConstraints");
            if ((((i10 & 14) == 0 ? i10 | (composer.changed(boxWithConstraintsScope) ? 4 : 2) : i10) & 91) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            boolean z10 = composer.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
            float fM3782getMaxWidthimpl = Constraints.m3782getMaxWidthimpl(boxWithConstraintsScope.getConstraints());
            final Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
            final Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
            Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            ref$FloatRef.element = fM3782getMaxWidthimpl - density.mo306toPx0680j_4(SliderKt.getThumbRadius());
            ref$FloatRef2.element = density.mo306toPx0680j_4(SliderKt.getThumbRadius());
            r rVar = r.f5635a;
            e<Float> eVar = this.$values;
            e<Float> eVar2 = this.$valueRange;
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(invoke$scaleToOffset(eVar2, ref$FloatRef2, ref$FloatRef, eVar.getStart().floatValue())), null, 2, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            final MutableState mutableState = (MutableState) objRememberedValue;
            e<Float> eVar3 = this.$values;
            e<Float> eVar4 = this.$valueRange;
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(invoke$scaleToOffset(eVar4, ref$FloatRef2, ref$FloatRef, eVar3.getEndInclusive().floatValue())), null, 2, null);
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceableGroup();
            final MutableState mutableState2 = (MutableState) objRememberedValue2;
            SliderKt.CorrectValueSideEffect(new C00822(this.$valueRange, ref$FloatRef2, ref$FloatRef), this.$valueRange, m.b(ref$FloatRef2.element, ref$FloatRef.element), mutableState, this.$values.getStart().floatValue(), composer, ((this.$$dirty >> 9) & 112) | 3072);
            SliderKt.CorrectValueSideEffect(new AnonymousClass3(this.$valueRange, ref$FloatRef2, ref$FloatRef), this.$valueRange, m.b(ref$FloatRef2.element, ref$FloatRef.element), mutableState2, this.$values.getEndInclusive().floatValue(), composer, ((this.$$dirty >> 9) & 112) | 3072);
            composer.startReplaceableGroup(773894976);
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer));
                composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                objRememberedValue3 = compositionScopedCoroutineScopeCanceller;
            }
            composer.endReplaceableGroup();
            final l0 coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue3).getCoroutineScope();
            composer.endReplaceableGroup();
            final List<Float> list = this.$tickFractions;
            final a<r> aVar = this.$onValueChangeFinished;
            final State<l<e<Float>, r>> state = this.$onValueChangeState;
            final e<Float> eVar5 = this.$valueRange;
            State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(new l<Boolean, r>() { // from class: androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1

                /* JADX INFO: renamed from: androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1$1, reason: invalid class name */
                /* JADX INFO: compiled from: Slider.kt */
                @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                @d(c = "androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1$1", f = "Slider.kt", l = {352}, m = "invokeSuspend")
                public static final class AnonymousClass1 extends SuspendLambda implements sn.p<l0, c<? super r>, Object> {
                    public final /* synthetic */ float $current;
                    public final /* synthetic */ boolean $isStart;
                    public final /* synthetic */ Ref$FloatRef $maxPx;
                    public final /* synthetic */ Ref$FloatRef $minPx;
                    public final /* synthetic */ a<r> $onValueChangeFinished;
                    public final /* synthetic */ State<l<e<Float>, r>> $onValueChangeState;
                    public final /* synthetic */ MutableState<Float> $rawOffsetEnd;
                    public final /* synthetic */ MutableState<Float> $rawOffsetStart;
                    public final /* synthetic */ float $target;
                    public final /* synthetic */ e<Float> $valueRange;
                    public int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public AnonymousClass1(float f10, float f11, a<r> aVar, boolean z10, MutableState<Float> mutableState, MutableState<Float> mutableState2, State<? extends l<? super e<Float>, r>> state, Ref$FloatRef ref$FloatRef, Ref$FloatRef ref$FloatRef2, e<Float> eVar, c<? super AnonymousClass1> cVar) {
                        super(2, cVar);
                        this.$current = f10;
                        this.$target = f11;
                        this.$onValueChangeFinished = aVar;
                        this.$isStart = z10;
                        this.$rawOffsetStart = mutableState;
                        this.$rawOffsetEnd = mutableState2;
                        this.$onValueChangeState = state;
                        this.$minPx = ref$FloatRef;
                        this.$maxPx = ref$FloatRef2;
                        this.$valueRange = eVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
                        return new AnonymousClass1(this.$current, this.$target, this.$onValueChangeFinished, this.$isStart, this.$rawOffsetStart, this.$rawOffsetEnd, this.$onValueChangeState, this.$minPx, this.$maxPx, this.$valueRange, cVar);
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
                            Animatable animatableAnimatable$default = AnimatableKt.Animatable$default(this.$current, 0.0f, 2, null);
                            Float fC = jn.a.c(this.$target);
                            TweenSpec tweenSpec = SliderKt.SliderToTickAnimation;
                            Float fC2 = jn.a.c(0.0f);
                            final boolean z10 = this.$isStart;
                            final MutableState<Float> mutableState = this.$rawOffsetStart;
                            final MutableState<Float> mutableState2 = this.$rawOffsetEnd;
                            final State<l<e<Float>, r>> state = this.$onValueChangeState;
                            final Ref$FloatRef ref$FloatRef = this.$minPx;
                            final Ref$FloatRef ref$FloatRef2 = this.$maxPx;
                            final e<Float> eVar = this.$valueRange;
                            l<Animatable<Float, AnimationVector1D>, r> lVar = new l<Animatable<Float, AnimationVector1D>, r>() { // from class: androidx.compose.material.SliderKt.RangeSlider.2.gestureEndAction.1.1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
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
                                    (z10 ? mutableState : mutableState2).setValue(animatable.getValue());
                                    state.getValue().invoke(SliderKt.C12822.invoke$scaleToUserValue(ref$FloatRef, ref$FloatRef2, eVar, m.b(mutableState.getValue().floatValue(), mutableState2.getValue().floatValue())));
                                }
                            };
                            this.label = 1;
                            if (animatableAnimatable$default.animateTo(fC, tweenSpec, fC2, lVar, this) == objG) {
                                return objG;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.c.b(obj);
                        }
                        a<r> aVar = this.$onValueChangeFinished;
                        if (aVar != null) {
                            aVar.invoke();
                        }
                        return r.f5635a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // sn.l
                public /* bridge */ /* synthetic */ r invoke(Boolean bool) {
                    invoke(bool.booleanValue());
                    return r.f5635a;
                }

                public final void invoke(boolean z11) {
                    float fFloatValue = (z11 ? mutableState : mutableState2).getValue().floatValue();
                    float fSnapValueToTick = SliderKt.snapValueToTick(fFloatValue, list, ref$FloatRef2.element, ref$FloatRef.element);
                    if (!(fFloatValue == fSnapValueToTick)) {
                        i.d(coroutineScope, null, null, new AnonymousClass1(fFloatValue, fSnapValueToTick, aVar, z11, mutableState, mutableState2, state, ref$FloatRef2, ref$FloatRef, eVar5, null), 3, null);
                        return;
                    }
                    a<r> aVar2 = aVar;
                    if (aVar2 != null) {
                        aVar2.invoke();
                    }
                }
            }, composer, 0);
            final e<Float> eVar6 = this.$values;
            final State<l<e<Float>, r>> state2 = this.$onValueChangeState;
            Object[] objArr = {mutableState, mutableState2, this.$valueRange, Float.valueOf(ref$FloatRef2.element), Float.valueOf(ref$FloatRef.element), eVar6, state2};
            final e<Float> eVar7 = this.$valueRange;
            composer.startReplaceableGroup(-568225417);
            boolean zChanged = false;
            for (int i11 = 0; i11 < 7; i11++) {
                zChanged |= composer.changed(objArr[i11]);
            }
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChanged || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new sn.p<Boolean, Float, r>() { // from class: androidx.compose.material.SliderKt$RangeSlider$2$onDrag$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // sn.p
                    /* JADX INFO: renamed from: invoke */
                    public /* bridge */ /* synthetic */ r mo2invoke(Boolean bool, Float f10) {
                        invoke(bool.booleanValue(), f10.floatValue());
                        return r.f5635a;
                    }

                    public final void invoke(boolean z11, float f10) {
                        e<Float> eVarB;
                        if (z11) {
                            MutableState<Float> mutableState3 = mutableState;
                            mutableState3.setValue(Float.valueOf(mutableState3.getValue().floatValue() + f10));
                            mutableState2.setValue(Float.valueOf(SliderKt.C12822.invoke$scaleToOffset(eVar7, ref$FloatRef2, ref$FloatRef, eVar6.getEndInclusive().floatValue())));
                            float fFloatValue = mutableState2.getValue().floatValue();
                            eVarB = m.b(n.m(mutableState.getValue().floatValue(), ref$FloatRef2.element, fFloatValue), fFloatValue);
                        } else {
                            MutableState<Float> mutableState4 = mutableState2;
                            mutableState4.setValue(Float.valueOf(mutableState4.getValue().floatValue() + f10));
                            mutableState.setValue(Float.valueOf(SliderKt.C12822.invoke$scaleToOffset(eVar7, ref$FloatRef2, ref$FloatRef, eVar6.getStart().floatValue())));
                            float fFloatValue2 = mutableState.getValue().floatValue();
                            eVarB = m.b(fFloatValue2, n.m(mutableState2.getValue().floatValue(), fFloatValue2, ref$FloatRef.element));
                        }
                        state2.getValue().invoke(SliderKt.C12822.invoke$scaleToUserValue(ref$FloatRef2, ref$FloatRef, eVar7, eVarB));
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            composer.endReplaceableGroup();
            State stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(objRememberedValue4, composer, 0);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierRangeSliderPressDragModifier = SliderKt.rangeSliderPressDragModifier(companion2, this.$startInteractionSource, this.$endInteractionSource, mutableState, mutableState2, this.$enabled, z10, fM3782getMaxWidthimpl, this.$valueRange, stateRememberUpdatedState, stateRememberUpdatedState2);
            final float fM = n.m(this.$values.getStart().floatValue(), this.$valueRange.getStart().floatValue(), this.$values.getEndInclusive().floatValue());
            final float fM2 = n.m(this.$values.getEndInclusive().floatValue(), this.$values.getStart().floatValue(), this.$valueRange.getEndInclusive().floatValue());
            float fCalcFraction = SliderKt.calcFraction(this.$valueRange.getStart().floatValue(), this.$valueRange.getEndInclusive().floatValue(), fM);
            float fCalcFraction2 = SliderKt.calcFraction(this.$valueRange.getStart().floatValue(), this.$valueRange.getEndInclusive().floatValue(), fM2);
            List<Float> list2 = this.$tickFractions;
            boolean z11 = this.$enabled;
            Object obj = this.$onValueChangeState;
            Object objValueOf = Float.valueOf(fM2);
            final State<l<e<Float>, r>> state3 = this.$onValueChangeState;
            composer.startReplaceableGroup(511388516);
            boolean zChanged2 = composer.changed(obj) | composer.changed(objValueOf);
            Object objRememberedValue5 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = new l<Float, r>() { // from class: androidx.compose.material.SliderKt$RangeSlider$2$startThumbSemantics$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // sn.l
                    public /* bridge */ /* synthetic */ r invoke(Float f10) {
                        invoke(f10.floatValue());
                        return r.f5635a;
                    }

                    public final void invoke(float f10) {
                        state3.getValue().invoke(m.b(f10, fM2));
                    }
                };
                composer.updateRememberedValue(objRememberedValue5);
            }
            composer.endReplaceableGroup();
            Modifier modifierSliderSemantics = SliderKt.sliderSemantics(companion2, fM, list2, z11, (l) objRememberedValue5, m.b(this.$valueRange.getStart().floatValue(), fM2), this.$steps);
            List<Float> list3 = this.$tickFractions;
            boolean z12 = this.$enabled;
            Object obj2 = this.$onValueChangeState;
            Object objValueOf2 = Float.valueOf(fM);
            final State<l<e<Float>, r>> state4 = this.$onValueChangeState;
            composer.startReplaceableGroup(511388516);
            boolean zChanged3 = composer.changed(obj2) | composer.changed(objValueOf2);
            Object objRememberedValue6 = composer.rememberedValue();
            if (zChanged3 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue6 = new l<Float, r>() { // from class: androidx.compose.material.SliderKt$RangeSlider$2$endThumbSemantics$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // sn.l
                    public /* bridge */ /* synthetic */ r invoke(Float f10) {
                        invoke(f10.floatValue());
                        return r.f5635a;
                    }

                    public final void invoke(float f10) {
                        state4.getValue().invoke(m.b(fM, f10));
                    }
                };
                composer.updateRememberedValue(objRememberedValue6);
            }
            composer.endReplaceableGroup();
            Modifier modifierSliderSemantics2 = SliderKt.sliderSemantics(companion2, fM2, list3, z12, (l) objRememberedValue6, m.b(fM, this.$valueRange.getEndInclusive().floatValue()), this.$steps);
            boolean z13 = this.$enabled;
            List<Float> list4 = this.$tickFractions;
            SliderColors sliderColors = this.$colors;
            float f10 = ref$FloatRef.element - ref$FloatRef2.element;
            MutableInteractionSource mutableInteractionSource = this.$startInteractionSource;
            MutableInteractionSource mutableInteractionSource2 = this.$endInteractionSource;
            int i12 = this.$$dirty;
            SliderKt.RangeSliderImpl(z13, fCalcFraction, fCalcFraction2, list4, sliderColors, f10, mutableInteractionSource, mutableInteractionSource2, modifierRangeSliderPressDragModifier, modifierSliderSemantics, modifierSliderSemantics2, composer, 14159872 | ((i12 >> 9) & 14) | ((i12 >> 9) & 57344), 0);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material.SliderKt$Slider$3, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Slider.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class C12843 extends Lambda implements q<BoxWithConstraintsScope, Composer, Integer, r> {
        public final /* synthetic */ int $$dirty;
        public final /* synthetic */ SliderColors $colors;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ MutableInteractionSource $interactionSource;
        public final /* synthetic */ a<r> $onValueChangeFinished;
        public final /* synthetic */ State<l<Float, r>> $onValueChangeState;
        public final /* synthetic */ List<Float> $tickFractions;
        public final /* synthetic */ float $value;
        public final /* synthetic */ e<Float> $valueRange;

        /* JADX INFO: renamed from: androidx.compose.material.SliderKt$Slider$3$2, reason: invalid class name */
        /* JADX INFO: compiled from: Slider.kt */
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        public /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements l<Float, Float> {
            public final /* synthetic */ Ref$FloatRef $maxPx;
            public final /* synthetic */ Ref$FloatRef $minPx;
            public final /* synthetic */ e<Float> $valueRange;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(e<Float> eVar, Ref$FloatRef ref$FloatRef, Ref$FloatRef ref$FloatRef2) {
                super(1, p.a.class, "scaleToOffset", "invoke$scaleToOffset(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;F)F", 0);
                this.$valueRange = eVar;
                this.$minPx = ref$FloatRef;
                this.$maxPx = ref$FloatRef2;
            }

            @NotNull
            public final Float invoke(float f10) {
                return Float.valueOf(C12843.invoke$scaleToOffset(this.$valueRange, this.$minPx, this.$maxPx, f10));
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ Float invoke(Float f10) {
                return invoke(f10.floatValue());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C12843(e<Float> eVar, int i10, float f10, MutableInteractionSource mutableInteractionSource, boolean z10, List<Float> list, SliderColors sliderColors, State<? extends l<? super Float, r>> state, a<r> aVar) {
            super(3);
            this.$valueRange = eVar;
            this.$$dirty = i10;
            this.$value = f10;
            this.$interactionSource = mutableInteractionSource;
            this.$enabled = z10;
            this.$tickFractions = list;
            this.$colors = sliderColors;
            this.$onValueChangeState = state;
            this.$onValueChangeFinished = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float invoke$scaleToOffset(e<Float> eVar, Ref$FloatRef ref$FloatRef, Ref$FloatRef ref$FloatRef2, float f10) {
            return SliderKt.scale(eVar.getStart().floatValue(), eVar.getEndInclusive().floatValue(), f10, ref$FloatRef.element, ref$FloatRef2.element);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float invoke$scaleToUserValue(Ref$FloatRef ref$FloatRef, Ref$FloatRef ref$FloatRef2, e<Float> eVar, float f10) {
            return SliderKt.scale(ref$FloatRef.element, ref$FloatRef2.element, f10, eVar.getStart().floatValue(), eVar.getEndInclusive().floatValue());
        }

        @Override // sn.q
        public /* bridge */ /* synthetic */ r invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
            invoke(boxWithConstraintsScope, composer, num.intValue());
            return r.f5635a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@NotNull BoxWithConstraintsScope boxWithConstraintsScope, @Nullable Composer composer, int i10) {
            int i11;
            p.k(boxWithConstraintsScope, "$this$BoxWithConstraints");
            if ((i10 & 14) == 0) {
                i11 = i10 | (composer.changed(boxWithConstraintsScope) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 91) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            boolean z10 = composer.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
            float fM3782getMaxWidthimpl = Constraints.m3782getMaxWidthimpl(boxWithConstraintsScope.getConstraints());
            final Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
            final Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
            Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            ref$FloatRef.element = Math.max(fM3782getMaxWidthimpl - density.mo306toPx0680j_4(SliderKt.getThumbRadius()), 0.0f);
            ref$FloatRef2.element = Math.min(density.mo306toPx0680j_4(SliderKt.getThumbRadius()), ref$FloatRef.element);
            composer.startReplaceableGroup(773894976);
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer));
                composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                objRememberedValue = compositionScopedCoroutineScopeCanceller;
            }
            composer.endReplaceableGroup();
            final l0 coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
            composer.endReplaceableGroup();
            float f10 = this.$value;
            e<Float> eVar = this.$valueRange;
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(invoke$scaleToOffset(eVar, ref$FloatRef2, ref$FloatRef, f10)), null, 2, null);
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceableGroup();
            final MutableState mutableState = (MutableState) objRememberedValue2;
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceableGroup();
            final MutableState mutableState2 = (MutableState) objRememberedValue3;
            Object objValueOf = Float.valueOf(ref$FloatRef2.element);
            Object objValueOf2 = Float.valueOf(ref$FloatRef.element);
            final e<Float> eVar2 = this.$valueRange;
            final State<l<Float, r>> state = this.$onValueChangeState;
            composer.startReplaceableGroup(1618982084);
            boolean zChanged = composer.changed(objValueOf) | composer.changed(objValueOf2) | composer.changed(eVar2);
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChanged || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new SliderDraggableState(new l<Float, r>() { // from class: androidx.compose.material.SliderKt$Slider$3$draggableState$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // sn.l
                    public /* bridge */ /* synthetic */ r invoke(Float f11) {
                        invoke(f11.floatValue());
                        return r.f5635a;
                    }

                    public final void invoke(float f11) {
                        MutableState<Float> mutableState3 = mutableState;
                        mutableState3.setValue(Float.valueOf(mutableState3.getValue().floatValue() + f11 + mutableState2.getValue().floatValue()));
                        mutableState2.setValue(Float.valueOf(0.0f));
                        state.getValue().invoke(Float.valueOf(SliderKt.C12843.invoke$scaleToUserValue(ref$FloatRef2, ref$FloatRef, eVar2, n.m(mutableState.getValue().floatValue(), ref$FloatRef2.element, ref$FloatRef.element))));
                    }
                });
                composer.updateRememberedValue(objRememberedValue4);
            }
            composer.endReplaceableGroup();
            final SliderDraggableState sliderDraggableState = (SliderDraggableState) objRememberedValue4;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$valueRange, ref$FloatRef2, ref$FloatRef);
            e<Float> eVar3 = this.$valueRange;
            e<Float> eVarB = m.b(ref$FloatRef2.element, ref$FloatRef.element);
            float f11 = this.$value;
            int i12 = this.$$dirty;
            SliderKt.CorrectValueSideEffect(anonymousClass2, eVar3, eVarB, mutableState, f11, composer, ((i12 >> 9) & 112) | 3072 | ((i12 << 12) & 57344));
            final List<Float> list = this.$tickFractions;
            final a<r> aVar = this.$onValueChangeFinished;
            State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(new l<Float, r>() { // from class: androidx.compose.material.SliderKt$Slider$3$gestureEndAction$1

                /* JADX INFO: renamed from: androidx.compose.material.SliderKt$Slider$3$gestureEndAction$1$1, reason: invalid class name */
                /* JADX INFO: compiled from: Slider.kt */
                @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                @d(c = "androidx.compose.material.SliderKt$Slider$3$gestureEndAction$1$1", f = "Slider.kt", l = {204}, m = "invokeSuspend")
                public static final class AnonymousClass1 extends SuspendLambda implements sn.p<l0, c<? super r>, Object> {
                    public final /* synthetic */ float $current;
                    public final /* synthetic */ SliderDraggableState $draggableState;
                    public final /* synthetic */ a<r> $onValueChangeFinished;
                    public final /* synthetic */ float $target;
                    public final /* synthetic */ float $velocity;
                    public int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(SliderDraggableState sliderDraggableState, float f10, float f11, float f12, a<r> aVar, c<? super AnonymousClass1> cVar) {
                        super(2, cVar);
                        this.$draggableState = sliderDraggableState;
                        this.$current = f10;
                        this.$target = f11;
                        this.$velocity = f12;
                        this.$onValueChangeFinished = aVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
                        return new AnonymousClass1(this.$draggableState, this.$current, this.$target, this.$velocity, this.$onValueChangeFinished, cVar);
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
                            SliderDraggableState sliderDraggableState = this.$draggableState;
                            float f10 = this.$current;
                            float f11 = this.$target;
                            float f12 = this.$velocity;
                            this.label = 1;
                            if (SliderKt.animateToTarget(sliderDraggableState, f10, f11, f12, this) == objG) {
                                return objG;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.c.b(obj);
                        }
                        a<r> aVar = this.$onValueChangeFinished;
                        if (aVar != null) {
                            aVar.invoke();
                        }
                        return r.f5635a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // sn.l
                public /* bridge */ /* synthetic */ r invoke(Float f12) {
                    invoke(f12.floatValue());
                    return r.f5635a;
                }

                public final void invoke(float f12) {
                    a<r> aVar2;
                    float fFloatValue = mutableState.getValue().floatValue();
                    float fSnapValueToTick = SliderKt.snapValueToTick(fFloatValue, list, ref$FloatRef2.element, ref$FloatRef.element);
                    if (!(fFloatValue == fSnapValueToTick)) {
                        i.d(coroutineScope, null, null, new AnonymousClass1(sliderDraggableState, fFloatValue, fSnapValueToTick, f12, aVar, null), 3, null);
                    } else {
                        if (sliderDraggableState.isDragging() || (aVar2 = aVar) == null) {
                            return;
                        }
                        aVar2.invoke();
                    }
                }
            }, composer, 0);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierSliderTapModifier = SliderKt.sliderTapModifier(companion2, sliderDraggableState, this.$interactionSource, fM3782getMaxWidthimpl, z10, mutableState, stateRememberUpdatedState, mutableState2, this.$enabled);
            Orientation orientation = Orientation.Horizontal;
            boolean zIsDragging = sliderDraggableState.isDragging();
            boolean z11 = this.$enabled;
            MutableInteractionSource mutableInteractionSource = this.$interactionSource;
            composer.startReplaceableGroup(1157296644);
            boolean zChanged2 = composer.changed(stateRememberUpdatedState);
            Object objRememberedValue5 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new SliderKt$Slider$3$drag$1$1(stateRememberUpdatedState, null);
                composer.updateRememberedValue(objRememberedValue5);
            }
            composer.endReplaceableGroup();
            Modifier modifierDraggable = DraggableKt.draggable(companion2, sliderDraggableState, orientation, (32 & 4) != 0 ? true : z11, (32 & 8) != 0 ? null : mutableInteractionSource, (32 & 16) != 0 ? false : zIsDragging, (32 & 32) != 0 ? new DraggableKt.C11921(null) : null, (32 & 64) != 0 ? new DraggableKt.AnonymousClass2(null) : (q) objRememberedValue5, (32 & 128) != 0 ? false : z10);
            float fCalcFraction = SliderKt.calcFraction(this.$valueRange.getStart().floatValue(), this.$valueRange.getEndInclusive().floatValue(), n.m(this.$value, this.$valueRange.getStart().floatValue(), this.$valueRange.getEndInclusive().floatValue()));
            boolean z12 = this.$enabled;
            List<Float> list2 = this.$tickFractions;
            SliderColors sliderColors = this.$colors;
            float f12 = ref$FloatRef.element - ref$FloatRef2.element;
            MutableInteractionSource mutableInteractionSource2 = this.$interactionSource;
            Modifier modifierThen = modifierSliderTapModifier.then(modifierDraggable);
            int i13 = this.$$dirty;
            SliderKt.SliderImpl(z12, fCalcFraction, list2, sliderColors, f12, mutableInteractionSource2, modifierThen, composer, ((i13 >> 9) & 14) | 512 | ((i13 >> 15) & 7168) | ((i13 >> 6) & 458752));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material.SliderKt$animateToTarget$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Slider.kt */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/foundation/gestures/DragScope;", "Lbn/r;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @d(c = "androidx.compose.material.SliderKt$animateToTarget$2", f = "Slider.kt", l = {927}, m = "invokeSuspend")
    public static final class C12872 extends SuspendLambda implements sn.p<DragScope, c<? super r>, Object> {
        public final /* synthetic */ float $current;
        public final /* synthetic */ float $target;
        public final /* synthetic */ float $velocity;
        private /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12872(float f10, float f11, float f12, c<? super C12872> cVar) {
            super(2, cVar);
            this.$current = f10;
            this.$target = f11;
            this.$velocity = f12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            C12872 c12872 = new C12872(this.$current, this.$target, this.$velocity, cVar);
            c12872.L$0 = obj;
            return c12872;
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull DragScope dragScope, @Nullable c<? super r> cVar) {
            return ((C12872) create(dragScope, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = in.a.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                final DragScope dragScope = (DragScope) this.L$0;
                final Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
                float f10 = this.$current;
                ref$FloatRef.element = f10;
                Animatable animatableAnimatable$default = AnimatableKt.Animatable$default(f10, 0.0f, 2, null);
                Float fC = jn.a.c(this.$target);
                TweenSpec tweenSpec = SliderKt.SliderToTickAnimation;
                Float fC2 = jn.a.c(this.$velocity);
                l<Animatable<Float, AnimationVector1D>, r> lVar = new l<Animatable<Float, AnimationVector1D>, r>() { // from class: androidx.compose.material.SliderKt.animateToTarget.2.1
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
                if (animatableAnimatable$default.animateTo(fC, tweenSpec, fC2, lVar, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            return r.f5635a;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Slider.kt */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Lbn/r;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @d(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1", f = "Slider.kt", l = {955}, m = "invokeSuspend")
    public static final class C12881 extends SuspendLambda implements sn.p<PointerInputScope, c<? super r>, Object> {
        public final /* synthetic */ MutableInteractionSource $endInteractionSource;
        public final /* synthetic */ State<l<Boolean, r>> $gestureEndAction;
        public final /* synthetic */ boolean $isRtl;
        public final /* synthetic */ float $maxPx;
        public final /* synthetic */ State<sn.p<Boolean, Float, r>> $onDrag;
        public final /* synthetic */ State<Float> $rawOffsetEnd;
        public final /* synthetic */ State<Float> $rawOffsetStart;
        public final /* synthetic */ MutableInteractionSource $startInteractionSource;
        private /* synthetic */ Object L$0;
        public int label;

        /* JADX INFO: renamed from: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: Slider.kt */
        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Ldo/l0;", "Lbn/r;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @d(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1", f = "Slider.kt", l = {956}, m = "invokeSuspend")
        public static final class C00841 extends SuspendLambda implements sn.p<l0, c<? super r>, Object> {
            public final /* synthetic */ PointerInputScope $$this$pointerInput;
            public final /* synthetic */ State<l<Boolean, r>> $gestureEndAction;
            public final /* synthetic */ boolean $isRtl;
            public final /* synthetic */ float $maxPx;
            public final /* synthetic */ State<sn.p<Boolean, Float, r>> $onDrag;
            public final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
            public final /* synthetic */ State<Float> $rawOffsetEnd;
            public final /* synthetic */ State<Float> $rawOffsetStart;
            private /* synthetic */ Object L$0;
            public int label;

            /* JADX INFO: renamed from: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: Slider.kt */
            @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Lbn/r;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
            @d(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1", f = "Slider.kt", l = {957}, m = "invokeSuspend")
            public static final class C00851 extends SuspendLambda implements sn.p<PointerInputScope, c<? super r>, Object> {
                public final /* synthetic */ l0 $$this$coroutineScope;
                public final /* synthetic */ State<l<Boolean, r>> $gestureEndAction;
                public final /* synthetic */ boolean $isRtl;
                public final /* synthetic */ float $maxPx;
                public final /* synthetic */ State<sn.p<Boolean, Float, r>> $onDrag;
                public final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
                public final /* synthetic */ State<Float> $rawOffsetEnd;
                public final /* synthetic */ State<Float> $rawOffsetStart;
                private /* synthetic */ Object L$0;
                public int label;

                /* JADX INFO: renamed from: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1$1, reason: invalid class name and collision with other inner class name */
                /* JADX INFO: compiled from: Slider.kt */
                @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Lbn/r;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
                @d(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1$1", f = "Slider.kt", l = {958, 968, 987}, m = "invokeSuspend")
                public static final class C00861 extends RestrictedSuspendLambda implements sn.p<AwaitPointerEventScope, c<? super r>, Object> {
                    public final /* synthetic */ l0 $$this$coroutineScope;
                    public final /* synthetic */ State<l<Boolean, r>> $gestureEndAction;
                    public final /* synthetic */ boolean $isRtl;
                    public final /* synthetic */ float $maxPx;
                    public final /* synthetic */ State<sn.p<Boolean, Float, r>> $onDrag;
                    public final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
                    public final /* synthetic */ State<Float> $rawOffsetEnd;
                    public final /* synthetic */ State<Float> $rawOffsetStart;
                    private /* synthetic */ Object L$0;
                    public Object L$1;
                    public Object L$2;
                    public Object L$3;
                    public Object L$4;
                    public int label;

                    /* JADX INFO: renamed from: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: Slider.kt */
                    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Ldo/l0;", "Lbn/r;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
                    @d(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1$1$2", f = "Slider.kt", l = {1004}, m = "invokeSuspend")
                    public static final class AnonymousClass2 extends SuspendLambda implements sn.p<l0, c<? super r>, Object> {
                        public final /* synthetic */ Ref$BooleanRef $draggingStart;
                        public final /* synthetic */ DragInteraction $finishInteraction;
                        public final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
                        public int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass2(RangeSliderLogic rangeSliderLogic, Ref$BooleanRef ref$BooleanRef, DragInteraction dragInteraction, c<? super AnonymousClass2> cVar) {
                            super(2, cVar);
                            this.$rangeSliderLogic = rangeSliderLogic;
                            this.$draggingStart = ref$BooleanRef;
                            this.$finishInteraction = dragInteraction;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @NotNull
                        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
                            return new AnonymousClass2(this.$rangeSliderLogic, this.$draggingStart, this.$finishInteraction, cVar);
                        }

                        @Override // sn.p
                        @Nullable
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                        public final Object mo2invoke(@NotNull l0 l0Var, @Nullable c<? super r> cVar) {
                            return ((AnonymousClass2) create(l0Var, cVar)).invokeSuspend(r.f5635a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) {
                            Object objG = in.a.g();
                            int i10 = this.label;
                            if (i10 == 0) {
                                kotlin.c.b(obj);
                                MutableInteractionSource mutableInteractionSourceActiveInteraction = this.$rangeSliderLogic.activeInteraction(this.$draggingStart.element);
                                DragInteraction dragInteraction = this.$finishInteraction;
                                this.label = 1;
                                if (mutableInteractionSourceActiveInteraction.emit(dragInteraction, this) == objG) {
                                    return objG;
                                }
                            } else {
                                if (i10 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.c.b(obj);
                            }
                            return r.f5635a;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C00861(boolean z10, float f10, RangeSliderLogic rangeSliderLogic, State<Float> state, l0 l0Var, State<? extends l<? super Boolean, r>> state2, State<Float> state3, State<? extends sn.p<? super Boolean, ? super Float, r>> state4, c<? super C00861> cVar) {
                        super(2, cVar);
                        this.$isRtl = z10;
                        this.$maxPx = f10;
                        this.$rangeSliderLogic = rangeSliderLogic;
                        this.$rawOffsetStart = state;
                        this.$$this$coroutineScope = l0Var;
                        this.$gestureEndAction = state2;
                        this.$rawOffsetEnd = state3;
                        this.$onDrag = state4;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
                        C00861 c00861 = new C00861(this.$isRtl, this.$maxPx, this.$rangeSliderLogic, this.$rawOffsetStart, this.$$this$coroutineScope, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, cVar);
                        c00861.L$0 = obj;
                        return c00861;
                    }

                    @Override // sn.p
                    @Nullable
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                    public final Object mo2invoke(@NotNull AwaitPointerEventScope awaitPointerEventScope, @Nullable c<? super r> cVar) {
                        return ((C00861) create(awaitPointerEventScope, cVar)).invokeSuspend(r.f5635a);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:35:0x00d9  */
                    /* JADX WARN: Removed duplicated region for block: B:55:0x0172 A[RETURN] */
                    /* JADX WARN: Removed duplicated region for block: B:56:0x0173  */
                    /* JADX WARN: Removed duplicated region for block: B:59:0x017d A[Catch: CancellationException -> 0x018b, TryCatch #0 {CancellationException -> 0x018b, blocks: (B:8:0x001d, B:57:0x0175, B:59:0x017d, B:60:0x0183), top: B:67:0x001d }] */
                    /* JADX WARN: Removed duplicated region for block: B:60:0x0183 A[Catch: CancellationException -> 0x018b, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x018b, blocks: (B:8:0x001d, B:57:0x0175, B:59:0x017d, B:60:0x0183), top: B:67:0x001d }] */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @org.jetbrains.annotations.Nullable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r17) {
                        /*
                            Method dump skipped, instruction units count: 436
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SliderKt.C12881.C00841.C00851.C00861.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C00851(boolean z10, float f10, RangeSliderLogic rangeSliderLogic, State<Float> state, l0 l0Var, State<? extends l<? super Boolean, r>> state2, State<Float> state3, State<? extends sn.p<? super Boolean, ? super Float, r>> state4, c<? super C00851> cVar) {
                    super(2, cVar);
                    this.$isRtl = z10;
                    this.$maxPx = f10;
                    this.$rangeSliderLogic = rangeSliderLogic;
                    this.$rawOffsetStart = state;
                    this.$$this$coroutineScope = l0Var;
                    this.$gestureEndAction = state2;
                    this.$rawOffsetEnd = state3;
                    this.$onDrag = state4;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
                    C00851 c00851 = new C00851(this.$isRtl, this.$maxPx, this.$rangeSliderLogic, this.$rawOffsetStart, this.$$this$coroutineScope, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, cVar);
                    c00851.L$0 = obj;
                    return c00851;
                }

                @Override // sn.p
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                public final Object mo2invoke(@NotNull PointerInputScope pointerInputScope, @Nullable c<? super r> cVar) {
                    return ((C00851) create(pointerInputScope, cVar)).invokeSuspend(r.f5635a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object objG = in.a.g();
                    int i10 = this.label;
                    if (i10 == 0) {
                        kotlin.c.b(obj);
                        PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                        C00861 c00861 = new C00861(this.$isRtl, this.$maxPx, this.$rangeSliderLogic, this.$rawOffsetStart, this.$$this$coroutineScope, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, null);
                        this.label = 1;
                        if (pointerInputScope.awaitPointerEventScope(c00861, this) == objG) {
                            return objG;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.c.b(obj);
                    }
                    return r.f5635a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C00841(PointerInputScope pointerInputScope, boolean z10, float f10, RangeSliderLogic rangeSliderLogic, State<Float> state, State<? extends l<? super Boolean, r>> state2, State<Float> state3, State<? extends sn.p<? super Boolean, ? super Float, r>> state4, c<? super C00841> cVar) {
                super(2, cVar);
                this.$$this$pointerInput = pointerInputScope;
                this.$isRtl = z10;
                this.$maxPx = f10;
                this.$rangeSliderLogic = rangeSliderLogic;
                this.$rawOffsetStart = state;
                this.$gestureEndAction = state2;
                this.$rawOffsetEnd = state3;
                this.$onDrag = state4;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
                C00841 c00841 = new C00841(this.$$this$pointerInput, this.$isRtl, this.$maxPx, this.$rangeSliderLogic, this.$rawOffsetStart, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, cVar);
                c00841.L$0 = obj;
                return c00841;
            }

            @Override // sn.p
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final Object mo2invoke(@NotNull l0 l0Var, @Nullable c<? super r> cVar) {
                return ((C00841) create(l0Var, cVar)).invokeSuspend(r.f5635a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objG = in.a.g();
                int i10 = this.label;
                if (i10 == 0) {
                    kotlin.c.b(obj);
                    l0 l0Var = (l0) this.L$0;
                    PointerInputScope pointerInputScope = this.$$this$pointerInput;
                    C00851 c00851 = new C00851(this.$isRtl, this.$maxPx, this.$rangeSliderLogic, this.$rawOffsetStart, l0Var, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, null);
                    this.label = 1;
                    if (ForEachGestureKt.forEachGesture(pointerInputScope, c00851, this) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.c.b(obj);
                }
                return r.f5635a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C12881(MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, State<Float> state, State<Float> state2, State<? extends sn.p<? super Boolean, ? super Float, r>> state3, boolean z10, float f10, State<? extends l<? super Boolean, r>> state4, c<? super C12881> cVar) {
            super(2, cVar);
            this.$startInteractionSource = mutableInteractionSource;
            this.$endInteractionSource = mutableInteractionSource2;
            this.$rawOffsetStart = state;
            this.$rawOffsetEnd = state2;
            this.$onDrag = state3;
            this.$isRtl = z10;
            this.$maxPx = f10;
            this.$gestureEndAction = state4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            C12881 c12881 = new C12881(this.$startInteractionSource, this.$endInteractionSource, this.$rawOffsetStart, this.$rawOffsetEnd, this.$onDrag, this.$isRtl, this.$maxPx, this.$gestureEndAction, cVar);
            c12881.L$0 = obj;
            return c12881;
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull PointerInputScope pointerInputScope, @Nullable c<? super r> cVar) {
            return ((C12881) create(pointerInputScope, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = in.a.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                C00841 c00841 = new C00841((PointerInputScope) this.L$0, this.$isRtl, this.$maxPx, new RangeSliderLogic(this.$startInteractionSource, this.$endInteractionSource, this.$rawOffsetStart, this.$rawOffsetEnd, this.$onDrag), this.$rawOffsetStart, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, null);
                this.label = 1;
                if (kotlinx.coroutines.d.f(c00841, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            return r.f5635a;
        }
    }

    static {
        float fM3826constructorimpl = Dp.m3826constructorimpl(48);
        SliderHeight = fM3826constructorimpl;
        float fM3826constructorimpl2 = Dp.m3826constructorimpl(144);
        SliderMinWidth = fM3826constructorimpl2;
        DefaultSliderConstraints = SizeKt.m440heightInVpY3zN4$default(SizeKt.m459widthInVpY3zN4$default(Modifier.INSTANCE, fM3826constructorimpl2, 0.0f, 2, null), 0.0f, fM3826constructorimpl, 1, null);
        SliderToTickAnimation = new TweenSpec<>(100, 0, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r14v0 ??, still in use, count: 1, list:
          (r14v0 ?? I:java.lang.Object) from 0x00c0: INVOKE (r11v0 ?? I:androidx.compose.runtime.Composer), (r14v0 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)]
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
    public static final void CorrectValueSideEffect(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r14v0 ??, still in use, count: 1, list:
          (r14v0 ?? I:java.lang.Object) from 0x00c0: INVOKE (r11v0 ?? I:androidx.compose.runtime.Composer), (r14v0 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r15v0 ??
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

    /* JADX WARN: Removed duplicated region for block: B:106:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011a  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void RangeSlider(@org.jetbrains.annotations.NotNull final zn.e<java.lang.Float> r42, @org.jetbrains.annotations.NotNull final sn.l<? super zn.e<java.lang.Float>, bn.r> r43, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r44, boolean r45, @org.jetbrains.annotations.Nullable zn.e<java.lang.Float> r46, int r47, @org.jetbrains.annotations.Nullable sn.a<bn.r> r48, @org.jetbrains.annotations.Nullable androidx.compose.material.SliderColors r49, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r50, final int r51, final int r52) {
        /*
            Method dump skipped, instruction units count: 673
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SliderKt.RangeSlider(zn.e, sn.l, androidx.compose.ui.Modifier, boolean, zn.e, int, sn.a, androidx.compose.material.SliderColors, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void RangeSliderImpl(final boolean z10, final float f10, final float f11, final List<Float> list, final SliderColors sliderColors, final float f12, final MutableInteractionSource mutableInteractionSource, final MutableInteractionSource mutableInteractionSource2, final Modifier modifier, final Modifier modifier2, final Modifier modifier3, Composer composer, final int i10, final int i11) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-278895713);
        Strings.Companion companion = Strings.INSTANCE;
        final String strM1161getString4foXLRw = Strings_androidKt.m1161getString4foXLRw(companion.m1160getSliderRangeStartUdPEhr4(), composerStartRestartGroup, 6);
        final String strM1161getString4foXLRw2 = Strings_androidKt.m1161getString4foXLRw(companion.m1159getSliderRangeEndUdPEhr4(), composerStartRestartGroup, 6);
        Modifier modifierThen = modifier.then(DefaultSliderConstraints);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        a<ComposeUiNode> constructor = companion3.getConstructor();
        q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r> qVarMaterializerOf = LayoutKt.materializerOf(modifierThen);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor);
        } else {
            composerStartRestartGroup.useNode();
        }
        composerStartRestartGroup.disableReusing();
        Composer composerM1274constructorimpl = Updater.m1274constructorimpl(composerStartRestartGroup);
        Updater.m1281setimpl(composerM1274constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m1281setimpl(composerM1274constructorimpl, density, companion3.getSetDensity());
        Updater.m1281setimpl(composerM1274constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
        Updater.m1281setimpl(composerM1274constructorimpl, viewConfiguration, companion3.getSetViewConfiguration());
        composerStartRestartGroup.enableReusing();
        qVarMaterializerOf.invoke(SkippableUpdater.m1264boximpl(SkippableUpdater.m1265constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        composerStartRestartGroup.startReplaceableGroup(-2137368960);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(2044256857);
        Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        float fMo306toPx0680j_4 = density2.mo306toPx0680j_4(TrackHeight);
        float f13 = ThumbRadius;
        float fMo306toPx0680j_42 = density2.mo306toPx0680j_4(f13);
        float fMo302toDpu2uoSUM = density2.mo302toDpu2uoSUM(f12);
        r rVar = r.f5635a;
        float fM3826constructorimpl = Dp.m3826constructorimpl(f13 * 2);
        float fM3826constructorimpl2 = Dp.m3826constructorimpl(fMo302toDpu2uoSUM * f10);
        float fM3826constructorimpl3 = Dp.m3826constructorimpl(fMo302toDpu2uoSUM * f11);
        Modifier.Companion companion4 = Modifier.INSTANCE;
        int i12 = i10 >> 9;
        int i13 = i10 << 6;
        Track(SizeKt.fillMaxSize$default(boxScopeInstance.align(companion4, companion2.getCenterStart()), 0.0f, 1, null), sliderColors, z10, f10, f11, list, fMo306toPx0680j_42, fMo306toPx0680j_4, composerStartRestartGroup, 262144 | (i12 & 112) | (i13 & 896) | (i13 & 7168) | (i13 & 57344));
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged = composerStartRestartGroup.changed(strM1161getString4foXLRw);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new l<SemanticsPropertyReceiver, r>() { // from class: androidx.compose.material.SliderKt$RangeSliderImpl$1$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // sn.l
                public /* bridge */ /* synthetic */ r invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return r.f5635a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    p.k(semanticsPropertyReceiver, "$this$semantics");
                    SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, strM1161getString4foXLRw);
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        int i14 = i10 & 57344;
        int i15 = (i10 << 15) & 458752;
        m1139SliderThumbPcYyNuk(boxScopeInstance, FocusableKt.focusable(SemanticsModifierKt.semantics(companion4, true, (l) objRememberedValue), true, mutableInteractionSource).then(modifier2), fM3826constructorimpl2, mutableInteractionSource, sliderColors, z10, fM3826constructorimpl, composerStartRestartGroup, 1572870 | (i12 & 7168) | i14 | i15);
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged2 = composerStartRestartGroup.changed(strM1161getString4foXLRw2);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new l<SemanticsPropertyReceiver, r>() { // from class: androidx.compose.material.SliderKt$RangeSliderImpl$1$3$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // sn.l
                public /* bridge */ /* synthetic */ r invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return r.f5635a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    p.k(semanticsPropertyReceiver, "$this$semantics");
                    SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, strM1161getString4foXLRw2);
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        m1139SliderThumbPcYyNuk(boxScopeInstance, FocusableKt.focusable(SemanticsModifierKt.semantics(companion4, true, (l) objRememberedValue2), true, mutableInteractionSource2).then(modifier3), fM3826constructorimpl3, mutableInteractionSource2, sliderColors, z10, fM3826constructorimpl, composerStartRestartGroup, 1572870 | ((i10 >> 12) & 7168) | i14 | i15);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new sn.p<Composer, Integer, r>() { // from class: androidx.compose.material.SliderKt.RangeSliderImpl.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ r mo2invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return r.f5635a;
            }

            public final void invoke(@Nullable Composer composer2, int i16) {
                SliderKt.RangeSliderImpl(z10, f10, f11, list, sliderColors, f12, mutableInteractionSource, mutableInteractionSource2, modifier, modifier2, modifier3, composer2, i10 | 1, i11);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0117  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Slider(final float r39, @org.jetbrains.annotations.NotNull final sn.l<? super java.lang.Float, bn.r> r40, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r41, boolean r42, @org.jetbrains.annotations.Nullable zn.e<java.lang.Float> r43, int r44, @org.jetbrains.annotations.Nullable sn.a<bn.r> r45, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r46, @org.jetbrains.annotations.Nullable androidx.compose.material.SliderColors r47, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r48, final int r49, final int r50) {
        /*
            Method dump skipped, instruction units count: 713
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SliderKt.Slider(float, sn.l, androidx.compose.ui.Modifier, boolean, zn.e, int, sn.a, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.material.SliderColors, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void SliderImpl(final boolean z10, final float f10, final List<Float> list, final SliderColors sliderColors, final float f11, final MutableInteractionSource mutableInteractionSource, final Modifier modifier, Composer composer, final int i10) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1679682785);
        Modifier modifierThen = modifier.then(DefaultSliderConstraints);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        a<ComposeUiNode> constructor = companion.getConstructor();
        q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r> qVarMaterializerOf = LayoutKt.materializerOf(modifierThen);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor);
        } else {
            composerStartRestartGroup.useNode();
        }
        composerStartRestartGroup.disableReusing();
        Composer composerM1274constructorimpl = Updater.m1274constructorimpl(composerStartRestartGroup);
        Updater.m1281setimpl(composerM1274constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m1281setimpl(composerM1274constructorimpl, density, companion.getSetDensity());
        Updater.m1281setimpl(composerM1274constructorimpl, layoutDirection, companion.getSetLayoutDirection());
        Updater.m1281setimpl(composerM1274constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
        composerStartRestartGroup.enableReusing();
        qVarMaterializerOf.invoke(SkippableUpdater.m1264boximpl(SkippableUpdater.m1265constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        composerStartRestartGroup.startReplaceableGroup(-2137368960);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(231316251);
        Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        float fMo306toPx0680j_4 = density2.mo306toPx0680j_4(TrackHeight);
        float f12 = ThumbRadius;
        float fMo306toPx0680j_42 = density2.mo306toPx0680j_4(f12);
        float fMo302toDpu2uoSUM = density2.mo302toDpu2uoSUM(f11);
        float fM3826constructorimpl = Dp.m3826constructorimpl(f12 * 2);
        float fM3826constructorimpl2 = Dp.m3826constructorimpl(fMo302toDpu2uoSUM * f10);
        Modifier.Companion companion2 = Modifier.INSTANCE;
        int i11 = i10 >> 6;
        Track(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), sliderColors, z10, 0.0f, f10, list, fMo306toPx0680j_42, fMo306toPx0680j_4, composerStartRestartGroup, 265222 | (i11 & 112) | ((i10 << 6) & 896) | ((i10 << 9) & 57344));
        m1139SliderThumbPcYyNuk(boxScopeInstance, companion2, fM3826constructorimpl2, mutableInteractionSource, sliderColors, z10, fM3826constructorimpl, composerStartRestartGroup, 1572918 | (i11 & 7168) | ((i10 << 3) & 57344) | (458752 & (i10 << 15)));
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new sn.p<Composer, Integer, r>() { // from class: androidx.compose.material.SliderKt.SliderImpl.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ r mo2invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return r.f5635a;
            }

            public final void invoke(@Nullable Composer composer2, int i12) {
                SliderKt.SliderImpl(z10, f10, list, sliderColors, f11, mutableInteractionSource, modifier, composer2, i10 | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* JADX INFO: renamed from: SliderThumb-PcYyNuk, reason: not valid java name */
    public static final void m1139SliderThumbPcYyNuk(final BoxScope boxScope, final Modifier modifier, final float f10, final MutableInteractionSource mutableInteractionSource, final SliderColors sliderColors, final boolean z10, final float f11, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(428907178);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.changed(f10) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 2048 : 1024;
        }
        if ((57344 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(sliderColors) ? 16384 : 8192;
        }
        if ((458752 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(z10) ? 131072 : 65536;
        }
        if ((3670016 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(f11) ? 1048576 : 524288;
        }
        if ((2995931 & i11) == 599186 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            Modifier modifierM415paddingqDBjuR0$default = PaddingKt.m415paddingqDBjuR0$default(Modifier.INSTANCE, f10, 0.0f, 0.0f, 0.0f, 14, null);
            Alignment.Companion companion = Alignment.INSTANCE;
            Modifier modifierAlign = boxScope.align(modifierM415paddingqDBjuR0$default, companion.getCenterStart());
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            a<ComposeUiNode> constructor = companion2.getConstructor();
            q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r> qVarMaterializerOf = LayoutKt.materializerOf(modifierAlign);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM1274constructorimpl = Updater.m1274constructorimpl(composerStartRestartGroup);
            Updater.m1281setimpl(composerM1274constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1281setimpl(composerM1274constructorimpl, density, companion2.getSetDensity());
            Updater.m1281setimpl(composerM1274constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
            Updater.m1281setimpl(composerM1274constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            qVarMaterializerOf.invoke(SkippableUpdater.m1264boximpl(SkippableUpdater.m1265constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.startReplaceableGroup(-2137368960);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(-587645648);
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion3 = Composer.INSTANCE;
            if (objRememberedValue == companion3.getEmpty()) {
                objRememberedValue = SnapshotStateKt.mutableStateListOf();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            SnapshotStateList snapshotStateList = (SnapshotStateList) objRememberedValue;
            int i12 = i11 >> 9;
            int i13 = i12 & 14;
            composerStartRestartGroup.startReplaceableGroup(511388516);
            boolean zChanged = composerStartRestartGroup.changed(mutableInteractionSource) | composerStartRestartGroup.changed(snapshotStateList);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion3.getEmpty()) {
                objRememberedValue2 = new SliderKt$SliderThumb$1$1$1(mutableInteractionSource, snapshotStateList, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(mutableInteractionSource, (sn.p<? super l0, ? super c<? super r>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, i13);
            SpacerKt.Spacer(BackgroundKt.m163backgroundbw27NRU(ShadowKt.m1312shadows4CzXII$default(HoverableKt.hoverable$default(IndicationKt.indication(SizeKt.m454sizeVpY3zN4(modifier, f11, f11), mutableInteractionSource, RippleKt.m1253rememberRipple9IZ8Weo(false, ThumbRippleRadius, 0L, composerStartRestartGroup, 54, 4)), mutableInteractionSource, false, 2, null), z10 ? snapshotStateList.isEmpty() ^ true ? ThumbPressedElevation : ThumbDefaultElevation : Dp.m3826constructorimpl(0), RoundedCornerShapeKt.getCircleShape(), false, 0L, 0L, 24, null), sliderColors.thumbColor(z10, composerStartRestartGroup, ((i11 >> 15) & 14) | (i12 & 112)).getValue().m1629unboximpl(), RoundedCornerShapeKt.getCircleShape()), composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new sn.p<Composer, Integer, r>() { // from class: androidx.compose.material.SliderKt$SliderThumb$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ r mo2invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return r.f5635a;
            }

            public final void invoke(@Nullable Composer composer2, int i14) {
                SliderKt.m1139SliderThumbPcYyNuk(boxScope, modifier, f10, mutableInteractionSource, sliderColors, z10, f11, composer2, i10 | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void Track(final Modifier modifier, final SliderColors sliderColors, final boolean z10, final float f10, final float f11, final List<Float> list, final float f12, final float f13, Composer composer, final int i10) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1833126050);
        int i11 = ((i10 >> 6) & 14) | 48 | ((i10 << 3) & 896);
        final State<Color> stateTrackColor = sliderColors.trackColor(z10, false, composerStartRestartGroup, i11);
        final State<Color> stateTrackColor2 = sliderColors.trackColor(z10, true, composerStartRestartGroup, i11);
        final State<Color> stateTickColor = sliderColors.tickColor(z10, false, composerStartRestartGroup, i11);
        final State<Color> stateTickColor2 = sliderColors.tickColor(z10, true, composerStartRestartGroup, i11);
        CanvasKt.Canvas(modifier, new l<DrawScope, r>() { // from class: androidx.compose.material.SliderKt.Track.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(DrawScope drawScope) {
                invoke2(drawScope);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull DrawScope drawScope) {
                p.k(drawScope, "$this$Canvas");
                boolean z11 = drawScope.getLayoutDirection() == LayoutDirection.Rtl;
                long jOffset = OffsetKt.Offset(f12, Offset.m1384getYimpl(drawScope.mo2112getCenterF1C5BW0()));
                long jOffset2 = OffsetKt.Offset(Size.m1452getWidthimpl(drawScope.mo2113getSizeNHjbRc()) - f12, Offset.m1384getYimpl(drawScope.mo2112getCenterF1C5BW0()));
                long j10 = z11 ? jOffset2 : jOffset;
                long j11 = z11 ? jOffset : jOffset2;
                long jM1629unboximpl = stateTrackColor.getValue().m1629unboximpl();
                float f14 = f13;
                StrokeCap.Companion companion = StrokeCap.INSTANCE;
                long j12 = j11;
                long j13 = j10;
                DrawScope.m2100drawLineNGM6Ib0$default(drawScope, jM1629unboximpl, j10, j11, f14, companion.m1924getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                DrawScope.m2100drawLineNGM6Ib0$default(drawScope, stateTrackColor2.getValue().m1629unboximpl(), OffsetKt.Offset(Offset.m1383getXimpl(j13) + ((Offset.m1383getXimpl(j12) - Offset.m1383getXimpl(j13)) * f10), Offset.m1384getYimpl(drawScope.mo2112getCenterF1C5BW0())), OffsetKt.Offset(Offset.m1383getXimpl(j13) + ((Offset.m1383getXimpl(j12) - Offset.m1383getXimpl(j13)) * f11), Offset.m1384getYimpl(drawScope.mo2112getCenterF1C5BW0())), f13, companion.m1924getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                List<Float> list2 = list;
                float f15 = f11;
                float f16 = f10;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj : list2) {
                    float fFloatValue = ((Number) obj).floatValue();
                    Boolean boolValueOf = Boolean.valueOf(fFloatValue > f15 || fFloatValue < f16);
                    Object arrayList = linkedHashMap.get(boolValueOf);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(boolValueOf, arrayList);
                    }
                    ((List) arrayList).add(obj);
                }
                State<Color> state = stateTickColor;
                State<Color> state2 = stateTickColor2;
                float f17 = f13;
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    boolean zBooleanValue = ((Boolean) entry.getKey()).booleanValue();
                    List list3 = (List) entry.getValue();
                    ArrayList arrayList2 = new ArrayList(x.x(list3, 10));
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(Offset.m1372boximpl(OffsetKt.Offset(Offset.m1383getXimpl(OffsetKt.m1406lerpWko1d7g(j13, j12, ((Number) it.next()).floatValue())), Offset.m1384getYimpl(drawScope.mo2112getCenterF1C5BW0()))));
                    }
                    long j14 = j12;
                    long j15 = j13;
                    DrawScope.m2105drawPointsF8ZwMP8$default(drawScope, arrayList2, PointMode.INSTANCE.m1885getPointsr_lszbg(), (zBooleanValue ? state : state2).getValue().m1629unboximpl(), f17, StrokeCap.INSTANCE.m1924getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                    j13 = j15;
                    f17 = f17;
                    j12 = j14;
                }
            }
        }, composerStartRestartGroup, i10 & 14);
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new sn.p<Composer, Integer, r>() { // from class: androidx.compose.material.SliderKt.Track.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ r mo2invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return r.f5635a;
            }

            public final void invoke(@Nullable Composer composer2, int i12) {
                SliderKt.Track(modifier, sliderColors, z10, f10, f11, list, f12, f13, composer2, i10 | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object animateToTarget(DraggableState draggableState, float f10, float f11, float f12, c<? super r> cVar) {
        Object objDrag$default = DraggableState.drag$default(draggableState, null, new C12872(f10, f11, f12, null), cVar, 1, null);
        return objDrag$default == in.a.g() ? objDrag$default : r.f5635a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: awaitSlop-8vUncbI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m1142awaitSlop8vUncbI(androidx.compose.ui.input.pointer.AwaitPointerEventScope r8, long r9, int r11, hn.c<? super kotlin.Pair<androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Float>> r12) {
        /*
            boolean r0 = r12 instanceof androidx.compose.material.SliderKt$awaitSlop$1
            if (r0 == 0) goto L13
            r0 = r12
            androidx.compose.material.SliderKt$awaitSlop$1 r0 = (androidx.compose.material.SliderKt$awaitSlop$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material.SliderKt$awaitSlop$1 r0 = new androidx.compose.material.SliderKt$awaitSlop$1
            r0.<init>(r12)
        L18:
            r6 = r0
            java.lang.Object r12 = r6.result
            java.lang.Object r0 = in.a.g()
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            java.lang.Object r8 = r6.L$0
            kotlin.jvm.internal.Ref$FloatRef r8 = (kotlin.jvm.internal.Ref$FloatRef) r8
            kotlin.c.b(r12)
            goto L54
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            kotlin.c.b(r12)
            kotlin.jvm.internal.Ref$FloatRef r12 = new kotlin.jvm.internal.Ref$FloatRef
            r12.<init>()
            androidx.compose.material.SliderKt$awaitSlop$postPointerSlop$1 r5 = new androidx.compose.material.SliderKt$awaitSlop$postPointerSlop$1
            r5.<init>()
            r6.L$0 = r12
            r6.label = r2
            r1 = r8
            r2 = r9
            r4 = r11
            java.lang.Object r8 = androidx.compose.material.DragGestureDetectorCopyKt.m1008awaitHorizontalPointerSlopOrCancellationgDDlDlE(r1, r2, r4, r5, r6)
            if (r8 != r0) goto L51
            return r0
        L51:
            r7 = r12
            r12 = r8
            r8 = r7
        L54:
            androidx.compose.ui.input.pointer.PointerInputChange r12 = (androidx.compose.ui.input.pointer.PointerInputChange) r12
            if (r12 == 0) goto L63
            float r8 = r8.element
            java.lang.Float r8 = jn.a.c(r8)
            kotlin.Pair r8 = bn.h.a(r12, r8)
            goto L64
        L63:
            r8 = 0
        L64:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SliderKt.m1142awaitSlop8vUncbI(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, hn.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calcFraction(float f10, float f11, float f12) {
        float f13 = f11 - f10;
        return n.m((f13 > 0.0f ? 1 : (f13 == 0.0f ? 0 : -1)) == 0 ? 0.0f : (f12 - f10) / f13, 0.0f, 1.0f);
    }

    public static final float getThumbRadius() {
        return ThumbRadius;
    }

    public static final float getTrackHeight() {
        return TrackHeight;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier rangeSliderPressDragModifier(Modifier modifier, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, State<Float> state, State<Float> state2, boolean z10, boolean z11, float f10, e<Float> eVar, State<? extends l<? super Boolean, r>> state3, State<? extends sn.p<? super Boolean, ? super Float, r>> state4) {
        return z10 ? SuspendingPointerInputFilterKt.pointerInput(modifier, new Object[]{mutableInteractionSource, mutableInteractionSource2, Float.valueOf(f10), Boolean.valueOf(z11), eVar}, (sn.p<? super PointerInputScope, ? super c<? super r>, ? extends Object>) new C12881(mutableInteractionSource, mutableInteractionSource2, state, state2, state4, z11, f10, state3, null)) : modifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float scale(float f10, float f11, float f12, float f13, float f14) {
        return MathHelpersKt.lerp(f13, f14, calcFraction(f10, f11, f12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e<Float> scale(float f10, float f11, e<Float> eVar, float f12, float f13) {
        return m.b(scale(f10, f11, eVar.getStart().floatValue(), f12, f13), scale(f10, f11, eVar.getEndInclusive().floatValue(), f12, f13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier sliderSemantics(Modifier modifier, float f10, final List<Float> list, final boolean z10, final l<? super Float, r> lVar, final e<Float> eVar, final int i10) {
        final float fM = n.m(f10, eVar.getStart().floatValue(), eVar.getEndInclusive().floatValue());
        return ProgressSemanticsKt.progressSemantics(SemanticsModifierKt.semantics$default(modifier, false, new l<SemanticsPropertyReceiver, r>() { // from class: androidx.compose.material.SliderKt.sliderSemantics.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                p.k(semanticsPropertyReceiver, "$this$semantics");
                if (!z10) {
                    SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
                }
                final e<Float> eVar2 = eVar;
                final int i11 = i10;
                final List<Float> list2 = list;
                final float f11 = fM;
                final l<Float, r> lVar2 = lVar;
                SemanticsPropertiesKt.setProgress$default(semanticsPropertyReceiver, null, new l<Float, Boolean>() { // from class: androidx.compose.material.SliderKt.sliderSemantics.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @NotNull
                    public final Boolean invoke(float f12) {
                        Object obj;
                        float fM2 = n.m(f12, eVar2.getStart().floatValue(), eVar2.getEndInclusive().floatValue());
                        if (i11 > 0) {
                            List<Float> list3 = list2;
                            e<Float> eVar3 = eVar2;
                            ArrayList arrayList = new ArrayList(x.x(list3, 10));
                            Iterator<T> it = list3.iterator();
                            while (it.hasNext()) {
                                arrayList.add(Float.valueOf(MathHelpersKt.lerp(eVar3.getStart().floatValue(), eVar3.getEndInclusive().floatValue(), ((Number) it.next()).floatValue())));
                            }
                            Iterator it2 = arrayList.iterator();
                            if (it2.hasNext()) {
                                Object next = it2.next();
                                if (it2.hasNext()) {
                                    float fAbs = Math.abs(((Number) next).floatValue() - fM2);
                                    do {
                                        Object next2 = it2.next();
                                        float fAbs2 = Math.abs(((Number) next2).floatValue() - fM2);
                                        if (Float.compare(fAbs, fAbs2) > 0) {
                                            next = next2;
                                            fAbs = fAbs2;
                                        }
                                    } while (it2.hasNext());
                                }
                                obj = next;
                            } else {
                                obj = null;
                            }
                            Float f13 = (Float) obj;
                            if (f13 != null) {
                                fM2 = f13.floatValue();
                            }
                        }
                        boolean z11 = true;
                        if (fM2 == f11) {
                            z11 = false;
                        } else {
                            lVar2.invoke(Float.valueOf(fM2));
                        }
                        return Boolean.valueOf(z11);
                    }

                    @Override // sn.l
                    public /* bridge */ /* synthetic */ Boolean invoke(Float f12) {
                        return invoke(f12.floatValue());
                    }
                }, 1, null);
            }
        }, 1, null), f10, eVar, i10);
    }

    public static /* synthetic */ Modifier sliderSemantics$default(Modifier modifier, float f10, List list, boolean z10, l lVar, e eVar, int i10, int i11, Object obj) {
        if ((i11 & 16) != 0) {
            eVar = m.b(0.0f, 1.0f);
        }
        e eVar2 = eVar;
        if ((i11 & 32) != 0) {
            i10 = 0;
        }
        return sliderSemantics(modifier, f10, list, z10, lVar, eVar2, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier sliderTapModifier(Modifier modifier, final DraggableState draggableState, final MutableInteractionSource mutableInteractionSource, final float f10, final boolean z10, final State<Float> state, final State<? extends l<? super Float, r>> state2, final MutableState<Float> mutableState, final boolean z11) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, r>() { // from class: androidx.compose.material.SliderKt$sliderTapModifier$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                p.k(inspectorInfo, "$this$null");
                inspectorInfo.setName("sliderTapModifier");
                inspectorInfo.getProperties().set("draggableState", draggableState);
                inspectorInfo.getProperties().set("interactionSource", mutableInteractionSource);
                inspectorInfo.getProperties().set("maxPx", Float.valueOf(f10));
                inspectorInfo.getProperties().set("isRtl", Boolean.valueOf(z10));
                inspectorInfo.getProperties().set("rawOffset", state);
                inspectorInfo.getProperties().set("gestureEndAction", state2);
                inspectorInfo.getProperties().set("pressOffset", mutableState);
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z11));
            }
        } : InspectableValueKt.getNoInspectorInfo(), new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.material.SliderKt.sliderTapModifier.2

            /* JADX INFO: renamed from: androidx.compose.material.SliderKt$sliderTapModifier$2$1, reason: invalid class name */
            /* JADX INFO: compiled from: Slider.kt */
            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
            @d(c = "androidx.compose.material.SliderKt$sliderTapModifier$2$1", f = "Slider.kt", l = {882}, m = "invokeSuspend")
            public static final class AnonymousClass1 extends SuspendLambda implements sn.p<PointerInputScope, c<? super r>, Object> {
                public final /* synthetic */ DraggableState $draggableState;
                public final /* synthetic */ State<l<Float, r>> $gestureEndAction;
                public final /* synthetic */ boolean $isRtl;
                public final /* synthetic */ float $maxPx;
                public final /* synthetic */ MutableState<Float> $pressOffset;
                public final /* synthetic */ State<Float> $rawOffset;
                public final /* synthetic */ l0 $scope;
                private /* synthetic */ Object L$0;
                public int label;

                /* JADX INFO: renamed from: androidx.compose.material.SliderKt$sliderTapModifier$2$1$1, reason: invalid class name and collision with other inner class name */
                /* JADX INFO: compiled from: Slider.kt */
                @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                @d(c = "androidx.compose.material.SliderKt$sliderTapModifier$2$1$1", f = "Slider.kt", l = {887}, m = "invokeSuspend")
                public static final class C00881 extends SuspendLambda implements q<PressGestureScope, Offset, c<? super r>, Object> {
                    public final /* synthetic */ boolean $isRtl;
                    public final /* synthetic */ float $maxPx;
                    public final /* synthetic */ MutableState<Float> $pressOffset;
                    public final /* synthetic */ State<Float> $rawOffset;
                    public /* synthetic */ long J$0;
                    private /* synthetic */ Object L$0;
                    public int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C00881(boolean z10, float f10, MutableState<Float> mutableState, State<Float> state, c<? super C00881> cVar) {
                        super(3, cVar);
                        this.$isRtl = z10;
                        this.$maxPx = f10;
                        this.$pressOffset = mutableState;
                        this.$rawOffset = state;
                    }

                    @Override // sn.q
                    public /* bridge */ /* synthetic */ Object invoke(PressGestureScope pressGestureScope, Offset offset, c<? super r> cVar) {
                        return m1143invoked4ec7I(pressGestureScope, offset.getPackedValue(), cVar);
                    }

                    @Nullable
                    /* JADX INFO: renamed from: invoke-d-4ec7I, reason: not valid java name */
                    public final Object m1143invoked4ec7I(@NotNull PressGestureScope pressGestureScope, long j10, @Nullable c<? super r> cVar) {
                        C00881 c00881 = new C00881(this.$isRtl, this.$maxPx, this.$pressOffset, this.$rawOffset, cVar);
                        c00881.L$0 = pressGestureScope;
                        c00881.J$0 = j10;
                        return c00881.invokeSuspend(r.f5635a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        Object objG = in.a.g();
                        int i10 = this.label;
                        try {
                            if (i10 == 0) {
                                kotlin.c.b(obj);
                                PressGestureScope pressGestureScope = (PressGestureScope) this.L$0;
                                long j10 = this.J$0;
                                this.$pressOffset.setValue(jn.a.c((this.$isRtl ? this.$maxPx - Offset.m1383getXimpl(j10) : Offset.m1383getXimpl(j10)) - this.$rawOffset.getValue().floatValue()));
                                this.label = 1;
                                if (pressGestureScope.awaitRelease(this) == objG) {
                                    return objG;
                                }
                            } else {
                                if (i10 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.c.b(obj);
                            }
                        } catch (GestureCancellationException unused) {
                            this.$pressOffset.setValue(jn.a.c(0.0f));
                        }
                        return r.f5635a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public AnonymousClass1(boolean z10, float f10, MutableState<Float> mutableState, State<Float> state, l0 l0Var, DraggableState draggableState, State<? extends l<? super Float, r>> state2, c<? super AnonymousClass1> cVar) {
                    super(2, cVar);
                    this.$isRtl = z10;
                    this.$maxPx = f10;
                    this.$pressOffset = mutableState;
                    this.$rawOffset = state;
                    this.$scope = l0Var;
                    this.$draggableState = draggableState;
                    this.$gestureEndAction = state2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$isRtl, this.$maxPx, this.$pressOffset, this.$rawOffset, this.$scope, this.$draggableState, this.$gestureEndAction, cVar);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // sn.p
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                public final Object mo2invoke(@NotNull PointerInputScope pointerInputScope, @Nullable c<? super r> cVar) {
                    return ((AnonymousClass1) create(pointerInputScope, cVar)).invokeSuspend(r.f5635a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object objG = in.a.g();
                    int i10 = this.label;
                    if (i10 == 0) {
                        kotlin.c.b(obj);
                        PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                        C00881 c00881 = new C00881(this.$isRtl, this.$maxPx, this.$pressOffset, this.$rawOffset, null);
                        final l0 l0Var = this.$scope;
                        final DraggableState draggableState = this.$draggableState;
                        final State<l<Float, r>> state = this.$gestureEndAction;
                        l<Offset, r> lVar = new l<Offset, r>() { // from class: androidx.compose.material.SliderKt.sliderTapModifier.2.1.2

                            /* JADX INFO: renamed from: androidx.compose.material.SliderKt$sliderTapModifier$2$1$2$1, reason: invalid class name and collision with other inner class name */
                            /* JADX INFO: compiled from: Slider.kt */
                            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                            @d(c = "androidx.compose.material.SliderKt$sliderTapModifier$2$1$2$1", f = "Slider.kt", l = {894}, m = "invokeSuspend")
                            public static final class C00901 extends SuspendLambda implements sn.p<l0, c<? super r>, Object> {
                                public final /* synthetic */ DraggableState $draggableState;
                                public final /* synthetic */ State<l<Float, r>> $gestureEndAction;
                                public int label;

                                /* JADX INFO: renamed from: androidx.compose.material.SliderKt$sliderTapModifier$2$1$2$1$1, reason: invalid class name and collision with other inner class name */
                                /* JADX INFO: compiled from: Slider.kt */
                                @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                @d(c = "androidx.compose.material.SliderKt$sliderTapModifier$2$1$2$1$1", f = "Slider.kt", l = {}, m = "invokeSuspend")
                                public static final class C00911 extends SuspendLambda implements sn.p<DragScope, c<? super r>, Object> {
                                    private /* synthetic */ Object L$0;
                                    public int label;

                                    public C00911(c<? super C00911> cVar) {
                                        super(2, cVar);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    @NotNull
                                    public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
                                        C00911 c00911 = new C00911(cVar);
                                        c00911.L$0 = obj;
                                        return c00911;
                                    }

                                    @Override // sn.p
                                    @Nullable
                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                                    public final Object mo2invoke(@NotNull DragScope dragScope, @Nullable c<? super r> cVar) {
                                        return ((C00911) create(dragScope, cVar)).invokeSuspend(r.f5635a);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    @Nullable
                                    public final Object invokeSuspend(@NotNull Object obj) {
                                        in.a.g();
                                        if (this.label != 0) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        kotlin.c.b(obj);
                                        ((DragScope) this.L$0).dragBy(0.0f);
                                        return r.f5635a;
                                    }
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                public C00901(DraggableState draggableState, State<? extends l<? super Float, r>> state, c<? super C00901> cVar) {
                                    super(2, cVar);
                                    this.$draggableState = draggableState;
                                    this.$gestureEndAction = state;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @NotNull
                                public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
                                    return new C00901(this.$draggableState, this.$gestureEndAction, cVar);
                                }

                                @Override // sn.p
                                @Nullable
                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                                public final Object mo2invoke(@NotNull l0 l0Var, @Nullable c<? super r> cVar) {
                                    return ((C00901) create(l0Var, cVar)).invokeSuspend(r.f5635a);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @Nullable
                                public final Object invokeSuspend(@NotNull Object obj) {
                                    Object objG = in.a.g();
                                    int i10 = this.label;
                                    if (i10 == 0) {
                                        kotlin.c.b(obj);
                                        DraggableState draggableState = this.$draggableState;
                                        MutatePriority mutatePriority = MutatePriority.UserInput;
                                        C00911 c00911 = new C00911(null);
                                        this.label = 1;
                                        if (draggableState.drag(mutatePriority, c00911, this) == objG) {
                                            return objG;
                                        }
                                    } else {
                                        if (i10 != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        kotlin.c.b(obj);
                                    }
                                    this.$gestureEndAction.getValue().invoke(jn.a.c(0.0f));
                                    return r.f5635a;
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // sn.l
                            public /* bridge */ /* synthetic */ r invoke(Offset offset) {
                                m1144invokek4lQ0M(offset.getPackedValue());
                                return r.f5635a;
                            }

                            /* JADX INFO: renamed from: invoke-k-4lQ0M, reason: not valid java name */
                            public final void m1144invokek4lQ0M(long j10) {
                                i.d(l0Var, null, null, new C00901(draggableState, state, null), 3, null);
                            }
                        };
                        this.label = 1;
                        if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, c00881, lVar, this, 3, null) == objG) {
                            return objG;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.c.b(obj);
                    }
                    return r.f5635a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier modifier2, @Nullable Composer composer, int i10) {
                p.k(modifier2, "$this$composed");
                composer.startReplaceableGroup(1945228890);
                if (z11) {
                    composer.startReplaceableGroup(773894976);
                    composer.startReplaceableGroup(-492369756);
                    Object objRememberedValue = composer.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer));
                        composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                        objRememberedValue = compositionScopedCoroutineScopeCanceller;
                    }
                    composer.endReplaceableGroup();
                    l0 coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                    composer.endReplaceableGroup();
                    modifier2 = SuspendingPointerInputFilterKt.pointerInput(modifier2, new Object[]{draggableState, mutableInteractionSource, Float.valueOf(f10), Boolean.valueOf(z10)}, (sn.p<? super PointerInputScope, ? super c<? super r>, ? extends Object>) new AnonymousClass1(z10, f10, mutableState, state, coroutineScope, draggableState, state2, null));
                }
                composer.endReplaceableGroup();
                return modifier2;
            }

            @Override // sn.q
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float snapValueToTick(float f10, List<Float> list, float f11, float f12) {
        Object obj;
        Iterator<T> it = list.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                float fAbs = Math.abs(MathHelpersKt.lerp(f11, f12, ((Number) next).floatValue()) - f10);
                do {
                    Object next2 = it.next();
                    float fAbs2 = Math.abs(MathHelpersKt.lerp(f11, f12, ((Number) next2).floatValue()) - f10);
                    if (Float.compare(fAbs, fAbs2) > 0) {
                        next = next2;
                        fAbs = fAbs2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        Float f13 = (Float) obj;
        return f13 != null ? MathHelpersKt.lerp(f11, f12, f13.floatValue()) : f10;
    }

    private static final List<Float> stepsToTickFractions(int i10) {
        if (i10 == 0) {
            return w.m();
        }
        int i11 = i10 + 2;
        ArrayList arrayList = new ArrayList(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            arrayList.add(Float.valueOf(i12 / (i10 + 1)));
        }
        return arrayList;
    }
}
