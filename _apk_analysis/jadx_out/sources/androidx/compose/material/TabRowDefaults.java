package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import bn.r;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import sn.p;
import sn.q;

/* JADX INFO: compiled from: TabRow.kt */
/* JADX INFO: loaded from: classes6.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ3\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ3\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\nJ\u0012\u0010\u0011\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fR\u0014\u0010\u0013\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R \u0010\u0015\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0016\u0010\u0017R \u0010\u0018\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0017R \u0010\u001a\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u0017\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"Landroidx/compose/material/TabRowDefaults;", "", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/unit/Dp;", "thickness", "Landroidx/compose/ui/graphics/Color;", "color", "Lbn/r;", "Divider-9IZ8Weo", "(Landroidx/compose/ui/Modifier;FJLandroidx/compose/runtime/Composer;II)V", "Divider", "height", "Indicator-9IZ8Weo", "Indicator", "Landroidx/compose/material/TabPosition;", "currentTabPosition", "tabIndicatorOffset", "", "DividerOpacity", "F", "DividerThickness", "getDividerThickness-D9Ej5fM", "()F", "IndicatorHeight", "getIndicatorHeight-D9Ej5fM", "ScrollableTabRowPadding", "getScrollableTabRowPadding-D9Ej5fM", "<init>", "()V", "material_release"}, k = 1, mv = {1, 6, 0})
public final class TabRowDefaults {
    public static final int $stable = 0;
    public static final float DividerOpacity = 0.12f;

    @NotNull
    public static final TabRowDefaults INSTANCE = new TabRowDefaults();
    private static final float DividerThickness = Dp.m3826constructorimpl(1);
    private static final float IndicatorHeight = Dp.m3826constructorimpl(2);
    private static final float ScrollableTabRowPadding = Dp.m3826constructorimpl(52);

    private TabRowDefaults() {
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* JADX INFO: renamed from: Divider-9IZ8Weo, reason: not valid java name */
    public final void m1191Divider9IZ8Weo(@Nullable Modifier modifier, float f10, long j10, @Nullable Composer composer, final int i10, final int i11) {
        final Modifier modifier2;
        int i12;
        float f11;
        long j11;
        Modifier modifier3;
        float f12;
        final long jM1618copywmQWz5c$default;
        final float f13;
        Composer composerStartRestartGroup = composer.startRestartGroup(910934799);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            modifier2 = modifier;
        } else if ((i10 & 14) == 0) {
            modifier2 = modifier;
            i12 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i10;
        } else {
            modifier2 = modifier;
            i12 = i10;
        }
        if ((i10 & 112) == 0) {
            if ((i11 & 2) == 0) {
                f11 = f10;
                int i14 = composerStartRestartGroup.changed(f11) ? 32 : 16;
                i12 |= i14;
            } else {
                f11 = f10;
            }
            i12 |= i14;
        } else {
            f11 = f10;
        }
        if ((i10 & 896) == 0) {
            j11 = j10;
            i12 |= ((i11 & 4) == 0 && composerStartRestartGroup.changed(j11)) ? 256 : 128;
        } else {
            j11 = j10;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            i12 |= composerStartRestartGroup.changed(this) ? 2048 : 1024;
        }
        if ((i12 & 5851) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            f13 = f11;
            jM1618copywmQWz5c$default = j11;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                modifier3 = i13 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i11 & 2) != 0) {
                    f12 = DividerThickness;
                    i12 &= -113;
                } else {
                    f12 = f11;
                }
                if ((i11 & 4) != 0) {
                    jM1618copywmQWz5c$default = Color.m1618copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1629unboximpl(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                    i12 &= -897;
                }
                composerStartRestartGroup.endDefaults();
                DividerKt.m1007DivideroMI9zvI(modifier3, jM1618copywmQWz5c$default, f12, 0.0f, composerStartRestartGroup, (i12 & 14) | ((i12 >> 3) & 112) | ((i12 << 3) & 896), 8);
                f13 = f12;
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i11 & 2) != 0) {
                    i12 &= -113;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                }
                modifier3 = modifier2;
                f12 = f11;
            }
            jM1618copywmQWz5c$default = j11;
            composerStartRestartGroup.endDefaults();
            DividerKt.m1007DivideroMI9zvI(modifier3, jM1618copywmQWz5c$default, f12, 0.0f, composerStartRestartGroup, (i12 & 14) | ((i12 >> 3) & 112) | ((i12 << 3) & 896), 8);
            f13 = f12;
            modifier2 = modifier3;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, r>() { // from class: androidx.compose.material.TabRowDefaults$Divider$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                this.$tmp0_rcvr.m1191Divider9IZ8Weo(modifier2, f13, jM1618copywmQWz5c$default, composer2, i10 | 1, i11);
            }
        });
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* JADX INFO: renamed from: Indicator-9IZ8Weo, reason: not valid java name */
    public final void m1192Indicator9IZ8Weo(@Nullable Modifier modifier, float f10, long j10, @Nullable Composer composer, final int i10, final int i11) {
        final Modifier modifier2;
        int i12;
        float f11;
        long jM1629unboximpl;
        Modifier modifier3;
        float f12;
        final float f13;
        final long j11;
        Composer composerStartRestartGroup = composer.startRestartGroup(1499002201);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            modifier2 = modifier;
        } else if ((i10 & 14) == 0) {
            modifier2 = modifier;
            i12 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i10;
        } else {
            modifier2 = modifier;
            i12 = i10;
        }
        if ((i10 & 112) == 0) {
            if ((i11 & 2) == 0) {
                f11 = f10;
                int i14 = composerStartRestartGroup.changed(f11) ? 32 : 16;
                i12 |= i14;
            } else {
                f11 = f10;
            }
            i12 |= i14;
        } else {
            f11 = f10;
        }
        if ((i10 & 896) == 0) {
            jM1629unboximpl = j10;
            i12 |= ((i11 & 4) == 0 && composerStartRestartGroup.changed(jM1629unboximpl)) ? 256 : 128;
        } else {
            jM1629unboximpl = j10;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            i12 |= composerStartRestartGroup.changed(this) ? 2048 : 1024;
        }
        if ((i12 & 5851) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            f13 = f11;
            j11 = jM1629unboximpl;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                modifier3 = i13 != 0 ? Modifier.INSTANCE : modifier2;
                f12 = (i11 & 2) != 0 ? IndicatorHeight : f11;
                if ((i11 & 4) != 0) {
                    jM1629unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1629unboximpl();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                f12 = f11;
            }
            composerStartRestartGroup.endDefaults();
            BoxKt.Box(BackgroundKt.m164backgroundbw27NRU$default(SizeKt.m438height3ABfNKs(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), f12), jM1629unboximpl, null, 2, null), composerStartRestartGroup, 0);
            f13 = f12;
            j11 = jM1629unboximpl;
            modifier2 = modifier3;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, r>() { // from class: androidx.compose.material.TabRowDefaults$Indicator$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                this.$tmp0_rcvr.m1192Indicator9IZ8Weo(modifier2, f13, j11, composer2, i10 | 1, i11);
            }
        });
    }

    /* JADX INFO: renamed from: getDividerThickness-D9Ej5fM, reason: not valid java name */
    public final float m1193getDividerThicknessD9Ej5fM() {
        return DividerThickness;
    }

    /* JADX INFO: renamed from: getIndicatorHeight-D9Ej5fM, reason: not valid java name */
    public final float m1194getIndicatorHeightD9Ej5fM() {
        return IndicatorHeight;
    }

    /* JADX INFO: renamed from: getScrollableTabRowPadding-D9Ej5fM, reason: not valid java name */
    public final float m1195getScrollableTabRowPaddingD9Ej5fM() {
        return ScrollableTabRowPadding;
    }

    @NotNull
    public final Modifier tabIndicatorOffset(@NotNull Modifier modifier, @NotNull final TabPosition tabPosition) {
        tn.p.k(modifier, "<this>");
        tn.p.k(tabPosition, "currentTabPosition");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, r>() { // from class: androidx.compose.material.TabRowDefaults$tabIndicatorOffset$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                tn.p.k(inspectorInfo, "$this$null");
                inspectorInfo.setName("tabIndicatorOffset");
                inspectorInfo.setValue(tabPosition);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.material.TabRowDefaults.tabIndicatorOffset.2
            {
                super(3);
            }

            /* JADX INFO: renamed from: invoke$lambda-0, reason: not valid java name */
            private static final float m1196invoke$lambda0(State<Dp> state) {
                return state.getValue().m3840unboximpl();
            }

            /* JADX INFO: renamed from: invoke$lambda-1, reason: not valid java name */
            private static final float m1197invoke$lambda1(State<Dp> state) {
                return state.getValue().m3840unboximpl();
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier modifier2, @Nullable Composer composer, int i10) {
                tn.p.k(modifier2, "$this$composed");
                composer.startReplaceableGroup(-398757863);
                State<Dp> stateM93animateDpAsStateKz89ssw = AnimateAsStateKt.m93animateDpAsStateKz89ssw(tabPosition.getWidth(), AnimationSpecKt.tween$default(250, 0, EasingKt.getFastOutSlowInEasing(), 2, null), null, composer, 0, 4);
                Modifier modifierM457width3ABfNKs = SizeKt.m457width3ABfNKs(OffsetKt.m400offsetVpY3zN4$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), Alignment.INSTANCE.getBottomStart(), false, 2, null), m1197invoke$lambda1(AnimateAsStateKt.m93animateDpAsStateKz89ssw(tabPosition.getLeft(), AnimationSpecKt.tween$default(250, 0, EasingKt.getFastOutSlowInEasing(), 2, null), null, composer, 0, 4)), 0.0f, 2, null), m1196invoke$lambda0(stateM93animateDpAsStateKz89ssw));
                composer.endReplaceableGroup();
                return modifierM457width3ABfNKs;
            }

            @Override // sn.q
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }
        });
    }
}
