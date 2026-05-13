package yads;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class b20 implements vj3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f87880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f87881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f87882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f87883d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e20 f87884e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f87885f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n03 f87886g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f87887h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f87888i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f87889j;

    public b20(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, e20 e20Var, String str, n03 n03Var, String str2, int i10, String str3) {
        this.f87880a = arrayList;
        this.f87881b = arrayList2;
        this.f87882c = arrayList3;
        this.f87883d = arrayList4;
        this.f87884e = e20Var;
        this.f87885f = str;
        this.f87886g = n03Var;
        this.f87887h = str2;
        this.f87888i = i10;
        this.f87889j = str3;
    }

    @Override // yads.vj3
    public final Map a() {
        List<x73> list = this.f87883d;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (x73 x73Var : list) {
            String str = x73Var.f96651a;
            Object arrayList = linkedHashMap.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(str, arrayList);
            }
            ((List) arrayList).add(x73Var.f96652b);
        }
        return linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b20)) {
            return false;
        }
        b20 b20Var = (b20) obj;
        return tn.p.f(this.f87880a, b20Var.f87880a) && tn.p.f(this.f87881b, b20Var.f87881b) && tn.p.f(this.f87882c, b20Var.f87882c) && tn.p.f(this.f87883d, b20Var.f87883d) && tn.p.f(this.f87884e, b20Var.f87884e) && tn.p.f(this.f87885f, b20Var.f87885f) && tn.p.f(this.f87886g, b20Var.f87886g) && tn.p.f(this.f87887h, b20Var.f87887h) && this.f87888i == b20Var.f87888i && tn.p.f(this.f87889j, b20Var.f87889j);
    }

    public final int hashCode() {
        int iA = eb.a(this.f87883d, eb.a(this.f87882c, eb.a(this.f87881b, this.f87880a.hashCode() * 31, 31), 31), 31);
        e20 e20Var = this.f87884e;
        int iHashCode = (iA + (e20Var == null ? 0 : e20Var.hashCode())) * 31;
        String str = this.f87885f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        n03 n03Var = this.f87886g;
        int iHashCode3 = (iHashCode2 + (n03Var == null ? 0 : n03Var.hashCode())) * 31;
        String str2 = this.f87887h;
        int iA2 = nd3.a(this.f87888i, (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.f87889j;
        return iA2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "Creative(mediaFiles=" + this.f87880a + ", interactiveCreativeFiles=" + this.f87881b + ", icons=" + this.f87882c + ", trackingEventsList=" + this.f87883d + ", creativeExtensions=" + this.f87884e + ", clickThroughUrl=" + this.f87885f + ", skipOffset=" + this.f87886g + ", id=" + this.f87887h + ", durationMillis=" + this.f87888i + ", adParameters=" + this.f87889j + ")";
    }
}
