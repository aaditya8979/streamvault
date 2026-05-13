package androidx.privacysandbox.ads.adservices.java.internal;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import bn.r;
import c8.i;
import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.p0;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: CoroutineAdapter.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class CoroutineAdapterKt {
    @NotNull
    public static final <T> i<T> asListenableFuture(@NotNull final p0<? extends T> p0Var, @Nullable final Object obj) {
        p.k(p0Var, "<this>");
        i<T> future = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.privacysandbox.ads.adservices.java.internal.a
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return CoroutineAdapterKt.asListenableFuture$lambda$0(p0Var, obj, completer);
            }
        });
        p.j(future, "getFuture { completer ->…        }\n    }\n    tag\n}");
        return future;
    }

    public static /* synthetic */ i asListenableFuture$default(p0 p0Var, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = "Deferred.asListenableFuture";
        }
        return asListenableFuture(p0Var, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object asListenableFuture$lambda$0(final p0 p0Var, Object obj, final CallbackToFutureAdapter.Completer completer) {
        p.k(p0Var, "$this_asListenableFuture");
        p.k(completer, "completer");
        p0Var.f(new l<Throwable, r>() { // from class: androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt$asListenableFuture$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(Throwable th2) {
                invoke2(th2);
                return r.f5635a;
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable Throwable th2) {
                if (th2 == null) {
                    completer.set((T) p0Var.l());
                } else if (th2 instanceof CancellationException) {
                    completer.setCancelled();
                } else {
                    completer.setException(th2);
                }
            }
        });
        return obj;
    }
}
