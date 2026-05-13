package androidx.compose.ui.platform;

import android.graphics.Outline;
import android.os.Build;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.ironsource.C3978d4;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: OutlineResolver.android.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\bM\u0010NJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002J3\u0010\u0016\u001a\u00020\u0013*\u0004\u0018\u00010\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J6\u0010 \u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eJ\u001b\u0010$\u001a\u00020\u00132\u0006\u0010!\u001a\u00020\rø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#J\u000e\u0010\u001a\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%J\u001b\u0010 \u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010(R\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010)R\u0016\u0010*\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001f\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0010\u0010/R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u00100R\u0018\u00101\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00103\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00102R\u0016\u00104\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010+R\u0016\u00105\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010+R\u0018\u00106\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00102R\u0018\u00107\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u00109\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u001f\u0010;\u001a\u00020\r8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b;\u0010/R\u001f\u0010<\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b<\u0010/R\u0016\u0010=\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010+R\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010>R\u0018\u0010?\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u00102R\u0018\u0010@\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u00102R\u0018\u0010B\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0013\u0010F\u001a\u0004\u0018\u00010,8F¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0011\u0010I\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0013\u0010L\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\bJ\u0010K\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006O"}, d2 = {"Landroidx/compose/ui/platform/OutlineResolver;", "", "Lbn/r;", "updateCache", "Landroidx/compose/ui/geometry/Rect;", "rect", "updateCacheWithRect", "Landroidx/compose/ui/geometry/RoundRect;", "roundRect", "updateCacheWithRoundRect", "Landroidx/compose/ui/graphics/Path;", "composePath", "updateCacheWithPath", "Landroidx/compose/ui/geometry/Offset;", TypedValues.CycleType.S_WAVE_OFFSET, "Landroidx/compose/ui/geometry/Size;", "size", "", "radius", "", "isSameBounds-4L21HEs", "(Landroidx/compose/ui/geometry/RoundRect;JJF)Z", "isSameBounds", "Landroidx/compose/ui/graphics/Shape;", "shape", "alpha", "clipToOutline", "elevation", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/Density;", "density", "update", C3978d4.i.L, "isInOutline-k-4lQ0M", "(J)Z", "isInOutline", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "update-uvyYCjk", "(J)V", "Landroidx/compose/ui/unit/Density;", "isSupportedOutline", "Z", "Landroid/graphics/Outline;", "cachedOutline", "Landroid/graphics/Outline;", "J", "Landroidx/compose/ui/graphics/Shape;", "cachedRrectPath", "Landroidx/compose/ui/graphics/Path;", "outlinePath", "cacheIsDirty", "usePathForClip", "tmpPath", "tmpRoundRect", "Landroidx/compose/ui/geometry/RoundRect;", "roundedCornerRadius", "F", "rectTopLeft", "rectSize", "outlineNeeded", "Landroidx/compose/ui/unit/LayoutDirection;", "tmpTouchPointPath", "tmpOpPath", "Landroidx/compose/ui/graphics/Outline;", "calculatedOutline", "Landroidx/compose/ui/graphics/Outline;", "getOutline", "()Landroid/graphics/Outline;", "outline", "getOutlineClipSupported", "()Z", "outlineClipSupported", "getClipPath", "()Landroidx/compose/ui/graphics/Path;", "clipPath", "<init>", "(Landroidx/compose/ui/unit/Density;)V", "ui_release"}, k = 1, mv = {1, 6, 0})
public final class OutlineResolver {
    private boolean cacheIsDirty;

    @NotNull
    private final Outline cachedOutline;

    @Nullable
    private Path cachedRrectPath;

    @Nullable
    private androidx.compose.ui.graphics.Outline calculatedOutline;

    @NotNull
    private Density density;
    private boolean isSupportedOutline;

    @NotNull
    private LayoutDirection layoutDirection;
    private boolean outlineNeeded;

    @Nullable
    private Path outlinePath;
    private long rectSize;
    private long rectTopLeft;
    private float roundedCornerRadius;

    @NotNull
    private Shape shape;
    private long size;

    @Nullable
    private Path tmpOpPath;

    @Nullable
    private Path tmpPath;

    @Nullable
    private RoundRect tmpRoundRect;

    @Nullable
    private Path tmpTouchPointPath;
    private boolean usePathForClip;

    public OutlineResolver(@NotNull Density density) {
        tn.p.k(density, "density");
        this.density = density;
        this.isSupportedOutline = true;
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.cachedOutline = outline;
        Size.Companion companion = Size.INSTANCE;
        this.size = companion.m1461getZeroNHjbRc();
        this.shape = RectangleShapeKt.getRectangleShape();
        this.rectTopLeft = Offset.INSTANCE.m1399getZeroF1C5BW0();
        this.rectSize = companion.m1461getZeroNHjbRc();
        this.layoutDirection = LayoutDirection.Ltr;
    }

