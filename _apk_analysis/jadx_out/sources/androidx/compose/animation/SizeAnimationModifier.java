package androidx.compose.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import bn.r;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import sn.l;
import sn.p;
import tn.i;

/* JADX INFO: compiled from: AnimationModifier.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001:\u0001+B \u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015ø\u0001\u0000¢\u0006\u0004\b)\u0010*J)\u0010\n\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00108\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R9\u0010\u001c\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000eø\u0001\u0000¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010#\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006,"}, d2 = {"Landroidx/compose/animation/SizeAnimationModifier;", "Landroidx/compose/animation/LayoutModifierWithPassThroughIntrinsics;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/unit/IntSize;", "targetSize", "animateTo-mzRDjE0", "(J)J", "animateTo", "Landroidx/compose/animation/core/AnimationSpec;", "animSpec", "Landroidx/compose/animation/core/AnimationSpec;", "getAnimSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "Ldo/l0;", "scope", "Ldo/l0;", "getScope", "()Ldo/l0;", "Lkotlin/Function2;", "Lbn/r;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lsn/p;", "getListener", "()Lsn/p;", "setListener", "(Lsn/p;)V", "Landroidx/compose/animation/SizeAnimationModifier$AnimData;", "animData", "Landroidx/compose/animation/SizeAnimationModifier$AnimData;", "getAnimData", "()Landroidx/compose/animation/SizeAnimationModifier$AnimData;", "setAnimData", "(Landroidx/compose/animation/SizeAnimationModifier$AnimData;)V", "<init>", "(Landroidx/compose/animation/core/AnimationSpec;Ldo/l0;)V", "AnimData", "animation_release"}, k = 1, mv = {1, 6, 0})
final class SizeAnimationModifier extends LayoutModifierWithPassThroughIntrinsics {

    @Nullable
    private AnimData animData;

    @NotNull
    private final AnimationSpec<IntSize> animSpec;

    @Nullable
    private p<? super IntSize, ? super IntSize, r> listener;

    @NotNull
    private final l0 scope;

    /* JADX INFO: compiled from: AnimationModifier.kt */
    @StabilityInferred(parameters = 0)
    @Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B&\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\n\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003ø\u0001\u0000J\u0019\u0010\b\u001a\u00020\u0003HÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0007J6\u0010\r\u001a\u00020\u00002\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R+\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0012\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u0007\"\u0004\b\u001a\u0010\u001b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Landroidx/compose/animation/SizeAnimationModifier$AnimData;", "", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/animation/core/AnimationVector2D;", "component1", "component2-YbymL2g", "()J", "component2", "anim", "startSize", "copy-O0kMr_c", "(Landroidx/compose/animation/core/Animatable;J)Landroidx/compose/animation/SizeAnimationModifier$AnimData;", "copy", "", "toString", "", "hashCode", "other", "", "equals", "Landroidx/compose/animation/core/Animatable;", "getAnim", "()Landroidx/compose/animation/core/Animatable;", "J", "getStartSize-YbymL2g", "setStartSize-ozmzZPI", "(J)V", "<init>", "(Landroidx/compose/animation/core/Animatable;JLtn/i;)V", "animation_release"}, k = 1, mv = {1, 6, 0})
    public static final /* data */ class AnimData {
        public static final int $stable = 8;

        @NotNull
        private final Animatable<IntSize, AnimationVector2D> anim;
        private long startSize;

        private AnimData(Animatable<IntSize, AnimationVector2D> animatable, long j10) {
            this.anim = animatable;
            this.startSize = j10;
        }

        public /* synthetic */ AnimData(Animatable animatable, long j10, i iVar) {
            this(animatable, j10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: copy-O0kMr_c$default, reason: not valid java name */
        public static /* synthetic */ AnimData m82copyO0kMr_c$default(AnimData animData, Animatable animatable, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                animatable = animData.anim;
            }
            if ((i10 & 2) != 0) {
                j10 = animData.startSize;
            }
            return animData.m84copyO0kMr_c(animatable, j10);
        }

        @NotNull
        public final Animatable<IntSize, AnimationVector2D> component1() {
            return this.anim;
        }

        /* JADX INFO: renamed from: component2-YbymL2g, reason: not valid java name and from getter */
        public final long getStartSize() {
            return this.startSize;
        }

        @NotNull
        /* JADX INFO: renamed from: copy-O0kMr_c, reason: not valid java name */
        public final AnimData m84copyO0kMr_c(@NotNull Animatable<IntSize, AnimationVector2D> anim, long startSize) {
            tn.p.k(anim, "anim");
            return new AnimData(anim, startSize, null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AnimData)) {
                return false;
            }
            AnimData animData = (AnimData) other;
            return tn.p.f(this.anim, animData.anim) && IntSize.m3984equalsimpl0(this.startSize, animData.startSize);
        }

        @NotNull
        public final Animatable<IntSize, AnimationVector2D> getAnim() {
            return this.anim;
        }

        /* JADX INFO: renamed from: getStartSize-YbymL2g, reason: not valid java name */
        public final long m85getStartSizeYbymL2g() {
            return this.startSize;
        }

        public int hashCode() {
            return (this.anim.hashCode() * 31) + IntSize.m3987hashCodeimpl(this.startSize);
        }

        /* JADX INFO: renamed from: setStartSize-ozmzZPI, reason: not valid java name */
        public final void m86setStartSizeozmzZPI(long j10) {
            this.startSize = j10;
        }

        @NotNull
        public String toString() {
            return "AnimData(anim=" + this.anim + ", startSize=" + ((Object) IntSize.m3989toStringimpl(this.startSize)) + ')';
        }
    }

    public SizeAnimationModifier(@NotNull AnimationSpec<IntSize> animationSpec, @NotNull l0 l0Var) {
        tn.p.k(animationSpec, "animSpec");
        tn.p.k(l0Var, "scope");
        this.animSpec = animationSpec;
        this.scope = l0Var;
    }

    /* JADX INFO: renamed from: animateTo-mzRDjE0, reason: not valid java name */
    public final long m81animateTomzRDjE0(long targetSize) {
        AnimData animData = this.animData;
        if (animData == null) {
            animData = new AnimData(new Animatable(IntSize.m3978boximpl(targetSize), VectorConvertersKt.getVectorConverter(IntSize.INSTANCE), IntSize.m3978boximpl(IntSizeKt.IntSize(1, 1))), targetSize, null);
        } else if (!IntSize.m3984equalsimpl0(targetSize, animData.getAnim().getTargetValue().getPackedValue())) {
            animData.m86setStartSizeozmzZPI(animData.getAnim().getValue().getPackedValue());
            p000do.i.d(this.scope, null, null, new SizeAnimationModifier$animateTo$data$1$1(animData, targetSize, this, null), 3, null);
        }
        this.animData = animData;
        return animData.getAnim().getValue().getPackedValue();
    }

    @Nullable
    public final AnimData getAnimData() {
        return this.animData;
    }

    @NotNull
    public final AnimationSpec<IntSize> getAnimSpec() {
        return this.animSpec;
    }

    @Nullable
    public final p<IntSize, IntSize, r> getListener() {
        return this.listener;
    }

    @NotNull
    public final l0 getScope() {
        return this.scope;
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo21measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull Measurable measurable, long j10) {
        tn.p.k(measureScope, "$this$measure");
        tn.p.k(measurable, "measurable");
        final Placeable placeableMo3112measureBRTryo0 = measurable.mo3112measureBRTryo0(j10);
        long jM81animateTomzRDjE0 = m81animateTomzRDjE0(IntSizeKt.IntSize(placeableMo3112measureBRTryo0.getWidth(), placeableMo3112measureBRTryo0.getHeight()));
        return MeasureScope.layout$default(measureScope, IntSize.m3986getWidthimpl(jM81animateTomzRDjE0), IntSize.m3985getHeightimpl(jM81animateTomzRDjE0), null, new l<Placeable.PlacementScope, r>() { // from class: androidx.compose.animation.SizeAnimationModifier$measure$1
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
                tn.p.k(placementScope, "$this$layout");
                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo3112measureBRTryo0, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    public final void setAnimData(@Nullable AnimData animData) {
        this.animData = animData;
    }

    public final void setListener(@Nullable p<? super IntSize, ? super IntSize, r> pVar) {
        this.listener = pVar;
    }
}
