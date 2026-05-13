package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import tn.p;
import vn.c;

/* JADX INFO: compiled from: Density.kt */
/* JADX INFO: loaded from: classes3.dex */
@Immutable
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u000b\u001a\u00020\f*\u00020\rH\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u000b\u001a\u00020\f*\u00020\u0010H\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\r*\u00020\u0010H\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0013\u001a\u00020\r*\u00020\u0003H\u0017ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001c\u0010\u0013\u001a\u00020\r*\u00020\fH\u0017ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0018J\u0019\u0010\u0019\u001a\u00020\u001a*\u00020\u001bH\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001e\u001a\u00020\u0003*\u00020\rH\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010\u0017J\u0019\u0010\u001e\u001a\u00020\u0003*\u00020\u0010H\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010\u0015J\f\u0010!\u001a\u00020\"*\u00020#H\u0017J\u0019\u0010$\u001a\u00020\u001b*\u00020\u001aH\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010\u001dJ\u0019\u0010&\u001a\u00020\u0010*\u00020\rH\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010(J\u001c\u0010&\u001a\u00020\u0010*\u00020\u0003H\u0017ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b)\u0010(J\u001c\u0010&\u001a\u00020\u0010*\u00020\fH\u0017ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0002\u001a\u00020\u00038&X§\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u00038&X§\u0004¢\u0006\f\u0012\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007ø\u0001\u0003\u0082\u0002\u0015\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006+À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/unit/Density;", "", "density", "", "getDensity$annotations", "()V", "getDensity", "()F", "fontScale", "getFontScale$annotations", "getFontScale", "roundToPx", "", "Landroidx/compose/ui/unit/Dp;", "roundToPx-0680j_4", "(F)I", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp", "toDp-GaN1DYA", "(J)F", "toDp-u2uoSUM", "(F)F", "(I)F", "toDpSize", "Landroidx/compose/ui/unit/DpSize;", "Landroidx/compose/ui/geometry/Size;", "toDpSize-k-rfVVM", "(J)J", "toPx", "toPx-0680j_4", "toPx--R2X_6o", "toRect", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/unit/DpRect;", "toSize", "toSize-XkaWNTQ", "toSp", "toSp-0xMU5do", "(F)J", "toSp-kPz2Gy4", "(I)J", "ui-unit_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface Density {

    /* JADX INFO: compiled from: Density.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
        @Stable
        public static /* synthetic */ void getDensity$annotations() {
        }

        @Stable
        public static /* synthetic */ void getFontScale$annotations() {
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m3812roundToPxR2X_6o(@NotNull Density density, long j10) {
            return Density.super.mo299roundToPxR2X_6o(j10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m3813roundToPx0680j_4(@NotNull Density density, float f10) {
            return Density.super.mo300roundToPx0680j_4(f10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m3814toDpGaN1DYA(@NotNull Density density, long j10) {
            return Density.super.mo301toDpGaN1DYA(j10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m3815toDpu2uoSUM(@NotNull Density density, float f10) {
            return Density.super.mo302toDpu2uoSUM(f10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m3816toDpu2uoSUM(@NotNull Density density, int i10) {
            return Density.super.mo303toDpu2uoSUM(i10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m3817toDpSizekrfVVM(@NotNull Density density, long j10) {
            return Density.super.mo304toDpSizekrfVVM(j10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m3818toPxR2X_6o(@NotNull Density density, long j10) {
            return Density.super.mo305toPxR2X_6o(j10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m3819toPx0680j_4(@NotNull Density density, float f10) {
            return Density.super.mo306toPx0680j_4(f10);
        }

        @Stable
        @Deprecated
        @NotNull
        public static Rect toRect(@NotNull Density density, @NotNull DpRect dpRect) {
            p.k(dpRect, "receiver");
            return Density.super.toRect(dpRect);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m3820toSizeXkaWNTQ(@NotNull Density density, long j10) {
            return Density.super.mo307toSizeXkaWNTQ(j10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m3821toSp0xMU5do(@NotNull Density density, float f10) {
            return Density.super.mo308toSp0xMU5do(f10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m3822toSpkPz2Gy4(@NotNull Density density, float f10) {
            return Density.super.mo309toSpkPz2Gy4(f10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m3823toSpkPz2Gy4(@NotNull Density density, int i10) {
            return Density.super.mo310toSpkPz2Gy4(i10);
        }
    }

    float getDensity();

    float getFontScale();

    @Stable
    /* JADX INFO: renamed from: roundToPx--R2X_6o */
    default int mo299roundToPxR2X_6o(long j10) {
        return c.d(mo305toPxR2X_6o(j10));
    }

    @Stable
    /* JADX INFO: renamed from: roundToPx-0680j_4 */
    default int mo300roundToPx0680j_4(float f10) {
        float fMo306toPx0680j_4 = mo306toPx0680j_4(f10);
        if (Float.isInfinite(fMo306toPx0680j_4)) {
            return Integer.MAX_VALUE;
        }
        return c.d(fMo306toPx0680j_4);
    }

    @Stable
    /* JADX INFO: renamed from: toDp-GaN1DYA */
    default float mo301toDpGaN1DYA(long j10) {
        if (TextUnitType.m4035equalsimpl0(TextUnit.m4006getTypeUIouoOA(j10), TextUnitType.INSTANCE.m4040getSpUIouoOA())) {
            return Dp.m3826constructorimpl(TextUnit.m4007getValueimpl(j10) * getFontScale());
        }
        throw new IllegalStateException("Only Sp can convert to Px".toString());
    }

    @Stable
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    default float mo302toDpu2uoSUM(float f10) {
        return Dp.m3826constructorimpl(f10 / getDensity());
    }

    @Stable
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    default float mo303toDpu2uoSUM(int i10) {
        return Dp.m3826constructorimpl(i10 / getDensity());
    }

    @Stable
    /* JADX INFO: renamed from: toDpSize-k-rfVVM */
    default long mo304toDpSizekrfVVM(long j10) {
        return (j10 > Size.INSTANCE.m1460getUnspecifiedNHjbRc() ? 1 : (j10 == Size.INSTANCE.m1460getUnspecifiedNHjbRc() ? 0 : -1)) != 0 ? DpKt.m3848DpSizeYgX7TsA(mo302toDpu2uoSUM(Size.m1452getWidthimpl(j10)), mo302toDpu2uoSUM(Size.m1449getHeightimpl(j10))) : DpSize.INSTANCE.m3933getUnspecifiedMYxV2XQ();
    }

    @Stable
    /* JADX INFO: renamed from: toPx--R2X_6o */
    default float mo305toPxR2X_6o(long j10) {
        if (TextUnitType.m4035equalsimpl0(TextUnit.m4006getTypeUIouoOA(j10), TextUnitType.INSTANCE.m4040getSpUIouoOA())) {
            return TextUnit.m4007getValueimpl(j10) * getFontScale() * getDensity();
        }
        throw new IllegalStateException("Only Sp can convert to Px".toString());
    }

    @Stable
    /* JADX INFO: renamed from: toPx-0680j_4 */
    default float mo306toPx0680j_4(float f10) {
        return f10 * getDensity();
    }

    @Stable
    @NotNull
    default Rect toRect(@NotNull DpRect dpRect) {
        p.k(dpRect, "<this>");
        return new Rect(mo306toPx0680j_4(dpRect.m3909getLeftD9Ej5fM()), mo306toPx0680j_4(dpRect.m3911getTopD9Ej5fM()), mo306toPx0680j_4(dpRect.m3910getRightD9Ej5fM()), mo306toPx0680j_4(dpRect.m3908getBottomD9Ej5fM()));
    }

    @Stable
    /* JADX INFO: renamed from: toSize-XkaWNTQ */
    default long mo307toSizeXkaWNTQ(long j10) {
        return (j10 > DpSize.INSTANCE.m3933getUnspecifiedMYxV2XQ() ? 1 : (j10 == DpSize.INSTANCE.m3933getUnspecifiedMYxV2XQ() ? 0 : -1)) != 0 ? SizeKt.Size(mo306toPx0680j_4(DpSize.m3924getWidthD9Ej5fM(j10)), mo306toPx0680j_4(DpSize.m3922getHeightD9Ej5fM(j10))) : Size.INSTANCE.m1460getUnspecifiedNHjbRc();
    }

    @Stable
    /* JADX INFO: renamed from: toSp-0xMU5do */
    default long mo308toSp0xMU5do(float f10) {
        return TextUnitKt.getSp(f10 / getFontScale());
    }

    @Stable
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    default long mo309toSpkPz2Gy4(float f10) {
        return TextUnitKt.getSp(f10 / (getFontScale() * getDensity()));
    }

    @Stable
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    default long mo310toSpkPz2Gy4(int i10) {
        return TextUnitKt.getSp(i10 / (getFontScale() * getDensity()));
    }
}
