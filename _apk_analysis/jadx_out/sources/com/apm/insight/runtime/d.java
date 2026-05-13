package com.apm.insight.runtime;

import androidx.annotation.Nullable;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: ConfigAid.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static HashMap<String, d> f7505a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private JSONObject f7506b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private JSONObject f7507c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f7508d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f7509e;

    private d(JSONObject jSONObject, String str) {
        this.f7509e = str;
        a(jSONObject);
        f7505a.put(this.f7509e, this);
        com.apm.insight.a.a((Object) "after update aid ".concat(String.valueOf(str)));
    }

    public static void a(String str, JSONObject jSONObject) {
        d dVar = f7505a.get(str);
        if (dVar != null) {
            dVar.a(jSONObject);
        } else {
            new d(jSONObject, str);
        }
    }

    private void a(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        this.f7506b = jSONObject;
        if (jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject("error_module")) == null) {
            return;
        }
        this.f7508d = jSONObjectOptJSONObject.optInt("switcher") == 1 && jSONObjectOptJSONObject.optInt("err_sampling_rate") == 1;
    }

    public static boolean a(String str) {
        return f7505a.get(str) != null;
    }

    @Nullable
    public static JSONObject b(String str) {
        d dVar = f7505a.get(str);
        if (dVar != null) {
            return dVar.f7506b;
        }
        return null;
    }

    public static d c(String str) {
        return f7505a.get(str);
    }

    public static long d(String str) {
        d dVar = f7505a.get(str);
        if (dVar == null) {
            return 3600000L;
        }
        try {
            return Long.decode(com.apm.insight.a.a(dVar.f7506b, "over_all", "get_settings_interval")).longValue() * 1000;
        } catch (Throwable unused) {
            return 3600000L;
        }
    }

    public static boolean e(String str) {
        d dVar = f7505a.get(str);
        if (dVar != null) {
            JSONObject jSONObject = dVar.f7506b;
            if (jSONObject != null && 1 == com.apm.insight.a.a(jSONObject, 0, "crash_module", "switcher")) {
                return true;
            }
        }
        return false;
    }

    public static boolean f(String str) {
        d dVar = f7505a.get(str);
        if (dVar != null) {
            JSONObject jSONObject = dVar.f7506b;
            if (jSONObject != null && 1 == com.apm.insight.a.a(jSONObject, 0, "crash_module", "switcher")) {
                return true;
            }
        }
        return false;
    }

    public static boolean g(String str) {
        d dVar = f7505a.get(str);
        if (dVar != null) {
            JSONObject jSONObject = dVar.f7506b;
            if (jSONObject != null && 1 == com.apm.insight.a.a(jSONObject, 0, "crash_module", "switcher")) {
                return true;
            }
        }
        return false;
    }

    public final boolean a() {
        if (this.f7506b == null) {
            return false;
        }
        return this.f7508d;
    }
}
