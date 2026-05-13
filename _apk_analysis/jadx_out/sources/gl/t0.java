package gl;

import io.ktor.http.Url;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import uo.e;

/* JADX INFO: compiled from: Url.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class t0 implements KSerializer<Url> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final t0 f62621a = new t0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final SerialDescriptor f62622b = uo.j.b("io.ktor.http.Url", e.i.f85751a);

    @Override // so.c
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Url deserialize(@NotNull Decoder decoder) {
        tn.p.k(decoder, "decoder");
        return i0.d(decoder.q());
    }

    @Override // so.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void serialize(@NotNull Encoder encoder, @NotNull Url url) {
        tn.p.k(encoder, "encoder");
        tn.p.k(url, "value");
        encoder.w(url.toString());
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return f62622b;
    }
}
