package yads;

import java.util.List;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@so.k
public final class u40 {

    @NotNull
    public static final t40 Companion = new t40();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final KSerializer[] f95540g = {null, null, new wo.f(la0.f91918a), null, null, new wo.f(fa0.f89521a)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f95541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f95542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f95543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f95544d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ka0 f95545e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f95546f;

    public /* synthetic */ u40(int i10, String str, String str2, List list, String str3, ka0 ka0Var, List list2) {
        if (54 != (i10 & 54)) {
            wo.c2.a(i10, 54, s40.f94698a.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.f95541a = null;
        } else {
            this.f95541a = str;
        }
        this.f95542b = str2;
        this.f95543c = list;
        if ((i10 & 8) == 0) {
            this.f95544d = null;
        } else {
            this.f95544d = str3;
        }
        this.f95545e = ka0Var;
        this.f95546f = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u40)) {
            return false;
        }
        u40 u40Var = (u40) obj;
        return tn.p.f(this.f95541a, u40Var.f95541a) && tn.p.f(this.f95542b, u40Var.f95542b) && tn.p.f(this.f95543c, u40Var.f95543c) && tn.p.f(this.f95544d, u40Var.f95544d) && tn.p.f(this.f95545e, u40Var.f95545e) && tn.p.f(this.f95546f, u40Var.f95546f);
    }

    public final int hashCode() {
        String str = this.f95541a;
        int iA = eb.a(this.f95543c, k4.a(this.f95542b, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
        String str2 = this.f95544d;
        int iHashCode = (iA + (str2 == null ? 0 : str2.hashCode())) * 31;
        ka0 ka0Var = this.f95545e;
        return this.f95546f.hashCode() + ((iHashCode + (ka0Var != null ? ka0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "DebugPanelAdUnitWaterfallMediation(adapter=" + this.f95541a + ", networkName=" + this.f95542b + ", waterfallParameters=" + this.f95543c + ", networkAdUnitIdName=" + this.f95544d + ", currency=" + this.f95545e + ", cpmFloors=" + this.f95546f + ")";
    }
}
