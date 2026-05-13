package jm;

import a.h;
import dm.o;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.ScalarSubscription;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: FlowableScalarXMap.java */
/* JADX INFO: loaded from: classes10.dex */
public final class e {

    /* JADX INFO: compiled from: FlowableScalarXMap.java */
    public static final class a<T, R> extends xl.e<R> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final T f72496c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final o<? super T, ? extends ms.a<? extends R>> f72497d;

        public a(T t10, o<? super T, ? extends ms.a<? extends R>> oVar) {
            this.f72496c = t10;
            this.f72497d = oVar;
        }

        @Override // xl.e
        public void n(ms.b<? super R> bVar) {
            try {
                ms.a aVar = (ms.a) fm.a.e(this.f72497d.apply(this.f72496c), "The mapper returned a null Publisher");
                if (!(aVar instanceof Callable)) {
                    aVar.a(bVar);
                    return;
                }
                try {
                    Object objCall = ((Callable) aVar).call();
                    if (objCall == null) {
                        EmptySubscription.complete(bVar);
                    } else {
                        bVar.onSubscribe(new ScalarSubscription(bVar, objCall));
                    }
                } catch (Throwable th2) {
                    cm.a.b(th2);
                    EmptySubscription.error(th2, bVar);
                }
            } catch (Throwable th3) {
                EmptySubscription.error(th3, bVar);
            }
        }
    }

    public static <T, U> xl.e<U> a(T t10, o<? super T, ? extends ms.a<? extends U>> oVar) {
        return tm.a.m(new a(t10, oVar));
    }

    public static <T, R> boolean b(ms.a<T> aVar, ms.b<? super R> bVar, o<? super T, ? extends ms.a<? extends R>> oVar) {
        if (!(aVar instanceof Callable)) {
            return false;
        }
        try {
            h hVar = (Object) ((Callable) aVar).call();
            if (hVar == null) {
                EmptySubscription.complete(bVar);
                return true;
            }
            try {
                ms.a aVar2 = (ms.a) fm.a.e(oVar.apply(hVar), "The mapper returned a null Publisher");
                if (aVar2 instanceof Callable) {
                    try {
                        Object objCall = ((Callable) aVar2).call();
                        if (objCall == null) {
                            EmptySubscription.complete(bVar);
                            return true;
                        }
                        bVar.onSubscribe(new ScalarSubscription(bVar, objCall));
                    } catch (Throwable th2) {
                        cm.a.b(th2);
                        EmptySubscription.error(th2, bVar);
                        return true;
                    }
                } else {
                    aVar2.a(bVar);
                }
                return true;
            } catch (Throwable th3) {
                cm.a.b(th3);
                EmptySubscription.error(th3, bVar);
                return true;
            }
        } catch (Throwable th4) {
            cm.a.b(th4);
            EmptySubscription.error(th4, bVar);
            return true;
        }
    }
}
