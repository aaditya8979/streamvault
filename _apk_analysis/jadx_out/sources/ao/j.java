package ao;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SequenceBuilder.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class j<T> extends k<T> implements Iterator<T>, hn.c<bn.r>, un.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public T f5211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Iterator<? extends T> f5212d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public hn.c<? super bn.r> f5213e;

    @Override // ao.k
    @Nullable
    public Object b(T t10, @NotNull hn.c<? super bn.r> cVar) {
        this.f5211c = t10;
        this.f5210b = 3;
        this.f5213e = cVar;
        Object objG = in.a.g();
        if (objG == in.a.g()) {
            jn.f.c(cVar);
        }
        return objG == in.a.g() ? objG : bn.r.f5635a;
    }

    @Override // ao.k
    @Nullable
    public Object f(@NotNull Iterator<? extends T> it, @NotNull hn.c<? super bn.r> cVar) {
        if (!it.hasNext()) {
            return bn.r.f5635a;
        }
        this.f5212d = it;
        this.f5210b = 2;
        this.f5213e = cVar;
        Object objG = in.a.g();
        if (objG == in.a.g()) {
            jn.f.c(cVar);
        }
        return objG == in.a.g() ? objG : bn.r.f5635a;
    }

    public final Throwable g() {
        int i10 = this.f5210b;
        if (i10 == 4) {
            return new NoSuchElementException();
        }
        if (i10 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f5210b);
    }

    @Override // hn.c
    @NotNull
    public kotlin.coroutines.d getContext() {
        return EmptyCoroutineContext.INSTANCE;
    }

    public final T h() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public boolean hasNext() throws Throwable {
        while (true) {
            int i10 = this.f5210b;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2 || i10 == 3) {
                        return true;
                    }
                    if (i10 == 4) {
                        return false;
                    }
                    throw g();
                }
                Iterator<? extends T> it = this.f5212d;
                tn.p.h(it);
                if (it.hasNext()) {
                    this.f5210b = 2;
                    return true;
                }
                this.f5212d = null;
            }
            this.f5210b = 5;
            hn.c<? super bn.r> cVar = this.f5213e;
            tn.p.h(cVar);
            this.f5213e = null;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m7534constructorimpl(bn.r.f5635a));
        }
    }

    public final void j(@Nullable hn.c<? super bn.r> cVar) {
        this.f5213e = cVar;
    }

    @Override // java.util.Iterator
    public T next() throws Throwable {
        int i10 = this.f5210b;
        if (i10 == 0 || i10 == 1) {
            return h();
        }
        if (i10 == 2) {
            this.f5210b = 1;
            Iterator<? extends T> it = this.f5212d;
            tn.p.h(it);
            return it.next();
        }
        if (i10 != 3) {
            throw g();
        }
        this.f5210b = 0;
        T t10 = this.f5211c;
        this.f5211c = null;
        return t10;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // hn.c
    public void resumeWith(@NotNull Object obj) {
        kotlin.c.b(obj);
        this.f5210b = 4;
    }
}
