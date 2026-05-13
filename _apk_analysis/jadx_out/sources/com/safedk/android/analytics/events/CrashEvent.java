package com.safedk.android.analytics.events;

import android.os.Build;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.StatsCollector;
import com.safedk.android.analytics.events.base.StatsEvent;
import com.safedk.android.analytics.events.base.StatsEventWithBundle;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.k;
import java.io.IOException;
import java.io.Serializable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class CrashEvent extends StatsEventWithBundle implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static final String f52784a = "is_caught";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final String f52785b = "is_emulator";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected static final String f52786c = "is_debug";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected static final String f52787d = "generic";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f52788e = "report";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f52789f = "events";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f52790g = "sdk_versions_map";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f52791h = "sdk_key";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f52792j = "CrashEvent";
    private static final long serialVersionUID = 0;

    public CrashEvent(String str, StatsCollector.EventType eventType, JSONObject jSONObject) {
        super(str, eventType, jSONObject);
    }

    public CrashEvent(JSONObject jSONObject) {
        super(null, StatsCollector.EventType.crash, jSONObject);
    }

    @Override // com.safedk.android.analytics.events.base.StatsEvent
    public void a(StatsEvent statsEvent) {
    }

    protected boolean a() {
        return false;
    }

    @Override // com.safedk.android.analytics.events.base.StatsEvent
    public StatsCollector.EventType b() {
        return StatsCollector.EventType.crash;
    }

    @Override // com.safedk.android.analytics.events.base.StatsEvent
    public String c() {
        return "";
    }

    @Override // com.safedk.android.analytics.events.base.StatsEventWithBundle
    public JSONObject d() throws JSONException, IOException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject.put(f52788e, jSONObject2);
        JSONArray jSONArray = new JSONArray();
        jSONObject2.put("events", jSONArray);
        JSONObject jSONObjectD = super.d();
        jSONObjectD.put(StatsEvent.f52830z, b().toString());
        jSONObjectD.put("timestamp", this.G);
        jSONObjectD.put(f52784a, a());
        jSONObjectD.put(f52785b, Build.FINGERPRINT.contains(f52787d));
        jSONObjectD.put(f52786c, SafeDK.getInstance().n());
        String string = JsonUtils.EMPTY_JSON;
        JSONObject jSONObjectO = SafeDK.getInstance().O();
        if (jSONObjectO != null) {
            string = jSONObjectO.toString();
            Logger.d(f52792j, "sdkVersionsJSON=" + jSONObjectO.toString());
        } else {
            Logger.d(f52792j, "sdkVersionsJSON is null");
        }
        jSONObjectD.put(f52790g, string);
        jSONArray.put(jSONObjectD);
        jSONObject2.put("metadata", k.a(SafeDK.getInstance().w().c()));
        jSONObject.put("sdk_key", SafeDK.getInstance().w().a());
        return jSONObject;
    }
}
