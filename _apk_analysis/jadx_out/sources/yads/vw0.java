package yads;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@so.k
public final class vw0 {

    @NotNull
    public static final uw0 Companion = new uw0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dx0 f96204a;

    public /* synthetic */ vw0(int i10, dx0 dx0Var) {
        if (1 != (i10 & 1)) {
            wo.c2.a(i10, 1, tw0.f95395a.getDescriptor());
        }
        this.f96204a = dx0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vw0) && tn.p.f(this.f96204a, ((vw0) obj).f96204a);
    }

    public final int hashCode() {
        dx0 dx0Var = this.f96204a;
        if (dx0Var == null) {
            return 0;
        }
        return dx0Var.hashCode();
    }

    public final String toString() {
        return "FontParameters(urls=" + this.f96204a + ")";
    }
}
