package androidx.compose.ui.layout;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.UiComposable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.MeasureBlocks;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.JvmActuals_jvmKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import bn.r;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.a;
import sn.l;
import sn.q;
import tn.p;

/* JADX INFO: compiled from: Layout.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a=\u0010\t\u001a\u00020\u00012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0087\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\"\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0087\b¢\u0006\u0004\b\t\u0010\u000b\u001a\u0086\u0002\u0010\t\u001a\u00020\u00012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u00032(\u0010\u0012\u001a$\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\fj\u0002`\u00112(\u0010\u0013\u001a$\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\fj\u0002`\u00112(\u0010\u0014\u001a$\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\fj\u0002`\u00112(\u0010\u0015\u001a$\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\fj\u0002`\u00112\b\b\u0002\u0010\u0006\u001a\u00020\u00052(\u0010\u001b\u001a$\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\fj\u0002`\u001aH\u0001ø\u0001\u0001¢\u0006\u0004\b\t\u0010\u001c\u001aÝ\u0001\u0010\u001e\u001a\u00020\u001d2(\u0010\u0012\u001a$\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\fj\u0002`\u00112(\u0010\u0013\u001a$\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\fj\u0002`\u00112(\u0010\u0014\u001a$\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\fj\u0002`\u00112(\u0010\u0015\u001a$\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\fj\u0002`\u00112(\u0010\u001b\u001a$\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\fj\u0002`\u001aH\u0001ø\u0001\u0001\u001a1\u0010\"\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 \u0012\u0004\u0012\u00020\u00010\u001f¢\u0006\u0002\b\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0001ø\u0001\u0001¢\u0006\u0004\b\"\u0010#\u001a9\u0010$\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b$\u0010%\u001a5\u0010&\u001a\u00020\u001d2(\u0010\u001b\u001a$\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\fj\u0002`\u001aH\u0001ø\u0001\u0001\u001aS\u0010,\u001a\u00020\u0010*\u00020'2$\u0010\u001b\u001a \u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\f2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010)\u001a\u00020\u00102\u0006\u0010+\u001a\u00020*H\u0002ø\u0001\u0001\u001aS\u0010.\u001a\u00020\u0010*\u00020'2$\u0010\u001b\u001a \u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\f2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010-\u001a\u00020\u00102\u0006\u0010+\u001a\u00020*H\u0002ø\u0001\u0001\u001aS\u0010/\u001a\u00020\u0010*\u00020'2$\u0010\u001b\u001a \u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\f2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010)\u001a\u00020\u00102\u0006\u0010+\u001a\u00020*H\u0002ø\u0001\u0001\u001aS\u00100\u001a\u00020\u0010*\u00020'2$\u0010\u001b\u001a \u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\f2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010-\u001a\u00020\u00102\u0006\u0010+\u001a\u00020*H\u0002ø\u0001\u0001\u0082\u0002\u000b\n\u0005\b\u009920\u0001\n\u0002\b\u0019¨\u00061"}, d2 = {"Lkotlin/Function0;", "Lbn/r;", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/ui/UiComposable;", "content", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/layout/MeasurePolicy;", "measurePolicy", "Layout", "(Lsn/p;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/Function3;", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "Landroidx/compose/ui/layout/IntrinsicMeasureBlock;", "minIntrinsicWidthMeasureBlock", "minIntrinsicHeightMeasureBlock", "maxIntrinsicWidthMeasureBlock", "maxIntrinsicHeightMeasureBlock", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureBlock;", "measureBlock", "(Lsn/p;Lsn/q;Lsn/q;Lsn/q;Lsn/q;Landroidx/compose/ui/Modifier;Lsn/q;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/node/MeasureBlocks;", "measureBlocksOf", "Lkotlin/Function1;", "Landroidx/compose/runtime/SkippableUpdater;", "Landroidx/compose/ui/node/ComposeUiNode;", "materializerOf", "(Landroidx/compose/ui/Modifier;)Lsn/q;", "MultiMeasureLayout", "(Landroidx/compose/ui/Modifier;Lsn/p;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;II)V", "MeasuringIntrinsicsMeasureBlocks", "Landroidx/compose/ui/unit/Density;", "measurables", "h", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "MeasuringMinIntrinsicWidth", "w", "MeasuringMinIntrinsicHeight", "MeasuringMaxIntrinsicWidth", "MeasuringMaxIntrinsicHeight", "ui_release"}, k = 2, mv = {1, 6, 0})
public final class LayoutKt {
    @Composable
    @UiComposable
    public static final void Layout(@Nullable Modifier modifier, @NotNull MeasurePolicy measurePolicy, @Nullable Composer composer, int i10, int i11) {
        p.k(measurePolicy, "measurePolicy");
        composer.startReplaceableGroup(544976794);
        if ((i11 & 1) != 0) {
            modifier = Modifier.INSTANCE;
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
        Modifier modifierMaterialize = ComposedModifierKt.materialize(composer, modifier);
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        final a<ComposeUiNode> constructor = companion.getConstructor();
        composer.startReplaceableGroup(1405779621);
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(new a<ComposeUiNode>() { // from class: androidx.compose.ui.layout.LayoutKt$Layout$$inlined$ReusableComposeNode$1
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                @Override // sn.a
                @NotNull
                public final ComposeUiNode invoke() {
                    return constructor.invoke();
                }
            });
        } else {
            composer.useNode();
        }
        composer.disableReusing();
        Composer composerM1274constructorimpl = Updater.m1274constructorimpl(composer);
        Updater.m1281setimpl(composerM1274constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
        Updater.m1281setimpl(composerM1274constructorimpl, density, companion.getSetDensity());
        Updater.m1281setimpl(composerM1274constructorimpl, layoutDirection, companion.getSetLayoutDirection());
        Updater.m1281setimpl(composerM1274constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
        Updater.m1281setimpl(composerM1274constructorimpl, modifierMaterialize, companion.getSetModifier());
        composer.enableReusing();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    @Composable
    @UiComposable
    public static final void Layout(@NotNull sn.p<? super Composer, ? super Integer, r> pVar, @Nullable Modifier modifier, @NotNull MeasurePolicy measurePolicy, @Nullable Composer composer, int i10, int i11) {
        p.k(pVar, "content");
        p.k(measurePolicy, "measurePolicy");
        composer.startReplaceableGroup(-1323940314);
        if ((i11 & 2) != 0) {
            modifier = Modifier.INSTANCE;
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        a<ComposeUiNode> constructor = companion.getConstructor();
        q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r> qVarMaterializerOf = materializerOf(modifier);
        int i12 = ((i10 << 9) & 7168) | 6;
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        composer.disableReusing();
        Composer composerM1274constructorimpl = Updater.m1274constructorimpl(composer);
        Updater.m1281setimpl(composerM1274constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
        Updater.m1281setimpl(composerM1274constructorimpl, density, companion.getSetDensity());
        Updater.m1281setimpl(composerM1274constructorimpl, layoutDirection, companion.getSetLayoutDirection());
        Updater.m1281setimpl(composerM1274constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
        composer.enableReusing();
        qVarMaterializerOf.invoke(SkippableUpdater.m1264boximpl(SkippableUpdater.m1265constructorimpl(composer)), composer, Integer.valueOf((i12 >> 3) & 112));
        composer.startReplaceableGroup(2058660585);
        pVar.mo2invoke(composer, Integer.valueOf((i12 >> 9) & 14));
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.Composable
    @androidx.compose.ui.UiComposable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Layout(@org.jetbrains.annotations.NotNull final sn.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, bn.r> r16, @org.jetbrains.annotations.NotNull final sn.q<? super androidx.compose.ui.layout.IntrinsicMeasureScope, ? super java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable>, ? super java.lang.Integer, java.lang.Integer> r17, @org.jetbrains.annotations.NotNull final sn.q<? super androidx.compose.ui.layout.IntrinsicMeasureScope, ? super java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable>, ? super java.lang.Integer, java.lang.Integer> r18, @org.jetbrains.annotations.NotNull final sn.q<? super androidx.compose.ui.layout.IntrinsicMeasureScope, ? super java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable>, ? super java.lang.Integer, java.lang.Integer> r19, @org.jetbrains.annotations.NotNull final sn.q<? super androidx.compose.ui.layout.IntrinsicMeasureScope, ? super java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable>, ? super java.lang.Integer, java.lang.Integer> r20, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r21, @org.jetbrains.annotations.NotNull final sn.q<? super androidx.compose.ui.layout.MeasureScope, ? super java.util.List<? extends androidx.compose.ui.layout.Measurable>, ? super androidx.compose.ui.unit.Constraints, ? extends androidx.compose.ui.layout.MeasureResult> r22, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instruction units count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.layout.LayoutKt.Layout(sn.p, sn.q, sn.q, sn.q, sn.q, androidx.compose.ui.Modifier, sn.q, androidx.compose.runtime.Composer, int, int):void");
    }

    @NotNull
    public static final MeasureBlocks MeasuringIntrinsicsMeasureBlocks(@NotNull final q<? super MeasureScope, ? super List<? extends Measurable>, ? super Constraints, ? extends MeasureResult> qVar) {
        p.k(qVar, "measureBlock");
        return new MeasureBlocks() { // from class: androidx.compose.ui.layout.LayoutKt.MeasuringIntrinsicsMeasureBlocks.1
            @Override // androidx.compose.ui.node.MeasureBlocks
            public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int w10) {
                p.k(intrinsicMeasureScope, "intrinsicMeasureScope");
                p.k(measurables, "measurables");
                return LayoutKt.MeasuringMaxIntrinsicHeight(intrinsicMeasureScope, qVar, measurables, w10, intrinsicMeasureScope.getLayoutDirection());
            }

            @Override // androidx.compose.ui.node.MeasureBlocks
            public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int h10) {
                p.k(intrinsicMeasureScope, "intrinsicMeasureScope");
                p.k(measurables, "measurables");
                return LayoutKt.MeasuringMaxIntrinsicWidth(intrinsicMeasureScope, qVar, measurables, h10, intrinsicMeasureScope.getLayoutDirection());
            }

            @Override // androidx.compose.ui.node.MeasureBlocks
            @NotNull
            /* JADX INFO: renamed from: measure-3p2s80s, reason: not valid java name */
            public MeasureResult mo3119measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> measurables, long constraints) {
                p.k(measureScope, "measureScope");
                p.k(measurables, "measurables");
                return qVar.invoke(measureScope, measurables, Constraints.m3770boximpl(constraints));
            }

            @Override // androidx.compose.ui.node.MeasureBlocks
            public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int w10) {
                p.k(intrinsicMeasureScope, "intrinsicMeasureScope");
                p.k(measurables, "measurables");
                return LayoutKt.MeasuringMinIntrinsicHeight(intrinsicMeasureScope, qVar, measurables, w10, intrinsicMeasureScope.getLayoutDirection());
            }

            @Override // androidx.compose.ui.node.MeasureBlocks
            public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int h10) {
                p.k(intrinsicMeasureScope, "intrinsicMeasureScope");
                p.k(measurables, "measurables");
                return LayoutKt.MeasuringMinIntrinsicWidth(intrinsicMeasureScope, qVar, measurables, h10, intrinsicMeasureScope.getLayoutDirection());
            }

            @NotNull
            public String toString() {
                return JvmActuals_jvmKt.simpleIdentityToString(this, "MeasuringIntrinsicsMeasureBlocks") + "{ measureBlock=" + JvmActuals_jvmKt.simpleIdentityToString(qVar, null) + " }";
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int MeasuringMaxIntrinsicHeight(Density density, q<? super MeasureScope, ? super List<? extends Measurable>, ? super Constraints, ? extends MeasureResult> qVar, List<? extends IntrinsicMeasurable> list, int i10, LayoutDirection layoutDirection) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new DefaultIntrinsicMeasurable(list.get(i11), IntrinsicMinMax.Max, IntrinsicWidthHeight.Height));
        }
        return qVar.invoke(new IntrinsicsMeasureScope(density, layoutDirection), arrayList, Constraints.m3770boximpl(ConstraintsKt.Constraints$default(0, i10, 0, 0, 13, null))).getHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int MeasuringMaxIntrinsicWidth(Density density, q<? super MeasureScope, ? super List<? extends Measurable>, ? super Constraints, ? extends MeasureResult> qVar, List<? extends IntrinsicMeasurable> list, int i10, LayoutDirection layoutDirection) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new DefaultIntrinsicMeasurable(list.get(i11), IntrinsicMinMax.Max, IntrinsicWidthHeight.Width));
        }
        return qVar.invoke(new IntrinsicsMeasureScope(density, layoutDirection), arrayList, Constraints.m3770boximpl(ConstraintsKt.Constraints$default(0, 0, 0, i10, 7, null))).getWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int MeasuringMinIntrinsicHeight(Density density, q<? super MeasureScope, ? super List<? extends Measurable>, ? super Constraints, ? extends MeasureResult> qVar, List<? extends IntrinsicMeasurable> list, int i10, LayoutDirection layoutDirection) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new DefaultIntrinsicMeasurable(list.get(i11), IntrinsicMinMax.Min, IntrinsicWidthHeight.Height));
        }
        return qVar.invoke(new IntrinsicsMeasureScope(density, layoutDirection), arrayList, Constraints.m3770boximpl(ConstraintsKt.Constraints$default(0, i10, 0, 0, 13, null))).getHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int MeasuringMinIntrinsicWidth(Density density, q<? super MeasureScope, ? super List<? extends Measurable>, ? super Constraints, ? extends MeasureResult> qVar, List<? extends IntrinsicMeasurable> list, int i10, LayoutDirection layoutDirection) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new DefaultIntrinsicMeasurable(list.get(i11), IntrinsicMinMax.Min, IntrinsicWidthHeight.Width));
        }
        return qVar.invoke(new IntrinsicsMeasureScope(density, layoutDirection), arrayList, Constraints.m3770boximpl(ConstraintsKt.Constraints$default(0, 0, 0, i10, 7, null))).getWidth();
    }

    @Composable
    @UiComposable
    public static final void MultiMeasureLayout(@Nullable Modifier modifier, @NotNull final sn.p<? super Composer, ? super Integer, r> pVar, @NotNull final MeasurePolicy measurePolicy, @Nullable Composer composer, final int i10, final int i11) {
        int i12;
        p.k(pVar, "content");
        p.k(measurePolicy, "measurePolicy");
        Composer composerStartRestartGroup = composer.startRestartGroup(1949933075);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= composerStartRestartGroup.changed(pVar) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            i12 |= composerStartRestartGroup.changed(measurePolicy) ? 256 : 128;
        }
        if ((i12 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifierMaterialize = ComposedModifierKt.materialize(composerStartRestartGroup, modifier);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            a<LayoutNode> constructor$ui_release = LayoutNode.INSTANCE.getConstructor$ui_release();
            int i14 = ((i12 << 3) & 896) | 6;
            composerStartRestartGroup.startReplaceableGroup(-692256719);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor$ui_release);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM1274constructorimpl = Updater.m1274constructorimpl(composerStartRestartGroup);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Updater.m1281setimpl(composerM1274constructorimpl, modifierMaterialize, companion.getSetModifier());
            Updater.m1281setimpl(composerM1274constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
            Updater.m1281setimpl(composerM1274constructorimpl, density, companion.getSetDensity());
            Updater.m1281setimpl(composerM1274constructorimpl, layoutDirection, companion.getSetLayoutDirection());
            Updater.m1281setimpl(composerM1274constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
            Updater.m1278initimpl(composerM1274constructorimpl, new l<LayoutNode, r>() { // from class: androidx.compose.ui.layout.LayoutKt$MultiMeasureLayout$1$1
                @Override // sn.l
                public /* bridge */ /* synthetic */ r invoke(LayoutNode layoutNode) {
                    invoke2(layoutNode);
                    return r.f5635a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull LayoutNode layoutNode) {
                    p.k(layoutNode, "$this$init");
                    layoutNode.setCanMultiMeasure$ui_release(true);
                }
            });
            composerStartRestartGroup.enableReusing();
            pVar.mo2invoke(composerStartRestartGroup, Integer.valueOf((i14 >> 6) & 14));
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new sn.p<Composer, Integer, r>() { // from class: androidx.compose.ui.layout.LayoutKt.MultiMeasureLayout.2
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

            public final void invoke(@Nullable Composer composer2, int i15) {
                LayoutKt.MultiMeasureLayout(modifier2, pVar, measurePolicy, composer2, i10 | 1, i11);
            }
        });
    }

    @NotNull
    public static final q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r> materializerOf(@NotNull final Modifier modifier) {
        p.k(modifier, "modifier");
        return ComposableLambdaKt.composableLambdaInstance(-1586257396, true, new q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r>() { // from class: androidx.compose.ui.layout.LayoutKt.materializerOf.1
            {
                super(3);
            }

            @Override // sn.q
            public /* bridge */ /* synthetic */ r invoke(SkippableUpdater<ComposeUiNode> skippableUpdater, Composer composer, Integer num) {
                m3120invokeDeg8D_g(skippableUpdater.getComposer(), composer, num.intValue());
                return r.f5635a;
            }

            @Composable
            /* JADX INFO: renamed from: invoke-Deg8D_g, reason: not valid java name */
            public final void m3120invokeDeg8D_g(@NotNull Composer composer, @Nullable Composer composer2, int i10) {
                p.k(composer, "$this$null");
                Modifier modifierMaterialize = ComposedModifierKt.materialize(composer2, modifier);
                composer.startReplaceableGroup(509942095);
                Updater.m1281setimpl(Updater.m1274constructorimpl(composer), modifierMaterialize, ComposeUiNode.INSTANCE.getSetModifier());
                composer.endReplaceableGroup();
            }
        });
    }

    @NotNull
    public static final MeasureBlocks measureBlocksOf(@NotNull final q<? super IntrinsicMeasureScope, ? super List<? extends IntrinsicMeasurable>, ? super Integer, Integer> qVar, @NotNull final q<? super IntrinsicMeasureScope, ? super List<? extends IntrinsicMeasurable>, ? super Integer, Integer> qVar2, @NotNull final q<? super IntrinsicMeasureScope, ? super List<? extends IntrinsicMeasurable>, ? super Integer, Integer> qVar3, @NotNull final q<? super IntrinsicMeasureScope, ? super List<? extends IntrinsicMeasurable>, ? super Integer, Integer> qVar4, @NotNull final q<? super MeasureScope, ? super List<? extends Measurable>, ? super Constraints, ? extends MeasureResult> qVar5) {
        p.k(qVar, "minIntrinsicWidthMeasureBlock");
        p.k(qVar2, "minIntrinsicHeightMeasureBlock");
        p.k(qVar3, "maxIntrinsicWidthMeasureBlock");
        p.k(qVar4, "maxIntrinsicHeightMeasureBlock");
        p.k(qVar5, "measureBlock");
        return new MeasureBlocks() { // from class: androidx.compose.ui.layout.LayoutKt.measureBlocksOf.1
            @Override // androidx.compose.ui.node.MeasureBlocks
            public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int w10) {
                p.k(intrinsicMeasureScope, "intrinsicMeasureScope");
                p.k(measurables, "measurables");
                return qVar4.invoke(intrinsicMeasureScope, measurables, Integer.valueOf(w10)).intValue();
            }

            @Override // androidx.compose.ui.node.MeasureBlocks
            public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int h10) {
                p.k(intrinsicMeasureScope, "intrinsicMeasureScope");
                p.k(measurables, "measurables");
                return qVar3.invoke(intrinsicMeasureScope, measurables, Integer.valueOf(h10)).intValue();
            }

            @Override // androidx.compose.ui.node.MeasureBlocks
            @NotNull
            /* JADX INFO: renamed from: measure-3p2s80s */
            public MeasureResult mo3119measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> measurables, long constraints) {
                p.k(measureScope, "measureScope");
                p.k(measurables, "measurables");
                return qVar5.invoke(measureScope, measurables, Constraints.m3770boximpl(constraints));
            }

            @Override // androidx.compose.ui.node.MeasureBlocks
            public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int w10) {
                p.k(intrinsicMeasureScope, "intrinsicMeasureScope");
                p.k(measurables, "measurables");
                return qVar2.invoke(intrinsicMeasureScope, measurables, Integer.valueOf(w10)).intValue();
            }

            @Override // androidx.compose.ui.node.MeasureBlocks
            public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int h10) {
                p.k(intrinsicMeasureScope, "intrinsicMeasureScope");
                p.k(measurables, "measurables");
                return qVar.invoke(intrinsicMeasureScope, measurables, Integer.valueOf(h10)).intValue();
            }
        };
    }
}
