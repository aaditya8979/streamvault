package com.iab.omid.library.unity3d.adsession.media;

import com.iab.omid.library.unity3d.utils.d;
import com.iab.omid.library.unity3d.utils.g;
import com.ironsource.C3978d4;
import io.bidmachine.unified.UnifiedMediationParams;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class VastProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f24812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Float f24813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f24814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Position f24815d;

    private VastProperties(boolean z10, Float f10, boolean z11, Position position) {
        this.f24812a = z10;
        this.f24813b = f10;
        this.f24814c = z11;
        this.f24815d = position;
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
            jSONObject.put("skippable", this.f24812a);
            if (this.f24812a) {
                jSONObject.put(UnifiedMediationParams.KEY_SKIP_OFFSET, this.f24813b);
            }
            jSONObject.put("autoPlay", this.f24814c);
            jSONObject.put(C3978d4.i.L, this.f24815d);
        } catch (JSONException e10) {
            d.a("VastProperties: JSON error", e10);
        }
        return jSONObject;
    }

    public Position getPosition() {
        return this.f24815d;
    }

    public Float getSkipOffset() {
        return this.f24813b;
    }

    public boolean isAutoPlay() {
        return this.f24814c;
    }

    public boolean isSkippable() {
        return this.f24812a;
    }
}
