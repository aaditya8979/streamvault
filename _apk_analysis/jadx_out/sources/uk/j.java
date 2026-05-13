package uk;

import ao.r;
import io.ktor.client.HttpClient;
import java.util.Iterator;
import java.util.ServiceLoader;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: HttpClientJvm.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final xk.g<?> f85724a;

    static {
        xk.g<?> gVarA;
        Iterator it = ServiceLoader.load(i.class, i.class.getClassLoader()).iterator();
        p.j(it, "iterator(...)");
        i iVar = (i) SequencesKt___SequencesKt.D(r.g(it));
        if (iVar == null || (gVarA = iVar.a()) == null) {
            throw new IllegalStateException("Failed to find HTTP client engine implementation: consider adding client engine dependency. See https://ktor.io/docs/http-client-engines.html".toString());
        }
        f85724a = gVarA;
    }

    @NotNull
    public static final HttpClient a(@NotNull sn.l<? super h<?>, bn.r> lVar) {
        p.k(lVar, "block");
        return l.b(f85724a, lVar);
    }
}
