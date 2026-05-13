package io.appmetrica.analytics.adrevenue.applovin.v12.impl;

import bn.h;
import cn.r;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinSdk;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenue;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Currency;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements ModuleAdRevenueProcessor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f64422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ClientContext f64423b;

    public b(@NotNull a aVar, @NotNull ClientContext clientContext) {
        this.f64422a = aVar;
        this.f64423b = clientContext;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    @NotNull
    public final String getDescription() {
        return "AppLovin";
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    public final boolean process(@NotNull Object... objArr) {
        String label;
        if (!ReflectionUtils.isArgumentsOfClasses(objArr, MaxAd.class, AppLovinSdk.class)) {
            return false;
        }
        Object objD0 = r.d0(objArr, 0);
        if (objD0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.applovin.mediation.MaxAd");
        }
        MaxAd maxAd = (MaxAd) objD0;
        Object objD02 = r.d0(objArr, 1);
        if (objD02 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.applovin.sdk.AppLovinSdk");
        }
        AppLovinSdk appLovinSdk = (AppLovinSdk) objD02;
        this.f64422a.getClass();
        MaxAdFormat format = maxAd.getFormat();
        ModuleAdType moduleAdType = format == null ? null : p.f(format, MaxAdFormat.NATIVE) ? ModuleAdType.NATIVE : p.f(format, MaxAdFormat.BANNER) ? ModuleAdType.BANNER : p.f(format, MaxAdFormat.REWARDED) ? ModuleAdType.REWARDED : p.f(format, MaxAdFormat.INTERSTITIAL) ? ModuleAdType.INTERSTITIAL : p.f(format, MaxAdFormat.MREC) ? ModuleAdType.MREC : ModuleAdType.OTHER;
        Pair[] pairArr = new Pair[4];
        pairArr[0] = h.a("countryCode", appLovinSdk.getConfiguration().getCountryCode());
        pairArr[1] = h.a(AdRevenueConstants.ORIGINAL_SOURCE_KEY, "ad-revenue-applovin-v12");
        MaxAdFormat format2 = maxAd.getFormat();
        if (format2 == null || (label = format2.getLabel()) == null) {
            label = "null";
        }
        pairArr[2] = h.a(AdRevenueConstants.ORIGINAL_AD_TYPE_KEY, label);
        pairArr[3] = h.a("source", "applovin");
        this.f64423b.getInternalClientModuleFacade().reportAdRevenue(new ModuleAdRevenue(BigDecimal.valueOf(WrapUtils.getFiniteDoubleOrDefault(maxAd.getRevenue(), 0.0d)), Currency.getInstance("USD"), moduleAdType, maxAd.getNetworkName(), maxAd.getAdUnitId(), null, maxAd.getNetworkPlacement(), maxAd.getPlacement(), maxAd.getRevenuePrecision(), kotlin.collections.a.m(pairArr), false, 32, null));
        LoggerStorage.getMainPublicOrAnonymousLogger().info("Ad Revenue from AppLovin with values " + Arrays.toString(objArr) + " was reported", new Object[0]);
        return true;
    }
}
