package m1;

import android.text.TextUtils;
import com.digitalturbine.ignite.authenticator.events.d;
import d1.c;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class b {
    public static c a(String str) {
        if (TextUtils.isEmpty(str)) {
            l1.b.b("%s : empty one dt", "OneDTParser");
            return new c("", -1L);
        }
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("data");
            if (jSONObjectOptJSONObject != null && "onedtid".equalsIgnoreCase(jSONObjectOptJSONObject.optString("propertyName", ""))) {
                return new c(jSONObjectOptJSONObject.optString("propertyValue", ""), jSONObjectOptJSONObject.optLong("refreshTime", -1L));
            }
        } catch (Exception e10) {
            h1.b.a(d.ONE_DT_PARSE_ERROR, e10);
            l1.b.b("%s : failed parse one dt", "OneDTParser");
        }
        return new c("", -1L);
    }
}
