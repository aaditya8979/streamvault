package wo;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Primitives.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class q3 implements KSerializer<bn.r> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final q3 f86598b = new q3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v1<bn.r> f86599a = new v1<>("kotlin.Unit", bn.r.f5635a);

    public void b(@NotNull Decoder decoder) {
        tn.p.k(decoder, "decoder");
        this.f86599a.deserialize(decoder);
    }

    @Override // so.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void serialize(@NotNull Encoder encoder, @NotNull bn.r rVar) {
        tn.p.k(encoder, "encoder");
        tn.p.k(rVar, "value");
        this.f86599a.serialize(encoder, rVar);
    }

    @Override // so.c
    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        b(decoder);
        return bn.r.f5635a;
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.f86599a.getDescriptor();
    }
}
