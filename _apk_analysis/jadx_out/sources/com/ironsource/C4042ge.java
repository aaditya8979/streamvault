package com.ironsource;

import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.ge, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C4042ge {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f31816a;

    public C4042ge() {
        this.f31816a = IronSourceVideoBridge.jsonObjectInit();
    }

    public C4042ge(String str) {
        f(str);
    }

    private Object a(Object obj) throws JSONException {
        if (obj == JSONObject.NULL) {
            return null;
        }
        return obj instanceof JSONObject ? b((JSONObject) obj) : obj instanceof JSONArray ? a((JSONArray) obj) : obj;
    }

    public static boolean a(JSONObject jSONObject) {
        return jSONObject.names() == null;
    }

    public static Object b(Object obj) throws JSONException {
        if (!(obj instanceof Map)) {
            if (!(obj instanceof Iterable)) {
                return obj;
            }
            JSONArray jSONArray = new JSONArray();
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next());
            }
            return jSONArray;
        }
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        Map map = (Map) obj;
        for (Object obj2 : map.keySet()) {
            if (obj2 != null) {
                jSONObjectJsonObjectInit.put(obj2.toString(), b(map.get(obj2)));
            }
        }
        return jSONObjectJsonObjectInit;
    }

    private Map<String, Object> b(JSONObject jSONObject) throws JSONException {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, a(jSONObject.get(next)));
        }
        return map;
    }

    private void f(String str) {
        try {
            this.f31816a = IronSourceVideoBridge.jsonObjectInit(str);
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            this.f31816a = IronSourceVideoBridge.jsonObjectInit();
        }
    }

    public int a(String str, int i10) {
        return this.f31816a.optInt(str, i10);
    }

    public String a(String str, String str2) {
        return this.f31816a.optString(str, str2);
    }

    public List a(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            arrayList.add(a(jSONArray.get(i10)));
        }
        return arrayList;
    }

    public JSONObject a() {
        return this.f31816a;
    }

    public void a(String str, JSONObject jSONObject) {
        try {
            this.f31816a.put(str, jSONObject);
        } catch (Exception e10) {
            C4228r4.d().a(e10);
        }
    }

    public boolean a(String str) {
        return a().has(str);
    }

    public Object b(String str) {
        try {
            return a().get(str);
        } catch (JSONException e10) {
            C4228r4.d().a(e10);
            return null;
        }
    }

    public void b(String str, String str2) {
        try {
            this.f31816a.put(str, str2);
        } catch (Exception e10) {
            C4228r4.d().a(e10);
        }
    }

    public boolean c(String str) {
        return this.f31816a.optBoolean(str);
    }

    public String d(String str) {
        return this.f31816a.optString(str, null);
    }

    public boolean e(String str) {
        return a().isNull(str);
    }

    public String toString() {
        JSONObject jSONObject = this.f31816a;
        return jSONObject == null ? "" : jSONObject.toString();
    }
}
