package androidx.compose.material;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import bn.h;
import bn.r;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.ironsource.C3978d4;
import hn.c;
import java.util.Map;
import jn.d;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.i;
import p000do.l0;
import sn.l;
import sn.p;
import sn.q;

/* JADX INFO: compiled from: Drawer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
public final class DrawerKt$BottomDrawer$1 extends Lambda implements q<BoxWithConstraintsScope, Composer, Integer, r> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ p<Composer, Integer, r> $content;
    public final /* synthetic */ long $drawerBackgroundColor;
    public final /* synthetic */ q<ColumnScope, Composer, Integer, r> $drawerContent;
    public final /* synthetic */ long $drawerContentColor;
    public final /* synthetic */ float $drawerElevation;
    public final /* synthetic */ Shape $drawerShape;
    public final /* synthetic */ BottomDrawerState $drawerState;
    public final /* synthetic */ boolean $gesturesEnabled;
    public final /* synthetic */ l0 $scope;
    public final /* synthetic */ long $scrimColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DrawerKt$BottomDrawer$1(boolean z10, BottomDrawerState bottomDrawerState, p<? super Composer, ? super Integer, r> pVar, int i10, long j10, Shape shape, long j11, long j12, float f10, l0 l0Var, q<? super ColumnScope, ? super Composer, ? super Integer, r> qVar) {
        super(3);
        this.$gesturesEnabled = z10;
        this.$drawerState = bottomDrawerState;
        this.$content = pVar;
        this.$$dirty = i10;
        this.$scrimColor = j10;
        this.$drawerShape = shape;
        this.$drawerBackgroundColor = j11;
        this.$drawerContentColor = j12;
        this.$drawerElevation = f10;
        this.$scope = l0Var;
        this.$drawerContent = qVar;
    }

    /* JADX INFO: renamed from: invoke$lambda-1, reason: not valid java name */
    private static final float m1022invoke$lambda1(MutableState<Float> mutableState) {
        return mutableState.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: invoke$lambda-2, reason: not valid java name */
    public static final void m1023invoke$lambda2(MutableState<Float> mutableState, float f10) {
        mutableState.setValue(Float.valueOf(f10));
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
        tn.p.k(boxWithConstraintsScope, "$this$BoxWithConstraints");
        if ((i10 & 14) == 0) {
            i11 = i10 | (composer.changed(boxWithConstraintsScope) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i11 & 91) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        float fM3781getMaxHeightimpl = Constraints.m3781getMaxHeightimpl(boxWithConstraintsScope.getConstraints());
        Object objValueOf = Float.valueOf(fM3781getMaxHeightimpl);
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(objValueOf);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(fM3781getMaxHeightimpl), null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        final MutableState mutableState = (MutableState) objRememberedValue;
        boolean z10 = Constraints.m3782getMaxWidthimpl(boxWithConstraintsScope.getConstraints()) > Constraints.m3781getMaxHeightimpl(boxWithConstraintsScope.getConstraints());
        float f10 = 0.5f * fM3781getMaxHeightimpl;
        float fMax = Math.max(0.0f, fM3781getMaxHeightimpl - m1022invoke$lambda1(mutableState));
        Map mapM = (m1022invoke$lambda1(mutableState) < f10 || z10) ? a.m(h.a(Float.valueOf(fM3781getMaxHeightimpl), BottomDrawerValue.Closed), h.a(Float.valueOf(fMax), BottomDrawerValue.Expanded)) : a.m(h.a(Float.valueOf(fM3781getMaxHeightimpl), BottomDrawerValue.Closed), h.a(Float.valueOf(f10), BottomDrawerValue.Open), h.a(Float.valueOf(fMax), BottomDrawerValue.Expanded));
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierM456sizeInqDBjuR0$default = SizeKt.m456sizeInqDBjuR0$default(companion, 0.0f, 0.0f, density.mo303toDpu2uoSUM(Constraints.m3782getMaxWidthimpl(boxWithConstraintsScope.getConstraints())), density.mo303toDpu2uoSUM(Constraints.m3781getMaxHeightimpl(boxWithConstraintsScope.getConstraints())), 3, null);
        Modifier modifierM1173swipeablepPrIpRY = SwipeableKt.m1173swipeablepPrIpRY(companion.then(this.$gesturesEnabled ? NestedScrollModifierKt.nestedScroll$default(companion, this.$drawerState.getNestedScrollConnection(), null, 2, null) : companion), this.$drawerState, mapM, Orientation.Vertical, (32 & 8) != 0 ? true : this.$gesturesEnabled, (32 & 16) != 0 ? false : false, (32 & 32) != 0 ? null : null, (32 & 64) != 0 ? new p() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final FixedThreshold mo2invoke(Object obj, Object obj2) {
                return new FixedThreshold(Dp.m3826constructorimpl(56), null);
            }
        } : null, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapM.keySet(), 0.0f, 0.0f, 6, null) : null, (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m1172getVelocityThresholdD9Ej5fM() : 0.0f);
        p<Composer, Integer, r> pVar = this.$content;
        final int i12 = this.$$dirty;
        long j10 = this.$scrimColor;
        final BottomDrawerState bottomDrawerState = this.$drawerState;
        Shape shape = this.$drawerShape;
        long j11 = this.$drawerBackgroundColor;
        long j12 = this.$drawerContentColor;
        float f11 = this.$drawerElevation;
        final boolean z11 = this.$gesturesEnabled;
        final l0 l0Var = this.$scope;
        final q<ColumnScope, Composer, Integer, r> qVar = this.$drawerContent;
        composer.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer, 0);
        composer.startReplaceableGroup(-1323940314);
        Density density2 = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        sn.a<ComposeUiNode> constructor = companion2.getConstructor();
        q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r> qVarMaterializerOf = LayoutKt.materializerOf(modifierM1173swipeablepPrIpRY);
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
        Updater.m1281setimpl(composerM1274constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m1281setimpl(composerM1274constructorimpl, density2, companion2.getSetDensity());
        Updater.m1281setimpl(composerM1274constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
        Updater.m1281setimpl(composerM1274constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
        composer.enableReusing();
        qVarMaterializerOf.invoke(SkippableUpdater.m1264boximpl(SkippableUpdater.m1265constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        composer.startReplaceableGroup(-2137368960);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        composer.startReplaceableGroup(-1660053078);
        pVar.mo2invoke(composer, Integer.valueOf((i12 >> 27) & 14));
        DrawerKt.m1014BottomDrawerScrim3JVO9M(j10, new sn.a<r>() { // from class: androidx.compose.material.DrawerKt$BottomDrawer$1$1$1

            /* JADX INFO: renamed from: androidx.compose.material.DrawerKt$BottomDrawer$1$1$1$1, reason: invalid class name */
            /* JADX INFO: compiled from: Drawer.kt */
            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
            @d(c = "androidx.compose.material.DrawerKt$BottomDrawer$1$1$1$1", f = "Drawer.kt", l = {TTAdConstant.STYLE_SIZE_RADIO_9_16}, m = "invokeSuspend")
            public static final class AnonymousClass1 extends SuspendLambda implements p<l0, c<? super r>, Object> {
                public final /* synthetic */ BottomDrawerState $drawerState;
                public int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(BottomDrawerState bottomDrawerState, c<? super AnonymousClass1> cVar) {
                    super(2, cVar);
                    this.$drawerState = bottomDrawerState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
                    return new AnonymousClass1(this.$drawerState, cVar);
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
                        BottomDrawerState bottomDrawerState = this.$drawerState;
                        this.label = 1;
                        if (bottomDrawerState.close(this) == objG) {
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
                if (z11 && bottomDrawerState.getConfirmStateChange$material_release().invoke(BottomDrawerValue.Closed).booleanValue()) {
                    i.d(l0Var, null, null, new AnonymousClass1(bottomDrawerState, null), 3, null);
                }
            }
        }, bottomDrawerState.getTargetValue() != BottomDrawerValue.Closed, composer, (i12 >> 24) & 14);
        final String strM1161getString4foXLRw = Strings_androidKt.m1161getString4foXLRw(Strings.INSTANCE.m1158getNavigationMenuUdPEhr4(), composer, 6);
        composer.startReplaceableGroup(1157296644);
        boolean zChanged2 = composer.changed(bottomDrawerState);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new l<Density, IntOffset>() { // from class: androidx.compose.material.DrawerKt$BottomDrawer$1$1$2$1
                {
                    super(1);
                }

                @Override // sn.l
                public /* bridge */ /* synthetic */ IntOffset invoke(Density density3) {
                    return IntOffset.m3935boximpl(m1024invokeBjo55l4(density3));
                }

                /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                public final long m1024invokeBjo55l4(@NotNull Density density3) {
                    tn.p.k(density3, "$this$offset");
                    return IntOffsetKt.IntOffset(0, vn.c.d(bottomDrawerState.getOffset().getValue().floatValue()));
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        Modifier modifierOffset = OffsetKt.offset(modifierM456sizeInqDBjuR0$default, (l) objRememberedValue2);
        composer.startReplaceableGroup(1157296644);
        boolean zChanged3 = composer.changed(mutableState);
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue3 = new l<LayoutCoordinates, r>() { // from class: androidx.compose.material.DrawerKt$BottomDrawer$1$1$3$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // sn.l
                public /* bridge */ /* synthetic */ r invoke(LayoutCoordinates layoutCoordinates) {
                    invoke2(layoutCoordinates);
                    return r.f5635a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull LayoutCoordinates layoutCoordinates) {
                    tn.p.k(layoutCoordinates, C3978d4.i.L);
                    DrawerKt$BottomDrawer$1.m1023invoke$lambda2(mutableState, IntSize.m3985getHeightimpl(layoutCoordinates.mo3114getSizeYbymL2g()));
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceableGroup();
        int i13 = i12 >> 12;
        SurfaceKt.m1163SurfaceFjzlyU(SemanticsModifierKt.semantics$default(OnGloballyPositionedModifierKt.onGloballyPositioned(modifierOffset, (l) objRememberedValue3), false, new l<SemanticsPropertyReceiver, r>() { // from class: androidx.compose.material.DrawerKt$BottomDrawer$1$1$4
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
                tn.p.k(semanticsPropertyReceiver, "$this$semantics");
                SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, strM1161getString4foXLRw);
                if (bottomDrawerState.isOpen()) {
                    final BottomDrawerState bottomDrawerState2 = bottomDrawerState;
                    final l0 l0Var2 = l0Var;
                    SemanticsPropertiesKt.dismiss$default(semanticsPropertyReceiver, null, new sn.a<Boolean>() { // from class: androidx.compose.material.DrawerKt$BottomDrawer$1$1$4.1

                        /* JADX INFO: renamed from: androidx.compose.material.DrawerKt$BottomDrawer$1$1$4$1$1, reason: invalid class name and collision with other inner class name */
                        /* JADX INFO: compiled from: Drawer.kt */
                        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                        @d(c = "androidx.compose.material.DrawerKt$BottomDrawer$1$1$4$1$1", f = "Drawer.kt", l = {580}, m = "invokeSuspend")
                        public static final class C00711 extends SuspendLambda implements p<l0, c<? super r>, Object> {
                            public final /* synthetic */ BottomDrawerState $drawerState;
                            public int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public C00711(BottomDrawerState bottomDrawerState, c<? super C00711> cVar) {
                                super(2, cVar);
                                this.$drawerState = bottomDrawerState;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @NotNull
                            public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
                                return new C00711(this.$drawerState, cVar);
                            }

                            @Override // sn.p
                            @Nullable
                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                            public final Object mo2invoke(@NotNull l0 l0Var, @Nullable c<? super r> cVar) {
                                return ((C00711) create(l0Var, cVar)).invokeSuspend(r.f5635a);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @Nullable
                            public final Object invokeSuspend(@NotNull Object obj) {
                                Object objG = in.a.g();
                                int i10 = this.label;
                                if (i10 == 0) {
                                    kotlin.c.b(obj);
                                    BottomDrawerState bottomDrawerState = this.$drawerState;
                                    this.label = 1;
                                    if (bottomDrawerState.close(this) == objG) {
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
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // sn.a
                        @NotNull
                        public final Boolean invoke() {
                            if (bottomDrawerState2.getConfirmStateChange$material_release().invoke(BottomDrawerValue.Closed).booleanValue()) {
                                i.d(l0Var2, null, null, new C00711(bottomDrawerState2, null), 3, null);
                            }
                            return Boolean.TRUE;
                        }
                    }, 1, null);
                }
            }
        }, 1, null), shape, j11, j12, null, f11, ComposableLambdaKt.composableLambda(composer, 457750254, true, new p<Composer, Integer, r>() { // from class: androidx.compose.material.DrawerKt$BottomDrawer$1$1$5
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
            public final void invoke(@Nullable Composer composer2, int i14) {
                if ((i14 & 11) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                q<ColumnScope, Composer, Integer, r> qVar2 = qVar;
                int i15 = (i12 << 9) & 7168;
                composer2.startReplaceableGroup(-483455358);
                Modifier.Companion companion3 = Modifier.INSTANCE;
                int i16 = i15 >> 3;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, (i16 & 112) | (i16 & 14));
                composer2.startReplaceableGroup(-1323940314);
                Density density3 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                sn.a<ComposeUiNode> constructor2 = companion4.getConstructor();
                q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r> qVarMaterializerOf2 = LayoutKt.materializerOf(companion3);
                int i17 = ((((i15 << 3) & 112) << 9) & 7168) | 6;
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer2.useNode();
                }
                composer2.disableReusing();
                Composer composerM1274constructorimpl2 = Updater.m1274constructorimpl(composer2);
                Updater.m1281setimpl(composerM1274constructorimpl2, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                Updater.m1281setimpl(composerM1274constructorimpl2, density3, companion4.getSetDensity());
                Updater.m1281setimpl(composerM1274constructorimpl2, layoutDirection2, companion4.getSetLayoutDirection());
                Updater.m1281setimpl(composerM1274constructorimpl2, viewConfiguration2, companion4.getSetViewConfiguration());
                composer2.enableReusing();
                qVarMaterializerOf2.invoke(SkippableUpdater.m1264boximpl(SkippableUpdater.m1265constructorimpl(composer2)), composer2, Integer.valueOf((i17 >> 3) & 112));
                composer2.startReplaceableGroup(2058660585);
                composer2.startReplaceableGroup(-1163856341);
                if (((i17 >> 9) & 14 & 11) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                } else {
                    qVar2.invoke(ColumnScopeInstance.INSTANCE, composer2, Integer.valueOf(((i15 >> 6) & 112) | 6));
                }
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
            }
        }), composer, 1572864 | ((i12 >> 9) & 112) | (i13 & 896) | (i13 & 7168) | (458752 & i12), 16);
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }
}
