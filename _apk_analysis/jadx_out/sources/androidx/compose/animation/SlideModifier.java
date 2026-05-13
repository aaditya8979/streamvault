package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.State;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import bn.r;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: EnterExitTransition.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001BH\u0012\u001c\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00140\u0013R\b\u0012\u0004\u0012\u00020\u00020\u0015\u0012\u000e\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a\u0012\u000e\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001aø\u0001\u0000¢\u0006\u0004\b)\u0010*J#\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u0012\u001a\u00020\u000f*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011R0\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00140\u0013R\b\u0012\u0004\u0012\u00020\u00020\u00158\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001f\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001f\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a8\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR2\u0010%\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020#\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060$0\"8\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006+"}, d2 = {"Landroidx/compose/animation/SlideModifier;", "Landroidx/compose/animation/LayoutModifierWithPassThroughIntrinsics;", "Landroidx/compose/animation/EnterExitState;", "targetState", "Landroidx/compose/ui/unit/IntSize;", "fullSize", "Landroidx/compose/ui/unit/IntOffset;", "targetValueByState-oFUgxo0", "(Landroidx/compose/animation/EnterExitState;J)J", "targetValueByState", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "Landroidx/compose/animation/core/AnimationVector2D;", "Landroidx/compose/animation/core/Transition;", "lazyAnimation", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "getLazyAnimation", "()Landroidx/compose/animation/core/Transition$DeferredAnimation;", "Landroidx/compose/runtime/State;", "Landroidx/compose/animation/Slide;", "slideIn", "Landroidx/compose/runtime/State;", "getSlideIn", "()Landroidx/compose/runtime/State;", "slideOut", "getSlideOut", "Lkotlin/Function1;", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "transitionSpec", "Lsn/l;", "getTransitionSpec", "()Lsn/l;", "<init>", "(Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;)V", "animation_release"}, k = 1, mv = {1, 6, 0})
final class SlideModifier extends LayoutModifierWithPassThroughIntrinsics {

    @NotNull
    private final Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> lazyAnimation;

    @NotNull
    private final State<Slide> slideIn;

    @NotNull
    private final State<Slide> slideOut;

    @NotNull
    private final l<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntOffset>> transitionSpec;

