package go;

import kotlinx.coroutines.flow.DistinctFlowImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Distinct.kt */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final sn.l<Object, Object> f62648a = new sn.l() { // from class: go.h
        @Override // sn.l
        public final Object invoke(Object obj) {
            return j.d(obj);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final sn.p<Object, Object, Boolean> f62649b = new sn.p() { // from class: go.i
        @Override // sn.p
        /* JADX INFO: renamed from: invoke */
        public final Object mo2invoke(Object obj, Object obj2) {
            return Boolean.valueOf(j.c(obj, obj2));
        }
    };

    public static final boolean c(Object obj, Object obj2) {
        return tn.p.f(obj, obj2);
    }

    public static final Object d(Object obj) {
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> d<T> e(@NotNull d<? extends T> dVar) {
        return dVar instanceof u ? dVar : f(dVar, f62648a, f62649b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> d<T> f(d<? extends T> dVar, sn.l<? super T, ? extends Object> lVar, sn.p<Object, Object, Boolean> pVar) {
        if (dVar instanceof DistinctFlowImpl) {
            DistinctFlowImpl distinctFlowImpl = (DistinctFlowImpl) dVar;
            if (distinctFlowImpl.f73323c == lVar && distinctFlowImpl.f73324d == pVar) {
                return dVar;
            }
        }
        return new DistinctFlowImpl(dVar, lVar, pVar);
    }
}
