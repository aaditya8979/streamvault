package wo;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import uo.e;

/* JADX INFO: compiled from: BuiltInSerializers.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class c0 implements KSerializer<co.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c0 f86480a = new c0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final SerialDescriptor f86481b = new n2("kotlin.time.Duration", e.i.f85751a);

    public long b(@NotNull Decoder decoder) {
        tn.p.k(decoder, "decoder");
        return co.b.f6773c.d(decoder.q());
    }

    public void c(@NotNull Encoder encoder, long j10) {
        tn.p.k(encoder, "encoder");
        encoder.w(co.b.K(j10));
    }

    @Override // so.c
    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        return co.b.f(b(decoder));
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return f86481b;
    }

    @Override // so.l
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        c(encoder, ((co.b) obj).O());
    }
}
