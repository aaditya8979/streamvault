package wo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Caching.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class y<T> implements z1<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final sn.p<KClass<Object>, List<? extends KType>, KSerializer<T>> f86644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ConcurrentHashMap<Class<?>, y1<T>> f86645b;

    /* JADX WARN: Multi-variable type inference failed */
    public y(@NotNull sn.p<? super KClass<Object>, ? super List<? extends KType>, ? extends KSerializer<T>> pVar) {
        tn.p.k(pVar, "compute");
        this.f86644a = pVar;
        this.f86645b = new ConcurrentHashMap<>();
    }

    @Override // wo.z1
    @NotNull
    public Object a(@NotNull KClass<Object> kClass, @NotNull List<? extends KType> list) {
        Object objM7534constructorimpl;
        y1<T> y1VarPutIfAbsent;
        tn.p.k(kClass, "key");
        tn.p.k(list, "types");
        ConcurrentHashMap<Class<?>, y1<T>> concurrentHashMap = this.f86645b;
        Class<?> clsA = rn.a.a(kClass);
        y1<T> y1Var = concurrentHashMap.get(clsA);
        if (y1Var == null && (y1VarPutIfAbsent = concurrentHashMap.putIfAbsent(clsA, (y1Var = new y1<>()))) != null) {
            y1Var = y1VarPutIfAbsent;
        }
        y1<T> y1Var2 = y1Var;
        ArrayList arrayList = new ArrayList(cn.x.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new x0((KType) it.next()));
        }
        ConcurrentHashMap concurrentHashMap2 = y1Var2.f86648a;
        Object obj = concurrentHashMap2.get(arrayList);
        if (obj == null) {
            try {
                Result.a aVar = Result.Companion;
                objM7534constructorimpl = Result.m7534constructorimpl(this.f86644a.mo2invoke(kClass, list));
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
            }
            Result resultM7533boximpl = Result.m7533boximpl(objM7534constructorimpl);
            Object objPutIfAbsent = concurrentHashMap2.putIfAbsent(arrayList, resultM7533boximpl);
            obj = objPutIfAbsent == null ? resultM7533boximpl : objPutIfAbsent;
        }
        tn.p.j(obj, "getOrPut(...)");
        return ((Result) obj).m7542unboximpl();
    }
}
