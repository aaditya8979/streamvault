package kotlin;

import org.jetbrains.annotations.NotNull;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: Standard.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class NotImplementedError extends Error {
    /* JADX WARN: Multi-variable type inference failed */
    public NotImplementedError() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotImplementedError(@NotNull String str) {
        super(str);
        p.k(str, "message");
    }

    public /* synthetic */ NotImplementedError(String str, int i10, i iVar) {
        this((i10 & 1) != 0 ? "An operation is not implemented." : str);
    }
}
