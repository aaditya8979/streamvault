package yads;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class bw implements q0 {
    @Override // yads.q0
    public final m0 a(JSONObject jSONObject) throws z02 {
        String strOptString = jSONObject.optString("type");
        if (strOptString == null || strOptString.length() == 0 || tn.p.f(strOptString, "null")) {
            throw new z02("Native Ad json has not required attributes");
        }
        return new zv(strOptString);
    }
}
