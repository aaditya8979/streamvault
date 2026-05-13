package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import bn.r;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: EnterExitTransition.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001Bv\u0012\u001c\u0010\u0018\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00160\u0015R\b\u0012\u0004\u0012\u00020\u00020\u0017\u0012\u001c\u0010\u001c\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00160\u0015R\b\u0012\u0004\u0012\u00020\u00020\u0017\u0012\u000e\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001e\u0012\u000e\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001e\u0012\u000e\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u001eø\u0001\u0000¢\u0006\u0004\b6\u00107J#\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u0007J)\u0010\u0014\u001a\u00020\u0011*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013R0\u0010\u0018\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00160\u0015R\b\u0012\u0004\u0012\u00020\u00020\u00178\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR0\u0010\u001c\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00160\u0015R\b\u0012\u0004\u0012\u00020\u00020\u00178\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u001f\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001e8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001f\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001e8\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u001f\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u001e8\u0006¢\u0006\f\n\u0004\b'\u0010!\u001a\u0004\b(\u0010#R$\u0010)\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R2\u00102\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000200\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u0004010/8\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00068"}, d2 = {"Landroidx/compose/animation/ExpandShrinkModifier;", "Landroidx/compose/animation/LayoutModifierWithPassThroughIntrinsics;", "Landroidx/compose/animation/EnterExitState;", "targetState", "Landroidx/compose/ui/unit/IntSize;", "fullSize", "sizeByState-Uzc_VyU", "(Landroidx/compose/animation/EnterExitState;J)J", "sizeByState", "Landroidx/compose/ui/unit/IntOffset;", "targetOffsetByState-oFUgxo0", "targetOffsetByState", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "Landroidx/compose/animation/core/AnimationVector2D;", "Landroidx/compose/animation/core/Transition;", "sizeAnimation", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "getSizeAnimation", "()Landroidx/compose/animation/core/Transition$DeferredAnimation;", "offsetAnimation", "getOffsetAnimation", "Landroidx/compose/runtime/State;", "Landroidx/compose/animation/ChangeSize;", "expand", "Landroidx/compose/runtime/State;", "getExpand", "()Landroidx/compose/runtime/State;", "shrink", "getShrink", "Landroidx/compose/ui/Alignment;", "alignment", "getAlignment", "currentAlignment", "Landroidx/compose/ui/Alignment;", "getCurrentAlignment", "()Landroidx/compose/ui/Alignment;", "setCurrentAlignment", "(Landroidx/compose/ui/Alignment;)V", "Lkotlin/Function1;", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "sizeTransitionSpec", "Lsn/l;", "getSizeTransitionSpec", "()Lsn/l;", "<init>", "(Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;)V", "animation_release"}, k = 1, mv = {1, 6, 0})
final class ExpandShrinkModifier extends LayoutModifierWithPassThroughIntrinsics {

    @NotNull
    private final State<Alignment> alignment;

    @Nullable
    private Alignment currentAlignment;

    @NotNull
    private final State<ChangeSize> expand;

    @NotNull
    private final Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> offsetAnimation;

    @NotNull
    private final State<ChangeSize> shrink;

    @NotNull
    private final Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> sizeAnimation;

    @NotNull
    private final l<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntSize>> sizeTransitionSpec;

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

