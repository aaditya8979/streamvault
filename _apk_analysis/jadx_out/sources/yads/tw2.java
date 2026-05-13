package yads;

import com.ironsource.C3978d4;

/* JADX INFO: loaded from: classes2.dex */
public final class tw2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xw2 f95410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xw2 f95411b;

    public tw2(xw2 xw2Var) {
        this(xw2Var, xw2Var);
    }

    public tw2(xw2 xw2Var, xw2 xw2Var2) {
        this.f95410a = (xw2) ni.a(xw2Var);
        this.f95411b = (xw2) ni.a(xw2Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tw2.class != obj.getClass()) {
            return false;
        }
        tw2 tw2Var = (tw2) obj;
        return this.f95410a.equals(tw2Var.f95410a) && this.f95411b.equals(tw2Var.f95411b);
    }

    public final int hashCode() {
        return this.f95411b.hashCode() + (this.f95410a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder(C3978d4.j.f31383d);
        sb2.append(this.f95410a);
        if (this.f95410a.equals(this.f95411b)) {
            str = "";
        } else {
            str = ", " + this.f95411b;
        }
        sb2.append(str);
        sb2.append(C3978d4.j.f31385e);
        return sb2.toString();
    }
}
