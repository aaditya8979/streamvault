package com.iab.omid.library.mmadbridge.adsession.media;

import com.iab.omid.library.mmadbridge.utils.d;
import com.iab.omid.library.mmadbridge.utils.g;
import com.ironsource.C3978d4;
import io.bidmachine.unified.UnifiedMediationParams;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class VastProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f24676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Float f24677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f24678c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Position f24679d;

    private VastProperties(boolean z10, Float f10, boolean z11, Position position) {
        this.f24676a = z10;
        this.f24677b = f10;
        this.f24678c = z11;
        this.f24679d = position;
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
            jSONObject.put("skippable", this.f24676a);
            if (this.f24676a) {
                jSONObject.put(UnifiedMediationParams.KEY_SKIP_OFFSET, this.f24677b);
            }
            jSONObject.put("autoPlay", this.f24678c);
            jSONObject.put(C3978d4.i.L, this.f24679d);
        } catch (JSONException e10) {
            d.a("VastProperties: JSON error", e10);
        }
        return jSONObject;
    }

    public Position getPosition() {
        return this.f24679d;
    }

    public Float getSkipOffset() {
        return this.f24677b;
    }

    public boolean isAutoPlay() {
        return this.f24678c;
    }

    public boolean isSkippable() {
        return this.f24676a;
    }
}
