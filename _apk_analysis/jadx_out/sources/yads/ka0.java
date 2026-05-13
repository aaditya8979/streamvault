package yads;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@so.k
public final class ka0 {

    @NotNull
    public static final ja0 Companion = new ja0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f91529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f91530b;

    public /* synthetic */ ka0(int i10, String str, String str2) {
        if (3 != (i10 & 3)) {
            wo.c2.a(i10, 3, ia0.f90723a.getDescriptor());
        }
        this.f91529a = str;
        this.f91530b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ka0)) {
            return false;
        }
        ka0 ka0Var = (ka0) obj;
        return tn.p.f(this.f91529a, ka0Var.f91529a) && tn.p.f(this.f91530b, ka0Var.f91530b);
    }

    public final int hashCode() {
        return this.f91530b.hashCode() + (this.f91529a.hashCode() * 31);
    }

    public final String toString() {
        return "DebugPanelWaterfallCurrency(name=" + this.f91529a + ", symbol=" + this.f91530b + ")";
    }
}
