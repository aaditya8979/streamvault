package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableOpenTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import bn.r;
import com.ironsource.C4089j8;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: VectorPainter.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a{\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\"\u0010\u0010\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0085\u0001\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\"\u0010\u0010\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0017\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u0014\u0010\u001b\u001a!\u0010\u001f\u001a\u00020\r*\u00020\u001c2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\r0\u001dH\u0082\b\u001a-\u0010%\u001a\u00020\r2\u0006\u0010!\u001a\u00020 2\u0014\b\u0002\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020#0\"H\u0007¢\u0006\u0004\b%\u0010&\"\u0014\u0010'\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010(\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006)"}, d2 = {"Landroidx/compose/ui/unit/Dp;", "defaultWidth", "defaultHeight", "", "viewportWidth", "viewportHeight", "", "name", "Landroidx/compose/ui/graphics/Color;", "tintColor", "Landroidx/compose/ui/graphics/BlendMode;", "tintBlendMode", "Lkotlin/Function2;", "Lbn/r;", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/ui/graphics/vector/VectorComposable;", "content", "Landroidx/compose/ui/graphics/vector/VectorPainter;", "rememberVectorPainter-mlNsNFs", "(FFFFLjava/lang/String;JILsn/r;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/graphics/vector/VectorPainter;", "rememberVectorPainter", "", "autoMirror", "rememberVectorPainter-vIP8VLU", "(FFFFLjava/lang/String;JIZLsn/r;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/graphics/vector/VectorPainter;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "image", "(Landroidx/compose/ui/graphics/vector/ImageVector;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/vector/VectorPainter;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/Function1;", "block", "mirror", "Landroidx/compose/ui/graphics/vector/VectorGroup;", "group", "", "Landroidx/compose/ui/graphics/vector/VectorConfig;", C4089j8.f32059p, "RenderVectorGroup", "(Landroidx/compose/ui/graphics/vector/VectorGroup;Ljava/util/Map;Landroidx/compose/runtime/Composer;II)V", "RootGroupName", "Ljava/lang/String;", "ui_release"}, k = 2, mv = {1, 6, 0})
public final class VectorPainterKt {

    @NotNull
    public static final String RootGroupName = "VectorRootGroup";

    /* JADX WARN: Removed duplicated region for block: B:35:0x0071  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.graphics.vector.VectorComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void RenderVectorGroup(@org.jetbrains.annotations.NotNull final androidx.compose.ui.graphics.vector.VectorGroup r23, @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, ? extends androidx.compose.ui.graphics.vector.VectorConfig> r24, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instruction units count: 621
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.VectorPainterKt.RenderVectorGroup(androidx.compose.ui.graphics.vector.VectorGroup, java.util.Map, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final void mirror(DrawScope drawScope, l<? super DrawScope, r> lVar) {
        long jMo2112getCenterF1C5BW0 = drawScope.mo2112getCenterF1C5BW0();
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo2038getSizeNHjbRc = drawContext.mo2038getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo2045scale0AR0LA0(-1.0f, 1.0f, jMo2112getCenterF1C5BW0);
        lVar.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo2039setSizeuvyYCjk(jMo2038getSizeNHjbRc);
    }

    @Composable
    @NotNull
    public static final VectorPainter rememberVectorPainter(@NotNull final ImageVector imageVector, @Nullable Composer composer, int i10) {
        p.k(imageVector, "image");
        composer.startReplaceableGroup(1413834416);
        VectorPainter vectorPainterM2223rememberVectorPaintervIP8VLU = m2223rememberVectorPaintervIP8VLU(imageVector.getDefaultWidth(), imageVector.getDefaultHeight(), imageVector.getViewportWidth(), imageVector.getViewportHeight(), imageVector.getName(), imageVector.getTintColor(), imageVector.getTintBlendMode(), imageVector.getAutoMirror(), ComposableLambdaKt.composableLambda(composer, 1873274766, true, new sn.r<Float, Float, Composer, Integer, r>() { // from class: androidx.compose.ui.graphics.vector.VectorPainterKt.rememberVectorPainter.3
            {
                super(4);
            }

            @Override // sn.r
            public /* bridge */ /* synthetic */ r invoke(Float f10, Float f11, Composer composer2, Integer num) {
                invoke(f10.floatValue(), f11.floatValue(), composer2, num.intValue());
                return r.f5635a;
            }

            @ComposableTarget(applier = "androidx.compose.ui.graphics.vector.VectorComposable")
            @Composable
            public final void invoke(float f10, float f11, @Nullable Composer composer2, int i11) {
                if ((i11 & 11) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                } else {
                    VectorPainterKt.RenderVectorGroup(imageVector.getRoot(), null, composer2, 0, 2);
                }
            }
        }), composer, 100663296, 0);
        composer.endReplaceableGroup();
        return vectorPainterM2223rememberVectorPaintervIP8VLU;
    }

    @Composable
    @ComposableOpenTarget(index = -1)
    @NotNull
    /* JADX INFO: renamed from: rememberVectorPainter-mlNsNFs, reason: not valid java name */
    public static final VectorPainter m2222rememberVectorPaintermlNsNFs(float f10, float f11, float f12, float f13, @Nullable String str, long j10, int i10, @NotNull sn.r<? super Float, ? super Float, ? super Composer, ? super Integer, r> rVar, @Nullable Composer composer, int i11, int i12) {
        p.k(rVar, "content");
        composer.startReplaceableGroup(-964365210);
        VectorPainter vectorPainterM2223rememberVectorPaintervIP8VLU = m2223rememberVectorPaintervIP8VLU(f10, f11, (i12 & 4) != 0 ? Float.NaN : f12, (i12 & 8) != 0 ? Float.NaN : f13, (i12 & 16) != 0 ? RootGroupName : str, (i12 & 32) != 0 ? Color.INSTANCE.m1655getUnspecified0d7_KjU() : j10, (i12 & 64) != 0 ? BlendMode.INSTANCE.m1561getSrcIn0nO6VwU() : i10, false, rVar, composer, 12582912 | (i11 & 14) | (i11 & 112) | (i11 & 896) | (i11 & 7168) | (57344 & i11) | (458752 & i11) | (3670016 & i11) | ((i11 << 3) & 234881024), 0);
        composer.endReplaceableGroup();
        return vectorPainterM2223rememberVectorPaintervIP8VLU;
    }

    @Composable
    @ComposableOpenTarget(index = -1)
    @NotNull
    /* JADX INFO: renamed from: rememberVectorPainter-vIP8VLU, reason: not valid java name */
    public static final VectorPainter m2223rememberVectorPaintervIP8VLU(float f10, float f11, float f12, float f13, @Nullable String str, long j10, int i10, boolean z10, @NotNull sn.r<? super Float, ? super Float, ? super Composer, ? super Integer, r> rVar, @Nullable Composer composer, int i11, int i12) {
        p.k(rVar, "content");
        composer.startReplaceableGroup(1068590786);
        float f14 = (i12 & 4) != 0 ? Float.NaN : f12;
        float f15 = (i12 & 8) == 0 ? f13 : Float.NaN;
        String str2 = (i12 & 16) != 0 ? RootGroupName : str;
        long jM1655getUnspecified0d7_KjU = (i12 & 32) != 0 ? Color.INSTANCE.m1655getUnspecified0d7_KjU() : j10;
        int iM1561getSrcIn0nO6VwU = (i12 & 64) != 0 ? BlendMode.INSTANCE.m1561getSrcIn0nO6VwU() : i10;
        boolean z11 = (i12 & 128) != 0 ? false : z10;
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        float fMo306toPx0680j_4 = density.mo306toPx0680j_4(f10);
        float fMo306toPx0680j_42 = density.mo306toPx0680j_4(f11);
        if (Float.isNaN(f14)) {
            f14 = fMo306toPx0680j_4;
        }
        if (Float.isNaN(f15)) {
            f15 = fMo306toPx0680j_42;
        }
        Color colorM1609boximpl = Color.m1609boximpl(jM1655getUnspecified0d7_KjU);
        BlendMode blendModeM1529boximpl = BlendMode.m1529boximpl(iM1561getSrcIn0nO6VwU);
        int i13 = i11 >> 15;
        composer.startReplaceableGroup(511388516);
        boolean zChanged = composer.changed(colorM1609boximpl) | composer.changed(blendModeM1529boximpl);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = !Color.m1620equalsimpl0(jM1655getUnspecified0d7_KjU, Color.INSTANCE.m1655getUnspecified0d7_KjU()) ? ColorFilter.INSTANCE.m1663tintxETnrds(jM1655getUnspecified0d7_KjU, iM1561getSrcIn0nO6VwU) : null;
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        ColorFilter colorFilter = (ColorFilter) objRememberedValue;
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new VectorPainter();
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        VectorPainter vectorPainter = (VectorPainter) objRememberedValue2;
        vectorPainter.m2221setSizeuvyYCjk$ui_release(SizeKt.Size(fMo306toPx0680j_4, fMo306toPx0680j_42));
        vectorPainter.setAutoMirror$ui_release(z11);
        vectorPainter.setIntrinsicColorFilter$ui_release(colorFilter);
        vectorPainter.RenderVector$ui_release(str2, f14, f15, rVar, composer, 32768 | ((i11 >> 12) & 14) | (i13 & 7168));
        composer.endReplaceableGroup();
        return vectorPainter;
    }
}
