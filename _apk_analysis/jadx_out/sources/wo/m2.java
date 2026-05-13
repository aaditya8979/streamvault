package wo;

import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import wo.k2;

/* JADX INFO: compiled from: CollectionSerializers.kt */
/* JADX INFO: loaded from: classes4.dex */
public abstract class m2<Element, Array, Builder extends k2<Array>> extends v<Element, Array, Builder> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final SerialDescriptor f86571b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(@NotNull KSerializer<Element> kSerializer) {
        super(kSerializer, null);
        tn.p.k(kSerializer, "primitiveSerializer");
        this.f86571b = new l2(kSerializer.getDescriptor());
    }

    @Override // wo.a, so.c
    public final Array deserialize(@NotNull Decoder decoder) {
        tn.p.k(decoder, "decoder");
        return g(decoder, null);
    }

    @Override // wo.a
    @NotNull
    public final Iterator<Element> e(Array array) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead".toString());
    }

    @Override // wo.v, kotlinx.serialization.KSerializer, so.l, so.c
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return this.f86571b;
    }

    @Override // wo.v
    public final void insert(@NotNull Builder builder, int i10, Element element) {
        tn.p.k(builder, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead".toString());
    }

    @Override // wo.a
    @NotNull
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final Builder b() {
        return l(r());
    }

    @Override // wo.a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final int c(@NotNull Builder builder) {
        tn.p.k(builder, "<this>");
        return builder.d();
    }

    @Override // wo.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void d(@NotNull Builder builder, int i10) {
        tn.p.k(builder, "<this>");
        builder.b(i10);
    }

    public abstract Array r();

    @Override // wo.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final Array m(@NotNull Builder builder) {
        tn.p.k(builder, "<this>");
        return (Array) builder.a();
    }

    @Override // wo.v, so.l
    public final void serialize(@NotNull Encoder encoder, Array array) {
        tn.p.k(encoder, "encoder");
        int iF = f(array);
        SerialDescriptor serialDescriptor = this.f86571b;
        vo.d dVarA = encoder.A(serialDescriptor, iF);
        t(dVarA, array, iF);
        dVarA.c(serialDescriptor);
    }

    public abstract void t(@NotNull vo.d dVar, Array array, int i10);
}
