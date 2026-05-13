package wo;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import uo.e;

/* JADX INFO: compiled from: Primitives.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class i implements KSerializer<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final i f86540a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final SerialDescriptor f86541b = new n2("kotlin.Boolean", e.a.f85743a);

    @Override // so.c
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean deserialize(@NotNull Decoder decoder) {
        tn.p.k(decoder, "decoder");
        return Boolean.valueOf(decoder.B());
    }

    public void c(@NotNull Encoder encoder, boolean z10) {
        tn.p.k(encoder, "encoder");
        encoder.m(z10);
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return f86541b;
    }

    @Override // so.l
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        c(encoder, ((Boolean) obj).booleanValue());
    }
}
