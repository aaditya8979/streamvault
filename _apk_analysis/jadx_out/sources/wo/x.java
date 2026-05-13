package wo;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Caching.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class x<T> implements s2<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final sn.l<KClass<?>, KSerializer<T>> f86637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ConcurrentHashMap<Class<?>, m<T>> f86638b;

    /* JADX WARN: Multi-variable type inference failed */
    public x(@NotNull sn.l<? super KClass<?>, ? extends KSerializer<T>> lVar) {
        tn.p.k(lVar, "compute");
        this.f86637a = lVar;
        this.f86638b = new ConcurrentHashMap<>();
    }

    @Override // wo.s2
    @Nullable
    public KSerializer<T> a(@NotNull KClass<Object> kClass) {
        m<T> mVarPutIfAbsent;
        tn.p.k(kClass, "key");
        ConcurrentHashMap<Class<?>, m<T>> concurrentHashMap = this.f86638b;
        Class<?> clsA = rn.a.a(kClass);
        m<T> mVar = concurrentHashMap.get(clsA);
        if (mVar == null && (mVarPutIfAbsent = concurrentHashMap.putIfAbsent(clsA, (mVar = new m<>(this.f86637a.invoke(kClass))))) != null) {
            mVar = mVarPutIfAbsent;
        }
        return mVar.f86570a;
    }
}
