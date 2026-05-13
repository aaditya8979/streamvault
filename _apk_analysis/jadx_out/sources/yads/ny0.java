package yads;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public final class ny0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f93042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f93043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f93044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f93045d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f93046e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f93047f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final gp2 f93048g;

    public ny0(String str, String str2, String str3, String str4, List list, Map map, gp2 gp2Var) {
        this.f93042a = str;
        this.f93043b = str2;
        this.f93044c = str3;
        this.f93045d = str4;
        this.f93046e = list;
        this.f93047f = map;
        this.f93048g = gp2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ny0)) {
            return false;
        }
        ny0 ny0Var = (ny0) obj;
        return tn.p.f(this.f93042a, ny0Var.f93042a) && tn.p.f(this.f93043b, ny0Var.f93043b) && tn.p.f(this.f93044c, ny0Var.f93044c) && tn.p.f(this.f93045d, ny0Var.f93045d) && tn.p.f(this.f93046e, ny0Var.f93046e) && tn.p.f(this.f93047f, ny0Var.f93047f) && this.f93048g == ny0Var.f93048g;
    }

    public final int hashCode() {
        int iHashCode = this.f93042a.hashCode() * 31;
        String str = this.f93043b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f93044c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f93045d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.f93046e;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Map map = this.f93047f;
        int iHashCode6 = (iHashCode5 + (map == null ? 0 : map.hashCode())) * 31;
        gp2 gp2Var = this.f93048g;
        return iHashCode6 + (gp2Var != null ? gp2Var.hashCode() : 0);
    }

    public final String toString() {
        return "FullscreenCacheParams(adUnitId=" + this.f93042a + ", age=" + this.f93043b + ", gender=" + this.f93044c + ", contextQuery=" + this.f93045d + ", contextTags=" + this.f93046e + ", parameters=" + this.f93047f + ", preferredTheme=" + this.f93048g + ")";
    }
}
