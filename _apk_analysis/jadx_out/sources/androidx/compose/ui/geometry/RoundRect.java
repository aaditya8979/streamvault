package androidx.compose.ui.geometry;

import androidx.compose.runtime.Immutable;
import io.bidmachine.iab.vast.tags.VastTagName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: RoundRect.kt */
/* JADX INFO: loaded from: classes6.dex */
@Immutable
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0018\b\u0087\b\u0018\u0000 A2\u00020\u0001:\u0001ABR\u0012\u0006\u0010\u001f\u001a\u00020\u0003\u0012\u0006\u0010 \u001a\u00020\u0003\u0012\u0006\u0010!\u001a\u00020\u0003\u0012\u0006\u0010\"\u001a\u00020\u0003\u0012\b\b\u0002\u0010#\u001a\u00020\u0015\u0012\b\b\u0002\u0010$\u001a\u00020\u0015\u0012\b\b\u0002\u0010%\u001a\u00020\u0015\u0012\b\b\u0002\u0010&\u001a\u00020\u0015ø\u0001\u0000¢\u0006\u0004\b?\u0010@J\b\u0010\u0002\u001a\u00020\u0000H\u0002J(\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0002J\u001b\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0010\u001a\u00020\u000fH\u0016J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\u0018\u001a\u00020\u0015HÆ\u0003ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\u0015HÆ\u0003ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u0017J\u0019\u0010\u001c\u001a\u00020\u0015HÆ\u0003ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u0017J\u0019\u0010\u001e\u001a\u00020\u0015HÆ\u0003ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u0017Jf\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\u00032\b\b\u0002\u0010#\u001a\u00020\u00152\b\b\u0002\u0010$\u001a\u00020\u00152\b\b\u0002\u0010%\u001a\u00020\u00152\b\b\u0002\u0010&\u001a\u00020\u0015HÆ\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010(J\t\u0010+\u001a\u00020*HÖ\u0001J\u0013\u0010-\u001a\u00020\u000b2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u001f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001f\u0010.\u001a\u0004\b/\u00100R\u0017\u0010 \u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b \u0010.\u001a\u0004\b1\u00100R\u0017\u0010!\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b!\u0010.\u001a\u0004\b2\u00100R\u0017\u0010\"\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\"\u0010.\u001a\u0004\b3\u00100R \u0010#\u001a\u00020\u00158\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b#\u00104\u001a\u0004\b5\u0010\u0017R \u0010$\u001a\u00020\u00158\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b$\u00104\u001a\u0004\b6\u0010\u0017R \u0010%\u001a\u00020\u00158\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b%\u00104\u001a\u0004\b7\u0010\u0017R \u0010&\u001a\u00020\u00158\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b&\u00104\u001a\u0004\b8\u0010\u0017R\u0018\u00109\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0011\u0010<\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b;\u00100R\u0011\u0010>\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b=\u00100\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006B"}, d2 = {"Landroidx/compose/ui/geometry/RoundRect;", "", "scaledRadiiRect", "", "min", "radius1", "radius2", "limit", "minRadius", "Landroidx/compose/ui/geometry/Offset;", "point", "", "contains-k-4lQ0M", "(J)Z", "contains", "", "toString", "component1", "component2", "component3", "component4", "Landroidx/compose/ui/geometry/CornerRadius;", "component5-kKHJgLs", "()J", "component5", "component6-kKHJgLs", "component6", "component7-kKHJgLs", "component7", "component8-kKHJgLs", "component8", "left", "top", "right", "bottom", "topLeftCornerRadius", "topRightCornerRadius", "bottomRightCornerRadius", "bottomLeftCornerRadius", "copy-MDFrsts", "(FFFFJJJJ)Landroidx/compose/ui/geometry/RoundRect;", "copy", "", "hashCode", "other", "equals", "F", "getLeft", "()F", "getTop", "getRight", "getBottom", "J", "getTopLeftCornerRadius-kKHJgLs", "getTopRightCornerRadius-kKHJgLs", "getBottomRightCornerRadius-kKHJgLs", "getBottomLeftCornerRadius-kKHJgLs", "_scaledRadiiRect", "Landroidx/compose/ui/geometry/RoundRect;", "getWidth", "width", "getHeight", "height", "<init>", "(FFFFJJJJLtn/i;)V", VastTagName.COMPANION, "ui-geometry_release"}, k = 1, mv = {1, 6, 0})
public final /* data */ class RoundRect {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final RoundRect Zero = RoundRectKt.m1437RoundRectgG7oq9Y(0.0f, 0.0f, 0.0f, 0.0f, CornerRadius.INSTANCE.m1368getZerokKHJgLs());

    @Nullable
    private RoundRect _scaledRadiiRect;
    private final float bottom;
    private final long bottomLeftCornerRadius;
    private final long bottomRightCornerRadius;
    private final float left;
    private final float right;
    private final float top;
    private final long topLeftCornerRadius;
    private final long topRightCornerRadius;

    /* JADX INFO: compiled from: RoundRect.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/geometry/RoundRect$Companion;", "", "()V", "Zero", "Landroidx/compose/ui/geometry/RoundRect;", "getZero$annotations", "getZero", "()Landroidx/compose/ui/geometry/RoundRect;", "ui-geometry_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public static /* synthetic */ void getZero$annotations() {
        }

        @NotNull
        public final RoundRect getZero() {
            return RoundRect.Zero;
        }
    }

    private RoundRect(float f10, float f11, float f12, float f13, long j10, long j11, long j12, long j13) {
        this.left = f10;
        this.top = f11;
        this.right = f12;
        this.bottom = f13;
        this.topLeftCornerRadius = j10;
        this.topRightCornerRadius = j11;
        this.bottomRightCornerRadius = j12;
        this.bottomLeftCornerRadius = j13;
    }

    public /* synthetic */ RoundRect(float f10, float f11, float f12, float f13, long j10, long j11, long j12, long j13, int i10, i iVar) {
        this(f10, f11, f12, f13, (i10 & 16) != 0 ? CornerRadius.INSTANCE.m1368getZerokKHJgLs() : j10, (i10 & 32) != 0 ? CornerRadius.INSTANCE.m1368getZerokKHJgLs() : j11, (i10 & 64) != 0 ? CornerRadius.INSTANCE.m1368getZerokKHJgLs() : j12, (i10 & 128) != 0 ? CornerRadius.INSTANCE.m1368getZerokKHJgLs() : j13, null);
    }

    public /* synthetic */ RoundRect(float f10, float f11, float f12, float f13, long j10, long j11, long j12, long j13, i iVar) {
        this(f10, f11, f12, f13, j10, j11, j12, j13);
    }

    @NotNull
    public static final RoundRect getZero() {
        return INSTANCE.getZero();
    }

    private final float minRadius(float min, float radius1, float radius2, float limit) {
        float f10 = radius1 + radius2;
        if (f10 > limit) {
            return !((f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1)) == 0) ? Math.min(min, limit / f10) : min;
        }
        return min;
    }

    private final RoundRect scaledRadiiRect() {
        RoundRect roundRect = this._scaledRadiiRect;
        if (roundRect != null) {
            return roundRect;
        }
        float fMinRadius = minRadius(minRadius(minRadius(minRadius(1.0f, CornerRadius.m1359getYimpl(this.bottomLeftCornerRadius), CornerRadius.m1359getYimpl(this.topLeftCornerRadius), getHeight()), CornerRadius.m1358getXimpl(this.topLeftCornerRadius), CornerRadius.m1358getXimpl(this.topRightCornerRadius), getWidth()), CornerRadius.m1359getYimpl(this.topRightCornerRadius), CornerRadius.m1359getYimpl(this.bottomRightCornerRadius), getHeight()), CornerRadius.m1358getXimpl(this.bottomRightCornerRadius), CornerRadius.m1358getXimpl(this.bottomLeftCornerRadius), getWidth());
        RoundRect roundRect2 = new RoundRect(this.left * fMinRadius, this.top * fMinRadius, this.right * fMinRadius, this.bottom * fMinRadius, CornerRadiusKt.CornerRadius(CornerRadius.m1358getXimpl(this.topLeftCornerRadius) * fMinRadius, CornerRadius.m1359getYimpl(this.topLeftCornerRadius) * fMinRadius), CornerRadiusKt.CornerRadius(CornerRadius.m1358getXimpl(this.topRightCornerRadius) * fMinRadius, CornerRadius.m1359getYimpl(this.topRightCornerRadius) * fMinRadius), CornerRadiusKt.CornerRadius(CornerRadius.m1358getXimpl(this.bottomRightCornerRadius) * fMinRadius, CornerRadius.m1359getYimpl(this.bottomRightCornerRadius) * fMinRadius), CornerRadiusKt.CornerRadius(CornerRadius.m1358getXimpl(this.bottomLeftCornerRadius) * fMinRadius, CornerRadius.m1359getYimpl(this.bottomLeftCornerRadius) * fMinRadius), null);
        this._scaledRadiiRect = roundRect2;
        return roundRect2;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getLeft() {
        return this.left;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getTop() {
        return this.top;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getRight() {
        return this.right;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getBottom() {
        return this.bottom;
    }

    /* JADX INFO: renamed from: component5-kKHJgLs, reason: not valid java name and from getter */
    public final long getTopLeftCornerRadius() {
        return this.topLeftCornerRadius;
    }

    /* JADX INFO: renamed from: component6-kKHJgLs, reason: not valid java name and from getter */
    public final long getTopRightCornerRadius() {
        return this.topRightCornerRadius;
    }

    /* JADX INFO: renamed from: component7-kKHJgLs, reason: not valid java name and from getter */
    public final long getBottomRightCornerRadius() {
        return this.bottomRightCornerRadius;
    }

    /* JADX INFO: renamed from: component8-kKHJgLs, reason: not valid java name and from getter */
    public final long getBottomLeftCornerRadius() {
        return this.bottomLeftCornerRadius;
    }

    /* JADX INFO: renamed from: contains-k-4lQ0M, reason: not valid java name */
    public final boolean m1429containsk4lQ0M(long point) {
        float fM1383getXimpl;
        float fM1384getYimpl;
        float fM1358getXimpl;
        float fM1359getYimpl;
        if (Offset.m1383getXimpl(point) < this.left || Offset.m1383getXimpl(point) >= this.right || Offset.m1384getYimpl(point) < this.top || Offset.m1384getYimpl(point) >= this.bottom) {
            return false;
        }
        RoundRect roundRectScaledRadiiRect = scaledRadiiRect();
        if (Offset.m1383getXimpl(point) < this.left + CornerRadius.m1358getXimpl(roundRectScaledRadiiRect.topLeftCornerRadius) && Offset.m1384getYimpl(point) < this.top + CornerRadius.m1359getYimpl(roundRectScaledRadiiRect.topLeftCornerRadius)) {
            fM1383getXimpl = (Offset.m1383getXimpl(point) - this.left) - CornerRadius.m1358getXimpl(roundRectScaledRadiiRect.topLeftCornerRadius);
            fM1384getYimpl = (Offset.m1384getYimpl(point) - this.top) - CornerRadius.m1359getYimpl(roundRectScaledRadiiRect.topLeftCornerRadius);
            fM1358getXimpl = CornerRadius.m1358getXimpl(roundRectScaledRadiiRect.topLeftCornerRadius);
            fM1359getYimpl = CornerRadius.m1359getYimpl(roundRectScaledRadiiRect.topLeftCornerRadius);
        } else if (Offset.m1383getXimpl(point) > this.right - CornerRadius.m1358getXimpl(roundRectScaledRadiiRect.topRightCornerRadius) && Offset.m1384getYimpl(point) < this.top + CornerRadius.m1359getYimpl(roundRectScaledRadiiRect.topRightCornerRadius)) {
            fM1383getXimpl = (Offset.m1383getXimpl(point) - this.right) + CornerRadius.m1358getXimpl(roundRectScaledRadiiRect.topRightCornerRadius);
            fM1384getYimpl = (Offset.m1384getYimpl(point) - this.top) - CornerRadius.m1359getYimpl(roundRectScaledRadiiRect.topRightCornerRadius);
            fM1358getXimpl = CornerRadius.m1358getXimpl(roundRectScaledRadiiRect.topRightCornerRadius);
            fM1359getYimpl = CornerRadius.m1359getYimpl(roundRectScaledRadiiRect.topRightCornerRadius);
        } else if (Offset.m1383getXimpl(point) > this.right - CornerRadius.m1358getXimpl(roundRectScaledRadiiRect.bottomRightCornerRadius) && Offset.m1384getYimpl(point) > this.bottom - CornerRadius.m1359getYimpl(roundRectScaledRadiiRect.bottomRightCornerRadius)) {
            fM1383getXimpl = (Offset.m1383getXimpl(point) - this.right) + CornerRadius.m1358getXimpl(roundRectScaledRadiiRect.bottomRightCornerRadius);
            fM1384getYimpl = (Offset.m1384getYimpl(point) - this.bottom) + CornerRadius.m1359getYimpl(roundRectScaledRadiiRect.bottomRightCornerRadius);
            fM1358getXimpl = CornerRadius.m1358getXimpl(roundRectScaledRadiiRect.bottomRightCornerRadius);
            fM1359getYimpl = CornerRadius.m1359getYimpl(roundRectScaledRadiiRect.bottomRightCornerRadius);
        } else {
            if (Offset.m1383getXimpl(point) >= this.left + CornerRadius.m1358getXimpl(roundRectScaledRadiiRect.bottomLeftCornerRadius) || Offset.m1384getYimpl(point) <= this.bottom - CornerRadius.m1359getYimpl(roundRectScaledRadiiRect.bottomLeftCornerRadius)) {
                return true;
            }
            fM1383getXimpl = (Offset.m1383getXimpl(point) - this.left) - CornerRadius.m1358getXimpl(roundRectScaledRadiiRect.bottomLeftCornerRadius);
            fM1384getYimpl = (Offset.m1384getYimpl(point) - this.bottom) + CornerRadius.m1359getYimpl(roundRectScaledRadiiRect.bottomLeftCornerRadius);
            fM1358getXimpl = CornerRadius.m1358getXimpl(roundRectScaledRadiiRect.bottomLeftCornerRadius);
            fM1359getYimpl = CornerRadius.m1359getYimpl(roundRectScaledRadiiRect.bottomLeftCornerRadius);
        }
        float f10 = fM1383getXimpl / fM1358getXimpl;
        float f11 = fM1384getYimpl / fM1359getYimpl;
        return (f10 * f10) + (f11 * f11) <= 1.0f;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-MDFrsts, reason: not valid java name */
    public final RoundRect m1430copyMDFrsts(float left, float top2, float right, float bottom, long topLeftCornerRadius, long topRightCornerRadius, long bottomRightCornerRadius, long bottomLeftCornerRadius) {
        return new RoundRect(left, top2, right, bottom, topLeftCornerRadius, topRightCornerRadius, bottomRightCornerRadius, bottomLeftCornerRadius, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoundRect)) {
            return false;
        }
        RoundRect roundRect = (RoundRect) other;
        return p.f(Float.valueOf(this.left), Float.valueOf(roundRect.left)) && p.f(Float.valueOf(this.top), Float.valueOf(roundRect.top)) && p.f(Float.valueOf(this.right), Float.valueOf(roundRect.right)) && p.f(Float.valueOf(this.bottom), Float.valueOf(roundRect.bottom)) && CornerRadius.m1357equalsimpl0(this.topLeftCornerRadius, roundRect.topLeftCornerRadius) && CornerRadius.m1357equalsimpl0(this.topRightCornerRadius, roundRect.topRightCornerRadius) && CornerRadius.m1357equalsimpl0(this.bottomRightCornerRadius, roundRect.bottomRightCornerRadius) && CornerRadius.m1357equalsimpl0(this.bottomLeftCornerRadius, roundRect.bottomLeftCornerRadius);
    }

    public final float getBottom() {
        return this.bottom;
    }

    /* JADX INFO: renamed from: getBottomLeftCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m1431getBottomLeftCornerRadiuskKHJgLs() {
        return this.bottomLeftCornerRadius;
    }

    /* JADX INFO: renamed from: getBottomRightCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m1432getBottomRightCornerRadiuskKHJgLs() {
        return this.bottomRightCornerRadius;
    }

    public final float getHeight() {
        return this.bottom - this.top;
    }

    public final float getLeft() {
        return this.left;
    }

    public final float getRight() {
        return this.right;
    }

    public final float getTop() {
        return this.top;
    }

    /* JADX INFO: renamed from: getTopLeftCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m1433getTopLeftCornerRadiuskKHJgLs() {
        return this.topLeftCornerRadius;
    }

    /* JADX INFO: renamed from: getTopRightCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m1434getTopRightCornerRadiuskKHJgLs() {
        return this.topRightCornerRadius;
    }

    public final float getWidth() {
        return this.right - this.left;
    }

    public int hashCode() {
        return (((((((((((((Float.hashCode(this.left) * 31) + Float.hashCode(this.top)) * 31) + Float.hashCode(this.right)) * 31) + Float.hashCode(this.bottom)) * 31) + CornerRadius.m1360hashCodeimpl(this.topLeftCornerRadius)) * 31) + CornerRadius.m1360hashCodeimpl(this.topRightCornerRadius)) * 31) + CornerRadius.m1360hashCodeimpl(this.bottomRightCornerRadius)) * 31) + CornerRadius.m1360hashCodeimpl(this.bottomLeftCornerRadius);
    }

    @NotNull
    public String toString() {
        long j10 = this.topLeftCornerRadius;
        long j11 = this.topRightCornerRadius;
        long j12 = this.bottomRightCornerRadius;
        long j13 = this.bottomLeftCornerRadius;
        String str = GeometryUtilsKt.toStringAsFixed(this.left, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.top, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.right, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.bottom, 1);
        if (!CornerRadius.m1357equalsimpl0(j10, j11) || !CornerRadius.m1357equalsimpl0(j11, j12) || !CornerRadius.m1357equalsimpl0(j12, j13)) {
            return "RoundRect(rect=" + str + ", topLeft=" + ((Object) CornerRadius.m1364toStringimpl(j10)) + ", topRight=" + ((Object) CornerRadius.m1364toStringimpl(j11)) + ", bottomRight=" + ((Object) CornerRadius.m1364toStringimpl(j12)) + ", bottomLeft=" + ((Object) CornerRadius.m1364toStringimpl(j13)) + ')';
        }
        if (CornerRadius.m1358getXimpl(j10) == CornerRadius.m1359getYimpl(j10)) {
            return "RoundRect(rect=" + str + ", radius=" + GeometryUtilsKt.toStringAsFixed(CornerRadius.m1358getXimpl(j10), 1) + ')';
        }
        return "RoundRect(rect=" + str + ", x=" + GeometryUtilsKt.toStringAsFixed(CornerRadius.m1358getXimpl(j10), 1) + ", y=" + GeometryUtilsKt.toStringAsFixed(CornerRadius.m1359getYimpl(j10), 1) + ')';
    }
}
