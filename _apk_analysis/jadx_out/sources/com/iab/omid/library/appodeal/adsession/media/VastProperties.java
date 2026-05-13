package com.iab.omid.library.appodeal.adsession.media;

import com.iab.omid.library.appodeal.utils.d;
import com.iab.omid.library.appodeal.utils.g;
import com.ironsource.C3978d4;
import io.bidmachine.unified.UnifiedMediationParams;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class VastProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f23879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Float f23880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f23881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Position f23882d;

    private VastProperties(boolean z10, Float f10, boolean z11, Position position) {
        this.f23879a = z10;
        this.f23880b = f10;
        this.f23881c = z11;
        this.f23882d = position;
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
            jSONObject.put("skippable", this.f23879a);
            if (this.f23879a) {
                jSONObject.put(UnifiedMediationParams.KEY_SKIP_OFFSET, this.f23880b);
            }
            jSONObject.put("autoPlay", this.f23881c);
            jSONObject.put(C3978d4.i.L, this.f23882d);
        } catch (JSONException e10) {
            d.a("VastProperties: JSON error", e10);
        }
        return jSONObject;
    }

    public Position getPosition() {
        return this.f23882d;
    }

    public Float getSkipOffset() {
        return this.f23880b;
    }

    public boolean isAutoPlay() {
        return this.f23881c;
    }

    public boolean isSkippable() {
        return this.f23879a;
    }
}
