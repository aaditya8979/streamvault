package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import io.bidmachine.iab.vast.tags.VastAttributes;
import io.bidmachine.iab.vast.tags.VastTagName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: Path.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u0000 J2\u00020\u0001:\u0001JJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H&J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H&J(\u0010\u0010\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H&J(\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0002H&J8\u0010\u0018\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002H&J8\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002H&J(\u0010\"\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 H\u0016J(\u0010%\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 H&J\u0010\u0010&\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001cH&J\u0010\u0010(\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u001cH&J \u0010)\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0002H&J \u0010*\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u0002H&J\u0010\u0010-\u001a\u00020\u00052\u0006\u0010,\u001a\u00020+H&J'\u00103\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\u00002\b\b\u0002\u00100\u001a\u00020/H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b1\u00102J\b\u00104\u001a\u00020\u0005H&J\b\u00105\u001a\u00020\u0005H&J\u001d\u00108\u001a\u00020\u00052\u0006\u00100\u001a\u00020/H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b6\u00107J\b\u00109\u001a\u00020\u001cH&J-\u0010@\u001a\u00020 2\u0006\u0010:\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\u00002\u0006\u0010=\u001a\u00020<H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b>\u0010?R%\u0010F\u001a\u00020A8&@&X¦\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u0014\u0010G\u001a\u00020 8&X¦\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0014\u0010I\u001a\u00020 8&X¦\u0004¢\u0006\u0006\u001a\u0004\bI\u0010Hø\u0001\u0003\u0082\u0002\u0015\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006KÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/Path;", "", "", VastAttributes.HORIZONTAL_POSITION, VastAttributes.VERTICAL_POSITION, "Lbn/r;", "moveTo", "dx", "dy", "relativeMoveTo", "lineTo", "relativeLineTo", "x1", "y1", "x2", "y2", "quadraticBezierTo", "dx1", "dy1", "dx2", "dy2", "relativeQuadraticBezierTo", "x3", "y3", "cubicTo", "dx3", "dy3", "relativeCubicTo", "Landroidx/compose/ui/geometry/Rect;", "rect", "startAngleRadians", "sweepAngleRadians", "", "forceMoveTo", "arcToRad", "startAngleDegrees", "sweepAngleDegrees", "arcTo", "addRect", "oval", "addOval", "addArcRad", "addArc", "Landroidx/compose/ui/geometry/RoundRect;", "roundRect", "addRoundRect", "path", "Landroidx/compose/ui/geometry/Offset;", TypedValues.CycleType.S_WAVE_OFFSET, "addPath-Uv8p0NA", "(Landroidx/compose/ui/graphics/Path;J)V", "addPath", "close", "reset", "translate-k-4lQ0M", "(J)V", "translate", "getBounds", "path1", "path2", "Landroidx/compose/ui/graphics/PathOperation;", "operation", "op-N5in7k0", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Path;I)Z", "op", "Landroidx/compose/ui/graphics/PathFillType;", "getFillType-Rg-k1Os", "()I", "setFillType-oQ8Xj4U", "(I)V", "fillType", "isConvex", "()Z", "isEmpty", VastTagName.COMPANION, "ui-graphics_release"}, k = 1, mv = {1, 6, 0})
public interface Path {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: Path.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J+\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/graphics/Path$Companion;", "", "()V", "combine", "Landroidx/compose/ui/graphics/Path;", "operation", "Landroidx/compose/ui/graphics/PathOperation;", "path1", "path2", "combine-xh6zSI8", "(ILandroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Path;)Landroidx/compose/ui/graphics/Path;", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        /* JADX INFO: renamed from: combine-xh6zSI8, reason: not valid java name */
        public final Path m1852combinexh6zSI8(int operation, @NotNull Path path1, @NotNull Path path2) {
            p.k(path1, "path1");
            p.k(path2, "path2");
            Path Path = AndroidPath_androidKt.Path();
            if (Path.mo1516opN5in7k0(path1, path2, operation)) {
                return Path;
            }
            throw new IllegalArgumentException("Path.combine() failed.  This may be due an invalid path; in particular, check for NaN values.");
        }
    }

    /* JADX INFO: compiled from: Path.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static void arcToRad(@NotNull Path path, @NotNull Rect rect, float f10, float f11, boolean z10) {
            p.k(rect, "rect");
            Path.super.arcToRad(rect, f10, f11, z10);
        }
    }

    /* JADX INFO: renamed from: addPath-Uv8p0NA$default, reason: not valid java name */
    static /* synthetic */ void m1851addPathUv8p0NA$default(Path path, Path path2, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPath-Uv8p0NA");
        }
        if ((i10 & 2) != 0) {
            j10 = Offset.INSTANCE.m1399getZeroF1C5BW0();
        }
        path.mo1514addPathUv8p0NA(path2, j10);
    }

    void addArc(@NotNull Rect rect, float f10, float f11);

    void addArcRad(@NotNull Rect rect, float f10, float f11);

    void addOval(@NotNull Rect rect);

    /* JADX INFO: renamed from: addPath-Uv8p0NA */
    void mo1514addPathUv8p0NA(@NotNull Path path, long offset);

    void addRect(@NotNull Rect rect);

    void addRoundRect(@NotNull RoundRect roundRect);

    void arcTo(@NotNull Rect rect, float f10, float f11, boolean z10);

    default void arcToRad(@NotNull Rect rect, float f10, float f11, boolean z10) {
        p.k(rect, "rect");
        arcTo(rect, DegreesKt.degrees(f10), DegreesKt.degrees(f11), z10);
    }

    void close();

    void cubicTo(float f10, float f11, float f12, float f13, float f14, float f15);

    @NotNull
    Rect getBounds();

    /* JADX INFO: renamed from: getFillType-Rg-k1Os */
    int mo1515getFillTypeRgk1Os();

    boolean isConvex();

    boolean isEmpty();

    void lineTo(float f10, float f11);

    void moveTo(float f10, float f11);

    /* JADX INFO: renamed from: op-N5in7k0 */
    boolean mo1516opN5in7k0(@NotNull Path path1, @NotNull Path path2, int operation);

    void quadraticBezierTo(float f10, float f11, float f12, float f13);

    void relativeCubicTo(float f10, float f11, float f12, float f13, float f14, float f15);

    void relativeLineTo(float f10, float f11);

    void relativeMoveTo(float f10, float f11);

    void relativeQuadraticBezierTo(float f10, float f11, float f12, float f13);

    void reset();

    /* JADX INFO: renamed from: setFillType-oQ8Xj4U */
    void mo1517setFillTypeoQ8Xj4U(int i10);

    /* JADX INFO: renamed from: translate-k-4lQ0M */
    void mo1518translatek4lQ0M(long offset);
}
