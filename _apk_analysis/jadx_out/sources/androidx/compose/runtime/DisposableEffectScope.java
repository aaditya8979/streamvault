package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import bn.r;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sn.a;
import tn.p;

/* JADX INFO: compiled from: Effects.kt */
/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\u0006\u001a\u00020\u00052\u000e\b\u0004\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\t"}, d2 = {"Landroidx/compose/runtime/DisposableEffectScope;", "", "Lkotlin/Function0;", "Lbn/r;", "onDisposeEffect", "Landroidx/compose/runtime/DisposableEffectResult;", "onDispose", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 6, 0})
public final class DisposableEffectScope {
    public static final int $stable = 0;

    @NotNull
    public final DisposableEffectResult onDispose(@NotNull final a<r> aVar) {
        p.k(aVar, "onDisposeEffect");
        return new DisposableEffectResult() { // from class: androidx.compose.runtime.DisposableEffectScope.onDispose.1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                aVar.invoke();
            }
        };
    }
}
