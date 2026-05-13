package yads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class rc implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f94358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f94359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f94360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f94361d;

    public rc(String str, String str2, String str3, ArrayList arrayList) {
        this.f94358a = str;
        this.f94359b = str2;
        this.f94360c = str3;
        this.f94361d = arrayList;
    }

    @Override // yads.m0
    public final String a() {
        return this.f94358a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rc)) {
            return false;
        }
        rc rcVar = (rc) obj;
        return tn.p.f(this.f94358a, rcVar.f94358a) && tn.p.f(this.f94359b, rcVar.f94359b) && tn.p.f(this.f94360c, rcVar.f94360c) && tn.p.f(this.f94361d, rcVar.f94361d);
    }

    public final int hashCode() {
        return this.f94361d.hashCode() + k4.a(this.f94360c, k4.a(this.f94359b, this.f94358a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "AdtuneAction(actionType=" + this.f94358a + ", adtuneUrl=" + this.f94359b + ", optOutUrl=" + this.f94360c + ", trackingUrls=" + this.f94361d + ")";
    }
}
