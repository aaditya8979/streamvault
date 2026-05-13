package zo;

import cn.w;
import java.util.List;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import so.l;
import tn.i;

/* JADX INFO: compiled from: SerializersModule.kt */
/* JADX INFO: loaded from: classes7.dex */
public abstract class c {
    public c() {
    }

    public /* synthetic */ c(i iVar) {
        this();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KSerializer c(c cVar, KClass kClass, List list, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContextual");
        }
        if ((i10 & 2) != 0) {
            list = w.m();
        }
        return cVar.b(kClass, list);
    }

    public abstract void a(@NotNull f fVar);

    @Nullable
    public abstract <T> KSerializer<T> b(@NotNull KClass<T> kClass, @NotNull List<? extends KSerializer<?>> list);

    public abstract boolean d();

    @Nullable
    public abstract <T> so.c<T> e(@NotNull KClass<? super T> kClass, @Nullable String str);

    @Nullable
    public abstract <T> l<T> f(@NotNull KClass<? super T> kClass, @NotNull T t10);
}
