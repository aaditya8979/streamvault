package yads;

import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@so.k
public final class br1 {

    @NotNull
    public static final xq1 Companion = new xq1();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final KSerializer[] f88114e = {null, null, null, new wo.f(yq1.f97269a)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f88115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f88116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f88117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f88118d;

    public /* synthetic */ br1(int i10, String str, String str2, String str3, List list) {
        if (15 != (i10 & 15)) {
            wo.c2.a(i10, 15, wq1.f96475a.getDescriptor());
        }
        this.f88115a = str;
        this.f88116b = str2;
        this.f88117c = str3;
        this.f88118d = list;
    }

    public br1(String str, String str2, String str3, ArrayList arrayList) {
        this.f88115a = str;
        this.f88116b = str2;
        this.f88117c = str3;
        this.f88118d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof br1)) {
            return false;
        }
        br1 br1Var = (br1) obj;
        return tn.p.f(this.f88115a, br1Var.f88115a) && tn.p.f(this.f88116b, br1Var.f88116b) && tn.p.f(this.f88117c, br1Var.f88117c) && tn.p.f(this.f88118d, br1Var.f88118d);
    }

    public final int hashCode() {
        int iA = k4.a(this.f88116b, this.f88115a.hashCode() * 31, 31);
        String str = this.f88117c;
        return this.f88118d.hashCode() + ((iA + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "MediationNetworkData(name=" + this.f88115a + ", id=" + this.f88116b + ", version=" + this.f88117c + ", adapters=" + this.f88118d + ")";
    }
}
