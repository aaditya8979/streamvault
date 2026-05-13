package com.applovin.impl;

import android.os.Bundle;
import androidx.arch.core.util.Function;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.safedk.android.utils.SdksMapping;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class k3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.applovin.impl.sdk.k f8599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JSONObject f8600b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JSONObject f8602d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f8604f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final h5 f8605g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h5 f8606h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f8607i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f8608j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f8601c = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f8603e = new Object();

    public k3(Map map, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.k kVar) {
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (jSONObject2 == null) {
            throw new IllegalArgumentException("No full response specified");
        }
        if (jSONObject == null) {
            throw new IllegalArgumentException("No ad object specified");
        }
        this.f8599a = kVar;
        if (((Boolean) kVar.a(x4.C6)).booleanValue()) {
            this.f8605g = new h5(jSONObject2);
            this.f8606h = new h5(jSONObject);
            this.f8600b = null;
            this.f8602d = null;
        } else {
            this.f8600b = jSONObject2;
            this.f8602d = jSONObject;
            this.f8605g = null;
            this.f8606h = null;
        }
        this.f8604f = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Bundle a(h5 h5Var) {
        return JsonUtils.toBundle(h5Var.a("server_parameters", (JSONObject) null));
    }

    private int j() {
        return a("mute_state", b("mute_state", ((Integer) this.f8599a.a(r3.f9731b8)).intValue()));
    }

    public float a(String str, float f10) {
        float f11;
        h5 h5Var = this.f8606h;
        if (h5Var != null) {
            return h5Var.a(str, f10);
        }
        synchronized (this.f8603e) {
            f11 = JsonUtils.getFloat(this.f8602d, str, f10);
        }
        return f11;
    }

    public int a(String str, int i10) {
        int i11;
        h5 h5Var = this.f8606h;
        if (h5Var != null) {
            return h5Var.a(str, i10);
        }
        synchronized (this.f8603e) {
            i11 = JsonUtils.getInt(this.f8602d, str, i10);
        }
        return i11;
    }

    public long a(String str, long j10) {
        long j11;
        h5 h5Var = this.f8606h;
        if (h5Var != null) {
            return h5Var.a(str, j10);
        }
        synchronized (this.f8603e) {
            j11 = JsonUtils.getLong(this.f8602d, str, j10);
        }
        return j11;
    }

    public Boolean a(String str, Boolean bool) {
        Boolean bool2;
        h5 h5Var = this.f8606h;
        if (h5Var != null) {
            return h5Var.a(str, bool);
        }
        synchronized (this.f8603e) {
            bool2 = JsonUtils.getBoolean(this.f8602d, str, bool);
        }
        return bool2;
    }

    public String a(String str) {
        String strA = a(str, "");
        return StringUtils.isValidString(strA) ? strA : b(str, "");
    }

    public String a(String str, String str2) {
        String string;
        h5 h5Var = this.f8606h;
        if (h5Var != null) {
            return h5Var.a(str, str2);
        }
        synchronized (this.f8603e) {
            string = JsonUtils.getString(this.f8602d, str, str2);
        }
        return string;
    }

    public JSONArray a(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        h5 h5Var = this.f8606h;
        if (h5Var != null) {
            return h5Var.a(str, jSONArray);
        }
        synchronized (this.f8603e) {
            jSONArray2 = JsonUtils.getJSONArray(this.f8602d, str, jSONArray);
        }
        return jSONArray2;
    }

    public JSONObject a() {
        JSONObject jSONObject;
        h5 h5Var = this.f8606h;
        if (h5Var != null) {
            return h5Var.a();
        }
        synchronized (this.f8603e) {
            jSONObject = this.f8602d;
        }
        return jSONObject;
    }

    public JSONObject a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        h5 h5Var = this.f8606h;
        if (h5Var != null) {
            return h5Var.a(str, jSONObject);
        }
        synchronized (this.f8603e) {
            jSONObject2 = JsonUtils.getJSONObject(this.f8602d, str, jSONObject);
        }
        return jSONObject2;
    }

    public void a(String str, Object obj) {
        h5 h5Var = this.f8606h;
        if (h5Var != null) {
            h5Var.a(str, obj);
            return;
        }
        synchronized (this.f8603e) {
            JsonUtils.putObject(this.f8602d, str, obj);
        }
    }

    public int b(String str, int i10) {
        int i11;
        h5 h5Var = this.f8605g;
        if (h5Var != null) {
            return h5Var.a(str, i10);
        }
        synchronized (this.f8601c) {
            i11 = JsonUtils.getInt(this.f8600b, str, i10);
        }
        return i11;
    }

    public long b(String str, long j10) {
        long j11;
        h5 h5Var = this.f8605g;
        if (h5Var != null) {
            return h5Var.a(str, j10);
        }
        synchronized (this.f8601c) {
            j11 = JsonUtils.getLong(this.f8600b, str, j10);
        }
        return j11;
    }

    public Boolean b(String str, Boolean bool) {
        Boolean bool2;
        h5 h5Var = this.f8605g;
        if (h5Var != null) {
            return h5Var.a(str, bool);
        }
        synchronized (this.f8601c) {
            bool2 = JsonUtils.getBoolean(this.f8600b, str, bool);
        }
        return bool2;
    }

    public String b() {
        return a(SdksMapping.KEY_INSTALLED_MEDIATION_ADAPTERS_CLASS, (String) null);
    }

    public String b(String str, String str2) {
        String string;
        h5 h5Var = this.f8605g;
        if (h5Var != null) {
            return h5Var.a(str, str2);
        }
        synchronized (this.f8601c) {
            string = JsonUtils.getString(this.f8600b, str, str2);
        }
        return string;
    }

    public List b(String str) {
        if (str == null) {
            throw new IllegalArgumentException("No key specified");
        }
        h5 h5Var = this.f8605g;
        List listB = h5Var != null ? h5Var.b(str, Collections.emptyList()) : JsonUtils.optList(b(str, new JSONArray()), Collections.emptyList());
        h5 h5Var2 = this.f8606h;
        List listB2 = h5Var2 != null ? h5Var2.b(str, Collections.emptyList()) : JsonUtils.optList(a(str, new JSONArray()), Collections.emptyList());
        ArrayList arrayList = new ArrayList(listB.size() + listB2.size());
        arrayList.addAll(listB);
        arrayList.addAll(listB2);
        return arrayList;
    }

    public JSONArray b(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        h5 h5Var = this.f8605g;
        if (h5Var != null) {
            return h5Var.a(str, jSONArray);
        }
        synchronized (this.f8601c) {
            jSONArray2 = JsonUtils.getJSONArray(this.f8600b, str, jSONArray);
        }
        return jSONArray2;
    }

    public String c() {
        return a("name", (String) null);
    }

    public void c(String str, int i10) {
        h5 h5Var = this.f8606h;
        if (h5Var != null) {
            h5Var.b(str, i10);
            return;
        }
        synchronized (this.f8603e) {
            JsonUtils.putInt(this.f8602d, str, i10);
        }
    }

    public void c(String str, long j10) {
        h5 h5Var = this.f8606h;
        if (h5Var != null) {
            h5Var.b(str, j10);
            return;
        }
        synchronized (this.f8603e) {
            JsonUtils.putLong(this.f8602d, str, j10);
        }
    }

    public void c(String str, String str2) {
        h5 h5Var = this.f8606h;
        if (h5Var != null) {
            h5Var.b(str, str2);
            return;
        }
        synchronized (this.f8603e) {
            JsonUtils.putString(this.f8602d, str, str2);
        }
    }

    public boolean c(String str) {
        boolean zHas;
        h5 h5Var = this.f8606h;
        if (h5Var != null) {
            return h5Var.a(str);
        }
        synchronized (this.f8603e) {
            zHas = this.f8602d.has(str);
        }
        return zHas;
    }

    public String d() {
        return c("consent_string") ? a("consent_string", (String) null) : d("consent_string") ? b("consent_string", (String) null) : this.f8599a.r0().j();
    }

    public boolean d(String str) {
        boolean zHas;
        h5 h5Var = this.f8605g;
        if (h5Var != null) {
            return h5Var.a(str);
        }
        synchronized (this.f8601c) {
            zHas = this.f8600b.has(str);
        }
        return zHas;
    }

    public Object e(String str) {
        Object objOpt;
        h5 h5Var = this.f8606h;
        if (h5Var != null) {
            return h5Var.b(str);
        }
        synchronized (this.f8603e) {
            objOpt = this.f8602d.opt(str);
        }
        return objOpt;
    }

    public String e() {
        return this.f8608j;
    }

    public Bundle f() {
        return BundleUtils.getBundle("custom_parameters", new Bundle(), l());
    }

    public void f(String str) {
        this.f8608j = str;
    }

    public JSONObject g() {
        JSONObject jSONObject;
        h5 h5Var = this.f8605g;
        if (h5Var != null) {
            return h5Var.a();
        }
        synchronized (this.f8601c) {
            jSONObject = this.f8600b;
        }
        return jSONObject;
    }

    public void g(String str) {
        this.f8607i = str;
    }

    public String getAdUnitId() {
        return b("ad_unit_id", "");
    }

    public String getPlacement() {
        return this.f8607i;
    }

    public long h() {
        return a("init_completion_delay_ms", -1L);
    }

    public Map i() {
        return this.f8604f;
    }

    public String k() {
        return c().split("_")[0];
    }

    public Bundle l() {
        Bundle bundle;
        if (e("server_parameters") instanceof JSONObject) {
            h5 h5Var = this.f8606h;
            bundle = h5Var != null ? (Bundle) h5Var.a(new Function() { // from class: com.applovin.impl.gb
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return k3.a((h5) obj);
                }
            }) : JsonUtils.toBundle(a("server_parameters", (JSONObject) null));
        } else {
            bundle = new Bundle();
        }
        int iJ = j();
        if (iJ != -1) {
            if (iJ == 2) {
                bundle.putBoolean("is_muted", this.f8599a.n0().isMuted());
            } else {
                bundle.putBoolean("is_muted", iJ == 0);
            }
        }
        if (!bundle.containsKey("amount")) {
            bundle.putLong("amount", b("amount", 0L));
        }
        if (!bundle.containsKey("currency")) {
            bundle.putString("currency", b("currency", ""));
        }
        return bundle;
    }

    public long m() {
        return a("adapter_timeout_ms", ((Long) this.f8599a.a(r3.f9764x7)).longValue());
    }

    public Boolean n() {
        String str = this.f8599a.n0().getExtraParameters().get("huc");
        return StringUtils.isValidString(str) ? Boolean.valueOf(str) : c("huc") ? a("huc", Boolean.FALSE) : b("huc", (Boolean) null);
    }

    public Boolean o() {
        String str = this.f8599a.n0().getExtraParameters().get("dns");
        return StringUtils.isValidString(str) ? Boolean.valueOf(str) : c("dns") ? a("dns", Boolean.FALSE) : b("dns", (Boolean) null);
    }

    public boolean p() {
        return a("is_testing", Boolean.FALSE).booleanValue();
    }

    public boolean q() {
        return a("reinitialize_if_init_fails", Boolean.FALSE).booleanValue();
    }

    public boolean r() {
        return a("run_on_ui_thread", Boolean.TRUE).booleanValue();
    }

    public boolean s() {
        return a("eagerly_initialize", Boolean.TRUE).booleanValue();
    }

    public String toString() {
        return "MediationAdapterSpec{adapterClass='" + b() + "', adapterName='" + c() + "', isTesting=" + p() + '}';
    }
}
