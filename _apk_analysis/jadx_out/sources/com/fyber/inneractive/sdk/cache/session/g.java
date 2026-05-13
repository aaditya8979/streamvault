package com.fyber.inneractive.sdk.cache.session;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f15906d;

    public g(int i10, int i11, int i12, long j10) {
        this.f15906d = j10;
        this.f15903a = i10;
        this.f15904b = i11;
        this.f15905c = i12;
    }

    public static g a(JSONObject jSONObject) {
        if (jSONObject != null) {
            long jOptLong = jSONObject.optLong("time");
            int iOptInt = jSONObject.optInt("cli", -1);
            int iOptInt2 = jSONObject.optInt("imp", -1);
            int iOptInt3 = jSONObject.optInt("com", -1);
            if (jOptLong != 0 && iOptInt >= 0 && iOptInt2 >= 0 && iOptInt3 >= 0) {
                return new g(iOptInt2, iOptInt, iOptInt3, jOptLong);
            }
        }
        return null;
    }

    public final JSONObject a(boolean z10, boolean z11) {
        JSONObject jSONObject = new JSONObject();
        if (z10) {
            try {
                jSONObject.put("time", this.f15906d);
            } catch (JSONException unused) {
            }
        }
        jSONObject.put("imp", this.f15903a);
        if (z11) {
            jSONObject.put("com", this.f15905c);
        }
        jSONObject.put("cli", this.f15904b);
        return jSONObject;
    }
}
