package yads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class gd3 implements vj3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f89952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ae1 f89953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f89954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f89955d;

    public gd3(String str, ae1 ae1Var, String str2, HashMap map) {
        this.f89952a = str;
        this.f89953b = ae1Var;
        this.f89954c = str2;
        this.f89955d = map;
    }

    @Override // yads.vj3
    public final Map a() {
        return Collections.unmodifiableMap(this.f89955d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gd3)) {
            return false;
        }
        gd3 gd3Var = (gd3) obj;
        return tn.p.f(this.f89952a, gd3Var.f89952a) && tn.p.f(this.f89953b, gd3Var.f89953b) && tn.p.f(this.f89954c, gd3Var.f89954c) && tn.p.f(this.f89955d, gd3Var.f89955d);
    }

    public final int hashCode() {
        int iHashCode = this.f89952a.hashCode() * 31;
        ae1 ae1Var = this.f89953b;
        int iHashCode2 = (iHashCode + (ae1Var == null ? 0 : ae1Var.hashCode())) * 31;
        String str = this.f89954c;
        return this.f89955d.hashCode() + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Verification(vendor=" + this.f89952a + ", javaScriptResource=" + this.f89953b + ", parameters=" + this.f89954c + ", events=" + this.f89955d + ")";
    }
}
