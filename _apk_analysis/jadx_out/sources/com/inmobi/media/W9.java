package com.inmobi.media;

import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class W9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JSONObject f26528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONArray f26529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3682qb f26530c;

    public W9(JSONObject jSONObject, JSONArray jSONArray, C3682qb c3682qb) {
        tn.p.k(jSONObject, "vitals");
        tn.p.k(jSONArray, "logs");
        tn.p.k(c3682qb, "data");
        this.f26528a = jSONObject;
        this.f26529b = jSONArray;
        this.f26530c = c3682qb;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W9)) {
            return false;
        }
        W9 w92 = (W9) obj;
        return tn.p.f(this.f26528a, w92.f26528a) && tn.p.f(this.f26529b, w92.f26529b) && tn.p.f(this.f26530c, w92.f26530c);
    }

    public final int hashCode() {
        return this.f26530c.hashCode() + ((this.f26529b.hashCode() + (this.f26528a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "IncompleteLogData(vitals=" + this.f26528a + ", logs=" + this.f26529b + ", data=" + this.f26530c + ")";
    }
}
