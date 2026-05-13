package com.bytedance.sdk.component.adexpress.dynamic.fkw;

import android.content.Context;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.bytedance.sdk.component.adexpress.dynamic.fkw.fkw;
import com.bytedance.sdk.component.adexpress.vt.mwh;
import com.safedk.android.internal.partials.PangleVideoBridge;
import io.bidmachine.unified.UnifiedMediationParams;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class le {

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private static HashMap<String, String> f12228ra;
    private lh fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.dynamic.yu.yu f12229le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.dynamic.yu.lh f12230lh;
    private JSONObject ouw;
    private JSONObject vt;
    private ouw yu;

    public static class ouw {

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public boolean f12231lh;
        public float ouw;
        public float vt;
    }

    static {
        HashMap<String, String> map = new HashMap<>();
        f12228ra = map;
        map.put("subtitle", UnifiedMediationParams.KEY_DESCRIPTION);
        f12228ra.put("source", "source|app.app_name");
        f12228ra.put("screenshot", "dynamic_creative.screenshot");
    }

    public le(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        this.ouw = jSONObject;
        this.vt = jSONObject2;
        this.f12230lh = new com.bytedance.sdk.component.adexpress.dynamic.yu.lh(jSONObject2);
        ouw ouwVar = new ouw();
        if (jSONObject3 != null) {
            ouwVar.ouw = (float) jSONObject3.optDouble("width");
            ouwVar.vt = (float) jSONObject3.optDouble("height");
            ouwVar.f12231lh = jSONObject3.optBoolean("isLandscape");
        }
        this.yu = ouwVar;
        this.f12229le = com.bytedance.sdk.component.adexpress.dynamic.yu.yu.ouw(jSONObject4);
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.bytedance.sdk.component.adexpress.dynamic.yu.pno ouw(org.json.JSONObject r21, com.bytedance.sdk.component.adexpress.dynamic.yu.pno r22) {
        /*
            Method dump skipped, instruction units count: 1061
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.fkw.le.ouw(org.json.JSONObject, com.bytedance.sdk.component.adexpress.dynamic.yu.pno):com.bytedance.sdk.component.adexpress.dynamic.yu.pno");
    }

    private String ouw() {
        Object objOuw;
        com.bytedance.sdk.component.adexpress.dynamic.yu.lh lhVar = this.f12230lh;
        return (lhVar == null || (objOuw = lhVar.ouw("adx_name")) == null) ? "" : String.valueOf(objOuw);
    }

    private String ouw(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        for (String str2 : str.split("\\|")) {
            if (this.f12230lh.ouw.containsKey(str2)) {
                String strValueOf = String.valueOf(this.f12230lh.ouw(str2));
                if (!TextUtils.isEmpty(strValueOf)) {
                    return strValueOf;
                }
            }
        }
        return "";
    }

    private void ouw(com.bytedance.sdk.component.adexpress.dynamic.yu.le leVar) {
        JSONObject jSONObject;
        if (leVar == null) {
            return;
        }
        String str = leVar.f12315vm;
        if (com.bytedance.sdk.component.adexpress.yu.vt()) {
            String strOuw = com.bytedance.sdk.component.adexpress.yu.ra.ouw(com.bytedance.sdk.component.adexpress.yu.ouw());
            if ("zh".equals(strOuw)) {
                strOuw = "cn";
            }
            if (!TextUtils.isEmpty(strOuw) && (jSONObject = leVar.yiz) != null) {
                String strOptString = jSONObject.optString(strOuw);
                if (!TextUtils.isEmpty(strOptString)) {
                    str = strOptString;
                }
            }
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int iIndexOf = str.indexOf("{{");
        int iIndexOf2 = str.indexOf("}}");
        if (iIndexOf < 0 || iIndexOf2 < 0 || iIndexOf2 < iIndexOf) {
            leVar.f12315vm = str;
            return;
        }
        String strOuw2 = ouw(str.substring(iIndexOf + 2, iIndexOf2));
        StringBuilder sb2 = new StringBuilder(str.substring(0, iIndexOf));
        if (!TextUtils.isEmpty(strOuw2)) {
            sb2.append(strOuw2);
        }
        sb2.append(str.substring(iIndexOf2 + 2));
        leVar.f12315vm = sb2.toString();
    }

    public final com.bytedance.sdk.component.adexpress.dynamic.yu.pno ouw(double d10, int i10, double d11, String str, mwh mwhVar) {
        JSONObject jSONObjectJsonObjectInit;
        int iMwh;
        com.bytedance.sdk.component.adexpress.dynamic.yu.lh lhVar = this.f12230lh;
        Iterator<String> itKeys = lhVar.vt.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = lhVar.vt.opt(next);
            int i11 = 0;
            if (TextUtils.equals("image", next)) {
                if (objOpt instanceof JSONArray) {
                    while (true) {
                        JSONArray jSONArray = (JSONArray) objOpt;
                        if (i11 < jSONArray.length()) {
                            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i11);
                            if (jSONObjectOptJSONObject != null) {
                                Iterator<String> itKeys2 = jSONObjectOptJSONObject.keys();
                                while (itKeys2.hasNext()) {
                                    String next2 = itKeys2.next();
                                    Object objOpt2 = jSONObjectOptJSONObject.opt(next2);
                                    lhVar.ouw.put(next + "." + i11 + "." + next2, objOpt2);
                                }
                            }
                            i11++;
                        }
                    }
                }
            } else if (TextUtils.equals("dynamic_creative", next)) {
                if (objOpt instanceof String) {
                    try {
                        JSONObject jSONObjectJsonObjectInit2 = PangleVideoBridge.jsonObjectInit((String) objOpt);
                        Iterator<String> itKeys3 = jSONObjectJsonObjectInit2.keys();
                        while (itKeys3.hasNext()) {
                            String next3 = itKeys3.next();
                            Object objOpt3 = jSONObjectJsonObjectInit2.opt(next3);
                            if ((objOpt3 instanceof JSONArray) && !TextUtils.equals(next3, "short_phrase") && !TextUtils.equals(next3, "long_phrase")) {
                                for (int i12 = 0; i12 < ((JSONArray) objOpt3).length(); i12++) {
                                    lhVar.ouw.put(next + "." + next3 + "." + i12, ((JSONArray) objOpt3).opt(i12));
                                }
                            } else if ((objOpt3 instanceof JSONObject) && TextUtils.equals(next3, "coupon")) {
                                Iterator<String> itKeys4 = ((JSONObject) objOpt3).keys();
                                while (itKeys4.hasNext()) {
                                    String next4 = itKeys4.next();
                                    Object objOpt4 = ((JSONObject) objOpt3).opt(next4);
                                    lhVar.ouw.put(next + "." + next3 + "." + next4, objOpt4);
                                }
                            } else if ((objOpt3 instanceof JSONObject) && TextUtils.equals(next3, "live_room_data")) {
                                lhVar.ouw(next, next3, objOpt3);
                            } else {
                                lhVar.ouw.put(next + "." + next3, objOpt3);
                            }
                        }
                    } catch (JSONException e10) {
                        e10.printStackTrace();
                    }
                }
            } else if (!(objOpt instanceof JSONObject)) {
                lhVar.ouw.put(next, objOpt);
                if (objOpt instanceof String) {
                    lhVar.ouw.put(next, objOpt);
                }
            } else if (objOpt != null) {
                JSONObject jSONObject = (JSONObject) objOpt;
                Iterator<String> itKeys5 = jSONObject.keys();
                while (itKeys5.hasNext()) {
                    String next5 = itKeys5.next();
                    Object objOpt5 = jSONObject.opt(next5);
                    lhVar.ouw.put(next + "." + next5, objOpt5);
                }
            }
        }
        try {
            jSONObjectJsonObjectInit = PangleVideoBridge.jsonObjectInit(this.f12229le.vt);
        } catch (JSONException e11) {
            e11.printStackTrace();
            jSONObjectJsonObjectInit = null;
        }
        com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVarOuw = ouw(yu.ouw(this.ouw, jSONObjectJsonObjectInit), null);
        if (pnoVarOuw != null) {
            if (com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().f12430lh != null) {
                iMwh = com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().f12430lh.mwh();
            } else {
                Context contextOuw = com.bytedance.sdk.component.adexpress.yu.ouw();
                if (contextOuw == null) {
                    contextOuw = com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().f12430lh.vt();
                }
                iMwh = contextOuw.getResources().getDisplayMetrics().widthPixels;
            }
            int iVt = com.bytedance.sdk.component.adexpress.yu.ra.vt(com.bytedance.sdk.component.adexpress.yu.ouw(), iMwh);
            ouw ouwVar = this.yu;
            float fMin = ouwVar.f12231lh ? ouwVar.ouw : Math.min(ouwVar.ouw, iVt);
            if (this.yu.vt == 0.0f) {
                pnoVarOuw.f12330le = fMin;
                pnoVarOuw.bly.f12282lh.f12305rn = "auto";
                pnoVarOuw.f12332ra = 0.0f;
            } else {
                pnoVarOuw.f12330le = fMin;
                Context contextOuw2 = com.bytedance.sdk.component.adexpress.yu.ouw();
                Context contextOuw3 = com.bytedance.sdk.component.adexpress.yu.ouw();
                if (contextOuw3 == null) {
                    contextOuw3 = com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().f12430lh.vt();
                }
                ((WindowManager) contextOuw3.getSystemService("window")).getDefaultDisplay().getRealMetrics(new DisplayMetrics());
                int iVt2 = com.bytedance.sdk.component.adexpress.yu.ra.vt(contextOuw2, r6.heightPixels);
                ouw ouwVar2 = this.yu;
                pnoVarOuw.f12332ra = ouwVar2.f12231lh ? ouwVar2.vt : Math.min(ouwVar2.vt, iVt2);
                pnoVarOuw.bly.f12282lh.f12305rn = "fixed";
            }
        }
        fkw fkwVar = new fkw(d10, i10, d11, str, mwhVar);
        fkw.ouw ouwVar3 = new fkw.ouw();
        ouw ouwVar4 = this.yu;
        ouwVar3.ouw = ouwVar4.ouw;
        ouwVar3.vt = ouwVar4.vt;
        ouwVar3.f12227lh = 0.0f;
        fkwVar.f12226lh = ouwVar3;
        fkwVar.ouw(pnoVarOuw);
        fkwVar.ouw();
        com.bytedance.sdk.component.adexpress.dynamic.yu.vt vtVar = fkwVar.ouw;
        if (vtVar.yu == 65536.0f) {
            return null;
        }
        return vtVar.f12339le;
    }
}
