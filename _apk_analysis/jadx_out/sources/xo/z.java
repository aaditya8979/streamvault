package xo;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.internal.JsonDecodingException;
import org.jetbrains.annotations.NotNull;
import uo.k;

/* JADX INFO: compiled from: JsonElementSerializers.kt */
/* JADX INFO: loaded from: classes.dex */
public final class z implements KSerializer<JsonNull> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final z f87070a = new z();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final SerialDescriptor f87071b = uo.j.e("kotlinx.serialization.json.JsonNull", k.b.f85772a, new SerialDescriptor[0], null, 8, null);

    @Override // so.c
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JsonNull deserialize(@NotNull Decoder decoder) {
        tn.p.k(decoder, "decoder");
        q.g(decoder);
        if (decoder.F()) {
            throw new JsonDecodingException("Expected 'null' literal");
        }
        decoder.h();
        return JsonNull.INSTANCE;
    }

    @Override // so.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void serialize(@NotNull Encoder encoder, @NotNull JsonNull jsonNull) {
        tn.p.k(encoder, "encoder");
        tn.p.k(jsonNull, "value");
        q.h(encoder);
        encoder.C();
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return f87071b;
    }
}
