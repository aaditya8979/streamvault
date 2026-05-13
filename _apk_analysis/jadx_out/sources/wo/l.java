package wo;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import uo.e;

/* JADX INFO: compiled from: Primitives.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class l implements KSerializer<Byte> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final l f86563a = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final SerialDescriptor f86564b = new n2("kotlin.Byte", e.b.f85744a);

    @Override // so.c
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Byte deserialize(@NotNull Decoder decoder) {
        tn.p.k(decoder, "decoder");
        return Byte.valueOf(decoder.I());
    }

    public void c(@NotNull Encoder encoder, byte b10) {
        tn.p.k(encoder, "encoder");
        encoder.e(b10);
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return f86564b;
    }

    @Override // so.l
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        c(encoder, ((Number) obj).byteValue());
    }
}
