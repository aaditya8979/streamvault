package uo;

import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;
import wo.q2;

/* JADX INFO: compiled from: ContextAware.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class b {
    @Nullable
    public static final KClass<?> a(@NotNull SerialDescriptor serialDescriptor) {
        p.k(serialDescriptor, "<this>");
        if (serialDescriptor instanceof c) {
            return ((c) serialDescriptor).f85739b;
        }
        if (serialDescriptor instanceof q2) {
            return a(((q2) serialDescriptor).j());
        }
        return null;
    }

    @Nullable
    public static final SerialDescriptor b(@NotNull zo.c cVar, @NotNull SerialDescriptor serialDescriptor) {
        KSerializer kSerializerC;
        p.k(cVar, "<this>");
        p.k(serialDescriptor, "descriptor");
        KClass<?> kClassA = a(serialDescriptor);
        if (kClassA == null || (kSerializerC = zo.c.c(cVar, kClassA, null, 2, null)) == null) {
            return null;
        }
        return kSerializerC.getDescriptor();
    }

    @NotNull
    public static final SerialDescriptor c(@NotNull SerialDescriptor serialDescriptor, @NotNull KClass<?> kClass) {
        p.k(serialDescriptor, "<this>");
        p.k(kClass, GAMConfig.KEY_CONTEXT);
        return new c(serialDescriptor, kClass);
    }
}
