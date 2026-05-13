package yads;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ud3 implements vj3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f95602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f95603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f95604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final de3 f95605d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f95606e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f95607f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f95608g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f95609h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f95610i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ol3 f95611j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Integer f95612k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f95613l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ip3 f95614m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f95615n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Map f95616o;

    public ud3(boolean z10, ArrayList arrayList, LinkedHashMap linkedHashMap, de3 de3Var, String str, String str2, String str3, String str4, String str5, ol3 ol3Var, Integer num, String str6, ip3 ip3Var, ArrayList arrayList2, Map map) {
        this.f95602a = z10;
        this.f95603b = arrayList;
        this.f95604c = linkedHashMap;
        this.f95605d = de3Var;
        this.f95606e = str;
        this.f95607f = str2;
        this.f95608g = str3;
        this.f95609h = str4;
        this.f95610i = str5;
        this.f95611j = ol3Var;
        this.f95612k = num;
        this.f95613l = str6;
        this.f95614m = ip3Var;
        this.f95615n = arrayList2;
        this.f95616o = map;
    }

    @Override // yads.vj3
    public final Map a() {
        return this.f95616o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ud3)) {
            return false;
        }
        ud3 ud3Var = (ud3) obj;
        return this.f95602a == ud3Var.f95602a && tn.p.f(this.f95603b, ud3Var.f95603b) && tn.p.f(this.f95604c, ud3Var.f95604c) && tn.p.f(this.f95605d, ud3Var.f95605d) && tn.p.f(this.f95606e, ud3Var.f95606e) && tn.p.f(this.f95607f, ud3Var.f95607f) && tn.p.f(this.f95608g, ud3Var.f95608g) && tn.p.f(this.f95609h, ud3Var.f95609h) && tn.p.f(this.f95610i, ud3Var.f95610i) && tn.p.f(this.f95611j, ud3Var.f95611j) && tn.p.f(this.f95612k, ud3Var.f95612k) && tn.p.f(this.f95613l, ud3Var.f95613l) && tn.p.f(this.f95614m, ud3Var.f95614m) && tn.p.f(this.f95615n, ud3Var.f95615n) && tn.p.f(this.f95616o, ud3Var.f95616o);
    }

    public final int hashCode() {
        int iHashCode = (this.f95605d.hashCode() + ((this.f95604c.hashCode() + eb.a(this.f95603b, Boolean.hashCode(this.f95602a) * 31, 31)) * 31)) * 31;
        String str = this.f95606e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f95607f;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f95608g;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f95609h;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f95610i;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        ol3 ol3Var = this.f95611j;
        int iHashCode7 = (iHashCode6 + (ol3Var == null ? 0 : ol3Var.f93280a.hashCode())) * 31;
        Integer num = this.f95612k;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.f95613l;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        ip3 ip3Var = this.f95614m;
        return this.f95616o.hashCode() + eb.a(this.f95615n, (iHashCode9 + (ip3Var != null ? ip3Var.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        return "VideoAd(isWrapper=" + this.f95602a + ", creatives=" + this.f95603b + ", rawTrackingEvents=" + this.f95604c + ", videoAdExtensions=" + this.f95605d + ", adSystem=" + this.f95606e + ", adTitle=" + this.f95607f + ", description=" + this.f95608g + ", survey=" + this.f95609h + ", vastAdTagUri=" + this.f95610i + ", viewableImpression=" + this.f95611j + ", sequence=" + this.f95612k + ", id=" + this.f95613l + ", wrapperConfiguration=" + this.f95614m + ", adVerifications=" + this.f95615n + ", trackingEvents=" + this.f95616o + ")";
    }
}
