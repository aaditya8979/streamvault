package wo;

import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AbstractPolymorphicSerializer.kt */
/* JADX INFO: loaded from: classes12.dex */
public abstract class b<T> implements KSerializer<T> {
    public final T c(vo.c cVar) {
        return (T) vo.c.e(cVar, getDescriptor(), 1, so.h.a(this, cVar, cVar.k(getDescriptor(), 0)), null, 8, null);
    }

    @Nullable
    public so.c<T> d(@NotNull vo.c cVar, @Nullable String str) {
        tn.p.k(cVar, "decoder");
        return cVar.a().e(f(), str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // so.c
    @NotNull
    public final T deserialize(@NotNull Decoder decoder) {
        T t10;
        tn.p.k(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        vo.c cVarB = decoder.b(descriptor);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        if (cVarB.l()) {
            t10 = (T) c(cVarB);
        } else {
            t10 = null;
            while (true) {
                int iW = cVarB.w(getDescriptor());
                if (iW != -1) {
                    if (iW == 0) {
                        ref$ObjectRef.element = (T) cVarB.k(getDescriptor(), iW);
                    } else {
                        if (iW != 1) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Invalid index in polymorphic deserialization of ");
                            String str = (String) ref$ObjectRef.element;
                            if (str == null) {
                                str = "unknown class";
                            }
                            sb2.append(str);
                            sb2.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                            sb2.append(iW);
                            throw new SerializationException(sb2.toString());
                        }
                        T t11 = ref$ObjectRef.element;
                        if (t11 == 0) {
                            throw new IllegalArgumentException("Cannot read polymorphic value before its type token".toString());
                        }
                        ref$ObjectRef.element = t11;
                        t10 = (T) vo.c.e(cVarB, getDescriptor(), iW, so.h.a(this, cVarB, (String) t11), null, 8, null);
                    }
                } else {
                    if (t10 == null) {
                        throw new IllegalArgumentException(("Polymorphic value has not been read for class " + ((String) ref$ObjectRef.element)).toString());
                    }
                    tn.p.i(t10, "null cannot be cast to non-null type T of kotlinx.serialization.internal.AbstractPolymorphicSerializer");
                }
            }
        }
        cVarB.c(descriptor);
        return t10;
    }

    @Nullable
    public so.l<T> e(@NotNull Encoder encoder, @NotNull T t10) {
        tn.p.k(encoder, "encoder");
        tn.p.k(t10, "value");
        return encoder.a().f(f(), t10);
    }

    @NotNull
    public abstract KClass<T> f();

    @Override // so.l
    public final void serialize(@NotNull Encoder encoder, @NotNull T t10) {
        tn.p.k(encoder, "encoder");
        tn.p.k(t10, "value");
        so.l<? super T> lVarB = so.h.b(this, encoder, t10);
        SerialDescriptor descriptor = getDescriptor();
        vo.d dVarB = encoder.b(descriptor);
        dVarB.q(getDescriptor(), 0, lVarB.getDescriptor().h());
        SerialDescriptor descriptor2 = getDescriptor();
        tn.p.i(lVarB, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        dVarB.g(descriptor2, 1, lVarB, t10);
        dVarB.c(descriptor);
    }
}
