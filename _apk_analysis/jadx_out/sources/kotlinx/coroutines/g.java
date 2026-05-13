package kotlinx.coroutines;

import ao.i;
import bn.r;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.q;
import p000do.s;
import p000do.y0;
import sn.l;
import sn.p;

/* JADX INFO: compiled from: Job.kt */
/* JADX INFO: loaded from: classes11.dex */
public interface g extends d.b {

    @NotNull
    public static final b H8 = b.f73416b;

    /* JADX INFO: compiled from: Job.kt */
    public static final class a {
        public static /* synthetic */ void a(g gVar, CancellationException cancellationException, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                cancellationException = null;
            }
            gVar.cancel(cancellationException);
        }

        public static <R> R b(@NotNull g gVar, R r10, @NotNull p<? super R, ? super d.b, ? extends R> pVar) {
            return (R) d.b.a.a(gVar, r10, pVar);
        }

        @Nullable
        public static <E extends d.b> E c(@NotNull g gVar, @NotNull d.c<E> cVar) {
            return (E) d.b.a.b(gVar, cVar);
        }

        public static /* synthetic */ y0 d(g gVar, boolean z10, boolean z11, l lVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
            }
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            if ((i10 & 2) != 0) {
                z11 = true;
            }
            return gVar.w(z10, z11, lVar);
        }

        @NotNull
        public static kotlin.coroutines.d e(@NotNull g gVar, @NotNull d.c<?> cVar) {
            return d.b.a.c(gVar, cVar);
        }

        @NotNull
        public static kotlin.coroutines.d f(@NotNull g gVar, @NotNull kotlin.coroutines.d dVar) {
            return d.b.a.d(gVar, dVar);
        }
    }

    /* JADX INFO: compiled from: Job.kt */
    public static final class b implements d.c<g> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ b f73416b = new b();
    }

    @NotNull
    CancellationException B();

    @Nullable
    Object C(@NotNull hn.c<? super r> cVar);

    @NotNull
    q H(@NotNull s sVar);

    void cancel(@Nullable CancellationException cancellationException);

    boolean d();

    @NotNull
    y0 f(@NotNull l<? super Throwable, r> lVar);

    boolean isActive();

    boolean isCancelled();

    @NotNull
    i<g> k();

    boolean start();

    @NotNull
    y0 w(boolean z10, boolean z11, @NotNull l<? super Throwable, r> lVar);

    @NotNull
    lo.a x();
}
