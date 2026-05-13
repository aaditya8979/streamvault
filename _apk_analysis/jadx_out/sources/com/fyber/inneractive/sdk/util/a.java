package com.fyber.inneractive.sdk.util;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InneractiveAdSpot f19503a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f19505c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f19504b = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f19506d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f19507e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f19508f = 0;

    public final void a(String str) {
        com.fyber.inneractive.sdk.config.global.r rVar;
        if (this.f19504b) {
            long jCurrentTimeMillis = (System.currentTimeMillis() - this.f19506d) - this.f19508f;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long seconds = timeUnit.toSeconds(jCurrentTimeMillis);
            long millis = timeUnit.toMillis(jCurrentTimeMillis - TimeUnit.SECONDS.toMillis(seconds));
            Locale locale = Locale.US;
            String str2 = seconds + "." + millis;
            InneractiveAdSpot inneractiveAdSpot = this.f19503a;
            com.fyber.inneractive.sdk.flow.x adContent = inneractiveAdSpot != null ? inneractiveAdSpot.getAdContent() : null;
            com.fyber.inneractive.sdk.network.u uVar = this.f19505c ? com.fyber.inneractive.sdk.network.u.USER_SKIP_ACTION_LATENCY : com.fyber.inneractive.sdk.network.u.USER_CLOSE_ACTION_LATENCY;
            InneractiveAdRequest inneractiveAdRequest = adContent != null ? adContent.f16695a : null;
            com.fyber.inneractive.sdk.response.e eVarB = adContent != null ? adContent.b() : null;
            JSONArray jSONArrayB = (adContent == null || (rVar = adContent.f16697c) == null) ? null : rVar.b();
            com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVarB);
            wVar.f17078c = uVar;
            wVar.f17076a = inneractiveAdRequest;
            wVar.f17079d = jSONArrayB;
            JSONObject jSONObject = new JSONObject();
            String str3 = this.f19505c ? "skip_action_latency" : "close_action_latency";
            try {
                jSONObject.put(str3, str2);
            } catch (Exception unused) {
                IAlog.f("Got exception adding param to json object: %s, %s", str3, str2);
            }
            if (!TextUtils.isEmpty(str)) {
                try {
                    jSONObject.put("origin", str);
                } catch (Exception unused2) {
                    IAlog.f("Got exception adding param to json object: %s, %s", "origin", str);
                }
            }
            wVar.f17081f.put(jSONObject);
            wVar.a((String) null);
            this.f19506d = 0L;
            this.f19507e = 0L;
            this.f19508f = 0L;
            this.f19504b = false;
        }
    }

    public final void a(boolean z10) {
        this.f19505c = z10;
        if (this.f19504b) {
            IAlog.a("%s%s timer could not start. Timer is in action!", "AdExperienceLatency: ", z10 ? "skip" : "close");
            return;
        }
        IAlog.a("%s%s timer started", "AdExperienceLatency: ", z10 ? "skip" : "close");
        this.f19506d = System.currentTimeMillis();
        this.f19504b = true;
    }
}
