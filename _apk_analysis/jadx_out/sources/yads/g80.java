package yads;

import java.util.List;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import wo.w2;

/* JADX INFO: loaded from: classes6.dex */
@so.k
public final class g80 {

    @NotNull
    public static final f80 Companion = new f80();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final KSerializer[] f89865g = {null, null, null, null, new wo.f(w2.f86635a), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f89866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f89867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f89868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f89869d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f89870e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f89871f;

    public /* synthetic */ g80(int i10, String str, String str2, String str3, String str4, List list, String str5) {
        if (18 != (i10 & 18)) {
            wo.c2.a(i10, 18, e80.f89155a.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.f89866a = null;
        } else {
            this.f89866a = str;
        }
        this.f89867b = str2;
        if ((i10 & 4) == 0) {
            this.f89868c = null;
        } else {
            this.f89868c = str3;
        }
        if ((i10 & 8) == 0) {
            this.f89869d = null;
        } else {
            this.f89869d = str4;
        }
        this.f89870e = list;
        if ((i10 & 32) == 0) {
            this.f89871f = null;
        } else {
            this.f89871f = str5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g80)) {
            return false;
        }
        g80 g80Var = (g80) obj;
        return tn.p.f(this.f89866a, g80Var.f89866a) && tn.p.f(this.f89867b, g80Var.f89867b) && tn.p.f(this.f89868c, g80Var.f89868c) && tn.p.f(this.f89869d, g80Var.f89869d) && tn.p.f(this.f89870e, g80Var.f89870e) && tn.p.f(this.f89871f, g80Var.f89871f);
    }

    public final int hashCode() {
        String str = this.f89866a;
        int iA = k4.a(this.f89867b, (str == null ? 0 : str.hashCode()) * 31, 31);
        String str2 = this.f89868c;
        int iHashCode = (iA + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f89869d;
        int iA2 = eb.a(this.f89870e, (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        String str4 = this.f89871f;
        return iA2 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return "DebugPanelMediationNetwork(id=" + this.f89866a + ", name=" + this.f89867b + ", logoUrl=" + this.f89868c + ", adapterStatus=" + this.f89869d + ", adapters=" + this.f89870e + ", latestAdapterVersion=" + this.f89871f + ")";
    }
}
