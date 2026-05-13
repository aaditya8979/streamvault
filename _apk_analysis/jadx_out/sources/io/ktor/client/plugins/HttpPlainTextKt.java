package io.ktor.client.plugins;

import al.d;
import al.i;
import bn.r;
import cn.f0;
import cn.r0;
import gl.f;
import gl.g;
import gl.s;
import gl.w;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.plugins.HttpPlainTextKt;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import jl.e;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import sn.l;
import tn.p;
import ul.h;
import zk.n;

/* JADX INFO: compiled from: HttpPlainText.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class HttpPlainTextKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final rs.c f71119a = pl.a.a("io.ktor.client.plugins.HttpPlainText");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final al.b<n> f71120b = i.b("HttpPlainText", HttpPlainTextKt$HttpPlainText$1.INSTANCE, new l() { // from class: zk.o
        @Override // sn.l
        public final Object invoke(Object obj) {
            return HttpPlainTextKt.b((al.d) obj);
        }
    });

    /* JADX INFO: compiled from: Comparisons.kt */
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return fn.b.d(tl.a.g((Charset) t10), tl.a.g((Charset) t11));
        }
    }

    /* JADX INFO: compiled from: Comparisons.kt */
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return fn.b.d((Float) ((Pair) t11).getSecond(), (Float) ((Pair) t10).getSecond());
        }
    }

    public static final r b(d dVar) {
        p.k(dVar, "$this$createClientPlugin");
        List<Pair> listX0 = f0.X0(r0.E(((n) dVar.e()).a()), new b());
        Charset charsetC = ((n) dVar.e()).c();
        Set<Charset> setB = ((n) dVar.e()).b();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = setB.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (true ^ ((n) dVar.e()).a().containsKey((Charset) next)) {
                arrayList.add(next);
            }
        }
        List listX02 = f0.X0(arrayList, new a());
        StringBuilder sb2 = new StringBuilder();
        Iterator it2 = listX02.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Charset charset = (Charset) it2.next();
            if (sb2.length() > 0) {
                sb2.append(StringUtils.COMMA);
            }
            sb2.append(tl.a.g(charset));
        }
        for (Pair pair : listX0) {
            Charset charset2 = (Charset) pair.component1();
            float fFloatValue = ((Number) pair.component2()).floatValue();
            if (sb2.length() > 0) {
                sb2.append(StringUtils.COMMA);
            }
            double d10 = fFloatValue;
            if (!(0.0d <= d10 && d10 <= 1.0d)) {
                throw new IllegalStateException("Check failed.");
            }
            sb2.append(tl.a.g(charset2) + ";q=" + (((double) vn.c.d(100 * fFloatValue)) / 100.0d));
        }
        if (sb2.length() == 0) {
            sb2.append(tl.a.g(charsetC));
        }
        String string = sb2.toString();
        Charset charsetD = ((n) dVar.e()).d();
        if (charsetD == null && (charsetD = (Charset) f0.v0(listX02)) == null) {
            Pair pair2 = (Pair) f0.v0(listX0);
            charsetD = pair2 != null ? (Charset) pair2.getFirst() : null;
            if (charsetD == null) {
                charsetD = bo.c.f5639b;
            }
        }
        dVar.f(RenderRequestHook.f71155a, new HttpPlainTextKt$HttpPlainText$2$1(string, charsetD, null));
        dVar.i(new HttpPlainTextKt$HttpPlainText$2$2(charsetC, null));
        return r.f5635a;
    }

    public static final void c(String str, cl.d dVar) {
        gl.n headers = dVar.getHeaders();
        s sVar = s.f62569a;
        if (headers.j(sVar.d()) != null) {
            return;
        }
        f71119a.trace("Adding Accept-Charset=" + str + " to " + dVar.i());
        dVar.getHeaders().m(sVar.d(), str);
    }

    public static final String d(Charset charset, HttpClientCall httpClientCall, no.r rVar) {
        Charset charsetA = w.a(httpClientCall.e());
        if (charsetA != null) {
            charset = charsetA;
        }
        f71119a.trace("Reading response body for " + httpClientCall.d().getUrl() + " as String with charset " + charset);
        return h.c(rVar, charset, 0, 2, null);
    }

    public static final jl.c e(Charset charset, cl.d dVar, String str, f fVar) {
        Charset charsetA;
        f fVarA = fVar == null ? f.d.f62534a.a() : fVar;
        if (fVar != null && (charsetA = g.a(fVar)) != null) {
            charset = charsetA;
        }
        f71119a.trace("Sending request body to " + dVar.i() + " as text/plain with charset " + charset);
        return new e(str, g.b(fVarA, charset), null, 4, null);
    }

    @NotNull
    public static final al.b<n> i() {
        return f71120b;
    }
}
