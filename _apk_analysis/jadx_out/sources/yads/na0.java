package yads;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@so.k
public final class na0 {

    @NotNull
    public static final ma0 Companion = new ma0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f92793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f92794b;

    public /* synthetic */ na0(int i10, String str, String str2) {
        if (3 != (i10 & 3)) {
            wo.c2.a(i10, 3, la0.f91918a.getDescriptor());
        }
        this.f92793a = str;
        this.f92794b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof na0)) {
            return false;
        }
        na0 na0Var = (na0) obj;
        return tn.p.f(this.f92793a, na0Var.f92793a) && tn.p.f(this.f92794b, na0Var.f92794b);
    }

    public final int hashCode() {
        return this.f92794b.hashCode() + (this.f92793a.hashCode() * 31);
    }

    public final String toString() {
        return "DebugPanelWaterfallParameter(name=" + this.f92793a + ", value=" + this.f92794b + ")";
    }
}
