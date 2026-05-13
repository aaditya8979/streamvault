package com.iab.omid.library.bytedance2.adsession.media;

import com.iab.omid.library.bytedance2.utils.d;
import com.iab.omid.library.bytedance2.utils.g;
import com.ironsource.C3978d4;
import io.bidmachine.unified.UnifiedMediationParams;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class VastProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f24135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Float f24136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f24137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Position f24138d;

    private VastProperties(boolean z10, Float f10, boolean z11, Position position) {
        this.f24135a = z10;
        this.f24136b = f10;
        this.f24137c = z11;
        this.f24138d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z10, Position position) {
        g.a(position, "Position is null");
        return new VastProperties(false, null, z10, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f10, boolean z10, Position position) {
        g.a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f10), z10, position);
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f24135a);
            if (this.f24135a) {
                jSONObject.put(UnifiedMediationParams.KEY_SKIP_OFFSET, this.f24136b);
            }
            jSONObject.put("autoPlay", this.f24137c);
            jSONObject.put(C3978d4.i.L, this.f24138d);
        } catch (JSONException e10) {
            d.a("VastProperties: JSON error", e10);
        }
        return jSONObject;
    }

    public final Position getPosition() {
        return this.f24138d;
    }

    public final Float getSkipOffset() {
        return this.f24136b;
    }

    public final boolean isAutoPlay() {
        return this.f24137c;
    }

    public final boolean isSkippable() {
        return this.f24135a;
    }
}
