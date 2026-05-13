package androidx.compose.ui.graphics.drawscope;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.unit.DpRect;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: ContentDrawScope.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lbn/r;", "drawContent", "ui-graphics_release"}, k = 1, mv = {1, 6, 0})
public interface ContentDrawScope extends DrawScope {

    /* JADX INFO: compiled from: ContentDrawScope.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        /* JADX INFO: renamed from: drawImage-AZ2fEMs, reason: not valid java name */
        public static void m2062drawImageAZ2fEMs(@NotNull ContentDrawScope contentDrawScope, @NotNull ImageBitmap imageBitmap, long j10, long j11, long j12, long j13, float f10, @NotNull DrawStyle drawStyle, @Nullable ColorFilter colorFilter, int i10, int i11) {
            p.k(imageBitmap, "image");
            p.k(drawStyle, "style");
            ContentDrawScope.super.mo2019drawImageAZ2fEMs(imageBitmap, j10, j11, j12, j13, f10, drawStyle, colorFilter, i10, i11);
        }

        @Deprecated
        /* JADX INFO: renamed from: getCenter-F1C5BW0, reason: not valid java name */
        public static long m2063getCenterF1C5BW0(@NotNull ContentDrawScope contentDrawScope) {
            return ContentDrawScope.super.mo2112getCenterF1C5BW0();
        }

        @Deprecated
        /* JADX INFO: renamed from: getSize-NH-jbRc, reason: not valid java name */
        public static long m2064getSizeNHjbRc(@NotNull ContentDrawScope contentDrawScope) {
            return ContentDrawScope.super.mo2113getSizeNHjbRc();
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m2065roundToPxR2X_6o(@NotNull ContentDrawScope contentDrawScope, long j10) {
            return ContentDrawScope.super.mo299roundToPxR2X_6o(j10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m2066roundToPx0680j_4(@NotNull ContentDrawScope contentDrawScope, float f10) {
            return ContentDrawScope.super.mo300roundToPx0680j_4(f10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m2067toDpGaN1DYA(@NotNull ContentDrawScope contentDrawScope, long j10) {
            return ContentDrawScope.super.mo301toDpGaN1DYA(j10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m2068toDpu2uoSUM(@NotNull ContentDrawScope contentDrawScope, float f10) {
            return ContentDrawScope.super.mo302toDpu2uoSUM(f10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m2069toDpu2uoSUM(@NotNull ContentDrawScope contentDrawScope, int i10) {
            return ContentDrawScope.super.mo303toDpu2uoSUM(i10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m2070toDpSizekrfVVM(@NotNull ContentDrawScope contentDrawScope, long j10) {
            return ContentDrawScope.super.mo304toDpSizekrfVVM(j10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m2071toPxR2X_6o(@NotNull ContentDrawScope contentDrawScope, long j10) {
            return ContentDrawScope.super.mo305toPxR2X_6o(j10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m2072toPx0680j_4(@NotNull ContentDrawScope contentDrawScope, float f10) {
            return ContentDrawScope.super.mo306toPx0680j_4(f10);
        }

        @Stable
        @Deprecated
        @NotNull
        public static Rect toRect(@NotNull ContentDrawScope contentDrawScope, @NotNull DpRect dpRect) {
            p.k(dpRect, "receiver");
            return ContentDrawScope.super.toRect(dpRect);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m2073toSizeXkaWNTQ(@NotNull ContentDrawScope contentDrawScope, long j10) {
            return ContentDrawScope.super.mo307toSizeXkaWNTQ(j10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m2074toSp0xMU5do(@NotNull ContentDrawScope contentDrawScope, float f10) {
            return ContentDrawScope.super.mo308toSp0xMU5do(f10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m2075toSpkPz2Gy4(@NotNull ContentDrawScope contentDrawScope, float f10) {
            return ContentDrawScope.super.mo309toSpkPz2Gy4(f10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m2076toSpkPz2Gy4(@NotNull ContentDrawScope contentDrawScope, int i10) {
            return ContentDrawScope.super.mo310toSpkPz2Gy4(i10);
        }
    }

    void drawContent();
}
