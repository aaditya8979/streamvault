package androidx.compose.ui.input.pointer;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: PointerEvent.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0007\u001a\u00020\u0001*\u00020\u0000\u001a\u0014\u0010\t\u001a\u00020\b*\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0014\u0010\u000b\u001a\u00020\b*\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\n\u001a \u0010\r\u001a\u00020\b*\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\f\u0010\u000f\u001a\u00020\u0001*\u00020\u0000H\u0007\u001a\f\u0010\u0010\u001a\u00020\u0001*\u00020\u0000H\u0007\u001a\f\u0010\u0012\u001a\u00020\u0011*\u00020\u0000H\u0007\u001a\f\u0010\u0013\u001a\u00020\u0011*\u00020\u0000H\u0007\u001a\f\u0010\u0014\u001a\u00020\u0011*\u00020\u0000H\u0007\u001a!\u0010\u0019\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a'\u0010\u0019\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001aø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputChange;", "", "changedToDown", "changedToDownIgnoreConsumed", "changedToUp", "changedToUpIgnoreConsumed", "positionChanged", "positionChangedIgnoreConsumed", "Landroidx/compose/ui/geometry/Offset;", "positionChange", "(Landroidx/compose/ui/input/pointer/PointerInputChange;)J", "positionChangeIgnoreConsumed", "ignoreConsumed", "positionChangeInternal", "(Landroidx/compose/ui/input/pointer/PointerInputChange;Z)J", "positionChangeConsumed", "anyChangeConsumed", "Lbn/r;", "consumeDownChange", "consumePositionChange", "consumeAllChanges", "Landroidx/compose/ui/unit/IntSize;", "size", "isOutOfBounds-O0kMr_c", "(Landroidx/compose/ui/input/pointer/PointerInputChange;J)Z", "isOutOfBounds", "Landroidx/compose/ui/geometry/Size;", "extendedTouchPadding", "isOutOfBounds-jwHxaWs", "(Landroidx/compose/ui/input/pointer/PointerInputChange;JJ)Z", "ui_release"}, k = 2, mv = {1, 6, 0})
public final class PointerEventKt {
    public static final boolean anyChangeConsumed(@NotNull PointerInputChange pointerInputChange) {
        p.k(pointerInputChange, "<this>");
        return pointerInputChange.isConsumed();
    }

    public static final boolean changedToDown(@NotNull PointerInputChange pointerInputChange) {
        p.k(pointerInputChange, "<this>");
        return (pointerInputChange.isConsumed() || pointerInputChange.getPreviousPressed() || !pointerInputChange.getPressed()) ? false : true;
    }

    public static final boolean changedToDownIgnoreConsumed(@NotNull PointerInputChange pointerInputChange) {
        p.k(pointerInputChange, "<this>");
        return !pointerInputChange.getPreviousPressed() && pointerInputChange.getPressed();
    }

    public static final boolean changedToUp(@NotNull PointerInputChange pointerInputChange) {
        p.k(pointerInputChange, "<this>");
        return (pointerInputChange.isConsumed() || !pointerInputChange.getPreviousPressed() || pointerInputChange.getPressed()) ? false : true;
    }

    public static final boolean changedToUpIgnoreConsumed(@NotNull PointerInputChange pointerInputChange) {
        p.k(pointerInputChange, "<this>");
        return pointerInputChange.getPreviousPressed() && !pointerInputChange.getPressed();
    }

    public static final void consumeAllChanges(@NotNull PointerInputChange pointerInputChange) {
        p.k(pointerInputChange, "<this>");
        pointerInputChange.consume();
    }

    public static final void consumeDownChange(@NotNull PointerInputChange pointerInputChange) {
        p.k(pointerInputChange, "<this>");
        if (pointerInputChange.getPressed() != pointerInputChange.getPreviousPressed()) {
            pointerInputChange.consume();
        }
    }

