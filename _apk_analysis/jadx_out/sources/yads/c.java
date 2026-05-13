package yads;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f88252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f88253b;

    public c(String str, Set set) {
        this.f88252a = str;
        this.f88253b = set;
    }

    public final String a() {
        return this.f88252a;
    }

    public final Set b() {
        return this.f88253b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return tn.p.f(this.f88252a, cVar.f88252a) && tn.p.f(this.f88253b, cVar.f88253b);
    }

    public final int hashCode() {
        return this.f88253b.hashCode() + (this.f88252a.hashCode() * 31);
    }

    public final String toString() {
        return "AbExperimentData(experiments=" + this.f88252a + ", triggeredTestIds=" + this.f88253b + ")";
    }
}
