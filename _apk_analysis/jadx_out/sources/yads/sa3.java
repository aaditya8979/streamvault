package yads;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class sa3 {
    public static String a(String str, JSONObject jSONObject) {
        String strOptString = jSONObject.optString(str);
        if (strOptString == null || strOptString.length() == 0 || tn.p.f(strOptString, "null")) {
            throw new z02("Native Ad json has not required attributes");
        }
        if (strOptString.length() != 0) {
            return strOptString;
        }
        throw new z02("Native Ad json has not required attributes");
    }
}
