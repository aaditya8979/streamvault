package cl;

import bn.r;
import gl.n;
import gl.v;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import org.jetbrains.annotations.NotNull;
import tn.p;
import tn.t;

/* JADX INFO: compiled from: HttpRequest.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final kl.a<k> f6704a;

    static {
        KType kTypeM;
        KClass kClassB = t.b(k.class);
        try {
            kTypeM = t.m(k.class);
        } catch (Throwable unused) {
            kTypeM = null;
        }
        f6704a = new kl.a<>("ResponseAdapterAttributeKey", new rl.a(kClassB, kTypeM));
    }

    @NotNull
    public static final kl.a<k> a() {
        return f6704a;
    }

    @NotNull
    public static final n b(@NotNull v vVar, @NotNull sn.l<? super n, r> lVar) {
        p.k(vVar, "<this>");
        p.k(lVar, "block");
        n headers = vVar.getHeaders();
        lVar.invoke(headers);
        return headers;
    }

    public static final void c(@NotNull d dVar, @NotNull String str) {
        p.k(dVar, "<this>");
        p.k(str, "urlString");
        io.ktor.http.h.l(dVar.i(), str);
    }
}
