package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.unit.LayoutDirection;
import bn.r;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.a;
import sn.l;
import sn.p;

/* JADX INFO: compiled from: VectorPainter.kt */
/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b?\u0010@J6\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u001d\u0010\b\u001a\u0019\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJF\u0010\u0013\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u001d\u0010\u0010\u001a\u0019\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\f\u0010\u0015\u001a\u00020\u0006*\u00020\u0014H\u0014J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0005H\u0014J\u0012\u0010\u001b\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0014R4\u0010$\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c8@@@X\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R+\u0010*\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00178@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010.\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R+\u00101\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00178B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b0\u0010\u001f\u001a\u0004\b1\u0010'\"\u0004\b2\u0010)R\u0016\u00103\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00105\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R(\u0010<\u001a\u0004\u0018\u00010\u00192\b\u00107\u001a\u0004\u0018\u00010\u00198@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001d\u0010>\u001a\u00020\u001c8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b=\u0010!\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006A"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorPainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "Landroidx/compose/runtime/CompositionContext;", "parent", "Lkotlin/Function2;", "", "Lbn/r;", "Landroidx/compose/runtime/Composable;", "composable", "Landroidx/compose/runtime/Composition;", "composeVector", "(Landroidx/compose/runtime/CompositionContext;Lsn/r;)Landroidx/compose/runtime/Composition;", "", "name", "viewportWidth", "viewportHeight", "content", "RenderVector$ui_release", "(Ljava/lang/String;FFLsn/r;Landroidx/compose/runtime/Composer;I)V", "RenderVector", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "onDraw", "alpha", "", "applyAlpha", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "applyColorFilter", "Landroidx/compose/ui/geometry/Size;", "<set-?>", "size$delegate", "Landroidx/compose/runtime/MutableState;", "getSize-NH-jbRc$ui_release", "()J", "setSize-uvyYCjk$ui_release", "(J)V", "size", "autoMirror$delegate", "getAutoMirror$ui_release", "()Z", "setAutoMirror$ui_release", "(Z)V", "autoMirror", "Landroidx/compose/ui/graphics/vector/VectorComponent;", "vector", "Landroidx/compose/ui/graphics/vector/VectorComponent;", "composition", "Landroidx/compose/runtime/Composition;", "isDirty$delegate", "isDirty", "setDirty", "currentAlpha", "F", "currentColorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "value", "getIntrinsicColorFilter$ui_release", "()Landroidx/compose/ui/graphics/ColorFilter;", "setIntrinsicColorFilter$ui_release", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "intrinsicColorFilter", "getIntrinsicSize-NH-jbRc", "intrinsicSize", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 6, 0})
public final class VectorPainter extends Painter {
    public static final int $stable = 8;

    @Nullable
    private Composition composition;
    private float currentAlpha;

    @Nullable
    private ColorFilter currentColorFilter;

