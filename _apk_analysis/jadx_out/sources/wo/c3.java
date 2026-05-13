package wo;

import kotlin.Triple;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Tuples.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class c3<A, B, C> implements KSerializer<Triple<? extends A, ? extends B, ? extends C>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final KSerializer<A> f86483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final KSerializer<B> f86484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final KSerializer<C> f86485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final SerialDescriptor f86486d;

    public c3(@NotNull KSerializer<A> kSerializer, @NotNull KSerializer<B> kSerializer2, @NotNull KSerializer<C> kSerializer3) {
        tn.p.k(kSerializer, "aSerializer");
        tn.p.k(kSerializer2, "bSerializer");
        tn.p.k(kSerializer3, "cSerializer");
        this.f86483a = kSerializer;
        this.f86484b = kSerializer2;
        this.f86485c = kSerializer3;
        this.f86486d = uo.j.c("kotlin.Triple", new SerialDescriptor[0], new sn.l() { // from class: wo.b3
            @Override // sn.l
            public final Object invoke(Object obj) {
                return c3.e(this.f86479b, (uo.a) obj);
            }
        });
    }

    public static final bn.r e(c3 c3Var, uo.a aVar) {
        tn.p.k(aVar, "$this$buildClassSerialDescriptor");
        uo.a.b(aVar, "first", c3Var.f86483a.getDescriptor(), null, false, 12, null);
        uo.a.b(aVar, "second", c3Var.f86484b.getDescriptor(), null, false, 12, null);
        uo.a.b(aVar, "third", c3Var.f86485c.getDescriptor(), null, false, 12, null);
        return bn.r.f5635a;
    }

    public final Triple<A, B, C> c(vo.c cVar) {
        Object objE = vo.c.e(cVar, getDescriptor(), 0, this.f86483a, null, 8, null);
        Object objE2 = vo.c.e(cVar, getDescriptor(), 1, this.f86484b, null, 8, null);
        Object objE3 = vo.c.e(cVar, getDescriptor(), 2, this.f86485c, null, 8, null);
        cVar.c(getDescriptor());
        return new Triple<>(objE, objE2, objE3);
    }

    public final Triple<A, B, C> d(vo.c cVar) {
        Object objE = d3.f86496a;
        Object objE2 = d3.f86496a;
        Object objE3 = d3.f86496a;
        while (true) {
            int iW = cVar.w(getDescriptor());
            if (iW == -1) {
                cVar.c(getDescriptor());
                if (objE == d3.f86496a) {
                    throw new SerializationException("Element 'first' is missing");
                }
                if (objE2 == d3.f86496a) {
                    throw new SerializationException("Element 'second' is missing");
                }
                if (objE3 != d3.f86496a) {
                    return new Triple<>(objE, objE2, objE3);
                }
                throw new SerializationException("Element 'third' is missing");
            }
            if (iW == 0) {
                objE = vo.c.e(cVar, getDescriptor(), 0, this.f86483a, null, 8, null);
            } else if (iW == 1) {
                objE2 = vo.c.e(cVar, getDescriptor(), 1, this.f86484b, null, 8, null);
            } else {
                if (iW != 2) {
                    throw new SerializationException("Unexpected index " + iW);
                }
                objE3 = vo.c.e(cVar, getDescriptor(), 2, this.f86485c, null, 8, null);
            }
        }
    }

    @Override // so.c
    @NotNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Triple<A, B, C> deserialize(@NotNull Decoder decoder) {
        tn.p.k(decoder, "decoder");
        vo.c cVarB = decoder.b(getDescriptor());
        return cVarB.l() ? c(cVarB) : d(cVarB);
    }

    @Override // so.l
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void serialize(@NotNull Encoder encoder, @NotNull Triple<? extends A, ? extends B, ? extends C> triple) {
        tn.p.k(encoder, "encoder");
        tn.p.k(triple, "value");
        vo.d dVarB = encoder.b(getDescriptor());
        dVarB.g(getDescriptor(), 0, this.f86483a, triple.getFirst());
        dVarB.g(getDescriptor(), 1, this.f86484b, triple.getSecond());
        dVarB.g(getDescriptor(), 2, this.f86485c, triple.getThird());
        dVarB.c(getDescriptor());
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.f86486d;
    }
}
