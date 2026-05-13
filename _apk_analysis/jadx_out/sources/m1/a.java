package m1;

import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {
    public static g1.a a(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray;
        String str = "";
        boolean z10 = false;
        try {
            if (jSONObject.has("data") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("data")) != null) {
                String strOptString = jSONObjectOptJSONObject.optString("igniteVersion", "");
                try {
                    if (!jSONObjectOptJSONObject.has("features") || (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("features")) == null) {
                        str = strOptString;
                    } else {
                        for (int length = jSONArrayOptJSONArray.length() - 1; length >= 0; length--) {
                            JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(length);
                            if (jSONObjectOptJSONObject2.has("type") && "GET_PROPERTY".equalsIgnoreCase(jSONObjectOptJSONObject2.optString("type", ""))) {
                                str = strOptString;
                                z10 = true;
                                break;
                            }
                        }
                        str = strOptString;
                    }
                } catch (Exception e10) {
                    e = e10;
                    str = strOptString;
                    l1.b.b("IgniteVersionParser: exception on parse: %s", e.getMessage());
                }
            }
        } catch (Exception e11) {
            e = e11;
        }
        return new g1.a(z10, str);
    }
}
