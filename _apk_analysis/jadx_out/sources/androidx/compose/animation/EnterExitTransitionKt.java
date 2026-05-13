package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import sn.q;
import tn.p;

/* JADX INFO: compiled from: EnterExitTransition.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\"\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0007\u001a\"\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0001H\u0007\u001a/\u0010\r\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\t0\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\nH\u0007ø\u0001\u0000\u001a/\u0010\u000f\u001a\u00020\u00072\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\t0\u00002\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\nH\u0007ø\u0001\u0000\u001a9\u0010\u0015\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u00012\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a9\u0010\u0019\u001a\u00020\u00072\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00012\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001aE\u0010\u001f\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nH\u0007ø\u0001\u0000\u001aE\u0010\"\u001a\u00020\u00072\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002\b\b\u0002\u0010 \u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\u0014\b\u0002\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nH\u0007ø\u0001\u0000\u001aE\u0010&\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002\b\b\u0002\u0010\u001b\u001a\u00020#2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\u0014\b\u0002\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020$0\nH\u0007ø\u0001\u0000\u001aE\u0010)\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002\b\b\u0002\u0010\u001b\u001a\u00020'2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\u0014\b\u0002\u0010(\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020$0\nH\u0007ø\u0001\u0000\u001aE\u0010+\u001a\u00020\u00072\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002\b\b\u0002\u0010 \u001a\u00020#2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\u0014\b\u0002\u0010*\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020$0\nH\u0007ø\u0001\u0000\u001aE\u0010-\u001a\u00020\u00072\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002\b\b\u0002\u0010 \u001a\u00020'2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\u0014\b\u0002\u0010,\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020$0\nH\u0007ø\u0001\u0000\u001a1\u0010/\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\t0\u00002\u0014\b\u0002\u0010.\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020$0\nH\u0007ø\u0001\u0000\u001a1\u00101\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\t0\u00002\u0014\b\u0002\u00100\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020$0\nH\u0007ø\u0001\u0000\u001a1\u00103\u001a\u00020\u00072\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\t0\u00002\u0014\b\u0002\u00102\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020$0\nH\u0007ø\u0001\u0000\u001a1\u00105\u001a\u00020\u00072\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\t0\u00002\u0014\b\u0002\u00104\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020$0\nH\u0007ø\u0001\u0000\u001a\f\u00106\u001a\u00020\u001a*\u00020#H\u0002\u001a\f\u00106\u001a\u00020\u001a*\u00020'H\u0002\u001a1\u0010>\u001a\u00020=*\b\u0012\u0004\u0012\u000208072\u0006\u00109\u001a\u00020\u00042\u0006\u0010:\u001a\u00020\u00072\u0006\u0010<\u001a\u00020;H\u0001¢\u0006\u0004\b>\u0010?\u001aB\u0010D\u001a\u00020=*\u00020=2\f\u0010@\u001a\b\u0012\u0004\u0012\u000208072\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010B0A2\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010B0A2\u0006\u0010C\u001a\u00020;H\u0002\u001aB\u0010H\u001a\u00020=*\u00020=2\f\u0010@\u001a\b\u0012\u0004\u0012\u000208072\u000e\u0010F\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010E0A2\u000e\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010E0A2\u0006\u0010C\u001a\u00020;H\u0002\"#\u0010K\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020J0I8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\bK\u0010L\"\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00010M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010O\"\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00010P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010R\"\u001d\u0010S\u001a\b\u0012\u0004\u0012\u00020\t0P8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\bS\u0010R\"\u001d\u0010T\u001a\b\u0012\u0004\u0012\u00020\u000b0P8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\bT\u0010R\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006U"}, d2 = {"Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "animationSpec", "initialAlpha", "Landroidx/compose/animation/EnterTransition;", "fadeIn", "targetAlpha", "Landroidx/compose/animation/ExitTransition;", "fadeOut", "Landroidx/compose/ui/unit/IntOffset;", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/IntSize;", "initialOffset", "slideIn", "targetOffset", "slideOut", "initialScale", "Landroidx/compose/ui/graphics/TransformOrigin;", "transformOrigin", "scaleIn-L8ZKh-E", "(Landroidx/compose/animation/core/FiniteAnimationSpec;FJ)Landroidx/compose/animation/EnterTransition;", "scaleIn", "targetScale", "scaleOut-L8ZKh-E", "(Landroidx/compose/animation/core/FiniteAnimationSpec;FJ)Landroidx/compose/animation/ExitTransition;", "scaleOut", "Landroidx/compose/ui/Alignment;", "expandFrom", "", "clip", "initialSize", "expandIn", "shrinkTowards", "targetSize", "shrinkOut", "Landroidx/compose/ui/Alignment$Horizontal;", "", "initialWidth", "expandHorizontally", "Landroidx/compose/ui/Alignment$Vertical;", "initialHeight", "expandVertically", "targetWidth", "shrinkHorizontally", "targetHeight", "shrinkVertically", "initialOffsetX", "slideInHorizontally", "initialOffsetY", "slideInVertically", "targetOffsetX", "slideOutHorizontally", "targetOffsetY", "slideOutVertically", "toAlignment", "Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/EnterExitState;", "enter", "exit", "", "label", "Landroidx/compose/ui/Modifier;", "createModifier", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "transition", "Landroidx/compose/runtime/State;", "Landroidx/compose/animation/Slide;", "labelPrefix", "slideInOut", "Landroidx/compose/animation/ChangeSize;", "expand", "shrink", "shrinkExpand", "Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/animation/core/AnimationVector2D;", "TransformOriginVectorConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/runtime/MutableState;", "DefaultAlpha", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/animation/core/SpringSpec;", "DefaultAlphaAndScaleSpring", "Landroidx/compose/animation/core/SpringSpec;", "DefaultOffsetAnimationSpec", "DefaultSizeAnimationSpec", "animation_release"}, k = 2, mv = {1, 6, 0})
public final class EnterExitTransitionKt {

    @NotNull
    private static final TwoWayConverter<TransformOrigin, AnimationVector2D> TransformOriginVectorConverter = VectorConvertersKt.TwoWayConverter(new l<TransformOrigin, AnimationVector2D>() { // from class: androidx.compose.animation.EnterExitTransitionKt$TransformOriginVectorConverter$1
        @Override // sn.l
        public /* bridge */ /* synthetic */ AnimationVector2D invoke(TransformOrigin transformOrigin) {
            return m55invoke__ExYCQ(transformOrigin.getPackedValue());
        }

        @NotNull
        /* JADX INFO: renamed from: invoke-__ExYCQ, reason: not valid java name */
        public final AnimationVector2D m55invoke__ExYCQ(long j10) {
            return new AnimationVector2D(TransformOrigin.m1956getPivotFractionXimpl(j10), TransformOrigin.m1957getPivotFractionYimpl(j10));
        }
    }, new l<AnimationVector2D, TransformOrigin>() { // from class: androidx.compose.animation.EnterExitTransitionKt$TransformOriginVectorConverter$2
        @Override // sn.l
        public /* bridge */ /* synthetic */ TransformOrigin invoke(AnimationVector2D animationVector2D) {
            return TransformOrigin.m1948boximpl(m56invokeLIALnN8(animationVector2D));
        }

        /* JADX INFO: renamed from: invoke-LIALnN8, reason: not valid java name */
        public final long m56invokeLIALnN8(@NotNull AnimationVector2D animationVector2D) {
            p.k(animationVector2D, "it");
            return TransformOriginKt.TransformOrigin(animationVector2D.getV1(), animationVector2D.getV2());
        }
    });

    @NotNull
    private static final MutableState<Float> DefaultAlpha = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(1.0f), null, 2, null);

    @NotNull
    private static final SpringSpec<Float> DefaultAlphaAndScaleSpring = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);

    @NotNull
    private static final SpringSpec<IntOffset> DefaultOffsetAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m3935boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.INSTANCE)), 1, null);

    @NotNull
    private static final SpringSpec<IntSize> DefaultSizeAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m3978boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.INSTANCE)), 1, null);

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

    /* JADX WARN: Removed duplicated region for block: B:100:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02e5  */
    @androidx.compose.runtime.Composable
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.Modifier createModifier(@org.jetbrains.annotations.NotNull androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r24, @org.jetbrains.annotations.NotNull final androidx.compose.animation.EnterTransition r25, @org.jetbrains.annotations.NotNull final androidx.compose.animation.ExitTransition r26, @org.jetbrains.annotations.NotNull java.lang.String r27, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r28, int r29) {
        /*
            Method dump skipped, instruction units count: 1225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.EnterExitTransitionKt.createModifier(androidx.compose.animation.core.Transition, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, java.lang.String, androidx.compose.runtime.Composer, int):androidx.compose.ui.Modifier");
    }

    /* JADX INFO: renamed from: createModifier$lambda-1, reason: not valid java name */
    private static final boolean m44createModifier$lambda1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: createModifier$lambda-11, reason: not valid java name */
    public static final float m45createModifier$lambda11(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: createModifier$lambda-13, reason: not valid java name */
    public static final long m46createModifier$lambda13(State<TransformOrigin> state) {
        return state.getValue().getPackedValue();
    }

    /* JADX INFO: renamed from: createModifier$lambda-2, reason: not valid java name */
    private static final void m47createModifier$lambda2(MutableState<Boolean> mutableState, boolean z10) {
        mutableState.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: renamed from: createModifier$lambda-4, reason: not valid java name */
    private static final boolean m48createModifier$lambda4(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: renamed from: createModifier$lambda-5, reason: not valid java name */
    private static final void m49createModifier$lambda5(MutableState<Boolean> mutableState, boolean z10) {
        mutableState.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: createModifier$lambda-8, reason: not valid java name */
    public static final float m50createModifier$lambda8(State<Float> state) {
        return state.getValue().floatValue();
    }

    @Stable
    @NotNull
    public static final EnterTransition expandHorizontally(@NotNull FiniteAnimationSpec<IntSize> finiteAnimationSpec, @NotNull Alignment.Horizontal horizontal, boolean z10, @NotNull final l<? super Integer, Integer> lVar) {
        p.k(finiteAnimationSpec, "animationSpec");
        p.k(horizontal, "expandFrom");
        p.k(lVar, "initialWidth");
        return expandIn(finiteAnimationSpec, toAlignment(horizontal), z10, new l<IntSize, IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionKt.expandHorizontally.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
                return IntSize.m3978boximpl(m57invokemzRDjE0(intSize.getPackedValue()));
            }

            /* JADX INFO: renamed from: invoke-mzRDjE0, reason: not valid java name */
            public final long m57invokemzRDjE0(long j10) {
                return IntSizeKt.IntSize(lVar.invoke(Integer.valueOf(IntSize.m3986getWidthimpl(j10))).intValue(), IntSize.m3985getHeightimpl(j10));
            }
        });
    }

    public static /* synthetic */ EnterTransition expandHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Horizontal horizontal, boolean z10, l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m3978boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.INSTANCE)), 1, null);
        }
        if ((i10 & 2) != 0) {
            horizontal = Alignment.INSTANCE.getEnd();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            lVar = new l<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt.expandHorizontally.1
                @NotNull
                public final Integer invoke(int i11) {
                    return 0;
                }

                @Override // sn.l
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }
            };
        }
        return expandHorizontally(finiteAnimationSpec, horizontal, z10, lVar);
    }

    @Stable
    @NotNull
    public static final EnterTransition expandIn(@NotNull FiniteAnimationSpec<IntSize> finiteAnimationSpec, @NotNull Alignment alignment, boolean z10, @NotNull l<? super IntSize, IntSize> lVar) {
        p.k(finiteAnimationSpec, "animationSpec");
        p.k(alignment, "expandFrom");
        p.k(lVar, "initialSize");
        return new EnterTransitionImpl(new TransitionData(null, null, new ChangeSize(alignment, lVar, finiteAnimationSpec, z10), null, 11, null));
    }

    public static /* synthetic */ EnterTransition expandIn$default(FiniteAnimationSpec finiteAnimationSpec, Alignment alignment, boolean z10, l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m3978boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.INSTANCE)), 1, null);
        }
        if ((i10 & 2) != 0) {
            alignment = Alignment.INSTANCE.getBottomEnd();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            lVar = new l<IntSize, IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionKt.expandIn.1
                @Override // sn.l
                public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
                    return IntSize.m3978boximpl(m58invokemzRDjE0(intSize.getPackedValue()));
                }

                /* JADX INFO: renamed from: invoke-mzRDjE0, reason: not valid java name */
                public final long m58invokemzRDjE0(long j10) {
                    return IntSizeKt.IntSize(0, 0);
                }
            };
        }
        return expandIn(finiteAnimationSpec, alignment, z10, lVar);
    }

    @Stable
    @NotNull
    public static final EnterTransition expandVertically(@NotNull FiniteAnimationSpec<IntSize> finiteAnimationSpec, @NotNull Alignment.Vertical vertical, boolean z10, @NotNull final l<? super Integer, Integer> lVar) {
        p.k(finiteAnimationSpec, "animationSpec");
        p.k(vertical, "expandFrom");
        p.k(lVar, "initialHeight");
        return expandIn(finiteAnimationSpec, toAlignment(vertical), z10, new l<IntSize, IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionKt.expandVertically.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
                return IntSize.m3978boximpl(m59invokemzRDjE0(intSize.getPackedValue()));
            }

            /* JADX INFO: renamed from: invoke-mzRDjE0, reason: not valid java name */
            public final long m59invokemzRDjE0(long j10) {
                return IntSizeKt.IntSize(IntSize.m3986getWidthimpl(j10), lVar.invoke(Integer.valueOf(IntSize.m3985getHeightimpl(j10))).intValue());
            }
        });
    }

    public static /* synthetic */ EnterTransition expandVertically$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Vertical vertical, boolean z10, l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m3978boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.INSTANCE)), 1, null);
        }
        if ((i10 & 2) != 0) {
            vertical = Alignment.INSTANCE.getBottom();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            lVar = new l<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt.expandVertically.1
                @NotNull
                public final Integer invoke(int i11) {
                    return 0;
                }

                @Override // sn.l
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }
            };
        }
        return expandVertically(finiteAnimationSpec, vertical, z10, lVar);
    }

    @Stable
    @NotNull
    public static final EnterTransition fadeIn(@NotNull FiniteAnimationSpec<Float> finiteAnimationSpec, float f10) {
        p.k(finiteAnimationSpec, "animationSpec");
        return new EnterTransitionImpl(new TransitionData(new Fade(f10, finiteAnimationSpec), null, null, null, 14, null));
    }

    public static /* synthetic */ EnterTransition fadeIn$default(FiniteAnimationSpec finiteAnimationSpec, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        return fadeIn(finiteAnimationSpec, f10);
    }

    @Stable
    @NotNull
    public static final ExitTransition fadeOut(@NotNull FiniteAnimationSpec<Float> finiteAnimationSpec, float f10) {
        p.k(finiteAnimationSpec, "animationSpec");
        return new ExitTransitionImpl(new TransitionData(new Fade(f10, finiteAnimationSpec), null, null, null, 14, null));
    }

    public static /* synthetic */ ExitTransition fadeOut$default(FiniteAnimationSpec finiteAnimationSpec, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        return fadeOut(finiteAnimationSpec, f10);
    }

    @Stable
    @ExperimentalAnimationApi
    @NotNull
    /* JADX INFO: renamed from: scaleIn-L8ZKh-E, reason: not valid java name */
    public static final EnterTransition m51scaleInL8ZKhE(@NotNull FiniteAnimationSpec<Float> finiteAnimationSpec, float f10, long j10) {
        p.k(finiteAnimationSpec, "animationSpec");
        return new EnterTransitionImpl(new TransitionData(null, null, null, new Scale(f10, j10, finiteAnimationSpec, null), 7, null));
    }

    /* JADX INFO: renamed from: scaleIn-L8ZKh-E$default, reason: not valid java name */
    public static /* synthetic */ EnterTransition m52scaleInL8ZKhE$default(FiniteAnimationSpec finiteAnimationSpec, float f10, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            j10 = TransformOrigin.INSTANCE.m1961getCenterSzJe1aQ();
        }
        return m51scaleInL8ZKhE(finiteAnimationSpec, f10, j10);
    }

    @Stable
    @ExperimentalAnimationApi
    @NotNull
    /* JADX INFO: renamed from: scaleOut-L8ZKh-E, reason: not valid java name */
    public static final ExitTransition m53scaleOutL8ZKhE(@NotNull FiniteAnimationSpec<Float> finiteAnimationSpec, float f10, long j10) {
        p.k(finiteAnimationSpec, "animationSpec");
        return new ExitTransitionImpl(new TransitionData(null, null, null, new Scale(f10, j10, finiteAnimationSpec, null), 7, null));
    }

    /* JADX INFO: renamed from: scaleOut-L8ZKh-E$default, reason: not valid java name */
    public static /* synthetic */ ExitTransition m54scaleOutL8ZKhE$default(FiniteAnimationSpec finiteAnimationSpec, float f10, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            j10 = TransformOrigin.INSTANCE.m1961getCenterSzJe1aQ();
        }
        return m53scaleOutL8ZKhE(finiteAnimationSpec, f10, j10);
    }

    private static final Modifier shrinkExpand(Modifier modifier, final Transition<EnterExitState> transition, final State<ChangeSize> state, final State<ChangeSize> state2, final String str) {
        return ComposedModifierKt.composed$default(modifier, null, new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.animation.EnterExitTransitionKt.shrinkExpand.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            /* JADX INFO: renamed from: invoke$lambda-1, reason: not valid java name */
            private static final boolean m60invoke$lambda1(MutableState<Boolean> mutableState) {
                return mutableState.getValue().booleanValue();
            }

            /* JADX INFO: renamed from: invoke$lambda-2, reason: not valid java name */
            private static final void m61invoke$lambda2(MutableState<Boolean> mutableState, boolean z10) {
                mutableState.setValue(Boolean.valueOf(z10));
            }

            /* JADX WARN: Removed duplicated region for block: B:35:0x00ba  */
            /* JADX WARN: Removed duplicated region for block: B:38:0x00db  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x010f  */
            /* JADX WARN: Removed duplicated region for block: B:42:0x0111  */
            /* JADX WARN: Removed duplicated region for block: B:45:0x0130  */
            /* JADX WARN: Removed duplicated region for block: B:50:0x016f  */
            /* JADX WARN: Removed duplicated region for block: B:53:0x0193  */
            /* JADX WARN: Removed duplicated region for block: B:54:0x0197  */
            /* JADX WARN: Removed duplicated region for block: B:65:0x01c0  */
            /* JADX WARN: Removed duplicated region for block: B:67:0x01c3  */
            /* JADX WARN: Removed duplicated region for block: B:79:0x01df  */
            @androidx.compose.runtime.Composable
            @org.jetbrains.annotations.NotNull
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final androidx.compose.ui.Modifier invoke(@org.jetbrains.annotations.NotNull androidx.compose.ui.Modifier r21, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r22, int r23) {
                /*
                    Method dump skipped, instruction units count: 495
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.EnterExitTransitionKt.C11401.invoke(androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):androidx.compose.ui.Modifier");
            }

            @Override // sn.q
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }
        }, 1, null);
    }

    @Stable
    @NotNull
    public static final ExitTransition shrinkHorizontally(@NotNull FiniteAnimationSpec<IntSize> finiteAnimationSpec, @NotNull Alignment.Horizontal horizontal, boolean z10, @NotNull final l<? super Integer, Integer> lVar) {
        p.k(finiteAnimationSpec, "animationSpec");
        p.k(horizontal, "shrinkTowards");
        p.k(lVar, "targetWidth");
        return shrinkOut(finiteAnimationSpec, toAlignment(horizontal), z10, new l<IntSize, IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionKt.shrinkHorizontally.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
                return IntSize.m3978boximpl(m62invokemzRDjE0(intSize.getPackedValue()));
            }

            /* JADX INFO: renamed from: invoke-mzRDjE0, reason: not valid java name */
            public final long m62invokemzRDjE0(long j10) {
                return IntSizeKt.IntSize(lVar.invoke(Integer.valueOf(IntSize.m3986getWidthimpl(j10))).intValue(), IntSize.m3985getHeightimpl(j10));
            }
        });
    }

    public static /* synthetic */ ExitTransition shrinkHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Horizontal horizontal, boolean z10, l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m3978boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.INSTANCE)), 1, null);
        }
        if ((i10 & 2) != 0) {
            horizontal = Alignment.INSTANCE.getEnd();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            lVar = new l<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt.shrinkHorizontally.1
                @NotNull
                public final Integer invoke(int i11) {
                    return 0;
                }

                @Override // sn.l
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }
            };
        }
        return shrinkHorizontally(finiteAnimationSpec, horizontal, z10, lVar);
    }

    @Stable
    @NotNull
    public static final ExitTransition shrinkOut(@NotNull FiniteAnimationSpec<IntSize> finiteAnimationSpec, @NotNull Alignment alignment, boolean z10, @NotNull l<? super IntSize, IntSize> lVar) {
        p.k(finiteAnimationSpec, "animationSpec");
        p.k(alignment, "shrinkTowards");
        p.k(lVar, "targetSize");
        return new ExitTransitionImpl(new TransitionData(null, null, new ChangeSize(alignment, lVar, finiteAnimationSpec, z10), null, 11, null));
    }

    public static /* synthetic */ ExitTransition shrinkOut$default(FiniteAnimationSpec finiteAnimationSpec, Alignment alignment, boolean z10, l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m3978boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.INSTANCE)), 1, null);
        }
        if ((i10 & 2) != 0) {
            alignment = Alignment.INSTANCE.getBottomEnd();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            lVar = new l<IntSize, IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionKt.shrinkOut.1
                @Override // sn.l
                public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
                    return IntSize.m3978boximpl(m63invokemzRDjE0(intSize.getPackedValue()));
                }

                /* JADX INFO: renamed from: invoke-mzRDjE0, reason: not valid java name */
                public final long m63invokemzRDjE0(long j10) {
                    return IntSizeKt.IntSize(0, 0);
                }
            };
        }
        return shrinkOut(finiteAnimationSpec, alignment, z10, lVar);
    }

    @Stable
    @NotNull
    public static final ExitTransition shrinkVertically(@NotNull FiniteAnimationSpec<IntSize> finiteAnimationSpec, @NotNull Alignment.Vertical vertical, boolean z10, @NotNull final l<? super Integer, Integer> lVar) {
        p.k(finiteAnimationSpec, "animationSpec");
        p.k(vertical, "shrinkTowards");
        p.k(lVar, "targetHeight");
        return shrinkOut(finiteAnimationSpec, toAlignment(vertical), z10, new l<IntSize, IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionKt.shrinkVertically.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
                return IntSize.m3978boximpl(m64invokemzRDjE0(intSize.getPackedValue()));
            }

            /* JADX INFO: renamed from: invoke-mzRDjE0, reason: not valid java name */
            public final long m64invokemzRDjE0(long j10) {
                return IntSizeKt.IntSize(IntSize.m3986getWidthimpl(j10), lVar.invoke(Integer.valueOf(IntSize.m3985getHeightimpl(j10))).intValue());
            }
        });
    }

    public static /* synthetic */ ExitTransition shrinkVertically$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Vertical vertical, boolean z10, l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m3978boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.INSTANCE)), 1, null);
        }
        if ((i10 & 2) != 0) {
            vertical = Alignment.INSTANCE.getBottom();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            lVar = new l<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt.shrinkVertically.1
                @NotNull
                public final Integer invoke(int i11) {
                    return 0;
                }

                @Override // sn.l
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }
            };
        }
        return shrinkVertically(finiteAnimationSpec, vertical, z10, lVar);
    }

    @Stable
    @NotNull
    public static final EnterTransition slideIn(@NotNull FiniteAnimationSpec<IntOffset> finiteAnimationSpec, @NotNull l<? super IntSize, IntOffset> lVar) {
        p.k(finiteAnimationSpec, "animationSpec");
        p.k(lVar, "initialOffset");
        return new EnterTransitionImpl(new TransitionData(null, new Slide(lVar, finiteAnimationSpec), null, null, 13, null));
    }

    public static /* synthetic */ EnterTransition slideIn$default(FiniteAnimationSpec finiteAnimationSpec, l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m3935boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.INSTANCE)), 1, null);
        }
        return slideIn(finiteAnimationSpec, lVar);
    }

    @Stable
    @NotNull
    public static final EnterTransition slideInHorizontally(@NotNull FiniteAnimationSpec<IntOffset> finiteAnimationSpec, @NotNull final l<? super Integer, Integer> lVar) {
        p.k(finiteAnimationSpec, "animationSpec");
        p.k(lVar, "initialOffsetX");
        return slideIn(finiteAnimationSpec, new l<IntSize, IntOffset>() { // from class: androidx.compose.animation.EnterExitTransitionKt.slideInHorizontally.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ IntOffset invoke(IntSize intSize) {
                return IntOffset.m3935boximpl(m65invokemHKZG7I(intSize.getPackedValue()));
            }

            /* JADX INFO: renamed from: invoke-mHKZG7I, reason: not valid java name */
            public final long m65invokemHKZG7I(long j10) {
                return IntOffsetKt.IntOffset(lVar.invoke(Integer.valueOf(IntSize.m3986getWidthimpl(j10))).intValue(), 0);
            }
        });
    }

    public static /* synthetic */ EnterTransition slideInHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m3935boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.INSTANCE)), 1, null);
        }
        if ((i10 & 2) != 0) {
            lVar = new l<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt.slideInHorizontally.1
                @NotNull
                public final Integer invoke(int i11) {
                    return Integer.valueOf((-i11) / 2);
                }

                @Override // sn.l
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }
            };
        }
        return slideInHorizontally(finiteAnimationSpec, lVar);
    }

    private static final Modifier slideInOut(Modifier modifier, final Transition<EnterExitState> transition, final State<Slide> state, final State<Slide> state2, final String str) {
        return ComposedModifierKt.composed$default(modifier, null, new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.animation.EnterExitTransitionKt.slideInOut.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            /* JADX INFO: renamed from: invoke$lambda-1, reason: not valid java name */
            private static final boolean m66invoke$lambda1(MutableState<Boolean> mutableState) {
                return mutableState.getValue().booleanValue();
            }

            /* JADX INFO: renamed from: invoke$lambda-2, reason: not valid java name */
            private static final void m67invoke$lambda2(MutableState<Boolean> mutableState, boolean z10) {
                mutableState.setValue(Boolean.valueOf(z10));
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier modifier2, @Nullable Composer composer, int i10) {
                p.k(modifier2, "$this$composed");
                composer.startReplaceableGroup(158379472);
                Transition<EnterExitState> transition2 = transition;
                composer.startReplaceableGroup(1157296644);
                boolean zChanged = composer.changed(transition2);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                MutableState mutableState = (MutableState) objRememberedValue;
                if (transition.getCurrentState() == transition.getTargetState() && !transition.isSeeking()) {
                    m67invoke$lambda2(mutableState, false);
                } else if (state.getValue() != null || state2.getValue() != null) {
                    m67invoke$lambda2(mutableState, true);
                }
                if (m66invoke$lambda1(mutableState)) {
                    Transition<EnterExitState> transition3 = transition;
                    TwoWayConverter<IntOffset, AnimationVector2D> vectorConverter = VectorConvertersKt.getVectorConverter(IntOffset.INSTANCE);
                    String str2 = str;
                    composer.startReplaceableGroup(-492369756);
                    Object objRememberedValue2 = composer.rememberedValue();
                    Composer.Companion companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = str2 + " slide";
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    composer.endReplaceableGroup();
                    Transition.DeferredAnimation deferredAnimationCreateDeferredAnimation = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(transition3, vectorConverter, (String) objRememberedValue2, composer, 448, 0);
                    Transition<EnterExitState> transition4 = transition;
                    State<Slide> state3 = state;
                    State<Slide> state4 = state2;
                    composer.startReplaceableGroup(1157296644);
                    boolean zChanged2 = composer.changed(transition4);
                    Object objRememberedValue3 = composer.rememberedValue();
                    if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new SlideModifier(deferredAnimationCreateDeferredAnimation, state3, state4);
                        composer.updateRememberedValue(objRememberedValue3);
                    }
                    composer.endReplaceableGroup();
                    modifier2 = modifier2.then((SlideModifier) objRememberedValue3);
                }
                composer.endReplaceableGroup();
                return modifier2;
            }

            @Override // sn.q
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }
        }, 1, null);
    }

    @Stable
    @NotNull
    public static final EnterTransition slideInVertically(@NotNull FiniteAnimationSpec<IntOffset> finiteAnimationSpec, @NotNull final l<? super Integer, Integer> lVar) {
        p.k(finiteAnimationSpec, "animationSpec");
        p.k(lVar, "initialOffsetY");
        return slideIn(finiteAnimationSpec, new l<IntSize, IntOffset>() { // from class: androidx.compose.animation.EnterExitTransitionKt.slideInVertically.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ IntOffset invoke(IntSize intSize) {
                return IntOffset.m3935boximpl(m68invokemHKZG7I(intSize.getPackedValue()));
            }

            /* JADX INFO: renamed from: invoke-mHKZG7I, reason: not valid java name */
            public final long m68invokemHKZG7I(long j10) {
                return IntOffsetKt.IntOffset(0, lVar.invoke(Integer.valueOf(IntSize.m3985getHeightimpl(j10))).intValue());
            }
        });
    }

    public static /* synthetic */ EnterTransition slideInVertically$default(FiniteAnimationSpec finiteAnimationSpec, l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m3935boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.INSTANCE)), 1, null);
        }
        if ((i10 & 2) != 0) {
            lVar = new l<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt.slideInVertically.1
                @NotNull
                public final Integer invoke(int i11) {
                    return Integer.valueOf((-i11) / 2);
                }

                @Override // sn.l
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }
            };
        }
        return slideInVertically(finiteAnimationSpec, lVar);
    }

    @Stable
    @NotNull
    public static final ExitTransition slideOut(@NotNull FiniteAnimationSpec<IntOffset> finiteAnimationSpec, @NotNull l<? super IntSize, IntOffset> lVar) {
        p.k(finiteAnimationSpec, "animationSpec");
        p.k(lVar, "targetOffset");
        return new ExitTransitionImpl(new TransitionData(null, new Slide(lVar, finiteAnimationSpec), null, null, 13, null));
    }

    public static /* synthetic */ ExitTransition slideOut$default(FiniteAnimationSpec finiteAnimationSpec, l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m3935boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.INSTANCE)), 1, null);
        }
        return slideOut(finiteAnimationSpec, lVar);
    }

    @Stable
    @NotNull
    public static final ExitTransition slideOutHorizontally(@NotNull FiniteAnimationSpec<IntOffset> finiteAnimationSpec, @NotNull final l<? super Integer, Integer> lVar) {
        p.k(finiteAnimationSpec, "animationSpec");
        p.k(lVar, "targetOffsetX");
        return slideOut(finiteAnimationSpec, new l<IntSize, IntOffset>() { // from class: androidx.compose.animation.EnterExitTransitionKt.slideOutHorizontally.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ IntOffset invoke(IntSize intSize) {
                return IntOffset.m3935boximpl(m69invokemHKZG7I(intSize.getPackedValue()));
            }

            /* JADX INFO: renamed from: invoke-mHKZG7I, reason: not valid java name */
            public final long m69invokemHKZG7I(long j10) {
                return IntOffsetKt.IntOffset(lVar.invoke(Integer.valueOf(IntSize.m3986getWidthimpl(j10))).intValue(), 0);
            }
        });
    }

    public static /* synthetic */ ExitTransition slideOutHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m3935boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.INSTANCE)), 1, null);
        }
        if ((i10 & 2) != 0) {
            lVar = new l<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt.slideOutHorizontally.1
                @NotNull
                public final Integer invoke(int i11) {
                    return Integer.valueOf((-i11) / 2);
                }

                @Override // sn.l
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }
            };
        }
        return slideOutHorizontally(finiteAnimationSpec, lVar);
    }

    @Stable
    @NotNull
    public static final ExitTransition slideOutVertically(@NotNull FiniteAnimationSpec<IntOffset> finiteAnimationSpec, @NotNull final l<? super Integer, Integer> lVar) {
        p.k(finiteAnimationSpec, "animationSpec");
        p.k(lVar, "targetOffsetY");
        return slideOut(finiteAnimationSpec, new l<IntSize, IntOffset>() { // from class: androidx.compose.animation.EnterExitTransitionKt.slideOutVertically.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ IntOffset invoke(IntSize intSize) {
                return IntOffset.m3935boximpl(m70invokemHKZG7I(intSize.getPackedValue()));
            }

            /* JADX INFO: renamed from: invoke-mHKZG7I, reason: not valid java name */
            public final long m70invokemHKZG7I(long j10) {
                return IntOffsetKt.IntOffset(0, lVar.invoke(Integer.valueOf(IntSize.m3985getHeightimpl(j10))).intValue());
            }
        });
    }

    public static /* synthetic */ ExitTransition slideOutVertically$default(FiniteAnimationSpec finiteAnimationSpec, l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m3935boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.INSTANCE)), 1, null);
        }
        if ((i10 & 2) != 0) {
            lVar = new l<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt.slideOutVertically.1
                @NotNull
                public final Integer invoke(int i11) {
                    return Integer.valueOf((-i11) / 2);
                }

                @Override // sn.l
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }
            };
        }
        return slideOutVertically(finiteAnimationSpec, lVar);
    }

    private static final Alignment toAlignment(Alignment.Horizontal horizontal) {
        Alignment.Companion companion = Alignment.INSTANCE;
        return p.f(horizontal, companion.getStart()) ? companion.getCenterStart() : p.f(horizontal, companion.getEnd()) ? companion.getCenterEnd() : companion.getCenter();
    }

    private static final Alignment toAlignment(Alignment.Vertical vertical) {
        Alignment.Companion companion = Alignment.INSTANCE;
        return p.f(vertical, companion.getTop()) ? companion.getTopCenter() : p.f(vertical, companion.getBottom()) ? companion.getBottomCenter() : companion.getCenter();
    }
}
