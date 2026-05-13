package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import bn.r;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.a;
import sn.l;
import sn.p;
import sn.q;
import vn.c;

/* JADX INFO: compiled from: BottomSheetScaffold.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a=\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0004\b\t\u0010\n\u001a-\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a×\u0002\u00106\u001a\u00020\u00142\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0005¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00102\u0015\b\u0002\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u001a¢\u0006\u0002\b\u00152\u0019\b\u0002\u0010\u001c\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00140\u0005¢\u0006\u0002\b\u00152\u0015\b\u0002\u0010\u001d\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u001a¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010 \u001a\u00020\u00062\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010$\u001a\u00020#2\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010'\u001a\u00020%2\b\b\u0002\u0010(\u001a\u00020#2\u001b\b\u0002\u0010)\u001a\u0015\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0005¢\u0006\u0002\b\u00152\b\b\u0002\u0010*\u001a\u00020\u00062\b\b\u0002\u0010+\u001a\u00020!2\b\b\u0002\u0010,\u001a\u00020#2\b\b\u0002\u0010-\u001a\u00020%2\b\b\u0002\u0010.\u001a\u00020%2\b\b\u0002\u0010/\u001a\u00020%2\b\b\u0002\u00100\u001a\u00020%2\b\b\u0002\u00101\u001a\u00020%2\u0017\u00103\u001a\u0013\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u00140\u0005¢\u0006\u0002\b\u0015H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b4\u00105\u001aª\u0001\u0010?\u001a\u00020\u00142\u0013\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u001a¢\u0006\u0002\b\u00152\u0017\u00107\u001a\u0013\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u00140\u0005¢\u0006\u0002\b\u00152\u0017\u00109\u001a\u0013\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u00140\u0005¢\u0006\u0002\b\u00152\u0013\u0010\u001d\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u001a¢\u0006\u0002\b\u00152\u0011\u0010\u001c\u001a\r\u0012\u0004\u0012\u00020\u00140\u001a¢\u0006\u0002\b\u00152\u0006\u0010(\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020\u001e2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00030:2\u0006\u0010<\u001a\u00020\bH\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b=\u0010>\"\u0017\u0010@\u001a\u00020#8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b@\u0010A\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006B"}, d2 = {"Landroidx/compose/material/BottomSheetValue;", "initialValue", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "Lkotlin/Function1;", "", "confirmStateChange", "Landroidx/compose/material/BottomSheetState;", "rememberBottomSheetState", "(Landroidx/compose/material/BottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;Lsn/l;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/BottomSheetState;", "Landroidx/compose/material/DrawerState;", "drawerState", "bottomSheetState", "Landroidx/compose/material/SnackbarHostState;", "snackbarHostState", "Landroidx/compose/material/BottomSheetScaffoldState;", "rememberBottomSheetScaffoldState", "(Landroidx/compose/material/DrawerState;Landroidx/compose/material/BottomSheetState;Landroidx/compose/material/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/BottomSheetScaffoldState;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lbn/r;", "Landroidx/compose/runtime/Composable;", "sheetContent", "Landroidx/compose/ui/Modifier;", "modifier", "scaffoldState", "Lkotlin/Function0;", "topBar", "snackbarHost", "floatingActionButton", "Landroidx/compose/material/FabPosition;", "floatingActionButtonPosition", "sheetGesturesEnabled", "Landroidx/compose/ui/graphics/Shape;", "sheetShape", "Landroidx/compose/ui/unit/Dp;", "sheetElevation", "Landroidx/compose/ui/graphics/Color;", "sheetBackgroundColor", "sheetContentColor", "sheetPeekHeight", "drawerContent", "drawerGesturesEnabled", "drawerShape", "drawerElevation", "drawerBackgroundColor", "drawerContentColor", "drawerScrimColor", "backgroundColor", "contentColor", "Landroidx/compose/foundation/layout/PaddingValues;", "content", "BottomSheetScaffold-bGncdBI", "(Lsn/q;Landroidx/compose/ui/Modifier;Landroidx/compose/material/BottomSheetScaffoldState;Lsn/p;Lsn/q;Lsn/p;IZLandroidx/compose/ui/graphics/Shape;FJJFLsn/q;ZLandroidx/compose/ui/graphics/Shape;FJJJJJLsn/q;Landroidx/compose/runtime/Composer;IIII)V", "BottomSheetScaffold", "body", "", "bottomSheet", "Landroidx/compose/runtime/State;", "sheetOffset", "sheetState", "BottomSheetScaffoldLayout-KCBPh4w", "(Lsn/p;Lsn/q;Lsn/q;Lsn/p;Lsn/p;FILandroidx/compose/runtime/State;Landroidx/compose/material/BottomSheetState;Landroidx/compose/runtime/Composer;I)V", "BottomSheetScaffoldLayout", "FabSpacing", "F", "material_release"}, k = 2, mv = {1, 6, 0})
public final class BottomSheetScaffoldKt {
    private static final float FabSpacing = Dp.m3826constructorimpl(16);

    /* JADX WARN: Removed duplicated region for block: B:100:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x05bd  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:377:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x013a  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][_]]")
    /* JADX INFO: renamed from: BottomSheetScaffold-bGncdBI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m908BottomSheetScaffoldbGncdBI(@org.jetbrains.annotations.NotNull final sn.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, bn.r> r43, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r44, @org.jetbrains.annotations.Nullable androidx.compose.material.BottomSheetScaffoldState r45, @org.jetbrains.annotations.Nullable sn.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, bn.r> r46, @org.jetbrains.annotations.Nullable sn.q<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, bn.r> r47, @org.jetbrains.annotations.Nullable sn.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, bn.r> r48, int r49, boolean r50, @org.jetbrains.annotations.Nullable androidx.compose.ui.graphics.Shape r51, float r52, long r53, long r55, float r57, @org.jetbrains.annotations.Nullable sn.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, bn.r> r58, boolean r59, @org.jetbrains.annotations.Nullable androidx.compose.ui.graphics.Shape r60, float r61, long r62, long r64, long r66, long r68, long r70, @org.jetbrains.annotations.NotNull final sn.q<? super androidx.compose.foundation.layout.PaddingValues, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, bn.r> r72, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r73, final int r74, final int r75, final int r76, final int r77) {
        /*
            Method dump skipped, instruction units count: 1698
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BottomSheetScaffoldKt.m908BottomSheetScaffoldbGncdBI(sn.q, androidx.compose.ui.Modifier, androidx.compose.material.BottomSheetScaffoldState, sn.p, sn.q, sn.p, int, boolean, androidx.compose.ui.graphics.Shape, float, long, long, float, sn.q, boolean, androidx.compose.ui.graphics.Shape, float, long, long, long, long, long, sn.q, androidx.compose.runtime.Composer, int, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][_][_][androidx.compose.ui.UiComposable][_]]")
    /* JADX INFO: renamed from: BottomSheetScaffoldLayout-KCBPh4w, reason: not valid java name */
    public static final void m909BottomSheetScaffoldLayoutKCBPh4w(final p<? super Composer, ? super Integer, r> pVar, final q<? super PaddingValues, ? super Composer, ? super Integer, r> qVar, final q<? super Integer, ? super Composer, ? super Integer, r> qVar2, final p<? super Composer, ? super Integer, r> pVar2, final p<? super Composer, ? super Integer, r> pVar3, final float f10, final int i10, final State<Float> state, final BottomSheetState bottomSheetState, Composer composer, final int i11) {
        Modifier modifier;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(499725572);
        int i12 = (i11 & 14) == 0 ? (composerStartRestartGroup.changed(pVar) ? 4 : 2) | i11 : i11;
        if ((i11 & 112) == 0) {
            i12 |= composerStartRestartGroup.changed(qVar) ? 32 : 16;
        }
        if ((i11 & 896) == 0) {
            i12 |= composerStartRestartGroup.changed(qVar2) ? 256 : 128;
        }
        if ((i11 & 7168) == 0) {
            i12 |= composerStartRestartGroup.changed(pVar2) ? 2048 : 1024;
        }
        if ((57344 & i11) == 0) {
            i12 |= composerStartRestartGroup.changed(pVar3) ? 16384 : 8192;
        }
        if ((458752 & i11) == 0) {
            i12 |= composerStartRestartGroup.changed(f10) ? 131072 : 65536;
        }
        if ((3670016 & i11) == 0) {
            i12 |= composerStartRestartGroup.changed(i10) ? 1048576 : 524288;
        }
        if ((29360128 & i11) == 0) {
            i12 |= composerStartRestartGroup.changed(state) ? 8388608 : 4194304;
        }
        if ((234881024 & i11) == 0) {
            i12 |= composerStartRestartGroup.changed(bottomSheetState) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        final int i13 = i12;
        if ((i13 & 191739611) == 38347922 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            Object[] objArr = {qVar2, state, pVar, qVar, Dp.m3824boximpl(f10), pVar2, FabPosition.m1047boximpl(i10), pVar3, bottomSheetState};
            composerStartRestartGroup.startReplaceableGroup(-568225417);
            boolean zChanged = false;
            for (int i14 = 0; i14 < 9; i14++) {
                zChanged |= composerStartRestartGroup.changed(objArr[i14]);
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                modifier = null;
                composer2 = composerStartRestartGroup;
                p<SubcomposeMeasureScope, Constraints, MeasureResult> pVar4 = new p<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1

                    /* JADX INFO: compiled from: BottomSheetScaffold.kt */
                    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[BottomSheetValue.values().length];
                            iArr[BottomSheetValue.Collapsed.ordinal()] = 1;
                            iArr[BottomSheetValue.Expanded.ordinal()] = 2;
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // sn.p
                    /* JADX INFO: renamed from: invoke */
                    public /* bridge */ /* synthetic */ MeasureResult mo2invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                        return m916invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                    }

                    @NotNull
                    /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                    public final MeasureResult m916invoke0kLqBqw(@NotNull SubcomposeMeasureScope subcomposeMeasureScope, long j10) {
                        Placeable placeableMo3112measureBRTryo0;
                        int height;
                        tn.p.k(subcomposeMeasureScope, "$this$SubcomposeLayout");
                        int iM3782getMaxWidthimpl = Constraints.m3782getMaxWidthimpl(j10);
                        final int iM3781getMaxHeightimpl = Constraints.m3781getMaxHeightimpl(j10);
                        long jM3773copyZbe2FdA$default = Constraints.m3773copyZbe2FdA$default(j10, 0, 0, 0, 0, 10, null);
                        BottomSheetScaffoldLayoutSlot bottomSheetScaffoldLayoutSlot = BottomSheetScaffoldLayoutSlot.Sheet;
                        final q<Integer, Composer, Integer, r> qVar3 = qVar2;
                        final int i15 = i13;
                        final Placeable placeableMo3112measureBRTryo02 = subcomposeMeasureScope.subcompose(bottomSheetScaffoldLayoutSlot, ComposableLambdaKt.composableLambdaInstance(520491296, true, new p<Composer, Integer, r>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1$sheetPlaceable$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // sn.p
                            /* JADX INFO: renamed from: invoke */
                            public /* bridge */ /* synthetic */ r mo2invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return r.f5635a;
                            }

                            @Composable
                            public final void invoke(@Nullable Composer composer3, int i16) {
                                if ((i16 & 11) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                } else {
                                    qVar3.invoke(Integer.valueOf(iM3781getMaxHeightimpl), composer3, Integer.valueOf((i15 >> 3) & 112));
                                }
                            }
                        })).get(0).mo3112measureBRTryo0(jM3773copyZbe2FdA$default);
                        final int iD = c.d(state.getValue().floatValue());
                        final p<Composer, Integer, r> pVar5 = pVar;
                        if (pVar5 != null) {
                            final int i16 = i13;
                            placeableMo3112measureBRTryo0 = subcomposeMeasureScope.subcompose(BottomSheetScaffoldLayoutSlot.TopBar, ComposableLambdaKt.composableLambdaInstance(1988456983, true, new p<Composer, Integer, r>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1$topBarPlaceable$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // sn.p
                                /* JADX INFO: renamed from: invoke */
                                public /* bridge */ /* synthetic */ r mo2invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return r.f5635a;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@Nullable Composer composer3, int i17) {
                                    if ((i17 & 11) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                    } else {
                                        pVar5.mo2invoke(composer3, Integer.valueOf(i16 & 14));
                                    }
                                }
                            })).get(0).mo3112measureBRTryo0(jM3773copyZbe2FdA$default);
                        } else {
                            placeableMo3112measureBRTryo0 = null;
                        }
                        int height2 = placeableMo3112measureBRTryo0 != null ? placeableMo3112measureBRTryo0.getHeight() : 0;
                        long jM3773copyZbe2FdA$default2 = Constraints.m3773copyZbe2FdA$default(jM3773copyZbe2FdA$default, 0, 0, 0, iM3781getMaxHeightimpl - height2, 7, null);
                        BottomSheetScaffoldLayoutSlot bottomSheetScaffoldLayoutSlot2 = BottomSheetScaffoldLayoutSlot.Body;
                        final q<PaddingValues, Composer, Integer, r> qVar4 = qVar;
                        final float f11 = f10;
                        final int i17 = i13;
                        final Placeable placeableMo3112measureBRTryo03 = subcomposeMeasureScope.subcompose(bottomSheetScaffoldLayoutSlot2, ComposableLambdaKt.composableLambdaInstance(1466287989, true, new p<Composer, Integer, r>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1$bodyPlaceable$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // sn.p
                            /* JADX INFO: renamed from: invoke */
                            public /* bridge */ /* synthetic */ r mo2invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return r.f5635a;
                            }

                            @Composable
                            public final void invoke(@Nullable Composer composer3, int i18) {
                                if ((i18 & 11) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                } else {
                                    qVar4.invoke(PaddingKt.m408PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, f11, 7, null), composer3, Integer.valueOf(i17 & 112));
                                }
                            }
                        })).get(0).mo3112measureBRTryo0(jM3773copyZbe2FdA$default2);
                        p<Composer, Integer, r> pVar6 = pVar2;
                        Placeable placeableMo3112measureBRTryo04 = pVar6 != null ? subcomposeMeasureScope.subcompose(BottomSheetScaffoldLayoutSlot.Fab, pVar6).get(0).mo3112measureBRTryo0(jM3773copyZbe2FdA$default) : null;
                        int width = placeableMo3112measureBRTryo04 != null ? placeableMo3112measureBRTryo04.getWidth() : 0;
                        int height3 = placeableMo3112measureBRTryo04 != null ? placeableMo3112measureBRTryo04.getHeight() : 0;
                        final int iMo300roundToPx0680j_4 = FabPosition.m1050equalsimpl0(i10, FabPosition.INSTANCE.m1054getCenter5ygKITE()) ? (iM3782getMaxWidthimpl - width) / 2 : (iM3782getMaxWidthimpl - width) - subcomposeMeasureScope.mo300roundToPx0680j_4(BottomSheetScaffoldKt.FabSpacing);
                        int i18 = height3 / 2;
                        final int iMo300roundToPx0680j_42 = subcomposeMeasureScope.mo306toPx0680j_4(f10) < ((float) i18) ? (iD - height3) - subcomposeMeasureScope.mo300roundToPx0680j_4(BottomSheetScaffoldKt.FabSpacing) : iD - i18;
                        final Placeable placeableMo3112measureBRTryo05 = subcomposeMeasureScope.subcompose(BottomSheetScaffoldLayoutSlot.Snackbar, pVar3).get(0).mo3112measureBRTryo0(jM3773copyZbe2FdA$default);
                        final int width2 = (iM3782getMaxWidthimpl - placeableMo3112measureBRTryo05.getWidth()) / 2;
                        int i19 = WhenMappings.$EnumSwitchMapping$0[bottomSheetState.getCurrentValue().ordinal()];
                        if (i19 == 1) {
                            height = iMo300roundToPx0680j_42 - placeableMo3112measureBRTryo05.getHeight();
                        } else {
                            if (i19 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            height = iM3781getMaxHeightimpl - placeableMo3112measureBRTryo05.getHeight();
                        }
                        final int i20 = height2;
                        final Placeable placeable = placeableMo3112measureBRTryo0;
                        final Placeable placeable2 = placeableMo3112measureBRTryo04;
                        final int i21 = height;
                        return MeasureScope.layout$default(subcomposeMeasureScope, iM3782getMaxWidthimpl, iM3781getMaxHeightimpl, null, new l<Placeable.PlacementScope, r>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1.1
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
                                tn.p.k(placementScope, "$this$layout");
                                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo3112measureBRTryo03, 0, i20, 0.0f, 4, null);
                                Placeable placeable3 = placeable;
                                if (placeable3 != null) {
                                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, 0, 0, 0.0f, 4, null);
                                }
                                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo3112measureBRTryo02, 0, iD, 0.0f, 4, null);
                                Placeable placeable4 = placeable2;
                                if (placeable4 != null) {
                                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, iMo300roundToPx0680j_4, iMo300roundToPx0680j_42, 0.0f, 4, null);
                                }
                                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo3112measureBRTryo05, width2, i21, 0.0f, 4, null);
                            }
                        }, 4, null);
                    }
                };
                composer2.updateRememberedValue(pVar4);
                objRememberedValue = pVar4;
            } else {
                modifier = null;
                composer2 = composerStartRestartGroup;
            }
            composer2.endReplaceableGroup();
            SubcomposeLayoutKt.SubcomposeLayout(modifier, (p) objRememberedValue, composer2, 0, 1);
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, r>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ r mo2invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return r.f5635a;
            }

            public final void invoke(@Nullable Composer composer3, int i15) {
                BottomSheetScaffoldKt.m909BottomSheetScaffoldLayoutKCBPh4w(pVar, qVar, qVar2, pVar2, pVar3, f10, i10, state, bottomSheetState, composer3, i11 | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: BottomSheetScaffold_bGncdBI$lambda-4, reason: not valid java name */
    public static final Float m910BottomSheetScaffold_bGncdBI$lambda4(MutableState<Float> mutableState) {
        return mutableState.getValue();
    }

    @Composable
    @ExperimentalMaterialApi
    @NotNull
    public static final BottomSheetScaffoldState rememberBottomSheetScaffoldState(@Nullable DrawerState drawerState, @Nullable BottomSheetState bottomSheetState, @Nullable SnackbarHostState snackbarHostState, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(-1353009744);
        if ((i11 & 1) != 0) {
            drawerState = DrawerKt.rememberDrawerState(DrawerValue.Closed, null, composer, 6, 2);
        }
        if ((i11 & 2) != 0) {
            bottomSheetState = rememberBottomSheetState(BottomSheetValue.Collapsed, null, null, composer, 6, 6);
        }
        if ((i11 & 4) != 0) {
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new SnackbarHostState();
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            snackbarHostState = (SnackbarHostState) objRememberedValue;
        }
        composer.startReplaceableGroup(1618982084);
        boolean zChanged = composer.changed(drawerState) | composer.changed(bottomSheetState) | composer.changed(snackbarHostState);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new BottomSheetScaffoldState(drawerState, bottomSheetState, snackbarHostState);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        BottomSheetScaffoldState bottomSheetScaffoldState = (BottomSheetScaffoldState) objRememberedValue2;
        composer.endReplaceableGroup();
        return bottomSheetScaffoldState;
    }

    @Composable
    @ExperimentalMaterialApi
    @NotNull
    public static final BottomSheetState rememberBottomSheetState(@NotNull final BottomSheetValue bottomSheetValue, @Nullable final AnimationSpec<Float> animationSpec, @Nullable final l<? super BottomSheetValue, Boolean> lVar, @Nullable Composer composer, int i10, int i11) {
        tn.p.k(bottomSheetValue, "initialValue");
        composer.startReplaceableGroup(1808153344);
        if ((i11 & 2) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        if ((i11 & 4) != 0) {
            lVar = new l<BottomSheetValue, Boolean>() { // from class: androidx.compose.material.BottomSheetScaffoldKt.rememberBottomSheetState.1
                @Override // sn.l
                @NotNull
                public final Boolean invoke(@NotNull BottomSheetValue bottomSheetValue2) {
                    tn.p.k(bottomSheetValue2, "it");
                    return Boolean.TRUE;
                }
            };
        }
        BottomSheetState bottomSheetState = (BottomSheetState) RememberSaveableKt.m1287rememberSaveable(new Object[]{animationSpec}, (Saver) BottomSheetState.INSTANCE.Saver(animationSpec, lVar), (String) null, (a) new a<BottomSheetState>() { // from class: androidx.compose.material.BottomSheetScaffoldKt.rememberBottomSheetState.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final BottomSheetState invoke() {
                return new BottomSheetState(bottomSheetValue, animationSpec, lVar);
            }
        }, composer, 72, 4);
        composer.endReplaceableGroup();
        return bottomSheetState;
    }
}
