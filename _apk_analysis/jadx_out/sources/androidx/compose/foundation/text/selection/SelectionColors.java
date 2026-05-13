package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.TextSelectionColors, reason: from toString */
/* JADX INFO: compiled from: TextSelectionColors.kt */
/* JADX INFO: loaded from: classes8.dex */
@Immutable
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001a\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R \u0010\n\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u000e\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\r\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/text/selection/TextSelectionColors;", "", "other", "", "equals", "", "hashCode", "", "toString", "Landroidx/compose/ui/graphics/Color;", "handleColor", "J", "getHandleColor-0d7_KjU", "()J", "backgroundColor", "getBackgroundColor-0d7_KjU", "<init>", "(JJLtn/i;)V", "foundation_release"}, k = 1, mv = {1, 6, 0})
public final class SelectionColors {

    /* JADX INFO: renamed from: backgroundColor, reason: from kotlin metadata and from toString */
    private final long selectionBackgroundColor;

    /* JADX INFO: renamed from: handleColor, reason: from kotlin metadata and from toString */
    private final long selectionHandleColor;

    private SelectionColors(long j10, long j11) {
        this.selectionHandleColor = j10;
        this.selectionBackgroundColor = j11;
    }

    public /* synthetic */ SelectionColors(long j10, long j11, i iVar) {
        this(j10, j11);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectionColors)) {
            return false;
        }
        SelectionColors selectionColors = (SelectionColors) other;
        return Color.m1620equalsimpl0(this.selectionHandleColor, selectionColors.selectionHandleColor) && Color.m1620equalsimpl0(this.selectionBackgroundColor, selectionColors.selectionBackgroundColor);
    }

    /* JADX INFO: renamed from: getBackgroundColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getSelectionBackgroundColor() {
        return this.selectionBackgroundColor;
    }

    /* JADX INFO: renamed from: getHandleColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getSelectionHandleColor() {
        return this.selectionHandleColor;
    }

    public int hashCode() {
        return (Color.m1626hashCodeimpl(this.selectionHandleColor) * 31) + Color.m1626hashCodeimpl(this.selectionBackgroundColor);
    }

    @NotNull
    public String toString() {
        return "SelectionColors(selectionHandleColor=" + ((Object) Color.m1627toStringimpl(this.selectionHandleColor)) + ", selectionBackgroundColor=" + ((Object) Color.m1627toStringimpl(this.selectionBackgroundColor)) + ')';
    }
}
