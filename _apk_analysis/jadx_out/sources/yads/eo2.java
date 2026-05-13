package yads;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class eo2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f89339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f89340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f89341c;

    public eo2(String str, Map map, c cVar) {
        this.f89339a = str;
        this.f89340b = map;
        this.f89341c = cVar;
        map.put("sdk_version", "7.18.1");
    }

    public final c a() {
        return this.f89341c;
    }

    public final Map b() {
        return this.f89340b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eo2)) {
            return false;
        }
        eo2 eo2Var = (eo2) obj;
        return tn.p.f(this.f89339a, eo2Var.f89339a) && tn.p.f(this.f89340b, eo2Var.f89340b) && tn.p.f(this.f89341c, eo2Var.f89341c);
    }

    public final int hashCode() {
        int iHashCode = (this.f89340b.hashCode() + (this.f89339a.hashCode() * 31)) * 31;
        c cVar = this.f89341c;
        return iHashCode + (cVar == null ? 0 : cVar.hashCode());
    }

    public final String toString() {
        return "Report(eventName=" + this.f89339a + ", data=" + this.f89340b + ", abExperiments=" + this.f89341c + ")";
    }
}
