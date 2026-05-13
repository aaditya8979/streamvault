package kotlin.collections.builders;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.G5;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.h;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;
import un.e;
import zn.n;

/* JADX INFO: compiled from: MapBuilder.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class MapBuilder<K, V> implements Map<K, V>, Serializable, un.e {

    @NotNull
    public static final a Companion = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final MapBuilder f73214b;

    @Nullable
    private kotlin.collections.builders.a<K, V> entriesView;

    @NotNull
    private int[] hashArray;
    private int hashShift;
    private boolean isReadOnly;

    @NotNull
    private K[] keysArray;

    @Nullable
    private kotlin.collections.builders.b<K> keysView;
    private int length;
    private int maxProbeDistance;
    private int modCount;

    @NotNull
    private int[] presenceArray;
    private int size;

    @Nullable
    private V[] valuesArray;

    @Nullable
    private kotlin.collections.builders.c<V> valuesView;

    /* JADX INFO: compiled from: MapBuilder.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final int c(int i10) {
            return Integer.highestOneBit(n.e(i10, 1) * 3);
        }

        public final int d(int i10) {
            return Integer.numberOfLeadingZeros(i10) + 1;
        }

        @NotNull
        public final MapBuilder e() {
            return MapBuilder.f73214b;
        }
    }

    /* JADX INFO: compiled from: MapBuilder.kt */
    public static final class b<K, V> extends d<K, V> implements Iterator<Map.Entry<K, V>>, un.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull MapBuilder<K, V> mapBuilder) {
            super(mapBuilder);
            p.k(mapBuilder, "map");
        }

        @Override // java.util.Iterator
        @NotNull
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public c<K, V> next() {
            a();
            if (b() >= ((MapBuilder) d()).length) {
                throw new NoSuchElementException();
            }
            int iB = b();
            g(iB + 1);
            h(iB);
            c<K, V> cVar = new c<>(d(), c());
            f();
            return cVar;
        }

        public final void k(@NotNull StringBuilder sb2) {
            p.k(sb2, "sb");
            if (b() >= ((MapBuilder) d()).length) {
                throw new NoSuchElementException();
            }
            int iB = b();
            g(iB + 1);
            h(iB);
            Object obj = ((MapBuilder) d()).keysArray[c()];
            if (obj == d()) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj);
            }
            sb2.append(G5.T);
            Object[] objArr = ((MapBuilder) d()).valuesArray;
            p.h(objArr);
            Object obj2 = objArr[c()];
            if (obj2 == d()) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj2);
            }
            f();
        }

        public final int l() {
            if (b() >= ((MapBuilder) d()).length) {
                throw new NoSuchElementException();
            }
            int iB = b();
            g(iB + 1);
            h(iB);
            Object obj = ((MapBuilder) d()).keysArray[c()];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = ((MapBuilder) d()).valuesArray;
            p.h(objArr);
            Object obj2 = objArr[c()];
            int iHashCode2 = iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
            f();
            return iHashCode2;
        }
    }

    /* JADX INFO: compiled from: MapBuilder.kt */
    public static final class c<K, V> implements Map.Entry<K, V>, e.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final MapBuilder<K, V> f73215b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f73216c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f73217d;

        public c(@NotNull MapBuilder<K, V> mapBuilder, int i10) {
            p.k(mapBuilder, "map");
            this.f73215b = mapBuilder;
            this.f73216c = i10;
            this.f73217d = ((MapBuilder) mapBuilder).modCount;
        }

        public final void a() {
            if (((MapBuilder) this.f73215b).modCount != this.f73217d) {
                throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
            }
        }

        @Override // java.util.Map.Entry
        public boolean equals(@Nullable Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (p.f(entry.getKey(), getKey()) && p.f(entry.getValue(), getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            a();
            return (K) ((MapBuilder) this.f73215b).keysArray[this.f73216c];
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            a();
            Object[] objArr = ((MapBuilder) this.f73215b).valuesArray;
            p.h(objArr);
            return (V) objArr[this.f73216c];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K key = getKey();
            int iHashCode = key != null ? key.hashCode() : 0;
            V value = getValue();
            return iHashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            a();
            this.f73215b.checkIsMutable$kotlin_stdlib();
            Object[] objArrD = this.f73215b.d();
            int i10 = this.f73216c;
            V v11 = (V) objArrD[i10];
            objArrD[i10] = v10;
            return v11;
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getKey());
            sb2.append(G5.T);
            sb2.append(getValue());
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: MapBuilder.kt */
    public static class d<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final MapBuilder<K, V> f73218b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f73219c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f73220d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f73221e;

        public d(@NotNull MapBuilder<K, V> mapBuilder) {
            p.k(mapBuilder, "map");
            this.f73218b = mapBuilder;
            this.f73220d = -1;
            this.f73221e = ((MapBuilder) mapBuilder).modCount;
            f();
        }

        public final void a() {
            if (((MapBuilder) this.f73218b).modCount != this.f73221e) {
                throw new ConcurrentModificationException();
            }
        }

        public final int b() {
            return this.f73219c;
        }

        public final int c() {
            return this.f73220d;
        }

        @NotNull
        public final MapBuilder<K, V> d() {
            return this.f73218b;
        }

        public final void f() {
            while (this.f73219c < ((MapBuilder) this.f73218b).length) {
                int[] iArr = ((MapBuilder) this.f73218b).presenceArray;
                int i10 = this.f73219c;
                if (iArr[i10] >= 0) {
                    return;
                } else {
                    this.f73219c = i10 + 1;
                }
            }
        }

        public final void g(int i10) {
            this.f73219c = i10;
        }

        public final void h(int i10) {
            this.f73220d = i10;
        }

        public final boolean hasNext() {
            return this.f73219c < ((MapBuilder) this.f73218b).length;
        }

        public final void remove() {
            a();
            if (!(this.f73220d != -1)) {
                throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
            }
            this.f73218b.checkIsMutable$kotlin_stdlib();
            this.f73218b.t(this.f73220d);
            this.f73220d = -1;
            this.f73221e = ((MapBuilder) this.f73218b).modCount;
        }
    }

    /* JADX INFO: compiled from: MapBuilder.kt */
    public static final class e<K, V> extends d<K, V> implements Iterator<K>, un.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(@NotNull MapBuilder<K, V> mapBuilder) {
            super(mapBuilder);
            p.k(mapBuilder, "map");
        }

        @Override // java.util.Iterator
        public K next() {
            a();
            if (b() >= ((MapBuilder) d()).length) {
                throw new NoSuchElementException();
            }
            int iB = b();
            g(iB + 1);
            h(iB);
            K k10 = (K) ((MapBuilder) d()).keysArray[c()];
            f();
            return k10;
        }
    }

    /* JADX INFO: compiled from: MapBuilder.kt */
    public static final class f<K, V> extends d<K, V> implements Iterator<V>, un.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(@NotNull MapBuilder<K, V> mapBuilder) {
            super(mapBuilder);
            p.k(mapBuilder, "map");
        }

        @Override // java.util.Iterator
        public V next() {
            a();
            if (b() >= ((MapBuilder) d()).length) {
                throw new NoSuchElementException();
            }
            int iB = b();
            g(iB + 1);
            h(iB);
            Object[] objArr = ((MapBuilder) d()).valuesArray;
            p.h(objArr);
            V v10 = (V) objArr[c()];
            f();
            return v10;
        }
    }

    static {
        MapBuilder mapBuilder = new MapBuilder(0);
        mapBuilder.isReadOnly = true;
        f73214b = mapBuilder;
    }

    public MapBuilder() {
        this(8);
    }

    public MapBuilder(int i10) {
        this(dn.b.d(i10), null, new int[i10], new int[Companion.c(i10)], 2, 0);
    }

    public MapBuilder(K[] kArr, V[] vArr, int[] iArr, int[] iArr2, int i10, int i11) {
        this.keysArray = kArr;
        this.valuesArray = vArr;
        this.presenceArray = iArr;
        this.hashArray = iArr2;
        this.maxProbeDistance = i10;
        this.length = i11;
        this.hashShift = Companion.d(m());
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.isReadOnly) {
            return new SerializedMap(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    public final int addKey$kotlin_stdlib(K k10) {
        checkIsMutable$kotlin_stdlib();
        while (true) {
            int iN = n(k10);
            int iJ = n.j(this.maxProbeDistance * 2, m() / 2);
            int i10 = 0;
            while (true) {
                int i11 = this.hashArray[iN];
                if (i11 <= 0) {
                    if (this.length < getCapacity$kotlin_stdlib()) {
                        int i12 = this.length;
                        int i13 = i12 + 1;
                        this.length = i13;
                        this.keysArray[i12] = k10;
                        this.presenceArray[i12] = iN;
                        this.hashArray[iN] = i13;
                        this.size = size() + 1;
                        r();
                        if (i10 > this.maxProbeDistance) {
                            this.maxProbeDistance = i10;
                        }
                        return i12;
                    }
                    j(1);
                } else {
                    if (p.f(this.keysArray[i11 - 1], k10)) {
                        return -i11;
                    }
                    i10++;
                    if (i10 > iJ) {
                        s(m() * 2);
                        break;
                    }
                    iN = iN == 0 ? m() - 1 : iN - 1;
                }
            }
        }
    }

    @NotNull
    public final Map<K, V> build() {
        checkIsMutable$kotlin_stdlib();
        this.isReadOnly = true;
        if (size() > 0) {
            return this;
        }
        MapBuilder mapBuilder = f73214b;
        p.i(mapBuilder, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return mapBuilder;
    }

    public final void checkIsMutable$kotlin_stdlib() {
        if (this.isReadOnly) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public void clear() {
        checkIsMutable$kotlin_stdlib();
        int i10 = this.length - 1;
        if (i10 >= 0) {
            int i11 = 0;
            while (true) {
                int[] iArr = this.presenceArray;
                int i12 = iArr[i11];
                if (i12 >= 0) {
                    this.hashArray[i12] = 0;
                    iArr[i11] = -1;
                }
                if (i11 == i10) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        dn.b.g(this.keysArray, 0, this.length);
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            dn.b.g(vArr, 0, this.length);
        }
        this.size = 0;
        this.length = 0;
        r();
    }

    public final boolean containsAllEntries$kotlin_stdlib(@NotNull Collection<?> collection) {
        p.k(collection, InneractiveMediationDefs.GENDER_MALE);
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!containsEntry$kotlin_stdlib((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean containsEntry$kotlin_stdlib(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        p.k(entry, "entry");
        int iK = k(entry.getKey());
        if (iK < 0) {
            return false;
        }
        V[] vArr = this.valuesArray;
        p.h(vArr);
        return p.f(vArr[iK], entry.getValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return k(obj) >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return l(obj) >= 0;
    }

    public final V[] d() {
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            return vArr;
        }
        V[] vArr2 = (V[]) dn.b.d(getCapacity$kotlin_stdlib());
        this.valuesArray = vArr2;
        return vArr2;
    }

    @NotNull
    public final b<K, V> entriesIterator$kotlin_stdlib() {
        return new b<>(this);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public boolean equals(@Nullable Object obj) {
        return obj == this || ((obj instanceof Map) && g((Map) obj));
    }

    public final void f(boolean z10) {
        int i10;
        V[] vArr = this.valuesArray;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i10 = this.length;
            if (i11 >= i10) {
                break;
            }
            int[] iArr = this.presenceArray;
            int i13 = iArr[i11];
            if (i13 >= 0) {
                K[] kArr = this.keysArray;
                kArr[i12] = kArr[i11];
                if (vArr != null) {
                    vArr[i12] = vArr[i11];
                }
                if (z10) {
                    iArr[i12] = i13;
                    this.hashArray[i13] = i12 + 1;
                }
                i12++;
            }
            i11++;
        }
        dn.b.g(this.keysArray, i12, i10);
        if (vArr != null) {
            dn.b.g(vArr, i12, this.length);
        }
        this.length = i12;
    }

    public final boolean g(Map<?, ?> map) {
        return size() == map.size() && containsAllEntries$kotlin_stdlib(map.entrySet());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    @Nullable
    public V get(Object obj) {
        int iK = k(obj);
        if (iK < 0) {
            return null;
        }
        V[] vArr = this.valuesArray;
        p.h(vArr);
        return vArr[iK];
    }

    public final int getCapacity$kotlin_stdlib() {
        return this.keysArray.length;
    }

    @NotNull
    public Set<Map.Entry<K, V>> getEntries() {
        kotlin.collections.builders.a<K, V> aVar = this.entriesView;
        if (aVar != null) {
            return aVar;
        }
        kotlin.collections.builders.a<K, V> aVar2 = new kotlin.collections.builders.a<>(this);
        this.entriesView = aVar2;
        return aVar2;
    }

    @NotNull
    public Set<K> getKeys() {
        kotlin.collections.builders.b<K> bVar = this.keysView;
        if (bVar != null) {
            return bVar;
        }
        kotlin.collections.builders.b<K> bVar2 = new kotlin.collections.builders.b<>(this);
        this.keysView = bVar2;
        return bVar2;
    }

    public int getSize() {
        return this.size;
    }

    @NotNull
    public Collection<V> getValues() {
        kotlin.collections.builders.c<V> cVar = this.valuesView;
        if (cVar != null) {
            return cVar;
        }
        kotlin.collections.builders.c<V> cVar2 = new kotlin.collections.builders.c<>(this);
        this.valuesView = cVar2;
        return cVar2;
    }

    public final void h(int i10) {
        if (i10 < 0) {
            throw new OutOfMemoryError();
        }
        if (i10 > getCapacity$kotlin_stdlib()) {
            int iE = cn.d.Companion.e(getCapacity$kotlin_stdlib(), i10);
            this.keysArray = (K[]) dn.b.e(this.keysArray, iE);
            V[] vArr = this.valuesArray;
            this.valuesArray = vArr != null ? (V[]) dn.b.e(vArr, iE) : null;
            int[] iArrCopyOf = Arrays.copyOf(this.presenceArray, iE);
            p.j(iArrCopyOf, "copyOf(...)");
            this.presenceArray = iArrCopyOf;
            int iC = Companion.c(iE);
            if (iC > m()) {
                s(iC);
            }
        }
    }

    @Override // java.util.Map
    public int hashCode() {
        b<K, V> bVarEntriesIterator$kotlin_stdlib = entriesIterator$kotlin_stdlib();
        int iL = 0;
        while (bVarEntriesIterator$kotlin_stdlib.hasNext()) {
            iL += bVarEntriesIterator$kotlin_stdlib.l();
        }
        return iL;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    public final boolean isReadOnly$kotlin_stdlib() {
        return this.isReadOnly;
    }

    public final void j(int i10) {
        if (v(i10)) {
            f(true);
        } else {
            h(this.length + i10);
        }
    }

    public final int k(K k10) {
        int iN = n(k10);
        int i10 = this.maxProbeDistance;
        while (true) {
            int i11 = this.hashArray[iN];
            if (i11 == 0) {
                return -1;
            }
            if (i11 > 0) {
                int i12 = i11 - 1;
                if (p.f(this.keysArray[i12], k10)) {
                    return i12;
                }
            }
            i10--;
            if (i10 < 0) {
                return -1;
            }
            iN = iN == 0 ? m() - 1 : iN - 1;
        }
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return getKeys();
    }

    @NotNull
    public final e<K, V> keysIterator$kotlin_stdlib() {
        return new e<>(this);
    }

    public final int l(V v10) {
        int i10 = this.length;
        while (true) {
            i10--;
            if (i10 < 0) {
                return -1;
            }
            if (this.presenceArray[i10] >= 0) {
                V[] vArr = this.valuesArray;
                p.h(vArr);
                if (p.f(vArr[i10], v10)) {
                    return i10;
                }
            }
        }
    }

    public final int m() {
        return this.hashArray.length;
    }

    public final int n(K k10) {
        return ((k10 != null ? k10.hashCode() : 0) * (-1640531527)) >>> this.hashShift;
    }

    public final boolean o(Collection<? extends Map.Entry<? extends K, ? extends V>> collection) {
        boolean z10 = false;
        if (collection.isEmpty()) {
            return false;
        }
        j(collection.size());
        Iterator<? extends Map.Entry<? extends K, ? extends V>> it = collection.iterator();
        while (it.hasNext()) {
            if (p(it.next())) {
                z10 = true;
            }
        }
        return z10;
    }

    public final boolean p(Map.Entry<? extends K, ? extends V> entry) {
        int iAddKey$kotlin_stdlib = addKey$kotlin_stdlib(entry.getKey());
        V[] vArrD = d();
        if (iAddKey$kotlin_stdlib >= 0) {
            vArrD[iAddKey$kotlin_stdlib] = entry.getValue();
            return true;
        }
        int i10 = (-iAddKey$kotlin_stdlib) - 1;
        if (p.f(entry.getValue(), vArrD[i10])) {
            return false;
        }
        vArrD[i10] = entry.getValue();
        return true;
    }

    @Override // java.util.Map
    @Nullable
    public V put(K k10, V v10) {
        checkIsMutable$kotlin_stdlib();
        int iAddKey$kotlin_stdlib = addKey$kotlin_stdlib(k10);
        V[] vArrD = d();
        if (iAddKey$kotlin_stdlib >= 0) {
            vArrD[iAddKey$kotlin_stdlib] = v10;
            return null;
        }
        int i10 = (-iAddKey$kotlin_stdlib) - 1;
        V v11 = vArrD[i10];
        vArrD[i10] = v10;
        return v11;
    }

    @Override // java.util.Map
    public void putAll(@NotNull Map<? extends K, ? extends V> map) {
        p.k(map, TypedValues.TransitionType.S_FROM);
        checkIsMutable$kotlin_stdlib();
        o(map.entrySet());
    }

    public final boolean q(int i10) {
        int iN = n(this.keysArray[i10]);
        int i11 = this.maxProbeDistance;
        while (true) {
            int[] iArr = this.hashArray;
            if (iArr[iN] == 0) {
                iArr[iN] = i10 + 1;
                this.presenceArray[i10] = iN;
                return true;
            }
            i11--;
            if (i11 < 0) {
                return false;
            }
            iN = iN == 0 ? m() - 1 : iN - 1;
        }
    }

    public final void r() {
        this.modCount++;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    @Nullable
    public V remove(Object obj) {
        checkIsMutable$kotlin_stdlib();
        int iK = k(obj);
        if (iK < 0) {
            return null;
        }
        V[] vArr = this.valuesArray;
        p.h(vArr);
        V v10 = vArr[iK];
        t(iK);
        return v10;
    }

    public final boolean removeEntry$kotlin_stdlib(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        p.k(entry, "entry");
        checkIsMutable$kotlin_stdlib();
        int iK = k(entry.getKey());
        if (iK < 0) {
            return false;
        }
        V[] vArr = this.valuesArray;
        p.h(vArr);
        if (!p.f(vArr[iK], entry.getValue())) {
            return false;
        }
        t(iK);
        return true;
    }

    public final boolean removeKey$kotlin_stdlib(K k10) {
        checkIsMutable$kotlin_stdlib();
        int iK = k(k10);
        if (iK < 0) {
            return false;
        }
        t(iK);
        return true;
    }

    public final boolean removeValue$kotlin_stdlib(V v10) {
        checkIsMutable$kotlin_stdlib();
        int iL = l(v10);
        if (iL < 0) {
            return false;
        }
        t(iL);
        return true;
    }

    public final void s(int i10) {
        r();
        int i11 = 0;
        if (this.length > size()) {
            f(false);
        }
        this.hashArray = new int[i10];
        this.hashShift = Companion.d(i10);
        while (i11 < this.length) {
            int i12 = i11 + 1;
            if (!q(i11)) {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
            i11 = i12;
        }
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    public final void t(int i10) {
        dn.b.f(this.keysArray, i10);
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            dn.b.f(vArr, i10);
        }
        u(this.presenceArray[i10]);
        this.presenceArray[i10] = -1;
        this.size = size() - 1;
        r();
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder((size() * 3) + 2);
        sb2.append(h.f52301d);
        b<K, V> bVarEntriesIterator$kotlin_stdlib = entriesIterator$kotlin_stdlib();
        int i10 = 0;
        while (bVarEntriesIterator$kotlin_stdlib.hasNext()) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            bVarEntriesIterator$kotlin_stdlib.k(sb2);
            i10++;
        }
        sb2.append(h.f52302e);
        String string = sb2.toString();
        p.j(string, "toString(...)");
        return string;
    }

    public final void u(int i10) {
        int iJ = n.j(this.maxProbeDistance * 2, m() / 2);
        int i11 = 0;
        int i12 = i10;
        do {
            i10 = i10 == 0 ? m() - 1 : i10 - 1;
            i11++;
            if (i11 > this.maxProbeDistance) {
                this.hashArray[i12] = 0;
                return;
            }
            int[] iArr = this.hashArray;
            int i13 = iArr[i10];
            if (i13 == 0) {
                iArr[i12] = 0;
                return;
            }
            if (i13 < 0) {
                iArr[i12] = -1;
            } else {
                int i14 = i13 - 1;
                if (((n(this.keysArray[i14]) - i10) & (m() - 1)) >= i11) {
                    this.hashArray[i12] = i13;
                    this.presenceArray[i14] = i12;
                }
                iJ--;
            }
            i12 = i10;
            i11 = 0;
            iJ--;
        } while (iJ >= 0);
        this.hashArray[i12] = -1;
    }

    public final boolean v(int i10) {
        int capacity$kotlin_stdlib = getCapacity$kotlin_stdlib();
        int i11 = this.length;
        int i12 = capacity$kotlin_stdlib - i11;
        int size = i11 - size();
        return i12 < i10 && i12 + size >= i10 && size >= getCapacity$kotlin_stdlib() / 4;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return getValues();
    }

    @NotNull
    public final f<K, V> valuesIterator$kotlin_stdlib() {
        return new f<>(this);
    }
}
