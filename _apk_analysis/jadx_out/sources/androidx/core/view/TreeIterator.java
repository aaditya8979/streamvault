package androidx.core.view;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ViewGroup.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class TreeIterator<T> implements Iterator<T>, un.a {

    @NotNull
    private final sn.l<T, Iterator<T>> getChildIterator;

    @NotNull
    private Iterator<? extends T> iterator;

    @NotNull
    private final List<Iterator<T>> stack = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    public TreeIterator(@NotNull Iterator<? extends T> it, @NotNull sn.l<? super T, ? extends Iterator<? extends T>> lVar) {
        this.getChildIterator = lVar;
        this.iterator = it;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private final void prepareNextIterator(T t10) {
        Iterator<T> itInvoke = this.getChildIterator.invoke(t10);
        if (itInvoke != null && itInvoke.hasNext()) {
            this.stack.add((Iterator<T>) this.iterator);
            this.iterator = itInvoke;
        } else {
            while (!this.iterator.hasNext() && (!this.stack.isEmpty())) {
                this.iterator = (Iterator) cn.f0.F0(this.stack);
                cn.b0.R(this.stack);
            }
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.iterator.hasNext();
    }

    @Override // java.util.Iterator
    public T next() {
        T next = this.iterator.next();
        prepareNextIterator(next);
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
