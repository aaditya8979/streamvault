package yads;

import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class r40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f94280a;

    public r40(List list) {
        this.f94280a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r40) && tn.p.f(this.f94280a, ((r40) obj).f94280a);
    }

    public final int hashCode() {
        return this.f94280a.hashCode();
    }

    public final String toString() {
        return "DebugPanelAdUnitMediationData(adapters=" + this.f94280a + ")";
    }
}
