package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.vector.PathNode;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: PathParser.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0002efB\u0007¢\u0006\u0004\bc\u0010dJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\u0007\u001a\u00020\u0004*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\t\u001a\u00020\u0004*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\u000b\u001a\u00020\u0004*\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\r\u001a\u00020\u0004*\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\u000f\u001a\u00020\u0004*\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\u0011\u001a\u00020\u0004*\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\u0013\u001a\u00020\u0004*\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\u0015\u001a\u00020\u0004*\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\u0017\u001a\u00020\u0004*\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\u0019\u001a\u00020\u0004*\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\u001d\u001a\u00020\u0004*\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\u001f\u001a\u00020\u0004*\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010!\u001a\u00020\u0004*\u00020 2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010#\u001a\u00020\u0004*\u00020\"2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010&\u001a\u00020\u0004*\u00020$2\u0006\u0010%\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010(\u001a\u00020\u0004*\u00020'2\u0006\u0010%\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010*\u001a\u00020\u0004*\u00020)2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010,\u001a\u00020\u0004*\u00020+2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002JX\u00108\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u00022\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020.2\u0006\u00101\u001a\u00020.2\u0006\u00102\u001a\u00020.2\u0006\u00103\u001a\u00020.2\u0006\u00104\u001a\u00020.2\u0006\u00105\u001a\u00020.2\u0006\u00106\u001a\u00020\u001b2\u0006\u00107\u001a\u00020\u001bH\u0002JX\u0010?\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u00022\u0006\u00109\u001a\u00020.2\u0006\u0010:\u001a\u00020.2\u0006\u00103\u001a\u00020.2\u0006\u00104\u001a\u00020.2\u0006\u0010;\u001a\u00020.2\u0006\u0010<\u001a\u00020.2\u0006\u00105\u001a\u00020.2\u0006\u0010=\u001a\u00020.2\u0006\u0010>\u001a\u00020.H\u0002J\u0018\u0010D\u001a\u00020\u00042\u0006\u0010A\u001a\u00020@2\u0006\u0010C\u001a\u00020BH\u0002J\u0018\u0010I\u001a\u00020G2\u0006\u0010F\u001a\u00020E2\u0006\u0010H\u001a\u00020GH\u0002J\u0010\u0010J\u001a\u00020B2\u0006\u0010F\u001a\u00020EH\u0002J \u0010L\u001a\u00020B2\u0006\u0010K\u001a\u00020B2\u0006\u0010=\u001a\u00020G2\u0006\u0010H\u001a\u00020GH\u0002J \u0010O\u001a\u00020\u00042\u0006\u0010F\u001a\u00020E2\u0006\u0010=\u001a\u00020G2\u0006\u0010N\u001a\u00020MH\u0002J\f\u0010Q\u001a\u00020P*\u00020PH\u0002J\f\u0010Q\u001a\u00020.*\u00020.H\u0002J\u0006\u0010R\u001a\u00020\u0004J\u000e\u0010T\u001a\u00020\u00002\u0006\u0010S\u001a\u00020EJ\u0014\u0010X\u001a\u00020\u00002\f\u0010W\u001a\b\u0012\u0004\u0012\u00020V0UJ\f\u0010Y\u001a\b\u0012\u0004\u0012\u00020V0UJ\u0010\u0010Z\u001a\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0002R\u001a\u0010W\u001a\b\u0012\u0004\u0012\u00020V0[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010\\R\u0014\u0010^\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010`\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010_R\u0014\u0010a\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010_R\u0014\u0010b\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010_¨\u0006g"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathParser;", "", "Landroidx/compose/ui/graphics/Path;", TypedValues.AttributesType.S_TARGET, "Lbn/r;", "close", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeMoveTo;", "relativeMoveTo", "Landroidx/compose/ui/graphics/vector/PathNode$MoveTo;", "moveTo", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;", "relativeLineTo", "Landroidx/compose/ui/graphics/vector/PathNode$LineTo;", "lineTo", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeHorizontalTo;", "relativeHorizontalTo", "Landroidx/compose/ui/graphics/vector/PathNode$HorizontalTo;", "horizontalTo", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeVerticalTo;", "relativeVerticalTo", "Landroidx/compose/ui/graphics/vector/PathNode$VerticalTo;", "verticalTo", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeCurveTo;", "relativeCurveTo", "Landroidx/compose/ui/graphics/vector/PathNode$CurveTo;", "curveTo", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveCurveTo;", "", "prevIsCurve", "relativeReflectiveCurveTo", "Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveCurveTo;", "reflectiveCurveTo", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeQuadTo;", "relativeQuadTo", "Landroidx/compose/ui/graphics/vector/PathNode$QuadTo;", "quadTo", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveQuadTo;", "prevIsQuad", "relativeReflectiveQuadTo", "Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveQuadTo;", "reflectiveQuadTo", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeArcTo;", "relativeArcTo", "Landroidx/compose/ui/graphics/vector/PathNode$ArcTo;", "arcTo", "p", "", "x0", "y0", "x1", "y1", "a", "b", "theta", "isMoreThanHalf", "isPositiveArc", "drawArc", "cx", "cy", "e1x", "e1y", "start", "sweep", "arcToBezier", "", "cmd", "", "args", "addNode", "", "s", "", "end", "nextStart", "getFloats", "original", "copyOfRange", "Landroidx/compose/ui/graphics/vector/PathParser$ExtractFloatResult;", "result", "extract", "", "toRadians", "clear", "pathData", "parsePathString", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "nodes", "addPathNodes", "toNodes", "toPath", "", "Ljava/util/List;", "Landroidx/compose/ui/graphics/vector/PathParser$PathPoint;", "currentPoint", "Landroidx/compose/ui/graphics/vector/PathParser$PathPoint;", "ctrlPoint", "segmentPoint", "reflectiveCtrlPoint", "<init>", "()V", "ExtractFloatResult", "PathPoint", "ui-graphics_release"}, k = 1, mv = {1, 6, 0})
public final class PathParser {