    /* JADX WARN: Multi-variable type inference failed */
    public ExpandShrinkModifier(@NotNull Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation, @NotNull Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation2, @NotNull State<ChangeSize> state, @NotNull State<ChangeSize> state2, @NotNull State<? extends Alignment> state3) {
        p.k(deferredAnimation, "sizeAnimation");
        p.k(deferredAnimation2, "offsetAnimation");
        p.k(state, "expand");
        p.k(state2, "shrink");
        p.k(state3, "alignment");
        this.sizeAnimation = deferredAnimation;
        this.offsetAnimation = deferredAnimation2;
        this.expand = state;
        this.shrink = state2;
        this.alignment = state3;
        this.sizeTransitionSpec = new l<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntSize>>() { // from class: androidx.compose.animation.ExpandShrinkModifier$sizeTransitionSpec$1
            {
                super(1);
            }

            @Override // sn.l
            @NotNull
            public final FiniteAnimationSpec<IntSize> invoke(@NotNull Transition.Segment<EnterExitState> segment) {
                p.k(segment, "$this$null");
                EnterExitState enterExitState = EnterExitState.PreEnter;
                EnterExitState enterExitState2 = EnterExitState.Visible;
                FiniteAnimationSpec<IntSize> animationSpec = null;
                if (segment.isTransitioningTo(enterExitState, enterExitState2)) {
                    ChangeSize value = this.this$0.getExpand().getValue();
                    if (value != null) {
                        animationSpec = value.getAnimationSpec();
                    }
                } else if (segment.isTransitioningTo(enterExitState2, EnterExitState.PostExit)) {
                    ChangeSize value2 = this.this$0.getShrink().getValue();
                    if (value2 != null) {
                        animationSpec = value2.getAnimationSpec();
                    }
                } else {
                    animationSpec = EnterExitTransitionKt.DefaultSizeAnimationSpec;
                }
                return animationSpec == null ? EnterExitTransitionKt.DefaultSizeAnimationSpec : animationSpec;
            }
        };
    }

    @NotNull
    public final State<Alignment> getAlignment() {
        return this.alignment;
    }

    @Nullable
    public final Alignment getCurrentAlignment() {
        return this.currentAlignment;
    }

    @NotNull
    public final State<ChangeSize> getExpand() {
        return this.expand;
    }

    @NotNull
    public final Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> getOffsetAnimation() {
        return this.offsetAnimation;
    }

    @NotNull
    public final State<ChangeSize> getShrink() {
        return this.shrink;
    }

    @NotNull
    public final Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> getSizeAnimation() {
        return this.sizeAnimation;
    }

