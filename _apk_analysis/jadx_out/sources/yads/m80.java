package yads;

import java.util.List;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@so.k
public final class m80 {

    @NotNull
    public static final l80 Companion = new l80();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final KSerializer[] f92304g = {null, null, new wo.f(wq1.f96475a), null, new wo.f(xu1.f96875a), new wo.f(fu1.f89677a)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m50 f92305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t80 f92306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f92307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t50 f92308d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f92309e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f92310f;

    public /* synthetic */ m80(int i10, m50 m50Var, t80 t80Var, List list, t50 t50Var, List list2, List list3) {
        if (63 != (i10 & 63)) {
            wo.c2.a(i10, 63, k80.f91508a.getDescriptor());
        }
        this.f92305a = m50Var;
        this.f92306b = t80Var;
        this.f92307c = list;
        this.f92308d = t50Var;
        this.f92309e = list2;
        this.f92310f = list3;
    }

    public m80(m50 m50Var, t80 t80Var, List list, t50 t50Var, List list2, List list3) {
        this.f92305a = m50Var;
        this.f92306b = t80Var;
        this.f92307c = list;
        this.f92308d = t50Var;
        this.f92309e = list2;
        this.f92310f = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m80)) {
            return false;
        }
        m80 m80Var = (m80) obj;
        return tn.p.f(this.f92305a, m80Var.f92305a) && tn.p.f(this.f92306b, m80Var.f92306b) && tn.p.f(this.f92307c, m80Var.f92307c) && tn.p.f(this.f92308d, m80Var.f92308d) && tn.p.f(this.f92309e, m80Var.f92309e) && tn.p.f(this.f92310f, m80Var.f92310f);
    }

    public final int hashCode() {
        return this.f92310f.hashCode() + eb.a(this.f92309e, (this.f92308d.hashCode() + eb.a(this.f92307c, (this.f92306b.hashCode() + (this.f92305a.hashCode() * 31)) * 31, 31)) * 31, 31);
    }

    public final String toString() {
        return "DebugPanelReportData(appData=" + this.f92305a + ", sdkData=" + this.f92306b + ", networksData=" + this.f92307c + ", consentsData=" + this.f92308d + ", sdkLogs=" + this.f92309e + ", networkLogs=" + this.f92310f + ")";
    }
}