    /* JADX INFO: renamed from: isSameBounds-4L21HEs, reason: not valid java name */
    private final boolean m3348isSameBounds4L21HEs(RoundRect roundRect, long j10, long j11, float f10) {
        if (roundRect == null || !RoundRectKt.isSimple(roundRect)) {
            return false;
        }
        if (!(roundRect.getLeft() == Offset.m1383getXimpl(j10))) {
            return false;
        }
        if (!(roundRect.getTop() == Offset.m1384getYimpl(j10))) {
            return false;
        }
        if (!(roundRect.getRight() == Offset.m1383getXimpl(j10) + Size.m1452getWidthimpl(j11))) {
            return false;
        }
        if (roundRect.getBottom() == Offset.m1384getYimpl(j10) + Size.m1449getHeightimpl(j11)) {
            return (CornerRadius.m1358getXimpl(roundRect.m1433getTopLeftCornerRadiuskKHJgLs()) > f10 ? 1 : (CornerRadius.m1358getXimpl(roundRect.m1433getTopLeftCornerRadiuskKHJgLs()) == f10 ? 0 : -1)) == 0;
        }
        return false;
    }

    private final void updateCache() {
        if (this.cacheIsDirty) {
            this.rectTopLeft = Offset.INSTANCE.m1399getZeroF1C5BW0();
            long j10 = this.size;
            this.rectSize = j10;
            this.roundedCornerRadius = 0.0f;
            this.outlinePath = null;
            this.cacheIsDirty = false;
            this.usePathForClip = false;
            if (!this.outlineNeeded || Size.m1452getWidthimpl(j10) <= 0.0f || Size.m1449getHeightimpl(this.size) <= 0.0f) {
                this.cachedOutline.setEmpty();
                return;
            }
            this.isSupportedOutline = true;
            androidx.compose.ui.graphics.Outline outlineMo199createOutlinePq9zytI = this.shape.mo199createOutlinePq9zytI(this.size, this.layoutDirection, this.density);
            this.calculatedOutline = outlineMo199createOutlinePq9zytI;
            if (outlineMo199createOutlinePq9zytI instanceof Outline.Rectangle) {
                updateCacheWithRect(((Outline.Rectangle) outlineMo199createOutlinePq9zytI).getRect());
            } else if (outlineMo199createOutlinePq9zytI instanceof Outline.Rounded) {
                updateCacheWithRoundRect(((Outline.Rounded) outlineMo199createOutlinePq9zytI).getRoundRect());
            } else if (outlineMo199createOutlinePq9zytI instanceof Outline.Generic) {
                updateCacheWithPath(((Outline.Generic) outlineMo199createOutlinePq9zytI).getPath());
            }
        }
    }

