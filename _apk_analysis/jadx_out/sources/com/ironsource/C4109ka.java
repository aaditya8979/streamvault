package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.ka, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
class C4109ka extends AbstractC3991e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f32149i = "https://o-sdk.mediation.unity3d.com/mediation?adUnit=2";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f32150j = "super.dwh.mediation_events";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f32151k = G5.Q;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f32152l = "data";

    public C4109ka(int i10) {
        this.f31513g = i10;
    }

    @Override // com.ironsource.AbstractC3991e
    public String a() {
        return "https://o-sdk.mediation.unity3d.com/mediation?adUnit=2";
    }

    @Override // com.ironsource.AbstractC3991e
    public String a(ArrayList<C5> arrayList, JSONObject jSONObject) {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        if (jSONObject == null) {
            this.f31512f = IronSourceVideoBridge.jsonObjectInit();
        } else {
            this.f31512f = jSONObject;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            if (arrayList != null && !arrayList.isEmpty()) {
                Iterator<C5> it = arrayList.iterator();
                while (it.hasNext()) {
                    JSONObject jSONObjectA = a(it.next());
                    if (jSONObjectA != null) {
                        jSONArray.put(jSONObjectA);
                    }
                }
            }
            jSONObjectJsonObjectInit.put(G5.Q, "super.dwh.mediation_events");
            jSONObjectJsonObjectInit.put("data", a(jSONArray));
            return jSONObjectJsonObjectInit.toString();
        } catch (JSONException e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return "";
        }
    }

    @Override // com.ironsource.AbstractC3991e
    public String c() {
        return K5.f29722a;
    }
}