    public static final void consumePositionChange(@NotNull PointerInputChange pointerInputChange) {
        p.k(pointerInputChange, "<this>");
        if (Offset.m1380equalsimpl0(positionChange(pointerInputChange), Offset.INSTANCE.m1399getZeroF1C5BW0())) {
            return;
        }
        pointerInputChange.consume();
    }

    /* JADX INFO: renamed from: isOutOfBounds-O0kMr_c, reason: not valid java name */
    public static final boolean m2934isOutOfBoundsO0kMr_c(@NotNull PointerInputChange pointerInputChange, long j10) {
        p.k(pointerInputChange, "$this$isOutOfBounds");
        long position = pointerInputChange.getPosition();
        float fM1383getXimpl = Offset.m1383getXimpl(position);
        float fM1384getYimpl = Offset.m1384getYimpl(position);
        return fM1383getXimpl < 0.0f || fM1383getXimpl > ((float) IntSize.m3986getWidthimpl(j10)) || fM1384getYimpl < 0.0f || fM1384getYimpl > ((float) IntSize.m3985getHeightimpl(j10));
    }

    /* JADX INFO: renamed from: isOutOfBounds-jwHxaWs, reason: not valid java name */
    public static final boolean m2935isOutOfBoundsjwHxaWs(@NotNull PointerInputChange pointerInputChange, long j10, long j11) {
        p.k(pointerInputChange, "$this$isOutOfBounds");
        if (!PointerType.m3056equalsimpl0(pointerInputChange.getType(), PointerType.INSTANCE.m3063getTouchT8wyACA())) {
            return m2934isOutOfBoundsO0kMr_c(pointerInputChange, j10);
        }
        long position = pointerInputChange.getPosition();
        float fM1383getXimpl = Offset.m1383getXimpl(position);
        float fM1384getYimpl = Offset.m1384getYimpl(position);
        return fM1383getXimpl < (-Size.m1452getWidthimpl(j11)) || fM1383getXimpl > ((float) IntSize.m3986getWidthimpl(j10)) + Size.m1452getWidthimpl(j11) || fM1384getYimpl < (-Size.m1449getHeightimpl(j11)) || fM1384getYimpl > ((float) IntSize.m3985getHeightimpl(j10)) + Size.m1449getHeightimpl(j11);
    }

    public static final long positionChange(@NotNull PointerInputChange pointerInputChange) {
        p.k(pointerInputChange, "<this>");
        return positionChangeInternal(pointerInputChange, false);
    }

    public static final boolean positionChangeConsumed(@NotNull PointerInputChange pointerInputChange) {
        p.k(pointerInputChange, "<this>");
        return pointerInputChange.isConsumed();
    }

    public static final long positionChangeIgnoreConsumed(@NotNull PointerInputChange pointerInputChange) {
        p.k(pointerInputChange, "<this>");
        return positionChangeInternal(pointerInputChange, true);
    }

    private static final long positionChangeInternal(PointerInputChange pointerInputChange, boolean z10) {
        long jM1387minusMKHz9U = Offset.m1387minusMKHz9U(pointerInputChange.getPosition(), pointerInputChange.getPreviousPosition());
        return (z10 || !pointerInputChange.isConsumed()) ? jM1387minusMKHz9U : Offset.INSTANCE.m1399getZeroF1C5BW0();
    }

    public static /* synthetic */ long positionChangeInternal$default(PointerInputChange pointerInputChange, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return positionChangeInternal(pointerInputChange, z10);
    }

    public static final boolean positionChanged(@NotNull PointerInputChange pointerInputChange) {
        p.k(pointerInputChange, "<this>");
        return !Offset.m1380equalsimpl0(positionChangeInternal(pointerInputChange, false), Offset.INSTANCE.m1399getZeroF1C5BW0());
    }

    public static final boolean positionChangedIgnoreConsumed(@NotNull PointerInputChange pointerInputChange) {
        p.k(pointerInputChange, "<this>");
        return !Offset.m1380equalsimpl0(positionChangeInternal(pointerInputChange, true), Offset.INSTANCE.m1399getZeroF1C5BW0());
    }
}
