package cn;

import java.util.AbstractCollection;

/* JADX INFO: compiled from: AbstractMutableCollection.kt */
/* JADX INFO: loaded from: classes10.dex */
public abstract class g<E> extends AbstractCollection<E> implements un.b {
    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean add(E e10);

    public abstract int getSize();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }
}
