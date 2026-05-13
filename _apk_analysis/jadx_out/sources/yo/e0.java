package yo;

import java.util.Map;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SchemaCache.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Map<SerialDescriptor, Map<a<Object>, Object>> f97923a = d0.a(16);

    /* JADX INFO: compiled from: SchemaCache.kt */
    public static final class a<T> {
    }

    @Nullable
    public final <T> T a(@NotNull SerialDescriptor serialDescriptor, @NotNull a<T> aVar) {
        tn.p.k(serialDescriptor, "descriptor");
        tn.p.k(aVar, "key");
        Map<a<Object>, Object> map = this.f97923a.get(serialDescriptor);
        Object obj = map != null ? map.get(aVar) : null;
        if (obj == null) {
            return null;
        }
        return (T) obj;
    }

    @NotNull
    public final <T> T b(@NotNull SerialDescriptor serialDescriptor, @NotNull a<T> aVar, @NotNull sn.a<? extends T> aVar2) {
        tn.p.k(serialDescriptor, "descriptor");
        tn.p.k(aVar, "key");
        tn.p.k(aVar2, "defaultValue");
        T t10 = (T) a(serialDescriptor, aVar);
        if (t10 != null) {
            return t10;
        }
        T tInvoke = aVar2.invoke();
        c(serialDescriptor, aVar, tInvoke);
        return tInvoke;
    }

    public final <T> void c(@NotNull SerialDescriptor serialDescriptor, @NotNull a<T> aVar, @NotNull T t10) {
        tn.p.k(serialDescriptor, "descriptor");
        tn.p.k(aVar, "key");
        tn.p.k(t10, "value");
        Map<SerialDescriptor, Map<a<Object>, Object>> map = this.f97923a;
        Map<a<Object>, Object> mapA = map.get(serialDescriptor);
        if (mapA == null) {
            mapA = d0.a(2);
            map.put(serialDescriptor, mapA);
        }
        mapA.put(aVar, t10);
    }
}
