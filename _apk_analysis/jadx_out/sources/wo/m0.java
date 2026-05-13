package wo;

import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PluginHelperInterfaces.kt */
/* JADX INFO: loaded from: classes7.dex */
public interface m0<T> extends KSerializer<T> {

    /* JADX INFO: compiled from: PluginHelperInterfaces.kt */
    public static final class a {
        @Deprecated
        @NotNull
        public static <T> KSerializer<?>[] a(@NotNull m0<T> m0Var) {
            return m0.super.typeParametersSerializers();
        }
    }

    @NotNull
    KSerializer<?>[] childSerializers();

    @NotNull
    default KSerializer<?>[] typeParametersSerializers() {
        return j2.f86554a;
    }
}
