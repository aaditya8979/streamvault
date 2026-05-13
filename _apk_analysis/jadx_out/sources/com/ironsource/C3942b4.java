package com.ironsource;

import android.text.TextUtils;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterConsentInterface;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.b4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3942b4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private Boolean f31011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final B7 f31012b = Lb.f29764s.d().i();

    private final Boolean a(NetworkSettings networkSettings) {
        return (networkSettings == null || networkSettings.isCustomNetwork()) ? this.f31011a : networkSettings.getApplicationSettings().has(C3960c4.f31112a) ? Boolean.valueOf(networkSettings.getApplicationSettings().optBoolean(C3960c4.f31112a)) : this.f31011a;
    }

    private final void a(String str) {
        try {
            JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
            if (!TextUtils.isEmpty(str)) {
                jSONObjectJsonObjectInit.put("reason", str);
            }
            J9.i().a(new C5(D5.TROUBLESHOOTING_CONSENT_INTERNAL_ERROR, jSONObjectJsonObjectInit));
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    @Nullable
    public final Boolean a() {
        return this.f31011a;
    }

    public final void a(int i10) {
        JSONObject jSONObjectB = IronSourceUtils.b(false);
        try {
            jSONObjectB.put(IronSourceConstants.EVENTS_EXT1, i10 + ";" + this.f31012b.F(ContextProvider.getInstance().getApplicationContext()));
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(bn.d.b(e10));
        }
        Lb.f29764s.d().q().a(new C5(D5.CONSENT_TCF_CODE, jSONObjectB));
    }

    public final void a(int i10, @NotNull ConcurrentHashMap<String, NetworkSettings> concurrentHashMap) {
        JSONObject applicationSettings;
        tn.p.k(concurrentHashMap, "providerSettings");
        String strF = this.f31012b.F(ContextProvider.getInstance().getApplicationContext());
        IronLog ironLog = IronLog.API;
        ironLog.general("TCF Additional Consent: " + strF);
        ironLog.general("CMP ID: " + i10);
        ironLog.general("Network Consent Reporting:");
        ironLog.general("----------------------------");
        Collection<NetworkSettings> collectionValues = concurrentHashMap.values();
        tn.p.j(collectionValues, "providerSettings.values");
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            NetworkSettings networkSettings = (NetworkSettings) obj;
            if (networkSettings.getProviderDefaultInstance() != null && !tn.p.f(networkSettings.getProviderDefaultInstance(), IronSourceConstants.SUPERSONIC_CONFIG_NAME) && (applicationSettings = networkSettings.getApplicationSettings()) != null && applicationSettings.has(C3960c4.f31112a)) {
                arrayList.add(obj);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList<NetworkSettings> arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (hashSet.add(((NetworkSettings) obj2).getProviderDefaultInstance())) {
                arrayList2.add(obj2);
            }
        }
        for (NetworkSettings networkSettings2 : arrayList2) {
            IronLog ironLog2 = IronLog.API;
            String providerDefaultInstance = networkSettings2.getProviderDefaultInstance();
            JSONObject applicationSettings2 = networkSettings2.getApplicationSettings();
            ironLog2.general(providerDefaultInstance + ": " + (applicationSettings2 != null ? Boolean.valueOf(applicationSettings2.optBoolean(C3960c4.f31112a)) : null));
        }
    }

    public final void a(@NotNull AbstractAdapter abstractAdapter, @Nullable NetworkSettings networkSettings) {
        tn.p.k(abstractAdapter, Q6.G1);
        try {
            Boolean boolA = a(networkSettings);
            if (boolA != null) {
                abstractAdapter.setNewConsent(boolA.booleanValue());
            }
        } catch (Throwable th2) {
            C4228r4.d().a(th2);
            String str = "error while setting consent of " + abstractAdapter.getProviderName() + ": " + th2.getLocalizedMessage();
            a(str);
            IronLog.INTERNAL.error(str);
        }
    }

    public final void a(@NotNull AdapterBaseInterface adapterBaseInterface, @Nullable NetworkSettings networkSettings) {
        tn.p.k(adapterBaseInterface, Q6.G1);
        try {
            Boolean boolA = a(networkSettings);
            if (boolA == null || !(adapterBaseInterface instanceof AdapterConsentInterface)) {
                return;
            }
            ((AdapterConsentInterface) adapterBaseInterface).setConsent(boolA.booleanValue());
        } catch (Throwable th2) {
            C4228r4.d().a(th2);
            String providerName = networkSettings != null ? networkSettings.getProviderName() : null;
            String str = "error while setting consent of " + providerName + ": " + th2.getLocalizedMessage();
            a(str);
            IronLog.INTERNAL.error(str);
        }
    }

    public final void a(@NotNull ConcurrentHashMap<String, AbstractAdapter> concurrentHashMap, @NotNull ConcurrentHashMap<String, AdapterBaseWrapper> concurrentHashMap2) {
        bn.r rVar;
        tn.p.k(concurrentHashMap, "adapters");
        tn.p.k(concurrentHashMap2, "networkAdapters");
        for (AbstractAdapter abstractAdapter : concurrentHashMap.values()) {
            tn.p.j(abstractAdapter, Q6.G1);
            a(abstractAdapter, (NetworkSettings) null);
        }
        for (AdapterBaseWrapper adapterBaseWrapper : concurrentHashMap2.values()) {
            AdapterBaseInterface adapterBaseInterface = adapterBaseWrapper.getAdapterBaseInterface();
            if (adapterBaseInterface != null) {
                a(adapterBaseInterface, adapterBaseWrapper.getSettings());
                rVar = bn.r.f5635a;
            } else {
                rVar = null;
            }
            if (rVar == null) {
                IronLog.INTERNAL.error("adapter is null");
            }
        }
    }

    public final void a(boolean z10) {
        this.f31011a = Boolean.valueOf(z10);
    }

    @NotNull
    public final B7 b() {
        return this.f31012b;
    }
}
