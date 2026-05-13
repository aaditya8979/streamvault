package p000do;

import bn.r;
import kotlin.coroutines.d;
import kotlinx.coroutines.a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Builders.common.kt */
/* JADX INFO: loaded from: classes2.dex */
public class g2 extends a<r> {
    public g2(@NotNull d dVar, boolean z10) {
        super(dVar, true, z10);
    }

    @Override // kotlinx.coroutines.JobSupport
    public boolean x0(@NotNull Throwable th2) {
        j0.a(getContext(), th2);
        return true;
    }
}
