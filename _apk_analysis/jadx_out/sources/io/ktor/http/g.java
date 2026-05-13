package io.ktor.http;

import bo.d0;
import cn.f0;
import cn.w;
import com.ironsource.C3978d4;
import gl.i0;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: URLBuilder.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class g {
    public static final void b(Appendable appendable, String str, String str2) throws IOException {
        appendable.append("://");
        appendable.append(str);
        if (!d0.Y0(str2, '/', false, 2, null)) {
            appendable.append('/');
        }
        appendable.append(str2);
    }

    public static final void c(Appendable appendable, String str, String str2) throws IOException {
        appendable.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
        appendable.append(str);
        appendable.append(str2);
    }

    public static final void d(Appendable appendable, String str) throws IOException {
        appendable.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
        appendable.append(str);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final <A extends Appendable> A e(e eVar, A a10) throws IOException {
        a10.append(eVar.o().getName());
        String name = eVar.o().getName();
        switch (name.hashCode()) {
            case -1081572750:
                if (name.equals("mailto")) {
                    c(a10, h(eVar), eVar.j());
                    return a10;
                }
                break;
            case 114715:
                if (name.equals("tel")) {
                    d(a10, eVar.j());
                    return a10;
                }
                break;
            case 3076010:
                if (name.equals("data")) {
                    d(a10, eVar.j());
                    return a10;
                }
                break;
            case 3143036:
                if (name.equals(C3978d4.i.f31327b)) {
                    b(a10, eVar.j(), g(eVar));
                    return a10;
                }
                break;
            case 92611469:
                if (name.equals("about")) {
                    d(a10, eVar.j());
                    return a10;
                }
                break;
        }
        a10.append("://");
        a10.append(f(eVar));
        i0.e(a10, g(eVar), eVar.e(), eVar.q());
        if (eVar.d().length() > 0) {
            a10.append('#');
            a10.append(eVar.d());
        }
        return a10;
    }

    @NotNull
    public static final String f(@NotNull e eVar) {
        p.k(eVar, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(h(eVar));
        sb2.append(eVar.j());
        if (eVar.n() != 0 && eVar.n() != eVar.o().getDefaultPort()) {
            sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
            sb2.append(String.valueOf(eVar.n()));
        }
        return sb2.toString();
    }

    @NotNull
    public static final String g(@NotNull e eVar) {
        p.k(eVar, "<this>");
        return i(eVar.g());
    }

    @NotNull
    public static final String h(@NotNull e eVar) {
        p.k(eVar, "<this>");
        StringBuilder sb2 = new StringBuilder();
        i0.g(sb2, eVar.h(), eVar.f());
        return sb2.toString();
    }

    public static final String i(List<String> list) {
        if (list.isEmpty()) {
            return "";
        }
        if (list.size() == 1) {
            return ((CharSequence) f0.t0(list)).length() == 0 ? "/" : (String) f0.t0(list);
        }
        return f0.D0(list, "/", null, null, 0, null, null, 62, null);
    }

    public static final void j(@NotNull e eVar, @NotNull String str) {
        p.k(eVar, "<this>");
        p.k(str, "value");
        eVar.v(d0.u0(str) ? w.m() : p.f(str, "/") ? h.e() : f0.j1(d0.T0(str, new char[]{'/'}, false, 0, 6, null)));
    }
}
