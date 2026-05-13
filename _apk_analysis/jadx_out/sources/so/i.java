package so;

import java.util.Map;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SealedSerializer.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class i<T> extends wo.b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final KClass<T> f84453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final bn.g f84454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Map<KClass<? extends T>, KSerializer<? extends T>> f84455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Map<String, KSerializer<? extends T>> f84456d;

    @Override // wo.b
    @Nullable
    public c<T> d(@NotNull vo.c cVar, @Nullable String str) {
        tn.p.k(cVar, "decoder");
        KSerializer<? extends T> kSerializer = this.f84456d.get(str);
        return kSerializer != null ? kSerializer : super.d(cVar, str);
    }

    @Override // wo.b
    @Nullable
    public l<T> e(@NotNull Encoder encoder, @NotNull T t10) {
        tn.p.k(encoder, "encoder");
        tn.p.k(t10, "value");
        KSerializer<? extends T> kSerializerE = this.f84455c.get(tn.t.b(t10.getClass()));
        if (kSerializerE == null) {
            kSerializerE = super.e(encoder, t10);
        }
        if (kSerializerE != null) {
            return kSerializerE;
        }
        return null;
    }

    @Override // wo.b
    @NotNull
    public KClass<T> f() {
        return this.f84453a;
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.f84454b.getValue();
    }
}
