package yads;

import android.location.Location;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class g9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f89877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f89878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f89879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f89880d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f89881e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Location f89882f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f89883g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f89884h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f89885i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final gp2 f89886j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f89887k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f89888l;

    public g9(String str, String str2, String str3, String str4, List list, Location location, Map map, String str5, String str6, gp2 gp2Var, boolean z10, String str7) {
        this.f89877a = str;
        this.f89878b = str2;
        this.f89879c = str3;
        this.f89880d = str4;
        this.f89881e = list;
        this.f89882f = location;
        this.f89883g = map;
        this.f89884h = str5;
        this.f89885i = str6;
        this.f89886j = gp2Var;
        this.f89887k = z10;
        this.f89888l = str7;
    }

    public static g9 a(g9 g9Var, Map map, String str, int i10) {
        return new g9(g9Var.f89877a, g9Var.f89878b, g9Var.f89879c, g9Var.f89880d, g9Var.f89881e, g9Var.f89882f, (i10 & 64) != 0 ? g9Var.f89883g : map, g9Var.f89884h, g9Var.f89885i, g9Var.f89886j, g9Var.f89887k, (i10 & 2048) != 0 ? g9Var.f89888l : str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g9)) {
            return false;
        }
        g9 g9Var = (g9) obj;
        return tn.p.f(this.f89877a, g9Var.f89877a) && tn.p.f(this.f89878b, g9Var.f89878b) && tn.p.f(this.f89879c, g9Var.f89879c) && tn.p.f(this.f89880d, g9Var.f89880d) && tn.p.f(this.f89881e, g9Var.f89881e) && tn.p.f(this.f89882f, g9Var.f89882f) && tn.p.f(this.f89883g, g9Var.f89883g) && tn.p.f(this.f89884h, g9Var.f89884h) && tn.p.f(this.f89885i, g9Var.f89885i) && this.f89886j == g9Var.f89886j && this.f89887k == g9Var.f89887k && tn.p.f(this.f89888l, g9Var.f89888l);
    }

    public final int hashCode() {
        int iHashCode = this.f89877a.hashCode() * 31;
        String str = this.f89878b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f89879c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f89880d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.f89881e;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Location location = this.f89882f;
        int iHashCode6 = (iHashCode5 + (location == null ? 0 : location.hashCode())) * 31;
        Map map = this.f89883g;
        int iHashCode7 = (iHashCode6 + (map == null ? 0 : map.hashCode())) * 31;
        String str4 = this.f89884h;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f89885i;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        gp2 gp2Var = this.f89886j;
        int iHashCode10 = (Boolean.hashCode(this.f89887k) + ((iHashCode9 + (gp2Var == null ? 0 : gp2Var.hashCode())) * 31)) * 31;
        String str6 = this.f89888l;
        return iHashCode10 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        return "AdRequestData(adUnitId=" + this.f89877a + ", age=" + this.f89878b + ", gender=" + this.f89879c + ", contextQuery=" + this.f89880d + ", contextTags=" + this.f89881e + ", location=" + this.f89882f + ", parameters=" + this.f89883g + ", openBiddingData=" + this.f89884h + ", readyResponse=" + this.f89885i + ", preferredTheme=" + this.f89886j + ", shouldLoadImagesAutomatically=" + this.f89887k + ", preloadType=" + this.f89888l + ")";
    }
}
