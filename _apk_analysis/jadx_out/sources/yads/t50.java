package yads;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@so.k
public final class t50 {

    @NotNull
    public static final s50 Companion = new s50();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f95064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f95065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f95066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f95067d;

    public /* synthetic */ t50(int i10, boolean z10, Boolean bool, Boolean bool2, boolean z11) {
        if (15 != (i10 & 15)) {
            wo.c2.a(i10, 15, r50.f94283a.getDescriptor());
        }
        this.f95064a = z10;
        this.f95065b = bool;
        this.f95066c = bool2;
        this.f95067d = z11;
    }

    public t50(boolean z10, Boolean bool, Boolean bool2, boolean z11) {
        this.f95064a = z10;
        this.f95065b = bool;
        this.f95066c = bool2;
        this.f95067d = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t50)) {
            return false;
        }
        t50 t50Var = (t50) obj;
        return this.f95064a == t50Var.f95064a && tn.p.f(this.f95065b, t50Var.f95065b) && tn.p.f(this.f95066c, t50Var.f95066c) && this.f95067d == t50Var.f95067d;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f95064a) * 31;
        Boolean bool = this.f95065b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f95066c;
        return Boolean.hashCode(this.f95067d) + ((iHashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "DebugPanelConsentsData(hasLocationConsent=" + this.f95064a + ", ageRestrictedUser=" + this.f95065b + ", hasUserConsent=" + this.f95066c + ", hasCmpValue=" + this.f95067d + ")";
    }
}