    /* JADX INFO: renamed from: isDirty$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState isDirty;

    @NotNull
    private final VectorComponent vector;

    /* JADX INFO: renamed from: size$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState size = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Size.m1440boximpl(Size.INSTANCE.m1461getZeroNHjbRc()), null, 2, null);

    /* JADX INFO: renamed from: autoMirror$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState autoMirror = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    public VectorPainter() {
        VectorComponent vectorComponent = new VectorComponent();
        vectorComponent.setInvalidateCallback$ui_release(new a<r>() { // from class: androidx.compose.ui.graphics.vector.VectorPainter$vector$1$1
            {
                super(0);
            }

            @Override // sn.a
            public /* bridge */ /* synthetic */ r invoke() {
                invoke2();
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.setDirty(true);
            }
        });
        this.vector = vectorComponent;
        this.isDirty = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        this.currentAlpha = 1.0f;
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    private final Composition composeVector(CompositionContext parent, final sn.r<? super Float, ? super Float, ? super Composer, ? super Integer, r> composable) {
        Composition Composition = this.composition;
        if (Composition == null || Composition.getDisposed()) {
            Composition = CompositionKt.Composition(new VectorApplier(this.vector.getRoot()), parent);
        }
        this.composition = Composition;
        Composition.setContent(ComposableLambdaKt.composableLambdaInstance(-1916507005, true, new p<Composer, Integer, r>() { // from class: androidx.compose.ui.graphics.vector.VectorPainter.composeVector.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ r mo2invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return r.f5635a;
            }

            @Composable
            public final void invoke(@Nullable Composer composer, int i10) {
                if ((i10 & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                } else {
                    composable.invoke(Float.valueOf(this.vector.getViewportWidth()), Float.valueOf(this.vector.getViewportHeight()), composer, 0);
                }
            }
        }));
        return Composition;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean isDirty() {
        return ((Boolean) this.isDirty.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDirty(boolean z10) {
        this.isDirty.setValue(Boolean.valueOf(z10));
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public final void RenderVector$ui_release(@NotNull final String str, final float f10, final float f11, @NotNull final sn.r<? super Float, ? super Float, ? super Composer, ? super Integer, r> rVar, @Nullable Composer composer, final int i10) {
        tn.p.k(str, "name");
        tn.p.k(rVar, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1264894527);
        VectorComponent vectorComponent = this.vector;
        vectorComponent.setName(str);
        vectorComponent.setViewportWidth(f10);
        vectorComponent.setViewportHeight(f11);
        final Composition compositionComposeVector = composeVector(ComposablesKt.rememberCompositionContext(composerStartRestartGroup, 0), rVar);
        EffectsKt.DisposableEffect(compositionComposeVector, new l<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.ui.graphics.vector.VectorPainter$RenderVector$2
            {
                super(1);
            }

            @Override // sn.l
            @NotNull
            public final DisposableEffectResult invoke(@NotNull DisposableEffectScope disposableEffectScope) {
                tn.p.k(disposableEffectScope, "$this$DisposableEffect");
                final Composition composition = compositionComposeVector;
                return new DisposableEffectResult() { // from class: androidx.compose.ui.graphics.vector.VectorPainter$RenderVector$2$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        composition.dispose();
                    }
                };
            }
        }, composerStartRestartGroup, 8);
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, r>() { // from class: androidx.compose.ui.graphics.vector.VectorPainter$RenderVector$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ r mo2invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return r.f5635a;
            }

            public final void invoke(@Nullable Composer composer2, int i11) {
                this.$tmp0_rcvr.RenderVector$ui_release(str, f10, f11, rVar, composer2, i10 | 1);
            }
        });
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public boolean applyAlpha(float alpha) {
        this.currentAlpha = alpha;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public boolean applyColorFilter(@Nullable ColorFilter colorFilter) {
        this.currentColorFilter = colorFilter;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getAutoMirror$ui_release() {
        return ((Boolean) this.autoMirror.getValue()).booleanValue();
    }

    @Nullable
    public final ColorFilter getIntrinsicColorFilter$ui_release() {
        return this.vector.getIntrinsicColorFilter$ui_release();
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc */
    public long getIntrinsicSize() {
        return m2220getSizeNHjbRc$ui_release();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getSize-NH-jbRc$ui_release, reason: not valid java name */
    public final long m2220getSizeNHjbRc$ui_release() {
        return ((Size) this.size.getValue()).getPackedValue();
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public void onDraw(@NotNull DrawScope drawScope) {
        tn.p.k(drawScope, "<this>");
        VectorComponent vectorComponent = this.vector;
        ColorFilter intrinsicColorFilter$ui_release = this.currentColorFilter;
        if (intrinsicColorFilter$ui_release == null) {
            intrinsicColorFilter$ui_release = vectorComponent.getIntrinsicColorFilter$ui_release();
        }
        if (getAutoMirror$ui_release() && drawScope.getLayoutDirection() == LayoutDirection.Rtl) {
            long jMo2112getCenterF1C5BW0 = drawScope.mo2112getCenterF1C5BW0();
            DrawContext drawContext = drawScope.getDrawContext();
            long jMo2038getSizeNHjbRc = drawContext.mo2038getSizeNHjbRc();
            drawContext.getCanvas().save();
            drawContext.getTransform().mo2045scale0AR0LA0(-1.0f, 1.0f, jMo2112getCenterF1C5BW0);
            vectorComponent.draw(drawScope, this.currentAlpha, intrinsicColorFilter$ui_release);
            drawContext.getCanvas().restore();
            drawContext.mo2039setSizeuvyYCjk(jMo2038getSizeNHjbRc);
        } else {
            vectorComponent.draw(drawScope, this.currentAlpha, intrinsicColorFilter$ui_release);
        }
        if (isDirty()) {
            setDirty(false);
        }
    }

    public final void setAutoMirror$ui_release(boolean z10) {
        this.autoMirror.setValue(Boolean.valueOf(z10));
    }

    public final void setIntrinsicColorFilter$ui_release(@Nullable ColorFilter colorFilter) {
        this.vector.setIntrinsicColorFilter$ui_release(colorFilter);
    }

    /* JADX INFO: renamed from: setSize-uvyYCjk$ui_release, reason: not valid java name */
    public final void m2221setSizeuvyYCjk$ui_release(long j10) {
        this.size.setValue(Size.m1440boximpl(j10));
    }
}
