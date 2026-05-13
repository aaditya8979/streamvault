package yads;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class c80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f88388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f88389b;

    public c80(List list, List list2) {
        this.f88388a = list;
        this.f88389b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c80)) {
            return false;
        }
        c80 c80Var = (c80) obj;
        return tn.p.f(this.f88388a, c80Var.f88388a) && tn.p.f(this.f88389b, c80Var.f88389b);
    }

    public final int hashCode() {
        return this.f88389b.hashCode() + (this.f88388a.hashCode() * 31);
    }

    public final String toString() {
        return "DebugPanelLogsData(sdkLogs=" + this.f88388a + ", networkLogs=" + this.f88389b + ")";
    }
}
