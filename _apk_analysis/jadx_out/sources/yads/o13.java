package yads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class o13 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f93075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f93076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f93077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f93078d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final dm f93079e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g13 f93080f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f93081g;

    public o13(String str, String str2, String str3, String str4, dm dmVar, g13 g13Var, ArrayList arrayList) {
        this.f93075a = str;
        this.f93076b = str2;
        this.f93077c = str3;
        this.f93078d = str4;
        this.f93079e = dmVar;
        this.f93080f = g13Var;
        this.f93081g = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o13)) {
            return false;
        }
        o13 o13Var = (o13) obj;
        return tn.p.f(this.f93075a, o13Var.f93075a) && tn.p.f(this.f93076b, o13Var.f93076b) && tn.p.f(this.f93077c, o13Var.f93077c) && tn.p.f(this.f93078d, o13Var.f93078d) && tn.p.f(this.f93079e, o13Var.f93079e) && tn.p.f(this.f93080f, o13Var.f93080f) && tn.p.f(this.f93081g, o13Var.f93081g);
    }

    public final int hashCode() {
        String str = this.f93075a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f93076b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f93077c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f93078d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        dm dmVar = this.f93079e;
        int iHashCode5 = (iHashCode4 + (dmVar == null ? 0 : dmVar.hashCode())) * 31;
        g13 g13Var = this.f93080f;
        int iHashCode6 = (iHashCode5 + (g13Var == null ? 0 : g13Var.hashCode())) * 31;
        List list = this.f93081g;
        return iHashCode6 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "SmartCenterSettings(colorWizButton=" + this.f93075a + ", colorWizButtonText=" + this.f93076b + ", colorWizBack=" + this.f93077c + ", colorWizBackRight=" + this.f93078d + ", backgroundColors=" + this.f93079e + ", smartCenter=" + this.f93080f + ", smartCenters=" + this.f93081g + ")";
    }
}
