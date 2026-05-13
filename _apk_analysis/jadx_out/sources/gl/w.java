package gl;

import java.nio.charset.Charset;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: HttpMessageProperties.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class w {
    @Nullable
    public static final Charset a(@NotNull u uVar) {
        tn.p.k(uVar, "<this>");
        f fVarC = c(uVar);
        if (fVarC != null) {
            return g.a(fVarC);
        }
        return null;
    }

    @Nullable
    public static final Long b(@NotNull u uVar) {
        tn.p.k(uVar, "<this>");
        String str = uVar.getHeaders().get(s.f62569a.g());
        if (str != null) {
            return Long.valueOf(Long.parseLong(str));
        }
        return null;
    }

    @Nullable
    public static final f c(@NotNull u uVar) {
        tn.p.k(uVar, "<this>");
        String str = uVar.getHeaders().get(s.f62569a.i());
        if (str != null) {
            return f.f62497f.b(str);
        }
        return null;
    }

    @Nullable
    public static final f d(@NotNull v vVar) {
        tn.p.k(vVar, "<this>");
        String strJ = vVar.getHeaders().j(s.f62569a.i());
        if (strJ != null) {
            return f.f62497f.b(strJ);
        }
        return null;
    }

    public static final void e(@NotNull v vVar, @NotNull f fVar) {
        tn.p.k(vVar, "<this>");
        tn.p.k(fVar, "type");
        vVar.getHeaders().m(s.f62569a.i(), fVar.toString());
    }
}
