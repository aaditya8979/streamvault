package xk;

import bn.r;
import cn.f0;
import cn.w0;
import gl.s;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: Utils.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final String f86981a = "ktor-client";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Set<String> f86982b;

    static {
        s sVar = s.f62569a;
        f86982b = w0.j(sVar.k(), sVar.m(), sVar.r(), sVar.o(), sVar.q());
    }

    @Nullable
    public static final Object c(@NotNull hn.c<? super kotlin.coroutines.d> cVar) {
        d.b bVar = cVar.getContext().get(i.f86974c);
        p.h(bVar);
        return ((i) bVar).a();
    }

    public static final void d(@NotNull final gl.m mVar, @NotNull final jl.c cVar, @NotNull final sn.p<? super String, ? super String, r> pVar) {
        String string;
        String string2;
        p.k(mVar, "requestHeaders");
        p.k(cVar, "content");
        p.k(pVar, "block");
        el.d.a(new sn.l() { // from class: xk.j
            @Override // sn.l
            public final Object invoke(Object obj) {
                return n.e(mVar, cVar, (gl.n) obj);
            }
        }).c(new sn.p() { // from class: xk.k
            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public final Object mo2invoke(Object obj, Object obj2) {
                return n.f(pVar, (String) obj, (List) obj2);
            }
        });
        s sVar = s.f62569a;
        if ((mVar.get(sVar.x()) == null && cVar.c().get(sVar.x()) == null) && g()) {
            pVar.mo2invoke(sVar.x(), f86981a);
        }
        gl.f fVarB = cVar.b();
        if ((fVarB == null || (string = fVarB.toString()) == null) && (string = cVar.c().get(sVar.i())) == null) {
            string = mVar.get(sVar.i());
        }
        Long lA = cVar.a();
        if ((lA == null || (string2 = lA.toString()) == null) && (string2 = cVar.c().get(sVar.g())) == null) {
            string2 = mVar.get(sVar.g());
        }
        if (string != null) {
            pVar.mo2invoke(sVar.i(), string);
        }
        if (string2 != null) {
            pVar.mo2invoke(sVar.g(), string2);
        }
    }

    public static final r e(gl.m mVar, jl.c cVar, gl.n nVar) {
        p.k(nVar, "$this$buildHeaders");
        nVar.d(mVar);
        nVar.d(cVar.c());
        return r.f5635a;
    }

    public static final r f(sn.p pVar, String str, List list) {
        p.k(str, "key");
        p.k(list, "values");
        s sVar = s.f62569a;
        if (!p.f(sVar.g(), str) && !p.f(sVar.i(), str)) {
            if (f86982b.contains(str)) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    pVar.mo2invoke(str, (String) it.next());
                }
            } else {
                pVar.mo2invoke(str, f0.D0(list, p.f(sVar.j(), str) ? "; " : StringUtils.COMMA, null, null, 0, null, null, 62, null));
            }
            return r.f5635a;
        }
        return r.f5635a;
    }

    public static final boolean g() {
        return !io.ktor.util.a.f71213a.a();
    }
}
