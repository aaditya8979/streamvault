package ul;

import bo.a0;
import com.ironsource.G5;
import java.nio.charset.Charset;
import no.r;
import no.s;
import no.t;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: Strings.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class h {
    @NotNull
    public static final byte[] a(@NotNull r rVar) {
        p.k(rVar, "<this>");
        return s.c(rVar);
    }

    @NotNull
    public static final String b(@NotNull r rVar, @NotNull Charset charset, int i10) {
        p.k(rVar, "<this>");
        p.k(charset, G5.M);
        return p.f(charset, bo.c.f5639b) ? i10 == Integer.MAX_VALUE ? t.c(rVar) : t.d(rVar, Math.min(rVar.getBuffer().n(), i10)) : tl.b.a(charset.newDecoder(), rVar, i10);
    }

    public static /* synthetic */ String c(r rVar, Charset charset, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charset = bo.c.f5639b;
        }
        if ((i11 & 2) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        return b(rVar, charset, i10);
    }

    @NotNull
    public static final byte[] d(@NotNull String str, @NotNull Charset charset) {
        p.k(str, "<this>");
        p.k(charset, G5.M);
        return p.f(charset, bo.c.f5639b) ? a0.G(str, 0, 0, true, 3, null) : tl.a.c(charset.newEncoder(), str, 0, str.length());
    }

    public static /* synthetic */ byte[] e(String str, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = bo.c.f5639b;
        }
        return d(str, charset);
    }
}
