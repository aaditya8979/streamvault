package yo;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.internal.WriteMode;
import org.jetbrains.annotations.NotNull;
import uo.k;
import uo.l;

/* JADX INFO: compiled from: WriteMode.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class o1 {
    @NotNull
    public static final SerialDescriptor a(@NotNull SerialDescriptor serialDescriptor, @NotNull zo.c cVar) {
        SerialDescriptor serialDescriptorA;
        tn.p.k(serialDescriptor, "<this>");
        tn.p.k(cVar, "module");
        if (!tn.p.f(serialDescriptor.getKind(), k.a.f85771a)) {
            return serialDescriptor.isInline() ? a(serialDescriptor.d(0), cVar) : serialDescriptor;
        }
        SerialDescriptor serialDescriptorB = uo.b.b(cVar, serialDescriptor);
        return (serialDescriptorB == null || (serialDescriptorA = a(serialDescriptorB, cVar)) == null) ? serialDescriptor : serialDescriptorA;
    }

    @NotNull
    public static final WriteMode b(@NotNull xo.a aVar, @NotNull SerialDescriptor serialDescriptor) {
        tn.p.k(aVar, "<this>");
        tn.p.k(serialDescriptor, CampaignEx.JSON_KEY_DESC);
        uo.k kind = serialDescriptor.getKind();
        if (kind instanceof uo.d) {
            return WriteMode.POLY_OBJ;
        }
        if (tn.p.f(kind, l.b.f85774a)) {
            return WriteMode.LIST;
        }
        if (!tn.p.f(kind, l.c.f85775a)) {
            return WriteMode.OBJ;
        }
        SerialDescriptor serialDescriptorA = a(serialDescriptor.d(0), aVar.a());
        uo.k kind2 = serialDescriptorA.getKind();
        if ((kind2 instanceof uo.e) || tn.p.f(kind2, k.b.f85772a)) {
            return WriteMode.MAP;
        }
        if (aVar.e().c()) {
            return WriteMode.LIST;
        }
        throw j0.d(serialDescriptorA);
    }
}
