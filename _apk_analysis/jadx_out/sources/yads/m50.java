package yads;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@so.k
public final class m50 {

    @NotNull
    public static final l50 Companion = new l50();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f92265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f92266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f92267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f92268d;

    public /* synthetic */ m50(int i10, String str, String str2, String str3, String str4) {
        if (15 != (i10 & 15)) {
            wo.c2.a(i10, 15, k50.f91488a.getDescriptor());
        }
        this.f92265a = str;
        this.f92266b = str2;
        this.f92267c = str3;
        this.f92268d = str4;
    }

    public m50(String str, String str2, String str3, String str4) {
        this.f92265a = str;
        this.f92266b = str2;
        this.f92267c = str3;
        this.f92268d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m50)) {
            return false;
        }
        m50 m50Var = (m50) obj;
        return tn.p.f(this.f92265a, m50Var.f92265a) && tn.p.f(this.f92266b, m50Var.f92266b) && tn.p.f(this.f92267c, m50Var.f92267c) && tn.p.f(this.f92268d, m50Var.f92268d);
    }

    public final int hashCode() {
        return this.f92268d.hashCode() + k4.a(this.f92267c, k4.a(this.f92266b, this.f92265a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "DebugPanelAppData(appId=" + this.f92265a + ", appVersion=" + this.f92266b + ", system=" + this.f92267c + ", androidApiLevel=" + this.f92268d + ")";
    }
}
