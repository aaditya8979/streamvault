package yads;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class bg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f87994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f87995b;

    public bg(cg cgVar, JSONObject jSONObject) {
        this.f87994a = cgVar.a();
        this.f87995b = jSONObject.toString();
    }

    public final String a() {
        return this.f87994a;
    }

    public final String b() {
        return this.f87995b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bg)) {
            return false;
        }
        bg bgVar = (bg) obj;
        return tn.p.f(bgVar.f87994a, this.f87994a) && tn.p.f(bgVar.f87995b, this.f87995b);
    }

    public final int hashCode() {
        return this.f87995b.hashCode() + (this.f87994a.hashCode() * 31);
    }
}
