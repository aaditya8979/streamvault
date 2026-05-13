package p000do;

import bn.r;
import hn.c;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import sn.q;

/* JADX INFO: compiled from: CancellableContinuation.kt */
/* JADX INFO: loaded from: classes7.dex */
public interface k<T> extends c<T> {

    /* JADX INFO: compiled from: CancellableContinuation.kt */
    public static final class a {
        public static /* synthetic */ boolean a(k kVar, Throwable th2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                th2 = null;
            }
            return kVar.a(th2);
        }
    }

    void A(@NotNull Object obj);

    @Nullable
    Object D(@NotNull Throwable th2);

    @Nullable
    <R extends T> Object E(R r10, @Nullable Object obj, @Nullable q<? super Throwable, ? super R, ? super d, r> qVar);

    void P(@NotNull l<? super Throwable, r> lVar);

    boolean a(@Nullable Throwable th2);

    boolean d();

    @Override // hn.c
    @NotNull
    /* synthetic */ d getContext();

    boolean isActive();

    void p(T t10, @Nullable l<? super Throwable, r> lVar);

    void s(@NotNull h0 h0Var, T t10);

    <R extends T> void y(R r10, @Nullable q<? super Throwable, ? super R, ? super d, r> qVar);
}
