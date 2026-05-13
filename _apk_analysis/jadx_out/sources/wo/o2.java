package wo;

import java.util.Map;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Primitives.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Map<KClass<?>, KSerializer<?>> f86580a = a2.i();

    @NotNull
    public static final SerialDescriptor a(@NotNull String str, @NotNull uo.e eVar) {
        tn.p.k(str, "serialName");
        tn.p.k(eVar, "kind");
        c(str);
        return new n2(str, eVar);
    }

    @Nullable
    public static final <T> KSerializer<T> b(@NotNull KClass<T> kClass) {
        tn.p.k(kClass, "<this>");
        return (KSerializer) f86580a.get(kClass);
    }

    public static final void c(@NotNull String str) {
        tn.p.k(str, "serialName");
        for (KSerializer<?> kSerializer : f86580a.values()) {
            if (tn.p.f(str, kSerializer.getDescriptor().h())) {
                throw new IllegalArgumentException(bo.t.j("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name " + str + " there already exists " + tn.t.b(kSerializer.getClass()).getSimpleName() + ".\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
            }
        }
    }
}
