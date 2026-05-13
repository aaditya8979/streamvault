package io.appmetrica.analytics.impl;

import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.kb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4909kb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f67109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f67110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f67111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f67112d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f67113e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Integer f67114f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f67115g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f67116h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CounterConfigurationReporterType f67117i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f67118j;

    public C4909kb(@NonNull Q5 q52, @NonNull I3 i32, @Nullable HashMap<M3, Integer> map) {
        this.f67109a = q52.getValueBytes();
        this.f67110b = q52.getName();
        this.f67111c = q52.getBytesTruncated();
        if (map != null) {
            this.f67112d = map;
        } else {
            this.f67112d = new HashMap();
        }
        Cf cfA = i32.a();
        this.f67113e = cfA.e();
        this.f67114f = cfA.f();
        this.f67115g = cfA.g();
        CounterConfiguration counterConfigurationB = i32.b();
        this.f67116h = counterConfigurationB.getApiKey();
        this.f67117i = counterConfigurationB.getReporterType();
        this.f67118j = q52.f();
    }

    public C4909kb(@NonNull String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        JSONObject jSONObject2 = jSONObject.getJSONObject("event");
        this.f67109a = Base64.decode(jSONObject2.getString("jvm_crash"), 0);
        this.f67110b = jSONObject2.getString("name");
        this.f67111c = jSONObject2.getInt("bytes_truncated");
        this.f67118j = JsonUtils.optStringOrNull(jSONObject2, "environment");
        String strOptString = jSONObject2.optString("trimmed_fields");
        this.f67112d = new HashMap();
        if (strOptString != null) {
            try {
                HashMap mapC = AbstractC4832hb.c(strOptString);
                if (mapC != null) {
                    for (Map.Entry entry : mapC.entrySet()) {
                        this.f67112d.put(M3.valueOf((String) entry.getKey()), Integer.valueOf(Integer.parseInt((String) entry.getValue())));
                    }
                }
            } catch (Throwable unused) {
            }
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("process_configuration");
        this.f67113e = jSONObject3.getString("package_name");
        this.f67114f = Integer.valueOf(jSONObject3.getInt("pid"));
        this.f67115g = jSONObject3.getString("psid");
        JSONObject jSONObject4 = jSONObject.getJSONObject("reporter_configuration");
        this.f67116h = jSONObject4.getString("api_key");
        this.f67117i = a(jSONObject4);
    }

    public static CounterConfigurationReporterType a(JSONObject jSONObject) {
        return jSONObject.has("reporter_type") ? CounterConfigurationReporterType.fromStringValue(jSONObject.getString("reporter_type")) : CounterConfigurationReporterType.MAIN;
    }

    public final String a() {
        return this.f67116h;
    }

    public final int b() {
        return this.f67111c;
    }

    public final byte[] c() {
        return this.f67109a;
    }

    @Nullable
    public final String d() {
        return this.f67118j;
    }

    public final String e() {
        return this.f67110b;
    }

    public final String f() {
        return this.f67113e;
    }

    public final Integer g() {
        return this.f67114f;
    }

    public final String h() {
        return this.f67115g;
    }

    @NonNull
    public final CounterConfigurationReporterType i() {
        return this.f67117i;
    }

    @NonNull
    public final HashMap<M3, Integer> j() {
        return this.f67112d;
    }

    public final String k() throws JSONException {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f67112d.entrySet()) {
            map.put(((M3) entry.getKey()).name(), (Integer) entry.getValue());
        }
        return new JSONObject().put("process_configuration", new JSONObject().put("pid", this.f67114f).put("psid", this.f67115g).put("package_name", this.f67113e)).put("reporter_configuration", new JSONObject().put("api_key", this.f67116h).put("reporter_type", this.f67117i.getStringValue())).put("event", new JSONObject().put("jvm_crash", Base64.encodeToString(this.f67109a, 0)).put("name", this.f67110b).put("bytes_truncated", this.f67111c).put("trimmed_fields", AbstractC4832hb.b(map)).putOpt("environment", this.f67118j)).toString();
    }
}