    /* JADX INFO: compiled from: EnterExitTransition.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnterExitState.values().length];
            iArr[EnterExitState.Visible.ordinal()] = 1;
            iArr[EnterExitState.PreEnter.ordinal()] = 2;
            iArr[EnterExitState.PostExit.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SlideModifier(@NotNull Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation, @NotNull State<Slide> state, @NotNull State<Slide> state2) {
        p.k(deferredAnimation, "lazyAnimation");
        p.k(state, "slideIn");
        p.k(state2, "slideOut");
        this.lazyAnimation = deferredAnimation;
        this.slideIn = state;
        this.slideOut = state2;
        this.transitionSpec = new l<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntOffset>>() { // from class: androidx.compose.animation.SlideModifier$transitionSpec$1
            {
                super(1);
            }

            @Override // sn.l
            @NotNull
            public final FiniteAnimationSpec<IntOffset> invoke(@NotNull Transition.Segment<EnterExitState> segment) {
                FiniteAnimationSpec<IntOffset> animationSpec;
                FiniteAnimationSpec<IntOffset> animationSpec2;
                p.k(segment, "$this$null");
                EnterExitState enterExitState = EnterExitState.PreEnter;
                EnterExitState enterExitState2 = EnterExitState.Visible;
                if (segment.isTransitioningTo(enterExitState, enterExitState2)) {
                    Slide value = this.this$0.getSlideIn().getValue();
                    return (value == null || (animationSpec2 = value.getAnimationSpec()) == null) ? EnterExitTransitionKt.DefaultOffsetAnimationSpec : animationSpec2;
                }
                if (!segment.isTransitioningTo(enterExitState2, EnterExitState.PostExit)) {
                    return EnterExitTransitionKt.DefaultOffsetAnimationSpec;
                }
                Slide value2 = this.this$0.getSlideOut().getValue();
                return (value2 == null || (animationSpec = value2.getAnimationSpec()) == null) ? EnterExitTransitionKt.DefaultOffsetAnimationSpec : animationSpec;
            }
        };
    }

    @NotNull
    public final Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> getLazyAnimation() {
        return this.lazyAnimation;
    }

    @NotNull
    public final State<Slide> getSlideIn() {
        return this.slideIn;
    }

    @NotNull
    public final State<Slide> getSlideOut() {
        return this.slideOut;
    }

    @NotNull
    public final l<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntOffset>> getTransitionSpec() {
        return this.transitionSpec;
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo21measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull Measurable measurable, long j10) {
        p.k(measureScope, "$this$measure");
        p.k(measurable, "measurable");
        final Placeable placeableMo3112measureBRTryo0 = measurable.mo3112measureBRTryo0(j10);
        final long jIntSize = IntSizeKt.IntSize(placeableMo3112measureBRTryo0.getWidth(), placeableMo3112measureBRTryo0.getHeight());
        return MeasureScope.layout$default(measureScope, placeableMo3112measureBRTryo0.getWidth(), placeableMo3112measureBRTryo0.getHeight(), null, new l<Placeable.PlacementScope, r>() { // from class: androidx.compose.animation.SlideModifier$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Placeable.PlacementScope placementScope) {
                p.k(placementScope, "$this$layout");
                Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> lazyAnimation = this.this$0.getLazyAnimation();
                l<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntOffset>> transitionSpec = this.this$0.getTransitionSpec();
                final SlideModifier slideModifier = this.this$0;
                final long j11 = jIntSize;
                Placeable.PlacementScope.m3157placeWithLayeraW9wM$default(placementScope, placeableMo3112measureBRTryo0, lazyAnimation.animate(transitionSpec, new l<EnterExitState, IntOffset>() { // from class: androidx.compose.animation.SlideModifier$measure$1$slideOffset$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // sn.l
                    public /* bridge */ /* synthetic */ IntOffset invoke(EnterExitState enterExitState) {
                        return IntOffset.m3935boximpl(m89invokeBjo55l4(enterExitState));
                    }

                    /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                    public final long m89invokeBjo55l4(@NotNull EnterExitState enterExitState) {
                        p.k(enterExitState, "it");
                        return slideModifier.m88targetValueByStateoFUgxo0(enterExitState, j11);
                    }
                }).getValue().getPackedValue(), 0.0f, null, 6, null);
            }
        }, 4, null);
    }

    /* JADX INFO: renamed from: targetValueByState-oFUgxo0, reason: not valid java name */
    public final long m88targetValueByStateoFUgxo0(@NotNull EnterExitState targetState, long fullSize) {
        l<IntSize, IntOffset> slideOffset;
        l<IntSize, IntOffset> slideOffset2;
        p.k(targetState, "targetState");
        Slide value = this.slideIn.getValue();
        long jM3954getZeronOccac = (value == null || (slideOffset2 = value.getSlideOffset()) == null) ? IntOffset.INSTANCE.m3954getZeronOccac() : slideOffset2.invoke(IntSize.m3978boximpl(fullSize)).getPackedValue();
        Slide value2 = this.slideOut.getValue();
        long jM3954getZeronOccac2 = (value2 == null || (slideOffset = value2.getSlideOffset()) == null) ? IntOffset.INSTANCE.m3954getZeronOccac() : slideOffset.invoke(IntSize.m3978boximpl(fullSize)).getPackedValue();
        int i10 = WhenMappings.$EnumSwitchMapping$0[targetState.ordinal()];
        if (i10 == 1) {
            return IntOffset.INSTANCE.m3954getZeronOccac();
        }
        if (i10 == 2) {
            return jM3954getZeronOccac;
        }
        if (i10 == 3) {
            return jM3954getZeronOccac2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
