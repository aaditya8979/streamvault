package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import io.bidmachine.iab.vast.tags.VastAttributes;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class d8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f8106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f8107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f8108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f8109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f8110e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f8111f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f8112g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f8113h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float f8114i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final float f8115j;

    public d8(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        kVar.O();
        if (com.applovin.impl.sdk.o.a()) {
            kVar.O().d("VideoButtonProperties", "Updating video button properties with JSON = " + JsonUtils.maybeConvertToIndentedString(jSONObject));
        }
        this.f8106a = JsonUtils.getInt(jSONObject, "width", 64);
        this.f8107b = JsonUtils.getInt(jSONObject, "height", 7);
        this.f8108c = JsonUtils.getInt(jSONObject, VastAttributes.MARGIN, 20);
        this.f8109d = JsonUtils.getInt(jSONObject, "gravity", 85);
        this.f8110e = JsonUtils.getBoolean(jSONObject, "tap_to_fade", Boolean.FALSE).booleanValue();
        this.f8111f = JsonUtils.getInt(jSONObject, "tap_to_fade_duration_milliseconds", 500);
        this.f8112g = JsonUtils.getInt(jSONObject, "fade_in_duration_milliseconds", 500);
        this.f8113h = JsonUtils.getInt(jSONObject, "fade_out_duration_milliseconds", 500);
        this.f8114i = JsonUtils.getFloat(jSONObject, "fade_in_delay_seconds", 1.0f);
        this.f8115j = JsonUtils.getFloat(jSONObject, "fade_out_delay_seconds", 6.0f);
    }

    public float a() {
        return this.f8114i;
    }

    public long b() {
        return this.f8112g;
    }

    public float c() {
        return this.f8115j;
    }

    public long d() {
        return this.f8113h;
    }

    public int e() {
        return this.f8109d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d8 d8Var = (d8) obj;
        return this.f8106a == d8Var.f8106a && this.f8107b == d8Var.f8107b && this.f8108c == d8Var.f8108c && this.f8109d == d8Var.f8109d && this.f8110e == d8Var.f8110e && this.f8111f == d8Var.f8111f && this.f8112g == d8Var.f8112g && this.f8113h == d8Var.f8113h && Float.compare(d8Var.f8114i, this.f8114i) == 0 && Float.compare(d8Var.f8115j, this.f8115j) == 0;
    }

    public int f() {
        return this.f8107b;
    }

    public int g() {
        return this.f8108c;
    }

    public long h() {
        return this.f8111f;
    }

    public int hashCode() {
        int i10 = ((((((((((((((this.f8106a * 31) + this.f8107b) * 31) + this.f8108c) * 31) + this.f8109d) * 31) + (this.f8110e ? 1 : 0)) * 31) + this.f8111f) * 31) + this.f8112g) * 31) + this.f8113h) * 31;
        float f10 = this.f8114i;
        int iFloatToIntBits = (i10 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31;
        float f11 = this.f8115j;
        return iFloatToIntBits + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0);
    }

    public int i() {
        return this.f8106a;
    }

    public boolean j() {
        return this.f8110e;
    }

    public String toString() {
        return "VideoButtonProperties{widthPercentOfScreen=" + this.f8106a + ", heightPercentOfScreen=" + this.f8107b + ", margin=" + this.f8108c + ", gravity=" + this.f8109d + ", tapToFade=" + this.f8110e + ", tapToFadeDurationMillis=" + this.f8111f + ", fadeInDurationMillis=" + this.f8112g + ", fadeOutDurationMillis=" + this.f8113h + ", fadeInDelay=" + this.f8114i + ", fadeOutDelay=" + this.f8115j + '}';
    }
}
