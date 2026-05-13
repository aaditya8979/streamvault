package yads;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class j43 implements bj {
    @Override // yads.bj
    public final Object a(JSONObject jSONObject) throws z02 {
        String strOptString = jSONObject.optString("value");
        if (strOptString == null || strOptString.length() == 0 || tn.p.f(strOptString, "null")) {
            throw new z02("Native Ad json has not required attributes");
        }
        return strOptString;
    }
}
