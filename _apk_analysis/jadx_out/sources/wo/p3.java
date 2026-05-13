package wo;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ValueClasses.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class p3 implements KSerializer<bn.p> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final p3 f86588a = new p3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final SerialDescriptor f86589b = s0.a("kotlin.UShort", to.a.I(tn.v.f85366a));

    public short b(@NotNull Decoder decoder) {
        tn.p.k(decoder, "decoder");
        return bn.p.b(decoder.x(getDescriptor()).n());
    }

    public void c(@NotNull Encoder encoder, short s10) {
        tn.p.k(encoder, "encoder");
        encoder.i(getDescriptor()).l(s10);
    }

    @Override // so.c
    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        return bn.p.a(b(decoder));
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return f86589b;
    }

    @Override // so.l
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        c(encoder, ((bn.p) obj).f());
    }
}
