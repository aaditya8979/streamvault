package com.iab.omid.library.vungle.adsession.media;

import com.iab.omid.library.vungle.utils.d;
import com.iab.omid.library.vungle.utils.g;
import com.ironsource.C3978d4;
import io.bidmachine.unified.UnifiedMediationParams;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class VastProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f24939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Float f24940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f24941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Position f24942d;

    private VastProperties(boolean z10, Float f10, boolean z11, Position position) {
        this.f24939a = z10;
        this.f24940b = f10;
        this.f24941c = z11;
        this.f24942d = position;
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
            jSONObject.put("skippable", this.f24939a);
            if (this.f24939a) {
                jSONObject.put(UnifiedMediationParams.KEY_SKIP_OFFSET, this.f24940b);
            }
            jSONObject.put("autoPlay", this.f24941c);
            jSONObject.put(C3978d4.i.L, this.f24942d);
        } catch (JSONException e10) {
            d.a("VastProperties: JSON error", e10);
        }
        return jSONObject;
    }

    public Position getPosition() {
        return this.f24942d;
    }

    public Float getSkipOffset() {
        return this.f24940b;
    }

    public boolean isAutoPlay() {
        return this.f24941c;
    }

    public boolean isSkippable() {
        return this.f24939a;
    }
}
