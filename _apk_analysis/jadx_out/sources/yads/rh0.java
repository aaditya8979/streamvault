package yads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class rh0 implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f94449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gi0 f94450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f94451c;

    public rh0(String str, gi0 gi0Var, ArrayList arrayList) {
        this.f94449a = str;
        this.f94450b = gi0Var;
        this.f94451c = arrayList;
    }

    @Override // yads.m0
    public final String a() {
        return this.f94449a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rh0)) {
            return false;
        }
        rh0 rh0Var = (rh0) obj;
        return tn.p.f(this.f94449a, rh0Var.f94449a) && tn.p.f(this.f94450b, rh0Var.f94450b) && tn.p.f(this.f94451c, rh0Var.f94451c);
    }

    public final int hashCode() {
        return this.f94451c.hashCode() + ((this.f94450b.hashCode() + (this.f94449a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DivKitAdtuneAction(actionType=" + this.f94449a + ", design=" + this.f94450b + ", trackingUrls=" + this.f94451c + ")";
    }
}
