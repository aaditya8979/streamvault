package yads;

import java.util.List;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@so.k
public final class h40 {

    @NotNull
    public static final g40 Companion = new g40();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final KSerializer[] f90236f = {null, null, new wo.f(n50.f92741a), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f90237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f90238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f90239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f90240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f90241e;

    public /* synthetic */ h40(int i10, String str, String str2, List list, String str3, String str4) {
        if (6 != (i10 & 6)) {
            wo.c2.a(i10, 6, f40.f89475a.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.f90237a = null;
        } else {
            this.f90237a = str;
        }
        this.f90238b = str2;
        this.f90239c = list;
        if ((i10 & 8) == 0) {
            this.f90240d = null;
        } else {
            this.f90240d = str3;
        }
        if ((i10 & 16) == 0) {
            this.f90241e = null;
        } else {
            this.f90241e = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h40)) {
            return false;
        }
        h40 h40Var = (h40) obj;
        return tn.p.f(this.f90237a, h40Var.f90237a) && tn.p.f(this.f90238b, h40Var.f90238b) && tn.p.f(this.f90239c, h40Var.f90239c) && tn.p.f(this.f90240d, h40Var.f90240d) && tn.p.f(this.f90241e, h40Var.f90241e);
    }

    public final int hashCode() {
        String str = this.f90237a;
        int iA = eb.a(this.f90239c, k4.a(this.f90238b, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
        String str2 = this.f90240d;
        int iHashCode = (iA + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f90241e;
        return iHashCode + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "DebugPanelAdUnitBiddingMediation(adapter=" + this.f90237a + ", networkName=" + this.f90238b + ", biddingParameters=" + this.f90239c + ", adUnitId=" + this.f90240d + ", networkAdUnitIdName=" + this.f90241e + ")";
    }
}
