package ko;

import io.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.h0;

/* JADX INFO: compiled from: Dispatcher.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final b f73178h = new b();

    public b() {
        super(i.f73190c, i.f73191d, i.f73192e, i.f73188a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // p000do.h0
    @NotNull
    public h0 limitedParallelism(int i10, @Nullable String str) {
        n.a(i10);
        return i10 >= i.f73190c ? n.b(this, str) : super.limitedParallelism(i10, str);
    }

    @Override // p000do.h0
    @NotNull
    public String toString() {
        return "Dispatchers.Default";
    }
}
