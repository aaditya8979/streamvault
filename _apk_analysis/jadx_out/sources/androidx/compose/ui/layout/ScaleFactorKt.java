package androidx.compose.ui.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sn.a;
import tn.p;

/* JADX INFO: compiled from: ScaleFactor.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\t\u001a\"\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\f\u0010\u0006\u001a\u00020\u0000*\u00020\u0000H\u0002\u001a+\u0010\u000b\u001a\u00020\u0003*\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0086\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\t\u0010\n\u001a\"\u0010\u0010\u001a\u00020\f*\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H\u0087\u0002ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\"\u0010\u0010\u001a\u00020\f*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\fH\u0087\u0002ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b\u0012\u0010\u000f\u001a\"\u0010\u0014\u001a\u00020\f*\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H\u0087\u0002ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b\u0013\u0010\u000f\u001a-\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0000H\u0007ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b\u0018\u0010\u0019\"\"\u0010 \u001a\u00020\u001b*\u00020\u00038Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001d\"\"\u0010#\u001a\u00020\u001b*\u00020\u00038Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\"\u0010\u001f\u001a\u0004\b!\u0010\u001d\u0082\u0002\u0012\n\u0002\b\u0019\n\u0005\b\u009920\u0001\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"", "scaleX", "scaleY", "Landroidx/compose/ui/layout/ScaleFactor;", "ScaleFactor", "(FF)J", "roundToTenths", "Lkotlin/Function0;", "block", "takeOrElse-oyDd2qo", "(JLsn/a;)J", "takeOrElse", "Landroidx/compose/ui/geometry/Size;", "scaleFactor", "times-UQTWf7w", "(JJ)J", "times", "size", "times-m-w2e94", "div-UQTWf7w", "div", "start", "stop", "fraction", "lerp--bDIf60", "(JJF)J", "lerp", "", "isSpecified-FK8aYYs", "(J)Z", "isSpecified-FK8aYYs$annotations", "(J)V", "isSpecified", "isUnspecified-FK8aYYs", "isUnspecified-FK8aYYs$annotations", "isUnspecified", "ui_release"}, k = 2, mv = {1, 6, 0})
public final class ScaleFactorKt {
    @Stable
    public static final long ScaleFactor(float f10, float f11) {
        return ScaleFactor.m3167constructorimpl((((long) Float.floatToIntBits(f11)) & 4294967295L) | (Float.floatToIntBits(f10) << 32));
    }

    @Stable
    /* JADX INFO: renamed from: div-UQTWf7w, reason: not valid java name */
    public static final long m3181divUQTWf7w(long j10, long j11) {
        return SizeKt.Size(Size.m1452getWidthimpl(j10) / ScaleFactor.m3173getScaleXimpl(j11), Size.m1449getHeightimpl(j10) / ScaleFactor.m3174getScaleYimpl(j11));
    }

    /* JADX INFO: renamed from: isSpecified-FK8aYYs, reason: not valid java name */
    public static final boolean m3182isSpecifiedFK8aYYs(long j10) {
        return j10 != ScaleFactor.Companion.m3180getUnspecified_hLwfpc();
    }

    @Stable
    /* JADX INFO: renamed from: isSpecified-FK8aYYs$annotations, reason: not valid java name */
    public static /* synthetic */ void m3183isSpecifiedFK8aYYs$annotations(long j10) {
    }

    /* JADX INFO: renamed from: isUnspecified-FK8aYYs, reason: not valid java name */
    public static final boolean m3184isUnspecifiedFK8aYYs(long j10) {
        return j10 == ScaleFactor.Companion.m3180getUnspecified_hLwfpc();
    }

    @Stable
    /* JADX INFO: renamed from: isUnspecified-FK8aYYs$annotations, reason: not valid java name */
    public static /* synthetic */ void m3185isUnspecifiedFK8aYYs$annotations(long j10) {
    }

    @Stable
    /* JADX INFO: renamed from: lerp--bDIf60, reason: not valid java name */
    public static final long m3186lerpbDIf60(long j10, long j11, float f10) {
        return ScaleFactor(MathHelpersKt.lerp(ScaleFactor.m3173getScaleXimpl(j10), ScaleFactor.m3173getScaleXimpl(j11), f10), MathHelpersKt.lerp(ScaleFactor.m3174getScaleYimpl(j10), ScaleFactor.m3174getScaleYimpl(j11), f10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float roundToTenths(float f10) {
        float f11 = 10;
        float f12 = f10 * f11;
        int i10 = (int) f12;
        if (f12 - i10 >= 0.5f) {
            i10++;
        }
        return i10 / f11;
    }

    /* JADX INFO: renamed from: takeOrElse-oyDd2qo, reason: not valid java name */
    public static final long m3187takeOrElseoyDd2qo(long j10, @NotNull a<ScaleFactor> aVar) {
        p.k(aVar, "block");
        return (j10 > ScaleFactor.Companion.m3180getUnspecified_hLwfpc() ? 1 : (j10 == ScaleFactor.Companion.m3180getUnspecified_hLwfpc() ? 0 : -1)) != 0 ? j10 : aVar.invoke().m3178unboximpl();
    }

    @Stable
    /* JADX INFO: renamed from: times-UQTWf7w, reason: not valid java name */
    public static final long m3188timesUQTWf7w(long j10, long j11) {
        return SizeKt.Size(Size.m1452getWidthimpl(j10) * ScaleFactor.m3173getScaleXimpl(j11), Size.m1449getHeightimpl(j10) * ScaleFactor.m3174getScaleYimpl(j11));
    }

    @Stable
    /* JADX INFO: renamed from: times-m-w2e94, reason: not valid java name */
    public static final long m3189timesmw2e94(long j10, long j11) {
        return m3188timesUQTWf7w(j11, j10);
    }
}
