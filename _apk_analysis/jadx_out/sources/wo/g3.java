package wo;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ValueClasses.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class g3 implements KSerializer<bn.i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final g3 f86529a = new g3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final SerialDescriptor f86530b = s0.a("kotlin.UByte", to.a.C(tn.d.f85348a));

    public byte b(@NotNull Decoder decoder) {
        tn.p.k(decoder, "decoder");
        return bn.i.b(decoder.x(getDescriptor()).I());
    }

    public void c(@NotNull Encoder encoder, byte b10) {
        tn.p.k(encoder, "encoder");
        encoder.i(getDescriptor()).e(b10);
    }

    @Override // so.c
    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        return bn.i.a(b(decoder));
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return f86530b;
    }

    @Override // so.l
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        c(encoder, ((bn.i) obj).f());
    }
}
