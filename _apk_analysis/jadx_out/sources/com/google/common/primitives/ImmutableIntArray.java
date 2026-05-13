package com.google.common.primitives;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import y7.l;

/* JADX INFO: loaded from: classes2.dex */
public final class ImmutableIntArray implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ImmutableIntArray f23444c = new ImmutableIntArray(new int[0]);
    private final int[] array;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient int f23445b;
    private final int end;

    public static class AsList extends AbstractList<Integer> implements RandomAccess, Serializable {
        private final ImmutableIntArray parent;

        public AsList(ImmutableIntArray immutableIntArray) {
            this.parent = immutableIntArray;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return indexOf(obj) >= 0;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj instanceof AsList) {
                return this.parent.equals(((AsList) obj).parent);
            }
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            if (size() != list.size()) {
                return false;
            }
            int i10 = this.parent.f23445b;
            for (Object obj2 : list) {
                if (obj2 instanceof Integer) {
                    int i11 = i10 + 1;
                    if (this.parent.array[i10] == ((Integer) obj2).intValue()) {
                        i10 = i11;
                    }
                }
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public Integer get(int i10) {
            return Integer.valueOf(this.parent.get(i10));
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            return this.parent.hashCode();
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            if (obj instanceof Integer) {
                return this.parent.indexOf(((Integer) obj).intValue());
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            if (obj instanceof Integer) {
                return this.parent.lastIndexOf(((Integer) obj).intValue());
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.parent.length();
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Integer> subList(int i10, int i11) {
            return this.parent.subArray(i10, i11).asList();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return this.parent.toString();
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int[] f23446a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f23447b = 0;

        public b(int i10) {
            this.f23446a = new int[i10];
        }

        public static int f(int i10, int i11) {
            if (i11 < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int iHighestOneBit = i10 + (i10 >> 1) + 1;
            if (iHighestOneBit < i11) {
                iHighestOneBit = Integer.highestOneBit(i11 - 1) << 1;
            }
            if (iHighestOneBit < 0) {
                return Integer.MAX_VALUE;
            }
            return iHighestOneBit;
        }

        public b a(int i10) {
            e(1);
            int[] iArr = this.f23446a;
            int i11 = this.f23447b;
            iArr[i11] = i10;
            this.f23447b = i11 + 1;
            return this;
        }

        public b b(Iterable<Integer> iterable) {
            if (iterable instanceof Collection) {
                return c((Collection) iterable);
            }
            Iterator<Integer> it = iterable.iterator();
            while (it.hasNext()) {
                a(it.next().intValue());
            }
            return this;
        }

        public b c(Collection<Integer> collection) {
            e(collection.size());
            for (Integer num : collection) {
                int[] iArr = this.f23446a;
                int i10 = this.f23447b;
                this.f23447b = i10 + 1;
                iArr[i10] = num.intValue();
            }
            return this;
        }

        public ImmutableIntArray d() {
            return this.f23447b == 0 ? ImmutableIntArray.f23444c : new ImmutableIntArray(this.f23446a, 0, this.f23447b);
        }

        public final void e(int i10) {
            int i11 = this.f23447b + i10;
            int[] iArr = this.f23446a;
            if (i11 > iArr.length) {
                this.f23446a = Arrays.copyOf(iArr, f(iArr.length, i11));
            }
        }
    }

    public ImmutableIntArray(int[] iArr) {
        this(iArr, 0, iArr.length);
    }

    public ImmutableIntArray(int[] iArr, int i10, int i11) {
        this.array = iArr;
        this.f23445b = i10;
        this.end = i11;
    }

    public static b builder() {
        return new b(10);
    }

    public static b builder(int i10) {
        l.f(i10 >= 0, "Invalid initialCapacity: %s", i10);
        return new b(i10);
    }

    public static ImmutableIntArray copyOf(Iterable<Integer> iterable) {
        return iterable instanceof Collection ? copyOf((Collection<Integer>) iterable) : builder().b(iterable).d();
    }

    public static ImmutableIntArray copyOf(Collection<Integer> collection) {
        return collection.isEmpty() ? f23444c : new ImmutableIntArray(Ints.n(collection));
    }

    public static ImmutableIntArray copyOf(int[] iArr) {
        return iArr.length == 0 ? f23444c : new ImmutableIntArray(Arrays.copyOf(iArr, iArr.length));
    }

    public static ImmutableIntArray of() {
        return f23444c;
    }

    public static ImmutableIntArray of(int i10) {
        return new ImmutableIntArray(new int[]{i10});
    }

    public static ImmutableIntArray of(int i10, int i11) {
        return new ImmutableIntArray(new int[]{i10, i11});
    }

    public static ImmutableIntArray of(int i10, int i11, int i12) {
        return new ImmutableIntArray(new int[]{i10, i11, i12});
    }

    public static ImmutableIntArray of(int i10, int i11, int i12, int i13) {
        return new ImmutableIntArray(new int[]{i10, i11, i12, i13});
    }

    public static ImmutableIntArray of(int i10, int i11, int i12, int i13, int i14) {
        return new ImmutableIntArray(new int[]{i10, i11, i12, i13, i14});
    }

    public static ImmutableIntArray of(int i10, int i11, int i12, int i13, int i14, int i15) {
        return new ImmutableIntArray(new int[]{i10, i11, i12, i13, i14, i15});
    }

    public static ImmutableIntArray of(int i10, int... iArr) {
        l.e(iArr.length <= 2147483646, "the total number of elements must fit in an int");
        int[] iArr2 = new int[iArr.length + 1];
        iArr2[0] = i10;
        System.arraycopy(iArr, 0, iArr2, 1, iArr.length);
        return new ImmutableIntArray(iArr2);
    }

    public List<Integer> asList() {
        return new AsList();
    }

    public boolean contains(int i10) {
        return indexOf(i10) >= 0;
    }

    public final boolean d() {
        return this.f23445b > 0 || this.end < this.array.length;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableIntArray)) {
            return false;
        }
        ImmutableIntArray immutableIntArray = (ImmutableIntArray) obj;
        if (length() != immutableIntArray.length()) {
            return false;
        }
        for (int i10 = 0; i10 < length(); i10++) {
            if (get(i10) != immutableIntArray.get(i10)) {
                return false;
            }
        }
        return true;
    }

    public int get(int i10) {
        l.k(i10, length());
        return this.array[this.f23445b + i10];
    }

    public int hashCode() {
        int i10 = 1;
        for (int i11 = this.f23445b; i11 < this.end; i11++) {
            i10 = (i10 * 31) + Ints.i(this.array[i11]);
        }
        return i10;
    }

    public int indexOf(int i10) {
        for (int i11 = this.f23445b; i11 < this.end; i11++) {
            if (this.array[i11] == i10) {
                return i11 - this.f23445b;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.end == this.f23445b;
    }

    public int lastIndexOf(int i10) {
        int i11;
        int i12 = this.end;
        do {
            i12--;
            i11 = this.f23445b;
            if (i12 < i11) {
                return -1;
            }
        } while (this.array[i12] != i10);
        return i12 - i11;
    }

    public int length() {
        return this.end - this.f23445b;
    }

    public Object readResolve() {
        return isEmpty() ? f23444c : this;
    }

    public ImmutableIntArray subArray(int i10, int i11) {
        l.q(i10, i11, length());
        if (i10 == i11) {
            return f23444c;
        }
        int[] iArr = this.array;
        int i12 = this.f23445b;
        return new ImmutableIntArray(iArr, i10 + i12, i12 + i11);
    }

    public int[] toArray() {
        return Arrays.copyOfRange(this.array, this.f23445b, this.end);
    }

    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder(length() * 5);
        sb2.append('[');
        sb2.append(this.array[this.f23445b]);
        int i10 = this.f23445b;
        while (true) {
            i10++;
            if (i10 >= this.end) {
                sb2.append(']');
                return sb2.toString();
            }
            sb2.append(", ");
            sb2.append(this.array[i10]);
        }
    }

    public ImmutableIntArray trimmed() {
        return d() ? new ImmutableIntArray(toArray()) : this;
    }

    public Object writeReplace() {
        return trimmed();
    }
}
