package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ParametricNullness;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@ElementTypesAreNonnullByDefault
public class C3028lv<K, V> extends AbstractMap<K, V> implements Serializable {
    public static byte[] A09;
    public static String[] A0A = {"wSivjbfpZ5vyyNQvPGO2", "feAeK30V825ODXthr2nXiZ2IyDp7foTM", "DkUlp4YVWOkxqgis7dBpeo68CZmBo3n0", "aa93WRLI7l2jdXj6upMcNohuPuXZSHnj", "yd6MpWWB34WJL2xwsTp1Hrf9QPnPIJjU", "QxuCDFa1e2lEwJ6Nl0AGtIVp0Ykbd3", "6Mqvrbexx8eO9W", "SxE34IM9tKvZCcEi8I123n5xI40gl8"};
    public static final Object A0B;

    @CheckForNull
    public transient int[] A00;

    @CheckForNull
    public transient Object[] A01;

    @CheckForNull
    public transient Object[] A02;
    public transient int A03;
    public transient int A04;

    @CheckForNull
    public transient Object A05;

    @CheckForNull
    @LazyInit
    public transient Collection<V> A06;

    @CheckForNull
    @LazyInit
    public transient Set<Map.Entry<K, V>> A07;

    @CheckForNull
    @LazyInit
    public transient Set<K> A08;

    static {
        A0M();
        A0B = new Object();
    }

    public C3028lv() {
        A0l(3);
    }

