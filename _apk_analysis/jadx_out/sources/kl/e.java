package kl;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Attributes.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class e {
    public static final void a(@NotNull b bVar, @NotNull b bVar2) {
        tn.p.k(bVar, "<this>");
        tn.p.k(bVar2, "other");
        Iterator<T> it = bVar2.d().iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            tn.p.i(aVar, "null cannot be cast to non-null type io.ktor.util.AttributeKey<kotlin.Any>");
            bVar.f(aVar, bVar2.a(aVar));
        }
    }
}
