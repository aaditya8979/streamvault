package ul;

import no.r;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: Input.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class f {
    public static final int a(@NotNull r rVar, @NotNull byte[] bArr, int i10, int i11) {
        p.k(rVar, "<this>");
        p.k(bArr, "buffer");
        int iG0 = rVar.g0(bArr, i10, i11 + i10);
        if (iG0 == -1) {
            return 0;
        }
        return iG0;
    }
}
