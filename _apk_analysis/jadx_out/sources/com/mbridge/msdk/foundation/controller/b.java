package com.mbridge.msdk.foundation.controller;

import android.util.Log;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: CandidateController.java */
/* JADX INFO: loaded from: classes8.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashMap<String, com.mbridge.msdk.foundation.cache.d> f37395a;

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.controller.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CandidateController.java */
    public static class C0439b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static b f37396a = new b();
    }

    private b() {
        this.f37395a = new HashMap<>();
    }

    public static b a() {
        return C0439b.f37396a;
    }

    public com.mbridge.msdk.foundation.cache.d a(String str, JSONArray jSONArray) {
        if (this.f37395a == null) {
            this.f37395a = new HashMap<>();
        }
        if (this.f37395a.containsKey(str)) {
            return this.f37395a.get(str);
        }
        com.mbridge.msdk.foundation.cache.d dVar = new com.mbridge.msdk.foundation.cache.d(str, jSONArray);
        this.f37395a.put(str, dVar);
        return dVar;
    }

    public com.mbridge.msdk.foundation.cache.d b(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        Exception e10;
        if (this.f37395a == null) {
            this.f37395a = new HashMap<>();
        }
        if (this.f37395a.containsKey(str)) {
            return this.f37395a.get(str);
        }
        if (jSONArray == null) {
            try {
                jSONArray2 = new JSONArray();
            } catch (Exception e11) {
                jSONArray2 = jSONArray;
                e10 = e11;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("c_cb", 0);
                jSONObject.put("t_disc", 0.95d);
                jSONObject.put("u_disc", 0.95d);
                jSONObject.put("max_ecppv_diff", 0);
                jSONObject.put("max_cache_num", 20);
                jSONObject.put("max_usage_limit", 10);
                jSONObject.put("time_interval", 7200);
                jSONArray2.put(jSONObject);
            } catch (Exception e12) {
                e10 = e12;
                Log.e("CandidateController", e10.getMessage());
            }
            jSONArray = jSONArray2;
        }
        return a(str, jSONArray);
    }
}
