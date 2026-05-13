package gl;

import com.ironsource.C3978d4;
import com.ironsource.G5;
import io.ktor.http.Url;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: URLUtils.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class i0 {
    @NotNull
    public static final io.ktor.http.e b(@NotNull Url url) {
        tn.p.k(url, "url");
        return k(new io.ktor.http.e(null, null, 0, null, null, null, null, null, false, 511, null), url);
    }

    @NotNull
    public static final io.ktor.http.e c(@NotNull String str) {
        tn.p.k(str, "urlString");
        return io.ktor.http.h.l(new io.ktor.http.e(null, null, 0, null, null, null, null, null, false, 511, null), str);
    }

    @NotNull
    public static final Url d(@NotNull String str) {
        tn.p.k(str, "urlString");
        return c(str).b();
    }

    public static final void e(@NotNull Appendable appendable, @NotNull String str, @NotNull c0 c0Var, boolean z10) {
        List listE;
        tn.p.k(appendable, "<this>");
        tn.p.k(str, "encodedPath");
        tn.p.k(c0Var, "encodedQueryParameters");
        if ((!bo.d0.u0(str)) && !bo.a0.W(str, "/", false, 2, null)) {
            appendable.append('/');
        }
        appendable.append(str);
        if (!c0Var.isEmpty() || z10) {
            appendable.append("?");
        }
        Set<Map.Entry<String, List<String>>> setEntries = c0Var.entries();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = setEntries.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str2 = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.isEmpty()) {
                listE = cn.v.e(bn.h.a(str2, null));
            } else {
                ArrayList arrayList2 = new ArrayList(cn.x.x(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(bn.h.a(str2, (String) it2.next()));
                }
                listE = arrayList2;
            }
            cn.b0.F(arrayList, listE);
        }
        cn.f0.A0(arrayList, appendable, (124 & 2) != 0 ? ", " : C3978d4.j.f31381c, (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : new sn.l() { // from class: gl.h0
            @Override // sn.l
            public final Object invoke(Object obj) {
                return i0.f((Pair) obj);
            }
        });
    }

    public static final CharSequence f(Pair pair) {
        tn.p.k(pair, "it");
        String str = (String) pair.getFirst();
        if (pair.getSecond() == null) {
            return str;
        }
        return str + G5.T + String.valueOf(pair.getSecond());
    }

    public static final void g(@NotNull StringBuilder sb2, @Nullable String str, @Nullable String str2) {
        tn.p.k(sb2, "<this>");
        if (str == null) {
            return;
        }
        sb2.append(str);
        if (str2 != null) {
            sb2.append(':');
            sb2.append(str2);
        }
        sb2.append("@");
    }

    @NotNull
    public static final String h(@NotNull Url url) {
        tn.p.k(url, "<this>");
        return url.getHost() + ':' + url.getPort();
    }

    @NotNull
    public static final String i(@NotNull Url url) {
        tn.p.k(url, "<this>");
        int specifiedPort = url.getSpecifiedPort();
        return (specifiedPort == 0 || specifiedPort == url.getProtocol().getDefaultPort()) ? url.getHost() : h(url);
    }

    @NotNull
    public static final io.ktor.http.e j(@NotNull io.ktor.http.e eVar, @NotNull io.ktor.http.e eVar2) {
        tn.p.k(eVar, "<this>");
        tn.p.k(eVar2, "url");
        eVar.A(eVar2.p());
        eVar.x(eVar2.j());
        eVar.y(eVar2.n());
        eVar.v(eVar2.g());
        eVar.w(eVar2.h());
        eVar.u(eVar2.f());
        c0 c0VarB = io.ktor.http.c.b(0, 1, null);
        kl.y.c(c0VarB, eVar2.e());
        eVar.t(c0VarB);
        eVar.s(eVar2.d());
        eVar.B(eVar2.q());
        return eVar;
    }

    @NotNull
    public static final io.ktor.http.e k(@NotNull io.ktor.http.e eVar, @NotNull Url url) {
        tn.p.k(eVar, "<this>");
        tn.p.k(url, "url");
        eVar.A(url.getProtocolOrNull());
        eVar.x(url.getHost());
        eVar.y(url.getPort());
        io.ktor.http.g.j(eVar, url.getEncodedPath());
        eVar.w(url.getEncodedUser());
        eVar.u(url.getEncodedPassword());
        c0 c0VarB = io.ktor.http.c.b(0, 1, null);
        c0VarB.d(io.ktor.http.d.d(url.getEncodedQuery(), 0, 0, false, 6, null));
        eVar.t(c0VarB);
        eVar.s(url.getEncodedFragment());
        eVar.B(url.getTrailingQuery());
        return eVar;
    }
}
