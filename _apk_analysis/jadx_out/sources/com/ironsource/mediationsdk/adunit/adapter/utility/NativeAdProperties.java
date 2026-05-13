package com.ironsource.mediationsdk.adunit.adapter.utility;

import com.ironsource.C3978d4;
import com.ironsource.C4228r4;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import tn.p;

/* JADX INFO: loaded from: classes3.dex */
public final class NativeAdProperties {

    @NotNull
    private final AdOptionsPosition adOptionsPosition;

    @NotNull
    private final AdOptionsPosition defaultAdOptionPosition;

    public NativeAdProperties(@NotNull JSONObject jSONObject) {
        p.k(jSONObject, "config");
        this.defaultAdOptionPosition = AdOptionsPosition.BOTTOM_LEFT;
        this.adOptionsPosition = getAdOptionsPosition(jSONObject);
    }

    private final AdOptionsPosition getAdOptionsPosition(JSONObject jSONObject) {
        String strOptString = jSONObject.optString(AdOptionsPosition.AD_OPTIONS_POSITION_KEY, this.defaultAdOptionPosition.toString());
        try {
            p.j(strOptString, C3978d4.i.L);
            return AdOptionsPosition.valueOf(strOptString);
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            return this.defaultAdOptionPosition;
        }
    }

    @NotNull
    public final AdOptionsPosition getAdOptionsPosition() {
        return this.adOptionsPosition;
    }
}
