package wo;

import java.util.Iterator;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CollectionSerializers.kt */
/* JADX INFO: loaded from: classes4.dex */
public abstract class k1<Key, Value, Collection, Builder extends Map<Key, Value>> extends a<Map.Entry<? extends Key, ? extends Value>, Collection, Builder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final KSerializer<Key> f86559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final KSerializer<Value> f86560b;

    public k1(KSerializer<Key> kSerializer, KSerializer<Value> kSerializer2) {
        super(null);
        this.f86559a = kSerializer;
        this.f86560b = kSerializer2;
    }

    public /* synthetic */ k1(KSerializer kSerializer, KSerializer kSerializer2, tn.i iVar) {
        this(kSerializer, kSerializer2);
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    @NotNull
    public abstract SerialDescriptor getDescriptor();

    @NotNull
    public final KSerializer<Key> n() {
        return this.f86559a;
    }

    @NotNull
    public final KSerializer<Value> o() {
        return this.f86560b;
    }

    @Override // wo.a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final void h(@NotNull vo.c cVar, @NotNull Builder builder, int i10, int i11) {
        tn.p.k(cVar, "decoder");
        tn.p.k(builder, "builder");
        if (!(i11 >= 0)) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL".toString());
        }
        zn.g gVarU = zn.n.u(zn.n.v(0, i11 * 2), 2);
        int iF = gVarU.f();
        int iG = gVarU.g();
        int iH = gVarU.h();
        if ((iH <= 0 || iF > iG) && (iH >= 0 || iG > iF)) {
            return;
        }
        while (true) {
            i(cVar, i10 + iF, builder, false);
            if (iF == iG) {
                return;
            } else {
                iF += iH;
            }
        }
    }

    @Override // wo.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void i(@NotNull vo.c cVar, int i10, @NotNull Builder builder, boolean z10) {
        int iW;
        tn.p.k(cVar, "decoder");
        tn.p.k(builder, "builder");
        Object objE = vo.c.e(cVar, getDescriptor(), i10, this.f86559a, null, 8, null);
        if (z10) {
            iW = cVar.w(getDescriptor());
            if (!(iW == i10 + 1)) {
                throw new IllegalArgumentException(("Value must follow key in a map, index for key: " + i10 + ", returned index for value: " + iW).toString());
            }
        } else {
            iW = i10 + 1;
        }
        int i11 = iW;
        builder.put(objE, (!builder.containsKey(objE) || (this.f86560b.getDescriptor().getKind() instanceof uo.e)) ? vo.c.e(cVar, getDescriptor(), i11, this.f86560b, null, 8, null) : cVar.i(getDescriptor(), i11, this.f86560b, kotlin.collections.a.k(builder, objE)));
    }

    @Override // so.l
    public void serialize(@NotNull Encoder encoder, Collection collection) {
        tn.p.k(encoder, "encoder");
        int iF = f(collection);
        SerialDescriptor descriptor = getDescriptor();
        vo.d dVarA = encoder.A(descriptor, iF);
        Iterator<Map.Entry<? extends Key, ? extends Value>> itE = e(collection);
        int i10 = 0;
        while (itE.hasNext()) {
            Map.Entry<? extends Key, ? extends Value> next = itE.next();
            Key key = next.getKey();
            Value value = next.getValue();
            int i11 = i10 + 1;
            dVarA.g(getDescriptor(), i10, n(), key);
            dVarA.g(getDescriptor(), i11, o(), value);
            i10 = i11 + 1;
        }
        dVarA.c(descriptor);
    }
}
