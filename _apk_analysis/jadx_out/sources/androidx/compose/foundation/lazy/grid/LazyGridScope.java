package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import sn.p;
import sn.q;
import sn.r;

/* JADX INFO: compiled from: LazyGridDsl.kt */
/* JADX INFO: loaded from: classes10.dex */
@LazyGridScopeMarker
@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001J[\u0010\f\u001a\u00020\t2\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00012\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0003¢\u0006\u0002\b\nH&ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0087\u0001\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00032\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00102\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00032\u001d\u0010\u0011\u001a\u0019\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t0\u0010¢\u0006\u0002\b\nH&ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u0082\u0001\u0001\u0014ø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridScope;", "", "key", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "span", "contentType", "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "Lbn/r;", "Landroidx/compose/runtime/Composable;", "content", "item", "(Ljava/lang/Object;Lsn/l;Ljava/lang/Object;Lsn/q;)V", "", "count", "Lkotlin/Function2;", "itemContent", "items", "(ILsn/l;Lsn/p;Lsn/l;Lsn/r;)V", "Landroidx/compose/foundation/lazy/grid/LazyGridScopeImpl;", "foundation_release"}, k = 1, mv = {1, 6, 0})
public interface LazyGridScope {
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void item$default(LazyGridScope lazyGridScope, Object obj, l lVar, Object obj2, q qVar, int i10, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if ((i10 & 1) != 0) {
            obj = null;
        }
        if ((i10 & 2) != 0) {
            lVar = null;
        }
        if ((i10 & 4) != 0) {
            obj2 = null;
        }
        lazyGridScope.item(obj, lVar, obj2, qVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void items$default(LazyGridScope lazyGridScope, int i10, l lVar, p pVar, l lVar2, r rVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        l lVar3 = (i11 & 2) != 0 ? null : lVar;
        p pVar2 = (i11 & 4) != 0 ? null : pVar;
        if ((i11 & 8) != 0) {
            lVar2 = new l() { // from class: androidx.compose.foundation.lazy.grid.LazyGridScope.items.1
                @Override // sn.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return invoke(((Number) obj2).intValue());
                }

                @Nullable
                public final Void invoke(int i12) {
                    return null;
                }
            };
        }
        lazyGridScope.items(i10, lVar3, pVar2, lVar2, rVar);
    }

    void item(@Nullable Object key, @Nullable l<? super LazyGridItemSpanScope, GridItemSpan> span, @Nullable Object contentType, @NotNull q<? super LazyGridItemScope, ? super Composer, ? super Integer, bn.r> content);

    void items(int count, @Nullable l<? super Integer, ? extends Object> key, @Nullable p<? super LazyGridItemSpanScope, ? super Integer, GridItemSpan> span, @NotNull l<? super Integer, ? extends Object> contentType, @NotNull r<? super LazyGridItemScope, ? super Integer, ? super Composer, ? super Integer, bn.r> itemContent);
}
