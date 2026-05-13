package androidx.compose.ui.geometry;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sn.a;
import tn.p;

/* JADX INFO: compiled from: Size.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\"\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a+\u0010\n\u001a\u00020\u0003*\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H\u0086\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0000H\u0007ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\"\u0010\u0015\u001a\u00020\u0003*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0003H\u0087\nø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\"\u0010\u0015\u001a\u00020\u0003*\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0003H\u0087\nø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b\u0013\u0010\u0017\u001a\u0019\u0010\u001b\u001a\u00020\u0018*\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a\"\u0010\u0015\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0003H\u0087\nø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b\u0013\u0010\u001c\"\"\u0010\"\u001a\u00020\u001d*\u00020\u00038Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001f\"\"\u0010%\u001a\u00020\u001d*\u00020\u00038Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b$\u0010!\u001a\u0004\b#\u0010\u001f\"!\u0010*\u001a\u00020&*\u00020\u00038FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b)\u0010!\u001a\u0004\b'\u0010(\u0082\u0002\u0012\n\u0002\b\u0019\n\u0005\b\u009920\u0001\n\u0005\b¡\u001e0\u0001¨\u0006+"}, d2 = {"", "width", "height", "Landroidx/compose/ui/geometry/Size;", "Size", "(FF)J", "Lkotlin/Function0;", "block", "takeOrElse-TmRCtEA", "(JLsn/a;)J", "takeOrElse", "start", "stop", "fraction", "lerp-VgWVRYQ", "(JJF)J", "lerp", "", "size", "times-d16Qtg0", "(IJ)J", "times", "", "(DJ)J", "Landroidx/compose/ui/geometry/Rect;", "toRect-uvyYCjk", "(J)Landroidx/compose/ui/geometry/Rect;", "toRect", "(FJ)J", "", "isSpecified-uvyYCjk", "(J)Z", "isSpecified-uvyYCjk$annotations", "(J)V", "isSpecified", "isUnspecified-uvyYCjk", "isUnspecified-uvyYCjk$annotations", "isUnspecified", "Landroidx/compose/ui/geometry/Offset;", "getCenter-uvyYCjk", "(J)J", "getCenter-uvyYCjk$annotations", "center", "ui-geometry_release"}, k = 2, mv = {1, 6, 0})
public final class SizeKt {
    @Stable
    public static final long Size(float f10, float f11) {
        return Size.m1443constructorimpl((((long) Float.floatToIntBits(f11)) & 4294967295L) | (Float.floatToIntBits(f10) << 32));
    }

    /* JADX INFO: renamed from: getCenter-uvyYCjk, reason: not valid java name */
    public static final long m1462getCenteruvyYCjk(long j10) {
        return OffsetKt.Offset(Size.m1452getWidthimpl(j10) / 2.0f, Size.m1449getHeightimpl(j10) / 2.0f);
    }

    @Stable
    /* JADX INFO: renamed from: getCenter-uvyYCjk$annotations, reason: not valid java name */
    public static /* synthetic */ void m1463getCenteruvyYCjk$annotations(long j10) {
    }

    /* JADX INFO: renamed from: isSpecified-uvyYCjk, reason: not valid java name */
    public static final boolean m1464isSpecifieduvyYCjk(long j10) {
        return j10 != Size.INSTANCE.m1460getUnspecifiedNHjbRc();
    }

    @Stable
    /* JADX INFO: renamed from: isSpecified-uvyYCjk$annotations, reason: not valid java name */
    public static /* synthetic */ void m1465isSpecifieduvyYCjk$annotations(long j10) {
    }

    /* JADX INFO: renamed from: isUnspecified-uvyYCjk, reason: not valid java name */
    public static final boolean m1466isUnspecifieduvyYCjk(long j10) {
        return j10 == Size.INSTANCE.m1460getUnspecifiedNHjbRc();
    }

    @Stable
    /* JADX INFO: renamed from: isUnspecified-uvyYCjk$annotations, reason: not valid java name */
    public static /* synthetic */ void m1467isUnspecifieduvyYCjk$annotations(long j10) {
    }

    @Stable
    /* JADX INFO: renamed from: lerp-VgWVRYQ, reason: not valid java name */
    public static final long m1468lerpVgWVRYQ(long j10, long j11, float f10) {
        return Size(MathHelpersKt.lerp(Size.m1452getWidthimpl(j10), Size.m1452getWidthimpl(j11), f10), MathHelpersKt.lerp(Size.m1449getHeightimpl(j10), Size.m1449getHeightimpl(j11), f10));
    }

    /* JADX INFO: renamed from: takeOrElse-TmRCtEA, reason: not valid java name */
    public static final long m1469takeOrElseTmRCtEA(long j10, @NotNull a<Size> aVar) {
        p.k(aVar, "block");
        return (j10 > Size.INSTANCE.m1460getUnspecifiedNHjbRc() ? 1 : (j10 == Size.INSTANCE.m1460getUnspecifiedNHjbRc() ? 0 : -1)) != 0 ? j10 : aVar.invoke().getPackedValue();
    }

    @Stable
    /* JADX INFO: renamed from: times-d16Qtg0, reason: not valid java name */
    public static final long m1470timesd16Qtg0(double d10, long j10) {
        return Size.m1455times7Ah8Wj8(j10, (float) d10);
    }

    @Stable
    /* JADX INFO: renamed from: times-d16Qtg0, reason: not valid java name */
    public static final long m1471timesd16Qtg0(float f10, long j10) {
        return Size.m1455times7Ah8Wj8(j10, f10);
    }

    @Stable
    /* JADX INFO: renamed from: times-d16Qtg0, reason: not valid java name */
    public static final long m1472timesd16Qtg0(int i10, long j10) {
        return Size.m1455times7Ah8Wj8(j10, i10);
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: toRect-uvyYCjk, reason: not valid java name */
    public static final Rect m1473toRectuvyYCjk(long j10) {
        return RectKt.m1423Recttz77jQw(Offset.INSTANCE.m1399getZeroF1C5BW0(), j10);
    }
}
