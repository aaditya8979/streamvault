package com.ironsource;

import com.safedk.android.internal.partials.IronSourceVideoBridge;
import com.unity3d.mediation.LevelPlay;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.x1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4327x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<LevelPlay.AdFormat, C4190p> f34363a;

    public C4327x1(@NotNull JSONObject jSONObject) {
        tn.p.k(jSONObject, "applicationAuctionSettings");
        LevelPlay.AdFormat[] adFormatArrValues = LevelPlay.AdFormat.values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(zn.n.e(cn.p0.f(adFormatArrValues.length), 16));
        for (LevelPlay.AdFormat adFormat : adFormatArrValues) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(C4324wf.a(adFormat));
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = IronSourceVideoBridge.jsonObjectInit();
            } else {
                tn.p.j(jSONObjectOptJSONObject, "applicationAuctionSettin…ormatKey) ?: JSONObject()");
            }
            linkedHashMap.put(adFormat, new C4190p(jSONObjectOptJSONObject));
        }
        this.f34363a = linkedHashMap;
    }

    @NotNull
    public final Map<LevelPlay.AdFormat, C4190p> a() {
        return this.f34363a;
    }
}
