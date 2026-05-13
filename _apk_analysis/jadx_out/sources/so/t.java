package so;

import java.util.List;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class t {
    @Nullable
    public static final KSerializer<? extends Object> a(@NotNull KClass<Object> kClass, @NotNull List<? extends KSerializer<Object>> list, @NotNull sn.a<? extends KClassifier> aVar) {
        return v.e(kClass, list, aVar);
    }

    @NotNull
    public static final KSerializer<Object> b(@NotNull zo.c cVar, @NotNull KType kType) {
        return v.f(cVar, kType);
    }

    @Nullable
    public static final <T> KSerializer<T> c(@NotNull KClass<T> kClass) {
        return v.i(kClass);
    }

    @Nullable
    public static final KSerializer<Object> d(@NotNull zo.c cVar, @NotNull KType kType) {
        return v.j(cVar, kType);
    }

    @Nullable
    public static final List<KSerializer<Object>> e(@NotNull zo.c cVar, @NotNull List<? extends KType> list, boolean z10) {
        return v.k(cVar, list, z10);
    }
}
