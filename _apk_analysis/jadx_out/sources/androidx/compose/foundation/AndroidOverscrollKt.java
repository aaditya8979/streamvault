package androidx.compose.foundation;

import android.content.Context;
import android.os.Build;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.Velocity;
import bn.r;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import sn.q;
import tn.p;

/* JADX INFO: compiled from: AndroidOverscroll.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0001\u001a\r\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\u0010\t\"\u0016\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\n\n\u0002\u0010\u0004\u0012\u0004\b\u0002\u0010\u0003\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"NoOpOverscrollEffect", "androidx/compose/foundation/AndroidOverscrollKt$NoOpOverscrollEffect$1", "getNoOpOverscrollEffect$annotations", "()V", "Landroidx/compose/foundation/AndroidOverscrollKt$NoOpOverscrollEffect$1;", "StretchOverscrollNonClippingLayer", "Landroidx/compose/ui/Modifier;", "rememberOverscrollEffect", "Landroidx/compose/foundation/OverscrollEffect;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/OverscrollEffect;", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class AndroidOverscrollKt {

    @NotNull
    private static final AndroidOverscrollKt$NoOpOverscrollEffect$1 NoOpOverscrollEffect = new OverscrollEffect() { // from class: androidx.compose.foundation.AndroidOverscrollKt$NoOpOverscrollEffect$1
        private boolean isEnabled;

        @Override // androidx.compose.foundation.OverscrollEffect
        @Nullable
        /* JADX INFO: renamed from: consumePostFling-sF-c-tU */
        public Object mo156consumePostFlingsFctU(long j10, @NotNull hn.c<? super r> cVar) {
            return r.f5635a;
        }

        @Override // androidx.compose.foundation.OverscrollEffect
        /* JADX INFO: renamed from: consumePostScroll-l7mfB5k */
        public void mo157consumePostScrolll7mfB5k(long initialDragDelta, long overscrollDelta, @Nullable Offset pointerPosition, int source) {
        }

        @Override // androidx.compose.foundation.OverscrollEffect
        @Nullable
        /* JADX INFO: renamed from: consumePreFling-QWom1Mo */
        public Object mo158consumePreFlingQWom1Mo(long j10, @NotNull hn.c<? super Velocity> cVar) {
            return Velocity.m4042boximpl(Velocity.INSTANCE.m4062getZero9UxMQ8M());
        }

        @Override // androidx.compose.foundation.OverscrollEffect
        /* JADX INFO: renamed from: consumePreScroll-A0NYTsA */
        public long mo159consumePreScrollA0NYTsA(long scrollDelta, @Nullable Offset pointerPosition, int source) {
            return Offset.INSTANCE.m1399getZeroF1C5BW0();
        }

        @Override // androidx.compose.foundation.OverscrollEffect
        @NotNull
        public Modifier getEffectModifier() {
            return Modifier.INSTANCE;
        }

        @Override // androidx.compose.foundation.OverscrollEffect
        /* JADX INFO: renamed from: isEnabled, reason: from getter */
        public boolean getIsEnabled() {
            return this.isEnabled;
        }

        @Override // androidx.compose.foundation.OverscrollEffect
        public boolean isInProgress() {
            return false;
        }

        @Override // androidx.compose.foundation.OverscrollEffect
        public void setEnabled(boolean z10) {
            this.isEnabled = z10;
        }
    };

    @NotNull
    private static final Modifier StretchOverscrollNonClippingLayer;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.AndroidOverscrollKt$NoOpOverscrollEffect$1] */
    static {
        StretchOverscrollNonClippingLayer = Build.VERSION.SDK_INT >= 31 ? LayoutModifierKt.layout(LayoutModifierKt.layout(Modifier.INSTANCE, new q<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.foundation.AndroidOverscrollKt$StretchOverscrollNonClippingLayer$1
            @Override // sn.q
            public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                return m161invoke3p2s80s(measureScope, measurable, constraints.getValue());
            }

            @NotNull
            /* JADX INFO: renamed from: invoke-3p2s80s, reason: not valid java name */
            public final MeasureResult m161invoke3p2s80s(@NotNull MeasureScope measureScope, @NotNull Measurable measurable, long j10) {
                p.k(measureScope, "$this$layout");
                p.k(measurable, "measurable");
                final Placeable placeableMo3112measureBRTryo0 = measurable.mo3112measureBRTryo0(j10);
                final int iMo300roundToPx0680j_4 = measureScope.mo300roundToPx0680j_4(Dp.m3826constructorimpl(ClipScrollableContainerKt.getMaxSupportedElevation() * 2));
                return MeasureScope.layout$default(measureScope, placeableMo3112measureBRTryo0.getMeasuredWidth() - iMo300roundToPx0680j_4, placeableMo3112measureBRTryo0.getMeasuredHeight() - iMo300roundToPx0680j_4, null, new l<Placeable.PlacementScope, r>() { // from class: androidx.compose.foundation.AndroidOverscrollKt$StretchOverscrollNonClippingLayer$1.1
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
                        Placeable placeable = placeableMo3112measureBRTryo0;
                        Placeable.PlacementScope.placeWithLayer$default(placementScope, placeable, ((-iMo300roundToPx0680j_4) / 2) - ((placeable.getWidth() - placeableMo3112measureBRTryo0.getMeasuredWidth()) / 2), ((-iMo300roundToPx0680j_4) / 2) - ((placeableMo3112measureBRTryo0.getHeight() - placeableMo3112measureBRTryo0.getMeasuredHeight()) / 2), 0.0f, null, 12, null);
                    }
                }, 4, null);
            }
        }), new q<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.foundation.AndroidOverscrollKt$StretchOverscrollNonClippingLayer$2
            @Override // sn.q
            public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                return m162invoke3p2s80s(measureScope, measurable, constraints.getValue());
            }

            @NotNull
            /* JADX INFO: renamed from: invoke-3p2s80s, reason: not valid java name */
            public final MeasureResult m162invoke3p2s80s(@NotNull MeasureScope measureScope, @NotNull Measurable measurable, long j10) {
                p.k(measureScope, "$this$layout");
                p.k(measurable, "measurable");
                final Placeable placeableMo3112measureBRTryo0 = measurable.mo3112measureBRTryo0(j10);
                final int iMo300roundToPx0680j_4 = measureScope.mo300roundToPx0680j_4(Dp.m3826constructorimpl(ClipScrollableContainerKt.getMaxSupportedElevation() * 2));
                return MeasureScope.layout$default(measureScope, placeableMo3112measureBRTryo0.getWidth() + iMo300roundToPx0680j_4, placeableMo3112measureBRTryo0.getHeight() + iMo300roundToPx0680j_4, null, new l<Placeable.PlacementScope, r>() { // from class: androidx.compose.foundation.AndroidOverscrollKt$StretchOverscrollNonClippingLayer$2.1
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
                        Placeable placeable = placeableMo3112measureBRTryo0;
                        int i10 = iMo300roundToPx0680j_4;
                        Placeable.PlacementScope.place$default(placementScope, placeable, i10 / 2, i10 / 2, 0.0f, 4, null);
                    }
                }, 4, null);
            }
        }) : Modifier.INSTANCE;
    }

    private static /* synthetic */ void getNoOpOverscrollEffect$annotations() {
    }

    @Composable
    @NotNull
    public static final OverscrollEffect rememberOverscrollEffect(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(-81138291);
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        OverscrollConfiguration overscrollConfiguration = (OverscrollConfiguration) composer.consume(OverscrollConfigurationKt.getLocalOverscrollConfiguration());
        composer.startReplaceableGroup(511388516);
        boolean zChanged = composer.changed(context) | composer.changed(overscrollConfiguration);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = overscrollConfiguration != null ? new AndroidEdgeEffectOverscrollEffect(context, overscrollConfiguration) : NoOpOverscrollEffect;
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        OverscrollEffect overscrollEffect = (OverscrollEffect) objRememberedValue;
        composer.endReplaceableGroup();
        return overscrollEffect;
    }
}
