package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a0;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$IntRef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Comparator<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a0> f50681a = new Comparator() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.p
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return u.b((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a0) obj, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a0) obj2);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Comparator<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n> f50682b = new Comparator() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.q
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return u.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n) obj, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n) obj2);
        }
    };

    public static final int a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n nVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n nVar2) {
        return f50681a.compare(nVar.f(), nVar2.f());
    }

    public static final int b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a0 a0Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a0 a0Var2) {
        tn.p.h(a0Var2);
        int iQ = q(a0Var2);
        tn.p.h(a0Var);
        return tn.p.m(iQ, q(a0Var));
    }

    public static final bn.r c(Ref$IntRef ref$IntRef, Ref$IntRef ref$IntRef2, Pair pair) {
        tn.p.k(pair, "<destruct>");
        boolean zBooleanValue = ((Boolean) pair.component1()).booleanValue();
        boolean zBooleanValue2 = ((Boolean) pair.component2()).booleanValue();
        if (zBooleanValue) {
            ref$IntRef.element++;
        }
        if (zBooleanValue2) {
            ref$IntRef2.element++;
        }
        return bn.r.f5635a;
    }

    public static final Double d(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.s sVar, double d10, Long l10) {
        Double dE = e(sVar, l10);
        if (dE != null) {
            return Double.valueOf(dE.doubleValue() - d10);
        }
        return null;
    }

    public static final Double e(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.s sVar, Long l10) {
        if (l10 == null) {
            return null;
        }
        Double dValueOf = sVar.b() != null ? Double.valueOf(sVar.b().intValue()) : (sVar.d() == null || sVar.f() == null) ? null : Double.valueOf(((double) (sVar.d().intValue() - sVar.f().intValue())) / 2.0d);
        if (dValueOf != null) {
            return Double.valueOf((dValueOf.doubleValue() / ((double) 8192)) * (l10.longValue() / 1000.0d));
        }
        return null;
    }

    public static final Double f(Integer num, Integer num2, Integer num3, Integer num4) {
        if (num == null || num.intValue() == 0 || num2 == null || num2.intValue() == 0 || num3 == null || num3.intValue() == 0 || num4 == null || num4.intValue() == 0) {
            return null;
        }
        return Double.valueOf((((double) num.intValue()) * ((double) num2.intValue())) - (((double) num3.intValue()) * ((double) num4.intValue())));
    }

    @NotNull
    public static final Comparator<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n> g() {
        return f50682b;
    }

    @NotNull
    public static final Comparator<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.s> h(double d10, @Nullable Long l10, @Nullable Integer num, @Nullable Integer num2) {
        return new d(d10, l10, num, num2);
    }

    @NotNull
    public static final Comparator<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g> i(@Nullable Integer num, @Nullable Integer num2) {
        return new b(num, num2);
    }

    public static final Pair<Boolean, Boolean> j(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g gVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g gVar2) {
        Object obj;
        Object next;
        sn.l lVar = new sn.l() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.t
            @Override // sn.l
            public final Object invoke(Object obj2) {
                return Boolean.valueOf(u.p((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a0) obj2));
            }
        };
        Iterator<T> it = gVar.e().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((Boolean) lVar.invoke(next)).booleanValue()) {
                break;
            }
        }
        boolean z10 = next != null;
        Iterator<T> it2 = gVar2.e().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (((Boolean) lVar.invoke(next2)).booleanValue()) {
                obj = next2;
                break;
            }
        }
        return bn.h.a(Boolean.valueOf(z10), Boolean.valueOf(obj != null));
    }

    public static final Pair<Boolean, Boolean> l(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.s sVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.s sVar2, double d10, Long l10) {
        return o(d(sVar, d10, l10), d(sVar2, d10, l10));
    }

    public static final Pair<Boolean, Boolean> n(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.s sVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.s sVar2, Integer num, Integer num2) {
        return o(f(sVar.h(), sVar.c(), num, num2), f(sVar2.h(), sVar2.c(), num, num2));
    }

    public static final Pair<Boolean, Boolean> o(Double d10, Double d11) {
        if (d10 == null || d11 == null) {
            return bn.h.a(Boolean.valueOf(d10 != null), Boolean.valueOf(d11 != null));
        }
        if (tn.p.c(d10, d11)) {
            Boolean bool = Boolean.TRUE;
            return bn.h.a(bool, bool);
        }
        if (Math.abs(d10.doubleValue()) == Math.abs(d11.doubleValue())) {
            return bn.h.a(Boolean.valueOf(d10.doubleValue() < 0.0d), Boolean.valueOf(d11.doubleValue() < 0.0d));
        }
        return Double.compare(Math.abs(d10.doubleValue()), Math.abs(d11.doubleValue())) < 0 ? bn.h.a(Boolean.TRUE, Boolean.FALSE) : bn.h.a(Boolean.FALSE, Boolean.TRUE);
    }

    public static final boolean p(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a0 a0Var) {
        tn.p.k(a0Var, "it");
        return a0Var instanceof a0.c;
    }

    public static final int q(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a0 a0Var) {
        if (a0Var instanceof a0.a) {
            return 4;
        }
        if (a0Var instanceof a0.c) {
            return ((a0.c) a0Var).a().a() == com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i.f49888b ? 3 : 2;
        }
        if (a0Var instanceof a0.b) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final bn.r r(Ref$IntRef ref$IntRef, Ref$IntRef ref$IntRef2, Pair pair) {
        tn.p.k(pair, "<destruct>");
        boolean zBooleanValue = ((Boolean) pair.component1()).booleanValue();
        boolean zBooleanValue2 = ((Boolean) pair.component2()).booleanValue();
        if (zBooleanValue) {
            ref$IntRef.element++;
        }
        if (zBooleanValue2) {
            ref$IntRef2.element++;
        }
        return bn.r.f5635a;
    }

    public static final Double s(Integer num, Integer num2, Integer num3, Integer num4) {
        if (num == null || num.intValue() == 0 || num2 == null || num2.intValue() == 0 || num3 == null || num3.intValue() == 0 || num4 == null || num4.intValue() == 0) {
            return null;
        }
        return Double.valueOf((((double) num.intValue()) / ((double) num2.intValue())) - (((double) num3.intValue()) / ((double) num4.intValue())));
    }

    @NotNull
    public static final Comparator<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a0> t() {
        return f50681a;
    }

    public static final Pair<Boolean, Boolean> u(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g gVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g gVar2, Integer num, Integer num2) {
        return o(f(gVar.f(), gVar.d(), num, num2), f(gVar2.f(), gVar2.d(), num, num2));
    }

    public static final Pair<Integer, Integer> v(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.s sVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.s sVar2, double d10, Long l10, Integer num, Integer num2) {
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        final Ref$IntRef ref$IntRef2 = new Ref$IntRef();
        sn.l lVar = new sn.l() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.r
            @Override // sn.l
            public final Object invoke(Object obj) {
                return u.r(ref$IntRef, ref$IntRef2, (Pair) obj);
            }
        };
        lVar.invoke(n(sVar, sVar2, num, num2));
        lVar.invoke(w(sVar, sVar2, num, num2));
        lVar.invoke(l(sVar, sVar2, d10, l10));
        return bn.h.a(Integer.valueOf(ref$IntRef.element), Integer.valueOf(ref$IntRef2.element));
    }

    public static final Pair<Boolean, Boolean> w(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.s sVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.s sVar2, Integer num, Integer num2) {
        return o(s(sVar.h(), sVar.c(), num, num2), s(sVar2.h(), sVar2.c(), num, num2));
    }

    public static final Pair<Boolean, Boolean> x(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g gVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g gVar2, Integer num, Integer num2) {
        return o(s(gVar.f(), gVar.d(), num, num2), s(gVar2.f(), gVar2.d(), num, num2));
    }

    public static final Pair<Integer, Integer> y(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g gVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g gVar2, Integer num, Integer num2) {
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        final Ref$IntRef ref$IntRef2 = new Ref$IntRef();
        sn.l lVar = new sn.l() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.s
            @Override // sn.l
            public final Object invoke(Object obj) {
                return u.c(ref$IntRef, ref$IntRef2, (Pair) obj);
            }
        };
        lVar.invoke(u(gVar, gVar2, num, num2));
        lVar.invoke(x(gVar, gVar2, num, num2));
        lVar.invoke(j(gVar, gVar2));
        return bn.h.a(Integer.valueOf(ref$IntRef.element), Integer.valueOf(ref$IntRef2.element));
    }
}
