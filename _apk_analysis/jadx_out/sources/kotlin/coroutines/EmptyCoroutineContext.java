package kotlin.coroutines;

import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.io.Serializable;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.p;

/* JADX INFO: compiled from: CoroutineContextImpl.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class EmptyCoroutineContext implements d, Serializable {

    @NotNull
    public static final EmptyCoroutineContext INSTANCE = new EmptyCoroutineContext();
    private static final long serialVersionUID = 0;

    private EmptyCoroutineContext() {
    }

    private final Object readResolve() {
        return INSTANCE;
    }

    @Override // kotlin.coroutines.d
    public <R> R fold(R r10, @NotNull p<? super R, ? super d.b, ? extends R> pVar) {
        tn.p.k(pVar, "operation");
        return r10;
    }

    @Override // kotlin.coroutines.d
    @Nullable
    public <E extends d.b> E get(@NotNull d.c<E> cVar) {
        tn.p.k(cVar, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // kotlin.coroutines.d
    @NotNull
    public d minusKey(@NotNull d.c<?> cVar) {
        tn.p.k(cVar, "key");
        return this;
    }

    @Override // kotlin.coroutines.d
    @NotNull
    public d plus(@NotNull d dVar) {
        tn.p.k(dVar, GAMConfig.KEY_CONTEXT);
        return dVar;
    }

    @NotNull
    public String toString() {
        return "EmptyCoroutineContext";
    }
}
