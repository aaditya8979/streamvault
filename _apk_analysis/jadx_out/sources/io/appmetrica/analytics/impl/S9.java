package io.appmetrica.analytics.impl;

import io.bidmachine.iab.vast.tags.VastAttributes;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class S9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f65873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f65874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f65875c;

    public S9(String str, int i10, boolean z10) {
        this.f65873a = str;
        this.f65874b = i10;
        this.f65875c = z10;
    }

    public S9(JSONObject jSONObject) {
        this.f65873a = jSONObject.getString("name");
        this.f65875c = jSONObject.getBoolean(VastAttributes.REQUIRED);
        this.f65874b = jSONObject.optInt("version", -1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || S9.class != obj.getClass()) {
            return false;
        }
        S9 s92 = (S9) obj;
        if (this.f65874b != s92.f65874b || this.f65875c != s92.f65875c) {
            return false;
        }
        String str = this.f65873a;
        String str2 = s92.f65873a;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public final int hashCode() {
        String str = this.f65873a;
        return ((((str != null ? str.hashCode() : 0) * 31) + this.f65874b) * 31) + (this.f65875c ? 1 : 0);
    }
}
