package com.fyber.inneractive.sdk.metrics;

import android.app.Application;
import android.content.SharedPreferences;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.o;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.network.u;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.v;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f16786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f16787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f16788c;

    public b(c cVar, g gVar, Map map) {
        this.f16788c = cVar;
        this.f16786a = gVar;
        this.f16787b = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UnitDisplayType unitDisplayType;
        int iA;
        int iA2;
        String str;
        IAlog.a("MetricCreativeReporter: sendMetricEvent()", new Object[0]);
        c cVar = this.f16788c;
        UnitDisplayType unitDisplayType2 = cVar.f16794c;
        if (unitDisplayType2 == null || !(unitDisplayType2 == (unitDisplayType = UnitDisplayType.BANNER) || unitDisplayType2 == UnitDisplayType.MRECT || unitDisplayType2.isFullscreenUnit())) {
            UnitDisplayType unitDisplayType3 = cVar.f16794c;
            IAlog.a("Unit display type %s is not supported for metric event", unitDisplayType3 != null ? unitDisplayType3.value() : "");
            return;
        }
        IAlog.a("MetricCreativeReporter: sendMetricEvent(), collectorData: data: %s", this.f16786a.toString());
        o oVar = IAConfigManager.O.f15975u.f16144b;
        UnitDisplayType unitDisplayType4 = this.f16788c.f16794c;
        if (unitDisplayType4 == unitDisplayType || unitDisplayType4 == UnitDisplayType.MRECT) {
            String strA = oVar.a("ad_metrics_interval_banner", c.f16789g);
            String strA2 = oVar.a("ad_metrics_limit_banner", c.f16790h);
            iA = v.a(strA, 24);
            iA2 = v.a(strA2, 3);
            str = "LastSentMetricsBanner";
        } else {
            String strA3 = oVar.a("ad_metrics_interval_interstitial", c.f16791i);
            String strA4 = oVar.a("ad_metrics_limit_interstitial", c.f16792j);
            iA = v.a(strA3, 24);
            iA2 = v.a(strA4, 3);
            str = "LastSentMetricsInterstitial";
        }
        Application application = com.fyber.inneractive.sdk.util.o.f19548a;
        if (application != null) {
            SharedPreferences sharedPreferences = application.getSharedPreferences("IAConfigPrefs", 0);
            JSONArray jSONArray = new JSONArray();
            try {
                jSONArray = new JSONArray(sharedPreferences.getString(str, "[]"));
            } catch (JSONException unused) {
            }
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
            if (oVar.a(false, this.f16788c.f16785a) && !a.a(iA, iA2, jSONArray, copyOnWriteArrayList)) {
                copyOnWriteArrayList.add(Long.valueOf(System.currentTimeMillis()));
                c cVar2 = this.f16788c;
                InneractiveAdRequest inneractiveAdRequest = cVar2.f16796e;
                com.fyber.inneractive.sdk.response.e eVar = cVar2.f16795d;
                Map map = this.f16787b;
                try {
                    u uVar = u.METRIC_MEASUREMENTS_EVENT;
                    JSONArray jSONArray2 = cVar2.f16797f;
                    w wVar = new w(eVar);
                    wVar.f17078c = uVar;
                    wVar.f17076a = inneractiveAdRequest;
                    wVar.f17079d = jSONArray2;
                    JSONObject jSONObject = new JSONObject();
                    for (String str2 : map.keySet()) {
                        Object obj = map.get(str2);
                        try {
                            jSONObject.put(str2, obj);
                        } catch (Exception unused2) {
                            IAlog.f("Got exception adding param to json object: %s, %s", str2, obj);
                        }
                    }
                    wVar.f17081f.put(jSONObject);
                    wVar.a((String) null);
                } catch (Exception unused3) {
                }
            }
            sharedPreferences.edit().putString(str, new JSONArray((Collection) copyOnWriteArrayList).toString()).apply();
        }
    }
}
