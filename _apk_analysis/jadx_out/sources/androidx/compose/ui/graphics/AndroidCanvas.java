package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.Region;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.PointMode;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import bn.r;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import tn.p;
import zn.g;
import zn.n;

/* JADX INFO: compiled from: AndroidCanvas.android.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {}, d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bv\u0010qJ!\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002ø\u0001\u0000J)\u0010\u000b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002ø\u0001\u0000J \u0010\r\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002J \u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002J\b\u0010\u000f\u001a\u00020\u0007H\u0016J\b\u0010\u0010\u001a\u00020\u0007H\u0016J\u0018\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0016J\u0018\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0014H\u0016J\u0010\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0014H\u0016J\u0018\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0014H\u0016J\u001d\u0010\"\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001eH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!J=\u0010+\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\u00142\u0006\u0010(\u001a\u00020'H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010*J%\u00100\u001a\u00020\u00072\u0006\u0010-\u001a\u00020,2\u0006\u0010(\u001a\u00020'H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b.\u0010/J\u0017\u00104\u001a\u000201*\u00020'ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b2\u00103J-\u00109\u001a\u00020\u00072\u0006\u00105\u001a\u00020\u00032\u0006\u00106\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b7\u00108J0\u0010:\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J@\u0010=\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\u00142\u0006\u0010;\u001a\u00020\u00142\u0006\u0010<\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J0\u0010>\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J-\u0010C\u001a\u00020\u00072\u0006\u0010?\u001a\u00020\u00032\u0006\u0010@\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bA\u0010BJH\u0010H\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\u00142\u0006\u0010D\u001a\u00020\u00142\u0006\u0010E\u001a\u00020\u00142\u0006\u0010G\u001a\u00020F2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010I\u001a\u00020\u00072\u0006\u0010-\u001a\u00020,2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J-\u0010O\u001a\u00020\u00072\u0006\u0010K\u001a\u00020J2\u0006\u0010L\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bM\u0010NJE\u0010X\u001a\u00020\u00072\u0006\u0010K\u001a\u00020J2\u0006\u0010Q\u001a\u00020P2\u0006\u0010S\u001a\u00020R2\u0006\u0010T\u001a\u00020P2\u0006\u0010U\u001a\u00020R2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bV\u0010WJ3\u0010\b\u001a\u00020\u00072\u0006\u0010Z\u001a\u00020Y2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b[\u0010\\J\b\u0010]\u001a\u00020\u0007H\u0016J\b\u0010^\u001a\u00020\u0007H\u0016J-\u0010\r\u001a\u00020\u00072\u0006\u0010Z\u001a\u00020Y2\u0006\u0010\u0004\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b_\u0010`J-\u0010g\u001a\u00020\u00072\u0006\u0010b\u001a\u00020a2\u0006\u0010d\u001a\u00020c2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\be\u0010fR,\u0010j\u001a\u00060hj\u0002`i8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bj\u0010k\u0012\u0004\bp\u0010q\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR\u0014\u0010s\u001a\u00020r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u0014\u0010u\u001a\u00020r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010t\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006w"}, d2 = {"Landroidx/compose/ui/graphics/AndroidCanvas;", "Landroidx/compose/ui/graphics/Canvas;", "", "Landroidx/compose/ui/geometry/Offset;", "points", "Landroidx/compose/ui/graphics/Paint;", "paint", "Lbn/r;", "drawPoints", "", "stepBy", "drawLines", "", "drawRawPoints", "drawRawLines", "save", "restore", "Landroidx/compose/ui/geometry/Rect;", "bounds", "saveLayer", "", "dx", "dy", "translate", "sx", "sy", "scale", "degrees", "rotate", "skew", "Landroidx/compose/ui/graphics/Matrix;", "matrix", "concat-58bKbWc", "([F)V", "concat", "left", "top", "right", "bottom", "Landroidx/compose/ui/graphics/ClipOp;", "clipOp", "clipRect-N_I0leg", "(FFFFI)V", "clipRect", "Landroidx/compose/ui/graphics/Path;", "path", "clipPath-mtrdD-E", "(Landroidx/compose/ui/graphics/Path;I)V", "clipPath", "Landroid/graphics/Region$Op;", "toRegionOp--7u2Bmg", "(I)Landroid/graphics/Region$Op;", "toRegionOp", "p1", "p2", "drawLine-Wko1d7g", "(JJLandroidx/compose/ui/graphics/Paint;)V", "drawLine", "drawRect", "radiusX", "radiusY", "drawRoundRect", "drawOval", "center", "radius", "drawCircle-9KIMszo", "(JFLandroidx/compose/ui/graphics/Paint;)V", "drawCircle", "startAngle", "sweepAngle", "", "useCenter", "drawArc", "drawPath", "Landroidx/compose/ui/graphics/ImageBitmap;", "image", "topLeftOffset", "drawImage-d-4ec7I", "(Landroidx/compose/ui/graphics/ImageBitmap;JLandroidx/compose/ui/graphics/Paint;)V", "drawImage", "Landroidx/compose/ui/unit/IntOffset;", "srcOffset", "Landroidx/compose/ui/unit/IntSize;", "srcSize", "dstOffset", "dstSize", "drawImageRect-HPBpro0", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJLandroidx/compose/ui/graphics/Paint;)V", "drawImageRect", "Landroidx/compose/ui/graphics/PointMode;", "pointMode", "drawPoints-O7TthRY", "(ILjava/util/List;Landroidx/compose/ui/graphics/Paint;)V", "enableZ", "disableZ", "drawRawPoints-O7TthRY", "(I[FLandroidx/compose/ui/graphics/Paint;)V", "Landroidx/compose/ui/graphics/Vertices;", "vertices", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "drawVertices-TPEHhCM", "(Landroidx/compose/ui/graphics/Vertices;ILandroidx/compose/ui/graphics/Paint;)V", "drawVertices", "Landroid/graphics/Canvas;", "Landroidx/compose/ui/graphics/NativeCanvas;", "internalCanvas", "Landroid/graphics/Canvas;", "getInternalCanvas", "()Landroid/graphics/Canvas;", "setInternalCanvas", "(Landroid/graphics/Canvas;)V", "getInternalCanvas$annotations", "()V", "Landroid/graphics/Rect;", "srcRect", "Landroid/graphics/Rect;", "dstRect", "<init>", "ui-graphics_release"}, k = 1, mv = {1, 6, 0})
public final class AndroidCanvas implements Canvas {

    @NotNull
    private android.graphics.Canvas internalCanvas = AndroidCanvas_androidKt.EmptyCanvas;

    @NotNull
    private final Rect srcRect = new Rect();

    @NotNull
    private final Rect dstRect = new Rect();

    private final void drawLines(List<Offset> list, Paint paint, int i10) {
        if (list.size() < 2) {
            return;
        }
        g gVarU = n.u(n.v(0, list.size() - 1), i10);
        int iF = gVarU.f();
        int iG = gVarU.g();
        int iH = gVarU.h();
        if ((iH <= 0 || iF > iG) && (iH >= 0 || iG > iF)) {
            return;
        }
        while (true) {
            long packedValue = list.get(iF).getPackedValue();
            long packedValue2 = list.get(iF + 1).getPackedValue();
            this.internalCanvas.drawLine(Offset.m1383getXimpl(packedValue), Offset.m1384getYimpl(packedValue), Offset.m1383getXimpl(packedValue2), Offset.m1384getYimpl(packedValue2), paint.getInternalPaint());
            if (iF == iG) {
                return;
            } else {
                iF += iH;
            }
        }
    }

    private final void drawPoints(List<Offset> list, Paint paint) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            long packedValue = list.get(i10).getPackedValue();
            this.internalCanvas.drawPoint(Offset.m1383getXimpl(packedValue), Offset.m1384getYimpl(packedValue), paint.getInternalPaint());
        }
    }

    private final void drawRawLines(float[] fArr, Paint paint, int i10) {
        if (fArr.length < 4 || fArr.length % 2 != 0) {
            return;
        }
        g gVarU = n.u(n.v(0, fArr.length - 3), i10 * 2);
        int iF = gVarU.f();
        int iG = gVarU.g();
        int iH = gVarU.h();
        if ((iH <= 0 || iF > iG) && (iH >= 0 || iG > iF)) {
            return;
        }
        while (true) {
            this.internalCanvas.drawLine(fArr[iF], fArr[iF + 1], fArr[iF + 2], fArr[iF + 3], paint.getInternalPaint());
            if (iF == iG) {
                return;
            } else {
                iF += iH;
            }
        }
    }

    private final void drawRawPoints(float[] fArr, Paint paint, int i10) {
        if (fArr.length % 2 != 0) {
            return;
        }
        g gVarU = n.u(n.v(0, fArr.length - 1), i10);
        int iF = gVarU.f();
        int iG = gVarU.g();
        int iH = gVarU.h();
        if ((iH <= 0 || iF > iG) && (iH >= 0 || iG > iF)) {
            return;
        }
        while (true) {
            this.internalCanvas.drawPoint(fArr[iF], fArr[iF + 1], paint.getInternalPaint());
            if (iF == iG) {
                return;
            } else {
                iF += iH;
            }
        }
    }

    public static /* synthetic */ void getInternalCanvas$annotations() {
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: clipPath-mtrdD-E, reason: not valid java name */
    public void mo1477clipPathmtrdDE(@NotNull Path path, int clipOp) {
        p.k(path, "path");
        android.graphics.Canvas canvas = this.internalCanvas;
        if (!(path instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(((AndroidPath) path).getInternalPath(), m1487toRegionOp7u2Bmg(clipOp));
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: clipRect-N_I0leg, reason: not valid java name */
    public void mo1478clipRectN_I0leg(float left, float top2, float right, float bottom, int clipOp) {
        this.internalCanvas.clipRect(left, top2, right, bottom, m1487toRegionOp7u2Bmg(clipOp));
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: concat-58bKbWc, reason: not valid java name */
    public void mo1479concat58bKbWc(@NotNull float[] matrix) {
        p.k(matrix, "matrix");
        if (MatrixKt.m1837isIdentity58bKbWc(matrix)) {
            return;
        }
        android.graphics.Matrix matrix2 = new android.graphics.Matrix();
        AndroidMatrixConversions_androidKt.m1494setFromEL8BTi8(matrix2, matrix);
        this.internalCanvas.concat(matrix2);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void disableZ() {
        CanvasUtils.INSTANCE.enableZ(this.internalCanvas, false);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawArc(float f10, float f11, float f12, float f13, float f14, float f15, boolean z10, @NotNull Paint paint) {
        p.k(paint, "paint");
        this.internalCanvas.drawArc(f10, f11, f12, f13, f14, f15, z10, paint.getInternalPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: drawCircle-9KIMszo, reason: not valid java name */
    public void mo1480drawCircle9KIMszo(long center, float radius, @NotNull Paint paint) {
        p.k(paint, "paint");
        this.internalCanvas.drawCircle(Offset.m1383getXimpl(center), Offset.m1384getYimpl(center), radius, paint.getInternalPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: drawImage-d-4ec7I, reason: not valid java name */
    public void mo1481drawImaged4ec7I(@NotNull ImageBitmap image, long topLeftOffset, @NotNull Paint paint) {
        p.k(image, "image");
        p.k(paint, "paint");
        this.internalCanvas.drawBitmap(AndroidImageBitmap_androidKt.asAndroidBitmap(image), Offset.m1383getXimpl(topLeftOffset), Offset.m1384getYimpl(topLeftOffset), paint.getInternalPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: drawImageRect-HPBpro0, reason: not valid java name */
    public void mo1482drawImageRectHPBpro0(@NotNull ImageBitmap image, long srcOffset, long srcSize, long dstOffset, long dstSize, @NotNull Paint paint) {
        p.k(image, "image");
        p.k(paint, "paint");
        android.graphics.Canvas canvas = this.internalCanvas;
        Bitmap bitmapAsAndroidBitmap = AndroidImageBitmap_androidKt.asAndroidBitmap(image);
        Rect rect = this.srcRect;
        rect.left = IntOffset.m3944getXimpl(srcOffset);
        rect.top = IntOffset.m3945getYimpl(srcOffset);
        rect.right = IntOffset.m3944getXimpl(srcOffset) + IntSize.m3986getWidthimpl(srcSize);
        rect.bottom = IntOffset.m3945getYimpl(srcOffset) + IntSize.m3985getHeightimpl(srcSize);
        r rVar = r.f5635a;
        Rect rect2 = this.dstRect;
        rect2.left = IntOffset.m3944getXimpl(dstOffset);
        rect2.top = IntOffset.m3945getYimpl(dstOffset);
        rect2.right = IntOffset.m3944getXimpl(dstOffset) + IntSize.m3986getWidthimpl(dstSize);
        rect2.bottom = IntOffset.m3945getYimpl(dstOffset) + IntSize.m3985getHeightimpl(dstSize);
        canvas.drawBitmap(bitmapAsAndroidBitmap, rect, rect2, paint.getInternalPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: drawLine-Wko1d7g, reason: not valid java name */
    public void mo1483drawLineWko1d7g(long p12, long p22, @NotNull Paint paint) {
        p.k(paint, "paint");
        this.internalCanvas.drawLine(Offset.m1383getXimpl(p12), Offset.m1384getYimpl(p12), Offset.m1383getXimpl(p22), Offset.m1384getYimpl(p22), paint.getInternalPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawOval(float f10, float f11, float f12, float f13, @NotNull Paint paint) {
        p.k(paint, "paint");
        this.internalCanvas.drawOval(f10, f11, f12, f13, paint.getInternalPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawPath(@NotNull Path path, @NotNull Paint paint) {
        p.k(path, "path");
        p.k(paint, "paint");
        android.graphics.Canvas canvas = this.internalCanvas;
        if (!(path instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((AndroidPath) path).getInternalPath(), paint.getInternalPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: drawPoints-O7TthRY, reason: not valid java name */
    public void mo1484drawPointsO7TthRY(int pointMode, @NotNull List<Offset> points, @NotNull Paint paint) {
        p.k(points, "points");
        p.k(paint, "paint");
        PointMode.Companion companion = PointMode.INSTANCE;
        if (PointMode.m1880equalsimpl0(pointMode, companion.m1884getLinesr_lszbg())) {
            drawLines(points, paint, 2);
        } else if (PointMode.m1880equalsimpl0(pointMode, companion.m1886getPolygonr_lszbg())) {
            drawLines(points, paint, 1);
        } else if (PointMode.m1880equalsimpl0(pointMode, companion.m1885getPointsr_lszbg())) {
            drawPoints(points, paint);
        }
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: drawRawPoints-O7TthRY, reason: not valid java name */
    public void mo1485drawRawPointsO7TthRY(int pointMode, @NotNull float[] points, @NotNull Paint paint) {
        p.k(points, "points");
        p.k(paint, "paint");
        if (points.length % 2 != 0) {
            throw new IllegalArgumentException("points must have an even number of values");
        }
        PointMode.Companion companion = PointMode.INSTANCE;
        if (PointMode.m1880equalsimpl0(pointMode, companion.m1884getLinesr_lszbg())) {
            drawRawLines(points, paint, 2);
        } else if (PointMode.m1880equalsimpl0(pointMode, companion.m1886getPolygonr_lszbg())) {
            drawRawLines(points, paint, 1);
        } else if (PointMode.m1880equalsimpl0(pointMode, companion.m1885getPointsr_lszbg())) {
            drawRawPoints(points, paint, 2);
        }
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawRect(float f10, float f11, float f12, float f13, @NotNull Paint paint) {
        p.k(paint, "paint");
        this.internalCanvas.drawRect(f10, f11, f12, f13, paint.getInternalPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawRoundRect(float f10, float f11, float f12, float f13, float f14, float f15, @NotNull Paint paint) {
        p.k(paint, "paint");
        this.internalCanvas.drawRoundRect(f10, f11, f12, f13, f14, f15, paint.getInternalPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: drawVertices-TPEHhCM, reason: not valid java name */
    public void mo1486drawVerticesTPEHhCM(@NotNull Vertices vertices, int blendMode, @NotNull Paint paint) {
        p.k(vertices, "vertices");
        p.k(paint, "paint");
        this.internalCanvas.drawVertices(AndroidVertexMode_androidKt.m1527toAndroidVertexModeJOOmi9M(vertices.getVertexMode()), vertices.getPositions().length, vertices.getPositions(), 0, vertices.getTextureCoordinates(), 0, vertices.getColors(), 0, vertices.getIndices(), 0, vertices.getIndices().length, paint.getInternalPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void enableZ() {
        CanvasUtils.INSTANCE.enableZ(this.internalCanvas, true);
    }

    @NotNull
    public final android.graphics.Canvas getInternalCanvas() {
        return this.internalCanvas;
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void restore() {
        this.internalCanvas.restore();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void rotate(float f10) {
        this.internalCanvas.rotate(f10);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void save() {
        this.internalCanvas.save();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void saveLayer(@NotNull androidx.compose.ui.geometry.Rect rect, @NotNull Paint paint) {
        p.k(rect, "bounds");
        p.k(paint, "paint");
        this.internalCanvas.saveLayer(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), paint.getInternalPaint(), 31);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void scale(float f10, float f11) {
        this.internalCanvas.scale(f10, f11);
    }

    public final void setInternalCanvas(@NotNull android.graphics.Canvas canvas) {
        p.k(canvas, "<set-?>");
        this.internalCanvas = canvas;
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void skew(float f10, float f11) {
        this.internalCanvas.skew(f10, f11);
    }

    @NotNull
    /* JADX INFO: renamed from: toRegionOp--7u2Bmg, reason: not valid java name */
    public final Region.Op m1487toRegionOp7u2Bmg(int i10) {
        return ClipOp.m1603equalsimpl0(i10, ClipOp.INSTANCE.m1607getDifferencertfAjoo()) ? Region.Op.DIFFERENCE : Region.Op.INTERSECT;
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void translate(float f10, float f11) {
        this.internalCanvas.translate(f10, f11);
    }
}
