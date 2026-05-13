package wo;

import java.util.Arrays;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: InlineClassDescriptor.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class r0 extends g2 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f86602m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(@NotNull String str, @NotNull m0<?> m0Var) {
        super(str, m0Var, 1);
        tn.p.k(str, "name");
        tn.p.k(m0Var, "generatedSerializer");
        this.f86602m = true;
    }

    @Override // wo.g2
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r0) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (tn.p.f(h(), serialDescriptor.h())) {
                r0 r0Var = (r0) obj;
                if ((r0Var.isInline() && Arrays.equals(s(), r0Var.s())) && e() == serialDescriptor.e()) {
                    int iE = e();
                    for (int i10 = 0; i10 < iE; i10++) {
                        if (tn.p.f(d(i10).h(), serialDescriptor.d(i10).h()) && tn.p.f(d(i10).getKind(), serialDescriptor.d(i10).getKind())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // wo.g2
    public int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isInline() {
        return this.f86602m;
    }
}
