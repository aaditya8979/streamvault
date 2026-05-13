package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import sn.p;
import sn.r;

/* JADX INFO: compiled from: LazyGridScopeImpl.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001Bo\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0002\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\b\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\u001d\u0010\u0014\u001a\u0019\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00120\b¢\u0006\u0002\b\u0013ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019R%\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R,\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\b8\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR%\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0005\u001a\u0004\b\u0010\u0010\u0007R.\u0010\u0014\u001a\u0019\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00120\b¢\u0006\u0002\b\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridIntervalContent;", "", "Lkotlin/Function1;", "", "key", "Lsn/l;", "getKey", "()Lsn/l;", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "span", "Lsn/p;", "getSpan", "()Lsn/p;", "type", "getType", "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "Lbn/r;", "Landroidx/compose/runtime/Composable;", "item", "Lsn/r;", "getItem", "()Lsn/r;", "<init>", "(Lsn/l;Lsn/p;Lsn/l;Lsn/r;)V", "foundation_release"}, k = 1, mv = {1, 6, 0})
public final class LazyGridIntervalContent {

    @NotNull
    private final r<LazyGridItemScope, Integer, Composer, Integer, bn.r> item;

    @Nullable
    private final l<Integer, Object> key;

    @NotNull
    private final p<LazyGridItemSpanScope, Integer, GridItemSpan> span;

    @NotNull
    private final l<Integer, Object> type;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyGridIntervalContent(@Nullable l<? super Integer, ? extends Object> lVar, @NotNull p<? super LazyGridItemSpanScope, ? super Integer, GridItemSpan> pVar, @NotNull l<? super Integer, ? extends Object> lVar2, @NotNull r<? super LazyGridItemScope, ? super Integer, ? super Composer, ? super Integer, bn.r> rVar) {
        tn.p.k(pVar, "span");
        tn.p.k(lVar2, "type");
        tn.p.k(rVar, "item");
        this.key = lVar;
        this.span = pVar;
        this.type = lVar2;
        this.item = rVar;
    }

    @NotNull
    public final r<LazyGridItemScope, Integer, Composer, Integer, bn.r> getItem() {
        return this.item;
    }

    @Nullable
    public final l<Integer, Object> getKey() {
        return this.key;
    }

    @NotNull
    public final p<LazyGridItemSpanScope, Integer, GridItemSpan> getSpan() {
        return this.span;
    }

    @NotNull
    public final l<Integer, Object> getType() {
        return this.type;
    }
}
