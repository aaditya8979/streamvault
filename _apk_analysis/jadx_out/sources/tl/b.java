package tl;

import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import no.q;
import no.r;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: Encoding.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class b {
    @NotNull
    public static final String a(@NotNull CharsetDecoder charsetDecoder, @NotNull r rVar, int i10) {
        p.k(charsetDecoder, "<this>");
        p.k(rVar, "input");
        StringBuilder sb2 = new StringBuilder((int) Math.min(i10, rVar.getBuffer().n()));
        a.a(charsetDecoder, rVar, sb2, i10);
        return sb2.toString();
    }

    public static /* synthetic */ String b(CharsetDecoder charsetDecoder, r rVar, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        return a(charsetDecoder, rVar, i10);
    }

    @NotNull
    public static final r c(@NotNull CharsetEncoder charsetEncoder, @NotNull CharSequence charSequence, int i10, int i11) {
        p.k(charsetEncoder, "<this>");
        p.k(charSequence, "input");
        no.a aVar = new no.a();
        e(charsetEncoder, aVar, charSequence, i10, i11);
        return aVar;
    }

    public static /* synthetic */ r d(CharsetEncoder charsetEncoder, CharSequence charSequence, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = charSequence.length();
        }
        return c(charsetEncoder, charSequence, i10, i11);
    }

    public static final void e(@NotNull CharsetEncoder charsetEncoder, @NotNull q qVar, @NotNull CharSequence charSequence, int i10, int i11) {
        p.k(charsetEncoder, "<this>");
        p.k(qVar, "destination");
        p.k(charSequence, "input");
        if (i10 >= i11) {
            return;
        }
        do {
            int iB = a.b(charsetEncoder, charSequence, i10, i11, qVar);
            if (!(iB >= 0)) {
                throw new IllegalStateException("Check failed.");
            }
            i10 += iB;
        } while (i10 < i11);
    }
}
