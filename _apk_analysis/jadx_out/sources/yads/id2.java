package yads;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class id2 implements ub3 {
    @Override // yads.ub3
    public final String a(String str, JSONObject jSONObject) throws z02 {
        String strOptString = jSONObject.optString(str);
        if (strOptString == null || strOptString.length() == 0 || tn.p.f(strOptString, "null")) {
            throw new z02("Native Ad json has not required attributes");
        }
        return strOptString;
    }
}
