package zo;

import java.util.List;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: SerializersModuleCollector.kt */
/* JADX INFO: loaded from: classes7.dex */
public interface f {
    static KSerializer c(KSerializer kSerializer, List list) {
        p.k(list, "it");
        return kSerializer;
    }

    <T> void a(@NotNull KClass<T> kClass, @NotNull l<? super List<? extends KSerializer<?>>, ? extends KSerializer<?>> lVar);

    <Base> void b(@NotNull KClass<Base> kClass, @NotNull l<? super Base, ? extends so.l<? super Base>> lVar);

    <Base> void d(@NotNull KClass<Base> kClass, @NotNull l<? super String, ? extends so.c<? extends Base>> lVar);

    <Base, Sub extends Base> void f(@NotNull KClass<Base> kClass, @NotNull KClass<Sub> kClass2, @NotNull KSerializer<Sub> kSerializer);

    default <T> void g(@NotNull KClass<T> kClass, @NotNull final KSerializer<T> kSerializer) {
        p.k(kClass, "kClass");
        p.k(kSerializer, "serializer");
        a(kClass, new l() { // from class: zo.e
            @Override // sn.l
            public final Object invoke(Object obj) {
                return f.c(kSerializer, (List) obj);
            }
        });
    }
}
