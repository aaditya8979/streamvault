package gl;

import com.ironsource.G5;
import java.nio.charset.Charset;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ContentTypes.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class g {
    @Nullable
    public static final Charset a(@NotNull k kVar) {
        tn.p.k(kVar, "<this>");
        String strC = kVar.c(G5.M);
        if (strC == null) {
            return null;
        }
        try {
            return tl.a.e(bo.c.f5638a, strC);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @NotNull
    public static final f b(@NotNull f fVar, @NotNull Charset charset) {
        tn.p.k(fVar, "<this>");
        tn.p.k(charset, G5.M);
        return fVar.h(G5.M, tl.a.g(charset));
    }
}
