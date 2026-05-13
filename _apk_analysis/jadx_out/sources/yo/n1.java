package yo;

import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;
import uo.k;

/* JADX INFO: compiled from: TreeJsonEncoder.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class n1 {
    public static final boolean c(SerialDescriptor serialDescriptor) {
        return (serialDescriptor.getKind() instanceof uo.e) || serialDescriptor.getKind() == k.b.f85772a;
    }

    @NotNull
    public static final <T> JsonElement d(@NotNull xo.a aVar, T t10, @NotNull so.l<? super T> lVar) {
        tn.p.k(aVar, "json");
        tn.p.k(lVar, "serializer");
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        new v0(aVar, new sn.l() { // from class: yo.m1
            @Override // sn.l
            public final Object invoke(Object obj) {
                return n1.e(ref$ObjectRef, (JsonElement) obj);
            }
        }).z(lVar, t10);
        T t11 = ref$ObjectRef.element;
        if (t11 != null) {
            return (JsonElement) t11;
        }
        tn.p.C("result");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final bn.r e(Ref$ObjectRef ref$ObjectRef, JsonElement jsonElement) {
        tn.p.k(jsonElement, "it");
        ref$ObjectRef.element = jsonElement;
        return bn.r.f5635a;
    }
}
