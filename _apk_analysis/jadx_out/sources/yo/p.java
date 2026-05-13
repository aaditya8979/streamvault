package yo;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ArrayPools.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class p extends o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final p f97972c = new p();

    public final void c(@NotNull char[] cArr) {
        tn.p.k(cArr, "array");
        if (cArr.length == 16384) {
            a(cArr);
            return;
        }
        throw new IllegalArgumentException(("Inconsistent internal invariant: unexpected array size " + cArr.length).toString());
    }

    @NotNull
    public final char[] d() {
        return super.b(16384);
    }
}
