package androidx.compose.ui.unit;

import androidx.compose.runtime.Stable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import zn.n;

/* JADX INFO: compiled from: Constraints.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\u001a8\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u001a\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0002\u001a\u001f\u0010\u000b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\f\u001a\u00020\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a!\u0010\u000b\u001a\u00020\u000f*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u000e\u001a!\u0010\u0012\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a!\u0010\u0016\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0015\u001a!\u0010\u0019\u001a\u00020\u001a*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a-\u0010\u001d\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {androidx.constraintlayout.widget.Constraints.TAG, "Landroidx/compose/ui/unit/Constraints;", "minWidth", "", "maxWidth", "minHeight", "maxHeight", "(IIII)J", "addMaxWithMinimum", "max", "value", "constrain", "otherConstraints", "constrain-N9IONVI", "(JJ)J", "Landroidx/compose/ui/unit/IntSize;", "size", "constrain-4WqzIAM", "constrainHeight", "height", "constrainHeight-K40F9xA", "(JI)I", "constrainWidth", "width", "constrainWidth-K40F9xA", "isSatisfiedBy", "", "isSatisfiedBy-4WqzIAM", "(JJ)Z", TypedValues.CycleType.S_WAVE_OFFSET, "horizontal", "vertical", "offset-NN6Ew-U", "(JII)J", "ui-unit_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class ConstraintsKt {
    @Stable
    public static final long Constraints(int i10, int i11, int i12, int i13) {
        if (!(i11 >= i10)) {
            throw new IllegalArgumentException(("maxWidth(" + i11 + ") must be >= than minWidth(" + i10 + ')').toString());
        }
        if (!(i13 >= i12)) {
            throw new IllegalArgumentException(("maxHeight(" + i13 + ") must be >= than minHeight(" + i12 + ')').toString());
        }
        if (i10 >= 0 && i12 >= 0) {
            return Constraints.INSTANCE.m3789createConstraintsZbe2FdA$ui_unit_release(i10, i11, i12, i13);
        }
        throw new IllegalArgumentException(("minWidth(" + i10 + ") and minHeight(" + i12 + ") must be >= 0").toString());
    }

    public static /* synthetic */ long Constraints$default(int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = 0;
        }
        if ((i14 & 2) != 0) {
            i11 = Integer.MAX_VALUE;
        }
        if ((i14 & 4) != 0) {
            i12 = 0;
        }
        if ((i14 & 8) != 0) {
            i13 = Integer.MAX_VALUE;
        }
        return Constraints(i10, i11, i12, i13);
    }

    private static final int addMaxWithMinimum(int i10, int i11) {
        return i10 == Integer.MAX_VALUE ? i10 : n.e(i10 + i11, 0);
    }

    @Stable
    /* JADX INFO: renamed from: constrain-4WqzIAM, reason: not valid java name */
    public static final long m3793constrain4WqzIAM(long j10, long j11) {
        return IntSizeKt.IntSize(n.n(IntSize.m3986getWidthimpl(j11), Constraints.m3784getMinWidthimpl(j10), Constraints.m3782getMaxWidthimpl(j10)), n.n(IntSize.m3985getHeightimpl(j11), Constraints.m3783getMinHeightimpl(j10), Constraints.m3781getMaxHeightimpl(j10)));
    }

    /* JADX INFO: renamed from: constrain-N9IONVI, reason: not valid java name */
    public static final long m3794constrainN9IONVI(long j10, long j11) {
        return Constraints(n.n(Constraints.m3784getMinWidthimpl(j11), Constraints.m3784getMinWidthimpl(j10), Constraints.m3782getMaxWidthimpl(j10)), n.n(Constraints.m3782getMaxWidthimpl(j11), Constraints.m3784getMinWidthimpl(j10), Constraints.m3782getMaxWidthimpl(j10)), n.n(Constraints.m3783getMinHeightimpl(j11), Constraints.m3783getMinHeightimpl(j10), Constraints.m3781getMaxHeightimpl(j10)), n.n(Constraints.m3781getMaxHeightimpl(j11), Constraints.m3783getMinHeightimpl(j10), Constraints.m3781getMaxHeightimpl(j10)));
    }

    @Stable
    /* JADX INFO: renamed from: constrainHeight-K40F9xA, reason: not valid java name */
    public static final int m3795constrainHeightK40F9xA(long j10, int i10) {
        return n.n(i10, Constraints.m3783getMinHeightimpl(j10), Constraints.m3781getMaxHeightimpl(j10));
    }

    @Stable
    /* JADX INFO: renamed from: constrainWidth-K40F9xA, reason: not valid java name */
    public static final int m3796constrainWidthK40F9xA(long j10, int i10) {
        return n.n(i10, Constraints.m3784getMinWidthimpl(j10), Constraints.m3782getMaxWidthimpl(j10));
    }

    @Stable
    /* JADX INFO: renamed from: isSatisfiedBy-4WqzIAM, reason: not valid java name */
    public static final boolean m3797isSatisfiedBy4WqzIAM(long j10, long j11) {
        int iM3784getMinWidthimpl = Constraints.m3784getMinWidthimpl(j10);
        int iM3782getMaxWidthimpl = Constraints.m3782getMaxWidthimpl(j10);
        int iM3986getWidthimpl = IntSize.m3986getWidthimpl(j11);
        if (iM3784getMinWidthimpl <= iM3986getWidthimpl && iM3986getWidthimpl <= iM3782getMaxWidthimpl) {
            int iM3783getMinHeightimpl = Constraints.m3783getMinHeightimpl(j10);
            int iM3781getMaxHeightimpl = Constraints.m3781getMaxHeightimpl(j10);
            int iM3985getHeightimpl = IntSize.m3985getHeightimpl(j11);
            if (iM3783getMinHeightimpl <= iM3985getHeightimpl && iM3985getHeightimpl <= iM3781getMaxHeightimpl) {
                return true;
            }
        }
        return false;
    }

    @Stable
    /* JADX INFO: renamed from: offset-NN6Ew-U, reason: not valid java name */
    public static final long m3798offsetNN6EwU(long j10, int i10, int i11) {
        return Constraints(n.e(Constraints.m3784getMinWidthimpl(j10) + i10, 0), addMaxWithMinimum(Constraints.m3782getMaxWidthimpl(j10), i10), n.e(Constraints.m3783getMinHeightimpl(j10) + i11, 0), addMaxWithMinimum(Constraints.m3781getMaxHeightimpl(j10), i11));
    }

    /* JADX INFO: renamed from: offset-NN6Ew-U$default, reason: not valid java name */
    public static /* synthetic */ long m3799offsetNN6EwU$default(long j10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return m3798offsetNN6EwU(j10, i10, i11);
    }
}