    private final void updateCacheWithPath(Path path) {
        if (Build.VERSION.SDK_INT > 28 || path.isConvex()) {
            android.graphics.Outline outline = this.cachedOutline;
            if (!(path instanceof AndroidPath)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            outline.setConvexPath(((AndroidPath) path).getInternalPath());
            this.usePathForClip = !this.cachedOutline.canClip();
        } else {
            this.isSupportedOutline = false;
            this.cachedOutline.setEmpty();
            this.usePathForClip = true;
        }
        this.outlinePath = path;
    }

    private final void updateCacheWithRect(Rect rect) {
        this.rectTopLeft = OffsetKt.Offset(rect.getLeft(), rect.getTop());
        this.rectSize = SizeKt.Size(rect.getWidth(), rect.getHeight());
        this.cachedOutline.setRect(vn.c.d(rect.getLeft()), vn.c.d(rect.getTop()), vn.c.d(rect.getRight()), vn.c.d(rect.getBottom()));
    }

    private final void updateCacheWithRoundRect(RoundRect roundRect) {
        float fM1358getXimpl = CornerRadius.m1358getXimpl(roundRect.m1433getTopLeftCornerRadiuskKHJgLs());
        this.rectTopLeft = OffsetKt.Offset(roundRect.getLeft(), roundRect.getTop());
        this.rectSize = SizeKt.Size(roundRect.getWidth(), roundRect.getHeight());
        if (RoundRectKt.isSimple(roundRect)) {
            this.cachedOutline.setRoundRect(vn.c.d(roundRect.getLeft()), vn.c.d(roundRect.getTop()), vn.c.d(roundRect.getRight()), vn.c.d(roundRect.getBottom()), fM1358getXimpl);
            this.roundedCornerRadius = fM1358getXimpl;
            return;
        }
        Path Path = this.cachedRrectPath;
        if (Path == null) {
            Path = AndroidPath_androidKt.Path();
            this.cachedRrectPath = Path;
        }
        Path.reset();
        Path.addRoundRect(roundRect);
        updateCacheWithPath(Path);
    }

    public final void clipToOutline(@NotNull Canvas canvas) {
        tn.p.k(canvas, "canvas");
        Path clipPath = getClipPath();
        if (clipPath != null) {
            Canvas.m1590clipPathmtrdDE$default(canvas, clipPath, 0, 2, null);
            return;
        }
        float f10 = this.roundedCornerRadius;
        if (f10 <= 0.0f) {
            Canvas.m1591clipRectN_I0leg$default(canvas, Offset.m1383getXimpl(this.rectTopLeft), Offset.m1384getYimpl(this.rectTopLeft), Offset.m1383getXimpl(this.rectTopLeft) + Size.m1452getWidthimpl(this.rectSize), Offset.m1384getYimpl(this.rectTopLeft) + Size.m1449getHeightimpl(this.rectSize), 0, 16, null);
            return;
        }
        Path Path = this.tmpPath;
        RoundRect roundRect = this.tmpRoundRect;
        if (Path == null || !m3348isSameBounds4L21HEs(roundRect, this.rectTopLeft, this.rectSize, f10)) {
            RoundRect roundRectM1437RoundRectgG7oq9Y = RoundRectKt.m1437RoundRectgG7oq9Y(Offset.m1383getXimpl(this.rectTopLeft), Offset.m1384getYimpl(this.rectTopLeft), Offset.m1383getXimpl(this.rectTopLeft) + Size.m1452getWidthimpl(this.rectSize), Offset.m1384getYimpl(this.rectTopLeft) + Size.m1449getHeightimpl(this.rectSize), CornerRadiusKt.CornerRadius$default(this.roundedCornerRadius, 0.0f, 2, null));
            if (Path == null) {
                Path = AndroidPath_androidKt.Path();
            } else {
                Path.reset();
            }
            Path.addRoundRect(roundRectM1437RoundRectgG7oq9Y);
            this.tmpRoundRect = roundRectM1437RoundRectgG7oq9Y;
            this.tmpPath = Path;
        }
        Canvas.m1590clipPathmtrdDE$default(canvas, Path, 0, 2, null);
    }

    @Nullable
    public final Path getClipPath() {
        updateCache();
        return this.outlinePath;
    }

    @Nullable
    public final android.graphics.Outline getOutline() {
        updateCache();
        if (this.outlineNeeded && this.isSupportedOutline) {
            return this.cachedOutline;
        }
        return null;
    }

    public final boolean getOutlineClipSupported() {
        return !this.usePathForClip;
    }

    /* JADX INFO: renamed from: isInOutline-k-4lQ0M, reason: not valid java name */
    public final boolean m3349isInOutlinek4lQ0M(long position) {
        androidx.compose.ui.graphics.Outline outline;
        if (this.outlineNeeded && (outline = this.calculatedOutline) != null) {
            return ShapeContainingUtilKt.isInOutline(outline, Offset.m1383getXimpl(position), Offset.m1384getYimpl(position), this.tmpTouchPointPath, this.tmpOpPath);
        }
        return true;
    }

    public final boolean update(@NotNull Shape shape, float alpha, boolean clipToOutline, float elevation, @NotNull LayoutDirection layoutDirection, @NotNull Density density) {
        tn.p.k(shape, "shape");
        tn.p.k(layoutDirection, "layoutDirection");
        tn.p.k(density, "density");
        this.cachedOutline.setAlpha(alpha);
        boolean z10 = !tn.p.f(this.shape, shape);
        if (z10) {
            this.shape = shape;
            this.cacheIsDirty = true;
        }
        boolean z11 = clipToOutline || elevation > 0.0f;
        if (this.outlineNeeded != z11) {
            this.outlineNeeded = z11;
            this.cacheIsDirty = true;
        }
        if (this.layoutDirection != layoutDirection) {
            this.layoutDirection = layoutDirection;
            this.cacheIsDirty = true;
        }
        if (!tn.p.f(this.density, density)) {
            this.density = density;
            this.cacheIsDirty = true;
        }
        return z10;
    }

    /* JADX INFO: renamed from: update-uvyYCjk, reason: not valid java name */
    public final void m3350updateuvyYCjk(long size) {
        if (Size.m1448equalsimpl0(this.size, size)) {
            return;
        }
        this.size = size;
        this.cacheIsDirty = true;
    }
}
