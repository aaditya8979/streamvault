package com.inmobi.media;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class vo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f28394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f28395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f28396d;

    public vo(int i10, int i11, int i12, int i13) {
        this.f28393a = i10;
        this.f28394b = i11;
        this.f28395c = i12;
        this.f28396d = i13;
    }

    public final JSONObject a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("left", F3.a(this.f28393a));
            jSONObject.put("top", F3.a(this.f28394b));
            jSONObject.put("right", F3.a(this.f28395c));
            jSONObject.put("bottom", F3.a(this.f28396d));
            return jSONObject;
        } catch (Exception e10) {
            bn.g gVar = P9.f26117a;
            P9.a(new L2(e10));
            return new JSONObject();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vo)) {
            return false;
        }
        vo voVar = (vo) obj;
        return this.f28393a == voVar.f28393a && this.f28394b == voVar.f28394b && this.f28395c == voVar.f28395c && this.f28396d == voVar.f28396d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f28396d) + AbstractC3414fi.a(this.f28395c, AbstractC3414fi.a(this.f28394b, Integer.hashCode(this.f28393a) * 31, 31), 31);
    }

    public final String toString() {
        return "Insets(left=" + this.f28393a + ", top=" + this.f28394b + ", right=" + this.f28395c + ", bottom=" + this.f28396d + ")";
    }
}
