package xo;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;
import uo.e;
import yo.j0;

/* JADX INFO: compiled from: JsonElementSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class w implements KSerializer<v> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final w f87068a = new w();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final SerialDescriptor f87069b = uo.j.b("kotlinx.serialization.json.JsonLiteral", e.i.f85751a);

    @Override // so.c
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public v deserialize(@NotNull Decoder decoder) {
        tn.p.k(decoder, "decoder");
        JsonElement jsonElementT = q.d(decoder).t();
        if (jsonElementT instanceof v) {
            return (v) jsonElementT;
        }
        throw j0.f(-1, "Unexpected JSON element, expected JsonLiteral, had " + tn.t.b(jsonElementT.getClass()), jsonElementT.toString());
    }

    @Override // so.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void serialize(@NotNull Encoder encoder, @NotNull v vVar) {
        tn.p.k(encoder, "encoder");
        tn.p.k(vVar, "value");
        q.h(encoder);
        if (vVar.h()) {
            encoder.w(vVar.f());
            return;
        }
        if (vVar.g() != null) {
            encoder.i(vVar.g()).w(vVar.f());
            return;
        }
        Long lT = bo.z.t(vVar.f());
        if (lT != null) {
            encoder.B(lT.longValue());
            return;
        }
        bn.m mVarH = bo.j0.h(vVar.f());
        if (mVarH != null) {
            encoder.i(to.a.w(bn.m.f5624c).getDescriptor()).B(mVarH.f());
            return;
        }
        Double dO = bo.y.o(vVar.f());
        if (dO != null) {
            encoder.y(dO.doubleValue());
            return;
        }
        Boolean boolR1 = bo.d0.r1(vVar.f());
        if (boolR1 != null) {
            encoder.m(boolR1.booleanValue());
        } else {
            encoder.w(vVar.f());
        }
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return f87069b;
    }
}
