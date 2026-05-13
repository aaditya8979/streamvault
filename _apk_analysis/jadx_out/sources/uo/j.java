package uo;

import bn.r;
import bo.d0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import tn.p;
import uo.l;
import wo.o2;

/* JADX INFO: compiled from: SerialDescriptors.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class j {
    @NotNull
    public static final SerialDescriptor b(@NotNull String str, @NotNull e eVar) {
        p.k(str, "serialName");
        p.k(eVar, "kind");
        if (!d0.u0(str)) {
            return o2.a(str, eVar);
        }
        throw new IllegalArgumentException("Blank serial names are prohibited".toString());
    }

    @NotNull
    public static final SerialDescriptor c(@NotNull String str, @NotNull SerialDescriptor[] serialDescriptorArr, @NotNull sn.l<? super a, r> lVar) {
        p.k(str, "serialName");
        p.k(serialDescriptorArr, "typeParameters");
        p.k(lVar, "builderAction");
        if (!(!d0.u0(str))) {
            throw new IllegalArgumentException("Blank serial names are prohibited".toString());
        }
        a aVar = new a(str);
        lVar.invoke(aVar);
        return new g(str, l.a.f85773a, aVar.f().size(), cn.r.G0(serialDescriptorArr), aVar);
    }

    @NotNull
    public static final SerialDescriptor d(@NotNull String str, @NotNull k kVar, @NotNull SerialDescriptor[] serialDescriptorArr, @NotNull sn.l<? super a, r> lVar) {
        p.k(str, "serialName");
        p.k(kVar, "kind");
        p.k(serialDescriptorArr, "typeParameters");
        p.k(lVar, "builder");
        if (!(!d0.u0(str))) {
            throw new IllegalArgumentException("Blank serial names are prohibited".toString());
        }
        if (!(!p.f(kVar, l.a.f85773a))) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead".toString());
        }
        a aVar = new a(str);
        lVar.invoke(aVar);
        return new g(str, kVar, aVar.f().size(), cn.r.G0(serialDescriptorArr), aVar);
    }

    public static /* synthetic */ SerialDescriptor e(String str, k kVar, SerialDescriptor[] serialDescriptorArr, sn.l lVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            lVar = new sn.l() { // from class: uo.i
                @Override // sn.l
                public final Object invoke(Object obj2) {
                    return j.f((a) obj2);
                }
            };
        }
        return d(str, kVar, serialDescriptorArr, lVar);
    }

    public static final r f(a aVar) {
        p.k(aVar, "<this>");
        return r.f5635a;
    }
}
