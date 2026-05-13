package com.bytedance.sdk.openadsdk.zin.vt;

import android.text.TextUtils;
import com.safedk.android.internal.partials.PangleVideoBridge;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class ouw {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public List<C0271ouw> f14609lh;
    public String ouw;
    public List<C0271ouw> vt;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.zin.vt.ouw$ouw, reason: collision with other inner class name */
    public static class C0271ouw {

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public int f14610lh;
        public String ouw;
        public String vt;

        public final boolean equals(Object obj) {
            String str;
            if (!(obj instanceof C0271ouw)) {
                return super.equals(obj);
            }
            String str2 = this.ouw;
            if (str2 != null) {
                C0271ouw c0271ouw = (C0271ouw) obj;
                if (str2.equals(c0271ouw.ouw) && (str = this.vt) != null && str.equals(c0271ouw.vt)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static ouw ouw(String str) {
        C0271ouw c0271ouw;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObjectJsonObjectInit = PangleVideoBridge.jsonObjectInit(str);
            ouw ouwVar = new ouw();
            ouwVar.ouw = jSONObjectJsonObjectInit.optString("version");
            JSONArray jSONArrayOptJSONArray = jSONObjectJsonObjectInit.optJSONArray("resources");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                    if (jSONObjectOptJSONObject == null) {
                        c0271ouw = null;
                    } else {
                        c0271ouw = new C0271ouw();
                        c0271ouw.ouw = jSONObjectOptJSONObject.optString("url");
                        c0271ouw.vt = jSONObjectOptJSONObject.optString("md5");
                        c0271ouw.f14610lh = jSONObjectOptJSONObject.optInt("type");
                    }
                    if (c0271ouw != null) {
                        int i11 = c0271ouw.f14610lh;
                        if (i11 == 1) {
                            arrayList.add(c0271ouw);
                        } else if (i11 == 2 && arrayList2.size() < 10) {
                            arrayList2.add(c0271ouw);
                        }
                    }
                }
            }
            ouwVar.vt = arrayList;
            ouwVar.f14609lh = arrayList2;
            return ouwVar;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
