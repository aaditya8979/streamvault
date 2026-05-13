package xo;

import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;
import uo.d;

/* JADX INFO: compiled from: JsonElementSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class p implements KSerializer<JsonElement> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final p f87062a = new p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final SerialDescriptor f87063b = uo.j.d("kotlinx.serialization.json.JsonElement", d.b.f85742a, new SerialDescriptor[0], new sn.l() { // from class: xo.j
        @Override // sn.l
        public final Object invoke(Object obj) {
            return p.h((uo.a) obj);
        }
    });

    public static final bn.r h(uo.a aVar) {
        tn.p.k(aVar, "$this$buildSerialDescriptor");
        uo.a.b(aVar, "JsonPrimitive", q.f(new sn.a() { // from class: xo.k
            @Override // sn.a
            public final Object invoke() {
                return p.i();
            }
        }), null, false, 12, null);
        uo.a.b(aVar, "JsonNull", q.f(new sn.a() { // from class: xo.l
            @Override // sn.a
            public final Object invoke() {
                return p.j();
            }
        }), null, false, 12, null);
        uo.a.b(aVar, "JsonLiteral", q.f(new sn.a() { // from class: xo.m
            @Override // sn.a
            public final Object invoke() {
                return p.k();
            }
        }), null, false, 12, null);
        uo.a.b(aVar, "JsonObject", q.f(new sn.a() { // from class: xo.n
            @Override // sn.a
            public final Object invoke() {
                return p.l();
            }
        }), null, false, 12, null);
        uo.a.b(aVar, "JsonArray", q.f(new sn.a() { // from class: xo.o
            @Override // sn.a
            public final Object invoke() {
                return p.m();
            }
        }), null, false, 12, null);
        return bn.r.f5635a;
    }

    public static final SerialDescriptor i() {
        return d0.f87042a.getDescriptor();
    }

    public static final SerialDescriptor j() {
        return z.f87070a.getDescriptor();
    }

    public static final SerialDescriptor k() {
        return w.f87068a.getDescriptor();
    }

    public static final SerialDescriptor l() {
        return c0.f87019a.getDescriptor();
    }

    public static final SerialDescriptor m() {
        return c.f87014a.getDescriptor();
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return f87063b;
    }

    @Override // so.c
    @NotNull
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public JsonElement deserialize(@NotNull Decoder decoder) {
        tn.p.k(decoder, "decoder");
        return q.d(decoder).t();
    }

    @Override // so.l
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void serialize(@NotNull Encoder encoder, @NotNull JsonElement jsonElement) {
        tn.p.k(encoder, "encoder");
        tn.p.k(jsonElement, "value");
        q.h(encoder);
        if (jsonElement instanceof JsonPrimitive) {
            encoder.z(d0.f87042a, jsonElement);
        } else if (jsonElement instanceof JsonObject) {
            encoder.z(c0.f87019a, jsonElement);
        } else {
            if (!(jsonElement instanceof JsonArray)) {
                throw new NoWhenBranchMatchedException();
            }
            encoder.z(c.f87014a, jsonElement);
        }
    }
}
