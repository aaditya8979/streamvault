package com.iab.omid.library.ironsrc.adsession.media;

import com.iab.omid.library.ironsrc.utils.d;
import com.iab.omid.library.ironsrc.utils.g;
import com.ironsource.C3978d4;
import io.bidmachine.unified.UnifiedMediationParams;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class VastProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f24541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Float f24542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f24543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Position f24544d;

    private VastProperties(boolean z10, Float f10, boolean z11, Position position) {
        this.f24541a = z10;
        this.f24542b = f10;
        this.f24543c = z11;
        this.f24544d = position;
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
            jSONObject.put("skippable", this.f24541a);
            if (this.f24541a) {
                jSONObject.put(UnifiedMediationParams.KEY_SKIP_OFFSET, this.f24542b);
            }
            jSONObject.put("autoPlay", this.f24543c);
            jSONObject.put(C3978d4.i.L, this.f24544d);
        } catch (JSONException e10) {
            d.a("VastProperties: JSON error", e10);
        }
        return jSONObject;
    }

    public Position getPosition() {
        return this.f24544d;
    }

    public Float getSkipOffset() {
        return this.f24542b;
    }

    public boolean isAutoPlay() {
        return this.f24543c;
    }

    public boolean isSkippable() {
        return this.f24541a;
    }
}
