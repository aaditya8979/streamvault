package com.iab.omid.library.applovin.adsession.media;

import com.iab.omid.library.applovin.utils.d;
import com.iab.omid.library.applovin.utils.g;
import com.ironsource.C3978d4;
import io.bidmachine.unified.UnifiedMediationParams;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class VastProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f23744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Float f23745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f23746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Position f23747d;

    private VastProperties(boolean z10, Float f10, boolean z11, Position position) {
        this.f23744a = z10;
        this.f23745b = f10;
        this.f23746c = z11;
        this.f23747d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z10, Position position) {
        g.a(position, "Position is null");
        return new VastProperties(false, null, z10, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f10, boolean z10, Position position) {
        g.a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f10), z10, position);
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f23744a);
            if (this.f23744a) {
                jSONObject.put(UnifiedMediationParams.KEY_SKIP_OFFSET, this.f23745b);
            }
            jSONObject.put("autoPlay", this.f23746c);
            jSONObject.put(C3978d4.i.L, this.f23747d);
        } catch (JSONException e10) {
            d.a("VastProperties: JSON error", e10);
        }
        return jSONObject;
    }

    public Position getPosition() {
        return this.f23747d;
    }

    public Float getSkipOffset() {
        return this.f23745b;
    }

    public boolean isAutoPlay() {
        return this.f23746c;
    }

    public boolean isSkippable() {
        return this.f23744a;
    }
}
