package yads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class b50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f87906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f87907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f87908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f87909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f87910e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f87911f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a50 f87912g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f87913h;

    public b50(String str, String str2, boolean z10, String str3, String str4, String str5, a50 a50Var, ArrayList arrayList) {
        this.f87906a = str;
        this.f87907b = str2;
        this.f87908c = z10;
        this.f87909d = str3;
        this.f87910e = str4;
        this.f87911f = str5;
        this.f87912g = a50Var;
        this.f87913h = arrayList;
    }

    public final a50 a() {
        return this.f87912g;
    }

    public final String b() {
        return this.f87909d;
    }

    public final String c() {
        return this.f87910e;
    }

    public final String d() {
        return this.f87907b;
    }

    public final String e() {
        return this.f87906a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b50)) {
            return false;
        }
        b50 b50Var = (b50) obj;
        return tn.p.f(this.f87906a, b50Var.f87906a) && tn.p.f(this.f87907b, b50Var.f87907b) && this.f87908c == b50Var.f87908c && tn.p.f(this.f87909d, b50Var.f87909d) && tn.p.f(this.f87910e, b50Var.f87910e) && tn.p.f(this.f87911f, b50Var.f87911f) && tn.p.f(this.f87912g, b50Var.f87912g) && tn.p.f(this.f87913h, b50Var.f87913h);
    }

    public final String f() {
        return this.f87911f;
    }

    public final int hashCode() {
        int iHashCode = this.f87906a.hashCode() * 31;
        String str = this.f87907b;
        int iHashCode2 = (Boolean.hashCode(this.f87908c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.f87909d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f87910e;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f87911f;
        int iHashCode5 = (this.f87912g.hashCode() + ((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31;
        List list = this.f87913h;
        return iHashCode5 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "DebugPanelAdapterData(name=" + this.f87906a + ", logoUrl=" + this.f87907b + ", adapterIntegrationStatus=" + this.f87908c + ", adapterVersion=" + this.f87909d + ", latestAdapterVersion=" + this.f87910e + ", sdkVersion=" + this.f87911f + ", adapterStatus=" + this.f87912g + ", formats=" + this.f87913h + ")";
    }
}
