package wo;

import kotlin.uuid.Uuid;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import uo.e;

/* JADX INFO: compiled from: BuiltInSerializers.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class r3 implements KSerializer<Uuid> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final r3 f86605a = new r3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final SerialDescriptor f86606b = new n2("kotlin.uuid.Uuid", e.i.f85751a);

    @Override // so.c
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Uuid deserialize(@NotNull Decoder decoder) {
        tn.p.k(decoder, "decoder");
        return Uuid.Companion.c(decoder.q());
    }

    @Override // so.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void serialize(@NotNull Encoder encoder, @NotNull Uuid uuid) {
        tn.p.k(encoder, "encoder");
        tn.p.k(uuid, "value");
        encoder.w(uuid.toString());
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return f86606b;
    }
}
