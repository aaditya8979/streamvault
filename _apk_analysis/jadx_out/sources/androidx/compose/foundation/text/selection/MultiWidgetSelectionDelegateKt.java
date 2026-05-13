package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.unit.IntSize;
import com.ironsource.C3978d4;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;
import zn.n;

/* JADX INFO: compiled from: MultiWidgetSelectionDelegate.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a5\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a-\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001ak\u0010\u0014\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00050\u00152\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u001c\u001a\u00020\u0005H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, d2 = {"getAssembledSelectionInfo", "Landroidx/compose/foundation/text/selection/Selection;", "newSelectionRange", "Landroidx/compose/ui/text/TextRange;", "handlesCrossed", "", "selectableId", "", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "getAssembledSelectionInfo-vJH6DeI", "(JZJLandroidx/compose/ui/text/TextLayoutResult;)Landroidx/compose/foundation/text/selection/Selection;", "getOffsetForPosition", "", "bounds", "Landroidx/compose/ui/geometry/Rect;", C3978d4.i.L, "Landroidx/compose/ui/geometry/Offset;", "getOffsetForPosition-0AR0LA0", "(Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/geometry/Rect;J)I", "getTextSelectionInfo", "Lkotlin/Pair;", "startHandlePosition", "endHandlePosition", "previousHandlePosition", "adjustment", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "previousSelection", "isStartHandle", "getTextSelectionInfo-yM0VcXU", "(Landroidx/compose/ui/text/TextLayoutResult;JJLandroidx/compose/ui/geometry/Offset;JLandroidx/compose/foundation/text/selection/SelectionAdjustment;Landroidx/compose/foundation/text/selection/Selection;Z)Lkotlin/Pair;", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class MultiWidgetSelectionDelegateKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getAssembledSelectionInfo-vJH6DeI, reason: not valid java name */
    public static final Selection m778getAssembledSelectionInfovJH6DeI(long j10, boolean z10, long j11, TextLayoutResult textLayoutResult) {
        return new Selection(new Selection.AnchorInfo(textLayoutResult.getBidiRunDirection(TextRange.m3474getStartimpl(j10)), TextRange.m3474getStartimpl(j10), j11), new Selection.AnchorInfo(textLayoutResult.getBidiRunDirection(Math.max(TextRange.m3469getEndimpl(j10) - 1, 0)), TextRange.m3469getEndimpl(j10), j11), z10);
    }

    /* JADX INFO: renamed from: getOffsetForPosition-0AR0LA0, reason: not valid java name */
    public static final int m779getOffsetForPosition0AR0LA0(@NotNull TextLayoutResult textLayoutResult, @NotNull Rect rect, long j10) {
        p.k(textLayoutResult, "textLayoutResult");
        p.k(rect, "bounds");
        int length = textLayoutResult.getLayoutInput().getText().length();
        if (rect.m1409containsk4lQ0M(j10)) {
            return n.n(textLayoutResult.m3459getOffsetForPositionk4lQ0M(j10), 0, length);
        }
        if (SelectionMode.Vertical.mo842compare3MmeM6k$foundation_release(j10, rect) < 0) {
            return 0;
        }
        return length;
    }

    @NotNull
    /* JADX INFO: renamed from: getTextSelectionInfo-yM0VcXU, reason: not valid java name */
    public static final Pair<Selection, Boolean> m780getTextSelectionInfoyM0VcXU(@NotNull TextLayoutResult textLayoutResult, long j10, long j11, @Nullable Offset offset, long j12, @NotNull SelectionAdjustment selectionAdjustment, @Nullable Selection selection, boolean z10) {
        p.k(textLayoutResult, "textLayoutResult");
        p.k(selectionAdjustment, "adjustment");
        Rect rect = new Rect(0.0f, 0.0f, IntSize.m3986getWidthimpl(textLayoutResult.getSize()), IntSize.m3985getHeightimpl(textLayoutResult.getSize()));
        if (!SelectionMode.Vertical.m843isSelected2x9bVx0$foundation_release(rect, j10, j11)) {
            return new Pair<>(null, Boolean.FALSE);
        }
        int iM779getOffsetForPosition0AR0LA0 = m779getOffsetForPosition0AR0LA0(textLayoutResult, rect, j10);
        int iM779getOffsetForPosition0AR0LA02 = m779getOffsetForPosition0AR0LA0(textLayoutResult, rect, j11);
        int iM779getOffsetForPosition0AR0LA03 = offset != null ? m779getOffsetForPosition0AR0LA0(textLayoutResult, rect, offset.getPackedValue()) : -1;
        long jMo784adjustZXO7KMw = selectionAdjustment.mo784adjustZXO7KMw(textLayoutResult, TextRangeKt.TextRange(iM779getOffsetForPosition0AR0LA0, iM779getOffsetForPosition0AR0LA02), iM779getOffsetForPosition0AR0LA03, z10, selection != null ? TextRange.m3462boximpl(selection.m783toTextRanged9O1mEE()) : null);
        Selection selectionM778getAssembledSelectionInfovJH6DeI = m778getAssembledSelectionInfovJH6DeI(jMo784adjustZXO7KMw, TextRange.m3473getReversedimpl(jMo784adjustZXO7KMw), j12, textLayoutResult);
        boolean z11 = true;
        boolean z12 = !p.f(selectionM778getAssembledSelectionInfovJH6DeI, selection);
        if (!(!z10 ? iM779getOffsetForPosition0AR0LA02 == iM779getOffsetForPosition0AR0LA03 : iM779getOffsetForPosition0AR0LA0 == iM779getOffsetForPosition0AR0LA03) && !z12) {
            z11 = false;
        }
        return new Pair<>(selectionM778getAssembledSelectionInfovJH6DeI, Boolean.valueOf(z11));
    }
}
