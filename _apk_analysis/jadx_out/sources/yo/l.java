package yo;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ArrayPools.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class l extends m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final l f97956c = new l();

    public final void c(@NotNull byte[] bArr) {
        tn.p.k(bArr, "array");
        a(bArr);
    }

    @NotNull
    public final byte[] d() {
        return super.b(512);
    }
}
