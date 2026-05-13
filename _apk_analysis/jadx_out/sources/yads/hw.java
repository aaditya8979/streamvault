package yads;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class hw implements bj {
    @Override // yads.bj
    public final Object a(JSONObject jSONObject) throws z02 {
        if (jSONObject.has("value") && jSONObject.isNull("value")) {
            return new gw(fw.f89690c, null);
        }
        fw fwVar = fw.f89689b;
        String strOptString = jSONObject.optString("value");
        if (strOptString == null || strOptString.length() == 0 || tn.p.f(strOptString, "null")) {
            throw new z02("Native Ad json has not required attributes");
        }
        return new gw(fwVar, strOptString);
    }
}