    @NotNull
    public final l<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntSize>> getSizeTransitionSpec() {
        return this.sizeTransitionSpec;
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo21measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull Measurable measurable, long j10) {
        p.k(measureScope, "$this$measure");
        p.k(measurable, "measurable");
        final Placeable placeableMo3112measureBRTryo0 = measurable.mo3112measureBRTryo0(j10);
        final long jIntSize = IntSizeKt.IntSize(placeableMo3112measureBRTryo0.getWidth(), placeableMo3112measureBRTryo0.getHeight());
        long packedValue = this.sizeAnimation.animate(this.sizeTransitionSpec, new l<EnterExitState, IntSize>() { // from class: androidx.compose.animation.ExpandShrinkModifier$measure$currentSize$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ IntSize invoke(EnterExitState enterExitState) {
                return IntSize.m3978boximpl(m73invokeYEO4UFw(enterExitState));
            }

            /* JADX INFO: renamed from: invoke-YEO4UFw, reason: not valid java name */
            public final long m73invokeYEO4UFw(@NotNull EnterExitState enterExitState) {
                p.k(enterExitState, "it");
                return this.this$0.m71sizeByStateUzc_VyU(enterExitState, jIntSize);
            }
        }).getValue().getPackedValue();
        final long packedValue2 = this.offsetAnimation.animate(new l<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntOffset>>() { // from class: androidx.compose.animation.ExpandShrinkModifier$measure$offsetDelta$1
            @Override // sn.l
            @NotNull
            public final FiniteAnimationSpec<IntOffset> invoke(@NotNull Transition.Segment<EnterExitState> segment) {
                p.k(segment, "$this$animate");
                return EnterExitTransitionKt.DefaultOffsetAnimationSpec;
            }
        }, new l<EnterExitState, IntOffset>() { // from class: androidx.compose.animation.ExpandShrinkModifier$measure$offsetDelta$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ IntOffset invoke(EnterExitState enterExitState) {
                return IntOffset.m3935boximpl(m74invokeBjo55l4(enterExitState));
            }

            /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
            public final long m74invokeBjo55l4(@NotNull EnterExitState enterExitState) {
                p.k(enterExitState, "it");
                return this.this$0.m72targetOffsetByStateoFUgxo0(enterExitState, jIntSize);
            }
        }).getValue().getPackedValue();
        Alignment alignment = this.currentAlignment;
        final long jMo1291alignKFBX0sM = alignment != null ? alignment.mo1291alignKFBX0sM(jIntSize, packedValue, LayoutDirection.Ltr) : IntOffset.INSTANCE.m3954getZeronOccac();
        return MeasureScope.layout$default(measureScope, IntSize.m3986getWidthimpl(packedValue), IntSize.m3985getHeightimpl(packedValue), null, new l<Placeable.PlacementScope, r>() { // from class: androidx.compose.animation.ExpandShrinkModifier$measure$1
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
                Placeable.PlacementScope.place$default(placementScope, placeableMo3112measureBRTryo0, IntOffset.m3944getXimpl(jMo1291alignKFBX0sM) + IntOffset.m3944getXimpl(packedValue2), IntOffset.m3945getYimpl(jMo1291alignKFBX0sM) + IntOffset.m3945getYimpl(packedValue2), 0.0f, 4, null);
            }
        }, 4, null);
    }

    public final void setCurrentAlignment(@Nullable Alignment alignment) {
        this.currentAlignment = alignment;
    }

    /* JADX INFO: renamed from: sizeByState-Uzc_VyU, reason: not valid java name */
    public final long m71sizeByStateUzc_VyU(@NotNull EnterExitState targetState, long fullSize) {
        p.k(targetState, "targetState");
        ChangeSize value = this.expand.getValue();
        long packedValue = value != null ? value.getSize().invoke(IntSize.m3978boximpl(fullSize)).getPackedValue() : fullSize;
        ChangeSize value2 = this.shrink.getValue();
        long packedValue2 = value2 != null ? value2.getSize().invoke(IntSize.m3978boximpl(fullSize)).getPackedValue() : fullSize;
        int i10 = WhenMappings.$EnumSwitchMapping$0[targetState.ordinal()];
        if (i10 == 1) {
            return fullSize;
        }
        if (i10 == 2) {
            return packedValue;
        }
        if (i10 == 3) {
            return packedValue2;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: targetOffsetByState-oFUgxo0, reason: not valid java name */
    public final long m72targetOffsetByStateoFUgxo0(@NotNull EnterExitState targetState, long fullSize) {
        int i10;
        p.k(targetState, "targetState");
        if (this.currentAlignment != null && this.alignment.getValue() != null && !p.f(this.currentAlignment, this.alignment.getValue()) && (i10 = WhenMappings.$EnumSwitchMapping$0[targetState.ordinal()]) != 1 && i10 != 2) {
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            ChangeSize value = this.shrink.getValue();
            if (value == null) {
                return IntOffset.INSTANCE.m3954getZeronOccac();
            }
            long packedValue = value.getSize().invoke(IntSize.m3978boximpl(fullSize)).getPackedValue();
            Alignment value2 = this.alignment.getValue();
            p.h(value2);
            Alignment alignment = value2;
            LayoutDirection layoutDirection = LayoutDirection.Ltr;
            long jMo1291alignKFBX0sM = alignment.mo1291alignKFBX0sM(fullSize, packedValue, layoutDirection);
            Alignment alignment2 = this.currentAlignment;
            p.h(alignment2);
            long jMo1291alignKFBX0sM2 = alignment2.mo1291alignKFBX0sM(fullSize, packedValue, layoutDirection);
            return IntOffsetKt.IntOffset(IntOffset.m3944getXimpl(jMo1291alignKFBX0sM) - IntOffset.m3944getXimpl(jMo1291alignKFBX0sM2), IntOffset.m3945getYimpl(jMo1291alignKFBX0sM) - IntOffset.m3945getYimpl(jMo1291alignKFBX0sM2));
        }
        return IntOffset.INSTANCE.m3954getZeronOccac();
    }
}
