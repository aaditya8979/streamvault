package androidx.compose.ui.unit;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.util.MathHelpersKt;
import io.bidmachine.iab.vast.tags.VastAttributes;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sn.a;
import tn.p;
import zn.n;

/* JADX INFO: compiled from: Dp.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\n\u001a+\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001H\u0086\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\"\u0010\n\u001a\u00020\u0000*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0000H\u0087\nø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b\b\u0010\t\u001a\"\u0010\n\u001a\u00020\u0000*\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0000H\u0087\nø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b\b\u0010\f\u001a\"\u0010\n\u001a\u00020\u0000*\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0000H\u0087\nø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b\b\u0010\u000e\u001a&\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0000H\u0087\bø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b\u0011\u0010\t\u001a&\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0000H\u0087\bø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b\u0013\u0010\t\u001a*\u0010\u0019\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0000H\u0087\bø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a\"\u0010\u001b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0000H\u0087\bø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b\u001a\u0010\t\u001a\"\u0010\u001d\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0000H\u0087\bø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b\u001c\u0010\t\u001a-\u0010\"\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b!\u0010\u0018\u001a%\u0010(\u001a\u00020%2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u0000H\u0007ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b&\u0010'\u001a+\u0010\u0005\u001a\u00020%*\u00020%2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020%0\u0001H\u0086\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b)\u0010*\u001a-\u0010\"\u001a\u00020%2\u0006\u0010\u001e\u001a\u00020%2\u0006\u0010\u001f\u001a\u00020%2\u0006\u0010 \u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b+\u0010,\u001a%\u00101\u001a\u00020/2\u0006\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u0000H\u0007ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b0\u0010'\u001a+\u0010\u0005\u001a\u00020/*\u00020/2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020/0\u0001H\u0086\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b2\u0010*\u001a\"\u0010\n\u001a\u00020/*\u00020\r2\u0006\u00103\u001a\u00020/H\u0087\nø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b4\u00105\u001a\"\u0010\n\u001a\u00020/*\u00020\u00062\u0006\u00103\u001a\u00020/H\u0087\nø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b4\u00106\u001a-\u0010\"\u001a\u00020/2\u0006\u0010\u001e\u001a\u00020/2\u0006\u0010\u001f\u001a\u00020/2\u0006\u0010 \u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b7\u0010,\"\"\u0010=\u001a\u000208*\u00020\u00008Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b;\u0010<\u001a\u0004\b9\u0010:\"\"\u0010@\u001a\u000208*\u00020\u00008Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b?\u0010<\u001a\u0004\b>\u0010:\"\"\u0010E\u001a\u00020\u0000*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\bC\u0010D\u001a\u0004\bA\u0010B\"\"\u0010E\u001a\u00020\u0000*\u00020\u000b8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\bC\u0010G\u001a\u0004\bA\u0010F\"\"\u0010E\u001a\u00020\u0000*\u00020\u00068Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\bC\u0010<\u001a\u0004\bA\u0010H\"\"\u0010K\u001a\u000208*\u00020\u00008Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\bJ\u0010<\u001a\u0004\bI\u0010:\"\"\u0010=\u001a\u000208*\u00020%8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\bN\u0010O\u001a\u0004\bL\u0010M\"\"\u0010@\u001a\u000208*\u00020%8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\bQ\u0010O\u001a\u0004\bP\u0010M\"\"\u0010=\u001a\u000208*\u00020/8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\bS\u0010O\u001a\u0004\bR\u0010M\"\"\u0010@\u001a\u000208*\u00020/8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\bU\u0010O\u001a\u0004\bT\u0010M\"!\u0010Y\u001a\u00020%*\u00020/8FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\bX\u0010O\u001a\u0004\bV\u0010W\"\"\u0010-\u001a\u00020\u0000*\u00020Z8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b]\u0010^\u001a\u0004\b[\u0010\\\"\"\u0010.\u001a\u00020\u0000*\u00020Z8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b`\u0010^\u001a\u0004\b_\u0010\\\"\"\u00103\u001a\u00020/*\u00020Z8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\bc\u0010^\u001a\u0004\ba\u0010b\u0082\u0002\u0012\n\u0002\b\u0019\n\u0005\b\u009920\u0001\n\u0005\b¡\u001e0\u0001¨\u0006d"}, d2 = {"Landroidx/compose/ui/unit/Dp;", "Lkotlin/Function0;", "block", "takeOrElse-D5KLDUw", "(FLsn/a;)F", "takeOrElse", "", "other", "times-3ABfNKs", "(FF)F", "times", "", "(DF)F", "", "(IF)F", "a", "b", "min-YgX7TsA", "min", "max-YgX7TsA", "max", "minimumValue", "maximumValue", "coerceIn-2z7ARbQ", "(FFF)F", "coerceIn", "coerceAtLeast-YgX7TsA", "coerceAtLeast", "coerceAtMost-YgX7TsA", "coerceAtMost", "start", "stop", "fraction", "lerp-Md-fbLM", "lerp", VastAttributes.HORIZONTAL_POSITION, VastAttributes.VERTICAL_POSITION, "Landroidx/compose/ui/unit/DpOffset;", "DpOffset-YgX7TsA", "(FF)J", "DpOffset", "takeOrElse-gVKV90s", "(JLsn/a;)J", "lerp-xhh869w", "(JJF)J", "width", "height", "Landroidx/compose/ui/unit/DpSize;", "DpSize-YgX7TsA", "DpSize", "takeOrElse-itqla9I", "size", "times-6HolHcs", "(IJ)J", "(FJ)J", "lerp-IDex15A", "", "isSpecified-0680j_4", "(F)Z", "isSpecified-0680j_4$annotations", "(F)V", "isSpecified", "isUnspecified-0680j_4", "isUnspecified-0680j_4$annotations", "isUnspecified", "getDp", "(I)F", "getDp$annotations", "(I)V", "dp", "(D)F", "(D)V", "(F)F", "isFinite-0680j_4", "isFinite-0680j_4$annotations", "isFinite", "isSpecified-jo-Fl9I", "(J)Z", "isSpecified-jo-Fl9I$annotations", "(J)V", "isUnspecified-jo-Fl9I", "isUnspecified-jo-Fl9I$annotations", "isSpecified-EaSLcWc", "isSpecified-EaSLcWc$annotations", "isUnspecified-EaSLcWc", "isUnspecified-EaSLcWc$annotations", "getCenter-EaSLcWc", "(J)J", "getCenter-EaSLcWc$annotations", "center", "Landroidx/compose/ui/unit/DpRect;", "getWidth", "(Landroidx/compose/ui/unit/DpRect;)F", "getWidth$annotations", "(Landroidx/compose/ui/unit/DpRect;)V", "getHeight", "getHeight$annotations", "getSize", "(Landroidx/compose/ui/unit/DpRect;)J", "getSize$annotations", "ui-unit_release"}, k = 2, mv = {1, 6, 0})
public final class DpKt {
    @Stable
    /* JADX INFO: renamed from: DpOffset-YgX7TsA, reason: not valid java name */
    public static final long m3847DpOffsetYgX7TsA(float f10, float f11) {
        return DpOffset.m3882constructorimpl((((long) Float.floatToIntBits(f11)) & 4294967295L) | (Float.floatToIntBits(f10) << 32));
    }

    @Stable
    /* JADX INFO: renamed from: DpSize-YgX7TsA, reason: not valid java name */
    public static final long m3848DpSizeYgX7TsA(float f10, float f11) {
        return DpSize.m3915constructorimpl((((long) Float.floatToIntBits(f11)) & 4294967295L) | (Float.floatToIntBits(f10) << 32));
    }

    @Stable
    /* JADX INFO: renamed from: coerceAtLeast-YgX7TsA, reason: not valid java name */
    public static final float m3849coerceAtLeastYgX7TsA(float f10, float f11) {
        return Dp.m3826constructorimpl(n.d(f10, f11));
    }

    @Stable
    /* JADX INFO: renamed from: coerceAtMost-YgX7TsA, reason: not valid java name */
    public static final float m3850coerceAtMostYgX7TsA(float f10, float f11) {
        return Dp.m3826constructorimpl(n.i(f10, f11));
    }

    @Stable
    /* JADX INFO: renamed from: coerceIn-2z7ARbQ, reason: not valid java name */
    public static final float m3851coerceIn2z7ARbQ(float f10, float f11, float f12) {
        return Dp.m3826constructorimpl(n.m(f10, f11, f12));
    }

    /* JADX INFO: renamed from: getCenter-EaSLcWc, reason: not valid java name */
    public static final long m3852getCenterEaSLcWc(long j10) {
        return m3847DpOffsetYgX7TsA(Dp.m3826constructorimpl(DpSize.m3924getWidthD9Ej5fM(j10) / 2.0f), Dp.m3826constructorimpl(DpSize.m3922getHeightD9Ej5fM(j10) / 2.0f));
    }

    @Stable
    /* JADX INFO: renamed from: getCenter-EaSLcWc$annotations, reason: not valid java name */
    public static /* synthetic */ void m3853getCenterEaSLcWc$annotations(long j10) {
    }

    public static final float getDp(double d10) {
        return Dp.m3826constructorimpl((float) d10);
    }

    public static final float getDp(float f10) {
        return Dp.m3826constructorimpl(f10);
    }

    public static final float getDp(int i10) {
        return Dp.m3826constructorimpl(i10);
    }

    @Stable
    public static /* synthetic */ void getDp$annotations(double d10) {
    }

    @Stable
    public static /* synthetic */ void getDp$annotations(float f10) {
    }

    @Stable
    public static /* synthetic */ void getDp$annotations(int i10) {
    }

    public static final float getHeight(@NotNull DpRect dpRect) {
        p.k(dpRect, "<this>");
        return Dp.m3826constructorimpl(dpRect.m3908getBottomD9Ej5fM() - dpRect.m3911getTopD9Ej5fM());
    }

    @Stable
    public static /* synthetic */ void getHeight$annotations(DpRect dpRect) {
    }

    public static final long getSize(@NotNull DpRect dpRect) {
        p.k(dpRect, "<this>");
        return m3848DpSizeYgX7TsA(Dp.m3826constructorimpl(dpRect.m3910getRightD9Ej5fM() - dpRect.m3909getLeftD9Ej5fM()), Dp.m3826constructorimpl(dpRect.m3908getBottomD9Ej5fM() - dpRect.m3911getTopD9Ej5fM()));
    }

    @Stable
    public static /* synthetic */ void getSize$annotations(DpRect dpRect) {
    }

    public static final float getWidth(@NotNull DpRect dpRect) {
        p.k(dpRect, "<this>");
        return Dp.m3826constructorimpl(dpRect.m3910getRightD9Ej5fM() - dpRect.m3909getLeftD9Ej5fM());
    }

    @Stable
    public static /* synthetic */ void getWidth$annotations(DpRect dpRect) {
    }

    /* JADX INFO: renamed from: isFinite-0680j_4, reason: not valid java name */
    public static final boolean m3854isFinite0680j_4(float f10) {
        return !(f10 == Float.POSITIVE_INFINITY);
    }

    @Stable
    /* JADX INFO: renamed from: isFinite-0680j_4$annotations, reason: not valid java name */
    public static /* synthetic */ void m3855isFinite0680j_4$annotations(float f10) {
    }

    /* JADX INFO: renamed from: isSpecified-0680j_4, reason: not valid java name */
    public static final boolean m3856isSpecified0680j_4(float f10) {
        return !Float.isNaN(f10);
    }

    @Stable
    /* JADX INFO: renamed from: isSpecified-0680j_4$annotations, reason: not valid java name */
    public static /* synthetic */ void m3857isSpecified0680j_4$annotations(float f10) {
    }

    /* JADX INFO: renamed from: isSpecified-EaSLcWc, reason: not valid java name */
    public static final boolean m3858isSpecifiedEaSLcWc(long j10) {
        return j10 != DpSize.INSTANCE.m3933getUnspecifiedMYxV2XQ();
    }

    @Stable
    /* JADX INFO: renamed from: isSpecified-EaSLcWc$annotations, reason: not valid java name */
    public static /* synthetic */ void m3859isSpecifiedEaSLcWc$annotations(long j10) {
    }

    /* JADX INFO: renamed from: isSpecified-jo-Fl9I, reason: not valid java name */
    public static final boolean m3860isSpecifiedjoFl9I(long j10) {
        return j10 != DpOffset.INSTANCE.m3896getUnspecifiedRKDOV3M();
    }

    @Stable
    /* JADX INFO: renamed from: isSpecified-jo-Fl9I$annotations, reason: not valid java name */
    public static /* synthetic */ void m3861isSpecifiedjoFl9I$annotations(long j10) {
    }

    /* JADX INFO: renamed from: isUnspecified-0680j_4, reason: not valid java name */
    public static final boolean m3862isUnspecified0680j_4(float f10) {
        return Float.isNaN(f10);
    }

    @Stable
    /* JADX INFO: renamed from: isUnspecified-0680j_4$annotations, reason: not valid java name */
    public static /* synthetic */ void m3863isUnspecified0680j_4$annotations(float f10) {
    }

    /* JADX INFO: renamed from: isUnspecified-EaSLcWc, reason: not valid java name */
    public static final boolean m3864isUnspecifiedEaSLcWc(long j10) {
        return j10 == DpSize.INSTANCE.m3933getUnspecifiedMYxV2XQ();
    }

    @Stable
    /* JADX INFO: renamed from: isUnspecified-EaSLcWc$annotations, reason: not valid java name */
    public static /* synthetic */ void m3865isUnspecifiedEaSLcWc$annotations(long j10) {
    }

    /* JADX INFO: renamed from: isUnspecified-jo-Fl9I, reason: not valid java name */
    public static final boolean m3866isUnspecifiedjoFl9I(long j10) {
        return j10 == DpOffset.INSTANCE.m3896getUnspecifiedRKDOV3M();
    }

    @Stable
    /* JADX INFO: renamed from: isUnspecified-jo-Fl9I$annotations, reason: not valid java name */
    public static /* synthetic */ void m3867isUnspecifiedjoFl9I$annotations(long j10) {
    }

    @Stable
    /* JADX INFO: renamed from: lerp-IDex15A, reason: not valid java name */
    public static final long m3868lerpIDex15A(long j10, long j11, float f10) {
        return m3848DpSizeYgX7TsA(m3869lerpMdfbLM(DpSize.m3924getWidthD9Ej5fM(j10), DpSize.m3924getWidthD9Ej5fM(j11), f10), m3869lerpMdfbLM(DpSize.m3922getHeightD9Ej5fM(j10), DpSize.m3922getHeightD9Ej5fM(j11), f10));
    }

    @Stable
    /* JADX INFO: renamed from: lerp-Md-fbLM, reason: not valid java name */
    public static final float m3869lerpMdfbLM(float f10, float f11, float f12) {
        return Dp.m3826constructorimpl(MathHelpersKt.lerp(f10, f11, f12));
    }

    @Stable
    /* JADX INFO: renamed from: lerp-xhh869w, reason: not valid java name */
    public static final long m3870lerpxhh869w(long j10, long j11, float f10) {
        return m3847DpOffsetYgX7TsA(m3869lerpMdfbLM(DpOffset.m3887getXD9Ej5fM(j10), DpOffset.m3887getXD9Ej5fM(j11), f10), m3869lerpMdfbLM(DpOffset.m3889getYD9Ej5fM(j10), DpOffset.m3889getYD9Ej5fM(j11), f10));
    }

    @Stable
    /* JADX INFO: renamed from: max-YgX7TsA, reason: not valid java name */
    public static final float m3871maxYgX7TsA(float f10, float f11) {
        return Dp.m3826constructorimpl(Math.max(f10, f11));
    }

    @Stable
    /* JADX INFO: renamed from: min-YgX7TsA, reason: not valid java name */
    public static final float m3872minYgX7TsA(float f10, float f11) {
        return Dp.m3826constructorimpl(Math.min(f10, f11));
    }

    /* JADX INFO: renamed from: takeOrElse-D5KLDUw, reason: not valid java name */
    public static final float m3873takeOrElseD5KLDUw(float f10, @NotNull a<Dp> aVar) {
        p.k(aVar, "block");
        return Float.isNaN(f10) ^ true ? f10 : aVar.invoke().m3840unboximpl();
    }

    /* JADX INFO: renamed from: takeOrElse-gVKV90s, reason: not valid java name */
    public static final long m3874takeOrElsegVKV90s(long j10, @NotNull a<DpOffset> aVar) {
        p.k(aVar, "block");
        return (j10 > DpOffset.INSTANCE.m3896getUnspecifiedRKDOV3M() ? 1 : (j10 == DpOffset.INSTANCE.m3896getUnspecifiedRKDOV3M() ? 0 : -1)) != 0 ? j10 : aVar.invoke().getPackedValue();
    }

    /* JADX INFO: renamed from: takeOrElse-itqla9I, reason: not valid java name */
    public static final long m3875takeOrElseitqla9I(long j10, @NotNull a<DpSize> aVar) {
        p.k(aVar, "block");
        return (j10 > DpSize.INSTANCE.m3933getUnspecifiedMYxV2XQ() ? 1 : (j10 == DpSize.INSTANCE.m3933getUnspecifiedMYxV2XQ() ? 0 : -1)) != 0 ? j10 : aVar.invoke().getPackedValue();
    }

    @Stable
    /* JADX INFO: renamed from: times-3ABfNKs, reason: not valid java name */
    public static final float m3876times3ABfNKs(double d10, float f10) {
        return Dp.m3826constructorimpl(((float) d10) * f10);
    }

    @Stable
    /* JADX INFO: renamed from: times-3ABfNKs, reason: not valid java name */
    public static final float m3877times3ABfNKs(float f10, float f11) {
        return Dp.m3826constructorimpl(f10 * f11);
    }

    @Stable
    /* JADX INFO: renamed from: times-3ABfNKs, reason: not valid java name */
    public static final float m3878times3ABfNKs(int i10, float f10) {
        return Dp.m3826constructorimpl(i10 * f10);
    }

    @Stable
    /* JADX INFO: renamed from: times-6HolHcs, reason: not valid java name */
    public static final long m3879times6HolHcs(float f10, long j10) {
        return DpSize.m3929timesGh9hcWk(j10, f10);
    }

    @Stable
    /* JADX INFO: renamed from: times-6HolHcs, reason: not valid java name */
    public static final long m3880times6HolHcs(int i10, long j10) {
        return DpSize.m3930timesGh9hcWk(j10, i10);
    }
}
