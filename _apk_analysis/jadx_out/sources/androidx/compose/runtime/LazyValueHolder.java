package androidx.compose.runtime;

import bn.g;
import com.mgs.carparking.dbtable.VideoLookHistoryEntry;
import kotlin.Metadata;
import kotlin.b;
import org.jetbrains.annotations.NotNull;
import sn.a;
import tn.p;

/* JADX INFO: compiled from: ValueHolders.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\f\u0010\rR\u001b\u0010\u0007\u001a\u00028\u00008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006¨\u0006\u000e"}, d2 = {"Landroidx/compose/runtime/LazyValueHolder;", "T", "Landroidx/compose/runtime/State;", "current$delegate", "Lbn/g;", "getCurrent", "()Ljava/lang/Object;", VideoLookHistoryEntry.CURRNET, "getValue", "value", "Lkotlin/Function0;", "valueProducer", "<init>", "(Lsn/a;)V", "runtime_release"}, k = 1, mv = {1, 6, 0})
public final class LazyValueHolder<T> implements State<T> {

    /* JADX INFO: renamed from: current$delegate, reason: from kotlin metadata */
    @NotNull
    private final g current;

    public LazyValueHolder(@NotNull a<? extends T> aVar) {
        p.k(aVar, "valueProducer");
        this.current = b.b(aVar);
    }

    private final T getCurrent() {
        return (T) this.current.getValue();
    }

    @Override // androidx.compose.runtime.State
    public T getValue() {
        return getCurrent();
    }
}
