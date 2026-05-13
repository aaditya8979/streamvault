package wo;

import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Tagged.kt */
/* JADX INFO: loaded from: classes4.dex */
public abstract class o1 extends a3<String> {
    @NotNull
    public abstract String a0(@NotNull String str, @NotNull String str2);

    @NotNull
    public abstract String b0(@NotNull SerialDescriptor serialDescriptor, int i10);

    @Override // wo.a3
    @NotNull
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public final String X(@NotNull SerialDescriptor serialDescriptor, int i10) {
        tn.p.k(serialDescriptor, "<this>");
        return d0(b0(serialDescriptor, i10));
    }

    @NotNull
    public final String d0(@NotNull String str) {
        tn.p.k(str, "nestedName");
        String strW = W();
        if (strW == null) {
            strW = "";
        }
        return a0(strW, str);
    }
}
