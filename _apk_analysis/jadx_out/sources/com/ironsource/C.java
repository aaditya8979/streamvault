package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class C implements D0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final W0 f28864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final B f28865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final BaseAdAdapter<?, ?> f28866c;

    public C(@NotNull W0 w02, @NotNull B b10, @Nullable BaseAdAdapter<?, ?> baseAdAdapter) {
        tn.p.k(w02, "adTools");
        tn.p.k(b10, "instanceData");
        this.f28864a = w02;
        this.f28865b = b10;
        this.f28866c = baseAdAdapter;
    }

    @Override // com.ironsource.D0
    @NotNull
    public Map<String, Object> a(@NotNull B0 b02) {
        String adapterVersion;
        tn.p.k(b02, "event");
        HashMap map = new HashMap();
        try {
            BaseAdAdapter<?, ?> baseAdAdapter = this.f28866c;
            String networkSDKVersion = "";
            if (baseAdAdapter != null) {
                AdapterBaseInterface networkAdapter = baseAdAdapter.getNetworkAdapter();
                tn.p.h(networkAdapter);
                adapterVersion = networkAdapter.getAdapterVersion();
            } else {
                adapterVersion = "";
            }
            tn.p.j(adapterVersion, "if (adapter != null) ada…!!.adapterVersion else \"\"");
            map.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, adapterVersion);
            BaseAdAdapter<?, ?> baseAdAdapter2 = this.f28866c;
            if (baseAdAdapter2 != null) {
                AdapterBaseInterface networkAdapter2 = baseAdAdapter2.getNetworkAdapter();
                tn.p.h(networkAdapter2);
                networkSDKVersion = networkAdapter2.getNetworkSDKVersion();
            }
            tn.p.h(networkSDKVersion);
            map.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, networkSDKVersion);
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(C4173o0.a(this.f28864a, "could not get adapter version for event data " + this.f28865b.w(), (String) null, 2, (Object) null));
        }
        String strI = this.f28865b.j().i();
        tn.p.j(strI, "instanceData.adapterConfig.subProviderId");
        map.put("spId", strI);
        String strA = this.f28865b.j().a();
        tn.p.j(strA, "instanceData.adapterConfig.adSourceNameForEvents");
        map.put(IronSourceConstants.EVENTS_PROVIDER, strA);
        map.put("instanceType", Integer.valueOf(this.f28865b.s()));
        String strK = this.f28865b.n().k();
        W0 w02 = this.f28864a;
        tn.p.j(strK, C4157n2.f33010s);
        String strE = w02.e(strK);
        if (!TextUtils.isEmpty(strE)) {
            map.put("dynamicDemandSource", strE);
        }
        map.put("sessionDepth", Integer.valueOf(this.f28865b.v()));
        if (!TextUtils.isEmpty(this.f28865b.u().getCustomNetwork())) {
            String customNetwork = this.f28865b.u().getCustomNetwork();
            tn.p.j(customNetwork, "instanceData.providerSettings.customNetwork");
            map.put(IronSourceConstants.EVENTS_CUSTOM_NETWORK_FIELD, customNetwork);
        }
        return map;
    }
}
