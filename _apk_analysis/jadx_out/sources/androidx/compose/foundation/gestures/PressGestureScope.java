package androidx.compose.foundation.gestures;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import bn.r;
import hn.c;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: TapGestureDetector.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0006\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0004ø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/PressGestureScope;", "Landroidx/compose/ui/unit/Density;", "Lbn/r;", "awaitRelease", "(Lhn/c;)Ljava/lang/Object;", "", "tryAwaitRelease", "foundation_release"}, k = 1, mv = {1, 6, 0})
public interface PressGestureScope extends Density {

    /* JADX INFO: compiled from: TapGestureDetector.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
        @Stable
        @Deprecated
        /* JADX INFO: renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m287roundToPxR2X_6o(@NotNull PressGestureScope pressGestureScope, long j10) {
            return PressGestureScope.super.mo299roundToPxR2X_6o(j10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m288roundToPx0680j_4(@NotNull PressGestureScope pressGestureScope, float f10) {
            return PressGestureScope.super.mo300roundToPx0680j_4(f10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m289toDpGaN1DYA(@NotNull PressGestureScope pressGestureScope, long j10) {
            return PressGestureScope.super.mo301toDpGaN1DYA(j10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m290toDpu2uoSUM(@NotNull PressGestureScope pressGestureScope, float f10) {
            return PressGestureScope.super.mo302toDpu2uoSUM(f10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m291toDpu2uoSUM(@NotNull PressGestureScope pressGestureScope, int i10) {
            return PressGestureScope.super.mo303toDpu2uoSUM(i10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m292toDpSizekrfVVM(@NotNull PressGestureScope pressGestureScope, long j10) {
            return PressGestureScope.super.mo304toDpSizekrfVVM(j10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m293toPxR2X_6o(@NotNull PressGestureScope pressGestureScope, long j10) {
            return PressGestureScope.super.mo305toPxR2X_6o(j10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m294toPx0680j_4(@NotNull PressGestureScope pressGestureScope, float f10) {
            return PressGestureScope.super.mo306toPx0680j_4(f10);
        }

        @Stable
        @Deprecated
        @NotNull
        public static Rect toRect(@NotNull PressGestureScope pressGestureScope, @NotNull DpRect dpRect) {
            p.k(dpRect, "receiver");
            return PressGestureScope.super.toRect(dpRect);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m295toSizeXkaWNTQ(@NotNull PressGestureScope pressGestureScope, long j10) {
            return PressGestureScope.super.mo307toSizeXkaWNTQ(j10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m296toSp0xMU5do(@NotNull PressGestureScope pressGestureScope, float f10) {
            return PressGestureScope.super.mo308toSp0xMU5do(f10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m297toSpkPz2Gy4(@NotNull PressGestureScope pressGestureScope, float f10) {
            return PressGestureScope.super.mo309toSpkPz2Gy4(f10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m298toSpkPz2Gy4(@NotNull PressGestureScope pressGestureScope, int i10) {
            return PressGestureScope.super.mo310toSpkPz2Gy4(i10);
        }
    }

    @Nullable
    Object awaitRelease(@NotNull c<? super r> cVar);

    @Nullable
    Object tryAwaitRelease(@NotNull c<? super Boolean> cVar);
}
