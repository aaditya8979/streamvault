package androidx.compose.ui.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.LayoutDirection;
import bn.r;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.a;
import org.jetbrains.annotations.NotNull;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: MeasureScope.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001JB\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u00052\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "", "width", "height", "", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLines", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lbn/r;", "placementBlock", "Landroidx/compose/ui/layout/MeasureResult;", "layout", "ui_release"}, k = 1, mv = {1, 6, 0})
public interface MeasureScope extends IntrinsicMeasureScope {

    /* JADX INFO: compiled from: MeasureScope.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        @NotNull
        public static MeasureResult layout(@NotNull MeasureScope measureScope, int i10, int i11, @NotNull Map<AlignmentLine, Integer> map, @NotNull l<? super Placeable.PlacementScope, r> lVar) {
            p.k(map, "alignmentLines");
            p.k(lVar, "placementBlock");
            return MeasureScope.super.layout(i10, i11, map, lVar);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m3134roundToPxR2X_6o(@NotNull MeasureScope measureScope, long j10) {
            return MeasureScope.super.mo299roundToPxR2X_6o(j10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m3135roundToPx0680j_4(@NotNull MeasureScope measureScope, float f10) {
            return MeasureScope.super.mo300roundToPx0680j_4(f10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m3136toDpGaN1DYA(@NotNull MeasureScope measureScope, long j10) {
            return MeasureScope.super.mo301toDpGaN1DYA(j10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m3137toDpu2uoSUM(@NotNull MeasureScope measureScope, float f10) {
            return MeasureScope.super.mo302toDpu2uoSUM(f10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m3138toDpu2uoSUM(@NotNull MeasureScope measureScope, int i10) {
            return MeasureScope.super.mo303toDpu2uoSUM(i10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m3139toDpSizekrfVVM(@NotNull MeasureScope measureScope, long j10) {
            return MeasureScope.super.mo304toDpSizekrfVVM(j10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m3140toPxR2X_6o(@NotNull MeasureScope measureScope, long j10) {
            return MeasureScope.super.mo305toPxR2X_6o(j10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m3141toPx0680j_4(@NotNull MeasureScope measureScope, float f10) {
            return MeasureScope.super.mo306toPx0680j_4(f10);
        }

        @Stable
        @Deprecated
        @NotNull
        public static Rect toRect(@NotNull MeasureScope measureScope, @NotNull DpRect dpRect) {
            p.k(dpRect, "receiver");
            return MeasureScope.super.toRect(dpRect);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m3142toSizeXkaWNTQ(@NotNull MeasureScope measureScope, long j10) {
            return MeasureScope.super.mo307toSizeXkaWNTQ(j10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m3143toSp0xMU5do(@NotNull MeasureScope measureScope, float f10) {
            return MeasureScope.super.mo308toSp0xMU5do(f10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m3144toSpkPz2Gy4(@NotNull MeasureScope measureScope, float f10) {
            return MeasureScope.super.mo309toSpkPz2Gy4(f10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m3145toSpkPz2Gy4(@NotNull MeasureScope measureScope, int i10) {
            return MeasureScope.super.mo310toSpkPz2Gy4(i10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ MeasureResult layout$default(MeasureScope measureScope, int i10, int i11, Map map, l lVar, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
        }
        if ((i12 & 4) != 0) {
            map = a.j();
        }
        return measureScope.layout(i10, i11, map, lVar);
    }

    @NotNull
    default MeasureResult layout(int i10, int i11, @NotNull Map<AlignmentLine, Integer> map, @NotNull l<? super Placeable.PlacementScope, r> lVar) {
        p.k(map, "alignmentLines");
        p.k(lVar, "placementBlock");
        return new MeasureResult(i10, i11, map, this, lVar) { // from class: androidx.compose.ui.layout.MeasureScope.layout.1
            public final /* synthetic */ l<Placeable.PlacementScope, r> $placementBlock;
            public final /* synthetic */ int $width;

            @NotNull
            private final Map<AlignmentLine, Integer> alignmentLines;
            private final int height;
            public final /* synthetic */ MeasureScope this$0;
            private final int width;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.$width = i10;
                this.this$0 = this;
                this.$placementBlock = lVar;
                this.width = i10;
                this.height = i11;
                this.alignmentLines = map;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            @NotNull
            public Map<AlignmentLine, Integer> getAlignmentLines() {
                return this.alignmentLines;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getHeight() {
                return this.height;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getWidth() {
                return this.width;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public void placeChildren() {
                Placeable.PlacementScope.Companion companion = Placeable.PlacementScope.INSTANCE;
                int i12 = this.$width;
                LayoutDirection layoutDirection = this.this$0.getLayoutDirection();
                l<Placeable.PlacementScope, r> lVar2 = this.$placementBlock;
                int parentWidth = companion.getParentWidth();
                LayoutDirection parentLayoutDirection = companion.getParentLayoutDirection();
                Placeable.PlacementScope.parentWidth = i12;
                Placeable.PlacementScope.parentLayoutDirection = layoutDirection;
                lVar2.invoke(companion);
                Placeable.PlacementScope.parentWidth = parentWidth;
                Placeable.PlacementScope.parentLayoutDirection = parentLayoutDirection;
            }
        };
    }
}
