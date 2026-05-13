package io.ktor.client.plugins;

import al.d;
import al.i;
import bn.r;
import cn.w0;
import gl.a0;
import gl.x;
import io.ktor.client.plugins.HttpRedirectKt;
import io.ktor.client.plugins.api.Send;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import sn.l;
import zk.p;

/* JADX INFO: compiled from: HttpRedirect.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class HttpRedirectKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Set<x> f71121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final rs.c f71122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final fl.a<dl.c> f71123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final al.b<p> f71124d;

    static {
        x.a aVar = x.f62623b;
        f71121a = w0.j(aVar.b(), aVar.c());
        f71122b = pl.a.a("io.ktor.client.plugins.HttpRedirect");
        f71123c = new fl.a<>();
        f71124d = i.b("HttpRedirect", HttpRedirectKt$HttpRedirect$1.INSTANCE, new l() { // from class: zk.q
            @Override // sn.l
            public final Object invoke(Object obj) {
                return HttpRedirectKt.b((al.d) obj);
            }
        });
    }

    public static final r b(d dVar) {
        tn.p.k(dVar, "$this$createClientPlugin");
        dVar.f(Send.f71163a, new HttpRedirectKt$HttpRedirect$2$1(((p) dVar.e()).b(), ((p) dVar.e()).a(), dVar, null));
        return r.f5635a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0198 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [io.ktor.client.plugins.api.Send$a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r14v2, types: [T, cl.d] */
    /* JADX WARN: Type inference failed for: r1v12, types: [T] */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r20v0, types: [T, io.ktor.client.call.HttpClientCall, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [T] */
    /* JADX WARN: Type inference failed for: r6v1, types: [cl.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0199 -> B:35:0x01a0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(io.ktor.client.plugins.api.Send.a r18, cl.d r19, io.ktor.client.call.HttpClientCall r20, boolean r21, io.ktor.client.HttpClient r22, hn.c<? super io.ktor.client.call.HttpClientCall> r23) {
        /*
            Method dump skipped, instruction units count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.HttpRedirectKt.c(io.ktor.client.plugins.api.Send$a, cl.d, io.ktor.client.call.HttpClientCall, boolean, io.ktor.client.HttpClient, hn.c):java.lang.Object");
    }

    @NotNull
    public static final al.b<p> f() {
        return f71124d;
    }

    public static final boolean g(a0 a0Var) {
        int iE0 = a0Var.e0();
        a0.a aVar = a0.f62457d;
        return iE0 == aVar.s().e0() || iE0 == aVar.k().e0() || iE0 == aVar.S().e0() || iE0 == aVar.F().e0() || iE0 == aVar.O().e0();
    }
}
