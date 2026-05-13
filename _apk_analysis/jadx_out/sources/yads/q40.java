package yads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class q40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f93879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f93880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f93881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f93882d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f93883e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p40 f93884f;

    public q40(String str, String str2, ArrayList arrayList, String str3, String str4, p40 p40Var) {
        this.f93879a = str;
        this.f93880b = str2;
        this.f93881c = arrayList;
        this.f93882d = str3;
        this.f93883e = str4;
        this.f93884f = p40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q40)) {
            return false;
        }
        q40 q40Var = (q40) obj;
        return tn.p.f(this.f93879a, q40Var.f93879a) && tn.p.f(this.f93880b, q40Var.f93880b) && tn.p.f(this.f93881c, q40Var.f93881c) && tn.p.f(this.f93882d, q40Var.f93882d) && tn.p.f(this.f93883e, q40Var.f93883e) && tn.p.f(this.f93884f, q40Var.f93884f);
    }

    public final int hashCode() {
        String str = this.f93879a;
        int iA = eb.a(this.f93881c, k4.a(this.f93880b, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
        String str2 = this.f93882d;
        int iHashCode = (iA + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f93883e;
        return this.f93884f.hashCode() + ((iHashCode + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "DebugPanelAdUnitMediationAdapterData(logoUrl=" + this.f93879a + ", adapterName=" + this.f93880b + ", parameters=" + this.f93881c + ", adUnitId=" + this.f93882d + ", networkAdUnitIdName=" + this.f93883e + ", type=" + this.f93884f + ")";
    }
}
