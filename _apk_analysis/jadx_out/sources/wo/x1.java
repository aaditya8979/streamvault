package wo;

import kotlin.Pair;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Tuples.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class x1<K, V> extends y0<K, V, Pair<? extends K, ? extends V>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final SerialDescriptor f86640c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(@NotNull final KSerializer<K> kSerializer, @NotNull final KSerializer<V> kSerializer2) {
        super(kSerializer, kSerializer2, null);
        tn.p.k(kSerializer, "keySerializer");
        tn.p.k(kSerializer2, "valueSerializer");
        this.f86640c = uo.j.c("kotlin.Pair", new SerialDescriptor[0], new sn.l() { // from class: wo.w1
            @Override // sn.l
            public final Object invoke(Object obj) {
                return x1.h(kSerializer, kSerializer2, (uo.a) obj);
            }
        });
    }

    public static final bn.r h(KSerializer kSerializer, KSerializer kSerializer2, uo.a aVar) {
        tn.p.k(aVar, "$this$buildClassSerialDescriptor");
        uo.a.b(aVar, "first", kSerializer.getDescriptor(), null, false, 12, null);
        uo.a.b(aVar, "second", kSerializer2.getDescriptor(), null, false, 12, null);
        return bn.r.f5635a;
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.f86640c;
    }

    @Override // wo.y0
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public K b(@NotNull Pair<? extends K, ? extends V> pair) {
        tn.p.k(pair, "<this>");
        return pair.getFirst();
    }

    @Override // wo.y0
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public V d(@NotNull Pair<? extends K, ? extends V> pair) {
        tn.p.k(pair, "<this>");
        return pair.getSecond();
    }

    @Override // wo.y0
    @NotNull
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Pair<K, V> f(K k10, V v10) {
        return bn.h.a(k10, v10);
    }
}
