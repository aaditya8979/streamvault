package yads;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class fy1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cq2 f89726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f89727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f89728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f89729d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final if1 f89730e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j5 f89731f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f89732g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f89733h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final gc f89734i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f89735j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f89736k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Map f89737l;

    public fy1(cq2 cq2Var, List list, String str, String str2, if1 if1Var, j5 j5Var, List list2, List list3, gc gcVar, String str3, String str4, Map map) {
        this.f89726a = cq2Var;
        this.f89727b = list;
        this.f89728c = str;
        this.f89729d = str2;
        this.f89730e = if1Var;
        this.f89731f = j5Var;
        this.f89732g = list2;
        this.f89733h = list3;
        this.f89734i = gcVar;
        this.f89735j = str3;
        this.f89736k = str4;
        this.f89737l = map;
    }

    public final if1 a() {
        return this.f89730e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fy1)) {
            return false;
        }
        fy1 fy1Var = (fy1) obj;
        return this.f89726a == fy1Var.f89726a && tn.p.f(this.f89727b, fy1Var.f89727b) && tn.p.f(this.f89728c, fy1Var.f89728c) && tn.p.f(this.f89729d, fy1Var.f89729d) && tn.p.f(this.f89730e, fy1Var.f89730e) && tn.p.f(this.f89731f, fy1Var.f89731f) && tn.p.f(this.f89732g, fy1Var.f89732g) && tn.p.f(this.f89733h, fy1Var.f89733h) && tn.p.f(this.f89734i, fy1Var.f89734i) && tn.p.f(this.f89735j, fy1Var.f89735j) && tn.p.f(this.f89736k, fy1Var.f89736k) && tn.p.f(this.f89737l, fy1Var.f89737l);
    }

    public final int hashCode() {
        int iA = eb.a(this.f89727b, this.f89726a.hashCode() * 31, 31);
        String str = this.f89728c;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f89729d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        if1 if1Var = this.f89730e;
        int iHashCode3 = (iHashCode2 + (if1Var == null ? 0 : if1Var.hashCode())) * 31;
        j5 j5Var = this.f89731f;
        int iA2 = eb.a(this.f89733h, eb.a(this.f89732g, (iHashCode3 + (j5Var == null ? 0 : j5Var.f91096b.hashCode())) * 31, 31), 31);
        gc gcVar = this.f89734i;
        int iHashCode4 = (iA2 + (gcVar == null ? 0 : gcVar.hashCode())) * 31;
        String str3 = this.f89735j;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f89736k;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Map map = this.f89737l;
        return iHashCode6 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "Native(responseNativeType=" + this.f89726a + ", assets=" + this.f89727b + ", adId=" + this.f89728c + ", info=" + this.f89729d + ", link=" + this.f89730e + ", impressionData=" + this.f89731f + ", renderTrackingUrls=" + this.f89732g + ", showNotices=" + this.f89733h + ", additionalInfo=" + this.f89734i + ", creativeId=" + this.f89735j + ", campaignId=" + this.f89736k + ", analyticsParameters=" + this.f89737l + ")";
    }
}
