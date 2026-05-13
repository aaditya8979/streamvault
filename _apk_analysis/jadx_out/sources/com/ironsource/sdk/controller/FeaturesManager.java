package com.ironsource.sdk.controller;

import com.ironsource.C3963c7;
import com.ironsource.C3978d4;
import com.ironsource.C4228r4;
import com.ironsource.InterfaceC4232r8;
import com.ironsource.Lb;
import com.ironsource.P3;
import com.ironsource.Q3;
import com.ironsource.Ve;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.SDKUtils;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class FeaturesManager {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile FeaturesManager f33556d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f33557e = "debugMode";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, ?> f33558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<String> f33559b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC4232r8 f33560c = Lb.U().t();

    public class a extends ArrayList<String> {
        public a() {
            add(C3978d4.d.f31264f);
            add(C3978d4.d.f31263e);
            add(C3978d4.d.f31265g);
            add(C3978d4.d.f31266h);
            add(C3978d4.d.f31267i);
            add(C3978d4.d.f31268j);
            add(C3978d4.d.f31269k);
            add(C3978d4.d.f31270l);
            add(C3978d4.d.f31271m);
        }
    }

    private FeaturesManager() {
        if (f33556d != null) {
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
        this.f33558a = new HashMap();
    }

    public static FeaturesManager getInstance() {
        if (f33556d == null) {
            synchronized (FeaturesManager.class) {
                if (f33556d == null) {
                    f33556d = new FeaturesManager();
                }
            }
        }
        return f33556d;
    }

    public ArrayList<String> a() {
        return new ArrayList<>(this.f33559b);
    }

    public JSONObject getDataManagerConfig() {
        JSONObject networkConfiguration = SDKUtils.getNetworkConfiguration();
        return networkConfiguration.has(C3978d4.a.f31208d) ? networkConfiguration.optJSONObject(C3978d4.a.f31208d) : IronSourceVideoBridge.jsonObjectInit();
    }

    public int getDebugMode() {
        Integer num = 0;
        try {
            if (this.f33558a.containsKey("debugMode")) {
                num = (Integer) this.f33558a.get("debugMode");
            }
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public P3 getFeatureFlagCatchUrlError() {
        return new P3(SDKUtils.getNetworkConfiguration().optJSONObject(P3.a.f30120c));
    }

    public Q3 getFeatureFlagClickCheck() {
        return new Q3(SDKUtils.getNetworkConfiguration());
    }

    public C3963c7 getFeatureFlagHealthCheck() {
        JSONObject jSONObjectA = this.f33560c.a(C3978d4.a.f31222r);
        return jSONObjectA instanceof JSONObject ? new C3963c7(jSONObjectA) : new C3963c7(null);
    }

    public boolean getFeatureFlagLoadControllerAndPlayerFromBundle() {
        return SDKUtils.getNetworkFeatureConfiguration().optBoolean(C3978d4.a.f31227w, false);
    }

    public int getInitRecoverTrials() {
        JSONObject jSONObjectOptJSONObject = SDKUtils.getNetworkConfiguration().optJSONObject(C3978d4.a.f31210f);
        if (jSONObjectOptJSONObject != null) {
            return jSONObjectOptJSONObject.optInt(C3978d4.a.f31209e, 0);
        }
        return 0;
    }

    public Ve getSessionHistoryConfig() {
        JSONObject networkConfiguration = SDKUtils.getNetworkConfiguration();
        return new Ve(networkConfiguration.has(C3978d4.a.f31223s) ? networkConfiguration.optJSONObject(C3978d4.a.f31223s) : IronSourceVideoBridge.jsonObjectInit());
    }

    public boolean getStopUseOnResumeAndPause() {
        return Boolean.TRUE.equals(this.f33560c.c(C3978d4.a.f31225u));
    }

    public void updateDebugConfigurations(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        this.f33558a = map;
    }
}
