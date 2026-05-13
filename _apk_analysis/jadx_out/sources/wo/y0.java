package wo;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Tuples.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class y0<K, V, R> implements KSerializer<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final KSerializer<K> f86646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final KSerializer<V> f86647b;

    public y0(KSerializer<K> kSerializer, KSerializer<V> kSerializer2) {
        this.f86646a = kSerializer;
        this.f86647b = kSerializer2;
    }

    public /* synthetic */ y0(KSerializer kSerializer, KSerializer kSerializer2, tn.i iVar) {
        this(kSerializer, kSerializer2);
    }

    public abstract K b(R r10);

    @NotNull
    public final KSerializer<K> c() {
        return this.f86646a;
    }

    public abstract V d(R r10);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // so.c
    public R deserialize(@NotNull Decoder decoder) {
        R r10;
        tn.p.k(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        vo.c cVarB = decoder.b(descriptor);
        if (cVarB.l()) {
            r10 = (R) f(vo.c.e(cVarB, getDescriptor(), 0, c(), null, 8, null), vo.c.e(cVarB, getDescriptor(), 1, e(), null, 8, null));
        } else {
            Object objE = d3.f86496a;
            Object objE2 = d3.f86496a;
            while (true) {
                int iW = cVarB.w(getDescriptor());
                if (iW != -1) {
                    if (iW == 0) {
                        objE = vo.c.e(cVarB, getDescriptor(), 0, c(), null, 8, null);
                    } else {
                        if (iW != 1) {
                            throw new SerializationException("Invalid index: " + iW);
                        }
                        objE2 = vo.c.e(cVarB, getDescriptor(), 1, e(), null, 8, null);
                    }
                } else {
                    if (objE == d3.f86496a) {
                        throw new SerializationException("Element 'key' is missing");
                    }
                    if (objE2 == d3.f86496a) {
                        throw new SerializationException("Element 'value' is missing");
                    }
                    r10 = (R) f(objE, objE2);
                }
            }
        }
        cVarB.c(descriptor);
        return r10;
    }

    @NotNull
    public final KSerializer<V> e() {
        return this.f86647b;
    }

    public abstract R f(K k10, V v10);

    @Override // so.l
    public void serialize(@NotNull Encoder encoder, R r10) {
        tn.p.k(encoder, "encoder");
        vo.d dVarB = encoder.b(getDescriptor());
        dVarB.g(getDescriptor(), 0, this.f86646a, b(r10));
        dVarB.g(getDescriptor(), 1, this.f86647b, d(r10));
        dVarB.c(getDescriptor());
    }
}
