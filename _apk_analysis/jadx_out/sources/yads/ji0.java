package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes12.dex */
public final class ji0 implements ag0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9 f91231a;

    public ji0(v9 v9Var) {
        this.f91231a = v9Var;
    }

    @Override // yads.ag0
    public final boolean a(Context context) {
        String str = this.f91231a.f96000k;
        eg0[] eg0VarArr = eg0.f89242b;
        return tn.p.f("divkit", str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ji0) && tn.p.f(this.f91231a, ((ji0) obj).f91231a);
    }

    public final int hashCode() {
        return this.f91231a.hashCode();
    }

    public final String toString() {
        return "DivKitDesignConstraint(adResponse=" + this.f91231a + ")";
    }
}
