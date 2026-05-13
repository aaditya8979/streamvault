package wo;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ValueClasses.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class j3 implements KSerializer<bn.k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final j3 f86555a = new j3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final SerialDescriptor f86556b = s0.a("kotlin.UInt", to.a.G(tn.o.f85360a));

    public int b(@NotNull Decoder decoder) {
        tn.p.k(decoder, "decoder");
        return bn.k.b(decoder.x(getDescriptor()).u());
    }

    public void c(@NotNull Encoder encoder, int i10) {
        tn.p.k(encoder, "encoder");
        encoder.i(getDescriptor()).t(i10);
    }

    @Override // so.c
    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        return bn.k.a(b(decoder));
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return f86556b;
    }

    @Override // so.l
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        c(encoder, ((bn.k) obj).f());
    }
}
