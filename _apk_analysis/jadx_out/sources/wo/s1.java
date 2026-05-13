package wo;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NullableSerializer.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class s1<T> implements KSerializer<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final KSerializer<T> f86612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final SerialDescriptor f86613b;

    public s1(@NotNull KSerializer<T> kSerializer) {
        tn.p.k(kSerializer, "serializer");
        this.f86612a = kSerializer;
        this.f86613b = new q2(kSerializer.getDescriptor());
    }

    @Override // so.c
    @Nullable
    public T deserialize(@NotNull Decoder decoder) {
        tn.p.k(decoder, "decoder");
        return decoder.F() ? (T) decoder.A(this.f86612a) : (T) decoder.h();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && s1.class == obj.getClass() && tn.p.f(this.f86612a, ((s1) obj).f86612a);
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.f86613b;
    }

    public int hashCode() {
        return this.f86612a.hashCode();
    }

    @Override // so.l
    public void serialize(@NotNull Encoder encoder, @Nullable T t10) {
        tn.p.k(encoder, "encoder");
        if (t10 == null) {
            encoder.C();
        } else {
            encoder.F();
            encoder.z(this.f86612a, t10);
        }
    }
}
