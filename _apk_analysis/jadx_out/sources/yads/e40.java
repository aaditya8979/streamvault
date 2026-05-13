package yads;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@so.k
public final class e40 {

    @NotNull
    public static final d40 Companion = new d40();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f89089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f89090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f89091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m40 f89092d;

    public /* synthetic */ e40(int i10, String str, String str2, String str3, m40 m40Var) {
        if (7 != (i10 & 7)) {
            wo.c2.a(i10, 7, c40.f88333a.getDescriptor());
        }
        this.f89089a = str;
        this.f89090b = str2;
        this.f89091c = str3;
        if ((i10 & 8) == 0) {
            this.f89092d = null;
        } else {
            this.f89092d = m40Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e40)) {
            return false;
        }
        e40 e40Var = (e40) obj;
        return tn.p.f(this.f89089a, e40Var.f89089a) && tn.p.f(this.f89090b, e40Var.f89090b) && tn.p.f(this.f89091c, e40Var.f89091c) && tn.p.f(this.f89092d, e40Var.f89092d);
    }

    public final int hashCode() {
        int iA = k4.a(this.f89091c, k4.a(this.f89090b, this.f89089a.hashCode() * 31, 31), 31);
        m40 m40Var = this.f89092d;
        return iA + (m40Var == null ? 0 : m40Var.hashCode());
    }

    public final String toString() {
        return "DebugPanelAdUnit(name=" + this.f89089a + ", format=" + this.f89090b + ", adUnitId=" + this.f89091c + ", mediation=" + this.f89092d + ")";
    }
}
