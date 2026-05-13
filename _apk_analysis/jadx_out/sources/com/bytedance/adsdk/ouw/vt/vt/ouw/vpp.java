package com.bytedance.adsdk.ouw.vt.vt.ouw;

import android.text.TextUtils;
import com.ironsource.C3978d4;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class vpp implements com.bytedance.adsdk.ouw.vt.vt.ouw {
    private final String ouw;

    public vpp(String str) {
        this.ouw = str;
    }

    private Object ouw(String[] strArr, int i10, JSONObject jSONObject) {
        Object objOpt;
        while (strArr != null && strArr.length > 0 && i10 < strArr.length && jSONObject != null) {
            String str = strArr[i10];
            int iIndexOf = str.indexOf(C3978d4.j.f31383d);
            int iIndexOf2 = str.indexOf(C3978d4.j.f31385e);
            if (iIndexOf < 0 || iIndexOf2 < 0 || iIndexOf > iIndexOf2) {
                objOpt = jSONObject.opt(str);
            } else {
                String strSubstring = str.substring(0, iIndexOf);
                try {
                    int i11 = Integer.parseInt(str.substring(iIndexOf + 1, iIndexOf2));
                    Object objOpt2 = jSONObject.opt(strSubstring);
                    objOpt = objOpt2 instanceof JSONArray ? ((JSONArray) objOpt2).opt(i11) : null;
                } catch (NumberFormatException e10) {
                    e10.printStackTrace();
                    return null;
                }
            }
            if (i10 != strArr.length - 1) {
                if (!(objOpt instanceof String)) {
                    if (!(objOpt instanceof JSONObject)) {
                        break;
                    }
                    i10++;
                    jSONObject = (JSONObject) objOpt;
                } else {
                    try {
                        return ouw(strArr, i10 + 1, new JSONObject((String) objOpt));
                    } catch (JSONException e11) {
                        e11.printStackTrace();
                        return objOpt;
                    }
                }
            } else {
                return objOpt;
            }
        }
        return null;
    }

    @Override // com.bytedance.adsdk.ouw.vt.vt.ouw
    public final com.bytedance.adsdk.ouw.vt.yu.fkw ouw() {
        return com.bytedance.adsdk.ouw.vt.yu.le.VARIABLE;
    }

    @Override // com.bytedance.adsdk.ouw.vt.vt.ouw
    public final Object ouw(Map<String, JSONObject> map) {
        if (map == null || map.size() <= 0) {
            return null;
        }
        String str = this.ouw;
        Object objOuw = TextUtils.isEmpty(str) ? null : ouw(str.split("\\."), 0, map.get("default_key"));
        if (objOuw == JSONObject.NULL) {
            return null;
        }
        return objOuw;
    }

    public final String toString() {
        return "VariableNode [literals=" + this.ouw + C3978d4.j.f31385e;
    }

    @Override // com.bytedance.adsdk.ouw.vt.vt.ouw
    public final String vt() {
        return this.ouw;
    }
}
