package androidx.compose.ui.geometry;

import androidx.compose.ui.util.MathHelpersKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: RoundRect.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0019\u001a#\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001cø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001aC\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001c2\b\b\u0002\u0010 \u001a\u00020\u001c2\b\b\u0002\u0010!\u001a\u00020\u001c2\b\b\u0002\u0010\"\u001a\u00020\u001cø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$\u001a\u001e\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u0012\u001a;\u0010\u0019\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001cø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b+\u0010,\u001a6\u0010\u0019\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u0012\u001a\u001e\u0010-\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\u00022\u0006\u00100\u001a\u00020\u0012\u001a\u001f\u00101\u001a\u00020\u0002*\u00020\u00022\u0006\u00102\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b3\u00104\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0005\u001a\u00020\u0006*\u00020\u00028Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0015\u0010\t\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\t\u0010\u000b\"\u0015\u0010\f\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\f\u0010\u000b\"\u0015\u0010\r\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b\"\u0015\u0010\u000e\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000b\"\u0015\u0010\u000f\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000b\"\u0015\u0010\u0010\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000b\"\u0015\u0010\u0011\u001a\u00020\u0012*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\"\u0015\u0010\u0015\u001a\u00020\u0012*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014\"\u0015\u0010\u0017\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0004\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00065"}, d2 = {"boundingRect", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/geometry/RoundRect;", "getBoundingRect", "(Landroidx/compose/ui/geometry/RoundRect;)Landroidx/compose/ui/geometry/Rect;", "center", "Landroidx/compose/ui/geometry/Offset;", "getCenter", "(Landroidx/compose/ui/geometry/RoundRect;)J", "isCircle", "", "(Landroidx/compose/ui/geometry/RoundRect;)Z", "isEllipse", "isEmpty", "isFinite", "isRect", "isSimple", "maxDimension", "", "getMaxDimension", "(Landroidx/compose/ui/geometry/RoundRect;)F", "minDimension", "getMinDimension", "safeInnerRect", "getSafeInnerRect", "RoundRect", "rect", "cornerRadius", "Landroidx/compose/ui/geometry/CornerRadius;", "RoundRect-sniSvfs", "(Landroidx/compose/ui/geometry/Rect;J)Landroidx/compose/ui/geometry/RoundRect;", "topLeft", "topRight", "bottomRight", "bottomLeft", "RoundRect-ZAM2FJo", "(Landroidx/compose/ui/geometry/Rect;JJJJ)Landroidx/compose/ui/geometry/RoundRect;", "radiusX", "radiusY", "left", "top", "right", "bottom", "RoundRect-gG7oq9Y", "(FFFFJ)Landroidx/compose/ui/geometry/RoundRect;", "lerp", "start", "stop", "fraction", "translate", TypedValues.CycleType.S_WAVE_OFFSET, "translate-Uv8p0NA", "(Landroidx/compose/ui/geometry/RoundRect;J)Landroidx/compose/ui/geometry/RoundRect;", "ui-geometry_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class RoundRectKt {
    @NotNull
    public static final RoundRect RoundRect(float f10, float f11, float f12, float f13, float f14, float f15) {
        long jCornerRadius = CornerRadiusKt.CornerRadius(f14, f15);
        return new RoundRect(f10, f11, f12, f13, jCornerRadius, jCornerRadius, jCornerRadius, jCornerRadius, null);
    }

    @NotNull
    public static final RoundRect RoundRect(@NotNull Rect rect, float f10, float f11) {
        p.k(rect, "rect");
        return RoundRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), f10, f11);
    }

    @NotNull
    /* JADX INFO: renamed from: RoundRect-ZAM2FJo, reason: not valid java name */
    public static final RoundRect m1435RoundRectZAM2FJo(@NotNull Rect rect, long j10, long j11, long j12, long j13) {
        p.k(rect, "rect");
        return new RoundRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), j10, j11, j12, j13, null);
    }

    @NotNull
    /* JADX INFO: renamed from: RoundRect-gG7oq9Y, reason: not valid java name */
    public static final RoundRect m1437RoundRectgG7oq9Y(float f10, float f11, float f12, float f13, long j10) {
        return RoundRect(f10, f11, f12, f13, CornerRadius.m1358getXimpl(j10), CornerRadius.m1359getYimpl(j10));
    }

    @NotNull
    /* JADX INFO: renamed from: RoundRect-sniSvfs, reason: not valid java name */
    public static final RoundRect m1438RoundRectsniSvfs(@NotNull Rect rect, long j10) {
        p.k(rect, "rect");
        return RoundRect(rect, CornerRadius.m1358getXimpl(j10), CornerRadius.m1359getYimpl(j10));
    }

    @NotNull
    public static final Rect getBoundingRect(@NotNull RoundRect roundRect) {
        p.k(roundRect, "<this>");
        return new Rect(roundRect.getLeft(), roundRect.getTop(), roundRect.getRight(), roundRect.getBottom());
    }

    public static final long getCenter(@NotNull RoundRect roundRect) {
        p.k(roundRect, "<this>");
        return OffsetKt.Offset(roundRect.getLeft() + (roundRect.getWidth() / 2.0f), roundRect.getTop() + (roundRect.getHeight() / 2.0f));
    }

    public static final float getMaxDimension(@NotNull RoundRect roundRect) {
        p.k(roundRect, "<this>");
        return Math.max(Math.abs(roundRect.getWidth()), Math.abs(roundRect.getHeight()));
    }

    public static final float getMinDimension(@NotNull RoundRect roundRect) {
        p.k(roundRect, "<this>");
        return Math.min(Math.abs(roundRect.getWidth()), Math.abs(roundRect.getHeight()));
    }

    @NotNull
    public static final Rect getSafeInnerRect(@NotNull RoundRect roundRect) {
        p.k(roundRect, "<this>");
        return new Rect(roundRect.getLeft() + (Math.max(CornerRadius.m1358getXimpl(roundRect.m1431getBottomLeftCornerRadiuskKHJgLs()), CornerRadius.m1358getXimpl(roundRect.m1433getTopLeftCornerRadiuskKHJgLs())) * 0.29289323f), roundRect.getTop() + (Math.max(CornerRadius.m1359getYimpl(roundRect.m1433getTopLeftCornerRadiuskKHJgLs()), CornerRadius.m1359getYimpl(roundRect.m1434getTopRightCornerRadiuskKHJgLs())) * 0.29289323f), roundRect.getRight() - (Math.max(CornerRadius.m1358getXimpl(roundRect.m1434getTopRightCornerRadiuskKHJgLs()), CornerRadius.m1358getXimpl(roundRect.m1432getBottomRightCornerRadiuskKHJgLs())) * 0.29289323f), roundRect.getBottom() - (Math.max(CornerRadius.m1359getYimpl(roundRect.m1432getBottomRightCornerRadiuskKHJgLs()), CornerRadius.m1359getYimpl(roundRect.m1431getBottomLeftCornerRadiuskKHJgLs())) * 0.29289323f));
    }

    public static final boolean isCircle(@NotNull RoundRect roundRect) {
        p.k(roundRect, "<this>");
        return ((roundRect.getWidth() > roundRect.getHeight() ? 1 : (roundRect.getWidth() == roundRect.getHeight() ? 0 : -1)) == 0) && isEllipse(roundRect);
    }

    public static final boolean isEllipse(@NotNull RoundRect roundRect) {
        p.k(roundRect, "<this>");
        if (CornerRadius.m1358getXimpl(roundRect.m1433getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m1358getXimpl(roundRect.m1434getTopRightCornerRadiuskKHJgLs())) {
            if (CornerRadius.m1359getYimpl(roundRect.m1433getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m1359getYimpl(roundRect.m1434getTopRightCornerRadiuskKHJgLs())) {
                if (CornerRadius.m1358getXimpl(roundRect.m1434getTopRightCornerRadiuskKHJgLs()) == CornerRadius.m1358getXimpl(roundRect.m1432getBottomRightCornerRadiuskKHJgLs())) {
                    if (CornerRadius.m1359getYimpl(roundRect.m1434getTopRightCornerRadiuskKHJgLs()) == CornerRadius.m1359getYimpl(roundRect.m1432getBottomRightCornerRadiuskKHJgLs())) {
                        if (CornerRadius.m1358getXimpl(roundRect.m1432getBottomRightCornerRadiuskKHJgLs()) == CornerRadius.m1358getXimpl(roundRect.m1431getBottomLeftCornerRadiuskKHJgLs())) {
                            if ((CornerRadius.m1359getYimpl(roundRect.m1432getBottomRightCornerRadiuskKHJgLs()) == CornerRadius.m1359getYimpl(roundRect.m1431getBottomLeftCornerRadiuskKHJgLs())) && roundRect.getWidth() <= ((double) CornerRadius.m1358getXimpl(roundRect.m1433getTopLeftCornerRadiuskKHJgLs())) * 2.0d && roundRect.getHeight() <= ((double) CornerRadius.m1359getYimpl(roundRect.m1433getTopLeftCornerRadiuskKHJgLs())) * 2.0d) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final boolean isEmpty(@NotNull RoundRect roundRect) {
        p.k(roundRect, "<this>");
        return roundRect.getLeft() >= roundRect.getRight() || roundRect.getTop() >= roundRect.getBottom();
    }

    public static final boolean isFinite(@NotNull RoundRect roundRect) {
        p.k(roundRect, "<this>");
        float left = roundRect.getLeft();
        if ((Float.isInfinite(left) || Float.isNaN(left)) ? false : true) {
            float top2 = roundRect.getTop();
            if ((Float.isInfinite(top2) || Float.isNaN(top2)) ? false : true) {
                float right = roundRect.getRight();
                if ((Float.isInfinite(right) || Float.isNaN(right)) ? false : true) {
                    float bottom = roundRect.getBottom();
                    if ((Float.isInfinite(bottom) || Float.isNaN(bottom)) ? false : true) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean isRect(@org.jetbrains.annotations.NotNull androidx.compose.ui.geometry.RoundRect r6) {
        /*
            java.lang.String r0 = "<this>"
            tn.p.k(r6, r0)
            long r0 = r6.m1433getTopLeftCornerRadiuskKHJgLs()
            float r0 = androidx.compose.ui.geometry.CornerRadius.m1358getXimpl(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L16
            r0 = r2
            goto L17
        L16:
            r0 = r3
        L17:
            if (r0 != 0) goto L2a
            long r4 = r6.m1433getTopLeftCornerRadiuskKHJgLs()
            float r0 = androidx.compose.ui.geometry.CornerRadius.m1359getYimpl(r4)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L27
            r0 = r2
            goto L28
        L27:
            r0 = r3
        L28:
            if (r0 == 0) goto L91
        L2a:
            long r4 = r6.m1434getTopRightCornerRadiuskKHJgLs()
            float r0 = androidx.compose.ui.geometry.CornerRadius.m1358getXimpl(r4)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L38
            r0 = r2
            goto L39
        L38:
            r0 = r3
        L39:
            if (r0 != 0) goto L4c
            long r4 = r6.m1434getTopRightCornerRadiuskKHJgLs()
            float r0 = androidx.compose.ui.geometry.CornerRadius.m1359getYimpl(r4)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L49
            r0 = r2
            goto L4a
        L49:
            r0 = r3
        L4a:
            if (r0 == 0) goto L91
        L4c:
            long r4 = r6.m1431getBottomLeftCornerRadiuskKHJgLs()
            float r0 = androidx.compose.ui.geometry.CornerRadius.m1358getXimpl(r4)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L5a
            r0 = r2
            goto L5b
        L5a:
            r0 = r3
        L5b:
            if (r0 != 0) goto L6e
            long r4 = r6.m1431getBottomLeftCornerRadiuskKHJgLs()
            float r0 = androidx.compose.ui.geometry.CornerRadius.m1359getYimpl(r4)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L6b
            r0 = r2
            goto L6c
        L6b:
            r0 = r3
        L6c:
            if (r0 == 0) goto L91
        L6e:
            long r4 = r6.m1432getBottomRightCornerRadiuskKHJgLs()
            float r0 = androidx.compose.ui.geometry.CornerRadius.m1358getXimpl(r4)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L7c
            r0 = r2
            goto L7d
        L7c:
            r0 = r3
        L7d:
            if (r0 != 0) goto L92
            long r4 = r6.m1432getBottomRightCornerRadiuskKHJgLs()
            float r6 = androidx.compose.ui.geometry.CornerRadius.m1359getYimpl(r4)
            int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r6 != 0) goto L8d
            r6 = r2
            goto L8e
        L8d:
            r6 = r3
        L8e:
            if (r6 == 0) goto L91
            goto L92
        L91:
            r2 = r3
        L92:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.geometry.RoundRectKt.isRect(androidx.compose.ui.geometry.RoundRect):boolean");
    }

    public static final boolean isSimple(@NotNull RoundRect roundRect) {
        p.k(roundRect, "<this>");
        if (CornerRadius.m1358getXimpl(roundRect.m1433getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m1359getYimpl(roundRect.m1433getTopLeftCornerRadiuskKHJgLs())) {
            if (CornerRadius.m1358getXimpl(roundRect.m1433getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m1358getXimpl(roundRect.m1434getTopRightCornerRadiuskKHJgLs())) {
                if (CornerRadius.m1358getXimpl(roundRect.m1433getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m1359getYimpl(roundRect.m1434getTopRightCornerRadiuskKHJgLs())) {
                    if (CornerRadius.m1358getXimpl(roundRect.m1433getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m1358getXimpl(roundRect.m1432getBottomRightCornerRadiuskKHJgLs())) {
                        if (CornerRadius.m1358getXimpl(roundRect.m1433getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m1359getYimpl(roundRect.m1432getBottomRightCornerRadiuskKHJgLs())) {
                            if (CornerRadius.m1358getXimpl(roundRect.m1433getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m1358getXimpl(roundRect.m1431getBottomLeftCornerRadiuskKHJgLs())) {
                                if (CornerRadius.m1358getXimpl(roundRect.m1433getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m1359getYimpl(roundRect.m1431getBottomLeftCornerRadiuskKHJgLs())) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @NotNull
    public static final RoundRect lerp(@NotNull RoundRect roundRect, @NotNull RoundRect roundRect2, float f10) {
        p.k(roundRect, "start");
        p.k(roundRect2, "stop");
        return new RoundRect(MathHelpersKt.lerp(roundRect.getLeft(), roundRect2.getLeft(), f10), MathHelpersKt.lerp(roundRect.getTop(), roundRect2.getTop(), f10), MathHelpersKt.lerp(roundRect.getRight(), roundRect2.getRight(), f10), MathHelpersKt.lerp(roundRect.getBottom(), roundRect2.getBottom(), f10), CornerRadiusKt.m1369lerp3Ry4LBc(roundRect.m1433getTopLeftCornerRadiuskKHJgLs(), roundRect2.m1433getTopLeftCornerRadiuskKHJgLs(), f10), CornerRadiusKt.m1369lerp3Ry4LBc(roundRect.m1434getTopRightCornerRadiuskKHJgLs(), roundRect2.m1434getTopRightCornerRadiuskKHJgLs(), f10), CornerRadiusKt.m1369lerp3Ry4LBc(roundRect.m1432getBottomRightCornerRadiuskKHJgLs(), roundRect2.m1432getBottomRightCornerRadiuskKHJgLs(), f10), CornerRadiusKt.m1369lerp3Ry4LBc(roundRect.m1431getBottomLeftCornerRadiuskKHJgLs(), roundRect2.m1431getBottomLeftCornerRadiuskKHJgLs(), f10), null);
    }

    @NotNull
    /* JADX INFO: renamed from: translate-Uv8p0NA, reason: not valid java name */
    public static final RoundRect m1439translateUv8p0NA(@NotNull RoundRect roundRect, long j10) {
        p.k(roundRect, "$this$translate");
        return new RoundRect(roundRect.getLeft() + Offset.m1383getXimpl(j10), roundRect.getTop() + Offset.m1384getYimpl(j10), roundRect.getRight() + Offset.m1383getXimpl(j10), roundRect.getBottom() + Offset.m1384getYimpl(j10), roundRect.m1433getTopLeftCornerRadiuskKHJgLs(), roundRect.m1434getTopRightCornerRadiuskKHJgLs(), roundRect.m1432getBottomRightCornerRadiuskKHJgLs(), roundRect.m1431getBottomLeftCornerRadiuskKHJgLs(), null);
    }
}
