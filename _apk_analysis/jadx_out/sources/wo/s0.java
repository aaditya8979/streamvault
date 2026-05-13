package wo;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: InlineClassDescriptor.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class s0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: InlineClassDescriptor.kt */
    public static final class a<T> implements m0<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ KSerializer<T> f86611a;

        public a(KSerializer<T> kSerializer) {
            this.f86611a = kSerializer;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // wo.m0
        public KSerializer<?>[] childSerializers() {
            return new KSerializer[]{this.f86611a};
        }

        @Override // so.c
        public T deserialize(Decoder decoder) {
            tn.p.k(decoder, "decoder");
            throw new IllegalStateException("unsupported".toString());
        }

        @Override // kotlinx.serialization.KSerializer, so.l, so.c
        public SerialDescriptor getDescriptor() {
            throw new IllegalStateException("unsupported".toString());
        }

        @Override // so.l
        public void serialize(Encoder encoder, T t10) {
            tn.p.k(encoder, "encoder");
            throw new IllegalStateException("unsupported".toString());
        }
    }

    @NotNull
    public static final <T> SerialDescriptor a(@NotNull String str, @NotNull KSerializer<T> kSerializer) {
        tn.p.k(str, "name");
        tn.p.k(kSerializer, "primitiveSerializer");
        return new r0(str, new a(kSerializer));
    }
}
