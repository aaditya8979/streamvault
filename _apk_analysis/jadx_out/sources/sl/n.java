package sl;

import io.ktor.utils.io.DefaultJvmSerializerReplacement;
import io.ktor.utils.io.JvmSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: JvmSerializable.jvm.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class n {
    @NotNull
    public static final <T> Object a(@NotNull JvmSerializer<T> jvmSerializer, @NotNull T t10) {
        tn.p.k(jvmSerializer, "serializer");
        tn.p.k(t10, "value");
        return new DefaultJvmSerializerReplacement(jvmSerializer, t10);
    }
}
