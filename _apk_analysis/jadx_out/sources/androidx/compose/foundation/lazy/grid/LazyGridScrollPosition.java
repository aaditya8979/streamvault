package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.snapshots.Snapshot;
import cn.r;
import io.bidmachine.iab.vast.tags.VastTagName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: LazyGridScrollPosition.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u0000 $2\u00020\u0001:\u0001$B\u001b\u0012\b\b\u0002\u0010!\u001a\u00020\u0004\u0012\b\b\u0002\u0010\"\u001a\u00020\u0004¢\u0006\u0004\b#\u0010\bJ%\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nJ#\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\bJ\u000e\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fR4\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00028F@BX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00048F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 \u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006%"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridScrollPosition;", "", "Landroidx/compose/foundation/lazy/grid/ItemIndex;", "index", "", "scrollOffset", "Lbn/r;", "update-yO3Fmg4", "(II)V", "update", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "measureResult", "updateFromMeasureResult", "requestPosition-yO3Fmg4", "requestPosition", "Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;", "itemProvider", "updateScrollPositionIfTheFirstItemWasMoved", "<set-?>", "index$delegate", "Landroidx/compose/runtime/MutableState;", "getIndex-VZbfaAc", "()I", "setIndex-YGsSkvE", "(I)V", "scrollOffset$delegate", "getScrollOffset", "setScrollOffset", "", "hadFirstNotEmptyLayout", "Z", "lastKnownFirstItemKey", "Ljava/lang/Object;", "initialIndex", "initialScrollOffset", "<init>", VastTagName.COMPANION, "foundation_release"}, k = 1, mv = {1, 6, 0})
public final class LazyGridScrollPosition {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private boolean hadFirstNotEmptyLayout;

