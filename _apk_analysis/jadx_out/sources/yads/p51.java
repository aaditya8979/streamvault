package yads;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes12.dex */
public abstract class p51 extends j51 implements List, RandomAccess {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m51 f93439c = new m51(0, sm2.f94878f);

    public static p51 a(Collection collection) {
        if (!(collection instanceof j51)) {
            return a(collection.toArray());
        }
        p51 p51VarA = ((j51) collection).a();
        if (!p51VarA.e()) {
            return p51VarA;
        }
        Object[] array = p51VarA.toArray(j51.f91097b);
        return b(array.length, array);
    }

    public static sm2 a(Object obj) {
        return a(obj);
    }

    public static sm2 a(Object... objArr) {
        int length = objArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (objArr[i10] == null) {
                throw new NullPointerException(mg2.a("at index ", i10));
            }
        }
        return b(objArr.length, objArr);
    }

    public static sm2 b(int i10, Object[] objArr) {
        return i10 == 0 ? sm2.f94878f : new sm2(i10, objArr);
    }

    public static sm2 b(Object[] objArr) {
        return objArr.length == 0 ? sm2.f94878f : a((Object[]) objArr.clone());
    }

    public static l51 f() {
        return new l51();
    }

    public static sm2 g() {
        return sm2.f94878f;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // yads.j51
    public int a(int i10, Object[] objArr) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final m51 listIterator(int i10) {
        ng2.b(i10, size());
        return isEmpty() ? f93439c : new m51(i10, this);
    }

    @Override // yads.j51
    public final p51 a() {
        return this;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public p51 subList(int i10, int i11) {
        ng2.a(i10, i11, size());
        int i12 = i11 - i10;
        return i12 == size() ? this : i12 == 0 ? sm2.f94878f : new o51(this, i10, i12);
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // yads.j51, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            int size = size();
            if (size != list.size()) {
                return false;
            }
            if (!(list instanceof RandomAccess)) {
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (it.hasNext()) {
                    if (!it2.hasNext() || !l92.a(it.next(), it2.next())) {
                        return false;
                    }
                }
                return !it2.hasNext();
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (!l92.a(get(i10), list.get(i10))) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = ~(~(get(i11).hashCode() + (i10 * 31)));
        }
        return i10;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj != null) {
            int size = size();
            for (int i10 = 0; i10 < size; i10++) {
                if (obj.equals(get(i10))) {
                    return i10;
                }
            }
        }
        return -1;
    }

    @Override // yads.j51, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // yads.j51, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final ja3 iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj != null) {
            for (int size = size() - 1; size >= 0; size--) {
                if (obj.equals(get(size))) {
                    return size;
                }
            }
        }
        return -1;
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // yads.j51
    public Object writeReplace() {
        return new n51(toArray(j51.f91097b));
    }
}
