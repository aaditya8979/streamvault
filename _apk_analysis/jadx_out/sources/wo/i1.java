package wo;

import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import uo.l;

/* JADX INFO: compiled from: Tuples.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class i1<K, V> extends y0<K, V, Map.Entry<? extends K, ? extends V>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final SerialDescriptor f86542c;

    /* JADX INFO: compiled from: Tuples.kt */
    public static final class a<K, V> implements Map.Entry<K, V>, un.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final K f86543b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final V f86544c;

        public a(K k10, V v10) {
            this.f86543b = k10;
            this.f86544c = v10;
        }

        @Override // java.util.Map.Entry
        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return tn.p.f(this.f86543b, aVar.f86543b) && tn.p.f(this.f86544c, aVar.f86544c);
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f86543b;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f86544c;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k10 = this.f86543b;
            int iHashCode = (k10 == null ? 0 : k10.hashCode()) * 31;
            V v10 = this.f86544c;
            return iHashCode + (v10 != null ? v10.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @NotNull
        public String toString() {
            return "MapEntry(key=" + this.f86543b + ", value=" + this.f86544c + ')';
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(@NotNull final KSerializer<K> kSerializer, @NotNull final KSerializer<V> kSerializer2) {
        super(kSerializer, kSerializer2, null);
        tn.p.k(kSerializer, "keySerializer");
        tn.p.k(kSerializer2, "valueSerializer");
        this.f86542c = uo.j.d("kotlin.collections.Map.Entry", l.c.f85775a, new SerialDescriptor[0], new sn.l() { // from class: wo.h1
            @Override // sn.l
            public final Object invoke(Object obj) {
                return i1.h(kSerializer, kSerializer2, (uo.a) obj);
            }
        });
    }

    public static final bn.r h(KSerializer kSerializer, KSerializer kSerializer2, uo.a aVar) {
        tn.p.k(aVar, "$this$buildSerialDescriptor");
        uo.a.b(aVar, "key", kSerializer.getDescriptor(), null, false, 12, null);
        uo.a.b(aVar, "value", kSerializer2.getDescriptor(), null, false, 12, null);
        return bn.r.f5635a;
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.f86542c;
    }

    @Override // wo.y0
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public K b(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        tn.p.k(entry, "<this>");
        return entry.getKey();
    }

    @Override // wo.y0
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public V d(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        tn.p.k(entry, "<this>");
        return entry.getValue();
    }

    @Override // wo.y0
    @NotNull
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Map.Entry<K, V> f(K k10, V v10) {
        return new a(k10, v10);
    }
}
