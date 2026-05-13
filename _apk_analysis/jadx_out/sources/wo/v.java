package wo;

import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CollectionSerializers.kt */
/* JADX INFO: loaded from: classes12.dex */
public abstract class v<Element, Collection, Builder> extends a<Element, Collection, Builder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final KSerializer<Element> f86625a;

    public v(KSerializer<Element> kSerializer) {
        super(null);
        this.f86625a = kSerializer;
    }

    public /* synthetic */ v(KSerializer kSerializer, tn.i iVar) {
        this(kSerializer);
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    @NotNull
    public abstract SerialDescriptor getDescriptor();

    @Override // wo.a
    public final void h(@NotNull vo.c cVar, Builder builder, int i10, int i11) {
        tn.p.k(cVar, "decoder");
        if (!(i11 >= 0)) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL".toString());
        }
        for (int i12 = 0; i12 < i11; i12++) {
            i(cVar, i10 + i12, builder, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // wo.a
    public void i(@NotNull vo.c cVar, int i10, Builder builder, boolean z10) {
        tn.p.k(cVar, "decoder");
        insert(builder, i10, vo.c.e(cVar, getDescriptor(), i10, this.f86625a, null, 8, null));
    }

    public abstract void insert(Builder builder, int i10, Element element);

    @Override // so.l
    public void serialize(@NotNull Encoder encoder, Collection collection) {
        tn.p.k(encoder, "encoder");
        int iF = f(collection);
        SerialDescriptor descriptor = getDescriptor();
        vo.d dVarA = encoder.A(descriptor, iF);
        Iterator<Element> itE = e(collection);
        for (int i10 = 0; i10 < iF; i10++) {
            dVarA.g(getDescriptor(), i10, this.f86625a, itE.next());
        }
        dVarA.c(descriptor);
    }
}
