package yads;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class wa0 implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f96318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f96319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f96320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f96321d;

    public wa0(String str, String str2, List list, List list2) {
        this.f96318a = str;
        this.f96319b = str2;
        this.f96320c = list;
        this.f96321d = list2;
    }

    @Override // yads.m0
    public final String a() {
        return this.f96318a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wa0)) {
            return false;
        }
        wa0 wa0Var = (wa0) obj;
        return tn.p.f(this.f96318a, wa0Var.f96318a) && tn.p.f(this.f96319b, wa0Var.f96319b) && tn.p.f(this.f96320c, wa0Var.f96320c) && tn.p.f(this.f96321d, wa0Var.f96321d);
    }

    public final int hashCode() {
        int iA = k4.a(this.f96319b, this.f96318a.hashCode() * 31, 31);
        List list = this.f96320c;
        return this.f96321d.hashCode() + ((iA + (list == null ? 0 : list.hashCode())) * 31);
    }

    public final String toString() {
        return "DeeplinkAction(actionType=" + this.f96318a + ", fallbackUrl=" + this.f96319b + ", fallbackTrackingUrls=" + this.f96320c + ", preferredPackages=" + this.f96321d + ")";
    }
}
