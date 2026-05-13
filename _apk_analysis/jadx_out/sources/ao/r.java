package ao;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes11.dex */
public class r extends m {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Sequences.kt */
    public static final class a<T> implements i<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Iterator f5217a;

        public a(Iterator it) {
            this.f5217a = it;
        }

        @Override // ao.i
        public Iterator<T> iterator() {
            return this.f5217a;
        }
    }

    @NotNull
    public static final <T> i<T> g(@NotNull Iterator<? extends T> it) {
        tn.p.k(it, "<this>");
        return h(new a(it));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> i<T> h(@NotNull i<? extends T> iVar) {
        tn.p.k(iVar, "<this>");
        return iVar instanceof ao.a ? iVar : new ao.a(iVar);
    }

    @NotNull
    public static final <T> i<T> i() {
        return d.f5184a;
    }

    @NotNull
    public static final <T> i<T> j(@NotNull i<? extends i<? extends T>> iVar) {
        tn.p.k(iVar, "<this>");
        return k(iVar, new sn.l() { // from class: ao.n
            @Override // sn.l
            public final Object invoke(Object obj) {
                return r.l((i) obj);
            }
        });
    }

    public static final <T, R> i<R> k(i<? extends T> iVar, sn.l<? super T, ? extends Iterator<? extends R>> lVar) {
        return iVar instanceof y ? ((y) iVar).e(lVar) : new f(iVar, new sn.l() { // from class: ao.q
            @Override // sn.l
            public final Object invoke(Object obj) {
                return r.m(obj);
            }
        }, lVar);
    }

    public static final Iterator l(i iVar) {
        tn.p.k(iVar, "it");
        return iVar.iterator();
    }

    public static final Object m(Object obj) {
        return obj;
    }

    @NotNull
    public static final <T> i<T> n(@Nullable final T t10, @NotNull sn.l<? super T, ? extends T> lVar) {
        tn.p.k(lVar, "nextFunction");
        return t10 == null ? d.f5184a : new g(new sn.a() { // from class: ao.p
            @Override // sn.a
            public final Object invoke() {
                return r.r(t10);
            }
        }, lVar);
    }

    @NotNull
    public static final <T> i<T> o(@NotNull final sn.a<? extends T> aVar) {
        tn.p.k(aVar, "nextFunction");
        return h(new g(aVar, new sn.l() { // from class: ao.o
            @Override // sn.l
            public final Object invoke(Object obj) {
                return r.q(aVar, obj);
            }
        }));
    }

    @NotNull
    public static final <T> i<T> p(@NotNull sn.a<? extends T> aVar, @NotNull sn.l<? super T, ? extends T> lVar) {
        tn.p.k(aVar, "seedFunction");
        tn.p.k(lVar, "nextFunction");
        return new g(aVar, lVar);
    }

    public static final Object q(sn.a aVar, Object obj) {
        tn.p.k(obj, "it");
        return aVar.invoke();
    }

    public static final Object r(Object obj) {
        return obj;
    }

    @NotNull
    public static final <T> i<T> s(@NotNull T... tArr) {
        tn.p.k(tArr, "elements");
        return cn.r.K(tArr);
    }
}
