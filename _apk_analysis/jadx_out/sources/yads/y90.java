package yads;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class y90 extends ba0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f97035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f97036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x80 f97037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q50 f97038d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f97039e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f97040f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f97041g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f97042h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f97043i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c50 f97044j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f97045k;

    public y90(String str, String str2, x80 x80Var, q50 q50Var, String str3, String str4, String str5, List list, List list2, c50 c50Var, String str6) {
        super(0);
        this.f97035a = str;
        this.f97036b = str2;
        this.f97037c = x80Var;
        this.f97038d = q50Var;
        this.f97039e = str3;
        this.f97040f = str4;
        this.f97041g = str5;
        this.f97042h = list;
        this.f97043i = list2;
        this.f97044j = c50Var;
        this.f97045k = str6;
    }

    public /* synthetic */ y90(String str, String str2, x80 x80Var, q50 q50Var, String str3, String str4, String str5, List list, List list2, c50 c50Var, String str6, int i10) {
        this(str, str2, x80Var, q50Var, str3, (i10 & 32) != 0 ? null : str4, (i10 & 64) != 0 ? null : str5, (i10 & 128) != 0 ? null : list, (i10 & 256) != 0 ? null : list2, (i10 & 512) != 0 ? c50.f88350e : c50Var, (i10 & 1024) != 0 ? null : str6);
    }

    public final String a() {
        return this.f97040f;
    }

    public final List b() {
        return this.f97043i;
    }

    public final String c() {
        return this.f97035a;
    }

    public final String d() {
        return this.f97041g;
    }

    public final List e() {
        return this.f97042h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y90)) {
            return false;
        }
        y90 y90Var = (y90) obj;
        return tn.p.f(this.f97035a, y90Var.f97035a) && tn.p.f(this.f97036b, y90Var.f97036b) && tn.p.f(this.f97037c, y90Var.f97037c) && tn.p.f(this.f97038d, y90Var.f97038d) && tn.p.f(this.f97039e, y90Var.f97039e) && tn.p.f(this.f97040f, y90Var.f97040f) && tn.p.f(this.f97041g, y90Var.f97041g) && tn.p.f(this.f97042h, y90Var.f97042h) && tn.p.f(this.f97043i, y90Var.f97043i) && this.f97044j == y90Var.f97044j && tn.p.f(this.f97045k, y90Var.f97045k);
    }

    public final c50 f() {
        return this.f97044j;
    }

    public final int hashCode() {
        int iHashCode = this.f97035a.hashCode() * 31;
        String str = this.f97036b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        x80 x80Var = this.f97037c;
        int iHashCode3 = (this.f97038d.hashCode() + ((iHashCode2 + (x80Var == null ? 0 : x80Var.hashCode())) * 31)) * 31;
        String str2 = this.f97039e;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f97040f;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f97041g;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List list = this.f97042h;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f97043i;
        int iHashCode8 = (this.f97044j.hashCode() + ((iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31)) * 31;
        String str5 = this.f97045k;
        return iHashCode8 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        return "MediationAdapter(name=" + this.f97035a + ", logoUrl=" + this.f97036b + ", infoFirst=" + this.f97037c + ", infoSecond=" + this.f97038d + ", waringMessage=" + this.f97039e + ", adUnitId=" + this.f97040f + ", networkAdUnitIdName=" + this.f97041g + ", parameters=" + this.f97042h + ", cpmFloors=" + this.f97043i + ", type=" + this.f97044j + ", sdk=" + this.f97045k + ")";
    }
}
