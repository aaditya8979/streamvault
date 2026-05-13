package wo;

import java.util.Arrays;
import java.util.Iterator;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PluginGeneratedSerialDescriptor.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class i2 {
    public static final int b(@NotNull SerialDescriptor serialDescriptor, @NotNull SerialDescriptor[] serialDescriptorArr) {
        tn.p.k(serialDescriptor, "<this>");
        tn.p.k(serialDescriptorArr, "typeParams");
        int iHashCode = (serialDescriptor.h().hashCode() * 31) + Arrays.hashCode(serialDescriptorArr);
        Iterable<SerialDescriptor> iterableA = uo.h.a(serialDescriptor);
        Iterator<SerialDescriptor> it = iterableA.iterator();
        int iHashCode2 = 1;
        int i10 = 1;
        while (true) {
            int iHashCode3 = 0;
            if (!it.hasNext()) {
                break;
            }
            int i11 = i10 * 31;
            String strH = it.next().h();
            if (strH != null) {
                iHashCode3 = strH.hashCode();
            }
            i10 = i11 + iHashCode3;
        }
        Iterator<SerialDescriptor> it2 = iterableA.iterator();
        while (it2.hasNext()) {
            int i12 = iHashCode2 * 31;
            uo.k kind = it2.next().getKind();
            iHashCode2 = i12 + (kind != null ? kind.hashCode() : 0);
        }
        return (((iHashCode * 31) + i10) * 31) + iHashCode2;
    }

    @NotNull
    public static final String c(@NotNull final SerialDescriptor serialDescriptor) {
        tn.p.k(serialDescriptor, "<this>");
        return cn.f0.D0(zn.n.v(0, serialDescriptor.e()), ", ", serialDescriptor.h() + '(', ")", 0, null, new sn.l() { // from class: wo.h2
            @Override // sn.l
            public final Object invoke(Object obj) {
                return i2.d(serialDescriptor, ((Integer) obj).intValue());
            }
        }, 24, null);
    }

    public static final CharSequence d(SerialDescriptor serialDescriptor, int i10) {
        return serialDescriptor.f(i10) + ": " + serialDescriptor.d(i10).h();
    }
}
