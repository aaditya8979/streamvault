package com.iab.omid.library.bigosg.adsession.media;

import com.iab.omid.library.bigosg.d.c;
import com.iab.omid.library.bigosg.d.e;
import com.ironsource.C3978d4;
import io.bidmachine.unified.UnifiedMediationParams;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class VastProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f24019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Float f24020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f24021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Position f24022d;

    private VastProperties(boolean z10, Float f10, boolean z11, Position position) {
        this.f24019a = z10;
        this.f24020b = f10;
        this.f24021c = z11;
        this.f24022d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z10, Position position) {
        e.a(position, "Position is null");
        return new VastProperties(false, null, z10, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f10, boolean z10, Position position) {
        e.a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f10), z10, position);
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f24019a);
            if (this.f24019a) {
                jSONObject.put(UnifiedMediationParams.KEY_SKIP_OFFSET, this.f24020b);
            }
            jSONObject.put("autoPlay", this.f24021c);
            jSONObject.put(C3978d4.i.L, this.f24022d);
        } catch (JSONException e10) {
            c.a("VastProperties: JSON error", e10);
        }
        return jSONObject;
    }

    public final Position getPosition() {
        return this.f24022d;
    }

    public final Float getSkipOffset() {
        return this.f24020b;
    }

    public final boolean isAutoPlay() {
        return this.f24021c;
    }

    public final boolean isSkippable() {
        return this.f24019a;
    }
}
