package com.bytedance.adsdk.ugeno.core;

import android.text.TextUtils;
import com.ironsource.C3978d4;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class ra {
    private JSONObject bly;
    private JSONObject fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private JSONObject f11648le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public float f11649lh;
    public String ouw;
    private String pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private JSONObject f11650ra;
    public boolean vt;
    public float yu;

    public static class ouw {
        public boolean bly;
        public LinkedList<ouw> fkw;

        /* JADX INFO: renamed from: le, reason: collision with root package name */
        public ouw f11651le;

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public JSONObject f11652lh;
        public String ouw;
        public String pno;

        /* JADX INFO: renamed from: ra, reason: collision with root package name */
        public String f11653ra;
        public boolean tlj;
        public String vt;
        public JSONObject yu;

        public final String toString() {
            return "UGNode{id='" + this.ouw + "', name='" + this.vt + "'}";
        }
    }

    public ra(JSONObject jSONObject, JSONObject jSONObject2) {
        this(jSONObject, jSONObject2, null);
    }

    public ra(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        if (jSONObject != null) {
            if (jSONObject.has("body")) {
                this.fkw = jSONObject.optJSONObject("body");
            } else {
                this.fkw = jSONObject.optJSONObject("main_template");
            }
            this.f11648le = jSONObject.optJSONObject("sub_templates");
            JSONObject jSONObjectOptJSONObject = jSONObject.has("meta") ? jSONObject.optJSONObject("meta") : jSONObject.optJSONObject("template_info");
            if (jSONObjectOptJSONObject != null) {
                if (jSONObject.has("body")) {
                    this.vt = true;
                    String strOptString = jSONObjectOptJSONObject.optString("version");
                    this.ouw = strOptString;
                    if (TextUtils.isEmpty(strOptString)) {
                        this.ouw = "3.0";
                    }
                } else {
                    this.ouw = jSONObjectOptJSONObject.optString("sdk_version");
                }
                if (jSONObjectOptJSONObject.has("adType")) {
                    this.pno = jSONObjectOptJSONObject.optString("adType");
                }
            } else if (jSONObject.has("body")) {
                this.ouw = "3.0";
                this.vt = true;
            }
            this.f11650ra = jSONObject2;
            this.bly = jSONObject3;
        }
    }

    private ouw ouw(JSONObject jSONObject, ouw ouwVar) {
        ouw ouwVarOuw;
        JSONObject jSONObject2;
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.has("type") ? jSONObject.optString("type") : jSONObject.optString("name");
        String strOptString2 = jSONObject.optString("id");
        JSONObject jSONObject3 = new JSONObject();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!TextUtils.equals(next, "children")) {
                try {
                    jSONObject3.put(next, jSONObject.opt(next));
                } catch (JSONException e10) {
                    e10.printStackTrace();
                }
            }
        }
        ouw ouwVar2 = new ouw();
        ouwVar2.ouw = strOptString2;
        if (this.vt && TextUtils.equals(VastTagName.VIDEO, strOptString)) {
            ouwVar2.vt = strOptString + "V3";
        } else {
            ouwVar2.vt = strOptString;
        }
        ouwVar2.f11652lh = jSONObject3;
        ouwVar2.f11651le = ouwVar;
        ouwVar2.f11653ra = this.ouw;
        ouwVar2.pno = this.pno;
        if (jSONObject3.has("i18n")) {
            ouwVar2.yu = jSONObject3.optJSONObject("i18n");
        }
        if (TextUtils.equals(strOptString, "CustomComponent")) {
            ouw(jSONObject, ouwVar2.f11652lh);
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("children");
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            int i10 = 0;
            for (int i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i11);
                String strOptString3 = jSONObject.has("type") ? jSONObject.optString("type") : jSONObject.optString("name");
                String strOuw = com.bytedance.adsdk.ugeno.lh.vt.ouw(jSONObjectOptJSONObject.optString("id"), this.f11650ra);
                if (TextUtils.equals(strOptString3, "Template")) {
                    JSONObject jSONObject4 = this.f11648le;
                    if (jSONObject4 != null) {
                        jSONObjectOptJSONObject = jSONObject4.optJSONObject(strOuw);
                        ouwVarOuw = ouw(jSONObjectOptJSONObject, ouwVar2);
                    } else {
                        ouwVarOuw = null;
                    }
                } else {
                    ouwVarOuw = ouw(jSONObjectOptJSONObject, ouwVar2);
                }
                if (ouwVarOuw != null) {
                    JSONObject jSONObject5 = ouwVarOuw.f11652lh;
                    ouwVarOuw.tlj = jSONObject5 == null ? false : TextUtils.equals(jSONObject5.optString("height"), "match_parent");
                    JSONObject jSONObject6 = ouwVarOuw.f11652lh;
                    ouwVarOuw.bly = jSONObject6 == null ? false : TextUtils.equals(jSONObject6.optString("width"), "match_parent");
                }
                if ((ouwVarOuw == null || (jSONObject2 = ouwVarOuw.f11652lh) == null) ? false : TextUtils.equals(jSONObject2.optString(C3978d4.i.L), "absolute")) {
                    i10++;
                    if (ouwVar2.fkw == null) {
                        ouwVar2.fkw = new LinkedList<>();
                    }
                    ouwVar2.fkw.addLast(ouwVarOuw);
                } else if (ouwVarOuw != null) {
                    int i12 = i11 - i10;
                    if (ouwVar2.fkw == null) {
                        ouwVar2.fkw = new LinkedList<>();
                    }
                    ouwVar2.fkw.add(i12, ouwVarOuw);
                }
            }
        }
        return ouwVar2;
    }

    private void ouw(JSONObject jSONObject, JSONObject jSONObject2) {
        if (this.bly == null || jSONObject2 == null) {
            return;
        }
        try {
            String strOptString = this.bly.optString(jSONObject2.optString("targetId"));
            if (TextUtils.isEmpty(strOptString)) {
                return;
            }
            JSONObject jSONObject3 = new JSONObject(strOptString);
            JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("targetProps");
            if (jSONObjectOptJSONObject != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object objOpt = jSONObjectOptJSONObject.opt(next);
                    if (!TextUtils.equals(next, "events") || !jSONObject3.has("events")) {
                        jSONObject3.put(next, objOpt);
                    } else if (objOpt instanceof JSONArray) {
                        com.bytedance.adsdk.ugeno.ra.vt.ouw(jSONObject3.optJSONArray("events"), (JSONArray) objOpt);
                    }
                }
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("children");
                if (jSONArrayOptJSONArray == null) {
                    jSONArrayOptJSONArray = new JSONArray();
                }
                jSONArrayOptJSONArray.put(jSONObject3);
                if (jSONObject.has("children")) {
                    return;
                }
                jSONObject.put("children", jSONArrayOptJSONArray);
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public static boolean ouw(ouw ouwVar) {
        return (ouwVar == null || ouwVar.f11652lh == null) ? false : true;
    }

    public final ouw ouw() {
        if (!this.vt) {
            return ouw(this.fkw, (ouw) null);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("flexDirection", "row");
            jSONObject.put("justifyContent", "flex_start");
            jSONObject.put("alignItems", "flex_start");
            jSONObject.put("clickable", false);
            jSONObject.put("width", "match_parent");
            jSONObject.put("height", "wrap_content");
            float f10 = this.f11649lh;
            if (f10 > 0.0f) {
                jSONObject.put("width", f10);
            }
            float f11 = this.yu;
            if (f11 > 0.0f) {
                jSONObject.put("height", f11);
            }
            JSONObject jSONObject2 = this.f11650ra;
            if (jSONObject2 != null) {
                String strOptString = jSONObject2.optString("xSize");
                if (!TextUtils.isEmpty(strOptString)) {
                    JSONObject jSONObject3 = new JSONObject(strOptString);
                    if (jSONObject3.optInt("width") > 0) {
                        jSONObject.put("width", jSONObject3.optInt("width"));
                    }
                    if (jSONObject3.optInt("height") > 0) {
                        jSONObject.put("height", jSONObject3.optInt("height"));
                    }
                }
            }
        } catch (JSONException unused) {
        }
        ouw ouwVar = new ouw();
        ouwVar.vt = "View";
        ouwVar.ouw = "virtualNode";
        ouwVar.f11652lh = jSONObject;
        ouwVar.f11651le = null;
        ouwVar.f11653ra = this.ouw;
        ouwVar.pno = this.pno;
        ouw ouwVarOuw = ouw(this.fkw, ouwVar);
        if (ouwVar.fkw == null) {
            ouwVar.fkw = new LinkedList<>();
        }
        ouwVar.fkw.add(ouwVarOuw);
        return ouwVar;
    }

    public final List<ouw> vt() {
        if (this.f11648le == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> itKeys = this.f11648le.keys();
        while (itKeys.hasNext()) {
            ouw ouwVarOuw = ouw(this.f11648le.optJSONObject(itKeys.next()), (ouw) null);
            if (ouwVarOuw != null) {
                arrayList.add(ouwVarOuw);
            }
        }
        return arrayList;
    }
}
