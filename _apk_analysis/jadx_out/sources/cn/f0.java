package cn;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.SlidingWindowKt;
import kotlin.random.Random;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: _Collections.kt */
/* JADX INFO: loaded from: classes5.dex */
public class f0 extends d0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Sequences.kt */
    public static final class a<T> implements ao.i<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Iterable f6740a;

        public a(Iterable iterable) {
            this.f6740a = iterable;
        }

        @Override // ao.i
        public Iterator<T> iterator() {
            return this.f6740a.iterator();
        }
    }

    @NotNull
    public static final <T, A extends Appendable> A A0(@NotNull Iterable<? extends T> iterable, @NotNull A a10, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i10, @NotNull CharSequence charSequence4, @Nullable sn.l<? super T, ? extends CharSequence> lVar) throws IOException {
        tn.p.k(iterable, "<this>");
        tn.p.k(a10, "buffer");
        tn.p.k(charSequence, "separator");
        tn.p.k(charSequence2, "prefix");
        tn.p.k(charSequence3, "postfix");
        tn.p.k(charSequence4, "truncated");
        a10.append(charSequence2);
        int i11 = 0;
        for (T t10 : iterable) {
            i11++;
            if (i11 > 1) {
                a10.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            bo.q.a(a10, t10, lVar);
        }
        if (i10 >= 0 && i11 > i10) {
            a10.append(charSequence4);
        }
        a10.append(charSequence3);
        return a10;
    }

    @NotNull
    public static final <T> String C0(@NotNull Iterable<? extends T> iterable, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i10, @NotNull CharSequence charSequence4, @Nullable sn.l<? super T, ? extends CharSequence> lVar) {
        tn.p.k(iterable, "<this>");
        tn.p.k(charSequence, "separator");
        tn.p.k(charSequence2, "prefix");
        tn.p.k(charSequence3, "postfix");
        tn.p.k(charSequence4, "truncated");
        return ((StringBuilder) A0(iterable, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, lVar)).toString();
    }

    public static /* synthetic */ String D0(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, sn.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i11 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i11 & 4) == 0 ? charSequence3 : "";
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return C0(iterable, charSequence, charSequence5, charSequence6, i12, charSequence7, lVar);
    }

    public static final <T> T E0(@NotNull Iterable<? extends T> iterable) {
        tn.p.k(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) F0((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static final <T> T F0(@NotNull List<? extends T> list) {
        tn.p.k(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(w.o(list));
    }

    @Nullable
    public static final <T> T G0(@NotNull List<? extends T> list) {
        tn.p.k(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    @Nullable
    public static final <T extends Comparable<? super T>> T H0(@NotNull Iterable<? extends T> iterable) {
        tn.p.k(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    @Nullable
    public static final Float I0(@NotNull Iterable<Float> iterable) {
        tn.p.k(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = it.next().floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, it.next().floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @Nullable
    public static final <T extends Comparable<? super T>> T J0(@NotNull Iterable<? extends T> iterable) {
        tn.p.k(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    @Nullable
    public static final Float K0(@NotNull Iterable<Float> iterable) {
        tn.p.k(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = it.next().floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, it.next().floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @NotNull
    public static final <T> List<T> L0(@NotNull Iterable<? extends T> iterable, @NotNull Iterable<? extends T> iterable2) {
        tn.p.k(iterable, "<this>");
        tn.p.k(iterable2, "elements");
        Collection collectionH = b0.H(iterable2);
        if (collectionH.isEmpty()) {
            return g1(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (T t10 : iterable) {
            if (!collectionH.contains(t10)) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <T> List<T> M0(@NotNull Iterable<? extends T> iterable, T t10) {
        tn.p.k(iterable, "<this>");
        ArrayList arrayList = new ArrayList(x.x(iterable, 10));
        boolean z10 = false;
        for (T t11 : iterable) {
            boolean z11 = true;
            if (!z10 && tn.p.f(t11, t10)) {
                z10 = true;
                z11 = false;
            }
            if (z11) {
                arrayList.add(t11);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <T> List<T> N0(@NotNull Iterable<? extends T> iterable, @NotNull Iterable<? extends T> iterable2) {
        tn.p.k(iterable, "<this>");
        tn.p.k(iterable2, "elements");
        if (iterable instanceof Collection) {
            return O0((Collection) iterable, iterable2);
        }
        ArrayList arrayList = new ArrayList();
        b0.F(arrayList, iterable);
        b0.F(arrayList, iterable2);
        return arrayList;
    }

    @NotNull
    public static final <T> List<T> O0(@NotNull Collection<? extends T> collection, @NotNull Iterable<? extends T> iterable) {
        tn.p.k(collection, "<this>");
        tn.p.k(iterable, "elements");
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            b0.F(arrayList, iterable);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection.size() + collection2.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    @NotNull
    public static final <T> List<T> P0(@NotNull Collection<? extends T> collection, T t10) {
        tn.p.k(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t10);
        return arrayList;
    }

    public static final <T> T Q0(@NotNull Collection<? extends T> collection, @NotNull Random random) {
        tn.p.k(collection, "<this>");
        tn.p.k(random, "random");
        if (collection.isEmpty()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        return (T) n0(collection, random.nextInt(collection.size()));
    }

    @NotNull
    public static final <T> List<T> R0(@NotNull Iterable<? extends T> iterable) {
        tn.p.k(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return g1(iterable);
        }
        List<T> listI1 = i1(iterable);
        d0.e0(listI1);
        return listI1;
    }

    public static final <T> T S0(@NotNull Iterable<? extends T> iterable) {
        tn.p.k(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) T0((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        T next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    public static final <T> T T0(@NotNull List<? extends T> list) {
        tn.p.k(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    @Nullable
    public static final <T> T U0(@NotNull List<? extends T> list) {
        tn.p.k(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    @NotNull
    public static final <T> List<T> V0(@NotNull List<? extends T> list, @NotNull zn.i iVar) {
        tn.p.k(list, "<this>");
        tn.p.k(iVar, "indices");
        return iVar.isEmpty() ? w.m() : g1(list.subList(iVar.getStart().intValue(), iVar.getEndInclusive().intValue() + 1));
    }

    @NotNull
    public static final <T extends Comparable<? super T>> List<T> W0(@NotNull Iterable<? extends T> iterable) {
        tn.p.k(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List<T> listI1 = i1(iterable);
            a0.C(listI1);
            return listI1;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return g1(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        p.F((Comparable[]) array);
        return p.f(array);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> List<T> X0(@NotNull Iterable<? extends T> iterable, @NotNull Comparator<? super T> comparator) {
        tn.p.k(iterable, "<this>");
        tn.p.k(comparator, "comparator");
        if (!(iterable instanceof Collection)) {
            List<T> listI1 = i1(iterable);
            a0.D(listI1, comparator);
            return listI1;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return g1(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        p.G(array, comparator);
        return p.f(array);
    }

    @NotNull
    public static final <T> List<T> Y0(@NotNull Iterable<? extends T> iterable, int i10) {
        tn.p.k(iterable, "<this>");
        int i11 = 0;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return w.m();
        }
        if (iterable instanceof Collection) {
            if (i10 >= ((Collection) iterable).size()) {
                return g1(iterable);
            }
            if (i10 == 1) {
                return v.e(s0(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i10);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return w.t(arrayList);
    }

    @NotNull
    public static final <T> List<T> Z0(@NotNull List<? extends T> list, int i10) {
        tn.p.k(list, "<this>");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return w.m();
        }
        int size = list.size();
        if (i10 >= size) {
            return g1(list);
        }
        if (i10 == 1) {
            return v.e(F0(list));
        }
        ArrayList arrayList = new ArrayList(i10);
        if (list instanceof RandomAccess) {
            for (int i11 = size - i10; i11 < size; i11++) {
                arrayList.add(list.get(i11));
            }
        } else {
            ListIterator<? extends T> listIterator = list.listIterator(size - i10);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    @NotNull
    public static final boolean[] a1(@NotNull Collection<Boolean> collection) {
        tn.p.k(collection, "<this>");
        boolean[] zArr = new boolean[collection.size()];
        Iterator<Boolean> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            zArr[i10] = it.next().booleanValue();
            i10++;
        }
        return zArr;
    }

    @NotNull
    public static final byte[] b1(@NotNull Collection<Byte> collection) {
        tn.p.k(collection, "<this>");
        byte[] bArr = new byte[collection.size()];
        Iterator<Byte> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            bArr[i10] = it.next().byteValue();
            i10++;
        }
        return bArr;
    }

    @NotNull
    public static final <T, C extends Collection<? super T>> C c1(@NotNull Iterable<? extends T> iterable, @NotNull C c10) {
        tn.p.k(iterable, "<this>");
        tn.p.k(c10, "destination");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            c10.add(it.next());
        }
        return c10;
    }

    @NotNull
    public static final float[] d1(@NotNull Collection<Float> collection) {
        tn.p.k(collection, "<this>");
        float[] fArr = new float[collection.size()];
        Iterator<Float> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            fArr[i10] = it.next().floatValue();
            i10++;
        }
        return fArr;
    }

    @NotNull
    public static final <T> HashSet<T> e1(@NotNull Iterable<? extends T> iterable) {
        tn.p.k(iterable, "<this>");
        return (HashSet) c1(iterable, new HashSet(p0.f(x.x(iterable, 12))));
    }

    @NotNull
    public static final int[] f1(@NotNull Collection<Integer> collection) {
        tn.p.k(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator<Integer> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr[i10] = it.next().intValue();
            i10++;
        }
        return iArr;
    }

    @NotNull
    public static final <T> ao.i<T> g0(@NotNull Iterable<? extends T> iterable) {
        tn.p.k(iterable, "<this>");
        return new a(iterable);
    }

    @NotNull
    public static final <T> List<T> g1(@NotNull Iterable<? extends T> iterable) {
        tn.p.k(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return w.t(i1(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return w.m();
        }
        if (size != 1) {
            return j1(collection);
        }
        return v.e(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    @NotNull
    public static final <T> List<List<T>> h0(@NotNull Iterable<? extends T> iterable, int i10) {
        tn.p.k(iterable, "<this>");
        return m1(iterable, i10, i10, true);
    }

    @NotNull
    public static final long[] h1(@NotNull Collection<Long> collection) {
        tn.p.k(collection, "<this>");
        long[] jArr = new long[collection.size()];
        Iterator<Long> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            jArr[i10] = it.next().longValue();
            i10++;
        }
        return jArr;
    }

    public static final <T> boolean i0(@NotNull Iterable<? extends T> iterable, T t10) {
        tn.p.k(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).contains(t10) : x0(iterable, t10) >= 0;
    }

    @NotNull
    public static final <T> List<T> i1(@NotNull Iterable<? extends T> iterable) {
        tn.p.k(iterable, "<this>");
        return iterable instanceof Collection ? j1((Collection) iterable) : (List) c1(iterable, new ArrayList());
    }

    public static final <T> int j0(@NotNull Iterable<? extends T> iterable) {
        tn.p.k(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        int i10 = 0;
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            it.next();
            i10++;
            if (i10 < 0) {
                w.v();
            }
        }
        return i10;
    }

    @NotNull
    public static final <T> List<T> j1(@NotNull Collection<? extends T> collection) {
        tn.p.k(collection, "<this>");
        return new ArrayList(collection);
    }

    @NotNull
    public static final <T> List<T> k0(@NotNull Iterable<? extends T> iterable) {
        tn.p.k(iterable, "<this>");
        return g1(k1(iterable));
    }

    @NotNull
    public static final <T> Set<T> k1(@NotNull Iterable<? extends T> iterable) {
        tn.p.k(iterable, "<this>");
        return iterable instanceof Collection ? new LinkedHashSet((Collection) iterable) : (Set) c1(iterable, new LinkedHashSet());
    }

    @NotNull
    public static final <T> List<T> l0(@NotNull Iterable<? extends T> iterable, int i10) {
        ArrayList arrayList;
        tn.p.k(iterable, "<this>");
        int i11 = 0;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return g1(iterable);
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size() - i10;
            if (size <= 0) {
                return w.m();
            }
            if (size == 1) {
                return v.e(E0(iterable));
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    List list = (List) iterable;
                    int size2 = list.size();
                    while (i10 < size2) {
                        arrayList.add(list.get(i10));
                        i10++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i10);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        for (T t10 : iterable) {
            if (i11 >= i10) {
                arrayList.add(t10);
            } else {
                i11++;
            }
        }
        return w.t(arrayList);
    }

    @NotNull
    public static final <T> Set<T> l1(@NotNull Iterable<? extends T> iterable) {
        tn.p.k(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return w0.i((Set) c1(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return w0.f();
        }
        if (size != 1) {
            return (Set) c1(iterable, new LinkedHashSet(p0.f(collection.size())));
        }
        return v0.d(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    @NotNull
    public static final <T> List<T> m0(@NotNull List<? extends T> list, int i10) {
        tn.p.k(list, "<this>");
        if (i10 >= 0) {
            return Y0(list, zn.n.e(list.size() - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @NotNull
    public static final <T> List<List<T>> m1(@NotNull Iterable<? extends T> iterable, int i10, int i11, boolean z10) {
        int iJ;
        tn.p.k(iterable, "<this>");
        SlidingWindowKt.a(i10, i11);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator itB = SlidingWindowKt.b(iterable.iterator(), i10, i11, z10, false);
            while (itB.hasNext()) {
                arrayList.add((List) itB.next());
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i11) + (size % i11 == 0 ? 0 : 1));
        int i12 = 0;
        while (true) {
            if (!(i12 >= 0 && i12 < size) || ((iJ = zn.n.j(i10, size - i12)) < i10 && !z10)) {
                break;
            }
            ArrayList arrayList3 = new ArrayList(iJ);
            for (int i13 = 0; i13 < iJ; i13++) {
                arrayList3.add(list.get(i13 + i12));
            }
            arrayList2.add(arrayList3);
            i12 += i11;
        }
        return arrayList2;
    }

    public static final <T> T n0(@NotNull Iterable<? extends T> iterable, final int i10) {
        tn.p.k(iterable, "<this>");
        return iterable instanceof List ? (T) ((List) iterable).get(i10) : (T) p0(iterable, i10, new sn.l() { // from class: cn.e0
            @Override // sn.l
            public final Object invoke(Object obj) {
                return f0.o0(i10, ((Integer) obj).intValue());
            }
        });
    }

    @NotNull
    public static final <T, R> List<R> n1(@NotNull Iterable<? extends T> iterable, int i10, int i11, boolean z10, @NotNull sn.l<? super List<? extends T>, ? extends R> lVar) {
        tn.p.k(iterable, "<this>");
        tn.p.k(lVar, "transform");
        SlidingWindowKt.a(i10, i11);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator itB = SlidingWindowKt.b(iterable.iterator(), i10, i11, z10, true);
            while (itB.hasNext()) {
                arrayList.add(lVar.invoke((List) itB.next()));
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i11) + (size % i11 == 0 ? 0 : 1));
        s0 s0Var = new s0(list);
        int i12 = 0;
        while (true) {
            if (!(i12 >= 0 && i12 < size)) {
                break;
            }
            int iJ = zn.n.j(i10, size - i12);
            if (!z10 && iJ < i10) {
                break;
            }
            s0Var.f(i12, iJ + i12);
            arrayList2.add(lVar.invoke(s0Var));
            i12 += i11;
        }
        return arrayList2;
    }

    public static final Object o0(int i10, int i11) {
        throw new IndexOutOfBoundsException("Collection doesn't contain element at index " + i10 + '.');
    }

    public static /* synthetic */ List o1(Iterable iterable, int i10, int i11, boolean z10, sn.l lVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 1;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        return n1(iterable, i10, i11, z10, lVar);
    }

    public static final <T> T p0(@NotNull Iterable<? extends T> iterable, int i10, @NotNull sn.l<? super Integer, ? extends T> lVar) {
        tn.p.k(iterable, "<this>");
        tn.p.k(lVar, "defaultValue");
        int i11 = 0;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (i10 >= 0 && i10 < list.size()) {
                i11 = 1;
            }
            return i11 != 0 ? (T) list.get(i10) : lVar.invoke(Integer.valueOf(i10));
        }
        if (i10 < 0) {
            return lVar.invoke(Integer.valueOf(i10));
        }
        for (T t10 : iterable) {
            int i12 = i11 + 1;
            if (i10 == i11) {
                return t10;
            }
            i11 = i12;
        }
        return lVar.invoke(Integer.valueOf(i10));
    }

    @NotNull
    public static final <T, R> List<Pair<T, R>> p1(@NotNull Iterable<? extends T> iterable, @NotNull Iterable<? extends R> iterable2) {
        tn.p.k(iterable, "<this>");
        tn.p.k(iterable2, "other");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(x.x(iterable, 10), x.x(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(bn.h.a(it.next(), it2.next()));
        }
        return arrayList;
    }

    @NotNull
    public static final <T> List<T> q0(@NotNull Iterable<? extends T> iterable) {
        tn.p.k(iterable, "<this>");
        return (List) r0(iterable, new ArrayList());
    }

    @NotNull
    public static final <C extends Collection<? super T>, T> C r0(@NotNull Iterable<? extends T> iterable, @NotNull C c10) {
        tn.p.k(iterable, "<this>");
        tn.p.k(c10, "destination");
        for (T t10 : iterable) {
            if (t10 != null) {
                c10.add(t10);
            }
        }
        return c10;
    }

    public static final <T> T s0(@NotNull Iterable<? extends T> iterable) {
        tn.p.k(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) t0((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static final <T> T t0(@NotNull List<? extends T> list) {
        tn.p.k(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    @Nullable
    public static final <T> T u0(@NotNull Iterable<? extends T> iterable) {
        tn.p.k(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(0);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    @Nullable
    public static final <T> T v0(@NotNull List<? extends T> list) {
        tn.p.k(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Nullable
    public static final <T> T w0(@NotNull List<? extends T> list, int i10) {
        tn.p.k(list, "<this>");
        boolean z10 = false;
        if (i10 >= 0 && i10 < list.size()) {
            z10 = true;
        }
        if (z10) {
            return list.get(i10);
        }
        return null;
    }

    public static final <T> int x0(@NotNull Iterable<? extends T> iterable, T t10) {
        tn.p.k(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(t10);
        }
        int i10 = 0;
        for (T t11 : iterable) {
            if (i10 < 0) {
                w.w();
            }
            if (tn.p.f(t10, t11)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static final <T> int y0(@NotNull List<? extends T> list, T t10) {
        tn.p.k(list, "<this>");
        return list.indexOf(t10);
    }

    @NotNull
    public static final <T> Set<T> z0(@NotNull Iterable<? extends T> iterable, @NotNull Iterable<? extends T> iterable2) {
        tn.p.k(iterable, "<this>");
        tn.p.k(iterable2, "other");
        Set<T> setK1 = k1(iterable);
        b0.U(setK1, iterable2);
        return setK1;
    }
}
