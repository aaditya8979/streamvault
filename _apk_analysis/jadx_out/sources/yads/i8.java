package yads;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class i8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f90698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f90699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f90700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f90701d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set f90702e;

    public i8(int i10, boolean z10, boolean z11, LinkedHashMap linkedHashMap, Set set) {
        this.f90698a = i10;
        this.f90699b = z10;
        this.f90700c = z11;
        this.f90701d = linkedHashMap;
        this.f90702e = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i8)) {
            return false;
        }
        i8 i8Var = (i8) obj;
        return this.f90698a == i8Var.f90698a && this.f90699b == i8Var.f90699b && this.f90700c == i8Var.f90700c && tn.p.f(this.f90701d, i8Var.f90701d) && tn.p.f(this.f90702e, i8Var.f90702e);
    }

    public final int hashCode() {
        return this.f90702e.hashCode() + ((this.f90701d.hashCode() + ((Boolean.hashCode(this.f90700c) + ((Boolean.hashCode(this.f90699b) + (Integer.hashCode(this.f90698a) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AdQualityVerificationPolicy(usagePercent=" + this.f90698a + ", enabled=" + this.f90699b + ", blockAdOnInternalError=" + this.f90700c + ", adNetworksCustomParameters=" + this.f90701d + ", enabledAdUnits=" + this.f90702e + ")";
    }
}
