package wo;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import uo.e;

/* JADX INFO: compiled from: Primitives.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class g1 implements KSerializer<Long> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final g1 f86515a = new g1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final SerialDescriptor f86516b = new n2("kotlin.Long", e.g.f85749a);

    @Override // so.c
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Long deserialize(@NotNull Decoder decoder) {
        tn.p.k(decoder, "decoder");
        return Long.valueOf(decoder.j());
    }

    public void c(@NotNull Encoder encoder, long j10) {
        tn.p.k(encoder, "encoder");
        encoder.B(j10);
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return f86516b;
    }

    @Override // so.l
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        c(encoder, ((Number) obj).longValue());
    }
}
