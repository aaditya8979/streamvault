package il;

import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: Tokenizer.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class k {
    public static final int a(@NotNull d dVar, int i10, int i11) {
        p.k(dVar, "text");
        while (i10 < i11) {
            char cCharAt = dVar.charAt(i10);
            if (!bo.a.c(cCharAt) && cCharAt != '\t') {
                break;
            }
            i10++;
        }
        return i10;
    }
}
