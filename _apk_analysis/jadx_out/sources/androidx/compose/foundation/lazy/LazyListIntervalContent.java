package androidx.compose.foundation.lazy;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import sn.r;
import tn.p;

/* JADX INFO: compiled from: LazyListScopeImpl.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001BR\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\u001d\u0010\u000e\u001a\u0019\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0004\b\u0012\u0010\u0013R%\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R%\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\u0007R.\u0010\u000e\u001a\u0019\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListIntervalContent;", "", "Lkotlin/Function1;", "", "key", "Lsn/l;", "getKey", "()Lsn/l;", "type", "getType", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/LazyItemScope;", "Lbn/r;", "Landroidx/compose/runtime/Composable;", "item", "Lsn/r;", "getItem", "()Lsn/r;", "<init>", "(Lsn/l;Lsn/l;Lsn/r;)V", "foundation_release"}, k = 1, mv = {1, 6, 0})
public final class LazyListIntervalContent {

    @NotNull
    private final r<LazyItemScope, Integer, Composer, Integer, bn.r> item;

    @Nullable
    private final l<Integer, Object> key;

    @NotNull
    private final l<Integer, Object> type;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyListIntervalContent(@Nullable l<? super Integer, ? extends Object> lVar, @NotNull l<? super Integer, ? extends Object> lVar2, @NotNull r<? super LazyItemScope, ? super Integer, ? super Composer, ? super Integer, bn.r> rVar) {
        p.k(lVar2, "type");
        p.k(rVar, "item");
        this.key = lVar;
        this.type = lVar2;
        this.item = rVar;
    }

    @NotNull
    public final r<LazyItemScope, Integer, Composer, Integer, bn.r> getItem() {
        return this.item;
    }

    @Nullable
    public final l<Integer, Object> getKey() {
        return this.key;
    }

    @NotNull
    public final l<Integer, Object> getType() {
        return this.type;
    }
}
