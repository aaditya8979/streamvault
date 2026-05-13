package wo;

import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Tagged.kt */
/* JADX INFO: loaded from: classes4.dex */
public abstract class n1 extends z2<String> {
    @NotNull
    public abstract String f0(@NotNull String str, @NotNull String str2);

    @NotNull
    public String g0(@NotNull SerialDescriptor serialDescriptor, int i10) {
        tn.p.k(serialDescriptor, "descriptor");
        return serialDescriptor.f(i10);
    }

    @Override // wo.z2
    @NotNull
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public final String a0(@NotNull SerialDescriptor serialDescriptor, int i10) {
        tn.p.k(serialDescriptor, "<this>");
        return i0(g0(serialDescriptor, i10));
    }

    @NotNull
    public final String i0(@NotNull String str) {
        tn.p.k(str, "nestedName");
        String strZ = Z();
        if (strZ == null) {
            strZ = "";
        }
        return f0(strZ, str);
    }

    @NotNull
    public final String j0() {
        return b0().isEmpty() ? "$" : cn.f0.D0(b0(), ".", "$.", null, 0, null, null, 60, null);
    }
}
