package com.ironsource;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C3978d4;
import com.ironsource.C4266t8;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceQaProperties;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.SDKUtils;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.oc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C4185oc {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B7 f33153b = Lb.U().i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public U6 f33152a = new U6();

    public void a() {
        JSONObject jSONObject = new JSONObject(IronSourceQaProperties.getInstance().getParameters());
        if (jSONObject.length() > 0) {
            this.f33152a.a("debug", jSONObject);
        }
    }

    public void a(Context context) {
        if (context instanceof Activity) {
            this.f33152a.a(Q6.f30247n, Boolean.valueOf(this.f33153b.a((Activity) context)));
        }
    }

    public void a(C4266t8.c cVar) {
        this.f33152a.a(Q6.f30282y1, Integer.valueOf(cVar.ordinal()));
    }

    public void a(List<String> list) {
        this.f33152a.a(Q6.B1, list);
    }

    public void a(Map<String, JSONObject> map) {
        for (Map.Entry<String, JSONObject> entry : map.entrySet()) {
            this.f33152a.a(entry.getKey(), (Object) entry.getValue());
        }
    }

    public void a(JSONObject jSONObject) {
        this.f33152a.a(Q6.f30241l, jSONObject);
    }

    public void a(boolean z10) {
        this.f33152a.a(Q6.S0, Boolean.valueOf(z10));
    }

    public void b() {
        String controllerConfig = SDKUtils.getControllerConfig();
        if (TextUtils.isEmpty(controllerConfig)) {
            return;
        }
        try {
            this.f33152a.a(Q6.f30232i, IronSourceVideoBridge.jsonObjectInit(controllerConfig).opt(C3978d4.a.f31221q));
        } catch (JSONException e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public void b(Context context) {
        this.f33152a.a("gpi", Boolean.valueOf(C3951bd.e(context)));
    }

    public void c() {
        this.f33152a.a("uxt", Boolean.valueOf(IronSourceStorageUtils.isUxt()));
    }

    public void d() {
        this.f33152a.a(Q6.V, "9.2.0");
    }

    public void e() {
        HashMap map = new HashMap();
        map.put(Q6.E, Gc.f29438f);
        map.put(Q6.D, Gc.f29437e);
        this.f33152a.a(map);
    }
}
