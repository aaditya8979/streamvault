package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.DegreesKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: DrawTransform.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a!\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0086\b\u001a\u0015\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0001H\u0086\b\u001a,\u0010\u000b\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001a,\u0010\f\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\f\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\n\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "", "horizontal", "vertical", "Lbn/r;", "inset", "radians", "Landroidx/compose/ui/geometry/Offset;", "pivot", "rotateRad-0AR0LA0", "(Landroidx/compose/ui/graphics/drawscope/DrawTransform;FJ)V", "rotateRad", "scale", "scale-0AR0LA0", "ui-graphics_release"}, k = 2, mv = {1, 6, 0})
public final class DrawTransformKt {
    public static final void inset(@NotNull DrawTransform drawTransform, float f10) {
        p.k(drawTransform, "<this>");
        drawTransform.inset(f10, f10, f10, f10);
    }

    public static final void inset(@NotNull DrawTransform drawTransform, float f10, float f11) {
        p.k(drawTransform, "<this>");
        drawTransform.inset(f10, f11, f10, f11);
    }

    public static /* synthetic */ void inset$default(DrawTransform drawTransform, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        p.k(drawTransform, "<this>");
        drawTransform.inset(f10, f11, f10, f11);
    }

    /* JADX INFO: renamed from: rotateRad-0AR0LA0, reason: not valid java name */
    public static final void m2172rotateRad0AR0LA0(@NotNull DrawTransform drawTransform, float f10, long j10) {
        p.k(drawTransform, "$this$rotateRad");
        drawTransform.mo2044rotateUv8p0NA(DegreesKt.degrees(f10), j10);
    }

    /* JADX INFO: renamed from: rotateRad-0AR0LA0$default, reason: not valid java name */
    public static /* synthetic */ void m2173rotateRad0AR0LA0$default(DrawTransform drawTransform, float f10, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = drawTransform.mo2042getCenterF1C5BW0();
        }
        p.k(drawTransform, "$this$rotateRad");
        drawTransform.mo2044rotateUv8p0NA(DegreesKt.degrees(f10), j10);
    }

    /* JADX INFO: renamed from: scale-0AR0LA0, reason: not valid java name */
    public static final void m2174scale0AR0LA0(@NotNull DrawTransform drawTransform, float f10, long j10) {
        p.k(drawTransform, "$this$scale");
        drawTransform.mo2045scale0AR0LA0(f10, f10, j10);
    }

    /* JADX INFO: renamed from: scale-0AR0LA0$default, reason: not valid java name */
    public static /* synthetic */ void m2175scale0AR0LA0$default(DrawTransform drawTransform, float f10, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = drawTransform.mo2042getCenterF1C5BW0();
        }
        p.k(drawTransform, "$this$scale");
        drawTransform.mo2045scale0AR0LA0(f10, f10, j10);
    }
}
