package com.unity3d.ironsourceads;

import android.content.Context;
import com.ironsource.R9;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.r;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: loaded from: classes9.dex */
public final class IronSourceAds {

    @NotNull
    public static final IronSourceAds INSTANCE = new IronSourceAds();

    public enum AdFormat {
        BANNER("Banner"),
        INTERSTITIAL("Interstitial"),
        REWARDED("RewardedVideo");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f53410a;

        AdFormat(String str) {
            this.f53410a = str;
        }

        @NotNull
        public final String getValue() {
            return this.f53410a;
        }
    }

    private IronSourceAds() {
    }

    public static final void enableDebugMode(boolean z10) {
        IronLog.API.info("enabled: " + z10);
        r.m().a(z10);
    }

    @NotNull
    public static final String getSdkVersion() {
        IronLog.API.info("");
        return "9.2.0";
    }

    public static final void init(@NotNull Context context, @NotNull InitRequest initRequest, @NotNull InitListener initListener) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        p.k(initRequest, "initRequest");
        p.k(initListener, "initializationListener");
        R9.f30343a.a(context, initRequest, initListener);
    }

    public static final void setConsent(boolean z10) {
        IronLog.API.info("consent: " + z10);
        r.m().b(z10);
    }

    public static final void setMetaData(@NotNull String str, @NotNull String str2) {
        p.k(str, "key");
        p.k(str2, "value");
        IronLog.API.info("key = " + str + ", value = " + str2);
        R9.f30343a.a(str, str2);
    }

    public static final void setMetaData(@NotNull String str, @NotNull List<String> list) {
        p.k(str, "key");
        p.k(list, "values");
        IronLog.API.info("key = " + str + ", values = " + list);
        r.m().a(str, list);
    }
}
