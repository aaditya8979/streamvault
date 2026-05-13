package xo;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;
import uo.e;
import yo.j0;

/* JADX INFO: compiled from: JsonElementSerializers.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class d0 implements KSerializer<JsonPrimitive> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final d0 f87042a = new d0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final SerialDescriptor f87043b = uo.j.e("kotlinx.serialization.json.JsonPrimitive", e.i.f85751a, new SerialDescriptor[0], null, 8, null);

    @Override // so.c
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JsonPrimitive deserialize(@NotNull Decoder decoder) {
        tn.p.k(decoder, "decoder");
        JsonElement jsonElementT = q.d(decoder).t();
        if (jsonElementT instanceof JsonPrimitive) {
            return (JsonPrimitive) jsonElementT;
        }
        throw j0.f(-1, "Unexpected JSON element, expected JsonPrimitive, had " + tn.t.b(jsonElementT.getClass()), jsonElementT.toString());
    }

    @Override // so.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void serialize(@NotNull Encoder encoder, @NotNull JsonPrimitive jsonPrimitive) {
        tn.p.k(encoder, "encoder");
        tn.p.k(jsonPrimitive, "value");
        q.h(encoder);
        if (jsonPrimitive instanceof JsonNull) {
            encoder.z(z.f87070a, JsonNull.INSTANCE);
        } else {
            encoder.z(w.f87068a, (v) jsonPrimitive);
        }
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return f87043b;
    }
}
