package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.UiComposable;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import bn.r;
import cn.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.a;
import sn.l;
import sn.p;
import sn.q;

/* JADX INFO: compiled from: Scaffold.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a#\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u009d\u0002\u0010'\u001a\u00020\u000b2\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00042\u0013\b\u0002\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\f2\u0013\b\u0002\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\f2\u0019\b\u0002\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\u000f¢\u0006\u0002\b\f2\u0013\b\u0002\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\f2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u001b\b\u0002\u0010\u0017\u001a\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000f¢\u0006\u0002\b\f2\b\b\u0002\u0010\u0018\u001a\u00020\u00142\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001d2\b\b\u0002\u0010!\u001a\u00020\u001d2\b\b\u0002\u0010\"\u001a\u00020\u001d2\u0017\u0010$\u001a\u0013\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u000b0\u000f¢\u0006\u0002\b\fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010&\u001a£\u0001\u0010/\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\u00142\u0006\u0010)\u001a\u00020\u00122\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\f¢\u0006\u0002\b*2\u001c\u0010$\u001a\u0018\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u000b0\u000f¢\u0006\u0002\b\f¢\u0006\u0002\b*2\u0016\u0010+\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\f¢\u0006\u0002\b*2\u0016\u0010,\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\f¢\u0006\u0002\b*2\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\f¢\u0006\u0002\b*H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010.\"\"\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u000101008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0017\u00106\u001a\u00020\u001b8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b6\u00107\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00068"}, d2 = {"Landroidx/compose/material/DrawerState;", "drawerState", "Landroidx/compose/material/SnackbarHostState;", "snackbarHostState", "Landroidx/compose/material/ScaffoldState;", "rememberScaffoldState", "(Landroidx/compose/material/DrawerState;Landroidx/compose/material/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/ScaffoldState;", "Landroidx/compose/ui/Modifier;", "modifier", "scaffoldState", "Lkotlin/Function0;", "Lbn/r;", "Landroidx/compose/runtime/Composable;", "topBar", "bottomBar", "Lkotlin/Function1;", "snackbarHost", "floatingActionButton", "Landroidx/compose/material/FabPosition;", "floatingActionButtonPosition", "", "isFloatingActionButtonDocked", "Landroidx/compose/foundation/layout/ColumnScope;", "drawerContent", "drawerGesturesEnabled", "Landroidx/compose/ui/graphics/Shape;", "drawerShape", "Landroidx/compose/ui/unit/Dp;", "drawerElevation", "Landroidx/compose/ui/graphics/Color;", "drawerBackgroundColor", "drawerContentColor", "drawerScrimColor", "backgroundColor", "contentColor", "Landroidx/compose/foundation/layout/PaddingValues;", "content", "Scaffold-27mzLpw", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material/ScaffoldState;Lsn/p;Lsn/p;Lsn/q;Lsn/p;IZLsn/q;ZLandroidx/compose/ui/graphics/Shape;FJJJJJLsn/q;Landroidx/compose/runtime/Composer;III)V", "Scaffold", "isFabDocked", "fabPosition", "Landroidx/compose/ui/UiComposable;", "snackbar", "fab", "ScaffoldLayout-MDYNRJg", "(ZILsn/p;Lsn/q;Lsn/p;Lsn/p;Lsn/p;Landroidx/compose/runtime/Composer;I)V", "ScaffoldLayout", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material/FabPlacement;", "LocalFabPlacement", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalFabPlacement", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "FabSpacing", "F", "material_release"}, k = 2, mv = {1, 6, 0})
public final class ScaffoldKt {

    @NotNull
    private static final ProvidableCompositionLocal<FabPlacement> LocalFabPlacement = CompositionLocalKt.staticCompositionLocalOf(new a<FabPlacement>() { // from class: androidx.compose.material.ScaffoldKt$LocalFabPlacement$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // sn.a
        @Nullable
        public final FabPlacement invoke() {
            return null;
        }
    });
    private static final float FabSpacing = Dp.m3826constructorimpl(16);

    /* JADX WARN: Removed duplicated region for block: B:108:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:294:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x013f  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: Scaffold-27mzLpw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1134Scaffold27mzLpw(@org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r40, @org.jetbrains.annotations.Nullable androidx.compose.material.ScaffoldState r41, @org.jetbrains.annotations.Nullable sn.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, bn.r> r42, @org.jetbrains.annotations.Nullable sn.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, bn.r> r43, @org.jetbrains.annotations.Nullable sn.q<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, bn.r> r44, @org.jetbrains.annotations.Nullable sn.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, bn.r> r45, int r46, boolean r47, @org.jetbrains.annotations.Nullable sn.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, bn.r> r48, boolean r49, @org.jetbrains.annotations.Nullable androidx.compose.ui.graphics.Shape r50, float r51, long r52, long r54, long r56, long r58, long r60, @org.jetbrains.annotations.NotNull final sn.q<? super androidx.compose.foundation.layout.PaddingValues, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, bn.r> r62, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r63, final int r64, final int r65, final int r66) {
        /*
            Method dump skipped, instruction units count: 1255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ScaffoldKt.m1134Scaffold27mzLpw(androidx.compose.ui.Modifier, androidx.compose.material.ScaffoldState, sn.p, sn.p, sn.q, sn.p, int, boolean, sn.q, boolean, androidx.compose.ui.graphics.Shape, float, long, long, long, long, long, sn.q, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @UiComposable
    /* JADX INFO: renamed from: ScaffoldLayout-MDYNRJg, reason: not valid java name */
    public static final void m1135ScaffoldLayoutMDYNRJg(final boolean z10, final int i10, final p<? super Composer, ? super Integer, r> pVar, final q<? super PaddingValues, ? super Composer, ? super Integer, r> qVar, final p<? super Composer, ? super Integer, r> pVar2, final p<? super Composer, ? super Integer, r> pVar3, final p<? super Composer, ? super Integer, r> pVar4, Composer composer, final int i11) {
        int i12;
        int i13;
        Modifier modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1401632215);
        int i14 = (i11 & 14) == 0 ? (composerStartRestartGroup.changed(z10) ? 4 : 2) | i11 : i11;
        if ((i11 & 112) == 0) {
            i14 |= composerStartRestartGroup.changed(i10) ? 32 : 16;
        }
        if ((i11 & 896) == 0) {
            i14 |= composerStartRestartGroup.changed(pVar) ? 256 : 128;
        }
        if ((i11 & 7168) == 0) {
            i14 |= composerStartRestartGroup.changed(qVar) ? 2048 : 1024;
        }
        if ((57344 & i11) == 0) {
            i14 |= composerStartRestartGroup.changed(pVar2) ? 16384 : 8192;
        }
        if ((458752 & i11) == 0) {
            i14 |= composerStartRestartGroup.changed(pVar3) ? 131072 : 65536;
        }
        if ((3670016 & i11) == 0) {
            i14 |= composerStartRestartGroup.changed(pVar4) ? 1048576 : 524288;
        }
        final int i15 = i14;
        if ((i15 & 2995931) == 599186 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            Object[] objArr = {pVar, pVar2, pVar3, FabPosition.m1047boximpl(i10), Boolean.valueOf(z10), pVar4, qVar};
            composerStartRestartGroup.startReplaceableGroup(-568225417);
            int i16 = 0;
            boolean zChanged = false;
            for (int i17 = 7; i16 < i17; i17 = 7) {
                zChanged |= composerStartRestartGroup.changed(objArr[i16]);
                i16++;
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                i12 = 1;
                i13 = 0;
                modifier = null;
                p<SubcomposeMeasureScope, Constraints, MeasureResult> pVar5 = new p<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // sn.p
                    /* JADX INFO: renamed from: invoke */
                    public /* bridge */ /* synthetic */ MeasureResult mo2invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                        return m1137invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                    }

                    @NotNull
                    /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                    public final MeasureResult m1137invoke0kLqBqw(@NotNull final SubcomposeMeasureScope subcomposeMeasureScope, long j10) {
                        tn.p.k(subcomposeMeasureScope, "$this$SubcomposeLayout");
                        final int iM3782getMaxWidthimpl = Constraints.m3782getMaxWidthimpl(j10);
                        final int iM3781getMaxHeightimpl = Constraints.m3781getMaxHeightimpl(j10);
                        final long jM3773copyZbe2FdA$default = Constraints.m3773copyZbe2FdA$default(j10, 0, 0, 0, 0, 10, null);
                        final p<Composer, Integer, r> pVar6 = pVar;
                        final p<Composer, Integer, r> pVar7 = pVar2;
                        final p<Composer, Integer, r> pVar8 = pVar3;
                        final int i18 = i10;
                        final boolean z11 = z10;
                        final p<Composer, Integer, r> pVar9 = pVar4;
                        final int i19 = i15;
                        final q<PaddingValues, Composer, Integer, r> qVar2 = qVar;
                        return MeasureScope.layout$default(subcomposeMeasureScope, iM3782getMaxWidthimpl, iM3781getMaxHeightimpl, null, new l<Placeable.PlacementScope, r>() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
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
                                Object obj;
                                Object obj2;
                                final FabPlacement fabPlacement;
                                Object obj3;
                                Integer numValueOf;
                                int height;
                                int iMo300roundToPx0680j_4;
                                int height2;
                                Object obj4;
                                Object obj5;
                                tn.p.k(placementScope, "$this$layout");
                                List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(ScaffoldLayoutContent.TopBar, pVar6);
                                long j11 = jM3773copyZbe2FdA$default;
                                ArrayList arrayList = new ArrayList(listSubcompose.size());
                                int size = listSubcompose.size();
                                for (int i20 = 0; i20 < size; i20++) {
                                    arrayList.add(listSubcompose.get(i20).mo3112measureBRTryo0(j11));
                                }
                                if (arrayList.isEmpty()) {
                                    obj = null;
                                } else {
                                    obj = arrayList.get(0);
                                    int height3 = ((Placeable) obj).getHeight();
                                    int iO = w.o(arrayList);
                                    if (1 <= iO) {
                                        int i21 = 1;
                                        while (true) {
                                            Object obj6 = arrayList.get(i21);
                                            int height4 = ((Placeable) obj6).getHeight();
                                            if (height3 < height4) {
                                                obj = obj6;
                                                height3 = height4;
                                            }
                                            if (i21 == iO) {
                                                break;
                                            } else {
                                                i21++;
                                            }
                                        }
                                    }
                                }
                                Placeable placeable = (Placeable) obj;
                                int height5 = placeable != null ? placeable.getHeight() : 0;
                                List<Measurable> listSubcompose2 = subcomposeMeasureScope.subcompose(ScaffoldLayoutContent.Snackbar, pVar7);
                                long j12 = jM3773copyZbe2FdA$default;
                                ArrayList arrayList2 = new ArrayList(listSubcompose2.size());
                                int size2 = listSubcompose2.size();
                                for (int i22 = 0; i22 < size2; i22++) {
                                    arrayList2.add(listSubcompose2.get(i22).mo3112measureBRTryo0(j12));
                                }
                                if (arrayList2.isEmpty()) {
                                    obj2 = null;
                                } else {
                                    obj2 = arrayList2.get(0);
                                    int height6 = ((Placeable) obj2).getHeight();
                                    int iO2 = w.o(arrayList2);
                                    if (1 <= iO2) {
                                        int i23 = 1;
                                        while (true) {
                                            Object obj7 = arrayList2.get(i23);
                                            int height7 = ((Placeable) obj7).getHeight();
                                            if (height6 < height7) {
                                                obj2 = obj7;
                                                height6 = height7;
                                            }
                                            if (i23 == iO2) {
                                                break;
                                            } else {
                                                i23++;
                                            }
                                        }
                                    }
                                }
                                Placeable placeable2 = (Placeable) obj2;
                                int height8 = placeable2 != null ? placeable2.getHeight() : 0;
                                List<Measurable> listSubcompose3 = subcomposeMeasureScope.subcompose(ScaffoldLayoutContent.Fab, pVar8);
                                long j13 = jM3773copyZbe2FdA$default;
                                ArrayList arrayList3 = new ArrayList();
                                Iterator<T> it = listSubcompose3.iterator();
                                while (it.hasNext()) {
                                    Placeable placeableMo3112measureBRTryo0 = ((Measurable) it.next()).mo3112measureBRTryo0(j13);
                                    if (!((placeableMo3112measureBRTryo0.getHeight() == 0 || placeableMo3112measureBRTryo0.getWidth() == 0) ? false : true)) {
                                        placeableMo3112measureBRTryo0 = null;
                                    }
                                    if (placeableMo3112measureBRTryo0 != null) {
                                        arrayList3.add(placeableMo3112measureBRTryo0);
                                    }
                                }
                                if (!arrayList3.isEmpty()) {
                                    if (arrayList3.isEmpty()) {
                                        obj4 = null;
                                    } else {
                                        obj4 = arrayList3.get(0);
                                        int width = ((Placeable) obj4).getWidth();
                                        int iO3 = w.o(arrayList3);
                                        if (1 <= iO3) {
                                            int i24 = 1;
                                            while (true) {
                                                Object obj8 = arrayList3.get(i24);
                                                int width2 = ((Placeable) obj8).getWidth();
                                                if (width < width2) {
                                                    obj4 = obj8;
                                                    width = width2;
                                                }
                                                if (i24 == iO3) {
                                                    break;
                                                } else {
                                                    i24++;
                                                }
                                            }
                                        }
                                    }
                                    tn.p.h(obj4);
                                    int width3 = ((Placeable) obj4).getWidth();
                                    if (arrayList3.isEmpty()) {
                                        obj5 = null;
                                    } else {
                                        obj5 = arrayList3.get(0);
                                        int height9 = ((Placeable) obj5).getHeight();
                                        int iO4 = w.o(arrayList3);
                                        if (1 <= iO4) {
                                            int i25 = 1;
                                            while (true) {
                                                Object obj9 = arrayList3.get(i25);
                                                int height10 = ((Placeable) obj9).getHeight();
                                                if (height9 < height10) {
                                                    height9 = height10;
                                                    obj5 = obj9;
                                                }
                                                if (i25 == iO4) {
                                                    break;
                                                } else {
                                                    i25++;
                                                }
                                            }
                                        }
                                    }
                                    tn.p.h(obj5);
                                    fabPlacement = new FabPlacement(z11, FabPosition.m1050equalsimpl0(i18, FabPosition.INSTANCE.m1055getEnd5ygKITE()) ? subcomposeMeasureScope.getLayoutDirection() == LayoutDirection.Ltr ? (iM3782getMaxWidthimpl - subcomposeMeasureScope.mo300roundToPx0680j_4(ScaffoldKt.FabSpacing)) - width3 : subcomposeMeasureScope.mo300roundToPx0680j_4(ScaffoldKt.FabSpacing) : (iM3782getMaxWidthimpl - width3) / 2, width3, ((Placeable) obj5).getHeight());
                                } else {
                                    fabPlacement = null;
                                }
                                SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                ScaffoldLayoutContent scaffoldLayoutContent = ScaffoldLayoutContent.BottomBar;
                                final p<Composer, Integer, r> pVar10 = pVar9;
                                final int i26 = i19;
                                List<Measurable> listSubcompose4 = subcomposeMeasureScope2.subcompose(scaffoldLayoutContent, ComposableLambdaKt.composableLambdaInstance(1529070963, true, new p<Composer, Integer, r>() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1$1$bottomBarPlaceables$1
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

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@Nullable Composer composer2, int i27) {
                                        if ((i27 & 11) == 2 && composer2.getSkipping()) {
                                            composer2.skipToGroupEnd();
                                        } else {
                                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ScaffoldKt.getLocalFabPlacement().provides(fabPlacement)}, pVar10, composer2, ((i26 >> 15) & 112) | 8);
                                        }
                                    }
                                }));
                                long j14 = jM3773copyZbe2FdA$default;
                                ArrayList arrayList4 = new ArrayList(listSubcompose4.size());
                                int size3 = listSubcompose4.size();
                                for (int i27 = 0; i27 < size3; i27++) {
                                    arrayList4.add(listSubcompose4.get(i27).mo3112measureBRTryo0(j14));
                                }
                                if (arrayList4.isEmpty()) {
                                    obj3 = null;
                                } else {
                                    obj3 = arrayList4.get(0);
                                    int height11 = ((Placeable) obj3).getHeight();
                                    int iO5 = w.o(arrayList4);
                                    if (1 <= iO5) {
                                        int i28 = 1;
                                        while (true) {
                                            Object obj10 = arrayList4.get(i28);
                                            int height12 = ((Placeable) obj10).getHeight();
                                            if (height11 < height12) {
                                                obj3 = obj10;
                                                height11 = height12;
                                            }
                                            if (i28 == iO5) {
                                                break;
                                            } else {
                                                i28++;
                                            }
                                        }
                                    }
                                }
                                Placeable placeable3 = (Placeable) obj3;
                                final int height13 = placeable3 != null ? placeable3.getHeight() : 0;
                                if (fabPlacement != null) {
                                    SubcomposeMeasureScope subcomposeMeasureScope3 = subcomposeMeasureScope;
                                    boolean z12 = z11;
                                    if (height13 == 0) {
                                        height = fabPlacement.getHeight();
                                        iMo300roundToPx0680j_4 = subcomposeMeasureScope3.mo300roundToPx0680j_4(ScaffoldKt.FabSpacing);
                                    } else if (z12) {
                                        height2 = height13 + (fabPlacement.getHeight() / 2);
                                        numValueOf = Integer.valueOf(height2);
                                    } else {
                                        height = fabPlacement.getHeight() + height13;
                                        iMo300roundToPx0680j_4 = subcomposeMeasureScope3.mo300roundToPx0680j_4(ScaffoldKt.FabSpacing);
                                    }
                                    height2 = height + iMo300roundToPx0680j_4;
                                    numValueOf = Integer.valueOf(height2);
                                } else {
                                    numValueOf = null;
                                }
                                int iIntValue = height8 != 0 ? height8 + (numValueOf != null ? numValueOf.intValue() : height13) : 0;
                                int i29 = iM3781getMaxHeightimpl - height5;
                                final SubcomposeMeasureScope subcomposeMeasureScope4 = subcomposeMeasureScope;
                                ScaffoldLayoutContent scaffoldLayoutContent2 = ScaffoldLayoutContent.MainContent;
                                final q<PaddingValues, Composer, Integer, r> qVar3 = qVar2;
                                final int i30 = i19;
                                List<Measurable> listSubcompose5 = subcomposeMeasureScope4.subcompose(scaffoldLayoutContent2, ComposableLambdaKt.composableLambdaInstance(-1132241596, true, new p<Composer, Integer, r>() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1$1$bodyContentPlaceables$1
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

                                    @Composable
                                    public final void invoke(@Nullable Composer composer2, int i31) {
                                        if ((i31 & 11) == 2 && composer2.getSkipping()) {
                                            composer2.skipToGroupEnd();
                                        } else {
                                            qVar3.invoke(PaddingKt.m408PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, subcomposeMeasureScope4.mo303toDpu2uoSUM(height13), 7, null), composer2, Integer.valueOf((i30 >> 6) & 112));
                                        }
                                    }
                                }));
                                long j15 = jM3773copyZbe2FdA$default;
                                ArrayList arrayList5 = new ArrayList(listSubcompose5.size());
                                int size4 = listSubcompose5.size();
                                int i31 = 0;
                                while (i31 < size4) {
                                    arrayList5.add(listSubcompose5.get(i31).mo3112measureBRTryo0(Constraints.m3773copyZbe2FdA$default(j15, 0, 0, 0, i29, 7, null)));
                                    i31++;
                                    listSubcompose5 = listSubcompose5;
                                    j15 = j15;
                                }
                                int size5 = arrayList5.size();
                                int i32 = 0;
                                while (i32 < size5) {
                                    Placeable.PlacementScope.place$default(placementScope, (Placeable) arrayList5.get(i32), 0, height5, 0.0f, 4, null);
                                    i32++;
                                    size5 = size5;
                                    height13 = height13;
                                }
                                int i33 = height13;
                                int size6 = arrayList.size();
                                for (int i34 = 0; i34 < size6; i34++) {
                                    Placeable.PlacementScope.place$default(placementScope, (Placeable) arrayList.get(i34), 0, 0, 0.0f, 4, null);
                                }
                                int i35 = iM3781getMaxHeightimpl;
                                int size7 = arrayList2.size();
                                for (int i36 = 0; i36 < size7; i36++) {
                                    Placeable.PlacementScope.place$default(placementScope, (Placeable) arrayList2.get(i36), 0, i35 - iIntValue, 0.0f, 4, null);
                                }
                                int i37 = iM3781getMaxHeightimpl;
                                int size8 = arrayList4.size();
                                for (int i38 = 0; i38 < size8; i38++) {
                                    Placeable.PlacementScope.place$default(placementScope, (Placeable) arrayList4.get(i38), 0, i37 - i33, 0.0f, 4, null);
                                }
                                if (fabPlacement != null) {
                                    int i39 = iM3781getMaxHeightimpl;
                                    int size9 = arrayList3.size();
                                    for (int i40 = 0; i40 < size9; i40++) {
                                        Placeable placeable4 = (Placeable) arrayList3.get(i40);
                                        int left = fabPlacement.getLeft();
                                        tn.p.h(numValueOf);
                                        Placeable.PlacementScope.place$default(placementScope, placeable4, left, i39 - numValueOf.intValue(), 0.0f, 4, null);
                                    }
                                    r rVar = r.f5635a;
                                }
                            }
                        }, 4, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(pVar5);
                objRememberedValue = pVar5;
            } else {
                i12 = 1;
                i13 = 0;
                modifier = null;
            }
            composerStartRestartGroup.endReplaceableGroup();
            SubcomposeLayoutKt.SubcomposeLayout(modifier, (p) objRememberedValue, composerStartRestartGroup, i13, i12);
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, r>() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayout$2
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

            public final void invoke(@Nullable Composer composer2, int i18) {
                ScaffoldKt.m1135ScaffoldLayoutMDYNRJg(z10, i10, pVar, qVar, pVar2, pVar3, pVar4, composer2, i11 | 1);
            }
        });
    }

    @NotNull
    public static final ProvidableCompositionLocal<FabPlacement> getLocalFabPlacement() {
        return LocalFabPlacement;
    }

    @Composable
    @NotNull
    public static final ScaffoldState rememberScaffoldState(@Nullable DrawerState drawerState, @Nullable SnackbarHostState snackbarHostState, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(1569641925);
        if ((i11 & 1) != 0) {
            drawerState = DrawerKt.rememberDrawerState(DrawerValue.Closed, null, composer, 6, 2);
        }
        if ((i11 & 2) != 0) {
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new SnackbarHostState();
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            snackbarHostState = (SnackbarHostState) objRememberedValue;
        }
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new ScaffoldState(drawerState, snackbarHostState);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        ScaffoldState scaffoldState = (ScaffoldState) objRememberedValue2;
        composer.endReplaceableGroup();
        return scaffoldState;
    }
}
