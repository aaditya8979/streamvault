package yads;

import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class p90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p90 f93493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s70 f93494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f93495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f93496d;

    public p90(p90 p90Var, s70 s70Var, boolean z10, List list) {
        this.f93493a = p90Var;
        this.f93494b = s70Var;
        this.f93495c = z10;
        this.f93496d = list;
    }

    public static p90 a(p90 p90Var, p90 p90Var2, s70 s70Var, boolean z10, List list, int i10) {
        if ((i10 & 1) != 0) {
            p90Var2 = p90Var.f93493a;
        }
        if ((i10 & 2) != 0) {
            s70Var = p90Var.f93494b;
        }
        if ((i10 & 4) != 0) {
            z10 = p90Var.f93495c;
        }
        if ((i10 & 8) != 0) {
            list = p90Var.f93496d;
        }
        p90Var.getClass();
        return new p90(p90Var2, s70Var, z10, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p90)) {
            return false;
        }
        p90 p90Var = (p90) obj;
        return tn.p.f(this.f93493a, p90Var.f93493a) && tn.p.f(this.f93494b, p90Var.f93494b) && this.f93495c == p90Var.f93495c && tn.p.f(this.f93496d, p90Var.f93496d);
    }

    public final int hashCode() {
        p90 p90Var = this.f93493a;
        return this.f93496d.hashCode() + ((Boolean.hashCode(this.f93495c) + ((this.f93494b.hashCode() + ((p90Var == null ? 0 : p90Var.hashCode()) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DebugPanelUiState(prevState=" + this.f93493a + ", destination=" + this.f93494b + ", isLoading=" + this.f93495c + ", uiData=" + this.f93496d + ")";
    }
}
