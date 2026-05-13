package androidx.compose.foundation.text.selection;

import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: AndroidSelectionHandles.android.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001a\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J5\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0010\u001a\u00020\t8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/text/selection/HandlePositionProvider;", "Landroidx/compose/ui/window/PopupPositionProvider;", "Landroidx/compose/ui/unit/IntRect;", "anchorBounds", "Landroidx/compose/ui/unit/IntSize;", "windowSize", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "popupContentSize", "Landroidx/compose/ui/unit/IntOffset;", "calculatePosition-llwVHH4", "(Landroidx/compose/ui/unit/IntRect;JLandroidx/compose/ui/unit/LayoutDirection;J)J", "calculatePosition", "Landroidx/compose/foundation/text/selection/HandleReferencePoint;", "handleReferencePoint", "Landroidx/compose/foundation/text/selection/HandleReferencePoint;", TypedValues.CycleType.S_WAVE_OFFSET, "J", "<init>", "(Landroidx/compose/foundation/text/selection/HandleReferencePoint;JLtn/i;)V", "foundation_release"}, k = 1, mv = {1, 6, 0})
public final class HandlePositionProvider implements PopupPositionProvider {

    @NotNull
    private final HandleReferencePoint handleReferencePoint;
    private final long offset;

    /* JADX INFO: compiled from: AndroidSelectionHandles.android.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HandleReferencePoint.values().length];
            iArr[HandleReferencePoint.TopLeft.ordinal()] = 1;
            iArr[HandleReferencePoint.TopRight.ordinal()] = 2;
            iArr[HandleReferencePoint.TopMiddle.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private HandlePositionProvider(HandleReferencePoint handleReferencePoint, long j10) {
        this.handleReferencePoint = handleReferencePoint;
        this.offset = j10;
    }

    public /* synthetic */ HandlePositionProvider(HandleReferencePoint handleReferencePoint, long j10, i iVar) {
        this(handleReferencePoint, j10);
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* JADX INFO: renamed from: calculatePosition-llwVHH4, reason: not valid java name */
    public long mo773calculatePositionllwVHH4(@NotNull IntRect anchorBounds, long windowSize, @NotNull LayoutDirection layoutDirection, long popupContentSize) {
        p.k(anchorBounds, "anchorBounds");
        p.k(layoutDirection, "layoutDirection");
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.handleReferencePoint.ordinal()];
        if (i10 == 1) {
            return IntOffsetKt.IntOffset(anchorBounds.getLeft() + IntOffset.m3944getXimpl(this.offset), anchorBounds.getTop() + IntOffset.m3945getYimpl(this.offset));
        }
        if (i10 == 2) {
            return IntOffsetKt.IntOffset((anchorBounds.getLeft() + IntOffset.m3944getXimpl(this.offset)) - IntSize.m3986getWidthimpl(popupContentSize), anchorBounds.getTop() + IntOffset.m3945getYimpl(this.offset));
        }
        if (i10 == 3) {
            return IntOffsetKt.IntOffset((anchorBounds.getLeft() + IntOffset.m3944getXimpl(this.offset)) - (IntSize.m3986getWidthimpl(popupContentSize) / 2), anchorBounds.getTop() + IntOffset.m3945getYimpl(this.offset));
        }
        throw new NoWhenBranchMatchedException();
    }
}
