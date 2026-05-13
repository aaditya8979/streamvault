package com.bytedance.sdk.openadsdk.core.bly.ouw;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.adexpress.ouw.lh.vt;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.core.bly;
import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.core.cf.ra.lh;
import com.bytedance.sdk.openadsdk.core.model.le;
import com.bytedance.sdk.openadsdk.core.model.pd;
import com.bytedance.sdk.openadsdk.core.model.vm;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.model.zih;
import com.bytedance.sdk.openadsdk.core.ryl;
import com.bytedance.sdk.openadsdk.core.settings.cf;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.safedk.android.internal.partials.PangleVideoBridge;
import io.bidmachine.ads.networks.gam.GAMConfig;
import io.bidmachine.unified.UnifiedMediationParams;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class ouw {
    public static String ouw = "https://pag_open_icon_id/appicon.png";
    private static String vt = "";

    private static JSONObject lh(vpp vppVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            bs.ouw(jSONObject, vppVar);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static String ouw() {
        return vt;
    }

    public static String ouw(vpp vppVar, String str) {
        List<zih> list;
        if (vppVar != null && (list = vppVar.f13791tc) != null && list.size() > 0) {
            for (zih zihVar : list) {
                if (zihVar != null && TextUtils.equals(str, zihVar.ouw)) {
                    return zihVar.f13811le;
                }
            }
        }
        return null;
    }

    public static JSONObject ouw(float f10, float f11, boolean z10, @NonNull vpp vppVar) {
        String str;
        vt vtVarLh;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("platform", "android");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("width", f10);
            jSONObject2.put("height", f11);
            if (z10) {
                jSONObject2.put("isLandscape", true);
            }
            jSONObject.put("AdSize", jSONObject2);
            jSONObject.put("creative", yu(vppVar));
            vpp.ouw ouwVar = vppVar.f13803xn;
            if (ouwVar != null) {
                str = ouwVar.yu;
                if (TextUtils.isEmpty(str) && (vtVarLh = com.bytedance.sdk.component.adexpress.ouw.vt.vt.lh(ouwVar.ouw)) != null) {
                    str = vtVarLh.fkw;
                }
            } else {
                str = "";
            }
            jSONObject.put("template_Plugin", str);
            vpp.ouw ouwVar2 = vppVar.f13803xn;
            jSONObject.put("diff_template_Plugin", ouwVar2 != null ? ouwVar2.fkw : "");
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public static JSONObject ouw(float f10, float f11, boolean z10, vpp vppVar, String str) {
        com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt vtVar;
        JSONObject jSONObject = null;
        if (vppVar == null) {
            return null;
        }
        try {
            JSONObject jSONObjectOuw = ouw(vppVar, true, true);
            try {
                if (jSONObjectOuw == null) {
                    return null;
                }
                try {
                    if (jSONObjectOuw.has("h265_video")) {
                        jSONObjectOuw.remove("h265_video");
                    }
                    if (jSONObjectOuw.has("video") && (vtVar = vppVar.f13788sd) != null) {
                        JSONObject jSONObjectLh = vtVar.lh();
                        if ("open_ad".equals(str)) {
                            com.bytedance.sdk.openadsdk.core.zih.yu();
                            jSONObjectLh.put("video_duration", cf.vm(String.valueOf(vppVar.fqk())));
                        } else {
                            jSONObjectLh.put("video_duration", vtVar.yu * ((double) vtVar.f11287th));
                        }
                        jSONObjectOuw.put("video", jSONObjectLh);
                    }
                } catch (Exception e10) {
                    ko.vt("TemplateUtils", e10.getMessage());
                }
                JSONObject jSONObjectVt = bs.vt(vppVar);
                jSONObjectVt.put("language", ryl.vt());
                jSONObjectOuw.put("xSetting", jSONObjectVt);
                jSONObjectOuw.put("xAdInfo", ouw(str, lh(vppVar), vppVar));
                JSONObject jSONObject2 = new JSONObject();
                bs.ouw(jSONObject2);
                jSONObject2.put("platform", "android");
                jSONObjectOuw.put("xAppInfo", jSONObject2);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("width", f10);
                jSONObject3.put("height", f11);
                if (z10) {
                    jSONObject3.put("isLandscape", true);
                }
                jSONObjectOuw.put("xSize", jSONObject3);
                return jSONObjectOuw;
            } catch (Throwable unused) {
                jSONObject = jSONObjectOuw;
                return jSONObject;
            }
        } catch (Throwable unused2) {
        }
    }

    public static JSONObject ouw(float f10, float f11, boolean z10, vpp vppVar, String str, lh lhVar) {
        vt = "";
        JSONObject jSONObjectOuw = null;
        if (vppVar == null) {
            return null;
        }
        try {
            jSONObjectOuw = ouw(f10, f11, z10, vppVar, str);
            if (lhVar != null) {
                lhVar.ouw("adv3");
            }
            pd pdVar = vppVar.lht;
            if (pdVar != null) {
                String str2 = pdVar.yu;
                if (TextUtils.isEmpty(str2)) {
                    String strOuw = com.bytedance.sdk.openadsdk.core.cf.ouw.vt.ouw().ouw("adv3", pdVar.ouw, pdVar.vt);
                    if (TextUtils.isEmpty(strOuw)) {
                        String str3 = "local db data is null id is " + pdVar.ouw + " md5 is " + pdVar.vt;
                        vt = str3;
                        if (lhVar != null) {
                            lhVar.ouw(3, str3, "net");
                        }
                    } else {
                        jSONObjectOuw.put("xTemplate", PangleVideoBridge.jsonObjectInit(strOuw));
                        vt = "getTemplate success by db data";
                        if (lhVar != null) {
                            lhVar.vt("local");
                        }
                    }
                } else {
                    jSONObjectOuw.put("xTemplate", PangleVideoBridge.jsonObjectInit(str2));
                    vt = "getTemplate success by local data";
                    if (lhVar != null) {
                        lhVar.vt("local");
                    }
                }
            }
        } catch (Exception e10) {
            String str4 = "load template exception " + e10.getMessage();
            vt = str4;
            if (lhVar != null) {
                lhVar.ouw(3, str4, "net");
            }
        }
        return jSONObjectOuw;
    }

    public static JSONObject ouw(vpp vppVar) {
        return ouw(vppVar, false, (JSONObject) null);
    }

    public static JSONObject ouw(vpp vppVar, boolean z10, JSONObject jSONObject) {
        JSONObject jSONObjectOuw = null;
        if (vppVar == null) {
            return null;
        }
        try {
            jSONObjectOuw = ouw(vppVar, false, z10);
            if (jSONObjectOuw == null) {
                jSONObjectOuw = new JSONObject();
            }
            JSONObject jSONObject2 = new JSONObject();
            bs.ouw(jSONObject2);
            jSONObject2.put("platform", "android");
            jSONObjectOuw.put("xAppInfo", jSONObject2);
            if (jSONObject != null) {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObjectOuw.put(next, jSONObject.get(next));
                }
            }
            JSONObject jSONObjectVt = bs.vt(vppVar);
            jSONObjectVt.put("language", ryl.vt());
            jSONObjectOuw.put("xSetting", jSONObjectVt);
        } catch (Throwable th2) {
            ko.yu("TemplateUtils", "getDataInOtherScene", th2.getMessage());
        }
        return jSONObjectOuw;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static org.json.JSONObject ouw(com.bytedance.sdk.openadsdk.core.model.vpp r4, boolean r5, boolean r6) {
        /*
            java.lang.String r0 = "creatives"
            r1 = 0
            if (r4 != 0) goto L6
            return r1
        L6:
            java.lang.String r2 = r4.f13753bo     // Catch: java.lang.Throwable -> L57
            if (r2 == 0) goto L5f
            org.json.JSONObject r3 = com.safedk.android.internal.partials.PangleVideoBridge.jsonObjectInit(r2)     // Catch: java.lang.Throwable -> L57
            org.json.JSONArray r2 = r3.optJSONArray(r0)     // Catch: java.lang.Throwable -> L57
            if (r5 != 0) goto L1e
            if (r6 == 0) goto L17
            goto L1e
        L17:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L57
            r4.<init>()     // Catch: java.lang.Throwable -> L57
            r1 = r4
            goto L3c
        L1e:
            if (r2 == 0) goto L37
            int r5 = r2.length()     // Catch: java.lang.Throwable -> L57
            int r4 = r4.jqy     // Catch: java.lang.Throwable -> L57
            if (r5 <= r4) goto L37
            org.json.JSONObject r4 = r2.optJSONObject(r4)     // Catch: java.lang.Throwable -> L57
            if (r4 == 0) goto L37
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L57
            org.json.JSONObject r5 = com.safedk.android.internal.partials.PangleVideoBridge.jsonObjectInit(r4)     // Catch: java.lang.Throwable -> L57
            goto L38
        L37:
            r5 = r1
        L38:
            if (r5 != 0) goto L3b
            return r1
        L3b:
            r1 = r5
        L3c:
            if (r2 == 0) goto L4e
            int r4 = r2.length()     // Catch: java.lang.Throwable -> L57
            r5 = 1
            if (r4 <= r5) goto L4e
            r4 = 0
            r2.remove(r4)     // Catch: java.lang.Throwable -> L57
            java.lang.String r4 = "xRestCreatives"
            r1.put(r4, r2)     // Catch: java.lang.Throwable -> L57
        L4e:
            r3.remove(r0)     // Catch: java.lang.Throwable -> L57
            java.lang.String r4 = "xRestResponse"
            r1.put(r4, r3)     // Catch: java.lang.Throwable -> L57
            goto L5f
        L57:
            r4 = move-exception
            java.lang.String r5 = "TemplateUtils"
            java.lang.String r6 = "filterTemplateInfo"
            com.bytedance.sdk.component.utils.qbp.ouw(r5, r6, r4)
        L5f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.bly.ouw.ouw.ouw(com.bytedance.sdk.openadsdk.core.model.vpp, boolean, boolean):org.json.JSONObject");
    }

    private static JSONObject ouw(String str, JSONObject jSONObject, vpp vppVar) {
        if (vppVar == null) {
            return jSONObject;
        }
        try {
            if ("open_ad".equals(str)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("app_name", bly.ouw().pno());
                int iBly = bly.ouw().bly();
                if (iBly != 0) {
                    int i10 = vppVar.kfa;
                    if (9 == i10) {
                        jSONObject2.put("app_icon", ouw);
                    } else if (10 == i10) {
                        jSONObject2.put("app_icon", "@".concat(String.valueOf(iBly)));
                    }
                }
                jSONObject.put("open_app_info", jSONObject2);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static JSONObject ouw(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject2 == null) {
            return jSONObject;
        }
        JSONObject jSONObject3 = new JSONObject();
        if (jSONObject == null) {
            return jSONObject3;
        }
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("keys");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    String strOptString = jSONArrayOptJSONArray.optString(i10);
                    if (jSONObject.has(strOptString)) {
                        jSONObject3.put(strOptString, jSONObject.opt(strOptString));
                    }
                }
                jSONObject3.put("xSetting", jSONObject.opt("xSetting"));
                jSONObject3.put("xAdInfo", jSONObject.opt("xAdInfo"));
                jSONObject3.put("xAppInfo", jSONObject.opt("xAppInfo"));
                jSONObject3.put("xSize", jSONObject.opt("xSize"));
                jSONObject3.put("dynamic_configs", jSONObject.opt("dynamic_configs"));
                jSONObject3.put("xTemplate", jSONObject.opt("xTemplate"));
                jSONObject3.put("xRestCreatives", jSONObject.opt("xRestCreatives"));
                jSONObject3.put("xRestResponse", jSONObject.opt("xRestResponse"));
                return jSONObject3;
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static Map<String, String> vt(vpp vppVar) {
        HashMap map = null;
        if (vppVar == null) {
            return null;
        }
        List<zih> list = vppVar.f13791tc;
        if (list != null && list.size() > 0) {
            map = new HashMap();
            for (zih zihVar : list) {
                if (zihVar != null) {
                    map.put(zihVar.ouw, zihVar.f13811le);
                }
            }
            zih zihVar2 = vppVar.fak;
            if (zihVar2 != null) {
                map.put(zihVar2.ouw, zihVar2.f13811le);
            }
        }
        return map;
    }

    public static JSONObject vt() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("language", ryl.vt());
            jSONObject.put("xSetting", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            bs.ouw(jSONObject3);
            jSONObject3.put("platform", "android");
            jSONObject.put("xAppInfo", jSONObject3);
        } catch (Exception e10) {
            qbp.lh("TemplateUtils", e10.getMessage());
        }
        return jSONObject;
    }

    private static JSONObject yu(@NonNull vpp vppVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("button_text", vppVar.vpp());
            zih zihVar = vppVar.fak;
            if (zihVar != null) {
                if (zihVar == null || TextUtils.isEmpty(zihVar.ouw)) {
                    jSONObject.put("icon", "");
                } else {
                    jSONObject.put("icon", vppVar.fak.ouw);
                }
            }
            JSONArray jSONArray = new JSONArray();
            if (vppVar.f13791tc != null) {
                for (int i10 = 0; i10 < vppVar.f13791tc.size(); i10++) {
                    zih zihVar2 = vppVar.f13791tc.get(i10);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("height", zihVar2.f13812lh);
                    jSONObject2.put("width", zihVar2.vt);
                    jSONObject2.put("url", zihVar2.ouw);
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("image", jSONArray);
            jSONObject.put("image_mode", vppVar.ucs);
            jSONObject.put("interaction_type", vppVar.f13782pd);
            jSONObject.put("interaction_method", vppVar.f13754bs);
            jSONObject.put("is_compliance_template", true);
            jSONObject.put("title", vppVar.fqk);
            jSONObject.put(UnifiedMediationParams.KEY_DESCRIPTION, vppVar.hun);
            jSONObject.put("source", vppVar.f13798vh);
            JSONObject jSONObject3 = new JSONObject();
            vm vmVar = vppVar.f13775mb;
            if (vmVar == null) {
                vmVar = new vm();
            }
            jSONObject3.put("ceiling_time", vmVar.f13748lh);
            jSONObject3.put("ceiling_ratio", vmVar.yu);
            jSONObject3.put("expand_ratio", vmVar.fkw);
            jSONObject.put("interaction_params", jSONObject3);
            le leVar = vppVar.f13802wp;
            if (leVar != null) {
                jSONObject.put("comment_num", leVar.f13684le);
                jSONObject.put(GAMConfig.KEY_SCORE, vppVar.f13802wp.fkw);
                jSONObject.put(CampaignEx.JSON_KEY_APP_SIZE, vppVar.f13802wp.f13686ra);
                jSONObject.put(MBridgeConstans.DYNAMIC_VIEW_WX_APP, vppVar.f13802wp.ouw());
            }
            com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt vtVar = vppVar.f13788sd;
            if (vtVar != null) {
                JSONObject jSONObjectLh = vtVar.lh();
                jSONObjectLh.put("video_duration", vtVar.yu * ((double) vtVar.f11287th));
                jSONObject.put("video", jSONObjectLh);
            }
            vpp.ouw ouwVar = vppVar.f13803xn;
            if (ouwVar != null) {
                jSONObject.put("dynamic_creative", ouwVar.f13809ra);
            }
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }
}
