package fo;

import bn.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Channel.kt */
/* JADX INFO: loaded from: classes.dex */
public interface p<E> {

    /* JADX INFO: compiled from: Channel.kt */
    public static final class a {
        public static /* synthetic */ boolean a(p pVar, Throwable th2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
            }
            if ((i10 & 1) != 0) {
                th2 = null;
            }
            return pVar.M(th2);
        }
    }

    @Nullable
    Object I(E e10, @NotNull hn.c<? super r> cVar);

    boolean M(@Nullable Throwable th2);

    void O(@NotNull sn.l<? super Throwable, r> lVar);

    @NotNull
    Object i(E e10);

    boolean v();
}