    /* JADX INFO: renamed from: index$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState index;

    @Nullable
    private Object lastKnownFirstItemKey;

    /* JADX INFO: renamed from: scrollOffset$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState scrollOffset;

    /* JADX INFO: compiled from: LazyGridScrollPosition.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J/\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridScrollPosition$Companion;", "", "()V", "findLazyGridIndexByKey", "Landroidx/compose/foundation/lazy/grid/ItemIndex;", "key", "lastKnownIndex", "itemProvider", "Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;", "findLazyGridIndexByKey-Cw5TLFk", "(Ljava/lang/Object;ILandroidx/compose/foundation/lazy/grid/LazyGridItemProvider;)I", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: findLazyGridIndexByKey-Cw5TLFk, reason: not valid java name */
        public final int m597findLazyGridIndexByKeyCw5TLFk(Object key, int lastKnownIndex, LazyGridItemProvider itemProvider) {
            Integer num;
            return key == null ? lastKnownIndex : ((lastKnownIndex >= itemProvider.getItemCount() || !p.f(key, itemProvider.getKey(lastKnownIndex))) && (num = itemProvider.getKeyToIndexMap().get(key)) != null) ? ItemIndex.m556constructorimpl(num.intValue()) : lastKnownIndex;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LazyGridScrollPosition() {
        int i10 = 0;
        this(i10, i10, 3, null);
    }

    public LazyGridScrollPosition(int i10, int i11) {
        this.index = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ItemIndex.m554boximpl(ItemIndex.m556constructorimpl(i10)), null, 2, null);
        this.scrollOffset = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(i11), null, 2, null);
    }

    public /* synthetic */ LazyGridScrollPosition(int i10, int i11, int i12, i iVar) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: setIndex-YGsSkvE, reason: not valid java name */
    private final void m592setIndexYGsSkvE(int i10) {
        this.index.setValue(ItemIndex.m554boximpl(i10));
    }

    private final void setScrollOffset(int i10) {
        this.scrollOffset.setValue(Integer.valueOf(i10));
    }

    /* JADX INFO: renamed from: update-yO3Fmg4, reason: not valid java name */
    private final void m593updateyO3Fmg4(int index, int scrollOffset) {
        if (!(((float) index) >= 0.0f)) {
            throw new IllegalArgumentException(("Index should be non-negative (" + index + ')').toString());
        }
        if (!ItemIndex.m559equalsimpl0(index, m594getIndexVZbfaAc())) {
            m592setIndexYGsSkvE(index);
        }
        if (scrollOffset != getScrollOffset()) {
            setScrollOffset(scrollOffset);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getIndex-VZbfaAc, reason: not valid java name */
    public final int m594getIndexVZbfaAc() {
        return ((ItemIndex) this.index.getValue()).m566unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getScrollOffset() {
        return ((Number) this.scrollOffset.getValue()).intValue();
    }

    /* JADX INFO: renamed from: requestPosition-yO3Fmg4, reason: not valid java name */
    public final void m595requestPositionyO3Fmg4(int index, int scrollOffset) {
        m593updateyO3Fmg4(index, scrollOffset);
        this.lastKnownFirstItemKey = null;
    }

    public final void updateFromMeasureResult(@NotNull LazyGridMeasureResult lazyGridMeasureResult) {
        LazyMeasuredItem[] items;
        LazyMeasuredItem lazyMeasuredItem;
        LazyMeasuredItem[] items2;
        LazyMeasuredItem lazyMeasuredItem2;
        p.k(lazyGridMeasureResult, "measureResult");
        LazyMeasuredLine firstVisibleLine = lazyGridMeasureResult.getFirstVisibleLine();
        this.lastKnownFirstItemKey = (firstVisibleLine == null || (items2 = firstVisibleLine.getItems()) == null || (lazyMeasuredItem2 = (LazyMeasuredItem) r.X(items2)) == null) ? null : lazyMeasuredItem2.getKey();
        if (this.hadFirstNotEmptyLayout || lazyGridMeasureResult.getTotalItemsCount() > 0) {
            this.hadFirstNotEmptyLayout = true;
            int firstVisibleLineScrollOffset = lazyGridMeasureResult.getFirstVisibleLineScrollOffset();
            int index = 0;
            if (!(((float) firstVisibleLineScrollOffset) >= 0.0f)) {
                throw new IllegalStateException(("scrollOffset should be non-negative (" + firstVisibleLineScrollOffset + ')').toString());
            }
            Snapshot snapshotCreateNonObservableSnapshot = Snapshot.INSTANCE.createNonObservableSnapshot();
            try {
                Snapshot snapshotMakeCurrent = snapshotCreateNonObservableSnapshot.makeCurrent();
                try {
                    LazyMeasuredLine firstVisibleLine2 = lazyGridMeasureResult.getFirstVisibleLine();
                    if (firstVisibleLine2 != null && (items = firstVisibleLine2.getItems()) != null && (lazyMeasuredItem = (LazyMeasuredItem) r.X(items)) != null) {
                        index = lazyMeasuredItem.getIndex();
                    }
                    m593updateyO3Fmg4(ItemIndex.m556constructorimpl(index), firstVisibleLineScrollOffset);
                    bn.r rVar = bn.r.f5635a;
                } finally {
                    snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
                }
            } finally {
                snapshotCreateNonObservableSnapshot.dispose();
            }
        }
    }

    public final void updateScrollPositionIfTheFirstItemWasMoved(@NotNull LazyGridItemProvider lazyGridItemProvider) {
        p.k(lazyGridItemProvider, "itemProvider");
        Snapshot snapshotCreateNonObservableSnapshot = Snapshot.INSTANCE.createNonObservableSnapshot();
        try {
            Snapshot snapshotMakeCurrent = snapshotCreateNonObservableSnapshot.makeCurrent();
            try {
                m593updateyO3Fmg4(Companion.m597findLazyGridIndexByKeyCw5TLFk(this.lastKnownFirstItemKey, m594getIndexVZbfaAc(), lazyGridItemProvider), getScrollOffset());
                bn.r rVar = bn.r.f5635a;
            } finally {
                snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
            }
        } finally {
            snapshotCreateNonObservableSnapshot.dispose();
        }
    }
}
