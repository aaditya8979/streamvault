package wo;

import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Platform.common.kt */
/* JADX INFO: loaded from: classes12.dex */
public interface s2<T> {
    @Nullable
    KSerializer<T> a(@NotNull KClass<Object> kClass);
}
