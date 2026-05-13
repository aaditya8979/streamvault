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
/* JADX INFO: loaded from: classes8.dex */
public final class t<T> implements z1<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final sn.p<KClass<Object>, List<? extends KType>, KSerializer<T>> f86614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final u<y1<T>> f86615b;

    /* JADX INFO: compiled from: Caching.kt */
    public static final class a implements sn.a<T> {
        @Override // sn.a
        public final T invoke() {
            return (T) new y1();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t(@NotNull sn.p<? super KClass<Object>, ? super List<? extends KType>, ? extends KSerializer<T>> pVar) {
        tn.p.k(pVar, "compute");
        this.f86614a = pVar;
        this.f86615b = new u<>();
    }

    @Override // wo.z1
    @NotNull
    public Object a(@NotNull KClass<Object> kClass, @NotNull List<? extends KType> list) {
        Object objM7534constructorimpl;
        tn.p.k(kClass, "key");
        tn.p.k(list, "types");
        y1<T> y1Var = this.f86615b.get(rn.a.a(kClass));
        tn.p.j(y1Var, "get(...)");
        l1 l1Var = (l1) y1Var;
        T t10 = l1Var.f86567a.get();
        if (t10 == null) {
            t10 = (T) l1Var.a(new a());
        }
        y1 y1Var2 = t10;
        ArrayList arrayList = new ArrayList(cn.x.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new x0((KType) it.next()));
        }
        ConcurrentHashMap concurrentHashMap = y1Var2.f86648a;
        Object obj = concurrentHashMap.get(arrayList);
        if (obj == null) {
            try {
                Result.a aVar = Result.Companion;
                objM7534constructorimpl = Result.m7534constructorimpl(this.f86614a.mo2invoke(kClass, list));
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
            }
            Result resultM7533boximpl = Result.m7533boximpl(objM7534constructorimpl);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(arrayList, resultM7533boximpl);
            obj = objPutIfAbsent == null ? resultM7533boximpl : objPutIfAbsent;
        }
        tn.p.j(obj, "getOrPut(...)");
        return ((Result) obj).m7542unboximpl();
    }
}
