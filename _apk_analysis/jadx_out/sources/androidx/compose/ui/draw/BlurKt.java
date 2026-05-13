package androidx.compose.ui.draw;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.RenderEffectKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TileMode;
import androidx.compose.ui.unit.Dp;
import bn.r;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: Blur.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a+\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a3\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"blur", "Landroidx/compose/ui/Modifier;", "radius", "Landroidx/compose/ui/unit/Dp;", "edgeTreatment", "Landroidx/compose/ui/draw/BlurredEdgeTreatment;", "blur-F8QBwvs", "(Landroidx/compose/ui/Modifier;FLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "radiusX", "radiusY", "blur-1fqS-gw", "(Landroidx/compose/ui/Modifier;FFLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class BlurKt {
    @Stable
    @NotNull
    /* JADX INFO: renamed from: blur-1fqS-gw, reason: not valid java name */
    public static final Modifier m1292blur1fqSgw(@NotNull Modifier modifier, final float f10, final float f11, @NotNull final Shape shape) {
        int iM1944getDecal3opZhB0;
        final boolean z10;
        p.k(modifier, "$this$blur");
        if (shape != null) {
            iM1944getDecal3opZhB0 = TileMode.INSTANCE.m1943getClamp3opZhB0();
            z10 = true;
        } else {
            iM1944getDecal3opZhB0 = TileMode.INSTANCE.m1944getDecal3opZhB0();
            z10 = false;
        }
        final int i10 = iM1944getDecal3opZhB0;
        float f12 = 0;
        return ((Dp.m3825compareTo0680j_4(f10, Dp.m3826constructorimpl(f12)) <= 0 || Dp.m3825compareTo0680j_4(f11, Dp.m3826constructorimpl(f12)) <= 0) && !z10) ? modifier : GraphicsLayerModifierKt.graphicsLayer(modifier, new l<GraphicsLayerScope, r>() { // from class: androidx.compose.ui.draw.BlurKt$blur$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(GraphicsLayerScope graphicsLayerScope) {
                invoke2(graphicsLayerScope);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull GraphicsLayerScope graphicsLayerScope) {
                p.k(graphicsLayerScope, "$this$graphicsLayer");
                float fMo306toPx0680j_4 = graphicsLayerScope.mo306toPx0680j_4(f10);
                float fMo306toPx0680j_42 = graphicsLayerScope.mo306toPx0680j_4(f11);
                graphicsLayerScope.setRenderEffect((fMo306toPx0680j_4 <= 0.0f || fMo306toPx0680j_42 <= 0.0f) ? null : RenderEffectKt.m1887BlurEffect3YTHUZs(fMo306toPx0680j_4, fMo306toPx0680j_42, i10));
                Shape rectangleShape = shape;
                if (rectangleShape == null) {
                    rectangleShape = RectangleShapeKt.getRectangleShape();
                }
                graphicsLayerScope.setShape(rectangleShape);
                graphicsLayerScope.setClip(z10);
            }
        });
    }

    /* JADX INFO: renamed from: blur-1fqS-gw$default, reason: not valid java name */
    public static /* synthetic */ Modifier m1293blur1fqSgw$default(Modifier modifier, float f10, float f11, BlurredEdgeTreatment blurredEdgeTreatment, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            blurredEdgeTreatment = BlurredEdgeTreatment.m1296boximpl(BlurredEdgeTreatment.INSTANCE.m1303getRectangleGoahg());
        }
        return m1292blur1fqSgw(modifier, f10, f11, blurredEdgeTreatment.m1302unboximpl());
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: blur-F8QBwvs, reason: not valid java name */
    public static final Modifier m1294blurF8QBwvs(@NotNull Modifier modifier, float f10, @NotNull Shape shape) {
        p.k(modifier, "$this$blur");
        return m1292blur1fqSgw(modifier, f10, f10, shape);
    }

    /* JADX INFO: renamed from: blur-F8QBwvs$default, reason: not valid java name */
    public static /* synthetic */ Modifier m1295blurF8QBwvs$default(Modifier modifier, float f10, BlurredEdgeTreatment blurredEdgeTreatment, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            blurredEdgeTreatment = BlurredEdgeTreatment.m1296boximpl(BlurredEdgeTreatment.INSTANCE.m1303getRectangleGoahg());
        }
        return m1294blurF8QBwvs(modifier, f10, blurredEdgeTreatment.m1302unboximpl());
    }
}
