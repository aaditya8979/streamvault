package androidx.compose.ui.input.pointer.util;

import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;

/* JADX INFO: compiled from: VelocityTracker.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B\u001a\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0005\u001a\u00020\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J*\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R \u0010\b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0004R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0016\u0010\u0004\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/input/pointer/util/PointAtTime;", "", "Landroidx/compose/ui/geometry/Offset;", "component1-F1C5BW0", "()J", "component1", "", "component2", "point", "time", "copy-3MmeM6k", "(JJ)Landroidx/compose/ui/input/pointer/util/PointAtTime;", "copy", "", "toString", "", "hashCode", "other", "", "equals", "J", "getPoint-F1C5BW0", "getTime", "<init>", "(JJLtn/i;)V", "ui_release"}, k = 1, mv = {1, 6, 0})
final /* data */ class PointAtTime {
    private final long point;
    private final long time;

    private PointAtTime(long j10, long j11) {
        this.point = j10;
        this.time = j11;
    }

    public /* synthetic */ PointAtTime(long j10, long j11, i iVar) {
        this(j10, j11);
    }

    /* JADX INFO: renamed from: copy-3MmeM6k$default, reason: not valid java name */
    public static /* synthetic */ PointAtTime m3076copy3MmeM6k$default(PointAtTime pointAtTime, long j10, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = pointAtTime.point;
        }
        if ((i10 & 2) != 0) {
            j11 = pointAtTime.time;
        }
        return pointAtTime.m3078copy3MmeM6k(j10, j11);
    }

    /* JADX INFO: renamed from: component1-F1C5BW0, reason: not valid java name and from getter */
    public final long getPoint() {
        return this.point;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-3MmeM6k, reason: not valid java name */
    public final PointAtTime m3078copy3MmeM6k(long point, long time) {
        return new PointAtTime(point, time, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PointAtTime)) {
            return false;
        }
        PointAtTime pointAtTime = (PointAtTime) other;
        return Offset.m1380equalsimpl0(this.point, pointAtTime.point) && this.time == pointAtTime.time;
    }

    /* JADX INFO: renamed from: getPoint-F1C5BW0, reason: not valid java name */
    public final long m3079getPointF1C5BW0() {
        return this.point;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        return (Offset.m1385hashCodeimpl(this.point) * 31) + Long.hashCode(this.time);
    }

    @NotNull
    public String toString() {
        return "PointAtTime(point=" + ((Object) Offset.m1391toStringimpl(this.point)) + ", time=" + this.time + ')';
    }
}
