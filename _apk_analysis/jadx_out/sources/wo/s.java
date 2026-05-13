package wo;

import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Caching.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class s<T> implements s2<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final sn.l<KClass<?>, KSerializer<T>> f86607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final u<m<T>> f86608b;

    /* JADX INFO: compiled from: Caching.kt */
    public static final class a implements sn.a<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ KClass f86610c;

        public a(KClass kClass) {
            this.f86610c = kClass;
        }

        @Override // sn.a
        public final T invoke() {
            return (T) new m(s.this.b().invoke(this.f86610c));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s(@NotNull sn.l<? super KClass<?>, ? extends KSerializer<T>> lVar) {
        tn.p.k(lVar, "compute");
        this.f86607a = lVar;
        this.f86608b = new u<>();
    }

    @Override // wo.s2
    @Nullable
    public KSerializer<T> a(@NotNull KClass<Object> kClass) {
        tn.p.k(kClass, "key");
        m<T> mVar = this.f86608b.get(rn.a.a(kClass));
        tn.p.j(mVar, "get(...)");
        l1 l1Var = (l1) mVar;
        T t10 = l1Var.f86567a.get();
        if (t10 == null) {
            t10 = (T) l1Var.a(new a(kClass));
        }
        return t10.f86570a;
    }

    @NotNull
    public final sn.l<KClass<?>, KSerializer<T>> b() {
        return this.f86607a;
    }
}
