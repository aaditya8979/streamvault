package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.la, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C4127la {
    private static Object a(Object obj) {
        return obj instanceof JSONObject ? a((JSONObject) obj) : obj instanceof JSONArray ? a((JSONArray) obj) : obj;
    }

    public static List<Object> a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                arrayList.add(a(jSONArray.get(i10)));
            } catch (JSONException e10) {
                C4228r4.d().a(e10);
                IronLog.INTERNAL.error(String.format("Could not put value into list: %s", e10.getMessage()));
            }
        }
        return arrayList;
    }

    @NotNull
    public static Map<String, Object> a(JSONObject jSONObject) {
        HashMap map = new HashMap();
        if (jSONObject == null) {
            return map;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                map.put(next, a(jSONObject.get(next)));
            } catch (JSONException e10) {
                C4228r4.d().a(e10);
                IronLog.INTERNAL.error(String.format("Could not put value in map: %s, %s", next, e10.getMessage()));
            }
        }
        return map;
    }

    public static JSONObject a(Map<String, Object> map) {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                try {
                    jSONObjectJsonObjectInit.put(entry.getKey(), b(entry.getValue()));
                } catch (JSONException e10) {
                    C4228r4.d().a(e10);
                    IronLog.INTERNAL.error(String.format("Could not map entry to object: %s, %s", entry.getKey(), entry.getValue()));
                }
            }
        }
        return jSONObjectJsonObjectInit;
    }

    public static JSONObject a(JSONObject... jSONObjectArr) {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        if (jSONObjectArr != null) {
            for (JSONObject jSONObject : jSONObjectArr) {
                if (jSONObject != null) {
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        try {
                            jSONObjectJsonObjectInit.put(next, jSONObject.get(next));
                        } catch (JSONException e10) {
                            C4228r4.d().a(e10);
                            IronLog.INTERNAL.error(e10.toString());
                        }
                    }
                }
            }
        }
        return jSONObjectJsonObjectInit;
    }

    public static boolean a(String str) {
        try {
            IronSourceVideoBridge.jsonObjectInit(str);
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }

    public static Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof JSONArray) || (obj instanceof JSONObject) || obj.equals(JSONObject.NULL)) {
            return obj;
        }
        try {
            if (obj instanceof Collection) {
                return new JSONArray((Collection) obj);
            }
            if (obj.getClass().isArray()) {
                return new JSONArray((Collection) Arrays.asList(obj));
            }
            if (obj instanceof Map) {
                return new JSONObject((Map) obj);
            }
            if (!(obj instanceof Boolean) && !(obj instanceof Byte) && !(obj instanceof Character) && !(obj instanceof Double) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Short) && !(obj instanceof String)) {
                return ((obj instanceof Enum) || obj.getClass().getPackage().getName().startsWith("java.")) ? obj.toString() : obj;
            }
            return obj;
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            return null;
        }
    }

    public static List<String> b(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            arrayList.add(jSONArray.getString(i10));
        }
        return arrayList;
    }
}
