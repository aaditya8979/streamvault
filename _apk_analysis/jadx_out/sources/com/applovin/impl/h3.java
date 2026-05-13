package com.applovin.impl;

import com.applovin.mediation.MaxAdFormat;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public abstract class h3 extends y2 {
    public h3(a3 a3Var, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.mediation.h hVar, com.applovin.impl.sdk.k kVar) {
        super(a3Var, jSONObject, jSONObject2, hVar, kVar);
    }

    public float j0() {
        return a("viewability_min_alpha", ((Float) this.f8599a.a(x4.f10863w1)).floatValue() / 100.0f);
    }

    public int k0() {
        return a("viewability_min_pixels", -1);
    }

    public int l0() {
        MaxAdFormat format = getFormat();
        x4 x4Var = format == MaxAdFormat.BANNER ? x4.f10807p1 : format == MaxAdFormat.MREC ? x4.f10823r1 : format == MaxAdFormat.LEADER ? x4.f10839t1 : format == MaxAdFormat.NATIVE ? x4.f10855v1 : null;
        if (x4Var != null) {
            return a("viewability_min_height", ((Integer) this.f8599a.a(x4Var)).intValue());
        }
        return 0;
    }

    public float m0() {
        return a("viewability_min_percentage_dp", -1.0f);
    }

    public float n0() {
        return a("viewability_min_percentage_pixels", -1.0f);
    }

    public long o0() {
        return a("viewability_timer_min_visible_ms", ((Long) this.f8599a.a(x4.f10871x1)).longValue());
    }

    public int p0() {
        MaxAdFormat format = getFormat();
        x4 x4Var = format == MaxAdFormat.BANNER ? x4.f10799o1 : format == MaxAdFormat.MREC ? x4.f10815q1 : format == MaxAdFormat.LEADER ? x4.f10831s1 : format == MaxAdFormat.NATIVE ? x4.f10847u1 : null;
        if (x4Var != null) {
            return a("viewability_min_width", ((Integer) this.f8599a.a(x4Var)).intValue());
        }
        return 0;
    }

    public boolean q0() {
        return k0() >= 0 || m0() >= 0.0f || n0() >= 0.0f;
    }
}
