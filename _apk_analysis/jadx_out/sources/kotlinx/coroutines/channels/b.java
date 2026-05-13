package kotlinx.coroutines.channels;

import bn.d;
import bn.r;
import hn.c;
import io.x;
import kotlinx.coroutines.channels.a;
import kotlinx.coroutines.internal.UndeliveredElementException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.t;

/* JADX INFO: compiled from: ConflatedBufferedChannel.kt */
/* JADX INFO: loaded from: classes7.dex */
public class b<E> extends BufferedChannel<E> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f73315n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final BufferOverflow f73316o;

    public b(int i10, @NotNull BufferOverflow bufferOverflow, @Nullable l<? super E, r> lVar) {
        super(i10, lVar);
        this.f73315n = i10;
        this.f73316o = bufferOverflow;
        if (!(bufferOverflow != BufferOverflow.SUSPEND)) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + t.b(BufferedChannel.class).getSimpleName() + " instead").toString());
        }
        if (i10 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i10 + " was specified").toString());
    }

    public static /* synthetic */ <E> Object n1(b<E> bVar, E e10, c<? super r> cVar) throws Throwable {
        UndeliveredElementException undeliveredElementExceptionC;
        Object objP1 = bVar.p1(e10, true);
        if (!(objP1 instanceof a.C0861a)) {
            return r.f5635a;
        }
        a.e(objP1);
        l<E, r> lVar = bVar.f73284c;
        if (lVar == null || (undeliveredElementExceptionC = x.c(lVar, e10, null, 2, null)) == null) {
            throw bVar.i0();
        }
        d.a(undeliveredElementExceptionC, bVar.i0());
        throw undeliveredElementExceptionC;
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, fo.p
    @Nullable
    public Object I(E e10, @NotNull c<? super r> cVar) {
        return n1(this, e10, cVar);
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, fo.p
    @NotNull
    public Object i(E e10) {
        return p1(e10, false);
    }

    public final Object o1(E e10, boolean z10) {
        l<E, r> lVar;
        UndeliveredElementException undeliveredElementExceptionC;
        Object objI = super.i(e10);
        if (a.i(objI) || a.h(objI)) {
            return objI;
        }
        if (!z10 || (lVar = this.f73284c) == null || (undeliveredElementExceptionC = x.c(lVar, e10, null, 2, null)) == null) {
            return a.f73311b.c(r.f5635a);
        }
        throw undeliveredElementExceptionC;
    }

    public final Object p1(E e10, boolean z10) {
        return this.f73316o == BufferOverflow.DROP_LATEST ? o1(e10, z10) : d1(e10);
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public boolean w0() {
        return this.f73316o == BufferOverflow.DROP_OLDEST;
    }
}
