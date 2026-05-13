package wo;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import uo.e;

/* JADX INFO: compiled from: Primitives.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class r implements KSerializer<Character> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final r f86600a = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final SerialDescriptor f86601b = new n2("kotlin.Char", e.c.f85745a);

    @Override // so.c
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Character deserialize(@NotNull Decoder decoder) {
        tn.p.k(decoder, "decoder");
        return Character.valueOf(decoder.p());
    }

    public void c(@NotNull Encoder encoder, char c10) {
        tn.p.k(encoder, "encoder");
        encoder.E(c10);
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return f86601b;
    }

    @Override // so.l
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        c(encoder, ((Character) obj).charValue());
    }
}
