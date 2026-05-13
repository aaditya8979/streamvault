package wo;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import uo.e;

/* JADX INFO: compiled from: Primitives.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class w2 implements KSerializer<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final w2 f86635a = new w2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final SerialDescriptor f86636b = new n2("kotlin.String", e.i.f85751a);

    @Override // so.c
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String deserialize(@NotNull Decoder decoder) {
        tn.p.k(decoder, "decoder");
        return decoder.q();
    }

    @Override // so.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void serialize(@NotNull Encoder encoder, @NotNull String str) {
        tn.p.k(encoder, "encoder");
        tn.p.k(str, "value");
        encoder.w(str);
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return f86636b;
    }
}
