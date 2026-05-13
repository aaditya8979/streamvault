package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.Lazy_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import bn.r;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.p;
import zn.i;

/* JADX INFO: compiled from: LazyGridItemProviderImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@ExperimentalFoundationApi
@Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u000e\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002J\"\u0010\t\u001a\u00020\u0006*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR#\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0011\u0010#\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b!\u0010\"\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006("}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridItemsSnapshot;", "", "", "index", "getKey", "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "getSpan-_-orMbw", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;I)J", "getSpan", "Lbn/r;", "Item", "(ILandroidx/compose/runtime/Composer;I)V", "getContentType", "Landroidx/compose/foundation/lazy/layout/IntervalList;", "Landroidx/compose/foundation/lazy/grid/LazyGridIntervalContent;", "intervals", "Landroidx/compose/foundation/lazy/layout/IntervalList;", "", "hasCustomSpans", "Z", "getHasCustomSpans", "()Z", "Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "spanLayoutProvider", "Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "getSpanLayoutProvider", "()Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "", "keyToIndexMap", "Ljava/util/Map;", "getKeyToIndexMap", "()Ljava/util/Map;", "getItemsCount", "()I", "itemsCount", "Lzn/i;", "nearestItemsRange", "<init>", "(Landroidx/compose/foundation/lazy/layout/IntervalList;ZLzn/i;)V", "foundation_release"}, k = 1, mv = {1, 6, 0})
public final class LazyGridItemsSnapshot {
    private final boolean hasCustomSpans;

    @NotNull
    private final IntervalList<LazyGridIntervalContent> intervals;

    @NotNull
    private final Map<Object, Integer> keyToIndexMap;

    @NotNull
    private final LazyGridSpanLayoutProvider spanLayoutProvider;

    public LazyGridItemsSnapshot(@NotNull IntervalList<LazyGridIntervalContent> intervalList, boolean z10, @NotNull i iVar) {
        p.k(intervalList, "intervals");
        p.k(iVar, "nearestItemsRange");
        this.intervals = intervalList;
        this.hasCustomSpans = z10;
        this.spanLayoutProvider = new LazyGridSpanLayoutProvider(this);
        this.keyToIndexMap = LazyGridItemProviderImplKt.generateKeyToIndexMap(iVar, intervalList);
    }

    @Composable
    public final void Item(final int i10, @Nullable Composer composer, final int i11) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-405085610);
        IntervalList.Interval<LazyGridIntervalContent> interval = this.intervals.get(i10);
        interval.getValue().getItem().invoke(LazyGridItemScopeImpl.INSTANCE, Integer.valueOf(i10 - interval.getStartIndex()), composerStartRestartGroup, 6);
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new sn.p<Composer, Integer, r>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridItemsSnapshot.Item.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ r mo2invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return r.f5635a;
            }

            public final void invoke(@Nullable Composer composer2, int i12) {
                LazyGridItemsSnapshot.this.Item(i10, composer2, i11 | 1);
            }
        });
    }

    @Nullable
    public final Object getContentType(int index) {
        IntervalList.Interval<LazyGridIntervalContent> interval = this.intervals.get(index);
        return interval.getValue().getType().invoke(Integer.valueOf(index - interval.getStartIndex()));
    }

    public final boolean getHasCustomSpans() {
        return this.hasCustomSpans;
    }

    public final int getItemsCount() {
        return this.intervals.getSize();
    }

    @NotNull
    public final Object getKey(int index) {
        IntervalList.Interval<LazyGridIntervalContent> interval = this.intervals.get(index);
        int startIndex = index - interval.getStartIndex();
        l<Integer, Object> key = interval.getValue().getKey();
        Object objInvoke = key != null ? key.invoke(Integer.valueOf(startIndex)) : null;
        return objInvoke == null ? Lazy_androidKt.getDefaultLazyLayoutKey(index) : objInvoke;
    }

    @NotNull
    public final Map<Object, Integer> getKeyToIndexMap() {
        return this.keyToIndexMap;
    }

    /* JADX INFO: renamed from: getSpan-_-orMbw, reason: not valid java name */
    public final long m581getSpan_orMbw(@NotNull LazyGridItemSpanScope lazyGridItemSpanScope, int i10) {
        p.k(lazyGridItemSpanScope, "$this$getSpan");
        IntervalList.Interval<LazyGridIntervalContent> interval = this.intervals.get(i10);
        return interval.getValue().getSpan().mo2invoke(lazyGridItemSpanScope, Integer.valueOf(i10 - interval.getStartIndex())).getPackedValue();
    }

    @NotNull
    public final LazyGridSpanLayoutProvider getSpanLayoutProvider() {
        return this.spanLayoutProvider;
    }
}
