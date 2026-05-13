package com.ironsource;

import android.content.Context;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class Zf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String[] f30842a = Yf.f30740a.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final S6 f30843b = new S6();

    private final JSONObject a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectB = T6.b(jSONObject.optJSONObject(Q6.f30268u));
        if (jSONObjectB != null) {
            jSONObject.put(Q6.f30268u, jSONObjectB);
        }
        return jSONObject;
    }

    @NotNull
    public final JSONObject a() throws JSONException {
        JSONObject jSONObjectA = this.f30843b.a(this.f30842a);
        tn.p.j(jSONObjectA, "mGlobalDataReader.getDataByKeys(mTokenKeyList)");
        return a(jSONObjectA);
    }

    @NotNull
    public final JSONObject a(@NotNull Context context) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        JSONObject jSONObjectA = this.f30843b.a(context, this.f30842a);
        tn.p.j(jSONObjectA, "mGlobalDataReader.getDat…s(context, mTokenKeyList)");
        return a(jSONObjectA);
    }
}
