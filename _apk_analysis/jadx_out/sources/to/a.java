package to;

import bn.i;
import bn.k;
import bn.m;
import bn.n;
import bn.p;
import co.b;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.reflect.KClass;
import kotlin.uuid.Uuid;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import tn.c;
import tn.d;
import tn.e;
import tn.j;
import tn.k;
import tn.o;
import tn.p;
import tn.v;
import tn.x;
import wo.a0;
import wo.a1;
import wo.b0;
import wo.c0;
import wo.c3;
import wo.f;
import wo.f1;
import wo.f3;
import wo.g1;
import wo.g3;
import wo.h;
import wo.i;
import wo.i1;
import wo.i3;
import wo.j3;
import wo.k0;
import wo.l;
import wo.l0;
import wo.l3;
import wo.m3;
import wo.o3;
import wo.p2;
import wo.p3;
import wo.q;
import wo.q3;
import wo.r;
import wo.r1;
import wo.r3;
import wo.s1;
import wo.u0;
import wo.u2;
import wo.v0;
import wo.v2;
import wo.w2;
import wo.x1;

/* JADX INFO: compiled from: BuiltinSerializers.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class a {
    @NotNull
    public static final KSerializer<Uuid> A(@NotNull Uuid.a aVar) {
        p.k(aVar, "<this>");
        return r3.f86605a;
    }

    @NotNull
    public static final KSerializer<Boolean> B(@NotNull c cVar) {
        p.k(cVar, "<this>");
        return i.f86540a;
    }

    @NotNull
    public static final KSerializer<Byte> C(@NotNull d dVar) {
        p.k(dVar, "<this>");
        return l.f86563a;
    }

    @NotNull
    public static final KSerializer<Character> D(@NotNull e eVar) {
        p.k(eVar, "<this>");
        return r.f86600a;
    }

    @NotNull
    public static final KSerializer<Double> E(@NotNull j jVar) {
        p.k(jVar, "<this>");
        return b0.f86476a;
    }

    @NotNull
    public static final KSerializer<Float> F(@NotNull k kVar) {
        p.k(kVar, "<this>");
        return l0.f86565a;
    }

    @NotNull
    public static final KSerializer<Integer> G(@NotNull o oVar) {
        p.k(oVar, "<this>");
        return v0.f86626a;
    }

    @NotNull
    public static final KSerializer<Long> H(@NotNull tn.r rVar) {
        p.k(rVar, "<this>");
        return g1.f86515a;
    }

    @NotNull
    public static final KSerializer<Short> I(@NotNull v vVar) {
        p.k(vVar, "<this>");
        return v2.f86631a;
    }

    @NotNull
    public static final KSerializer<String> J(@NotNull x xVar) {
        p.k(xVar, "<this>");
        return w2.f86635a;
    }

    @NotNull
    public static final <T, E extends T> KSerializer<E[]> a(@NotNull KClass<T> kClass, @NotNull KSerializer<E> kSerializer) {
        p.k(kClass, "kClass");
        p.k(kSerializer, "elementSerializer");
        return new p2(kClass, kSerializer);
    }

    @NotNull
    public static final KSerializer<boolean[]> b() {
        return h.f86531c;
    }

    @NotNull
    public static final KSerializer<byte[]> c() {
        return wo.k.f86557c;
    }

    @NotNull
    public static final KSerializer<char[]> d() {
        return q.f86590c;
    }

    @NotNull
    public static final KSerializer<double[]> e() {
        return a0.f86473c;
    }

    @NotNull
    public static final KSerializer<float[]> f() {
        return k0.f86558c;
    }

    @NotNull
    public static final KSerializer<int[]> g() {
        return u0.f86622c;
    }

    @NotNull
    public static final <T> KSerializer<List<T>> h(@NotNull KSerializer<T> kSerializer) {
        p.k(kSerializer, "elementSerializer");
        return new f(kSerializer);
    }

    @NotNull
    public static final KSerializer<long[]> i() {
        return f1.f86508c;
    }

    @NotNull
    public static final <K, V> KSerializer<Map.Entry<K, V>> j(@NotNull KSerializer<K> kSerializer, @NotNull KSerializer<V> kSerializer2) {
        p.k(kSerializer, "keySerializer");
        p.k(kSerializer2, "valueSerializer");
        return new i1(kSerializer, kSerializer2);
    }

    @NotNull
    public static final <K, V> KSerializer<Map<K, V>> k(@NotNull KSerializer<K> kSerializer, @NotNull KSerializer<V> kSerializer2) {
        p.k(kSerializer, "keySerializer");
        p.k(kSerializer2, "valueSerializer");
        return new a1(kSerializer, kSerializer2);
    }

    @NotNull
    public static final KSerializer l() {
        return r1.f86603a;
    }

    @NotNull
    public static final <K, V> KSerializer<Pair<K, V>> m(@NotNull KSerializer<K> kSerializer, @NotNull KSerializer<V> kSerializer2) {
        p.k(kSerializer, "keySerializer");
        p.k(kSerializer2, "valueSerializer");
        return new x1(kSerializer, kSerializer2);
    }

    @NotNull
    public static final KSerializer<short[]> n() {
        return u2.f86624c;
    }

    @NotNull
    public static final <A, B, C> KSerializer<Triple<A, B, C>> o(@NotNull KSerializer<A> kSerializer, @NotNull KSerializer<B> kSerializer2, @NotNull KSerializer<C> kSerializer3) {
        p.k(kSerializer, "aSerializer");
        p.k(kSerializer2, "bSerializer");
        p.k(kSerializer3, "cSerializer");
        return new c3(kSerializer, kSerializer2, kSerializer3);
    }

    @NotNull
    public static final KSerializer<bn.j> p() {
        return f3.f86510c;
    }

    @NotNull
    public static final KSerializer<bn.l> q() {
        return i3.f86545c;
    }

    @NotNull
    public static final KSerializer<n> r() {
        return l3.f86569c;
    }

    @NotNull
    public static final KSerializer<bn.q> s() {
        return o3.f86581c;
    }

    @NotNull
    public static final <T> KSerializer<T> t(@NotNull KSerializer<T> kSerializer) {
        p.k(kSerializer, "<this>");
        return kSerializer.getDescriptor().b() ? kSerializer : new s1(kSerializer);
    }

    @NotNull
    public static final KSerializer<bn.i> u(@NotNull i.a aVar) {
        p.k(aVar, "<this>");
        return g3.f86529a;
    }

    @NotNull
    public static final KSerializer<bn.k> v(@NotNull k.a aVar) {
        p.k(aVar, "<this>");
        return j3.f86555a;
    }

    @NotNull
    public static final KSerializer<m> w(@NotNull m.a aVar) {
        p.k(aVar, "<this>");
        return m3.f86572a;
    }

    @NotNull
    public static final KSerializer<bn.p> x(@NotNull p.a aVar) {
        tn.p.k(aVar, "<this>");
        return p3.f86588a;
    }

    @NotNull
    public static final KSerializer<bn.r> y(@NotNull bn.r rVar) {
        tn.p.k(rVar, "<this>");
        return q3.f86598b;
    }

    @NotNull
    public static final KSerializer<b> z(@NotNull b.a aVar) {
        tn.p.k(aVar, "<this>");
        return c0.f86480a;
    }
}
