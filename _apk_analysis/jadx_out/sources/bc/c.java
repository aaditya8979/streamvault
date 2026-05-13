package bc;

import dm.o;
import xl.t;
import xl.v;

/* JADX INFO: compiled from: RxUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: compiled from: RxUtils.java */
    public static class a<T> implements o<Throwable, t<T>> {
        public a() {
        }

        public /* synthetic */ a(b bVar) {
            this();
        }

        @Override // dm.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public t<T> apply(Throwable th2) {
            return t.f(bc.a.a(th2));
        }
    }

    public static <T> t<T> a(t<T> tVar) {
        return tVar.j(new a(null));
    }

    public static <T> v<T> b(t<T> tVar) {
        return tVar.n(vm.a.b()).i(am.a.a());
    }
}
