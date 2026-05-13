package xo;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: JsonElementSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class q {

    /* JADX INFO: compiled from: JsonElementSerializers.kt */
    public static final class a implements SerialDescriptor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final bn.g f87064a;

        public a(sn.a<? extends SerialDescriptor> aVar) {
            this.f87064a = kotlin.b.b(aVar);
        }

        public final SerialDescriptor a() {
            return (SerialDescriptor) this.f87064a.getValue();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public int c(String str) {
            tn.p.k(str, "name");
            return a().c(str);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public SerialDescriptor d(int i10) {
            return a().d(i10);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public int e() {
            return a().e();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public String f(int i10) {
            return a().f(i10);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public List<Annotation> g(int i10) {
            return a().g(i10);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public uo.k getKind() {
            return a().getKind();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public String h() {
            return a().h();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public boolean i(int i10) {
            return a().i(i10);
        }
    }

    @NotNull
    public static final g d(@NotNull Decoder decoder) {
        tn.p.k(decoder, "<this>");
        g gVar = decoder instanceof g ? (g) decoder : null;
        if (gVar != null) {
            return gVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + tn.t.b(decoder.getClass()));
    }

    @NotNull
    public static final r e(@NotNull Encoder encoder) {
        tn.p.k(encoder, "<this>");
        r rVar = encoder instanceof r ? (r) encoder : null;
        if (rVar != null) {
            return rVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + tn.t.b(encoder.getClass()));
    }

    public static final SerialDescriptor f(sn.a<? extends SerialDescriptor> aVar) {
        return new a(aVar);
    }

    public static final void g(Decoder decoder) {
        d(decoder);
    }

    public static final void h(Encoder encoder) {
        e(encoder);
    }
}
