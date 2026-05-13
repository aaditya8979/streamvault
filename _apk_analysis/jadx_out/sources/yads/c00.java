package yads;

import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class c00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f88255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final la f88256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f88257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f88258d;

    public c00(String str, la laVar, String str2, List list) {
        this.f88255a = str;
        this.f88256b = laVar;
        this.f88257c = str2;
        this.f88258d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c00)) {
            return false;
        }
        c00 c00Var = (c00) obj;
        return tn.p.f(this.f88255a, c00Var.f88255a) && tn.p.f(this.f88256b, c00Var.f88256b) && tn.p.f(this.f88257c, c00Var.f88257c) && tn.p.f(this.f88258d, c00Var.f88258d);
    }

    public final int hashCode() {
        int iHashCode = this.f88255a.hashCode() * 31;
        la laVar = this.f88256b;
        int iHashCode2 = (iHashCode + (laVar == null ? 0 : laVar.hashCode())) * 31;
        String str = this.f88257c;
        return this.f88258d.hashCode() + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "CoreAdInfo(adUnitId=" + this.f88255a + ", adSize=" + this.f88256b + ", data=" + this.f88257c + ", creatives=" + this.f88258d + ")";
    }
}
