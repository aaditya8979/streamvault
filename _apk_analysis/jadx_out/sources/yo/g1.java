package yo;

import java.util.Set;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: StreamingJsonEncoder.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Set<SerialDescriptor> f97943a = cn.w0.j(to.a.v(bn.k.f5619c).getDescriptor(), to.a.w(bn.m.f5624c).getDescriptor(), to.a.u(bn.i.f5614c).getDescriptor(), to.a.x(bn.p.f5630c).getDescriptor());

    public static final boolean a(@NotNull SerialDescriptor serialDescriptor) {
        tn.p.k(serialDescriptor, "<this>");
        return serialDescriptor.isInline() && tn.p.f(serialDescriptor, xo.i.k());
    }

    public static final boolean b(@NotNull SerialDescriptor serialDescriptor) {
        tn.p.k(serialDescriptor, "<this>");
        return serialDescriptor.isInline() && f97943a.contains(serialDescriptor);
    }
}
