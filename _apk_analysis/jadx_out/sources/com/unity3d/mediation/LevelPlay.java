package com.unity3d.mediation;

import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C4217q9;
import com.ironsource.C4303vb;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.r;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import com.unity3d.mediation.segment.LevelPlaySegment;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import tn.p;

/* JADX INFO: loaded from: classes2.dex */
public final class LevelPlay {

    @NotNull
    public static final LevelPlay INSTANCE = new LevelPlay();

    public enum AdFormat {
        BANNER("banner"),
        INTERSTITIAL("interstitial"),
        REWARDED("rewarded"),
        NATIVE_AD("nativeAd");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f53471a;

        AdFormat(String str) {
            this.f53471a = str;
        }

        @NotNull
        public final String getValue() {
            return this.f53471a;
        }
    }

    private LevelPlay() {
    }

    public static final void addImpressionDataListener(@NotNull LevelPlayImpressionDataListener levelPlayImpressionDataListener) {
        p.k(levelPlayImpressionDataListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        IronLog.API.info("adding listener: " + levelPlayImpressionDataListener.getClass().getSimpleName());
        C4303vb.f34255a.a(levelPlayImpressionDataListener);
    }

    @NotNull
    public static final String getSdkVersion() {
        IronLog.API.info("");
        return "9.2.0";
    }

    public static final void init(@NotNull Context context, @NotNull LevelPlayInitRequest levelPlayInitRequest, @NotNull LevelPlayInitListener levelPlayInitListener) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        p.k(levelPlayInitRequest, "initRequest");
        p.k(levelPlayInitListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        C4303vb.f34255a.a(context, levelPlayInitRequest, levelPlayInitListener);
    }

    public static final void launchTestSuite(@NotNull Context context) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        IronLog.API.info("");
        r.m().c(context);
    }

    public static final void removeImpressionDataListener(@NotNull LevelPlayImpressionDataListener levelPlayImpressionDataListener) {
        p.k(levelPlayImpressionDataListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        IronLog.API.info("removing listener: " + levelPlayImpressionDataListener.getClass().getSimpleName());
        C4303vb.f34255a.b(levelPlayImpressionDataListener);
    }

    public static final void setAdaptersDebug(boolean z10) {
        IronLog.API.info("enabled: " + z10);
        r.m().a(z10);
    }

    public static final void setConsent(boolean z10) {
        IronLog.API.info("consent: " + z10);
        r.m().b(z10);
    }

    public static final boolean setDynamicUserId(@NotNull String str) {
        p.k(str, IronSourceConstants.EVENTS_DYNAMIC_USER_ID);
        IronLog.API.info("dynamicUserId: " + str);
        return r.m().b(str);
    }

    public static final void setMetaData(@NotNull String str, @NotNull String str2) {
        p.k(str, "key");
        p.k(str2, "value");
        IronLog.API.info("key = " + str + ", value = " + str2);
        C4303vb.f34255a.a(str, str2);
    }

    public static final void setMetaData(@NotNull String str, @NotNull List<String> list) {
        p.k(str, "key");
        p.k(list, "values");
        IronLog.API.info("key = " + str + ", values = " + list);
        C4303vb.f34255a.a(str, list);
    }

    public static final void setNetworkData(@NotNull String str, @NotNull JSONObject jSONObject) {
        p.k(str, "networkKey");
        p.k(jSONObject, "networkData");
        IronLog.API.info("networkKey = " + str + ", networkData = " + jSONObject);
        r.m().b(str, jSONObject);
    }

    public static final void setSegment(@NotNull LevelPlaySegment levelPlaySegment) {
        p.k(levelPlaySegment, "segment");
        IronLog.API.info("");
        C4303vb.f34255a.b(levelPlaySegment);
    }

    public static final void validateIntegration(@NotNull Context context) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        IronLog.API.info("");
        C4217q9.f33347a.a(context);
    }
}
