package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Rect;
import bn.r;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import tn.n;
import tn.p;

/* JADX INFO: compiled from: Canvas.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u001e\u0010\u0007\u001a\u00020\u0005*\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0086\bø\u0001\u0000\u001a.\u0010\f\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0086\bø\u0001\u0000\u001a\"\u0010\u0011\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r\u001a&\u0010\u0013\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r\u001a,\u0010\u0016\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0014\u001a\u00020\r2\b\b\u0002\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/graphics/ImageBitmap;", "image", "Landroidx/compose/ui/graphics/Canvas;", "Canvas", "Lkotlin/Function0;", "Lbn/r;", "block", "withSave", "Landroidx/compose/ui/geometry/Rect;", "bounds", "Landroidx/compose/ui/graphics/Paint;", "paint", "withSaveLayer", "", "degrees", "pivotX", "pivotY", "rotate", "radians", "rotateRad", "sx", "sy", "scale", "ui-graphics_release"}, k = 2, mv = {1, 6, 0})
public final class CanvasKt {
    @NotNull
    public static final Canvas Canvas(@NotNull ImageBitmap imageBitmap) {
        p.k(imageBitmap, "image");
        return AndroidCanvas_androidKt.ActualCanvas(imageBitmap);
    }

    public static final void rotate(@NotNull Canvas canvas, float f10, float f11, float f12) {
        p.k(canvas, "<this>");
        if (f10 == 0.0f) {
            return;
        }
        canvas.translate(f11, f12);
        canvas.rotate(f10);
        canvas.translate(-f11, -f12);
    }

    public static final void rotateRad(@NotNull Canvas canvas, float f10, float f11, float f12) {
        p.k(canvas, "<this>");
        rotate(canvas, DegreesKt.degrees(f10), f11, f12);
    }

    public static /* synthetic */ void rotateRad$default(Canvas canvas, float f10, float f11, float f12, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            f12 = 0.0f;
        }
        rotateRad(canvas, f10, f11, f12);
    }

    public static final void scale(@NotNull Canvas canvas, float f10, float f11, float f12, float f13) {
        p.k(canvas, "<this>");
        if (f10 == 1.0f) {
            if (f11 == 1.0f) {
                return;
            }
        }
        canvas.translate(f12, f13);
        canvas.scale(f10, f11);
        canvas.translate(-f12, -f13);
    }

    public static /* synthetic */ void scale$default(Canvas canvas, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = f10;
        }
        scale(canvas, f10, f11, f12, f13);
    }

    public static final void withSave(@NotNull Canvas canvas, @NotNull sn.a<r> aVar) {
        p.k(canvas, "<this>");
        p.k(aVar, "block");
        try {
            canvas.save();
            aVar.invoke();
        } finally {
            n.b(1);
            canvas.restore();
            n.a(1);
        }
    }

    public static final void withSaveLayer(@NotNull Canvas canvas, @NotNull Rect rect, @NotNull Paint paint, @NotNull sn.a<r> aVar) {
        p.k(canvas, "<this>");
        p.k(rect, "bounds");
        p.k(paint, "paint");
        p.k(aVar, "block");
        try {
            canvas.saveLayer(rect, paint);
            aVar.invoke();
        } finally {
            n.b(1);
            canvas.restore();
            n.a(1);
        }
    }
}
