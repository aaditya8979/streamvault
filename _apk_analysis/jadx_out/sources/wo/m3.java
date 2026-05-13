package wo;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ValueClasses.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class m3 implements KSerializer<bn.m> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final m3 f86572a = new m3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final SerialDescriptor f86573b = s0.a("kotlin.ULong", to.a.H(tn.r.f85361a));

    public long b(@NotNull Decoder decoder) {
        tn.p.k(decoder, "decoder");
        return bn.m.b(decoder.x(getDescriptor()).j());
    }

    public void c(@NotNull Encoder encoder, long j10) {
        tn.p.k(encoder, "encoder");
        encoder.i(getDescriptor()).B(j10);
    }

    @Override // so.c
    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        return bn.m.a(b(decoder));
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return f86573b;
    }

    @Override // so.l
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        c(encoder, ((bn.m) obj).f());
    }
}
