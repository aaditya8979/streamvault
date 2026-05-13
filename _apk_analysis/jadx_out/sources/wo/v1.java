package wo;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import uo.l;

/* JADX INFO: compiled from: ObjectSerializer.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class v1<T> implements KSerializer<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final T f86628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public List<? extends Annotation> f86629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final bn.g f86630c;

    public v1(@NotNull final String str, @NotNull T t10) {
        tn.p.k(str, "serialName");
        tn.p.k(t10, "objectInstance");
        this.f86628a = t10;
        this.f86629b = cn.w.m();
        this.f86630c = kotlin.b.a(LazyThreadSafetyMode.PUBLICATION, new sn.a() { // from class: wo.t1
            @Override // sn.a
            public final Object invoke() {
                return v1.d(str, this);
            }
        });
    }

    public static final SerialDescriptor d(String str, final v1 v1Var) {
        return uo.j.d(str, l.d.f85776a, new SerialDescriptor[0], new sn.l() { // from class: wo.u1
            @Override // sn.l
            public final Object invoke(Object obj) {
                return v1.e(this.f86623b, (uo.a) obj);
            }
        });
    }

    public static final bn.r e(v1 v1Var, uo.a aVar) {
        tn.p.k(aVar, "$this$buildSerialDescriptor");
        aVar.h(v1Var.f86629b);
        return bn.r.f5635a;
    }

    @Override // so.c
    @NotNull
    public T deserialize(@NotNull Decoder decoder) {
        int iW;
        tn.p.k(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        vo.c cVarB = decoder.b(descriptor);
        if (cVarB.l() || (iW = cVarB.w(getDescriptor())) == -1) {
            bn.r rVar = bn.r.f5635a;
            cVarB.c(descriptor);
            return this.f86628a;
        }
        throw new SerializationException("Unexpected index " + iW);
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.f86630c.getValue();
    }

    @Override // so.l
    public void serialize(@NotNull Encoder encoder, @NotNull T t10) {
        tn.p.k(encoder, "encoder");
        tn.p.k(t10, "value");
        encoder.b(getDescriptor()).c(getDescriptor());
    }
}
