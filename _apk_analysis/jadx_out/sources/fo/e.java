package fo;

import bn.r;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.JobSupport;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ChannelCoroutine.kt */
/* JADX INFO: loaded from: classes8.dex */
public class e<E> extends kotlinx.coroutines.a<r> implements d<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final d<E> f61767e;

    public e(@NotNull kotlin.coroutines.d dVar, @NotNull d<E> dVar2, boolean z10, boolean z11) {
        super(dVar, z10, z11);
        this.f61767e = dVar2;
    }

    @Override // fo.p
    @Nullable
    public Object I(E e10, @NotNull hn.c<? super r> cVar) {
        return this.f61767e.I(e10, cVar);
    }

    @Override // fo.p
    public boolean M(@Nullable Throwable th2) {
        return this.f61767e.M(th2);
    }

    @Override // fo.p
    public void O(@NotNull sn.l<? super Throwable, r> lVar) {
        this.f61767e.O(lVar);
    }

    @Override // kotlinx.coroutines.JobSupport
    public void b0(@NotNull Throwable th2) {
        CancellationException cancellationExceptionY0 = JobSupport.Y0(this, th2, null, 1, null);
        this.f61767e.cancel(cancellationExceptionY0);
        Z(cancellationExceptionY0);
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.g, fo.o
    public final void cancel(@Nullable CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(e0(), null, this);
        }
        b0(cancellationException);
    }

    @Override // fo.p
    @NotNull
    public Object i(E e10) {
        return this.f61767e.i(e10);
    }

    @Override // fo.o
    @NotNull
    public f<E> iterator() {
        return this.f61767e.iterator();
    }

    @Override // fo.o
    @Nullable
    public Object j(@NotNull hn.c<? super E> cVar) {
        return this.f61767e.j(cVar);
    }

    @NotNull
    public final d<E> j1() {
        return this;
    }

    @NotNull
    public final d<E> k1() {
        return this.f61767e;
    }

    @Override // fo.o
    @Nullable
    public Object q(@NotNull hn.c<? super kotlinx.coroutines.channels.a<? extends E>> cVar) {
        Object objQ = this.f61767e.q(cVar);
        in.a.g();
        return objQ;
    }

    @Override // fo.o
    @NotNull
    public Object r() {
        return this.f61767e.r();
    }

    @Override // fo.p
    public boolean v() {
        return this.f61767e.v();
    }
}
