package com.inmobi.media;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class F9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f25421a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f25422b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f25423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f25424d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static JSONObject f25425e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static JSONObject f25426f;

    public static final JSONObject a() {
        synchronized (f25422b) {
            if (f25424d) {
                Objects.toString(f25426f);
                return f25426f;
            }
            f25424d = true;
            Context context = Ji.f25747a;
            String string = null;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Ea.f25372b;
                Ea eaA = Da.a(context, "unified_id_info_store");
                tn.p.k("publisher_provided_unified_id", "key");
                string = eaA.f25373a.getString("publisher_provided_unified_id", null);
            }
            try {
                try {
                    f25426f = new JSONObject(string);
                } catch (JSONException e10) {
                    e10.getMessage();
                }
            } catch (NullPointerException e11) {
                e11.getMessage();
            }
            Objects.toString(f25426f);
            return f25426f;
        }
    }

    public static final void a(JSONObject jSONObject) {
        synchronized (f25422b) {
            Objects.toString(f25426f);
            Objects.toString(jSONObject);
            f25426f = jSONObject;
            f25424d = true;
            Context context = Ji.f25747a;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Ea.f25372b;
                Ea eaA = Da.a(context, "unified_id_info_store");
                JSONObject jSONObject2 = f25426f;
                if (jSONObject2 == null) {
                    eaA.a("publisher_provided_unified_id");
                } else {
                    eaA.a("publisher_provided_unified_id", String.valueOf(jSONObject2), false);
                    bn.r rVar = bn.r.f5635a;
                }
            }
        }
    }

    public static final JSONObject b() {
        synchronized (f25421a) {
            if (f25423c) {
                return f25425e;
            }
            f25423c = true;
            Context context = Ji.f25747a;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Ea.f25372b;
                Ea eaA = Da.a(context, "unified_id_info_store");
                tn.p.k("ufids", "key");
                String string = eaA.f25373a.getString("ufids", null);
                if (string != null) {
                    try {
                        f25425e = new JSONObject(string);
                    } catch (JSONException e10) {
                        e10.getMessage();
                    }
                    return f25425e;
                }
            }
            return null;
        }
    }

    public static final void b(JSONObject jSONObject) {
        synchronized (f25421a) {
            f25425e = jSONObject;
            f25423c = true;
            Context context = Ji.f25747a;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Ea.f25372b;
                Ea eaA = Da.a(context, "unified_id_info_store");
                JSONObject jSONObject2 = f25425e;
                if (jSONObject2 == null) {
                    eaA.a("ufids");
                } else {
                    eaA.a("ufids", String.valueOf(jSONObject2), false);
                }
                SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(context).edit();
                JSONObject jSONObject3 = f25425e;
                if (jSONObject3 == null) {
                    editorEdit.remove("InMobi_unifiedId");
                } else {
                    editorEdit.putString("InMobi_unifiedId", String.valueOf(jSONObject3));
                }
                editorEdit.apply();
            }
        }
    }
}
