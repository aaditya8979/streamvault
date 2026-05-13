package yads;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class pg2 implements og2, Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f93595b;

    public pg2(List list) {
        this.f93595b = list;
    }

    @Override // yads.og2
    public final boolean apply(Object obj) {
        for (int i10 = 0; i10 < this.f93595b.size(); i10++) {
            if (!((og2) this.f93595b.get(i10)).apply(obj)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pg2) {
            return this.f93595b.equals(((pg2) obj).f93595b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f93595b.hashCode() + 306654252;
    }

    public final String toString() {
        List list = this.f93595b;
        StringBuilder sb2 = new StringBuilder("Predicates.and(");
        boolean z10 = true;
        for (Object obj : list) {
            if (!z10) {
                sb2.append(',');
            }
            sb2.append(obj);
            z10 = false;
        }
        sb2.append(')');
        return sb2.toString();
    }
}
