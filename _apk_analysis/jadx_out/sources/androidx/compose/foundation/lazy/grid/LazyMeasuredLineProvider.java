package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import androidx.compose.ui.unit.Constraints;
import bn.r;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sn.p;

/* JADX INFO: compiled from: LazyMeasuredLineProvider.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000b0\"\u0012\u0006\u0010$\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b%\u0010&J\u001b\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R/\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00190\u00188\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000b0\u001e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006'"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyMeasuredLineProvider;", "", "Landroidx/compose/foundation/lazy/grid/LineIndex;", "lineIndex", "Landroidx/compose/foundation/lazy/grid/LazyMeasuredLine;", "getAndMeasure-bKFJvoY", "(I)Landroidx/compose/foundation/lazy/grid/LazyMeasuredLine;", "getAndMeasure", "", "isVertical", "Z", "", "gridItemsCount", "I", "spaceBetweenLines", "Landroidx/compose/foundation/lazy/grid/LazyMeasuredItemProvider;", "measuredItemProvider", "Landroidx/compose/foundation/lazy/grid/LazyMeasuredItemProvider;", "Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "spanLayoutProvider", "Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "Landroidx/compose/foundation/lazy/grid/MeasuredLineFactory;", "measuredLineFactory", "Landroidx/compose/foundation/lazy/grid/MeasuredLineFactory;", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Constraints;", "childConstraints", "Lsn/p;", "getChildConstraints$foundation_release", "()Lsn/p;", "", "getKeyToIndexMap", "()Ljava/util/Map;", "keyToIndexMap", "", "slotSizesSums", "crossAxisSpacing", "<init>", "(ZLjava/util/List;IIILandroidx/compose/foundation/lazy/grid/LazyMeasuredItemProvider;Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;Landroidx/compose/foundation/lazy/grid/MeasuredLineFactory;)V", "foundation_release"}, k = 1, mv = {1, 6, 0})
public final class LazyMeasuredLineProvider {

    @NotNull
    private final p<Integer, Integer, Constraints> childConstraints;
    private final int gridItemsCount;
    private final boolean isVertical;

    @NotNull
    private final LazyMeasuredItemProvider measuredItemProvider;

    @NotNull
    private final MeasuredLineFactory measuredLineFactory;
    private final int spaceBetweenLines;

    @NotNull
    private final LazyGridSpanLayoutProvider spanLayoutProvider;

    public LazyMeasuredLineProvider(boolean z10, @NotNull final List<Integer> list, final int i10, int i11, int i12, @NotNull LazyMeasuredItemProvider lazyMeasuredItemProvider, @NotNull LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider, @NotNull MeasuredLineFactory measuredLineFactory) {
        tn.p.k(list, "slotSizesSums");
        tn.p.k(lazyMeasuredItemProvider, "measuredItemProvider");
        tn.p.k(lazyGridSpanLayoutProvider, "spanLayoutProvider");
        tn.p.k(measuredLineFactory, "measuredLineFactory");
        this.isVertical = z10;
        this.gridItemsCount = i11;
        this.spaceBetweenLines = i12;
        this.measuredItemProvider = lazyMeasuredItemProvider;
        this.spanLayoutProvider = lazyGridSpanLayoutProvider;
        this.measuredLineFactory = measuredLineFactory;
        this.childConstraints = new p<Integer, Integer, Constraints>() { // from class: androidx.compose.foundation.lazy.grid.LazyMeasuredLineProvider$childConstraints$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Constraints mo2invoke(Integer num, Integer num2) {
                return Constraints.m3770boximpl(m605invokeJhjzzOo(num.intValue(), num2.intValue()));
            }

            /* JADX INFO: renamed from: invoke-JhjzzOo, reason: not valid java name */
            public final long m605invokeJhjzzOo(int i13, int i14) {
                int iIntValue = (list.get((i13 + i14) - 1).intValue() - (i13 == 0 ? 0 : list.get(i13 - 1).intValue())) + (i10 * (i14 - 1));
                return this.isVertical ? Constraints.INSTANCE.m3792fixedWidthOenEA2s(iIntValue) : Constraints.INSTANCE.m3791fixedHeightOenEA2s(iIntValue);
            }
        };
    }

    @NotNull
    /* JADX INFO: renamed from: getAndMeasure-bKFJvoY, reason: not valid java name */
    public final LazyMeasuredLine m604getAndMeasurebKFJvoY(int lineIndex) {
        LazyGridSpanLayoutProvider.LineConfiguration lineConfiguration = this.spanLayoutProvider.getLineConfiguration(lineIndex);
        int size = lineConfiguration.getSpans().size();
        int i10 = (size == 0 || lineConfiguration.getFirstItemIndex() + size == this.gridItemsCount) ? 0 : this.spaceBetweenLines;
        LazyMeasuredItem[] lazyMeasuredItemArr = new LazyMeasuredItem[size];
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            int iM550getCurrentLineSpanimpl = GridItemSpan.m550getCurrentLineSpanimpl(lineConfiguration.getSpans().get(i12).getPackedValue());
            LazyMeasuredItem lazyMeasuredItemM602getAndMeasureednRnyU = this.measuredItemProvider.m602getAndMeasureednRnyU(ItemIndex.m556constructorimpl(lineConfiguration.getFirstItemIndex() + i12), i10, this.childConstraints.mo2invoke(Integer.valueOf(i11), Integer.valueOf(iM550getCurrentLineSpanimpl)).getValue());
            i11 += iM550getCurrentLineSpanimpl;
            r rVar = r.f5635a;
            lazyMeasuredItemArr[i12] = lazyMeasuredItemM602getAndMeasureednRnyU;
        }
        return this.measuredLineFactory.mo585createLineH9FfpSk(lineIndex, lazyMeasuredItemArr, lineConfiguration.getSpans(), i10);
    }

    @NotNull
    public final p<Integer, Integer, Constraints> getChildConstraints$foundation_release() {
        return this.childConstraints;
    }

    @NotNull
    public final Map<Object, Integer> getKeyToIndexMap() {
        return this.measuredItemProvider.getKeyToIndexMap();
    }
}
