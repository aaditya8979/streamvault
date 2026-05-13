package so;

import cn.x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wo.a1;
import wo.a2;
import wo.b2;
import wo.c1;
import wo.o0;
import wo.o2;
import wo.q0;

/* JADX INFO: compiled from: Serializers.kt */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class v {
    public static final KSerializer<? extends Object> b(KClass<Object> kClass, List<? extends KSerializer<Object>> list, sn.a<? extends KClassifier> aVar) {
        if (tn.p.f(kClass, tn.t.b(Collection.class)) || tn.p.f(kClass, tn.t.b(List.class)) || tn.p.f(kClass, tn.t.b(List.class)) || tn.p.f(kClass, tn.t.b(ArrayList.class))) {
            return new wo.f(list.get(0));
        }
        if (tn.p.f(kClass, tn.t.b(HashSet.class))) {
            return new q0(list.get(0));
        }
        if (tn.p.f(kClass, tn.t.b(Set.class)) || tn.p.f(kClass, tn.t.b(Set.class)) || tn.p.f(kClass, tn.t.b(LinkedHashSet.class))) {
            return new c1(list.get(0));
        }
        if (tn.p.f(kClass, tn.t.b(HashMap.class))) {
            return new o0(list.get(0), list.get(1));
        }
        if (tn.p.f(kClass, tn.t.b(Map.class)) || tn.p.f(kClass, tn.t.b(Map.class)) || tn.p.f(kClass, tn.t.b(LinkedHashMap.class))) {
            return new a1(list.get(0), list.get(1));
        }
        if (tn.p.f(kClass, tn.t.b(Map.Entry.class))) {
            return to.a.j(list.get(0), list.get(1));
        }
        if (tn.p.f(kClass, tn.t.b(Pair.class))) {
            return to.a.m(list.get(0), list.get(1));
        }
        if (tn.p.f(kClass, tn.t.b(Triple.class))) {
            return to.a.o(list.get(0), list.get(1), list.get(2));
        }
        if (!a2.o(kClass)) {
            return null;
        }
        KClassifier kClassifierInvoke = aVar.invoke();
        tn.p.i(kClassifierInvoke, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
        return to.a.a((KClass) kClassifierInvoke, list.get(0));
    }

    public static final KSerializer<? extends Object> c(KClass<Object> kClass, List<? extends KSerializer<Object>> list) {
        KSerializer[] kSerializerArr = (KSerializer[]) list.toArray(new KSerializer[0]);
        return a2.d(kClass, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
    }

    public static final <T> KSerializer<T> d(KSerializer<T> kSerializer, boolean z10) {
        if (z10) {
            return to.a.t(kSerializer);
        }
        tn.p.i(kSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.SerializersKt__SerializersKt.nullable?>");
        return kSerializer;
    }

    @Nullable
    public static final KSerializer<? extends Object> e(@NotNull KClass<Object> kClass, @NotNull List<? extends KSerializer<Object>> list, @NotNull sn.a<? extends KClassifier> aVar) {
        tn.p.k(kClass, "<this>");
        tn.p.k(list, "serializers");
        tn.p.k(aVar, "elementClassifierIfArray");
        KSerializer<? extends Object> kSerializerB = b(kClass, list, aVar);
        return kSerializerB == null ? c(kClass, list) : kSerializerB;
    }

    @NotNull
    public static final KSerializer<Object> f(@NotNull zo.c cVar, @NotNull KType kType) {
        tn.p.k(cVar, "<this>");
        tn.p.k(kType, "type");
        KSerializer<Object> kSerializerG = g(cVar, kType, true);
        if (kSerializerG != null) {
            return kSerializerG;
        }
        a2.p(b2.c(kType));
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlinx.serialization.KSerializer<java.lang.Object> g(zo.c r6, kotlin.reflect.KType r7, boolean r8) {
        /*
            kotlin.reflect.KClass r0 = wo.b2.c(r7)
            boolean r1 = r7.isMarkedNullable()
            java.util.List r7 = r7.getArguments()
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = cn.x.x(r7, r3)
            r2.<init>(r3)
            java.util.Iterator r7 = r7.iterator()
        L1b:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L2f
            java.lang.Object r3 = r7.next()
            kotlin.reflect.KTypeProjection r3 = (kotlin.reflect.KTypeProjection) r3
            kotlin.reflect.KType r3 = wo.b2.g(r3)
            r2.add(r3)
            goto L1b
        L2f:
            boolean r7 = r2.isEmpty()
            r3 = 2
            r4 = 0
            if (r7 == 0) goto L49
            boolean r7 = wo.a2.l(r0)
            if (r7 == 0) goto L44
            kotlinx.serialization.KSerializer r7 = zo.c.c(r6, r0, r4, r3, r4)
            if (r7 == 0) goto L44
            goto L4f
        L44:
            kotlinx.serialization.KSerializer r7 = so.s.m(r0, r1)
            goto L5e
        L49:
            boolean r7 = r6.d()
            if (r7 == 0) goto L51
        L4f:
            r7 = r4
            goto L5e
        L51:
            java.lang.Object r7 = so.s.n(r0, r2, r1)
            boolean r5 = kotlin.Result.m7539isFailureimpl(r7)
            if (r5 == 0) goto L5c
            r7 = r4
        L5c:
            kotlinx.serialization.KSerializer r7 = (kotlinx.serialization.KSerializer) r7
        L5e:
            if (r7 == 0) goto L61
            return r7
        L61:
            boolean r7 = r2.isEmpty()
            if (r7 == 0) goto L82
            kotlinx.serialization.KSerializer r7 = so.t.c(r0)
            if (r7 != 0) goto La7
            kotlinx.serialization.KSerializer r7 = zo.c.c(r6, r0, r4, r3, r4)
            if (r7 != 0) goto La7
            boolean r6 = wo.a2.l(r0)
            if (r6 == 0) goto L80
            so.g r6 = new so.g
            r6.<init>(r0)
        L7e:
            r7 = r6
            goto La7
        L80:
            r7 = r4
            goto La7
        L82:
            java.util.List r7 = so.t.e(r6, r2, r8)
            if (r7 != 0) goto L89
            return r4
        L89:
            so.u r8 = new so.u
            r8.<init>()
            kotlinx.serialization.KSerializer r8 = so.t.a(r0, r7, r8)
            if (r8 != 0) goto La6
            kotlinx.serialization.KSerializer r7 = r6.b(r0, r7)
            if (r7 != 0) goto La7
            boolean r6 = wo.a2.l(r0)
            if (r6 == 0) goto L80
            so.g r6 = new so.g
            r6.<init>(r0)
            goto L7e
        La6:
            r7 = r8
        La7:
            if (r7 == 0) goto Lad
            kotlinx.serialization.KSerializer r4 = d(r7, r1)
        Lad:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: so.v.g(zo.c, kotlin.reflect.KType, boolean):kotlinx.serialization.KSerializer");
    }

    public static final KClassifier h(List list) {
        return ((KType) list.get(0)).getClassifier();
    }

    @Nullable
    public static final <T> KSerializer<T> i(@NotNull KClass<T> kClass) {
        tn.p.k(kClass, "<this>");
        KSerializer<T> kSerializerB = a2.b(kClass);
        return kSerializerB == null ? o2.b(kClass) : kSerializerB;
    }

    @Nullable
    public static final KSerializer<Object> j(@NotNull zo.c cVar, @NotNull KType kType) {
        tn.p.k(cVar, "<this>");
        tn.p.k(kType, "type");
        return g(cVar, kType, false);
    }

    @Nullable
    public static final List<KSerializer<Object>> k(@NotNull zo.c cVar, @NotNull List<? extends KType> list, boolean z10) {
        ArrayList arrayList;
        tn.p.k(cVar, "<this>");
        tn.p.k(list, "typeArguments");
        if (z10) {
            arrayList = new ArrayList(x.x(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(t.b(cVar, (KType) it.next()));
            }
        } else {
            arrayList = new ArrayList(x.x(list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                KSerializer<Object> kSerializerD = t.d(cVar, (KType) it2.next());
                if (kSerializerD == null) {
                    return null;
                }
                arrayList.add(kSerializerD);
            }
        }
        return arrayList;
    }
}
