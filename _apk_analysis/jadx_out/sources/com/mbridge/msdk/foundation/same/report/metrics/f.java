package com.mbridge.msdk.foundation.same.report.metrics;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;
import com.mbridge.msdk.setting.l;
import com.mbridge.msdk.tracker.m;
import com.mbridge.msdk.tracker.network.toolbox.i;
import io.bidmachine.ads.networks.nast.NastAdapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: SameMetricsReport.java */
/* JADX INFO: loaded from: classes.dex */
public class f {
    private com.mbridge.msdk.tracker.e a(String str, Map<String, String> map) {
        if (map == null || TextUtils.isEmpty(str)) {
            return null;
        }
        com.mbridge.msdk.tracker.e eVar = new com.mbridge.msdk.tracker.e(str);
        try {
            JSONObject jSONObject = new JSONObject(map);
            Boolean boolA = com.mbridge.msdk.foundation.same.b.b().a();
            if (boolA != null) {
                jSONObject.put("r_v_r", boolA.booleanValue() ? 1 : 0);
            }
            eVar.a(jSONObject);
            eVar.b(0);
            eVar.a(0);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
        return eVar;
    }

    private List<CampaignEx> a(c cVar, String str) {
        int iIntValue;
        ArrayList arrayList = new ArrayList();
        if (cVar != null) {
            try {
                String str2 = cVar.t() + str;
                Map<String, Map<String, String>> mapW = cVar.w();
                int i10 = -1;
                if (mapW != null && mapW.containsKey(str2)) {
                    try {
                        Object obj = mapW.get(str2).get("resource_type");
                        if (obj instanceof String) {
                            iIntValue = Integer.parseInt((String) obj);
                        } else if (obj instanceof Integer) {
                            iIntValue = ((Integer) obj).intValue();
                        }
                        i10 = iIntValue;
                    } catch (NumberFormatException e10) {
                        if (MBridgeConstans.DEBUG) {
                            e10.printStackTrace();
                        }
                    }
                }
                if (i10 == 1) {
                    List<CampaignEx> listO = cVar.o() != null ? cVar.o() : cVar.m();
                    if (listO != null && listO.size() > 0) {
                        arrayList.addAll(listO);
                    }
                } else if (cVar.n() != null) {
                    arrayList.add(cVar.n());
                } else {
                    List<CampaignEx> listO2 = cVar.o() != null ? cVar.o() : cVar.m();
                    if (listO2 != null && listO2.size() > 0) {
                        arrayList.addAll(listO2);
                    }
                }
            } catch (Exception e11) {
                if (MBridgeConstans.DEBUG) {
                    e11.printStackTrace();
                }
            }
        }
        return arrayList;
    }

    private Map<String, String> a(String str, String str2, m mVar) {
        e eVar = new e();
        try {
            g gVarD = h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
            if (gVarD == null) {
                gVarD = h.b().a();
            }
            if (!TextUtils.isEmpty(gVarD.l0())) {
                eVar.a("as_rid", gVarD.l0());
            }
            String strJ = gVarD.J();
            JSONArray jSONArrayI = gVarD.I();
            if (jSONArrayI != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= jSONArrayI.length()) {
                        break;
                    }
                    if (str.equals(jSONArrayI.getString(i10))) {
                        strJ = NastAdapter.ADAPTER_SDK_VERSION_NAME;
                        break;
                    }
                    i10++;
                }
            }
            if (TextUtils.isEmpty(strJ)) {
                eVar.a("log_rate", -1);
            } else {
                eVar.a("log_rate", strJ);
            }
            if (!TextUtils.isEmpty(str2)) {
                l lVarD = h.b().d(com.mbridge.msdk.foundation.controller.c.n().b(), str2);
                if (lVarD != null && !TextUtils.isEmpty(lVarD.I())) {
                    eVar.a("us_rid", lVarD.I());
                }
                if (lVarD != null && !TextUtils.isEmpty(lVarD.a())) {
                    eVar.a("u_stid", lVarD.a());
                }
                e eVarC = d.b().c(str2);
                if (eVarC != null) {
                    if (mVar != null && mVar.c() != null) {
                        try {
                            mVar.c().put("r_stid", eVarC.b("r_stid"));
                            eVarC.c("r_stid");
                        } catch (JSONException unused) {
                        }
                    }
                    eVar.a(eVarC);
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
        return eVar.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x085f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a9 A[Catch: Exception -> 0x0859, TryCatch #1 {Exception -> 0x0859, blocks: (B:3:0x001b, B:5:0x0027, B:8:0x002e, B:10:0x003a, B:27:0x0077, B:30:0x0080, B:32:0x0086, B:35:0x0091, B:37:0x0097, B:51:0x00cd, B:53:0x00d3, B:55:0x00d8, B:58:0x00f7, B:60:0x00fd, B:72:0x013d, B:73:0x0141, B:75:0x0147, B:78:0x0150, B:80:0x0197, B:82:0x01f8, B:84:0x0202, B:86:0x0215, B:87:0x021e, B:89:0x0231, B:91:0x0240, B:92:0x024d, B:95:0x0259, B:98:0x0284, B:100:0x028a, B:102:0x0290, B:103:0x02ae, B:104:0x02b9, B:106:0x02c3, B:108:0x02c9, B:111:0x02f9, B:113:0x0301, B:115:0x0307, B:116:0x0325, B:117:0x0330, B:119:0x0338, B:121:0x033e, B:122:0x035c, B:123:0x0367, B:125:0x036f, B:127:0x0375, B:128:0x0393, B:129:0x039e, B:132:0x03b3, B:134:0x03bd, B:135:0x03c3, B:136:0x03c8, B:138:0x03ce, B:140:0x03dc, B:143:0x03ec, B:145:0x03f2, B:152:0x043a, B:154:0x0444, B:157:0x0450, B:159:0x0456, B:160:0x046f, B:161:0x0473, B:163:0x0479, B:164:0x0492, B:165:0x0495, B:167:0x049f, B:169:0x04af, B:172:0x04da, B:175:0x04e3, B:177:0x04e9, B:183:0x0528, B:187:0x0534, B:189:0x054b, B:191:0x0570, B:193:0x0578, B:195:0x059d, B:197:0x05a1, B:199:0x05b1, B:200:0x05b6, B:202:0x05c0, B:203:0x05c9, B:205:0x05cf, B:206:0x05dc, B:208:0x05fd, B:210:0x0604, B:211:0x0611, B:213:0x061b, B:214:0x0624, B:216:0x062c, B:218:0x0633, B:219:0x0640, B:221:0x064a, B:222:0x0653, B:223:0x0660, B:225:0x0668, B:229:0x067b, B:232:0x0689, B:234:0x06af, B:236:0x06b5, B:238:0x06ba, B:237:0x06b8, B:239:0x06c1, B:241:0x06c9, B:243:0x06cf, B:245:0x06d4, B:244:0x06d2, B:246:0x06db, B:249:0x06e5, B:251:0x06ed, B:252:0x06f5, B:254:0x0705, B:256:0x070b, B:258:0x0710, B:260:0x071f, B:262:0x0725, B:264:0x072a, B:268:0x073c, B:272:0x075c, B:274:0x0765, B:277:0x0784, B:279:0x0790, B:285:0x079e, B:287:0x07aa, B:289:0x07b4, B:295:0x07cc, B:297:0x07df, B:299:0x07e5, B:301:0x07ea, B:300:0x07e8, B:296:0x07d6, B:290:0x07bd, B:292:0x07c3, B:311:0x0825, B:302:0x07f2, B:304:0x0800, B:306:0x0813, B:308:0x0819, B:310:0x081e, B:309:0x081c, B:305:0x080a, B:275:0x0770, B:271:0x0758, B:263:0x0728, B:257:0x070e, B:194:0x0596, B:190:0x0569, B:178:0x0502, B:179:0x0506, B:181:0x050c, B:182:0x0525, B:170:0x04cf, B:146:0x040d, B:147:0x0413, B:149:0x041b, B:150:0x0434, B:109:0x02e9, B:96:0x0277, B:88:0x0228, B:81:0x01d8, B:68:0x0133, B:70:0x0137, B:33:0x008b, B:39:0x009d, B:42:0x00a9, B:44:0x00b1, B:45:0x00b9, B:47:0x00bf, B:50:0x00ca, B:48:0x00c4, B:20:0x0057, B:11:0x003f, B:13:0x0045, B:62:0x010d, B:64:0x012c), top: B:321:0x001b, inners: #0, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.Map<java.lang.String, java.lang.String> c(java.lang.String r25, com.mbridge.msdk.foundation.same.report.metrics.c r26) {
        /*
            Method dump skipped, instruction units count: 2151
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.same.report.metrics.f.c(java.lang.String, com.mbridge.msdk.foundation.same.report.metrics.c):java.util.Map");
    }

    private Map<String, String> d(String str, c cVar) {
        return (cVar == null || TextUtils.isEmpty(str)) ? new HashMap() : cVar.c(str);
    }

    private Map<String, String> e(String str, c cVar) {
        e eVar = new e();
        try {
            if (str.equals("2000125")) {
                eVar.a("duration", Long.valueOf(cVar.b("2000123")));
            } else if (str.equals("2000126")) {
                eVar.a("duration", Long.valueOf(cVar.b("2000125")));
            } else if (str.equals("2000127")) {
                eVar.a("duration", Long.valueOf(cVar.b("2000123")));
            } else if (str.equals("2000154")) {
                eVar.a("duration", Long.valueOf(cVar.b("2000126")));
            } else if (str.equals("2000047") || str.equals("2000048")) {
                eVar.a("duration", Long.valueOf(cVar.b("2000123")));
            } else if (str.equals("2000155")) {
                eVar.a("duration", Long.valueOf(cVar.b("2000154")));
            } else if (str.equals("2000146")) {
                eVar.a("duration", Long.valueOf(cVar.b("2000130")));
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
        return eVar.a();
    }

    public Map<String, String> a(String str, c cVar) {
        HashMap map = new HashMap();
        try {
            if (Arrays.asList(b.f37948e).contains(str)) {
                map.put("auto_load", cVar != null ? cVar.j() : "");
            }
            if (cVar != null) {
                Map<String, Map<String, String>> mapW = cVar.w();
                String str2 = cVar.t() + str;
                if (mapW.containsKey(str2) && mapW.get(str2) != null) {
                    map.putAll(mapW.get(str2));
                }
                try {
                    Map<String, Map<String, String>> mapV = cVar.v();
                    String str3 = cVar.t() + "_" + cVar.q() + "_" + str;
                    if (mapV.containsKey(str3) && mapV.get(str3) != null) {
                        map.putAll(mapV.get(str3));
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        } catch (Exception e11) {
            if (MBridgeConstans.DEBUG) {
                e11.printStackTrace();
            }
        }
        return map;
    }

    public void a(String str, m mVar, c cVar, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
        Map<String, String> mapE;
        HashMap map = new HashMap();
        if (cVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            cVar.j(str);
            Map<String, String> mapC = c(str, cVar);
            if (mapC != null) {
                map.putAll(mapC);
            }
            Map<String, String> mapA = a(str, cVar.B(), mVar);
            if (mapA != null) {
                map.putAll(mapA);
            }
            if (Arrays.asList(b.f37947d).contains(str) && (mapE = e(str, cVar)) != null) {
                map.putAll(mapE);
            }
            Map<String, String> mapA2 = a(str, cVar);
            if (mapA2 != null) {
                map.putAll(mapA2);
            }
            Map<String, String> mapB = b(str, cVar);
            if (mapB != null) {
                map.putAll(mapB);
            }
            if (!map.containsKey("lrid") || TextUtils.isEmpty(map.get("lrid"))) {
                map.put("lrid", cVar.t());
            }
            if (map.containsKey("lrid")) {
                String str2 = map.get("lrid");
                if (!TextUtils.isEmpty(str2) && str2.contains("label_second")) {
                    map.put("lrid", str2.replace("label_second", ""));
                }
            }
            if (map.containsKey("n_lrid")) {
                String str3 = map.get("n_lrid");
                if (!TextUtils.isEmpty(str3) && str3.contains("label_second")) {
                    map.put("n_lrid", str3.replace("n_lrid", ""));
                }
            }
            Map<String, String> mapD = d(str, cVar);
            if (mapD != null) {
                map.putAll(mapD);
            }
            String str4 = "1";
            if (cVar.j() == null || !cVar.j().equals("1") || !Arrays.asList(b.f37945b).contains(str) || cVar.g() == 296) {
                if (Arrays.asList(b.f37956m).contains(str)) {
                    map.put("use_local_dns", i.b().e() ? "1" : "0");
                    if (!i.b().d()) {
                        str4 = "0";
                    }
                    map.put("local_dns_available", str4);
                }
                com.mbridge.msdk.tracker.e eVarA = a(str, map);
                if (mVar != null && eVarA != null) {
                    mVar.d(eVarA);
                }
                if (aVar != null) {
                    aVar.a();
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public Map<String, String> b(String str, c cVar) {
        HashMap map = new HashMap();
        if (cVar == null) {
            return map;
        }
        return cVar.a(cVar.t() + str);
    }

    public void b(String str, m mVar, c cVar, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
        if (cVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            HashMap map = new HashMap();
            cVar.j(str);
            Map<String, String> mapA = a(str, cVar.B(), mVar);
            if (mapA != null) {
                map.putAll(mapA);
            }
            Map<String, String> mapA2 = a(str, cVar);
            if (mapA2 != null) {
                map.putAll(mapA2);
            }
            Map<String, String> mapB = b(str, cVar);
            if (mapB != null) {
                map.putAll(mapB);
            }
            Map<String, String> mapD = d(str, cVar);
            if (mapD != null) {
                map.putAll(mapD);
            }
            com.mbridge.msdk.tracker.e eVarA = a(str, map);
            if (mVar != null && eVarA != null) {
                mVar.d(eVarA);
            }
            if (aVar != null) {
                aVar.a();
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }
}
