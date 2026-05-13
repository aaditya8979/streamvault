package yads;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class sg2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f94814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f94815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f94816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f94817d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final bb0 f94818e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f94819f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f94820g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f94821h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f94822i;

    public sg2(String str, String str2, Map map, Integer num, bb0 bb0Var, List list, List list2, String str3, String str4) {
        this.f94814a = str;
        this.f94815b = str2;
        this.f94816c = map;
        this.f94817d = num;
        this.f94818e = bb0Var;
        this.f94819f = list;
        this.f94820g = list2;
        this.f94821h = str3;
        this.f94822i = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sg2)) {
            return false;
        }
        sg2 sg2Var = (sg2) obj;
        return tn.p.f(this.f94814a, sg2Var.f94814a) && tn.p.f(this.f94815b, sg2Var.f94815b) && tn.p.f(this.f94816c, sg2Var.f94816c) && tn.p.f(this.f94817d, sg2Var.f94817d) && this.f94818e == sg2Var.f94818e && tn.p.f(this.f94819f, sg2Var.f94819f) && tn.p.f(this.f94820g, sg2Var.f94820g) && tn.p.f(this.f94821h, sg2Var.f94821h) && tn.p.f(this.f94822i, sg2Var.f94822i);
    }

    public final int hashCode() {
        int iA = k4.a(this.f94815b, this.f94814a.hashCode() * 31, 31);
        Map map = this.f94816c;
        int iHashCode = (iA + (map == null ? 0 : map.hashCode())) * 31;
        Integer num = this.f94817d;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        bb0 bb0Var = this.f94818e;
        int iHashCode3 = (iHashCode2 + (bb0Var == null ? 0 : bb0Var.hashCode())) * 31;
        List list = this.f94819f;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f94820g;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.f94821h;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f94822i;
        return iHashCode6 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "PreferredPackage(packageName=" + this.f94814a + ", url=" + this.f94815b + ", extras=" + this.f94816c + ", flags=" + this.f94817d + ", launchMode=" + this.f94818e + ", trackingUrls=" + this.f94819f + ", fallbackTrackingUrls=" + this.f94820g + ", deeplinkType=" + this.f94821h + ", className=" + this.f94822i + ")";
    }
}
