package androidx.compose.runtime;

import hn.c;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import sn.p;

/* JADX INFO: compiled from: MonotonicFrameClock.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \f2\u00020\u0001:\u0001\fJ-\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003H¦@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u0018\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/MonotonicFrameClock;", "Lkotlin/coroutines/d$b;", "R", "Lkotlin/Function1;", "", "onFrame", "withFrameNanos", "(Lsn/l;Lhn/c;)Ljava/lang/Object;", "Lkotlin/coroutines/d$c;", "getKey", "()Lkotlin/coroutines/d$c;", "key", "Key", "runtime_release"}, k = 1, mv = {1, 6, 0})
public interface MonotonicFrameClock extends d.b {

    /* JADX INFO: renamed from: Key, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: MonotonicFrameClock.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
        public static <R> R fold(@NotNull MonotonicFrameClock monotonicFrameClock, R r10, @NotNull p<? super R, ? super d.b, ? extends R> pVar) {
            tn.p.k(pVar, "operation");
            return (R) d.b.a.a(monotonicFrameClock, r10, pVar);
        }

        @Nullable
        public static <E extends d.b> E get(@NotNull MonotonicFrameClock monotonicFrameClock, @NotNull d.c<E> cVar) {
            tn.p.k(cVar, "key");
            return (E) d.b.a.b(monotonicFrameClock, cVar);
        }

        @Deprecated
        @NotNull
        public static d.c<?> getKey(@NotNull MonotonicFrameClock monotonicFrameClock) {
            return MonotonicFrameClock.super.getKey();
        }

        @NotNull
        public static d minusKey(@NotNull MonotonicFrameClock monotonicFrameClock, @NotNull d.c<?> cVar) {
            tn.p.k(cVar, "key");
            return d.b.a.c(monotonicFrameClock, cVar);
        }

        @NotNull
        public static d plus(@NotNull MonotonicFrameClock monotonicFrameClock, @NotNull d dVar) {
            tn.p.k(dVar, GAMConfig.KEY_CONTEXT);
            return d.b.a.d(monotonicFrameClock, dVar);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.MonotonicFrameClock$Key, reason: from kotlin metadata */
    /* JADX INFO: compiled from: MonotonicFrameClock.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/MonotonicFrameClock$Key;", "Lkotlin/coroutines/d$c;", "Landroidx/compose/runtime/MonotonicFrameClock;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 6, 0})
    public static final class Companion implements d.c<MonotonicFrameClock> {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @Override // kotlin.coroutines.d
    /* synthetic */ <R> R fold(R r10, @NotNull p<? super R, ? super d.b, ? extends R> pVar);

    @Override // kotlin.coroutines.d.b, kotlin.coroutines.d
    @Nullable
    /* synthetic */ <E extends d.b> E get(@NotNull d.c<E> cVar);

    @Override // kotlin.coroutines.d.b
    @NotNull
    default d.c<?> getKey() {
        return INSTANCE;
    }

    @Override // kotlin.coroutines.d
    @NotNull
    /* synthetic */ d minusKey(@NotNull d.c<?> cVar);

    @Override // kotlin.coroutines.d
    @NotNull
    /* synthetic */ d plus(@NotNull d dVar);

    @Nullable
    <R> Object withFrameNanos(@NotNull l<? super Long, ? extends R> lVar, @NotNull c<? super R> cVar);
}
