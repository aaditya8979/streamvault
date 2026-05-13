package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import hn.c;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: SuspendingPointerInputFilter.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006JG\u0010\u000e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\t\u001a\u00020\b2\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJE\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\t\u001a\u00020\b2\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000fR\u001d\u0010\u0014\u001a\u00020\u00118&X¦\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0017\u001a\u00020\u00158VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dø\u0001\u0003\u0082\u0002\u0015\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u001fÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Landroidx/compose/ui/input/pointer/PointerEvent;", "awaitPointerEvent", "(Landroidx/compose/ui/input/pointer/PointerEventPass;Lhn/c;)Ljava/lang/Object;", "T", "", "timeMillis", "Lkotlin/Function2;", "Lhn/c;", "", "block", "withTimeoutOrNull", "(JLsn/p;Lhn/c;)Ljava/lang/Object;", "withTimeout", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "()J", "size", "Landroidx/compose/ui/geometry/Size;", "getExtendedTouchPadding-NH-jbRc", "extendedTouchPadding", "getCurrentEvent", "()Landroidx/compose/ui/input/pointer/PointerEvent;", "currentEvent", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "viewConfiguration", "ui_release"}, k = 1, mv = {1, 6, 0})
public interface AwaitPointerEventScope extends Density {

    /* JADX INFO: compiled from: SuspendingPointerInputFilter.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        /* JADX INFO: renamed from: getExtendedTouchPadding-NH-jbRc, reason: not valid java name */
        public static long m2904getExtendedTouchPaddingNHjbRc(@NotNull AwaitPointerEventScope awaitPointerEventScope) {
            return AwaitPointerEventScope.super.mo2902getExtendedTouchPaddingNHjbRc();
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m2905roundToPxR2X_6o(@NotNull AwaitPointerEventScope awaitPointerEventScope, long j10) {
            return AwaitPointerEventScope.super.mo299roundToPxR2X_6o(j10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m2906roundToPx0680j_4(@NotNull AwaitPointerEventScope awaitPointerEventScope, float f10) {
            return AwaitPointerEventScope.super.mo300roundToPx0680j_4(f10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m2907toDpGaN1DYA(@NotNull AwaitPointerEventScope awaitPointerEventScope, long j10) {
            return AwaitPointerEventScope.super.mo301toDpGaN1DYA(j10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m2908toDpu2uoSUM(@NotNull AwaitPointerEventScope awaitPointerEventScope, float f10) {
            return AwaitPointerEventScope.super.mo302toDpu2uoSUM(f10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m2909toDpu2uoSUM(@NotNull AwaitPointerEventScope awaitPointerEventScope, int i10) {
            return AwaitPointerEventScope.super.mo303toDpu2uoSUM(i10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m2910toDpSizekrfVVM(@NotNull AwaitPointerEventScope awaitPointerEventScope, long j10) {
            return AwaitPointerEventScope.super.mo304toDpSizekrfVVM(j10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m2911toPxR2X_6o(@NotNull AwaitPointerEventScope awaitPointerEventScope, long j10) {
            return AwaitPointerEventScope.super.mo305toPxR2X_6o(j10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m2912toPx0680j_4(@NotNull AwaitPointerEventScope awaitPointerEventScope, float f10) {
            return AwaitPointerEventScope.super.mo306toPx0680j_4(f10);
        }

        @Stable
        @Deprecated
        @NotNull
        public static Rect toRect(@NotNull AwaitPointerEventScope awaitPointerEventScope, @NotNull DpRect dpRect) {
            p.k(dpRect, "receiver");
            return AwaitPointerEventScope.super.toRect(dpRect);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m2913toSizeXkaWNTQ(@NotNull AwaitPointerEventScope awaitPointerEventScope, long j10) {
            return AwaitPointerEventScope.super.mo307toSizeXkaWNTQ(j10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m2914toSp0xMU5do(@NotNull AwaitPointerEventScope awaitPointerEventScope, float f10) {
            return AwaitPointerEventScope.super.mo308toSp0xMU5do(f10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m2915toSpkPz2Gy4(@NotNull AwaitPointerEventScope awaitPointerEventScope, float f10) {
            return AwaitPointerEventScope.super.mo309toSpkPz2Gy4(f10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m2916toSpkPz2Gy4(@NotNull AwaitPointerEventScope awaitPointerEventScope, int i10) {
            return AwaitPointerEventScope.super.mo310toSpkPz2Gy4(i10);
        }

        @Deprecated
        @Nullable
        public static <T> Object withTimeout(@NotNull AwaitPointerEventScope awaitPointerEventScope, long j10, @NotNull sn.p<? super AwaitPointerEventScope, ? super c<? super T>, ? extends Object> pVar, @NotNull c<? super T> cVar) {
            return AwaitPointerEventScope.super.withTimeout(j10, pVar, cVar);
        }

        @Deprecated
        @Nullable
        public static <T> Object withTimeoutOrNull(@NotNull AwaitPointerEventScope awaitPointerEventScope, long j10, @NotNull sn.p<? super AwaitPointerEventScope, ? super c<? super T>, ? extends Object> pVar, @NotNull c<? super T> cVar) {
            return AwaitPointerEventScope.super.withTimeoutOrNull(j10, pVar, cVar);
        }
    }

    static /* synthetic */ Object awaitPointerEvent$default(AwaitPointerEventScope awaitPointerEventScope, PointerEventPass pointerEventPass, c cVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitPointerEvent");
        }
        if ((i10 & 1) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return awaitPointerEventScope.awaitPointerEvent(pointerEventPass, cVar);
    }

    static /* synthetic */ Object withTimeout$suspendImpl(AwaitPointerEventScope awaitPointerEventScope, long j10, sn.p pVar, c cVar) {
        return pVar.mo2invoke(awaitPointerEventScope, cVar);
    }

    static /* synthetic */ Object withTimeoutOrNull$suspendImpl(AwaitPointerEventScope awaitPointerEventScope, long j10, sn.p pVar, c cVar) {
        return pVar.mo2invoke(awaitPointerEventScope, cVar);
    }

    @Nullable
    Object awaitPointerEvent(@NotNull PointerEventPass pointerEventPass, @NotNull c<? super PointerEvent> cVar);

    @NotNull
    PointerEvent getCurrentEvent();

    /* JADX INFO: renamed from: getExtendedTouchPadding-NH-jbRc, reason: not valid java name */
    default long mo2902getExtendedTouchPaddingNHjbRc() {
        return Size.INSTANCE.m1461getZeroNHjbRc();
    }

    /* JADX INFO: renamed from: getSize-YbymL2g, reason: not valid java name */
    long mo2903getSizeYbymL2g();

    @NotNull
    ViewConfiguration getViewConfiguration();

    @Nullable
    default <T> Object withTimeout(long j10, @NotNull sn.p<? super AwaitPointerEventScope, ? super c<? super T>, ? extends Object> pVar, @NotNull c<? super T> cVar) {
        return withTimeout$suspendImpl(this, j10, pVar, cVar);
    }

    @Nullable
    default <T> Object withTimeoutOrNull(long j10, @NotNull sn.p<? super AwaitPointerEventScope, ? super c<? super T>, ? extends Object> pVar, @NotNull c<? super T> cVar) {
        return withTimeoutOrNull$suspendImpl(this, j10, pVar, cVar);
    }
}
