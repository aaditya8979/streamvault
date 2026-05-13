package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;
import zn.n;

/* JADX INFO: compiled from: MultiWidgetSelectionDelegate.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010#\u001a\u00020\"\u0012\u000e\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0'\u0012\u000e\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0'¢\u0006\u0004\b,\u0010-J_\u0010\u0011\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00060\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\n\u0010\u0012\u001a\u0004\u0018\u00010\fH\u0016J(\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\n\u0010\u0017\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\u0010\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J \u0010!\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010#\u001a\u00020\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001c\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010)\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006."}, d2 = {"Landroidx/compose/foundation/text/selection/MultiWidgetSelectionDelegate;", "Landroidx/compose/foundation/text/selection/Selectable;", "Landroidx/compose/ui/geometry/Offset;", "startHandlePosition", "endHandlePosition", "previousHandlePosition", "", "isStartHandle", "Landroidx/compose/ui/layout/LayoutCoordinates;", "containerLayoutCoordinates", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "adjustment", "Landroidx/compose/foundation/text/selection/Selection;", "previousSelection", "Lkotlin/Pair;", "updateSelection-qCDeeow", "(JJLandroidx/compose/ui/geometry/Offset;ZLandroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/foundation/text/selection/SelectionAdjustment;Landroidx/compose/foundation/text/selection/Selection;)Lkotlin/Pair;", "updateSelection", "getSelectAllSelection", "selection", "getHandlePosition-dBAh8RU", "(Landroidx/compose/foundation/text/selection/Selection;Z)J", "getHandlePosition", "getLayoutCoordinates", "Landroidx/compose/ui/text/AnnotatedString;", "getText", "", TypedValues.CycleType.S_WAVE_OFFSET, "Landroidx/compose/ui/geometry/Rect;", "getBoundingBox", "Landroidx/compose/ui/text/TextRange;", "getRangeOfLineContaining--jx7JFs", "(I)J", "getRangeOfLineContaining", "", "selectableId", "J", "getSelectableId", "()J", "Lkotlin/Function0;", "coordinatesCallback", "Lsn/a;", "Landroidx/compose/ui/text/TextLayoutResult;", "layoutResultCallback", "<init>", "(JLsn/a;Lsn/a;)V", "foundation_release"}, k = 1, mv = {1, 6, 0})
public final class MultiWidgetSelectionDelegate implements Selectable {

    @NotNull
    private final sn.a<LayoutCoordinates> coordinatesCallback;

    @NotNull
    private final sn.a<TextLayoutResult> layoutResultCallback;
    private final long selectableId;

    /* JADX WARN: Multi-variable type inference failed */
    public MultiWidgetSelectionDelegate(long j10, @NotNull sn.a<? extends LayoutCoordinates> aVar, @NotNull sn.a<TextLayoutResult> aVar2) {
        p.k(aVar, "coordinatesCallback");
        p.k(aVar2, "layoutResultCallback");
        this.selectableId = j10;
        this.coordinatesCallback = aVar;
        this.layoutResultCallback = aVar2;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    @NotNull
    public Rect getBoundingBox(int offset) {
        int length;
        TextLayoutResult textLayoutResultInvoke = this.layoutResultCallback.invoke();
        if (textLayoutResultInvoke != null && (length = textLayoutResultInvoke.getLayoutInput().getText().length()) >= 1) {
            return textLayoutResultInvoke.getBoundingBox(n.n(offset, 0, length - 1));
        }
        return Rect.INSTANCE.getZero();
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    /* JADX INFO: renamed from: getHandlePosition-dBAh8RU, reason: not valid java name */
    public long mo774getHandlePositiondBAh8RU(@NotNull Selection selection, boolean isStartHandle) {
        TextLayoutResult textLayoutResultInvoke;
        p.k(selection, "selection");
        if ((isStartHandle && selection.getStart().getSelectableId() != getSelectableId()) || (!isStartHandle && selection.getEnd().getSelectableId() != getSelectableId())) {
            return Offset.INSTANCE.m1399getZeroF1C5BW0();
        }
        if (getLayoutCoordinates() != null && (textLayoutResultInvoke = this.layoutResultCallback.invoke()) != null) {
            return TextSelectionDelegateKt.getSelectionHandleCoordinates(textLayoutResultInvoke, (isStartHandle ? selection.getStart() : selection.getEnd()).getOffset(), isStartHandle, selection.getHandlesCrossed());
        }
        return Offset.INSTANCE.m1399getZeroF1C5BW0();
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    @Nullable
    public LayoutCoordinates getLayoutCoordinates() {
        LayoutCoordinates layoutCoordinatesInvoke = this.coordinatesCallback.invoke();
        if (layoutCoordinatesInvoke == null || !layoutCoordinatesInvoke.isAttached()) {
            return null;
        }
        return layoutCoordinatesInvoke;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    /* JADX INFO: renamed from: getRangeOfLineContaining--jx7JFs, reason: not valid java name */
    public long mo775getRangeOfLineContainingjx7JFs(int offset) {
        int length;
        TextLayoutResult textLayoutResultInvoke = this.layoutResultCallback.invoke();
        if (textLayoutResultInvoke != null && (length = textLayoutResultInvoke.getLayoutInput().getText().length()) >= 1) {
            int lineForOffset = textLayoutResultInvoke.getLineForOffset(n.n(offset, 0, length - 1));
            return TextRangeKt.TextRange(textLayoutResultInvoke.getLineStart(lineForOffset), textLayoutResultInvoke.getLineEnd(lineForOffset, true));
        }
        return TextRange.INSTANCE.m3479getZerod9O1mEE();
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    @Nullable
    public Selection getSelectAllSelection() {
        TextLayoutResult textLayoutResultInvoke = this.layoutResultCallback.invoke();
        if (textLayoutResultInvoke == null) {
            return null;
        }
        return MultiWidgetSelectionDelegateKt.m778getAssembledSelectionInfovJH6DeI(TextRangeKt.TextRange(0, textLayoutResultInvoke.getLayoutInput().getText().length()), false, getSelectableId(), textLayoutResultInvoke);
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public long getSelectableId() {
        return this.selectableId;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    @NotNull
    public AnnotatedString getText() {
        TextLayoutResult textLayoutResultInvoke = this.layoutResultCallback.invoke();
        return textLayoutResultInvoke == null ? new AnnotatedString("", null, null, 6, null) : textLayoutResultInvoke.getLayoutInput().getText();
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    @NotNull
    /* JADX INFO: renamed from: updateSelection-qCDeeow, reason: not valid java name */
    public Pair<Selection, Boolean> mo776updateSelectionqCDeeow(long startHandlePosition, long endHandlePosition, @Nullable Offset previousHandlePosition, boolean isStartHandle, @NotNull LayoutCoordinates containerLayoutCoordinates, @NotNull SelectionAdjustment adjustment, @Nullable Selection previousSelection) {
        TextLayoutResult textLayoutResultInvoke;
        p.k(containerLayoutCoordinates, "containerLayoutCoordinates");
        p.k(adjustment, "adjustment");
        if (!(previousSelection == null || (getSelectableId() == previousSelection.getStart().getSelectableId() && getSelectableId() == previousSelection.getEnd().getSelectableId()))) {
            throw new IllegalArgumentException("The given previousSelection doesn't belong to this selectable.".toString());
        }
        LayoutCoordinates layoutCoordinates = getLayoutCoordinates();
        if (layoutCoordinates != null && (textLayoutResultInvoke = this.layoutResultCallback.invoke()) != null) {
            long jMo3115localPositionOfR5De75A = containerLayoutCoordinates.mo3115localPositionOfR5De75A(layoutCoordinates, Offset.INSTANCE.m1399getZeroF1C5BW0());
            return MultiWidgetSelectionDelegateKt.m780getTextSelectionInfoyM0VcXU(textLayoutResultInvoke, Offset.m1387minusMKHz9U(startHandlePosition, jMo3115localPositionOfR5De75A), Offset.m1387minusMKHz9U(endHandlePosition, jMo3115localPositionOfR5De75A), previousHandlePosition != null ? Offset.m1372boximpl(Offset.m1387minusMKHz9U(previousHandlePosition.getPackedValue(), jMo3115localPositionOfR5De75A)) : null, getSelectableId(), adjustment, previousSelection, isStartHandle);
        }
        return new Pair<>(null, Boolean.FALSE);
    }
}
