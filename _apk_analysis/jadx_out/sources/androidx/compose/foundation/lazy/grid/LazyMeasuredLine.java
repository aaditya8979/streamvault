package androidx.compose.foundation.lazy.grid;

import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.ironsource.C3978d4;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import tn.i;

/* JADX INFO: compiled from: LazyMeasuredLine.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001BV\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\b\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0004\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u0004\u0012\u0006\u0010 \u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b%\u0010&J\u0006\u0010\u0003\u001a\u00020\u0002J$\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004R \u0010\f\u001a\u00020\u000b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\b8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\rR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\rR\u0014\u0010 \u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\rR\u0017\u0010!\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\r\u001a\u0004\b\"\u0010\u000fR\u0017\u0010#\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\r\u001a\u0004\b$\u0010\u000f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006'"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyMeasuredLine;", "", "", "isEmpty", "", TypedValues.CycleType.S_WAVE_OFFSET, "layoutWidth", "layoutHeight", "", "Landroidx/compose/foundation/lazy/grid/LazyGridPositionedItem;", C3978d4.i.L, "Landroidx/compose/foundation/lazy/grid/LineIndex;", "index", "I", "getIndex-hA7yfN8", "()I", "", "Landroidx/compose/foundation/lazy/grid/LazyMeasuredItem;", "items", "[Landroidx/compose/foundation/lazy/grid/LazyMeasuredItem;", "getItems", "()[Landroidx/compose/foundation/lazy/grid/LazyMeasuredItem;", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "spans", "Ljava/util/List;", "isVertical", "Z", "slotsPerLine", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "mainAxisSpacing", "crossAxisSpacing", "mainAxisSize", "getMainAxisSize", "mainAxisSizeWithSpacings", "getMainAxisSizeWithSpacings", "<init>", "(I[Landroidx/compose/foundation/lazy/grid/LazyMeasuredItem;Ljava/util/List;ZILandroidx/compose/ui/unit/LayoutDirection;IILtn/i;)V", "foundation_release"}, k = 1, mv = {1, 6, 0})
public final class LazyMeasuredLine {
    private final int crossAxisSpacing;
    private final int index;
    private final boolean isVertical;

    @NotNull
    private final LazyMeasuredItem[] items;

    @NotNull
    private final LayoutDirection layoutDirection;
    private final int mainAxisSize;
    private final int mainAxisSizeWithSpacings;
    private final int mainAxisSpacing;
    private final int slotsPerLine;

    @NotNull
    private final List<GridItemSpan> spans;

    private LazyMeasuredLine(int i10, LazyMeasuredItem[] lazyMeasuredItemArr, List<GridItemSpan> list, boolean z10, int i11, LayoutDirection layoutDirection, int i12, int i13) {
        this.index = i10;
        this.items = lazyMeasuredItemArr;
        this.spans = list;
        this.isVertical = z10;
        this.slotsPerLine = i11;
        this.layoutDirection = layoutDirection;
        this.mainAxisSpacing = i12;
        this.crossAxisSpacing = i13;
        int iMax = 0;
        for (LazyMeasuredItem lazyMeasuredItem : lazyMeasuredItemArr) {
            iMax = Math.max(iMax, lazyMeasuredItem.getMainAxisSize());
        }
        this.mainAxisSize = iMax;
        this.mainAxisSizeWithSpacings = iMax + this.mainAxisSpacing;
    }

    public /* synthetic */ LazyMeasuredLine(int i10, LazyMeasuredItem[] lazyMeasuredItemArr, List list, boolean z10, int i11, LayoutDirection layoutDirection, int i12, int i13, i iVar) {
        this(i10, lazyMeasuredItemArr, list, z10, i11, layoutDirection, i12, i13);
    }

    /* JADX INFO: renamed from: getIndex-hA7yfN8, reason: not valid java name and from getter */
    public final int getIndex() {
        return this.index;
    }

    @NotNull
    public final LazyMeasuredItem[] getItems() {
        return this.items;
    }

    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    public final int getMainAxisSizeWithSpacings() {
        return this.mainAxisSizeWithSpacings;
    }

    public final boolean isEmpty() {
        return this.items.length == 0;
    }

    @NotNull
    public final List<LazyGridPositionedItem> position(int offset, int layoutWidth, int layoutHeight) {
        LazyMeasuredItem[] lazyMeasuredItemArr = this.items;
        ArrayList arrayList = new ArrayList(lazyMeasuredItemArr.length);
        int length = lazyMeasuredItemArr.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int crossAxisSize = 0;
        while (i10 < length) {
            LazyMeasuredItem lazyMeasuredItem = lazyMeasuredItemArr[i10];
            int i13 = i11 + 1;
            int iM550getCurrentLineSpanimpl = GridItemSpan.m550getCurrentLineSpanimpl(this.spans.get(i11).getPackedValue());
            int i14 = this.layoutDirection == LayoutDirection.Rtl ? (this.slotsPerLine - i12) - iM550getCurrentLineSpanimpl : i12;
            boolean z10 = this.isVertical;
            int i15 = z10 ? this.index : i14;
            if (!z10) {
                i14 = this.index;
            }
            LazyGridPositionedItem lazyGridPositionedItemPosition = lazyMeasuredItem.position(offset, crossAxisSize, layoutWidth, layoutHeight, i15, i14, this.mainAxisSize);
            crossAxisSize += lazyMeasuredItem.getCrossAxisSize() + this.crossAxisSpacing;
            i12 += iM550getCurrentLineSpanimpl;
            arrayList.add(lazyGridPositionedItemPosition);
            i10++;
            i11 = i13;
        }
        return arrayList;
    }
}
