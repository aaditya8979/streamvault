package cn;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.SortedSet;
import java.util.TreeSet;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: _ArraysJvm.kt */
/* JADX INFO: loaded from: classes10.dex */
public class p extends o {

    /* JADX INFO: compiled from: _ArraysJvm.kt */
    public static final class a extends d<Byte> implements RandomAccess {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ byte[] f6756b;

        public a(byte[] bArr) {
            this.f6756b = bArr;
        }

        @Override // cn.b, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Byte) {
                return f(((Number) obj).byteValue());
            }
            return false;
        }

        public boolean f(byte b10) {
            return r.L(this.f6756b, b10);
        }

        @Override // cn.d, java.util.List
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Byte get(int i10) {
            return Byte.valueOf(this.f6756b[i10]);
        }

        @Override // cn.d, cn.b
        public int getSize() {
            return this.f6756b.length;
        }

        public int h(byte b10) {
            return r.e0(this.f6756b, b10);
        }

        @Override // cn.d, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Byte) {
                return h(((Number) obj).byteValue());
            }
            return -1;
        }

        @Override // cn.b, java.util.Collection
        public boolean isEmpty() {
            return this.f6756b.length == 0;
        }

        public int j(byte b10) {
            return r.q0(this.f6756b, b10);
        }

        @Override // cn.d, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Byte) {
                return j(((Number) obj).byteValue());
            }
            return -1;
        }
    }

    @NotNull
    public static final int[] A(@NotNull int[] iArr, int i10) {
        tn.p.k(iArr, "<this>");
        int length = iArr.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
        iArrCopyOf[length] = i10;
        tn.p.h(iArrCopyOf);
        return iArrCopyOf;
    }

    @NotNull
    public static final int[] B(@NotNull int[] iArr, @NotNull int[] iArr2) {
        tn.p.k(iArr, "<this>");
        tn.p.k(iArr2, "elements");
        int length = iArr.length;
        int length2 = iArr2.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + length2);
        System.arraycopy(iArr2, 0, iArrCopyOf, length, length2);
        tn.p.h(iArrCopyOf);
        return iArrCopyOf;
    }

    @NotNull
    public static final <T> T[] C(@NotNull T[] tArr, T t10) {
        tn.p.k(tArr, "<this>");
        int length = tArr.length;
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, length + 1);
        tArr2[length] = t10;
        tn.p.h(tArr2);
        return tArr2;
    }

    @NotNull
    public static final <T> T[] D(@NotNull T[] tArr, @NotNull Collection<? extends T> collection) {
        tn.p.k(tArr, "<this>");
        tn.p.k(collection, "elements");
        int length = tArr.length;
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, collection.size() + length);
        Iterator<? extends T> it = collection.iterator();
        while (it.hasNext()) {
            tArr2[length] = it.next();
            length++;
        }
        tn.p.h(tArr2);
        return tArr2;
    }

    @NotNull
    public static final <T> T[] E(@NotNull T[] tArr, @NotNull T[] tArr2) {
        tn.p.k(tArr, "<this>");
        tn.p.k(tArr2, "elements");
        int length = tArr.length;
        int length2 = tArr2.length;
        T[] tArr3 = (T[]) Arrays.copyOf(tArr, length + length2);
        System.arraycopy(tArr2, 0, tArr3, length, length2);
        tn.p.h(tArr3);
        return tArr3;
    }

    public static final <T> void F(@NotNull T[] tArr) {
        tn.p.k(tArr, "<this>");
        if (tArr.length > 1) {
            Arrays.sort(tArr);
        }
    }

    public static final <T> void G(@NotNull T[] tArr, @NotNull Comparator<? super T> comparator) {
        tn.p.k(tArr, "<this>");
        tn.p.k(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }

    public static final <T> void H(@NotNull T[] tArr, @NotNull Comparator<? super T> comparator, int i10, int i11) {
        tn.p.k(tArr, "<this>");
        tn.p.k(comparator, "comparator");
        Arrays.sort(tArr, i10, i11, comparator);
    }

    @NotNull
    public static final <T extends Comparable<? super T>> SortedSet<T> I(@NotNull T[] tArr) {
        tn.p.k(tArr, "<this>");
        return (SortedSet) r.C0(tArr, new TreeSet());
    }

    @NotNull
    public static final List<Byte> e(@NotNull byte[] bArr) {
        tn.p.k(bArr, "<this>");
        return new a(bArr);
    }

    @NotNull
    public static final <T> List<T> f(@NotNull T[] tArr) {
        tn.p.k(tArr, "<this>");
        List<T> listA = s.a(tArr);
        tn.p.j(listA, "asList(...)");
        return listA;
    }

    @NotNull
    public static final byte[] g(@NotNull byte[] bArr, @NotNull byte[] bArr2, int i10, int i11, int i12) {
        tn.p.k(bArr, "<this>");
        tn.p.k(bArr2, "destination");
        System.arraycopy(bArr, i11, bArr2, i10, i12 - i11);
        return bArr2;
    }

    @NotNull
    public static final char[] h(@NotNull char[] cArr, @NotNull char[] cArr2, int i10, int i11, int i12) {
        tn.p.k(cArr, "<this>");
        tn.p.k(cArr2, "destination");
        System.arraycopy(cArr, i11, cArr2, i10, i12 - i11);
        return cArr2;
    }

    @NotNull
    public static final float[] i(@NotNull float[] fArr, @NotNull float[] fArr2, int i10, int i11, int i12) {
        tn.p.k(fArr, "<this>");
        tn.p.k(fArr2, "destination");
        System.arraycopy(fArr, i11, fArr2, i10, i12 - i11);
        return fArr2;
    }

    @NotNull
    public static final int[] j(@NotNull int[] iArr, @NotNull int[] iArr2, int i10, int i11, int i12) {
        tn.p.k(iArr, "<this>");
        tn.p.k(iArr2, "destination");
        System.arraycopy(iArr, i11, iArr2, i10, i12 - i11);
        return iArr2;
    }

    @NotNull
    public static final long[] k(@NotNull long[] jArr, @NotNull long[] jArr2, int i10, int i11, int i12) {
        tn.p.k(jArr, "<this>");
        tn.p.k(jArr2, "destination");
        System.arraycopy(jArr, i11, jArr2, i10, i12 - i11);
        return jArr2;
    }

    @NotNull
    public static final <T> T[] l(@NotNull T[] tArr, @NotNull T[] tArr2, int i10, int i11, int i12) {
        tn.p.k(tArr, "<this>");
        tn.p.k(tArr2, "destination");
        System.arraycopy(tArr, i11, tArr2, i10, i12 - i11);
        return tArr2;
    }

    public static /* synthetic */ byte[] m(byte[] bArr, byte[] bArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = bArr.length;
        }
        return g(bArr, bArr2, i10, i11, i12);
    }

    public static /* synthetic */ float[] n(float[] fArr, float[] fArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = fArr.length;
        }
        return i(fArr, fArr2, i10, i11, i12);
    }

    public static /* synthetic */ int[] o(int[] iArr, int[] iArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = iArr.length;
        }
        return j(iArr, iArr2, i10, i11, i12);
    }

    public static /* synthetic */ Object[] p(Object[] objArr, Object[] objArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = objArr.length;
        }
        return l(objArr, objArr2, i10, i11, i12);
    }

    @NotNull
    public static final byte[] q(@NotNull byte[] bArr, int i10, int i11) {
        tn.p.k(bArr, "<this>");
        n.b(i11, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i10, i11);
        tn.p.j(bArrCopyOfRange, "copyOfRange(...)");
        return bArrCopyOfRange;
    }

    @NotNull
    public static final float[] r(@NotNull float[] fArr, int i10, int i11) {
        tn.p.k(fArr, "<this>");
        n.b(i11, fArr.length);
        float[] fArrCopyOfRange = Arrays.copyOfRange(fArr, i10, i11);
        tn.p.j(fArrCopyOfRange, "copyOfRange(...)");
        return fArrCopyOfRange;
    }

    @NotNull
    public static final <T> T[] s(@NotNull T[] tArr, int i10, int i11) {
        tn.p.k(tArr, "<this>");
        n.b(i11, tArr.length);
        T[] tArr2 = (T[]) Arrays.copyOfRange(tArr, i10, i11);
        tn.p.j(tArr2, "copyOfRange(...)");
        return tArr2;
    }

    public static final void t(@NotNull float[] fArr, float f10, int i10, int i11) {
        tn.p.k(fArr, "<this>");
        Arrays.fill(fArr, i10, i11, f10);
    }

    public static final void u(@NotNull int[] iArr, int i10, int i11, int i12) {
        tn.p.k(iArr, "<this>");
        Arrays.fill(iArr, i11, i12, i10);
    }

    public static final <T> void v(@NotNull T[] tArr, T t10, int i10, int i11) {
        tn.p.k(tArr, "<this>");
        Arrays.fill(tArr, i10, i11, t10);
    }

    public static /* synthetic */ void w(float[] fArr, float f10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = fArr.length;
        }
        t(fArr, f10, i10, i11);
    }

    public static /* synthetic */ void x(int[] iArr, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = iArr.length;
        }
        u(iArr, i10, i11, i12);
    }

    public static /* synthetic */ void y(Object[] objArr, Object obj, int i10, int i11, int i12, Object obj2) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = objArr.length;
        }
        v(objArr, obj, i10, i11);
    }

    @NotNull
    public static final byte[] z(@NotNull byte[] bArr, @NotNull byte[] bArr2) {
        tn.p.k(bArr, "<this>");
        tn.p.k(bArr2, "elements");
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(bArr2, 0, bArrCopyOf, length, length2);
        tn.p.h(bArrCopyOf);
        return bArrCopyOf;
    }
}
