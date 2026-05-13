package xk;

import gl.s;
import io.ktor.client.engine.HttpClientEngine;
import io.ktor.http.UnsafeHeaderException;
import java.util.ArrayList;
import java.util.Set;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlinx.coroutines.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.k0;
import p000do.t1;
import p000do.w;
import tn.t;

/* JADX INFO: compiled from: HttpClientEngine.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final k0 f86972a = new k0("call-context");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final kl.a<uk.h<?>> f86973b;

    static {
        KType kTypeN;
        KClass kClassB = t.b(uk.h.class);
        try {
            kTypeN = t.n(uk.h.class, KTypeProjection.Companion.getSTAR());
        } catch (Throwable unused) {
            kTypeN = null;
        }
        f86973b = new kl.a<>("client-config", new rl.a(kClassB, kTypeN));
    }

    @Nullable
    public static final Object b(@NotNull HttpClientEngine httpClientEngine, @NotNull kotlinx.coroutines.g gVar, @NotNull hn.c<? super kotlin.coroutines.d> cVar) {
        w wVarA = t1.a(gVar);
        kotlin.coroutines.d dVarPlus = httpClientEngine.getCoroutineContext().plus(wVarA).plus(f86972a);
        kotlinx.coroutines.g gVar2 = (kotlinx.coroutines.g) cVar.getContext().get(kotlinx.coroutines.g.H8);
        if (gVar2 != null) {
            wVarA.f(new l(g.a.d(gVar2, true, false, new m(wVarA), 2, null)));
        }
        return dVarPlus;
    }

    @NotNull
    public static final kl.a<uk.h<?>> c() {
        return f86973b;
    }

    public static final void d(cl.e eVar) {
        Set<String> setNames = eVar.e().names();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setNames) {
            if (s.f62569a.w().contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new UnsafeHeaderException(arrayList.toString());
        }
    }
}
