package yo;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ArrayPools.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class n extends o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final n f97964c = new n();

    public final void c(@NotNull char[] cArr) {
        tn.p.k(cArr, "array");
        a(cArr);
    }

    @NotNull
    public final char[] d() {
        return super.b(128);
    }
}
