package yads;

import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class pq1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f93719d = com.safedk.android.utils.g.f53151y + ".mediation";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f93720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hr1 f93721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f93722c;

    public pq1(String str, hr1 hr1Var, List list) {
        this.f93720a = str;
        this.f93721b = hr1Var;
        this.f93722c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pq1)) {
            return false;
        }
        pq1 pq1Var = (pq1) obj;
        return tn.p.f(this.f93720a, pq1Var.f93720a) && this.f93721b == pq1Var.f93721b && tn.p.f(this.f93722c, pq1Var.f93722c);
    }

    public final int hashCode() {
        return this.f93722c.hashCode() + ((this.f93721b.hashCode() + (this.f93720a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "MediationNetwork(name=" + this.f93720a + ", id=" + this.f93721b + ", adapters=" + this.f93722c + ")";
    }
}
