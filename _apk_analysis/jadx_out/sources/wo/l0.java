package wo;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import uo.e;

/* JADX INFO: compiled from: Primitives.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class l0 implements KSerializer<Float> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final l0 f86565a = new l0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final SerialDescriptor f86566b = new n2("kotlin.Float", e.C1072e.f85747a);

    @Override // so.c
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Float deserialize(@NotNull Decoder decoder) {
        tn.p.k(decoder, "decoder");
        return Float.valueOf(decoder.y());
    }

    public void c(@NotNull Encoder encoder, float f10) {
        tn.p.k(encoder, "encoder");
        encoder.n(f10);
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return f86566b;
    }

    @Override // so.l
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        c(encoder, ((Number) obj).floatValue());
    }
}
