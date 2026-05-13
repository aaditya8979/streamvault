package wl;

import com.ironsource.C4157n2;
import org.jetbrains.annotations.NotNull;
import tn.p;
import wl.f;

/* JADX INFO: compiled from: Pool.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class e<T> implements f<T> {
    @Override // java.lang.AutoCloseable
    public void close() {
        f.a.a(this);
    }

    @Override // wl.f
    public void dispose() {
    }

    @Override // wl.f
    public void r(@NotNull T t10) {
        p.k(t10, C4157n2.f33007p);
    }
}