    @NotNull
    private final PathPoint ctrlPoint;

    @NotNull
    private final PathPoint currentPoint;

    @NotNull
    private final List<PathNode> nodes = new ArrayList();

    @NotNull
    private final PathPoint reflectiveCtrlPoint;

    @NotNull
    private final PathPoint segmentPoint;

    /* JADX INFO: compiled from: PathParser.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathParser$ExtractFloatResult;", "", "endPosition", "", "endWithNegativeOrDot", "", "(IZ)V", "getEndPosition", "()I", "setEndPosition", "(I)V", "getEndWithNegativeOrDot", "()Z", "setEndWithNegativeOrDot", "(Z)V", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class ExtractFloatResult {
        private int endPosition;
        private boolean endWithNegativeOrDot;

        /* JADX WARN: Multi-variable type inference failed */
        public ExtractFloatResult() {
            this(0, 0 == true ? 1 : 0, 3, null);
        }

        public ExtractFloatResult(int i10, boolean z10) {
            this.endPosition = i10;
            this.endWithNegativeOrDot = z10;
        }

        public /* synthetic */ ExtractFloatResult(int i10, boolean z10, int i11, i iVar) {
            this((i11 & 1) != 0 ? 0 : i10, (i11 & 2) != 0 ? false : z10);
        }

