package yads;

import java.util.List;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@so.k
public final class j80 {

    @NotNull
    public static final i80 Companion = new i80();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final KSerializer[] f91118h = {null, null, null, null, new wo.f(e50.f89100a), new wo.f(c40.f88333a), new wo.f(e80.f89155a)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f91119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f91120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f91121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f91122d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f91123e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f91124f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f91125g;

    public /* synthetic */ j80(int i10, String str, String str2, String str3, String str4, List list, List list2, List list3) {
        if (64 != (i10 & 64)) {
            wo.c2.a(i10, 64, h80.f90275a.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.f91119a = null;
        } else {
            this.f91119a = str;
        }
        if ((i10 & 2) == 0) {
            this.f91120b = null;
        } else {
            this.f91120b = str2;
        }
        if ((i10 & 4) == 0) {
            this.f91121c = null;
        } else {
            this.f91121c = str3;
        }
        if ((i10 & 8) == 0) {
            this.f91122d = null;
        } else {
            this.f91122d = str4;
        }
        if ((i10 & 16) == 0) {
            this.f91123e = null;
        } else {
            this.f91123e = list;
        }
        if ((i10 & 32) == 0) {
            this.f91124f = null;
        } else {
            this.f91124f = list2;
        }
        this.f91125g = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j80)) {
            return false;
        }
        j80 j80Var = (j80) obj;
        return tn.p.f(this.f91119a, j80Var.f91119a) && tn.p.f(this.f91120b, j80Var.f91120b) && tn.p.f(this.f91121c, j80Var.f91121c) && tn.p.f(this.f91122d, j80Var.f91122d) && tn.p.f(this.f91123e, j80Var.f91123e) && tn.p.f(this.f91124f, j80Var.f91124f) && tn.p.f(this.f91125g, j80Var.f91125g);
    }

    public final int hashCode() {
        String str = this.f91119a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f91120b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f91121c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f91122d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List list = this.f91123e;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f91124f;
        return this.f91125g.hashCode() + ((iHashCode5 + (list2 != null ? list2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "DebugPanelRemoteData(pageId=" + this.f91119a + ", latestSdkVersion=" + this.f91120b + ", appAdsTxtUrl=" + this.f91121c + ", appStatus=" + this.f91122d + ", alerts=" + this.f91123e + ", adUnits=" + this.f91124f + ", mediationNetworks=" + this.f91125g + ")";
    }
}
