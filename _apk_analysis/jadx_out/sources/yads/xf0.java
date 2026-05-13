package yads;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class xf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f96752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f96753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f96754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f96755d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f96756e;

    public xf0(String str, String str2, String str3, ArrayList arrayList, LinkedHashMap linkedHashMap) {
        this.f96752a = str;
        this.f96753b = str2;
        this.f96754c = str3;
        this.f96755d = arrayList;
        this.f96756e = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xf0)) {
            return false;
        }
        xf0 xf0Var = (xf0) obj;
        return tn.p.f(this.f96752a, xf0Var.f96752a) && tn.p.f(this.f96753b, xf0Var.f96753b) && tn.p.f(this.f96754c, xf0Var.f96754c) && tn.p.f(this.f96755d, xf0Var.f96755d) && tn.p.f(this.f96756e, xf0Var.f96756e);
    }

    public final int hashCode() {
        int iA = k4.a(this.f96754c, k4.a(this.f96753b, this.f96752a.hashCode() * 31, 31), 31);
        List list = this.f96755d;
        int iHashCode = (iA + (list == null ? 0 : list.hashCode())) * 31;
        Map map = this.f96756e;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "Design(type=" + this.f96752a + ", target=" + this.f96753b + ", layout=" + this.f96754c + ", images=" + this.f96755d + ", analyticsParameters=" + this.f96756e + ")";
    }
}
