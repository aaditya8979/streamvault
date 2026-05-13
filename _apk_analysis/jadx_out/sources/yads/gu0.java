package yads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class gu0 implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f90119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f90120b;

    public gu0(String str, ArrayList arrayList) {
        this.f90119a = str;
        this.f90120b = arrayList;
    }

    @Override // yads.m0
    public final String a() {
        return this.f90119a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gu0)) {
            return false;
        }
        gu0 gu0Var = (gu0) obj;
        return tn.p.f(this.f90119a, gu0Var.f90119a) && tn.p.f(this.f90120b, gu0Var.f90120b);
    }

    public final int hashCode() {
        return this.f90120b.hashCode() + (this.f90119a.hashCode() * 31);
    }

    public final String toString() {
        return "FeedbackAction(actionType=" + this.f90119a + ", items=" + this.f90120b + ")";
    }
}
