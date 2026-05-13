package io.ktor.client.plugins;

import bn.r;
import io.ktor.client.plugins.DefaultResponseValidationKt;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import org.jetbrains.annotations.NotNull;
import sn.l;
import tn.p;
import tn.t;
import uk.h;
import zk.j;

/* JADX INFO: compiled from: DefaultResponseValidation.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class DefaultResponseValidationKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final kl.a<r> f71093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final rs.c f71094b;

    static {
        KType kTypeM;
        KClass kClassB = t.b(r.class);
        try {
            kTypeM = t.m(r.class);
        } catch (Throwable unused) {
            kTypeM = null;
        }
        f71093a = new kl.a<>("ValidateMark", new rl.a(kClassB, kTypeM));
        f71094b = pl.a.a("io.ktor.client.plugins.DefaultResponseValidation");
    }

    public static final void d(@NotNull final h<?> hVar) {
        p.k(hVar, "<this>");
        HttpCallValidatorKt.f(hVar, new l() { // from class: zk.d
            @Override // sn.l
            public final Object invoke(Object obj) {
                return DefaultResponseValidationKt.e(hVar, (j) obj);
            }
        });
    }

    public static final r e(h hVar, j jVar) {
        p.k(jVar, "$this$HttpResponseValidator");
        jVar.d(hVar.h());
        jVar.e(new DefaultResponseValidationKt$addDefaultResponseValidation$1$1(null));
        return r.f5635a;
    }
}
