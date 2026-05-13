package so;

import java.util.List;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wo.a2;
import wo.s2;
import wo.z1;

/* JADX INFO: compiled from: SerializersCache.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final s2<? extends Object> f84459a = wo.o.a(new sn.l() { // from class: so.m
        @Override // sn.l
        public final Object invoke(Object obj) {
            return s.k((KClass) obj);
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final s2<Object> f84460b = wo.o.a(new sn.l() { // from class: so.n
        @Override // sn.l
        public final Object invoke(Object obj) {
            return s.l((KClass) obj);
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final z1<? extends Object> f84461c = wo.o.b(new sn.p() { // from class: so.o
        @Override // sn.p
        /* JADX INFO: renamed from: invoke */
        public final Object mo2invoke(Object obj, Object obj2) {
            return s.g((KClass) obj, (List) obj2);
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final z1<Object> f84462d = wo.o.b(new sn.p() { // from class: so.p
        @Override // sn.p
        /* JADX INFO: renamed from: invoke */
        public final Object mo2invoke(Object obj, Object obj2) {
            return s.i((KClass) obj, (List) obj2);
        }
    });

    public static final KSerializer g(KClass kClass, final List list) {
        tn.p.k(kClass, "clazz");
        tn.p.k(list, "types");
        List<KSerializer<Object>> listE = t.e(zo.d.a(), list, true);
        tn.p.h(listE);
        return t.a(kClass, listE, new sn.a() { // from class: so.q
            @Override // sn.a
            public final Object invoke() {
                return s.h(list);
            }
        });
    }

    public static final KClassifier h(List list) {
        return ((KType) list.get(0)).getClassifier();
    }

    public static final KSerializer i(KClass kClass, final List list) {
        KSerializer kSerializerT;
        tn.p.k(kClass, "clazz");
        tn.p.k(list, "types");
        List<KSerializer<Object>> listE = t.e(zo.d.a(), list, true);
        tn.p.h(listE);
        KSerializer<? extends Object> kSerializerA = t.a(kClass, listE, new sn.a() { // from class: so.r
            @Override // sn.a
            public final Object invoke() {
                return s.j(list);
            }
        });
        if (kSerializerA == null || (kSerializerT = to.a.t(kSerializerA)) == null) {
            return null;
        }
        return kSerializerT;
    }

    public static final KClassifier j(List list) {
        return ((KType) list.get(0)).getClassifier();
    }

    public static final KSerializer k(KClass kClass) {
        tn.p.k(kClass, "it");
        KSerializer kSerializerC = t.c(kClass);
        if (kSerializerC != null) {
            return kSerializerC;
        }
        if (a2.l(kClass)) {
            return new g(kClass);
        }
        return null;
    }

    public static final KSerializer l(KClass kClass) {
        KSerializer kSerializerT;
        tn.p.k(kClass, "it");
        KSerializer kSerializerC = t.c(kClass);
        if (kSerializerC == null) {
            kSerializerC = a2.l(kClass) ? new g(kClass) : null;
        }
        if (kSerializerC == null || (kSerializerT = to.a.t(kSerializerC)) == null) {
            return null;
        }
        return kSerializerT;
    }

    @Nullable
    public static final KSerializer<Object> m(@NotNull KClass<Object> kClass, boolean z10) {
        tn.p.k(kClass, "clazz");
        if (z10) {
            return f84460b.a(kClass);
        }
        KSerializer<? extends Object> kSerializerA = f84459a.a(kClass);
        if (kSerializerA != null) {
            return kSerializerA;
        }
        return null;
    }

    @NotNull
    public static final Object n(@NotNull KClass<Object> kClass, @NotNull List<? extends KType> list, boolean z10) {
        tn.p.k(kClass, "clazz");
        tn.p.k(list, "types");
        return !z10 ? f84461c.a(kClass, list) : f84462d.a(kClass, list);
    }
}
