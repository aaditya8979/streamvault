package xo;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;
import yo.n1;

/* JADX INFO: compiled from: JsonTransformingSerializer.kt */
/* JADX INFO: loaded from: classes11.dex */
public abstract class f0<T> implements KSerializer<T> {

    @NotNull
    private final KSerializer<T> tSerializer;

    public f0(@NotNull KSerializer<T> kSerializer) {
        tn.p.k(kSerializer, "tSerializer");
        this.tSerializer = kSerializer;
    }

    @Override // so.c
    public final T deserialize(@NotNull Decoder decoder) {
        tn.p.k(decoder, "decoder");
        g gVarD = q.d(decoder);
        return (T) gVarD.d().d(this.tSerializer, transformDeserialize(gVarD.t()));
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.tSerializer.getDescriptor();
    }

    @Override // so.l
    public final void serialize(@NotNull Encoder encoder, T t10) {
        tn.p.k(encoder, "encoder");
        r rVarE = q.e(encoder);
        rVarE.s(transformSerialize(n1.d(rVarE.d(), t10, this.tSerializer)));
    }

    @NotNull
    public JsonElement transformDeserialize(@NotNull JsonElement jsonElement) {
        tn.p.k(jsonElement, "element");
        return jsonElement;
    }

    @NotNull
    public JsonElement transformSerialize(@NotNull JsonElement jsonElement) {
        tn.p.k(jsonElement, "element");
        return jsonElement;
    }
}
