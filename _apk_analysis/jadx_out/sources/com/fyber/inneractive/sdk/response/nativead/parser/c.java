package com.fyber.inneractive.sdk.response.nativead.parser;

import com.fyber.inneractive.sdk.response.nativead.h;
import com.fyber.inneractive.sdk.util.v;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public abstract class c {
    public static h a(JSONObject jSONObject) {
        h hVar = new h();
        if (jSONObject == null) {
            return hVar;
        }
        hVar.f19425a = v.a(jSONObject, "url");
        hVar.f19427c = v.a(jSONObject, "fallback");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("clicktrackers");
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() != 0) {
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                String strOptString = jSONArrayOptJSONArray.optString(i10);
                if (strOptString != null && !strOptString.isEmpty() && !strOptString.equals("null")) {
                    hVar.f19426b.add(strOptString);
                }
            }
        }
        return hVar;
    }
}
