package yads;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class d12 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f88690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f88691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f88692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j5 f88693d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f88694e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f88695f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f88696g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f88697h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final my2 f88698i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c7 f88699j;

    public d12(List list, List list2, List list3, j5 j5Var, Map map, List list4, List list5, String str, my2 my2Var, c7 c7Var) {
        this.f88690a = list;
        this.f88691b = list2;
        this.f88692c = list3;
        this.f88693d = j5Var;
        this.f88694e = map;
        this.f88695f = list4;
        this.f88696g = list5;
        this.f88697h = str;
        this.f88698i = my2Var;
        this.f88699j = c7Var;
    }

    public final List a() {
        return this.f88695f;
    }

    public final my2 b() {
        return this.f88698i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d12)) {
            return false;
        }
        d12 d12Var = (d12) obj;
        return tn.p.f(this.f88690a, d12Var.f88690a) && tn.p.f(this.f88691b, d12Var.f88691b) && tn.p.f(this.f88692c, d12Var.f88692c) && tn.p.f(this.f88693d, d12Var.f88693d) && tn.p.f(this.f88694e, d12Var.f88694e) && tn.p.f(this.f88695f, d12Var.f88695f) && tn.p.f(this.f88696g, d12Var.f88696g) && tn.p.f(this.f88697h, d12Var.f88697h) && tn.p.f(this.f88698i, d12Var.f88698i) && tn.p.f(this.f88699j, d12Var.f88699j);
    }

    public final int hashCode() {
        int iA = eb.a(this.f88692c, eb.a(this.f88691b, this.f88690a.hashCode() * 31, 31), 31);
        j5 j5Var = this.f88693d;
        int iA2 = eb.a(this.f88696g, eb.a(this.f88695f, (this.f88694e.hashCode() + ((iA + (j5Var == null ? 0 : j5Var.f91096b.hashCode())) * 31)) * 31, 31), 31);
        String str = this.f88697h;
        int iHashCode = (iA2 + (str == null ? 0 : str.hashCode())) * 31;
        my2 my2Var = this.f88698i;
        int iHashCode2 = (iHashCode + (my2Var == null ? 0 : my2Var.hashCode())) * 31;
        c7 c7Var = this.f88699j;
        return iHashCode2 + (c7Var != null ? c7Var.hashCode() : 0);
    }

    public final String toString() {
        return "NativeAdResponse(nativeAds=" + this.f88690a + ", assets=" + this.f88691b + ", renderTrackingUrls=" + this.f88692c + ", impressionData=" + this.f88693d + ", properties=" + this.f88694e + ", divKitDesigns=" + this.f88695f + ", showNotices=" + this.f88696g + ", version=" + this.f88697h + ", settings=" + this.f88698i + ", adPod=" + this.f88699j + ")";
    }
}
