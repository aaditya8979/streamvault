package so;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import uo.k;
import wo.b2;

/* JADX INFO: compiled from: ContextualSerializer.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class b<T> implements KSerializer<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final KClass<T> f84444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final KSerializer<T> f84445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<KSerializer<?>> f84446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final SerialDescriptor f84447d;

    public b(@NotNull KClass<T> kClass, @Nullable KSerializer<T> kSerializer, @NotNull KSerializer<?>[] kSerializerArr) {
        tn.p.k(kClass, "serializableClass");
        tn.p.k(kSerializerArr, "typeArgumentsSerializers");
        this.f84444a = kClass;
        this.f84445b = kSerializer;
        this.f84446c = cn.p.f(kSerializerArr);
        this.f84447d = uo.b.c(uo.j.d("kotlinx.serialization.ContextualSerializer", k.a.f85771a, new SerialDescriptor[0], new sn.l() { // from class: so.a
            @Override // sn.l
            public final Object invoke(Object obj) {
                return b.c(this.f84443b, (uo.a) obj);
            }
        }), kClass);
    }

    public static final bn.r c(b bVar, uo.a aVar) {
        SerialDescriptor descriptor;
        tn.p.k(aVar, "$this$buildSerialDescriptor");
        KSerializer<T> kSerializer = bVar.f84445b;
        List<Annotation> annotations = (kSerializer == null || (descriptor = kSerializer.getDescriptor()) == null) ? null : descriptor.getAnnotations();
        if (annotations == null) {
            annotations = cn.w.m();
        }
        aVar.h(annotations);
        return bn.r.f5635a;
    }

    public final KSerializer<T> d(zo.c cVar) {
        KSerializer<T> kSerializerB = cVar.b(this.f84444a, this.f84446c);
        if (kSerializerB != null || (kSerializerB = this.f84445b) != null) {
            return kSerializerB;
        }
        b2.f(this.f84444a);
        throw new KotlinNothingValueException();
    }

    @Override // so.c
    @NotNull
    public T deserialize(@NotNull Decoder decoder) {
        tn.p.k(decoder, "decoder");
        return (T) decoder.A(d(decoder.a()));
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.f84447d;
    }

    @Override // so.l
    public void serialize(@NotNull Encoder encoder, @NotNull T t10) {
        tn.p.k(encoder, "encoder");
        tn.p.k(t10, "value");
        encoder.z(d(encoder.a()), t10);
    }
}
