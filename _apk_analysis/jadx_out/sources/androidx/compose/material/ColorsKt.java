package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import com.ironsource.C3978d4;
import io.appmetrica.analytics.impl.A2;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.a;
import tn.p;

/* JADX INFO: compiled from: Colors.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u008b\u0001\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u008b\u0001\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u000f\u001a\u001f\u0010\u0016\u001a\u00020\u0000*\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001d\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0000H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0014\u0010\u001b\u001a\u00020\u001a*\u00020\r2\u0006\u0010\u0019\u001a\u00020\rH\u0000\" \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0018\u0010#\u001a\u00020\u0000*\u00020\r8Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b!\u0010\"\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"Landroidx/compose/ui/graphics/Color;", "primary", "primaryVariant", C3978d4.i.Y, "secondaryVariant", A2.f64965g, "surface", "error", "onPrimary", "onSecondary", "onBackground", "onSurface", "onError", "Landroidx/compose/material/Colors;", "lightColors-2qZNXz8", "(JJJJJJJJJJJJ)Landroidx/compose/material/Colors;", "lightColors", "darkColors-2qZNXz8", "darkColors", "backgroundColor", "contentColorFor-4WTKRHQ", "(Landroidx/compose/material/Colors;J)J", "contentColorFor", "contentColorFor-ek8zF_U", "(JLandroidx/compose/runtime/Composer;I)J", "other", "Lbn/r;", "updateColorsFrom", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalColors", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalColors", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "getPrimarySurface", "(Landroidx/compose/material/Colors;)J", "primarySurface", "material_release"}, k = 2, mv = {1, 6, 0})
public final class ColorsKt {

    @NotNull
    private static final ProvidableCompositionLocal<Colors> LocalColors = CompositionLocalKt.staticCompositionLocalOf(new a<Colors>() { // from class: androidx.compose.material.ColorsKt$LocalColors$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // sn.a
        @NotNull
        public final Colors invoke() {
            return ColorsKt.m988lightColors2qZNXz8((4095 & 1) != 0 ? ColorKt.Color(4284612846L) : 0L, (4095 & 2) != 0 ? ColorKt.Color(4281794739L) : 0L, (4095 & 4) != 0 ? ColorKt.Color(4278442694L) : 0L, (4095 & 8) != 0 ? ColorKt.Color(4278290310L) : 0L, (4095 & 16) != 0 ? Color.INSTANCE.m1656getWhite0d7_KjU() : 0L, (4095 & 32) != 0 ? Color.INSTANCE.m1656getWhite0d7_KjU() : 0L, (4095 & 64) != 0 ? ColorKt.Color(4289724448L) : 0L, (4095 & 128) != 0 ? Color.INSTANCE.m1656getWhite0d7_KjU() : 0L, (4095 & 256) != 0 ? Color.INSTANCE.m1645getBlack0d7_KjU() : 0L, (4095 & 512) != 0 ? Color.INSTANCE.m1645getBlack0d7_KjU() : 0L, (4095 & 1024) != 0 ? Color.INSTANCE.m1645getBlack0d7_KjU() : 0L, (4095 & 2048) != 0 ? Color.INSTANCE.m1656getWhite0d7_KjU() : 0L);
        }
    });

    /* JADX INFO: renamed from: contentColorFor-4WTKRHQ, reason: not valid java name */
    public static final long m984contentColorFor4WTKRHQ(@NotNull Colors colors, long j10) {
        p.k(colors, "$this$contentColorFor");
        if (!Color.m1620equalsimpl0(j10, colors.m967getPrimary0d7_KjU()) && !Color.m1620equalsimpl0(j10, colors.m968getPrimaryVariant0d7_KjU())) {
            if (!Color.m1620equalsimpl0(j10, colors.m969getSecondary0d7_KjU()) && !Color.m1620equalsimpl0(j10, colors.m970getSecondaryVariant0d7_KjU())) {
                return Color.m1620equalsimpl0(j10, colors.m960getBackground0d7_KjU()) ? colors.m962getOnBackground0d7_KjU() : Color.m1620equalsimpl0(j10, colors.m971getSurface0d7_KjU()) ? colors.m966getOnSurface0d7_KjU() : Color.m1620equalsimpl0(j10, colors.m961getError0d7_KjU()) ? colors.m963getOnError0d7_KjU() : Color.INSTANCE.m1655getUnspecified0d7_KjU();
            }
            return colors.m965getOnSecondary0d7_KjU();
        }
        return colors.m964getOnPrimary0d7_KjU();
    }

    @Composable
    @ReadOnlyComposable
    /* JADX INFO: renamed from: contentColorFor-ek8zF_U, reason: not valid java name */
    public static final long m985contentColorForek8zF_U(long j10, @Nullable Composer composer, int i10) {
        long jM984contentColorFor4WTKRHQ = m984contentColorFor4WTKRHQ(MaterialTheme.INSTANCE.getColors(composer, 6), j10);
        return (jM984contentColorFor4WTKRHQ > Color.INSTANCE.m1655getUnspecified0d7_KjU() ? 1 : (jM984contentColorFor4WTKRHQ == Color.INSTANCE.m1655getUnspecified0d7_KjU() ? 0 : -1)) != 0 ? jM984contentColorFor4WTKRHQ : ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m1629unboximpl();
    }

    @NotNull
    /* JADX INFO: renamed from: darkColors-2qZNXz8, reason: not valid java name */
    public static final Colors m986darkColors2qZNXz8(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21) {
        return new Colors(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, false, null);
    }

    /* JADX INFO: renamed from: darkColors-2qZNXz8$default, reason: not valid java name */
    public static /* synthetic */ Colors m987darkColors2qZNXz8$default(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, int i10, Object obj) {
        long jColor = (i10 & 1) != 0 ? ColorKt.Color(4290479868L) : j10;
        long jColor2 = (i10 & 2) != 0 ? ColorKt.Color(4281794739L) : j11;
        long jColor3 = (i10 & 4) != 0 ? ColorKt.Color(4278442694L) : j12;
        return m986darkColors2qZNXz8(jColor, jColor2, jColor3, (i10 & 8) != 0 ? jColor3 : j13, (i10 & 16) != 0 ? ColorKt.Color(4279374354L) : j14, (i10 & 32) != 0 ? ColorKt.Color(4279374354L) : j15, (i10 & 64) != 0 ? ColorKt.Color(4291782265L) : j16, (i10 & 128) != 0 ? Color.INSTANCE.m1645getBlack0d7_KjU() : j17, (i10 & 256) != 0 ? Color.INSTANCE.m1645getBlack0d7_KjU() : j18, (i10 & 512) != 0 ? Color.INSTANCE.m1656getWhite0d7_KjU() : j19, (i10 & 1024) != 0 ? Color.INSTANCE.m1656getWhite0d7_KjU() : j20, (i10 & 2048) != 0 ? Color.INSTANCE.m1645getBlack0d7_KjU() : j21);
    }

    @NotNull
    public static final ProvidableCompositionLocal<Colors> getLocalColors() {
        return LocalColors;
    }

    public static final long getPrimarySurface(@NotNull Colors colors) {
        p.k(colors, "<this>");
        return colors.isLight() ? colors.m967getPrimary0d7_KjU() : colors.m971getSurface0d7_KjU();
    }

    @NotNull
    /* JADX INFO: renamed from: lightColors-2qZNXz8, reason: not valid java name */
    public static final Colors m988lightColors2qZNXz8(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21) {
        return new Colors(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, true, null);
    }

    public static final void updateColorsFrom(@NotNull Colors colors, @NotNull Colors colors2) {
        p.k(colors, "<this>");
        p.k(colors2, "other");
        colors.m979setPrimary8_81llA$material_release(colors2.m967getPrimary0d7_KjU());
        colors.m980setPrimaryVariant8_81llA$material_release(colors2.m968getPrimaryVariant0d7_KjU());
        colors.m981setSecondary8_81llA$material_release(colors2.m969getSecondary0d7_KjU());
        colors.m982setSecondaryVariant8_81llA$material_release(colors2.m970getSecondaryVariant0d7_KjU());
        colors.m972setBackground8_81llA$material_release(colors2.m960getBackground0d7_KjU());
        colors.m983setSurface8_81llA$material_release(colors2.m971getSurface0d7_KjU());
        colors.m973setError8_81llA$material_release(colors2.m961getError0d7_KjU());
        colors.m976setOnPrimary8_81llA$material_release(colors2.m964getOnPrimary0d7_KjU());
        colors.m977setOnSecondary8_81llA$material_release(colors2.m965getOnSecondary0d7_KjU());
        colors.m974setOnBackground8_81llA$material_release(colors2.m962getOnBackground0d7_KjU());
        colors.m978setOnSurface8_81llA$material_release(colors2.m966getOnSurface0d7_KjU());
        colors.m975setOnError8_81llA$material_release(colors2.m963getOnError0d7_KjU());
        colors.setLight$material_release(colors2.isLight());
    }
}
