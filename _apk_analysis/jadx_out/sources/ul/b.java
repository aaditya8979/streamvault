package ul;

import no.s;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: Buffers.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class b {
    @NotNull
    public static final byte[] a(@NotNull no.a aVar, int i10) {
        p.k(aVar, "<this>");
        return s.d(aVar, i10);
    }

    public static /* synthetic */ byte[] b(no.a aVar, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = (int) aVar.n();
        }
        return a(aVar, i10);
    }
}
