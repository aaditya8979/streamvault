package androidx.compose.foundation.lazy;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.Lazy_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import bn.r;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.p;
import zn.i;

/* JADX INFO: compiled from: LazyListItemProviderImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
@ExperimentalFoundationApi
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B+\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u000e\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R#\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006 "}, d2 = {"Landroidx/compose/foundation/lazy/LazyListItemsSnapshot;", "", "", "index", "getKey", "Landroidx/compose/foundation/lazy/LazyItemScope;", "scope", "Lbn/r;", "Item", "(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V", "getContentType", "Landroidx/compose/foundation/lazy/layout/IntervalList;", "Landroidx/compose/foundation/lazy/LazyListIntervalContent;", "intervals", "Landroidx/compose/foundation/lazy/layout/IntervalList;", "", "headerIndexes", "Ljava/util/List;", "getHeaderIndexes", "()Ljava/util/List;", "", "keyToIndexMap", "Ljava/util/Map;", "getKeyToIndexMap", "()Ljava/util/Map;", "getItemsCount", "()I", "itemsCount", "Lzn/i;", "nearestItemsRange", "<init>", "(Landroidx/compose/foundation/lazy/layout/IntervalList;Ljava/util/List;Lzn/i;)V", "foundation_release"}, k = 1, mv = {1, 6, 0})
public final class LazyListItemsSnapshot {

    @NotNull
    private final List<Integer> headerIndexes;

    @NotNull
    private final IntervalList<LazyListIntervalContent> intervals;

    @NotNull
    private final Map<Object, Integer> keyToIndexMap;

    public LazyListItemsSnapshot(@NotNull IntervalList<LazyListIntervalContent> intervalList, @NotNull List<Integer> list, @NotNull i iVar) {
        p.k(intervalList, "intervals");
        p.k(list, "headerIndexes");
        p.k(iVar, "nearestItemsRange");
        this.intervals = intervalList;
        this.headerIndexes = list;
        this.keyToIndexMap = LazyListItemProviderImplKt.generateKeyToIndexMap(iVar, intervalList);
    }

    @Composable
    public final void Item(@NotNull final LazyItemScope lazyItemScope, final int i10, @Nullable Composer composer, final int i11) {
        p.k(lazyItemScope, "scope");
        Composer composerStartRestartGroup = composer.startRestartGroup(1922528915);
        IntervalList.Interval<LazyListIntervalContent> interval = this.intervals.get(i10);
        interval.getValue().getItem().invoke(lazyItemScope, Integer.valueOf(i10 - interval.getStartIndex()), composerStartRestartGroup, Integer.valueOf(i11 & 14));
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new sn.p<Composer, Integer, r>() { // from class: androidx.compose.foundation.lazy.LazyListItemsSnapshot.Item.1
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
                LazyListItemsSnapshot.this.Item(lazyItemScope, i10, composer2, i11 | 1);
            }
        });
    }

    @Nullable
    public final Object getContentType(int index) {
        IntervalList.Interval<LazyListIntervalContent> interval = this.intervals.get(index);
        return interval.getValue().getType().invoke(Integer.valueOf(index - interval.getStartIndex()));
    }

    @NotNull
    public final List<Integer> getHeaderIndexes() {
        return this.headerIndexes;
    }

    public final int getItemsCount() {
        return this.intervals.getSize();
    }

    @NotNull
    public final Object getKey(int index) {
        IntervalList.Interval<LazyListIntervalContent> interval = this.intervals.get(index);
        int startIndex = index - interval.getStartIndex();
        l<Integer, Object> key = interval.getValue().getKey();
        Object objInvoke = key != null ? key.invoke(Integer.valueOf(startIndex)) : null;
        return objInvoke == null ? Lazy_androidKt.getDefaultLazyLayoutKey(index) : objInvoke;
    }

    @NotNull
    public final Map<Object, Integer> getKeyToIndexMap() {
        return this.keyToIndexMap;
    }
}