    public C3028lv(int i10) {
        A0l(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int A00() {
        return (1 << (this.A03 & 31)) - 1;
    }

    private int A01(int i10) {
        return A0T()[i10];
    }

    private int A02(int i10, int i11, int i12, int i13) {
        Object objA07 = AbstractC3031ly.A07(i11);
        int i14 = i11 - 1;
        if (i13 != 0) {
            AbstractC3031ly.A0B(objA07, i12 & i14, i13 + 1);
        }
        Object objA0C = A0C();
        int[] iArrA0T = A0T();
        for (int i15 = 0; i15 <= i10; i15++) {
            int iA05 = AbstractC3031ly.A05(objA0C, i15);
            while (iA05 != 0) {
                int i16 = iA05 - 1;
                int i17 = iArrA0T[i16];
                int iA02 = AbstractC3031ly.A02(i17, i10) | i15;
                int i18 = iA02 & i14;
                int iA052 = AbstractC3031ly.A05(objA07, i18);
                AbstractC3031ly.A0B(objA07, i18, iA05);
                iArrA0T[i16] = AbstractC3031ly.A04(iA02, iA052, i14);
                iA05 = AbstractC3031ly.A03(i17, i10);
            }
        }
        this.A05 = objA07;
        A0O(i14);
        return i14;
    }

    public static /* synthetic */ int A04(C3028lv c3028lv) {
        int i10 = c3028lv.A04;
        c3028lv.A04 = i10 - 1;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int A07(@CheckForNull Object obj) {
        if (A0p()) {
            return -1;
        }
        int iA02 = AbstractC3062mU.A02(obj);
        int iA00 = A00();
        int iA05 = AbstractC3031ly.A05(A0C(), iA02 & iA00);
        if (iA05 == 0) {
            return -1;
        }
        int iA022 = AbstractC3031ly.A02(iA02, iA00);
        do {
            int i10 = iA05 - 1;
            int iA01 = A01(i10);
            if (AbstractC3031ly.A02(iA01, iA00) == iA022 && BX.A01(obj, A0E(i10))) {
                return i10;
            }
            iA05 = AbstractC3031ly.A03(iA01, iA00);
        } while (iA05 != 0);
        return -1;
    }

    private final Set<Map.Entry<K, V>> A08() {
        return new C3024lr(this);
    }

    private final Set<K> A09() {
        return new C3026lt(this);
    }

    private final Collection<V> A0A() {
        return new C3027lu(this);
    }

    public static <K, V> C3028lv<K, V> A0B(int i10) {
        return new C3028lv<>(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object A0C() {
        return Objects.requireNonNull(this.A05);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public K A0E(int i10) {
        return (K) A0V()[i10];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V A0F(int i10) {
        return (V) A0W()[i10];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object A0K(@CheckForNull Object obj) {
        if (A0p()) {
            return A0B;
        }
        int iA00 = A00();
        int iA06 = AbstractC3031ly.A06(obj, null, iA00, A0C(), A0T(), A0V(), null);
        if (iA06 != -1) {
            V vA0F = A0F(iA06);
            A0n(iA06, iA00);
            this.A04--;
            A0j();
            return vA0F;
        }
        Object obj2 = A0B;
        String[] strArr = A0A;
        if (strArr[7].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0A;
        strArr2[0] = "F8ZzCx46VEt3o6V5ZJCH";
        strArr2[1] = "RA5kHayy5QpfLDjl1dNEtk1yryeED7Tz";
        return obj2;
    }

    public static String A0L(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 52);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0M() {
        A09 = new byte[]{-18, 31, 31, 14, 38, 32, -51, 14, 25, 31, 18, 14, 17, 38, -51, 14, 25, 25, 28, 16, 14, 33, 18, 17, -119, -68, -76, -87, -89, -72, -87, -88, 100, -73, -83, -66, -87, 100, -79, -71, -73, -72, 100, -90, -87, 100, -126, -127, 100, 116, -108, -71, -63, -84, -73, -76, -81, 107, -66, -76, -59, -80, -123, 107};
        String[] strArr = A0A;
        if (strArr[0].length() == strArr[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0A;
        strArr2[7] = "IoFO5J0AFYg4y0jUjWJp7QnfwHFEsl";
        strArr2[5] = "MD8kR9gChUuO1ad3jnDINjX3f2IxRH";
    }

    private void A0N(int i10) {
        int iMin;
        int length = A0T().length;
        if (i10 <= length || (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) == length) {
            return;
        }
        A0m(iMin);
    }

    private void A0O(int i10) {
        this.A03 = AbstractC3031ly.A04(this.A03, 32 - Integer.numberOfLeadingZeros(i10), 31);
    }

    private void A0P(int i10, int i11) {
        A0T()[i10] = i11;
    }

    private void A0Q(int i10, K k10) {
        A0V()[i10] = k10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0R(int i10, V v10) {
        A0W()[i10] = v10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] A0T() {
        return (int[]) Objects.requireNonNull(this.A00);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] A0V() {
        return (Object[]) Objects.requireNonNull(this.A01);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] A0W() {
        return (Object[]) Objects.requireNonNull(this.A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i10 = objectInputStream.readInt();
        if (i10 < 0) {
            throw new InvalidObjectException(A0L(50, 14, 23) + i10);
        }
        A0l(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator<Map.Entry<K, V>> itA0d = A0d();
        while (true) {
            boolean zHasNext = itA0d.hasNext();
            String[] strArr = A0A;
            if (strArr[7].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[0] = "lZkXti1hHETGLNP2mJng";
            strArr2[1] = "UqMxjQlbiD6IC1mODYXJWocLTdBCXsJ0";
            if (!zHasNext) {
                return;
            }
            Map.Entry<K, V> next = itA0d.next();
            objectOutputStream.writeObject(next.getKey());
            objectOutputStream.writeObject(next.getValue());
        }
    }

    public int A0Z() {
        AbstractC2871jA.A0F(A0p(), A0L(0, 24, 121));
        int i10 = this.A03;
        int iA01 = AbstractC3031ly.A01(i10);
        this.A05 = AbstractC3031ly.A07(iA01);
        A0O(iA01 - 1);
        this.A00 = new int[i10];
        this.A01 = new Object[i10];
        this.A02 = new Object[i10];
        return i10;
    }

    public int A0a() {
        return isEmpty() ? -1 : 0;
    }

    public int A0b(int i10) {
        if (i10 + 1 < this.A04) {
            return i10 + 1;
        }
        return -1;
    }

    public int A0c(int i10, int i11) {
        return i10 - 1;
    }

    public final Iterator<Map.Entry<K, V>> A0d() {
        Map<K, V> mapA0h = A0h();
        return mapA0h != null ? mapA0h.entrySet().iterator() : new B7(this);
    }

    public final Iterator<K> A0e() {
        Map<K, V> mapA0h = A0h();
        if (mapA0h == null) {
            return new B9(this);
        }
        Iterator<K> it = mapA0h.keySet().iterator();
        String[] strArr = A0A;
        if (strArr[0].length() == strArr[1].length()) {
            throw new RuntimeException();
        }
        A0A[3] = "GopoyTSNvP2uUGwCw8coQru7y5edTQ0w";
        return it;
    }

    public final Iterator<V> A0f() {
        Map<K, V> mapA0h = A0h();
        return mapA0h != null ? mapA0h.values().iterator() : new B6(this);
    }

    public Map<K, V> A0g() {
        Map<K, V> mapA0i = A0i(A00() + 1);
        int iA0a = A0a();
        while (iA0a >= 0) {
            mapA0i.put(A0E(iA0a), A0F(iA0a));
            iA0a = A0b(iA0a);
        }
        this.A05 = mapA0i;
        this.A00 = null;
        this.A01 = null;
        this.A02 = null;
        A0j();
        return mapA0i;
    }

    @CheckForNull
    public final Map<K, V> A0h() {
        if (this.A05 instanceof Map) {
            return (Map) this.A05;
        }
        return null;
    }

    public Map<K, V> A0i(int i10) {
        return new LinkedHashMap(i10, 1.0f);
    }

    public final void A0j() {
        this.A03 += 32;
    }

    public void A0k(int i10) {
    }

    public void A0l(int i10) {
        AbstractC2871jA.A0E(i10 >= 0, A0L(24, 26, 16));
        this.A03 = AD.A02(i10, 1, 1073741823);
    }

    public void A0m(int i10) {
        this.A00 = Arrays.copyOf(A0T(), i10);
        this.A01 = Arrays.copyOf(A0V(), i10);
        this.A02 = Arrays.copyOf(A0W(), i10);
    }

    public void A0n(int i10, int i11) {
        int i12;
        int i13;
        Object objA0C = A0C();
        int[] iArrA0T = A0T();
        Object[] objArrA0V = A0V();
        Object[] objArrA0W = A0W();
        int size = size() - 1;
        if (i10 >= size) {
            objArrA0V[i10] = null;
            objArrA0W[i10] = null;
            iArrA0T[i10] = 0;
            return;
        }
        Object obj = objArrA0V[size];
        objArrA0V[i10] = obj;
        objArrA0W[i10] = objArrA0W[size];
        objArrA0V[size] = null;
        objArrA0W[size] = null;
        iArrA0T[i10] = iArrA0T[size];
        String[] strArr = A0A;
        if (strArr[0].length() == strArr[1].length()) {
            throw new RuntimeException();
        }
        A0A[4] = "JpifJf2kbZdDbZEcWvjQntDjOJA2HcxY";
        iArrA0T[size] = 0;
        int iA02 = AbstractC3062mU.A02(obj) & i11;
        int iA05 = AbstractC3031ly.A05(objA0C, iA02);
        int i14 = size + 1;
        if (iA05 == i14) {
            AbstractC3031ly.A0B(objA0C, iA02, i10 + 1);
            return;
        }
        do {
            i12 = iA05 - 1;
            i13 = iArrA0T[i12];
            iA05 = AbstractC3031ly.A03(i13, i11);
        } while (iA05 != i14);
        int iA04 = AbstractC3031ly.A04(i13, i10 + 1, i11);
        if (A0A[4].charAt(27) == 'c') {
            throw new RuntimeException();
        }
        A0A[2] = "ewyZpZbIi25h1LX0jZUdN0qrqZxWH2dV";
        iArrA0T[i12] = iA04;
    }

    public void A0o(@ParametricNullness int i10, @ParametricNullness K k10, V v10, int i11, int i12) {
        A0P(i10, AbstractC3031ly.A04(i11, 0, i12));
        A0Q(i10, k10);
        A0R(i10, v10);
    }

    public final boolean A0p() {
        return this.A05 == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (A0p()) {
            return;
        }
        A0j();
        Map<K, V> mapA0h = A0h();
        if (mapA0h != null) {
            this.A03 = AD.A02(size(), 3, 1073741823);
            mapA0h.clear();
            this.A05 = null;
            this.A04 = 0;
            return;
        }
        Arrays.fill(A0V(), 0, this.A04, (Object) null);
        Arrays.fill(A0W(), 0, this.A04, (Object) null);
        AbstractC3031ly.A0A(A0C());
        if (A0A[4].charAt(27) == 'c') {
            throw new RuntimeException();
        }
        A0A[3] = "HEGfGjMW8cX3B6hZei5dHcacBQ1QHslD";
        Arrays.fill(A0T(), 0, this.A04, 0);
        this.A04 = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(@CheckForNull Object obj) {
        Map<K, V> mapA0h = A0h();
        return mapA0h != null ? mapA0h.containsKey(obj) : A07(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(@CheckForNull Object obj) {
        Map<K, V> mapA0h = A0h();
        if (mapA0h != null) {
            return mapA0h.containsValue(obj);
        }
        for (int i10 = 0; i10 < this.A04; i10++) {
            if (BX.A01(obj, A0F(i10))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.A07 != null) {
            return this.A07;
        }
        Set<Map.Entry<K, V>> setA08 = A08();
        this.A07 = setA08;
        return setA08;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public final V get(@CheckForNull Object obj) {
        Map<K, V> mapA0h = A0h();
        if (mapA0h != null) {
            return mapA0h.get(obj);
        }
        int iA07 = A07(obj);
        if (iA07 == -1) {
            return null;
        }
        A0k(iA07);
        return A0F(iA07);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        if (this.A08 != null) {
            return this.A08;
        }
        Set<K> setA09 = A09();
        this.A08 = setA09;
        return setA09;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public final V put(@ParametricNullness K k10, @ParametricNullness V v10) {
        int i10;
        int i11;
        if (A0p()) {
            A0Z();
        }
        Map<K, V> mapA0h = A0h();
        if (mapA0h != null) {
            return mapA0h.put(k10, v10);
        }
        int[] iArrA0T = A0T();
        Object[] objArrA0V = A0V();
        Object[] objArrA0W = A0W();
        int i12 = this.A04;
        int i13 = i12 + 1;
        int iA02 = AbstractC3062mU.A02(k10);
        int iA00 = A00();
        int i14 = iA02 & iA00;
        int iA05 = AbstractC3031ly.A05(A0C(), i14);
        if (iA05 != 0) {
            int iA022 = AbstractC3031ly.A02(iA02, iA00);
            int i15 = 0;
            do {
                i10 = iA05 - 1;
                i11 = iArrA0T[i10];
                if (AbstractC3031ly.A02(i11, iA00) == iA022 && BX.A01(k10, objArrA0V[i10])) {
                    V v11 = (V) objArrA0W[i10];
                    objArrA0W[i10] = v10;
                    A0k(i10);
                    return v11;
                }
                iA05 = AbstractC3031ly.A03(i11, iA00);
                i15++;
            } while (iA05 != 0);
            if (i15 >= 9) {
                return A0g().put(k10, v10);
            }
            if (i13 > iA00) {
                iA00 = A02(iA00, AbstractC3031ly.A00(iA00), iA02, i12);
            } else {
                iArrA0T[i10] = AbstractC3031ly.A04(i11, i12 + 1, iA00);
            }
        } else {
            if (i13 <= iA00) {
                AbstractC3031ly.A0B(A0C(), i14, i12 + 1);
                String[] strArr = A0A;
                if (strArr[0].length() != strArr[1].length()) {
                    A0A[2] = "2ZAiwLyczl80nzcVv99ytgXWx8HMLtqx";
                }
                throw new RuntimeException();
            }
            iA00 = A02(iA00, AbstractC3031ly.A00(iA00), iA02, i12);
        }
        A0N(i13);
        A0o(i12, k10, v10, iA02, iA00);
        this.A04 = i13;
        A0j();
        if (A0A[6].length() == 14) {
            String[] strArr2 = A0A;
            strArr2[0] = "efczO3YJEcN3CoMhojB5";
            strArr2[1] = "vhmQa5OnZZeWmVDY77t31AOxDsfMGclq";
            return null;
        }
        throw new RuntimeException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public final V remove(@CheckForNull Object obj) {
        Map<K, V> mapA0h = A0h();
        if (mapA0h != null) {
            return mapA0h.remove(obj);
        }
        V v10 = (V) A0K(obj);
        if (v10 == A0B) {
            return null;
        }
        return v10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map<K, V> mapA0h = A0h();
        return mapA0h != null ? mapA0h.size() : this.A04;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        if (this.A06 != null) {
            return this.A06;
        }
        Collection<V> collectionA0A = A0A();
        this.A06 = collectionA0A;
        return collectionA0A;
    }
}
