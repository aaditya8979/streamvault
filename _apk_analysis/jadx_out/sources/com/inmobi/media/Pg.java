package com.inmobi.media;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Triple;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public abstract class Pg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map f26135a = kotlin.collections.a.m(bn.h.a("revenue", "getRevenue"), bn.h.a("revenue_precision", "getRevenuePrecision"), bn.h.a(BrandSafetyEvent.f52736ad, "getNetworkName"), bn.h.a("dsp_name", "getDspName"), bn.h.a(BrandSafetyEvent.f52757l, "getAdUnitId"), bn.h.a("network_placement", "getNetworkPlacement"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f26136b = kotlin.collections.a.m(bn.h.a("BANNER", "ban"), bn.h.a(BrandSafetyUtils.f51658o, "ban"), bn.h.a(BrandSafetyUtils.f51657n, "ban"), bn.h.a(BrandSafetyUtils.f51653j, ImpressionLog.f51753w), bn.h.a(BrandSafetyUtils.f51654k, "rew"), bn.h.a("REWARDED_INTER", "rew"), bn.h.a("NATIVE", "nat"));

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(java.lang.Object r2, java.lang.String r3) {
        /*
            java.lang.String r0 = "<this>"
            tn.p.k(r2, r0)
            java.lang.String r0 = "type"
            tn.p.k(r3, r0)
            int r0 = r3.hashCode()
            r1 = 0
            switch(r0) {
                case -1881759115: goto L82;
                case -1325958191: goto L51;
                case -891985903: goto L48;
                case 104431: goto L37;
                case 3029738: goto L26;
                case 3327612: goto L14;
                default: goto L12;
            }
        L12:
            goto L92
        L14:
            java.lang.String r0 = "long"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L1e
            goto L92
        L1e:
            boolean r3 = r2 instanceof java.lang.Long
            if (r3 == 0) goto L25
            java.lang.Long r2 = (java.lang.Long) r2
            return r2
        L25:
            return r1
        L26:
            java.lang.String r0 = "bool"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L2f
            goto L92
        L2f:
            boolean r3 = r2 instanceof java.lang.Boolean
            if (r3 == 0) goto L36
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            return r2
        L36:
            return r1
        L37:
            java.lang.String r0 = "int"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L40
            goto L92
        L40:
            boolean r3 = r2 instanceof java.lang.Integer
            if (r3 == 0) goto L47
            java.lang.Integer r2 = (java.lang.Integer) r2
            return r2
        L47:
            return r1
        L48:
            java.lang.String r0 = "string"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L8b
            goto L92
        L51:
            java.lang.String r0 = "double"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L5a
            goto L92
        L5a:
            boolean r3 = r2 instanceof java.lang.Double
            if (r3 == 0) goto L61
            java.lang.Double r2 = (java.lang.Double) r2
            return r2
        L61:
            boolean r3 = r2 instanceof java.lang.Integer
            if (r3 == 0) goto L71
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            double r2 = (double) r2
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            return r2
        L71:
            boolean r3 = r2 instanceof java.lang.Float
            if (r3 == 0) goto L81
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            double r2 = (double) r2
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            return r2
        L81:
            return r1
        L82:
            java.lang.String r0 = "stringf"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L8b
            goto L92
        L8b:
            boolean r3 = r2 instanceof java.lang.String
            if (r3 == 0) goto L92
            java.lang.String r2 = (java.lang.String) r2
            return r2
        L92:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Pg.a(java.lang.Object, java.lang.String):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Object a(Object obj, String str, int i10, int i11) {
        tn.p.k(obj, "<this>");
        tn.p.k(str, "type");
        switch (str.hashCode()) {
            case -1881759115:
                if (str.equals("stringf") && (obj instanceof String)) {
                    return (String) obj;
                }
                return null;
            case -1325958191:
                if (str.equals("double")) {
                    Number number = obj instanceof Number ? (Number) obj : null;
                    if (number == null) {
                        return null;
                    }
                    double dDoubleValue = number.doubleValue();
                    if (Math.abs(dDoubleValue) <= Double.MAX_VALUE) {
                        int iN = zn.n.n(i10, 0, 15);
                        dDoubleValue = iN == 0 ? dDoubleValue > 0.0d ? Math.floor(dDoubleValue) : Math.ceil(dDoubleValue) : BigDecimal.valueOf(dDoubleValue).movePointRight(iN).setScale(0, RoundingMode.DOWN).movePointLeft(iN).doubleValue();
                    }
                    return Double.valueOf(dDoubleValue);
                }
                return null;
            case -891985903:
                if (str.equals(TypedValues.Custom.S_STRING)) {
                    String str2 = obj instanceof String ? (String) obj : null;
                    if (str2 == null) {
                        return null;
                    }
                    tn.p.k(str2, "value");
                    if (str2.length() <= i11) {
                        return str2;
                    }
                    String strSubstring = str2.substring(0, i11);
                    tn.p.j(strSubstring, "substring(...)");
                    return strSubstring;
                }
                return null;
            case 104431:
                if (str.equals(ImpressionLog.f51753w)) {
                    Number number2 = obj instanceof Number ? (Number) obj : null;
                    if (number2 != null) {
                        return Integer.valueOf(number2.intValue());
                    }
                    return null;
                }
                return null;
            case 3029738:
                if (str.equals("bool") && (obj instanceof Boolean)) {
                    return (Boolean) obj;
                }
                return null;
            case 3327612:
                if (str.equals("long")) {
                    Number number3 = obj instanceof Number ? (Number) obj : null;
                    if (number3 != null) {
                        return Long.valueOf(number3.longValue());
                    }
                    return null;
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Object a(String str) {
        tn.p.k(str, "type");
        switch (str.hashCode()) {
            case -1881759115:
                str.equals("stringf");
                return com.ironsource.Y1.f30690f;
            case -1325958191:
                if (str.equals("double")) {
                    return Double.valueOf(Double.parseDouble(com.ironsource.Y1.f30690f));
                }
                return com.ironsource.Y1.f30690f;
            case -891985903:
                str.equals(TypedValues.Custom.S_STRING);
                return com.ironsource.Y1.f30690f;
            case 104431:
                if (str.equals(ImpressionLog.f51753w)) {
                    return Integer.valueOf(Integer.parseInt(com.ironsource.Y1.f30690f));
                }
                return com.ironsource.Y1.f30690f;
            case 3029738:
                str.equals("bool");
                return com.ironsource.Y1.f30690f;
            case 3327612:
                if (str.equals("long")) {
                    return Long.valueOf(Long.parseLong(com.ironsource.Y1.f30690f));
                }
                return com.ironsource.Y1.f30690f;
            default:
                return com.ironsource.Y1.f30690f;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final LinkedHashMap a(JSONObject jSONObject, SignalsConfig.PublisherConfig publisherConfig) {
        Object objValueOf;
        Object objValueOf2;
        JSONObject jSONObject2 = jSONObject;
        tn.p.k(jSONObject2, "<this>");
        tn.p.k(publisherConfig, "config");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : publisherConfig.getGeneralKeys().entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (jSONObject2.has(key)) {
                switch (value.hashCode()) {
                    case -1325958191:
                        if (value.equals("double")) {
                            objValueOf2 = Double.valueOf(jSONObject2.optDouble(key));
                            linkedHashMap.put(key, objValueOf2);
                        }
                        break;
                    case -891985903:
                        if (value.equals(TypedValues.Custom.S_STRING)) {
                            objValueOf2 = jSONObject2.optString(key);
                            linkedHashMap.put(key, objValueOf2);
                        }
                        break;
                    case 104431:
                        if (value.equals(ImpressionLog.f51753w)) {
                            objValueOf2 = Integer.valueOf(jSONObject2.optInt(key));
                            linkedHashMap.put(key, objValueOf2);
                        }
                        break;
                    case 3029738:
                        if (value.equals("bool")) {
                            objValueOf2 = Boolean.valueOf(jSONObject2.optBoolean(key));
                            linkedHashMap.put(key, objValueOf2);
                        }
                        break;
                    case 3327612:
                        if (value.equals("long")) {
                            objValueOf2 = Long.valueOf(jSONObject2.optLong(key));
                            linkedHashMap.put(key, objValueOf2);
                        }
                        break;
                }
            }
        }
        for (Map.Entry<String, String> entry2 : publisherConfig.getAdSpecificKeys().entrySet()) {
            String key2 = entry2.getKey();
            String value2 = entry2.getValue();
            JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray(key2);
            if (jSONArrayOptJSONArray != null) {
                String[] strArr = {"ban", ImpressionLog.f51753w, "rew", "nat"};
                int length = jSONArrayOptJSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    String str = key2 + "_" + strArr[i10];
                    switch (value2.hashCode()) {
                        case -1325958191:
                            if (value2.equals("double")) {
                                objValueOf = Double.valueOf(jSONArrayOptJSONArray.optDouble(i10));
                                linkedHashMap.put(str, objValueOf);
                            }
                            break;
                        case -891985903:
                            if (value2.equals(TypedValues.Custom.S_STRING)) {
                                objValueOf = jSONArrayOptJSONArray.optString(i10);
                                linkedHashMap.put(str, objValueOf);
                            }
                            break;
                        case 104431:
                            if (value2.equals(ImpressionLog.f51753w)) {
                                objValueOf = Integer.valueOf(jSONArrayOptJSONArray.optInt(i10));
                                linkedHashMap.put(str, objValueOf);
                            }
                            break;
                        case 3029738:
                            if (value2.equals("bool")) {
                                objValueOf = Boolean.valueOf(jSONArrayOptJSONArray.optBoolean(i10));
                                linkedHashMap.put(str, objValueOf);
                            }
                            break;
                        case 3327612:
                            if (value2.equals("long")) {
                                objValueOf = Long.valueOf(jSONArrayOptJSONArray.optLong(i10));
                                linkedHashMap.put(str, objValueOf);
                            }
                            break;
                    }
                }
            }
            jSONObject2 = jSONObject;
        }
        return linkedHashMap;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0111 A[PHI: r18
      0x0111: PHI (r18v10 org.json.JSONArray) = (r18v8 org.json.JSONArray), (r18v11 org.json.JSONArray) binds: [B:37:0x010e, B:30:0x00eb] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.Map a(java.util.Map r17, org.json.JSONObject r18, java.lang.String r19, java.lang.String r20, java.util.Map r21) {
        /*
            Method dump skipped, instruction units count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Pg.a(java.util.Map, org.json.JSONObject, java.lang.String, java.lang.String, java.util.Map):java.util.Map");
    }

    public static final Triple a(Map map, SignalsConfig.PublisherConfig publisherConfig) {
        tn.p.k(map, "<this>");
        tn.p.k(publisherConfig, "config");
        Object obj = map.get("auto_type");
        String str = obj instanceof String ? (String) obj : null;
        Map map2 = f26136b;
        if (str == null) {
            str = "";
        }
        String str2 = (String) map2.get(str);
        if (str2 == null) {
            map.toString();
            return new Triple("", null, "");
        }
        JSONObject jSONObject = (JSONObject) a(map, c(publisherConfig.getAuto().getAllowedKeys()), publisherConfig.getAuto().getPrecision(), publisherConfig.getAuto().getStrLen()).component1();
        jSONObject.put(b("auto_"), System.currentTimeMillis());
        return new Triple("auto_" + str2, jSONObject, str2);
    }

    public static final Triple a(Map map, Map map2, int i10, int i11) throws JSONException {
        tn.p.k(map, "<this>");
        tn.p.k(map2, "keys");
        JSONObject jSONObject = new JSONObject();
        Map mapC = kotlin.collections.a.C(map);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map2.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            Object obj = map.get(str);
            if (obj != null) {
                Object objA = a(obj, str2, i10, i11);
                if (objA != null) {
                    jSONObject.put(str, objA);
                    mapC.remove(str);
                } else {
                    jSONObject.put(str, a(str2));
                    arrayList.add(str);
                }
            }
        }
        return new Triple(jSONObject, cn.f0.g1(mapC.keySet()), arrayList);
    }

    public static final JSONObject a(Map map) throws JSONException {
        tn.p.k(map, "<this>");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                jSONObject.put(str, value);
            } else if (value instanceof Integer) {
                jSONObject.put(str, ((Number) value).intValue());
            } else if (value instanceof Boolean) {
                jSONObject.put(str, ((Boolean) value).booleanValue());
            } else if (value instanceof Double) {
                jSONObject.put(str, ((Number) value).doubleValue());
            } else if (value instanceof JSONArray) {
                jSONObject.put(str, value);
            } else if (value instanceof List) {
                JSONArray jSONArray = new JSONArray();
                for (Object obj : (Iterable) value) {
                    if (obj instanceof String) {
                        jSONArray.put(obj);
                    } else if (obj instanceof Integer) {
                        jSONArray.put(((Number) obj).intValue());
                    } else if (obj instanceof Boolean) {
                        jSONArray.put(((Boolean) obj).booleanValue());
                    } else if (obj instanceof Double) {
                        jSONArray.put(((Number) obj).doubleValue());
                    } else if (obj instanceof Map) {
                        tn.p.i(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
                        jSONArray.put(a((Map) obj));
                    }
                }
                jSONObject.put(str, jSONArray);
            } else {
                bn.r rVar = bn.r.f5635a;
            }
        }
        return jSONObject;
    }

    public static final JSONObject a(JSONObject jSONObject, String str, int i10) throws JSONException {
        String str2 = str;
        int i11 = i10;
        tn.p.k(jSONObject, "<this>");
        tn.p.k(str2, "prefix");
        if (i11 <= 0) {
            return jSONObject;
        }
        String[] strArr = {"ban", ImpressionLog.f51753w, "rew", "nat"};
        int i12 = 0;
        for (int i13 = 4; i12 < i13; i13 = 4) {
            String str3 = str2 + strArr[i12];
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str3);
            if (jSONArrayOptJSONArray != null) {
                JSONArray jSONArray = new JSONArray();
                String strB = b(str);
                long jCurrentTimeMillis = System.currentTimeMillis() - (((long) i11) * 1000);
                int length = jSONArrayOptJSONArray.length();
                for (int i14 = 0; i14 < length; i14++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i14);
                    if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.has(strB)) {
                        tn.p.k(jSONObjectOptJSONObject, "<this>");
                        tn.p.k(strB, "tsKey");
                        if (jSONObjectOptJSONObject.optLong(strB, 0L) >= jCurrentTimeMillis) {
                            jSONArray.put(jSONObjectOptJSONObject);
                        }
                    }
                }
                jSONObject.put(str3, jSONArray);
            }
            i12++;
            str2 = str;
            i11 = i10;
        }
        return jSONObject;
    }

    public static final JSONObject a(JSONObject jSONObject, String str, JSONObject jSONObject2, int i10) throws JSONException {
        tn.p.k(jSONObject, "<this>");
        tn.p.k(str, "key");
        tn.p.k(jSONObject2, "newObj");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            jSONArrayOptJSONArray = new JSONArray();
        }
        jSONArrayOptJSONArray.put(jSONObject2);
        while (true) {
            tn.p.k(jSONArrayOptJSONArray, "<this>");
            if (jSONArrayOptJSONArray.length() <= i10) {
                jSONObject.put(str, jSONArrayOptJSONArray);
                return jSONObject;
            }
            jSONArrayOptJSONArray.remove(0);
        }
    }

    public static final void a(JSONObject jSONObject, JSONObject jSONObject2, String str, String str2, Set set) {
        tn.p.k(jSONObject, "<this>");
        tn.p.k(jSONObject2, "cachedJson");
        tn.p.k(str, "formatKey");
        tn.p.k(str2, "prefix");
        tn.p.k(set, "allowedKeys");
        JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray(str2 + str);
        if (jSONArrayOptJSONArray == null) {
            jSONArrayOptJSONArray = new JSONArray();
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            JSONArray jSONArray = new JSONArray();
            int length = jSONArrayOptJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    Object objOpt = jSONObjectOptJSONObject.opt(str3);
                    if (objOpt == null) {
                        objOpt = com.ironsource.Y1.f30690f;
                    }
                    jSONArray.put(objOpt);
                }
            }
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray(str3);
            if (jSONArrayOptJSONArray2 == null) {
                jSONArrayOptJSONArray2 = new JSONArray();
            }
            jSONObject.put(str3, jSONArrayOptJSONArray2.put(jSONArray));
        }
    }

    public static final boolean a(Class cls) {
        tn.p.k(cls, "<this>");
        tn.p.k("com.applovin.mediation.MaxAd", "targetFqcn");
        Class<?>[] interfaces = cls.getInterfaces();
        tn.p.j(interfaces, "getInterfaces(...)");
        for (Class<?> cls2 : interfaces) {
            if (tn.p.f(cls2.getName(), "com.applovin.mediation.MaxAd")) {
                return true;
            }
            tn.p.h(cls2);
            if (a(cls2)) {
                return true;
            }
        }
        Class superclass = cls.getSuperclass();
        if (superclass == null) {
            return false;
        }
        return a(superclass);
    }

    public static final String b(String str) {
        tn.p.k(str, "prefix");
        return tn.p.f(str, "auto_") ? "auto_sts" : tn.p.f(str, "obj_") ? "obj_ts" : "dir_ts";
    }

    public static final Pair b(Map map) {
        tn.p.k(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (bo.a0.W(str, "obj_", false, 2, null) || bo.a0.W(str, "auto_", false, 2, null) || bo.a0.W(str, "dir_", false, 2, null)) {
                linkedHashMap2.put(str, value);
            } else {
                linkedHashMap.put(str, value);
            }
        }
        return new Pair(linkedHashMap, linkedHashMap2);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Triple b(java.util.Map r12, com.inmobi.media.core.config.models.SignalsConfig.PublisherConfig r13) {
        /*
            Method dump skipped, instruction units count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Pg.b(java.util.Map, com.inmobi.media.core.config.models.SignalsConfig$PublisherConfig):kotlin.Triple");
    }

    public static final JSONObject b(JSONObject jSONObject, SignalsConfig.PublisherConfig publisherConfig) {
        tn.p.k(jSONObject, "<this>");
        tn.p.k(publisherConfig, "config");
        if (jSONObject.toString().length() <= publisherConfig.getPayloadSize()) {
            return jSONObject;
        }
        Kb.a((byte) 1, "PubSignalsUtils", "Publisher Signal payload size exceeded.");
        bn.g gVar = P9.f26117a;
        P9.a(new L2(new IllegalStateException("Publisher signals size exceeds the limit")));
        return null;
    }

    public static final LinkedHashMap c(Map map) {
        tn.p.k(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            SignalsConfig.PublisherConfig.KeyData keyData = (SignalsConfig.PublisherConfig.KeyData) ((Map.Entry) it.next()).getValue();
            linkedHashMap.put(keyData.getName(), keyData.getType());
        }
        return linkedHashMap;
    }

    public static final Triple c(Map map, SignalsConfig.PublisherConfig publisherConfig) {
        tn.p.k(map, "<this>");
        tn.p.k(publisherConfig, "config");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object obj = map.get("dir_type");
        String str = obj instanceof String ? (String) obj : null;
        Map map2 = f26136b;
        if (str == null) {
            str = "";
        }
        String str2 = (String) map2.get(str);
        if (str2 == null) {
            Kb.a((byte) 1, "PubSignalsUtils", "Missing or invalid dir_type for Publisher signals");
            return new Triple("", null, "");
        }
        Triple tripleA = a(map, publisherConfig.getDirect().getAllowedKeys(), publisherConfig.getDirect().getPrecision(), publisherConfig.getDirect().getStrLen());
        JSONObject jSONObject = (JSONObject) tripleA.component1();
        List list = (List) tripleA.component2();
        List list2 = (List) tripleA.component3();
        jSONObject.put(b("dir_"), System.currentTimeMillis());
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (!tn.p.f((String) obj2, "dir_type")) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Kb.a((byte) 1, "PubSignalsUtils", "Publisher signal: " + ((String) it.next()) + " not supported");
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            Kb.a((byte) 1, "PubSignalsUtils", "Publisher signal: " + ((String) it2.next()) + " invalid type");
        }
        String str3 = "dir_" + str2;
        linkedHashMap.put(str3, jSONObject);
        return new Triple(str3, jSONObject, str2);
    }

    public static final LinkedHashMap d(Map map, SignalsConfig.PublisherConfig publisherConfig) {
        Object objA;
        tn.p.k(map, "<this>");
        tn.p.k(publisherConfig, "config");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.putAll(map);
        for (Map.Entry<String, String> entry : publisherConfig.getGeneralKeys().entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            Object obj = map.get(key);
            if (obj != null && (objA = a(obj, value)) != null) {
                linkedHashMap2.remove(key);
                linkedHashMap.put(key, objA);
            }
        }
        for (Map.Entry<String, String> entry2 : publisherConfig.getAdSpecificKeys().entrySet()) {
            String key2 = entry2.getKey();
            String value2 = entry2.getValue();
            String str = key2 + "_ban";
            String str2 = key2 + "_int";
            String str3 = key2 + "_rew";
            String str4 = key2 + "_nat";
            Object obj2 = map.get(str);
            Object objA2 = obj2 != null ? a(obj2, value2) : null;
            Object obj3 = map.get(str2);
            Object objA3 = obj3 != null ? a(obj3, value2) : null;
            Object obj4 = map.get(str3);
            Object objA4 = obj4 != null ? a(obj4, value2) : null;
            Object obj5 = map.get(str4);
            Object objA5 = obj5 != null ? a(obj5, value2) : null;
            if (objA2 != null || objA3 != null || objA4 != null || objA5 != null) {
                if (objA2 != null) {
                    linkedHashMap2.remove(str);
                }
                if (objA3 != null) {
                    linkedHashMap2.remove(str2);
                }
                if (objA4 != null) {
                    linkedHashMap2.remove(str3);
                }
                if (objA5 != null) {
                    linkedHashMap2.remove(str4);
                }
                JSONArray jSONArray = new JSONArray();
                if (objA2 == null) {
                    objA2 = a(value2);
                }
                JSONArray jSONArrayPut = jSONArray.put(objA2);
                if (objA3 == null) {
                    objA3 = a(value2);
                }
                JSONArray jSONArrayPut2 = jSONArrayPut.put(objA3);
                if (objA4 == null) {
                    objA4 = a(value2);
                }
                JSONArray jSONArrayPut3 = jSONArrayPut2.put(objA4);
                if (objA5 == null) {
                    objA5 = a(value2);
                }
                linkedHashMap.put(key2, jSONArrayPut3.put(objA5));
            }
        }
        for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
            Kb.a((byte) 1, "PubSignalsUtils", "Publisher Signal, " + ((String) entry3.getKey()) + "=" + entry3.getValue() + " Not supported");
        }
        return linkedHashMap;
    }
}
