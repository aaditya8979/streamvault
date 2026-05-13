package zo;

import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.p;
import tn.t;
import tn.y;
import zo.a;

/* JADX INFO: compiled from: SerializersModule.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Map<KClass<?>, a> f98375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Map<KClass<?>, Map<KClass<?>, KSerializer<?>>> f98376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Map<KClass<?>, l<?, so.l<?>>> f98377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Map<KClass<?>, Map<String, KSerializer<?>>> f98378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Map<KClass<?>, l<String, so.c<?>>> f98379e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f98380f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(@NotNull Map<KClass<?>, ? extends a> map, @NotNull Map<KClass<?>, ? extends Map<KClass<?>, ? extends KSerializer<?>>> map2, @NotNull Map<KClass<?>, ? extends l<?, ? extends so.l<?>>> map3, @NotNull Map<KClass<?>, ? extends Map<String, ? extends KSerializer<?>>> map4, @NotNull Map<KClass<?>, ? extends l<? super String, ? extends so.c<?>>> map5, boolean z10) {
        super(null);
        p.k(map, "class2ContextualFactory");
        p.k(map2, "polyBase2Serializers");
        p.k(map3, "polyBase2DefaultSerializerProvider");
        p.k(map4, "polyBase2NamedSerializers");
        p.k(map5, "polyBase2DefaultDeserializerProvider");
        this.f98375a = map;
        this.f98376b = map2;
        this.f98377c = map3;
        this.f98378d = map4;
        this.f98379e = map5;
        this.f98380f = z10;
    }

    @Override // zo.c
    public void a(@NotNull f fVar) {
        p.k(fVar, "collector");
        for (Map.Entry<KClass<?>, a> entry : this.f98375a.entrySet()) {
            KClass<?> key = entry.getKey();
            a value = entry.getValue();
            if (value instanceof a.C1121a) {
                p.i(key, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                KSerializer<?> kSerializerB = ((a.C1121a) value).b();
                p.i(kSerializerB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                fVar.g(key, kSerializerB);
            } else {
                if (!(value instanceof a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                fVar.a(key, ((a.b) value).b());
            }
        }
        for (Map.Entry<KClass<?>, Map<KClass<?>, KSerializer<?>>> entry2 : this.f98376b.entrySet()) {
            KClass<?> key2 = entry2.getKey();
            for (Map.Entry<KClass<?>, KSerializer<?>> entry3 : entry2.getValue().entrySet()) {
                KClass<?> key3 = entry3.getKey();
                KSerializer<?> value2 = entry3.getValue();
                p.i(key2, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                p.i(key3, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                p.i(value2, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                fVar.f(key2, key3, value2);
            }
        }
        for (Map.Entry<KClass<?>, l<?, so.l<?>>> entry4 : this.f98377c.entrySet()) {
            KClass<?> key4 = entry4.getKey();
            l<?, so.l<?>> value3 = entry4.getValue();
            p.i(key4, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            p.i(value3, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"value\")] kotlin.Any, kotlinx.serialization.SerializationStrategy<kotlin.Any>?>");
            fVar.b(key4, (l) y.e(value3, 1));
        }
        for (Map.Entry<KClass<?>, l<String, so.c<?>>> entry5 : this.f98379e.entrySet()) {
            KClass<?> key5 = entry5.getKey();
            l<String, so.c<?>> value4 = entry5.getValue();
            p.i(key5, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            p.i(value4, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"className\")] kotlin.String?, kotlinx.serialization.DeserializationStrategy<kotlin.Any>?>");
            fVar.d(key5, (l) y.e(value4, 1));
        }
    }

    @Override // zo.c
    @Nullable
    public <T> KSerializer<T> b(@NotNull KClass<T> kClass, @NotNull List<? extends KSerializer<?>> list) {
        p.k(kClass, "kClass");
        p.k(list, "typeArgumentsSerializers");
        a aVar = this.f98375a.get(kClass);
        KSerializer<?> kSerializerA = aVar != null ? aVar.a(list) : null;
        if (kSerializerA instanceof KSerializer) {
            return (KSerializer<T>) kSerializerA;
        }
        return null;
    }

    @Override // zo.c
    public boolean d() {
        return this.f98380f;
    }

    @Override // zo.c
    @Nullable
    public <T> so.c<T> e(@NotNull KClass<? super T> kClass, @Nullable String str) {
        p.k(kClass, "baseClass");
        Map<String, KSerializer<?>> map = this.f98378d.get(kClass);
        KSerializer<?> kSerializer = map != null ? map.get(str) : null;
        if (!(kSerializer instanceof KSerializer)) {
            kSerializer = null;
        }
        if (kSerializer != null) {
            return kSerializer;
        }
        l<String, so.c<?>> lVar = this.f98379e.get(kClass);
        l<String, so.c<?>> lVar2 = y.k(lVar, 1) ? lVar : null;
        if (lVar2 != null) {
            return (so.c) lVar2.invoke(str);
        }
        return null;
    }

    @Override // zo.c
    @Nullable
    public <T> so.l<T> f(@NotNull KClass<? super T> kClass, @NotNull T t10) {
        p.k(kClass, "baseClass");
        p.k(t10, "value");
        if (!kClass.isInstance(t10)) {
            return null;
        }
        Map<KClass<?>, KSerializer<?>> map = this.f98376b.get(kClass);
        KSerializer<?> kSerializer = map != null ? map.get(t.b(t10.getClass())) : null;
        if (!(kSerializer instanceof so.l)) {
            kSerializer = null;
        }
        if (kSerializer != null) {
            return kSerializer;
        }
        l<?, so.l<?>> lVar = this.f98377c.get(kClass);
        l<?, so.l<?>> lVar2 = y.k(lVar, 1) ? lVar : null;
        if (lVar2 != null) {
            return (so.l) lVar2.invoke(t10);
        }
        return null;
    }
}
