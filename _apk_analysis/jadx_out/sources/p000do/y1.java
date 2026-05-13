package p000do;

import io.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MainCoroutineDispatcher.kt */
/* JADX INFO: loaded from: classes4.dex */
public abstract class y1 extends h0 {
    @NotNull
    public abstract y1 I();

    @Nullable
    public final String L() {
        y1 y1VarI;
        y1 y1VarC = w0.c();
        if (this == y1VarC) {
            return "Dispatchers.Main";
        }
        try {
            y1VarI = y1VarC.I();
        } catch (UnsupportedOperationException unused) {
            y1VarI = null;
        }
        if (this == y1VarI) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    @Override // p000do.h0
    @NotNull
    public h0 limitedParallelism(int i10, @Nullable String str) {
        n.a(i10);
        return n.b(this, str);
    }

    @Override // p000do.h0
    @NotNull
    public String toString() {
        String strL = L();
        if (strL != null) {
            return strL;
        }
        return m0.a(this) + '@' + m0.b(this);
    }
}
