package androidx.compose.runtime;

import bn.r;
import hn.c;
import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import sn.a;

/* JADX INFO: compiled from: ProduceState.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003J!\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/ProduceStateScope;", "T", "Landroidx/compose/runtime/MutableState;", "Ldo/l0;", "Lkotlin/Function0;", "Lbn/r;", "onDispose", "", "awaitDispose", "(Lsn/a;Lhn/c;)Ljava/lang/Object;", "runtime_release"}, k = 1, mv = {1, 6, 0})
public interface ProduceStateScope<T> extends MutableState<T>, l0 {
    @Nullable
    Object awaitDispose(@NotNull a<r> aVar, @NotNull c<?> cVar);

    @Override // p000do.l0
    @NotNull
    /* synthetic */ d getCoroutineContext();
}
