package yads;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@so.k
public final class ar1 {

    @NotNull
    public static final zq1 Companion = new zq1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f87789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f87790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f87791c;

    public /* synthetic */ ar1(int i10, String str, String str2, boolean z10) {
        if (7 != (i10 & 7)) {
            wo.c2.a(i10, 7, yq1.f97269a.getDescriptor());
        }
        this.f87789a = str;
        this.f87790b = str2;
        this.f87791c = z10;
    }

    public ar1(String str, String str2, boolean z10) {
        this.f87789a = str;
        this.f87790b = str2;
        this.f87791c = z10;
    }

    public final String a() {
        return this.f87789a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ar1)) {
            return false;
        }
        ar1 ar1Var = (ar1) obj;
        return tn.p.f(this.f87789a, ar1Var.f87789a) && tn.p.f(this.f87790b, ar1Var.f87790b) && this.f87791c == ar1Var.f87791c;
    }

    public final int hashCode() {
        int iHashCode = this.f87789a.hashCode() * 31;
        String str = this.f87790b;
        return Boolean.hashCode(this.f87791c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "MediationAdapterData(format=" + this.f87789a + ", version=" + this.f87790b + ", isIntegrated=" + this.f87791c + ")";
    }
}
