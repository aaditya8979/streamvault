package com.ironsource;

import android.app.Activity;
import android.content.Context;
import androidx.appcompat.widget.ActivityChooserModel;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import com.unity3d.mediation.LevelPlayAdSize;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class Kf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Kf f29735a = new Kf();

    private Kf() {
    }

    private final JSONObject a(String str, String str2) {
        return new JSONObject(kotlin.collections.a.m(bn.h.a(Df.f29182b, str), bn.h.a("sdkVersion", str2)));
    }

    public final int a() {
        return Lb.f29764s.d().i().c();
    }

    @NotNull
    public final ISBannerSize a(@Nullable String str, int i10, int i11) {
        return new ISBannerSize(str, i10, i11);
    }

    @NotNull
    public final com.ironsource.mediationsdk.q a(@NotNull Activity activity, @NotNull ISBannerSize iSBannerSize) {
        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        tn.p.k(iSBannerSize, "size");
        com.ironsource.mediationsdk.q qVarB = com.ironsource.mediationsdk.r.m().b(activity, iSBannerSize);
        tn.p.j(qVarB, "getInstance().createBanner(activity, size)");
        return qVarB;
    }

    @Nullable
    public final String a(@NotNull Context context) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        return C1.a(context, c(context));
    }

    @NotNull
    public final String a(@Nullable C4041gd c4041gd) {
        String strC;
        return (c4041gd == null || (strC = c4041gd.c()) == null) ? new String() : strC;
    }

    @NotNull
    public final String a(@NotNull NetworkSettings networkSettings) {
        tn.p.k(networkSettings, "networkSettings");
        String providerDefaultInstance = networkSettings.getProviderDefaultInstance();
        return providerDefaultInstance == null ? new String() : providerDefaultInstance;
    }

    @NotNull
    public final String a(@NotNull String str) {
        String str2;
        tn.p.k(str, "key");
        try {
            if (bo.d0.c0(str, "-", false, 2, null)) {
                String str3 = (String) cn.f0.F0(bo.d0.U0(str, new String[]{"-"}, false, 0, 6, null));
                if (!bo.d0.c0(str3, "_", false, 2, null)) {
                    return str3;
                }
                str2 = (String) cn.f0.t0(bo.d0.U0(str3, new String[]{"_"}, false, 0, 6, null));
            } else {
                if (!bo.d0.c0(str, "_", false, 2, null)) {
                    return str;
                }
                str2 = (String) cn.f0.t0(bo.d0.U0(str, new String[]{"_"}, false, 0, 6, null));
            }
            return str2;
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.getMessage());
            return str;
        }
    }

    @NotNull
    public final JSONObject a(boolean z10) {
        JSONObject jSONObjectB = IronSourceUtils.b(z10);
        tn.p.j(jSONObjectB, "getMediationAdditionalData(isDemandOnlyMode)");
        return jSONObjectB;
    }

    public final void a(@NotNull D5 d52, @NotNull JSONObject jSONObject) {
        tn.p.k(d52, "event");
        tn.p.k(jSONObject, "data");
        C3952be.i().a(new C5(d52, jSONObject));
    }

    public final void a(@Nullable Ga ga2) {
        C4277u2.a().b(ga2);
    }

    public final void a(@Nullable InterfaceC4057hb interfaceC4057hb) {
        C4054h8.a().b(interfaceC4057hb);
    }

    public final void a(@Nullable InterfaceC4252sb interfaceC4252sb) {
        Dd.a().b(interfaceC4252sb);
    }

    public final boolean a(@NotNull NetworkSettings networkSettings, @NotNull IronSource.a aVar) {
        tn.p.k(networkSettings, "networkSettings");
        tn.p.k(aVar, "adUnit");
        return networkSettings.isBidder(aVar);
    }

    @NotNull
    public final LevelPlayAdSize b(@Nullable String str, int i10, int i11) {
        return (str == null || str.length() == 0 || tn.p.f(str, "CUSTOM")) ? LevelPlayAdSize.Companion.createCustomSize(i10, i11) : tn.p.f(str, com.ironsource.mediationsdk.l.f32637c) ? LevelPlayAdSize.MEDIUM_RECTANGLE : LevelPlayAdSize.Companion.createAdSize$mediationsdk_release(str);
    }

    @Nullable
    public final String b(@NotNull Context context) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        return C1.b(context, c(context));
    }

    @NotNull
    public final JSONObject b() throws JSONException {
        JSONObject jSONObjectB = N6.a().b();
        tn.p.j(jSONObjectB, "getProperties().toJSON()");
        return jSONObjectB;
    }

    public final void b(@NotNull String str) {
        tn.p.k(str, "message");
        IronLog.INTERNAL.error(str);
    }

    @Nullable
    public final String c(@NotNull Context context) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        return C1.g(context);
    }

    @NotNull
    public final JSONObject c() {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        try {
            ConcurrentHashMap<String, AdapterBaseWrapper> concurrentHashMapE = com.ironsource.mediationsdk.c.b().e();
            tn.p.j(concurrentHashMapE, "networkAdaptersMap");
            for (Map.Entry<String, AdapterBaseWrapper> entry : concurrentHashMapE.entrySet()) {
                if (entry.getValue().getAdapterBaseInterface() != null) {
                    Kf kf2 = f29735a;
                    String key = entry.getKey();
                    tn.p.j(key, "entry.key");
                    String strA = kf2.a(key);
                    AdapterBaseInterface adapterBaseInterface = entry.getValue().getAdapterBaseInterface();
                    tn.p.j(adapterBaseInterface, "entry.value.adapterBaseInterface");
                    String adapterVersion = adapterBaseInterface.getAdapterVersion();
                    tn.p.j(adapterVersion, "adapterBaseInterface.adapterVersion");
                    jSONObjectJsonObjectInit.putOpt(strA, kf2.a(adapterVersion, adapterBaseInterface.getNetworkSDKVersion()));
                }
            }
        } catch (Exception e10) {
            C4228r4.d().a(e10);
        }
        return jSONObjectJsonObjectInit;
    }

    @NotNull
    public final ConcurrentHashMap<String, List<String>> d() {
        ConcurrentHashMap<String, List<String>> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.putAll(com.ironsource.mediationsdk.c.b().d());
        concurrentHashMap.putAll(C4201pa.b().c());
        return concurrentHashMap;
    }

    public final void e() {
        com.ironsource.mediationsdk.r.m().R();
    }
}
