package wo;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import uo.e;

/* JADX INFO: compiled from: Primitives.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class v2 implements KSerializer<Short> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final v2 f86631a = new v2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final SerialDescriptor f86632b = new n2("kotlin.Short", e.h.f85750a);

    @Override // so.c
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Short deserialize(@NotNull Decoder decoder) {
        tn.p.k(decoder, "decoder");
        return Short.valueOf(decoder.n());
    }

    public void c(@NotNull Encoder encoder, short s10) {
        tn.p.k(encoder, "encoder");
        encoder.l(s10);
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return f86632b;
    }

    @Override // so.l
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        c(encoder, ((Number) obj).shortValue());
    }
}
