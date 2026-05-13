package so;

import kotlin.KotlinNothingValueException;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PolymorphicSerializer.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class h {
    @NotNull
    public static final <T> c<T> a(@NotNull wo.b<T> bVar, @NotNull vo.c cVar, @Nullable String str) {
        tn.p.k(bVar, "<this>");
        tn.p.k(cVar, "decoder");
        c<T> cVarD = bVar.d(cVar, str);
        if (cVarD != null) {
            return cVarD;
        }
        wo.c.a(str, bVar.f());
        throw new KotlinNothingValueException();
    }

    @NotNull
    public static final <T> l<T> b(@NotNull wo.b<T> bVar, @NotNull Encoder encoder, @NotNull T t10) {
        tn.p.k(bVar, "<this>");
        tn.p.k(encoder, "encoder");
        tn.p.k(t10, "value");
        l<T> lVarE = bVar.e(encoder, t10);
        if (lVarE != null) {
            return lVarE;
        }
        wo.c.b(tn.t.b(t10.getClass()), bVar.f());
        throw new KotlinNothingValueException();
    }
}