        public static /* synthetic */ ExtractFloatResult copy$default(ExtractFloatResult extractFloatResult, int i10, boolean z10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = extractFloatResult.endPosition;
            }
            if ((i11 & 2) != 0) {
                z10 = extractFloatResult.endWithNegativeOrDot;
            }
            return extractFloatResult.copy(i10, z10);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getEndPosition() {
            return this.endPosition;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getEndWithNegativeOrDot() {
            return this.endWithNegativeOrDot;
        }

        @NotNull
        public final ExtractFloatResult copy(int endPosition, boolean endWithNegativeOrDot) {
            return new ExtractFloatResult(endPosition, endWithNegativeOrDot);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ExtractFloatResult)) {
                return false;
            }
            ExtractFloatResult extractFloatResult = (ExtractFloatResult) other;
            return this.endPosition == extractFloatResult.endPosition && this.endWithNegativeOrDot == extractFloatResult.endWithNegativeOrDot;
        }

        public final int getEndPosition() {
            return this.endPosition;
        }

        public final boolean getEndWithNegativeOrDot() {
            return this.endWithNegativeOrDot;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3 */
        public int hashCode() {
            int iHashCode = Integer.hashCode(this.endPosition) * 31;
            boolean z10 = this.endWithNegativeOrDot;
            ?? r12 = z10;
            if (z10) {
                r12 = 1;
            }
            return iHashCode + r12;
        }

        public final void setEndPosition(int i10) {
            this.endPosition = i10;
        }

        public final void setEndWithNegativeOrDot(boolean z10) {
            this.endWithNegativeOrDot = z10;
        }

        @NotNull
        public String toString() {
            return "ExtractFloatResult(endPosition=" + this.endPosition + ", endWithNegativeOrDot=" + this.endWithNegativeOrDot + ')';
        }
    }

    /* JADX INFO: compiled from: PathParser.kt */
    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0082\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathParser$PathPoint;", "", "Lbn/r;", "reset", "", "component1", "component2", VastAttributes.HORIZONTAL_POSITION, VastAttributes.VERTICAL_POSITION, "copy", "", "toString", "", "hashCode", "other", "", "equals", "F", "getX", "()F", "setX", "(F)V", "getY", "setY", "<init>", "(FF)V", "ui-graphics_release"}, k = 1, mv = {1, 6, 0})
    public static final /* data */ class PathPoint {
        private float x;
        private float y;

        /* JADX WARN: Illegal instructions before constructor call */
        public PathPoint() {
            float f10 = 0.0f;
            this(f10, f10, 3, null);
        }

        public PathPoint(float f10, float f11) {
            this.x = f10;
            this.y = f11;
        }

        public /* synthetic */ PathPoint(float f10, float f11, int i10, i iVar) {
            this((i10 & 1) != 0 ? 0.0f : f10, (i10 & 2) != 0 ? 0.0f : f11);
        }

        public static /* synthetic */ PathPoint copy$default(PathPoint pathPoint, float f10, float f11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = pathPoint.x;
            }
            if ((i10 & 2) != 0) {
                f11 = pathPoint.y;
            }
            return pathPoint.copy(f10, f11);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final float getX() {
            return this.x;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final float getY() {
            return this.y;
        }

        @NotNull
        public final PathPoint copy(float x10, float y10) {
            return new PathPoint(x10, y10);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PathPoint)) {
                return false;
            }
            PathPoint pathPoint = (PathPoint) other;
            return p.f(Float.valueOf(this.x), Float.valueOf(pathPoint.x)) && p.f(Float.valueOf(this.y), Float.valueOf(pathPoint.y));
        }

        public final float getX() {
            return this.x;
        }

        public final float getY() {
            return this.y;
        }

        public int hashCode() {
            return (Float.hashCode(this.x) * 31) + Float.hashCode(this.y);
        }

        public final void reset() {
            this.x = 0.0f;
            this.y = 0.0f;
        }

        public final void setX(float f10) {
            this.x = f10;
        }

        public final void setY(float f10) {
            this.y = f10;
        }

        @NotNull
        public String toString() {
            return "PathPoint(x=" + this.x + ", y=" + this.y + ')';
        }
    }

    public PathParser() {
        float f10 = 0.0f;
        int i10 = 3;
        i iVar = null;
        this.currentPoint = new PathPoint(f10, f10, i10, iVar);
        this.ctrlPoint = new PathPoint(f10, f10, i10, iVar);
        this.segmentPoint = new PathPoint(f10, f10, i10, iVar);
        this.reflectiveCtrlPoint = new PathPoint(f10, f10, i10, iVar);
    }

    private final void addNode(char c10, float[] fArr) {
        this.nodes.addAll(PathNodeKt.toPathNodes(c10, fArr));
    }

    private final void arcTo(PathNode.ArcTo arcTo, Path path) {
        drawArc(path, this.currentPoint.getX(), this.currentPoint.getY(), arcTo.getArcStartX(), arcTo.getArcStartY(), arcTo.getHorizontalEllipseRadius(), arcTo.getVerticalEllipseRadius(), arcTo.getTheta(), arcTo.isMoreThanHalf(), arcTo.isPositiveArc());
        this.currentPoint.setX(arcTo.getArcStartX());
        this.currentPoint.setY(arcTo.getArcStartY());
        this.ctrlPoint.setX(this.currentPoint.getX());
        this.ctrlPoint.setY(this.currentPoint.getY());
    }

    private final void arcToBezier(Path path, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18) {
        double d19 = d12;
        double d20 = 4;
        int iCeil = (int) Math.ceil(Math.abs((d18 * d20) / 3.141592653589793d));
        double dCos = Math.cos(d16);
        double dSin = Math.sin(d16);
        double dCos2 = Math.cos(d17);
        double dSin2 = Math.sin(d17);
        double d21 = -d19;
        double d22 = d21 * dCos;
        double d23 = d13 * dSin;
        double d24 = (d22 * dSin2) - (d23 * dCos2);
        double d25 = d21 * dSin;
        double d26 = d13 * dCos;
        double d27 = (dSin2 * d25) + (dCos2 * d26);
        double d28 = d18 / ((double) iCeil);
        double d29 = d14;
        double d30 = d27;
        double d31 = d24;
        int i10 = 0;
        double d32 = d15;
        double d33 = d17;
        while (i10 < iCeil) {
            double d34 = d33 + d28;
            double dSin3 = Math.sin(d34);
            double dCos3 = Math.cos(d34);
            int i11 = iCeil;
            double d35 = (d10 + ((d19 * dCos) * dCos3)) - (d23 * dSin3);
            double d36 = d11 + (d19 * dSin * dCos3) + (d26 * dSin3);
            double d37 = (d22 * dSin3) - (d23 * dCos3);
            double d38 = (dSin3 * d25) + (dCos3 * d26);
            double d39 = d34 - d33;
            double dTan = Math.tan(d39 / ((double) 2));
            double dSin4 = (Math.sin(d39) * (Math.sqrt(d20 + ((3.0d * dTan) * dTan)) - ((double) 1))) / ((double) 3);
            path.cubicTo((float) (d29 + (d31 * dSin4)), (float) (d32 + (d30 * dSin4)), (float) (d35 - (dSin4 * d37)), (float) (d36 - (dSin4 * d38)), (float) d35, (float) d36);
            i10++;
            d28 = d28;
            dSin = dSin;
            d29 = d35;
            d25 = d25;
            d33 = d34;
            d30 = d38;
            d20 = d20;
            d31 = d37;
            dCos = dCos;
            iCeil = i11;
            d32 = d36;
            d19 = d12;
        }
    }

    private final void close(Path path) {
        this.currentPoint.setX(this.segmentPoint.getX());
        this.currentPoint.setY(this.segmentPoint.getY());
        this.ctrlPoint.setX(this.segmentPoint.getX());
        this.ctrlPoint.setY(this.segmentPoint.getY());
        path.close();
        path.moveTo(this.currentPoint.getX(), this.currentPoint.getY());
    }

    private final float[] copyOfRange(float[] original, int start, int end) {
        if (start > end) {
            throw new IllegalArgumentException();
        }
        int length = original.length;
        if (start < 0 || start > length) {
            throw new IndexOutOfBoundsException();
        }
        int i10 = end - start;
        int iMin = Math.min(i10, length - start);
        float[] fArr = new float[i10];
        cn.p.i(original, fArr, 0, start, iMin + start);
        return fArr;
    }

    private final void curveTo(PathNode.CurveTo curveTo, Path path) {
        path.cubicTo(curveTo.getX1(), curveTo.getY1(), curveTo.getX2(), curveTo.getY2(), curveTo.getX3(), curveTo.getY3());
        this.ctrlPoint.setX(curveTo.getX2());
        this.ctrlPoint.setY(curveTo.getY2());
        this.currentPoint.setX(curveTo.getX3());
        this.currentPoint.setY(curveTo.getY3());
    }

    private final void drawArc(Path path, double d10, double d11, double d12, double d13, double d14, double d15, double d16, boolean z10, boolean z11) {
        double d17;
        double d18;
        double radians = toRadians(d16);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d19 = ((d10 * dCos) + (d11 * dSin)) / d14;
        double d20 = (((-d10) * dSin) + (d11 * dCos)) / d15;
        double d21 = ((d12 * dCos) + (d13 * dSin)) / d14;
        double d22 = (((-d12) * dSin) + (d13 * dCos)) / d15;
        double d23 = d19 - d21;
        double d24 = d20 - d22;
        double d25 = 2;
        double d26 = (d19 + d21) / d25;
        double d27 = (d20 + d22) / d25;
        double d28 = (d23 * d23) + (d24 * d24);
        if (d28 == 0.0d) {
            return;
        }
        double d29 = (1.0d / d28) - 0.25d;
        if (d29 < 0.0d) {
            double dSqrt = (float) (Math.sqrt(d28) / 1.99999d);
            drawArc(path, d10, d11, d12, d13, d14 * dSqrt, d15 * dSqrt, d16, z10, z11);
            return;
        }
        double dSqrt2 = Math.sqrt(d29);
        double d30 = d23 * dSqrt2;
        double d31 = dSqrt2 * d24;
        if (z10 == z11) {
            d17 = d26 - d31;
            d18 = d27 + d30;
        } else {
            d17 = d26 + d31;
            d18 = d27 - d30;
        }
        double dAtan2 = Math.atan2(d20 - d18, d19 - d17);
        double dAtan22 = Math.atan2(d22 - d18, d21 - d17) - dAtan2;
        if (z11 != (dAtan22 >= 0.0d)) {
            dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
        }
        double d32 = d17 * d14;
        double d33 = d18 * d15;
        arcToBezier(path, (d32 * dCos) - (d33 * dSin), (d32 * dSin) + (d33 * dCos), d14, d15, d10, d11, radians, dAtan2, dAtan22);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0051 A[LOOP:0: B:3:0x0008->B:36:0x0051, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0054 A[EDGE_INSN: B:40:0x0054->B:37:0x0054 BREAK  A[LOOP:0: B:3:0x0008->B:36:0x0051], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void extract(java.lang.String r9, int r10, androidx.compose.ui.graphics.vector.PathParser.ExtractFloatResult r11) {
        /*
            r8 = this;
            r0 = 0
            r11.setEndWithNegativeOrDot(r0)
            r1 = r10
            r2 = r0
            r3 = r2
            r4 = r3
        L8:
            int r5 = r9.length()
            if (r1 >= r5) goto L54
            char r5 = r9.charAt(r1)
            r6 = 32
            r7 = 1
            if (r5 != r6) goto L19
        L17:
            r6 = r7
            goto L1f
        L19:
            r6 = 44
            if (r5 != r6) goto L1e
            goto L17
        L1e:
            r6 = r0
        L1f:
            if (r6 == 0) goto L24
        L21:
            r2 = r0
            r4 = r7
            goto L4e
        L24:
            r6 = 45
            if (r5 != r6) goto L30
            if (r1 == r10) goto L4d
            if (r2 != 0) goto L4d
            r11.setEndWithNegativeOrDot(r7)
            goto L21
        L30:
            r2 = 46
            if (r5 != r2) goto L3d
            if (r3 != 0) goto L39
            r2 = r0
            r3 = r7
            goto L4e
        L39:
            r11.setEndWithNegativeOrDot(r7)
            goto L21
        L3d:
            r2 = 101(0x65, float:1.42E-43)
            if (r5 != r2) goto L43
        L41:
            r2 = r7
            goto L49
        L43:
            r2 = 69
            if (r5 != r2) goto L48
            goto L41
        L48:
            r2 = r0
        L49:
            if (r2 == 0) goto L4d
            r2 = r7
            goto L4e
        L4d:
            r2 = r0
        L4e:
            if (r4 == 0) goto L51
            goto L54
        L51:
            int r1 = r1 + 1
            goto L8
        L54:
            r11.setEndPosition(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.PathParser.extract(java.lang.String, int, androidx.compose.ui.graphics.vector.PathParser$ExtractFloatResult):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final float[] getFloats(String s10) {
        int i10 = 0;
        Object[] objArr = 0;
        if (s10.charAt(0) == 'z' || s10.charAt(0) == 'Z') {
            return new float[0];
        }
        float[] fArr = new float[s10.length()];
        ExtractFloatResult extractFloatResult = new ExtractFloatResult(i10, objArr == true ? 1 : 0, 3, null);
        int length = s10.length();
        int i11 = 1;
        int i12 = 0;
        while (i11 < length) {
            extract(s10, i11, extractFloatResult);
            int endPosition = extractFloatResult.getEndPosition();
            if (i11 < endPosition) {
                String strSubstring = s10.substring(i11, endPosition);
                p.j(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                fArr[i12] = Float.parseFloat(strSubstring);
                i12++;
            }
            i11 = extractFloatResult.getEndWithNegativeOrDot() ? endPosition : endPosition + 1;
        }
        return copyOfRange(fArr, 0, i12);
    }

    private final void horizontalTo(PathNode.HorizontalTo horizontalTo, Path path) {
        path.lineTo(horizontalTo.getX(), this.currentPoint.getY());
        this.currentPoint.setX(horizontalTo.getX());
    }

    private final void lineTo(PathNode.LineTo lineTo, Path path) {
        path.lineTo(lineTo.getX(), lineTo.getY());
        this.currentPoint.setX(lineTo.getX());
        this.currentPoint.setY(lineTo.getY());
    }

    private final void moveTo(PathNode.MoveTo moveTo, Path path) {
        this.currentPoint.setX(moveTo.getX());
        this.currentPoint.setY(moveTo.getY());
        path.moveTo(moveTo.getX(), moveTo.getY());
        this.segmentPoint.setX(this.currentPoint.getX());
        this.segmentPoint.setY(this.currentPoint.getY());
    }

    private final int nextStart(String s10, int end) {
        while (end < s10.length()) {
            char cCharAt = s10.charAt(end);
            if (((cCharAt - 'A') * (cCharAt - 'Z') <= 0 || (cCharAt - 'a') * (cCharAt - 'z') <= 0) && cCharAt != 'e' && cCharAt != 'E') {
                return end;
            }
            end++;
        }
        return end;
    }

    private final void quadTo(PathNode.QuadTo quadTo, Path path) {
        path.quadraticBezierTo(quadTo.getX1(), quadTo.getY1(), quadTo.getX2(), quadTo.getY2());
        this.ctrlPoint.setX(quadTo.getX1());
        this.ctrlPoint.setY(quadTo.getY1());
        this.currentPoint.setX(quadTo.getX2());
        this.currentPoint.setY(quadTo.getY2());
    }

    private final void reflectiveCurveTo(PathNode.ReflectiveCurveTo reflectiveCurveTo, boolean z10, Path path) {
        if (z10) {
            float f10 = 2;
            this.reflectiveCtrlPoint.setX((this.currentPoint.getX() * f10) - this.ctrlPoint.getX());
            this.reflectiveCtrlPoint.setY((f10 * this.currentPoint.getY()) - this.ctrlPoint.getY());
        } else {
            this.reflectiveCtrlPoint.setX(this.currentPoint.getX());
            this.reflectiveCtrlPoint.setY(this.currentPoint.getY());
        }
        path.cubicTo(this.reflectiveCtrlPoint.getX(), this.reflectiveCtrlPoint.getY(), reflectiveCurveTo.getX1(), reflectiveCurveTo.getY1(), reflectiveCurveTo.getX2(), reflectiveCurveTo.getY2());
        this.ctrlPoint.setX(reflectiveCurveTo.getX1());
        this.ctrlPoint.setY(reflectiveCurveTo.getY1());
        this.currentPoint.setX(reflectiveCurveTo.getX2());
        this.currentPoint.setY(reflectiveCurveTo.getY2());
    }

    private final void reflectiveQuadTo(PathNode.ReflectiveQuadTo reflectiveQuadTo, boolean z10, Path path) {
        if (z10) {
            float f10 = 2;
            this.reflectiveCtrlPoint.setX((this.currentPoint.getX() * f10) - this.ctrlPoint.getX());
            this.reflectiveCtrlPoint.setY((f10 * this.currentPoint.getY()) - this.ctrlPoint.getY());
        } else {
            this.reflectiveCtrlPoint.setX(this.currentPoint.getX());
            this.reflectiveCtrlPoint.setY(this.currentPoint.getY());
        }
        path.quadraticBezierTo(this.reflectiveCtrlPoint.getX(), this.reflectiveCtrlPoint.getY(), reflectiveQuadTo.getX(), reflectiveQuadTo.getY());
        this.ctrlPoint.setX(this.reflectiveCtrlPoint.getX());
        this.ctrlPoint.setY(this.reflectiveCtrlPoint.getY());
        this.currentPoint.setX(reflectiveQuadTo.getX());
        this.currentPoint.setY(reflectiveQuadTo.getY());
    }

    private final void relativeArcTo(PathNode.RelativeArcTo relativeArcTo, Path path) {
        float arcStartDx = relativeArcTo.getArcStartDx() + this.currentPoint.getX();
        float arcStartDy = relativeArcTo.getArcStartDy() + this.currentPoint.getY();
        drawArc(path, this.currentPoint.getX(), this.currentPoint.getY(), arcStartDx, arcStartDy, relativeArcTo.getHorizontalEllipseRadius(), relativeArcTo.getVerticalEllipseRadius(), relativeArcTo.getTheta(), relativeArcTo.isMoreThanHalf(), relativeArcTo.isPositiveArc());
        this.currentPoint.setX(arcStartDx);
        this.currentPoint.setY(arcStartDy);
        this.ctrlPoint.setX(this.currentPoint.getX());
        this.ctrlPoint.setY(this.currentPoint.getY());
    }

    private final void relativeCurveTo(PathNode.RelativeCurveTo relativeCurveTo, Path path) {
        path.relativeCubicTo(relativeCurveTo.getDx1(), relativeCurveTo.getDy1(), relativeCurveTo.getDx2(), relativeCurveTo.getDy2(), relativeCurveTo.getDx3(), relativeCurveTo.getDy3());
        this.ctrlPoint.setX(this.currentPoint.getX() + relativeCurveTo.getDx2());
        this.ctrlPoint.setY(this.currentPoint.getY() + relativeCurveTo.getDy2());
        PathPoint pathPoint = this.currentPoint;
        pathPoint.setX(pathPoint.getX() + relativeCurveTo.getDx3());
        PathPoint pathPoint2 = this.currentPoint;
        pathPoint2.setY(pathPoint2.getY() + relativeCurveTo.getDy3());
    }

    private final void relativeHorizontalTo(PathNode.RelativeHorizontalTo relativeHorizontalTo, Path path) {
        path.relativeLineTo(relativeHorizontalTo.getDx(), 0.0f);
        PathPoint pathPoint = this.currentPoint;
        pathPoint.setX(pathPoint.getX() + relativeHorizontalTo.getDx());
    }

    private final void relativeLineTo(PathNode.RelativeLineTo relativeLineTo, Path path) {
        path.relativeLineTo(relativeLineTo.getDx(), relativeLineTo.getDy());
        PathPoint pathPoint = this.currentPoint;
        pathPoint.setX(pathPoint.getX() + relativeLineTo.getDx());
        PathPoint pathPoint2 = this.currentPoint;
        pathPoint2.setY(pathPoint2.getY() + relativeLineTo.getDy());
    }

    private final void relativeMoveTo(PathNode.RelativeMoveTo relativeMoveTo, Path path) {
        PathPoint pathPoint = this.currentPoint;
        pathPoint.setX(pathPoint.getX() + relativeMoveTo.getDx());
        PathPoint pathPoint2 = this.currentPoint;
        pathPoint2.setY(pathPoint2.getY() + relativeMoveTo.getDy());
        path.relativeMoveTo(relativeMoveTo.getDx(), relativeMoveTo.getDy());
        this.segmentPoint.setX(this.currentPoint.getX());
        this.segmentPoint.setY(this.currentPoint.getY());
    }

    private final void relativeQuadTo(PathNode.RelativeQuadTo relativeQuadTo, Path path) {
        path.relativeQuadraticBezierTo(relativeQuadTo.getDx1(), relativeQuadTo.getDy1(), relativeQuadTo.getDx2(), relativeQuadTo.getDy2());
        this.ctrlPoint.setX(this.currentPoint.getX() + relativeQuadTo.getDx1());
        this.ctrlPoint.setY(this.currentPoint.getY() + relativeQuadTo.getDy1());
        PathPoint pathPoint = this.currentPoint;
        pathPoint.setX(pathPoint.getX() + relativeQuadTo.getDx2());
        PathPoint pathPoint2 = this.currentPoint;
        pathPoint2.setY(pathPoint2.getY() + relativeQuadTo.getDy2());
    }

    private final void relativeReflectiveCurveTo(PathNode.RelativeReflectiveCurveTo relativeReflectiveCurveTo, boolean z10, Path path) {
        if (z10) {
            this.reflectiveCtrlPoint.setX(this.currentPoint.getX() - this.ctrlPoint.getX());
            this.reflectiveCtrlPoint.setY(this.currentPoint.getY() - this.ctrlPoint.getY());
        } else {
            this.reflectiveCtrlPoint.reset();
        }
        path.relativeCubicTo(this.reflectiveCtrlPoint.getX(), this.reflectiveCtrlPoint.getY(), relativeReflectiveCurveTo.getDx1(), relativeReflectiveCurveTo.getDy1(), relativeReflectiveCurveTo.getDx2(), relativeReflectiveCurveTo.getDy2());
        this.ctrlPoint.setX(this.currentPoint.getX() + relativeReflectiveCurveTo.getDx1());
        this.ctrlPoint.setY(this.currentPoint.getY() + relativeReflectiveCurveTo.getDy1());
        PathPoint pathPoint = this.currentPoint;
        pathPoint.setX(pathPoint.getX() + relativeReflectiveCurveTo.getDx2());
        PathPoint pathPoint2 = this.currentPoint;
        pathPoint2.setY(pathPoint2.getY() + relativeReflectiveCurveTo.getDy2());
    }

    private final void relativeReflectiveQuadTo(PathNode.RelativeReflectiveQuadTo relativeReflectiveQuadTo, boolean z10, Path path) {
        if (z10) {
            this.reflectiveCtrlPoint.setX(this.currentPoint.getX() - this.ctrlPoint.getX());
            this.reflectiveCtrlPoint.setY(this.currentPoint.getY() - this.ctrlPoint.getY());
        } else {
            this.reflectiveCtrlPoint.reset();
        }
        path.relativeQuadraticBezierTo(this.reflectiveCtrlPoint.getX(), this.reflectiveCtrlPoint.getY(), relativeReflectiveQuadTo.getDx(), relativeReflectiveQuadTo.getDy());
        this.ctrlPoint.setX(this.currentPoint.getX() + this.reflectiveCtrlPoint.getX());
        this.ctrlPoint.setY(this.currentPoint.getY() + this.reflectiveCtrlPoint.getY());
        PathPoint pathPoint = this.currentPoint;
        pathPoint.setX(pathPoint.getX() + relativeReflectiveQuadTo.getDx());
        PathPoint pathPoint2 = this.currentPoint;
        pathPoint2.setY(pathPoint2.getY() + relativeReflectiveQuadTo.getDy());
    }

    private final void relativeVerticalTo(PathNode.RelativeVerticalTo relativeVerticalTo, Path path) {
        path.relativeLineTo(0.0f, relativeVerticalTo.getDy());
        PathPoint pathPoint = this.currentPoint;
        pathPoint.setY(pathPoint.getY() + relativeVerticalTo.getDy());
    }

    public static /* synthetic */ Path toPath$default(PathParser pathParser, Path path, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            path = AndroidPath_androidKt.Path();
        }
        return pathParser.toPath(path);
    }

    private final double toRadians(double d10) {
        return (d10 / ((double) BaseTransientBottomBar.ANIMATION_FADE_DURATION)) * 3.141592653589793d;
    }

    private final float toRadians(float f10) {
        return (f10 / 180.0f) * 3.1415927f;
    }

    private final void verticalTo(PathNode.VerticalTo verticalTo, Path path) {
        path.lineTo(this.currentPoint.getX(), verticalTo.getY());
        this.currentPoint.setY(verticalTo.getY());
    }

    @NotNull
    public final PathParser addPathNodes(@NotNull List<? extends PathNode> nodes) {
        p.k(nodes, "nodes");
        this.nodes.addAll(nodes);
        return this;
    }

    public final void clear() {
        this.nodes.clear();
    }

    @NotNull
    public final PathParser parsePathString(@NotNull String pathData) {
        p.k(pathData, "pathData");
        this.nodes.clear();
        int i10 = 0;
        int i11 = 1;
        while (i11 < pathData.length()) {
            int iNextStart = nextStart(pathData, i11);
            String strSubstring = pathData.substring(i10, iNextStart);
            p.j(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            int length = strSubstring.length() - 1;
            int i12 = 0;
            boolean z10 = false;
            while (i12 <= length) {
                boolean z11 = p.m(strSubstring.charAt(!z10 ? i12 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    }
                    length--;
                } else if (z11) {
                    i12++;
                } else {
                    z10 = true;
                }
            }
            String string = strSubstring.subSequence(i12, length + 1).toString();
            if (string.length() > 0) {
                addNode(string.charAt(0), getFloats(string));
            }
            i10 = iNextStart;
            i11 = iNextStart + 1;
        }
        if (i11 - i10 == 1 && i10 < pathData.length()) {
            addNode(pathData.charAt(i10), new float[0]);
        }
        return this;
    }

    @NotNull
    public final List<PathNode> toNodes() {
        return this.nodes;
    }

    @NotNull
    public final Path toPath(@NotNull Path target) {
        p.k(target, TypedValues.AttributesType.S_TARGET);
        target.reset();
        this.currentPoint.reset();
        this.ctrlPoint.reset();
        this.segmentPoint.reset();
        this.reflectiveCtrlPoint.reset();
        List<PathNode> list = this.nodes;
        int size = list.size();
        PathNode pathNode = null;
        int i10 = 0;
        while (i10 < size) {
            PathNode pathNode2 = list.get(i10);
            if (pathNode == null) {
                pathNode = pathNode2;
            }
            if (pathNode2 instanceof PathNode.Close) {
                close(target);
            } else if (pathNode2 instanceof PathNode.RelativeMoveTo) {
                relativeMoveTo((PathNode.RelativeMoveTo) pathNode2, target);
            } else if (pathNode2 instanceof PathNode.MoveTo) {
                moveTo((PathNode.MoveTo) pathNode2, target);
            } else if (pathNode2 instanceof PathNode.RelativeLineTo) {
                relativeLineTo((PathNode.RelativeLineTo) pathNode2, target);
            } else if (pathNode2 instanceof PathNode.LineTo) {
                lineTo((PathNode.LineTo) pathNode2, target);
            } else if (pathNode2 instanceof PathNode.RelativeHorizontalTo) {
                relativeHorizontalTo((PathNode.RelativeHorizontalTo) pathNode2, target);
            } else if (pathNode2 instanceof PathNode.HorizontalTo) {
                horizontalTo((PathNode.HorizontalTo) pathNode2, target);
            } else if (pathNode2 instanceof PathNode.RelativeVerticalTo) {
                relativeVerticalTo((PathNode.RelativeVerticalTo) pathNode2, target);
            } else if (pathNode2 instanceof PathNode.VerticalTo) {
                verticalTo((PathNode.VerticalTo) pathNode2, target);
            } else if (pathNode2 instanceof PathNode.RelativeCurveTo) {
                relativeCurveTo((PathNode.RelativeCurveTo) pathNode2, target);
            } else if (pathNode2 instanceof PathNode.CurveTo) {
                curveTo((PathNode.CurveTo) pathNode2, target);
            } else if (pathNode2 instanceof PathNode.RelativeReflectiveCurveTo) {
                p.h(pathNode);
                relativeReflectiveCurveTo((PathNode.RelativeReflectiveCurveTo) pathNode2, pathNode.getIsCurve(), target);
            } else if (pathNode2 instanceof PathNode.ReflectiveCurveTo) {
                p.h(pathNode);
                reflectiveCurveTo((PathNode.ReflectiveCurveTo) pathNode2, pathNode.getIsCurve(), target);
            } else if (pathNode2 instanceof PathNode.RelativeQuadTo) {
                relativeQuadTo((PathNode.RelativeQuadTo) pathNode2, target);
            } else if (pathNode2 instanceof PathNode.QuadTo) {
                quadTo((PathNode.QuadTo) pathNode2, target);
            } else if (pathNode2 instanceof PathNode.RelativeReflectiveQuadTo) {
                p.h(pathNode);
                relativeReflectiveQuadTo((PathNode.RelativeReflectiveQuadTo) pathNode2, pathNode.getIsQuad(), target);
            } else if (pathNode2 instanceof PathNode.ReflectiveQuadTo) {
                p.h(pathNode);
                reflectiveQuadTo((PathNode.ReflectiveQuadTo) pathNode2, pathNode.getIsQuad(), target);
            } else if (pathNode2 instanceof PathNode.RelativeArcTo) {
                relativeArcTo((PathNode.RelativeArcTo) pathNode2, target);
            } else if (pathNode2 instanceof PathNode.ArcTo) {
                arcTo((PathNode.ArcTo) pathNode2, target);
            }
            i10++;
            pathNode = pathNode2;
        }
        return target;
    }
}
